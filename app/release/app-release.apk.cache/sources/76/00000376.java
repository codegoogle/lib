package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.android.volley.AsyncCache;
import com.android.volley.AsyncNetwork;
import com.android.volley.Cache;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class AsyncRequestQueue extends RequestQueue {
    private static final int DEFAULT_BLOCKING_THREAD_POOL_SIZE = 4;
    @z1
    private final AsyncCache mAsyncCache;
    private ExecutorService mBlockingExecutor;
    private final Object mCacheInitializationLock;
    private ExecutorFactory mExecutorFactory;
    private volatile boolean mIsCacheInitialized;
    private final AsyncNetwork mNetwork;
    private ExecutorService mNonBlockingExecutor;
    private ScheduledExecutorService mNonBlockingScheduledExecutor;
    private final List<Request<?>> mRequestsAwaitingCacheInitialization;
    private final WaitingRequestManager mWaitingRequestManager;

    /* loaded from: classes2.dex */
    public static class Builder {
        private final AsyncNetwork mNetwork;
        @z1
        private AsyncCache mAsyncCache = null;
        @z1
        private Cache mCache = null;
        @z1
        private ExecutorFactory mExecutorFactory = null;
        @z1
        private ResponseDelivery mResponseDelivery = null;

        public Builder(AsyncNetwork asyncNetwork) {
            if (asyncNetwork != null) {
                this.mNetwork = asyncNetwork;
                return;
            }
            throw new IllegalArgumentException("Network cannot be null");
        }

        private ExecutorFactory getDefaultExecutorFactory() {
            return new ExecutorFactory() { // from class: com.android.volley.AsyncRequestQueue.Builder.1
                private ThreadPoolExecutor getNewThreadPoolExecutor(int i, String str, BlockingQueue<Runnable> blockingQueue) {
                    return new ThreadPoolExecutor(0, i, 60L, TimeUnit.SECONDS, blockingQueue, getThreadFactory(str));
                }

                private ThreadFactory getThreadFactory(final String str) {
                    return new ThreadFactory() { // from class: com.android.volley.AsyncRequestQueue.Builder.1.1
                        @Override // java.util.concurrent.ThreadFactory
                        public Thread newThread(@x1 Runnable runnable) {
                            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                            StringBuilder G = wo1.G("Volley-");
                            G.append(str);
                            newThread.setName(G.toString());
                            return newThread;
                        }
                    };
                }

                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ExecutorService createBlockingExecutor(BlockingQueue<Runnable> blockingQueue) {
                    return getNewThreadPoolExecutor(4, "BlockingExecutor", blockingQueue);
                }

                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ExecutorService createNonBlockingExecutor(BlockingQueue<Runnable> blockingQueue) {
                    return getNewThreadPoolExecutor(1, "Non-BlockingExecutor", blockingQueue);
                }

                @Override // com.android.volley.AsyncRequestQueue.ExecutorFactory
                public ScheduledExecutorService createNonBlockingScheduledExecutor() {
                    return new ScheduledThreadPoolExecutor(0, getThreadFactory("ScheduledExecutor"));
                }
            };
        }

        public AsyncRequestQueue build() {
            Cache cache = this.mCache;
            if (cache == null && this.mAsyncCache == null) {
                throw new IllegalArgumentException("You must set one of the cache objects");
            }
            if (cache == null) {
                this.mCache = new ThrowingCache();
            }
            if (this.mResponseDelivery == null) {
                this.mResponseDelivery = new ExecutorDelivery(new Handler(Looper.getMainLooper()));
            }
            if (this.mExecutorFactory == null) {
                this.mExecutorFactory = getDefaultExecutorFactory();
            }
            return new AsyncRequestQueue(this.mCache, this.mNetwork, this.mAsyncCache, this.mResponseDelivery, this.mExecutorFactory);
        }

        public Builder setAsyncCache(AsyncCache asyncCache) {
            this.mAsyncCache = asyncCache;
            return this;
        }

        public Builder setCache(Cache cache) {
            this.mCache = cache;
            return this;
        }

        public Builder setExecutorFactory(ExecutorFactory executorFactory) {
            this.mExecutorFactory = executorFactory;
            return this;
        }

        public Builder setResponseDelivery(ResponseDelivery responseDelivery) {
            this.mResponseDelivery = responseDelivery;
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public class CacheParseTask<T> extends RequestTask<T> {
        public Cache.Entry entry;
        public long startTimeMillis;

        public CacheParseTask(Request<T> request, Cache.Entry entry, long j) {
            super(request);
            this.entry = entry;
            this.startTimeMillis = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mRequest.addMarker("cache-hit");
            Request<T> request = this.mRequest;
            Cache.Entry entry = this.entry;
            Response<T> parseNetworkResponse = request.parseNetworkResponse(new NetworkResponse(200, entry.data, false, 0L, entry.allResponseHeaders));
            this.mRequest.addMarker("cache-hit-parsed");
            if (!this.entry.refreshNeeded(this.startTimeMillis)) {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, parseNetworkResponse);
                return;
            }
            this.mRequest.addMarker("cache-hit-refresh-needed");
            this.mRequest.setCacheEntry(this.entry);
            parseNetworkResponse.intermediate = true;
            if (!AsyncRequestQueue.this.mWaitingRequestManager.maybeAddToWaitingRequests(this.mRequest)) {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, parseNetworkResponse, new Runnable() { // from class: com.android.volley.AsyncRequestQueue.CacheParseTask.1
                    @Override // java.lang.Runnable
                    public void run() {
                        CacheParseTask cacheParseTask = CacheParseTask.this;
                        AsyncRequestQueue.this.sendRequestOverNetwork(cacheParseTask.mRequest);
                    }
                });
            } else {
                AsyncRequestQueue.this.getResponseDelivery().postResponse(this.mRequest, parseNetworkResponse);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class CachePutTask<T> extends RequestTask<T> {
        public Response<?> response;

        public CachePutTask(Request<T> request, Response<?> response) {
            super(request);
            this.response = response;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AsyncRequestQueue.this.mAsyncCache != null) {
                AsyncRequestQueue.this.mAsyncCache.put(this.mRequest.getCacheKey(), this.response.cacheEntry, new AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CachePutTask.1
                    @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                    public void onWriteComplete() {
                        CachePutTask cachePutTask = CachePutTask.this;
                        AsyncRequestQueue.this.finishRequest(cachePutTask.mRequest, cachePutTask.response, true);
                    }
                });
                return;
            }
            AsyncRequestQueue.this.getCache().put(this.mRequest.getCacheKey(), this.response.cacheEntry);
            AsyncRequestQueue.this.finishRequest(this.mRequest, this.response, true);
        }
    }

    /* loaded from: classes2.dex */
    public class CacheTask<T> extends RequestTask<T> {
        public CacheTask(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("cache-discard-canceled");
                return;
            }
            this.mRequest.addMarker("cache-queue-take");
            if (AsyncRequestQueue.this.mAsyncCache != null) {
                AsyncRequestQueue.this.mAsyncCache.get(this.mRequest.getCacheKey(), new AsyncCache.OnGetCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.CacheTask.1
                    @Override // com.android.volley.AsyncCache.OnGetCompleteCallback
                    public void onGetComplete(Cache.Entry entry) {
                        CacheTask cacheTask = CacheTask.this;
                        AsyncRequestQueue.this.handleEntry(entry, cacheTask.mRequest);
                    }
                });
                return;
            }
            AsyncRequestQueue.this.handleEntry(AsyncRequestQueue.this.getCache().get(this.mRequest.getCacheKey()), this.mRequest);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class ExecutorFactory {
        public abstract ExecutorService createBlockingExecutor(BlockingQueue<Runnable> blockingQueue);

        public abstract ExecutorService createNonBlockingExecutor(BlockingQueue<Runnable> blockingQueue);

        public abstract ScheduledExecutorService createNonBlockingScheduledExecutor();
    }

    /* loaded from: classes2.dex */
    public class NetworkParseTask<T> extends RequestTask<T> {
        public NetworkResponse networkResponse;

        public NetworkParseTask(Request<T> request, NetworkResponse networkResponse) {
            super(request);
            this.networkResponse = networkResponse;
        }

        @Override // java.lang.Runnable
        public void run() {
            Response<T> parseNetworkResponse = this.mRequest.parseNetworkResponse(this.networkResponse);
            this.mRequest.addMarker("network-parse-complete");
            if (!this.mRequest.shouldCache() || parseNetworkResponse.cacheEntry == null) {
                AsyncRequestQueue.this.finishRequest(this.mRequest, parseNetworkResponse, false);
            } else if (AsyncRequestQueue.this.mAsyncCache != null) {
                AsyncRequestQueue.this.mNonBlockingExecutor.execute(new CachePutTask(this.mRequest, parseNetworkResponse));
            } else {
                AsyncRequestQueue.this.mBlockingExecutor.execute(new CachePutTask(this.mRequest, parseNetworkResponse));
            }
        }
    }

    /* loaded from: classes2.dex */
    public class NetworkTask<T> extends RequestTask<T> {
        public NetworkTask(Request<T> request) {
            super(request);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.mRequest.isCanceled()) {
                this.mRequest.finish("network-discard-cancelled");
                this.mRequest.notifyListenerResponseNotUsable();
                return;
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            this.mRequest.addMarker("network-queue-take");
            AsyncRequestQueue.this.mNetwork.performRequest(this.mRequest, new AsyncNetwork.OnRequestComplete() { // from class: com.android.volley.AsyncRequestQueue.NetworkTask.1
                @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                public void onError(VolleyError volleyError) {
                    volleyError.setNetworkTimeMs(SystemClock.elapsedRealtime() - elapsedRealtime);
                    ExecutorService executorService = AsyncRequestQueue.this.mBlockingExecutor;
                    NetworkTask networkTask = NetworkTask.this;
                    executorService.execute(new ParseErrorTask(networkTask.mRequest, volleyError));
                }

                @Override // com.android.volley.AsyncNetwork.OnRequestComplete
                public void onSuccess(NetworkResponse networkResponse) {
                    NetworkTask.this.mRequest.addMarker("network-http-complete");
                    if (!networkResponse.notModified || !NetworkTask.this.mRequest.hasHadResponseDelivered()) {
                        ExecutorService executorService = AsyncRequestQueue.this.mBlockingExecutor;
                        NetworkTask networkTask = NetworkTask.this;
                        executorService.execute(new NetworkParseTask(networkTask.mRequest, networkResponse));
                        return;
                    }
                    NetworkTask.this.mRequest.finish("not-modified");
                    NetworkTask.this.mRequest.notifyListenerResponseNotUsable();
                }
            });
        }
    }

    /* loaded from: classes2.dex */
    public class ParseErrorTask<T> extends RequestTask<T> {
        public VolleyError volleyError;

        public ParseErrorTask(Request<T> request, VolleyError volleyError) {
            super(request);
            this.volleyError = volleyError;
        }

        @Override // java.lang.Runnable
        public void run() {
            AsyncRequestQueue.this.getResponseDelivery().postError(this.mRequest, this.mRequest.parseNetworkError(this.volleyError));
            this.mRequest.notifyListenerResponseNotUsable();
        }
    }

    /* loaded from: classes2.dex */
    public static class ThrowingCache implements Cache {
        private ThrowingCache() {
        }

        @Override // com.android.volley.Cache
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public Cache.Entry get(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void initialize() {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void invalidate(String str, boolean z) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void put(String str, Cache.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // com.android.volley.Cache
        public void remove(String str) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishRequest(Request<?> request, Response<?> response, boolean z) {
        if (z) {
            request.addMarker("network-cache-written");
        }
        request.markDelivered();
        getResponseDelivery().postResponse(request, response);
        request.notifyListenerResponseReceived(response);
    }

    private static PriorityBlockingQueue<Runnable> getBlockingQueue() {
        return new PriorityBlockingQueue<>(11, new Comparator<Runnable>() { // from class: com.android.volley.AsyncRequestQueue.3
            @Override // java.util.Comparator
            public int compare(Runnable runnable, Runnable runnable2) {
                if (!(runnable instanceof RequestTask)) {
                    return runnable2 instanceof RequestTask ? -1 : 0;
                } else if (runnable2 instanceof RequestTask) {
                    return ((RequestTask) runnable).compareTo((RequestTask) runnable2);
                } else {
                    return 1;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleEntry(Cache.Entry entry, Request<?> request) {
        if (entry == null) {
            request.addMarker("cache-miss");
            if (this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                return;
            }
            sendRequestOverNetwork(request);
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (entry.isExpired(currentTimeMillis)) {
            request.addMarker("cache-hit-expired");
            request.setCacheEntry(entry);
            if (this.mWaitingRequestManager.maybeAddToWaitingRequests(request)) {
                return;
            }
            sendRequestOverNetwork(request);
            return;
        }
        this.mBlockingExecutor.execute(new CacheParseTask(request, entry, currentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCacheInitializationComplete() {
        ArrayList arrayList;
        synchronized (this.mCacheInitializationLock) {
            arrayList = new ArrayList(this.mRequestsAwaitingCacheInitialization);
            this.mRequestsAwaitingCacheInitialization.clear();
            this.mIsCacheInitialized = true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            beginRequest((Request) it.next());
        }
    }

    @Override // com.android.volley.RequestQueue
    public <T> void beginRequest(Request<T> request) {
        if (!this.mIsCacheInitialized) {
            synchronized (this.mCacheInitializationLock) {
                if (!this.mIsCacheInitialized) {
                    this.mRequestsAwaitingCacheInitialization.add(request);
                    return;
                }
            }
        }
        if (request.shouldCache()) {
            if (this.mAsyncCache != null) {
                this.mNonBlockingExecutor.execute(new CacheTask(request));
                return;
            } else {
                this.mBlockingExecutor.execute(new CacheTask(request));
                return;
            }
        }
        sendRequestOverNetwork(request);
    }

    @Override // com.android.volley.RequestQueue
    public <T> void sendRequestOverNetwork(Request<T> request) {
        this.mNonBlockingExecutor.execute(new NetworkTask(request));
    }

    @Override // com.android.volley.RequestQueue
    public void start() {
        stop();
        this.mNonBlockingExecutor = this.mExecutorFactory.createNonBlockingExecutor(getBlockingQueue());
        this.mBlockingExecutor = this.mExecutorFactory.createBlockingExecutor(getBlockingQueue());
        this.mNonBlockingScheduledExecutor = this.mExecutorFactory.createNonBlockingScheduledExecutor();
        this.mNetwork.setBlockingExecutor(this.mBlockingExecutor);
        this.mNetwork.setNonBlockingExecutor(this.mNonBlockingExecutor);
        this.mNetwork.setNonBlockingScheduledExecutor(this.mNonBlockingScheduledExecutor);
        if (this.mAsyncCache != null) {
            this.mNonBlockingExecutor.execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.1
                @Override // java.lang.Runnable
                public void run() {
                    AsyncRequestQueue.this.mAsyncCache.initialize(new AsyncCache.OnWriteCompleteCallback() { // from class: com.android.volley.AsyncRequestQueue.1.1
                        @Override // com.android.volley.AsyncCache.OnWriteCompleteCallback
                        public void onWriteComplete() {
                            AsyncRequestQueue.this.onCacheInitializationComplete();
                        }
                    });
                }
            });
        } else {
            this.mBlockingExecutor.execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.2
                @Override // java.lang.Runnable
                public void run() {
                    AsyncRequestQueue.this.getCache().initialize();
                    AsyncRequestQueue.this.mNonBlockingExecutor.execute(new Runnable() { // from class: com.android.volley.AsyncRequestQueue.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            AsyncRequestQueue.this.onCacheInitializationComplete();
                        }
                    });
                }
            });
        }
    }

    @Override // com.android.volley.RequestQueue
    public void stop() {
        ExecutorService executorService = this.mNonBlockingExecutor;
        if (executorService != null) {
            executorService.shutdownNow();
            this.mNonBlockingExecutor = null;
        }
        ExecutorService executorService2 = this.mBlockingExecutor;
        if (executorService2 != null) {
            executorService2.shutdownNow();
            this.mBlockingExecutor = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.mNonBlockingScheduledExecutor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.mNonBlockingScheduledExecutor = null;
        }
    }

    private AsyncRequestQueue(Cache cache, AsyncNetwork asyncNetwork, @z1 AsyncCache asyncCache, ResponseDelivery responseDelivery, ExecutorFactory executorFactory) {
        super(cache, asyncNetwork, 0, responseDelivery);
        this.mWaitingRequestManager = new WaitingRequestManager(this);
        this.mRequestsAwaitingCacheInitialization = new ArrayList();
        this.mIsCacheInitialized = false;
        this.mCacheInitializationLock = new Object[0];
        this.mAsyncCache = asyncCache;
        this.mNetwork = asyncNetwork;
        this.mExecutorFactory = executorFactory;
    }
}
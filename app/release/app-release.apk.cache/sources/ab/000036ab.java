package com.microsoft.appcenter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import com.anythink.expressad.video.module.a.a.m;
import com.microsoft.appcenter.channel.Channel;
import com.microsoft.appcenter.channel.DefaultChannel;
import com.microsoft.appcenter.channel.OneCollectorChannelListener;
import com.microsoft.appcenter.http.HttpClient;
import com.microsoft.appcenter.http.HttpUtils;
import com.microsoft.appcenter.ingestion.models.CustomPropertiesLog;
import com.microsoft.appcenter.ingestion.models.StartServiceLog;
import com.microsoft.appcenter.ingestion.models.WrapperSdk;
import com.microsoft.appcenter.ingestion.models.json.CustomPropertiesLogFactory;
import com.microsoft.appcenter.ingestion.models.json.DefaultLogSerializer;
import com.microsoft.appcenter.ingestion.models.json.LogFactory;
import com.microsoft.appcenter.ingestion.models.json.LogSerializer;
import com.microsoft.appcenter.ingestion.models.json.StartServiceLogFactory;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.microsoft.appcenter.utils.ApplicationLifecycleListener;
import com.microsoft.appcenter.utils.DeviceInfoHelper;
import com.microsoft.appcenter.utils.IdHelper;
import com.microsoft.appcenter.utils.InstrumentationRegistryHelper;
import com.microsoft.appcenter.utils.NetworkStateHelper;
import com.microsoft.appcenter.utils.PrefStorageConstants;
import com.microsoft.appcenter.utils.async.AppCenterFuture;
import com.microsoft.appcenter.utils.async.DefaultAppCenterFuture;
import com.microsoft.appcenter.utils.context.SessionContext;
import com.microsoft.appcenter.utils.context.UserIdContext;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.microsoft.appcenter.utils.storage.FileManager;
import com.microsoft.appcenter.utils.storage.SharedPreferencesManager;
import com.p7700g.p99005.p1;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.s2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes3.dex */
public class AppCenter {
    @r2
    public static final String APP_SECRET_KEY = "appsecret";
    @r2
    public static final String CORE_GROUP = "group_core";
    @r2
    public static final long DEFAULT_MAX_STORAGE_SIZE_IN_BYTES = 10485760;
    @r2
    public static final String KEY_VALUE_DELIMITER = "=";
    public static final String LOG_TAG = "AppCenter";
    @r2
    public static final long MINIMUM_STORAGE_SIZE = 24576;
    @r2
    public static final String PAIR_DELIMITER = ";";
    @r2
    public static final String RUNNING_IN_APP_CENTER = "RUNNING_IN_APP_CENTER";
    @r2
    public static final String TRANSMISSION_TARGET_TOKEN_KEY = "target";
    private static final String TRUE_ENVIRONMENT_STRING = "1";
    @SuppressLint({"StaticFieldLeak"})
    private static AppCenter sInstance;
    private Boolean mAllowedNetworkRequests;
    private AppCenterHandler mAppCenterHandler;
    private String mAppSecret;
    private Application mApplication;
    private ApplicationLifecycleListener mApplicationLifecycleListener;
    private Channel mChannel;
    private boolean mConfiguredFromApp;
    private Handler mHandler;
    private HandlerThread mHandlerThread;
    private boolean mLogLevelConfigured;
    private LogSerializer mLogSerializer;
    private String mLogUrl;
    private OneCollectorChannelListener mOneCollectorChannelListener;
    private Set<AppCenterService> mServices;
    private Set<AppCenterService> mServicesStartedFromLibrary;
    private DefaultAppCenterFuture<Boolean> mSetMaxStorageSizeFuture;
    private String mTransmissionTargetToken;
    private UncaughtExceptionHandler mUncaughtExceptionHandler;
    private final List<String> mStartedServicesNamesToLog = new ArrayList();
    private long mMaxStorageSizeInBytes = DEFAULT_MAX_STORAGE_SIZE_IN_BYTES;

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void applyStorageMaxSize() {
        boolean maxStorageSize = this.mChannel.setMaxStorageSize(this.mMaxStorageSizeInBytes);
        DefaultAppCenterFuture<Boolean> defaultAppCenterFuture = this.mSetMaxStorageSizeFuture;
        if (defaultAppCenterFuture != null) {
            defaultAppCenterFuture.complete(Boolean.valueOf(maxStorageSize));
        }
    }

    private synchronized boolean checkPrecondition() {
        if (isInstanceConfigured()) {
            return true;
        }
        AppCenterLog.error("AppCenter", "App Center hasn't been configured. You need to call AppCenter.start with appSecret or AppCenter.configure first.");
        return false;
    }

    public static void configure(Application application, String str) {
        getInstance().configureInstanceWithRequiredAppSecret(application, str);
    }

    private synchronized void configureAndStartServices(Application application, String str, Class<? extends AppCenterService>[] clsArr) {
        if (str != null) {
            if (!str.isEmpty()) {
                configureAndStartServices(application, str, true, clsArr);
            }
        }
        AppCenterLog.error("AppCenter", "appSecret may not be null or empty.");
    }

    private synchronized boolean configureInstance(Application application, String str, final boolean z) {
        if (application == null) {
            AppCenterLog.error("AppCenter", "Application context may not be null.");
            return false;
        }
        if (!this.mLogLevelConfigured && (application.getApplicationInfo().flags & 2) == 2) {
            AppCenterLog.setLogLevel(5);
        }
        String str2 = this.mAppSecret;
        if (!z || configureSecretString(str)) {
            if (this.mHandler != null) {
                String str3 = this.mAppSecret;
                if (str3 != null && !str3.equals(str2)) {
                    this.mHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.4
                        @Override // java.lang.Runnable
                        public void run() {
                            AppCenter.this.mChannel.setAppSecret(AppCenter.this.mAppSecret);
                            AppCenter.this.applyStorageMaxSize();
                        }
                    });
                }
                return true;
            }
            this.mApplication = application;
            HandlerThread handlerThread = new HandlerThread("AppCenter.Looper");
            this.mHandlerThread = handlerThread;
            handlerThread.start();
            this.mHandler = new Handler(this.mHandlerThread.getLooper());
            this.mAppCenterHandler = new AppCenterHandler() { // from class: com.microsoft.appcenter.AppCenter.5
                @Override // com.microsoft.appcenter.AppCenterHandler
                public void post(@x1 Runnable runnable, Runnable runnable2) {
                    AppCenter.this.handlerAppCenterOperation(runnable, runnable2);
                }
            };
            ApplicationLifecycleListener applicationLifecycleListener = new ApplicationLifecycleListener(this.mHandler);
            this.mApplicationLifecycleListener = applicationLifecycleListener;
            this.mApplication.registerActivityLifecycleCallbacks(applicationLifecycleListener);
            this.mServices = new HashSet();
            this.mServicesStartedFromLibrary = new HashSet();
            this.mHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.6
                @Override // java.lang.Runnable
                public void run() {
                    AppCenter.this.finishConfiguration(z);
                }
            });
            AppCenterLog.info("AppCenter", "App Center SDK configured successfully.");
            return true;
        }
        return false;
    }

    private void configureInstanceWithRequiredAppSecret(Application application, String str) {
        if (str != null && !str.isEmpty()) {
            configureInstance(application, str, true);
        } else {
            AppCenterLog.error("AppCenter", "appSecret may not be null or empty.");
        }
    }

    private boolean configureSecretString(String str) {
        if (this.mConfiguredFromApp) {
            AppCenterLog.warn("AppCenter", "App Center may only be configured once.");
            return false;
        }
        this.mConfiguredFromApp = true;
        if (str != null) {
            for (String str2 : str.split(PAIR_DELIMITER)) {
                String[] split = str2.split(KEY_VALUE_DELIMITER, -1);
                String str3 = split[0];
                if (split.length == 1) {
                    if (!str3.isEmpty()) {
                        this.mAppSecret = str3;
                    }
                } else if (!split[1].isEmpty()) {
                    String str4 = split[1];
                    if (APP_SECRET_KEY.equals(str3)) {
                        this.mAppSecret = str4;
                    } else if ("target".equals(str3)) {
                        this.mTransmissionTargetToken = str4;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void finishConfiguration(boolean z) {
        Constants.loadFromContext(this.mApplication);
        FileManager.initialize(this.mApplication);
        SharedPreferencesManager.initialize(this.mApplication);
        Boolean bool = this.mAllowedNetworkRequests;
        if (bool != null) {
            SharedPreferencesManager.putBoolean(PrefStorageConstants.ALLOWED_NETWORK_REQUEST, bool.booleanValue());
        }
        SessionContext.getInstance();
        boolean isInstanceEnabled = isInstanceEnabled();
        HttpClient httpClient = DependencyConfiguration.getHttpClient();
        if (httpClient == null) {
            httpClient = HttpUtils.createHttpClient(this.mApplication);
        }
        DefaultLogSerializer defaultLogSerializer = new DefaultLogSerializer();
        this.mLogSerializer = defaultLogSerializer;
        defaultLogSerializer.addLogFactory(StartServiceLog.TYPE, new StartServiceLogFactory());
        this.mLogSerializer.addLogFactory(CustomPropertiesLog.TYPE, new CustomPropertiesLogFactory());
        DefaultChannel defaultChannel = new DefaultChannel(this.mApplication, this.mAppSecret, this.mLogSerializer, httpClient, this.mHandler);
        this.mChannel = defaultChannel;
        if (z) {
            applyStorageMaxSize();
        } else {
            defaultChannel.setMaxStorageSize(DEFAULT_MAX_STORAGE_SIZE_IN_BYTES);
        }
        this.mChannel.setEnabled(isInstanceEnabled);
        this.mChannel.addGroup(CORE_GROUP, 50, m.af, 3, null, null);
        this.mOneCollectorChannelListener = new OneCollectorChannelListener(this.mChannel, this.mLogSerializer, httpClient, IdHelper.getInstallId());
        if (this.mLogUrl != null) {
            if (this.mAppSecret != null) {
                StringBuilder G = wo1.G("The log url of App Center endpoint has been changed to ");
                G.append(this.mLogUrl);
                AppCenterLog.info("AppCenter", G.toString());
                this.mChannel.setLogUrl(this.mLogUrl);
            } else {
                StringBuilder G2 = wo1.G("The log url of One Collector endpoint has been changed to ");
                G2.append(this.mLogUrl);
                AppCenterLog.info("AppCenter", G2.toString());
                this.mOneCollectorChannelListener.setLogUrl(this.mLogUrl);
            }
        }
        this.mChannel.addListener(this.mOneCollectorChannelListener);
        if (!isInstanceEnabled) {
            NetworkStateHelper.getSharedInstance(this.mApplication).close();
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = new UncaughtExceptionHandler(this.mHandler, this.mChannel);
        this.mUncaughtExceptionHandler = uncaughtExceptionHandler;
        if (isInstanceEnabled) {
            uncaughtExceptionHandler.register();
        }
        AppCenterLog.debug("AppCenter", "App Center initialized.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void finishStartServices(Iterable<AppCenterService> iterable, Iterable<AppCenterService> iterable2, boolean z) {
        for (AppCenterService appCenterService : iterable) {
            appCenterService.onConfigurationUpdated(this.mAppSecret, this.mTransmissionTargetToken);
            AppCenterLog.info("AppCenter", appCenterService.getClass().getSimpleName() + " service configuration updated.");
        }
        boolean isInstanceEnabled = isInstanceEnabled();
        for (AppCenterService appCenterService2 : iterable2) {
            Map<String, LogFactory> logFactories = appCenterService2.getLogFactories();
            if (logFactories != null) {
                for (Map.Entry<String, LogFactory> entry : logFactories.entrySet()) {
                    this.mLogSerializer.addLogFactory(entry.getKey(), entry.getValue());
                }
            }
            if (!isInstanceEnabled && appCenterService2.isInstanceEnabled()) {
                appCenterService2.setInstanceEnabled(false);
            }
            if (z) {
                appCenterService2.onStarted(this.mApplication, this.mChannel, this.mAppSecret, this.mTransmissionTargetToken, true);
                AppCenterLog.info("AppCenter", appCenterService2.getClass().getSimpleName() + " service started from application.");
            } else {
                appCenterService2.onStarted(this.mApplication, this.mChannel, null, null, false);
                AppCenterLog.info("AppCenter", appCenterService2.getClass().getSimpleName() + " service started from library.");
            }
        }
        if (z) {
            for (AppCenterService appCenterService3 : iterable) {
                this.mStartedServicesNamesToLog.add(appCenterService3.getServiceName());
            }
            for (AppCenterService appCenterService4 : iterable2) {
                this.mStartedServicesNamesToLog.add(appCenterService4.getServiceName());
            }
            sendStartServiceLog();
        }
    }

    public static AppCenterFuture<UUID> getInstallId() {
        return getInstance().getInstanceInstallIdAsync();
    }

    public static synchronized AppCenter getInstance() {
        AppCenter appCenter;
        synchronized (AppCenter.class) {
            if (sInstance == null) {
                sInstance = new AppCenter();
            }
            appCenter = sInstance;
        }
        return appCenter;
    }

    private synchronized AppCenterFuture<UUID> getInstanceInstallIdAsync() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        if (checkPrecondition()) {
            this.mAppCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.12
                @Override // java.lang.Runnable
                public void run() {
                    defaultAppCenterFuture.complete(IdHelper.getInstallId());
                }
            }, new Runnable() { // from class: com.microsoft.appcenter.AppCenter.13
                @Override // java.lang.Runnable
                public void run() {
                    defaultAppCenterFuture.complete(null);
                }
            });
        } else {
            defaultAppCenterFuture.complete(null);
        }
        return defaultAppCenterFuture;
    }

    @p1(from = 2, to = PlaybackStateCompat.v)
    public static int getLogLevel() {
        return AppCenterLog.getLogLevel();
    }

    public static String getSdkVersion() {
        return "4.3.1";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void handlerAppCenterOperation(final Runnable runnable, final Runnable runnable2) {
        if (checkPrecondition()) {
            Runnable runnable3 = new Runnable() { // from class: com.microsoft.appcenter.AppCenter.7
                @Override // java.lang.Runnable
                public void run() {
                    if (AppCenter.this.isInstanceEnabled()) {
                        runnable.run();
                        return;
                    }
                    Runnable runnable4 = runnable2;
                    if (runnable4 != null) {
                        runnable4.run();
                    } else {
                        AppCenterLog.error("AppCenter", "App Center SDK is disabled.");
                    }
                }
            };
            if (Thread.currentThread() == this.mHandlerThread) {
                runnable.run();
            } else {
                this.mHandler.post(runnable3);
            }
        }
    }

    public static boolean isConfigured() {
        return getInstance().isInstanceConfigured();
    }

    public static AppCenterFuture<Boolean> isEnabled() {
        return getInstance().isInstanceEnabledAsync();
    }

    private synchronized boolean isInstanceConfigured() {
        return this.mApplication != null;
    }

    private synchronized AppCenterFuture<Boolean> isInstanceEnabledAsync() {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        if (checkPrecondition()) {
            this.mAppCenterHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.9
                @Override // java.lang.Runnable
                public void run() {
                    defaultAppCenterFuture.complete(Boolean.TRUE);
                }
            }, new Runnable() { // from class: com.microsoft.appcenter.AppCenter.10
                @Override // java.lang.Runnable
                public void run() {
                    defaultAppCenterFuture.complete(Boolean.FALSE);
                }
            });
        } else {
            defaultAppCenterFuture.complete(Boolean.FALSE);
        }
        return defaultAppCenterFuture;
    }

    private synchronized boolean isInstanceNetworkRequestsAllowed() {
        Boolean bool = this.mAllowedNetworkRequests;
        boolean booleanValue = bool == null ? true : bool.booleanValue();
        if (isConfigured()) {
            return SharedPreferencesManager.getBoolean(PrefStorageConstants.ALLOWED_NETWORK_REQUEST, booleanValue);
        }
        return booleanValue;
    }

    public static boolean isNetworkRequestsAllowed() {
        return getInstance().isInstanceNetworkRequestsAllowed();
    }

    public static boolean isRunningInAppCenterTestCloud() {
        try {
            return "1".equals(InstrumentationRegistryHelper.getArguments().getString(RUNNING_IN_APP_CENTER));
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void queueCustomProperties(@x1 Map<String, Object> map) {
        CustomPropertiesLog customPropertiesLog = new CustomPropertiesLog();
        customPropertiesLog.setProperties(map);
        this.mChannel.enqueue(customPropertiesLog, CORE_GROUP, 1);
    }

    @s2
    private void sendStartServiceLog() {
        if (this.mStartedServicesNamesToLog.isEmpty() || !isInstanceEnabled()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mStartedServicesNamesToLog);
        this.mStartedServicesNamesToLog.clear();
        StartServiceLog startServiceLog = new StartServiceLog();
        startServiceLog.setServices(arrayList);
        this.mChannel.enqueue(startServiceLog, CORE_GROUP, 1);
    }

    public static void setCustomProperties(CustomProperties customProperties) {
        getInstance().setInstanceCustomProperties(customProperties);
    }

    public static AppCenterFuture<Void> setEnabled(boolean z) {
        return getInstance().setInstanceEnabledAsync(z);
    }

    private synchronized void setInstanceCustomProperties(CustomProperties customProperties) {
        if (customProperties == null) {
            AppCenterLog.error("AppCenter", "Custom properties may not be null.");
            return;
        }
        final Map<String, Object> properties = customProperties.getProperties();
        if (properties.size() == 0) {
            AppCenterLog.error("AppCenter", "Custom properties may not be empty.");
        } else {
            handlerAppCenterOperation(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.3
                @Override // java.lang.Runnable
                public void run() {
                    AppCenter.this.queueCustomProperties(properties);
                }
            }, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @s2
    public void setInstanceEnabled(boolean z) {
        this.mChannel.setEnabled(z);
        boolean isInstanceEnabled = isInstanceEnabled();
        boolean z2 = isInstanceEnabled && !z;
        boolean z3 = !isInstanceEnabled && z;
        if (z3) {
            this.mUncaughtExceptionHandler.register();
            NetworkStateHelper.getSharedInstance(this.mApplication).reopen();
        } else if (z2) {
            this.mUncaughtExceptionHandler.unregister();
            NetworkStateHelper.getSharedInstance(this.mApplication).close();
        }
        String str = PrefStorageConstants.KEY_ENABLED;
        if (z) {
            SharedPreferencesManager.putBoolean(PrefStorageConstants.KEY_ENABLED, true);
        }
        if (!this.mStartedServicesNamesToLog.isEmpty() && z3) {
            sendStartServiceLog();
        }
        for (AppCenterService appCenterService : this.mServices) {
            if (appCenterService.isInstanceEnabled() != z) {
                appCenterService.setInstanceEnabled(z);
            }
        }
        if (!z) {
            SharedPreferencesManager.putBoolean(PrefStorageConstants.KEY_ENABLED, false);
        }
        if (z2) {
            AppCenterLog.info("AppCenter", "App Center has been disabled.");
        } else if (z3) {
            AppCenterLog.info("AppCenter", "App Center has been enabled.");
        } else {
            StringBuilder G = wo1.G("App Center has already been ");
            if (!z) {
                str = "disabled";
            }
            G.append(str);
            G.append(CryptoConstants.ALIAS_SEPARATOR);
            AppCenterLog.info("AppCenter", G.toString());
        }
    }

    private synchronized AppCenterFuture<Void> setInstanceEnabledAsync(final boolean z) {
        final DefaultAppCenterFuture defaultAppCenterFuture;
        defaultAppCenterFuture = new DefaultAppCenterFuture();
        if (checkPrecondition()) {
            this.mHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.11
                @Override // java.lang.Runnable
                public void run() {
                    AppCenter.this.setInstanceEnabled(z);
                    defaultAppCenterFuture.complete(null);
                }
            });
        } else {
            defaultAppCenterFuture.complete(null);
        }
        return defaultAppCenterFuture;
    }

    private synchronized void setInstanceLogLevel(int i) {
        this.mLogLevelConfigured = true;
        AppCenterLog.setLogLevel(i);
    }

    private synchronized void setInstanceLogUrl(final String str) {
        this.mLogUrl = str;
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AppCenter.this.mAppSecret != null) {
                        StringBuilder G = wo1.G("The log url of App Center endpoint has been changed to ");
                        G.append(str);
                        AppCenterLog.info("AppCenter", G.toString());
                        AppCenter.this.mChannel.setLogUrl(str);
                        return;
                    }
                    StringBuilder G2 = wo1.G("The log url of One Collector endpoint has been changed to ");
                    G2.append(str);
                    AppCenterLog.info("AppCenter", G2.toString());
                    AppCenter.this.mOneCollectorChannelListener.setLogUrl(str);
                }
            });
        }
    }

    private synchronized AppCenterFuture<Boolean> setInstanceMaxStorageSizeAsync(long j) {
        DefaultAppCenterFuture<Boolean> defaultAppCenterFuture = new DefaultAppCenterFuture<>();
        if (this.mConfiguredFromApp) {
            AppCenterLog.error("AppCenter", "setMaxStorageSize may not be called after App Center has been configured.");
            defaultAppCenterFuture.complete(Boolean.FALSE);
            return defaultAppCenterFuture;
        } else if (j < MINIMUM_STORAGE_SIZE) {
            AppCenterLog.error("AppCenter", "Maximum storage size must be at least 24576 bytes.");
            defaultAppCenterFuture.complete(Boolean.FALSE);
            return defaultAppCenterFuture;
        } else if (this.mSetMaxStorageSizeFuture != null) {
            AppCenterLog.error("AppCenter", "setMaxStorageSize may only be called once per app launch.");
            defaultAppCenterFuture.complete(Boolean.FALSE);
            return defaultAppCenterFuture;
        } else {
            this.mMaxStorageSizeInBytes = j;
            this.mSetMaxStorageSizeFuture = defaultAppCenterFuture;
            return defaultAppCenterFuture;
        }
    }

    private synchronized void setInstanceNetworkRequestsAllowed(boolean z) {
        if (!isConfigured()) {
            this.mAllowedNetworkRequests = Boolean.valueOf(z);
        } else if (isInstanceNetworkRequestsAllowed() == z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Network requests are already ");
            sb.append(z ? "allowed" : "forbidden");
            AppCenterLog.info("AppCenter", sb.toString());
        } else {
            SharedPreferencesManager.putBoolean(PrefStorageConstants.ALLOWED_NETWORK_REQUEST, z);
            Channel channel = this.mChannel;
            if (channel != null) {
                channel.setNetworkRequests(z);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Set network requests ");
            sb2.append(z ? "allowed" : "forbidden");
            AppCenterLog.info("AppCenter", sb2.toString());
        }
    }

    private synchronized void setInstanceUserId(String str) {
        if (!this.mConfiguredFromApp) {
            AppCenterLog.error("AppCenter", "AppCenter must be configured from application, libraries cannot use call setUserId.");
            return;
        }
        String str2 = this.mAppSecret;
        if (str2 == null && this.mTransmissionTargetToken == null) {
            AppCenterLog.error("AppCenter", "AppCenter must be configured with a secret from application to call setUserId.");
            return;
        }
        if (str != null) {
            if (str2 != null && !UserIdContext.checkUserIdValidForAppCenter(str)) {
                return;
            }
            if (this.mTransmissionTargetToken != null && !UserIdContext.checkUserIdValidForOneCollector(str)) {
                return;
            }
        }
        UserIdContext.getInstance().setUserId(str);
    }

    private synchronized void setInstanceWrapperSdk(WrapperSdk wrapperSdk) {
        DeviceInfoHelper.setWrapperSdk(wrapperSdk);
        Handler handler = this.mHandler;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.1
                @Override // java.lang.Runnable
                public void run() {
                    AppCenter.this.mChannel.invalidateDeviceCache();
                }
            });
        }
    }

    public static void setLogLevel(@p1(from = 2, to = 8) int i) {
        getInstance().setInstanceLogLevel(i);
    }

    public static void setLogUrl(String str) {
        getInstance().setInstanceLogUrl(str);
    }

    public static AppCenterFuture<Boolean> setMaxStorageSize(long j) {
        return getInstance().setInstanceMaxStorageSizeAsync(j);
    }

    public static void setNetworkRequestsAllowed(boolean z) {
        getInstance().setInstanceNetworkRequestsAllowed(z);
    }

    public static void setUserId(String str) {
        getInstance().setInstanceUserId(str);
    }

    public static void setWrapperSdk(WrapperSdk wrapperSdk) {
        getInstance().setInstanceWrapperSdk(wrapperSdk);
    }

    @SafeVarargs
    public static void start(Class<? extends AppCenterService>... clsArr) {
        getInstance().startServices(true, clsArr);
    }

    @SafeVarargs
    public static void startFromLibrary(Context context, Class<? extends AppCenterService>... clsArr) {
        getInstance().startInstanceFromLibrary(context, clsArr);
    }

    private synchronized void startInstanceFromLibrary(Context context, Class<? extends AppCenterService>[] clsArr) {
        Application application;
        if (context != null) {
            try {
                application = (Application) context.getApplicationContext();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            application = null;
        }
        configureAndStartServices(application, null, false, clsArr);
    }

    private void startOrUpdateService(AppCenterService appCenterService, Collection<AppCenterService> collection, Collection<AppCenterService> collection2, boolean z) {
        if (z) {
            startOrUpdateServiceFromApp(appCenterService, collection, collection2);
        } else if (this.mServices.contains(appCenterService)) {
        } else {
            startServiceFromLibrary(appCenterService, collection);
        }
    }

    private void startOrUpdateServiceFromApp(AppCenterService appCenterService, Collection<AppCenterService> collection, Collection<AppCenterService> collection2) {
        String serviceName = appCenterService.getServiceName();
        if (this.mServices.contains(appCenterService)) {
            if (this.mServicesStartedFromLibrary.remove(appCenterService)) {
                collection2.add(appCenterService);
                return;
            }
            StringBuilder G = wo1.G("App Center has already started the service with class name: ");
            G.append(appCenterService.getServiceName());
            AppCenterLog.warn("AppCenter", G.toString());
        } else if (this.mAppSecret == null && appCenterService.isAppSecretRequired()) {
            AppCenterLog.error("AppCenter", "App Center was started without app secret, but the service requires it; not starting service " + serviceName + CryptoConstants.ALIAS_SEPARATOR);
        } else {
            startService(appCenterService, collection);
        }
    }

    private boolean startService(AppCenterService appCenterService, Collection<AppCenterService> collection) {
        String serviceName = appCenterService.getServiceName();
        if (ServiceInstrumentationUtils.isServiceDisabledByInstrumentation(serviceName)) {
            AppCenterLog.debug("AppCenter", "Instrumentation variable to disable service has been set; not starting service " + serviceName + CryptoConstants.ALIAS_SEPARATOR);
            return false;
        }
        appCenterService.onStarting(this.mAppCenterHandler);
        this.mApplicationLifecycleListener.registerApplicationLifecycleCallbacks(appCenterService);
        this.mApplication.registerActivityLifecycleCallbacks(appCenterService);
        this.mServices.add(appCenterService);
        collection.add(appCenterService);
        return true;
    }

    private void startServiceFromLibrary(AppCenterService appCenterService, Collection<AppCenterService> collection) {
        String serviceName = appCenterService.getServiceName();
        if (appCenterService.isAppSecretRequired()) {
            AppCenterLog.error("AppCenter", "This service cannot be started from a library: " + serviceName + CryptoConstants.ALIAS_SEPARATOR);
        } else if (startService(appCenterService, collection)) {
            this.mServicesStartedFromLibrary.add(appCenterService);
        }
    }

    @SafeVarargs
    private final synchronized void startServices(final boolean z, Class<? extends AppCenterService>... clsArr) {
        if (clsArr == null) {
            AppCenterLog.error("AppCenter", "Cannot start services, services array is null. Failed to start services.");
            return;
        }
        if (this.mApplication == null) {
            StringBuilder sb = new StringBuilder();
            for (Class<? extends AppCenterService> cls : clsArr) {
                sb.append("\t");
                sb.append(cls.getName());
                sb.append("\n");
            }
            AppCenterLog.error("AppCenter", "Cannot start services, App Center has not been configured. Failed to start the following services:\n" + ((Object) sb));
            return;
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        for (Class<? extends AppCenterService> cls2 : clsArr) {
            if (cls2 == null) {
                AppCenterLog.warn("AppCenter", "Skipping null service, please check your varargs/array does not contain any null reference.");
            } else {
                try {
                    startOrUpdateService((AppCenterService) cls2.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), arrayList, arrayList2, z);
                } catch (Exception e) {
                    AppCenterLog.error("AppCenter", "Failed to get service instance '" + cls2.getName() + "', skipping it.", e);
                }
            }
        }
        this.mHandler.post(new Runnable() { // from class: com.microsoft.appcenter.AppCenter.8
            @Override // java.lang.Runnable
            public void run() {
                AppCenter.this.finishStartServices(arrayList2, arrayList, z);
            }
        });
    }

    @r2
    public static synchronized void unsetInstance() {
        synchronized (AppCenter.class) {
            sInstance = null;
            NetworkStateHelper.unsetInstance();
        }
    }

    @r2
    public Application getApplication() {
        return this.mApplication;
    }

    @r2
    public Set<AppCenterService> getServices() {
        return this.mServices;
    }

    @r2
    public UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.mUncaughtExceptionHandler;
    }

    public boolean isInstanceEnabled() {
        return SharedPreferencesManager.getBoolean(PrefStorageConstants.KEY_ENABLED, true);
    }

    @r2
    public void setChannel(Channel channel) {
        this.mChannel = channel;
    }

    public static void configure(Application application) {
        getInstance().configureInstance(application, null, true);
    }

    @SafeVarargs
    public static void start(Application application, String str, Class<? extends AppCenterService>... clsArr) {
        getInstance().configureAndStartServices(application, str, clsArr);
    }

    @SafeVarargs
    public static void start(Application application, Class<? extends AppCenterService>... clsArr) {
        getInstance().configureAndStartServices(application, null, true, clsArr);
    }

    private void configureAndStartServices(Application application, String str, boolean z, Class<? extends AppCenterService>[] clsArr) {
        if (configureInstance(application, str, z)) {
            startServices(z, clsArr);
        }
    }
}
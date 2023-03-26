package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InstreamVideoAdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.p7700g.p99005.z1;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
/* loaded from: classes2.dex */
public class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* loaded from: classes2.dex */
    public static class a implements InvocationHandler {
        public final /* synthetic */ List a;
        public final /* synthetic */ List b;
        public final /* synthetic */ Map c;
        public final /* synthetic */ List d;
        public final /* synthetic */ Method e;
        public final /* synthetic */ Map f;
        public final /* synthetic */ List g;
        public final /* synthetic */ List h;
        public final /* synthetic */ List i;
        public final /* synthetic */ Method j;
        public final /* synthetic */ Method k;

        public a(List list, List list2, Map map, List list3, Method method, Map map2, List list4, List list5, List list6, Method method2, Method method3) {
            this.a = list;
            this.b = list2;
            this.c = map;
            this.d = list3;
            this.e = method;
            this.f = map2;
            this.g = list4;
            this.h = list5;
            this.i = list6;
            this.j = method2;
            this.k = method3;
        }

        @Override // java.lang.reflect.InvocationHandler
        @z1
        public Object invoke(Object obj, Method method, Object[] objArr) {
            if (method.getReturnType().isPrimitive()) {
                if (method.getReturnType().equals(Void.TYPE)) {
                    Iterator it = this.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (DynamicLoaderFallback.equalsMethods(method, (Method) it.next())) {
                                DynamicLoaderFallback.sApiProxyToAdListenersMap.put(obj, (AdListener) objArr[0]);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    Iterator it2 = this.b.iterator();
                    while (it2.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it2.next()) || !DynamicLoaderFallback.reportError(obj, this.c))) {
                    }
                    Iterator it3 = this.d.iterator();
                    while (it3.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it3.next()) || !DynamicLoaderFallback.reportError(obj, this.c))) {
                    }
                    if (DynamicLoaderFallback.equalsMethods(method, this.e)) {
                        DynamicLoaderFallback.reportError(this.f.get(obj), this.c);
                        return null;
                    }
                    return null;
                }
                return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                Object newProxyInstance = method.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                Iterator it4 = this.g.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it4.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f.get(obj), (AdListener) objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method method2 : this.h) {
                    if (DynamicLoaderFallback.equalsMethods(method, method2)) {
                        this.f.put(newProxyInstance, obj);
                    }
                }
                for (Method method3 : this.i) {
                    if (DynamicLoaderFallback.equalsMethods(method, method3)) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                this.c.put(newProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.j)) {
                    this.c.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.k)) {
                    this.c.put(objArr[1], (Ad) objArr[0]);
                }
                return newProxyInstance;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {
        public final /* synthetic */ AdListener s;
        public final /* synthetic */ Ad t;

        public b(AdListener adListener, Ad ad) {
            this.s = adListener;
            this.t = ad;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.onError(this.t, new AdError(-1, DynamicLoaderFactory.DEX_LOADING_ERROR_MESSAGE));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        c cVar = new c(null);
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.c(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createInstreamVideoAdViewApi(null, null, null, null);
        arrayList6.add(cVar.b());
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList6.add(cVar.b());
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList6.add(cVar.b());
        dynamicLoader.createNativeAdApi(null, null);
        Method b2 = cVar.b();
        dynamicLoader.createNativeBannerAdApi(null, null);
        Method b3 = cVar.b();
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.c(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.b());
        nativeAdBaseApi.loadAd((NativeAdBase.MediaCacheFlag) null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.loadAdFromBid(null, null);
        arrayList.add(cVar.b());
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList5.add(cVar.b());
        nativeAdBaseApi.setAdListener(null, null);
        arrayList3.add(cVar.b());
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.c(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd((EnumSet<CacheFlag>) null);
        arrayList.add(cVar.b());
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.b());
        interstitialAdApi.loadAdFromBid(null, null);
        arrayList.add(cVar.b());
        interstitialAdApi.setAdListener(null);
        arrayList3.add(cVar.b());
        interstitialAdApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.c(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.b());
        rewardedVideoAdApi.loadAd(false);
        arrayList.add(cVar.b());
        rewardedVideoAdApi.loadAdFromBid(null, false);
        arrayList.add(cVar.b());
        rewardedVideoAdApi.setAdListener(null);
        arrayList3.add(cVar.b());
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        InstreamVideoAdViewApi instreamVideoAdViewApi = (InstreamVideoAdViewApi) cVar.c(InstreamVideoAdViewApi.class);
        instreamVideoAdViewApi.loadAd();
        arrayList.add(cVar.b());
        instreamVideoAdViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        instreamVideoAdViewApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        instreamVideoAdViewApi.setAdListener(null);
        arrayList3.add(cVar.b());
        instreamVideoAdViewApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        AdViewApi adViewApi = (AdViewApi) cVar.c(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.b());
        adViewApi.loadAd(null);
        arrayList2.add(cVar.b());
        adViewApi.loadAdFromBid(null);
        arrayList.add(cVar.b());
        adViewApi.setAdListener(null);
        arrayList3.add(cVar.b());
        adViewApi.buildLoadAdConfig();
        arrayList5.add(cVar.b());
        ((AdView.AdViewLoadConfigBuilder) cVar.c(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        NativeAdBase.NativeAdLoadConfigBuilder nativeAdLoadConfigBuilder = (NativeAdBase.NativeAdLoadConfigBuilder) cVar.c(NativeAdBase.NativeAdLoadConfigBuilder.class);
        nativeAdLoadConfigBuilder.withAdListener(null);
        arrayList4.add(cVar.b());
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.c(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.c(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        ((InstreamVideoAdView.InstreamVideoLoadConfigBuilder) cVar.c(InstreamVideoAdView.InstreamVideoLoadConfigBuilder.class)).withAdListener(null);
        arrayList4.add(cVar.b());
        nativeAdLoadConfigBuilder.loadAd();
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new a(arrayList3, arrayList, hashMap, arrayList2, cVar.b(), hashMap2, arrayList4, arrayList5, arrayList6, b2, b3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(@z1 Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        Ad ad = map.get(obj);
        if (adListener != null) {
            new Handler(Looper.getMainLooper()).postDelayed(new b(adListener, ad), 500L);
            return true;
        }
        return false;
    }

    /* loaded from: classes2.dex */
    public static class c {
        @z1
        private Method a;
        private final InvocationHandler b;

        /* loaded from: classes2.dex */
        public class a implements InvocationHandler {
            public a() {
            }

            @Override // java.lang.reflect.InvocationHandler
            @z1
            public Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                c.this.a = method;
                return null;
            }
        }

        private c() {
            this.b = new a();
        }

        @z1
        public Method b() {
            return this.a;
        }

        public <T> T c(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.b));
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }
}
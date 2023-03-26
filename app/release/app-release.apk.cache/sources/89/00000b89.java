package com.anythink.network.admob;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.b.g;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdMobATInitManager extends ATInitMediation {
    private static final String a = "AdMobATInitManager";
    private static AdMobATInitManager e;
    private String b;
    private boolean d;
    private Map<String, Object> f;
    private List<MediationInitCallback> h;
    private boolean j;
    private boolean k;
    private final Object g = new Object();
    private int l = 0;
    private Handler i = new Handler(Looper.getMainLooper());
    private boolean c = false;

    /* loaded from: classes2.dex */
    public interface a {
        void initSuccess();
    }

    private AdMobATInitManager() {
    }

    public static synchronized AdMobATInitManager getInstance() {
        AdMobATInitManager adMobATInitManager;
        synchronized (AdMobATInitManager.class) {
            if (e == null) {
                e = new AdMobATInitManager();
            }
            adMobATInitManager = e;
        }
        return adMobATInitManager;
    }

    public synchronized void addCache(String str, Object obj) {
        if (this.f == null) {
            this.f = new HashMap();
        }
        this.f.put(str, obj);
    }

    public String getGoogleAdManagerName() {
        return "Google Ad Manager";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public List getMetaValutStatus() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("com.google.android.gms.ads.APPLICATION_ID");
        return arrayList;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkName() {
        return "Admob";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkSDKClass() {
        return "com.google.android.gms.ads.MobileAdsInitProvider";
    }

    @Override // com.anythink.core.api.ATInitMediation
    public String getNetworkVersion() {
        return AdmobATConst.getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATInitMediation
    public Map<String, Boolean> getPluginClassStatus() {
        HashMap hashMap = new HashMap();
        Boolean bool = Boolean.FALSE;
        hashMap.put("play-services-ads-*.aar", bool);
        hashMap.put("play-services-ads-base-*.aar", bool);
        hashMap.put("play-services-ads-lite-*.aar", bool);
        hashMap.put("play-services-ads-identifier-*.aar", bool);
        hashMap.put("play-services-basement-*.aar", bool);
        hashMap.put("play-services-measurement-sdk-api-*.aar", bool);
        hashMap.put("play=services-tasks-*.aar", bool);
        try {
            hashMap.put("play=services-tasks-*.aar", Boolean.TRUE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-*.aar", Boolean.TRUE);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-base-*.aar", Boolean.TRUE);
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-lite-*.aar", Boolean.TRUE);
        } catch (Throwable th4) {
            th4.printStackTrace();
        }
        try {
            hashMap.put("play-services-ads-identifier-*.aar", Boolean.TRUE);
        } catch (Throwable th5) {
            th5.printStackTrace();
        }
        try {
            hashMap.put("play-services-basement-*.aar", Boolean.TRUE);
        } catch (Throwable th6) {
            th6.printStackTrace();
        }
        try {
            hashMap.put("play-services-measurement-sdk-api-*.aar", Boolean.TRUE);
        } catch (Throwable th7) {
            th7.printStackTrace();
        }
        return hashMap;
    }

    public Bundle getRequestBundle(Map<String, Object> map) {
        Bundle bundle = new Bundle();
        try {
            if (map.containsKey(g.k.e)) {
                if (((Boolean) map.get(g.k.e)).booleanValue()) {
                    bundle.putString("npa", "0");
                } else {
                    bundle.putString("npa", "1");
                }
            }
        } catch (Throwable unused) {
        }
        if (this.j) {
            bundle.putString("rdp", "1");
        }
        return bundle;
    }

    @Override // com.anythink.core.api.ATInitMediation
    public void initSDK(Context context, final Map<String, Object> map, MediationInitCallback mediationInitCallback) {
        if (this.c) {
            if (mediationInitCallback != null) {
                mediationInitCallback.onSuccess();
                return;
            }
            return;
        }
        synchronized (this.g) {
            if (this.h == null) {
                this.h = new ArrayList();
            }
            if (mediationInitCallback != null) {
                this.h.add(mediationInitCallback);
            }
            if (this.d) {
                return;
            }
            this.d = true;
            try {
                this.j = ((Boolean) map.get(g.k.c)).booleanValue();
            } catch (Throwable unused) {
            }
            try {
                this.k = ((Boolean) map.get(g.k.d)).booleanValue();
                RequestConfiguration requestConfiguration = MobileAds.getRequestConfiguration();
                if (requestConfiguration == null) {
                    requestConfiguration = new RequestConfiguration.Builder().build();
                }
                if (this.k) {
                    MobileAds.setRequestConfiguration(requestConfiguration.toBuilder().setTagForChildDirectedTreatment(1).build());
                }
            } catch (Throwable unused2) {
            }
            final Context applicationContext = context.getApplicationContext();
            this.i.post(new Runnable() { // from class: com.anythink.network.admob.AdMobATInitManager.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        AdMobATInitManager.this.b = (String) map.get("app_id");
                        MobileAds.initialize(applicationContext);
                        if (AdMobATInitManager.this.l != 0) {
                            MobileAds.setAppMuted(AdMobATInitManager.this.l == 1);
                        }
                        AdMobATInitManager.this.c = true;
                        AdMobATInitManager.this.d = false;
                        int size = AdMobATInitManager.this.h.size();
                        for (int i = 0; i < size; i++) {
                            MediationInitCallback mediationInitCallback2 = (MediationInitCallback) AdMobATInitManager.this.h.get(i);
                            if (mediationInitCallback2 != null) {
                                mediationInitCallback2.onSuccess();
                            }
                        }
                        AdMobATInitManager.this.h.clear();
                    } catch (Throwable th) {
                        AdMobATInitManager.this.c = false;
                        AdMobATInitManager.this.d = false;
                        int size2 = AdMobATInitManager.this.h.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            MediationInitCallback mediationInitCallback3 = (MediationInitCallback) AdMobATInitManager.this.h.get(i2);
                            if (mediationInitCallback3 != null) {
                                mediationInitCallback3.onFail(th.getMessage());
                            }
                        }
                        AdMobATInitManager.this.h.clear();
                    }
                }
            });
        }
    }

    public synchronized void removeCache(String str) {
        Map<String, Object> map = this.f;
        if (map != null) {
            map.remove(str);
        }
    }

    public void setAdmobAppMuted(boolean z) {
        if (this.c) {
            MobileAds.setAppMuted(z);
        } else {
            this.l = z ? 1 : 2;
        }
    }

    @Override // com.anythink.core.api.ATInitMediation
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return false;
    }
}
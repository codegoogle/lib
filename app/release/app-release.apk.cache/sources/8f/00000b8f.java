package com.anythink.network.admob;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.MediationInitCallback;
import com.anythink.core.common.e.k;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Map;

/* loaded from: classes2.dex */
public class AdmobATBannerAdapter extends CustomBannerAdapter {
    private static final String g = "AdmobATBannerAdapter";
    public AdView b;
    public long c;
    public AdRequest a = null;
    private String h = "";
    public int d = 0;
    public final int e = 1;
    public final int f = 2;

    /* renamed from: com.anythink.network.admob.AdmobATBannerAdapter$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends AdListener {
        public final /* synthetic */ AdView a;

        public AnonymousClass2(AdView adView) {
            this.a = adView;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            if (AdmobATBannerAdapter.this.d != 1 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
                admobATBannerAdapter.d = 2;
                admobATBannerAdapter.c = SystemClock.elapsedRealtime();
                if (AdmobATBannerAdapter.this.mImpressionEventListener != null) {
                    AdmobATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (AdmobATBannerAdapter.this.mLoadListener != null) {
                AdmobATBannerAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
            admobATBannerAdapter.b = this.a;
            if (admobATBannerAdapter.mLoadListener != null) {
                AdmobATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            if (AdmobATBannerAdapter.this.d != 2 || Math.abs(SystemClock.elapsedRealtime() - AdmobATBannerAdapter.this.c) >= 1000) {
                AdmobATBannerAdapter admobATBannerAdapter = AdmobATBannerAdapter.this;
                admobATBannerAdapter.d = 1;
                admobATBannerAdapter.c = SystemClock.elapsedRealtime();
                if (AdmobATBannerAdapter.this.mImpressionEventListener != null) {
                    AdmobATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        AdView adView = this.b;
        if (adView != null) {
            adView.setAdListener(null);
            this.b.destroy();
            this.b = null;
        }
    }

    @Override // com.anythink.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        return this.b;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkName() {
        return AdMobATInitManager.getInstance().getNetworkName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.h;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, final Map<String, Object> map2) {
        if (map.containsKey("app_id") && map.containsKey("unit_id")) {
            map.get("app_id");
            this.h = (String) map.get("unit_id");
            AdMobATInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.anythink.network.admob.AdmobATBannerAdapter.1
                @Override // com.anythink.core.api.MediationInitCallback
                public final void onFail(String str) {
                }

                @Override // com.anythink.core.api.MediationInitCallback
                public final void onSuccess() {
                    AdmobATBannerAdapter.a(AdmobATBannerAdapter.this, context, map, map2);
                }
            });
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "appid or unitId is empty.");
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z, boolean z2) {
        return AdMobATInitManager.getInstance().setUserDataConsent(context, z, z2);
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public boolean supportImpressionCallback() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
        if (r10.equals(com.anythink.core.common.e.k.a) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Bundle requestBundle = AdMobATInitManager.getInstance().getRequestBundle(map);
        AdView adView = new AdView(context);
        char c = 2;
        AdSize adSize = null;
        if (map2.containsKey(AdmobATConst.ADAPTIVE_TYPE) && map2.containsKey(AdmobATConst.ADAPTIVE_ORIENTATION) && map2.containsKey(AdmobATConst.ADAPTIVE_WIDTH)) {
            try {
                int parseInt = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_TYPE).toString());
                int parseInt2 = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_ORIENTATION).toString());
                float parseInt3 = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_WIDTH).toString());
                float f = context.getResources().getDisplayMetrics().density;
                if (f <= 0.0f) {
                    f = 1.0f;
                }
                int i = (int) ((parseInt3 / f) + 0.5f);
                if (parseInt2 != 1) {
                    if (parseInt2 != 2) {
                        if (parseInt == 1) {
                            adSize = AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
                        } else {
                            adSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
                        }
                    } else if (parseInt == 1) {
                        adSize = AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i);
                    } else {
                        adSize = AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
                    }
                } else if (parseInt == 1) {
                    adSize = AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i);
                } else {
                    adSize = AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
                }
            } catch (Throwable unused) {
            }
        }
        if (adSize == null) {
            String obj = map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) ? map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString() : "";
            obj.hashCode();
            switch (obj.hashCode()) {
                case -559799608:
                    if (obj.equals(k.c)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -502542422:
                    if (obj.equals("320x100")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1507809730:
                    break;
                case 1540371324:
                    if (obj.equals("468x60")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1622564786:
                    if (obj.equals(k.d)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    adSize = AdSize.MEDIUM_RECTANGLE;
                    break;
                case 1:
                    adSize = AdSize.LARGE_BANNER;
                    break;
                case 2:
                    adSize = AdSize.BANNER;
                    break;
                case 3:
                    adSize = AdSize.FULL_BANNER;
                    break;
                case 4:
                    adSize = AdSize.LEADERBOARD;
                    break;
                default:
                    adSize = AdSize.SMART_BANNER;
                    break;
            }
        }
        adView.setAdSize(adSize);
        adView.setAdUnitId(this.h);
        adView.setAdListener(new AnonymousClass2(adView));
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, requestBundle).build();
        this.a = build;
        adView.loadAd(build);
    }

    private static int a(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
        if (r10.equals(com.anythink.core.common.e.k.a) == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void a(AdmobATBannerAdapter admobATBannerAdapter, Context context, Map map, Map map2) {
        Bundle requestBundle = AdMobATInitManager.getInstance().getRequestBundle(map);
        AdView adView = new AdView(context);
        char c = 2;
        AdSize adSize = null;
        if (map2.containsKey(AdmobATConst.ADAPTIVE_TYPE) && map2.containsKey(AdmobATConst.ADAPTIVE_ORIENTATION) && map2.containsKey(AdmobATConst.ADAPTIVE_WIDTH)) {
            try {
                int parseInt = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_TYPE).toString());
                int parseInt2 = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_ORIENTATION).toString());
                float parseInt3 = Integer.parseInt(map2.get(AdmobATConst.ADAPTIVE_WIDTH).toString());
                float f = context.getResources().getDisplayMetrics().density;
                if (f <= 0.0f) {
                    f = 1.0f;
                }
                int i = (int) ((parseInt3 / f) + 0.5f);
                if (parseInt2 != 1) {
                    if (parseInt2 != 2) {
                        if (parseInt == 1) {
                            adSize = AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, i);
                        } else {
                            adSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, i);
                        }
                    } else if (parseInt == 1) {
                        adSize = AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, i);
                    } else {
                        adSize = AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, i);
                    }
                } else if (parseInt == 1) {
                    adSize = AdSize.getPortraitInlineAdaptiveBannerAdSize(context, i);
                } else {
                    adSize = AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, i);
                }
            } catch (Throwable unused) {
            }
        }
        if (adSize == null) {
            String obj = map.containsKey(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE) ? map.get(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE).toString() : "";
            obj.hashCode();
            switch (obj.hashCode()) {
                case -559799608:
                    if (obj.equals(k.c)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -502542422:
                    if (obj.equals("320x100")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1507809730:
                    break;
                case 1540371324:
                    if (obj.equals("468x60")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1622564786:
                    if (obj.equals(k.d)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    adSize = AdSize.MEDIUM_RECTANGLE;
                    break;
                case 1:
                    adSize = AdSize.LARGE_BANNER;
                    break;
                case 2:
                    adSize = AdSize.BANNER;
                    break;
                case 3:
                    adSize = AdSize.FULL_BANNER;
                    break;
                case 4:
                    adSize = AdSize.LEADERBOARD;
                    break;
                default:
                    adSize = AdSize.SMART_BANNER;
                    break;
            }
        }
        adView.setAdSize(adSize);
        adView.setAdUnitId(admobATBannerAdapter.h);
        adView.setAdListener(new AnonymousClass2(adView));
        AdRequest build = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, requestBundle).build();
        admobATBannerAdapter.a = build;
        adView.loadAd(build);
    }
}
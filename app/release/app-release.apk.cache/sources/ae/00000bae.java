package com.anythink.network.admob;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.anythink.banner.unitgroup.api.CustomBannerAdapter;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.e.k;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import java.util.Map;

/* loaded from: classes2.dex */
public class GoogleAdATBannerAdapter extends CustomBannerAdapter {
    public AdManagerAdView b;
    public long c;
    public AdManagerAdRequest a = null;
    private String g = "";
    public int d = 0;
    public final int e = 1;
    public final int f = 2;

    /* renamed from: com.anythink.network.admob.GoogleAdATBannerAdapter$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends AdListener {
        public final /* synthetic */ AdManagerAdView a;

        public AnonymousClass1(AdManagerAdView adManagerAdView) {
            this.a = adManagerAdView;
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClicked() {
            if (GoogleAdATBannerAdapter.this.d != 1 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.d = 2;
                googleAdATBannerAdapter.c = SystemClock.elapsedRealtime();
                if (GoogleAdATBannerAdapter.this.mImpressionEventListener != null) {
                    GoogleAdATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdClosed() {
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdFailedToLoad(LoadAdError loadAdError) {
            if (GoogleAdATBannerAdapter.this.mLoadListener != null) {
                GoogleAdATBannerAdapter.this.mLoadListener.onAdLoadError(String.valueOf(loadAdError.getCode()), loadAdError.getMessage());
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdLoaded() {
            GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
            googleAdATBannerAdapter.b = this.a;
            if (googleAdATBannerAdapter.mLoadListener != null) {
                GoogleAdATBannerAdapter.this.mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }

        @Override // com.google.android.gms.ads.AdListener
        public final void onAdOpened() {
            if (GoogleAdATBannerAdapter.this.d != 2 || Math.abs(SystemClock.elapsedRealtime() - GoogleAdATBannerAdapter.this.c) >= 1000) {
                GoogleAdATBannerAdapter googleAdATBannerAdapter = GoogleAdATBannerAdapter.this;
                googleAdATBannerAdapter.d = 1;
                googleAdATBannerAdapter.c = SystemClock.elapsedRealtime();
                if (GoogleAdATBannerAdapter.this.mImpressionEventListener != null) {
                    GoogleAdATBannerAdapter.this.mImpressionEventListener.onBannerAdClicked();
                }
            }
        }
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public void destory() {
        AdManagerAdView adManagerAdView = this.b;
        if (adManagerAdView != null) {
            adManagerAdView.setAdListener(null);
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
        return AdMobATInitManager.getInstance().getGoogleAdManagerName();
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.g;
    }

    @Override // com.anythink.core.api.ATBaseAdAdapter
    public String getNetworkSDKVersion() {
        return AdMobATInitManager.getInstance().getNetworkVersion();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d2, code lost:
        if (r2.equals(com.anythink.core.common.e.k.a) == false) goto L35;
     */
    @Override // com.anythink.core.api.ATBaseAdAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (map.containsKey("unit_id")) {
            this.g = (String) map.get("unit_id");
            AdManagerAdView adManagerAdView = new AdManagerAdView(context);
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
            adManagerAdView.setAdSizes(adSize);
            adManagerAdView.setAdUnitId(this.g);
            adManagerAdView.setAdListener(new AnonymousClass1(adManagerAdView));
            AdManagerAdRequest build = new AdManagerAdRequest.Builder().build();
            this.a = build;
            adManagerAdView.loadAd(build);
            return;
        }
        ATCustomLoadListener aTCustomLoadListener = this.mLoadListener;
        if (aTCustomLoadListener != null) {
            aTCustomLoadListener.onAdLoadError("", "unitId is empty.");
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
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r10.equals(com.anythink.core.common.e.k.a) == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdManagerAdView adManagerAdView = new AdManagerAdView(context);
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
        adManagerAdView.setAdSizes(adSize);
        adManagerAdView.setAdUnitId(this.g);
        adManagerAdView.setAdListener(new AnonymousClass1(adManagerAdView));
        AdManagerAdRequest build = new AdManagerAdRequest.Builder().build();
        this.a = build;
        adManagerAdView.loadAd(build);
    }

    private static int a(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }
}
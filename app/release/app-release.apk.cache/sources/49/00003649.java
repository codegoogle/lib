package com.ironsource.sdk.f;

import com.ironsource.sdk.g.d;

/* loaded from: classes3.dex */
public class a {
    private com.ironsource.mediationsdk.adunit.a.a a = new com.ironsource.mediationsdk.adunit.a.a();

    /* renamed from: com.ironsource.sdk.f.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0130a {
        public String a;
        public String b;
        public String c;

        public static C0130a a(d.e eVar) {
            String str;
            C0130a c0130a = new C0130a();
            if (eVar == d.e.RewardedVideo) {
                c0130a.a = "showRewardedVideo";
                c0130a.b = "onShowRewardedVideoSuccess";
                str = "onShowRewardedVideoFail";
            } else if (eVar != d.e.Interstitial) {
                if (eVar == d.e.OfferWall) {
                    c0130a.a = "showOfferWall";
                    c0130a.b = "onShowOfferWallSuccess";
                    str = "onInitOfferWallFail";
                }
                return c0130a;
            } else {
                c0130a.a = "showInterstitial";
                c0130a.b = "onShowInterstitialSuccess";
                str = "onShowInterstitialFail";
            }
            c0130a.c = str;
            return c0130a;
        }
    }

    public void a(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdia", Integer.valueOf(i));
    }

    public void b(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdra", Integer.valueOf(i));
    }

    public void c(int i) {
        com.ironsource.mediationsdk.adunit.a.a.a("sdba", Integer.valueOf(i));
    }
}
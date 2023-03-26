package com.p7700g.p99005;

import android.app.Activity;
import android.view.ViewGroup;
import com.greedygame.core.adview.general.GGAdview;

/* compiled from: Sdk_Native_Inflate.java */
/* loaded from: classes3.dex */
public class hg3 {
    private static String a = "Sdk_Native_Inflate";

    /* compiled from: Sdk_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class a implements v03 {
        public final /* synthetic */ ViewGroup a;

        public a(final ViewGroup val$viewGroup) {
            this.a = val$viewGroup;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            this.a.setVisibility(8);
            String unused = hg3.a;
            String str = "Sdk_Native_Inflate onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.v03
        public void b() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void c() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void d() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            String unused = hg3.a;
        }
    }

    /* compiled from: Sdk_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class b implements v03 {
        public final /* synthetic */ ViewGroup a;

        public b(final ViewGroup val$viewGroup) {
            this.a = val$viewGroup;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            this.a.setVisibility(8);
            String unused = hg3.a;
            String str = "Sdk_Native_Inflate onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.v03
        public void b() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void c() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void d() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            String unused = hg3.a;
        }
    }

    /* compiled from: Sdk_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class c implements v03 {
        public final /* synthetic */ ViewGroup a;

        public c(final ViewGroup val$viewGroup) {
            this.a = val$viewGroup;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            this.a.setVisibility(8);
            String unused = hg3.a;
            String str = "Sdk_Native_Inflate onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.v03
        public void b() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void c() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void d() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            String unused = hg3.a;
        }
    }

    /* compiled from: Sdk_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class d implements v03 {
        public final /* synthetic */ ViewGroup a;

        public d(final ViewGroup val$viewGroup) {
            this.a = val$viewGroup;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void a(r13 cause) {
            this.a.setVisibility(8);
            String unused = hg3.a;
            String str = "Sdk_Native_Inflate onAdLoadFailed -> " + cause;
        }

        @Override // com.p7700g.p99005.v03
        public void b() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void c() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03
        public void d() {
            String unused = hg3.a;
        }

        @Override // com.p7700g.p99005.v03, com.p7700g.p99005.d03
        public void onAdLoaded() {
            String unused = hg3.a;
        }
    }

    public static void b(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        String F = ih3.F();
        GGAdview gGAdview = new GGAdview(activity);
        gGAdview.setUnitId(F);
        gGAdview.setAdsMaxHeight(250);
        viewGroup.addView(gGAdview, new ViewGroup.LayoutParams(-1, 200));
        gGAdview.B(new b(viewGroup));
    }

    public static void c(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        String F = ih3.F();
        GGAdview gGAdview = new GGAdview(activity);
        gGAdview.setUnitId(F);
        gGAdview.setAdsMaxHeight(250);
        viewGroup.addView(gGAdview, new ViewGroup.LayoutParams(-1, 200));
        gGAdview.B(new d(viewGroup));
    }

    public static void d(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        String F = ih3.F();
        GGAdview gGAdview = new GGAdview(activity);
        gGAdview.setUnitId(F);
        gGAdview.setAdsMaxHeight(250);
        viewGroup.addView(gGAdview, new ViewGroup.LayoutParams(-1, 200));
        gGAdview.B(new c(viewGroup));
    }

    public static void e(Activity activity, ViewGroup viewGroup, GGAdview nativeAd1, String nativeType, String direction) {
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        String F = ih3.F();
        GGAdview gGAdview = new GGAdview(activity);
        gGAdview.setUnitId(F);
        gGAdview.setAdsMaxHeight(250);
        viewGroup.addView(gGAdview, new ViewGroup.LayoutParams(-1, 200));
        gGAdview.B(new a(viewGroup));
    }
}
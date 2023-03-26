package com.p7700g.p99005;

import android.app.Activity;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.NativeAd;

/* compiled from: Topon_Native_Inflate.java */
/* loaded from: classes3.dex */
public class lg3 {
    private static String a = "Topon_Native_Inflate";
    private static dh3 b;
    private static Activity c;

    /* compiled from: Topon_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ NativeAd s;
        public final /* synthetic */ ViewGroup t;
        public final /* synthetic */ ATNativeAdView u;
        public final /* synthetic */ eh3 v;

        public a(final NativeAd val$nativeAd, final ViewGroup val$viewGroup, final ATNativeAdView val$anyThinkNativeAdView, final eh3 val$finalToponNativeBig) {
            this.s = val$nativeAd;
            this.t = val$viewGroup;
            this.u = val$anyThinkNativeAdView;
            this.v = val$finalToponNativeBig;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.s != null) {
                    this.t.addView(this.u);
                    this.s.renderAdView(this.u, this.v);
                    this.s.prepare(this.u, this.v.a(), null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String unused = lg3.a;
                String str = "inflate_native_big_card failed -> " + e;
            }
        }
    }

    /* compiled from: Topon_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ NativeAd s;
        public final /* synthetic */ ViewGroup t;
        public final /* synthetic */ ATNativeAdView u;
        public final /* synthetic */ hh3 v;

        public b(final NativeAd val$nativeAd, final ViewGroup val$viewGroup, final ATNativeAdView val$anyThinkNativeAdView, final hh3 val$finalToponNativeBig) {
            this.s = val$nativeAd;
            this.t = val$viewGroup;
            this.u = val$anyThinkNativeAdView;
            this.v = val$finalToponNativeBig;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.s != null) {
                    this.t.addView(this.u);
                    this.s.renderAdView(this.u, this.v);
                    this.s.prepare(this.u, this.v.a(), null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String unused = lg3.a;
                String str = "inflate_native_SmallBottom failed -> " + e;
            }
        }
    }

    /* compiled from: Topon_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ ATNativeAdView t;
        public final /* synthetic */ NativeAd u;
        public final /* synthetic */ fh3 v;

        public c(final ViewGroup val$viewGroup, final ATNativeAdView val$anyThinkNativeAdView, final NativeAd val$nativeAd, final fh3 val$toponNativeSamllBanner) {
            this.s = val$viewGroup;
            this.t = val$anyThinkNativeAdView;
            this.u = val$nativeAd;
            this.v = val$toponNativeSamllBanner;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.addView(this.t);
            this.u.renderAdView(this.t, this.v);
            this.u.prepare(this.t, this.v.a(), null);
        }
    }

    /* compiled from: Topon_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ NativeAd s;
        public final /* synthetic */ Activity t;
        public final /* synthetic */ String u;
        public final /* synthetic */ ViewGroup v;

        public d(final NativeAd val$nativeAd, final Activity val$activity, final String val$direction, final ViewGroup val$viewGroup) {
            this.s = val$nativeAd;
            this.t = val$activity;
            this.u = val$direction;
            this.v = val$viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.s != null) {
                    ATNativeAdView aTNativeAdView = new ATNativeAdView(this.t);
                    gh3 gh3Var = new gh3(this.t, this.u);
                    this.v.addView(aTNativeAdView);
                    this.s.renderAdView(aTNativeAdView, gh3Var);
                    this.s.prepare(aTNativeAdView, gh3Var.a(), null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                String unused = lg3.a;
                String str = "inflate_native_SmallBottom failed -> " + e;
            }
        }
    }

    private static Resources b() {
        if (b == null) {
            b = new dh3(c.getResources());
        }
        return b;
    }

    public static void c(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        activity.runOnUiThread(new d(nativeAd, activity, direction, viewGroup));
    }

    public static void d(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        activity.runOnUiThread(new b(nativeAd, viewGroup, new ATNativeAdView(activity), new hh3(activity, direction)));
    }

    public static void e(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        activity.runOnUiThread(new c(viewGroup, new ATNativeAdView(activity), nativeAd, new fh3(activity)));
    }

    public static void f(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        activity.runOnUiThread(new a(nativeAd, viewGroup, new ATNativeAdView(activity), new eh3(activity, direction)));
    }
}
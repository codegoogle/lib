package com.p7700g.p99005;

import android.app.Activity;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

/* compiled from: IronSource_Native_Inflate.java */
/* loaded from: classes3.dex */
public class yf3 {
    private static String a = "IronSource_Native_Inflate";
    private static dh3 b;
    private static Activity c;

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class a implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* renamed from: com.p7700g.p99005.yf3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0270a implements Runnable {
            public RunnableC0270a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b.removeAllViews();
            }
        }

        public a(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            String unused = yf3.a;
            error.getErrorMessage();
            error.getErrorCode();
            this.a.runOnUiThread(new RunnableC0270a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class b implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.removeAllViews();
            }
        }

        public b(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            this.a.runOnUiThread(new a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class c implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.b.removeAllViews();
            }
        }

        public c(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            this.a.runOnUiThread(new a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class d implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.b.removeAllViews();
            }
        }

        public d(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            this.a.runOnUiThread(new a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class e implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.b.removeAllViews();
            }
        }

        public e(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            this.a.runOnUiThread(new a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    /* compiled from: IronSource_Native_Inflate.java */
    /* loaded from: classes3.dex */
    public class f implements BannerListener {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ ViewGroup b;

        /* compiled from: IronSource_Native_Inflate.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.b.removeAllViews();
            }
        }

        public f(final Activity val$activity, final ViewGroup val$viewGroup) {
            this.a = val$activity;
            this.b = val$viewGroup;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdClicked() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLeftApplication() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoadFailed(IronSourceError error) {
            this.a.runOnUiThread(new a());
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdLoaded() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenDismissed() {
            String unused = yf3.a;
        }

        @Override // com.ironsource.mediationsdk.sdk.BannerListener
        public void onBannerAdScreenPresented() {
            String unused = yf3.a;
        }
    }

    private static Resources b() {
        if (b == null) {
            b = new dh3(c.getResources());
        }
        return b;
    }

    public static void c(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new f(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }

    public static void d(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new b(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }

    public static void e(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new c(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }

    public static void f(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new e(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }

    public static void g(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new d(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }

    public static void h(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        c = activity;
        viewGroup.setVisibility(0);
        viewGroup.removeAllViews();
        viewGroup.addView(nativeAd, 0, new FrameLayout.LayoutParams(-1, -2));
        nativeAd.setBannerListener(new a(activity, viewGroup));
        IronSource.loadBanner(nativeAd);
    }
}
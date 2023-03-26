package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.p7700g.p99005.zg3;

/* compiled from: IronSource_Native.java */
/* loaded from: classes3.dex */
public class xf3 {
    public static final String a = "IronSource_Native";
    public static IronSourceBannerLayout b;
    public static IronSourceBannerLayout c;
    public static Boolean d;
    public static IronSourceBannerLayout e;
    public static IronSourceBannerLayout f;
    public static IronSourceBannerLayout g;
    public static Boolean h;
    public static IronSourceBannerLayout i;
    public static IronSourceBannerLayout j;
    public static IronSourceBannerLayout k;
    public static Boolean l;

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.k = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            xf3.e(this.a);
            xf3.l = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.b = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.c = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.b = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.c = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class g extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            xf3.g(this.a);
            xf3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.f = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.g = null;
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class j extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            xf3.c(this.a);
            xf3.h = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: IronSource_Native.java */
    /* loaded from: classes3.dex */
    public class k implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            xf3.j = null;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        d = bool;
        f = null;
        g = null;
        h = bool;
        j = null;
        k = null;
        l = bool;
    }

    public static void a(Activity mactivity) {
        if (yg3.e(bh3.f).equals("1")) {
            IronSourceBannerLayout createBanner = IronSource.createBanner(mactivity, ISBannerSize.SMART);
            i = createBanner;
            IronSource.loadBanner(createBanner);
        }
    }

    public static void b(Activity mactivity) {
        if (yg3.e(bh3.e).equals("1")) {
            e = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        }
    }

    public static void c(Activity mactivity) {
        IronSourceBannerLayout ironSourceBannerLayout = f;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        IronSourceBannerLayout createBanner = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        f = createBanner;
        IronSource.loadBanner(createBanner);
    }

    public static void d(Activity mactivity) {
        IronSourceBannerLayout ironSourceBannerLayout = g;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        IronSourceBannerLayout createBanner = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        g = createBanner;
        IronSource.loadBanner(createBanner);
    }

    public static void e(Activity mactivity) {
        IronSourceBannerLayout ironSourceBannerLayout = j;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        IronSourceBannerLayout createBanner = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        j = createBanner;
        IronSource.loadBanner(createBanner);
    }

    public static void f(Activity mactivity) {
        IronSourceBannerLayout ironSourceBannerLayout = k;
        if (ironSourceBannerLayout != null) {
            IronSource.destroyBanner(ironSourceBannerLayout);
        }
        IronSourceBannerLayout createBanner = IronSource.createBanner(mactivity, ISBannerSize.SMART);
        k = createBanner;
        IronSource.loadBanner(createBanner);
    }

    public static void g(Activity mactivity) {
        b = IronSource.createBanner(mactivity, ISBannerSize.SMART);
    }

    public static void h(Activity mactivity) {
        c = IronSource.createBanner(mactivity, ISBannerSize.SMART);
    }

    public static void i(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            j(activity, viewGroup, i, nativeType, direction);
            a(activity);
        } else if (direction.equals(bh3.b1)) {
            if (f != null) {
                n(activity, viewGroup, f, nativeType, direction);
                new Handler().postDelayed(new h(), bh3.e1);
                d(activity);
            } else if (g != null) {
                n(activity, viewGroup, g, nativeType, direction);
                new Handler().postDelayed(new i(), bh3.e1);
                c(activity);
            } else {
                r(activity);
            }
        }
    }

    private static void j(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout bannerBottom, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            yf3.f(activity, viewGroup, bannerBottom, nativeType, direction);
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void k(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout bannerTop, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            yf3.g(activity, viewGroup, bannerTop, nativeType, direction);
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void l(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.Q, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
                return;
            }
            yf3.h(activity, viewGroup, nativeAd, nativeType, direction);
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void m(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeAd == null) {
                viewGroup.setVisibility(8);
                viewGroup.removeAllViews();
            } else if (yg3.e(bh3.E0).equals("1")) {
                yf3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                yf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                yf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void n(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeAd == null) {
                viewGroup.setVisibility(8);
                viewGroup.removeAllViews();
            } else if (yg3.e(bh3.G0).equals("1")) {
                yf3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                yf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void o(Activity activity, ViewGroup viewGroup, IronSourceBannerLayout nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeAd == null) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(8);
            } else if (yg3.e(bh3.F0).equals("1")) {
                yf3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                yf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    public static void p(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (j != null) {
            m(activity, viewGroup, j, nativeType, direction);
            new Handler().postDelayed(new k(), bh3.e1);
            f(activity);
        } else if (k != null) {
            m(activity, viewGroup, k, nativeType, direction);
            new Handler().postDelayed(new a(), bh3.e1);
            e(activity);
        } else {
            s(activity);
        }
    }

    public static void q(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            if (b != null) {
                l(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new c(), bh3.e1);
                h(activity);
            } else if (c != null) {
                l(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new d(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                k(activity, viewGroup, e, nativeType, direction);
                b(activity);
            } else if (b != null) {
                o(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new e(), bh3.e1);
                h(activity);
            } else if (c != null) {
                o(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new f(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        }
    }

    public static void r(Activity activity) {
        if (h.booleanValue()) {
            return;
        }
        h = Boolean.TRUE;
        new j(bh3.d1, 1000L, activity).start();
    }

    public static void s(Activity activity) {
        if (l.booleanValue()) {
            return;
        }
        l = Boolean.TRUE;
        new b(bh3.d1, 1000L, activity).start();
    }

    public static void t(Activity activity) {
        if (d.booleanValue()) {
            return;
        }
        d = Boolean.TRUE;
        new g(bh3.d1, 1000L, activity).start();
    }
}
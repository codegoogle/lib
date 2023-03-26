package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.p7700g.p99005.zg3;

/* compiled from: Facebook_Native.java */
/* loaded from: classes3.dex */
public class tf3 {
    public static final String a = "Facebook_Native";
    public static NativeAd b;
    public static NativeAd c;
    public static Boolean d;
    public static Boolean e;
    public static NativeBannerAd f;
    public static NativeAd g;
    public static NativeAd h;
    public static Boolean i;
    public static NativeBannerAd j;
    public static Boolean k;
    public static NativeAd l;
    public static NativeAd m;
    public static Boolean n;

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class a implements NativeAdListener {
        public final /* synthetic */ NativeAd a;

        public a(final NativeAd val$nativeAd) {
            this.a = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.a;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.g = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class b implements NativeAdListener {
        public final /* synthetic */ NativeAd a;

        public b(final NativeAd val$nativeAd) {
            this.a = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.a;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.h = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.g = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.h = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class e extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            tf3.c(this.a);
            tf3.i = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class f implements NativeAdListener {
        public final /* synthetic */ NativeAd a;

        public f(final NativeAd val$nativeAd) {
            this.a = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.a;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.l = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class g implements NativeAdListener {
        public final /* synthetic */ NativeAd a;

        public g(final NativeAd val$nativeAd) {
            this.a = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.a;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.m = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.l = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.m = null;
        }
    }

    /* compiled from: Facebook_Native.java */
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
            tf3.e(this.a);
            tf3.n = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class k implements NativeAdListener {
        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeBannerAd nativeBannerAd = tf3.f;
            if (nativeBannerAd != null && nativeBannerAd == ad) {
                tf3.e = Boolean.TRUE;
                tf3.f.downloadMedia();
                return;
            }
            tf3.e = Boolean.FALSE;
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            tf3.e = Boolean.FALSE;
            adError.getErrorMessage();
            adError.getErrorCode();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class l implements NativeAdListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ NativeAd b;

        public l(final String val$adId, final NativeAd val$nativeAd) {
            this.a = val$adId;
            this.b = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.b;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.b = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            tf3.b = null;
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class m implements NativeAdListener {
        public final /* synthetic */ String a;
        public final /* synthetic */ NativeAd b;

        public m(final String val$adId, final NativeAd val$nativeAd) {
            this.a = val$adId;
            this.b = val$nativeAd;
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeAd nativeAd = this.b;
            if (nativeAd == null || nativeAd != ad) {
                return;
            }
            tf3.c = nativeAd;
            nativeAd.downloadMedia();
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            tf3.c = null;
            adError.getErrorCode();
            adError.getErrorMessage();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class n implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.b = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class o implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.c = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class p implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.b = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class q implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            tf3.c = null;
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class r extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            tf3.g(this.a);
            tf3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Facebook_Native.java */
    /* loaded from: classes3.dex */
    public class s implements NativeAdListener {
        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            NativeBannerAd nativeBannerAd = tf3.j;
            if (nativeBannerAd != null && nativeBannerAd == ad) {
                tf3.k = Boolean.TRUE;
                tf3.j.downloadMedia();
                return;
            }
            tf3.e = Boolean.FALSE;
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, AdError adError) {
            tf3.e = Boolean.FALSE;
            adError.getErrorMessage();
            adError.getErrorCode();
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        d = bool;
        e = bool;
        f = null;
        g = null;
        h = null;
        i = bool;
        j = null;
        k = bool;
        l = null;
        m = null;
        n = bool;
    }

    public static void a(Activity mactivity) {
        if (yg3.e(bh3.f).equals("1")) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(mactivity, ih3.x());
            j = nativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new s()).build());
        }
    }

    public static void b(Activity mactivity) {
        if (yg3.e(bh3.e).equals("1")) {
            NativeBannerAd nativeBannerAd = new NativeBannerAd(mactivity, ih3.x());
            f = nativeBannerAd;
            nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new k()).build());
        }
    }

    public static void c(Activity mactivity) {
        NativeAd nativeAd = new NativeAd(mactivity, ih3.A());
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new a(nativeAd)).build());
    }

    public static void d(Activity mactivity) {
        NativeAd nativeAd = new NativeAd(mactivity, ih3.z());
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new b(nativeAd)).build());
    }

    public static void e(Activity mactivity) {
        NativeAd nativeAd = new NativeAd(mactivity, ih3.z());
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new f(nativeAd)).build());
    }

    public static void f(Activity mactivity) {
        NativeAd nativeAd = new NativeAd(mactivity, ih3.A());
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new g(nativeAd)).build());
    }

    public static void g(Activity mactivity) {
        String z = ih3.z();
        NativeAd nativeAd = new NativeAd(mactivity, z);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new l(z, nativeAd)).build());
    }

    public static void h(Activity mactivity) {
        String A = ih3.A();
        NativeAd nativeAd = new NativeAd(mactivity, A);
        nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new m(A, nativeAd)).build());
    }

    public static void i(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            j(activity, viewGroup, j, nativeType, direction);
            a(activity);
        } else if (direction.equals(bh3.b1)) {
            if (g != null) {
                n(activity, viewGroup, g, nativeType, direction);
                new Handler().postDelayed(new c(), bh3.e1);
                d(activity);
            } else if (h != null) {
                n(activity, viewGroup, h, nativeType, direction);
                new Handler().postDelayed(new d(), bh3.e1);
                c(activity);
            } else {
                r(activity);
            }
        }
    }

    private static void j(Activity activity, ViewGroup viewGroup, NativeBannerAd bannerBottom, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (bannerBottom != null && !k.booleanValue()) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(0);
                uf3.e(activity, viewGroup, bannerBottom);
                return;
            }
            viewGroup.setVisibility(8);
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void k(Activity activity, ViewGroup viewGroup, NativeBannerAd bannerTop1, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (f != null && e.booleanValue()) {
                viewGroup.removeAllViews();
                viewGroup.setVisibility(0);
                uf3.e(activity, viewGroup, f);
                return;
            }
            viewGroup.setVisibility(8);
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void l(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
            uf3.f(activity, viewGroup, nativeAd, nativeType, direction);
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void m(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
            } else if (yg3.e(bh3.E0).equals("1")) {
                uf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                uf3.b(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                uf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void n(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
            } else if (yg3.e(bh3.G0).equals("1")) {
                uf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                uf3.b(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void o(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
                uf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                uf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    public static void p(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (l != null) {
            m(activity, viewGroup, l, nativeType, direction);
            new Handler().postDelayed(new h(), bh3.e1);
            f(activity);
        } else if (m != null) {
            m(activity, viewGroup, m, nativeType, direction);
            new Handler().postDelayed(new i(), bh3.e1);
            e(activity);
        } else {
            s(activity);
        }
    }

    public static void q(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            if (b != null) {
                l(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new n(), bh3.e1);
                h(activity);
            } else if (c != null) {
                l(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new o(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                k(activity, viewGroup, f, nativeType, direction);
                b(activity);
            } else if (b != null) {
                o(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new p(), bh3.e1);
                h(activity);
            } else if (c != null) {
                o(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new q(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        }
    }

    public static void r(Activity activity) {
        if (i.booleanValue()) {
            return;
        }
        i = Boolean.TRUE;
        new e(bh3.d1, 1000L, activity).start();
    }

    public static void s(Activity activity) {
        if (n.booleanValue()) {
            return;
        }
        n = Boolean.TRUE;
        new j(bh3.d1, 1000L, activity).start();
    }

    public static void t(Activity activity) {
        if (d.booleanValue()) {
            return;
        }
        d = Boolean.TRUE;
        new r(bh3.d1, 1000L, activity).start();
    }
}
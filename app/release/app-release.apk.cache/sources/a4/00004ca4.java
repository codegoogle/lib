package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.banner.api.ATBannerView;
import com.anythink.core.api.AdError;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeNetworkListener;
import com.anythink.nativead.api.NativeAd;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.p7700g.p99005.zg3;

/* compiled from: Topon_Native.java */
/* loaded from: classes3.dex */
public class kg3 {
    public static final String a = "Topon_Native";
    public static NativeAd b;
    public static NativeAd c;
    public static Boolean d;
    private static ATNative e;
    private static ATNative f;
    public static ATBannerView g;
    public static NativeAd h;
    public static NativeAd i;
    private static ATNative j;
    private static ATNative k;
    public static Boolean l;
    public static ATBannerView m;
    public static NativeAd n;
    public static NativeAd o;
    public static Boolean p;
    private static ATNative q;
    private static ATNative r;

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.h = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.i = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class c extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            kg3.i(this.a);
            kg3.l = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class d implements ATNativeNetworkListener {
        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.n = kg3.q.getNativeAd();
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class e implements ATNativeNetworkListener {
        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.o = kg3.r.getNativeAd();
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.n = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.o = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class h extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            kg3.k(this.a);
            kg3.p = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class i implements ATNativeNetworkListener {
        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.b = kg3.e.getNativeAd();
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class j implements ATNativeNetworkListener {
        public final /* synthetic */ String a;

        public j(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.c = kg3.f.getNativeAd();
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class k implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.b = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.c = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class m implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.b = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class n implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            kg3.c = null;
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class o extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            kg3.m(this.a);
            kg3.d = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class p implements ATNativeNetworkListener {
        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.h = kg3.j.getNativeAd();
        }
    }

    /* compiled from: Topon_Native.java */
    /* loaded from: classes3.dex */
    public class q implements ATNativeNetworkListener {
        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoadFail(AdError adError) {
            adError.getFullErrorInfo();
        }

        @Override // com.anythink.nativead.api.ATNativeNetworkListener
        public void onNativeAdLoaded() {
            kg3.i = kg3.k.getNativeAd();
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        d = bool;
        h = null;
        i = null;
        l = bool;
        n = null;
        o = null;
        p = bool;
    }

    public static void g(Activity mactivity) {
        if (yg3.e(bh3.f).equals("1")) {
            String I = ih3.I();
            ATBannerView aTBannerView = new ATBannerView(mactivity);
            aTBannerView.setPlacementId(I);
            m = aTBannerView;
        }
    }

    public static void h(Activity mactivity) {
        if (yg3.e(bh3.e).equals("1")) {
            String I = ih3.I();
            ATBannerView aTBannerView = new ATBannerView(mactivity);
            aTBannerView.setPlacementId(I);
            g = aTBannerView;
        }
    }

    public static void i(Activity mactivity) {
        ATNative aTNative = new ATNative(mactivity, ih3.L(), new p());
        aTNative.makeAdRequest();
        j = aTNative;
    }

    public static void j(Activity mactivity) {
        ATNative aTNative = new ATNative(mactivity, ih3.K(), new q());
        aTNative.makeAdRequest();
        k = aTNative;
    }

    public static void k(Activity mactivity) {
        ATNative aTNative = new ATNative(mactivity, ih3.K(), new d());
        aTNative.makeAdRequest();
        q = aTNative;
    }

    public static void l(Activity mactivity) {
        ATNative aTNative = new ATNative(mactivity, ih3.L(), new e());
        aTNative.makeAdRequest();
        r = aTNative;
    }

    public static void m(Activity mactivity) {
        ATNative aTNative = new ATNative(mactivity, ih3.K(), new i());
        aTNative.makeAdRequest();
        e = aTNative;
    }

    public static void n(Activity mactivity) {
        String L = ih3.L();
        ATNative aTNative = new ATNative(mactivity, L, new j(L));
        aTNative.makeAdRequest();
        f = aTNative;
    }

    public static void o(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            r(activity, viewGroup, m, nativeType, direction);
            g(activity);
        } else if (direction.equals(bh3.b1)) {
            if (h != null) {
                v(activity, viewGroup, h, nativeType, direction);
                new Handler().postDelayed(new a(), bh3.e1);
                j(activity);
            } else if (i != null) {
                v(activity, viewGroup, i, nativeType, direction);
                new Handler().postDelayed(new b(), bh3.e1);
                i(activity);
            } else {
                x(activity);
            }
        }
    }

    public static void p(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (n != null) {
            u(activity, viewGroup, n, nativeType, direction);
            new Handler().postDelayed(new f(), bh3.e1);
            l(activity);
        } else if (o != null) {
            u(activity, viewGroup, o, nativeType, direction);
            new Handler().postDelayed(new g(), bh3.e1);
            k(activity);
        } else {
            y(activity);
        }
    }

    public static void q(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            if (b != null) {
                t(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new k(), bh3.e1);
                n(activity);
            } else if (c != null) {
                t(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new l(), bh3.e1);
                m(activity);
            } else {
                z(activity);
            }
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                s(activity, viewGroup, g, nativeType, direction);
                h(activity);
            } else if (b != null) {
                w(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new m(), bh3.e1);
                n(activity);
            } else if (c != null) {
                w(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new n(), bh3.e1);
                m(activity);
            } else {
                z(activity);
            }
        }
    }

    private static void r(Activity activity, ViewGroup viewGroup, ATBannerView bannerBottom, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            viewGroup.addView(bannerBottom);
            bannerBottom.loadAd();
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void s(Activity activity, ViewGroup viewGroup, ATBannerView bannerTop, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.addView(bannerTop);
            bannerTop.loadAd();
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void t(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.Q, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeAd == null) {
                viewGroup.setVisibility(8);
                viewGroup.removeAllViews();
                return;
            }
            lg3.f(activity, viewGroup, nativeAd, nativeType, direction);
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void u(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            if (nativeType == null) {
                viewGroup.setVisibility(8);
                viewGroup.removeAllViews();
            } else if (yg3.e(bh3.E0).equals("1")) {
                lg3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                lg3.c(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                lg3.d(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void v(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
                lg3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                lg3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void w(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
            } else if (yg3.e(bh3.F0).equals("1")) {
                lg3.e(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                lg3.d(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    public static void x(Activity activity) {
        if (l.booleanValue()) {
            return;
        }
        l = Boolean.TRUE;
        new c(bh3.d1, 1000L, activity).start();
    }

    public static void y(Activity activity) {
        if (p.booleanValue()) {
            return;
        }
        p = Boolean.TRUE;
        new h(bh3.d1, 1000L, activity).start();
    }

    public static void z(Activity activity) {
        if (d.booleanValue()) {
            return;
        }
        d = Boolean.TRUE;
        new o(bh3.d1, 1000L, activity).start();
    }
}
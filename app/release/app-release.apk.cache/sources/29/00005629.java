package com.p7700g.p99005;

import android.app.Activity;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.p7700g.p99005.zg3;

/* compiled from: Admob_Native.java */
/* loaded from: classes3.dex */
public class pf3 {
    public static final String a = "Admob_Native";
    public static NativeAd b;
    public static NativeAd c;
    public static AdView d;
    public static AdManagerAdRequest e;
    public static Boolean f;
    public static NativeAd g;
    public static NativeAd h;
    public static AdView i;
    public static AdManagerAdRequest j;
    public static Boolean k;
    public static NativeAd l;
    public static NativeAd m;
    public static Boolean n;

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class a extends AdListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ AdView b;

        public a(final ViewGroup val$viewGroup, final AdView val$bannerTop) {
            this.a = val$viewGroup;
            this.b = val$bannerTop;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            this.a.removeAllViews();
            super.onAdFailedToLoad(loadAdError);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            this.a.removeAllViews();
            this.a.addView(this.b);
            super.onAdLoaded();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class b extends AdListener {
        public final /* synthetic */ String a;

        public b(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class c implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ String a;

        public c(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.g = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class d extends AdListener {
        public final /* synthetic */ String a;

        public d(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class e implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ String a;

        public e(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.h = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.g = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.h = null;
        }
    }

    /* compiled from: Admob_Native.java */
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
            pf3.c(this.a);
            pf3.k = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class i extends AdListener {
        public final /* synthetic */ ViewGroup a;
        public final /* synthetic */ AdView b;

        public i(final ViewGroup val$viewGroup, final AdView val$bannerBottom) {
            this.a = val$viewGroup;
            this.b = val$bannerBottom;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClicked() {
            super.onAdClicked();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdClosed() {
            super.onAdClosed();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(@x1 LoadAdError loadAdError) {
            super.onAdFailedToLoad(loadAdError);
            this.a.removeAllViews();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdImpression() {
            super.onAdImpression();
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdLoaded() {
            super.onAdLoaded();
            this.a.removeAllViews();
            this.a.addView(this.b);
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdOpened() {
            super.onAdOpened();
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class j extends AdListener {
        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class k extends AdListener {
        public final /* synthetic */ String a;

        public k(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class l implements NativeAd.OnNativeAdLoadedListener {
        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.l = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class m extends AdListener {
        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class n implements NativeAd.OnNativeAdLoadedListener {
        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.m = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class o implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.l = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class p implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.m = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class q extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            pf3.e(this.a);
            pf3.n = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class r implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ String a;

        public r(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.b = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class s extends AdListener {
        public final /* synthetic */ String a;

        public s(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.AdListener
        public void onAdFailedToLoad(LoadAdError adError) {
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class t implements NativeAd.OnNativeAdLoadedListener {
        public final /* synthetic */ String a;

        public t(final String val$adId) {
            this.a = val$adId;
        }

        @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
        public void onNativeAdLoaded(NativeAd mnativeAd) {
            pf3.c = mnativeAd;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class u implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.b = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class v implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.c = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class w implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.b = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class x implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            pf3.c = null;
        }
    }

    /* compiled from: Admob_Native.java */
    /* loaded from: classes3.dex */
    public class y extends CountDownTimer {
        public final /* synthetic */ Activity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(long millisInFuture, long countDownInterval, final Activity val$activity) {
            super(millisInFuture, countDownInterval);
            this.a = val$activity;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            pf3.g(this.a);
            pf3.f = Boolean.FALSE;
        }

        @Override // android.os.CountDownTimer
        public void onTick(long millisUntilFinished) {
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f = bool;
        g = null;
        h = null;
        k = bool;
        l = null;
        m = null;
        n = bool;
    }

    public static void a(Activity mactivity) {
        if (yg3.e(bh3.f).equals("1")) {
            String o2 = ih3.o();
            AdView adView = new AdView(mactivity);
            i = adView;
            adView.setAdSize(AdSize.BANNER);
            i.setAdUnitId(o2);
            j = new AdManagerAdRequest.Builder().build();
        }
    }

    public static void b(Activity mactivity) {
        if (yg3.e(bh3.e).equals("1")) {
            String o2 = ih3.o();
            AdView adView = new AdView(mactivity);
            d = adView;
            adView.setAdSize(AdSize.BANNER);
            d.setAdUnitId(o2);
            e = new AdManagerAdRequest.Builder().build();
        }
    }

    public static void c(Activity mactivity) {
        String r2 = ih3.r();
        new AdLoader.Builder(mactivity, r2).forNativeAd(new c(r2)).withAdListener(new b(r2)).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void d(Activity mactivity) {
        String q2 = ih3.q();
        new AdLoader.Builder(mactivity, q2).forNativeAd(new e(q2)).withAdListener(new d(q2)).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void e(Activity mactivity) {
        new AdLoader.Builder(mactivity, ih3.q()).forNativeAd(new l()).withAdListener(new j()).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void f(Activity mactivity) {
        new AdLoader.Builder(mactivity, ih3.r()).forNativeAd(new n()).withAdListener(new m()).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void g(Activity mactivity) {
        String q2 = ih3.q();
        new AdLoader.Builder(mactivity, q2).forNativeAd(new r(q2)).withAdListener(new k(q2)).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    public static void h(Activity mactivity) {
        String r2 = ih3.r();
        new AdLoader.Builder(mactivity, r2).forNativeAd(new t(r2)).withAdListener(new s(r2)).withNativeAdOptions(new NativeAdOptions.Builder().build()).build().loadAd(new AdManagerAdRequest.Builder().build());
    }

    private static void i(Activity activity, ViewGroup viewGroup, AdView bannerBottom, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            bannerBottom.loadAd(j);
            bannerBottom.setAdListener(new i(viewGroup, bannerBottom));
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void j(Activity activity, ViewGroup viewGroup, AdView bannerTop, String nativeType, String direction) {
        try {
            viewGroup.setVisibility(0);
            viewGroup.removeAllViews();
            View inflate = LayoutInflater.from(activity).inflate(zg3.g.R, (ViewGroup) null);
            viewGroup.addView(inflate);
            ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) inflate.findViewById(zg3.e.n0);
            shimmerFrameLayout.g();
            shimmerFrameLayout.setVisibility(0);
            bannerTop.loadAd(e);
            bannerTop.setAdListener(new a(viewGroup, bannerTop));
        } catch (Exception e2) {
            viewGroup.setVisibility(8);
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void k(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
            qf3.e(activity, viewGroup, nativeAd, nativeType, direction);
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    private static void l(Activity activity, ViewGroup viewGroup, NativeAd nativeAd, String nativeType, String direction) {
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
                qf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.a1)) {
                qf3.b(activity, viewGroup, nativeAd, nativeType, direction);
            } else if (direction.equals(bh3.b1)) {
                qf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
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
            } else if (yg3.e(bh3.G0).equals("1")) {
                qf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                qf3.b(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
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
            } else if (yg3.e(bh3.F0).equals("1")) {
                qf3.d(activity, viewGroup, nativeAd, nativeType, direction);
            } else {
                qf3.c(activity, viewGroup, nativeAd, nativeType, direction);
            }
        } catch (Exception e2) {
            e2.toString();
            e2.printStackTrace();
        }
    }

    public static void o(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (yg3.e(bh3.f).equals("1")) {
            i(activity, viewGroup, i, nativeType, direction);
            a(activity);
        } else if (direction.equals(bh3.b1)) {
            if (g != null) {
                m(activity, viewGroup, g, nativeType, direction);
                new Handler().postDelayed(new f(), bh3.e1);
                d(activity);
            } else if (h != null) {
                m(activity, viewGroup, h, nativeType, direction);
                new Handler().postDelayed(new g(), bh3.e1);
                c(activity);
            } else {
                r(activity);
            }
        }
    }

    public static void p(Activity activity, ViewGroup id, String nativeType, String direction) {
        if (l != null) {
            l(activity, id, l, nativeType, direction);
            new Handler().postDelayed(new o(), bh3.e1);
            f(activity);
        } else if (m != null) {
            l(activity, id, m, nativeType, direction);
            new Handler().postDelayed(new p(), bh3.e1);
            e(activity);
        } else {
            s(activity);
        }
    }

    public static void q(Activity activity, ViewGroup viewGroup, String nativeType, String direction) {
        if (nativeType.equals(bh3.W0)) {
            if (b != null) {
                k(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new u(), bh3.e1);
                h(activity);
            } else if (c != null) {
                k(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new v(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        } else if (direction.equals(bh3.a1)) {
            if (yg3.e(bh3.e).equals("1")) {
                j(activity, viewGroup, d, nativeType, direction);
                b(activity);
            } else if (b != null) {
                n(activity, viewGroup, b, nativeType, direction);
                new Handler().postDelayed(new w(), bh3.e1);
                h(activity);
            } else if (c != null) {
                n(activity, viewGroup, c, nativeType, direction);
                new Handler().postDelayed(new x(), bh3.e1);
                g(activity);
            } else {
                t(activity);
            }
        }
    }

    public static void r(Activity activity) {
        if (k.booleanValue()) {
            return;
        }
        k = Boolean.TRUE;
        new h(bh3.d1, 1000L, activity).start();
    }

    public static void s(Activity activity) {
        if (n.booleanValue()) {
            return;
        }
        n = Boolean.TRUE;
        new q(bh3.d1, 1000L, activity).start();
    }

    public static void t(Activity activity) {
        if (f.booleanValue()) {
            return;
        }
        f = Boolean.TRUE;
        new y(bh3.d1, 1000L, activity).start();
    }
}
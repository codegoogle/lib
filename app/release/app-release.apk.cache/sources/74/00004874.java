package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.rewardvideo.api.ATRewardVideoAd;
import com.facebook.ads.RewardedVideoAd;
import com.greedygame.core.interstitial.general.GGInterstitialAd;
import com.greedygame.core.rewarded_ad.general.GGRewardedAd;
import com.google.ads.Utils.CustomWebView;
import com.p7700g.p99005.a6;
import com.p7700g.p99005.zg3;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

/* compiled from: utils.java */
/* loaded from: classes3.dex */
public class ih3 {
    public static boolean A = true;
    public static int B = 0;
    public static boolean C = true;
    public static int D = 0;
    public static boolean E = true;
    public static int F = 0;
    public static boolean G = true;
    public static int H = 0;
    public static boolean I = true;
    public static int J = 0;
    public static boolean K = true;
    public static int L = 0;
    public static boolean M = true;
    public static int N = 0;
    public static boolean O = true;
    public static int P = 0;
    public static boolean Q = true;
    public static int R = 0;
    public static boolean S = true;
    public static int T = 0;
    public static boolean U = true;
    public static int V = 0;
    public static boolean W = true;
    public static int X = 0;
    public static boolean Y = true;
    public static int Z = 0;
    private static final String a = "Mozilla/5.0 (Linux; Android 10; Redmi Note 7 Pro) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36";
    public static boolean a0 = true;
    public static int b = 0;
    public static int b0 = 0;
    public static boolean c = true;
    public static boolean c0 = true;
    public static int d = 0;
    public static boolean e = true;
    public static int f = 0;
    public static boolean g = true;
    public static int h = 0;
    public static boolean i = true;
    public static int j = 0;
    public static boolean k = true;
    public static int l = 0;
    public static boolean m = true;
    public static int n = 0;
    public static boolean o = true;
    public static int p = 0;
    public static boolean q = true;
    public static int r = 0;
    public static boolean s = true;
    public static int t = 0;
    public static boolean u = true;
    public static int v = 0;
    public static boolean w = true;
    public static int x = 0;
    public static boolean y = true;
    public static int z;

    /* compiled from: utils.java */
    /* loaded from: classes3.dex */
    public class a implements DownloadListener {
        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setMimeType(str4);
            request.addRequestHeader("cookie", CookieManager.getInstance().getCookie(str));
            request.addRequestHeader(sm4.v, str2);
            request.setDescription("Downloading file...");
            request.setTitle(URLUtil.guessFileName(str, str3, str4));
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, URLUtil.guessFileName(str, str3, str4));
        }
    }

    /* compiled from: utils.java */
    /* loaded from: classes3.dex */
    public static class b extends WebChromeClient {
        private View a;
        private WebChromeClient.CustomViewCallback b;
        public FrameLayout c;
        private int d;
        private int e;
        private Activity f;

        public b(Activity activity) {
            this.f = activity;
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"UseRequireInsteadOfGet"})
        public Bitmap getDefaultVideoPoster() {
            if (this.a == null) {
                return null;
            }
            Activity activity = this.f;
            Objects.requireNonNull(activity);
            return BitmapFactory.decodeResource(activity.getResources(), 2130837573);
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"UseRequireInsteadOfGet"})
        public void onHideCustomView() {
            Activity activity = this.f;
            Objects.requireNonNull(activity);
            ((FrameLayout) ((hx) activity).getWindow().getDecorView()).removeView(this.a);
            this.a = null;
            this.f.getWindow().getDecorView().setSystemUiVisibility(this.e);
            this.f.setRequestedOrientation(1);
            this.d = this.f.getRequestedOrientation();
            this.b.onCustomViewHidden();
            this.b = null;
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
        }

        @Override // android.webkit.WebChromeClient
        @SuppressLint({"UseRequireInsteadOfGet"})
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (this.a != null) {
                onHideCustomView();
                return;
            }
            this.a = view;
            Activity activity = this.f;
            Objects.requireNonNull(activity);
            this.e = ((hx) activity).getWindow().getDecorView().getSystemUiVisibility();
            this.d = this.f.getRequestedOrientation();
            this.f.setRequestedOrientation(0);
            this.b = customViewCallback;
            ((FrameLayout) this.f.getWindow().getDecorView()).addView(this.a, new FrameLayout.LayoutParams(-1, -1));
            this.f.getWindow().getDecorView().setSystemUiVisibility(3846);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            try {
                this.f.startActivityForResult(fileChooserParams.createIntent(), 100);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        }
    }

    public static String A() {
        String[] split = yg3.e(bh3.q).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!w && split.length - 1 == v) {
                v = 0;
                w = true;
            }
            if (w) {
                w = false;
            } else {
                v++;
            }
        }
        return split[v];
    }

    public static String B() {
        String[] split = yg3.e(bh3.t).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!s && split.length - 1 == r) {
                r = 0;
                s = true;
            }
            if (s) {
                s = false;
            } else {
                r++;
            }
        }
        return split[r];
    }

    public static String C() {
        String[] split = yg3.e(bh3.L).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!U && split.length - 1 == T) {
                T = 0;
                U = true;
            }
            if (U) {
                U = false;
            } else {
                T++;
            }
        }
        return split[T].trim();
    }

    public static String D() {
        String[] split = yg3.e(bh3.H).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!W && split.length - 1 == V) {
                V = 0;
                W = true;
            }
            if (W) {
                W = false;
            } else {
                V++;
            }
        }
        return split[V].trim();
    }

    public static String E() {
        String[] split = yg3.e(bh3.w).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!E && split.length - 1 == D) {
                D = 0;
                E = true;
            }
            if (E) {
                E = false;
            } else {
                D++;
            }
        }
        return split[D].trim();
    }

    public static String F() {
        String[] split = yg3.e(bh3.v).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!G && split.length - 1 == F) {
                F = 0;
                G = true;
            }
            if (G) {
                G = false;
            } else {
                F++;
            }
        }
        return split[F].trim();
    }

    public static String G() {
        String[] split = yg3.e(bh3.x).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!C && split.length - 1 == B) {
                B = 0;
                C = true;
            }
            if (C) {
                C = false;
            } else {
                B++;
            }
        }
        return split[B].trim();
    }

    public static String H() {
        String[] split = yg3.e(bh3.y).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!A && split.length - 1 == z) {
                z = 0;
                A = true;
            }
            if (A) {
                A = false;
            } else {
                z++;
            }
        }
        return split[z].trim();
    }

    public static String I() {
        String[] split = yg3.e(bh3.B).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!S && split.length - 1 == R) {
                R = 0;
                S = true;
            }
            if (S) {
                S = false;
            } else {
                R++;
            }
        }
        return split[R].trim();
    }

    public static String J() {
        String[] split = yg3.e(bh3.E).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!I && split.length - 1 == H) {
                H = 0;
                I = true;
            }
            if (I) {
                I = false;
            } else {
                H++;
            }
        }
        return split[H].trim();
    }

    public static String K() {
        String[] split = yg3.e(bh3.C).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!O && split.length - 1 == N) {
                N = 0;
                O = true;
            }
            if (O) {
                O = false;
            } else {
                N++;
            }
        }
        return split[N].trim();
    }

    public static String L() {
        String[] split = yg3.e(bh3.D).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!Q && split.length - 1 == P) {
                P = 0;
                Q = true;
            }
            if (Q) {
                Q = false;
            } else {
                P++;
            }
        }
        return split[P].trim();
    }

    public static String M() {
        String[] split = yg3.e(bh3.F).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!M && split.length - 1 == L) {
                L = 0;
                M = true;
            }
            if (M) {
                M = false;
            } else {
                L++;
            }
        }
        return split[L].trim();
    }

    public static String N() {
        String[] split = yg3.e(bh3.G).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!K && split.length - 1 == J) {
                J = 0;
                K = true;
            }
            if (K) {
                K = false;
            } else {
                J++;
            }
        }
        return split[J].trim();
    }

    public static String O() {
        String[] split = yg3.e(bh3.y0).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!c0 && split.length - 1 == b0) {
                b0 = 0;
                c0 = true;
            }
            if (c0) {
                c0 = false;
            } else {
                b0++;
            }
        }
        return split[b0].trim();
    }

    public static String P() {
        try {
            if (yg3.e(bh3.w0).contains("\\|")) {
                String[] split = yg3.e(bh3.w0).split("\\|");
                return split[new Random().nextInt(split.length + 0 + 1) + 0];
            }
            return yg3.e(bh3.w0);
        } catch (Exception e2) {
            e2.printStackTrace();
            return yg3.e(bh3.w0);
        }
    }

    public static void Q(Activity activity, String url) {
        activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
    }

    public static void R(TextView ad_call_to_action) {
        if (!yg3.e(bh3.Y).equals("")) {
            StringBuilder G2 = wo1.G("");
            G2.append(yg3.e(bh3.Y));
            ad_call_to_action.setText(G2.toString());
        }
        if (yg3.e(bh3.X).equals("")) {
            return;
        }
        wo1.b0(bh3.X, ad_call_to_action);
    }

    public static void S() {
        yg3.i(bh3.d0, "");
        yg3.i(bh3.e0, "");
        yg3.i(bh3.f0, "");
        yg3.i(bh3.g0, "");
        yg3.i(bh3.h0, "");
        yg3.i(bh3.k0, "");
    }

    public static List<String> a() {
        ArrayList arrayList = new ArrayList();
        if (nf3.b != null || nf3.c != null) {
            arrayList.add(bh3.Q0);
        }
        if (eg3.b.booleanValue()) {
            arrayList.add(bh3.S0);
        }
        arrayList.add(bh3.T0);
        return arrayList;
    }

    public static List<String> b(Activity activity) {
        String[] split = yg3.e(bh3.d0).split("\\|");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.contains(bh3.Q0)) {
            if (of3.b == null && of3.c == null) {
                of3.e(activity);
            } else {
                arrayList2.add(bh3.Q0);
            }
        }
        if (arrayList.contains(bh3.R0)) {
            if (sf3.b == null && sf3.c == null) {
                sf3.e(activity);
            } else {
                arrayList2.add(bh3.R0);
            }
        }
        if (wf3.b.booleanValue()) {
            arrayList2.add(bh3.U0);
        }
        try {
            if (arrayList.contains(bh3.V0)) {
                Boolean bool = Boolean.FALSE;
                ATInterstitial aTInterstitial = jg3.b;
                if (aTInterstitial != null && aTInterstitial.isAdReady()) {
                    bool = Boolean.TRUE;
                }
                ATInterstitial aTInterstitial2 = jg3.c;
                if (aTInterstitial2 != null && aTInterstitial2.isAdReady()) {
                    bool = Boolean.TRUE;
                }
                if (bool.booleanValue()) {
                    arrayList2.add(bh3.V0);
                } else {
                    jg3.e(activity);
                }
            }
        } catch (Exception e2) {
            String str2 = "Exception " + e2;
            e2.printStackTrace();
        }
        try {
            GGInterstitialAd gGInterstitialAd = fg3.b;
            if (gGInterstitialAd != null && gGInterstitialAd.m()) {
                arrayList2.add(bh3.S0);
            }
            GGInterstitialAd gGInterstitialAd2 = fg3.c;
            if (gGInterstitialAd2 != null && gGInterstitialAd2.m()) {
                arrayList2.add(bh3.S0);
            }
        } catch (Exception e3) {
            String str3 = " SDk add Exception " + e3;
            e3.printStackTrace();
        }
        arrayList2.add(bh3.T0);
        return arrayList2;
    }

    public static List<String> c(Activity activity) {
        String[] split = yg3.e(bh3.h0).split("\\|");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.contains(bh3.Q0)) {
            if (pf3.g == null && pf3.h == null) {
                pf3.r(activity);
            } else {
                arrayList2.add(bh3.Q0);
            }
        }
        if (arrayList.contains(bh3.R0) && (tf3.g != null || tf3.h != null)) {
            arrayList2.add(bh3.R0);
        }
        if (arrayList.contains(bh3.U0) && (xf3.f != null || xf3.g != null)) {
            arrayList2.add(bh3.U0);
        }
        if (arrayList.contains(bh3.V0) && (kg3.h != null || kg3.i != null)) {
            arrayList2.add(bh3.V0);
        }
        if (arrayList.contains(bh3.S0)) {
            arrayList2.add(bh3.S0);
        }
        if (arrayList.contains(bh3.T0)) {
            arrayList2.add(bh3.T0);
        }
        return arrayList2;
    }

    public static List<String> d(Activity activity) {
        if (yg3.e(bh3.k0).equals("")) {
            return new ArrayList();
        }
        String[] split = yg3.e(bh3.k0).split("\\|");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.contains(bh3.Q0)) {
            if (pf3.l == null && pf3.m == null) {
                pf3.s(activity);
            } else {
                arrayList2.add(bh3.Q0);
            }
        }
        if (arrayList.contains(bh3.R0)) {
            if (tf3.l == null && tf3.m == null) {
                tf3.s(activity);
            } else {
                arrayList2.add(bh3.R0);
            }
        }
        if (arrayList.contains(bh3.U0)) {
            if (xf3.j == null && xf3.k == null) {
                xf3.s(activity);
            } else {
                arrayList2.add(bh3.U0);
            }
        }
        if (arrayList.contains(bh3.V0)) {
            if (kg3.n == null && kg3.o == null) {
                kg3.y(activity);
            } else {
                arrayList2.add(bh3.V0);
            }
        }
        if (arrayList.contains(bh3.S0)) {
            arrayList2.add(bh3.S0);
        }
        if (arrayList.contains(bh3.T0)) {
            arrayList2.add(bh3.T0);
        }
        return arrayList2;
    }

    public static List<String> e(Activity activity) {
        String[] split = yg3.e(bh3.g0).split("\\|");
        ArrayList arrayList = new ArrayList();
        for (String str : split) {
            arrayList.add(str);
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList.contains(bh3.Q0)) {
            if (pf3.b == null && pf3.c == null) {
                pf3.t(activity);
            } else {
                arrayList2.add(bh3.Q0);
            }
        }
        if (arrayList.contains(bh3.R0)) {
            if (tf3.b == null && tf3.c == null) {
                tf3.t(activity);
            } else {
                arrayList2.add(bh3.R0);
            }
        }
        if (arrayList.contains(bh3.U0)) {
            if (xf3.b == null && xf3.c == null) {
                xf3.t(activity);
            } else {
                arrayList2.add(bh3.U0);
            }
        }
        if (arrayList.contains(bh3.V0)) {
            if (kg3.b == null && kg3.c == null) {
                kg3.z(activity);
            } else {
                arrayList2.add(bh3.V0);
            }
        }
        if (arrayList.contains(bh3.S0)) {
            arrayList2.add(bh3.S0);
        }
        if (arrayList.contains(bh3.T0)) {
            arrayList2.add(bh3.T0);
        }
        return arrayList2;
    }

    public static List<String> f() {
        ArrayList arrayList = new ArrayList();
        if (rf3.b != null) {
            arrayList.add(bh3.Q0);
        }
        RewardedVideoAd rewardedVideoAd = vf3.b;
        if (rewardedVideoAd != null && rewardedVideoAd.isAdLoaded()) {
            arrayList.add(bh3.R0);
        }
        if (zf3.b.booleanValue()) {
            arrayList.add(bh3.U0);
        }
        GGRewardedAd gGRewardedAd = ig3.b;
        if (gGRewardedAd != null && gGRewardedAd.k()) {
            arrayList.add(bh3.S0);
        }
        ATRewardVideoAd aTRewardVideoAd = mg3.b;
        if (aTRewardVideoAd != null && aTRewardVideoAd.isAdReady()) {
            arrayList.add(bh3.V0);
        }
        arrayList.add(bh3.T0);
        return arrayList;
    }

    public static void g(final Context context, String url) {
        try {
            a6.a aVar = new a6.a();
            if (Build.VERSION.SDK_INT >= 23) {
                aVar.y(context.getColor(zg3.b.j));
            }
            a6 d2 = aVar.d();
            d2.P.setPackage("com.android.chrome");
            d2.c(context, Uri.parse(url));
        } catch (Exception e2) {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
            e2.printStackTrace();
        }
    }

    public static void h(Activity activity, CustomWebView webView) {
        j(activity);
        m();
        CookieSyncManager.createInstance(activity);
        CookieManager.getInstance().removeAllCookie();
        WebStorage.getInstance().deleteAllData();
        webView.getSettings().setSaveFormData(false);
        activity.deleteDatabase("webview.db");
        activity.deleteDatabase("webviewCache.db");
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().flush();
        webView.clearCache(true);
        webView.clearFormData();
        webView.clearHistory();
        webView.clearSslPreferences();
        CookieManager.getInstance().removeAllCookie();
        CookieManager.getInstance().setAcceptCookie(true);
        WebSettings settings = webView.getSettings();
        settings.setGeolocationEnabled(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setGeolocationEnabled(true);
        settings.setDatabaseEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setUserAgentString(a);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowContentAccess(true);
        settings.setAllowFileAccess(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setCacheMode(1);
        webView.setScrollBarStyle(0);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
        settings.setUseWideViewPort(true);
        settings.setSavePassword(true);
        settings.setSaveFormData(true);
        settings.setEnableSmoothTransition(true);
    }

    public static void i(WebView webView) {
        webView.clearCache(true);
        webView.clearHistory();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportMultipleWindows(true);
        webView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    }

    public static void j(Context context) {
        try {
            k(context.getCacheDir());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static boolean k(File dir) {
        if (dir != null && dir.isDirectory()) {
            for (String str : dir.list()) {
                if (!k(new File(dir, str))) {
                    return false;
                }
            }
            return dir.delete();
        } else if (dir == null || !dir.isFile()) {
            return false;
        } else {
            return dir.delete();
        }
    }

    public static void l(Activity activity, CustomWebView webView) {
        webView.setDownloadListener(new a());
    }

    public static void m() {
        System.runFinalization();
        Runtime.getRuntime().gc();
        System.gc();
    }

    public static GradientDrawable.Orientation n(String direction) {
        direction.hashCode();
        char c2 = 65535;
        switch (direction.hashCode()) {
            case -1196165855:
                if (direction.equals("BOTTOM_TOP")) {
                    c2 = 0;
                    break;
                }
                break;
            case -873241494:
                if (direction.equals("RIGHT_LEFT")) {
                    c2 = 1;
                    break;
                }
                break;
            case -434150460:
                if (direction.equals("LEFT_RIGHT")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1982197877:
                if (direction.equals("TOP_BOTTOM")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                return GradientDrawable.Orientation.BOTTOM_TOP;
            case 1:
                return GradientDrawable.Orientation.RIGHT_LEFT;
            case 2:
                return GradientDrawable.Orientation.LEFT_RIGHT;
            case 3:
                return GradientDrawable.Orientation.TOP_BOTTOM;
            default:
                return GradientDrawable.Orientation.RIGHT_LEFT;
        }
    }

    public static String o() {
        String[] split = yg3.e(bh3.n).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!o && split.length - 1 == n) {
                n = 0;
                o = true;
            }
            if (o) {
                o = false;
            } else {
                n++;
            }
        }
        return split[n];
    }

    public static String p() {
        String[] split = yg3.e(bh3.k).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!i && split.length - 1 == h) {
                h = 0;
                i = true;
            }
            if (i) {
                i = false;
            } else {
                h++;
            }
        }
        return split[h];
    }

    public static String q() {
        String[] split = yg3.e(bh3.l).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!e && split.length - 1 == d) {
                d = 0;
                e = true;
            }
            if (e) {
                e = false;
            } else {
                d++;
            }
        }
        return split[d];
    }

    public static String r() {
        String[] split = yg3.e(bh3.m).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!g && split.length - 1 == f) {
                f = 0;
                g = true;
            }
            if (g) {
                g = false;
            } else {
                f++;
            }
        }
        return split[f];
    }

    public static String s() {
        String[] split = yg3.e(bh3.i).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!k && split.length - 1 == j) {
                j = 0;
                k = true;
            }
            if (k) {
                k = false;
            } else {
                j++;
            }
        }
        return split[j];
    }

    public static String t() {
        String[] split = yg3.e(bh3.j).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!m && split.length - 1 == l) {
                l = 0;
                m = true;
            }
            if (m) {
                m = false;
            } else {
                l++;
            }
        }
        return split[l];
    }

    public static Integer u() {
        if (yg3.e(bh3.d).equals("")) {
            return 0;
        }
        String[] split = yg3.e(bh3.d).split("\\|");
        if (split.length == 0) {
            return 0;
        }
        if (split.length != 0) {
            if (!c && split.length - 1 == b) {
                b = 0;
                c = true;
            }
            if (c) {
                c = false;
            } else {
                b++;
            }
        }
        return Integer.valueOf(split[b]);
    }

    public static String v() {
        String[] split = yg3.e(bh3.m0).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!a0 && split.length - 1 == Z) {
                Z = 0;
                a0 = true;
            }
            if (a0) {
                a0 = false;
            } else {
                Z++;
            }
        }
        return split[Z].trim();
    }

    public static String w() {
        if (yg3.e(bh3.g).equals("")) {
            return "";
        }
        String[] split = yg3.e(bh3.g).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!Y && split.length - 1 == X) {
                X = 0;
                Y = true;
            }
            if (Y) {
                Y = false;
            } else {
                X++;
            }
        }
        return split[X].trim();
    }

    public static String x() {
        String[] split = yg3.e(bh3.o).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!y && split.length - 1 == x) {
                x = 0;
                y = true;
            }
            if (y) {
                y = false;
            } else {
                x++;
            }
        }
        return split[x];
    }

    public static String y() {
        String[] split = yg3.e(bh3.r).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!q && split.length - 1 == p) {
                p = 0;
                q = true;
            }
            if (q) {
                q = false;
            } else {
                p++;
            }
        }
        return split[p];
    }

    public static String z() {
        String[] split = yg3.e(bh3.p).split("\\|");
        if (split.length != 0 && split.length != 0) {
            if (!u && split.length - 1 == t) {
                t = 0;
                u = true;
            }
            if (u) {
                u = false;
            } else {
                t++;
            }
        }
        return split[t];
    }
}
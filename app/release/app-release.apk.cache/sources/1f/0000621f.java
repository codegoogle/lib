package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.onesignal.OSUtils;
import com.p7700g.p99005.bj3;
import com.p7700g.p99005.fi3;
import com.p7700g.p99005.jm3;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewManager.java */
@TargetApi(19)
/* loaded from: classes3.dex */
public class vn3 extends fi3.b {
    private static final String a = "com.p7700g.p99005.vn3";
    private static final int c = 200;
    @z1
    private hm3 f;
    @z1
    private bj3 g;
    @x1
    private Activity h;
    @x1
    private gk3 i;
    @x1
    private bk3 j;
    private static final int b = gm3.b(24);
    @z1
    public static vn3 d = null;
    private final Object e = new b();
    @z1
    private String k = null;
    private Integer l = null;
    private boolean m = false;
    private boolean n = false;

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            m.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class b {
        public b() {
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class c implements l {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ gk3 b;
        public final /* synthetic */ bk3 c;

        public c(Activity activity, gk3 gk3Var, bk3 bk3Var) {
            this.a = activity;
            this.b = gk3Var;
            this.c = bk3Var;
        }

        @Override // com.p7700g.p99005.vn3.l
        public void onComplete() {
            vn3.d = null;
            vn3.C(this.a, this.b, this.c);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ gk3 s;
        public final /* synthetic */ bk3 t;

        public d(gk3 gk3Var, bk3 bk3Var) {
            this.s = gk3Var;
            this.t = bk3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            vn3.J(this.s, this.t);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ Activity t;
        public final /* synthetic */ String u;
        public final /* synthetic */ bk3 v;

        public e(Activity activity, String str, bk3 bk3Var) {
            this.t = activity;
            this.u = str;
            this.v = bk3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                vn3.this.I(this.t, this.u, this.v.g());
            } catch (Exception e) {
                if (e.getMessage() != null && e.getMessage().contains("No WebView installed")) {
                    jm3.b(jm3.u0.ERROR, "Error setting up WebView: ", e);
                    return;
                }
                throw e;
            }
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] c = gm3.c(vn3.this.h);
            vn3.this.f.evaluateJavascript(String.format(k.c, String.format(k.d, Integer.valueOf(c[0]), Integer.valueOf(c[1]), Integer.valueOf(c[2]), Integer.valueOf(c[3]))), null);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* compiled from: WebViewManager.java */
        /* loaded from: classes3.dex */
        public class a implements ValueCallback<String> {
            public a() {
            }

            @Override // android.webkit.ValueCallback
            /* renamed from: a */
            public void onReceiveValue(String str) {
                try {
                    vn3 vn3Var = vn3.this;
                    vn3.this.K(Integer.valueOf(vn3Var.D(vn3Var.h, new JSONObject(str))));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            vn3 vn3Var = vn3.this;
            vn3Var.H(vn3Var.h);
            if (vn3.this.j.g()) {
                vn3.this.L();
            }
            vn3.this.f.evaluateJavascript(k.b, new a());
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public final /* synthetic */ Activity s;
        public final /* synthetic */ String t;

        public h(Activity activity, String str) {
            this.s = activity;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            vn3.this.H(this.s);
            vn3.this.f.loadData(this.t, "text/html; charset=utf-8", "base64");
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class i implements bj3.j {
        public i() {
        }

        @Override // com.p7700g.p99005.bj3.j
        public void a() {
            jm3.u0().g0(vn3.this.i);
            vn3.this.E();
        }

        @Override // com.p7700g.p99005.bj3.j
        public void b() {
            jm3.u0().m0(vn3.this.i);
        }

        @Override // com.p7700g.p99005.bj3.j
        public void c() {
            jm3.u0().n0(vn3.this.i);
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class j implements l {
        public final /* synthetic */ l a;

        public j(l lVar) {
            this.a = lVar;
        }

        @Override // com.p7700g.p99005.vn3.l
        public void onComplete() {
            vn3.this.m = false;
            vn3.this.G(null);
            l lVar = this.a;
            if (lVar != null) {
                lVar.onComplete();
            }
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public class k {
        public static final String a = "OSAndroid";
        public static final String b = "getPageMetaData()";
        public static final String c = "setSafeAreaInsets(%s)";
        public static final String d = "{\n   top: %d,\n   bottom: %d,\n   right: %d,\n   left: %d,\n}";
        public static final String e = "\n\n<script>\n    setSafeAreaInsets(%s);\n</script>";
        public static final String f = "type";
        public static final String g = "rendering_complete";
        public static final String h = "resize";
        public static final String i = "action_taken";
        public static final String j = "page_change";
        public static final String k = "displayLocation";
        public static final String l = "pageMetaData";
        public static final String m = "dragToDismissDisabled";

        public k() {
        }

        @x1
        private m a(JSONObject jSONObject) {
            m mVar = m.FULL_SCREEN;
            try {
                return (!jSONObject.has(k) || jSONObject.get(k).equals("")) ? mVar : m.valueOf(jSONObject.optString(k, "FULL_SCREEN").toUpperCase());
            } catch (JSONException e2) {
                e2.printStackTrace();
                return mVar;
            }
        }

        private boolean b(JSONObject jSONObject) {
            try {
                return jSONObject.getBoolean(m);
            } catch (JSONException unused) {
                return false;
            }
        }

        private int c(JSONObject jSONObject) {
            try {
                vn3 vn3Var = vn3.this;
                return vn3Var.D(vn3Var.h, jSONObject.getJSONObject(l));
            } catch (JSONException unused) {
                return -1;
            }
        }

        private void d(JSONObject jSONObject) throws JSONException {
            JSONObject jSONObject2 = jSONObject.getJSONObject("body");
            String optString = jSONObject2.optString("id", null);
            vn3.this.n = jSONObject2.getBoolean(com.anythink.expressad.foundation.d.c.cd);
            if (vn3.this.i.t) {
                jm3.u0().j0(vn3.this.i, jSONObject2);
            } else if (optString != null) {
                jm3.u0().i0(vn3.this.i, jSONObject2);
            }
            if (vn3.this.n) {
                vn3.this.x(null);
            }
        }

        private void e(JSONObject jSONObject) throws JSONException {
            jm3.u0().p0(vn3.this.i, jSONObject);
        }

        private void f(JSONObject jSONObject) {
            m a2 = a(jSONObject);
            int c2 = a2 == m.FULL_SCREEN ? -1 : c(jSONObject);
            boolean b2 = b(jSONObject);
            vn3.this.j.j(a2);
            vn3.this.j.l(c2);
            vn3.this.w(b2);
        }

        @JavascriptInterface
        public void postMessage(String str) {
            try {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                jm3.P1(u0Var, "OSJavaScriptInterface:postMessage: " + str);
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("type");
                char c2 = 65535;
                switch (string.hashCode()) {
                    case -1484226720:
                        if (string.equals(j)) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case -934437708:
                        if (string.equals(h)) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 42998156:
                        if (string.equals(g)) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 1851145598:
                        if (string.equals(i)) {
                            c2 = 1;
                            break;
                        }
                        break;
                }
                if (c2 == 0) {
                    f(jSONObject);
                } else if (c2 != 1) {
                    if (c2 != 3) {
                        return;
                    }
                    e(jSONObject);
                } else if (vn3.this.g.O()) {
                } else {
                    d(jSONObject);
                }
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public interface l {
        void onComplete();
    }

    /* compiled from: WebViewManager.java */
    /* loaded from: classes3.dex */
    public enum m {
        TOP_BANNER,
        BOTTOM_BANNER,
        CENTER_MODAL,
        FULL_SCREEN;

        public boolean f() {
            int ordinal = ordinal();
            return ordinal == 0 || ordinal == 1;
        }
    }

    public vn3(@x1 gk3 gk3Var, @x1 Activity activity, @x1 bk3 bk3Var) {
        this.i = gk3Var;
        this.h = activity;
        this.j = bk3Var;
    }

    private int A(Activity activity) {
        if (this.j.g()) {
            return gm3.e(activity);
        }
        return gm3.j(activity) - (b * 2);
    }

    private int B(Activity activity) {
        return gm3.f(activity) - (this.j.g() ? 0 : b * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void C(@x1 Activity activity, @x1 gk3 gk3Var, @x1 bk3 bk3Var) {
        if (bk3Var.g()) {
            F(bk3Var, activity);
        }
        try {
            String encodeToString = Base64.encodeToString(bk3Var.a().getBytes("UTF-8"), 2);
            vn3 vn3Var = new vn3(gk3Var, activity, bk3Var);
            d = vn3Var;
            OSUtils.V(new e(activity, encodeToString, bk3Var));
        } catch (UnsupportedEncodingException e2) {
            jm3.b(jm3.u0.ERROR, "Catch on initInAppMessage: ", e2);
            e2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int D(@x1 Activity activity, @x1 JSONObject jSONObject) {
        try {
            int b2 = gm3.b(jSONObject.getJSONObject("rect").getInt("height"));
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, "getPageHeightData:pxHeight: " + b2);
            int B = B(activity);
            if (b2 > B) {
                jm3.a(u0Var, "getPageHeightData:pxHeight is over screen max: " + B);
                return B;
            }
            return b2;
        } catch (JSONException e2) {
            jm3.b(jm3.u0.ERROR, "pageRectToViewHeight could not get page height", e2);
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        fi3 b2 = gi3.b();
        if (b2 != null) {
            b2.q(a + this.i.b);
        }
    }

    private static void F(bk3 bk3Var, @x1 Activity activity) {
        String a2 = bk3Var.a();
        int[] c2 = gm3.c(activity);
        String format = String.format(k.e, String.format(k.d, Integer.valueOf(c2[0]), Integer.valueOf(c2[1]), Integer.valueOf(c2[2]), Integer.valueOf(c2[3])));
        bk3Var.h(a2 + format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(bj3 bj3Var) {
        synchronized (this.e) {
            this.g = bj3Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(Activity activity) {
        this.f.layout(0, 0, A(activity), B(activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    public void I(@x1 Activity activity, @x1 String str, boolean z) {
        z();
        hm3 hm3Var = new hm3(activity);
        this.f = hm3Var;
        hm3Var.setOverScrollMode(2);
        this.f.setVerticalScrollBarEnabled(false);
        this.f.setHorizontalScrollBarEnabled(false);
        this.f.getSettings().setJavaScriptEnabled(true);
        this.f.addJavascriptInterface(new k(), k.a);
        if (z) {
            this.f.setSystemUiVisibility(3074);
            if (Build.VERSION.SDK_INT >= 30) {
                this.f.setFitsSystemWindows(false);
            }
        }
        u(this.f);
        gm3.a(activity, new h(activity, str));
    }

    public static void J(@x1 gk3 gk3Var, @x1 bk3 bk3Var) {
        Activity f0 = jm3.f0();
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "in app message showMessageContent on currentActivity: " + f0);
        if (f0 != null) {
            vn3 vn3Var = d;
            if (vn3Var != null && gk3Var.t) {
                vn3Var.x(new c(f0, gk3Var, bk3Var));
                return;
            } else {
                C(f0, gk3Var, bk3Var);
                return;
            }
        }
        Looper.prepare();
        new Handler().postDelayed(new d(gk3Var, bk3Var), 200L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(@z1 Integer num) {
        synchronized (this.e) {
            if (this.g == null) {
                jm3.a(jm3.u0.WARN, "No messageView found to update a with a new height.");
                return;
            }
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "In app message, showing first one with height: " + num);
            this.g.U(this.f);
            if (num != null) {
                this.l = num;
                this.g.Z(num.intValue());
            }
            this.g.X(this.h);
            this.g.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        OSUtils.V(new f());
    }

    private void u(@x1 WebView webView) {
    }

    private void v() {
        bj3 bj3Var = this.g;
        if (bj3Var == null) {
            return;
        }
        if (bj3Var.M() == m.FULL_SCREEN && !this.j.g()) {
            K(null);
            return;
        }
        jm3.a(jm3.u0.DEBUG, "In app message new activity, calculate height and show ");
        gm3.a(this.h, new g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(boolean z) {
        this.l = Integer.valueOf(this.j.d());
        G(new bj3(this.f, this.j, z));
        this.g.R(new i());
        fi3 b2 = gi3.b();
        if (b2 != null) {
            b2.b(a + this.i.b, this);
        }
    }

    public static void y() {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("WebViewManager IAM dismissAndAwaitNextMessage lastInstance: ");
        G.append(d);
        jm3.P1(u0Var, G.toString());
        vn3 vn3Var = d;
        if (vn3Var != null) {
            vn3Var.x(null);
        }
    }

    private static void z() {
        if (jm3.H(jm3.u0.DEBUG)) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    @Override // com.p7700g.p99005.fi3.b
    public void a(@x1 Activity activity) {
        String str = this.k;
        this.h = activity;
        this.k = activity.getLocalClassName();
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("In app message activity available currentActivityName: ");
        G.append(this.k);
        G.append(" lastActivityName: ");
        G.append(str);
        jm3.a(u0Var, G.toString());
        if (str == null) {
            K(null);
        } else if (!str.equals(this.k)) {
            if (this.n) {
                return;
            }
            bj3 bj3Var = this.g;
            if (bj3Var != null) {
                bj3Var.P();
            }
            K(this.l);
        } else {
            v();
        }
    }

    @Override // com.p7700g.p99005.fi3.b
    public void c(@x1 Activity activity) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        StringBuilder G = wo1.G("In app message activity stopped, cleaning views, currentActivityName: ");
        G.append(this.k);
        G.append("\nactivity: ");
        G.append(this.h);
        G.append("\nmessageView: ");
        G.append(this.g);
        jm3.a(u0Var, G.toString());
        if (this.g == null || !activity.getLocalClassName().equals(this.k)) {
            return;
        }
        this.g.P();
    }

    public void x(@z1 l lVar) {
        bj3 bj3Var = this.g;
        if (bj3Var == null || this.m) {
            if (lVar != null) {
                lVar.onComplete();
                return;
            }
            return;
        }
        if (this.i != null && bj3Var != null) {
            jm3.u0().n0(this.i);
        }
        this.g.K(new j(lVar));
        this.m = true;
    }
}
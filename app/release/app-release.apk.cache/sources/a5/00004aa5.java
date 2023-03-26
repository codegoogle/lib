package com.p7700g.p99005;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.onesignal.OSEmailSubscriptionChangedInternalObserver;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.onesignal.OSPermissionChangedInternalObserver;
import com.onesignal.OSSMSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionChangedInternalObserver;
import com.onesignal.OSSubscriptionState;
import com.onesignal.OSUtils;
import com.p7700g.p99005.an3;
import com.p7700g.p99005.bn3;
import com.p7700g.p99005.ej3;
import com.p7700g.p99005.en3;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rl3;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.wk3;
import com.p7700g.p99005.wm3;
import com.p7700g.p99005.xm3;
import com.p7700g.p99005.yk3;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.ref.WeakReference;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignal.java */
/* loaded from: classes3.dex */
public class jm3 {
    private static kn3 A = null;
    private static final String B = "040805";
    private static si3 D = null;
    private static sl3 L = null;
    private static co3 M = null;
    private static rl3 N = null;
    @z1
    private static il3 O = null;
    @z1
    private static po3 P = null;
    @z1
    private static yk3 Q = null;
    private static final Object R;
    public static String S = null;
    private static String T = null;
    @x1
    private static OSUtils U = null;
    private static boolean V = false;
    private static boolean W = false;
    private static boolean X = false;
    private static boolean Y = false;
    private static boolean Z = false;
    public static final long a = 30000;
    private static ej3.d a0;
    private static f1 b;
    private static Collection<JSONArray> b0;
    private static f1 c;
    private static HashSet<String> c0;
    private static p0 d;
    private static final ArrayList<w0> d0;
    private static p0 e;
    private static qi3 e0;
    private static kl3 f0;
    public static Context g;
    public static kl3 g0;
    public static WeakReference<Activity> h;
    private static gl3<jl3, ll3> h0;
    public static String i;
    private static OSSubscriptionState i0;
    public static String j;
    public static OSSubscriptionState j0;
    private static gl3<ul3, vl3> k0;
    private static wj3 l0;
    public static wj3 m0;
    private static gl3<vj3, xj3> n0;
    private static pl3 o0;
    public static pl3 p0;
    private static gl3<ol3, ql3> q0;
    public static d1 r;
    private static t0 r0;
    public static b1 s;
    private static bn3 s0;
    public static a1 t;
    public static x0 u;
    private static boolean v;
    private static boolean w;
    private static ln3 y;
    private static jn3 z;
    private static List<q0> f = new ArrayList();
    private static u0 k = u0.NONE;
    private static u0 l = u0.WARN;
    private static String m = null;
    private static String n = null;
    private static String o = null;
    private static int p = Integer.MAX_VALUE;
    public static go3 q = null;
    @x1
    private static l0 x = l0.APP_CLOSE;
    private static tk3 C = new sk3();
    private static rl3.b E = new k();
    private static ek3 F = new ek3();
    private static bm3 G = new cm3();
    private static nl3 H = new nl3();
    private static yl3 I = new yl3(C);
    private static zl3 J = new zl3(H, C);
    private static km3 K = new ym3();

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                jm3.f2();
            } catch (JSONException e) {
                jm3.b(u0.FATAL, "FATAL Error registering device!", e);
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class a0 implements Runnable {
        public final /* synthetic */ boolean s;

        public a0(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running pauseInAppMessages() operation from pending queue.");
            jm3.R1(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface a1 {
        void a(el3 el3Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;
        public final /* synthetic */ f1 u;

        public b(String str, String str2, f1 f1Var) {
            this.s = str;
            this.t = str2;
            this.u = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setSMSNumber() operation from a pending task queue.");
            jm3.k3(this.s, this.t, this.u);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class b0 implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ h1 t;

        public b0(String str, h1 h1Var) {
            this.s = str;
            this.t = h1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running sendOutcome() operation from pending queue.");
            jm3.B2(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface b1 {
        void a(fl3 fl3Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public final /* synthetic */ f1 s;

        public c(f1 f1Var) {
            this.s = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running  logoutSMSNumber() operation from pending task queue.");
            jm3.G1(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class c0 implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ h1 t;

        public c0(String str, h1 h1Var) {
            this.s = str;
            this.t = h1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running sendUniqueOutcome() operation from pending queue.");
            jm3.K2(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface c1 {
        void a(j1 j1Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;
        public final /* synthetic */ p0 u;

        public d(String str, String str2, p0 p0Var) {
            this.s = str;
            this.t = str2;
            this.u = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setEmail() operation from a pending task queue.");
            jm3.P2(this.s, this.t, this.u);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class d0 implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ float t;
        public final /* synthetic */ h1 u;

        public d0(String str, float f, h1 h1Var) {
            this.s = str;
            this.t = f;
            this.u = h1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running sendOutcomeWithValue() operation from pending queue.");
            jm3.D2(this.s, this.t, this.u);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface d1 {
        void a(Context context, fl3 fl3Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ p0 s;

        public e(p0 p0Var) {
            this.s = p0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running  logoutEmail() operation from pending task queue.");
            jm3.E1(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class e0 implements Runnable {
        public final /* synthetic */ boolean s;

        public e0(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running unsubscribeWhenNotificationsAreDisabled() operation from pending task queue.");
            jm3.y3(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class e1 {
        private l1 a;
        private String b;

        public e1(l1 l1Var, String str) {
            this.a = l1Var;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public l1 b() {
            return this.a;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ g1 t;

        public f(String str, g1 g1Var) {
            this.s = str;
            this.t = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setLanguage() operation from pending task queue.");
            jm3.Y2(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class f0 implements Runnable {
        public final /* synthetic */ hk3 s;

        public f0(hk3 hk3Var) {
            this.s = hk3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setInAppMessageLifecycleHandler() operation from pending queue.");
            jm3.V2(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface f1 {
        void a(JSONObject jSONObject);

        void b(e1 e1Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class g implements an3.b {
        public final /* synthetic */ g1 a;

        public g(g1 g1Var) {
            this.a = g1Var;
        }

        @Override // com.p7700g.p99005.an3.b
        public void a(an3.c cVar) {
            this.a.a(new z0(cVar.a, cVar.b));
        }

        @Override // com.p7700g.p99005.an3.b
        public void onSuccess(String str) {
            this.a.onSuccess(str);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class g0 implements ej3.b {
        @Override // com.p7700g.p99005.ej3.b
        public void a(ej3.d dVar) {
            ej3.d unused = jm3.a0 = dVar;
            boolean unused2 = jm3.W = true;
            jm3.e2();
        }

        @Override // com.p7700g.p99005.ej3.b
        public ej3.f getType() {
            return ej3.f.STARTUP;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface g1 {
        void a(z0 z0Var);

        void onSuccess(String str);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;
        public final /* synthetic */ v0 u;

        public h(String str, String str2, v0 v0Var) {
            this.s = str;
            this.t = str2;
            this.u = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setExternalUserId() operation from pending task queue.");
            jm3.T2(this.s, this.t, this.u);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class h0 implements bn3.a {
        @Override // com.p7700g.p99005.bn3.a
        public void a(String str, int i) {
            tk3 tk3Var = jm3.C;
            tk3Var.b("registerForPushToken completed with id: " + str + " status: " + i);
            if (i >= 1) {
                if (jm3.a2(jm3.p)) {
                    int unused = jm3.p = i;
                }
            } else if (an3.f() == null && (jm3.p == 1 || jm3.a2(jm3.p))) {
                int unused2 = jm3.p = i;
            }
            String unused3 = jm3.T = str;
            boolean unused4 = jm3.V = true;
            jm3.j0(jm3.g).n(str);
            jm3.e2();
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface h1 {
        void a(@z1 hl3 hl3Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class i implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ String t;

        public i(String str, String str2) {
            this.s = str;
            this.t = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running sendTag() operation from pending task queue.");
            jm3.F2(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class i0 implements wm3.c {
        public final /* synthetic */ boolean a;

        public i0(boolean z) {
            this.a = z;
        }

        @Override // com.p7700g.p99005.wm3.c
        public void a(wm3.f fVar) {
            boolean unused = jm3.Z = false;
            String str = fVar.a;
            if (str != null) {
                jm3.j = str;
            }
            jm3.H.t(fVar, jm3.M, jm3.L, jm3.C);
            jm3.O1();
            jj3.f(jm3.g, fVar.f);
            if (this.a) {
                jm3.d2();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface i1 {
        void a(JSONObject jSONObject);

        void b(JSONObject jSONObject);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class j implements Runnable {
        public final /* synthetic */ JSONObject s;
        public final /* synthetic */ m0 t;

        public j(JSONObject jSONObject, m0 m0Var) {
            this.s = jSONObject;
            this.t = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running sendTags() operation from pending task queue.");
            jm3.I2(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class j0 implements Runnable {
        public final /* synthetic */ u0 s;
        public final /* synthetic */ String t;

        public j0(u0 u0Var, String str) {
            this.s = u0Var;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (jm3.f0() != null) {
                new AlertDialog.Builder(jm3.f0()).setTitle(this.s.toString()).setMessage(this.t).show();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum j1 {
        PERMISSION_GRANTED,
        PERMISSION_DENIED,
        LOCATION_PERMISSIONS_MISSING_MANIFEST,
        ERROR
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class k implements rl3.b {
        @Override // com.p7700g.p99005.rl3.b
        public void a(@x1 List<do3> list) {
            if (jm3.O == null) {
                jm3.a(u0.WARN, "OneSignal onSessionEnding called before init!");
            }
            if (jm3.O != null) {
                jm3.O.e();
            }
            jm3.t0().g(list);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class k0 implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running onAppLostFocus() operation from a pending task queue.");
            jm3.I();
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface k1 {
        void a(boolean z);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        public final /* synthetic */ JSONObject s;
        public final /* synthetic */ m0 t;

        public l(JSONObject jSONObject, m0 m0Var) {
            this.s = jSONObject;
            this.t = m0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object opt;
            if (this.s == null) {
                jm3.C.d("Attempted to send null tags");
                m0 m0Var = this.t;
                if (m0Var != null) {
                    m0Var.b(new m1(-1, "Attempted to send null tags"));
                    return;
                }
                return;
            }
            JSONObject jSONObject = an3.j(false).b;
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> keys = this.s.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    opt = this.s.opt(next);
                } catch (Throwable unused) {
                }
                if (!(opt instanceof JSONArray) && !(opt instanceof JSONObject)) {
                    if (!this.s.isNull(next) && !"".equals(opt)) {
                        jSONObject2.put(next, opt.toString());
                    }
                    if (jSONObject != null && jSONObject.has(next)) {
                        jSONObject2.put(next, "");
                    }
                }
                u0 u0Var = u0.ERROR;
                jm3.a(u0Var, "Omitting key '" + next + "'! sendTags DO NOT supported nested values!");
            }
            if (!jSONObject2.toString().equals("{}")) {
                tk3 tk3Var = jm3.C;
                StringBuilder G = wo1.G("Available tags to send: ");
                G.append(jSONObject2.toString());
                tk3Var.b(G.toString());
                an3.u(jSONObject2, this.t);
                return;
            }
            jm3.C.b("Send tags ended successfully");
            m0 m0Var2 = this.t;
            if (m0Var2 != null) {
                m0Var2.a(jSONObject);
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum l0 {
        NOTIFICATION_CLICK,
        APP_OPEN,
        APP_CLOSE;

        public boolean f() {
            return equals(APP_CLOSE);
        }

        public boolean g() {
            return equals(APP_OPEN);
        }

        public boolean h() {
            return equals(NOTIFICATION_CLICK);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum l1 {
        VALIDATION,
        REQUIRES_SMS_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class m extends xm3.g {
        public final /* synthetic */ i1 a;

        public m(i1 i1Var) {
            this.a = i1Var;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            jm3.C1("create notification failed", i, th, str);
            i1 i1Var = this.a;
            if (i1Var != null) {
                if (i == 0) {
                    str = "{\"error\": \"HTTP no response error\"}";
                }
                try {
                    try {
                        i1Var.b(new JSONObject(str));
                    } catch (Throwable unused) {
                        this.a.b(new JSONObject("{\"error\": \"Unknown response!\"}"));
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            tk3 tk3Var = jm3.C;
            StringBuilder G = wo1.G("HTTP create notification success: ");
            G.append(str != null ? str : pg1.d);
            tk3Var.b(G.toString());
            if (this.a != null) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("errors")) {
                        this.a.b(jSONObject);
                    } else {
                        this.a.a(new JSONObject(str));
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface m0 {
        void a(JSONObject jSONObject);

        void b(m1 m1Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class m1 {
        private String a;
        private int b;

        public m1(int i, String str) {
            this.a = str;
            this.b = i;
        }

        public int a() {
            return this.b;
        }

        public String b() {
            return this.a;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class n implements Runnable {
        public final /* synthetic */ w0 s;

        public n(w0 w0Var) {
            this.s = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running getTags() operation from pending queue.");
            jm3.U0(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum n0 {
        VALIDATION,
        REQUIRES_EMAIL_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class o implements Runnable {
        public final /* synthetic */ w0 s;

        public o(w0 w0Var) {
            this.s = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (jm3.d0) {
                jm3.d0.add(this.s);
                if (jm3.d0.size() > 1) {
                    return;
                }
                jm3.s2();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class o0 {
        private n0 a;
        private String b;

        public o0(n0 n0Var, String str) {
            this.a = n0Var;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public n0 b() {
            return this.a;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class p implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            un3.e j = an3.j(!jm3.X);
            if (j.a) {
                boolean unused = jm3.X = true;
            }
            synchronized (jm3.d0) {
                Iterator it = jm3.d0.iterator();
                while (it.hasNext()) {
                    w0 w0Var = (w0) it.next();
                    if (j.b != null && !j.toString().equals("{}")) {
                        jSONObject = j.b;
                        w0Var.a(jSONObject);
                    }
                    jSONObject = null;
                    w0Var.a(jSONObject);
                }
                jm3.d0.clear();
            }
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface p0 {
        void a(o0 o0Var);

        void onSuccess();
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class q implements Runnable {
        public final /* synthetic */ el3 s;

        public q(el3 el3Var) {
            this.s = el3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.t.a(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface q0 {
        void a(l0 l0Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class r extends xm3.g {
        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            jm3.C1("sending Notification Opened Failed", i, th, str);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class r0 {
        private s0 a;
        private String b;

        public r0(s0 s0Var, String str) {
            this.a = s0Var;
            this.b = str;
        }

        public String a() {
            return this.b;
        }

        public s0 b() {
            return this.a;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class s implements Runnable {
        public final /* synthetic */ boolean s;

        public s(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setSubscription() operation from pending queue.");
            jm3.T(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum s0 {
        REQUIRES_EXTERNAL_ID_AUTH,
        INVALID_OPERATION,
        NETWORK
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class t implements Runnable {
        public final /* synthetic */ boolean s;

        public t(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running setLocationShared() operation from pending task queue.");
            jm3.a3(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class t0 {
        public JSONArray a;
        public boolean b;
        public xm3.g c;

        public t0(JSONArray jSONArray) {
            this.a = jSONArray;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class u implements Runnable {
        public final /* synthetic */ c1 s;
        public final /* synthetic */ boolean t;

        public u(c1 c1Var, boolean z) {
            this.s = c1Var;
            this.t = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running promptLocation() operation from pending queue.");
            jm3.Y1(this.s, this.t);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public enum u0 {
        NONE,
        FATAL,
        ERROR,
        WARN,
        INFO,
        DEBUG,
        VERBOSE
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class v {
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface v0 {
        void a(JSONObject jSONObject);

        void b(r0 r0Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class w extends ej3.e {
        public final /* synthetic */ c1 a;

        public w(c1 c1Var) {
            this.a = c1Var;
        }

        @Override // com.p7700g.p99005.ej3.b
        public void a(ej3.d dVar) {
            if (jm3.t3(zl3.o) || dVar == null) {
                return;
            }
            an3.E(dVar);
        }

        @Override // com.p7700g.p99005.ej3.e
        public void b(j1 j1Var) {
            super.b(j1Var);
            c1 c1Var = this.a;
            if (c1Var != null) {
                c1Var.a(j1Var);
            }
        }

        @Override // com.p7700g.p99005.ej3.b
        public ej3.f getType() {
            return ej3.f.PROMPT_LOCATION;
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface w0 {
        void a(JSONObject jSONObject);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class x implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running clearOneSignalNotifications() operation from pending queue.");
            jm3.K();
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface x0 {
        void a(ak3 ak3Var);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class y implements Runnable {
        public final /* synthetic */ int s;

        public y(int i) {
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running removeNotification() operation from pending queue.");
            jm3.l2(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public interface y0 {
        void a(String str, boolean z);
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public class z implements Runnable {
        public final /* synthetic */ String s;

        public z(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.C.b("Running removeGroupedNotifications() operation from pending queue.");
            jm3.k2(this.s);
        }
    }

    /* compiled from: OneSignal.java */
    /* loaded from: classes3.dex */
    public static class z0 {
        private int a;
        private String b;

        public z0(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            return this.b;
        }
    }

    static {
        tl3 tl3Var = new tl3();
        L = tl3Var;
        co3 co3Var = new co3(tl3Var, C, G);
        M = co3Var;
        N = new rl3(E, co3Var, C);
        R = new v();
        S = com.anythink.expressad.foundation.g.a.f.a;
        U = new OSUtils();
        b0 = new ArrayList();
        c0 = new HashSet<>();
        d0 = new ArrayList<>();
    }

    public static void A(jl3 jl3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not add permission observer");
            return;
        }
        E0().a(jl3Var);
        if (h0(g).b(w0(g))) {
            OSPermissionChangedInternalObserver.a(h0(g));
        }
    }

    private static u0 A0(int i2) {
        switch (i2) {
            case 0:
                return u0.NONE;
            case 1:
                return u0.FATAL;
            case 2:
                return u0.ERROR;
            case 3:
                return u0.WARN;
            case 4:
                return u0.INFO;
            case 5:
                return u0.DEBUG;
            case 6:
                return u0.VERBOSE;
            default:
                if (i2 < 0) {
                    return u0.NONE;
                }
                return u0.VERBOSE;
        }
    }

    private static boolean A1(String str) {
        if (str == null || str.isEmpty()) {
            a(u0.ERROR, "Outcome name must not be empty");
            return false;
        }
        return true;
    }

    public static void A2(@x1 String str) {
        B2(str, null);
    }

    public static void A3(String str) {
        w2(str);
        i0(g).i(str);
    }

    public static void B(@x1 ol3 ol3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not add sms subscription observer");
            return;
        }
        L0().a(ol3Var);
        if (i0(g).b(x0(g))) {
            OSSMSSubscriptionChangedInternalObserver.a(i0(g));
        }
    }

    public static tk3 B0() {
        return C;
    }

    private static boolean B1(float f2) {
        if (f2 <= 0.0f) {
            a(u0.ERROR, "Outcome value must be greater than 0");
            return false;
        }
        return true;
    }

    public static void B2(@x1 String str, h1 h1Var) {
        if (!A1(str)) {
            C.d("Make sure OneSignal initWithContext and setAppId is called first");
        } else if (!J.i(zl3.D) && O != null) {
            if (t3(zl3.D)) {
                return;
            }
            O.n(str, h1Var);
        } else {
            C.d("Waiting for remote params. Moving sendOutcome() operation to a pending queue.");
            J.c(new b0(str, h1Var));
        }
    }

    public static void B3(String str) {
        x2(str);
        r1();
        j0(g).o(str);
        t0 t0Var = r0;
        if (t0Var != null) {
            E2(t0Var.a, t0Var.b, t0Var.c);
            r0 = null;
        }
        an3.r();
    }

    public static void C(ul3 ul3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not add subscription observer");
            return;
        }
        T0().a(ul3Var);
        if (j0(g).a(z0(g))) {
            OSSubscriptionChangedInternalObserver.a(j0(g));
        }
    }

    public static String C0(@z1 JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (jSONObject == null) {
            return null;
        }
        try {
            jSONObject2 = new JSONObject(jSONObject.getString("custom"));
        } catch (JSONException unused) {
            C.b("Not a OneSignal formatted FCM message. No 'custom' field in the JSONObject.");
        }
        if (jSONObject2.has("i")) {
            return jSONObject2.optString("i", null);
        }
        C.b("Not a OneSignal formatted FCM message. No 'i' field in custom.");
        return null;
    }

    public static void C1(String str, int i2, Throwable th, String str2) {
        String u2 = (str2 == null || !H(u0.INFO)) ? "" : wo1.u("\n", str2, "\n");
        u0 u0Var = u0.WARN;
        b(u0Var, "HTTP code: " + i2 + " " + str + u2, th);
    }

    public static void C2(@x1 String str, float f2) {
        D2(str, f2, null);
    }

    public static boolean C3() {
        return H.e();
    }

    public static void D(String str, Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, obj);
        u0().C(hashMap);
    }

    public static il3 D0() {
        if (O == null) {
            synchronized (R) {
                if (O == null) {
                    if (P == null) {
                        P = new po3(C, K, k0(), L);
                    }
                    O = new il3(N, P);
                }
            }
        }
        return O;
    }

    public static void D1() {
        E1(null);
    }

    public static void D2(@x1 String str, float f2, h1 h1Var) {
        il3 il3Var;
        if (A1(str) && B1(f2)) {
            if (!J.i(zl3.F) && (il3Var = O) != null) {
                il3Var.o(str, f2, h1Var);
                return;
            }
            C.d("Waiting for remote params. Moving sendOutcomeWithValue() operation to a pending queue.");
            J.c(new d0(str, f2, h1Var));
        }
    }

    public static void E(Map<String, Object> map) {
        u0().C(map);
    }

    public static gl3<jl3, ll3> E0() {
        if (h0 == null) {
            h0 = new gl3<>("onOSPermissionChanged", true);
        }
        return h0;
    }

    public static void E1(@z1 p0 p0Var) {
        if (J.i(zl3.j)) {
            C.d("Waiting for remote params. Moving logoutEmail() operation to a pending task queue.");
            J.c(new e(p0Var));
        } else if (t3(zl3.j)) {
        } else {
            if (p0() == null) {
                if (p0Var != null) {
                    p0Var.a(new o0(n0.INVALID_OPERATION, "logoutEmail not valid as email was not set or already logged out!"));
                }
                C.d("logoutEmail not valid as email was not set or already logged out!");
                return;
            }
            e = p0Var;
            an3.n();
        }
    }

    public static void E2(JSONArray jSONArray, boolean z2, xm3.g gVar) {
        if (t3("sendPurchases()")) {
            return;
        }
        if (c1() == null) {
            t0 t0Var = new t0(jSONArray);
            r0 = t0Var;
            t0Var.b = z2;
            t0Var.c = gVar;
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_id", M0());
            if (z2) {
                jSONObject.put("existing", true);
            }
            jSONObject.put("purchases", jSONArray);
            an3.t(jSONObject, gVar);
        } catch (Throwable th) {
            b(u0.ERROR, "Failed to generate JSON for sendPurchases.", th);
        }
    }

    public static void F(@z1 String str) {
        l0 l0Var = l0.NOTIFICATION_CLICK;
        x = l0Var;
        N.j(l0Var, str);
    }

    private static bn3 F0() {
        bn3 bn3Var = s0;
        if (bn3Var != null) {
            return bn3Var;
        }
        if (OSUtils.D()) {
            s0 = new cn3();
        } else if (OSUtils.C()) {
            if (OSUtils.s()) {
                s0 = G0();
            }
        } else {
            s0 = new fn3();
        }
        return s0;
    }

    public static void F1() {
        G1(null);
    }

    public static void F2(String str, String str2) {
        if (J.i(zl3.q)) {
            C.d("Waiting for remote params. Moving sendTag() operation to a pending task queue.");
            J.c(new i(str, str2));
        } else if (t3(zl3.q)) {
        } else {
            try {
                H2(new JSONObject().put(str, str2));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean G() {
        if (H.x()) {
            return OSUtils.a(g);
        }
        return true;
    }

    @x1
    private static en3 G0() {
        wm3.d dVar = H.d().p;
        return new en3(g, dVar != null ? new en3.a(dVar.a, dVar.b, dVar.c) : null);
    }

    public static void G1(@z1 f1 f1Var) {
        if (J.i(zl3.i)) {
            C.d("Waiting for remote params. Moving logoutSMSNumber() operation to a pending task queue.");
            J.c(new c(f1Var));
        } else if (t3(zl3.i)) {
        } else {
            if (J0() == null) {
                if (f1Var != null) {
                    f1Var.b(new e1(l1.INVALID_OPERATION, "logoutSMSNumber() not valid as sms number was not set or already logged out!"));
                }
                C.d("logoutSMSNumber() not valid as sms number was not set or already logged out!");
                return;
            }
            c = f1Var;
            an3.o();
        }
    }

    public static void G2(String str) {
        try {
            H2(new JSONObject(str));
        } catch (JSONException e2) {
            b(u0.ERROR, "Generating JSONObject for sendTags failed!", e2);
        }
    }

    public static boolean H(u0 u0Var) {
        return u0Var.compareTo(k) < 1 || u0Var.compareTo(l) < 1;
    }

    public static nl3 H0() {
        return H;
    }

    private static void H1(String str, String str2, boolean z2) {
        if (I0() != null || Z) {
            return;
        }
        Z = true;
        wm3.e(str, str2, new i0(z2));
    }

    public static void H2(JSONObject jSONObject) {
        I2(jSONObject, null);
    }

    public static void I() {
        if (w) {
            return;
        }
        jn3 jn3Var = z;
        if (jn3Var != null) {
            jn3Var.c();
        }
        t0().a();
        y2();
    }

    public static wm3.f I0() {
        return H.d();
    }

    public static void I1(Context context, JSONObject jSONObject, @x1 yk3.f fVar) {
        if (Q == null) {
            Q = new yk3(l0(context), C);
        }
        Q.k(jSONObject, fVar);
    }

    public static void I2(JSONObject jSONObject, m0 m0Var) {
        if (J.i(zl3.r)) {
            C.d("Waiting for remote params. Moving sendTags() operation to a pending task queue.");
            J.c(new j(jSONObject, m0Var));
        } else if (t3(zl3.r)) {
        } else {
            l lVar = new l(jSONObject, m0Var);
            if (J.f()) {
                C.b("Sending sendTags() operation to pending task queue.");
                J.c(lVar);
                return;
            }
            lVar.run();
        }
    }

    public static void J(l0 l0Var) {
        Iterator it = new ArrayList(f).iterator();
        while (it.hasNext()) {
            ((q0) it.next()).a(l0Var);
        }
    }

    public static String J0() {
        if (o == null && g != null) {
            o = vm3.g(vm3.a, vm3.N, null);
        }
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        return o;
    }

    private static void J1(Context context, JSONArray jSONArray) {
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            try {
                String optString = new JSONObject(jSONArray.getJSONObject(i2).optString("custom", null)).optString("i", null);
                if (!c0.contains(optString)) {
                    c0.add(optString);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_id", N0(context));
                    jSONObject.put("player_id", O0(context));
                    jSONObject.put(qm3.b.g, true);
                    jSONObject.put("device_type", U.f());
                    xm3.l("notifications/" + optString, jSONObject, new r());
                }
            } catch (Throwable th) {
                b(u0.ERROR, "Failed to generate JSON to send notification opened.", th);
            }
        }
    }

    public static void J2(@x1 String str) {
        K2(str, null);
    }

    public static void K() {
        yk3 yk3Var;
        if (!J.i(zl3.x) && (yk3Var = Q) != null) {
            yk3Var.i(new WeakReference<>(g));
            return;
        }
        C.d("Waiting for remote params. Moving clearOneSignalNotifications() operation to a pending queue.");
        J.c(new x());
    }

    public static pl3 K0() {
        return i0(g);
    }

    public static void K1() {
        u0 u0Var = u0.DEBUG;
        a(u0Var, "Application on focus");
        W2(true);
        l0 l0Var = x;
        l0 l0Var2 = l0.NOTIFICATION_CLICK;
        if (!l0Var.equals(l0Var2)) {
            J(x);
            if (!x.equals(l0Var2)) {
                x = l0.APP_OPEN;
            }
        }
        ej3.l();
        oj3.f.i();
        if (OSUtils.W(i)) {
            return;
        }
        if (!H.n()) {
            a(u0Var, "Delay onAppFocus logic due to missing remote params");
            H1(i, c1(), false);
            return;
        }
        L1();
    }

    public static void K2(@x1 String str, h1 h1Var) {
        if (A1(str)) {
            if (!J.i(zl3.E) && O != null) {
                if (t3(zl3.E)) {
                    return;
                }
                O.r(str, h1Var);
                return;
            }
            C.d("Waiting for remote params. Moving sendUniqueOutcome() operation to a pending queue.");
            J.c(new c0(str, h1Var));
        }
    }

    public static void L(String str) {
        M(str, null);
    }

    public static gl3<ol3, ql3> L0() {
        if (q0 == null) {
            q0 = new gl3<>("onSMSSubscriptionChanged", true);
        }
        return q0;
    }

    private static void L1() {
        if (t3("onAppFocus")) {
            return;
        }
        t0().b();
        U();
        ln3 ln3Var = y;
        if (ln3Var != null) {
            ln3Var.u();
        }
        OSNotificationRestoreWorkManager.c(g, false);
        c2();
        if (A != null && s0()) {
            A.f();
        }
        wl3.r().q(g);
    }

    public static void L2(@x1 String str) {
        if (str != null && !str.isEmpty()) {
            if (!str.equals(i)) {
                v = false;
                tk3 tk3Var = C;
                StringBuilder M2 = wo1.M("setAppId called with id: ", str, " changing id from: ");
                M2.append(i);
                tk3Var.e(M2.toString());
            }
            i = str;
            if (g == null) {
                C.c("appId set, but please call initWithContext(appContext) with Application context to complete OneSignal init!");
                return;
            }
            WeakReference<Activity> weakReference = h;
            if (weakReference != null && weakReference.get() != null) {
                p1(h.get());
                return;
            } else {
                p1(g);
                return;
            }
        }
        tk3 tk3Var2 = C;
        tk3Var2.c("setAppId called with id: " + str + ", ignoring!");
    }

    public static void M(String str, m0 m0Var) {
        if (t3("deleteTag()")) {
            return;
        }
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(str);
        Q(arrayList, m0Var);
    }

    public static String M0() {
        return N0(g);
    }

    @s2
    public static void M1() {
        u0 u0Var = u0.DEBUG;
        StringBuilder G2 = wo1.G("Application lost focus initDone: ");
        G2.append(v);
        a(u0Var, G2.toString());
        W2(false);
        x = l0.APP_CLOSE;
        Z2(X0().b());
        ej3.l();
        if (!v) {
            if (J.i(zl3.C)) {
                C.d("Waiting for remote params. Moving onAppLostFocus() operation to a pending task queue.");
                J.c(new k0());
                return;
            }
            return;
        }
        I();
    }

    public static void M2(@x1 String str) {
        P2(str, null, null);
    }

    public static void N(String str) {
        O(str, null);
    }

    private static String N0(Context context) {
        if (context == null) {
            return null;
        }
        return vm3.g(vm3.a, vm3.i, null);
    }

    public static void N1() {
        c2();
    }

    public static void N2(@x1 String str, p0 p0Var) {
        P2(str, null, p0Var);
    }

    public static void O(String str, m0 m0Var) {
        try {
            R(new JSONArray(str), m0Var);
        } catch (Throwable th) {
            b(u0.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    private static String O0(Context context) {
        if (context == null) {
            return null;
        }
        return vm3.g(vm3.a, vm3.j, null);
    }

    public static void O1() {
        if (b2() || !w) {
            return;
        }
        L1();
    }

    public static void O2(@x1 String str, @z1 String str2) {
        P2(str, str2, null);
    }

    public static void P(Collection<String> collection) {
        Q(collection, null);
    }

    public static String P0() {
        return B;
    }

    public static void P1(u0 u0Var, String str) {
        a(u0Var, str);
    }

    public static void P2(@x1 String str, @z1 String str2, @z1 p0 p0Var) {
        if (J.i(zl3.h)) {
            C.d("Waiting for remote params. Moving setEmail() operation to a pending task queue.");
            J.c(new d(str, str2, p0Var));
        } else if (t3(zl3.h)) {
        } else {
            if (!OSUtils.K(str)) {
                if (p0Var != null) {
                    p0Var.a(new o0(n0.VALIDATION, "Email is invalid"));
                }
                C.d("Email is invalid");
            } else if (I0().d && (str2 == null || str2.length() == 0)) {
                if (p0Var != null) {
                    p0Var.a(new o0(n0.REQUIRES_EMAIL_AUTH, "Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                C.d("Email authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            } else {
                d = p0Var;
                String trim = str.trim();
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                g0(g).h(trim);
                an3.v(trim.toLowerCase(), str2);
            }
        }
    }

    public static void Q(Collection<String> collection, m0 m0Var) {
        if (t3("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : collection) {
                jSONObject.put(str, "");
            }
            I2(jSONObject, m0Var);
        } catch (Throwable th) {
            b(u0.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static rl3.b Q0() {
        return E;
    }

    public static void Q1(@x1 Activity activity, @x1 JSONArray jSONArray) {
        try {
            Intent b2 = wi3.a.a(activity, jSONArray.getJSONObject(0)).b();
            if (b2 != null) {
                tk3 tk3Var = C;
                tk3Var.f("SDK running startActivity with Intent: " + b2);
                activity.startActivity(b2);
            } else {
                C.f("SDK not showing an Activity automatically due to it's settings.");
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void Q2(@x1 String str) {
        T2(str, null, null);
    }

    public static void R(JSONArray jSONArray, m0 m0Var) {
        if (t3("deleteTags()")) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                jSONObject.put(jSONArray.getString(i2), "");
            }
            I2(jSONObject, m0Var);
        } catch (Throwable th) {
            b(u0.ERROR, "Failed to generate JSON for deleteTags.", th);
        }
    }

    public static rl3 R0() {
        return N;
    }

    public static void R1(boolean z2) {
        if (g == null) {
            C.d("Waiting initWithContext. Moving pauseInAppMessages() operation to a pending task queue.");
            J.c(new a0(z2));
            return;
        }
        u0().A0(!z2);
    }

    public static void R2(@x1 String str, @z1 v0 v0Var) {
        T2(str, null, v0Var);
    }

    public static void S(boolean z2) {
        if (H0().f()) {
            return;
        }
        H0().p(z2);
    }

    public static sl3 S0() {
        return L;
    }

    public static void S1(String str, i1 i1Var) {
        try {
            T1(new JSONObject(str), i1Var);
        } catch (JSONException unused) {
            u0 u0Var = u0.ERROR;
            a(u0Var, "Invalid postNotification JSON format: " + str);
        }
    }

    public static void S2(@x1 String str, @z1 String str2) {
        T2(str, str2, null);
    }

    public static void T(boolean z2) {
        if (J.i(zl3.n)) {
            C.d("Waiting for remote params. Moving setSubscription() operation to a pending queue.");
            J.c(new s(z2));
        } else if (t3(zl3.n)) {
        } else {
            j0(g).i(z2);
            an3.B(!z2);
        }
    }

    public static gl3<ul3, vl3> T0() {
        if (k0 == null) {
            k0 = new gl3<>("onOSSubscriptionChanged", true);
        }
        return k0;
    }

    public static void T1(JSONObject jSONObject, i1 i1Var) {
        if (t3("postNotification()")) {
            return;
        }
        try {
            if (!jSONObject.has("app_id")) {
                jSONObject.put("app_id", M0());
            }
            if (jSONObject.has("app_id")) {
                xm3.j("notifications/", jSONObject, new m(i1Var));
            } else if (i1Var != null) {
                i1Var.b(new JSONObject().put("error", "Missing app_id"));
            }
        } catch (JSONException e2) {
            C.a("HTTP create notification json exception!", e2);
            if (i1Var != null) {
                try {
                    i1Var.b(new JSONObject("{'error': 'HTTP create notification json exception!'}"));
                } catch (JSONException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static void T2(@x1 String str, @z1 String str2, @z1 v0 v0Var) {
        if (J.i(zl3.l)) {
            C.d("Waiting for remote params. Moving setExternalUserId() operation to a pending task queue.");
            J.c(new h(str, str2, v0Var));
        } else if (t3(zl3.l)) {
        } else {
            if (str == null) {
                C.c("External id can't be null, set an empty string to remove an external id");
            } else if (!str.isEmpty() && I0() != null && I0().e && (str2 == null || str2.length() == 0)) {
                if (v0Var != null) {
                    v0Var.b(new r0(s0.REQUIRES_EXTERNAL_ID_AUTH, "External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                C.d("External Id authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            } else {
                if (str2 != null) {
                    str2 = str2.toLowerCase();
                }
                try {
                    an3.w(str, str2, v0Var);
                } catch (JSONException e2) {
                    String str3 = str.equals("") ? la1.b : la1.a;
                    tk3 tk3Var = C;
                    tk3Var.d("Attempted to " + str3 + " external ID but encountered a JSON exception");
                    e2.printStackTrace();
                }
            }
        }
    }

    private static void U() {
        if (u3()) {
            tk3 tk3Var = C;
            StringBuilder G2 = wo1.G("Starting new session with appEntryState: ");
            G2.append(d0());
            tk3Var.b(G2.toString());
            an3.x();
            D0().e();
            N.m(d0());
            u0().x0();
            Z2(G.b());
        } else if (u1()) {
            tk3 tk3Var2 = C;
            StringBuilder G3 = wo1.G("Continue on same session with appEntryState: ");
            G3.append(d0());
            tk3Var2.b(G3.toString());
            N.c(d0());
        }
        u0().c0();
        if (!w && o1()) {
            C.b("doSessionInit on background with already registered user");
        }
        x3();
    }

    public static void U0(w0 w0Var) {
        if (J.i(zl3.f)) {
            C.d("Waiting for remote params. Moving getTags() operation to a pending queue.");
            J.c(new n(w0Var));
        } else if (t3(zl3.f)) {
        } else {
            if (w0Var == null) {
                C.d("getTags called with null GetTagsHandler!");
            } else {
                new Thread(new o(w0Var), "OS_GETTAGS").start();
            }
        }
    }

    public static void U1() {
        V1(false);
    }

    public static void U2(@z1 x0 x0Var) {
        u = x0Var;
    }

    private static void V() {
        for (JSONArray jSONArray : b0) {
            t2(jSONArray);
        }
        b0.clear();
    }

    public static yl3 V0() {
        return I;
    }

    public static void V1(boolean z2) {
        W1(z2, null);
    }

    public static void V2(@z1 hk3 hk3Var) {
        if (g == null) {
            C.d("Waiting initWithContext. Moving setInAppMessageLifecycleHandler() operation to a pending task queue.");
            J.c(new f0(hk3Var));
            return;
        }
        u0().z0(hk3Var);
    }

    public static void W() {
        p0 p0Var = d;
        if (p0Var != null) {
            p0Var.a(new o0(n0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            d = null;
        }
    }

    public static yl3 W0() {
        return J;
    }

    public static void W1(boolean z2, @z1 k1 k1Var) {
        oj3.f.j(z2, k1Var);
    }

    public static void W2(boolean z2) {
        w = z2;
    }

    public static void X() {
        p0 p0Var = d;
        if (p0Var != null) {
            p0Var.onSuccess();
            d = null;
        }
    }

    @x1
    public static bm3 X0() {
        return G;
    }

    public static void X1() {
        Y1(null, false);
    }

    public static void X2(@x1 String str) {
        Y2(str, null);
    }

    public static void Y(xk3 xk3Var) {
        P1(u0.INFO, "Fire notificationWillShowInForegroundHandler");
        fl3 c2 = xk3Var.c();
        try {
            s.a(c2);
        } catch (Throwable th) {
            P1(u0.ERROR, "Exception thrown while notification was being processed for display by notificationWillShowInForegroundHandler, showing notification in foreground!");
            c2.b(c2.c());
            throw th;
        }
    }

    private static String Y0() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ZoneId.systemDefault().getId();
        }
        return TimeZone.getDefault().getID();
    }

    public static void Y1(@z1 c1 c1Var, boolean z2) {
        if (J.i(zl3.o)) {
            C.d("Waiting for remote params. Moving promptLocation() operation to a pending queue.");
            J.c(new u(c1Var, z2));
        } else if (t3(zl3.o)) {
        } else {
            ej3.g(g, true, z2, new w(c1Var));
        }
    }

    public static void Y2(@x1 String str, @z1 g1 g1Var) {
        if (J.i(zl3.m)) {
            C.d("Waiting for remote params. Moving setLanguage() operation to a pending task queue.");
            J.c(new f(str, g1Var));
            return;
        }
        g gVar = g1Var != null ? new g(g1Var) : null;
        if (t3(zl3.m)) {
            return;
        }
        io3 io3Var = new io3(L);
        io3Var.b(str);
        q.c(io3Var);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("language", q.b());
            an3.D(jSONObject, gVar);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private static void Z(el3 el3Var) {
        OSUtils.V(new q(el3Var));
    }

    private static int Z0() {
        TimeZone timeZone = Calendar.getInstance().getTimeZone();
        int rawOffset = timeZone.getRawOffset();
        if (timeZone.inDaylightTime(new Date())) {
            rawOffset += timeZone.getDSTSavings();
        }
        return rawOffset / 1000;
    }

    public static void Z1(boolean z2) {
        boolean C3 = C3();
        H.w(z2);
        if (C3 || !z2 || e0 == null) {
            return;
        }
        a(u0.VERBOSE, "Privacy consent provided, reassigning all delayed init params and attempting init again...");
        b2();
    }

    public static void Z2(long j2) {
        tk3 tk3Var = C;
        tk3Var.b("Last session time set to: " + j2);
        vm3.m(vm3.a, vm3.f, j2);
    }

    public static void a(@x1 u0 u0Var, @x1 String str) {
        b(u0Var, str, null);
    }

    public static void a0() {
        f1 f1Var = b;
        if (f1Var != null) {
            f1Var.b(new e1(l1.NETWORK, "Failed due to network failure. Will retry on next sync."));
            b = null;
        }
    }

    @z1
    public static Object a1(String str) {
        if (g == null) {
            C.d("Before calling getTriggerValueForKey, Make sure OneSignal initWithContext and setAppId is called first");
            return null;
        }
        return u0().X(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean a2(int i2) {
        return i2 < -6;
    }

    public static void a3(boolean z2) {
        if (J.i(zl3.s)) {
            C.d("Waiting for remote params. Moving setLocationShared() operation to a pending task queue.");
            J.c(new t(z2));
        } else if (H0().g()) {
        } else {
            v3(z2);
        }
    }

    public static void b(@x1 u0 u0Var, @x1 String str, @z1 Throwable th) {
        StringWriter stringWriter;
        if (u0Var.compareTo(l) < 1 && u0Var != u0.VERBOSE && u0Var != u0.DEBUG && u0Var != u0.INFO && u0Var != u0.WARN && u0Var != u0.ERROR) {
            u0 u0Var2 = u0.FATAL;
        }
        if (u0Var.compareTo(k) >= 1 || f0() == null) {
            return;
        }
        try {
            String str2 = str + "\n";
            if (th != null) {
                th.printStackTrace(new PrintWriter(new StringWriter()));
                str2 = (str2 + th.getMessage()) + stringWriter.toString();
            }
            OSUtils.V(new j0(u0Var, str2));
        } catch (Throwable unused) {
        }
    }

    public static void b0(JSONObject jSONObject) {
        f1 f1Var = b;
        if (f1Var != null) {
            f1Var.a(jSONObject);
            b = null;
        }
    }

    public static Map<String, Object> b1() {
        if (g == null) {
            C.d("Before calling getTriggers, Make sure OneSignal initWithContext and setAppId is called first");
            return new HashMap();
        }
        return u0().Y();
    }

    private static boolean b2() {
        String a2;
        Context b2;
        if (v) {
            return false;
        }
        qi3 qi3Var = e0;
        if (qi3Var == null) {
            a2 = M0();
            b2 = g;
            C.d("Trying to continue OneSignal with null delayed params");
        } else {
            a2 = qi3Var.a();
            b2 = e0.b();
        }
        tk3 tk3Var = C;
        StringBuilder G2 = wo1.G("reassignDelayedInitParams with appContext: ");
        G2.append(g);
        tk3Var.b(G2.toString());
        e0 = null;
        L2(a2);
        if (v) {
            return true;
        }
        if (b2 == null) {
            C.d("Trying to continue OneSignal with null delayed params context");
            return false;
        }
        q1(b2);
        return true;
    }

    public static void b3(int i2, int i3) {
        c3(A0(i2), A0(i3));
    }

    @x1
    private static el3 c0(JSONArray jSONArray) {
        int length = jSONArray.length();
        int optInt = jSONArray.optJSONObject(0).optInt(ui3.b);
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        String str = null;
        JSONObject jSONObject = null;
        for (int i2 = 0; i2 < length; i2++) {
            try {
                jSONObject = jSONArray.getJSONObject(i2);
                if (str == null && jSONObject.has(ui3.c)) {
                    str = jSONObject.optString(ui3.c, null);
                }
                if (z2) {
                    z2 = false;
                } else {
                    arrayList.add(new vk3(jSONObject));
                }
            } catch (Throwable th) {
                b(u0.ERROR, "Error parsing JSON item " + i2 + "/" + length + " for callback.", th);
            }
        }
        return new el3(new vk3(arrayList, jSONObject, optInt), new wk3(str != null ? wk3.a.ActionTaken : wk3.a.Opened, str));
    }

    public static String c1() {
        Context context;
        if (m == null && (context = g) != null) {
            m = O0(context);
        }
        return m;
    }

    public static void c2() {
        h0(g).e();
    }

    public static void c3(u0 u0Var, u0 u0Var2) {
        l = u0Var;
        k = u0Var2;
    }

    @x1
    public static l0 d0() {
        return x;
    }

    private static void d1(Context context) {
        fi3 b2 = gi3.b();
        boolean z2 = context instanceof Activity;
        boolean z3 = f0() == null;
        W2(!z3 || z2);
        tk3 tk3Var = C;
        StringBuilder G2 = wo1.G("OneSignal handleActivityLifecycleHandler inForeground: ");
        G2.append(w);
        tk3Var.b(G2.toString());
        if (!w) {
            if (b2 != null) {
                b2.s(true);
                return;
            }
            return;
        }
        if (z3 && z2 && b2 != null) {
            b2.r((Activity) context);
            b2.s(true);
        }
        OSNotificationRestoreWorkManager.c(context, false);
        t0().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d2() {
        F0().a(g, j, new h0());
    }

    public static void d3(@z1 a1 a1Var) {
        t = a1Var;
        if (!v || a1Var == null) {
            return;
        }
        V();
    }

    public static boolean e0() {
        return H.b();
    }

    private static void e1() {
        try {
            Class.forName("com.amazon.device.iap.PurchasingListener");
            z = new jn3(g);
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e2() {
        tk3 tk3Var = C;
        StringBuilder G2 = wo1.G("registerUser:registerForPushFired:");
        G2.append(V);
        G2.append(", locationFired: ");
        G2.append(W);
        G2.append(", remoteParams: ");
        G2.append(I0());
        G2.append(", appId: ");
        G2.append(i);
        tk3Var.b(G2.toString());
        if (V && W && I0() != null && i != null) {
            new Thread(new a(), "OS_REG_USER").start();
        } else {
            C.b("registerUser not possible");
        }
    }

    public static void e3(@z1 b1 b1Var) {
        s = b1Var;
    }

    @z1
    public static Activity f0() {
        fi3 b2 = gi3.b();
        if (b2 != null) {
            return b2.d();
        }
        return null;
    }

    private static void f1() {
        String M0 = M0();
        if (M0 != null) {
            if (M0.equals(i)) {
                return;
            }
            u0 u0Var = u0.DEBUG;
            StringBuilder M2 = wo1.M("App id has changed:\nFrom: ", M0, "\n To: ");
            M2.append(i);
            M2.append("\nClearing the user id, app state, and remoteParams as they are no longer valid");
            a(u0Var, M2.toString());
            u2(i);
            an3.s();
            H.a();
            return;
        }
        u0 u0Var2 = u0.DEBUG;
        StringBuilder G2 = wo1.G("App id set for first time:  ");
        G2.append(i);
        a(u0Var2, G2.toString());
        ki3.d(0, g);
        u2(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f2() throws JSONException {
        ej3.d dVar;
        String packageName = g.getPackageName();
        PackageManager packageManager = g.getPackageManager();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", M0());
        jSONObject.put("device_os", Build.VERSION.RELEASE);
        jSONObject.put("timezone", Z0());
        jSONObject.put("timezone_id", Y0());
        jSONObject.put("language", q.b());
        jSONObject.put("sdk", B);
        jSONObject.put("sdk_type", S);
        jSONObject.put("android_package", packageName);
        jSONObject.put("device_model", Build.MODEL);
        try {
            jSONObject.put("game_version", packageManager.getPackageInfo(packageName, 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("net_type", U.j());
        jSONObject.put("carrier", U.e());
        jSONObject.put("rooted", hn3.a());
        an3.D(jSONObject, null);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(un3.f, T);
        jSONObject2.put(un3.l, p);
        jSONObject2.put(un3.k, G());
        jSONObject2.put("device_type", U.f());
        an3.F(jSONObject2);
        if (w1() && (dVar = a0) != null) {
            an3.E(dVar);
        }
        C.b("registerUserTask calling readyToUpdate");
        an3.q(true);
        Y = false;
    }

    public static void f3(d1 d1Var) {
        if (r == null) {
            r = d1Var;
        }
    }

    private static wj3 g0(Context context) {
        if (context == null) {
            return null;
        }
        if (l0 == null) {
            wj3 wj3Var = new wj3(false);
            l0 = wj3Var;
            wj3Var.e().b(new OSEmailSubscriptionChangedInternalObserver());
        }
        return l0;
    }

    public static void g1() {
        p0 p0Var = e;
        if (p0Var != null) {
            p0Var.a(new o0(n0.NETWORK, "Failed due to network failure. Will retry on next sync."));
            e = null;
        }
    }

    public static void g2(@x1 vj3 vj3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not modify email subscription observer");
        } else {
            r0().d(vj3Var);
        }
    }

    public static void g3(boolean z2) {
        if (H0().h()) {
            C.c("setRequiresUserPrivacyConsent already called by remote params!, ignoring user set");
        } else if (r2() && !z2) {
            a(u0.ERROR, "Cannot change requiresUserPrivacyConsent() from TRUE to FALSE");
        } else {
            H0().r(z2);
        }
    }

    private static kl3 h0(Context context) {
        if (context == null) {
            return null;
        }
        if (f0 == null) {
            kl3 kl3Var = new kl3(false);
            f0 = kl3Var;
            kl3Var.c().b(new OSPermissionChangedInternalObserver());
        }
        return f0;
    }

    public static void h1() {
        f1 f1Var = c;
        if (f1Var != null) {
            f1Var.b(new e1(l1.NETWORK, "Failed due to network failure. Will retry on next sync."));
            c = null;
        }
    }

    public static void h2(q0 q0Var) {
        f.remove(q0Var);
    }

    public static void h3(@x1 String str) {
        k3(str, null, null);
    }

    private static pl3 i0(Context context) {
        if (context == null) {
            return null;
        }
        if (o0 == null) {
            pl3 pl3Var = new pl3(false);
            o0 = pl3Var;
            pl3Var.c().b(new OSSMSSubscriptionChangedInternalObserver());
        }
        return o0;
    }

    public static void i1(Activity activity, JSONArray jSONArray, @z1 String str) {
        if (t3(null)) {
            return;
        }
        J1(activity, jSONArray);
        if (A != null && s0()) {
            A.g(c0(jSONArray));
        }
        if (s3(activity, jSONArray)) {
            F(str);
        }
        Q1(activity, jSONArray);
        t2(jSONArray);
    }

    public static void i2() {
        if (t3("removeExternalUserId()")) {
            return;
        }
        j2(null);
    }

    public static void i3(@x1 String str, f1 f1Var) {
        k3(str, null, f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static OSSubscriptionState j0(Context context) {
        if (context == null) {
            return null;
        }
        if (i0 == null) {
            i0 = new OSSubscriptionState(false, h0(context).a());
            h0(context).c().a(i0);
            i0.b().b(new OSSubscriptionChangedInternalObserver());
        }
        return i0;
    }

    public static void j1(al3 al3Var) {
        try {
            JSONObject jSONObject = new JSONObject(al3Var.f().toString());
            jSONObject.put(ui3.b, al3Var.b());
            el3 c02 = c0(ij3.g(jSONObject));
            if (A == null || !s0()) {
                return;
            }
            A.h(c02);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public static void j2(v0 v0Var) {
        if (t3("removeExternalUserId()")) {
            return;
        }
        R2("", v0Var);
    }

    public static void j3(@x1 String str, @z1 String str2) {
        k3(str, str2, null);
    }

    public static rm3 k0() {
        return rm3.k(g);
    }

    public static void k1() {
        p0 p0Var = e;
        if (p0Var != null) {
            p0Var.onSuccess();
            e = null;
        }
    }

    public static void k2(String str) {
        if (!J.i(zl3.y) && Q != null) {
            if (t3(zl3.y)) {
                return;
            }
            Q.l(str, new WeakReference<>(g));
            return;
        }
        C.d("Waiting for remote params. Moving removeGroupedNotifications() operation to a pending queue.");
        J.c(new z(str));
    }

    public static void k3(@x1 String str, String str2, f1 f1Var) {
        if (J.i(zl3.g)) {
            C.d("Waiting for remote params. Moving setSMSNumber() operation to a pending task queue.");
            J.c(new b(str, str2, f1Var));
        } else if (t3(zl3.g)) {
        } else {
            if (TextUtils.isEmpty(str)) {
                if (f1Var != null) {
                    f1Var.b(new e1(l1.VALIDATION, "SMS number is invalid"));
                }
                C.d("SMS number is invalid");
            } else if (I0().c && (str2 == null || str2.length() == 0)) {
                if (f1Var != null) {
                    f1Var.b(new e1(l1.REQUIRES_SMS_AUTH, "SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard."));
                }
                C.d("SMS authentication (auth token) is set to REQUIRED for this application. Please provide an auth token from your backend server or change the setting in the OneSignal dashboard.");
            } else {
                b = f1Var;
                i0(g).h(str);
                an3.A(str, str2);
            }
        }
    }

    public static rm3 l0(Context context) {
        return rm3.k(context);
    }

    public static void l1(JSONObject jSONObject) {
        f1 f1Var = c;
        if (f1Var != null) {
            f1Var.a(jSONObject);
            c = null;
        }
    }

    public static void l2(int i2) {
        if (!J.i(zl3.z) && Q != null) {
            if (t3(zl3.z)) {
                return;
            }
            Q.m(i2, new WeakReference<>(g));
            return;
        }
        C.d("Waiting for remote params. Moving removeNotification() operation to a pending queue.");
        J.c(new y(i2));
    }

    public static void l3(rl3 rl3Var) {
        N = rl3Var;
    }

    public static qi3 m0() {
        return e0;
    }

    public static boolean m1() {
        return !TextUtils.isEmpty(n);
    }

    public static void m2(jl3 jl3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not modify permission observer");
        } else {
            E0().d(jl3Var);
        }
    }

    public static void m3(sl3 sl3Var) {
        L = sl3Var;
    }

    @z1
    public static sj3 n0() {
        Context context = g;
        if (context == null) {
            C.d("OneSignal.initWithContext has not been called. Could not get OSDeviceState");
            return null;
        }
        return new sj3(j0(context), h0(g), g0(g), i0(g));
    }

    public static boolean n1() {
        return !TextUtils.isEmpty(o);
    }

    public static void n2(@x1 ol3 ol3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not modify sms subscription observer");
        } else {
            L0().d(ol3Var);
        }
    }

    public static void n3(bm3 bm3Var) {
        G = bm3Var;
    }

    public static boolean o0() {
        return H.j();
    }

    public static boolean o1() {
        return c1() != null;
    }

    public static void o2(ul3 ul3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not modify subscription observer");
        } else {
            T0().d(ul3Var);
        }
    }

    public static void o3(co3 co3Var) {
        M = co3Var;
    }

    public static String p0() {
        if (n == null && g != null) {
            n = vm3.g(vm3.a, vm3.K, null);
        }
        if (TextUtils.isEmpty(n)) {
            return null;
        }
        return n;
    }

    private static synchronized void p1(Context context) {
        synchronized (jm3.class) {
            C.e("Starting OneSignal initialization!");
            xk3.k(g);
            if (!r2() && H.n()) {
                int i2 = p;
                if (i2 == Integer.MAX_VALUE) {
                    i2 = U.B(g, i);
                }
                p = i2;
                if (y1()) {
                    return;
                }
                if (v) {
                    if (t != null) {
                        V();
                    }
                    C.b("OneSignal SDK initialization already completed.");
                    return;
                }
                d1(context);
                h = null;
                an3.m();
                f1();
                e1();
                OSPermissionChangedInternalObserver.b(h0(g));
                U();
                if (t != null) {
                    V();
                }
                if (ln3.a(g)) {
                    y = new ln3(g);
                }
                if (kn3.a()) {
                    A = new kn3(g);
                }
                v = true;
                a(u0.VERBOSE, "OneSignal SDK initialization done.");
                D0().q();
                J.h();
                return;
            }
            if (!H.n()) {
                C.e("OneSignal SDK initialization delayed, waiting for remote params.");
            } else {
                C.e("OneSignal SDK initialization delayed, waiting for privacy consent to be set.");
            }
            e0 = new qi3(g, i);
            String str = i;
            i = null;
            if (str != null && context != null) {
                H1(str, c1(), false);
            }
        }
    }

    public static void p2(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        u0().v0(arrayList);
    }

    private static void p3(boolean z2) {
        gi3.c((Application) g);
        if (z2) {
            q = new go3(L);
            vm3.q();
            rm3 k02 = k0();
            yk3 yk3Var = new yk3(k02, C);
            Q = yk3Var;
            yk3Var.h();
            u0().G();
            if (P == null) {
                P = new po3(C, K, k02, L);
            }
            N.g();
            D0().d();
        }
    }

    public static wj3 q0() {
        return g0(g);
    }

    public static void q1(@x1 Context context) {
        if (context == null) {
            C.c("initWithContext called with null context, ignoring!");
            return;
        }
        if (context instanceof Activity) {
            h = new WeakReference<>((Activity) context);
        }
        boolean z2 = g == null;
        g = context.getApplicationContext();
        p3(z2);
        q3(g);
        if (i == null) {
            String M0 = M0();
            if (M0 == null) {
                C.c("appContext set, but please call setAppId(appId) with a valid appId to complete OneSignal init!");
                return;
            }
            tk3 tk3Var = C;
            tk3Var.e("appContext set and cached app id found, calling setAppId with: " + M0);
            L2(M0);
            return;
        }
        tk3 tk3Var2 = C;
        tk3Var2.e("initWithContext called with: " + context);
        p1(context);
    }

    public static void q2(Collection<String> collection) {
        u0().v0(collection);
    }

    private static void q3(Context context) {
        try {
            String string = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getString("com.onesignal.PrivacyConsent");
            if (string != null) {
                g3("ENABLE".equalsIgnoreCase(string));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static gl3<vj3, xj3> r0() {
        if (n0 == null) {
            n0 = new gl3<>("onOSEmailSubscriptionChanged", true);
        }
        return n0;
    }

    private static void r1() {
        ArrayList<w0> arrayList = d0;
        synchronized (arrayList) {
            if (arrayList.size() == 0) {
                return;
            }
            new Thread(new p(), "OS_GETTAGS_CALLBACK").start();
        }
    }

    public static boolean r2() {
        return g == null || (z1() && !C3());
    }

    public static boolean r3(al3 al3Var) {
        if (!u1()) {
            P1(u0.INFO, "App is in background, show notification");
            return false;
        } else if (s == null) {
            P1(u0.INFO, "No NotificationWillShowInForegroundHandler setup, show notification");
            return false;
        } else if (al3Var.r()) {
            P1(u0.INFO, "Not firing notificationWillShowInForegroundHandler for restored notifications");
            return false;
        } else {
            return true;
        }
    }

    public static boolean s0() {
        return H.c();
    }

    public static boolean s1() {
        return v && u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void s2() {
        if (c1() == null) {
            C.c("getTags called under a null user!");
        } else {
            r1();
        }
    }

    private static boolean s3(Activity activity, JSONArray jSONArray) {
        if (w) {
            return false;
        }
        try {
            return new dl3(activity, jSONArray.getJSONObject(0)).a();
        } catch (JSONException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static si3 t0() {
        if (D == null) {
            D = new si3(new yj3(), C);
        }
        return D;
    }

    public static boolean t1() {
        if (g == null) {
            C.d("Before calling isInAppMessagingPaused, Make sure OneSignal initWithContext and setAppId is called first");
            return false;
        }
        return !u0().a0();
    }

    private static void t2(JSONArray jSONArray) {
        if (t == null) {
            b0.add(jSONArray);
            return;
        }
        el3 c02 = c0(jSONArray);
        y(c02, x);
        Z(c02);
    }

    public static boolean t3(String str) {
        if (r2()) {
            if (str != null) {
                u0 u0Var = u0.WARN;
                a(u0Var, "Method " + str + " was called before the user provided privacy consent. Your application is set to require the user's privacy consent before the OneSignal SDK can be initialized. Please ensure the user has provided consent before calling this method. You can check the latest OneSignal consent status by calling OneSignal.userProvidedPrivacyConsent()");
                return true;
            }
            return true;
        }
        return false;
    }

    public static dk3 u0() {
        return F.a(k0(), I, B0(), S0(), q);
    }

    public static boolean u1() {
        return w;
    }

    private static void u2(String str) {
        if (g == null) {
            return;
        }
        vm3.o(vm3.a, vm3.i, str);
    }

    private static boolean u3() {
        return u1() && x1();
    }

    private static wj3 v0(Context context) {
        if (context == null) {
            return null;
        }
        if (m0 == null) {
            m0 = new wj3(true);
        }
        return m0;
    }

    public static boolean v1() {
        return v;
    }

    public static void v2(String str) {
        n = str;
        if (g == null) {
            return;
        }
        vm3.o(vm3.a, vm3.K, "".equals(n) ? null : n);
    }

    public static void v3(boolean z2) {
        tk3 tk3Var = C;
        tk3Var.b("OneSignal startLocationShared: " + z2);
        H0().q(z2);
        if (z2) {
            return;
        }
        C.b("OneSignal is shareLocation set false, clearing last location!");
        an3.b();
    }

    private static kl3 w0(Context context) {
        if (context == null) {
            return null;
        }
        if (g0 == null) {
            g0 = new kl3(true);
        }
        return g0;
    }

    public static boolean w1() {
        return H.k();
    }

    public static void w2(String str) {
        o = str;
        if (g == null) {
            return;
        }
        vm3.o(vm3.a, vm3.N, "".equals(o) ? null : o);
    }

    private static void w3() {
        ej3.g(g, false, false, new g0());
    }

    public static void x(@x1 vj3 vj3Var) {
        if (g == null) {
            C.d("OneSignal.initWithContext has not been called. Could not add email subscription observer");
            return;
        }
        r0().a(vj3Var);
        if (g0(g).b(v0(g))) {
            OSEmailSubscriptionChangedInternalObserver.a(g0(g));
        }
    }

    private static pl3 x0(Context context) {
        if (context == null) {
            return null;
        }
        if (p0 == null) {
            p0 = new pl3(true);
        }
        return p0;
    }

    private static boolean x1() {
        long b2 = X0().b();
        long y02 = y0();
        long j2 = b2 - y02;
        tk3 tk3Var = C;
        tk3Var.b("isPastOnSessionTime currentTimeMillis: " + b2 + " lastSessionTime: " + y02 + " difference: " + j2);
        return j2 >= 30000;
    }

    public static void x2(String str) {
        m = str;
        if (g == null) {
            return;
        }
        vm3.o(vm3.a, vm3.j, m);
    }

    private static void x3() {
        if (Y) {
            return;
        }
        Y = true;
        if (w && an3.i()) {
            W = false;
        }
        w3();
        V = false;
        if (I0() != null) {
            d2();
        } else {
            H1(i, c1(), true);
        }
    }

    public static void y(q0 q0Var, l0 l0Var) {
        if (l0Var.equals(l0.NOTIFICATION_CLICK)) {
            return;
        }
        f.add(q0Var);
    }

    private static long y0() {
        return vm3.d(vm3.a, vm3.f, -31000L);
    }

    private static boolean y1() {
        return p == -999;
    }

    private static boolean y2() {
        boolean p2 = an3.p();
        tk3 tk3Var = C;
        tk3Var.b("OneSignal scheduleSyncService unsyncedChanges: " + p2);
        if (p2) {
            wl3.r().l(g);
        }
        boolean m2 = ej3.m(g);
        tk3 tk3Var2 = C;
        tk3Var2.b("OneSignal scheduleSyncService locationScheduled: " + m2);
        return m2 || p2;
    }

    public static void y3(boolean z2) {
        if (J.i(zl3.v)) {
            C.d("Waiting for remote params. Moving unsubscribeWhenNotificationsAreDisabled() operation to a pending task queue.");
            J.c(new e0(z2));
        } else if (H0().i()) {
            C.c("unsubscribeWhenNotificationsAreDisabled already called by remote params!, ignoring user set");
        } else {
            H0().v(z2);
        }
    }

    public static void z(JSONObject jSONObject) {
        try {
            jSONObject.put("net_type", U.j());
        } catch (Throwable unused) {
        }
    }

    private static OSSubscriptionState z0(Context context) {
        if (context == null) {
            return null;
        }
        if (j0 == null) {
            j0 = new OSSubscriptionState(true, false);
        }
        return j0;
    }

    public static boolean z1() {
        return H.l();
    }

    public static void z2(@x1 List<jk3> list) {
        il3 il3Var = O;
        if (il3Var != null && i != null) {
            il3Var.m(list);
        } else {
            a(u0.ERROR, "Make sure OneSignal.init is called first");
        }
    }

    public static void z3(String str) {
        v2(str);
        g0(g).i(str);
        try {
            an3.F(new JSONObject().put(un3.i, str));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }
}
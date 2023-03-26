package com.p7700g.p99005;

import android.os.Handler;
import android.os.HandlerThread;
import com.p7700g.p99005.an3;
import com.p7700g.p99005.ej3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xm3;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserStateSynchronizer.java */
/* loaded from: classes3.dex */
public abstract class un3 {
    private static final String a = "CURRENT_STATE";
    private static final String b = "TOSYNC_STATE";
    private static final String c = "session";
    private static final String d = "id";
    private static final String e = "errors";
    public static final String f = "identifier";
    public static final String g = "device_type";
    public static final String h = "device_player_id";
    public static final String i = "parent_player_id";
    public static final String j = "userSubscribePref";
    public static final String k = "androidPermission";
    public static final String l = "subscribableStatus";
    public static final String m = "tags";
    public static final String n = "language";
    public static final String o = "external_user_id";
    public static final String p = "email";
    public static final String q = "logoutEmail";
    public static final String r = "sms_number";
    public static final String s = "external_user_id_auth_hash";
    public static final String t = "email_auth_hash";
    public static final String u = "sms_auth_hash";
    public static final String v = "app_id";
    private mn3 G;
    private mn3 H;
    private an3.d x;
    private boolean y;
    public final Object w = new Object();
    private AtomicBoolean z = new AtomicBoolean();
    private final Queue<jm3.m0> A = new ConcurrentLinkedQueue();
    private final Queue<jm3.y0> B = new ConcurrentLinkedQueue();
    private final Queue<an3.b> C = new ConcurrentLinkedQueue();
    public HashMap<Integer, f> D = new HashMap<>();
    private final Object E = new a();
    public boolean F = false;

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class a {
        public a() {
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class b extends xm3.g {
        public b() {
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            jm3.u0 u0Var = jm3.u0.WARN;
            jm3.a(u0Var, "Failed last request. statusCode: " + i + "\nresponse: " + str);
            if (un3.this.a0(i, str, "already logged out of email")) {
                un3.this.U();
            } else if (un3.this.a0(i, str, "not a valid device_type")) {
                un3.this.O();
            } else {
                un3.this.N(i);
            }
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            un3.this.U();
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class c extends xm3.g {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ JSONObject b;

        public c(JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = jSONObject;
            this.b = jSONObject2;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            jm3.u0 u0Var = jm3.u0.ERROR;
            jm3.a(u0Var, "Failed PUT sync request with status code: " + i + " and response: " + str);
            synchronized (un3.this.w) {
                if (un3.this.a0(i, str, "No user with this id found")) {
                    un3.this.O();
                } else {
                    un3.this.N(i);
                }
            }
            if (this.a.has("tags")) {
                un3.this.f0(new jm3.m1(i, str));
            }
            if (this.a.has(un3.o)) {
                jm3.P1(u0Var, "Error setting external user id for push with status code: " + i + " and message: " + str);
                un3.this.u();
            }
            if (this.a.has("language")) {
                un3.this.p(new an3.c(i, str));
            }
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            synchronized (un3.this.w) {
                un3.this.B().t(this.b, this.a);
                un3.this.W(this.a);
            }
            if (this.a.has("tags")) {
                un3.this.g0();
            }
            if (this.a.has(un3.o)) {
                un3.this.v();
            }
            if (this.a.has("language")) {
                un3.this.q();
            }
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class d extends xm3.g {
        public final /* synthetic */ JSONObject a;
        public final /* synthetic */ JSONObject b;
        public final /* synthetic */ String c;

        public d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.a = jSONObject;
            this.b = jSONObject2;
            this.c = str;
        }

        @Override // com.p7700g.p99005.xm3.g
        public void a(int i, String str, Throwable th) {
            synchronized (un3.this.w) {
                un3.this.F = false;
                jm3.u0 u0Var = jm3.u0.WARN;
                jm3.a(u0Var, "Failed last request. statusCode: " + i + "\nresponse: " + str);
                if (un3.this.a0(i, str, "not a valid device_type")) {
                    un3.this.O();
                } else {
                    un3.this.N(i);
                }
            }
        }

        @Override // com.p7700g.p99005.xm3.g
        public void b(String str) {
            synchronized (un3.this.w) {
                un3 un3Var = un3.this;
                un3Var.F = false;
                un3Var.B().t(this.a, this.b);
                try {
                    jm3.u0 u0Var = jm3.u0.DEBUG;
                    jm3.P1(u0Var, "doCreateOrNewSession:response: " + str);
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("id")) {
                        String optString = jSONObject.optString("id");
                        un3.this.p0(optString);
                        jm3.u0 u0Var2 = jm3.u0.INFO;
                        jm3.a(u0Var2, "Device registered, UserId = " + optString);
                    } else {
                        jm3.u0 u0Var3 = jm3.u0.INFO;
                        jm3.a(u0Var3, "session sent, UserId = " + this.c);
                    }
                    un3.this.L().u("session", Boolean.FALSE);
                    un3.this.L().s();
                    if (jSONObject.has(dk3.c)) {
                        jm3.u0().u0(jSONObject.getJSONArray(dk3.c));
                    }
                    un3.this.W(this.b);
                } catch (JSONException e) {
                    jm3.b(jm3.u0.ERROR, "ERROR parsing on_session or create JSON Response.", e);
                }
            }
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public static class e {
        public boolean a;
        public JSONObject b;

        public e(boolean z, JSONObject jSONObject) {
            this.a = z;
            this.b = jSONObject;
        }
    }

    /* compiled from: UserStateSynchronizer.java */
    /* loaded from: classes3.dex */
    public class f extends HandlerThread {
        private static final String s = "OSH_NetworkHandlerThread_";
        public static final int t = 0;
        public static final int u = 3;
        public static final int v = 5000;
        public int w;
        public Handler x;
        public int y;

        /* compiled from: UserStateSynchronizer.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!un3.this.z.get()) {
                    un3.this.n0(false);
                }
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public f(int i) {
            super(r0.toString());
            StringBuilder G = wo1.G(s);
            G.append(un3.this.x);
            this.w = i;
            start();
            this.x = new Handler(getLooper());
        }

        private Runnable b() {
            if (this.w != 0) {
                return null;
            }
            return new a();
        }

        public boolean a() {
            boolean hasMessages;
            synchronized (this.x) {
                boolean z = this.y < 3;
                boolean hasMessages2 = this.x.hasMessages(0);
                if (z && !hasMessages2) {
                    this.y++;
                    this.x.postDelayed(b(), this.y * 15000);
                }
                hasMessages = this.x.hasMessages(0);
            }
            return hasMessages;
        }

        public void c() {
            if (un3.this.y) {
                synchronized (this.x) {
                    this.y = 0;
                    this.x.removeCallbacksAndMessages(null);
                    this.x.postDelayed(b(), 5000L);
                }
            }
        }

        public void d() {
            this.x.removeCallbacksAndMessages(null);
        }
    }

    public un3(an3.d dVar) {
        this.x = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(int i2) {
        if (i2 == 403) {
            jm3.a(jm3.u0.FATAL, "403 error updating player, omitting further retries!");
            x();
        } else if (F(0).a()) {
        } else {
            x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        jm3.a(jm3.u0.WARN, "Creating new player based on missing player_id noted above.");
        jm3.k1();
        Z();
        p0(null);
        c0();
    }

    private void R(boolean z) {
        String D = D();
        if (l0() && D != null) {
            s(D);
            return;
        }
        if (this.G == null) {
            Q();
        }
        boolean z2 = !z && S();
        synchronized (this.w) {
            JSONObject d2 = B().d(K(), z2);
            JSONObject f2 = B().f(K(), null);
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, "UserStateSynchronizer internalSyncUserState from session call: " + z2 + " jsonBody: " + d2);
            if (d2 == null) {
                B().t(f2, null);
                g0();
                v();
                q();
                return;
            }
            K().s();
            if (!z2) {
                t(D, d2, f2);
            } else {
                r(D, d2, f2);
            }
        }
    }

    private boolean S() {
        return (K().j().d("session") || D() == null) && !this.F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        K().x(q);
        this.H.x(t);
        this.H.z(i);
        this.H.z("email");
        this.H.s();
        B().x(t);
        B().z(i);
        String j2 = B().m().j("email");
        B().z("email");
        an3.y();
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "Device successfully logged out of email: " + j2);
        jm3.k1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a0(int i2, String str, String str2) {
        if (i2 == 400 && str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has(e)) {
                    return jSONObject.optString(e).contains(str2);
                }
                return false;
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(jm3.m1 m1Var) {
        while (true) {
            jm3.m0 poll = this.A.poll();
            if (poll == null) {
                return;
            }
            poll.b(m1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0() {
        JSONObject jSONObject = an3.j(false).b;
        while (true) {
            jm3.m0 poll = this.A.poll();
            if (poll == null) {
                return;
            }
            poll.a(jSONObject);
        }
    }

    private boolean l0() {
        return K().j().e(q, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(an3.c cVar) {
        while (true) {
            an3.b poll = this.C.poll();
            if (poll == null) {
                return;
            }
            poll.a(cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        String d2 = an3.d();
        while (true) {
            an3.b poll = this.C.poll();
            if (poll == null) {
                return;
            }
            poll.onSuccess(d2);
        }
    }

    private void r(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String u2 = str == null ? "players" : wo1.u("players/", str, "/on_session");
        this.F = true;
        n(jSONObject);
        xm3.k(u2, jSONObject, new d(jSONObject2, jSONObject, str));
    }

    private void s(String str) {
        String u2 = wo1.u("players/", str, "/email_logout");
        JSONObject jSONObject = new JSONObject();
        try {
            aj3 j2 = B().j();
            if (j2.b(t)) {
                jSONObject.put(t, j2.j(t));
            }
            aj3 m2 = B().m();
            if (m2.b(i)) {
                jSONObject.put(i, m2.j(i));
            }
            jSONObject.put("app_id", m2.j("app_id"));
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        xm3.k(u2, jSONObject, new b());
    }

    private void t(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (str == null) {
            jm3.P1(E(), "Error updating the user record because of the null user id");
            f0(new jm3.m1(-1, "Unable to update tags: the current user is not registered with OneSignal"));
            u();
            p(new an3.c(-1, "Unable to set Language: the current user is not registered with OneSignal"));
            return;
        }
        xm3.m(wo1.t("players/", str), jSONObject, new c(jSONObject, jSONObject2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        while (true) {
            jm3.y0 poll = this.B.poll();
            if (poll == null) {
                return;
            }
            poll.a(z(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        while (true) {
            jm3.y0 poll = this.B.poll();
            if (poll == null) {
                return;
            }
            poll.a(z(), true);
        }
    }

    private void x() {
        JSONObject d2 = B().d(this.H, false);
        if (d2 != null) {
            w(d2);
        }
        if (K().j().e(q, false)) {
            jm3.g1();
        }
    }

    public an3.d A() {
        return this.x;
    }

    public mn3 B() {
        if (this.G == null) {
            synchronized (this.w) {
                if (this.G == null) {
                    this.G = V(a, true);
                }
            }
        }
        return this.G;
    }

    @z1
    public abstract String C(boolean z);

    public abstract String D();

    public abstract jm3.u0 E();

    public f F(Integer num) {
        f fVar;
        synchronized (this.E) {
            if (!this.D.containsKey(num)) {
                this.D.put(num, new f(num.intValue()));
            }
            fVar = this.D.get(num);
        }
        return fVar;
    }

    public String G() {
        return K().m().k(f, null);
    }

    public abstract boolean H();

    public boolean I() {
        return L().j().d("session");
    }

    public abstract e J(boolean z);

    public mn3 K() {
        if (this.H == null) {
            synchronized (this.w) {
                if (this.H == null) {
                    this.H = V(b, true);
                }
            }
        }
        return this.H;
    }

    public mn3 L() {
        if (this.H == null) {
            this.H = B().c(b);
        }
        c0();
        return this.H;
    }

    public abstract boolean M();

    public boolean P() {
        return this.B.size() > 0;
    }

    public void Q() {
        if (this.G == null) {
            synchronized (this.w) {
                if (this.G == null) {
                    this.G = V(a, true);
                }
            }
        }
        K();
    }

    public abstract void T();

    public abstract mn3 V(String str, boolean z);

    public abstract void W(JSONObject jSONObject);

    public boolean X() {
        boolean z;
        if (this.H != null) {
            synchronized (this.w) {
                z = B().d(this.H, S()) != null;
                this.H.s();
            }
            return z;
        }
        return false;
    }

    public void Y(boolean z) {
        boolean z2 = this.y != z;
        this.y = z;
        if (z2 && z) {
            c0();
        }
    }

    public void Z() {
        B().D(new JSONObject());
        B().s();
    }

    public abstract void b0(String str);

    public abstract void c0();

    public void d0(JSONObject jSONObject, xm3.g gVar) {
        StringBuilder G = wo1.G("players/");
        G.append(D());
        G.append("/on_purchase");
        xm3.j(G.toString(), jSONObject, gVar);
    }

    public void e0(JSONObject jSONObject, @z1 jm3.m0 m0Var) {
        if (m0Var != null) {
            this.A.add(m0Var);
        }
        L().h(jSONObject, null);
    }

    public void h0(String str, String str2, jm3.y0 y0Var) throws JSONException {
        if (y0Var != null) {
            this.B.add(y0Var);
        }
        mn3 L = L();
        L.v(o, str);
        if (str2 != null) {
            L.v(s, str2);
        }
    }

    public void i0() {
        try {
            synchronized (this.w) {
                L().u("session", Boolean.TRUE);
                L().s();
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public void m0(JSONObject jSONObject) {
        L().h(jSONObject, null);
    }

    public abstract void n(JSONObject jSONObject);

    public void n0(boolean z) {
        this.z.set(true);
        R(z);
        this.z.set(false);
    }

    public void o() {
        K().b();
        K().s();
    }

    public void o0(JSONObject jSONObject, @z1 an3.b bVar) {
        if (bVar != null) {
            this.C.add(bVar);
        }
        L().h(jSONObject, null);
    }

    public abstract void p0(String str);

    public void q0(ej3.d dVar) {
        L().C(dVar);
    }

    public abstract void r0(JSONObject jSONObject);

    public abstract void w(JSONObject jSONObject);

    public JSONObject y(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Set<String> set) {
        JSONObject c2;
        synchronized (this.w) {
            c2 = dj3.c(jSONObject, jSONObject2, jSONObject3, set);
        }
        return c2;
    }

    public String z() {
        return this.x.name().toLowerCase();
    }
}
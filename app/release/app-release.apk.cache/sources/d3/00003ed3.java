package com.p7700g.p99005;

import android.app.AlertDialog;
import android.content.DialogInterface;
import com.onesignal.OSUtils;
import com.p7700g.p99005.ak3;
import com.p7700g.p99005.gn3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qk3;
import com.p7700g.p99005.tj3;
import com.p7700g.p99005.xl3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessageController.java */
/* loaded from: classes3.dex */
public class dk3 extends qj3 implements tj3.c, xl3.c {
    private static final String b = "OS_IAM_DB_ACCESS";
    public static final String c = "in_app_messages";
    private static final String d = "\n\n<script>\n    setPlayerTags(%s);\n</script>";
    private final tk3 f;
    private final yl3 g;
    private final go3 h;
    private xl3 i;
    private qk3 j;
    private hk3 k;
    public fm3 l;
    @x1
    private final Set<String> n;
    @x1
    private final Set<String> o;
    @x1
    private final Set<String> p;
    @x1
    private final Set<String> q;
    @x1
    private final ArrayList<gk3> r;
    @z1
    public Date z;
    private static final Object a = new Object();
    private static ArrayList<String> e = new i();
    @z1
    private List<gk3> s = null;
    private nk3 t = null;
    private boolean u = true;
    private boolean v = false;
    @z1
    private String w = "";
    @z1
    private bk3 x = null;
    private boolean y = false;
    @x1
    private ArrayList<gk3> m = new ArrayList<>();

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class a implements qk3.i {
        public final /* synthetic */ String a;
        public final /* synthetic */ gk3 b;

        public a(String str, gk3 gk3Var) {
            this.a = str;
            this.b = gk3Var;
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onFailure(String str) {
            dk3.this.q.remove(this.a);
            this.b.p(this.a);
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onSuccess(String str) {
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class b extends ji3 {
        public final /* synthetic */ gk3 s;

        public b(gk3 gk3Var) {
            this.s = gk3Var;
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            dk3.this.j.A(this.s);
            dk3.this.j.B(dk3.this.z);
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class c implements jm3.w0 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ gk3 b;

        public c(boolean z, gk3 gk3Var) {
            this.a = z;
            this.b = gk3Var;
        }

        @Override // com.p7700g.p99005.jm3.w0
        public void a(JSONObject jSONObject) {
            dk3.this.y = false;
            if (jSONObject != null) {
                dk3.this.w = jSONObject.toString();
            }
            if (dk3.this.x != null) {
                if (!this.a) {
                    jm3.R0().k(this.b.b);
                }
                bk3 bk3Var = dk3.this.x;
                dk3 dk3Var = dk3.this;
                bk3Var.h(dk3Var.F0(dk3Var.x.a()));
                vn3.J(this.b, dk3.this.x);
                dk3.this.x = null;
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class d implements qk3.i {
        public final /* synthetic */ gk3 a;

        public d(gk3 gk3Var) {
            this.a = gk3Var;
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onFailure(String str) {
            dk3.this.v = false;
            try {
                if (new JSONObject(str).getBoolean(qk3.a)) {
                    dk3.this.t0(this.a);
                } else {
                    dk3.this.h0(this.a, true);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onSuccess(String str) {
            try {
                bk3 q0 = dk3.this.q0(new JSONObject(str), this.a);
                if (q0.a() == null) {
                    dk3.this.f.b("displayMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (dk3.this.y) {
                    dk3.this.x = q0;
                } else {
                    jm3.R0().k(this.a.b);
                    dk3.this.o0(this.a);
                    q0.h(dk3.this.F0(q0.a()));
                    vn3.J(this.a, q0);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class e implements qk3.i {
        public final /* synthetic */ gk3 a;

        public e(gk3 gk3Var) {
            this.a = gk3Var;
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onFailure(String str) {
            dk3.this.H(null);
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onSuccess(String str) {
            try {
                bk3 q0 = dk3.this.q0(new JSONObject(str), this.a);
                if (q0.a() == null) {
                    dk3.this.f.b("displayPreviewMessage:OnSuccess: No HTML retrieved from loadMessageContent");
                } else if (dk3.this.y) {
                    dk3.this.x = q0;
                } else {
                    dk3.this.o0(this.a);
                    q0.h(dk3.this.F0(q0.a()));
                    vn3.J(this.a, q0);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class f extends ji3 {
        public f() {
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            dk3.this.j.h();
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class g implements Runnable {
        public final /* synthetic */ Map s;

        public g(Map map) {
            this.s = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk3.this.f.b("Delaying addTriggers due to redisplay data not retrieved yet");
            dk3.this.F(this.s.keySet());
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public final /* synthetic */ Collection s;

        public h(Collection collection) {
            this.s = collection;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk3.this.f.b("Delaying removeTriggersForKeys due to redisplay data not retrieved yet");
            dk3.this.F(this.s);
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class i extends ArrayList<String> {
        public i() {
            add(pt0.a);
            add("app");
            add("all");
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class j extends ji3 {
        public j() {
        }

        @Override // com.p7700g.p99005.ji3, java.lang.Runnable
        public void run() {
            super.run();
            synchronized (dk3.a) {
                dk3 dk3Var = dk3.this;
                dk3Var.s = dk3Var.j.k();
                tk3 tk3Var = dk3.this.f;
                tk3Var.b("Retrieved IAMs from DB redisplayedInAppMessages: " + dk3.this.s.toString());
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class k implements Runnable {
        public final /* synthetic */ JSONArray s;

        public k(JSONArray jSONArray) {
            this.s = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            dk3.this.w0();
            try {
                dk3.this.s0(this.s);
            } catch (JSONException e) {
                dk3.this.f.a("ERROR processing InAppMessageJson JSON Response.", e);
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class l implements Runnable {
        public l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            dk3.this.f.b("Delaying evaluateInAppMessages due to redisplay data not retrieved yet");
            dk3.this.K();
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class m implements qk3.i {
        public final /* synthetic */ gk3 a;

        public m(gk3 gk3Var) {
            this.a = gk3Var;
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onFailure(String str) {
            dk3.this.o.remove(this.a.b);
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onSuccess(String str) {
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class n implements jm3.c1 {
        public final /* synthetic */ gk3 a;
        public final /* synthetic */ List b;

        public n(gk3 gk3Var, List list) {
            this.a = gk3Var;
            this.b = list;
        }

        @Override // com.p7700g.p99005.jm3.c1
        public void a(jm3.j1 j1Var) {
            dk3.this.t = null;
            tk3 tk3Var = dk3.this.f;
            tk3Var.b("IAM prompt to handle finished with result: " + j1Var);
            gk3 gk3Var = this.a;
            if (!gk3Var.t || j1Var != jm3.j1.LOCATION_PERMISSIONS_MISSING_MANIFEST) {
                dk3.this.E0(gk3Var, this.b);
            } else {
                dk3.this.D0(gk3Var, this.b);
            }
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class o implements DialogInterface.OnClickListener {
        public final /* synthetic */ gk3 s;
        public final /* synthetic */ List t;

        public o(gk3 gk3Var, List list) {
            this.s = gk3Var;
            this.t = list;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            dk3.this.E0(this.s, this.t);
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class p implements Runnable {
        public final /* synthetic */ String s;
        public final /* synthetic */ ak3 t;

        public p(String str, ak3 ak3Var) {
            this.s = str;
            this.t = ak3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            jm3.R0().h(this.s);
            jm3.u.a(this.t);
        }
    }

    /* compiled from: OSInAppMessageController.java */
    /* loaded from: classes3.dex */
    public class q implements qk3.i {
        public final /* synthetic */ String a;

        public q(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onFailure(String str) {
            dk3.this.p.remove(this.a);
        }

        @Override // com.p7700g.p99005.qk3.i
        public void onSuccess(String str) {
        }
    }

    public dk3(rm3 rm3Var, yl3 yl3Var, tk3 tk3Var, sl3 sl3Var, go3 go3Var) {
        this.z = null;
        this.g = yl3Var;
        Set<String> N = OSUtils.N();
        this.n = N;
        this.r = new ArrayList<>();
        Set<String> N2 = OSUtils.N();
        this.o = N2;
        Set<String> N3 = OSUtils.N();
        this.p = N3;
        Set<String> N4 = OSUtils.N();
        this.q = N4;
        this.l = new fm3(this);
        this.i = new xl3(this);
        this.h = go3Var;
        this.f = tk3Var;
        qk3 U = U(rm3Var, tk3Var, sl3Var);
        this.j = U;
        Set<String> m2 = U.m();
        if (m2 != null) {
            N.addAll(m2);
        }
        Set<String> p2 = this.j.p();
        if (p2 != null) {
            N2.addAll(p2);
        }
        Set<String> s = this.j.s();
        if (s != null) {
            N3.addAll(s);
        }
        Set<String> l2 = this.j.l();
        if (l2 != null) {
            N4.addAll(l2);
        }
        Date q2 = this.j.q();
        if (q2 != null) {
            this.z = q2;
        }
        b0();
    }

    private boolean C0() {
        return this.t != null;
    }

    private void D() {
        synchronized (this.r) {
            if (!this.i.c()) {
                this.f.c("In app message not showing due to system condition not correct");
                return;
            }
            tk3 tk3Var = this.f;
            tk3Var.b("displayFirstIAMOnQueue: " + this.r);
            if (this.r.size() > 0 && !d0()) {
                this.f.b("No IAM showing currently, showing first item in the queue!");
                I(this.r.get(0));
                return;
            }
            tk3 tk3Var2 = this.f;
            tk3Var2.b("In app message is currently showing or there are no IAMs left in the queue! isInAppMessageShowing: " + d0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D0(gk3 gk3Var, List<nk3> list) {
        String string = jm3.g.getString(gn3.m.b0);
        new AlertDialog.Builder(jm3.f0()).setTitle(string).setMessage(jm3.g.getString(gn3.m.a0)).setPositiveButton(17039370, new o(gk3Var, list)).show();
    }

    private void E(gk3 gk3Var, List<nk3> list) {
        if (list.size() > 0) {
            tk3 tk3Var = this.f;
            StringBuilder G = wo1.G("IAM showing prompts from IAM: ");
            G.append(gk3Var.toString());
            tk3Var.b(G.toString());
            vn3.y();
            E0(gk3Var, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(gk3 gk3Var, List<nk3> list) {
        Iterator<nk3> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            nk3 next = it.next();
            if (!next.c()) {
                this.t = next;
                break;
            }
        }
        if (this.t != null) {
            tk3 tk3Var = this.f;
            StringBuilder G = wo1.G("IAM prompt to handle: ");
            G.append(this.t.toString());
            tk3Var.b(G.toString());
            this.t.d(true);
            this.t.b(new n(gk3Var, list));
            return;
        }
        tk3 tk3Var2 = this.f;
        StringBuilder G2 = wo1.G("No IAM prompt to handle, dismiss message: ");
        G2.append(gk3Var.b);
        tk3Var2.b(G2.toString());
        g0(gk3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Collection<String> collection) {
        f0(collection);
        K();
    }

    @z1
    private String G0(@x1 gk3 gk3Var) {
        String b2 = this.h.b();
        Iterator<String> it = e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (gk3Var.k.containsKey(next)) {
                HashMap<String, String> hashMap = gk3Var.k.get(next);
                if (hashMap.containsKey(b2)) {
                    return hashMap.get(b2);
                }
                return hashMap.get("default");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(@z1 gk3 gk3Var) {
        jm3.R0().i();
        if (C0()) {
            this.f.b("Stop evaluateMessageDisplayQueue because prompt is currently displayed");
            return;
        }
        this.v = false;
        synchronized (this.r) {
            if (gk3Var != null) {
                if (!gk3Var.t && this.r.size() > 0) {
                    if (!this.r.contains(gk3Var)) {
                        this.f.b("Message already removed from the queue!");
                        return;
                    }
                    String str = this.r.remove(0).b;
                    tk3 tk3Var = this.f;
                    tk3Var.b("In app message with id: " + str + ", dismissed (removed) from the queue!");
                }
            }
            if (this.r.size() > 0) {
                tk3 tk3Var2 = this.f;
                tk3Var2.b("In app message on queue available: " + this.r.get(0).b);
                I(this.r.get(0));
            } else {
                this.f.b("In app message dismissed evaluating messages");
                K();
            }
        }
    }

    private void I(@x1 gk3 gk3Var) {
        if (!this.u) {
            this.f.e("In app messaging is currently paused, in app messages will not be shown!");
            return;
        }
        this.v = true;
        W(gk3Var, false);
        this.j.n(jm3.i, gk3Var.b, G0(gk3Var), new d(gk3Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f.b("Starting evaluateInAppMessages");
        if (B0()) {
            this.g.c(new l());
            return;
        }
        Iterator<gk3> it = this.m.iterator();
        while (it.hasNext()) {
            gk3 next = it.next();
            if (this.l.c(next)) {
                y0(next);
                if (!this.n.contains(next.b) && !next.k()) {
                    t0(next);
                }
            }
        }
    }

    private void M(@x1 ak3 ak3Var) {
        if (ak3Var.d() == null || ak3Var.d().isEmpty()) {
            return;
        }
        if (ak3Var.i() == ak3.a.BROWSER) {
            OSUtils.Q(ak3Var.d());
        } else if (ak3Var.i() == ak3.a.IN_APP_WEBVIEW) {
            om3.b(ak3Var.d(), true);
        }
    }

    private void N(String str, @x1 List<jk3> list) {
        jm3.R0().h(str);
        jm3.z2(list);
    }

    private void O(@x1 String str, @x1 ak3 ak3Var) {
        if (jm3.u == null) {
            return;
        }
        OSUtils.V(new p(str, ak3Var));
    }

    private void P(@x1 gk3 gk3Var, @x1 ak3 ak3Var) {
        String G0 = G0(gk3Var);
        if (G0 == null) {
            return;
        }
        String b2 = ak3Var.b();
        if ((gk3Var.h().g() && gk3Var.i(b2)) || !this.q.contains(b2)) {
            this.q.add(b2);
            gk3Var.c(b2);
            this.j.D(jm3.i, jm3.c1(), G0, new OSUtils().f(), gk3Var.b, b2, ak3Var.j(), this.q, new a(b2, gk3Var));
        }
    }

    private void Q(@x1 gk3 gk3Var, @x1 kk3 kk3Var) {
        String G0 = G0(gk3Var);
        if (G0 == null) {
            return;
        }
        String a2 = kk3Var.a();
        String C = wo1.C(new StringBuilder(), gk3Var.b, a2);
        if (this.p.contains(C)) {
            tk3 tk3Var = this.f;
            tk3Var.e("Already sent page impression for id: " + a2);
            return;
        }
        this.p.add(C);
        this.j.F(jm3.i, jm3.c1(), G0, new OSUtils().f(), gk3Var.b, a2, this.p, new q(C));
    }

    private void R(@x1 ak3 ak3Var) {
        if (ak3Var.h() != null) {
            rk3 h2 = ak3Var.h();
            if (h2.a() != null) {
                jm3.H2(h2.a());
            }
            if (h2.b() != null) {
                jm3.R(h2.b(), null);
            }
        }
    }

    private void W(@x1 gk3 gk3Var, boolean z) {
        this.y = false;
        if (z || gk3Var.g()) {
            this.y = true;
            jm3.U0(new c(z, gk3Var));
        }
    }

    private boolean Z(gk3 gk3Var) {
        if (this.l.h(gk3Var)) {
            return !gk3Var.j();
        }
        return gk3Var.l() || (!gk3Var.j() && gk3Var.l.isEmpty());
    }

    private void e0(ak3 ak3Var) {
        if (ak3Var.h() != null) {
            tk3 tk3Var = this.f;
            StringBuilder G = wo1.G("Tags detected inside of the action click payload, ignoring because action came from IAM preview:: ");
            G.append(ak3Var.h().toString());
            tk3Var.b(G.toString());
        }
        if (ak3Var.e().size() > 0) {
            tk3 tk3Var2 = this.f;
            StringBuilder G2 = wo1.G("Outcomes detected inside of the action click payload, ignoring because action came from IAM preview: ");
            G2.append(ak3Var.e().toString());
            tk3Var2.b(G2.toString());
        }
    }

    private void f0(Collection<String> collection) {
        Iterator<gk3> it = this.m.iterator();
        while (it.hasNext()) {
            gk3 next = it.next();
            if (!next.l() && this.s.contains(next) && this.l.g(next, collection)) {
                tk3 tk3Var = this.f;
                StringBuilder G = wo1.G("Trigger changed for message: ");
                G.append(next.toString());
                tk3Var.b(G.toString());
                next.u(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public bk3 q0(JSONObject jSONObject, gk3 gk3Var) {
        bk3 bk3Var = new bk3(jSONObject);
        gk3Var.q(bk3Var.b().doubleValue());
        return bk3Var;
    }

    private void r0(gk3 gk3Var) {
        gk3Var.h().l(jm3.X0().b() / 1000);
        gk3Var.h().e();
        gk3Var.u(false);
        gk3Var.r(true);
        d(new b(gk3Var), b);
        int indexOf = this.s.indexOf(gk3Var);
        if (indexOf != -1) {
            this.s.set(indexOf, gk3Var);
        } else {
            this.s.add(gk3Var);
        }
        tk3 tk3Var = this.f;
        StringBuilder G = wo1.G("persistInAppMessageForRedisplay: ");
        G.append(gk3Var.toString());
        G.append(" with msg array data: ");
        G.append(this.s.toString());
        tk3Var.b(G.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(@x1 JSONArray jSONArray) throws JSONException {
        synchronized (a) {
            ArrayList<gk3> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                gk3 gk3Var = new gk3(jSONArray.getJSONObject(i2));
                if (gk3Var.b != null) {
                    arrayList.add(gk3Var);
                }
            }
            this.m = arrayList;
        }
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(@x1 gk3 gk3Var) {
        synchronized (this.r) {
            if (!this.r.contains(gk3Var)) {
                this.r.add(gk3Var);
                tk3 tk3Var = this.f;
                tk3Var.b("In app message with id: " + gk3Var.b + ", added to the queue");
            }
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        for (gk3 gk3Var : this.s) {
            gk3Var.r(false);
        }
    }

    private void y0(gk3 gk3Var) {
        boolean contains = this.n.contains(gk3Var.b);
        int indexOf = this.s.indexOf(gk3Var);
        if (!contains || indexOf == -1) {
            return;
        }
        gk3 gk3Var2 = this.s.get(indexOf);
        gk3Var.h().k(gk3Var2.h());
        gk3Var.r(gk3Var2.j());
        boolean Z = Z(gk3Var);
        tk3 tk3Var = this.f;
        StringBuilder G = wo1.G("setDataForRedisplay: ");
        G.append(gk3Var.toString());
        G.append(" triggerHasChanged: ");
        G.append(Z);
        tk3Var.b(G.toString());
        if (Z && gk3Var.h().f() && gk3Var.h().m()) {
            tk3 tk3Var2 = this.f;
            StringBuilder G2 = wo1.G("setDataForRedisplay message available for redisplay: ");
            G2.append(gk3Var.b);
            tk3Var2.b(G2.toString());
            this.n.remove(gk3Var.b);
            this.o.remove(gk3Var.b);
            this.p.clear();
            this.j.C(this.p);
            gk3Var.d();
        }
    }

    public void A0(boolean z) {
        this.u = z;
        if (z) {
            K();
        }
    }

    public boolean B0() {
        boolean z;
        synchronized (a) {
            z = this.s == null && this.g.f();
        }
        return z;
    }

    public void C(@x1 Map<String, Object> map) {
        tk3 tk3Var = this.f;
        StringBuilder G = wo1.G("Triggers added: ");
        G.append(map.toString());
        tk3Var.b(G.toString());
        this.l.a(map);
        if (B0()) {
            this.g.c(new g(map));
        } else {
            F(map.keySet());
        }
    }

    @x1
    public String F0(@x1 String str) {
        String str2 = this.w;
        StringBuilder G = wo1.G(str);
        G.append(String.format(d, str2));
        return G.toString();
    }

    public void G() {
        d(new f(), b);
    }

    public void J(@x1 String str) {
        this.v = true;
        gk3 gk3Var = new gk3(true);
        W(gk3Var, true);
        this.j.o(jm3.i, str, new e(gk3Var));
    }

    public void L(Runnable runnable) {
        synchronized (a) {
            if (B0()) {
                this.f.b("Delaying task due to redisplay data not retrieved yet");
                this.g.c(runnable);
            } else {
                runnable.run();
            }
        }
    }

    @z1
    public gk3 S() {
        if (this.v) {
            return this.r.get(0);
        }
        return null;
    }

    @x1
    public ArrayList<gk3> T() {
        return this.r;
    }

    public qk3 U(rm3 rm3Var, tk3 tk3Var, sl3 sl3Var) {
        if (this.j == null) {
            this.j = new qk3(rm3Var, tk3Var, sl3Var);
        }
        return this.j;
    }

    @x1
    public List<gk3> V() {
        return this.s;
    }

    @z1
    public Object X(String str) {
        return this.l.e(str);
    }

    public Map<String, Object> Y() {
        return new HashMap(this.l.f());
    }

    @Override // com.p7700g.p99005.tj3.c
    public void a() {
        this.f.b("messageTriggerConditionChanged called");
        K();
    }

    public boolean a0() {
        return this.u;
    }

    @Override // com.p7700g.p99005.tj3.c
    public void b(String str) {
        tk3 tk3Var = this.f;
        tk3Var.b("messageDynamicTriggerCompleted called with triggerId: " + str);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        f0(hashSet);
    }

    public void b0() {
        this.g.c(new j());
        this.g.h();
    }

    @Override // com.p7700g.p99005.xl3.c
    public void c() {
        D();
    }

    public void c0() {
        if (!this.m.isEmpty()) {
            tk3 tk3Var = this.f;
            StringBuilder G = wo1.G("initWithCachedInAppMessages with already in memory messages: ");
            G.append(this.m);
            tk3Var.b(G.toString());
            return;
        }
        String r = this.j.r();
        tk3 tk3Var2 = this.f;
        tk3Var2.b("initWithCachedInAppMessages: " + r);
        if (r == null || r.isEmpty()) {
            return;
        }
        synchronized (a) {
            try {
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            if (this.m.isEmpty()) {
                s0(new JSONArray(r));
            }
        }
    }

    public boolean d0() {
        return this.v;
    }

    public void g0(@x1 gk3 gk3Var) {
        h0(gk3Var, false);
    }

    public void h0(@x1 gk3 gk3Var, boolean z) {
        if (!gk3Var.t) {
            this.n.add(gk3Var.b);
            if (!z) {
                this.j.x(this.n);
                this.z = new Date();
                r0(gk3Var);
            }
            tk3 tk3Var = this.f;
            StringBuilder G = wo1.G("OSInAppMessageController messageWasDismissed dismissedMessages: ");
            G.append(this.n.toString());
            tk3Var.b(G.toString());
        }
        if (!C0()) {
            k0(gk3Var);
        }
        H(gk3Var);
    }

    public void i0(@x1 gk3 gk3Var, @x1 JSONObject jSONObject) throws JSONException {
        ak3 ak3Var = new ak3(jSONObject);
        ak3Var.m(gk3Var.v());
        O(gk3Var.b, ak3Var);
        E(gk3Var, ak3Var.g());
        M(ak3Var);
        P(gk3Var, ak3Var);
        R(ak3Var);
        N(gk3Var.b, ak3Var.e());
    }

    public void j0(@x1 gk3 gk3Var, @x1 JSONObject jSONObject) throws JSONException {
        ak3 ak3Var = new ak3(jSONObject);
        ak3Var.m(gk3Var.v());
        O(gk3Var.b, ak3Var);
        E(gk3Var, ak3Var.g());
        M(ak3Var);
        e0(ak3Var);
    }

    public void k0(@x1 gk3 gk3Var) {
        hk3 hk3Var = this.k;
        if (hk3Var == null) {
            this.f.e("OSInAppMessageController onMessageDidDismiss: inAppMessageLifecycleHandler is null");
        } else {
            hk3Var.a(gk3Var);
        }
    }

    public void l0(@x1 gk3 gk3Var) {
        hk3 hk3Var = this.k;
        if (hk3Var == null) {
            this.f.e("OSInAppMessageController onMessageDidDisplay: inAppMessageLifecycleHandler is null");
        } else {
            hk3Var.b(gk3Var);
        }
    }

    public void m0(@x1 gk3 gk3Var) {
        l0(gk3Var);
        if (gk3Var.t || this.o.contains(gk3Var.b)) {
            return;
        }
        this.o.add(gk3Var.b);
        String G0 = G0(gk3Var);
        if (G0 == null) {
            return;
        }
        this.j.E(jm3.i, jm3.c1(), G0, new OSUtils().f(), gk3Var.b, this.o, new m(gk3Var));
    }

    public void n0(@x1 gk3 gk3Var) {
        hk3 hk3Var = this.k;
        if (hk3Var == null) {
            this.f.e("OSInAppMessageController onMessageWillDismiss: inAppMessageLifecycleHandler is null");
        } else {
            hk3Var.c(gk3Var);
        }
    }

    public void o0(@x1 gk3 gk3Var) {
        hk3 hk3Var = this.k;
        if (hk3Var == null) {
            this.f.e("OSInAppMessageController onMessageWillDisplay: inAppMessageLifecycleHandler is null");
        } else {
            hk3Var.d(gk3Var);
        }
    }

    public void p0(@x1 gk3 gk3Var, @x1 JSONObject jSONObject) {
        kk3 kk3Var = new kk3(jSONObject);
        if (gk3Var.t) {
            return;
        }
        Q(gk3Var, kk3Var);
    }

    public void u0(@x1 JSONArray jSONArray) throws JSONException {
        this.j.y(jSONArray.toString());
        L(new k(jSONArray));
    }

    public void v0(Collection<String> collection) {
        tk3 tk3Var = this.f;
        StringBuilder G = wo1.G("Triggers key to remove: ");
        G.append(collection.toString());
        tk3Var.b(G.toString());
        this.l.i(collection);
        if (B0()) {
            this.g.c(new h(collection));
        } else {
            F(collection);
        }
    }

    public void x0() {
        tj3.e();
    }

    public void z0(@z1 hk3 hk3Var) {
        this.k = hk3Var;
    }
}
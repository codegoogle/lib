package com.p7700g.p99005;

import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.xm3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: FocusTimeController.java */
/* loaded from: classes3.dex */
public class si3 {
    @z1
    private Long a;
    private yj3 b;
    private tk3 c;

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes3.dex */
    public enum a {
        BACKGROUND,
        END_SESSION
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes3.dex */
    public static class b extends c {
        public b() {
            this.a = 1L;
            this.b = vm3.l;
        }

        @Override // com.p7700g.p99005.si3.c
        public void h(@x1 JSONObject jSONObject) {
            jm3.R0().b(jSONObject, j());
        }

        @Override // com.p7700g.p99005.si3.c
        public List<do3> j() {
            ArrayList arrayList = new ArrayList();
            for (String str : vm3.h(vm3.a, vm3.J, new HashSet())) {
                try {
                    arrayList.add(new do3(str));
                } catch (JSONException e) {
                    jm3.u0 u0Var = jm3.u0.ERROR;
                    jm3.a(u0Var, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e);
                }
            }
            return arrayList;
        }

        @Override // com.p7700g.p99005.si3.c
        public void m(List<do3> list) {
            HashSet hashSet = new HashSet();
            for (do3 do3Var : list) {
                try {
                    hashSet.add(do3Var.h());
                } catch (JSONException e) {
                    jm3.u0 u0Var = jm3.u0.ERROR;
                    jm3.a(u0Var, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e);
                }
            }
            vm3.p(vm3.a, vm3.J, hashSet);
        }

        @Override // com.p7700g.p99005.si3.c
        public void r(@x1 a aVar) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                u();
            } else {
                wl3.r().l(jm3.g);
            }
        }
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes3.dex */
    public static abstract class c {
        public long a;
        @x1
        public String b;
        @z1
        private Long c = null;
        @x1
        private final AtomicBoolean d = new AtomicBoolean();

        /* compiled from: FocusTimeController.java */
        /* loaded from: classes3.dex */
        public class a extends xm3.g {
            public a() {
            }

            @Override // com.p7700g.p99005.xm3.g
            public void a(int i, String str, Throwable th) {
                jm3.C1("sending on_focus Failed", i, th, str);
            }

            @Override // com.p7700g.p99005.xm3.g
            public void b(String str) {
                c.this.o(0L);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(long j, @x1 List<do3> list, @x1 a aVar) {
            n(j, list);
            t(aVar);
        }

        @x1
        private JSONObject i(long j) throws JSONException {
            JSONObject put = new JSONObject().put("app_id", jm3.M0()).put("type", 1).put(CallMraidJS.b, "ping").put("active_time", j).put("device_type", new OSUtils().f());
            jm3.z(put);
            return put;
        }

        private long k() {
            if (this.c == null) {
                this.c = Long.valueOf(vm3.d(vm3.a, this.b, 0L));
            }
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.c);
            return this.c.longValue();
        }

        private boolean l() {
            return k() >= this.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(long j, @x1 List<do3> list) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            m(list);
            o(k() + j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j) {
            this.c = Long.valueOf(j);
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.c);
            vm3.m(vm3.a, this.b, j);
        }

        private void p(long j) {
            try {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                jm3.a(u0Var, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j);
                JSONObject i = i(j);
                h(i);
                q(jm3.c1(), i);
                if (jm3.m1()) {
                    q(jm3.p0(), i(j));
                }
                if (jm3.n1()) {
                    q(jm3.J0(), i(j));
                }
                m(new ArrayList());
            } catch (JSONException e) {
                jm3.b(jm3.u0.ERROR, "Generating on_focus:JSON Failed.", e);
            }
        }

        private void q(@x1 String str, @x1 JSONObject jSONObject) {
            a aVar = new a();
            xm3.k("players/" + str + "/on_focus", jSONObject, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s() {
            List<do3> j = j();
            long k = k();
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + k + " and influences: " + j.toString());
            t(a.BACKGROUND);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(a aVar) {
            if (!jm3.o1()) {
                jm3.u0 u0Var = jm3.u0.WARN;
                jm3.a(u0Var, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
                return;
            }
            r(aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void v() {
            if (l()) {
                u();
            }
        }

        public void h(@x1 JSONObject jSONObject) {
        }

        public abstract List<do3> j();

        public abstract void m(List<do3> list);

        public abstract void r(@x1 a aVar);

        @s2
        public void u() {
            if (this.d.get()) {
                return;
            }
            synchronized (this.d) {
                this.d.set(true);
                if (l()) {
                    p(k());
                }
                this.d.set(false);
            }
        }

        public void w() {
            if (l()) {
                wl3.r().l(jm3.g);
            }
        }
    }

    /* compiled from: FocusTimeController.java */
    /* loaded from: classes3.dex */
    public static class d extends c {
        public d() {
            this.a = 60L;
            this.b = vm3.k;
        }

        @Override // com.p7700g.p99005.si3.c
        public List<do3> j() {
            return new ArrayList();
        }

        @Override // com.p7700g.p99005.si3.c
        public void m(List<do3> list) {
        }

        @Override // com.p7700g.p99005.si3.c
        public void r(@x1 a aVar) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.P1(u0Var, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                return;
            }
            w();
        }
    }

    public si3(yj3 yj3Var, tk3 tk3Var) {
        this.b = yj3Var;
        this.c = tk3Var;
    }

    @z1
    private Long e() {
        if (this.a == null) {
            return null;
        }
        long a2 = (long) (((jm3.X0().a() - this.a.longValue()) / 1000.0d) + 0.5d);
        if (a2 < 1 || a2 > com.anythink.expressad.d.a.b.aT) {
            return null;
        }
        return Long.valueOf(a2);
    }

    private boolean f(@x1 List<do3> list, @x1 a aVar) {
        Long e = e();
        if (e == null) {
            return false;
        }
        this.b.c(list).g(e.longValue(), list, aVar);
        return true;
    }

    public void a() {
        tk3 tk3Var = this.c;
        StringBuilder G = wo1.G("Application backgrounded focus time: ");
        G.append(this.a);
        tk3Var.b(G.toString());
        this.b.b().s();
        this.a = null;
    }

    public void b() {
        this.a = Long.valueOf(jm3.X0().a());
        tk3 tk3Var = this.c;
        StringBuilder G = wo1.G("Application foregrounded focus time: ");
        G.append(this.a);
        tk3Var.b(G.toString());
    }

    public void c() {
        Long e = e();
        tk3 tk3Var = this.c;
        StringBuilder G = wo1.G("Application stopped focus time: ");
        G.append(this.a);
        G.append(" timeElapsed: ");
        G.append(e);
        tk3Var.b(G.toString());
        if (e == null) {
            return;
        }
        List<do3> f = jm3.R0().f();
        this.b.c(f).n(e.longValue(), f);
    }

    public void d() {
        if (jm3.u1()) {
            return;
        }
        this.b.b().v();
    }

    public void g(@x1 List<do3> list) {
        a aVar = a.END_SESSION;
        if (f(list, aVar)) {
            return;
        }
        this.b.c(list).t(aVar);
    }
}
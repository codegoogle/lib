package com.p7700g.p99005;

import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: OSOutcomeEventsController.java */
/* loaded from: classes3.dex */
public class il3 {
    private static final String a = "OS_SAVE_OUTCOMES";
    private static final String b = "OS_SEND_SAVED_OUTCOMES";
    private static final String c = "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS";
    private static final String d = "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD";
    private Set<String> e;
    @x1
    private final po3 f;
    @x1
    private final rl3 g;

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            il3.this.f.b().f(qm3.b.a, "notification_id");
        }
    }

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            for (bp3 bp3Var : il3.this.f.b().b()) {
                il3.this.p(bp3Var);
            }
        }
    }

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public class c implements mm3 {
        public final /* synthetic */ bp3 a;

        public c(bp3 bp3Var) {
            this.a = bp3Var;
        }

        @Override // com.p7700g.p99005.mm3
        public void a(int i, String str, Throwable th) {
        }

        @Override // com.p7700g.p99005.mm3
        public void onSuccess(String str) {
            il3.this.f.b().i(this.a);
        }
    }

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public class d implements mm3 {
        public final /* synthetic */ bp3 a;
        public final /* synthetic */ jm3.h1 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ String d;

        /* compiled from: OSOutcomeEventsController.java */
        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setPriority(10);
                d dVar = d.this;
                dVar.a.f(dVar.c);
                il3.this.f.b().h(d.this.a);
            }
        }

        public d(bp3 bp3Var, jm3.h1 h1Var, long j, String str) {
            this.a = bp3Var;
            this.b = h1Var;
            this.c = j;
            this.d = str;
        }

        @Override // com.p7700g.p99005.mm3
        public void a(int i, String str, Throwable th) {
            new Thread(new a(), il3.a).start();
            jm3.u0 u0Var = jm3.u0.WARN;
            StringBuilder G = wo1.G("Sending outcome with name: ");
            G.append(this.d);
            G.append(" failed with status code: ");
            G.append(i);
            G.append(" and response: ");
            G.append(str);
            G.append("\nOutcome event was cached and will be reattempted on app cold start");
            jm3.P1(u0Var, G.toString());
            jm3.h1 h1Var = this.b;
            if (h1Var != null) {
                h1Var.a(null);
            }
        }

        @Override // com.p7700g.p99005.mm3
        public void onSuccess(String str) {
            il3.this.k(this.a);
            jm3.h1 h1Var = this.b;
            if (h1Var != null) {
                h1Var.a(hl3.a(this.a));
            }
        }
    }

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ bp3 s;

        public e(bp3 bp3Var) {
            this.s = bp3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            il3.this.f.b().e(this.s);
        }
    }

    /* compiled from: OSOutcomeEventsController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            eo3.values();
            int[] iArr = new int[2];
            b = iArr;
            try {
                iArr[eo3.IAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[eo3.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            fo3.values();
            int[] iArr2 = new int[4];
            a = iArr2;
            try {
                iArr2[fo3.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[fo3.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[fo3.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[fo3.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public il3(@x1 rl3 rl3Var, @x1 po3 po3Var) {
        this.g = rl3Var;
        this.f = po3Var;
        g();
    }

    private List<do3> f(String str, List<do3> list) {
        List<do3> a2 = this.f.b().a(str, list);
        if (a2.size() > 0) {
            return a2;
        }
        return null;
    }

    private void g() {
        this.e = OSUtils.N();
        Set<String> g = this.f.b().g();
        if (g != null) {
            this.e = g;
        }
    }

    private List<do3> h(List<do3> list) {
        ArrayList arrayList = new ArrayList(list);
        for (do3 do3Var : list) {
            if (do3Var.e().h()) {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                StringBuilder G = wo1.G("Outcomes disabled for channel: ");
                G.append(do3Var.d().toString());
                jm3.P1(u0Var, G.toString());
                arrayList.remove(do3Var);
            }
        }
        return arrayList;
    }

    private void i(bp3 bp3Var) {
        new Thread(new e(bp3Var), c).start();
    }

    private void j() {
        this.f.b().c(this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(bp3 bp3Var) {
        if (bp3Var.e()) {
            j();
        } else {
            i(bp3Var);
        }
    }

    private void l(@x1 String str, @x1 float f2, @x1 List<do3> list, @z1 jm3.h1 h1Var) {
        long b2 = jm3.X0().b() / 1000;
        int f3 = new OSUtils().f();
        String str2 = jm3.i;
        boolean z = false;
        ep3 ep3Var = null;
        ep3 ep3Var2 = null;
        for (do3 do3Var : list) {
            int ordinal = do3Var.e().ordinal();
            if (ordinal == 0) {
                if (ep3Var == null) {
                    ep3Var = new ep3();
                }
                ep3Var = t(do3Var, ep3Var);
            } else if (ordinal == 1) {
                if (ep3Var2 == null) {
                    ep3Var2 = new ep3();
                }
                ep3Var2 = t(do3Var, ep3Var2);
            } else if (ordinal == 2) {
                z = true;
            } else if (ordinal == 3) {
                jm3.u0 u0Var = jm3.u0.VERBOSE;
                StringBuilder G = wo1.G("Outcomes disabled for channel: ");
                G.append(do3Var.d());
                jm3.a(u0Var, G.toString());
                if (h1Var != null) {
                    h1Var.a(null);
                    return;
                }
                return;
            }
        }
        if (ep3Var == null && ep3Var2 == null && !z) {
            jm3.a(jm3.u0.VERBOSE, "Outcomes disabled for all channels");
            if (h1Var != null) {
                h1Var.a(null);
                return;
            }
            return;
        }
        bp3 bp3Var = new bp3(str, new dp3(ep3Var, ep3Var2), f2, 0L);
        this.f.b().d(str2, f3, bp3Var, new d(bp3Var, h1Var, b2, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(@x1 bp3 bp3Var) {
        int f2 = new OSUtils().f();
        this.f.b().d(jm3.i, f2, bp3Var, new c(bp3Var));
    }

    private void s(@x1 String str, @x1 List<do3> list, @z1 jm3.h1 h1Var) {
        List<do3> h = h(list);
        if (h.isEmpty()) {
            jm3.a(jm3.u0.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        boolean z = false;
        Iterator<do3> it = h.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (it.next().e().f()) {
                z = true;
                break;
            }
        }
        if (z) {
            List<do3> f2 = f(str, h);
            if (f2 == null) {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                StringBuilder G = wo1.G("Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: ");
                G.append(h.toString());
                G.append("\nOutcome name: ");
                G.append(str);
                jm3.a(u0Var, G.toString());
                if (h1Var != null) {
                    h1Var.a(null);
                    return;
                }
                return;
            }
            l(str, 0.0f, f2, h1Var);
        } else if (this.e.contains(str)) {
            jm3.u0 u0Var2 = jm3.u0.DEBUG;
            StringBuilder G2 = wo1.G("Measure endpoint will not send because unique outcome already sent for: \nSession: ");
            G2.append(fo3.UNATTRIBUTED);
            G2.append("\nOutcome name: ");
            G2.append(str);
            jm3.a(u0Var2, G2.toString());
            if (h1Var != null) {
                h1Var.a(null);
            }
        } else {
            this.e.add(str);
            l(str, 0.0f, h, h1Var);
        }
    }

    private ep3 t(do3 do3Var, ep3 ep3Var) {
        int ordinal = do3Var.d().ordinal();
        if (ordinal == 0) {
            ep3Var.c(do3Var.c());
        } else if (ordinal == 1) {
            ep3Var.d(do3Var.c());
        }
        return ep3Var;
    }

    public void d() {
        new Thread(new a(), d).start();
    }

    public void e() {
        jm3.a(jm3.u0.DEBUG, "OneSignal cleanOutcomes for session");
        this.e = OSUtils.N();
        j();
    }

    public void m(List<jk3> list) {
        for (jk3 jk3Var : list) {
            String a2 = jk3Var.a();
            if (jk3Var.c()) {
                r(a2, null);
            } else if (jk3Var.b() > 0.0f) {
                o(a2, jk3Var.b(), null);
            } else {
                n(a2, null);
            }
        }
    }

    public void n(@x1 String str, @z1 jm3.h1 h1Var) {
        l(str, 0.0f, this.g.e(), h1Var);
    }

    public void o(@x1 String str, float f2, @z1 jm3.h1 h1Var) {
        l(str, f2, this.g.e(), h1Var);
    }

    public void q() {
        new Thread(new b(), b).start();
    }

    public void r(@x1 String str, @z1 jm3.h1 h1Var) {
        s(str, this.g.e(), h1Var);
    }
}
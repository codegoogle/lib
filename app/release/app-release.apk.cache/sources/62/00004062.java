package com.p7700g.p99005;

import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.wb0;
import java.util.LinkedList;
import java.util.UUID;

/* compiled from: CancelWorkRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class ef0 implements Runnable {
    private final kc0 s = new kc0();

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class a extends ef0 {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ UUID u;

        public a(final rc0 val$workManagerImpl, final UUID val$id) {
            this.t = val$workManagerImpl;
            this.u = val$id;
        }

        @Override // com.p7700g.p99005.ef0
        @s2
        public void i() {
            WorkDatabase M = this.t.M();
            M.c();
            try {
                a(this.t, this.u.toString());
                M.A();
                M.i();
                h(this.t);
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class b extends ef0 {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ String u;

        public b(final rc0 val$workManagerImpl, final String val$tag) {
            this.t = val$workManagerImpl;
            this.u = val$tag;
        }

        @Override // com.p7700g.p99005.ef0
        @s2
        public void i() {
            WorkDatabase M = this.t.M();
            M.c();
            try {
                for (String str : M.L().z(this.u)) {
                    a(this.t, str);
                }
                M.A();
                M.i();
                h(this.t);
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class c extends ef0 {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ String u;
        public final /* synthetic */ boolean v;

        public c(final rc0 val$workManagerImpl, final String val$name, final boolean val$allowReschedule) {
            this.t = val$workManagerImpl;
            this.u = val$name;
            this.v = val$allowReschedule;
        }

        @Override // com.p7700g.p99005.ef0
        @s2
        public void i() {
            WorkDatabase M = this.t.M();
            M.c();
            try {
                for (String str : M.L().r(this.u)) {
                    a(this.t, str);
                }
                M.A();
                M.i();
                if (this.v) {
                    h(this.t);
                }
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    /* compiled from: CancelWorkRunnable.java */
    /* loaded from: classes.dex */
    public class d extends ef0 {
        public final /* synthetic */ rc0 t;

        public d(final rc0 val$workManagerImpl) {
            this.t = val$workManagerImpl;
        }

        @Override // com.p7700g.p99005.ef0
        @s2
        public void i() {
            WorkDatabase M = this.t.M();
            M.c();
            try {
                for (String str : M.L().p()) {
                    a(this.t, str);
                }
                new jf0(this.t.M()).e(System.currentTimeMillis());
                M.A();
            } finally {
                M.i();
            }
        }
    }

    public static ef0 b(@x1 final rc0 workManagerImpl) {
        return new d(workManagerImpl);
    }

    public static ef0 c(@x1 final UUID id, @x1 final rc0 workManagerImpl) {
        return new a(workManagerImpl, id);
    }

    public static ef0 d(@x1 final String name, @x1 final rc0 workManagerImpl, final boolean allowReschedule) {
        return new c(workManagerImpl, name, allowReschedule);
    }

    public static ef0 e(@x1 final String tag, @x1 final rc0 workManagerImpl) {
        return new b(workManagerImpl, tag);
    }

    private void g(WorkDatabase workDatabase, String workSpecId) {
        xe0 L = workDatabase.L();
        ge0 C = workDatabase.C();
        LinkedList linkedList = new LinkedList();
        linkedList.add(workSpecId);
        while (!linkedList.isEmpty()) {
            String str = (String) linkedList.remove();
            dc0.a t = L.t(str);
            if (t != dc0.a.SUCCEEDED && t != dc0.a.FAILED) {
                L.b(dc0.a.CANCELLED, str);
            }
            linkedList.addAll(C.b(str));
        }
    }

    public void a(rc0 workManagerImpl, String workSpecId) {
        g(workManagerImpl.M(), workSpecId);
        workManagerImpl.J().m(workSpecId);
        for (mc0 mc0Var : workManagerImpl.L()) {
            mc0Var.e(workSpecId);
        }
    }

    public wb0 f() {
        return this.s;
    }

    public void h(rc0 workManagerImpl) {
        nc0.b(workManagerImpl.F(), workManagerImpl.M(), workManagerImpl.L());
    }

    public abstract void i();

    @Override // java.lang.Runnable
    public void run() {
        try {
            i();
            this.s.b(wb0.a);
        } catch (Throwable th) {
            this.s.b(new wb0.b.a(th));
        }
    }
}
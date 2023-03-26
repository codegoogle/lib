package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.we0;
import java.util.List;
import java.util.UUID;

/* compiled from: StatusRunnable.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public abstract class pf0<T> implements Runnable {
    private final zf0<T> s = zf0.v();

    /* compiled from: StatusRunnable.java */
    /* loaded from: classes.dex */
    public class a extends pf0<List<dc0>> {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ List u;

        public a(final rc0 val$workManager, final List val$ids) {
            this.t = val$workManager;
            this.u = val$ids;
        }

        @Override // com.p7700g.p99005.pf0
        /* renamed from: h */
        public List<dc0> g() {
            return we0.c.apply(this.t.M().L().E(this.u));
        }
    }

    /* compiled from: StatusRunnable.java */
    /* loaded from: classes.dex */
    public class b extends pf0<dc0> {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ UUID u;

        public b(final rc0 val$workManager, final UUID val$id) {
            this.t = val$workManager;
            this.u = val$id;
        }

        @Override // com.p7700g.p99005.pf0
        /* renamed from: h */
        public dc0 g() {
            we0.c s = this.t.M().L().s(this.u.toString());
            if (s != null) {
                return s.a();
            }
            return null;
        }
    }

    /* compiled from: StatusRunnable.java */
    /* loaded from: classes.dex */
    public class c extends pf0<List<dc0>> {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ String u;

        public c(final rc0 val$workManager, final String val$tag) {
            this.t = val$workManager;
            this.u = val$tag;
        }

        @Override // com.p7700g.p99005.pf0
        /* renamed from: h */
        public List<dc0> g() {
            return we0.c.apply(this.t.M().L().w(this.u));
        }
    }

    /* compiled from: StatusRunnable.java */
    /* loaded from: classes.dex */
    public class d extends pf0<List<dc0>> {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ String u;

        public d(final rc0 val$workManager, final String val$name) {
            this.t = val$workManager;
            this.u = val$name;
        }

        @Override // com.p7700g.p99005.pf0
        /* renamed from: h */
        public List<dc0> g() {
            return we0.c.apply(this.t.M().L().D(this.u));
        }
    }

    /* compiled from: StatusRunnable.java */
    /* loaded from: classes.dex */
    public class e extends pf0<List<dc0>> {
        public final /* synthetic */ rc0 t;
        public final /* synthetic */ fc0 u;

        public e(final rc0 val$workManager, final fc0 val$querySpec) {
            this.t = val$workManager;
            this.u = val$querySpec;
        }

        @Override // com.p7700g.p99005.pf0
        /* renamed from: h */
        public List<dc0> g() {
            return we0.c.apply(this.t.M().H().a(mf0.b(this.u)));
        }
    }

    @x1
    public static pf0<List<dc0>> a(@x1 final rc0 workManager, @x1 final List<String> ids) {
        return new a(workManager, ids);
    }

    @x1
    public static pf0<List<dc0>> b(@x1 final rc0 workManager, @x1 final String tag) {
        return new c(workManager, tag);
    }

    @x1
    public static pf0<dc0> c(@x1 final rc0 workManager, @x1 final UUID id) {
        return new b(workManager, id);
    }

    @x1
    public static pf0<List<dc0>> d(@x1 final rc0 workManager, @x1 final String name) {
        return new d(workManager, name);
    }

    @x1
    public static pf0<List<dc0>> e(@x1 final rc0 workManager, @x1 final fc0 querySpec) {
        return new e(workManager, querySpec);
    }

    @x1
    public gn2<T> f() {
        return this.s;
    }

    @s2
    public abstract T g();

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.s.q(g());
        } catch (Throwable th) {
            this.s.r(th);
        }
    }
}
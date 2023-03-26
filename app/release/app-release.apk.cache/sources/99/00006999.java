package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import com.p7700g.p99005.bp1;
import com.p7700g.p99005.it1;
import com.p7700g.p99005.xs1;
import com.p7700g.p99005.yo1;
import com.p7700g.p99005.zx1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder.java */
/* loaded from: classes2.dex */
public final class zo1 {
    private rr1 c;
    private ls1 d;
    private is1 e;
    private gt1 f;
    private kt1 g;
    private kt1 h;
    private xs1.a i;
    private it1 j;
    private nx1 k;
    @z1
    private zx1.b n;
    private kt1 o;
    private boolean p;
    @z1
    private List<yy1<Object>> q;
    private final Map<Class<?>, kp1<?, ?>> a = new q7();
    private final bp1.a b = new bp1.a();
    private int l = 4;
    private yo1.a m = new a();

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public class a implements yo1.a {
        public a() {
        }

        @Override // com.p7700g.p99005.yo1.a
        @x1
        public zy1 build() {
            return new zy1();
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public class b implements yo1.a {
        public final /* synthetic */ zy1 a;

        public b(zy1 zy1Var) {
            this.a = zy1Var;
        }

        @Override // com.p7700g.p99005.yo1.a
        @x1
        public zy1 build() {
            zy1 zy1Var = this.a;
            return zy1Var != null ? zy1Var : new zy1();
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public static final class c implements bp1.b {
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public static final class d implements bp1.b {
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public static final class e implements bp1.b {
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public static final class f implements bp1.b {
        public final int a;

        public f(int i) {
            this.a = i;
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes2.dex */
    public static final class g implements bp1.b {
        private g() {
        }
    }

    @x1
    public zo1 a(@x1 yy1<Object> yy1Var) {
        if (this.q == null) {
            this.q = new ArrayList();
        }
        this.q.add(yy1Var);
        return this;
    }

    @x1
    public yo1 b(@x1 Context context) {
        if (this.g == null) {
            this.g = kt1.j();
        }
        if (this.h == null) {
            this.h = kt1.f();
        }
        if (this.o == null) {
            this.o = kt1.c();
        }
        if (this.j == null) {
            this.j = new it1.a(context).a();
        }
        if (this.k == null) {
            this.k = new px1();
        }
        if (this.d == null) {
            int b2 = this.j.b();
            if (b2 > 0) {
                this.d = new rs1(b2);
            } else {
                this.d = new ms1();
            }
        }
        if (this.e == null) {
            this.e = new qs1(this.j.a());
        }
        if (this.f == null) {
            this.f = new ft1(this.j.d());
        }
        if (this.i == null) {
            this.i = new et1(context);
        }
        if (this.c == null) {
            this.c = new rr1(this.f, this.i, this.h, this.g, kt1.m(), this.o, this.p);
        }
        List<yy1<Object>> list = this.q;
        if (list == null) {
            this.q = Collections.emptyList();
        } else {
            this.q = Collections.unmodifiableList(list);
        }
        bp1 c2 = this.b.c();
        return new yo1(context, this.c, this.f, this.d, this.e, new zx1(this.n, c2), this.k, this.l, this.m, this.a, this.q, c2);
    }

    @x1
    public zo1 c(@z1 kt1 kt1Var) {
        this.o = kt1Var;
        return this;
    }

    @x1
    public zo1 d(@z1 is1 is1Var) {
        this.e = is1Var;
        return this;
    }

    @x1
    public zo1 e(@z1 ls1 ls1Var) {
        this.d = ls1Var;
        return this;
    }

    @x1
    public zo1 f(@z1 nx1 nx1Var) {
        this.k = nx1Var;
        return this;
    }

    @x1
    public zo1 g(@x1 yo1.a aVar) {
        this.m = (yo1.a) x02.d(aVar);
        return this;
    }

    @x1
    public zo1 h(@z1 zy1 zy1Var) {
        return g(new b(zy1Var));
    }

    @x1
    public <T> zo1 i(@x1 Class<T> cls, @z1 kp1<?, T> kp1Var) {
        this.a.put(cls, kp1Var);
        return this;
    }

    @x1
    public zo1 j(@z1 xs1.a aVar) {
        this.i = aVar;
        return this;
    }

    @x1
    public zo1 k(@z1 kt1 kt1Var) {
        this.h = kt1Var;
        return this;
    }

    public zo1 l(boolean z) {
        this.b.d(new c(), z);
        return this;
    }

    public zo1 m(rr1 rr1Var) {
        this.c = rr1Var;
        return this;
    }

    public zo1 n(boolean z) {
        this.b.d(new d(), z && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @x1
    public zo1 o(boolean z) {
        this.p = z;
        return this;
    }

    @x1
    public zo1 p(int i) {
        if (i >= 2 && i <= 6) {
            this.l = i;
            return this;
        }
        throw new IllegalArgumentException("Log level must be one of Log.VERBOSE, Log.DEBUG, Log.INFO, Log.WARN, or Log.ERROR");
    }

    public zo1 q(boolean z) {
        this.b.d(new e(), z);
        return this;
    }

    @x1
    public zo1 r(@z1 gt1 gt1Var) {
        this.f = gt1Var;
        return this;
    }

    @x1
    public zo1 s(@x1 it1.a aVar) {
        return t(aVar.a());
    }

    @x1
    public zo1 t(@z1 it1 it1Var) {
        this.j = it1Var;
        return this;
    }

    public void u(@z1 zx1.b bVar) {
        this.n = bVar;
    }

    @Deprecated
    public zo1 v(@z1 kt1 kt1Var) {
        return w(kt1Var);
    }

    @x1
    public zo1 w(@z1 kt1 kt1Var) {
        this.g = kt1Var;
        return this;
    }
}
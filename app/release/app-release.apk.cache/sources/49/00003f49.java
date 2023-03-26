package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.mr1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes2.dex */
public class ds1 implements mr1, rq1.a<Object> {
    private File A;
    private es1 B;
    private final mr1.a s;
    private final nr1<?> t;
    private int u;
    private int v = -1;
    private gq1 w;
    private List<du1<File, ?>> x;
    private int y;
    private volatile du1.a<?> z;

    public ds1(nr1<?> nr1Var, mr1.a aVar) {
        this.t = nr1Var;
        this.s = aVar;
    }

    private boolean a() {
        return this.y < this.x.size();
    }

    @Override // com.p7700g.p99005.mr1
    public boolean b() {
        c12.a("ResourceCacheGenerator.startNext");
        try {
            List<gq1> c = this.t.c();
            boolean z = false;
            if (c.isEmpty()) {
                return false;
            }
            List<Class<?>> m = this.t.m();
            if (m.isEmpty()) {
                if (File.class.equals(this.t.r())) {
                    return false;
                }
                throw new IllegalStateException("Failed to find any load path from " + this.t.i() + " to " + this.t.r());
            }
            while (true) {
                if (this.x != null && a()) {
                    this.z = null;
                    while (!z && a()) {
                        List<du1<File, ?>> list = this.x;
                        int i = this.y;
                        this.y = i + 1;
                        this.z = list.get(i).b(this.A, this.t.t(), this.t.f(), this.t.k());
                        if (this.z != null && this.t.u(this.z.c.a())) {
                            this.z.c.e(this.t.l(), this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.v + 1;
                this.v = i2;
                if (i2 >= m.size()) {
                    int i3 = this.u + 1;
                    this.u = i3;
                    if (i3 >= c.size()) {
                        return false;
                    }
                    this.v = 0;
                }
                gq1 gq1Var = c.get(this.u);
                Class<?> cls = m.get(this.v);
                this.B = new es1(this.t.b(), gq1Var, this.t.p(), this.t.t(), this.t.f(), this.t.s(cls), cls, this.t.k());
                File b = this.t.d().b(this.B);
                this.A = b;
                if (b != null) {
                    this.w = gq1Var;
                    this.x = this.t.j(b);
                    this.y = 0;
                }
            }
        } finally {
            c12.f();
        }
    }

    @Override // com.p7700g.p99005.rq1.a
    public void c(@x1 Exception exc) {
        this.s.a(this.B, exc, this.z.c, aq1.RESOURCE_DISK_CACHE);
    }

    @Override // com.p7700g.p99005.mr1
    public void cancel() {
        du1.a<?> aVar = this.z;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // com.p7700g.p99005.rq1.a
    public void f(Object obj) {
        this.s.d(this.w, obj, this.z.c, aq1.RESOURCE_DISK_CACHE, this.B);
    }
}
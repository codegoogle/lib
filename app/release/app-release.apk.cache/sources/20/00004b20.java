package com.p7700g.p99005;

import com.p7700g.p99005.du1;
import com.p7700g.p99005.mr1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes2.dex */
public class jr1 implements mr1, rq1.a<Object> {
    private File A;
    private final List<gq1> s;
    private final nr1<?> t;
    private final mr1.a u;
    private int v;
    private gq1 w;
    private List<du1<File, ?>> x;
    private int y;
    private volatile du1.a<?> z;

    public jr1(nr1<?> nr1Var, mr1.a aVar) {
        this(nr1Var.c(), nr1Var, aVar);
    }

    private boolean a() {
        return this.y < this.x.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (a() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r7.x;
        r3 = r7.y;
        r7.y = r3 + 1;
        r7.z = r0.get(r3).b(r7.A, r7.t.t(), r7.t.f(), r7.t.k());
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
        if (r7.z == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r7.t.u(r7.z.c.a()) == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        r7.z.c.e(r7.t.l(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r7.z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r1 != false) goto L30;
     */
    @Override // com.p7700g.p99005.mr1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b() {
        c12.a("DataCacheGenerator.startNext");
        while (true) {
            try {
                boolean z = false;
                if (this.x != null && a()) {
                    break;
                }
                int i = this.v + 1;
                this.v = i;
                if (i >= this.s.size()) {
                    return false;
                }
                gq1 gq1Var = this.s.get(this.v);
                File b = this.t.d().b(new kr1(gq1Var, this.t.p()));
                this.A = b;
                if (b != null) {
                    this.w = gq1Var;
                    this.x = this.t.j(b);
                    this.y = 0;
                }
            } finally {
                c12.f();
            }
        }
    }

    @Override // com.p7700g.p99005.rq1.a
    public void c(@x1 Exception exc) {
        this.u.a(this.w, exc, this.z.c, aq1.DATA_DISK_CACHE);
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
        this.u.d(this.w, obj, this.z.c, aq1.DATA_DISK_CACHE, this.w);
    }

    public jr1(List<gq1> list, nr1<?> nr1Var, mr1.a aVar) {
        this.v = -1;
        this.s = list;
        this.t = nr1Var;
        this.u = aVar;
    }
}
package com.p7700g.p99005;

import android.graphics.Path;
import com.p7700g.p99005.fm0;
import com.p7700g.p99005.tj0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ShapeContent.java */
/* loaded from: classes.dex */
public class oj0 implements jj0, tj0.b {
    private final String b;
    private final boolean c;
    private final hi0 d;
    private final fk0 e;
    @z1
    private List<pj0> f;
    private boolean g;
    private final Path a = new Path();
    private final xi0 h = new xi0();

    public oj0(hi0 hi0Var, im0 im0Var, dm0 dm0Var) {
        this.b = dm0Var.b();
        this.c = dm0Var.d();
        this.d = hi0Var;
        fk0 a = dm0Var.c().a();
        this.e = a;
        im0Var.f(a);
        a.a(this);
    }

    private void c() {
        this.g = false;
        this.d.invalidateSelf();
    }

    @Override // com.p7700g.p99005.tj0.b
    public void a() {
        c();
    }

    @Override // com.p7700g.p99005.yi0
    public void b(List<yi0> list, List<yi0> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            yi0 yi0Var = list.get(i);
            if (yi0Var instanceof rj0) {
                rj0 rj0Var = (rj0) yi0Var;
                if (rj0Var.j() == fm0.a.SIMULTANEOUSLY) {
                    this.h.a(rj0Var);
                    rj0Var.c(this);
                }
            }
            if (yi0Var instanceof pj0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((pj0) yi0Var);
            }
        }
        this.e.q(arrayList);
    }

    @Override // com.p7700g.p99005.yi0
    public String getName() {
        return this.b;
    }

    @Override // com.p7700g.p99005.jj0
    public Path getPath() {
        if (this.g) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.g = true;
            return this.a;
        }
        Path h = this.e.h();
        if (h == null) {
            return this.a;
        }
        this.a.set(h);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.h.b(this.a);
        this.g = true;
        return this.a;
    }
}
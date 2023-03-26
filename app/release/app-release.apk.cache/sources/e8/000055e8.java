package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyNode.java */
/* loaded from: classes.dex */
public class pc implements nc {
    public zc d;
    public int f;
    public int g;
    public nc a = null;
    public boolean b = false;
    public boolean c = false;
    public a e = a.UNKNOWN;
    public int h = 1;
    public qc i = null;
    public boolean j = false;
    public List<nc> k = new ArrayList();
    public List<pc> l = new ArrayList();

    /* compiled from: DependencyNode.java */
    /* loaded from: classes.dex */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public pc(zc zcVar) {
        this.d = zcVar;
    }

    @Override // com.p7700g.p99005.nc
    public void a(nc ncVar) {
        for (pc pcVar : this.l) {
            if (!pcVar.j) {
                return;
            }
        }
        this.c = true;
        nc ncVar2 = this.a;
        if (ncVar2 != null) {
            ncVar2.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        pc pcVar2 = null;
        int i = 0;
        for (pc pcVar3 : this.l) {
            if (!(pcVar3 instanceof qc)) {
                i++;
                pcVar2 = pcVar3;
            }
        }
        if (pcVar2 != null && i == 1 && pcVar2.j) {
            qc qcVar = this.i;
            if (qcVar != null) {
                if (!qcVar.j) {
                    return;
                }
                this.f = this.h * qcVar.g;
            }
            e(pcVar2.g + this.f);
        }
        nc ncVar3 = this.a;
        if (ncVar3 != null) {
            ncVar3.a(this);
        }
    }

    public void b(nc ncVar) {
        this.k.add(ncVar);
        if (this.j) {
            ncVar.a(ncVar);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public String d() {
        String t;
        String y = this.d.b.y();
        a aVar = this.e;
        if (aVar != a.LEFT && aVar != a.RIGHT) {
            t = wo1.t(y, "_VERTICAL");
        } else {
            t = wo1.t(y, "_HORIZONTAL");
        }
        StringBuilder L = wo1.L(t, ":");
        L.append(this.e.name());
        return L.toString();
    }

    public void e(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (nc ncVar : this.k) {
            ncVar.a(ncVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.y());
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
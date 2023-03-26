package com.p7700g.p99005;

import com.p7700g.p99005.lc;
import com.p7700g.p99005.zb;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: DependencyGraph.java */
/* loaded from: classes.dex */
public class oc {
    private static final boolean a = true;
    private ac b;
    private ac e;
    private boolean c = true;
    private boolean d = true;
    private ArrayList<zc> f = new ArrayList<>();
    private ArrayList<wc> g = new ArrayList<>();
    private lc.b h = null;
    private lc.a i = new lc.a();
    public ArrayList<wc> j = new ArrayList<>();

    public oc(ac acVar) {
        this.b = acVar;
        this.e = acVar;
    }

    private void a(pc pcVar, int i, int i2, pc pcVar2, ArrayList<wc> arrayList, wc wcVar) {
        zc zcVar = pcVar.d;
        if (zcVar.c == null) {
            ac acVar = this.b;
            if (zcVar == acVar.K || zcVar == acVar.L) {
                return;
            }
            if (wcVar == null) {
                wcVar = new wc(zcVar, i2);
                arrayList.add(wcVar);
            }
            zcVar.c = wcVar;
            wcVar.a(zcVar);
            for (nc ncVar : zcVar.h.k) {
                if (ncVar instanceof pc) {
                    a((pc) ncVar, i, 0, pcVar2, arrayList, wcVar);
                }
            }
            for (nc ncVar2 : zcVar.i.k) {
                if (ncVar2 instanceof pc) {
                    a((pc) ncVar2, i, 1, pcVar2, arrayList, wcVar);
                }
            }
            if (i == 1 && (zcVar instanceof xc)) {
                for (nc ncVar3 : ((xc) zcVar).k.k) {
                    if (ncVar3 instanceof pc) {
                        a((pc) ncVar3, i, 2, pcVar2, arrayList, wcVar);
                    }
                }
            }
            for (pc pcVar3 : zcVar.h.l) {
                if (pcVar3 == pcVar2) {
                    wcVar.f = true;
                }
                a(pcVar3, i, 0, pcVar2, arrayList, wcVar);
            }
            for (pc pcVar4 : zcVar.i.l) {
                if (pcVar4 == pcVar2) {
                    wcVar.f = true;
                }
                a(pcVar4, i, 1, pcVar2, arrayList, wcVar);
            }
            if (i == 1 && (zcVar instanceof xc)) {
                for (pc pcVar5 : ((xc) zcVar).k.l) {
                    a(pcVar5, i, 2, pcVar2, arrayList, wcVar);
                }
            }
        }
    }

    private boolean b(ac acVar) {
        int i;
        zb.b bVar;
        int i2;
        zb.b bVar2;
        zb.b bVar3;
        zb.b bVar4;
        Iterator<zb> it = acVar.A1.iterator();
        while (it.hasNext()) {
            zb next = it.next();
            zb.b[] bVarArr = next.H0;
            zb.b bVar5 = bVarArr[0];
            zb.b bVar6 = bVarArr[1];
            if (next.l0() == 8) {
                next.G = true;
            } else {
                if (next.h0 < 1.0f && bVar5 == zb.b.MATCH_CONSTRAINT) {
                    next.c0 = 2;
                }
                if (next.k0 < 1.0f && bVar6 == zb.b.MATCH_CONSTRAINT) {
                    next.d0 = 2;
                }
                if (next.A() > 0.0f) {
                    zb.b bVar7 = zb.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == zb.b.WRAP_CONTENT || bVar6 == zb.b.FIXED)) {
                        next.c0 = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == zb.b.WRAP_CONTENT || bVar5 == zb.b.FIXED)) {
                        next.d0 = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (next.c0 == 0) {
                            next.c0 = 3;
                        }
                        if (next.d0 == 0) {
                            next.d0 = 3;
                        }
                    }
                }
                zb.b bVar8 = zb.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && next.c0 == 1 && (next.w0.h == null || next.y0.h == null)) {
                    bVar5 = zb.b.WRAP_CONTENT;
                }
                zb.b bVar9 = bVar5;
                if (bVar6 == bVar8 && next.d0 == 1 && (next.x0.h == null || next.z0.h == null)) {
                    bVar6 = zb.b.WRAP_CONTENT;
                }
                zb.b bVar10 = bVar6;
                vc vcVar = next.K;
                vcVar.d = bVar9;
                int i3 = next.c0;
                vcVar.a = i3;
                xc xcVar = next.L;
                xcVar.d = bVar10;
                int i4 = next.d0;
                xcVar.a = i4;
                zb.b bVar11 = zb.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == zb.b.FIXED || bVar9 == zb.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == zb.b.FIXED || bVar10 == zb.b.WRAP_CONTENT)) {
                    int m0 = next.m0();
                    if (bVar9 == bVar11) {
                        i = (acVar.m0() - next.w0.i) - next.y0.i;
                        bVar = zb.b.FIXED;
                    } else {
                        i = m0;
                        bVar = bVar9;
                    }
                    int D = next.D();
                    if (bVar10 == bVar11) {
                        i2 = (acVar.D() - next.x0.i) - next.z0.i;
                        bVar2 = zb.b.FIXED;
                    } else {
                        i2 = D;
                        bVar2 = bVar10;
                    }
                    r(next, bVar, i, bVar2, i2);
                    next.K.e.e(next.m0());
                    next.L.e.e(next.D());
                    next.G = true;
                } else {
                    if (bVar9 == bVar8 && (bVar10 == (bVar4 = zb.b.WRAP_CONTENT) || bVar10 == zb.b.FIXED)) {
                        if (i3 == 3) {
                            if (bVar10 == bVar4) {
                                r(next, bVar4, 0, bVar4, 0);
                            }
                            int D2 = next.D();
                            zb.b bVar12 = zb.b.FIXED;
                            r(next, bVar12, (int) ((D2 * next.L0) + 0.5f), bVar12, D2);
                            next.K.e.e(next.m0());
                            next.L.e.e(next.D());
                            next.G = true;
                        } else if (i3 == 1) {
                            r(next, bVar4, 0, bVar10, 0);
                            next.K.e.m = next.m0();
                        } else if (i3 == 2) {
                            zb.b[] bVarArr2 = acVar.H0;
                            zb.b bVar13 = bVarArr2[0];
                            zb.b bVar14 = zb.b.FIXED;
                            if (bVar13 == bVar14 || bVarArr2[0] == bVar11) {
                                r(next, bVar14, (int) ((next.h0 * acVar.m0()) + 0.5f), bVar10, next.D());
                                next.K.e.e(next.m0());
                                next.L.e.e(next.D());
                                next.G = true;
                            }
                        } else {
                            yb[] ybVarArr = next.E0;
                            if (ybVarArr[0].h == null || ybVarArr[1].h == null) {
                                r(next, bVar4, 0, bVar10, 0);
                                next.K.e.e(next.m0());
                                next.L.e.e(next.D());
                                next.G = true;
                            }
                        }
                    }
                    if (bVar10 == bVar8 && (bVar9 == (bVar3 = zb.b.WRAP_CONTENT) || bVar9 == zb.b.FIXED)) {
                        if (i4 == 3) {
                            if (bVar9 == bVar3) {
                                r(next, bVar3, 0, bVar3, 0);
                            }
                            int m02 = next.m0();
                            float f = next.L0;
                            if (next.B() == -1) {
                                f = 1.0f / f;
                            }
                            zb.b bVar15 = zb.b.FIXED;
                            r(next, bVar15, m02, bVar15, (int) ((m02 * f) + 0.5f));
                            next.K.e.e(next.m0());
                            next.L.e.e(next.D());
                            next.G = true;
                        } else if (i4 == 1) {
                            r(next, bVar9, 0, bVar3, 0);
                            next.L.e.m = next.D();
                        } else if (i4 == 2) {
                            zb.b[] bVarArr3 = acVar.H0;
                            zb.b bVar16 = bVarArr3[1];
                            zb.b bVar17 = zb.b.FIXED;
                            if (bVar16 == bVar17 || bVarArr3[1] == bVar11) {
                                r(next, bVar9, next.m0(), bVar17, (int) ((next.k0 * acVar.D()) + 0.5f));
                                next.K.e.e(next.m0());
                                next.L.e.e(next.D());
                                next.G = true;
                            }
                        } else {
                            yb[] ybVarArr2 = next.E0;
                            if (ybVarArr2[2].h == null || ybVarArr2[3].h == null) {
                                r(next, bVar3, 0, bVar10, 0);
                                next.K.e.e(next.m0());
                                next.L.e.e(next.D());
                                next.G = true;
                            }
                        }
                    }
                    if (bVar9 == bVar8 && bVar10 == bVar8) {
                        if (i3 == 1 || i4 == 1) {
                            zb.b bVar18 = zb.b.WRAP_CONTENT;
                            r(next, bVar18, 0, bVar18, 0);
                            next.K.e.m = next.m0();
                            next.L.e.m = next.D();
                        } else if (i4 == 2 && i3 == 2) {
                            zb.b[] bVarArr4 = acVar.H0;
                            zb.b bVar19 = bVarArr4[0];
                            zb.b bVar20 = zb.b.FIXED;
                            if (bVar19 == bVar20 && bVarArr4[1] == bVar20) {
                                r(next, bVar20, (int) ((next.h0 * acVar.m0()) + 0.5f), bVar20, (int) ((next.k0 * acVar.D()) + 0.5f));
                                next.K.e.e(next.m0());
                                next.L.e.e(next.D());
                                next.G = true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    private int e(ac acVar, int i) {
        int size = this.j.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.j.get(i2).b(acVar, i));
        }
        return (int) j;
    }

    private void j() {
        Iterator<zc> it = this.f.iterator();
        String str = "digraph {\n";
        while (it.hasNext()) {
            str = m(it.next(), str);
        }
        String t = wo1.t(str, "\n}\n");
        PrintStream printStream = System.out;
        printStream.println("content:<<\n" + t + "\n>>");
    }

    private void k(zc zcVar, int i, ArrayList<wc> arrayList) {
        for (nc ncVar : zcVar.h.k) {
            if (ncVar instanceof pc) {
                a((pc) ncVar, i, 0, zcVar.i, arrayList, null);
            } else if (ncVar instanceof zc) {
                a(((zc) ncVar).h, i, 0, zcVar.i, arrayList, null);
            }
        }
        for (nc ncVar2 : zcVar.i.k) {
            if (ncVar2 instanceof pc) {
                a((pc) ncVar2, i, 1, zcVar.h, arrayList, null);
            } else if (ncVar2 instanceof zc) {
                a(((zc) ncVar2).i, i, 1, zcVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (nc ncVar3 : ((xc) zcVar).k.k) {
                if (ncVar3 instanceof pc) {
                    a((pc) ncVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private String l(mc mcVar, String str) {
        int i = mcVar.f;
        StringBuilder K = wo1.K("subgraph ", "cluster_");
        K.append(mcVar.b.y());
        if (i == 0) {
            K.append("_h");
        } else {
            K.append("_v");
        }
        K.append(" {\n");
        Iterator<zc> it = mcVar.k.iterator();
        String str2 = "";
        while (it.hasNext()) {
            zc next = it.next();
            K.append(next.b.y());
            if (i == 0) {
                K.append("_HORIZONTAL");
            } else {
                K.append("_VERTICAL");
            }
            K.append(";\n");
            str2 = m(next, str2);
        }
        K.append("}\n");
        return str + str2 + ((Object) K);
    }

    private String m(zc zcVar, String str) {
        boolean z;
        pc pcVar = zcVar.h;
        pc pcVar2 = zcVar.i;
        StringBuilder sb = new StringBuilder(str);
        if ((zcVar instanceof uc) || !pcVar.k.isEmpty() || (!pcVar2.k.isEmpty() || !pcVar.l.isEmpty()) || !pcVar2.l.isEmpty()) {
            sb.append(t(zcVar));
            boolean q = q(pcVar, pcVar2);
            String n = n(pcVar2, q, n(pcVar, q, str));
            boolean z2 = zcVar instanceof xc;
            if (z2) {
                n = n(((xc) zcVar).k, q, n);
            }
            if (!(zcVar instanceof vc) && (!((z = zcVar instanceof mc)) || ((mc) zcVar).f != 0)) {
                if (z2 || (z && ((mc) zcVar).f == 1)) {
                    zb.b j0 = zcVar.b.j0();
                    if (j0 != zb.b.FIXED && j0 != zb.b.WRAP_CONTENT) {
                        if (j0 == zb.b.MATCH_CONSTRAINT && zcVar.b.A() > 0.0f) {
                            sb.append("\n");
                            sb.append(zcVar.b.y());
                            sb.append("_VERTICAL -> ");
                            sb.append(zcVar.b.y());
                            sb.append("_HORIZONTAL;\n");
                        }
                    } else if (!pcVar.l.isEmpty() && pcVar2.l.isEmpty()) {
                        sb.append("\n");
                        sb.append(pcVar2.d());
                        sb.append(" -> ");
                        sb.append(pcVar.d());
                        sb.append("\n");
                    } else if (pcVar.l.isEmpty() && !pcVar2.l.isEmpty()) {
                        sb.append("\n");
                        sb.append(pcVar.d());
                        sb.append(" -> ");
                        sb.append(pcVar2.d());
                        sb.append("\n");
                    }
                }
            } else {
                zb.b H = zcVar.b.H();
                if (H != zb.b.FIXED && H != zb.b.WRAP_CONTENT) {
                    if (H == zb.b.MATCH_CONSTRAINT && zcVar.b.A() > 0.0f) {
                        sb.append("\n");
                        sb.append(zcVar.b.y());
                        sb.append("_HORIZONTAL -> ");
                        sb.append(zcVar.b.y());
                        sb.append("_VERTICAL;\n");
                    }
                } else if (!pcVar.l.isEmpty() && pcVar2.l.isEmpty()) {
                    sb.append("\n");
                    sb.append(pcVar2.d());
                    sb.append(" -> ");
                    sb.append(pcVar.d());
                    sb.append("\n");
                } else if (pcVar.l.isEmpty() && !pcVar2.l.isEmpty()) {
                    sb.append("\n");
                    sb.append(pcVar.d());
                    sb.append(" -> ");
                    sb.append(pcVar2.d());
                    sb.append("\n");
                }
            }
            if (zcVar instanceof mc) {
                return l((mc) zcVar, n);
            }
            return sb.toString();
        }
        return str;
    }

    private String n(pc pcVar, boolean z, String str) {
        StringBuilder sb = new StringBuilder(str);
        for (pc pcVar2 : pcVar.l) {
            StringBuilder G = wo1.G("\n");
            G.append(pcVar.d());
            StringBuilder L = wo1.L(G.toString(), " -> ");
            L.append(pcVar2.d());
            String sb2 = L.toString();
            if (pcVar.f > 0 || z || (pcVar.d instanceof uc)) {
                String t = wo1.t(sb2, "[");
                if (pcVar.f > 0) {
                    t = wo1.z(wo1.L(t, "label=\""), pcVar.f, "\"");
                    if (z) {
                        t = wo1.t(t, ",");
                    }
                }
                if (z) {
                    t = wo1.t(t, " style=dashed ");
                }
                if (pcVar.d instanceof uc) {
                    t = wo1.t(t, " style=bold,color=gray ");
                }
                sb2 = wo1.t(t, "]");
            }
            sb.append(sb2 + "\n");
        }
        return sb.toString();
    }

    private boolean q(pc pcVar, pc pcVar2) {
        int i = 0;
        for (pc pcVar3 : pcVar.l) {
            if (pcVar3 != pcVar2) {
                i++;
            }
        }
        int i2 = 0;
        for (pc pcVar4 : pcVar2.l) {
            if (pcVar4 != pcVar) {
                i2++;
            }
        }
        return i > 0 && i2 > 0;
    }

    private void r(zb zbVar, zb.b bVar, int i, zb.b bVar2, int i2) {
        lc.a aVar = this.i;
        aVar.d = bVar;
        aVar.e = bVar2;
        aVar.f = i;
        aVar.g = i2;
        this.h.b(zbVar, aVar);
        zbVar.c2(this.i.h);
        zbVar.y1(this.i.i);
        zbVar.x1(this.i.k);
        zbVar.g1(this.i.j);
    }

    private String t(zc zcVar) {
        boolean z = zcVar instanceof xc;
        String y = zcVar.b.y();
        StringBuilder sb = new StringBuilder(y);
        zb zbVar = zcVar.b;
        zb.b H = !z ? zbVar.H() : zbVar.j0();
        wc wcVar = zcVar.c;
        if (!z) {
            sb.append("_HORIZONTAL");
        } else {
            sb.append("_VERTICAL");
        }
        wo1.g0(sb, " [shape=none, label=<", "<TABLE BORDER=\"0\" CELLSPACING=\"0\" CELLPADDING=\"2\">", "  <TR>");
        if (!z) {
            sb.append("    <TD ");
            if (zcVar.h.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"LEFT\" BORDER=\"1\">L</TD>");
        } else {
            sb.append("    <TD ");
            if (zcVar.h.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"TOP\" BORDER=\"1\">T</TD>");
        }
        sb.append("    <TD BORDER=\"1\" ");
        boolean z2 = zcVar.e.j;
        if (z2 && !zcVar.b.G) {
            sb.append(" BGCOLOR=\"green\" ");
        } else if (z2) {
            sb.append(" BGCOLOR=\"lightgray\" ");
        } else if (zcVar.b.G) {
            sb.append(" BGCOLOR=\"yellow\" ");
        }
        if (H == zb.b.MATCH_CONSTRAINT) {
            sb.append("style=\"dashed\"");
        }
        sb.append(">");
        sb.append(y);
        if (wcVar != null) {
            sb.append(" [");
            sb.append(wcVar.j + 1);
            sb.append("/");
            sb.append(wc.d);
            sb.append("]");
        }
        sb.append(" </TD>");
        if (!z) {
            sb.append("    <TD ");
            if (zcVar.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"RIGHT\" BORDER=\"1\">R</TD>");
        } else {
            sb.append("    <TD ");
            if (((xc) zcVar).k.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BASELINE\" BORDER=\"1\">b</TD>");
            sb.append("    <TD ");
            if (zcVar.i.j) {
                sb.append(" BGCOLOR=\"green\"");
            }
            sb.append(" PORT=\"BOTTOM\" BORDER=\"1\">B</TD>");
        }
        return wo1.C(sb, "  </TR></TABLE>", ">];\n");
    }

    public void c() {
        d(this.f);
        this.j.clear();
        wc.d = 0;
        k(this.b.K, 0, this.j);
        k(this.b.L, 1, this.j);
        this.c = false;
    }

    public void d(ArrayList<zc> arrayList) {
        arrayList.clear();
        this.e.K.f();
        this.e.L.f();
        arrayList.add(this.e.K);
        arrayList.add(this.e.L);
        Iterator<zb> it = this.e.A1.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            zb next = it.next();
            if (next instanceof cc) {
                arrayList.add(new tc(next));
            } else {
                if (next.B0()) {
                    if (next.I == null) {
                        next.I = new mc(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.I);
                } else {
                    arrayList.add(next.K);
                }
                if (next.D0()) {
                    if (next.J == null) {
                        next.J = new mc(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.J);
                } else {
                    arrayList.add(next.L);
                }
                if (next instanceof ec) {
                    arrayList.add(new uc(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<zc> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().f();
        }
        Iterator<zc> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            zc next2 = it3.next();
            if (next2.b != this.e) {
                next2.d();
            }
        }
    }

    public void f(zb.b bVar, zb.b bVar2) {
        if (this.c) {
            c();
            Iterator<zb> it = this.b.A1.iterator();
            boolean z = false;
            while (it.hasNext()) {
                zb next = it.next();
                boolean[] zArr = next.M;
                zArr[0] = true;
                zArr[1] = true;
                if (next instanceof vb) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            Iterator<wc> it2 = this.j.iterator();
            while (it2.hasNext()) {
                wc next2 = it2.next();
                zb.b bVar3 = zb.b.WRAP_CONTENT;
                next2.d(bVar == bVar3, bVar2 == bVar3);
            }
        }
    }

    public boolean g(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.c || this.d) {
            Iterator<zb> it = this.b.A1.iterator();
            while (it.hasNext()) {
                zb next = it.next();
                next.q();
                next.G = false;
                next.K.n();
                next.L.n();
            }
            this.b.q();
            ac acVar = this.b;
            acVar.G = false;
            acVar.K.n();
            this.b.L.n();
            this.d = false;
        }
        if (b(this.e)) {
            return false;
        }
        this.b.f2(0);
        this.b.g2(0);
        zb.b z5 = this.b.z(0);
        zb.b z6 = this.b.z(1);
        if (this.c) {
            c();
        }
        int o0 = this.b.o0();
        int p0 = this.b.p0();
        this.b.K.h.e(o0);
        this.b.L.h.e(p0);
        s();
        zb.b bVar = zb.b.WRAP_CONTENT;
        if (z5 == bVar || z6 == bVar) {
            if (z4) {
                Iterator<zc> it2 = this.f.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!it2.next().p()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && z5 == zb.b.WRAP_CONTENT) {
                this.b.D1(zb.b.FIXED);
                ac acVar2 = this.b;
                acVar2.c2(e(acVar2, 0));
                ac acVar3 = this.b;
                acVar3.K.e.e(acVar3.m0());
            }
            if (z4 && z6 == zb.b.WRAP_CONTENT) {
                this.b.Y1(zb.b.FIXED);
                ac acVar4 = this.b;
                acVar4.y1(e(acVar4, 1));
                ac acVar5 = this.b;
                acVar5.L.e.e(acVar5.D());
            }
        }
        ac acVar6 = this.b;
        zb.b[] bVarArr = acVar6.H0;
        zb.b bVar2 = bVarArr[0];
        zb.b bVar3 = zb.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == zb.b.MATCH_PARENT) {
            int m0 = acVar6.m0() + o0;
            this.b.K.i.e(m0);
            this.b.K.e.e(m0 - o0);
            s();
            ac acVar7 = this.b;
            zb.b[] bVarArr2 = acVar7.H0;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == zb.b.MATCH_PARENT) {
                int D = acVar7.D() + p0;
                this.b.L.i.e(D);
                this.b.L.e.e(D - p0);
            }
            s();
            z2 = true;
        } else {
            z2 = false;
        }
        Iterator<zc> it3 = this.f.iterator();
        while (it3.hasNext()) {
            zc next2 = it3.next();
            if (next2.b != this.b || next2.g) {
                next2.e();
            }
        }
        Iterator<zc> it4 = this.f.iterator();
        while (it4.hasNext()) {
            zc next3 = it4.next();
            if (z2 || next3.b != this.b) {
                if (!next3.h.j || ((!next3.i.j && !(next3 instanceof tc)) || (!next3.e.j && !(next3 instanceof mc) && !(next3 instanceof tc)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.b.D1(z5);
        this.b.Y1(z6);
        return z3;
    }

    public boolean h(boolean z) {
        if (this.c) {
            Iterator<zb> it = this.b.A1.iterator();
            while (it.hasNext()) {
                zb next = it.next();
                next.q();
                next.G = false;
                vc vcVar = next.K;
                vcVar.e.j = false;
                vcVar.g = false;
                vcVar.n();
                xc xcVar = next.L;
                xcVar.e.j = false;
                xcVar.g = false;
                xcVar.n();
            }
            this.b.q();
            ac acVar = this.b;
            acVar.G = false;
            vc vcVar2 = acVar.K;
            vcVar2.e.j = false;
            vcVar2.g = false;
            vcVar2.n();
            xc xcVar2 = this.b.L;
            xcVar2.e.j = false;
            xcVar2.g = false;
            xcVar2.n();
            c();
        }
        if (b(this.e)) {
            return false;
        }
        this.b.f2(0);
        this.b.g2(0);
        this.b.K.h.e(0);
        this.b.L.h.e(0);
        return true;
    }

    public boolean i(boolean z, int i) {
        boolean z2;
        zb.b bVar;
        boolean z3 = true;
        boolean z4 = z & true;
        zb.b z5 = this.b.z(0);
        zb.b z6 = this.b.z(1);
        int o0 = this.b.o0();
        int p0 = this.b.p0();
        if (z4 && (z5 == (bVar = zb.b.WRAP_CONTENT) || z6 == bVar)) {
            Iterator<zc> it = this.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                zc next = it.next();
                if (next.f == i && !next.p()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && z5 == zb.b.WRAP_CONTENT) {
                    this.b.D1(zb.b.FIXED);
                    ac acVar = this.b;
                    acVar.c2(e(acVar, 0));
                    ac acVar2 = this.b;
                    acVar2.K.e.e(acVar2.m0());
                }
            } else if (z4 && z6 == zb.b.WRAP_CONTENT) {
                this.b.Y1(zb.b.FIXED);
                ac acVar3 = this.b;
                acVar3.y1(e(acVar3, 1));
                ac acVar4 = this.b;
                acVar4.L.e.e(acVar4.D());
            }
        }
        if (i == 0) {
            ac acVar5 = this.b;
            zb.b[] bVarArr = acVar5.H0;
            if (bVarArr[0] == zb.b.FIXED || bVarArr[0] == zb.b.MATCH_PARENT) {
                int m0 = acVar5.m0() + o0;
                this.b.K.i.e(m0);
                this.b.K.e.e(m0 - o0);
                z2 = true;
            }
            z2 = false;
        } else {
            ac acVar6 = this.b;
            zb.b[] bVarArr2 = acVar6.H0;
            if (bVarArr2[1] == zb.b.FIXED || bVarArr2[1] == zb.b.MATCH_PARENT) {
                int D = acVar6.D() + p0;
                this.b.L.i.e(D);
                this.b.L.e.e(D - p0);
                z2 = true;
            }
            z2 = false;
        }
        s();
        Iterator<zc> it2 = this.f.iterator();
        while (it2.hasNext()) {
            zc next2 = it2.next();
            if (next2.f == i && (next2.b != this.b || next2.g)) {
                next2.e();
            }
        }
        Iterator<zc> it3 = this.f.iterator();
        while (it3.hasNext()) {
            zc next3 = it3.next();
            if (next3.f == i && (z2 || next3.b != this.b)) {
                if (!next3.h.j || !next3.i.j || (!(next3 instanceof mc) && !next3.e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.b.D1(z5);
        this.b.Y1(z6);
        return z3;
    }

    public void o() {
        this.c = true;
    }

    public void p() {
        this.d = true;
    }

    public void s() {
        qc qcVar;
        Iterator<zb> it = this.b.A1.iterator();
        while (it.hasNext()) {
            zb next = it.next();
            if (!next.G) {
                zb.b[] bVarArr = next.H0;
                boolean z = false;
                zb.b bVar = bVarArr[0];
                zb.b bVar2 = bVarArr[1];
                int i = next.c0;
                int i2 = next.d0;
                zb.b bVar3 = zb.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == zb.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == zb.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                qc qcVar2 = next.K.e;
                boolean z3 = qcVar2.j;
                qc qcVar3 = next.L.e;
                boolean z4 = qcVar3.j;
                if (z3 && z4) {
                    zb.b bVar4 = zb.b.FIXED;
                    r(next, bVar4, qcVar2.g, bVar4, qcVar3.g);
                    next.G = true;
                } else if (z3 && z) {
                    r(next, zb.b.FIXED, qcVar2.g, bVar3, qcVar3.g);
                    if (bVar2 == zb.b.MATCH_CONSTRAINT) {
                        next.L.e.m = next.D();
                    } else {
                        next.L.e.e(next.D());
                        next.G = true;
                    }
                } else if (z4 && z2) {
                    r(next, bVar3, qcVar2.g, zb.b.FIXED, qcVar3.g);
                    if (bVar == zb.b.MATCH_CONSTRAINT) {
                        next.K.e.m = next.m0();
                    } else {
                        next.K.e.e(next.m0());
                        next.G = true;
                    }
                }
                if (next.G && (qcVar = next.L.l) != null) {
                    qcVar.e(next.t());
                }
            }
        }
    }

    public void u(lc.b bVar) {
        this.h = bVar;
    }
}
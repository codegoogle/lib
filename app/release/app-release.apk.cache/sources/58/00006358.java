package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RunGroup.java */
/* loaded from: classes.dex */
public class wc {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static int d;
    public zc g;
    public zc h;
    public int j;
    public int k;
    public int e = 0;
    public boolean f = false;
    public ArrayList<zc> i = new ArrayList<>();

    public wc(zc zcVar, int i) {
        this.g = null;
        this.h = null;
        this.j = 0;
        int i2 = d;
        this.j = i2;
        d = i2 + 1;
        this.g = zcVar;
        this.h = zcVar;
        this.k = i;
    }

    private boolean c(zc zcVar, int i) {
        pc pcVar;
        zc zcVar2;
        pc pcVar2;
        zc zcVar3;
        if (zcVar.b.M[i]) {
            for (nc ncVar : zcVar.h.k) {
                if ((ncVar instanceof pc) && (zcVar3 = (pcVar2 = (pc) ncVar).d) != zcVar && pcVar2 == zcVar3.h) {
                    if (zcVar instanceof mc) {
                        Iterator<zc> it = ((mc) zcVar).k.iterator();
                        while (it.hasNext()) {
                            c(it.next(), i);
                        }
                    } else if (!(zcVar instanceof uc)) {
                        zcVar.b.M[i] = false;
                    }
                    c(pcVar2.d, i);
                }
            }
            for (nc ncVar2 : zcVar.i.k) {
                if ((ncVar2 instanceof pc) && (zcVar2 = (pcVar = (pc) ncVar2).d) != zcVar && pcVar == zcVar2.h) {
                    if (zcVar instanceof mc) {
                        Iterator<zc> it2 = ((mc) zcVar).k.iterator();
                        while (it2.hasNext()) {
                            c(it2.next(), i);
                        }
                    } else if (!(zcVar instanceof uc)) {
                        zcVar.b.M[i] = false;
                    }
                    c(pcVar.d, i);
                }
            }
            return false;
        }
        return false;
    }

    private long e(pc pcVar, long j) {
        zc zcVar = pcVar.d;
        if (zcVar instanceof uc) {
            return j;
        }
        int size = pcVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            nc ncVar = pcVar.k.get(i);
            if (ncVar instanceof pc) {
                pc pcVar2 = (pc) ncVar;
                if (pcVar2.d != zcVar) {
                    j2 = Math.min(j2, e(pcVar2, pcVar2.f + j));
                }
            }
        }
        if (pcVar == zcVar.i) {
            long j3 = j - zcVar.j();
            return Math.min(Math.min(j2, e(zcVar.h, j3)), j3 - zcVar.h.f);
        }
        return j2;
    }

    private long f(pc pcVar, long j) {
        zc zcVar = pcVar.d;
        if (zcVar instanceof uc) {
            return j;
        }
        int size = pcVar.k.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            nc ncVar = pcVar.k.get(i);
            if (ncVar instanceof pc) {
                pc pcVar2 = (pc) ncVar;
                if (pcVar2.d != zcVar) {
                    j2 = Math.max(j2, f(pcVar2, pcVar2.f + j));
                }
            }
        }
        if (pcVar == zcVar.h) {
            long j3 = j + zcVar.j();
            return Math.max(Math.max(j2, f(zcVar.i, j3)), j3 - zcVar.i.f);
        }
        return j2;
    }

    public void a(zc zcVar) {
        this.i.add(zcVar);
        this.h = zcVar;
    }

    public long b(ac acVar, int i) {
        zc zcVar = this.g;
        if (zcVar instanceof mc) {
            if (((mc) zcVar).f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(zcVar instanceof vc)) {
                return 0L;
            }
        } else if (!(zcVar instanceof xc)) {
            return 0L;
        }
        pc pcVar = (i == 0 ? acVar.K : acVar.L).h;
        pc pcVar2 = (i == 0 ? acVar.K : acVar.L).i;
        boolean contains = zcVar.h.l.contains(pcVar);
        boolean contains2 = this.g.i.l.contains(pcVar2);
        long j = this.g.j();
        if (!contains || !contains2) {
            if (contains) {
                pc pcVar3 = this.g.h;
                return Math.max(f(pcVar3, pcVar3.f), this.g.h.f + j);
            } else if (contains2) {
                pc pcVar4 = this.g.i;
                return Math.max(-e(pcVar4, pcVar4.f), (-this.g.i.f) + j);
            } else {
                zc zcVar2 = this.g;
                return (zcVar2.j() + zcVar2.h.f) - this.g.i.f;
            }
        }
        long f = f(this.g.h, 0L);
        long e = e(this.g.i, 0L);
        long j2 = f - j;
        zc zcVar3 = this.g;
        int i2 = zcVar3.i.f;
        if (j2 >= (-i2)) {
            j2 += i2;
        }
        int i3 = zcVar3.h.f;
        long j3 = ((-e) - j) - i3;
        if (j3 >= i3) {
            j3 -= i3;
        }
        float u = zcVar3.b.u(i);
        float f2 = (float) (u > 0.0f ? (((float) j2) / (1.0f - u)) + (((float) j3) / u) : 0L);
        long a2 = (f2 * u) + 0.5f + j + wo1.a(1.0f, u, f2, 0.5f);
        zc zcVar4 = this.g;
        return (zcVar4.h.f + a2) - zcVar4.i.f;
    }

    public void d(boolean z, boolean z2) {
        if (z) {
            zc zcVar = this.g;
            if (zcVar instanceof vc) {
                c(zcVar, 0);
            }
        }
        if (z2) {
            zc zcVar2 = this.g;
            if (zcVar2 instanceof xc) {
                c(zcVar2, 1);
            }
        }
    }
}
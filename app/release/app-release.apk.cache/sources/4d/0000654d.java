package com.p7700g.p99005;

import com.p7700g.p99005.zb;
import java.util.ArrayList;

/* compiled from: ChainHead.java */
/* loaded from: classes.dex */
public class xb {
    public zb a;
    public zb b;
    public zb c;
    public zb d;
    public zb e;
    public zb f;
    public zb g;
    public ArrayList<zb> h;
    public int i;
    public int j;
    public float k = 0.0f;
    public int l;
    public int m;
    public int n;
    public boolean o;
    private int p;
    private boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    private boolean v;

    public xb(zb zbVar, int i, boolean z) {
        this.q = false;
        this.a = zbVar;
        this.p = i;
        this.q = z;
    }

    private void b() {
        int i = this.p * 2;
        zb zbVar = this.a;
        boolean z = true;
        this.o = true;
        zb zbVar2 = zbVar;
        boolean z2 = false;
        while (!z2) {
            this.i++;
            zb[] zbVarArr = zbVar.v1;
            int i2 = this.p;
            zb zbVar3 = null;
            zbVarArr[i2] = null;
            zbVar.u1[i2] = null;
            if (zbVar.l0() != 8) {
                this.l++;
                zb.b z3 = zbVar.z(this.p);
                zb.b bVar = zb.b.MATCH_CONSTRAINT;
                if (z3 != bVar) {
                    this.m = zbVar.M(this.p) + this.m;
                }
                int g = zbVar.E0[i].g() + this.m;
                this.m = g;
                int i3 = i + 1;
                this.m = zbVar.E0[i3].g() + g;
                int g2 = zbVar.E0[i].g() + this.n;
                this.n = g2;
                this.n = zbVar.E0[i3].g() + g2;
                if (this.b == null) {
                    this.b = zbVar;
                }
                this.d = zbVar;
                zb.b[] bVarArr = zbVar.H0;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = zbVar.e0;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = zbVar.t1;
                        float f = fArr[i4];
                        if (f > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (k(zbVar, i4)) {
                            if (f < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(zbVar);
                        }
                        if (this.f == null) {
                            this.f = zbVar;
                        }
                        zb zbVar4 = this.g;
                        if (zbVar4 != null) {
                            zbVar4.u1[this.p] = zbVar;
                        }
                        this.g = zbVar;
                    }
                    if (this.p == 0) {
                        if (zbVar.c0 != 0) {
                            this.o = false;
                        } else if (zbVar.f0 != 0 || zbVar.g0 != 0) {
                            this.o = false;
                        }
                    } else if (zbVar.d0 != 0) {
                        this.o = false;
                    } else if (zbVar.i0 != 0 || zbVar.j0 != 0) {
                        this.o = false;
                    }
                    if (zbVar.L0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (zbVar2 != zbVar) {
                zbVar2.v1[this.p] = zbVar;
            }
            yb ybVar = zbVar.E0[i + 1].h;
            if (ybVar != null) {
                zb zbVar5 = ybVar.f;
                yb[] ybVarArr = zbVar5.E0;
                if (ybVarArr[i].h != null && ybVarArr[i].h.f == zbVar) {
                    zbVar3 = zbVar5;
                }
            }
            if (zbVar3 == null) {
                zbVar3 = zbVar;
                z2 = true;
            }
            zbVar2 = zbVar;
            zbVar = zbVar3;
        }
        zb zbVar6 = this.b;
        if (zbVar6 != null) {
            this.m -= zbVar6.E0[i].g();
        }
        zb zbVar7 = this.d;
        if (zbVar7 != null) {
            this.m -= zbVar7.E0[i + 1].g();
        }
        this.c = zbVar;
        if (this.p == 0 && this.q) {
            this.e = zbVar;
        } else {
            this.e = this.a;
        }
        this.t = (this.s && this.r) ? false : false;
    }

    private static boolean k(zb zbVar, int i) {
        if (zbVar.l0() != 8 && zbVar.H0[i] == zb.b.MATCH_CONSTRAINT) {
            int[] iArr = zbVar.e0;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }

    public zb c() {
        return this.a;
    }

    public zb d() {
        return this.f;
    }

    public zb e() {
        return this.b;
    }

    public zb f() {
        return this.e;
    }

    public zb g() {
        return this.c;
    }

    public zb h() {
        return this.g;
    }

    public zb i() {
        return this.d;
    }

    public float j() {
        return this.k;
    }
}
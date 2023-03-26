package com.p7700g.p99005;

import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ChainRun.java */
/* loaded from: classes.dex */
public class mc extends zc {
    public ArrayList<zc> k;
    private int l;

    public mc(zb zbVar, int i) {
        super(zbVar);
        this.k = new ArrayList<>();
        this.f = i;
        u();
    }

    private void u() {
        zb zbVar;
        zb zbVar2 = this.b;
        zb V = zbVar2.V(this.f);
        while (true) {
            zb zbVar3 = V;
            zbVar = zbVar2;
            zbVar2 = zbVar3;
            if (zbVar2 == null) {
                break;
            }
            V = zbVar2.V(this.f);
        }
        this.b = zbVar;
        this.k.add(zbVar.a0(this.f));
        zb R = zbVar.R(this.f);
        while (R != null) {
            this.k.add(R.a0(this.f));
            R = R.R(this.f);
        }
        Iterator<zc> it = this.k.iterator();
        while (it.hasNext()) {
            zc next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.I = this;
            } else if (i == 1) {
                next.b.J = this;
            }
        }
        if ((this.f == 0 && ((ac) this.b.U()).O2()) && this.k.size() > 1) {
            ArrayList<zc> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        this.l = this.f == 0 ? this.b.G() : this.b.i0();
    }

    private zb v() {
        for (int i = 0; i < this.k.size(); i++) {
            zc zcVar = this.k.get(i);
            if (zcVar.b.l0() != 8) {
                return zcVar.b;
            }
        }
        return null;
    }

    private zb w() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            zc zcVar = this.k.get(size);
            if (zcVar.b.l0() != 8) {
                return zcVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0402, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // com.p7700g.p99005.zc, com.p7700g.p99005.nc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(nc ncVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int i10;
        int i11;
        float f2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.h.j && this.i.j) {
            zb U = this.b.U();
            boolean O2 = U instanceof ac ? ((ac) U).O2() : false;
            int i17 = this.i.g - this.h.g;
            int size = this.k.size();
            int i18 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i18 >= size) {
                    i18 = -1;
                    break;
                } else if (this.k.get(i18).b.l0() != 8) {
                    break;
                } else {
                    i18++;
                }
            }
            int i19 = size - 1;
            int i20 = i19;
            while (true) {
                if (i20 < 0) {
                    break;
                }
                if (this.k.get(i20).b.l0() != 8) {
                    i = i20;
                    break;
                }
                i20--;
            }
            int i21 = 0;
            while (i21 < 2) {
                int i22 = 0;
                i4 = 0;
                i5 = 0;
                int i23 = 0;
                f = 0.0f;
                while (i22 < size) {
                    zc zcVar = this.k.get(i22);
                    if (zcVar.b.l0() != i2) {
                        i23++;
                        if (i22 > 0 && i22 >= i18) {
                            i4 += zcVar.h.f;
                        }
                        qc qcVar = zcVar.e;
                        int i24 = qcVar.g;
                        boolean z3 = zcVar.d != zb.b.MATCH_CONSTRAINT;
                        if (z3) {
                            int i25 = this.f;
                            if (i25 == 0 && !zcVar.b.K.e.j) {
                                return;
                            }
                            if (i25 == 1 && !zcVar.b.L.e.j) {
                                return;
                            }
                            i15 = i24;
                        } else {
                            i15 = i24;
                            if (zcVar.a == 1 && i21 == 0) {
                                i16 = qcVar.m;
                                i5++;
                            } else if (qcVar.j) {
                                i16 = i15;
                            }
                            z3 = true;
                            if (z3) {
                                i5++;
                                float f3 = zcVar.b.t1[this.f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i4 += i16;
                            }
                            if (i22 < i19 && i22 < i) {
                                i4 += -zcVar.i.f;
                            }
                        }
                        i16 = i15;
                        if (z3) {
                        }
                        if (i22 < i19) {
                            i4 += -zcVar.i.f;
                        }
                    }
                    i22++;
                    i2 = 8;
                }
                if (i4 < i17 || i5 == 0) {
                    i3 = i23;
                    break;
                } else {
                    i21++;
                    i2 = 8;
                }
            }
            i3 = 0;
            i4 = 0;
            i5 = 0;
            f = 0.0f;
            int i26 = this.h.g;
            if (O2) {
                i26 = this.i.g;
            }
            if (i4 > i17) {
                i26 = O2 ? i26 + ((int) (((i4 - i17) / 2.0f) + 0.5f)) : i26 - ((int) (((i4 - i17) / 2.0f) + 0.5f));
            }
            if (i5 > 0) {
                float f4 = i17 - i4;
                int i27 = (int) ((f4 / i5) + 0.5f);
                int i28 = 0;
                int i29 = 0;
                while (i28 < size) {
                    zc zcVar2 = this.k.get(i28);
                    int i30 = i27;
                    int i31 = i4;
                    if (zcVar2.b.l0() != 8 && zcVar2.d == zb.b.MATCH_CONSTRAINT) {
                        qc qcVar2 = zcVar2.e;
                        if (!qcVar2.j) {
                            if (f > 0.0f) {
                                i11 = i26;
                                i12 = (int) (((zcVar2.b.t1[this.f] * f4) / f) + 0.5f);
                            } else {
                                i11 = i26;
                                i12 = i30;
                            }
                            if (this.f == 0) {
                                zb zbVar = zcVar2.b;
                                f2 = f4;
                                i14 = zbVar.g0;
                                i13 = zbVar.f0;
                                z2 = O2;
                            } else {
                                f2 = f4;
                                zb zbVar2 = zcVar2.b;
                                int i32 = zbVar2.j0;
                                z2 = O2;
                                i13 = zbVar2.i0;
                                i14 = i32;
                            }
                            i10 = i3;
                            int max = Math.max(i13, zcVar2.a == 1 ? Math.min(i12, qcVar2.m) : i12);
                            if (i14 > 0) {
                                max = Math.min(i14, max);
                            }
                            if (max != i12) {
                                i29++;
                                i12 = max;
                            }
                            zcVar2.e.e(i12);
                            i28++;
                            i27 = i30;
                            i4 = i31;
                            i26 = i11;
                            f4 = f2;
                            O2 = z2;
                            i3 = i10;
                        }
                    }
                    z2 = O2;
                    i10 = i3;
                    i11 = i26;
                    f2 = f4;
                    i28++;
                    i27 = i30;
                    i4 = i31;
                    i26 = i11;
                    f4 = f2;
                    O2 = z2;
                    i3 = i10;
                }
                z = O2;
                i6 = i3;
                i7 = i26;
                int i33 = i4;
                if (i29 > 0) {
                    i5 -= i29;
                    int i34 = 0;
                    for (int i35 = 0; i35 < size; i35++) {
                        zc zcVar3 = this.k.get(i35);
                        if (zcVar3.b.l0() != 8) {
                            if (i35 > 0 && i35 >= i18) {
                                i34 += zcVar3.h.f;
                            }
                            i34 += zcVar3.e.g;
                            if (i35 < i19 && i35 < i) {
                                i34 += -zcVar3.i.f;
                            }
                        }
                    }
                    i4 = i34;
                } else {
                    i4 = i33;
                }
                i8 = 2;
                if (this.l == 2 && i29 == 0) {
                    this.l = 0;
                }
            } else {
                z = O2;
                i6 = i3;
                i7 = i26;
                i8 = 2;
            }
            if (i4 > i17) {
                this.l = i8;
            }
            if (i6 > 0 && i5 == 0 && i18 == i) {
                this.l = i8;
            }
            int i36 = this.l;
            if (i36 == 1) {
                int i37 = i6;
                if (i37 > 1) {
                    i9 = (i17 - i4) / (i37 - 1);
                } else {
                    i9 = i37 == 1 ? (i17 - i4) / 2 : 0;
                }
                if (i5 > 0) {
                    i9 = 0;
                }
                int i38 = i7;
                for (int i39 = 0; i39 < size; i39++) {
                    zc zcVar4 = this.k.get(z ? size - (i39 + 1) : i39);
                    if (zcVar4.b.l0() == 8) {
                        zcVar4.h.e(i38);
                        zcVar4.i.e(i38);
                    } else {
                        if (i39 > 0) {
                            i38 = z ? i38 - i9 : i38 + i9;
                        }
                        if (i39 > 0 && i39 >= i18) {
                            if (z) {
                                i38 -= zcVar4.h.f;
                            } else {
                                i38 += zcVar4.h.f;
                            }
                        }
                        if (z) {
                            zcVar4.i.e(i38);
                        } else {
                            zcVar4.h.e(i38);
                        }
                        qc qcVar3 = zcVar4.e;
                        int i40 = qcVar3.g;
                        if (zcVar4.d == zb.b.MATCH_CONSTRAINT && zcVar4.a == 1) {
                            i40 = qcVar3.m;
                        }
                        i38 = z ? i38 - i40 : i38 + i40;
                        if (z) {
                            zcVar4.h.e(i38);
                        } else {
                            zcVar4.i.e(i38);
                        }
                        zcVar4.g = true;
                        if (i39 < i19 && i39 < i) {
                            if (z) {
                                i38 -= -zcVar4.i.f;
                            } else {
                                i38 += -zcVar4.i.f;
                            }
                        }
                    }
                }
                return;
            }
            int i41 = i6;
            if (i36 == 0) {
                int i42 = (i17 - i4) / (i41 + 1);
                if (i5 > 0) {
                    i42 = 0;
                }
                int i43 = i7;
                for (int i44 = 0; i44 < size; i44++) {
                    zc zcVar5 = this.k.get(z ? size - (i44 + 1) : i44);
                    if (zcVar5.b.l0() == 8) {
                        zcVar5.h.e(i43);
                        zcVar5.i.e(i43);
                    } else {
                        int i45 = z ? i43 - i42 : i43 + i42;
                        if (i44 > 0 && i44 >= i18) {
                            if (z) {
                                i45 -= zcVar5.h.f;
                            } else {
                                i45 += zcVar5.h.f;
                            }
                        }
                        if (z) {
                            zcVar5.i.e(i45);
                        } else {
                            zcVar5.h.e(i45);
                        }
                        qc qcVar4 = zcVar5.e;
                        int i46 = qcVar4.g;
                        if (zcVar5.d == zb.b.MATCH_CONSTRAINT && zcVar5.a == 1) {
                            i46 = Math.min(i46, qcVar4.m);
                        }
                        i43 = z ? i45 - i46 : i45 + i46;
                        if (z) {
                            zcVar5.h.e(i43);
                        } else {
                            zcVar5.i.e(i43);
                        }
                        if (i44 < i19 && i44 < i) {
                            if (z) {
                                i43 -= -zcVar5.i.f;
                            } else {
                                i43 += -zcVar5.i.f;
                            }
                        }
                    }
                }
            } else if (i36 == 2) {
                float E = this.f == 0 ? this.b.E() : this.b.g0();
                if (z) {
                    E = 1.0f - E;
                }
                int i47 = (((int) ((((float) (i17 - i4)) * E) + 0.5f)) < 0 || i5 > 0) ? 0 : 0;
                int i48 = z ? i7 - i47 : i7 + i47;
                for (int i49 = 0; i49 < size; i49++) {
                    zc zcVar6 = this.k.get(z ? size - (i49 + 1) : i49);
                    if (zcVar6.b.l0() == 8) {
                        zcVar6.h.e(i48);
                        zcVar6.i.e(i48);
                    } else {
                        if (i49 > 0 && i49 >= i18) {
                            if (z) {
                                i48 -= zcVar6.h.f;
                            } else {
                                i48 += zcVar6.h.f;
                            }
                        }
                        if (z) {
                            zcVar6.i.e(i48);
                        } else {
                            zcVar6.h.e(i48);
                        }
                        qc qcVar5 = zcVar6.e;
                        int i50 = qcVar5.g;
                        if (zcVar6.d == zb.b.MATCH_CONSTRAINT && zcVar6.a == 1) {
                            i50 = qcVar5.m;
                        }
                        i48 += i50;
                        if (z) {
                            zcVar6.h.e(i48);
                        } else {
                            zcVar6.i.e(i48);
                        }
                        if (i49 < i19 && i49 < i) {
                            if (z) {
                                i48 -= -zcVar6.i.f;
                            } else {
                                i48 += -zcVar6.i.f;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.zc
    public void d() {
        Iterator<zc> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        zb zbVar = this.k.get(0).b;
        zb zbVar2 = this.k.get(size - 1).b;
        if (this.f == 0) {
            yb ybVar = zbVar.w0;
            yb ybVar2 = zbVar2.y0;
            pc i = i(ybVar, 0);
            int g = ybVar.g();
            zb v = v();
            if (v != null) {
                g = v.w0.g();
            }
            if (i != null) {
                b(this.h, i, g);
            }
            pc i2 = i(ybVar2, 0);
            int g2 = ybVar2.g();
            zb w = w();
            if (w != null) {
                g2 = w.y0.g();
            }
            if (i2 != null) {
                b(this.i, i2, -g2);
            }
        } else {
            yb ybVar3 = zbVar.x0;
            yb ybVar4 = zbVar2.z0;
            pc i3 = i(ybVar3, 1);
            int g3 = ybVar3.g();
            zb v2 = v();
            if (v2 != null) {
                g3 = v2.x0.g();
            }
            if (i3 != null) {
                b(this.h, i3, g3);
            }
            pc i4 = i(ybVar4, 1);
            int g4 = ybVar4.g();
            zb w2 = w();
            if (w2 != null) {
                g4 = w2.z0.g();
            }
            if (i4 != null) {
                b(this.i, i4, -g4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // com.p7700g.p99005.zc
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // com.p7700g.p99005.zc
    public void f() {
        this.c = null;
        Iterator<zc> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // com.p7700g.p99005.zc
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zc zcVar = this.k.get(i);
            j = zcVar.i.f + zcVar.j() + j + zcVar.h.f;
        }
        return j;
    }

    @Override // com.p7700g.p99005.zc
    public void n() {
        this.h.j = false;
        this.i.j = false;
    }

    @Override // com.p7700g.p99005.zc
    public boolean p() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).p()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f == 0 ? "horizontal : " : "vertical : ");
        Iterator<zc> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
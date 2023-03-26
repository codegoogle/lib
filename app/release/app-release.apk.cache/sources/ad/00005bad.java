package com.p7700g.p99005;

import com.p7700g.p99005.lc;
import com.p7700g.p99005.yb;
import com.p7700g.p99005.zb;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Grouping.java */
/* loaded from: classes.dex */
public class sc {
    private static final boolean a = false;
    private static final boolean b = false;

    public static yc a(zb zbVar, int i, ArrayList<yc> arrayList, yc ycVar) {
        int i2;
        int l2;
        if (i == 0) {
            i2 = zbVar.y1;
        } else {
            i2 = zbVar.z1;
        }
        if (i2 != -1 && (ycVar == null || i2 != ycVar.d)) {
            int i3 = 0;
            while (true) {
                if (i3 >= arrayList.size()) {
                    break;
                }
                yc ycVar2 = arrayList.get(i3);
                if (ycVar2.f() == i2) {
                    if (ycVar != null) {
                        ycVar.m(i, ycVar2);
                        arrayList.remove(ycVar);
                    }
                    ycVar = ycVar2;
                } else {
                    i3++;
                }
            }
        } else if (i2 != -1) {
            return ycVar;
        }
        if (ycVar == null) {
            if ((zbVar instanceof ec) && (l2 = ((ec) zbVar).l2(i)) != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= arrayList.size()) {
                        break;
                    }
                    yc ycVar3 = arrayList.get(i4);
                    if (ycVar3.f() == l2) {
                        ycVar = ycVar3;
                        break;
                    }
                    i4++;
                }
            }
            if (ycVar == null) {
                ycVar = new yc(i);
            }
            arrayList.add(ycVar);
        }
        if (ycVar.a(zbVar)) {
            if (zbVar instanceof cc) {
                cc ccVar = (cc) zbVar;
                ccVar.l2().d(ccVar.m2() == 0 ? 1 : 0, arrayList, ycVar);
            }
            if (i == 0) {
                zbVar.y1 = ycVar.f();
                zbVar.w0.d(i, arrayList, ycVar);
                zbVar.y0.d(i, arrayList, ycVar);
            } else {
                zbVar.z1 = ycVar.f();
                zbVar.x0.d(i, arrayList, ycVar);
                zbVar.A0.d(i, arrayList, ycVar);
                zbVar.z0.d(i, arrayList, ycVar);
            }
            zbVar.D0.d(i, arrayList, ycVar);
        }
        return ycVar;
    }

    private static yc b(ArrayList<yc> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            yc ycVar = arrayList.get(i2);
            if (i == ycVar.d) {
                return ycVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03a0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(ac acVar, lc.b bVar) {
        yc ycVar;
        yc ycVar2;
        ArrayList<zb> l2 = acVar.l2();
        int size = l2.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            zb zbVar = l2.get(i2);
            if (!d(acVar.H(), acVar.j0(), zbVar.H(), zbVar.j0()) || (zbVar instanceof bc)) {
                return false;
            }
        }
        j8 j8Var = acVar.L1;
        if (j8Var != null) {
            j8Var.Q++;
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            zb zbVar2 = l2.get(i3);
            if (!d(acVar.H(), acVar.j0(), zbVar2.H(), zbVar2.j0())) {
                ac.R2(i, zbVar2, bVar, acVar.k2, lc.a.a);
            }
            boolean z = zbVar2 instanceof cc;
            if (z) {
                cc ccVar = (cc) zbVar2;
                if (ccVar.m2() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(ccVar);
                }
                if (ccVar.m2() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(ccVar);
                }
            }
            if (zbVar2 instanceof ec) {
                if (zbVar2 instanceof vb) {
                    vb vbVar = (vb) zbVar2;
                    if (vbVar.r2() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(vbVar);
                    }
                    if (vbVar.r2() == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(vbVar);
                    }
                } else {
                    ec ecVar = (ec) zbVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(ecVar);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                    }
                    arrayList4.add(ecVar);
                }
            }
            if (zbVar2.w0.h == null && zbVar2.y0.h == null && !z && !(zbVar2 instanceof vb)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(zbVar2);
            }
            if (zbVar2.x0.h == null && zbVar2.z0.h == null && zbVar2.A0.h == null && !z && !(zbVar2 instanceof vb)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(zbVar2);
            }
            i3++;
            i = 0;
        }
        ArrayList<yc> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((cc) it.next(), 0, arrayList7, null);
            }
        }
        int i4 = 0;
        yc ycVar3 = null;
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ec ecVar2 = (ec) it2.next();
                yc a2 = a(ecVar2, i4, arrayList7, ycVar3);
                ecVar2.k2(arrayList7, i4, a2);
                a2.c(arrayList7);
                i4 = 0;
                ycVar3 = null;
            }
        }
        yb r = acVar.r(yb.b.LEFT);
        if (r.e() != null) {
            Iterator<yb> it3 = r.e().iterator();
            while (it3.hasNext()) {
                a(it3.next().f, 0, arrayList7, null);
            }
        }
        yb r2 = acVar.r(yb.b.RIGHT);
        if (r2.e() != null) {
            Iterator<yb> it4 = r2.e().iterator();
            while (it4.hasNext()) {
                a(it4.next().f, 0, arrayList7, null);
            }
        }
        yb r3 = acVar.r(yb.b.CENTER);
        if (r3.e() != null) {
            Iterator<yb> it5 = r3.e().iterator();
            while (it5.hasNext()) {
                a(it5.next().f, 0, arrayList7, null);
            }
        }
        yc ycVar4 = null;
        if (arrayList5 != null) {
            Iterator it6 = arrayList5.iterator();
            while (it6.hasNext()) {
                a((zb) it6.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it7 = arrayList3.iterator();
            while (it7.hasNext()) {
                a((cc) it7.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            Iterator it8 = arrayList4.iterator();
            while (it8.hasNext()) {
                ec ecVar3 = (ec) it8.next();
                yc a3 = a(ecVar3, i5, arrayList7, ycVar4);
                ecVar3.k2(arrayList7, i5, a3);
                a3.c(arrayList7);
                i5 = 1;
                ycVar4 = null;
            }
        }
        yb r4 = acVar.r(yb.b.TOP);
        if (r4.e() != null) {
            Iterator<yb> it9 = r4.e().iterator();
            while (it9.hasNext()) {
                a(it9.next().f, 1, arrayList7, null);
            }
        }
        yb r5 = acVar.r(yb.b.BASELINE);
        if (r5.e() != null) {
            Iterator<yb> it10 = r5.e().iterator();
            while (it10.hasNext()) {
                a(it10.next().f, 1, arrayList7, null);
            }
        }
        yb r6 = acVar.r(yb.b.BOTTOM);
        if (r6.e() != null) {
            Iterator<yb> it11 = r6.e().iterator();
            while (it11.hasNext()) {
                a(it11.next().f, 1, arrayList7, null);
            }
        }
        yb r7 = acVar.r(yb.b.CENTER);
        if (r7.e() != null) {
            Iterator<yb> it12 = r7.e().iterator();
            while (it12.hasNext()) {
                a(it12.next().f, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it13 = arrayList6.iterator();
            while (it13.hasNext()) {
                a((zb) it13.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            zb zbVar3 = l2.get(i6);
            if (zbVar3.Q0()) {
                yc b2 = b(arrayList7, zbVar3.y1);
                yc b3 = b(arrayList7, zbVar3.z1);
                if (b2 != null && b3 != null) {
                    b2.m(0, b3);
                    b3.o(2);
                    arrayList7.remove(b2);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (acVar.H() == zb.b.WRAP_CONTENT) {
            Iterator<yc> it14 = arrayList7.iterator();
            ycVar = null;
            int i7 = 0;
            while (it14.hasNext()) {
                yc next = it14.next();
                if (next.g() != 1) {
                    next.n(false);
                    int l = next.l(acVar.I2(), 0);
                    if (l > i7) {
                        ycVar = next;
                        i7 = l;
                    }
                }
            }
            if (ycVar != null) {
                acVar.D1(zb.b.FIXED);
                acVar.c2(i7);
                ycVar.n(true);
                if (acVar.j0() != zb.b.WRAP_CONTENT) {
                    Iterator<yc> it15 = arrayList7.iterator();
                    yc ycVar5 = null;
                    int i8 = 0;
                    while (it15.hasNext()) {
                        yc next2 = it15.next();
                        if (next2.g() != 0) {
                            next2.n(false);
                            int l3 = next2.l(acVar.I2(), 1);
                            if (l3 > i8) {
                                ycVar5 = next2;
                                i8 = l3;
                            }
                        }
                    }
                    if (ycVar5 != null) {
                        acVar.Y1(zb.b.FIXED);
                        acVar.y1(i8);
                        ycVar5.n(true);
                        ycVar2 = ycVar5;
                        return ycVar == null || ycVar2 != null;
                    }
                }
                ycVar2 = null;
                if (ycVar == null) {
                }
            }
        }
        ycVar = null;
        if (acVar.j0() != zb.b.WRAP_CONTENT) {
        }
        ycVar2 = null;
        if (ycVar == null) {
        }
    }

    public static boolean d(zb.b bVar, zb.b bVar2, zb.b bVar3, zb.b bVar4) {
        zb.b bVar5;
        zb.b bVar6;
        zb.b bVar7 = zb.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = zb.b.WRAP_CONTENT) || (bVar3 == zb.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = zb.b.WRAP_CONTENT) || (bVar4 == zb.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
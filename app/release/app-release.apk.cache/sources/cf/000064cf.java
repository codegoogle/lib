package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: DiffUtil.java */
/* loaded from: classes.dex */
public class x20 {
    private static final Comparator<g> a = new a();

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<g> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(g gVar, g gVar2) {
            int i = gVar.a - gVar2.a;
            return i == 0 ? gVar.b - gVar2.b : i;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract boolean a(int i, int i2);

        public abstract boolean b(int i, int i2);

        @z1
        public Object c(int i, int i2) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class c {
        public static final int a = -1;
        private static final int b = 1;
        private static final int c = 2;
        private static final int d = 4;
        private static final int e = 8;
        private static final int f = 16;
        private static final int g = 5;
        private static final int h = 31;
        private final List<g> i;
        private final int[] j;
        private final int[] k;
        private final b l;
        private final int m;
        private final int n;
        private final boolean o;

        public c(b bVar, List<g> list, int[] iArr, int[] iArr2, boolean z) {
            this.i = list;
            this.j = iArr;
            this.k = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.l = bVar;
            this.m = bVar.e();
            this.n = bVar.d();
            this.o = z;
            a();
            j();
        }

        private void a() {
            g gVar = this.i.isEmpty() ? null : this.i.get(0);
            if (gVar != null && gVar.a == 0 && gVar.b == 0) {
                return;
            }
            g gVar2 = new g();
            gVar2.a = 0;
            gVar2.b = 0;
            gVar2.d = false;
            gVar2.c = 0;
            gVar2.e = false;
            this.i.add(0, gVar2);
        }

        private void d(List<e> list, i30 i30Var, int i, int i2, int i3) {
            if (!this.o) {
                i30Var.b(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.k;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    i30Var.b(i, 1);
                    for (e eVar : list) {
                        eVar.b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    i30Var.a(m(list, i7, true).b, i);
                    if (i6 == 4) {
                        i30Var.f(i, 1, this.l.c(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new e(i5, i, false));
                } else {
                    StringBuilder H = wo1.H("unknown flag for pos ", i5, " ");
                    H.append(Long.toBinaryString(i6));
                    throw new IllegalStateException(H.toString());
                }
            }
        }

        private void e(List<e> list, i30 i30Var, int i, int i2, int i3) {
            if (!this.o) {
                i30Var.d(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int[] iArr = this.j;
                int i5 = i3 + i4;
                int i6 = iArr[i5] & 31;
                if (i6 == 0) {
                    i30Var.d(i + i4, 1);
                    for (e eVar : list) {
                        eVar.b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = iArr[i5] >> 5;
                    e m = m(list, i7, false);
                    i30Var.a(i + i4, m.b - 1);
                    if (i6 == 4) {
                        i30Var.f(m.b - 1, 1, this.l.c(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new e(i5, i + i4, true));
                } else {
                    StringBuilder H = wo1.H("unknown flag for pos ", i5, " ");
                    H.append(Long.toBinaryString(i6));
                    throw new IllegalStateException(H.toString());
                }
            }
        }

        private void h(int i, int i2, int i3) {
            if (this.j[i - 1] != 0) {
                return;
            }
            i(i, i2, i3, false);
        }

        private boolean i(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            int i6;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i4 = i - 1;
                i5 = i4;
            }
            while (i3 >= 0) {
                g gVar = this.i.get(i3);
                int i7 = gVar.a;
                int i8 = gVar.c;
                int i9 = i7 + i8;
                int i10 = gVar.b + i8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i9; i11--) {
                        if (this.l.b(i11, i4)) {
                            i6 = this.l.a(i11, i4) ? 8 : 4;
                            this.k[i4] = (i11 << 5) | 16;
                            this.j[i11] = (i4 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i10; i12--) {
                        if (this.l.b(i4, i12)) {
                            i6 = this.l.a(i4, i12) ? 8 : 4;
                            int i13 = i - 1;
                            this.j[i13] = (i12 << 5) | 16;
                            this.k[i12] = (i13 << 5) | i6;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = gVar.a;
                i2 = gVar.b;
                i3--;
            }
            return false;
        }

        private void j() {
            int i = this.m;
            int i2 = this.n;
            for (int size = this.i.size() - 1; size >= 0; size--) {
                g gVar = this.i.get(size);
                int i3 = gVar.a;
                int i4 = gVar.c;
                int i5 = i3 + i4;
                int i6 = gVar.b + i4;
                if (this.o) {
                    while (i > i5) {
                        h(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        k(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < gVar.c; i7++) {
                    int i8 = gVar.a + i7;
                    int i9 = gVar.b + i7;
                    int i10 = this.l.a(i8, i9) ? 1 : 2;
                    this.j[i8] = (i9 << 5) | i10;
                    this.k[i9] = (i8 << 5) | i10;
                }
                i = gVar.a;
                i2 = gVar.b;
            }
        }

        private void k(int i, int i2, int i3) {
            if (this.k[i2 - 1] != 0) {
                return;
            }
            i(i, i2, i3, true);
        }

        private static e m(List<e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                e eVar = list.get(size);
                if (eVar.a == i && eVar.c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        list.get(size).b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        public int b(@p1(from = 0) int i) {
            if (i >= 0 && i < this.n) {
                int i2 = this.k[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            StringBuilder H = wo1.H("Index out of bounds - passed position = ", i, ", new list size = ");
            H.append(this.n);
            throw new IndexOutOfBoundsException(H.toString());
        }

        public int c(@p1(from = 0) int i) {
            if (i >= 0 && i < this.m) {
                int i2 = this.j[i];
                if ((i2 & 31) == 0) {
                    return -1;
                }
                return i2 >> 5;
            }
            StringBuilder H = wo1.H("Index out of bounds - passed position = ", i, ", old list size = ");
            H.append(this.m);
            throw new IndexOutOfBoundsException(H.toString());
        }

        public void f(@x1 i30 i30Var) {
            u20 u20Var;
            if (i30Var instanceof u20) {
                u20Var = (u20) i30Var;
            } else {
                u20Var = new u20(i30Var);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.m;
            int i2 = this.n;
            for (int size = this.i.size() - 1; size >= 0; size--) {
                g gVar = this.i.get(size);
                int i3 = gVar.c;
                int i4 = gVar.a + i3;
                int i5 = gVar.b + i3;
                if (i4 < i) {
                    e(arrayList, u20Var, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    d(arrayList, u20Var, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.j;
                    int i7 = gVar.a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        u20Var.f(i7 + i6, 1, this.l.c(i7 + i6, gVar.b + i6));
                    }
                }
                i = gVar.a;
                i2 = gVar.b;
            }
            u20Var.c();
        }

        public void g(@x1 RecyclerView.g gVar) {
            f(new q20(gVar));
        }

        @r2
        public List<g> l() {
            return this.i;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static abstract class d<T> {
        public abstract boolean a(@x1 T t, @x1 T t2);

        public abstract boolean b(@x1 T t, @x1 T t2);

        @z1
        public Object c(@x1 T t, @x1 T t2) {
            return null;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class e {
        public int a;
        public int b;
        public boolean c;

        public e(int i, int i2, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class f {
        public int a;
        public int b;
        public int c;
        public int d;

        public f() {
        }

        public f(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    /* compiled from: DiffUtil.java */
    /* loaded from: classes.dex */
    public static class g {
        public int a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
    }

    private x20() {
    }

    @x1
    public static c a(@x1 b bVar) {
        return b(bVar, true);
    }

    @x1
    public static c b(@x1 b bVar, boolean z) {
        int e2 = bVar.e();
        int d2 = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new f(0, e2, 0, d2));
        int abs = Math.abs(e2 - d2) + e2 + d2;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            f fVar = (f) arrayList2.remove(arrayList2.size() - 1);
            g c2 = c(bVar, fVar.a, fVar.b, fVar.c, fVar.d, iArr, iArr2, abs);
            if (c2 != null) {
                if (c2.c > 0) {
                    arrayList.add(c2);
                }
                c2.a += fVar.a;
                c2.b += fVar.c;
                f fVar2 = arrayList3.isEmpty() ? new f() : (f) arrayList3.remove(arrayList3.size() - 1);
                fVar2.a = fVar.a;
                fVar2.c = fVar.c;
                if (c2.e) {
                    fVar2.b = c2.a;
                    fVar2.d = c2.b;
                } else if (c2.d) {
                    fVar2.b = c2.a - 1;
                    fVar2.d = c2.b;
                } else {
                    fVar2.b = c2.a;
                    fVar2.d = c2.b - 1;
                }
                arrayList2.add(fVar2);
                if (c2.e) {
                    if (c2.d) {
                        int i2 = c2.a;
                        int i3 = c2.c;
                        fVar.a = i2 + i3 + 1;
                        fVar.c = c2.b + i3;
                    } else {
                        int i4 = c2.a;
                        int i5 = c2.c;
                        fVar.a = i4 + i5;
                        fVar.c = c2.b + i5 + 1;
                    }
                } else {
                    int i6 = c2.a;
                    int i7 = c2.c;
                    fVar.a = i6 + i7;
                    fVar.c = c2.b + i7;
                }
                arrayList2.add(fVar);
            } else {
                arrayList3.add(fVar);
            }
        }
        Collections.sort(arrayList, a);
        return new c(bVar, arrayList, iArr, iArr2, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r24[r13 - 1] < r24[r13 + r5]) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
        if (r25[r12 - 1] < r25[r12 + 1]) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1 A[LOOP:4: B:52:0x00cd->B:56:0x00e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ec A[EDGE_INSN: B:89:0x00ec->B:58:0x00ec ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static g c(b bVar, int i, int i2, int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        int i12 = i2 - i;
        int i13 = i4 - i3;
        int i14 = 1;
        if (i12 < 1 || i13 < 1) {
            return null;
        }
        int i15 = i12 - i13;
        int i16 = ((i12 + i13) + 1) / 2;
        int i17 = (i5 - i16) - 1;
        int i18 = i5 + i16 + 1;
        Arrays.fill(iArr, i17, i18, 0);
        Arrays.fill(iArr2, i17 + i15, i18 + i15, i12);
        boolean z3 = i15 % 2 != 0;
        int i19 = 0;
        while (i19 <= i16) {
            int i20 = -i19;
            int i21 = i20;
            while (i21 <= i19) {
                if (i21 != i20) {
                    if (i21 != i19) {
                        int i22 = i5 + i21;
                    }
                    i10 = iArr[(i5 + i21) - i14] + i14;
                    z2 = true;
                    for (i11 = i10 - i21; i10 < i12 && i11 < i13 && bVar.b(i + i10, i3 + i11); i11++) {
                        i10++;
                    }
                    int i23 = i5 + i21;
                    iArr[i23] = i10;
                    if (!z3 && i21 >= (i15 - i19) + 1 && i21 <= (i15 + i19) - 1 && iArr[i23] >= iArr2[i23]) {
                        g gVar = new g();
                        int i24 = iArr2[i23];
                        gVar.a = i24;
                        gVar.b = i24 - i21;
                        gVar.c = iArr[i23] - iArr2[i23];
                        gVar.d = z2;
                        gVar.e = false;
                        return gVar;
                    }
                    i21 += 2;
                    i14 = 1;
                }
                i10 = iArr[i5 + i21 + i14];
                z2 = false;
                while (i10 < i12) {
                    i10++;
                }
                int i232 = i5 + i21;
                iArr[i232] = i10;
                if (!z3) {
                }
                i21 += 2;
                i14 = 1;
            }
            int i25 = i20;
            while (i25 <= i19) {
                int i26 = i25 + i15;
                if (i26 != i19 + i15) {
                    if (i26 != i20 + i15) {
                        int i27 = i5 + i26;
                        i6 = 1;
                    } else {
                        i6 = 1;
                    }
                    i7 = iArr2[(i5 + i26) + i6] - i6;
                    z = true;
                    i8 = i7 - i26;
                    while (i7 > 0 && i8 > 0) {
                        i9 = i12;
                        if (bVar.b((i + i7) - 1, (i3 + i8) - 1)) {
                            break;
                        }
                        i7--;
                        i8--;
                        i12 = i9;
                    }
                    i9 = i12;
                    int i28 = i5 + i26;
                    iArr2[i28] = i7;
                    if (z3 && i26 >= i20 && i26 <= i19 && iArr[i28] >= iArr2[i28]) {
                        g gVar2 = new g();
                        int i29 = iArr2[i28];
                        gVar2.a = i29;
                        gVar2.b = i29 - i26;
                        gVar2.c = iArr[i28] - iArr2[i28];
                        gVar2.d = z;
                        gVar2.e = true;
                        return gVar2;
                    }
                    i25 += 2;
                    i12 = i9;
                } else {
                    i6 = 1;
                }
                i7 = iArr2[(i5 + i26) - i6];
                z = false;
                i8 = i7 - i26;
                while (i7 > 0) {
                    i9 = i12;
                    if (bVar.b((i + i7) - 1, (i3 + i8) - 1)) {
                    }
                }
                i9 = i12;
                int i282 = i5 + i26;
                iArr2[i282] = i7;
                if (z3) {
                }
                i25 += 2;
                i12 = i9;
            }
            i19++;
            i12 = i12;
            i14 = 1;
        }
        throw new IllegalStateException("DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation.");
    }
}
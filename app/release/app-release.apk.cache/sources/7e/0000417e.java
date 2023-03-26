package com.p7700g.p99005;

import com.p7700g.p99005.f34;
import com.p7700g.p99005.g24;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.s04;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.LongSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: AddressDivisionGrouping.java */
/* loaded from: classes3.dex */
public class f34 extends g24 {
    private static final long E = 4;

    /* JADX WARN: Incorrect field signature: TR; */
    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class a implements Iterator<R> {
        public v04 s;
        public final /* synthetic */ v04 t;

        public a(v04 v04Var) {
            this.t = v04Var;
            this.s = v04Var;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TR; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public v04 next() {
            v04 v04Var = this.s;
            if (v04Var != null) {
                this.s = null;
                return v04Var;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class b implements Iterator<R> {
        public final /* synthetic */ Iterator s;
        public final /* synthetic */ d34 t;
        public final /* synthetic */ Integer u;

        public b(Iterator it, d34 d34Var, Integer num) {
            this.s = it;
            this.t = d34Var;
            this.u = num;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TR; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public v04 next() {
            if (this.s.hasNext()) {
                return f34.V((x04[]) this.s.next(), this.t, this.u);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Incorrect field signature: [TS; */
    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class c implements Iterator<S[]> {
        public x04[] s;
        public final /* synthetic */ Supplier t;
        public final /* synthetic */ Predicate u;

        public c(Supplier supplier, Predicate predicate) {
            this.t = supplier;
            this.u = predicate;
            x04[] x04VarArr = (x04[]) supplier.get();
            this.s = x04VarArr;
            if (predicate == null || !predicate.test(x04VarArr)) {
                return;
            }
            this.s = null;
        }

        /* JADX WARN: Incorrect return type in method signature: ()[TS; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public x04[] next() {
            x04[] x04VarArr = this.s;
            if (x04VarArr != null) {
                this.s = null;
                return x04VarArr;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Incorrect field signature: [TS; */
    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class d implements Iterator<S[]> {
        public final /* synthetic */ int A;
        public final /* synthetic */ IntFunction B;
        private boolean s;
        private final Iterator<S>[] t;
        private x04[] u;
        public final /* synthetic */ int v;
        public final /* synthetic */ s04.a w;
        public final /* synthetic */ int x;
        public final /* synthetic */ IntFunction y;
        public final /* synthetic */ Predicate z;

        /* JADX WARN: Multi-variable type inference failed */
        public d(int i, s04.a aVar, int i2, IntFunction intFunction, Predicate predicate, int i3, IntFunction intFunction2) {
            this.v = i;
            this.w = aVar;
            this.x = i2;
            this.y = intFunction;
            this.z = predicate;
            this.A = i3;
            this.B = intFunction2;
            this.t = new Iterator[i];
            this.u = aVar.d(i);
            c(0);
            while (true) {
                i2++;
                if (i2 >= this.v) {
                    break;
                }
                this.t[i2] = (Iterator) this.y.apply(i2);
                this.u[i2] = (x04) this.t[i2].next();
            }
            Predicate predicate2 = this.z;
            if (predicate2 == null || !predicate2.test(this.u)) {
                return;
            }
            a();
        }

        /* JADX WARN: Incorrect return type in method signature: ()[TS; */
        private x04[] a() {
            int i = this.x;
            x04[] x04VarArr = null;
            while (i >= 0) {
                while (this.t[i].hasNext()) {
                    if (x04VarArr == null) {
                        x04VarArr = (x04[]) this.u.clone();
                    }
                    this.u[i] = (x04) this.t[i].next();
                    c(i + 1);
                    Predicate predicate = this.z;
                    if (predicate == null || !predicate.test(this.u)) {
                        return x04VarArr;
                    }
                    i = this.x;
                }
                i--;
            }
            this.s = true;
            return x04VarArr == null ? this.u : x04VarArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void c(int i) {
            while (i < this.A) {
                this.t[i] = (Iterator) this.B.apply(i);
                this.u[i] = (x04) this.t[i].next();
                i++;
            }
            if (i == this.x) {
                this.t[i] = (Iterator) this.y.apply(i);
                this.u[i] = (x04) this.t[i].next();
            }
        }

        /* JADX WARN: Incorrect return type in method signature: ()[TS; */
        @Override // java.util.Iterator
        /* renamed from: b */
        public x04[] next() {
            if (!this.s) {
                return a();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.s;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: Incorrect field signature: TT; */
    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class e implements Iterator<T> {
        public n04 s;
        public final /* synthetic */ n04 t;

        public e(n04 n04Var) {
            this.t = n04Var;
            this.s = n04Var;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public n04 next() {
            n04 n04Var = this.s;
            if (n04Var != null) {
                this.s = null;
                return n04Var;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public class f implements Iterator<T> {
        public final /* synthetic */ Iterator s;
        public final /* synthetic */ d34 t;
        public final /* synthetic */ Integer u;

        public f(Iterator it, d34 d34Var, Integer num) {
            this.s = it;
            this.t = d34Var;
            this.u = num;
        }

        /* JADX WARN: Incorrect return type in method signature: ()TT; */
        @Override // java.util.Iterator
        /* renamed from: a */
        public n04 next() {
            if (hasNext()) {
                return f34.U((x04[]) this.s.next(), this.t, this.u);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.s.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public interface g {
        int a(int i);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public interface h {
        long a(int i);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public interface i<S extends f24> {
        S a(long j, long j2, int i, int i2);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public interface j<S extends f24> {
        S a(long j, long j2, int i, int i2, l14<?, ?, ?, ?, ?> l14Var, Integer num);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class k<R extends z04> {
        public R a;
        public R b;
        public R c;
        public boolean d;
    }

    /* compiled from: AddressDivisionGrouping.java */
    @FunctionalInterface
    /* loaded from: classes3.dex */
    public interface l<S> {
        S a(S s, Integer num, Integer num2);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class m {
        public String a;
        public String b;
        public String c;
    }

    public f34(e34[] e34VarArr) {
        super(e34VarArr);
    }

    public static <R extends v04, S extends x04> S[] B4(R r, S[] sArr, int i2, l<S> lVar) {
        Integer L0 = r.L0();
        if (L0 != null) {
            sArr = (S[]) ((x04[]) sArr.clone());
            for (int i3 = 0; i3 < sArr.length; i3++) {
                sArr[i3] = lVar.a(sArr[i3], p3(i2, L0.intValue(), i3), null);
            }
        }
        return sArr;
    }

    public static <R extends z04> R C3(R r) {
        if (r.z3()) {
            return null;
        }
        if (r.C0() && r.m0().i().f()) {
            return null;
        }
        return r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
        if (r15 == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        if (r8 <= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        java.util.Arrays.fill(r3, r8, r2, r13.e(0, b(0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006b, code lost:
        return r13.u(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <R extends v04, S extends x04> R D4(R r, int i2, int i3, R r2, int i4, int i5, d34<?, R, ?, S> d34Var, boolean z, boolean z2) {
        int i6 = i5 - i4;
        int V0 = r.V0();
        int i7 = (V0 + i6) - (i3 - i2);
        S[] d2 = d34Var.d(i7);
        r.m3(0, i2, d2, 0);
        if (i2 < i7) {
            if (r.C0() && r.m0().i().f()) {
                if (z) {
                }
            }
            r2.m3(i4, i5, d2, i2);
            int i8 = i2 + i6;
            if (i8 < i7) {
                if (r2.C0() && r.m0().i().f() && n3(r2.L0().intValue(), r2.Z1(), r2.u2()) < i5 && (z2 || i6 > 0)) {
                    Arrays.fill(d2, i8, i7, d34Var.e(0, b(0)));
                } else {
                    r.m3(i3, V0, d2, i8);
                }
            }
        }
        return d34Var.u(d2);
    }

    public static <R extends v04, S extends x04> R E3(R r, long j2, d34<?, R, ?, S> d34Var, long j3, long j4, long j5, Supplier<R> supplier, Supplier<R> supplier2, Integer num) {
        if (r.z3()) {
            if (j2 <= 0) {
                return (R) P(supplier.get(), j4, j2, d34Var, num);
            }
            if (j3 > j2) {
                if (j3 == 1 + j2) {
                    return supplier2.get();
                }
                return (R) I3(r, j2, d34Var, supplier, num);
            } else if (j2 <= Long.MAX_VALUE - j5) {
                return (R) P(supplier2.get(), j5, j2 - (j3 - 1), d34Var, num);
            } else {
                return (R) Q(supplier2.get(), BigInteger.valueOf(j2 - (j3 - 1)), d34Var, num);
            }
        }
        return (R) P(r, j4, j2, d34Var, num);
    }

    public static <R extends v04, S extends x04> R E4(boolean z, R r, d34<?, R, ?, S> d34Var, IntFunction<S> intFunction, boolean z2) {
        if (z) {
            boolean z3 = (z2 && r.C0()) ? false : true;
            int V0 = r.V0();
            S[] d2 = d34Var.d(V0);
            for (int i2 = 0; i2 < V0; i2++) {
                d2[i2] = intFunction.apply(i2);
                if (z3 && !d2[i2].equals(r.D0(i2))) {
                    z3 = false;
                }
            }
            return z3 ? r : d34Var.u(d2);
        }
        return (R) G4(r, d34Var, intFunction, z2);
    }

    public static <R extends v04, S extends x04> R F4(boolean z, R r, d34<?, R, ?, S> d34Var, IntFunction<S> intFunction, boolean z2) {
        if (z) {
            boolean z3 = (z2 && r.C0()) ? false : true;
            int V0 = r.V0();
            S[] d2 = d34Var.d(V0);
            for (int i2 = 0; i2 < V0; i2++) {
                d2[i2] = intFunction.apply(i2);
                if (z3 && !d2[i2].equals(r.D0(i2))) {
                    z3 = false;
                }
            }
            return z3 ? r : d34Var.u(d2);
        }
        return (R) G4(r, d34Var, intFunction, z2);
    }

    public static <R extends v04, S extends x04> R G3(R r, long j2, BigInteger bigInteger, d34<?, R, ?, S> d34Var, Supplier<R> supplier, Supplier<R> supplier2, Integer num) {
        if (r.z3()) {
            if (j2 <= 0) {
                return (R) Q(supplier.get(), bigInteger, d34Var, num);
            }
            BigInteger count = r.getCount();
            BigInteger add = bigInteger.add(BigInteger.ONE);
            int compareTo = count.compareTo(add);
            if (compareTo <= 0) {
                if (compareTo == 0) {
                    return supplier2.get();
                }
                return (R) Q(supplier2.get(), add.subtract(count), d34Var, num);
            }
            return (R) I3(r, j2, d34Var, supplier, num);
        }
        return (R) Q(r, bigInteger, d34Var, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        if (r1[r6].equals(r9.D0(r6)) == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <R extends v04, S extends x04> R G4(R r, d34<?, R, ?, S> d34Var, IntFunction<S> intFunction, boolean z) {
        int V0 = r.V0();
        S[] d2 = d34Var.d(V0);
        int i2 = V0 >>> 1;
        boolean z2 = false;
        boolean z3 = (z && r.C0()) ? false : true;
        int i3 = V0 - 1;
        int i4 = 0;
        while (i4 < i2) {
            d2[i3] = intFunction.apply(i4);
            d2[i4] = intFunction.apply(i3);
            if (z3 && (!d2[i4].equals(r.D0(i4)) || !d2[i3].equals(r.D0(i3)))) {
                z3 = false;
            }
            i4++;
            i3--;
        }
        if ((V0 & 1) == 1) {
            d2[i4] = intFunction.apply(i4);
            if (z3) {
            }
        }
        z2 = z3;
        return z2 ? r : d34Var.u(d2);
    }

    public static <S extends x04> Iterator<S[]> H4(int i2, s04.a<S> aVar, Supplier<S[]> supplier, IntFunction<Iterator<S>> intFunction, Predicate<S[]> predicate) {
        return I4(i2, aVar, supplier, intFunction, predicate, i2 - 1, i2, null);
    }

    public static <R extends v04, S extends x04> R I3(R r, long j2, d34<?, R, ?, S> d34Var, Supplier<R> supplier, Integer num) {
        if (j2 == 0) {
            return supplier.get();
        }
        int V0 = r.V0();
        S[] d2 = d34Var.d(V0);
        int i2 = V0 - 1;
        while (true) {
            if (i2 < 0) {
                break;
            }
            x04 D0 = r.D0(i2);
            long c4 = D0.c4();
            long j3 = j2 / c4;
            d2[i2] = d34Var.b(D0.B1() + ((int) (j2 % c4)));
            if (j3 == 0) {
                while (true) {
                    i2--;
                    if (i2 < 0) {
                        break;
                    }
                    d2[i2] = d34Var.b(r.D0(i2).B1());
                }
            } else {
                i2--;
                j2 = j3;
            }
        }
        return (R) V(d2, d34Var, num);
    }

    public static <S extends x04> Iterator<S[]> I4(int i2, s04.a<S> aVar, Supplier<S[]> supplier, IntFunction<Iterator<S>> intFunction, Predicate<S[]> predicate, int i3, int i4, IntFunction<Iterator<S>> intFunction2) {
        if (supplier != null) {
            return new c(supplier, predicate);
        }
        return new d(i2, aVar, i3, intFunction2, predicate, i4, intFunction);
    }

    public static <S extends x04> S[] J4(s04<?> s04Var, int i2, S[] sArr, int i3, int i4, s04.a<S> aVar, BiFunction<S, Integer, S> biFunction) {
        boolean f2 = s04Var.i().f();
        int n3 = i2 == 0 ? 0 : n3(i2, i4, i3);
        while (n3 < sArr.length) {
            Integer p3 = p3(i3, i2, n3);
            if (p3 != null) {
                sArr[n3] = biFunction.apply(sArr[n3], p3);
                if (f2 && (n3 = n3 + 1) < sArr.length) {
                    Arrays.fill(sArr, n3, sArr.length, aVar.e(0, b(0)));
                }
            }
            n3++;
        }
        return sArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <I extends z04, S extends x04> boolean K4(g24.e<I, ?> eVar, Function<S[], I> function, s04.a<S> aVar, S[] sArr, int i2, int i3, Integer num) {
        boolean z;
        S s;
        int i4;
        S s2;
        boolean z2;
        int i5 = 0;
        while (true) {
            z = true;
            s = null;
            if (i5 >= i3) {
                i4 = i2;
                s2 = null;
                z2 = false;
                break;
            }
            S s3 = sArr[i5];
            if (s3.z3()) {
                int B1 = s3.B1();
                int h3 = s3.h3();
                int i6 = ((h3 - B1) >>> 1) + B1;
                Integer x3 = x3(s3.A0(), num, i5);
                S c2 = aVar.c(B1, i6, x3);
                S c3 = aVar.c(i6 + 1, h3, x3);
                i4 = i2;
                z2 = true;
                s2 = c3;
                s = c2;
                break;
            }
            i5++;
        }
        if (i5 == i4 && !z2) {
            S s4 = sArr[i5];
            int A0 = s4.A0();
            Integer x32 = x3(A0, num, i5);
            int intValue = A0 - x32.intValue();
            int B12 = s4.B1();
            int h32 = s4.h3();
            int i7 = B12 >>> intValue;
            int i8 = h32 >>> intValue;
            if (i7 != i8) {
                int i9 = i7 + ((i8 - i7) >>> 1);
                s = aVar.c(B12, (i9 << intValue) | (~((-1) << intValue)), x32);
                s2 = aVar.c((i9 + 1) << intValue, h32, x32);
                if (z) {
                    int length = sArr.length;
                    S[] d2 = aVar.d(length);
                    S[] d3 = aVar.d(length);
                    System.arraycopy(sArr, 0, d2, 0, i5);
                    System.arraycopy(sArr, 0, d3, 0, i5);
                    int i10 = i5 + 1;
                    d2[i5] = s;
                    d3[i5] = s2;
                    int i11 = length - i10;
                    System.arraycopy(sArr, i10, d2, i10, i11);
                    System.arraycopy(sArr, i10, d3, i10, i11);
                    eVar.b(function.apply(d2), function.apply(d3));
                }
                return z;
            }
        }
        z = z2;
        if (z) {
        }
        return z;
    }

    public static <T extends l34, E extends l34> String L4(g24.b<T> bVar, T t, T t2, CharSequence charSequence) {
        StringBuilder sb;
        int Q = bVar.Q(t2, charSequence) + bVar.Q(t, null);
        String str = bVar.o().a;
        if (str != null) {
            Q += str.length();
            sb = new StringBuilder(Q);
            StringBuilder A = bVar.A(sb, t, null);
            A.append(str);
            bVar.A(A, t2, charSequence);
        } else {
            sb = new StringBuilder(Q);
            bVar.A(bVar.A(sb, t, null), t2, charSequence);
        }
        g24.b.H(Q, sb);
        return sb.toString();
    }

    public static <S extends x04> S[] M4(S[] sArr, byte[] bArr, int i2, int i3, int i4, int i5, s04<S> s04Var, Integer num) {
        boolean z;
        int i6 = i2;
        if (i3 < 0 || i3 > bArr.length) {
            throw new c14(i3);
        }
        if (i6 >= 0 && i6 <= i3) {
            d34<?, ?, ?, S> g2 = s04Var.g();
            int length = sArr.length;
            int i7 = length * i4;
            int i8 = (i7 + i6) - i3;
            int i9 = 0;
            if (i8 < 0) {
                int i10 = i3 - i7;
                int i11 = i10 - 1;
                byte b2 = bArr[i11];
                if (b2 != 0) {
                    if ((bArr[i10] >>> 7) == 0) {
                        throw new c14(b2);
                    }
                    if (b2 != -1) {
                        throw new c14(b2);
                    }
                }
                while (i6 < i11) {
                    i11--;
                    if (bArr[i11] != b2) {
                        throw new c14(b2);
                    }
                }
                i6 = i10;
                i8 = 0;
            }
            boolean f2 = s04Var.i().f();
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= i7) {
                    break;
                }
                Integer x3 = x3(i5, num, i13);
                if (f2 && x3 != null && x3.intValue() == 0) {
                    S e2 = g2.e(i9, b(i9));
                    if (N3(s04Var, e2.m0())) {
                        Arrays.fill(sArr, i13, length, e2);
                    } else {
                        throw new x14(e2);
                    }
                } else {
                    int i14 = i4 + i12;
                    if (i12 >= i8) {
                        z = f2;
                        i9 = 0;
                    } else if ((bArr[i6] >>> 7) == 0) {
                        z = f2;
                        i12 = i8;
                    } else {
                        int i15 = 0;
                        while (i12 < Math.min(i8, i14)) {
                            i12++;
                            i15 = (i15 << 8) | 255;
                            f2 = f2;
                        }
                        z = f2;
                        i9 = i15;
                    }
                    while (i12 < i14) {
                        i9 = (i9 << 8) | (bArr[(i6 + i12) - i8] & 255);
                        i12++;
                    }
                    S e3 = g2.e(i9, x3);
                    if (N3(s04Var, e3.m0())) {
                        sArr[i13] = e3;
                        i13++;
                        f2 = z;
                        i12 = i14;
                        i9 = 0;
                    } else {
                        throw new x14(e3);
                    }
                }
            }
            return sArr;
        }
        throw new c14(i6);
    }

    public static boolean N3(s04<?> s04Var, s04<?> s04Var2) {
        return s04Var.i().equals(s04Var2.i());
    }

    public static <R extends v04, S extends x04> R P(R r, long j2, long j3, d34<?, R, ?, S> d34Var, Integer num) {
        if (!r.z3()) {
            S[] d2 = d34Var.d(r.V0());
            x0(d2, 0L, j2 + j3, r.u2(), d34Var.m0(), num);
            return (R) V(d2, d34Var, num);
        }
        throw new IllegalArgumentException();
    }

    public static <R extends v04, S extends x04> R Q(R r, BigInteger bigInteger, d34<?, R, ?, S> d34Var, Integer num) {
        if (!r.z3()) {
            return d34Var.M(r.getValue().add(bigInteger).toByteArray(), r.V0(), num, true);
        }
        throw new IllegalArgumentException();
    }

    public static <R extends v04, S extends x04> R R(R r, R r2, d34<?, R, ?, S> d34Var) {
        int V0 = r2.V0();
        int V02 = r.V0();
        int i2 = V02 + V0;
        S[] d2 = d34Var.d(i2);
        r.m3(0, V02, d2, 0);
        if (r.C0() && r.m0().i().f()) {
            Arrays.fill(d2, V02, i2, d34Var.e(0, b(0)));
        } else {
            r2.m3(0, V0, d2, V02);
        }
        return d34Var.u(d2);
    }

    public static void S(long j2, long j3, long j4, long j5, LongSupplier longSupplier) {
        if (j2 < 0) {
            if (j3 < (-j2)) {
                throw new c14(j2);
            }
            return;
        }
        if (j5 > 1) {
            j2 -= j5 - 1;
        }
        if (j2 > longSupplier.getAsLong() - j4) {
            throw new c14(j2);
        }
    }

    public static void T(long j2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, Supplier<BigInteger> supplier) {
        BigInteger bigInteger5 = BigInteger.ONE;
        boolean z = bigInteger4.compareTo(bigInteger5) > 0;
        if (j2 < 0) {
            if (bigInteger2.compareTo(bigInteger.negate()) < 0) {
                throw new c14(j2);
            }
            return;
        }
        if (z) {
            bigInteger = bigInteger.subtract(bigInteger4.subtract(bigInteger5));
        }
        if (bigInteger.compareTo(supplier.get().subtract(bigInteger3)) > 0) {
            throw new c14(j2);
        }
    }

    public static <T extends n04, S extends x04> T U(S[] sArr, d34<T, ?, ?, S> d34Var, Integer num) {
        return d34Var.L(sArr, num, true);
    }

    public static <T extends n04, S extends x04> Iterator<T> U3(boolean z, T t, d34<T, ?, ?, S> d34Var, Iterator<S[]> it, Integer num) {
        if (z) {
            return new e(t);
        }
        return new f(it, d34Var, num);
    }

    public static <R extends v04, S extends x04> R V(S[] sArr, d34<?, R, ?, S> d34Var, Integer num) {
        return d34Var.t(sArr, num, true);
    }

    public static <R extends v04, S extends x04> Iterator<R> W3(boolean z, R r, d34<?, R, ?, S> d34Var, Iterator<S[]> it, Integer num) {
        if (z) {
            return new a(r);
        }
        return new b(it, d34Var, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[LOOP:0: B:3:0x0007->B:27:0x0065, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <S extends x04> S[] X0(S[] sArr, n04.b bVar, n04.b bVar2, int i2, int i3, s04<S> s04Var, Integer num) {
        int a2;
        int a3;
        S e2;
        d34<?, ?, ?, S> g2 = s04Var.g();
        int length = sArr.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Integer x3 = x3(i3, num, i4);
            if (x3 != null && x3.intValue() == 0 && s04Var.i().f()) {
                S e3 = g2.e(0, b(0));
                if (N3(s04Var, e3.m0())) {
                    Arrays.fill(sArr, i4, length, e3);
                } else {
                    throw new x14(e3);
                }
            } else {
                if (bVar == null) {
                    a2 = bVar2.a(i4);
                } else {
                    a2 = bVar.a(i4);
                    if (bVar2 != null) {
                        a3 = bVar2.a(i4);
                        if (bVar == null && bVar2 != null) {
                            e2 = g2.c(a2, a3, x3);
                        } else {
                            e2 = g2.e(a2, x3);
                        }
                        if (!N3(s04Var, e2.m0())) {
                            sArr[i4] = e2;
                            i4++;
                        } else {
                            throw new x14(e2);
                        }
                    }
                }
                a3 = 0;
                if (bVar == null) {
                }
                e2 = g2.e(a2, x3);
                if (!N3(s04Var, e2.m0())) {
                }
            }
        }
    }

    public static Integer b(int i2) {
        return t64.a(i2);
    }

    public static <R extends v04, S extends x04> S[] c1(R r, s04.a<S> aVar, IntFunction<S> intFunction) {
        int V0 = r.V0();
        S[] d2 = aVar.d(V0);
        for (int i2 = 0; i2 < V0; i2++) {
            d2[i2] = intFunction.apply(i2);
        }
        return d2;
    }

    public static <R extends v04, S extends x04> R d1(R r, long j2, d34<?, R, ?, S> d34Var, Supplier<R> supplier, Supplier<R> supplier2, Integer num) {
        if (j2 >= 0) {
            BigInteger count = r.getCount();
            if (count.compareTo(g24.v) <= 0) {
                long longValue = count.longValue();
                if (longValue > j2) {
                    if (longValue == 1 + j2) {
                        return supplier2.get();
                    }
                    return (R) I3(r, j2, d34Var, supplier, num);
                }
                BigInteger value = r.getValue();
                if (value.compareTo(g24.v) <= 0) {
                    BigInteger C1 = r.C1();
                    if (C1.compareTo(g24.v) <= 0) {
                        return (R) E3(r, j2, d34Var, count.longValue(), value.longValue(), C1.longValue(), supplier, supplier2, num);
                    }
                    return null;
                }
                return null;
            }
            return null;
        }
        BigInteger value2 = r.getValue();
        if (value2.compareTo(g24.v) <= 0) {
            return (R) P(supplier.get(), value2.longValue(), j2, d34Var, num);
        }
        return null;
    }

    public static int i3(int i2, int i3, int i4) {
        return t64.c(i2, i3, i4);
    }

    public static long j3(IntUnaryOperator intUnaryOperator, int i2) {
        if (i2 == 0) {
            return 1L;
        }
        long applyAsInt = intUnaryOperator.applyAsInt(0);
        for (int i3 = 1; i3 < i2; i3++) {
            applyAsInt *= intUnaryOperator.applyAsInt(i3);
        }
        return applyAsInt;
    }

    public static int k3(int i2, int i3, int i4) {
        return t64.d(i2, i3, i4).intValue();
    }

    public static int n3(int i2, int i3, int i4) {
        return t64.e(i2, i3, i4);
    }

    public static /* synthetic */ int n4(boolean z, int i2, int i3, int i4, v04 v04Var, int i5) {
        if (z && i5 == i2) {
            return e34.J4(v04Var.D0(i5), p3(i3, i4, i5).intValue());
        }
        return v04Var.D0(i5).c4();
    }

    public static Integer p3(int i2, int i3, int i4) {
        return t64.f(i2, i3, i4);
    }

    public static <R extends v04, S extends x04> long p4(R r) {
        return q4(r, r.V0());
    }

    public static <R extends v04, S extends x04> long q4(final R r, int i2) {
        return j3(new IntUnaryOperator() { // from class: com.p7700g.p99005.b34
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                int c4;
                c4 = v04.this.D0(i3).c4();
                return c4;
            }
        }, i2);
    }

    public static <R extends v04, S extends x04> R t3(int i2, int i3, R r, d34<?, R, ?, S> d34Var) {
        if (i2 == 0 && i3 == r.V0()) {
            return r;
        }
        int i4 = i3 - i2;
        if (i4 >= 0) {
            S[] d2 = d34Var.d(i4);
            r.m3(i2, i3, d2, 0);
            return d34Var.u(d2);
        }
        throw new IndexOutOfBoundsException();
    }

    public static <R extends v04, S extends x04> R w0(d34<?, R, ?, S> d34Var, S[] sArr, int i2, boolean z) {
        return d34Var.N(sArr, i2, z);
    }

    public static Integer w3(int i2, int i3) {
        return t64.b(i2, i3);
    }

    public static <R extends v04, S extends x04> long w4(final R r, final int i2) {
        final int u2 = r.u2();
        int Z1 = r.Z1();
        final int n3 = n3(i2, Z1, u2);
        final boolean z = n3 == i3(i2, Z1, u2);
        return j3(new IntUnaryOperator() { // from class: com.p7700g.p99005.z24
            @Override // java.util.function.IntUnaryOperator
            public final int applyAsInt(int i3) {
                return f34.n4(z, n3, u2, i2, r, i3);
            }
        }, n3 + 1);
    }

    public static <S extends x04> S[] x0(S[] sArr, long j2, long j3, int i2, s04<S> s04Var, Integer num) {
        d34<?, ?, ?, S> g2 = s04Var.g();
        int i3 = ~((-1) << i2);
        int max = Math.max(0, sArr.length - (64 / i2));
        int length = sArr.length - 1;
        while (true) {
            S e2 = g2.e(((int) j3) & i3, x3(i2, num, length));
            if (N3(s04Var, e2.m0())) {
                sArr[length] = e2;
                length--;
                if (length >= max) {
                    j3 >>>= i2;
                } else if (max == 0) {
                    return sArr;
                } else {
                    j3 = j2;
                    max = 0;
                }
            } else {
                throw new x14(e2);
            }
        }
    }

    public static Integer x3(int i2, Integer num, int i3) {
        return t64.g(i2, num, i3);
    }

    public static <S extends n14> void x4(int i2, S[] sArr, int i3, int i4, Function<S, S> function) {
        int n3 = n3(i2, i4, i3);
        if (n3 >= 0) {
            S s = sArr[n3];
            if (s.C0()) {
                return;
            }
            sArr[n3] = function.apply(s);
        }
    }

    public static boolean y4(v04 v04Var, v04 v04Var2, int i2) {
        int i3;
        if (i2 < 0) {
            return false;
        }
        Integer L0 = v04Var.L0();
        if (L0 == null) {
            i3 = v04Var.V0();
            if (i3 + i2 > v04Var2.V0()) {
                return false;
            }
        } else {
            int n3 = n3(L0.intValue(), v04Var.Z1(), v04Var.u2());
            if (n3 >= 0) {
                int i4 = n3 + i2;
                if (i4 >= v04Var2.V0()) {
                    return false;
                }
                x04 D0 = v04Var.D0(n3);
                if (!D0.f2(v04Var2.D0(i4), p3(D0.A0(), L0.intValue(), n3).intValue())) {
                    return false;
                }
            }
            i3 = n3;
        }
        do {
            i3--;
            if (i3 < 0) {
                return true;
            }
        } while (v04Var.D0(i3).equals(v04Var2.D0(i3 + i2)));
        return false;
    }

    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    public boolean B3(int i2) {
        g24.d(this, i2);
        int p1 = p1();
        int i3 = 0;
        int i4 = 0;
        while (i3 < p1) {
            e34 t = t(i3);
            int A0 = t.A0() + i4;
            if (i2 < A0) {
                if (t.Q4(t.G4(), t.L4(), Math.max(0, i2 - i4))) {
                    for (int i5 = i3 + 1; i5 < p1; i5++) {
                        if (!t(i5).H0()) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            i3++;
            i4 = A0;
        }
        return true;
    }

    public int D1(int i2, boolean z, boolean z2) {
        Integer L0 = L0();
        if (L0 == null) {
            if (b3() == 0) {
                L0 = b(0);
            } else {
                L0 = b(A0());
            }
        }
        int intValue = L0.intValue() + i2;
        if (z2) {
            intValue = Math.min(A0(), intValue);
        }
        return z ? Math.max(0, intValue) : intValue;
    }

    @Override // com.p7700g.p99005.g24
    public boolean G(g24 g24Var) {
        return (g24Var instanceof f34) && super.G(g24Var);
    }

    public boolean S3() throws t14 {
        int p1 = p1();
        for (int i2 = 0; i2 < p1; i2++) {
            if (t(i2).z3()) {
                int i3 = p1 - 1;
                e34 e34Var = null;
                boolean z = true;
                while (i3 >= 0) {
                    e34 t = t(i3);
                    if (!t.z3()) {
                        z = false;
                    } else if (z) {
                        z = t.H0();
                    } else {
                        throw new t14(t, i2, e34Var, i2 + 1, "ipaddress.error.segmentMismatch");
                    }
                    i3--;
                    e34Var = t;
                }
                return true;
            }
        }
        return false;
    }

    public <S extends f24> S[] X(int i2, final i<S> iVar, IntFunction<S[]> intFunction) {
        return (S[]) Z(i2, null, null, new j() { // from class: com.p7700g.p99005.a34
            @Override // com.p7700g.p99005.f34.j
            public final f24 a(long j2, long j3, int i3, int i4, l14 l14Var, Integer num) {
                f24 a2;
                a2 = f34.i.this.a(j2, j3, i3, i4);
                return a2;
            }
        }, intFunction);
    }

    public int X2(boolean z, int i2, boolean z2) {
        int intValue;
        int i3;
        Integer L0 = L0();
        int A0 = A0();
        if (!z) {
            if (L0 == null) {
                if (b3() == 0) {
                    return 0;
                }
                if (!z2) {
                    return A0;
                }
                L0 = Integer.valueOf(A0);
            } else if (L0.intValue() == 0) {
                return 0;
            }
            intValue = L0.intValue();
            i3 = ((intValue - 1) % i2) + 1;
        } else if (L0 == null) {
            if (b3() == 0) {
                return 0;
            }
            return A0;
        } else if (L0.intValue() == A0) {
            return A0;
        } else {
            int intValue2 = L0.intValue();
            i3 = intValue2 % i2;
            intValue = intValue2 + i2;
        }
        return intValue - i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        return true;
     */
    @Override // com.p7700g.p99005.g24, com.p7700g.p99005.l24
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Y2(int i2) {
        g24.d(this, i2);
        int p1 = p1();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= p1) {
                break;
            }
            e34 t = t(i3);
            int A0 = t.A0() + i4;
            if (i2 >= A0) {
                if (t.z3()) {
                    return false;
                }
                i3++;
                i4 = A0;
            } else {
                if (!t.S4(t.G4(), t.L4(), Math.max(0, i2 - i4))) {
                    return false;
                }
                for (int i5 = i3 + 1; i5 < p1; i5++) {
                    if (!t(i5).H0()) {
                        return false;
                    }
                }
            }
        }
    }

    public <S extends f24> S[] Z(int i2, l14<?, ?, ?, ?, ?> l14Var, Integer num, j<S> jVar, IntFunction<S[]> intFunction) {
        if (i2 < 32) {
            int A0 = A0();
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 63 - (63 % i2);
            while (A0 > i3) {
                ArrayList arrayList2 = arrayList;
                A0 -= i3;
                arrayList2.add(b(i3));
                arrayList = arrayList2;
            }
            int i4 = A0 % i2;
            int i5 = A0 - i4;
            if (i5 > 0) {
                arrayList.add(b(i5));
            }
            if (i4 > 0) {
                arrayList.add(b(i4));
            }
            int size = arrayList.size();
            S[] apply = intFunction.apply(size);
            int i6 = 0;
            e34 t = t(0);
            long G4 = t.G4();
            long L4 = t.L4();
            int A02 = t.A0();
            int intValue = e34.U(BigInteger.valueOf(2L), i2).intValue();
            int i7 = size - 1;
            long j2 = L4;
            long j3 = G4;
            int i8 = A02;
            int i9 = 0;
            while (i7 >= 0) {
                int intValue2 = ((Integer) arrayList.get(i7)).intValue();
                long j4 = 0;
                long j5 = 0;
                int i10 = i7;
                int i11 = intValue2;
                while (i8 < i11) {
                    ArrayList arrayList3 = arrayList;
                    i11 -= i8;
                    j4 |= j3 << i11;
                    j5 |= j2 << i11;
                    i6++;
                    e34 t2 = t(i6);
                    j3 = t2.G4();
                    j2 = t2.L4();
                    i8 = t2.A0();
                    apply = apply;
                    arrayList = arrayList3;
                }
                i8 -= i11;
                long j6 = j4 | (j3 >>> i8);
                ArrayList arrayList4 = arrayList;
                S[] sArr = apply;
                long j7 = ~((-1) << i8);
                j3 &= j7;
                long j8 = j7 & j2;
                sArr[(size - i10) - 1] = jVar.a(j6, j5 | (j2 >>> i8), intValue2, intValue, l14Var, num == null ? null : w3(intValue2, num.intValue() - i9));
                if (i8 != 0 || i10 <= 0) {
                    j2 = j8;
                } else {
                    i6++;
                    e34 t3 = t(i6);
                    long G42 = t3.G4();
                    j2 = t3.L4();
                    j3 = G42;
                    i8 = t3.A0();
                }
                i9 += intValue2;
                i7 = i10 - 1;
                apply = sArr;
                arrayList = arrayList4;
            }
            return apply;
        }
        throw new c14(i2);
    }

    @Override // com.p7700g.p99005.g24
    /* renamed from: d3 */
    public e34 t(int i2) {
        return (e34) super.e0(i2);
    }

    @Override // com.p7700g.p99005.g24
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f34) {
            return ((f34) obj).G(this);
        }
        return false;
    }

    @Override // com.p7700g.p99005.g24
    public int hashCode() {
        int i2 = this.D;
        if (i2 == 0) {
            int p1 = p1();
            int i3 = 1;
            for (int i4 = 0; i4 < p1; i4++) {
                e34 t = t(i4);
                i3 = g24.a(i3, t.G4(), t.L4());
            }
            this.D = i3;
            return i3;
        }
        return i2;
    }

    @Override // com.p7700g.p99005.g24
    public byte[] m(boolean z) {
        int A0 = (A0() + 7) >> 3;
        byte[] bArr = new byte[A0];
        int i2 = A0 - 1;
        int i3 = 8;
        for (int p1 = p1() - 1; p1 >= 0; p1--) {
            e34 t = t(p1);
            long G4 = z ? t.G4() : t.L4();
            int A02 = t.A0();
            while (true) {
                if (A02 > 0) {
                    bArr[i2] = (byte) (bArr[i2] | (G4 << (8 - i3)));
                    G4 >>>= i3;
                    if (A02 < i3) {
                        i3 -= A02;
                        break;
                    }
                    A02 -= i3;
                    i2--;
                    i3 = 8;
                }
            }
        }
        return bArr;
    }

    public f34(e34[] e34VarArr, boolean z) {
        super(e34VarArr, z);
    }

    /* compiled from: AddressDivisionGrouping.java */
    /* loaded from: classes3.dex */
    public static class n extends g24.f {
        public final b b;
        public final boolean c;
        public final int d;
        public final String e;
        public final Character f;
        public final String g;
        public final boolean h;
        public final boolean i;
        public final boolean j;

        /* compiled from: AddressDivisionGrouping.java */
        /* loaded from: classes3.dex */
        public static class b {
            public final String a;
            public final String b;
            public final String c;

            public b() {
                this(n04.w, n04.A, null);
            }

            public String toString() {
                StringBuilder G = wo1.G("range separator: ");
                G.append(this.a);
                G.append("\nwildcard: ");
                G.append(this.b);
                G.append("\nsingle wildcard: ");
                G.append(this.c);
                return G.toString();
            }

            public b(String str, String str2) {
                this(n04.w, str, str2);
            }

            public b(String str) {
                this(str, null, null);
            }

            public b(String str, String str2, String str3) {
                this.a = str == null ? n04.w : str;
                this.b = str2;
                this.c = str3;
            }
        }

        public n(int i, boolean z, b bVar, String str, Character ch, String str2, boolean z2, boolean z3, boolean z4) {
            this.c = z;
            this.b = bVar;
            this.d = i;
            Objects.requireNonNull(str, "segment str");
            this.e = str;
            this.f = ch;
            Objects.requireNonNull(str2, rs2.f.d);
            this.g = str2;
            this.h = z2;
            this.i = z3;
            this.j = z4;
        }

        /* compiled from: AddressDivisionGrouping.java */
        /* loaded from: classes3.dex */
        public static class a {
            public static final b a = new b();
            public b b;
            public boolean c;
            public int d;
            public String e;
            public Character f;
            public String g;
            public boolean h;
            public boolean i;
            public boolean j;

            public a(int i) {
                this.b = a;
                this.e = "";
                this.g = "";
                this.d = i;
                this.f = Character.valueOf(gl4.R);
            }

            public a a(String str) {
                this.g = str;
                return this;
            }

            public a b(boolean z) {
                this.c = z;
                return this;
            }

            public a c(int i) {
                this.d = i;
                return this;
            }

            public a d(boolean z) {
                this.h = z;
                return this;
            }

            public a e(String str) {
                this.e = str;
                return this;
            }

            public a f(Character ch) {
                this.f = ch;
                return this;
            }

            public a g(boolean z) {
                this.i = z;
                return this;
            }

            public a h(boolean z) {
                this.j = z;
                return this;
            }

            public a i(b bVar) {
                this.b = bVar;
                return this;
            }

            public n j() {
                return new n(this.d, this.c, this.b, this.e, this.f, this.g, this.h, this.i, this.j);
            }

            public a(int i, char c) {
                this.b = a;
                this.e = "";
                this.g = "";
                this.d = i;
                this.f = Character.valueOf(c);
            }
        }
    }
}
package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.e30;
import com.p7700g.p99005.f30;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.l30;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.o30;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.b0.b {
    private static final float A = 0.33333334f;
    private static final String s = "StaggeredGridLManager";
    public static final boolean t = false;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = 0;
    @Deprecated
    public static final int x = 1;
    public static final int y = 2;
    public static final int z = Integer.MIN_VALUE;
    public f[] C;
    @x1
    public l30 D;
    @x1
    public l30 E;
    private int F;
    private int G;
    @x1
    private final e30 H;
    private BitSet K;
    private boolean P;
    private boolean Q;
    private e R;
    private int S;
    private int[] X;
    private int B = -1;
    public boolean I = false;
    public boolean J = false;
    public int L = -1;
    public int M = Integer.MIN_VALUE;
    public d N = new d();
    private int O = 2;
    private final Rect T = new Rect();
    private final b U = new b();
    private boolean V = false;
    private boolean W = true;
    private final Runnable Y = new a();

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    /* loaded from: classes.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            c();
        }

        public void a() {
            this.b = this.c ? StaggeredGridLayoutManager.this.D.i() : StaggeredGridLayoutManager.this.D.n();
        }

        public void b(int i) {
            if (this.c) {
                this.b = StaggeredGridLayoutManager.this.D.i() - i;
            } else {
                this.b = StaggeredGridLayoutManager.this.D.n() + i;
            }
        }

        public void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.C.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].u(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {
        public static final int e = -1;
        public f f;
        public boolean g;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int h() {
            f fVar = this.f;
            if (fVar == null) {
                return -1;
            }
            return fVar.f;
        }

        public boolean i() {
            return this.g;
        }

        public void j(boolean z) {
            this.g = z;
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }
    }

    @i2({i2.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean A;
        public boolean B;
        public int s;
        public int t;
        public int u;
        public int[] v;
        public int w;
        public int[] x;
        public List<d.a> y;
        public boolean z;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public void c() {
            this.v = null;
            this.u = 0;
            this.s = -1;
            this.t = -1;
        }

        public void d() {
            this.v = null;
            this.u = 0;
            this.w = 0;
            this.x = null;
            this.y = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u);
            if (this.u > 0) {
                parcel.writeIntArray(this.v);
            }
            parcel.writeInt(this.w);
            if (this.w > 0) {
                parcel.writeIntArray(this.x);
            }
            parcel.writeInt(this.z ? 1 : 0);
            parcel.writeInt(this.A ? 1 : 0);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeList(this.y);
        }

        public e(Parcel parcel) {
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            int readInt = parcel.readInt();
            this.u = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.v = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.w = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.x = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.z = parcel.readInt() == 1;
            this.A = parcel.readInt() == 1;
            this.B = parcel.readInt() == 1;
            this.y = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.u = eVar.u;
            this.s = eVar.s;
            this.t = eVar.t;
            this.v = eVar.v;
            this.w = eVar.w;
            this.x = eVar.x;
            this.z = eVar.z;
            this.A = eVar.A;
            this.B = eVar.B;
            this.y = eVar.y;
        }
    }

    /* loaded from: classes.dex */
    public class f {
        public static final int a = Integer.MIN_VALUE;
        public ArrayList<View> b = new ArrayList<>();
        public int c = Integer.MIN_VALUE;
        public int d = Integer.MIN_VALUE;
        public int e = 0;
        public final int f;

        public f(int i) {
            this.f = i;
        }

        public void A(int i) {
            this.c = i;
            this.d = i;
        }

        public void a(View view) {
            c s = s(view);
            s.f = this;
            this.b.add(view);
            this.d = Integer.MIN_VALUE;
            if (this.b.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (s.e() || s.d()) {
                this.e = StaggeredGridLayoutManager.this.D.e(view) + this.e;
            }
        }

        public void b(boolean z, int i) {
            int u;
            if (z) {
                u = q(Integer.MIN_VALUE);
            } else {
                u = u(Integer.MIN_VALUE);
            }
            e();
            if (u == Integer.MIN_VALUE) {
                return;
            }
            if (!z || u >= StaggeredGridLayoutManager.this.D.i()) {
                if (z || u <= StaggeredGridLayoutManager.this.D.n()) {
                    if (i != Integer.MIN_VALUE) {
                        u += i;
                    }
                    this.d = u;
                    this.c = u;
                }
            }
        }

        public void c() {
            d.a f;
            ArrayList<View> arrayList = this.b;
            View view = arrayList.get(arrayList.size() - 1);
            c s = s(view);
            this.d = StaggeredGridLayoutManager.this.D.d(view);
            if (s.g && (f = StaggeredGridLayoutManager.this.N.f(s.b())) != null && f.t == 1) {
                this.d = f.c(this.f) + this.d;
            }
        }

        public void d() {
            d.a f;
            View view = this.b.get(0);
            c s = s(view);
            this.c = StaggeredGridLayoutManager.this.D.g(view);
            if (s.g && (f = StaggeredGridLayoutManager.this.N.f(s.b())) != null && f.t == -1) {
                this.c -= f.c(this.f);
            }
        }

        public void e() {
            this.b.clear();
            v();
            this.e = 0;
        }

        public int f() {
            if (StaggeredGridLayoutManager.this.I) {
                return n(this.b.size() - 1, -1, true);
            }
            return n(0, this.b.size(), true);
        }

        public int g() {
            if (StaggeredGridLayoutManager.this.I) {
                return m(this.b.size() - 1, -1, true);
            }
            return m(0, this.b.size(), true);
        }

        public int h() {
            if (StaggeredGridLayoutManager.this.I) {
                return n(this.b.size() - 1, -1, false);
            }
            return n(0, this.b.size(), false);
        }

        public int i() {
            if (StaggeredGridLayoutManager.this.I) {
                return n(0, this.b.size(), true);
            }
            return n(this.b.size() - 1, -1, true);
        }

        public int j() {
            if (StaggeredGridLayoutManager.this.I) {
                return m(0, this.b.size(), true);
            }
            return m(this.b.size() - 1, -1, true);
        }

        public int k() {
            if (StaggeredGridLayoutManager.this.I) {
                return n(0, this.b.size(), false);
            }
            return n(this.b.size() - 1, -1, false);
        }

        public int l(int i, int i2, boolean z, boolean z2, boolean z3) {
            int n = StaggeredGridLayoutManager.this.D.n();
            int i3 = StaggeredGridLayoutManager.this.D.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.b.get(i);
                int g = StaggeredGridLayoutManager.this.D.g(view);
                int d = StaggeredGridLayoutManager.this.D.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g >= i3 : g > i3;
                if (!z3 ? d > n : d >= n) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (z && z2) {
                        if (g >= n && d <= i3) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    } else if (z2) {
                        return StaggeredGridLayoutManager.this.s0(view);
                    } else {
                        if (g < n || d > i3) {
                            return StaggeredGridLayoutManager.this.s0(view);
                        }
                    }
                }
                i += i4;
            }
            return -1;
        }

        public int m(int i, int i2, boolean z) {
            return l(i, i2, false, false, z);
        }

        public int n(int i, int i2, boolean z) {
            return l(i, i2, z, true, false);
        }

        public int o() {
            return this.e;
        }

        public int p() {
            int i = this.d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.d;
        }

        public int q(int i) {
            int i2 = this.d;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.b.size() == 0) {
                return i;
            }
            c();
            return this.d;
        }

        public View r(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.b.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.b.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.I && staggeredGridLayoutManager.s0(view2) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.I && staggeredGridLayoutManager2.s0(view2) >= i) || !view2.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.b.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.b.get(size2);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.I && staggeredGridLayoutManager3.s0(view3) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.I && staggeredGridLayoutManager4.s0(view3) <= i) || !view3.hasFocusable()) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }

        public c s(View view) {
            return (c) view.getLayoutParams();
        }

        public int t() {
            int i = this.c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.c;
        }

        public int u(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.b.size() == 0) {
                return i;
            }
            d();
            return this.c;
        }

        public void v() {
            this.c = Integer.MIN_VALUE;
            this.d = Integer.MIN_VALUE;
        }

        public void w(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                this.c = i2 + i;
            }
            int i3 = this.d;
            if (i3 != Integer.MIN_VALUE) {
                this.d = i3 + i;
            }
        }

        public void x() {
            int size = this.b.size();
            View remove = this.b.remove(size - 1);
            c s = s(remove);
            s.f = null;
            if (s.e() || s.d()) {
                this.e -= StaggeredGridLayoutManager.this.D.e(remove);
            }
            if (size == 1) {
                this.c = Integer.MIN_VALUE;
            }
            this.d = Integer.MIN_VALUE;
        }

        public void y() {
            View remove = this.b.remove(0);
            c s = s(remove);
            s.f = null;
            if (this.b.size() == 0) {
                this.d = Integer.MIN_VALUE;
            }
            if (s.e() || s.d()) {
                this.e -= StaggeredGridLayoutManager.this.D.e(remove);
            }
            this.c = Integer.MIN_VALUE;
        }

        public void z(View view) {
            c s = s(view);
            s.f = this;
            this.b.add(0, view);
            this.c = Integer.MIN_VALUE;
            if (this.b.size() == 1) {
                this.d = Integer.MIN_VALUE;
            }
            if (s.e() || s.d()) {
                this.e = StaggeredGridLayoutManager.this.D.e(view) + this.e;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d t0 = RecyclerView.o.t0(context, attributeSet, i, i2);
        p3(t0.a);
        r3(t0.b);
        q3(t0.c);
        this.H = new e30();
        y2();
    }

    private int B2(int i) {
        int Q = Q();
        for (int i2 = 0; i2 < Q; i2++) {
            int s0 = s0(P(i2));
            if (s0 >= 0 && s0 < i) {
                return s0;
            }
        }
        return 0;
    }

    private int H2(int i) {
        for (int Q = Q() - 1; Q >= 0; Q--) {
            int s0 = s0(P(Q));
            if (s0 >= 0 && s0 < i) {
                return s0;
            }
        }
        return 0;
    }

    private void J2(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z2) {
        int i;
        int O2 = O2(Integer.MIN_VALUE);
        if (O2 != Integer.MIN_VALUE && (i = this.D.i() - O2) > 0) {
            int i2 = i - (-l3(-i, wVar, c0Var));
            if (!z2 || i2 <= 0) {
                return;
            }
            this.D.t(i2);
        }
    }

    private void K2(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z2) {
        int n;
        int R2 = R2(Integer.MAX_VALUE);
        if (R2 != Integer.MAX_VALUE && (n = R2 - this.D.n()) > 0) {
            int l3 = n - l3(n, wVar, c0Var);
            if (!z2 || l3 <= 0) {
                return;
            }
            this.D.t(-l3);
        }
    }

    private int O2(int i) {
        int q = this.C[0].q(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int q2 = this.C[i2].q(i);
            if (q2 > q) {
                q = q2;
            }
        }
        return q;
    }

    private int P2(int i) {
        int u2 = this.C[0].u(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int u3 = this.C[i2].u(i);
            if (u3 > u2) {
                u2 = u3;
            }
        }
        return u2;
    }

    private int Q2(int i) {
        int q = this.C[0].q(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int q2 = this.C[i2].q(i);
            if (q2 < q) {
                q = q2;
            }
        }
        return q;
    }

    private int R2(int i) {
        int u2 = this.C[0].u(i);
        for (int i2 = 1; i2 < this.B; i2++) {
            int u3 = this.C[i2].u(i);
            if (u3 < u2) {
                u2 = u3;
            }
        }
        return u2;
    }

    private f S2(e30 e30Var) {
        int i;
        int i2;
        int i3 = -1;
        if (d3(e30Var.j)) {
            i = this.B - 1;
            i2 = -1;
        } else {
            i = 0;
            i3 = this.B;
            i2 = 1;
        }
        f fVar = null;
        if (e30Var.j == 1) {
            int i4 = Integer.MAX_VALUE;
            int n = this.D.n();
            while (i != i3) {
                f fVar2 = this.C[i];
                int q = fVar2.q(n);
                if (q < i4) {
                    fVar = fVar2;
                    i4 = q;
                }
                i += i2;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.D.i();
        while (i != i3) {
            f fVar3 = this.C[i];
            int u2 = fVar3.u(i6);
            if (u2 > i5) {
                fVar = fVar3;
                i5 = u2;
            }
            i += i2;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void W2(int i, int i2, int i3) {
        int i4;
        int i5;
        int N2 = this.J ? N2() : L2();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i >= i2) {
            i4 = i + 1;
            i5 = i2;
            this.N.h(i5);
            if (i3 != 1) {
                this.N.j(i, i2);
            } else if (i3 == 2) {
                this.N.k(i, i2);
            } else if (i3 == 8) {
                this.N.k(i, 1);
                this.N.j(i2, 1);
            }
            if (i4 > N2) {
                return;
            }
            if (i5 <= (this.J ? L2() : N2())) {
                N1();
                return;
            }
            return;
        } else {
            i4 = i2 + 1;
        }
        i5 = i;
        this.N.h(i5);
        if (i3 != 1) {
        }
        if (i4 > N2) {
        }
    }

    private void a3(View view, int i, int i2, boolean z2) {
        boolean c2;
        m(view, this.T);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.T;
        int z3 = z3(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.T;
        int z32 = z3(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z2) {
            c2 = e2(view, z3, z32, cVar);
        } else {
            c2 = c2(view, z3, z32, cVar);
        }
        if (c2) {
            view.measure(z3, z32);
        }
    }

    private void b3(View view, c cVar, boolean z2) {
        if (cVar.g) {
            if (this.F == 1) {
                a3(view, this.S, RecyclerView.o.R(e0(), f0(), m0() + r0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z2);
                return;
            }
            a3(view, RecyclerView.o.R(z0(), A0(), p0() + o0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.S, z2);
        } else if (this.F == 1) {
            a3(view, RecyclerView.o.R(this.G, A0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.R(e0(), f0(), m0() + r0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z2);
        } else {
            a3(view, RecyclerView.o.R(z0(), A0(), p0() + o0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.R(this.G, f0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0157, code lost:
        if (q2() != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void c3(RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z2) {
        e eVar;
        b bVar = this.U;
        if ((this.R != null || this.L != -1) && c0Var.d() == 0) {
            D1(wVar);
            bVar.c();
            return;
        }
        boolean z3 = true;
        boolean z4 = (bVar.e && this.L == -1 && this.R == null) ? false : true;
        if (z4) {
            bVar.c();
            if (this.R != null) {
                l2(bVar);
            } else {
                k3();
                bVar.c = this.J;
            }
            v3(c0Var, bVar);
            bVar.e = true;
        }
        if (this.R == null && this.L == -1 && (bVar.c != this.P || Z2() != this.Q)) {
            this.N.b();
            bVar.d = true;
        }
        if (Q() > 0 && ((eVar = this.R) == null || eVar.u < 1)) {
            if (bVar.d) {
                for (int i = 0; i < this.B; i++) {
                    this.C[i].e();
                    int i2 = bVar.b;
                    if (i2 != Integer.MIN_VALUE) {
                        this.C[i].A(i2);
                    }
                }
            } else if (!z4 && this.U.f != null) {
                for (int i3 = 0; i3 < this.B; i3++) {
                    f fVar = this.C[i3];
                    fVar.e();
                    fVar.A(this.U.f[i3]);
                }
            } else {
                for (int i4 = 0; i4 < this.B; i4++) {
                    this.C[i4].b(this.J, bVar.b);
                }
                this.U.d(this.C);
            }
        }
        z(wVar);
        this.H.f = false;
        this.V = false;
        x3(this.E.o());
        w3(bVar.a, c0Var);
        if (bVar.c) {
            o3(-1);
            z2(wVar, this.H, c0Var);
            o3(1);
            e30 e30Var = this.H;
            e30Var.h = bVar.a + e30Var.i;
            z2(wVar, e30Var, c0Var);
        } else {
            o3(1);
            z2(wVar, this.H, c0Var);
            o3(-1);
            e30 e30Var2 = this.H;
            e30Var2.h = bVar.a + e30Var2.i;
            z2(wVar, e30Var2, c0Var);
        }
        j3();
        if (Q() > 0) {
            if (this.J) {
                J2(wVar, c0Var, true);
                K2(wVar, c0Var, false);
            } else {
                K2(wVar, c0Var, true);
                J2(wVar, c0Var, false);
            }
        }
        if (z2 && !c0Var.j()) {
            if (this.O != 0 && Q() > 0 && (this.V || X2() != null)) {
                H1(this.Y);
            }
        }
        z3 = false;
        if (c0Var.j()) {
            this.U.c();
        }
        this.P = bVar.c;
        this.Q = Z2();
        if (z3) {
            this.U.c();
            c3(wVar, c0Var, false);
        }
    }

    private boolean d3(int i) {
        if (this.F == 0) {
            return (i == -1) != this.J;
        }
        return ((i == -1) == this.J) == Z2();
    }

    private void f3(View view) {
        for (int i = this.B - 1; i >= 0; i--) {
            this.C[i].z(view);
        }
    }

    private void g3(RecyclerView.w wVar, e30 e30Var) {
        int min;
        int min2;
        if (!e30Var.f || e30Var.n) {
            return;
        }
        if (e30Var.g == 0) {
            if (e30Var.j == -1) {
                h3(wVar, e30Var.l);
            } else {
                i3(wVar, e30Var.k);
            }
        } else if (e30Var.j == -1) {
            int i = e30Var.k;
            int P2 = i - P2(i);
            if (P2 < 0) {
                min2 = e30Var.l;
            } else {
                min2 = e30Var.l - Math.min(P2, e30Var.g);
            }
            h3(wVar, min2);
        } else {
            int Q2 = Q2(e30Var.l) - e30Var.l;
            if (Q2 < 0) {
                min = e30Var.k;
            } else {
                min = Math.min(Q2, e30Var.g) + e30Var.k;
            }
            i3(wVar, min);
        }
    }

    private void h3(RecyclerView.w wVar, int i) {
        for (int Q = Q() - 1; Q >= 0; Q--) {
            View P = P(Q);
            if (this.D.g(P) < i || this.D.r(P) < i) {
                return;
            }
            c cVar = (c) P.getLayoutParams();
            if (cVar.g) {
                for (int i2 = 0; i2 < this.B; i2++) {
                    if (this.C[i2].b.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.B; i3++) {
                    this.C[i3].x();
                }
            } else if (cVar.f.b.size() == 1) {
                return;
            } else {
                cVar.f.x();
            }
            F1(P, wVar);
        }
    }

    private void i3(RecyclerView.w wVar, int i) {
        while (Q() > 0) {
            View P = P(0);
            if (this.D.d(P) > i || this.D.q(P) > i) {
                return;
            }
            c cVar = (c) P.getLayoutParams();
            if (cVar.g) {
                for (int i2 = 0; i2 < this.B; i2++) {
                    if (this.C[i2].b.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.B; i3++) {
                    this.C[i3].y();
                }
            } else if (cVar.f.b.size() == 1) {
                return;
            } else {
                cVar.f.y();
            }
            F1(P, wVar);
        }
    }

    private void j3() {
        if (this.E.l() == 1073741824) {
            return;
        }
        float f2 = 0.0f;
        int Q = Q();
        for (int i = 0; i < Q; i++) {
            View P = P(i);
            float e2 = this.E.e(P);
            if (e2 >= f2) {
                if (((c) P.getLayoutParams()).i()) {
                    e2 = (e2 * 1.0f) / this.B;
                }
                f2 = Math.max(f2, e2);
            }
        }
        int i2 = this.G;
        int round = Math.round(f2 * this.B);
        if (this.E.l() == Integer.MIN_VALUE) {
            round = Math.min(round, this.E.o());
        }
        x3(round);
        if (this.G == i2) {
            return;
        }
        for (int i3 = 0; i3 < Q; i3++) {
            View P2 = P(i3);
            c cVar = (c) P2.getLayoutParams();
            if (!cVar.g) {
                if (Z2() && this.F == 1) {
                    int i4 = this.B;
                    int i5 = cVar.f.f;
                    P2.offsetLeftAndRight(((-((i4 - 1) - i5)) * this.G) - ((-((i4 - 1) - i5)) * i2));
                } else {
                    int i6 = cVar.f.f;
                    int i7 = this.G * i6;
                    int i8 = i6 * i2;
                    if (this.F == 1) {
                        P2.offsetLeftAndRight(i7 - i8);
                    } else {
                        P2.offsetTopAndBottom(i7 - i8);
                    }
                }
            }
        }
    }

    private void k2(View view) {
        for (int i = this.B - 1; i >= 0; i--) {
            this.C[i].a(view);
        }
    }

    private void k3() {
        if (this.F != 1 && Z2()) {
            this.J = !this.I;
        } else {
            this.J = this.I;
        }
    }

    private void l2(b bVar) {
        int n;
        e eVar = this.R;
        int i = eVar.u;
        if (i > 0) {
            if (i == this.B) {
                for (int i2 = 0; i2 < this.B; i2++) {
                    this.C[i2].e();
                    e eVar2 = this.R;
                    int i3 = eVar2.v[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        if (eVar2.A) {
                            n = this.D.i();
                        } else {
                            n = this.D.n();
                        }
                        i3 += n;
                    }
                    this.C[i2].A(i3);
                }
            } else {
                eVar.d();
                e eVar3 = this.R;
                eVar3.s = eVar3.t;
            }
        }
        e eVar4 = this.R;
        this.Q = eVar4.B;
        q3(eVar4.z);
        k3();
        e eVar5 = this.R;
        int i4 = eVar5.s;
        if (i4 != -1) {
            this.L = i4;
            bVar.c = eVar5.A;
        } else {
            bVar.c = this.J;
        }
        if (eVar5.w > 1) {
            d dVar = this.N;
            dVar.b = eVar5.x;
            dVar.c = eVar5.y;
        }
    }

    private void o2(View view, c cVar, e30 e30Var) {
        if (e30Var.j == 1) {
            if (cVar.g) {
                k2(view);
            } else {
                cVar.f.a(view);
            }
        } else if (cVar.g) {
            f3(view);
        } else {
            cVar.f.z(view);
        }
    }

    private void o3(int i) {
        e30 e30Var = this.H;
        e30Var.j = i;
        e30Var.i = this.J != (i == -1) ? -1 : 1;
    }

    private int p2(int i) {
        if (Q() == 0) {
            return this.J ? 1 : -1;
        }
        return (i < L2()) != this.J ? -1 : 1;
    }

    private boolean r2(f fVar) {
        if (this.J) {
            if (fVar.p() < this.D.i()) {
                ArrayList<View> arrayList = fVar.b;
                return !fVar.s(arrayList.get(arrayList.size() - 1)).g;
            }
        } else if (fVar.t() > this.D.n()) {
            return !fVar.s(fVar.b.get(0)).g;
        }
        return false;
    }

    private int s2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return o30.a(c0Var, this.D, D2(!this.W), C2(!this.W), this, this.W);
    }

    private void s3(int i, int i2) {
        for (int i3 = 0; i3 < this.B; i3++) {
            if (!this.C[i3].b.isEmpty()) {
                y3(this.C[i3], i, i2);
            }
        }
    }

    private int t2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return o30.b(c0Var, this.D, D2(!this.W), C2(!this.W), this, this.W, this.J);
    }

    private boolean t3(RecyclerView.c0 c0Var, b bVar) {
        int B2;
        if (this.P) {
            B2 = H2(c0Var.d());
        } else {
            B2 = B2(c0Var.d());
        }
        bVar.a = B2;
        bVar.b = Integer.MIN_VALUE;
        return true;
    }

    private int u2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        return o30.c(c0Var, this.D, D2(!this.W), C2(!this.W), this, this.W);
    }

    private int v2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.F == 1) ? 1 : Integer.MIN_VALUE : this.F == 0 ? 1 : Integer.MIN_VALUE : this.F == 1 ? -1 : Integer.MIN_VALUE : this.F == 0 ? -1 : Integer.MIN_VALUE : (this.F != 1 && Z2()) ? -1 : 1 : (this.F != 1 && Z2()) ? 1 : -1;
    }

    private d.a w2(int i) {
        d.a aVar = new d.a();
        aVar.u = new int[this.B];
        for (int i2 = 0; i2 < this.B; i2++) {
            aVar.u[i2] = i - this.C[i2].q(i);
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void w3(int i, RecyclerView.c0 c0Var) {
        int i2;
        int i3;
        int g;
        e30 e30Var = this.H;
        boolean z2 = false;
        e30Var.g = 0;
        e30Var.h = i;
        if (!M0() || (g = c0Var.g()) == -1) {
            i2 = 0;
        } else {
            if (this.J == (g < i)) {
                i2 = this.D.o();
            } else {
                i3 = this.D.o();
                i2 = 0;
                if (!U()) {
                    this.H.k = this.D.n() - i3;
                    this.H.l = this.D.i() + i2;
                } else {
                    this.H.l = this.D.h() + i2;
                    this.H.k = -i3;
                }
                e30 e30Var2 = this.H;
                e30Var2.m = false;
                e30Var2.f = true;
                if (this.D.l() == 0 && this.D.h() == 0) {
                    z2 = true;
                }
                e30Var2.n = z2;
            }
        }
        i3 = 0;
        if (!U()) {
        }
        e30 e30Var22 = this.H;
        e30Var22.m = false;
        e30Var22.f = true;
        if (this.D.l() == 0) {
            z2 = true;
        }
        e30Var22.n = z2;
    }

    private d.a x2(int i) {
        d.a aVar = new d.a();
        aVar.u = new int[this.B];
        for (int i2 = 0; i2 < this.B; i2++) {
            aVar.u[i2] = this.C[i2].u(i) - i;
        }
        return aVar;
    }

    private void y2() {
        this.D = l30.b(this, this.F);
        this.E = l30.b(this, 1 - this.F);
    }

    private void y3(f fVar, int i, int i2) {
        int o = fVar.o();
        if (i == -1) {
            if (fVar.t() + o <= i2) {
                this.K.set(fVar.f, false);
            }
        } else if (fVar.p() - o >= i2) {
            this.K.set(fVar.f, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    private int z2(RecyclerView.w wVar, e30 e30Var, RecyclerView.c0 c0Var) {
        int i;
        int i2;
        int n;
        int O2;
        f fVar;
        int e2;
        int i3;
        int i4;
        int e3;
        boolean n2;
        ?? r9 = 0;
        this.K.set(0, this.B, true);
        if (this.H.n) {
            i2 = e30Var.j == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            if (e30Var.j == 1) {
                i = e30Var.l + e30Var.g;
            } else {
                i = e30Var.k - e30Var.g;
            }
            i2 = i;
        }
        s3(e30Var.j, i2);
        if (this.J) {
            n = this.D.i();
        } else {
            n = this.D.n();
        }
        int i5 = n;
        boolean z2 = false;
        while (e30Var.a(c0Var) && (this.H.n || !this.K.isEmpty())) {
            View b2 = e30Var.b(wVar);
            c cVar = (c) b2.getLayoutParams();
            int b3 = cVar.b();
            int g = this.N.g(b3);
            boolean z3 = g == -1;
            if (z3) {
                fVar = cVar.g ? this.C[r9] : S2(e30Var);
                this.N.n(b3, fVar);
            } else {
                fVar = this.C[g];
            }
            f fVar2 = fVar;
            cVar.f = fVar2;
            if (e30Var.j == 1) {
                e(b2);
            } else {
                f(b2, r9);
            }
            b3(b2, cVar, r9);
            if (e30Var.j == 1) {
                int O22 = cVar.g ? O2(i5) : fVar2.q(i5);
                int e4 = this.D.e(b2) + O22;
                if (z3 && cVar.g) {
                    d.a w2 = w2(O22);
                    w2.t = -1;
                    w2.s = b3;
                    this.N.a(w2);
                }
                i3 = e4;
                e2 = O22;
            } else {
                int R2 = cVar.g ? R2(i5) : fVar2.u(i5);
                e2 = R2 - this.D.e(b2);
                if (z3 && cVar.g) {
                    d.a x2 = x2(R2);
                    x2.t = 1;
                    x2.s = b3;
                    this.N.a(x2);
                }
                i3 = R2;
            }
            if (cVar.g && e30Var.i == -1) {
                if (z3) {
                    this.V = true;
                } else {
                    if (e30Var.j == 1) {
                        n2 = m2();
                    } else {
                        n2 = n2();
                    }
                    if (!n2) {
                        d.a f2 = this.N.f(b3);
                        if (f2 != null) {
                            f2.v = true;
                        }
                        this.V = true;
                    }
                }
            }
            o2(b2, cVar, e30Var);
            if (Z2() && this.F == 1) {
                int i6 = cVar.g ? this.E.i() : this.E.i() - (((this.B - 1) - fVar2.f) * this.G);
                e3 = i6;
                i4 = i6 - this.E.e(b2);
            } else {
                int n3 = cVar.g ? this.E.n() : (fVar2.f * this.G) + this.E.n();
                i4 = n3;
                e3 = this.E.e(b2) + n3;
            }
            if (this.F == 1) {
                P0(b2, i4, e2, e3, i3);
            } else {
                P0(b2, e2, i4, i3, e3);
            }
            if (cVar.g) {
                s3(this.H.j, i2);
            } else {
                y3(fVar2, this.H.j, i2);
            }
            g3(wVar, this.H);
            if (this.H.m && b2.hasFocusable()) {
                if (cVar.g) {
                    this.K.clear();
                } else {
                    this.K.set(fVar2.f, false);
                    z2 = true;
                    r9 = 0;
                }
            }
            z2 = true;
            r9 = 0;
        }
        if (!z2) {
            g3(wVar, this.H);
        }
        if (this.H.j == -1) {
            O2 = this.D.n() - R2(this.D.n());
        } else {
            O2 = O2(this.D.i()) - this.D.i();
        }
        if (O2 > 0) {
            return Math.min(e30Var.g, O2);
        }
        return 0;
    }

    private int z3(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    public int[] A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.B];
        } else if (iArr.length < this.B) {
            StringBuilder G = wo1.G("Provided int[]'s size must be more than or equal to span count. Expected:");
            G.append(this.B);
            G.append(", array size:");
            G.append(iArr.length);
            throw new IllegalArgumentException(G.toString());
        }
        for (int i = 0; i < this.B; i++) {
            iArr[i] = this.C[i].f();
        }
        return iArr;
    }

    public View C2(boolean z2) {
        int n = this.D.n();
        int i = this.D.i();
        View view = null;
        for (int Q = Q() - 1; Q >= 0; Q--) {
            View P = P(Q);
            int g = this.D.g(P);
            int d2 = this.D.d(P);
            if (d2 > n && g < i) {
                if (d2 <= i || !z2) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    public View D2(boolean z2) {
        int n = this.D.n();
        int i = this.D.i();
        int Q = Q();
        View view = null;
        for (int i2 = 0; i2 < Q; i2++) {
            View P = P(i2);
            int g = this.D.g(P);
            if (this.D.d(P) > n && g < i) {
                if (g >= n || !z2) {
                    return P;
                }
                if (view == null) {
                    view = P;
                }
            }
        }
        return view;
    }

    public int E2() {
        View C2 = this.J ? C2(true) : D2(true);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        return this.O != 0;
    }

    public int[] F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.B];
        } else if (iArr.length < this.B) {
            StringBuilder G = wo1.G("Provided int[]'s size must be more than or equal to span count. Expected:");
            G.append(this.B);
            G.append(", array size:");
            G.append(iArr.length);
            throw new IllegalArgumentException(G.toString());
        }
        for (int i = 0; i < this.B; i++) {
            iArr[i] = this.C[i].h();
        }
        return iArr;
    }

    public int[] G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.B];
        } else if (iArr.length < this.B) {
            StringBuilder G = wo1.G("Provided int[]'s size must be more than or equal to span count. Expected:");
            G.append(this.B);
            G.append(", array size:");
            G.append(iArr.length);
            throw new IllegalArgumentException(G.toString());
        }
        for (int i = 0; i < this.B; i++) {
            iArr[i] = this.C[i].i();
        }
        return iArr;
    }

    public int[] I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.B];
        } else if (iArr.length < this.B) {
            StringBuilder G = wo1.G("Provided int[]'s size must be more than or equal to span count. Expected:");
            G.append(this.B);
            G.append(", array size:");
            G.append(iArr.length);
            throw new IllegalArgumentException(G.toString());
        }
        for (int i = 0; i < this.B; i++) {
            iArr[i] = this.C[i].k();
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        if (this.F == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int L2() {
        if (Q() == 0) {
            return 0;
        }
        return s0(P(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public int M2() {
        return this.O;
    }

    public int N2() {
        int Q = Q();
        if (Q == 0) {
            return 0;
        }
        return s0(P(Q - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return l3(i, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int i) {
        e eVar = this.R;
        if (eVar != null && eVar.s != i) {
            eVar.c();
        }
        this.L = i;
        this.M = Integer.MIN_VALUE;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return l3(i, wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(int i) {
        super.T0(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            this.C[i2].w(i);
        }
    }

    public int T2() {
        return this.F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(int i) {
        super.U0(i);
        for (int i2 = 0; i2 < this.B; i2++) {
            this.C[i2].w(i);
        }
    }

    public boolean U2() {
        return this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.F == 1) {
            return this.B;
        }
        return super.V(wVar, c0Var);
    }

    public int V2() {
        return this.B;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
        if (r10 == r11) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View X2() {
        int i;
        int i2;
        boolean z2;
        int Q = Q() - 1;
        BitSet bitSet = new BitSet(this.B);
        bitSet.set(0, this.B, true);
        char c2 = (this.F == 1 && Z2()) ? (char) 1 : (char) 65535;
        if (this.J) {
            i = -1;
        } else {
            i = Q + 1;
            Q = 0;
        }
        int i3 = Q < i ? 1 : -1;
        while (Q != i) {
            View P = P(Q);
            c cVar = (c) P.getLayoutParams();
            if (bitSet.get(cVar.f.f)) {
                if (r2(cVar.f)) {
                    return P;
                }
                bitSet.clear(cVar.f.f);
            }
            if (!cVar.g && (i2 = Q + i3) != i) {
                View P2 = P(i2);
                if (this.J) {
                    int d2 = this.D.d(P);
                    int d3 = this.D.d(P2);
                    if (d2 < d3) {
                        return P;
                    }
                } else {
                    int g = this.D.g(P);
                    int g2 = this.D.g(P2);
                    if (g > g2) {
                        return P;
                    }
                }
                if (z2) {
                    if ((cVar.f.f - ((c) P2.getLayoutParams()).f.f < 0) != (c2 < 0)) {
                        return P;
                    }
                } else {
                    continue;
                }
            }
            Q += i3;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int i, int i2) {
        int q;
        int q2;
        int p0 = p0() + o0();
        int m0 = m0() + r0();
        if (this.F == 1) {
            q2 = RecyclerView.o.q(i2, rect.height() + m0, k0());
            q = RecyclerView.o.q(i, (this.G * this.B) + p0, l0());
        } else {
            q = RecyclerView.o.q(i, rect.width() + p0, l0());
            q2 = RecyclerView.o.q(i2, (this.G * this.B) + m0, k0());
        }
        X1(q, q2);
    }

    public void Y2() {
        this.N.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        H1(this.Y);
        for (int i = 0; i < this.B; i++) {
            this.C[i].e();
        }
        recyclerView.requestLayout();
    }

    public boolean Z2() {
        return i0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF a(int i) {
        int p2 = p2(i);
        PointF pointF = new PointF();
        if (p2 == 0) {
            return null;
        }
        if (this.F == 0) {
            pointF.x = p2;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = p2;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @z1
    public View a1(View view, int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        View I;
        int L2;
        int j;
        int j2;
        int j3;
        View r;
        if (Q() == 0 || (I = I(view)) == null) {
            return null;
        }
        k3();
        int v2 = v2(i);
        if (v2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) I.getLayoutParams();
        boolean z2 = cVar.g;
        f fVar = cVar.f;
        if (v2 == 1) {
            L2 = N2();
        } else {
            L2 = L2();
        }
        w3(L2, c0Var);
        o3(v2);
        e30 e30Var = this.H;
        e30Var.h = e30Var.i + L2;
        e30Var.g = (int) (this.D.o() * A);
        e30 e30Var2 = this.H;
        e30Var2.m = true;
        e30Var2.f = false;
        z2(wVar, e30Var2, c0Var);
        this.P = this.J;
        if (z2 || (r = fVar.r(L2, v2)) == null || r == I) {
            if (d3(v2)) {
                for (int i2 = this.B - 1; i2 >= 0; i2--) {
                    View r2 = this.C[i2].r(L2, v2);
                    if (r2 != null && r2 != I) {
                        return r2;
                    }
                }
            } else {
                for (int i3 = 0; i3 < this.B; i3++) {
                    View r3 = this.C[i3].r(L2, v2);
                    if (r3 != null && r3 != I) {
                        return r3;
                    }
                }
            }
            boolean z3 = (this.I ^ true) == (v2 == -1);
            if (!z2) {
                if (z3) {
                    j3 = fVar.g();
                } else {
                    j3 = fVar.j();
                }
                View J = J(j3);
                if (J != null && J != I) {
                    return J;
                }
            }
            if (d3(v2)) {
                for (int i4 = this.B - 1; i4 >= 0; i4--) {
                    if (i4 != fVar.f) {
                        if (z3) {
                            j2 = this.C[i4].g();
                        } else {
                            j2 = this.C[i4].j();
                        }
                        View J2 = J(j2);
                        if (J2 != null && J2 != I) {
                            return J2;
                        }
                    }
                }
            } else {
                for (int i5 = 0; i5 < this.B; i5++) {
                    if (z3) {
                        j = this.C[i5].g();
                    } else {
                        j = this.C[i5].j();
                    }
                    View J3 = J(j);
                    if (J3 != null && J3 != I) {
                        return J3;
                    }
                }
            }
            return null;
        }
        return r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            View D2 = D2(false);
            View C2 = C2(false);
            if (D2 == null || C2 == null) {
                return;
            }
            int s0 = s0(D2);
            int s02 = s0(C2);
            if (s0 < s02) {
                accessibilityEvent.setFromIndex(s0);
                accessibilityEvent.setToIndex(s02);
                return;
            }
            accessibilityEvent.setFromIndex(s02);
            accessibilityEvent.setToIndex(s0);
        }
    }

    public void e3(int i, RecyclerView.c0 c0Var) {
        int L2;
        int i2;
        if (i > 0) {
            L2 = N2();
            i2 = 1;
        } else {
            L2 = L2();
            i2 = -1;
        }
        this.H.f = true;
        w3(L2, c0Var);
        o3(i2);
        e30 e30Var = this.H;
        e30Var.h = L2 + e30Var.i;
        e30Var.g = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i) {
        f30 f30Var = new f30(recyclerView.getContext());
        f30Var.q(i);
        g2(f30Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, ls lsVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.f1(view, lsVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.F == 0) {
            lsVar.Z0(ls.c.h(cVar.h(), cVar.g ? this.B : 1, -1, -1, false, false));
        } else {
            lsVar.Z0(ls.c.h(-1, -1, cVar.h(), cVar.g ? this.B : 1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.R == null) {
            super.i(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int i, int i2) {
        W2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.N.b();
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.R == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int i, int i2, int i3) {
        W2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int i, int i2) {
        W2(i, i2, 2);
    }

    public int l3(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (Q() == 0 || i == 0) {
            return 0;
        }
        e3(i, c0Var);
        int z2 = z2(wVar, this.H, c0Var);
        if (this.H.g >= z2) {
            i = i < 0 ? -z2 : z2;
        }
        this.D.t(-i);
        this.P = this.J;
        e30 e30Var = this.H;
        e30Var.g = 0;
        g3(wVar, e30Var);
        return i;
    }

    public boolean m2() {
        int q = this.C[0].q(Integer.MIN_VALUE);
        for (int i = 1; i < this.B; i++) {
            if (this.C[i].q(Integer.MIN_VALUE) != q) {
                return false;
            }
        }
        return true;
    }

    public void m3(int i, int i2) {
        e eVar = this.R;
        if (eVar != null) {
            eVar.c();
        }
        this.L = i;
        this.M = i2;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        return this.F == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        W2(i, i2, 4);
    }

    public boolean n2() {
        int u2 = this.C[0].u(Integer.MIN_VALUE);
        for (int i = 1; i < this.B; i++) {
            if (this.C[i].u(Integer.MIN_VALUE) != u2) {
                return false;
            }
        }
        return true;
    }

    public void n3(int i) {
        i(null);
        if (i == this.O) {
            return;
        }
        if (i != 0 && i != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.O = i;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        return this.F == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        c3(wVar, c0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.L = -1;
        this.M = Integer.MIN_VALUE;
        this.R = null;
        this.U.c();
    }

    public void p3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        i(null);
        if (i == this.F) {
            return;
        }
        this.F = i;
        l30 l30Var = this.D;
        this.D = this.E;
        this.E = l30Var;
        N1();
    }

    public boolean q2() {
        int L2;
        int N2;
        if (Q() == 0 || this.O == 0 || !E0()) {
            return false;
        }
        if (this.J) {
            L2 = N2();
            N2 = L2();
        } else {
            L2 = L2();
            N2 = N2();
        }
        if (L2 == 0 && X2() != null) {
            this.N.b();
            O1();
            N1();
            return true;
        } else if (this.V) {
            int i = this.J ? -1 : 1;
            int i2 = N2 + 1;
            d.a e2 = this.N.e(L2, i2, i, true);
            if (e2 == null) {
                this.V = false;
                this.N.d(i2);
                return false;
            }
            d.a e3 = this.N.e(L2, e2.s, i * (-1), true);
            if (e3 == null) {
                this.N.d(e2.s);
            } else {
                this.N.d(e3.s + 1);
            }
            O1();
            N1();
            return true;
        } else {
            return false;
        }
    }

    public void q3(boolean z2) {
        i(null);
        e eVar = this.R;
        if (eVar != null && eVar.z != z2) {
            eVar.z = z2;
        }
        this.I = z2;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    @i2({i2.a.LIBRARY})
    public void r(int i, int i2, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        int q;
        int i3;
        if (this.F != 0) {
            i = i2;
        }
        if (Q() == 0 || i == 0) {
            return;
        }
        e3(i, c0Var);
        int[] iArr = this.X;
        if (iArr == null || iArr.length < this.B) {
            this.X = new int[this.B];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.B; i5++) {
            e30 e30Var = this.H;
            if (e30Var.i == -1) {
                q = e30Var.k;
                i3 = this.C[i5].u(q);
            } else {
                q = this.C[i5].q(e30Var.l);
                i3 = this.H.l;
            }
            int i6 = q - i3;
            if (i6 >= 0) {
                this.X[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.X, 0, i4);
        for (int i7 = 0; i7 < i4 && this.H.a(c0Var); i7++) {
            cVar.a(this.H.h, this.X[i7]);
            e30 e30Var2 = this.H;
            e30Var2.h += e30Var2.i;
        }
    }

    public void r3(int i) {
        i(null);
        if (i != this.B) {
            Y2();
            this.B = i;
            this.K = new BitSet(this.B);
            this.C = new f[this.B];
            for (int i2 = 0; i2 < this.B; i2++) {
                this.C[i2] = new f(i2);
            }
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.R = (e) parcelable;
            N1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        return t2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        int u2;
        int n;
        int[] iArr;
        if (this.R != null) {
            return new e(this.R);
        }
        e eVar = new e();
        eVar.z = this.I;
        eVar.A = this.P;
        eVar.B = this.Q;
        d dVar = this.N;
        if (dVar != null && (iArr = dVar.b) != null) {
            eVar.x = iArr;
            eVar.w = iArr.length;
            eVar.y = dVar.c;
        } else {
            eVar.w = 0;
        }
        if (Q() > 0) {
            eVar.s = this.P ? N2() : L2();
            eVar.t = E2();
            int i = this.B;
            eVar.u = i;
            eVar.v = new int[i];
            for (int i2 = 0; i2 < this.B; i2++) {
                if (this.P) {
                    u2 = this.C[i2].q(Integer.MIN_VALUE);
                    if (u2 != Integer.MIN_VALUE) {
                        n = this.D.i();
                        u2 -= n;
                        eVar.v[i2] = u2;
                    } else {
                        eVar.v[i2] = u2;
                    }
                } else {
                    u2 = this.C[i2].u(Integer.MIN_VALUE);
                    if (u2 != Integer.MIN_VALUE) {
                        n = this.D.n();
                        u2 -= n;
                        eVar.v[i2] = u2;
                    } else {
                        eVar.v[i2] = u2;
                    }
                }
            }
        } else {
            eVar.s = -1;
            eVar.t = -1;
            eVar.u = 0;
        }
        return eVar;
    }

    public boolean u3(RecyclerView.c0 c0Var, b bVar) {
        int i;
        int n;
        if (!c0Var.j() && (i = this.L) != -1) {
            if (i >= 0 && i < c0Var.d()) {
                e eVar = this.R;
                if (eVar != null && eVar.s != -1 && eVar.u >= 1) {
                    bVar.b = Integer.MIN_VALUE;
                    bVar.a = this.L;
                } else {
                    View J = J(this.L);
                    if (J != null) {
                        bVar.a = this.J ? N2() : L2();
                        if (this.M != Integer.MIN_VALUE) {
                            if (bVar.c) {
                                bVar.b = (this.D.i() - this.M) - this.D.d(J);
                            } else {
                                bVar.b = (this.D.n() + this.M) - this.D.g(J);
                            }
                            return true;
                        } else if (this.D.e(J) > this.D.o()) {
                            if (bVar.c) {
                                n = this.D.i();
                            } else {
                                n = this.D.n();
                            }
                            bVar.b = n;
                            return true;
                        } else {
                            int g = this.D.g(J) - this.D.n();
                            if (g < 0) {
                                bVar.b = -g;
                                return true;
                            }
                            int i2 = this.D.i() - this.D.d(J);
                            if (i2 < 0) {
                                bVar.b = i2;
                                return true;
                            }
                            bVar.b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i3 = this.L;
                        bVar.a = i3;
                        int i4 = this.M;
                        if (i4 == Integer.MIN_VALUE) {
                            bVar.c = p2(i3) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i4);
                        }
                        bVar.d = true;
                    }
                }
                return true;
            }
            this.L = -1;
            this.M = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        return u2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.F == 0) {
            return this.B;
        }
        return super.v0(wVar, c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void v1(int i) {
        if (i == 0) {
            q2();
        }
    }

    public void v3(RecyclerView.c0 c0Var, b bVar) {
        if (u3(c0Var, bVar) || t3(c0Var, bVar)) {
            return;
        }
        bVar.a();
        bVar.a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.c0 c0Var) {
        return s2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        return t2(c0Var);
    }

    public void x3(int i) {
        this.G = i / this.B;
        this.S = View.MeasureSpec.makeMeasureSpec(i, this.E.l());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        return u2(c0Var);
    }

    /* loaded from: classes.dex */
    public static class d {
        private static final int a = 10;
        public int[] b;
        public List<a> c;

        private int i(int i) {
            if (this.c == null) {
                return -1;
            }
            a f = f(i);
            if (f != null) {
                this.c.remove(f);
            }
            int size = this.c.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.c.get(i2).s >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 != -1) {
                this.c.remove(i2);
                return this.c.get(i2).s;
            }
            return -1;
        }

        private void l(int i, int i2) {
            List<a> list = this.c;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.c.get(size);
                int i3 = aVar.s;
                if (i3 >= i) {
                    aVar.s = i3 + i2;
                }
            }
        }

        private void m(int i, int i2) {
            List<a> list = this.c;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.c.get(size);
                int i4 = aVar.s;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.c.remove(size);
                    } else {
                        aVar.s = i4 - i2;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            int size = this.c.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.c.get(i);
                if (aVar2.s == aVar.s) {
                    this.c.remove(i);
                }
                if (aVar2.s >= aVar.s) {
                    this.c.add(i, aVar);
                    return;
                }
            }
            this.c.add(aVar);
        }

        public void b() {
            int[] iArr = this.b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.c = null;
        }

        public void c(int i) {
            int[] iArr = this.b;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.b = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[o(i)];
                this.b = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.b;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i) {
            List<a> list = this.c;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.c.get(size).s >= i) {
                        this.c.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.c;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.c.get(i4);
                int i5 = aVar.s;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.t == i3 || (z && aVar.v))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.c;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.c.get(size);
                if (aVar.s == i) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i) {
            int[] iArr = this.b;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        public int h(int i) {
            int[] iArr = this.b;
            if (iArr != null && i < iArr.length) {
                int i2 = i(i);
                if (i2 == -1) {
                    int[] iArr2 = this.b;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.b.length;
                }
                int i3 = i2 + 1;
                Arrays.fill(this.b, i, i3, -1);
                return i3;
            }
            return -1;
        }

        public void j(int i, int i2) {
            int[] iArr = this.b;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.b, i, i3, -1);
            l(i, i2);
        }

        public void k(int i, int i2) {
            int[] iArr = this.b;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.b;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.b;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        public void n(int i, f fVar) {
            c(i);
            this.b[i] = fVar.f;
        }

        public int o(int i) {
            int length = this.b.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0003a();
            public int s;
            public int t;
            public int[] u;
            public boolean v;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static class C0003a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a(Parcel parcel) {
                this.s = parcel.readInt();
                this.t = parcel.readInt();
                this.v = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.u = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int c(int i) {
                int[] iArr = this.u;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder G = wo1.G("FullSpanItem{mPosition=");
                G.append(this.s);
                G.append(", mGapDir=");
                G.append(this.t);
                G.append(", mHasUnwantedGapAfter=");
                G.append(this.v);
                G.append(", mGapPerSpan=");
                G.append(Arrays.toString(this.u));
                G.append('}');
                return G.toString();
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.s);
                parcel.writeInt(this.t);
                parcel.writeInt(this.v ? 1 : 0);
                int[] iArr = this.u;
                if (iArr != null && iArr.length > 0) {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.u);
                    return;
                }
                parcel.writeInt(0);
            }

            public a() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.F = i2;
        r3(i);
        this.H = new e30();
        y2();
    }
}
package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.wo1;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private static final boolean O = false;
    private static final String P = "GridLayoutManager";
    public static final int Q = -1;
    public boolean R;
    public int S;
    public int[] T;
    public View[] U;
    public final SparseIntArray V;
    public final SparseIntArray W;
    public c X;
    public final Rect Y;
    private boolean Z;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();
        private boolean c = false;
        private boolean d = false;

        public static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        public int b(int i, int i2) {
            if (!this.d) {
                return d(i, i2);
            }
            int i3 = this.b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = d(i, i2);
            this.b.put(i, d);
            return d;
        }

        public int c(int i, int i2) {
            if (!this.c) {
                return e(i, i2);
            }
            int i3 = this.a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e = e(i, i2);
            this.a.put(i, e);
            return e;
        }

        public int d(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int a;
            if (!this.d || (a = a(this.b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                i5 = 0;
            } else {
                i4 = this.b.get(a);
                i5 = a + 1;
                i3 = f(a) + c(a, i2);
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                }
            }
            int f = f(i);
            while (i5 < i) {
                int f2 = f(i5);
                i3 += f2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = f2;
                }
                i5++;
            }
            return i3 + f > i2 ? i4 + 1 : i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x002b -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002d -> B:17:0x0030). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002f -> B:17:0x0030). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int e(int i, int i2) {
            int i3;
            int i4;
            int f = f(i);
            if (f == i2) {
                return 0;
            }
            if (!this.c || (i3 = a(this.a, i)) < 0) {
                i3 = 0;
                i4 = 0;
                if (i3 >= i) {
                    int f2 = f(i3);
                    i4 += f2;
                    if (i4 == i2) {
                        i4 = 0;
                    } else if (i4 > i2) {
                        i4 = f2;
                    }
                    i3++;
                    if (i3 >= i) {
                        if (f + i4 <= i2) {
                            return i4;
                        }
                        return 0;
                    }
                }
            } else {
                i4 = f(i3) + this.a.get(i3);
                i3++;
                if (i3 >= i) {
                }
            }
        }

        public abstract int f(int i);

        public void g() {
            this.b.clear();
        }

        public void h() {
            this.a.clear();
        }

        public boolean i() {
            return this.d;
        }

        public boolean j() {
            return this.c;
        }

        public void k(boolean z) {
            if (!z) {
                this.b.clear();
            }
            this.d = z;
        }

        public void l(boolean z) {
            if (!z) {
                this.b.clear();
            }
            this.c = z;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.R = false;
        this.S = -1;
        this.V = new SparseIntArray();
        this.W = new SparseIntArray();
        this.X = new a();
        this.Y = new Rect();
        Q3(RecyclerView.o.t0(context, attributeSet, i, i2).b);
    }

    public static int[] A3(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void B3() {
        this.V.clear();
        this.W.clear();
    }

    private int C3(RecyclerView.c0 c0Var) {
        int max;
        if (Q() != 0 && c0Var.d() != 0) {
            r2();
            boolean V2 = V2();
            View x2 = x2(!V2, true);
            View w2 = w2(!V2, true);
            if (x2 != null && w2 != null) {
                int b2 = this.X.b(s0(x2), this.S);
                int b3 = this.X.b(s0(w2), this.S);
                int min = Math.min(b2, b3);
                int max2 = Math.max(b2, b3);
                int b4 = this.X.b(c0Var.d() - 1, this.S) + 1;
                if (this.D) {
                    max = Math.max(0, (b4 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (V2) {
                    return Math.round((max * (Math.abs(this.A.d(w2) - this.A.g(x2)) / ((this.X.b(s0(w2), this.S) - this.X.b(s0(x2), this.S)) + 1))) + (this.A.n() - this.A.g(x2)));
                }
                return max;
            }
        }
        return 0;
    }

    private int D3(RecyclerView.c0 c0Var) {
        if (Q() != 0 && c0Var.d() != 0) {
            r2();
            View x2 = x2(!V2(), true);
            View w2 = w2(!V2(), true);
            if (x2 != null && w2 != null) {
                if (!V2()) {
                    return this.X.b(c0Var.d() - 1, this.S) + 1;
                }
                int d = this.A.d(w2) - this.A.g(x2);
                int b2 = this.X.b(s0(x2), this.S);
                return (int) ((d / ((this.X.b(s0(w2), this.S) - b2) + 1)) * (this.X.b(c0Var.d() - 1, this.S) + 1));
            }
        }
        return 0;
    }

    private void E3(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int J3 = J3(wVar, c0Var, aVar.b);
        if (z) {
            while (J3 > 0) {
                int i2 = aVar.b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.b = i3;
                J3 = J3(wVar, c0Var, i3);
            }
            return;
        }
        int d = c0Var.d() - 1;
        int i4 = aVar.b;
        while (i4 < d) {
            int i5 = i4 + 1;
            int J32 = J3(wVar, c0Var, i5);
            if (J32 <= J3) {
                break;
            }
            i4 = i5;
            J3 = J32;
        }
        aVar.b = i4;
    }

    private void F3() {
        View[] viewArr = this.U;
        if (viewArr == null || viewArr.length != this.S) {
            this.U = new View[this.S];
        }
    }

    private int I3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i) {
        if (!c0Var.j()) {
            return this.X.b(i, this.S);
        }
        int g = wVar.g(i);
        if (g == -1) {
            return 0;
        }
        return this.X.b(g, this.S);
    }

    private int J3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i) {
        if (!c0Var.j()) {
            return this.X.c(i, this.S);
        }
        int i2 = this.W.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.g(i);
        if (g == -1) {
            return 0;
        }
        return this.X.c(g, this.S);
    }

    private int K3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i) {
        if (!c0Var.j()) {
            return this.X.f(i);
        }
        int i2 = this.V.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int g = wVar.g(i);
        if (g == -1) {
            return 1;
        }
        return this.X.f(g);
    }

    private void M3(float f, int i) {
        z3(Math.max(Math.round(f * this.S), i));
    }

    private void O3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int G3 = G3(bVar.f, bVar.g);
        if (this.y == 1) {
            i3 = RecyclerView.o.R(G3, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i2 = RecyclerView.o.R(this.A.o(), f0(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int R = RecyclerView.o.R(G3, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int R2 = RecyclerView.o.R(this.A.o(), A0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i2 = R;
            i3 = R2;
        }
        P3(view, i3, i2, z);
    }

    private void P3(View view, int i, int i2, boolean z) {
        boolean c2;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z) {
            c2 = e2(view, i, i2, pVar);
        } else {
            c2 = c2(view, i, i2, pVar);
        }
        if (c2) {
            view.measure(i, i2);
        }
    }

    private void T3() {
        int e0;
        int r0;
        if (Q2() == 1) {
            e0 = z0() - p0();
            r0 = o0();
        } else {
            e0 = e0() - m0();
            r0 = r0();
        }
        z3(e0 - r0);
    }

    private void x3(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.U[i2];
            b bVar = (b) view.getLayoutParams();
            int K3 = K3(wVar, c0Var, s0(view));
            bVar.g = K3;
            bVar.f = i4;
            i4 += K3;
            i2 += i3;
        }
    }

    private void y3() {
        int Q2 = Q();
        for (int i = 0; i < Q2; i++) {
            b bVar = (b) P(i).getLayoutParams();
            int b2 = bVar.b();
            this.V.put(b2, bVar.i());
            this.W.put(b2, bVar.h());
        }
    }

    private void z3(int i) {
        this.T = A3(this.T, this.S, i);
    }

    public int G3(int i, int i2) {
        if (this.y == 1 && U2()) {
            int[] iArr = this.T;
            int i3 = this.S;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.T;
        return iArr2[i2 + i] - iArr2[i];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View H2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i, int i2, int i3) {
        r2();
        int n = this.A.n();
        int i4 = this.A.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View P2 = P(i);
            int s0 = s0(P2);
            if (s0 >= 0 && s0 < i3 && J3(wVar, c0Var, s0) == 0) {
                if (((RecyclerView.p) P2.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = P2;
                    }
                } else if (this.A.g(P2) < i4 && this.A.d(P2) >= n) {
                    return P2;
                } else {
                    if (view == null) {
                        view = P2;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    public int H3() {
        return this.S;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        if (this.y == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public c L3() {
        return this.X;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public boolean N3() {
        return this.Z;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.Q1(i, wVar, c0Var);
    }

    public void Q3(int i) {
        if (i == this.S) {
            return;
        }
        this.R = true;
        if (i >= 1) {
            this.S = i;
            this.X.h();
            N1();
            return;
        }
        throw new IllegalArgumentException(wo1.l("Span count should be at least 1. Provided ", i));
    }

    public void R3(c cVar) {
        this.X = cVar;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        T3();
        F3();
        return super.S1(i, wVar, c0Var);
    }

    public void S3(boolean z) {
        this.Z = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int V(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.y == 1) {
            return this.S;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0087, code lost:
        r22.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0089, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v21 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W2(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int R;
        int i9;
        View e;
        int m = this.A.m();
        ?? r5 = 0;
        boolean z = m != 1073741824;
        int i10 = Q() > 0 ? this.T[this.S] : 0;
        if (z) {
            T3();
        }
        boolean z2 = cVar.l == 1;
        int i11 = this.S;
        if (!z2) {
            i11 = J3(wVar, c0Var, cVar.k) + K3(wVar, c0Var, cVar.k);
        }
        int i12 = 0;
        while (i12 < this.S && cVar.c(c0Var) && i11 > 0) {
            int i13 = cVar.k;
            int K3 = K3(wVar, c0Var, i13);
            if (K3 > this.S) {
                throw new IllegalArgumentException(wo1.z(wo1.J("Item at position ", i13, " requires ", K3, " spans but GridLayoutManager has only "), this.S, " spans."));
            }
            i11 -= K3;
            if (i11 < 0 || (e = cVar.e(wVar)) == null) {
                break;
            }
            this.U[i12] = e;
            i12++;
        }
        float f = 0.0f;
        x3(wVar, c0Var, i12, z2);
        int i14 = 0;
        int i15 = 0;
        while (i14 < i12) {
            View view = this.U[i14];
            if (cVar.s == null) {
                if (z2) {
                    e(view);
                } else {
                    f(view, r5);
                }
            } else if (z2) {
                c(view);
            } else {
                d(view, r5);
            }
            m(view, this.Y);
            O3(view, m, r5);
            int e2 = this.A.e(view);
            if (e2 > i15) {
                i15 = e2;
            }
            float f2 = (this.A.f(view) * 1.0f) / ((b) view.getLayoutParams()).g;
            if (f2 > f) {
                f = f2;
            }
            i14++;
            r5 = 0;
        }
        if (z) {
            M3(f, i10);
            i15 = 0;
            for (int i16 = 0; i16 < i12; i16++) {
                View view2 = this.U[i16];
                O3(view2, 1073741824, true);
                int e3 = this.A.e(view2);
                if (e3 > i15) {
                    i15 = e3;
                }
            }
        }
        for (int i17 = 0; i17 < i12; i17++) {
            View view3 = this.U[i17];
            if (this.A.e(view3) != i15) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.b;
                int i18 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i19 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int G3 = G3(bVar2.f, bVar2.g);
                if (this.y == 1) {
                    i9 = RecyclerView.o.R(G3, 1073741824, i19, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    R = View.MeasureSpec.makeMeasureSpec(i15 - i18, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - i19, 1073741824);
                    R = RecyclerView.o.R(G3, 1073741824, i18, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    i9 = makeMeasureSpec;
                }
                P3(view3, i9, R, true);
            }
        }
        bVar.a = i15;
        if (this.y == 1) {
            if (cVar.m == -1) {
                i3 = cVar.i;
                i4 = i3 - i15;
            } else {
                int i20 = cVar.i;
                i3 = i15 + i20;
                i4 = i20;
            }
            i2 = 0;
            i = 0;
        } else if (cVar.m == -1) {
            i2 = cVar.i;
            i = i2 - i15;
            i4 = 0;
            i3 = 0;
        } else {
            i = cVar.i;
            i2 = i15 + i;
            i3 = 0;
            i4 = 0;
        }
        int i21 = 0;
        while (i21 < i12) {
            View view4 = this.U[i21];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.y == 1) {
                if (U2()) {
                    i2 = this.T[this.S - bVar3.f] + o0();
                    i = i2 - this.A.f(view4);
                } else {
                    int o0 = o0() + this.T[bVar3.f];
                    i5 = o0;
                    i8 = i4;
                    i7 = i3;
                    i6 = this.A.f(view4) + o0;
                    P0(view4, i5, i8, i6, i7);
                    if (!bVar3.e() || bVar3.d()) {
                        bVar.c = true;
                    }
                    bVar.d |= view4.hasFocusable();
                    i21++;
                    i4 = i8;
                    i3 = i7;
                    i2 = i6;
                    i = i5;
                }
            } else {
                i4 = this.T[bVar3.f] + r0();
                i3 = this.A.f(view4) + i4;
            }
            i8 = i4;
            i7 = i3;
            i6 = i2;
            i5 = i;
            P0(view4, i5, i8, i6, i7);
            if (!bVar3.e()) {
            }
            bVar.c = true;
            bVar.d |= view4.hasFocusable();
            i21++;
            i4 = i8;
            i3 = i7;
            i2 = i6;
            i = i5;
        }
        Arrays.fill(this.U, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y1(Rect rect, int i, int i2) {
        int q;
        int q2;
        if (this.T == null) {
            super.Y1(rect, i, i2);
        }
        int p0 = p0() + o0();
        int m0 = m0() + r0();
        if (this.y == 1) {
            q2 = RecyclerView.o.q(i2, rect.height() + m0, k0());
            int[] iArr = this.T;
            q = RecyclerView.o.q(i, iArr[iArr.length - 1] + p0, l0());
        } else {
            q = RecyclerView.o.q(i, rect.width() + p0, l0());
            int[] iArr2 = this.T;
            q2 = RecyclerView.o.q(i2, iArr2[iArr2.length - 1] + m0, k0());
        }
        X1(q, q2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Z2(RecyclerView.w wVar, RecyclerView.c0 c0Var, LinearLayoutManager.a aVar, int i) {
        super.Z2(wVar, c0Var, aVar, i);
        T3();
        if (c0Var.d() > 0 && !c0Var.j()) {
            E3(wVar, c0Var, aVar, i);
        }
        F3();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f6, code lost:
        if (r13 == (r2 > r7)) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View a1(View view, int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int Q2;
        int i2;
        int i3;
        View view2;
        View view3;
        int i4;
        int i5;
        boolean z;
        int i6;
        int i7;
        RecyclerView.w wVar2 = wVar;
        RecyclerView.c0 c0Var2 = c0Var;
        View I = I(view);
        View view4 = null;
        if (I == null) {
            return null;
        }
        b bVar = (b) I.getLayoutParams();
        int i8 = bVar.f;
        int i9 = bVar.g + i8;
        if (super.a1(view, i, wVar, c0Var) == null) {
            return null;
        }
        if ((p2(i) == 1) != this.D) {
            i2 = Q() - 1;
            Q2 = -1;
            i3 = -1;
        } else {
            Q2 = Q();
            i2 = 0;
            i3 = 1;
        }
        boolean z2 = this.y == 1 && U2();
        int I3 = I3(wVar2, c0Var2, i2);
        int i10 = i2;
        int i11 = 0;
        int i12 = -1;
        int i13 = -1;
        int i14 = 0;
        View view5 = null;
        while (i10 != Q2) {
            int I32 = I3(wVar2, c0Var2, i10);
            View P2 = P(i10);
            if (P2 == I) {
                break;
            }
            if (!P2.hasFocusable() || I32 == I3) {
                b bVar2 = (b) P2.getLayoutParams();
                int i15 = bVar2.f;
                view2 = I;
                int i16 = bVar2.g + i15;
                if (P2.hasFocusable() && i15 == i8 && i16 == i9) {
                    return P2;
                }
                if (!(P2.hasFocusable() && view4 == null) && (P2.hasFocusable() || view5 != null)) {
                    view3 = view5;
                    int min = Math.min(i16, i9) - Math.max(i15, i8);
                    if (P2.hasFocusable()) {
                        if (min <= i11) {
                            if (min == i11) {
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i11;
                        i5 = Q2;
                        if (N0(P2, false, true)) {
                            i6 = i14;
                            if (min > i6) {
                                i7 = i13;
                                if (z) {
                                    if (P2.hasFocusable()) {
                                        i12 = bVar2.f;
                                        i13 = i7;
                                        i14 = i6;
                                        view5 = view3;
                                        view4 = P2;
                                        i11 = Math.min(i16, i9) - Math.max(i15, i8);
                                    } else {
                                        int i17 = bVar2.f;
                                        i14 = Math.min(i16, i9) - Math.max(i15, i8);
                                        i13 = i17;
                                        i11 = i4;
                                        view5 = P2;
                                    }
                                    i10 += i3;
                                    wVar2 = wVar;
                                    c0Var2 = c0Var;
                                    I = view2;
                                    Q2 = i5;
                                }
                            } else {
                                if (min == i6) {
                                    i7 = i13;
                                } else {
                                    i7 = i13;
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        i7 = i13;
                        i6 = i14;
                        z = false;
                        if (z) {
                        }
                    }
                    i4 = i11;
                    i5 = Q2;
                    i7 = i13;
                    i6 = i14;
                    z = false;
                    if (z) {
                    }
                } else {
                    view3 = view5;
                }
                i4 = i11;
                i5 = Q2;
                i7 = i13;
                i6 = i14;
                z = true;
                if (z) {
                }
            } else if (view4 != null) {
                break;
            } else {
                view2 = I;
                view3 = view5;
                i4 = i11;
                i5 = Q2;
                i7 = i13;
                i6 = i14;
            }
            i13 = i7;
            i14 = i6;
            i11 = i4;
            view5 = view3;
            i10 += i3;
            wVar2 = wVar;
            c0Var2 = c0Var;
            I = view2;
            Q2 = i5;
        }
        return view4 != null ? view4 : view5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(RecyclerView.w wVar, RecyclerView.c0 c0Var, View view, ls lsVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.f1(view, lsVar);
            return;
        }
        b bVar = (b) layoutParams;
        int I3 = I3(wVar, c0Var, bVar.b());
        if (this.y == 0) {
            lsVar.Z0(ls.c.h(bVar.h(), bVar.i(), I3, 1, false, false));
        } else {
            lsVar.Z0(ls.c.h(I3, 1, bVar.h(), bVar.i(), false, false));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(RecyclerView recyclerView, int i, int i2) {
        this.X.h();
        this.X.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void j1(RecyclerView recyclerView) {
        this.X.h();
        this.X.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.J == null && !this.R;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void k1(RecyclerView recyclerView, int i, int i2, int i3) {
        this.X.h();
        this.X.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l1(RecyclerView recyclerView, int i, int i2) {
        this.X.h();
        this.X.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void l2(RecyclerView.c0 c0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.S;
        for (int i2 = 0; i2 < this.S && cVar.c(c0Var) && i > 0; i2++) {
            int i3 = cVar.k;
            cVar2.a(i3, Math.max(0, cVar.n));
            i -= this.X.f(i3);
            cVar.k += cVar.l;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void n1(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.X.h();
        this.X.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void n3(boolean z) {
        if (!z) {
            super.n3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (c0Var.j()) {
            y3();
        }
        super.o1(wVar, c0Var);
        B3();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.R = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        if (this.Z) {
            return C3(c0Var);
        }
        return super.u(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        if (this.Z) {
            return D3(c0Var);
        }
        return super.v(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.y == 0) {
            return this.S;
        }
        if (c0Var.d() < 1) {
            return 0;
        }
        return I3(wVar, c0Var, c0Var.d() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        if (this.Z) {
            return C3(c0Var);
        }
        return super.x(c0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        if (this.Z) {
            return D3(c0Var);
        }
        return super.y(c0Var);
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {
        public static final int e = -1;
        public int f;
        public int g;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f = -1;
            this.g = 0;
        }

        public int h() {
            return this.f;
        }

        public int i() {
            return this.g;
        }

        public b(int i, int i2) {
            super(i, i2);
            this.f = -1;
            this.g = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f = -1;
            this.g = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f = -1;
            this.g = 0;
        }

        public b(RecyclerView.p pVar) {
            super(pVar);
            this.f = -1;
            this.g = 0;
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        this.R = false;
        this.S = -1;
        this.V = new SparseIntArray();
        this.W = new SparseIntArray();
        this.X = new a();
        this.Y = new Rect();
        Q3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.R = false;
        this.S = -1;
        this.V = new SparseIntArray();
        this.W = new SparseIntArray();
        this.X = new a();
        this.Y = new Rect();
        Q3(i);
    }
}
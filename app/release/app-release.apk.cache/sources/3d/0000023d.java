package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.b30;
import com.p7700g.p99005.dy;
import com.p7700g.p99005.f30;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.l30;
import com.p7700g.p99005.o30;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements b30.j, RecyclerView.b0.b {
    private static final String s = "LinearLayoutManager";
    public static final boolean t = false;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = Integer.MIN_VALUE;
    private static final float x = 0.33333334f;
    public l30 A;
    private boolean B;
    private boolean C;
    public boolean D;
    private boolean E;
    private boolean F;
    public int G;
    public int H;
    private boolean I;
    public d J;
    public final a K;
    private final b L;
    private int M;
    private int[] N;
    public int y;
    private c z;

    /* loaded from: classes.dex */
    public static class a {
        public l30 a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            e();
        }

        public void a() {
            int n;
            if (this.d) {
                n = this.a.i();
            } else {
                n = this.a.n();
            }
            this.c = n;
        }

        public void b(View view, int i) {
            if (this.d) {
                this.c = this.a.p() + this.a.d(view);
            } else {
                this.c = this.a.g(view);
            }
            this.b = i;
        }

        public void c(View view, int i) {
            int p = this.a.p();
            if (p >= 0) {
                b(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int i2 = (this.a.i() - p) - this.a.d(view);
                this.c = this.a.i() - i2;
                if (i2 > 0) {
                    int e = this.c - this.a.e(view);
                    int n = this.a.n();
                    int min = e - (Math.min(this.a.g(view) - n, 0) + n);
                    if (min < 0) {
                        this.c = Math.min(i2, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int g = this.a.g(view);
            int n2 = g - this.a.n();
            this.c = g;
            if (n2 > 0) {
                int i3 = (this.a.i() - Math.min(0, (this.a.i() - p) - this.a.d(view))) - (this.a.e(view) + g);
                if (i3 < 0) {
                    this.c -= Math.min(n2, -i3);
                }
            }
        }

        public boolean d(View view, RecyclerView.c0 c0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.e() && pVar.b() >= 0 && pVar.b() < c0Var.d();
        }

        public void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder G = wo1.G("AnchorInfo{mPosition=");
            G.append(this.b);
            G.append(", mCoordinate=");
            G.append(this.c);
            G.append(", mLayoutFromEnd=");
            G.append(this.d);
            G.append(", mValid=");
            G.append(this.e);
            G.append('}');
            return G.toString();
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;

        public void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final String a = "LLM#LayoutState";
        public static final int b = -1;
        public static final int c = 1;
        public static final int d = Integer.MIN_VALUE;
        public static final int e = -1;
        public static final int f = 1;
        public static final int g = Integer.MIN_VALUE;
        public int i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public int r;
        public boolean t;
        public boolean h = true;
        public int o = 0;
        public int p = 0;
        public boolean q = false;
        public List<RecyclerView.f0> s = null;

        private View f() {
            int size = this.s.size();
            for (int i = 0; i < size; i++) {
                View view = this.s.get(i).p;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.e() && this.k == pVar.b()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View g2 = g(view);
            if (g2 == null) {
                this.k = -1;
            } else {
                this.k = ((RecyclerView.p) g2.getLayoutParams()).b();
            }
        }

        public boolean c(RecyclerView.c0 c0Var) {
            int i = this.k;
            return i >= 0 && i < c0Var.d();
        }

        public void d() {
        }

        public View e(RecyclerView.w wVar) {
            if (this.s != null) {
                return f();
            }
            View p = wVar.p(this.k);
            this.k += this.l;
            return p;
        }

        public View g(View view) {
            int b2;
            int size = this.s.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.s.get(i2).p;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.e() && (b2 = (pVar.b() - this.k) * this.l) >= 0 && b2 < i) {
                    view2 = view3;
                    if (b2 == 0) {
                        break;
                    }
                    i = b2;
                }
            }
            return view2;
        }
    }

    @i2({i2.a.LIBRARY})
    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int s;
        public int t;
        public boolean u;

        /* loaded from: classes.dex */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public boolean c() {
            return this.s >= 0;
        }

        public void d() {
            this.s = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.s);
            parcel.writeInt(this.t);
            parcel.writeInt(this.u ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.s = parcel.readInt();
            this.t = parcel.readInt();
            this.u = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.s = dVar.s;
            this.t = dVar.t;
            this.u = dVar.u;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    private View A2() {
        return D2(Q() - 1, -1);
    }

    private View B2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return H2(wVar, c0Var, Q() - 1, -1, c0Var.d());
    }

    private View F2() {
        return this.D ? u2() : A2();
    }

    private View G2() {
        return this.D ? A2() : u2();
    }

    private View I2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.D ? v2(wVar, c0Var) : B2(wVar, c0Var);
    }

    private View J2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return this.D ? B2(wVar, c0Var) : v2(wVar, c0Var);
    }

    private int K2(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int i2;
        int i3 = this.A.i() - i;
        if (i3 > 0) {
            int i4 = -g3(-i3, wVar, c0Var);
            int i5 = i + i4;
            if (!z || (i2 = this.A.i() - i5) <= 0) {
                return i4;
            }
            this.A.t(i2);
            return i2 + i4;
        }
        return 0;
    }

    private int L2(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var, boolean z) {
        int n;
        int n2 = i - this.A.n();
        if (n2 > 0) {
            int i2 = -g3(n2, wVar, c0Var);
            int i3 = i + i2;
            if (!z || (n = i3 - this.A.n()) <= 0) {
                return i2;
            }
            this.A.t(-n);
            return i2 - n;
        }
        return 0;
    }

    private View M2() {
        return P(this.D ? 0 : Q() - 1);
    }

    private View N2() {
        return P(this.D ? Q() - 1 : 0);
    }

    private void X2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i, int i2) {
        if (!c0Var.n() || Q() == 0 || c0Var.j() || !j2()) {
            return;
        }
        List<RecyclerView.f0> l = wVar.l();
        int size = l.size();
        int s0 = s0(P(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.f0 f0Var = l.get(i5);
            if (!f0Var.w()) {
                if (((f0Var.m() < s0) != this.D ? (char) 65535 : (char) 1) == 65535) {
                    i3 += this.A.e(f0Var.p);
                } else {
                    i4 += this.A.e(f0Var.p);
                }
            }
        }
        this.z.s = l;
        if (i3 > 0) {
            u3(s0(N2()), i);
            c cVar = this.z;
            cVar.o = i3;
            cVar.j = 0;
            cVar.a();
            s2(wVar, this.z, c0Var, false);
        }
        if (i4 > 0) {
            s3(s0(M2()), i2);
            c cVar2 = this.z;
            cVar2.o = i4;
            cVar2.j = 0;
            cVar2.a();
            s2(wVar, this.z, c0Var, false);
        }
        this.z.s = null;
    }

    private void Y2() {
        for (int i = 0; i < Q(); i++) {
            View P = P(i);
            s0(P);
            this.A.g(P);
        }
    }

    private void a3(RecyclerView.w wVar, c cVar) {
        if (!cVar.h || cVar.t) {
            return;
        }
        int i = cVar.n;
        int i2 = cVar.p;
        if (cVar.m == -1) {
            c3(wVar, i, i2);
        } else {
            d3(wVar, i, i2);
        }
    }

    private void b3(RecyclerView.w wVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                G1(i, wVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            G1(i3, wVar);
        }
    }

    private void c3(RecyclerView.w wVar, int i, int i2) {
        int Q = Q();
        if (i < 0) {
            return;
        }
        int h = (this.A.h() - i) + i2;
        if (this.D) {
            for (int i3 = 0; i3 < Q; i3++) {
                View P = P(i3);
                if (this.A.g(P) < h || this.A.r(P) < h) {
                    b3(wVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = Q - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View P2 = P(i5);
            if (this.A.g(P2) < h || this.A.r(P2) < h) {
                b3(wVar, i4, i5);
                return;
            }
        }
    }

    private void d3(RecyclerView.w wVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int Q = Q();
        if (!this.D) {
            for (int i4 = 0; i4 < Q; i4++) {
                View P = P(i4);
                if (this.A.d(P) > i3 || this.A.q(P) > i3) {
                    b3(wVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = Q - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View P2 = P(i6);
            if (this.A.d(P2) > i3 || this.A.q(P2) > i3) {
                b3(wVar, i5, i6);
                return;
            }
        }
    }

    private void f3() {
        if (this.y != 1 && U2()) {
            this.D = !this.C;
        } else {
            this.D = this.C;
        }
    }

    private int m2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return o30.a(c0Var, this.A, x2(!this.F, true), w2(!this.F, true), this, this.F);
    }

    private int n2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return o30.b(c0Var, this.A, x2(!this.F, true), w2(!this.F, true), this, this.F, this.D);
    }

    private int o2(RecyclerView.c0 c0Var) {
        if (Q() == 0) {
            return 0;
        }
        r2();
        return o30.c(c0Var, this.A, x2(!this.F, true), w2(!this.F, true), this, this.F);
    }

    private boolean o3(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        View J2;
        int n;
        boolean z = false;
        if (Q() == 0) {
            return false;
        }
        View d0 = d0();
        if (d0 != null && aVar.d(d0, c0Var)) {
            aVar.c(d0, s0(d0));
            return true;
        } else if (this.B != this.E) {
            return false;
        } else {
            if (aVar.d) {
                J2 = I2(wVar, c0Var);
            } else {
                J2 = J2(wVar, c0Var);
            }
            if (J2 != null) {
                aVar.b(J2, s0(J2));
                if (!c0Var.j() && j2()) {
                    if ((this.A.g(J2) >= this.A.i() || this.A.d(J2) < this.A.n()) ? true : true) {
                        if (aVar.d) {
                            n = this.A.i();
                        } else {
                            n = this.A.n();
                        }
                        aVar.c = n;
                    }
                }
                return true;
            }
            return false;
        }
    }

    private boolean p3(RecyclerView.c0 c0Var, a aVar) {
        int i;
        int g;
        if (!c0Var.j() && (i = this.G) != -1) {
            if (i >= 0 && i < c0Var.d()) {
                aVar.b = this.G;
                d dVar = this.J;
                if (dVar != null && dVar.c()) {
                    boolean z = this.J.u;
                    aVar.d = z;
                    if (z) {
                        aVar.c = this.A.i() - this.J.t;
                    } else {
                        aVar.c = this.A.n() + this.J.t;
                    }
                    return true;
                } else if (this.H == Integer.MIN_VALUE) {
                    View J = J(this.G);
                    if (J != null) {
                        if (this.A.e(J) > this.A.o()) {
                            aVar.a();
                            return true;
                        } else if (this.A.g(J) - this.A.n() < 0) {
                            aVar.c = this.A.n();
                            aVar.d = false;
                            return true;
                        } else if (this.A.i() - this.A.d(J) < 0) {
                            aVar.c = this.A.i();
                            aVar.d = true;
                            return true;
                        } else {
                            if (aVar.d) {
                                g = this.A.p() + this.A.d(J);
                            } else {
                                g = this.A.g(J);
                            }
                            aVar.c = g;
                        }
                    } else {
                        if (Q() > 0) {
                            aVar.d = (this.G < s0(P(0))) == this.D;
                        }
                        aVar.a();
                    }
                    return true;
                } else {
                    boolean z2 = this.D;
                    aVar.d = z2;
                    if (z2) {
                        aVar.c = this.A.i() - this.H;
                    } else {
                        aVar.c = this.A.n() + this.H;
                    }
                    return true;
                }
            }
            this.G = -1;
            this.H = Integer.MIN_VALUE;
        }
        return false;
    }

    private void q3(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar) {
        if (p3(c0Var, aVar) || o3(wVar, c0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.b = this.E ? c0Var.d() - 1 : 0;
    }

    private void r3(int i, int i2, boolean z, RecyclerView.c0 c0Var) {
        int n;
        this.z.t = e3();
        this.z.m = i;
        int[] iArr = this.N;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(c0Var, iArr);
        int max = Math.max(0, this.N[0]);
        int max2 = Math.max(0, this.N[1]);
        boolean z2 = i == 1;
        c cVar = this.z;
        int i3 = z2 ? max2 : max;
        cVar.o = i3;
        if (!z2) {
            max = max2;
        }
        cVar.p = max;
        if (z2) {
            cVar.o = this.A.j() + i3;
            View M2 = M2();
            c cVar2 = this.z;
            cVar2.l = this.D ? -1 : 1;
            int s0 = s0(M2);
            c cVar3 = this.z;
            cVar2.k = s0 + cVar3.l;
            cVar3.i = this.A.d(M2);
            n = this.A.d(M2) - this.A.i();
        } else {
            View N2 = N2();
            c cVar4 = this.z;
            cVar4.o = this.A.n() + cVar4.o;
            c cVar5 = this.z;
            cVar5.l = this.D ? 1 : -1;
            int s02 = s0(N2);
            c cVar6 = this.z;
            cVar5.k = s02 + cVar6.l;
            cVar6.i = this.A.g(N2);
            n = (-this.A.g(N2)) + this.A.n();
        }
        c cVar7 = this.z;
        cVar7.j = i2;
        if (z) {
            cVar7.j = i2 - n;
        }
        cVar7.n = n;
    }

    private void s3(int i, int i2) {
        this.z.j = this.A.i() - i2;
        c cVar = this.z;
        cVar.l = this.D ? -1 : 1;
        cVar.k = i;
        cVar.m = 1;
        cVar.i = i2;
        cVar.n = Integer.MIN_VALUE;
    }

    private void t3(a aVar) {
        s3(aVar.b, aVar.c);
    }

    private View u2() {
        return D2(0, Q());
    }

    private void u3(int i, int i2) {
        this.z.j = i2 - this.A.n();
        c cVar = this.z;
        cVar.k = i;
        cVar.l = this.D ? 1 : -1;
        cVar.m = -1;
        cVar.i = i2;
        cVar.n = Integer.MIN_VALUE;
    }

    private View v2(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        return H2(wVar, c0Var, 0, Q(), c0Var.d());
    }

    private void v3(a aVar) {
        u3(aVar.b, aVar.c);
    }

    public int C2() {
        View E2 = E2(Q() - 1, -1, false, true);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public View D2(int i, int i2) {
        int i3;
        int i4;
        r2();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return P(i);
        }
        if (this.A.g(P(i)) < this.A.n()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = dy.p;
        }
        if (this.y == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    public View E2(int i, int i2, boolean z, boolean z2) {
        r2();
        int i3 = z ? 24579 : 320;
        int i4 = z2 ? 320 : 0;
        if (this.y == 0) {
            return this.e.a(i, i2, i3, i4);
        }
        return this.f.a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean F0() {
        return true;
    }

    public View H2(RecyclerView.w wVar, RecyclerView.c0 c0Var, int i, int i2, int i3) {
        r2();
        int n = this.A.n();
        int i4 = this.A.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View P = P(i);
            int s0 = s0(P);
            if (s0 >= 0 && s0 < i3) {
                if (((RecyclerView.p) P.getLayoutParams()).e()) {
                    if (view2 == null) {
                        view2 = P;
                    }
                } else if (this.A.g(P) < i4 && this.A.d(P) >= n) {
                    return P;
                } else {
                    if (view == null) {
                        view = P;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J(int i) {
        int Q = Q();
        if (Q == 0) {
            return null;
        }
        int s0 = i - s0(P(0));
        if (s0 >= 0 && s0 < Q) {
            View P = P(s0);
            if (s0(P) == i) {
                return P;
            }
        }
        return super.J(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K() {
        return new RecyclerView.p(-2, -2);
    }

    @Deprecated
    public int O2(RecyclerView.c0 c0Var) {
        if (c0Var.h()) {
            return this.A.o();
        }
        return 0;
    }

    public int P2() {
        return this.M;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int Q1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.y == 1) {
            return 0;
        }
        return g3(i, wVar, c0Var);
    }

    public int Q2() {
        return this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R1(int i) {
        this.G = i;
        this.H = Integer.MIN_VALUE;
        d dVar = this.J;
        if (dVar != null) {
            dVar.d();
        }
        N1();
    }

    public boolean R2() {
        return this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S1(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (this.y == 0) {
            return 0;
        }
        return g3(i, wVar, c0Var);
    }

    public boolean S2() {
        return this.C;
    }

    public boolean T2() {
        return this.E;
    }

    public boolean U2() {
        return i0() == 1;
    }

    public boolean V2() {
        return this.F;
    }

    public void W2(RecyclerView.w wVar, RecyclerView.c0 c0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int f;
        View e = cVar.e(wVar);
        if (e == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) e.getLayoutParams();
        if (cVar.s == null) {
            if (this.D == (cVar.m == -1)) {
                e(e);
            } else {
                f(e, 0);
            }
        } else {
            if (this.D == (cVar.m == -1)) {
                c(e);
            } else {
                d(e, 0);
            }
        }
        R0(e, 0, 0);
        bVar.a = this.A.e(e);
        if (this.y == 1) {
            if (U2()) {
                f = z0() - p0();
                i4 = f - this.A.f(e);
            } else {
                i4 = o0();
                f = this.A.f(e) + i4;
            }
            if (cVar.m == -1) {
                int i5 = cVar.i;
                i3 = i5;
                i2 = f;
                i = i5 - bVar.a;
            } else {
                int i6 = cVar.i;
                i = i6;
                i2 = f;
                i3 = bVar.a + i6;
            }
        } else {
            int r0 = r0();
            int f2 = this.A.f(e) + r0;
            if (cVar.m == -1) {
                int i7 = cVar.i;
                i2 = i7;
                i = r0;
                i3 = f2;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.i;
                i = r0;
                i2 = bVar.a + i8;
                i3 = f2;
                i4 = i8;
            }
        }
        P0(e, i4, i, i2, i3);
        if (pVar.e() || pVar.d()) {
            bVar.c = true;
        }
        bVar.d = e.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        if (this.I) {
            D1(wVar);
            wVar.d();
        }
    }

    public void Z2(RecyclerView.w wVar, RecyclerView.c0 c0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.b0.b
    public PointF a(int i) {
        if (Q() == 0) {
            return null;
        }
        int i2 = (i < s0(P(0))) != this.D ? -1 : 1;
        if (this.y == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a1(View view, int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int p2;
        View F2;
        View M2;
        f3();
        if (Q() == 0 || (p2 = p2(i)) == Integer.MIN_VALUE) {
            return null;
        }
        r2();
        r3(p2, (int) (this.A.o() * x), false, c0Var);
        c cVar = this.z;
        cVar.n = Integer.MIN_VALUE;
        cVar.h = false;
        s2(wVar, cVar, c0Var, true);
        if (p2 == -1) {
            F2 = G2();
        } else {
            F2 = F2();
        }
        if (p2 == -1) {
            M2 = N2();
        } else {
            M2 = M2();
        }
        if (M2.hasFocusable()) {
            if (F2 == null) {
                return null;
            }
            return M2;
        }
        return F2;
    }

    @Override // com.p7700g.p99005.b30.j
    public void b(@x1 View view, @x1 View view2, int i, int i2) {
        i("Cannot drop a view during a scroll or layout calculation");
        r2();
        f3();
        int s0 = s0(view);
        int s02 = s0(view2);
        char c2 = s0 < s02 ? (char) 1 : (char) 65535;
        if (this.D) {
            if (c2 == 1) {
                h3(s02, this.A.i() - (this.A.e(view) + this.A.g(view2)));
            } else {
                h3(s02, this.A.i() - this.A.d(view2));
            }
        } else if (c2 == 65535) {
            h3(s02, this.A.g(view2));
        } else {
            h3(s02, this.A.d(view2) - this.A.e(view));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            accessibilityEvent.setFromIndex(y2());
            accessibilityEvent.setToIndex(C2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean d2() {
        return (f0() == 1073741824 || A0() == 1073741824 || !B0()) ? false : true;
    }

    public boolean e3() {
        return this.A.l() == 0 && this.A.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f2(RecyclerView recyclerView, RecyclerView.c0 c0Var, int i) {
        f30 f30Var = new f30(recyclerView.getContext());
        f30Var.q(i);
        g2(f30Var);
    }

    public int g3(int i, RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        if (Q() == 0 || i == 0) {
            return 0;
        }
        r2();
        this.z.h = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        r3(i2, abs, true, c0Var);
        c cVar = this.z;
        int s2 = s2(wVar, cVar, c0Var, false) + cVar.n;
        if (s2 < 0) {
            return 0;
        }
        if (abs > s2) {
            i = i2 * s2;
        }
        this.A.t(-i);
        this.z.r = i;
        return i;
    }

    public void h3(int i, int i2) {
        this.G = i;
        this.H = i2;
        d dVar = this.J;
        if (dVar != null) {
            dVar.d();
        }
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(String str) {
        if (this.J == null) {
            super.i(str);
        }
    }

    public void i3(int i) {
        this.M = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean j2() {
        return this.J == null && this.B == this.E;
    }

    public void j3(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(wo1.l("invalid orientation:", i));
        }
        i(null);
        if (i != this.y || this.A == null) {
            l30 b2 = l30.b(this, i);
            this.A = b2;
            this.K.a = b2;
            this.y = i;
            N1();
        }
    }

    public void k2(@x1 RecyclerView.c0 c0Var, @x1 int[] iArr) {
        int i;
        int O2 = O2(c0Var);
        if (this.z.m == -1) {
            i = 0;
        } else {
            i = O2;
            O2 = 0;
        }
        iArr[0] = O2;
        iArr[1] = i;
    }

    public void k3(boolean z) {
        this.I = z;
    }

    public void l2(RecyclerView.c0 c0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.k;
        if (i < 0 || i >= c0Var.d()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.n));
    }

    public void l3(boolean z) {
        i(null);
        if (z == this.C) {
            return;
        }
        this.C = z;
        N1();
    }

    public void m3(boolean z) {
        this.F = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n() {
        return this.y == 0;
    }

    public void n3(boolean z) {
        i(null);
        if (this.E == z) {
            return;
        }
        this.E = z;
        N1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean o() {
        return this.y == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o1(RecyclerView.w wVar, RecyclerView.c0 c0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int K2;
        int i5;
        View J;
        int g;
        int i6;
        int i7 = -1;
        if ((this.J != null || this.G != -1) && c0Var.d() == 0) {
            D1(wVar);
            return;
        }
        d dVar = this.J;
        if (dVar != null && dVar.c()) {
            this.G = this.J.s;
        }
        r2();
        this.z.h = false;
        f3();
        View d0 = d0();
        a aVar = this.K;
        if (aVar.e && this.G == -1 && this.J == null) {
            if (d0 != null && (this.A.g(d0) >= this.A.i() || this.A.d(d0) <= this.A.n())) {
                this.K.c(d0, s0(d0));
            }
        } else {
            aVar.e();
            a aVar2 = this.K;
            aVar2.d = this.D ^ this.E;
            q3(wVar, c0Var, aVar2);
            this.K.e = true;
        }
        c cVar = this.z;
        cVar.m = cVar.r >= 0 ? 1 : -1;
        int[] iArr = this.N;
        iArr[0] = 0;
        iArr[1] = 0;
        k2(c0Var, iArr);
        int n = this.A.n() + Math.max(0, this.N[0]);
        int j = this.A.j() + Math.max(0, this.N[1]);
        if (c0Var.j() && (i5 = this.G) != -1 && this.H != Integer.MIN_VALUE && (J = J(i5)) != null) {
            if (this.D) {
                i6 = this.A.i() - this.A.d(J);
                g = this.H;
            } else {
                g = this.A.g(J) - this.A.n();
                i6 = this.H;
            }
            int i8 = i6 - g;
            if (i8 > 0) {
                n += i8;
            } else {
                j -= i8;
            }
        }
        a aVar3 = this.K;
        if (!aVar3.d ? !this.D : this.D) {
            i7 = 1;
        }
        Z2(wVar, c0Var, aVar3, i7);
        z(wVar);
        this.z.t = e3();
        this.z.q = c0Var.j();
        this.z.p = 0;
        a aVar4 = this.K;
        if (aVar4.d) {
            v3(aVar4);
            c cVar2 = this.z;
            cVar2.o = n;
            s2(wVar, cVar2, c0Var, false);
            c cVar3 = this.z;
            i2 = cVar3.i;
            int i9 = cVar3.k;
            int i10 = cVar3.j;
            if (i10 > 0) {
                j += i10;
            }
            t3(this.K);
            c cVar4 = this.z;
            cVar4.o = j;
            cVar4.k += cVar4.l;
            s2(wVar, cVar4, c0Var, false);
            c cVar5 = this.z;
            i = cVar5.i;
            int i11 = cVar5.j;
            if (i11 > 0) {
                u3(i9, i2);
                c cVar6 = this.z;
                cVar6.o = i11;
                s2(wVar, cVar6, c0Var, false);
                i2 = this.z.i;
            }
        } else {
            t3(aVar4);
            c cVar7 = this.z;
            cVar7.o = j;
            s2(wVar, cVar7, c0Var, false);
            c cVar8 = this.z;
            i = cVar8.i;
            int i12 = cVar8.k;
            int i13 = cVar8.j;
            if (i13 > 0) {
                n += i13;
            }
            v3(this.K);
            c cVar9 = this.z;
            cVar9.o = n;
            cVar9.k += cVar9.l;
            s2(wVar, cVar9, c0Var, false);
            c cVar10 = this.z;
            int i14 = cVar10.i;
            int i15 = cVar10.j;
            if (i15 > 0) {
                s3(i12, i);
                c cVar11 = this.z;
                cVar11.o = i15;
                s2(wVar, cVar11, c0Var, false);
                i = this.z.i;
            }
            i2 = i14;
        }
        if (Q() > 0) {
            if (this.D ^ this.E) {
                int K22 = K2(i, wVar, c0Var, true);
                i3 = i2 + K22;
                i4 = i + K22;
                K2 = L2(i3, wVar, c0Var, false);
            } else {
                int L2 = L2(i2, wVar, c0Var, true);
                i3 = i2 + L2;
                i4 = i + L2;
                K2 = K2(i4, wVar, c0Var, false);
            }
            i2 = i3 + K2;
            i = i4 + K2;
        }
        X2(wVar, c0Var, i2, i);
        if (!c0Var.j()) {
            this.A.u();
        } else {
            this.K.e();
        }
        this.B = this.E;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p1(RecyclerView.c0 c0Var) {
        super.p1(c0Var);
        this.J = null;
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        this.K.e();
    }

    public int p2(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.y == 1) ? 1 : Integer.MIN_VALUE : this.y == 0 ? 1 : Integer.MIN_VALUE : this.y == 1 ? -1 : Integer.MIN_VALUE : this.y == 0 ? -1 : Integer.MIN_VALUE : (this.y != 1 && U2()) ? -1 : 1 : (this.y != 1 && U2()) ? 1 : -1;
    }

    public c q2() {
        return new c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void r(int i, int i2, RecyclerView.c0 c0Var, RecyclerView.o.c cVar) {
        if (this.y != 0) {
            i = i2;
        }
        if (Q() == 0 || i == 0) {
            return;
        }
        r2();
        r3(i > 0 ? 1 : -1, Math.abs(i), true, c0Var);
        l2(c0Var, this.z, cVar);
    }

    public void r2() {
        if (this.z == null) {
            this.z = q2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void s(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.J;
        if (dVar != null && dVar.c()) {
            d dVar2 = this.J;
            z = dVar2.u;
            i2 = dVar2.s;
        } else {
            f3();
            z = this.D;
            i2 = this.G;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.M && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int s2(RecyclerView.w wVar, c cVar, RecyclerView.c0 c0Var, boolean z) {
        int i = cVar.j;
        int i2 = cVar.n;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.n = i2 + i;
            }
            a3(wVar, cVar);
        }
        int i3 = cVar.j + cVar.o;
        b bVar = this.L;
        while (true) {
            if ((!cVar.t && i3 <= 0) || !cVar.c(c0Var)) {
                break;
            }
            bVar.a();
            W2(wVar, c0Var, cVar, bVar);
            if (!bVar.b) {
                cVar.i = (bVar.a * cVar.m) + cVar.i;
                if (!bVar.c || cVar.s != null || !c0Var.j()) {
                    int i4 = cVar.j;
                    int i5 = bVar.a;
                    cVar.j = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.n;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.a;
                    cVar.n = i7;
                    int i8 = cVar.j;
                    if (i8 < 0) {
                        cVar.n = i7 + i8;
                    }
                    a3(wVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.c0 c0Var) {
        return m2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.J = (d) parcelable;
            N1();
        }
    }

    public int t2() {
        View E2 = E2(0, Q(), true, false);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.c0 c0Var) {
        return n2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable u1() {
        if (this.J != null) {
            return new d(this.J);
        }
        d dVar = new d();
        if (Q() > 0) {
            r2();
            boolean z = this.B ^ this.D;
            dVar.u = z;
            if (z) {
                View M2 = M2();
                dVar.t = this.A.i() - this.A.d(M2);
                dVar.s = s0(M2);
            } else {
                View N2 = N2();
                dVar.s = s0(N2);
                dVar.t = this.A.g(N2) - this.A.n();
            }
        } else {
            dVar.d();
        }
        return dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.c0 c0Var) {
        return o2(c0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.c0 c0Var) {
        return m2(c0Var);
    }

    public View w2(boolean z, boolean z2) {
        if (this.D) {
            return E2(0, Q(), z, z2);
        }
        return E2(Q() - 1, -1, z, z2);
    }

    public void w3() {
        Q();
        if (Q() < 1) {
            return;
        }
        int s0 = s0(P(0));
        int g = this.A.g(P(0));
        if (this.D) {
            for (int i = 1; i < Q(); i++) {
                View P = P(i);
                int s02 = s0(P);
                int g2 = this.A.g(P);
                if (s02 < s0) {
                    Y2();
                    StringBuilder G = wo1.G("detected invalid position. loc invalid? ");
                    G.append(g2 < g);
                    throw new RuntimeException(G.toString());
                } else if (g2 > g) {
                    Y2();
                    throw new RuntimeException("detected invalid location");
                }
            }
            return;
        }
        for (int i2 = 1; i2 < Q(); i2++) {
            View P2 = P(i2);
            int s03 = s0(P2);
            int g3 = this.A.g(P2);
            if (s03 < s0) {
                Y2();
                StringBuilder G2 = wo1.G("detected invalid position. loc invalid? ");
                G2.append(g3 < g);
                throw new RuntimeException(G2.toString());
            } else if (g3 < g) {
                Y2();
                throw new RuntimeException("detected invalid location");
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.c0 c0Var) {
        return n2(c0Var);
    }

    public View x2(boolean z, boolean z2) {
        if (this.D) {
            return E2(Q() - 1, -1, z, z2);
        }
        return E2(0, Q(), z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.c0 c0Var) {
        return o2(c0Var);
    }

    public int y2() {
        View E2 = E2(0, Q(), false, true);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public int z2() {
        View E2 = E2(Q() - 1, -1, true, false);
        if (E2 == null) {
            return -1;
        }
        return s0(E2);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.y = 1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        this.J = null;
        this.K = new a();
        this.L = new b();
        this.M = 2;
        this.N = new int[2];
        j3(i);
        l3(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.y = 1;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = -1;
        this.H = Integer.MIN_VALUE;
        this.J = null;
        this.K = new a();
        this.L = new b();
        this.M = 2;
        this.N = new int[2];
        RecyclerView.o.d t0 = RecyclerView.o.t0(context, attributeSet, i, i2);
        j3(t0.a);
        l3(t0.c);
        n3(t0.d);
    }
}
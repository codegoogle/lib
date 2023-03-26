package com.p7700g.p99005;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.s80;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet.java */
/* loaded from: classes.dex */
public class x80 extends s80 {
    private static final int I0 = 1;
    private static final int J0 = 2;
    private static final int K0 = 4;
    private static final int L0 = 8;
    public static final int M0 = 0;
    public static final int N0 = 1;
    private ArrayList<s80> O0;
    private boolean P0;
    public int Q0;
    public boolean R0;
    private int S0;

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public class a extends u80 {
        public final /* synthetic */ s80 s;

        public a(s80 s80Var) {
            this.s = s80Var;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            this.s.E0();
            s80Var.v0(this);
        }
    }

    /* compiled from: TransitionSet.java */
    /* loaded from: classes.dex */
    public static class b extends u80 {
        public x80 s;

        public b(x80 x80Var) {
            this.s = x80Var;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
            x80 x80Var = this.s;
            if (x80Var.R0) {
                return;
            }
            x80Var.O0();
            this.s.R0 = true;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            x80 x80Var = this.s;
            int i = x80Var.Q0 - 1;
            x80Var.Q0 = i;
            if (i == 0) {
                x80Var.R0 = false;
                x80Var.C();
            }
            s80Var.v0(this);
        }
    }

    public x80() {
        this.O0 = new ArrayList<>();
        this.P0 = true;
        this.R0 = false;
        this.S0 = 0;
    }

    private void W0(@x1 s80 s80Var) {
        this.O0.add(s80Var);
        s80Var.Y = this;
    }

    private void o1() {
        b bVar = new b(this);
        Iterator<s80> it = this.O0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.Q0 = this.O0.size();
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void B(ViewGroup viewGroup, a90 a90Var, a90 a90Var2, ArrayList<z80> arrayList, ArrayList<z80> arrayList2) {
        long c0 = c0();
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            s80 s80Var = this.O0.get(i);
            if (c0 > 0 && (this.P0 || i == 0)) {
                long c02 = s80Var.c0();
                if (c02 > 0) {
                    s80Var.N0(c02 + c0);
                } else {
                    s80Var.N0(c0);
                }
            }
            s80Var.B(viewGroup, a90Var, a90Var2, arrayList, arrayList2);
        }
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void C0(View view) {
        super.C0(view);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).C0(view);
        }
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void E0() {
        if (this.O0.isEmpty()) {
            O0();
            C();
            return;
        }
        o1();
        if (!this.P0) {
            for (int i = 1; i < this.O0.size(); i++) {
                this.O0.get(i - 1).a(new a(this.O0.get(i)));
            }
            s80 s80Var = this.O0.get(0);
            if (s80Var != null) {
                s80Var.E0();
                return;
            }
            return;
        }
        Iterator<s80> it = this.O0.iterator();
        while (it.hasNext()) {
            it.next().E0();
        }
    }

    @Override // com.p7700g.p99005.s80
    public void F0(boolean z) {
        super.F0(z);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).F0(z);
        }
    }

    @Override // com.p7700g.p99005.s80
    public void H0(s80.f fVar) {
        super.H0(fVar);
        this.S0 |= 8;
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).H0(fVar);
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    public s80 J(int i, boolean z) {
        for (int i2 = 0; i2 < this.O0.size(); i2++) {
            this.O0.get(i2).J(i, z);
        }
        return super.J(i, z);
    }

    @Override // com.p7700g.p99005.s80
    public void K0(i80 i80Var) {
        super.K0(i80Var);
        this.S0 |= 4;
        if (this.O0 != null) {
            for (int i = 0; i < this.O0.size(); i++) {
                this.O0.get(i).K0(i80Var);
            }
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    public s80 L(@x1 View view, boolean z) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).L(view, z);
        }
        return super.L(view, z);
    }

    @Override // com.p7700g.p99005.s80
    public void L0(w80 w80Var) {
        super.L0(w80Var);
        this.S0 |= 2;
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).L0(w80Var);
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    public s80 M(@x1 Class<?> cls, boolean z) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).M(cls, z);
        }
        return super.M(cls, z);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    public s80 N(@x1 String str, boolean z) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).N(str, z);
        }
        return super.N(str, z);
    }

    @Override // com.p7700g.p99005.s80
    public String P0(String str) {
        String P0 = super.P0(str);
        for (int i = 0; i < this.O0.size(); i++) {
            StringBuilder L = wo1.L(P0, "\n");
            L.append(this.O0.get(i).P0(str + g54.A));
            P0 = L.toString();
        }
        return P0;
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void Q(ViewGroup viewGroup) {
        super.Q(viewGroup);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).Q(viewGroup);
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: Q0 */
    public x80 a(@x1 s80.h hVar) {
        return (x80) super.a(hVar);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: R0 */
    public x80 b(@m1 int i) {
        for (int i2 = 0; i2 < this.O0.size(); i2++) {
            this.O0.get(i2).b(i);
        }
        return (x80) super.b(i);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: S0 */
    public x80 c(@x1 View view) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).c(view);
        }
        return (x80) super.c(view);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: T0 */
    public x80 d(@x1 Class<?> cls) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).d(cls);
        }
        return (x80) super.d(cls);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: U0 */
    public x80 e(@x1 String str) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).e(str);
        }
        return (x80) super.e(str);
    }

    @x1
    public x80 V0(@x1 s80 s80Var) {
        W0(s80Var);
        long j = this.J;
        if (j >= 0) {
            s80Var.G0(j);
        }
        if ((this.S0 & 1) != 0) {
            s80Var.I0(U());
        }
        if ((this.S0 & 2) != 0) {
            s80Var.L0(a0());
        }
        if ((this.S0 & 4) != 0) {
            s80Var.K0(Z());
        }
        if ((this.S0 & 8) != 0) {
            s80Var.H0(T());
        }
        return this;
    }

    public int Y0() {
        return !this.P0 ? 1 : 0;
    }

    @z1
    public s80 Z0(int i) {
        if (i < 0 || i >= this.O0.size()) {
            return null;
        }
        return this.O0.get(i);
    }

    public int a1() {
        return this.O0.size();
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: b1 */
    public x80 v0(@x1 s80.h hVar) {
        return (x80) super.v0(hVar);
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void cancel() {
        super.cancel();
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).cancel();
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: e1 */
    public x80 y0(@m1 int i) {
        for (int i2 = 0; i2 < this.O0.size(); i2++) {
            this.O0.get(i2).y0(i);
        }
        return (x80) super.y0(i);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: f1 */
    public x80 z0(@x1 View view) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).z0(view);
        }
        return (x80) super.z0(view);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: g1 */
    public x80 A0(@x1 Class<?> cls) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).A0(cls);
        }
        return (x80) super.A0(cls);
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: h1 */
    public x80 B0(@x1 String str) {
        for (int i = 0; i < this.O0.size(); i++) {
            this.O0.get(i).B0(str);
        }
        return (x80) super.B0(str);
    }

    @x1
    public x80 i1(@x1 s80 s80Var) {
        this.O0.remove(s80Var);
        s80Var.Y = null;
        return this;
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: j1 */
    public x80 G0(long j) {
        ArrayList<s80> arrayList;
        super.G0(j);
        if (this.J >= 0 && (arrayList = this.O0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.O0.get(i).G0(j);
            }
        }
        return this;
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: k1 */
    public x80 I0(@z1 TimeInterpolator timeInterpolator) {
        this.S0 |= 1;
        ArrayList<s80> arrayList = this.O0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.O0.get(i).I0(timeInterpolator);
            }
        }
        return (x80) super.I0(timeInterpolator);
    }

    @x1
    public x80 l1(int i) {
        if (i == 0) {
            this.P0 = true;
        } else if (i == 1) {
            this.P0 = false;
        } else {
            throw new AndroidRuntimeException(wo1.l("Invalid parameter for TransitionSet ordering: ", i));
        }
        return this;
    }

    @Override // com.p7700g.p99005.s80
    /* renamed from: m1 */
    public x80 M0(ViewGroup viewGroup) {
        super.M0(viewGroup);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).M0(viewGroup);
        }
        return this;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        if (l0(z80Var.b)) {
            Iterator<s80> it = this.O0.iterator();
            while (it.hasNext()) {
                s80 next = it.next();
                if (next.l0(z80Var.b)) {
                    next.n(z80Var);
                    z80Var.c.add(next);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.s80
    @x1
    /* renamed from: n1 */
    public x80 N0(long j) {
        return (x80) super.N0(j);
    }

    @Override // com.p7700g.p99005.s80
    public void p(z80 z80Var) {
        super.p(z80Var);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).p(z80Var);
        }
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        if (l0(z80Var.b)) {
            Iterator<s80> it = this.O0.iterator();
            while (it.hasNext()) {
                s80 next = it.next();
                if (next.l0(z80Var.b)) {
                    next.t(z80Var);
                    z80Var.c.add(next);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.s80
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public void t0(View view) {
        super.t0(view);
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            this.O0.get(i).t0(view);
        }
    }

    @Override // com.p7700g.p99005.s80
    /* renamed from: y */
    public s80 clone() {
        x80 x80Var = (x80) super.clone();
        x80Var.O0 = new ArrayList<>();
        int size = this.O0.size();
        for (int i = 0; i < size; i++) {
            x80Var.W0(this.O0.get(i).clone());
        }
        return x80Var;
    }

    @SuppressLint({"RestrictedApi"})
    public x80(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O0 = new ArrayList<>();
        this.P0 = true;
        this.R0 = false;
        this.S0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.i);
        l1(ri.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}
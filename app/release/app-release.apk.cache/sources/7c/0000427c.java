package com.p7700g.p99005;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;
import com.p7700g.p99005.ga2;

/* compiled from: TimePickerClockPresenter.java */
/* loaded from: classes3.dex */
public class fj2 implements ClockHandView.d, TimePickerView.g, TimePickerView.f, ClockHandView.c, hj2 {
    private static final String[] s = {"12", "1", "2", "3", "4", "5", "6", "7", "8", com.anythink.expressad.videocommon.e.b.j, "10", "11"};
    private static final String[] t = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    private static final String[] u = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    private static final int v = 30;
    private static final int w = 6;
    private float A;
    private boolean B = false;
    private final TimePickerView x;
    private final ej2 y;
    private float z;

    /* compiled from: TimePickerClockPresenter.java */
    /* loaded from: classes3.dex */
    public class a extends zi2 {
        public a(Context context, int i) {
            super(context, i);
        }

        @Override // com.p7700g.p99005.zi2, com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(view.getResources().getString(ga2.m.j0, String.valueOf(fj2.this.y.e())));
        }
    }

    /* compiled from: TimePickerClockPresenter.java */
    /* loaded from: classes3.dex */
    public class b extends zi2 {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // com.p7700g.p99005.zi2, com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(view.getResources().getString(ga2.m.l0, String.valueOf(fj2.this.y.y)));
        }
    }

    public fj2(TimePickerView timePickerView, ej2 ej2Var) {
        this.x = timePickerView;
        this.y = ej2Var;
        initialize();
    }

    private int h() {
        return this.y.w == 1 ? 15 : 30;
    }

    private String[] i() {
        return this.y.w == 1 ? t : s;
    }

    private void j(int i, int i2) {
        ej2 ej2Var = this.y;
        if (ej2Var.y == i2 && ej2Var.x == i) {
            return;
        }
        this.x.performHapticFeedback(4);
    }

    private void l() {
        TimePickerView timePickerView = this.x;
        ej2 ej2Var = this.y;
        timePickerView.b(ej2Var.A, ej2Var.e(), this.y.y);
    }

    private void m() {
        n(s, ej2.t);
        n(t, ej2.t);
        n(u, ej2.s);
    }

    private void n(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = ej2.d(this.x.getResources(), strArr[i], str);
        }
    }

    @Override // com.p7700g.p99005.hj2
    public void a() {
        this.A = this.y.e() * h();
        ej2 ej2Var = this.y;
        this.z = ej2Var.y * 6;
        k(ej2Var.z, false);
        l();
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void b(float f, boolean z) {
        this.B = true;
        ej2 ej2Var = this.y;
        int i = ej2Var.y;
        int i2 = ej2Var.x;
        if (ej2Var.z == 10) {
            this.x.H(this.A, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) gh.o(this.x.getContext(), AccessibilityManager.class);
            if (!(accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled())) {
                k(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.y.m(((round + 15) / 30) * 5);
                this.z = this.y.y * 6;
            }
            this.x.H(this.z, z);
        }
        this.B = false;
        l();
        j(i2, i);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.f
    public void c(int i) {
        this.y.n(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void d(float f, boolean z) {
        if (this.B) {
            return;
        }
        ej2 ej2Var = this.y;
        int i = ej2Var.x;
        int i2 = ej2Var.y;
        int round = Math.round(f);
        ej2 ej2Var2 = this.y;
        if (ej2Var2.z == 12) {
            ej2Var2.m((round + 3) / 6);
            this.z = (float) Math.floor(this.y.y * 6);
        } else {
            this.y.k((round + (h() / 2)) / h());
            this.A = this.y.e() * h();
        }
        if (z) {
            return;
        }
        l();
        j(i, i2);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.g
    public void e(int i) {
        k(i, true);
    }

    @Override // com.p7700g.p99005.hj2
    public void f() {
        this.x.setVisibility(8);
    }

    @Override // com.p7700g.p99005.hj2
    public void initialize() {
        if (this.y.w == 0) {
            this.x.Q();
        }
        this.x.F(this);
        this.x.N(this);
        this.x.M(this);
        this.x.K(this);
        m();
        a();
    }

    public void k(int i, boolean z) {
        boolean z2 = i == 12;
        this.x.G(z2);
        this.y.z = i;
        this.x.c(z2 ? u : i(), z2 ? ga2.m.l0 : ga2.m.j0);
        this.x.H(z2 ? this.z : this.A, z);
        this.x.a(i);
        this.x.J(new a(this.x.getContext(), ga2.m.i0));
        this.x.I(new b(this.x.getContext(), ga2.m.k0));
    }

    @Override // com.p7700g.p99005.hj2
    public void show() {
        this.x.setVisibility(0);
    }
}
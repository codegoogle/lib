package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class yc2<S> extends hd2<S> {
    private static final String t = "THEME_RES_ID_KEY";
    private static final String u = "GRID_SELECTOR_KEY";
    private static final String v = "CALENDAR_CONSTRAINTS_KEY";
    private static final String w = "CURRENT_MONTH_KEY";
    private static final int x = 3;
    @m2
    private int C;
    @z1
    private tc2<S> D;
    @z1
    private oc2 E;
    @z1
    private dd2 F;
    private k G;
    private qc2 H;
    private RecyclerView I;
    private RecyclerView J;
    private View K;
    private View L;
    @r2
    public static final Object y = "MONTHS_VIEW_GROUP_TAG";
    @r2
    public static final Object z = "NAVIGATION_PREV_TAG";
    @r2
    public static final Object A = "NAVIGATION_NEXT_TAG";
    @r2
    public static final Object B = "SELECTOR_TOGGLE_TAG";

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ int s;

        public a(int i) {
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            yc2.this.J.J1(this.s);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class b extends fq {
        public b() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.Y0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class c extends kd2 {
        public final /* synthetic */ int P;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.P = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void k2(@x1 RecyclerView.c0 c0Var, @x1 int[] iArr) {
            if (this.P == 0) {
                iArr[0] = yc2.this.J.getWidth();
                iArr[1] = yc2.this.J.getWidth();
                return;
            }
            iArr[0] = yc2.this.J.getHeight();
            iArr[1] = yc2.this.J.getHeight();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class d implements l {
        public d() {
        }

        @Override // com.p7700g.p99005.yc2.l
        public void a(long j) {
            if (yc2.this.E.j().b(j)) {
                yc2.this.D.X2(j);
                Iterator<gd2<S>> it = yc2.this.s.iterator();
                while (it.hasNext()) {
                    it.next().b((S) yc2.this.D.Z());
                }
                yc2.this.J.getAdapter().j();
                if (yc2.this.I != null) {
                    yc2.this.I.getAdapter().j();
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class e extends RecyclerView.n {
        private final Calendar a = md2.v();
        private final Calendar b = md2.v();

        public e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(@x1 Canvas canvas, @x1 RecyclerView recyclerView, @x1 RecyclerView.c0 c0Var) {
            int width;
            if ((recyclerView.getAdapter() instanceof nd2) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                nd2 nd2Var = (nd2) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (fp<Long, Long> fpVar : yc2.this.D.f()) {
                    Long l = fpVar.a;
                    if (l != null && fpVar.b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.b.setTimeInMillis(fpVar.b.longValue());
                        int H = nd2Var.H(this.a.get(1));
                        int H2 = nd2Var.H(this.b.get(1));
                        View J = gridLayoutManager.J(H);
                        View J2 = gridLayoutManager.J(H2);
                        int H3 = H / gridLayoutManager.H3();
                        int H32 = H2 / gridLayoutManager.H3();
                        for (int i = H3; i <= H32; i++) {
                            View J3 = gridLayoutManager.J(gridLayoutManager.H3() * i);
                            if (J3 != null) {
                                int e = yc2.this.H.d.e() + J3.getTop();
                                int bottom = J3.getBottom() - yc2.this.H.d.b();
                                int width2 = i == H3 ? (J.getWidth() / 2) + J.getLeft() : 0;
                                if (i == H32) {
                                    width = (J2.getWidth() / 2) + J2.getLeft();
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(width2, e, width, bottom, yc2.this.H.h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class f extends fq {
        public f() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            String string;
            super.g(view, lsVar);
            if (yc2.this.L.getVisibility() == 0) {
                string = yc2.this.getString(ga2.m.i1);
            } else {
                string = yc2.this.getString(ga2.m.g1);
            }
            lsVar.l1(string);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class g extends RecyclerView.t {
        public final /* synthetic */ fd2 a;
        public final /* synthetic */ MaterialButton b;

        public g(fd2 fd2Var, MaterialButton materialButton) {
            this.a = fd2Var;
            this.b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void a(@x1 RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void b(@x1 RecyclerView recyclerView, int i, int i2) {
            int C2;
            if (i < 0) {
                C2 = yc2.this.v().y2();
            } else {
                C2 = yc2.this.v().C2();
            }
            yc2.this.F = this.a.G(C2);
            this.b.setText(this.a.H(C2));
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            yc2.this.A();
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class i implements View.OnClickListener {
        public final /* synthetic */ fd2 s;

        public i(fd2 fd2Var) {
            this.s = fd2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int y2 = yc2.this.v().y2() + 1;
            if (y2 < yc2.this.J.getAdapter().e()) {
                yc2.this.y(this.s.G(y2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public class j implements View.OnClickListener {
        public final /* synthetic */ fd2 s;

        public j(fd2 fd2Var) {
            this.s = fd2Var;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int C2 = yc2.this.v().C2() - 1;
            if (C2 >= 0) {
                yc2.this.y(this.s.G(C2));
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes3.dex */
    public interface l {
        void a(long j);
    }

    private void o(@x1 View view, @x1 fd2 fd2Var) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(ga2.h.a3);
        materialButton.setTag(B);
        sr.A1(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(ga2.h.c3);
        materialButton2.setTag(z);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(ga2.h.b3);
        materialButton3.setTag(A);
        this.K = view.findViewById(ga2.h.n3);
        this.L = view.findViewById(ga2.h.g3);
        z(k.DAY);
        materialButton.setText(this.F.l());
        this.J.q(new g(fd2Var, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(fd2Var));
        materialButton2.setOnClickListener(new j(fd2Var));
    }

    @x1
    private RecyclerView.n p() {
        return new e();
    }

    @c2
    public static int t(@x1 Context context) {
        return context.getResources().getDimensionPixelSize(ga2.f.O6);
    }

    private static int u(@x1 Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ga2.f.i7) + resources.getDimensionPixelOffset(ga2.f.k7) + resources.getDimensionPixelSize(ga2.f.j7);
        int dimensionPixelSize = resources.getDimensionPixelSize(ga2.f.T6);
        int i2 = ed2.s;
        int i3 = dimensionPixelOffset + dimensionPixelSize;
        return i3 + (resources.getDimensionPixelOffset(ga2.f.h7) * (i2 - 1)) + (resources.getDimensionPixelSize(ga2.f.O6) * i2) + resources.getDimensionPixelOffset(ga2.f.L6);
    }

    @x1
    public static <T> yc2<T> w(@x1 tc2<T> tc2Var, @m2 int i2, @x1 oc2 oc2Var) {
        yc2<T> yc2Var = new yc2<>();
        Bundle bundle = new Bundle();
        bundle.putInt(t, i2);
        bundle.putParcelable(u, tc2Var);
        bundle.putParcelable(v, oc2Var);
        bundle.putParcelable(w, oc2Var.m());
        yc2Var.setArguments(bundle);
        return yc2Var;
    }

    private void x(int i2) {
        this.J.post(new a(i2));
    }

    public void A() {
        k kVar = this.G;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            z(k.DAY);
        } else if (kVar == k.DAY) {
            z(kVar2);
        }
    }

    @Override // com.p7700g.p99005.hd2
    public boolean b(@x1 gd2<S> gd2Var) {
        return super.b(gd2Var);
    }

    @Override // com.p7700g.p99005.hd2
    @z1
    public tc2<S> e() {
        return this.D;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.C = bundle.getInt(t);
        this.D = (tc2) bundle.getParcelable(u);
        this.E = (oc2) bundle.getParcelable(v);
        this.F = (dd2) bundle.getParcelable(w);
    }

    @Override // androidx.fragment.app.Fragment
    @x1
    public View onCreateView(@x1 LayoutInflater layoutInflater, @z1 ViewGroup viewGroup, @z1 Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.C);
        this.H = new qc2(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        dd2 n = this.E.n();
        if (zc2.B(contextThemeWrapper)) {
            i2 = ga2.k.z0;
            i3 = 1;
        } else {
            i2 = ga2.k.u0;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        inflate.setMinimumHeight(u(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(ga2.h.h3);
        sr.A1(gridView, new b());
        gridView.setAdapter((ListAdapter) new xc2());
        gridView.setNumColumns(n.v);
        gridView.setEnabled(false);
        this.J = (RecyclerView) inflate.findViewById(ga2.h.k3);
        this.J.setLayoutManager(new c(getContext(), i3, false, i3));
        this.J.setTag(y);
        fd2 fd2Var = new fd2(contextThemeWrapper, this.D, this.E, new d());
        this.J.setAdapter(fd2Var);
        int integer = contextThemeWrapper.getResources().getInteger(ga2.i.R);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(ga2.h.n3);
        this.I = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.I.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.I.setAdapter(new nd2(this));
            this.I.m(p());
        }
        if (inflate.findViewById(ga2.h.a3) != null) {
            o(inflate, fd2Var);
        }
        if (!zc2.B(contextThemeWrapper)) {
            new m30().b(this.J);
        }
        this.J.B1(fd2Var.I(this.F));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@x1 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt(t, this.C);
        bundle.putParcelable(u, this.D);
        bundle.putParcelable(v, this.E);
        bundle.putParcelable(w, this.F);
    }

    @z1
    public oc2 q() {
        return this.E;
    }

    public qc2 r() {
        return this.H;
    }

    @z1
    public dd2 s() {
        return this.F;
    }

    @x1
    public LinearLayoutManager v() {
        return (LinearLayoutManager) this.J.getLayoutManager();
    }

    public void y(dd2 dd2Var) {
        fd2 fd2Var = (fd2) this.J.getAdapter();
        int I = fd2Var.I(dd2Var);
        int I2 = I - fd2Var.I(this.F);
        boolean z2 = Math.abs(I2) > 3;
        boolean z3 = I2 > 0;
        this.F = dd2Var;
        if (z2 && z3) {
            this.J.B1(I - 3);
            x(I);
        } else if (z2) {
            this.J.B1(I + 3);
            x(I);
        } else {
            x(I);
        }
    }

    public void z(k kVar) {
        this.G = kVar;
        if (kVar == k.YEAR) {
            this.I.getLayoutManager().R1(((nd2) this.I.getAdapter()).H(this.F.u));
            this.K.setVisibility(0);
            this.L.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.K.setVisibility(8);
            this.L.setVisibility(0);
            y(this.F);
        }
    }
}
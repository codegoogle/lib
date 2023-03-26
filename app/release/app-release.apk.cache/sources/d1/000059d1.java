package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuView;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.w4;
import java.util.ArrayList;

/* compiled from: NavigationMenuPresenter.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class re2 implements w4 {
    public static final int s = 0;
    private static final String t = "android:menu:list";
    private static final String u = "android:menu:adapter";
    private static final String v = "android:menu:header";
    private int A;
    public c B;
    public LayoutInflater C;
    @z1
    public ColorStateList E;
    public ColorStateList G;
    public ColorStateList H;
    public Drawable I;
    public RippleDrawable J;
    public int K;
    @c2
    public int L;
    public int M;
    public int N;
    @c2
    public int O;
    @c2
    public int P;
    @c2
    public int Q;
    @c2
    public int R;
    public boolean S;
    private int U;
    private int V;
    public int W;
    private NavigationMenuView w;
    public LinearLayout x;
    private w4.a y;
    public p4 z;
    public int D = 0;
    public int F = 0;
    public boolean T = true;
    private int X = -1;
    public final View.OnClickListener Y = new a();

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z = true;
            re2.this.O(true);
            s4 itemData = ((NavigationMenuItemView) view).getItemData();
            re2 re2Var = re2.this;
            boolean P = re2Var.z.P(itemData, re2Var, 0);
            if (itemData != null && itemData.isCheckable() && P) {
                re2.this.B.O(itemData);
            } else {
                z = false;
            }
            re2.this.O(false);
            if (z) {
                re2.this.updateMenuView(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public class c extends RecyclerView.g<l> {
        private static final String c = "android:menu:checked";
        private static final String d = "android:menu:action_views";
        private static final int e = 0;
        private static final int f = 1;
        private static final int g = 2;
        private static final int h = 3;
        private final ArrayList<e> i = new ArrayList<>();
        private s4 j;
        private boolean k;

        public c() {
            M();
        }

        private void F(int i, int i2) {
            while (i < i2) {
                ((g) this.i.get(i)).b = true;
                i++;
            }
        }

        private void M() {
            if (this.k) {
                return;
            }
            this.k = true;
            this.i.clear();
            this.i.add(new d());
            int i = -1;
            int size = re2.this.z.H().size();
            boolean z = false;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                s4 s4Var = re2.this.z.H().get(i3);
                if (s4Var.isChecked()) {
                    O(s4Var);
                }
                if (s4Var.isCheckable()) {
                    s4Var.w(false);
                }
                if (s4Var.hasSubMenu()) {
                    SubMenu subMenu = s4Var.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i3 != 0) {
                            this.i.add(new f(re2.this.W, 0));
                        }
                        this.i.add(new g(s4Var));
                        int size2 = this.i.size();
                        int size3 = subMenu.size();
                        boolean z2 = false;
                        for (int i4 = 0; i4 < size3; i4++) {
                            s4 s4Var2 = (s4) subMenu.getItem(i4);
                            if (s4Var2.isVisible()) {
                                if (!z2 && s4Var2.getIcon() != null) {
                                    z2 = true;
                                }
                                if (s4Var2.isCheckable()) {
                                    s4Var2.w(false);
                                }
                                if (s4Var.isChecked()) {
                                    O(s4Var);
                                }
                                this.i.add(new g(s4Var2));
                            }
                        }
                        if (z2) {
                            F(size2, this.i.size());
                        }
                    }
                } else {
                    int groupId = s4Var.getGroupId();
                    if (groupId != i) {
                        i2 = this.i.size();
                        z = s4Var.getIcon() != null;
                        if (i3 != 0) {
                            i2++;
                            ArrayList<e> arrayList = this.i;
                            int i5 = re2.this.W;
                            arrayList.add(new f(i5, i5));
                        }
                    } else if (!z && s4Var.getIcon() != null) {
                        F(i2, this.i.size());
                        z = true;
                    }
                    g gVar = new g(s4Var);
                    gVar.b = z;
                    this.i.add(gVar);
                    i = groupId;
                }
            }
            this.k = false;
        }

        @x1
        public Bundle G() {
            Bundle bundle = new Bundle();
            s4 s4Var = this.j;
            if (s4Var != null) {
                bundle.putInt(c, s4Var.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.i.size();
            for (int i = 0; i < size; i++) {
                e eVar = this.i.get(i);
                if (eVar instanceof g) {
                    s4 a = ((g) eVar).a();
                    View actionView = a != null ? a.getActionView() : null;
                    if (actionView != null) {
                        te2 te2Var = new te2();
                        actionView.saveHierarchyState(te2Var);
                        sparseArray.put(a.getItemId(), te2Var);
                    }
                }
            }
            bundle.putSparseParcelableArray(d, sparseArray);
            return bundle;
        }

        public s4 H() {
            return this.j;
        }

        public int I() {
            int i = re2.this.x.getChildCount() == 0 ? 0 : 1;
            for (int i2 = 0; i2 < re2.this.B.e(); i2++) {
                if (re2.this.B.g(i2) == 0) {
                    i++;
                }
            }
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: J */
        public void u(@x1 l lVar, int i) {
            int g2 = g(i);
            if (g2 != 0) {
                if (g2 != 1) {
                    if (g2 != 2) {
                        return;
                    }
                    f fVar = (f) this.i.get(i);
                    lVar.p.setPadding(re2.this.O, fVar.b(), re2.this.P, fVar.a());
                    return;
                }
                TextView textView = (TextView) lVar.p;
                textView.setText(((g) this.i.get(i)).a().getTitle());
                int i2 = re2.this.D;
                if (i2 != 0) {
                    nt.E(textView, i2);
                }
                textView.setPadding(re2.this.Q, textView.getPaddingTop(), re2.this.R, textView.getPaddingBottom());
                ColorStateList colorStateList = re2.this.E;
                if (colorStateList != null) {
                    textView.setTextColor(colorStateList);
                    return;
                }
                return;
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.p;
            navigationMenuItemView.setIconTintList(re2.this.H);
            int i3 = re2.this.F;
            if (i3 != 0) {
                navigationMenuItemView.setTextAppearance(i3);
            }
            ColorStateList colorStateList2 = re2.this.G;
            if (colorStateList2 != null) {
                navigationMenuItemView.setTextColor(colorStateList2);
            }
            Drawable drawable = re2.this.I;
            sr.H1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            RippleDrawable rippleDrawable = re2.this.J;
            if (rippleDrawable != null) {
                navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
            }
            g gVar = (g) this.i.get(i);
            navigationMenuItemView.setNeedsEmptyIcon(gVar.b);
            re2 re2Var = re2.this;
            int i4 = re2Var.K;
            int i5 = re2Var.L;
            navigationMenuItemView.setPadding(i4, i5, i4, i5);
            navigationMenuItemView.setIconPadding(re2.this.M);
            re2 re2Var2 = re2.this;
            if (re2Var2.S) {
                navigationMenuItemView.setIconSize(re2Var2.N);
            }
            navigationMenuItemView.setMaxLines(re2.this.U);
            navigationMenuItemView.d(gVar.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        @z1
        /* renamed from: K */
        public l w(ViewGroup viewGroup, int i) {
            if (i == 0) {
                re2 re2Var = re2.this;
                return new i(re2Var.C, viewGroup, re2Var.Y);
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return new b(re2.this.x);
                }
                return new j(re2.this.C, viewGroup);
            } else {
                return new k(re2.this.C, viewGroup);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        /* renamed from: L */
        public void B(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.p).g();
            }
        }

        public void N(@x1 Bundle bundle) {
            s4 a;
            View actionView;
            te2 te2Var;
            s4 a2;
            int i = bundle.getInt(c, 0);
            if (i != 0) {
                this.k = true;
                int size = this.i.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    e eVar = this.i.get(i2);
                    if ((eVar instanceof g) && (a2 = ((g) eVar).a()) != null && a2.getItemId() == i) {
                        O(a2);
                        break;
                    }
                    i2++;
                }
                this.k = false;
                M();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d);
            if (sparseParcelableArray != null) {
                int size2 = this.i.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e eVar2 = this.i.get(i3);
                    if ((eVar2 instanceof g) && (a = ((g) eVar2).a()) != null && (actionView = a.getActionView()) != null && (te2Var = (te2) sparseParcelableArray.get(a.getItemId())) != null) {
                        actionView.restoreHierarchyState(te2Var);
                    }
                }
            }
        }

        public void O(@x1 s4 s4Var) {
            if (this.j == s4Var || !s4Var.isCheckable()) {
                return;
            }
            s4 s4Var2 = this.j;
            if (s4Var2 != null) {
                s4Var2.setChecked(false);
            }
            this.j = s4Var;
            s4Var.setChecked(true);
        }

        public void P(boolean z) {
            this.k = z;
        }

        public void Q() {
            M();
            j();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int e() {
            return this.i.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public long f(int i) {
            return i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.g
        public int g(int i) {
            e eVar = this.i.get(i);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof g) {
                return ((g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException("Unknown item type.");
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class d implements e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class f implements e {
        private final int a;
        private final int b;

        public f(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public int a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class g implements e {
        private final s4 a;
        public boolean b;

        public g(s4 s4Var) {
            this.a = s4Var;
        }

        public s4 a() {
            return this.a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public class h extends n30 {
        public h(@x1 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // com.p7700g.p99005.n30, com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.Y0(ls.b.e(re2.this.B.I(), 0, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class i extends l {
        public i(@x1 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(ga2.k.K, viewGroup, false));
            this.p.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class j extends l {
        public j(@x1 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ga2.k.M, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static class k extends l {
        public k(@x1 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(ga2.k.N, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes3.dex */
    public static abstract class l extends RecyclerView.f0 {
        public l(View view) {
            super(view);
        }
    }

    private void P() {
        int i2 = (this.x.getChildCount() == 0 && this.T) ? this.V : 0;
        NavigationMenuView navigationMenuView = this.w;
        navigationMenuView.setPadding(0, i2, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(@z1 RippleDrawable rippleDrawable) {
        this.J = rippleDrawable;
        updateMenuView(false);
    }

    public void B(int i2) {
        this.K = i2;
        updateMenuView(false);
    }

    public void C(int i2) {
        this.M = i2;
        updateMenuView(false);
    }

    public void D(@b1 int i2) {
        if (this.N != i2) {
            this.N = i2;
            this.S = true;
            updateMenuView(false);
        }
    }

    public void E(@z1 ColorStateList colorStateList) {
        this.H = colorStateList;
        updateMenuView(false);
    }

    public void F(int i2) {
        this.U = i2;
        updateMenuView(false);
    }

    public void G(@m2 int i2) {
        this.F = i2;
        updateMenuView(false);
    }

    public void H(@z1 ColorStateList colorStateList) {
        this.G = colorStateList;
        updateMenuView(false);
    }

    public void I(@c2 int i2) {
        this.L = i2;
        updateMenuView(false);
    }

    public void J(int i2) {
        this.X = i2;
        NavigationMenuView navigationMenuView = this.w;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i2);
        }
    }

    public void K(@z1 ColorStateList colorStateList) {
        this.E = colorStateList;
        updateMenuView(false);
    }

    public void L(@c2 int i2) {
        this.R = i2;
        updateMenuView(false);
    }

    public void M(@c2 int i2) {
        this.Q = i2;
        updateMenuView(false);
    }

    public void N(@m2 int i2) {
        this.D = i2;
        updateMenuView(false);
    }

    public void O(boolean z) {
        c cVar = this.B;
        if (cVar != null) {
            cVar.P(z);
        }
    }

    public void b(@x1 View view) {
        this.x.addView(view);
        NavigationMenuView navigationMenuView = this.w;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    public void c(@x1 gs gsVar) {
        int r = gsVar.r();
        if (this.V != r) {
            this.V = r;
            P();
        }
        NavigationMenuView navigationMenuView = this.w;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, gsVar.o());
        sr.o(this.x, gsVar);
    }

    @Override // com.p7700g.p99005.w4
    public boolean collapseItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    @z1
    public s4 d() {
        return this.B.H();
    }

    @c2
    public int e() {
        return this.P;
    }

    @Override // com.p7700g.p99005.w4
    public boolean expandItemActionView(p4 p4Var, s4 s4Var) {
        return false;
    }

    @c2
    public int f() {
        return this.O;
    }

    @Override // com.p7700g.p99005.w4
    public boolean flagActionItems() {
        return false;
    }

    public int g() {
        return this.x.getChildCount();
    }

    @Override // com.p7700g.p99005.w4
    public int getId() {
        return this.A;
    }

    @Override // com.p7700g.p99005.w4
    public x4 getMenuView(ViewGroup viewGroup) {
        if (this.w == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.C.inflate(ga2.k.O, viewGroup, false);
            this.w = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.w));
            if (this.B == null) {
                this.B = new c();
            }
            int i2 = this.X;
            if (i2 != -1) {
                this.w.setOverScrollMode(i2);
            }
            this.x = (LinearLayout) this.C.inflate(ga2.k.L, (ViewGroup) this.w, false);
            this.w.setAdapter(this.B);
        }
        return this.w;
    }

    public View h(int i2) {
        return this.x.getChildAt(i2);
    }

    @z1
    public Drawable i() {
        return this.I;
    }

    @Override // com.p7700g.p99005.w4
    public void initForMenu(@x1 Context context, @x1 p4 p4Var) {
        this.C = LayoutInflater.from(context);
        this.z = p4Var;
        this.W = context.getResources().getDimensionPixelOffset(ga2.f.u1);
    }

    public int j() {
        return this.K;
    }

    public int k() {
        return this.M;
    }

    public int l() {
        return this.U;
    }

    @z1
    public ColorStateList m() {
        return this.G;
    }

    @z1
    public ColorStateList n() {
        return this.H;
    }

    @c2
    public int o() {
        return this.L;
    }

    @Override // com.p7700g.p99005.w4
    public void onCloseMenu(p4 p4Var, boolean z) {
        w4.a aVar = this.y;
        if (aVar != null) {
            aVar.onCloseMenu(p4Var, z);
        }
    }

    @Override // com.p7700g.p99005.w4
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
            if (sparseParcelableArray != null) {
                this.w.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(u);
            if (bundle2 != null) {
                this.B.N(bundle2);
            }
            SparseArray sparseParcelableArray2 = bundle.getSparseParcelableArray(v);
            if (sparseParcelableArray2 != null) {
                this.x.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // com.p7700g.p99005.w4
    @x1
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        if (this.w != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.w.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        }
        c cVar = this.B;
        if (cVar != null) {
            bundle.putBundle(u, cVar.G());
        }
        if (this.x != null) {
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            this.x.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(v, sparseArray2);
        }
        return bundle;
    }

    @Override // com.p7700g.p99005.w4
    public boolean onSubMenuSelected(b5 b5Var) {
        return false;
    }

    @c2
    public int p() {
        return this.R;
    }

    @c2
    public int q() {
        return this.Q;
    }

    public View r(@s1 int i2) {
        View inflate = this.C.inflate(i2, (ViewGroup) this.x, false);
        b(inflate);
        return inflate;
    }

    public boolean s() {
        return this.T;
    }

    @Override // com.p7700g.p99005.w4
    public void setCallback(w4.a aVar) {
        this.y = aVar;
    }

    public void t(@x1 View view) {
        this.x.removeView(view);
        if (this.x.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.w;
            navigationMenuView.setPadding(0, this.V, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void u(boolean z) {
        if (this.T != z) {
            this.T = z;
            P();
        }
    }

    @Override // com.p7700g.p99005.w4
    public void updateMenuView(boolean z) {
        c cVar = this.B;
        if (cVar != null) {
            cVar.Q();
        }
    }

    public void v(@x1 s4 s4Var) {
        this.B.O(s4Var);
    }

    public void w(@c2 int i2) {
        this.P = i2;
        updateMenuView(false);
    }

    public void x(@c2 int i2) {
        this.O = i2;
        updateMenuView(false);
    }

    public void y(int i2) {
        this.A = i2;
    }

    public void z(@z1 Drawable drawable) {
        this.I = drawable;
        updateMenuView(false);
    }
}
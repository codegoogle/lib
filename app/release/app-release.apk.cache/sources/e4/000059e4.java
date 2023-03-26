package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ip;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.x2;
import java.util.HashSet;

/* compiled from: NavigationBarMenuView.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class rf2 extends ViewGroup implements x4 {
    private static final int s = 5;
    private static final int t = -1;
    private static final int[] u = {16842912};
    private static final int[] v = {-16842910};
    private int A;
    @z1
    private pf2[] B;
    private int C;
    private int D;
    @z1
    private ColorStateList E;
    @b1
    private int F;
    private ColorStateList G;
    @z1
    private final ColorStateList H;
    @m2
    private int I;
    @m2
    private int J;
    private Drawable K;
    private int L;
    @x1
    private final SparseArray<ya2> M;
    private int N;
    private int O;
    private boolean P;
    private int Q;
    private int R;
    private int S;
    private qh2 T;
    private boolean U;
    private ColorStateList V;
    private sf2 W;
    private p4 u0;
    @z1
    private final x80 w;
    @x1
    private final View.OnClickListener x;
    private final ip.a<pf2> y;
    @x1
    private final SparseArray<View.OnTouchListener> z;

    /* compiled from: NavigationBarMenuView.java */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            s4 itemData = ((pf2) view).getItemData();
            if (rf2.this.u0.P(itemData, rf2.this.W, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public rf2(@x1 Context context) {
        super(context);
        this.y = new ip.c(5);
        this.z = new SparseArray<>(5);
        this.C = 0;
        this.D = 0;
        this.M = new SparseArray<>(5);
        this.N = -1;
        this.O = -1;
        this.U = false;
        this.H = d(16842808);
        if (isInEditMode()) {
            this.w = null;
        } else {
            o70 o70Var = new o70();
            this.w = o70Var;
            o70Var.l1(0);
            o70Var.G0(of2.d(getContext(), ga2.c.Mb, getResources().getInteger(ga2.i.F)));
            o70Var.I0(of2.e(getContext(), ga2.c.Wb, ha2.b));
            o70Var.V0(new af2());
        }
        this.x = new a();
        sr.Q1(this, 1);
    }

    @z1
    private Drawable e() {
        if (this.T == null || this.V == null) {
            return null;
        }
        lh2 lh2Var = new lh2(this.T);
        lh2Var.o0(this.V);
        return lh2Var;
    }

    private pf2 getNewItem() {
        pf2 b = this.y.b();
        return b == null ? f(getContext()) : b;
    }

    private boolean l(int i) {
        return i != -1;
    }

    private void n() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.u0.size(); i++) {
            hashSet.add(Integer.valueOf(this.u0.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            int keyAt = this.M.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.M.delete(keyAt);
            }
        }
    }

    private void s(int i) {
        if (l(i)) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    private void setBadgeIfNeeded(@x1 pf2 pf2Var) {
        ya2 ya2Var;
        int id = pf2Var.getId();
        if (l(id) && (ya2Var = this.M.get(id)) != null) {
            pf2Var.setBadge(ya2Var);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c() {
        removeAllViews();
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                if (pf2Var != null) {
                    this.y.a(pf2Var);
                    pf2Var.j();
                }
            }
        }
        if (this.u0.size() == 0) {
            this.C = 0;
            this.D = 0;
            this.B = null;
            return;
        }
        n();
        this.B = new pf2[this.u0.size()];
        boolean k = k(this.A, this.u0.H().size());
        for (int i = 0; i < this.u0.size(); i++) {
            this.W.c(true);
            this.u0.getItem(i).setCheckable(true);
            this.W.c(false);
            pf2 newItem = getNewItem();
            this.B[i] = newItem;
            newItem.setIconTintList(this.E);
            newItem.setIconSize(this.F);
            newItem.setTextColor(this.H);
            newItem.setTextAppearanceInactive(this.I);
            newItem.setTextAppearanceActive(this.J);
            newItem.setTextColor(this.G);
            int i2 = this.N;
            if (i2 != -1) {
                newItem.setItemPaddingTop(i2);
            }
            int i3 = this.O;
            if (i3 != -1) {
                newItem.setItemPaddingBottom(i3);
            }
            newItem.setActiveIndicatorWidth(this.Q);
            newItem.setActiveIndicatorHeight(this.R);
            newItem.setActiveIndicatorMarginHorizontal(this.S);
            newItem.setActiveIndicatorDrawable(e());
            newItem.setActiveIndicatorResizeable(this.U);
            newItem.setActiveIndicatorEnabled(this.P);
            Drawable drawable = this.K;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.L);
            }
            newItem.setShifting(k);
            newItem.setLabelVisibilityMode(this.A);
            s4 s4Var = (s4) this.u0.getItem(i);
            newItem.d(s4Var, 0);
            newItem.setItemPosition(i);
            int itemId = s4Var.getItemId();
            newItem.setOnTouchListener(this.z.get(itemId));
            newItem.setOnClickListener(this.x);
            int i4 = this.C;
            if (i4 != 0 && itemId == i4) {
                this.D = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.u0.size() - 1, this.D);
        this.D = min;
        this.u0.getItem(min).setChecked(true);
    }

    @z1
    public ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            ColorStateList a2 = r3.a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(x2.b.J0, typedValue, true)) {
                int i2 = typedValue.data;
                int defaultColor = a2.getDefaultColor();
                int[] iArr = v;
                return new ColorStateList(new int[][]{iArr, u, ViewGroup.EMPTY_STATE_SET}, new int[]{a2.getColorForState(iArr, defaultColor), i2, defaultColor});
            }
            return null;
        }
        return null;
    }

    @x1
    public abstract pf2 f(@x1 Context context);

    @z1
    public pf2 g(int i) {
        s(i);
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                if (pf2Var.getId() == i) {
                    return pf2Var;
                }
            }
            return null;
        }
        return null;
    }

    public SparseArray<ya2> getBadgeDrawables() {
        return this.M;
    }

    @z1
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @z1
    public ColorStateList getItemActiveIndicatorColor() {
        return this.V;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.P;
    }

    @c2
    public int getItemActiveIndicatorHeight() {
        return this.R;
    }

    @c2
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.S;
    }

    @z1
    public qh2 getItemActiveIndicatorShapeAppearance() {
        return this.T;
    }

    @c2
    public int getItemActiveIndicatorWidth() {
        return this.Q;
    }

    @z1
    public Drawable getItemBackground() {
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null && pf2VarArr.length > 0) {
            return pf2VarArr[0].getBackground();
        }
        return this.K;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.L;
    }

    @b1
    public int getItemIconSize() {
        return this.F;
    }

    @c2
    public int getItemPaddingBottom() {
        return this.O;
    }

    @c2
    public int getItemPaddingTop() {
        return this.N;
    }

    @m2
    public int getItemTextAppearanceActive() {
        return this.J;
    }

    @m2
    public int getItemTextAppearanceInactive() {
        return this.I;
    }

    @z1
    public ColorStateList getItemTextColor() {
        return this.G;
    }

    public int getLabelVisibilityMode() {
        return this.A;
    }

    @z1
    public p4 getMenu() {
        return this.u0;
    }

    public int getSelectedItemId() {
        return this.C;
    }

    public int getSelectedItemPosition() {
        return this.D;
    }

    @Override // com.p7700g.p99005.x4
    public int getWindowAnimations() {
        return 0;
    }

    @z1
    public ya2 h(int i) {
        return this.M.get(i);
    }

    public ya2 i(int i) {
        s(i);
        ya2 ya2Var = this.M.get(i);
        if (ya2Var == null) {
            ya2Var = ya2.d(getContext());
            this.M.put(i, ya2Var);
        }
        pf2 g = g(i);
        if (g != null) {
            g.setBadge(ya2Var);
        }
        return ya2Var;
    }

    @Override // com.p7700g.p99005.x4
    public void initialize(@x1 p4 p4Var) {
        this.u0 = p4Var;
    }

    public boolean j() {
        return this.U;
    }

    public boolean k(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public void m(int i) {
        s(i);
        ya2 ya2Var = this.M.get(i);
        pf2 g = g(i);
        if (g != null) {
            g.p();
        }
        if (ya2Var != null) {
            this.M.remove(i);
        }
    }

    public void o(SparseArray<ya2> sparseArray) {
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            if (this.M.indexOfKey(keyAt) < 0) {
                this.M.append(keyAt, sparseArray.get(keyAt));
            }
        }
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setBadge(this.M.get(pf2Var.getId()));
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ls.X1(accessibilityNodeInfo).Y0(ls.b.f(1, this.u0.H().size(), false, 1));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void p(int i, @z1 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.z.remove(i);
        } else {
            this.z.put(i, onTouchListener);
        }
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                if (pf2Var.getItemData().getItemId() == i) {
                    pf2Var.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void q(int i) {
        int size = this.u0.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.u0.getItem(i2);
            if (i == item.getItemId()) {
                this.C = i;
                this.D = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public void r() {
        x80 x80Var;
        p4 p4Var = this.u0;
        if (p4Var == null || this.B == null) {
            return;
        }
        int size = p4Var.size();
        if (size != this.B.length) {
            c();
            return;
        }
        int i = this.C;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.u0.getItem(i2);
            if (item.isChecked()) {
                this.C = item.getItemId();
                this.D = i2;
            }
        }
        if (i != this.C && (x80Var = this.w) != null) {
            v80.b(this, x80Var);
        }
        boolean k = k(this.A, this.u0.H().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.W.c(true);
            this.B[i3].setLabelVisibilityMode(this.A);
            this.B[i3].setShifting(k);
            this.B[i3].d((s4) this.u0.getItem(i3), 0);
            this.W.c(false);
        }
    }

    public void setIconTintList(@z1 ColorStateList colorStateList) {
        this.E = colorStateList;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(@z1 ColorStateList colorStateList) {
        this.V = colorStateList;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorDrawable(e());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.P = z;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(@c2 int i) {
        this.R = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(@c2 int i) {
        this.S = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.U = z;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(@z1 qh2 qh2Var) {
        this.T = qh2Var;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorDrawable(e());
            }
        }
    }

    public void setItemActiveIndicatorWidth(@c2 int i) {
        this.Q = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(@z1 Drawable drawable) {
        this.K = drawable;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.L = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(@b1 int i) {
        this.F = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(@c2 int i) {
        this.O = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(@c2 int i) {
        this.N = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setItemPaddingTop(i);
            }
        }
    }

    public void setItemTextAppearanceActive(@m2 int i) {
        this.J = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    pf2Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@m2 int i) {
        this.I = i;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.G;
                if (colorStateList != null) {
                    pf2Var.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(@z1 ColorStateList colorStateList) {
        this.G = colorStateList;
        pf2[] pf2VarArr = this.B;
        if (pf2VarArr != null) {
            for (pf2 pf2Var : pf2VarArr) {
                pf2Var.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.A = i;
    }

    public void setPresenter(@x1 sf2 sf2Var) {
        this.W = sf2Var;
    }
}
package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.p7700g.p99005.a1;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.ge2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.m1;
import com.p7700g.p99005.me2;
import com.p7700g.p99005.s0;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class ChipGroup extends me2 {
    private static final int w = ga2.n.Ah;
    private final ge2<Chip> A;
    private final int B;
    @x1
    private final f C;
    @b1
    private int x;
    @b1
    private int y;
    @z1
    private e z;

    /* loaded from: classes.dex */
    public class a implements ge2.b {
        public a() {
        }

        @Override // com.p7700g.p99005.ge2.b
        public void a(Set<Integer> set) {
            if (ChipGroup.this.z != null) {
                e eVar = ChipGroup.this.z;
                ChipGroup chipGroup = ChipGroup.this;
                eVar.a(chipGroup, chipGroup.A.j(ChipGroup.this));
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements e {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // com.google.android.material.chip.ChipGroup.e
        public void a(@x1 ChipGroup chipGroup, @x1 List<Integer> list) {
            if (ChipGroup.this.A.m()) {
                this.a.a(chipGroup, ChipGroup.this.getCheckedChipId());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface d {
        void a(@x1 ChipGroup chipGroup, @m1 int i);
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(@x1 ChipGroup chipGroup, @x1 List<Integer> list);
    }

    /* loaded from: classes.dex */
    public class f implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener s;

        private f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(sr.C());
                }
                ChipGroup.this.A.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.A.o((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.s;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }

        public /* synthetic */ f(ChipGroup chipGroup, a aVar) {
            this();
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    @Override // com.p7700g.p99005.me2
    public boolean c() {
        return super.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public void g(@m1 int i) {
        this.A.f(i);
    }

    @Override // android.view.ViewGroup
    @x1
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    @Override // android.view.ViewGroup
    @x1
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @m1
    public int getCheckedChipId() {
        return this.A.k();
    }

    @x1
    public List<Integer> getCheckedChipIds() {
        return this.A.j(this);
    }

    @b1
    public int getChipSpacingHorizontal() {
        return this.x;
    }

    @b1
    public int getChipSpacingVertical() {
        return this.y;
    }

    public void h() {
        this.A.h();
    }

    public int i(@z1 View view) {
        if (view instanceof Chip) {
            int i = 0;
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                if (getChildAt(i2) instanceof Chip) {
                    if (((Chip) getChildAt(i2)) == view) {
                        return i;
                    }
                    i++;
                }
            }
            return -1;
        }
        return -1;
    }

    public boolean j() {
        return this.A.l();
    }

    public boolean k() {
        return this.A.m();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.B;
        if (i != -1) {
            this.A.f(i);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@x1 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ls.X1(accessibilityNodeInfo).Y0(ls.b.f(getRowCount(), c() ? getChipCount() : -1, false, k() ? 1 : 2));
    }

    public void setChipSpacing(@b1 int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(@b1 int i) {
        if (this.x != i) {
            this.x = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@a1 int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(@a1 int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(@b1 int i) {
        if (this.y != i) {
            this.y = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@a1 int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@z1 Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@z1 d dVar) {
        if (dVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new b(dVar));
        }
    }

    public void setOnCheckedStateChangeListener(@z1 e eVar) {
        this.z = eVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.C.s = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.A.q(z);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.p7700g.p99005.me2
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        this.A.r(z);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.P1);
    }

    @Override // android.view.ViewGroup
    @x1
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(@s0 int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(@s0 int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ChipGroup(Context context, AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = w;
        ge2<Chip> ge2Var = new ge2<>();
        this.A = ge2Var;
        f fVar = new f(this, null);
        this.C = fVar;
        TypedArray j = cf2.j(getContext(), attributeSet, ga2.o.n6, i, i2, new int[0]);
        int dimensionPixelOffset = j.getDimensionPixelOffset(ga2.o.p6, 0);
        setChipSpacingHorizontal(j.getDimensionPixelOffset(ga2.o.q6, dimensionPixelOffset));
        setChipSpacingVertical(j.getDimensionPixelOffset(ga2.o.r6, dimensionPixelOffset));
        setSingleLine(j.getBoolean(ga2.o.t6, false));
        setSingleSelection(j.getBoolean(ga2.o.u6, false));
        setSelectionRequired(j.getBoolean(ga2.o.s6, false));
        this.B = j.getResourceId(ga2.o.o6, -1);
        j.recycle();
        ge2Var.p(new a());
        super.setOnHierarchyChangeListener(fVar);
        sr.Q1(this, 1);
    }
}
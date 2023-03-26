package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import com.p7700g.p99005.b1;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.fq;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.ls;
import com.p7700g.p99005.ne2;
import com.p7700g.p99005.nt;
import com.p7700g.p99005.oi;
import com.p7700g.p99005.s4;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x2;
import com.p7700g.p99005.x4;
import com.p7700g.p99005.z1;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class NavigationMenuItemView extends ne2 implements x4.a {
    private static final int[] y = {16842912};
    private boolean A;
    public boolean B;
    private final CheckedTextView C;
    private FrameLayout D;
    private s4 E;
    private ColorStateList F;
    private boolean G;
    private Drawable H;
    private final fq I;
    private int z;

    /* loaded from: classes3.dex */
    public class a extends fq {
        public a() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            lsVar.U0(NavigationMenuItemView.this.B);
        }
    }

    public NavigationMenuItemView(@x1 Context context) {
        this(context, null);
    }

    private void e() {
        if (h()) {
            this.C.setVisibility(8);
            FrameLayout frameLayout = this.D;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.D.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.C.setVisibility(0);
        FrameLayout frameLayout2 = this.D;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.D.setLayoutParams(layoutParams2);
        }
    }

    @z1
    private StateListDrawable f() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(x2.b.G0, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(y, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean h() {
        return this.E.getTitle() == null && this.E.getIcon() == null && this.E.getActionView() != null;
    }

    private void setActionView(@z1 View view) {
        if (view != null) {
            if (this.D == null) {
                this.D = (FrameLayout) ((ViewStub) findViewById(ga2.h.l1)).inflate();
            }
            this.D.removeAllViews();
            this.D.addView(view);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void a(boolean z, char c) {
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean b() {
        return false;
    }

    @Override // com.p7700g.p99005.x4.a
    public boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.x4.a
    public void d(@x1 s4 s4Var, int i) {
        this.E = s4Var;
        if (s4Var.getItemId() > 0) {
            setId(s4Var.getItemId());
        }
        setVisibility(s4Var.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            sr.H1(this, f());
        }
        setCheckable(s4Var.isCheckable());
        setChecked(s4Var.isChecked());
        setEnabled(s4Var.isEnabled());
        setTitle(s4Var.getTitle());
        setIcon(s4Var.getIcon());
        setActionView(s4Var.getActionView());
        setContentDescription(s4Var.getContentDescription());
        TooltipCompat.setTooltipText(this, s4Var.getTooltipText());
        e();
    }

    public void g() {
        FrameLayout frameLayout = this.D;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.C.setCompoundDrawables(null, null, null, null);
    }

    @Override // com.p7700g.p99005.x4.a
    public s4 getItemData() {
        return this.E;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        s4 s4Var = this.E;
        if (s4Var != null && s4Var.isCheckable() && this.E.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, y);
        }
        return onCreateDrawableState;
    }

    @Override // com.p7700g.p99005.x4.a
    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.B != z) {
            this.B = z;
            this.I.l(this.C, 2048);
        }
    }

    @Override // com.p7700g.p99005.x4.a
    public void setChecked(boolean z) {
        refreshDrawableState();
        this.C.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    @Override // com.p7700g.p99005.x4.a
    public void setIcon(@z1 Drawable drawable) {
        if (drawable != null) {
            if (this.G) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = fk.r(drawable).mutate();
                fk.o(drawable, this.F);
            }
            int i = this.z;
            drawable.setBounds(0, 0, i, i);
        } else if (this.A) {
            if (this.H == null) {
                Drawable g = oi.g(getResources(), ga2.g.w1, getContext().getTheme());
                this.H = g;
                if (g != null) {
                    int i2 = this.z;
                    g.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.H;
        }
        nt.w(this.C, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.C.setCompoundDrawablePadding(i);
    }

    public void setIconSize(@b1 int i) {
        this.z = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.F = colorStateList;
        this.G = colorStateList != null;
        s4 s4Var = this.E;
        if (s4Var != null) {
            setIcon(s4Var.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.C.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.A = z;
    }

    public void setTextAppearance(int i) {
        nt.E(this.C, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.C.setTextColor(colorStateList);
    }

    @Override // com.p7700g.p99005.x4.a
    public void setTitle(CharSequence charSequence) {
        this.C.setText(charSequence);
    }

    public NavigationMenuItemView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.I = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(ga2.k.P, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(ga2.f.o1));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(ga2.h.m1);
        this.C = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        sr.A1(checkedTextView, aVar);
    }
}
package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.p7700g.p99005.cf2;
import com.p7700g.p99005.df2;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.fk;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.lh2;
import com.p7700g.p99005.mh2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yi2;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    private static final int s = ga2.n.hj;
    private static final ImageView.ScaleType[] t = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    @z1
    private Integer u;
    private boolean v;
    private boolean w;
    @z1
    private ImageView.ScaleType x;
    @z1
    private Boolean y;

    public MaterialToolbar(@x1 Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> a(@z1 TextView textView, @z1 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            lh2 lh2Var = new lh2();
            lh2Var.o0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            lh2Var.Z(context);
            lh2Var.n0(sr.Q(this));
            sr.H1(this, lh2Var);
        }
    }

    private void f(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i2, view.getBottom());
    }

    private void g() {
        if (this.v || this.w) {
            TextView i = df2.i(this);
            TextView g = df2.g(this);
            if (i == null && g == null) {
                return;
            }
            Pair<Integer, Integer> a = a(i, g);
            if (this.v && i != null) {
                f(i, a);
            }
            if (!this.w || g == null) {
                return;
            }
            f(g, a);
        }
    }

    @z1
    private Drawable h(@z1 Drawable drawable) {
        if (drawable == null || this.u == null) {
            return drawable;
        }
        Drawable r = fk.r(drawable.mutate());
        fk.n(r, this.u.intValue());
        return r;
    }

    private void i() {
        ImageView d = df2.d(this);
        if (d != null) {
            Boolean bool = this.y;
            if (bool != null) {
                d.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.x;
            if (scaleType != null) {
                d.setScaleType(scaleType);
            }
        }
    }

    public boolean c() {
        Boolean bool = this.y;
        return bool != null && bool.booleanValue();
    }

    public boolean d() {
        return this.w;
    }

    public boolean e() {
        return this.v;
    }

    @z1
    public ImageView.ScaleType getLogoScaleType() {
        return this.x;
    }

    @w0
    @z1
    public Integer getNavigationIconTint() {
        return this.u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mh2.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        g();
        i();
    }

    @Override // android.view.View
    @e2(21)
    public void setElevation(float f) {
        super.setElevation(f);
        mh2.d(this, f);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.y;
        if (bool == null || bool.booleanValue() != z) {
            this.y = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(@x1 ImageView.ScaleType scaleType) {
        if (this.x != scaleType) {
            this.x = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@z1 Drawable drawable) {
        super.setNavigationIcon(h(drawable));
    }

    public void setNavigationIconTint(@w0 int i) {
        this.u = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.w != z) {
            this.w = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.v != z) {
            this.v = z;
            requestLayout();
        }
    }

    public MaterialToolbar(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.sh);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MaterialToolbar(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(yi2.c(context, attributeSet, i, r4), attributeSet, i);
        int i2 = s;
        Context context2 = getContext();
        TypedArray j = cf2.j(context2, attributeSet, ga2.o.Jm, i, i2, new int[0]);
        int i3 = ga2.o.Mm;
        if (j.hasValue(i3)) {
            setNavigationIconTint(j.getColor(i3, -1));
        }
        this.v = j.getBoolean(ga2.o.Om, false);
        this.w = j.getBoolean(ga2.o.Nm, false);
        int i4 = j.getInt(ga2.o.Lm, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = t;
            if (i4 < scaleTypeArr.length) {
                this.x = scaleTypeArr[i4];
            }
        }
        int i5 = ga2.o.Km;
        if (j.hasValue(i5)) {
            this.y = Boolean.valueOf(j.getBoolean(i5, false));
        }
        j.recycle();
        b(context2);
    }
}
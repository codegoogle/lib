package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: LinearProgressIndicator.java */
/* loaded from: classes3.dex */
public final class ng2 extends zf2<og2> {
    public static final int Q = ga2.n.Rh;
    public static final int R = 0;
    public static final int S = 1;
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public static final int W = 3;

    /* compiled from: LinearProgressIndicator.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    /* compiled from: LinearProgressIndicator.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface b {
    }

    public ng2(@x1 Context context) {
        this(context, null);
    }

    private void u() {
        setIndeterminateDrawable(jg2.y(getContext(), (og2) this.C));
        setProgressDrawable(fg2.B(getContext(), (og2) this.C));
    }

    public int getIndeterminateAnimationType() {
        return ((og2) this.C).g;
    }

    public int getIndicatorDirection() {
        return ((og2) this.C).h;
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.C;
        og2 og2Var = (og2) s;
        boolean z2 = true;
        if (((og2) s).h != 1 && ((sr.Y(this) != 1 || ((og2) this.C).h != 2) && (sr.Y(this) != 0 || ((og2) this.C).h != 3))) {
            z2 = false;
        }
        og2Var.i = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        jg2<og2> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        fg2<og2> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    @Override // com.p7700g.p99005.zf2
    public void p(int i, boolean z) {
        S s = this.C;
        if (s != 0 && ((og2) s).g == 0 && isIndeterminate()) {
            return;
        }
        super.p(i, z);
    }

    public void setIndeterminateAnimationType(int i) {
        if (((og2) this.C).g == i) {
            return;
        }
        if (s() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s = this.C;
        ((og2) s).g = i;
        ((og2) s).e();
        if (i == 0) {
            getIndeterminateDrawable().B(new lg2((og2) this.C));
        } else {
            getIndeterminateDrawable().B(new mg2(getContext(), (og2) this.C));
        }
        invalidate();
    }

    @Override // com.p7700g.p99005.zf2
    public void setIndicatorColor(@x1 int... iArr) {
        super.setIndicatorColor(iArr);
        ((og2) this.C).e();
    }

    public void setIndicatorDirection(int i) {
        S s = this.C;
        ((og2) s).h = i;
        og2 og2Var = (og2) s;
        boolean z = true;
        if (i != 1 && ((sr.Y(this) != 1 || ((og2) this.C).h != 2) && (sr.Y(this) != 0 || i != 3))) {
            z = false;
        }
        og2Var.i = z;
        invalidate();
    }

    @Override // com.p7700g.p99005.zf2
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((og2) this.C).e();
        invalidate();
    }

    @Override // com.p7700g.p99005.zf2
    /* renamed from: t */
    public og2 i(@x1 Context context, @x1 AttributeSet attributeSet) {
        return new og2(context, attributeSet);
    }

    public ng2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.fa);
    }

    public ng2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        super(context, attributeSet, i, Q);
        u();
    }
}
package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularProgressIndicator.java */
/* loaded from: classes3.dex */
public final class dg2 extends zf2<eg2> {
    public static final int Q = ga2.n.Fh;
    public static final int R = 0;
    public static final int S = 1;

    /* compiled from: CircularProgressIndicator.java */
    @i2({i2.a.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface a {
    }

    public dg2(@x1 Context context) {
        this(context, null);
    }

    private void u() {
        setIndeterminateDrawable(jg2.x(getContext(), (eg2) this.C));
        setProgressDrawable(fg2.A(getContext(), (eg2) this.C));
    }

    public int getIndicatorDirection() {
        return ((eg2) this.C).i;
    }

    @c2
    public int getIndicatorInset() {
        return ((eg2) this.C).h;
    }

    @c2
    public int getIndicatorSize() {
        return ((eg2) this.C).g;
    }

    public void setIndicatorDirection(int i) {
        ((eg2) this.C).i = i;
        invalidate();
    }

    public void setIndicatorInset(@c2 int i) {
        S s = this.C;
        if (((eg2) s).h != i) {
            ((eg2) s).h = i;
            invalidate();
        }
    }

    public void setIndicatorSize(@c2 int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.C;
        if (((eg2) s).g != max) {
            ((eg2) s).g = max;
            ((eg2) s).e();
            invalidate();
        }
    }

    @Override // com.p7700g.p99005.zf2
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((eg2) this.C).e();
    }

    @Override // com.p7700g.p99005.zf2
    /* renamed from: t */
    public eg2 i(@x1 Context context, @x1 AttributeSet attributeSet) {
        return new eg2(context, attributeSet);
    }

    public dg2(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, ga2.c.h2);
    }

    public dg2(@x1 Context context, @z1 AttributeSet attributeSet, @q0 int i) {
        super(context, attributeSet, i, Q);
        u();
    }
}
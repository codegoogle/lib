package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p7700g.p99005.di2;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.kc2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements di2 {
    private TextView s;
    private Button t;
    private int u;

    public SnackbarContentLayout(@x1 Context context) {
        this(context, null);
    }

    private static void d(@x1 View view, int i, int i2) {
        if (sr.X0(view)) {
            sr.c2(view, sr.j0(view), i, sr.i0(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean e(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.s.getPaddingTop() == i2 && this.s.getPaddingBottom() == i3) {
            return z;
        }
        d(this.s, i2, i3);
        return true;
    }

    @Override // com.p7700g.p99005.di2
    public void a(int i, int i2) {
        this.s.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.s.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.t.getVisibility() == 0) {
            this.t.setAlpha(0.0f);
            this.t.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.p7700g.p99005.di2
    public void b(int i, int i2) {
        this.s.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.s.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.t.getVisibility() == 0) {
            this.t.setAlpha(1.0f);
            this.t.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public void c(float f) {
        if (f != 1.0f) {
            this.t.setTextColor(kc2.m(kc2.d(this, ga2.c.o3), this.t.getCurrentTextColor(), f));
        }
    }

    public Button getActionView() {
        return this.t;
    }

    public TextView getMessageView() {
        return this.s;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.s = (TextView) findViewById(ga2.h.R4);
        this.t = (Button) findViewById(ga2.h.Q4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (e(1, r0, r0 - r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (e(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = true;
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(ga2.f.E1);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(ga2.f.D1);
        boolean z2 = this.s.getLayout().getLineCount() > 1;
        if (!z2 || this.u <= 0 || this.t.getMeasuredWidth() <= this.u) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.u = i;
    }

    public SnackbarContentLayout(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
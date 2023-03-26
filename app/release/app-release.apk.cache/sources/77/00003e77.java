package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Group.java */
/* loaded from: classes.dex */
public class df extends xe {
    public df(Context context) {
        super(context);
    }

    @Override // com.p7700g.p99005.xe
    public void D(ConstraintLayout container) {
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        bVar.T0.c2(0);
        bVar.T0.y1(0);
    }

    @Override // com.p7700g.p99005.xe, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        p();
    }

    @Override // com.p7700g.p99005.xe
    public void r(ConstraintLayout container) {
        q(container);
    }

    @Override // android.view.View
    public void setElevation(float elevation) {
        super.setElevation(elevation);
        p();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        p();
    }

    @Override // com.p7700g.p99005.xe
    public void y(AttributeSet attrs) {
        super.y(attrs);
        this.w = false;
    }

    public df(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public df(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
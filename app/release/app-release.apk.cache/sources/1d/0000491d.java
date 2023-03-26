package com.p7700g.p99005;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: classes.dex */
public final class is extends ClickableSpan {
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public static final String s = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int t;
    private final ls u;
    private final int v;

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public is(int i, @x1 ls lsVar, int i2) {
        this.t = i;
        this.u = lsVar;
        this.v = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(@x1 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(s, this.t);
        this.u.H0(this.v, bundle);
    }
}
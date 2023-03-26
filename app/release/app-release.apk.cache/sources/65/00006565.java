package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: HTextView.java */
/* loaded from: classes3.dex */
public abstract class xd3 extends TextView {
    public xd3(Context context) {
        this(context, null);
    }

    public abstract void a(CharSequence charSequence);

    public abstract void setAnimationListener(qd3 qd3Var);

    public abstract void setProgress(float f);

    public xd3(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public xd3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
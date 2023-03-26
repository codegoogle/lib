package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import com.p7700g.p99005.i2;

/* compiled from: VisibilityAwareImageButton.java */
@i2({i2.a.LIBRARY_GROUP})
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes3.dex */
public class lf2 extends ImageButton {
    private int s;

    public lf2(Context context) {
        this(context, null);
    }

    public final void c(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.s = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.s;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        c(i, true);
    }

    public lf2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public lf2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = getVisibility();
    }
}
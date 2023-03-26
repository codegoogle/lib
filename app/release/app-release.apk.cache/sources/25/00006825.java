package com.p7700g.p99005;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import com.p7700g.p99005.i2;

/* compiled from: EmojiTransformationMethod.java */
@e2(19)
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class yw implements TransformationMethod {
    @z1
    private final TransformationMethod s;

    public yw(@z1 TransformationMethod transformationMethod) {
        this.s = transformationMethod;
    }

    public TransformationMethod a() {
        return this.s;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(@z1 CharSequence charSequence, @x1 View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.s;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || fv.b().f() != 1) ? charSequence : fv.b().u(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.s;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
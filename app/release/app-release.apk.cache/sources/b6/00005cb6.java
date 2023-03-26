package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableCompoundDrawablesView.java */
/* loaded from: classes.dex */
public interface st {
    @z1
    ColorStateList getSupportCompoundDrawablesTintList();

    @z1
    PorterDuff.Mode getSupportCompoundDrawablesTintMode();

    void setSupportCompoundDrawablesTintList(@z1 ColorStateList colorStateList);

    void setSupportCompoundDrawablesTintMode(@z1 PorterDuff.Mode mode);
}
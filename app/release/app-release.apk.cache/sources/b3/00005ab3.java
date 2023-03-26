package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableCompoundButton.java */
/* loaded from: classes.dex */
public interface rt {
    @z1
    ColorStateList getSupportButtonTintList();

    @z1
    PorterDuff.Mode getSupportButtonTintMode();

    void setSupportButtonTintList(@z1 ColorStateList colorStateList);

    void setSupportButtonTintMode(@z1 PorterDuff.Mode mode);
}
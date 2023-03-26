package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;

/* compiled from: TintableBackgroundView.java */
/* loaded from: classes.dex */
public interface qr {
    @z1
    ColorStateList getSupportBackgroundTintList();

    @z1
    PorterDuff.Mode getSupportBackgroundTintMode();

    void setSupportBackgroundTintList(@z1 ColorStateList colorStateList);

    void setSupportBackgroundTintMode(@z1 PorterDuff.Mode mode);
}
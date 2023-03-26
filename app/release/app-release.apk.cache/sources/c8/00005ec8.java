package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.p7700g.p99005.i2;

/* compiled from: TintableImageSourceView.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface tt {
    @z1
    ColorStateList getSupportImageTintList();

    @z1
    PorterDuff.Mode getSupportImageTintMode();

    void setSupportImageTintList(@z1 ColorStateList colorStateList);

    void setSupportImageTintMode(@z1 PorterDuff.Mode mode);
}
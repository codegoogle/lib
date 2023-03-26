package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import com.p7700g.p99005.i2;

/* compiled from: TintableCheckedTextView.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public interface qt {
    @z1
    ColorStateList getSupportCheckMarkTintList();

    @z1
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@z1 ColorStateList colorStateList);

    void setSupportCheckMarkTintMode(@z1 PorterDuff.Mode mode);
}
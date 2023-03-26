package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import org.jetbrains.annotations.NotNull;

/* compiled from: ColorDrawable.kt */
@vo4(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0086\b¨\u0006\u0004"}, d2 = {"toDrawable", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/graphics/Color;", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ek {
    @NotNull
    public static final ColorDrawable a(@w0 int i) {
        return new ColorDrawable(i);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorDrawable b(@NotNull Color color) {
        c25.p(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
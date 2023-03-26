package com.p7700g.p99005;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import org.jetbrains.annotations.NotNull;

/* compiled from: PorterDuff.kt */
@vo4(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b\u001a\r\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0086\b¨\u0006\u0007"}, d2 = {"toColorFilter", "Landroid/graphics/PorterDuffColorFilter;", "Landroid/graphics/PorterDuff$Mode;", "color", "", "toXfermode", "Landroid/graphics/PorterDuffXfermode;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class rj {
    @NotNull
    public static final PorterDuffColorFilter a(@NotNull PorterDuff.Mode mode, int i) {
        c25.p(mode, "<this>");
        return new PorterDuffColorFilter(i, mode);
    }

    @NotNull
    public static final PorterDuffXfermode b(@NotNull PorterDuff.Mode mode) {
        c25.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
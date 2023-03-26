package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Picture;
import org.jetbrains.annotations.NotNull;

/* compiled from: Picture.kt */
@vo4(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"record", "Landroid/graphics/Picture;", "width", "", "height", "block", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "", "Lkotlin/ExtensionFunctionType;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pj {
    @NotNull
    public static final Picture a(@NotNull Picture picture, int i, int i2, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(picture, "<this>");
        c25.p(f05Var, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        c25.o(beginRecording, "beginRecording(width, height)");
        try {
            f05Var.M(beginRecording);
            return picture;
        } finally {
            z15.d(1);
            picture.endRecording();
            z15.c(1);
        }
    }
}
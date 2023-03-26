package com.p7700g.p99005;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypedArray.kt */
@e2(26)
@vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Landroidx/core/content/res/TypedArrayApi26ImplKt;", "", "()V", "getFont", "Landroid/graphics/Typeface;", "typedArray", "Landroid/content/res/TypedArray;", la1.l, "", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class pi {
    @NotNull
    public static final pi a = new pi();

    private pi() {
    }

    @e1
    @jz4
    @NotNull
    public static final Typeface a(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i);
        c25.m(font);
        return font;
    }
}
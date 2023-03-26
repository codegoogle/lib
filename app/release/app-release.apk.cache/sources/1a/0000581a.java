package com.p7700g.p99005;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypedArray.kt */
@vo4(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\b\u001a\u00020\t*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\f\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0010\u001a\u00020\u000b*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0011\u001a\u00020\u0012*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0014\u0010\u0014\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0015\u001a\u00020\u0004*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u001b\u001a\u0014\u0010\u001c\u001a\u00020\u001a*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u001a/\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u00022\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H\u001e0 H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"checkAttribute", "", "Landroid/content/res/TypedArray;", la1.l, "", "getBooleanOrThrow", "", "getColorOrThrow", "getColorStateListOrThrow", "Landroid/content/res/ColorStateList;", "getDimensionOrThrow", "", "getDimensionPixelOffsetOrThrow", "getDimensionPixelSizeOrThrow", "getDrawableOrThrow", "Landroid/graphics/drawable/Drawable;", "getFloatOrThrow", "getFontOrThrow", "Landroid/graphics/Typeface;", "getIntOrThrow", "getIntegerOrThrow", "getResourceIdOrThrow", "getStringOrThrow", "", "getTextArrayOrThrow", "", "", "(Landroid/content/res/TypedArray;I)[Ljava/lang/CharSequence;", "getTextOrThrow", "use", "R", "block", "Lkotlin/Function1;", "(Landroid/content/res/TypedArray;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class qi {
    private static final void a(TypedArray typedArray, @n2 int i) {
        if (!typedArray.hasValue(i)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getBoolean(i, false);
    }

    @w0
    public static final int c(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getColor(i, 0);
    }

    @NotNull
    public static final ColorStateList d(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        ColorStateList colorStateList = typedArray.getColorStateList(i);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getDimension(i, 0.0f);
    }

    @b1
    public static final int f(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getDimensionPixelOffset(i, 0);
    }

    @b1
    public static final int g(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getDimensionPixelSize(i, 0);
    }

    @NotNull
    public static final Drawable h(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        Drawable drawable = typedArray.getDrawable(i);
        c25.m(drawable);
        return drawable;
    }

    public static final float i(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getFloat(i, 0.0f);
    }

    @e2(26)
    @NotNull
    public static final Typeface j(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return pi.a(typedArray, i);
    }

    public static final int k(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getInt(i, 0);
    }

    public static final int l(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getInteger(i, 0);
    }

    @n0
    public static final int m(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        return typedArray.getResourceId(i, 0);
    }

    @NotNull
    public static final String n(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        String string = typedArray.getString(i);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @NotNull
    public static final CharSequence[] o(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        CharSequence[] textArray = typedArray.getTextArray(i);
        c25.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @NotNull
    public static final CharSequence p(@NotNull TypedArray typedArray, @n2 int i) {
        c25.p(typedArray, "<this>");
        a(typedArray, i);
        CharSequence text = typedArray.getText(i);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@NotNull TypedArray typedArray, @NotNull f05<? super TypedArray, ? extends R> f05Var) {
        c25.p(typedArray, "<this>");
        c25.p(f05Var, "block");
        R M = f05Var.M(typedArray);
        typedArray.recycle();
        return M;
    }
}
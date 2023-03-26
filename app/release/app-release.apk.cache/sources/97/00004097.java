package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.ColorSpace;
import org.jetbrains.annotations.NotNull;

/* compiled from: Color.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u0018\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001a\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001a\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001b\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001b\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0019H\u0087\n\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\r\u0010\u001c\u001a\u00020\u0004*\u00020\u0005H\u0087\n\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0087\f\u001a\u0015\u0010\u001d\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\t\u001a\u00020\u001eH\u0087\f\u001a\u0015\u0010\u001f\u001a\u00020\u0019*\u00020\u00192\u0006\u0010 \u001a\u00020\u0019H\u0087\u0002\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0001H\u0087\b\u001a\r\u0010!\u001a\u00020\u0019*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\"\u001a\u00020\u0001*\u00020#H\u0087\b\u001a\r\u0010$\u001a\u00020\u0005*\u00020\u0001H\u0087\b\"\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0000\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006\"\u0016\u0010\u0007\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006\"\u0016\u0010\t\u001a\u00020\n*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\"\u0016\u0010\u000f\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011\"\u0016\u0010\u0012\u001a\u00020\u0010*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00018Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0016\u0010\u0013\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006\"\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u00018Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0003\"\u0016\u0010\u0016\u001a\u00020\u0004*\u00020\u00058Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006¨\u0006%"}, d2 = {"alpha", "", "getAlpha", "(I)I", "", "", "(J)F", "blue", "getBlue", "colorSpace", "Landroid/graphics/ColorSpace;", "getColorSpace", "(J)Landroid/graphics/ColorSpace;", "green", "getGreen", "isSrgb", "", "(J)Z", "isWideGamut", "luminance", "getLuminance", "(I)F", "red", "getRed", "component1", "Landroid/graphics/Color;", "component2", "component3", "component4", "convertTo", "Landroid/graphics/ColorSpace$Named;", "plus", "c", "toColor", "toColorInt", "", "toColorLong", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ej {
    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float A(long j) {
        return Color.luminance(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float B(long j) {
        return Color.red(j);
    }

    public static final int C(@w0 int i) {
        return (i >> 16) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean D(long j) {
        return Color.isSrgb(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final boolean E(long j) {
        return Color.isWideGamut(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color F(@NotNull Color color, @NotNull Color color2) {
        c25.p(color, "<this>");
        c25.p(color2, "c");
        Color u = fj.u(color2, color);
        c25.o(u, "compositeColors(c, this)");
        return u;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color G(@w0 int i) {
        Color valueOf = Color.valueOf(i);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color H(long j) {
        Color valueOf = Color.valueOf(j);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @e2(26)
    @w0
    @SuppressLint({"ClassVerificationFailure"})
    public static final int I(long j) {
        return Color.toArgb(j);
    }

    @w0
    public static final int J(@NotNull String str) {
        c25.p(str, "<this>");
        return Color.parseColor(str);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long K(@w0 int i) {
        return Color.pack(i);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float a(long j) {
        return Color.red(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float b(@NotNull Color color) {
        c25.p(color, "<this>");
        return color.getComponent(0);
    }

    public static final int c(@w0 int i) {
        return (i >> 24) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float d(long j) {
        return Color.green(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float e(@NotNull Color color) {
        c25.p(color, "<this>");
        return color.getComponent(1);
    }

    public static final int f(@w0 int i) {
        return (i >> 16) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float g(long j) {
        return Color.blue(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float h(@NotNull Color color) {
        c25.p(color, "<this>");
        return color.getComponent(2);
    }

    public static final int i(@w0 int i) {
        return (i >> 8) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float j(long j) {
        return Color.alpha(j);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float k(@NotNull Color color) {
        c25.p(color, "<this>");
        return color.getComponent(3);
    }

    public static final int l(@w0 int i) {
        return i & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long m(@w0 int i, @NotNull ColorSpace.Named named) {
        c25.p(named, "colorSpace");
        return Color.convert(i, ColorSpace.get(named));
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long n(@w0 int i, @NotNull ColorSpace colorSpace) {
        c25.p(colorSpace, "colorSpace");
        return Color.convert(i, colorSpace);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long o(long j, @NotNull ColorSpace.Named named) {
        c25.p(named, "colorSpace");
        return Color.convert(j, ColorSpace.get(named));
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final long p(long j, @NotNull ColorSpace colorSpace) {
        c25.p(colorSpace, "colorSpace");
        return Color.convert(j, colorSpace);
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color q(@NotNull Color color, @NotNull ColorSpace.Named named) {
        c25.p(color, "<this>");
        c25.p(named, "colorSpace");
        Color convert = color.convert(ColorSpace.get(named));
        c25.o(convert, "convert(ColorSpace.get(colorSpace))");
        return convert;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final Color r(@NotNull Color color, @NotNull ColorSpace colorSpace) {
        c25.p(color, "<this>");
        c25.p(colorSpace, "colorSpace");
        Color convert = color.convert(colorSpace);
        c25.o(convert, "convert(colorSpace)");
        return convert;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float s(long j) {
        return Color.alpha(j);
    }

    public static final int t(@w0 int i) {
        return (i >> 24) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float u(long j) {
        return Color.blue(j);
    }

    public static final int v(@w0 int i) {
        return i & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    @NotNull
    public static final ColorSpace w(long j) {
        ColorSpace colorSpace = Color.colorSpace(j);
        c25.o(colorSpace, "colorSpace(this)");
        return colorSpace;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float x(long j) {
        return Color.green(j);
    }

    public static final int y(@w0 int i) {
        return (i >> 8) & 255;
    }

    @e2(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final float z(@w0 int i) {
        return Color.luminance(i);
    }
}
package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import com.p7700g.p99005.i2;

/* compiled from: RippleUtils.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class yg2 {
    public static final boolean a = true;
    private static final int[] b = {16842919};
    private static final int[] c = {16843623, 16842908};
    private static final int[] d = {16842908};
    private static final int[] e = {16843623};
    private static final int[] f = {16842913, 16842919};
    private static final int[] g = {16842913, 16843623, 16842908};
    private static final int[] h = {16842913, 16842908};
    private static final int[] i = {16842913, 16843623};
    private static final int[] j = {16842913};
    private static final int[] k = {16842910, 16842919};
    @r2
    public static final String l = yg2.class.getSimpleName();
    @r2
    public static final String m = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    private yg2() {
    }

    @x1
    public static ColorStateList a(@z1 ColorStateList colorStateList) {
        if (a) {
            return new ColorStateList(new int[][]{j, StateSet.NOTHING}, new int[]{c(colorStateList, f), c(colorStateList, b)});
        }
        int[] iArr = f;
        int[] iArr2 = g;
        int[] iArr3 = h;
        int[] iArr4 = i;
        int[] iArr5 = b;
        int[] iArr6 = c;
        int[] iArr7 = d;
        int[] iArr8 = e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    @w0
    @TargetApi(21)
    private static int b(@w0 int i2) {
        return fj.B(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    @w0
    private static int c(@z1 ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return a ? b(colorForState) : colorForState;
    }

    @x1
    public static ColorStateList d(@z1 ColorStateList colorStateList) {
        if (colorStateList != null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(k, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean e(@x1 int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
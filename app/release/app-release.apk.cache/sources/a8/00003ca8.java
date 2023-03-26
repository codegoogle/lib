package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: ThemeEnforcement.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class cf2 {
    private static final String b = "Theme.AppCompat";
    private static final String d = "Theme.MaterialComponents";
    private static final int[] a = {ga2.c.f3};
    private static final int[] c = {ga2.c.k3};

    private cf2() {
    }

    public static void a(@x1 Context context) {
        e(context, a, b);
    }

    private static void b(@x1 Context context, AttributeSet attributeSet, @q0 int i, @m2 int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.ev, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(ga2.o.gv, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(ga2.c.a8, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(@x1 Context context) {
        e(context, c, d);
    }

    private static void d(@x1 Context context, AttributeSet attributeSet, @x1 @n2 int[] iArr, @q0 int i, @m2 int i2, @n2 @z1 int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ga2.o.ev, i, i2);
        if (!obtainStyledAttributes.getBoolean(ga2.o.hv, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = g(context, attributeSet, iArr, i, i2, iArr2);
        } else {
            z = obtainStyledAttributes.getResourceId(ga2.o.fv, -1) != -1;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    private static void e(@x1 Context context, @x1 int[] iArr, String str) {
        if (!i(context, iArr)) {
            throw new IllegalArgumentException(wo1.u("The style on this component requires your app theme to be ", str, " (or a descendant)."));
        }
    }

    public static boolean f(@x1 Context context) {
        return i(context, a);
    }

    private static boolean g(@x1 Context context, AttributeSet attributeSet, @x1 @n2 int[] iArr, @q0 int i, @m2 int i2, @x1 @n2 int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean h(@x1 Context context) {
        return i(context, c);
    }

    private static boolean i(@x1 Context context, @x1 int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    @x1
    public static TypedArray j(@x1 Context context, AttributeSet attributeSet, @x1 @n2 int[] iArr, @q0 int i, @m2 int i2, @n2 int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static TintTypedArray k(@x1 Context context, AttributeSet attributeSet, @x1 @n2 int[] iArr, @q0 int i, @m2 int i2, @n2 int... iArr2) {
        b(context, attributeSet, i, i2);
        d(context, attributeSet, iArr, i, i2, iArr2);
        return TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i, i2);
    }
}
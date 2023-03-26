package com.p7700g.p99005;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import androidx.appcompat.widget.TintTypedArray;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.i2;

/* compiled from: MaterialResources.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class sg2 {
    private static final float a = 1.3f;
    private static final float b = 2.0f;

    private sg2() {
    }

    @z1
    public static ColorStateList a(@x1 Context context, @x1 TypedArray typedArray, @n2 int i) {
        int resourceId;
        ColorStateList a2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a2 = r3.a(context, resourceId)) == null) ? typedArray.getColorStateList(i) : a2;
    }

    @z1
    public static ColorStateList b(@x1 Context context, @x1 TintTypedArray tintTypedArray, @n2 int i) {
        int resourceId;
        ColorStateList a2;
        return (!tintTypedArray.hasValue(i) || (resourceId = tintTypedArray.getResourceId(i, 0)) == 0 || (a2 = r3.a(context, resourceId)) == null) ? tintTypedArray.getColorStateList(i) : a2;
    }

    private static int c(TypedValue typedValue) {
        if (Build.VERSION.SDK_INT >= 22) {
            return typedValue.getComplexUnit();
        }
        return (typedValue.data >> 0) & 15;
    }

    public static int d(@x1 Context context, @x1 TypedArray typedArray, @n2 int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i, i2);
    }

    @z1
    public static Drawable e(@x1 Context context, @x1 TypedArray typedArray, @n2 int i) {
        int resourceId;
        Drawable b2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b2 = r3.b(context, resourceId)) == null) ? typedArray.getDrawable(i) : b2;
    }

    @n2
    public static int f(@x1 TypedArray typedArray, @n2 int i, @n2 int i2) {
        return typedArray.hasValue(i) ? i : i2;
    }

    @z1
    public static tg2 g(@x1 Context context, @x1 TypedArray typedArray, @n2 int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return new tg2(context, resourceId);
    }

    public static int h(@x1 Context context, @m2 int i, int i2) {
        if (i == 0) {
            return i2;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ga2.o.vt);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(ga2.o.wt, typedValue);
        obtainStyledAttributes.recycle();
        if (value) {
            if (c(typedValue) == 2) {
                return Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density);
            }
            return TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return i2;
    }

    public static boolean i(@x1 Context context) {
        return context.getResources().getConfiguration().fontScale >= a;
    }

    public static boolean j(@x1 Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
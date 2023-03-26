package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.widget.ImageView;
import com.greedygame.mystique2.models.ScaleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b43 {
    public static final float a(@NotNull Context context, @NotNull String str, float f) {
        float applyDimension;
        c25.p(context, "<this>");
        c25.p(str, "value");
        Float J0 = z85.J0(c95.c4(str, "@"));
        Float f2 = null;
        if (J0 != null) {
            float floatValue = J0.floatValue();
            if (b95.u2(str, "@", false, 2, null)) {
                applyDimension = TypedValue.applyDimension(1, floatValue, context.getResources().getDisplayMetrics());
            } else {
                applyDimension = TypedValue.applyDimension(0, Float.parseFloat(str), context.getResources().getDisplayMetrics());
            }
            f2 = Float.valueOf(applyDimension);
        }
        if (f2 == null) {
            xz2.c("Mystique2Functions", "Malformed value");
            return f;
        }
        return f2.floatValue();
    }

    public static /* synthetic */ float b(Context context, String str, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return a(context, str, f);
    }

    public static final int c(@NotNull Context context, @NotNull String str, int i) {
        c25.p(context, "<this>");
        c25.p(str, "value");
        Float J0 = z85.J0(c95.c4(str, "@"));
        Integer valueOf = J0 == null ? null : Integer.valueOf((int) TypedValue.applyDimension(1, J0.floatValue(), context.getResources().getDisplayMetrics()));
        if (valueOf == null) {
            xz2.c("Mystique2Functions", "Malformed Value");
            return i;
        }
        return valueOf.intValue();
    }

    public static /* synthetic */ int d(Context context, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c(context, str, i);
    }

    @Nullable
    public static final Bitmap e(@NotNull Bitmap bitmap, int i, int i2) {
        c25.p(bitmap, "<this>");
        float f = i;
        float width = bitmap.getWidth();
        float f2 = i2;
        float height = bitmap.getHeight();
        float max = Math.max(f / width, f2 / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = 2;
        float f6 = (f - f3) / f5;
        float f7 = (f2 - f4) / f5;
        RectF rectF = new RectF(f6, f7, f3 + f6, f4 + f7);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, bitmap.getConfig());
        new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
        return createBitmap;
    }

    @NotNull
    public static final jk f(@NotNull Bitmap bitmap, @NotNull Context context, float f) {
        c25.p(bitmap, "<this>");
        c25.p(context, "context");
        jk a = kk.a(context.getResources(), bitmap);
        c25.o(a, "create(context.resources, this)");
        a.setFilterBitmap(true);
        a.k(true);
        a.m(f);
        return a;
    }

    public static final void g(@NotNull ImageView imageView, @Nullable String str) {
        ImageView.ScaleType scaleType;
        c25.p(imageView, "<this>");
        if (c25.g(str, ScaleType.CENTER.getValue())) {
            scaleType = ImageView.ScaleType.CENTER;
        } else if (c25.g(str, ScaleType.CENTER_CROP.getValue())) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (c25.g(str, ScaleType.CENTER_INSIDE.getValue())) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else if (c25.g(str, ScaleType.FIT_START.getValue())) {
            scaleType = ImageView.ScaleType.FIT_START;
        } else if (c25.g(str, ScaleType.FIT_CENTER.getValue())) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        } else if (c25.g(str, ScaleType.FIT_END.getValue())) {
            scaleType = ImageView.ScaleType.FIT_END;
        } else if (c25.g(str, ScaleType.FIT_XY.getValue())) {
            scaleType = ImageView.ScaleType.FIT_XY;
        } else {
            scaleType = c25.g(str, ScaleType.MATRIX.getValue()) ? ImageView.ScaleType.MATRIX : ImageView.ScaleType.CENTER_INSIDE;
        }
        imageView.setScaleType(scaleType);
    }
}
package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import java.lang.reflect.Field;

/* compiled from: ImageViewUtils.java */
/* loaded from: classes.dex */
public class f80 {
    private static boolean a = true;
    private static Field b;
    private static boolean c;

    private f80() {
    }

    public static void a(@x1 ImageView imageView, @z1 Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
        } else if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
            }
        } else {
            c(imageView, matrix);
        }
    }

    private static void b() {
        if (c) {
            return;
        }
        try {
            Field declaredField = ImageView.class.getDeclaredField("mDrawMatrix");
            b = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException unused) {
        }
        c = true;
    }

    @e2(21)
    @SuppressLint({"NewApi"})
    private static void c(@x1 ImageView imageView, @z1 Matrix matrix) {
        if (a) {
            try {
                imageView.animateTransform(matrix);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import com.p7700g.p99005.m80;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsBase.java */
/* loaded from: classes.dex */
public class q90 {
    private static final String a = "ViewUtilsBase";
    private static Method b = null;
    private static boolean c = false;
    private static Field d = null;
    private static boolean e = false;
    private static final int f = 12;
    private float[] g;

    @SuppressLint({"PrivateApi"})
    private void b() {
        if (c) {
            return;
        }
        try {
            Class cls = Integer.TYPE;
            Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
            b = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        c = true;
    }

    public void a(@x1 View view) {
        if (view.getVisibility() == 0) {
            view.setTag(m80.e.y, null);
        }
    }

    public float c(@x1 View view) {
        Float f2 = (Float) view.getTag(m80.e.y);
        if (f2 != null) {
            return view.getAlpha() / f2.floatValue();
        }
        return view.getAlpha();
    }

    public void d(@x1 View view) {
        int i = m80.e.y;
        if (view.getTag(i) == null) {
            view.setTag(i, Float.valueOf(view.getAlpha()));
        }
    }

    public void e(@x1 View view, @z1 Matrix matrix) {
        if (matrix != null && !matrix.isIdentity()) {
            float[] fArr = this.g;
            if (fArr == null) {
                fArr = new float[9];
                this.g = fArr;
            }
            matrix.getValues(fArr);
            float f2 = fArr[3];
            float sqrt = ((float) Math.sqrt(1.0f - (f2 * f2))) * (fArr[0] < 0.0f ? -1 : 1);
            float degrees = (float) Math.toDegrees(Math.atan2(f2, sqrt));
            float f3 = fArr[0] / sqrt;
            float f4 = fArr[4] / sqrt;
            float f5 = fArr[2];
            float f6 = fArr[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(f5);
            view.setTranslationY(f6);
            view.setRotation(degrees);
            view.setScaleX(f3);
            view.setScaleY(f4);
            return;
        }
        view.setPivotX(view.getWidth() / 2);
        view.setPivotY(view.getHeight() / 2);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
    }

    public void f(@x1 View view, int i, int i2, int i3, int i4) {
        b();
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void g(@x1 View view, float f2) {
        Float f3 = (Float) view.getTag(m80.e.y);
        if (f3 != null) {
            view.setAlpha(f3.floatValue() * f2);
        } else {
            view.setAlpha(f2);
        }
    }

    public void h(@x1 View view, int i) {
        if (!e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            e = true;
        }
        Field field = d;
        if (field != null) {
            try {
                d.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void i(@x1 View view, @x1 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            i(view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    public void j(@x1 View view, @x1 Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            j(view2, matrix);
            matrix.postTranslate(view2.getScrollX(), view2.getScrollY());
        }
        matrix.postTranslate(-view.getLeft(), -view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (matrix2.isIdentity()) {
            return;
        }
        Matrix matrix3 = new Matrix();
        if (matrix2.invert(matrix3)) {
            matrix.postConcat(matrix3);
        }
    }
}
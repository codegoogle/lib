package com.p7700g.p99005;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* compiled from: Canvas.kt */
@vo4(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\t2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a1\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\b\u001a\u00020\n2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aI\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a3\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aG\u0010\u0014\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a)\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001aQ\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a=\u0010\u001c\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a=\u0010\u001d\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\f2\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e"}, d2 = {"withClip", "", "Landroid/graphics/Canvas;", "clipPath", "Landroid/graphics/Path;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "clipRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "left", "", "top", "right", "bottom", "", "withMatrix", "matrix", "Landroid/graphics/Matrix;", "withRotation", "degrees", "pivotX", "pivotY", "withSave", "withScale", "x", "y", "withSkew", "withTranslation", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class dj {
    public static final void a(@NotNull Canvas canvas, float f, float f2, float f3, float f4, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void b(@NotNull Canvas canvas, int i, int i2, int i3, int i4, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.clipRect(i, i2, i3, i4);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void c(@NotNull Canvas canvas, @NotNull Path path, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(path, "clipPath");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.clipPath(path);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void d(@NotNull Canvas canvas, @NotNull Rect rect, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(rect, "clipRect");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.clipRect(rect);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void e(@NotNull Canvas canvas, @NotNull RectF rectF, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(rectF, "clipRect");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.clipRect(rectF);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void f(@NotNull Canvas canvas, @NotNull Matrix matrix, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(matrix, "matrix");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void g(Canvas canvas, Matrix matrix, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            matrix = new Matrix();
        }
        c25.p(canvas, "<this>");
        c25.p(matrix, "matrix");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.concat(matrix);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void h(@NotNull Canvas canvas, float f, float f2, float f3, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void i(Canvas canvas, float f, float f2, float f3, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.rotate(f, f2, f3);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void j(@NotNull Canvas canvas, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void k(@NotNull Canvas canvas, float f, float f2, float f3, float f4, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void l(Canvas canvas, float f, float f2, float f3, float f4, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.scale(f, f2, f3, f4);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void m(@NotNull Canvas canvas, float f, float f2, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void n(Canvas canvas, float f, float f2, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.skew(f, f2);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static final void o(@NotNull Canvas canvas, float f, float f2, @NotNull f05<? super Canvas, yq4> f05Var) {
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }

    public static /* synthetic */ void p(Canvas canvas, float f, float f2, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        c25.p(canvas, "<this>");
        c25.p(f05Var, "block");
        int save = canvas.save();
        canvas.translate(f, f2);
        try {
            f05Var.M(canvas);
        } finally {
            wo1.Y(1, canvas, save, 1);
        }
    }
}
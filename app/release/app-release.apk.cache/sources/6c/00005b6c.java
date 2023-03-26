package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p7700g.p99005.y80;
import java.util.Map;

/* compiled from: ChangeImageTransform.java */
/* loaded from: classes.dex */
public class s70 extends s80 {
    private static final String I0 = "android:changeImageTransform:matrix";
    private static final String J0 = "android:changeImageTransform:bounds";
    private static final String[] K0 = {I0, J0};
    private static final TypeEvaluator<Matrix> L0 = new a();
    private static final Property<ImageView, Matrix> M0 = new b(Matrix.class, "animatedTransform");

    /* compiled from: ChangeImageTransform.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<Matrix> {
        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            return null;
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* loaded from: classes.dex */
    public static class b extends Property<ImageView, Matrix> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Matrix get(ImageView imageView) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(ImageView imageView, Matrix matrix) {
            f80.a(imageView, matrix);
        }
    }

    /* compiled from: ChangeImageTransform.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public s70() {
    }

    private void Q0(z80 z80Var) {
        View view = z80Var.b;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() == null) {
                return;
            }
            Map<String, Object> map = z80Var.a;
            map.put(J0, new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            map.put(I0, S0(imageView));
        }
    }

    private static Matrix R0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        float width = imageView.getWidth();
        float f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        float height = imageView.getHeight();
        float f2 = intrinsicHeight;
        float max = Math.max(width / f, height / f2);
        int round = Math.round((width - (f * max)) / 2.0f);
        int round2 = Math.round((height - (f2 * max)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(round, round2);
        return matrix;
    }

    @x1
    private static Matrix S0(@x1 ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            int i = c.a[imageView.getScaleType().ordinal()];
            if (i == 1) {
                return V0(imageView);
            }
            if (i == 2) {
                return R0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }

    private ObjectAnimator T0(ImageView imageView, Matrix matrix, Matrix matrix2) {
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) M0, (TypeEvaluator) new y80.a(), (Object[]) new Matrix[]{matrix, matrix2});
    }

    @x1
    private ObjectAnimator U0(@x1 ImageView imageView) {
        Property<ImageView, Matrix> property = M0;
        TypeEvaluator<Matrix> typeEvaluator = L0;
        Matrix matrix = g80.a;
        return ObjectAnimator.ofObject(imageView, (Property<ImageView, V>) property, (TypeEvaluator) typeEvaluator, (Object[]) new Matrix[]{matrix, matrix});
    }

    private static Matrix V0(ImageView imageView) {
        Drawable drawable = imageView.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / drawable.getIntrinsicWidth(), imageView.getHeight() / drawable.getIntrinsicHeight());
        return matrix;
    }

    @Override // com.p7700g.p99005.s80
    public Animator A(@x1 ViewGroup viewGroup, z80 z80Var, z80 z80Var2) {
        if (z80Var == null || z80Var2 == null) {
            return null;
        }
        Rect rect = (Rect) z80Var.a.get(J0);
        Rect rect2 = (Rect) z80Var2.a.get(J0);
        if (rect == null || rect2 == null) {
            return null;
        }
        Matrix matrix = (Matrix) z80Var.a.get(I0);
        Matrix matrix2 = (Matrix) z80Var2.a.get(I0);
        boolean z = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals(matrix2));
        if (rect.equals(rect2) && z) {
            return null;
        }
        ImageView imageView = (ImageView) z80Var2.b;
        Drawable drawable = imageView.getDrawable();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            if (matrix == null) {
                matrix = g80.a;
            }
            if (matrix2 == null) {
                matrix2 = g80.a;
            }
            M0.set(imageView, matrix);
            return T0(imageView, matrix, matrix2);
        }
        return U0(imageView);
    }

    @Override // com.p7700g.p99005.s80
    public String[] h0() {
        return K0;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    public s70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
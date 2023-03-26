package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* compiled from: TransitionUtils.java */
/* loaded from: classes.dex */
public class y80 {
    private static final int a = 1048576;
    private static final boolean b;
    private static final boolean c;
    private static final boolean d;

    /* compiled from: TransitionUtils.java */
    /* loaded from: classes.dex */
    public static class a implements TypeEvaluator<Matrix> {
        public final float[] a = new float[9];
        public final float[] b = new float[9];
        public final Matrix c = new Matrix();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.b;
                float f2 = fArr[i];
                float[] fArr2 = this.a;
                fArr[i] = ((f2 - fArr2[i]) * f) + fArr2[i];
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        b = true;
        c = true;
        d = i >= 28;
    }

    private y80() {
    }

    public static View a(ViewGroup viewGroup, View view, View view2) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(-view2.getScrollX(), -view2.getScrollY());
        k90.j(view, matrix);
        k90.k(viewGroup, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        matrix.mapRect(rectF);
        int round = Math.round(rectF.left);
        int round2 = Math.round(rectF.top);
        int round3 = Math.round(rectF.right);
        int round4 = Math.round(rectF.bottom);
        ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap b2 = b(view, matrix, rectF, viewGroup);
        if (b2 != null) {
            imageView.setImageBitmap(b2);
        }
        imageView.measure(View.MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View.MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return imageView;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Bitmap b(View view, Matrix matrix, RectF rectF, ViewGroup viewGroup) {
        boolean z;
        boolean z2;
        boolean z3;
        ViewGroup viewGroup2;
        int i;
        int round;
        int round2;
        if (b) {
            z = !view.isAttachedToWindow();
            if (viewGroup != null) {
                z2 = viewGroup.isAttachedToWindow();
                z3 = c;
                Bitmap bitmap = null;
                if (z3 || !z) {
                    viewGroup2 = null;
                    i = 0;
                } else if (!z2) {
                    return null;
                } else {
                    viewGroup2 = (ViewGroup) view.getParent();
                    i = viewGroup2.indexOfChild(view);
                    viewGroup.getOverlay().add(view);
                }
                round = Math.round(rectF.width());
                round2 = Math.round(rectF.height());
                if (round > 0 && round2 > 0) {
                    float min = Math.min(1.0f, 1048576.0f / (round * round2));
                    int round3 = Math.round(round * min);
                    int round4 = Math.round(round2 * min);
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    matrix.postScale(min, min);
                    if (!d) {
                        Picture picture = new Picture();
                        Canvas beginRecording = picture.beginRecording(round3, round4);
                        beginRecording.concat(matrix);
                        view.draw(beginRecording);
                        picture.endRecording();
                        bitmap = Bitmap.createBitmap(picture);
                    } else {
                        bitmap = Bitmap.createBitmap(round3, round4, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmap);
                        canvas.concat(matrix);
                        view.draw(canvas);
                    }
                }
                if (z3 && z) {
                    viewGroup.getOverlay().remove(view);
                    viewGroup2.addView(view, i);
                }
                return bitmap;
            }
        } else {
            z = false;
        }
        z2 = false;
        z3 = c;
        Bitmap bitmap2 = null;
        if (z3) {
        }
        viewGroup2 = null;
        i = 0;
        round = Math.round(rectF.width());
        round2 = Math.round(rectF.height());
        if (round > 0) {
            float min2 = Math.min(1.0f, 1048576.0f / (round * round2));
            int round32 = Math.round(round * min2);
            int round42 = Math.round(round2 * min2);
            matrix.postTranslate(-rectF.left, -rectF.top);
            matrix.postScale(min2, min2);
            if (!d) {
            }
        }
        if (z3) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, i);
        }
        return bitmap2;
    }

    public static Animator c(Animator animator, Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animator, animator2);
        return animatorSet;
    }
}
package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: classes2.dex */
public final class ew1 {
    private static final String a = "TransformationUtils";
    public static final int b = 6;
    private static final int d = 7;
    private static final Paint f;
    private static final Set<String> g;
    private static final Lock h;
    private static final Paint c = new Paint(6);
    private static final Paint e = new Paint(7);

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes2.dex */
    public class a implements c {
        public final /* synthetic */ int a;

        public a(int i) {
            this.a = i;
        }

        @Override // com.p7700g.p99005.ew1.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i = this.a;
            canvas.drawRoundRect(rectF, i, i, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes2.dex */
    public class b implements c {
        public final /* synthetic */ float a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ float d;

        public b(float f, float f2, float f3, float f4) {
            this.a = f;
            this.b = f2;
            this.c = f3;
            this.d = f4;
        }

        @Override // com.p7700g.p99005.ew1.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f = this.a;
            float f2 = this.b;
            float f3 = this.c;
            float f4 = this.d;
            path.addRoundRect(rectF, new float[]{f, f, f2, f2, f3, f3, f4, f4}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes2.dex */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes2.dex */
    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @x1
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @x1 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        g = hashSet;
        h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private ew1() {
    }

    private static void a(@x1 Bitmap bitmap, @x1 Bitmap bitmap2, Matrix matrix) {
        Lock lock = h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, c);
            e(canvas);
            lock.unlock();
        } catch (Throwable th) {
            h.unlock();
            throw th;
        }
    }

    public static Bitmap b(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        float width;
        float height;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i2 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f2 + 0.5f), (int) (height + 0.5f));
        Bitmap b2 = ls1Var.b(i, i2, k(bitmap));
        t(bitmap, b2);
        a(bitmap, b2, matrix);
        return b2;
    }

    public static Bitmap c(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() <= i && bitmap.getHeight() <= i2) {
            Log.isLoggable(a, 2);
            return bitmap;
        }
        Log.isLoggable(a, 2);
        return f(ls1Var, bitmap, i, i2);
    }

    public static Bitmap d(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f2 = min;
        float f3 = f2 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f2 / width, f2 / height);
        float f4 = width * max;
        float f5 = max * height;
        float f6 = (f2 - f4) / 2.0f;
        float f7 = (f2 - f5) / 2.0f;
        RectF rectF = new RectF(f6, f7, f4 + f6, f5 + f7);
        Bitmap g2 = g(ls1Var, bitmap);
        Bitmap b2 = ls1Var.b(min, min, h(bitmap));
        b2.setHasAlpha(true);
        Lock lock = h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(b2);
            canvas.drawCircle(f3, f3, f3, e);
            canvas.drawBitmap(g2, (Rect) null, rectF, f);
            e(canvas);
            lock.unlock();
            if (!g2.equals(bitmap)) {
                ls1Var.a(g2);
            }
            return b2;
        } catch (Throwable th) {
            h.unlock();
            throw th;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable(a, 2);
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable(a, 2);
            return bitmap;
        }
        Bitmap b2 = ls1Var.b((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        t(bitmap, b2);
        if (Log.isLoggable(a, 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            b2.getWidth();
            b2.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, b2, matrix);
        return b2;
    }

    private static Bitmap g(@x1 ls1 ls1Var, @x1 Bitmap bitmap) {
        Bitmap.Config h2 = h(bitmap);
        if (h2.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap b2 = ls1Var.b(bitmap.getWidth(), bitmap.getHeight(), h2);
        new Canvas(b2).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return b2;
    }

    @x1
    private static Bitmap.Config h(@x1 Bitmap bitmap) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.RGBA_F16;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return h;
    }

    public static int j(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @x1
    private static Bitmap.Config k(@x1 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @r2
    public static void l(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean m(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@x1 Bitmap bitmap, int i) {
        if (i != 0) {
            try {
                Matrix matrix = new Matrix();
                matrix.setRotate(i);
                return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception unused) {
                Log.isLoggable(a, 6);
                return bitmap;
            }
        }
        return bitmap;
    }

    public static Bitmap o(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i) {
        if (m(i)) {
            Matrix matrix = new Matrix();
            l(i, matrix);
            RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
            matrix.mapRect(rectF);
            Bitmap b2 = ls1Var.b(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
            matrix.postTranslate(-rectF.left, -rectF.top);
            b2.setHasAlpha(bitmap.hasAlpha());
            a(bitmap, b2, matrix);
            return b2;
        }
        return bitmap;
    }

    public static Bitmap p(@x1 ls1 ls1Var, @x1 Bitmap bitmap, float f2, float f3, float f4, float f5) {
        return s(ls1Var, bitmap, new b(f2, f3, f4, f5));
    }

    public static Bitmap q(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i) {
        x02.a(i > 0, "roundingRadius must be greater than 0.");
        return s(ls1Var, bitmap, new a(i));
    }

    @Deprecated
    public static Bitmap r(@x1 ls1 ls1Var, @x1 Bitmap bitmap, int i, int i2, int i3) {
        return q(ls1Var, bitmap, i3);
    }

    private static Bitmap s(@x1 ls1 ls1Var, @x1 Bitmap bitmap, c cVar) {
        Bitmap.Config h2 = h(bitmap);
        Bitmap g2 = g(ls1Var, bitmap);
        Bitmap b2 = ls1Var.b(g2.getWidth(), g2.getHeight(), h2);
        b2.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g2, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, b2.getWidth(), b2.getHeight());
        Lock lock = h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(b2);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!g2.equals(bitmap)) {
                ls1Var.a(g2);
            }
            return b2;
        } catch (Throwable th) {
            h.unlock();
            throw th;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
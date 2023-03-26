package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.p7700g.p99005.vb2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: CircularRevealHelper.java */
/* loaded from: classes.dex */
public class sb2 {
    private static final boolean a = false;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 2;
    private final a f;
    @x1
    private final View g;
    @x1
    private final Path h;
    @x1
    private final Paint i;
    @x1
    private final Paint j;
    @z1
    private vb2.e k;
    @z1
    private Drawable l;
    private Paint m;
    private boolean n;
    private boolean o;

    /* compiled from: CircularRevealHelper.java */
    /* loaded from: classes.dex */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    /* compiled from: CircularRevealHelper.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    public sb2(a aVar) {
        this.f = aVar;
        View view = (View) aVar;
        this.g = view;
        view.setWillNotDraw(false);
        this.h = new Path();
        this.i = new Paint(7);
        Paint paint = new Paint(1);
        this.j = paint;
        paint.setColor(0);
    }

    private void d(@x1 Canvas canvas, int i, float f) {
        this.m.setColor(i);
        this.m.setStrokeWidth(f);
        vb2.e eVar = this.k;
        canvas.drawCircle(eVar.b, eVar.c, eVar.d - (f / 2.0f), this.m);
    }

    private void e(@x1 Canvas canvas) {
        this.f.c(canvas);
        if (r()) {
            vb2.e eVar = this.k;
            canvas.drawCircle(eVar.b, eVar.c, eVar.d, this.j);
        }
        if (p()) {
            d(canvas, sr.t, 10.0f);
            d(canvas, tk.c, 5.0f);
        }
        f(canvas);
    }

    private void f(@x1 Canvas canvas) {
        if (q()) {
            Rect bounds = this.l.getBounds();
            float width = this.k.b - (bounds.width() / 2.0f);
            float height = this.k.c - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.l.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    private float i(@x1 vb2.e eVar) {
        return nf2.b(eVar.b, eVar.c, 0.0f, 0.0f, this.g.getWidth(), this.g.getHeight());
    }

    private void k() {
        if (e == 1) {
            this.h.rewind();
            vb2.e eVar = this.k;
            if (eVar != null) {
                this.h.addCircle(eVar.b, eVar.c, eVar.d, Path.Direction.CW);
            }
        }
        this.g.invalidate();
    }

    private boolean p() {
        vb2.e eVar = this.k;
        boolean z = eVar == null || eVar.a();
        return e == 0 ? !z && this.o : !z;
    }

    private boolean q() {
        return (this.n || this.l == null || this.k == null) ? false : true;
    }

    private boolean r() {
        return (this.n || Color.alpha(this.j.getColor()) == 0) ? false : true;
    }

    public void a() {
        if (e == 0) {
            this.n = true;
            this.o = false;
            this.g.buildDrawingCache();
            Bitmap drawingCache = this.g.getDrawingCache();
            if (drawingCache == null && this.g.getWidth() != 0 && this.g.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.g.getWidth(), this.g.getHeight(), Bitmap.Config.ARGB_8888);
                this.g.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.i;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.n = false;
            this.o = true;
        }
    }

    public void b() {
        if (e == 0) {
            this.o = false;
            this.g.destroyDrawingCache();
            this.i.setShader(null);
            this.g.invalidate();
        }
    }

    public void c(@x1 Canvas canvas) {
        if (p()) {
            int i = e;
            if (i == 0) {
                vb2.e eVar = this.k;
                canvas.drawCircle(eVar.b, eVar.c, eVar.d, this.i);
                if (r()) {
                    vb2.e eVar2 = this.k;
                    canvas.drawCircle(eVar2.b, eVar2.c, eVar2.d, this.j);
                }
            } else if (i == 1) {
                int save = canvas.save();
                canvas.clipPath(this.h);
                this.f.c(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.g.getWidth(), this.g.getHeight(), this.j);
                }
                canvas.restoreToCount(save);
            } else if (i == 2) {
                this.f.c(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.g.getWidth(), this.g.getHeight(), this.j);
                }
            } else {
                throw new IllegalStateException(wo1.l("Unsupported strategy ", i));
            }
        } else {
            this.f.c(canvas);
            if (r()) {
                canvas.drawRect(0.0f, 0.0f, this.g.getWidth(), this.g.getHeight(), this.j);
            }
        }
        f(canvas);
    }

    @z1
    public Drawable g() {
        return this.l;
    }

    @w0
    public int h() {
        return this.j.getColor();
    }

    @z1
    public vb2.e j() {
        vb2.e eVar = this.k;
        if (eVar == null) {
            return null;
        }
        vb2.e eVar2 = new vb2.e(eVar);
        if (eVar2.a()) {
            eVar2.d = i(eVar2);
        }
        return eVar2;
    }

    public boolean l() {
        return this.f.d() && !p();
    }

    public void m(@z1 Drawable drawable) {
        this.l = drawable;
        this.g.invalidate();
    }

    public void n(@w0 int i) {
        this.j.setColor(i);
        this.g.invalidate();
    }

    public void o(@z1 vb2.e eVar) {
        if (eVar == null) {
            this.k = null;
        } else {
            vb2.e eVar2 = this.k;
            if (eVar2 == null) {
                this.k = new vb2.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (nf2.e(eVar.d, i(eVar), 1.0E-4f)) {
                this.k.d = Float.MAX_VALUE;
            }
        }
        k();
    }
}
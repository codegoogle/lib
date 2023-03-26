package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.webview.a;

/* loaded from: classes2.dex */
public class ProgressBar extends View implements a {
    private static final float C = 1200.0f;
    private static final long L = 25;
    private static final String g = "ProgressBar";
    private static final boolean h = false;
    private static final float t = 0.05f;
    private static final float u = 0.2f;
    private static final float v = 0.4f;
    private static final float w = 1.0f;
    private static final long x = 2000;
    private static final float y = 0.2f;
    private int A;
    private int B;
    private long D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private boolean I;
    private a.InterfaceC0066a J;
    private Handler K;
    private boolean M;
    private boolean N;
    public Runnable f;
    private Rect i;
    private float j;
    private float k;
    private long l;
    private float m;
    private boolean n;
    private float o;
    private float p;
    private float q;
    private long r;
    private int s;
    private int z;

    public ProgressBar(Context context) {
        super(context);
        this.i = new Rect();
        this.k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }

    private void a() {
        setWillNotDraw(false);
    }

    private float b() {
        if (this.n) {
            return this.M ? 1.0f : 0.4f;
        }
        if (this.r < x) {
            if (this.A == 1) {
                return this.M ? 1.0f : 0.4f;
            } else if (this.z == 1) {
                return this.M ? 0.4f : 0.2f;
            } else if (this.M) {
                return 0.2f;
            }
        }
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r12.M != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
        if (r12.M == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (r12.M != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005c, code lost:
        if (r12.M != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005e, code lost:
        r5 = 1.0f;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Drawable drawable;
        Drawable drawable2;
        if (!this.I) {
            this.I = true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.N ? 0L : currentTimeMillis - this.l;
        float abs = Math.abs(((float) j) / 1000.0f);
        this.m = abs;
        this.l = currentTimeMillis;
        long j2 = this.r + j;
        this.r = j2;
        boolean z = this.n;
        float f = 0.4f;
        if (!z) {
            if (j2 < x) {
                if (this.A != 1) {
                    if (this.z == 1) {
                    }
                    f = 0.2f;
                }
            }
            f = t;
        }
        this.q = f;
        float f2 = (f * abs) + this.p;
        this.p = f2;
        if (!z) {
            float f3 = this.k;
            if (f2 > f3) {
                this.p = f3;
            }
        }
        this.i.right = (int) (this.p * this.j);
        this.K.removeCallbacksAndMessages(null);
        this.K.postDelayed(this.f, this.D);
        super.draw(canvas);
        float f4 = this.m;
        if (this.n) {
            float f5 = this.o;
            float f6 = this.j;
            int i = (int) ((1.0f - (f5 / (f6 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f5 > f6 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.o, 0.0f);
        }
        if (this.F != null && this.E != null) {
            Drawable drawable6 = this.F;
            drawable6.setBounds(0, 0, (int) (this.i.width() - (this.E.getIntrinsicWidth() * t)), drawable6.getIntrinsicHeight());
            this.F.draw(canvas);
        }
        if (this.n && (drawable2 = this.G) != null && this.E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.G.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (!this.n && Math.abs(this.p - this.k) < 1.0E-5f && (drawable = this.H) != null) {
            int i2 = (int) ((f4 * 0.2f * this.j) + this.s);
            this.s = i2;
            if (drawable.getIntrinsicWidth() + i2 >= this.i.width()) {
                this.s = -this.H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.s, 0.0f);
            this.H.draw(canvas);
            canvas.restore();
        }
        if (this.n) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z) {
        return null;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public float getProgress() {
        return this.p;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void initResource(boolean z) {
        if (z || (this.H == null && this.E == null && this.F == null && this.G == null)) {
            Drawable drawable = getResources().getDrawable(getResources().getIdentifier("anythink_cm_highlight", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            this.H = drawable;
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.H.getIntrinsicHeight());
            }
            Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("anythink_cm_head", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            this.E = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.E.getIntrinsicHeight());
            }
            this.F = getResources().getDrawable(getResources().getIdentifier("anythink_cm_tail", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            this.G = getResources().getDrawable(getResources().getIdentifier("anythink_cm_end_animation", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.j = getMeasuredWidth();
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void onThemeChange() {
        if (this.I) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Drawable drawable = this.H;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.E;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setPaused(boolean z) {
        this.N = z;
        if (z) {
            return;
        }
        this.l = System.currentTimeMillis();
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgress(float f, boolean z) {
        if (!z || f < 1.0f) {
            return;
        }
        startEndAnimation();
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgressBarListener(a.InterfaceC0066a interfaceC0066a) {
        this.J = interfaceC0066a;
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setProgressState(int i) {
        if (i == 5) {
            this.z = 1;
            this.A = 0;
            this.B = 0;
            this.r = 0L;
        } else if (i == 6) {
            this.A = 1;
            if (this.B == 1) {
                startEndAnimation();
            }
            this.r = 0L;
        } else if (i == 7) {
            startEndAnimation();
        } else if (i != 8) {
        } else {
            this.B = 1;
            if (this.A == 1) {
                startEndAnimation();
            }
        }
    }

    @Override // android.view.View, com.anythink.expressad.foundation.webview.a
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void setVisible(boolean z) {
        if (z) {
            this.M = true;
            this.l = System.currentTimeMillis();
            this.m = 0.0f;
            this.r = 0L;
            this.n = false;
            this.o = 0.0f;
            this.p = 0.0f;
            this.j = getMeasuredWidth();
            this.N = false;
            this.z = 0;
            this.A = 0;
            this.B = 0;
            Drawable drawable = this.H;
            if (drawable != null) {
                this.s = -drawable.getIntrinsicWidth();
            } else {
                this.s = 0;
            }
            Drawable drawable2 = this.F;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.G;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.E;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    @Override // com.anythink.expressad.foundation.webview.a
    public void startEndAnimation() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.o = 0.0f;
    }

    private void a(Canvas canvas, float f) {
        Drawable drawable;
        Drawable drawable2;
        if (this.n) {
            float f2 = this.o;
            float f3 = this.j;
            int i = (int) ((1.0f - (f2 / (f3 * 0.5f))) * 255.0f);
            if (i < 0) {
                i = 0;
            }
            if (f2 > f3 * 0.5f) {
                setVisible(false);
            }
            Drawable drawable3 = this.F;
            if (drawable3 != null) {
                drawable3.setAlpha(i);
            }
            Drawable drawable4 = this.G;
            if (drawable4 != null) {
                drawable4.setAlpha(i);
            }
            Drawable drawable5 = this.E;
            if (drawable5 != null) {
                drawable5.setAlpha(i);
            }
            canvas.save();
            canvas.translate(this.o, 0.0f);
        }
        if (this.F != null && this.E != null) {
            Drawable drawable6 = this.F;
            drawable6.setBounds(0, 0, (int) (this.i.width() - (this.E.getIntrinsicWidth() * t)), drawable6.getIntrinsicHeight());
            this.F.draw(canvas);
        }
        if (this.n && (drawable2 = this.G) != null && this.E != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            Drawable drawable7 = this.G;
            drawable7.setBounds(0, 0, intrinsicWidth, drawable7.getIntrinsicHeight());
            canvas.save();
            canvas.translate(-intrinsicWidth, 0.0f);
            this.G.draw(canvas);
            canvas.restore();
        }
        if (this.E != null) {
            canvas.save();
            canvas.translate(this.i.width() - getWidth(), 0.0f);
            this.E.draw(canvas);
            canvas.restore();
        }
        if (!this.n && Math.abs(this.p - this.k) < 1.0E-5f && (drawable = this.H) != null) {
            int i2 = (int) ((f * 0.2f * this.j) + this.s);
            this.s = i2;
            if (drawable.getIntrinsicWidth() + i2 >= this.i.width()) {
                this.s = -this.H.getIntrinsicWidth();
            }
            canvas.save();
            canvas.translate(this.s, 0.0f);
            this.H.draw(canvas);
            canvas.restore();
        }
        if (this.n) {
            canvas.restore();
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new Rect();
        this.k = 0.95f;
        this.D = L;
        this.I = false;
        this.K = new Handler(Looper.getMainLooper());
        this.f = new Runnable() { // from class: com.anythink.expressad.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.N = false;
        setWillNotDraw(false);
    }
}
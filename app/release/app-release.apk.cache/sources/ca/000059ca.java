package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.p7700g.p99005.ff;

/* compiled from: ImageFilterView.java */
/* loaded from: classes.dex */
public class re extends AppCompatImageView {
    public ViewOutlineProvider A;
    public RectF B;
    public Drawable[] C;
    public LayerDrawable D;
    public float E;
    public float F;
    public float G;
    public float H;
    private c s;
    private boolean t;
    private Drawable u;
    private Drawable v;
    private float w;
    private float x;
    private float y;
    private Path z;

    /* compiled from: ImageFilterView.java */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = re.this.getWidth();
            int height = re.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (re.this.x * Math.min(width, height)) / 2.0f);
        }
    }

    /* compiled from: ImageFilterView.java */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, re.this.getWidth(), re.this.getHeight(), re.this.y);
        }
    }

    /* compiled from: ImageFilterView.java */
    /* loaded from: classes.dex */
    public static class c {
        public float[] a = new float[20];
        public ColorMatrix b = new ColorMatrix();
        public ColorMatrix c = new ColorMatrix();
        public float d = 1.0f;
        public float e = 1.0f;
        public float f = 1.0f;
        public float g = 1.0f;

        private void a(float brightness) {
            float[] fArr = this.a;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void b(float saturationStrength) {
            float f = 1.0f - saturationStrength;
            float f2 = 0.2999f * f;
            float f3 = 0.587f * f;
            float f4 = f * 0.114f;
            float[] fArr = this.a;
            fArr[0] = f2 + saturationStrength;
            fArr[1] = f3;
            fArr[2] = f4;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f2;
            fArr[6] = f3 + saturationStrength;
            fArr[7] = f4;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f2;
            fArr[11] = f3;
            fArr[12] = f4 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void d(float warmth) {
            float log;
            float f;
            float f2;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f3 = (5000.0f / warmth) / 100.0f;
            if (f3 > 66.0f) {
                double d = f3 - 60.0f;
                f = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                log = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                log = (((float) Math.log(f3)) * 99.4708f) - 161.11957f;
                f = 255.0f;
            }
            if (f3 < 66.0f) {
                f2 = f3 > 19.0f ? (((float) Math.log(f3 - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                f2 = 255.0f;
            }
            float min = Math.min(255.0f, Math.max(f, 0.0f));
            float min2 = Math.min(255.0f, Math.max(log, 0.0f));
            float min3 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log(50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log(40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        public void c(ImageView view) {
            boolean z;
            this.b.reset();
            float f = this.e;
            boolean z2 = true;
            if (f != 1.0f) {
                b(f);
                this.b.set(this.a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f;
            if (f2 != 1.0f) {
                this.c.setScale(f2, f2, f2, 1.0f);
                this.b.postConcat(this.c);
                z = true;
            }
            float f3 = this.g;
            if (f3 != 1.0f) {
                d(f3);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                z = true;
            }
            float f4 = this.d;
            if (f4 != 1.0f) {
                a(f4);
                this.c.set(this.a);
                this.b.postConcat(this.c);
            } else {
                z2 = z;
            }
            if (z2) {
                view.setColorFilter(new ColorMatrixColorFilter(this.b));
            } else {
                view.clearColorFilter();
            }
        }
    }

    public re(Context context) {
        super(context);
        this.s = new c();
        this.t = true;
        this.u = null;
        this.v = null;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.u = obtainStyledAttributes.getDrawable(ff.m.ue);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.ye) {
                    this.w = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == ff.m.He) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.Ge) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.xe) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.we) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == ff.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.De) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.t));
                } else if (index == ff.m.ze) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.E));
                } else if (index == ff.m.Ae) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.F));
                } else if (index == ff.m.Be) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.H));
                } else if (index == ff.m.Ce) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.G));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.v = drawable;
            if (this.u != null && drawable != null) {
                Drawable[] drawableArr = this.C;
                Drawable mutate = getDrawable().mutate();
                this.v = mutate;
                drawableArr[0] = mutate;
                this.C[1] = this.u.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.C);
                this.D = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.w * 255.0f));
                if (!this.t) {
                    this.D.getDrawable(0).setAlpha((int) ((1.0f - this.w) * 255.0f));
                }
                super.setImageDrawable(this.D);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.v = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.C;
                Drawable mutate2 = drawable2.mutate();
                this.v = mutate2;
                drawableArr2[0] = mutate2;
            }
        }
    }

    private void d() {
        if (Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H)) {
            return;
        }
        float f = Float.isNaN(this.E) ? 0.0f : this.E;
        float f2 = Float.isNaN(this.F) ? 0.0f : this.F;
        float f3 = Float.isNaN(this.G) ? 1.0f : this.G;
        float f4 = Float.isNaN(this.H) ? 0.0f : this.H;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate(((((width - f6) * f) + width) - f6) * 0.5f, ((((height - f7) * f2) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private void e() {
        if (Float.isNaN(this.E) && Float.isNaN(this.F) && Float.isNaN(this.G) && Float.isNaN(this.H)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            d();
        }
    }

    private void setOverlay(boolean overlay) {
        this.t = overlay;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (0 != 0) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.s.d;
    }

    public float getContrast() {
        return this.s.f;
    }

    public float getCrossfade() {
        return this.w;
    }

    public float getImagePanX() {
        return this.E;
    }

    public float getImagePanY() {
        return this.F;
    }

    public float getImageRotate() {
        return this.H;
    }

    public float getImageZoom() {
        return this.G;
    }

    public float getRound() {
        return this.y;
    }

    public float getRoundPercent() {
        return this.x;
    }

    public float getSaturation() {
        return this.s.e;
    }

    public float getWarmth() {
        return this.s.g;
    }

    @Override // android.view.View
    public void layout(int l, int t, int r, int b2) {
        super.layout(l, t, r, b2);
        d();
    }

    public void setAltImageResource(int resId) {
        Drawable mutate = r3.b(getContext(), resId).mutate();
        this.u = mutate;
        Drawable[] drawableArr = this.C;
        drawableArr[0] = this.v;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.C);
        this.D = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.w);
    }

    public void setBrightness(float brightness) {
        c cVar = this.s;
        cVar.d = brightness;
        cVar.c(this);
    }

    public void setContrast(float contrast) {
        c cVar = this.s;
        cVar.f = contrast;
        cVar.c(this);
    }

    public void setCrossfade(float crossfade) {
        this.w = crossfade;
        if (this.C != null) {
            if (!this.t) {
                this.D.getDrawable(0).setAlpha((int) ((1.0f - this.w) * 255.0f));
            }
            this.D.getDrawable(1).setAlpha((int) (this.w * 255.0f));
            super.setImageDrawable(this.D);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.u != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.v = mutate;
            Drawable[] drawableArr = this.C;
            drawableArr[0] = mutate;
            drawableArr[1] = this.u;
            LayerDrawable layerDrawable = new LayerDrawable(this.C);
            this.D = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.w);
            return;
        }
        super.setImageDrawable(drawable);
    }

    public void setImagePanX(float pan) {
        this.E = pan;
        e();
    }

    public void setImagePanY(float pan) {
        this.F = pan;
        e();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.u != null) {
            Drawable mutate = r3.b(getContext(), resId).mutate();
            this.v = mutate;
            Drawable[] drawableArr = this.C;
            drawableArr[0] = mutate;
            drawableArr[1] = this.u;
            LayerDrawable layerDrawable = new LayerDrawable(this.C);
            this.D = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.w);
            return;
        }
        super.setImageResource(resId);
    }

    public void setImageRotate(float rotation) {
        this.H = rotation;
        e();
    }

    public void setImageZoom(float zoom) {
        this.G = zoom;
        e();
    }

    @e2(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.y = round;
            float f = this.x;
            this.x = -1.0f;
            setRoundPercent(f);
            return;
        }
        boolean z = this.y != round;
        this.y = round;
        if (round != 0.0f) {
            if (this.z == null) {
                this.z = new Path();
            }
            if (this.B == null) {
                this.B = new RectF();
            }
            if (this.A == null) {
                b bVar = new b();
                this.A = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.B.set(0.0f, 0.0f, getWidth(), getHeight());
            this.z.reset();
            Path path = this.z;
            RectF rectF = this.B;
            float f2 = this.y;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @e2(21)
    public void setRoundPercent(float round) {
        boolean z = this.x != round;
        this.x = round;
        if (round != 0.0f) {
            if (this.z == null) {
                this.z = new Path();
            }
            if (this.B == null) {
                this.B = new RectF();
            }
            if (this.A == null) {
                a aVar = new a();
                this.A = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.x) / 2.0f;
            this.B.set(0.0f, 0.0f, width, height);
            this.z.reset();
            this.z.addRoundRect(this.B, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        c cVar = this.s;
        cVar.e = saturation;
        cVar.c(this);
    }

    public void setWarmth(float warmth) {
        c cVar = this.s;
        cVar.g = warmth;
        cVar.c(this);
    }

    public re(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = new c();
        this.t = true;
        this.u = null;
        this.v = null;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attrs);
    }

    public re(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = new c();
        this.t = true;
        this.u = null;
        this.v = null;
        this.w = 0.0f;
        this.x = 0.0f;
        this.y = Float.NaN;
        this.C = new Drawable[2];
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attrs);
    }
}
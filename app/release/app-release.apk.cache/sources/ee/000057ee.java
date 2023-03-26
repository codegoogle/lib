package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.re;

/* compiled from: ImageFilterButton.java */
/* loaded from: classes.dex */
public class qe extends AppCompatImageButton {
    public LayerDrawable A;
    private boolean B;
    private Drawable C;
    private Drawable D;
    private float E;
    private float F;
    private float G;
    private float H;
    private re.c s;
    private float t;
    private float u;
    private float v;
    private Path w;
    public ViewOutlineProvider x;
    public RectF y;
    public Drawable[] z;

    /* compiled from: ImageFilterButton.java */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = qe.this.getWidth();
            int height = qe.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (qe.this.u * Math.min(width, height)) / 2.0f);
        }
    }

    /* compiled from: ImageFilterButton.java */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, qe.this.getWidth(), qe.this.getHeight(), qe.this.v);
        }
    }

    public qe(Context context) {
        super(context);
        this.s = new re.c();
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, null);
    }

    private void c(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.te);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.C = obtainStyledAttributes.getDrawable(ff.m.ue);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.ye) {
                    this.t = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == ff.m.He) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.Ge) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.xe) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.Ee) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == ff.m.Fe) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == ff.m.De) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.B));
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
            this.D = drawable;
            if (this.C != null && drawable != null) {
                Drawable[] drawableArr = this.z;
                Drawable mutate = getDrawable().mutate();
                this.D = mutate;
                drawableArr[0] = mutate;
                this.z[1] = this.C.mutate();
                LayerDrawable layerDrawable = new LayerDrawable(this.z);
                this.A = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.t * 255.0f));
                if (!this.B) {
                    this.A.getDrawable(0).setAlpha((int) ((1.0f - this.t) * 255.0f));
                }
                super.setImageDrawable(this.A);
                return;
            }
            Drawable drawable2 = getDrawable();
            this.D = drawable2;
            if (drawable2 != null) {
                Drawable[] drawableArr2 = this.z;
                Drawable mutate2 = drawable2.mutate();
                this.D = mutate2;
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
        this.B = overlay;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (0 != 0) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.s.f;
    }

    public float getCrossfade() {
        return this.t;
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
        return this.v;
    }

    public float getRoundPercent() {
        return this.u;
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
        this.C = mutate;
        Drawable[] drawableArr = this.z;
        drawableArr[0] = this.D;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.z);
        this.A = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.t);
    }

    public void setBrightness(float brightness) {
        re.c cVar = this.s;
        cVar.d = brightness;
        cVar.c(this);
    }

    public void setContrast(float contrast) {
        re.c cVar = this.s;
        cVar.f = contrast;
        cVar.c(this);
    }

    public void setCrossfade(float crossfade) {
        this.t = crossfade;
        if (this.z != null) {
            if (!this.B) {
                this.A.getDrawable(0).setAlpha((int) ((1.0f - this.t) * 255.0f));
            }
            this.A.getDrawable(1).setAlpha((int) (this.t * 255.0f));
            super.setImageDrawable(this.A);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.C != null && drawable != null) {
            Drawable mutate = drawable.mutate();
            this.D = mutate;
            Drawable[] drawableArr = this.z;
            drawableArr[0] = mutate;
            drawableArr[1] = this.C;
            LayerDrawable layerDrawable = new LayerDrawable(this.z);
            this.A = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.t);
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

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.C != null) {
            Drawable mutate = r3.b(getContext(), resId).mutate();
            this.D = mutate;
            Drawable[] drawableArr = this.z;
            drawableArr[0] = mutate;
            drawableArr[1] = this.C;
            LayerDrawable layerDrawable = new LayerDrawable(this.z);
            this.A = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.t);
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
            this.v = round;
            float f = this.u;
            this.u = -1.0f;
            setRoundPercent(f);
            return;
        }
        boolean z = this.v != round;
        this.v = round;
        if (round != 0.0f) {
            if (this.w == null) {
                this.w = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.x == null) {
                b bVar = new b();
                this.x = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.y.set(0.0f, 0.0f, getWidth(), getHeight());
            this.w.reset();
            Path path = this.w;
            RectF rectF = this.y;
            float f2 = this.v;
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
        boolean z = this.u != round;
        this.u = round;
        if (round != 0.0f) {
            if (this.w == null) {
                this.w = new Path();
            }
            if (this.y == null) {
                this.y = new RectF();
            }
            if (this.x == null) {
                a aVar = new a();
                this.x = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.u) / 2.0f;
            this.y.set(0.0f, 0.0f, width, height);
            this.w.reset();
            this.w.addRoundRect(this.y, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float saturation) {
        re.c cVar = this.s;
        cVar.e = saturation;
        cVar.c(this);
    }

    public void setWarmth(float warmth) {
        re.c cVar = this.s;
        cVar.g = warmth;
        cVar.c(this);
    }

    public qe(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.s = new re.c();
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attrs);
    }

    public qe(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.s = new re.c();
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = Float.NaN;
        this.z = new Drawable[2];
        this.B = true;
        this.C = null;
        this.D = null;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        c(context, attrs);
    }
}
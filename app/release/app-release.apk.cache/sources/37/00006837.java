package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import com.p7700g.p99005.ay5;
import com.p7700g.p99005.by5;
import com.p7700g.p99005.gy5;
import java.io.IOException;
import java.lang.ref.WeakReference;
import pl.droidsonroids.gif.GifIOException;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: GifTextureView.java */
/* loaded from: classes4.dex */
public class yx5 extends TextureView {
    private static final ImageView.ScaleType[] s = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    private ImageView.ScaleType t;
    private final Matrix u;
    private by5 v;
    private c w;
    private float x;
    private ay5.b y;

    /* compiled from: GifTextureView.java */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* compiled from: GifTextureView.java */
    /* loaded from: classes4.dex */
    public interface b {
        void a(Canvas canvas);
    }

    /* compiled from: GifTextureView.java */
    /* loaded from: classes4.dex */
    public static class c extends Thread implements TextureView.SurfaceTextureListener {
        public final lx5 s;
        private GifInfoHandle t;
        private IOException u;
        public long[] v;
        private final WeakReference<yx5> w;

        /* compiled from: GifTextureView.java */
        /* loaded from: classes4.dex */
        public class a implements Runnable {
            public final /* synthetic */ yx5 s;

            public a(yx5 yx5Var) {
                this.s = yx5Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.s.i(c.this.t);
            }
        }

        public c(yx5 yx5Var) {
            super("GifRenderThread");
            this.s = new lx5();
            this.t = new GifInfoHandle();
            this.w = new WeakReference<>(yx5Var);
        }

        public void c(@x1 yx5 yx5Var, @z1 b bVar) {
            this.s.b();
            yx5Var.setSuperSurfaceTextureListener(bVar != null ? new fy5(bVar) : null);
            this.t.z();
            interrupt();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            yx5 yx5Var = this.w.get();
            if (yx5Var != null) {
                yx5Var.i(this.t);
            }
            this.s.c();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.s.b();
            this.t.z();
            interrupt();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                yx5 yx5Var = this.w.get();
                if (yx5Var == null) {
                    return;
                }
                GifInfoHandle c = yx5Var.v.c();
                this.t = c;
                c.K((char) 1, yx5Var.isOpaque());
                if (yx5Var.y.b >= 0) {
                    this.t.J(yx5Var.y.b);
                }
                yx5 yx5Var2 = this.w.get();
                if (yx5Var2 != null) {
                    yx5Var2.setSuperSurfaceTextureListener(this);
                    boolean isAvailable = yx5Var2.isAvailable();
                    this.s.d(isAvailable);
                    if (isAvailable) {
                        yx5Var2.post(new a(yx5Var2));
                    }
                    this.t.L(yx5Var2.x);
                    while (!isInterrupted()) {
                        try {
                            this.s.a();
                            yx5 yx5Var3 = this.w.get();
                            if (yx5Var3 == null) {
                                break;
                            }
                            SurfaceTexture surfaceTexture = yx5Var3.getSurfaceTexture();
                            if (surfaceTexture != null) {
                                Surface surface = new Surface(surfaceTexture);
                                try {
                                    this.t.a(surface, this.v);
                                } finally {
                                    surface.release();
                                }
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    this.t.A();
                    this.t = new GifInfoHandle();
                    return;
                }
                this.t.A();
            } catch (IOException e) {
                this.u = e;
            }
        }
    }

    public yx5(Context context) {
        super(context);
        this.t = ImageView.ScaleType.FIT_CENTER;
        this.u = new Matrix();
        this.x = 1.0f;
        g(null, 0, 0);
    }

    private static by5 f(TypedArray typedArray) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(gy5.b.b, typedValue)) {
            if (typedValue.resourceId != 0) {
                String resourceTypeName = typedArray.getResources().getResourceTypeName(typedValue.resourceId);
                if (ay5.b.contains(resourceTypeName)) {
                    return new by5.i(typedArray.getResources(), typedValue.resourceId);
                }
                if (!"string".equals(resourceTypeName)) {
                    throw new IllegalArgumentException(wo1.u("Expected string, drawable, mipmap or raw resource type. '", resourceTypeName, "' is not supported"));
                }
            }
            return new by5.c(typedArray.getResources().getAssets(), typedValue.string.toString());
        }
        return null;
    }

    private void g(AttributeSet attributeSet, int i, int i2) {
        if (attributeSet != null) {
            int attributeIntValue = attributeSet.getAttributeIntValue(ay5.a, "scaleType", -1);
            if (attributeIntValue >= 0) {
                ImageView.ScaleType[] scaleTypeArr = s;
                if (attributeIntValue < scaleTypeArr.length) {
                    this.t = scaleTypeArr[attributeIntValue];
                }
            }
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, gy5.b.a, i, i2);
            this.v = f(obtainStyledAttributes);
            super.setOpaque(obtainStyledAttributes.getBoolean(gy5.b.c, false));
            obtainStyledAttributes.recycle();
            this.y = new ay5.b(this, attributeSet, i, i2);
        } else {
            super.setOpaque(false);
            this.y = new ay5.b();
        }
        if (isInEditMode()) {
            return;
        }
        c cVar = new c(this);
        this.w = cVar;
        if (this.v != null) {
            cVar.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(GifInfoHandle gifInfoHandle) {
        Matrix matrix = new Matrix();
        float width = getWidth();
        float height = getHeight();
        float q = gifInfoHandle.q() / width;
        float i = gifInfoHandle.i() / height;
        RectF rectF = new RectF(0.0f, 0.0f, gifInfoHandle.q(), gifInfoHandle.i());
        RectF rectF2 = new RectF(0.0f, 0.0f, width, height);
        float f = 1.0f;
        switch (a.a[this.t.ordinal()]) {
            case 1:
                matrix.setScale(q, i, width / 2.0f, height / 2.0f);
                break;
            case 2:
                float min = 1.0f / Math.min(q, i);
                matrix.setScale(q * min, min * i, width / 2.0f, height / 2.0f);
                break;
            case 3:
                if (gifInfoHandle.q() > width || gifInfoHandle.i() > height) {
                    f = Math.min(1.0f / q, 1.0f / i);
                }
                matrix.setScale(q * f, f * i, width / 2.0f, height / 2.0f);
                break;
            case 4:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                matrix.preScale(q, i);
                break;
            case 5:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                matrix.preScale(q, i);
                break;
            case 6:
                matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                matrix.preScale(q, i);
                break;
            case 7:
                return;
            case 8:
                matrix.set(this.u);
                matrix.preScale(q, i);
                break;
        }
        super.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSuperSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        super.setSurfaceTextureListener(surfaceTextureListener);
    }

    @z1
    public IOException getIOException() {
        return this.w.u != null ? this.w.u : GifIOException.b(this.w.t.l());
    }

    public ImageView.ScaleType getScaleType() {
        return this.t;
    }

    @Override // android.view.TextureView
    public TextureView.SurfaceTextureListener getSurfaceTextureListener() {
        return null;
    }

    @Override // android.view.TextureView
    public Matrix getTransform(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        }
        matrix.set(this.u);
        return matrix;
    }

    public synchronized void h(@z1 by5 by5Var, @z1 b bVar) {
        this.w.c(this, bVar);
        try {
            this.w.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.v = by5Var;
        c cVar = new c(this);
        this.w = cVar;
        if (by5Var != null) {
            cVar.start();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.w.c(this, null);
        super.onDetachedFromWindow();
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof zx5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        zx5 zx5Var = (zx5) parcelable;
        super.onRestoreInstanceState(zx5Var.getSuperState());
        this.w.v = zx5Var.s[0];
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = this.w;
        cVar.v = cVar.t.o();
        return new zx5(super.onSaveInstanceState(), this.y.a ? this.w.v : null);
    }

    public void setFreezesAnimation(boolean z) {
        this.y.a = z;
    }

    public void setImageMatrix(Matrix matrix) {
        setTransform(matrix);
    }

    public synchronized void setInputSource(@z1 by5 by5Var) {
        h(by5Var, null);
    }

    @Override // android.view.TextureView
    public void setOpaque(boolean z) {
        if (z != isOpaque()) {
            super.setOpaque(z);
            setInputSource(this.v);
        }
    }

    public void setScaleType(@x1 ImageView.ScaleType scaleType) {
        this.t = scaleType;
        i(this.w.t);
    }

    public void setSpeed(@g1(from = 0.0d, fromInclusive = false) float f) {
        this.x = f;
        this.w.t.L(f);
    }

    @Override // android.view.TextureView
    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        throw new UnsupportedOperationException("Changing SurfaceTexture is not supported");
    }

    @Override // android.view.TextureView
    public void setSurfaceTextureListener(TextureView.SurfaceTextureListener surfaceTextureListener) {
        throw new UnsupportedOperationException("Changing SurfaceTextureListener is not supported");
    }

    @Override // android.view.TextureView
    public void setTransform(Matrix matrix) {
        this.u.set(matrix);
        i(this.w.t);
    }

    public yx5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = ImageView.ScaleType.FIT_CENTER;
        this.u = new Matrix();
        this.x = 1.0f;
        g(attributeSet, 0, 0);
    }

    public yx5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = ImageView.ScaleType.FIT_CENTER;
        this.u = new Matrix();
        this.x = 1.0f;
        g(attributeSet, i, 0);
    }

    @e2(21)
    public yx5(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.t = ImageView.ScaleType.FIT_CENTER;
        this.u = new Matrix();
        this.x = 1.0f;
        g(attributeSet, i, i2);
    }
}
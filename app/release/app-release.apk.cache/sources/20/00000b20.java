package com.anythink.expressad.videocommon.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.widget.ATImageView;

/* loaded from: classes2.dex */
public class RoundImageView extends ATImageView {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 5;
    private static final String l = "state_instance";
    private static final String m = "state_type";
    private static final String n = "state_border_radius";
    private int a;
    private int e;
    private Paint f;
    private int g;
    private Matrix h;
    private BitmapShader i;
    private int j;
    private RectF k;

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new Matrix();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.e = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }

    private void a() {
        Bitmap a;
        Drawable drawable = getDrawable();
        if (drawable == null || (a = a(drawable)) == null) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.i = new BitmapShader(a, tileMode, tileMode);
        int i = this.a;
        float f = 1.0f;
        if (i == 0) {
            f = (this.j * 1.0f) / Math.min(a.getWidth(), a.getHeight());
        } else if (i == 1) {
            f = Math.max((getWidth() * 1.0f) / a.getWidth(), (getHeight() * 1.0f) / a.getHeight());
        }
        this.h.setScale(f, f);
        this.i.setLocalMatrix(this.h);
        this.f.setShader(this.i);
    }

    @Override // com.anythink.expressad.widget.ATImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap a;
        try {
            if (getDrawable() == null) {
                return;
            }
            Drawable drawable = getDrawable();
            if (drawable != null && (a = a(drawable)) != null) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                this.i = new BitmapShader(a, tileMode, tileMode);
                int i = this.a;
                float f = 1.0f;
                if (i == 0) {
                    f = (this.j * 1.0f) / Math.min(a.getWidth(), a.getHeight());
                } else if (i == 1) {
                    f = Math.max((getWidth() * 1.0f) / a.getWidth(), (getHeight() * 1.0f) / a.getHeight());
                }
                this.h.setScale(f, f);
                this.i.setLocalMatrix(this.h);
                this.f.setShader(this.i);
            }
            if (this.a == 1) {
                RectF rectF = this.k;
                int i2 = this.e;
                canvas.drawRoundRect(rectF, i2, i2, this.f);
                return;
            }
            int i3 = this.g;
            canvas.drawCircle(i3, i3, i3, this.f);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a == 0) {
            int min = Math.min(getMeasuredWidth(), getMeasuredHeight());
            this.j = min;
            this.g = min / 2;
            setMeasuredDimension(min, min);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(l));
            this.a = bundle.getInt(m);
            this.e = bundle.getInt(n);
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(l, super.onSaveInstanceState());
        bundle.putInt(m, this.a);
        bundle.putInt(n, this.e);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a == 1) {
            this.k = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
    }

    public void setBorderRadius(int i) {
        int b2 = s.b(getContext(), i);
        if (this.e != b2) {
            this.e = b2;
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.a != i) {
            this.a = i;
            if (i != 1 && i != 0) {
                this.a = 0;
            }
            requestLayout();
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new Matrix();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.e = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }

    private static Bitmap a(Drawable drawable) {
        try {
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_4444);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            n.d("View", th.getMessage());
            return null;
        }
    }

    public RoundImageView(Context context) {
        super(context);
        this.h = new Matrix();
        Paint paint = new Paint();
        this.f = paint;
        paint.setAntiAlias(true);
        this.e = (int) TypedValue.applyDimension(1, 5.0f, getResources().getDisplayMetrics());
        this.a = 1;
    }
}
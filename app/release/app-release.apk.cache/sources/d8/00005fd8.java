package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.x2;

/* compiled from: MotionLabel.java */
/* loaded from: classes.dex */
public class ue extends View implements sd {
    public static String s = "MotionLabel";
    private static final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private boolean A;
    private BitmapShader A0;
    private float B;
    private Matrix B0;
    private float C;
    private float C0;
    public ViewOutlineProvider D;
    private float D0;
    public RectF E;
    private float E0;
    private float F;
    private float F0;
    private float G;
    public Paint G0;
    private int H;
    private int H0;
    private int I;
    public Rect I0;
    private float J;
    public Paint J0;
    private String K;
    public float K0;
    public boolean L;
    public float L0;
    private Rect M;
    public float M0;
    private CharSequence N;
    public float N0;
    private int O;
    public float O0;
    private int P;
    private int Q;
    private int R;
    private String S;
    private Layout T;
    private int U;
    private int V;
    private boolean W;
    private float u0;
    private float v0;
    public TextPaint w;
    private float w0;
    public Path x;
    private Drawable x0;
    private int y;
    public Matrix y0;
    private int z;
    private Bitmap z0;

    /* compiled from: MotionLabel.java */
    /* loaded from: classes.dex */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            int width = ue.this.getWidth();
            int height = ue.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (ue.this.B * Math.min(width, height)) / 2.0f);
        }
    }

    /* compiled from: MotionLabel.java */
    /* loaded from: classes.dex */
    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ue.this.getWidth(), ue.this.getHeight(), ue.this.C);
        }
    }

    public ue(Context context) {
        super(context);
        this.w = new TextPaint();
        this.x = new Path();
        this.y = 65535;
        this.z = 65535;
        this.A = false;
        this.B = 0.0f;
        this.C = Float.NaN;
        this.F = 48.0f;
        this.G = Float.NaN;
        this.J = 0.0f;
        this.K = "Hello World";
        this.L = true;
        this.M = new Rect();
        this.O = 1;
        this.P = 1;
        this.Q = 1;
        this.R = 1;
        this.U = 8388659;
        this.V = 0;
        this.W = false;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = new Paint();
        this.H0 = 0;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = Float.NaN;
        g(context, null);
    }

    private void d(float l, float t2, float r, float b2) {
        if (this.B0 == null) {
            return;
        }
        this.v0 = r - l;
        this.w0 = b2 - t2;
        l();
    }

    private void g(Context context, AttributeSet attrs) {
        i(context, attrs);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, ff.m.Ij);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.Oj) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == ff.m.Qj) {
                    this.S = obtainStyledAttributes.getString(index);
                } else if (index == ff.m.Uj) {
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.G);
                } else if (index == ff.m.Jj) {
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.F);
                } else if (index == ff.m.Lj) {
                    this.H = obtainStyledAttributes.getInt(index, this.H);
                } else if (index == ff.m.Kj) {
                    this.I = obtainStyledAttributes.getInt(index, this.I);
                } else if (index == ff.m.Mj) {
                    this.y = obtainStyledAttributes.getColor(index, this.y);
                } else if (index == ff.m.Sj) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.C);
                    this.C = dimension;
                    setRound(dimension);
                } else if (index == ff.m.Tj) {
                    float f = obtainStyledAttributes.getFloat(index, this.B);
                    this.B = f;
                    setRoundPercent(f);
                } else if (index == ff.m.Nj) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == ff.m.Rj) {
                    this.V = obtainStyledAttributes.getInt(index, 0);
                } else if (index == ff.m.ak) {
                    this.z = obtainStyledAttributes.getInt(index, this.z);
                    this.A = true;
                } else if (index == ff.m.bk) {
                    this.J = obtainStyledAttributes.getDimension(index, this.J);
                    this.A = true;
                } else if (index == ff.m.Vj) {
                    this.x0 = obtainStyledAttributes.getDrawable(index);
                    this.A = true;
                } else if (index == ff.m.Wj) {
                    this.L0 = obtainStyledAttributes.getFloat(index, this.L0);
                } else if (index == ff.m.Xj) {
                    this.M0 = obtainStyledAttributes.getFloat(index, this.M0);
                } else if (index == ff.m.ck) {
                    this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                } else if (index == ff.m.dk) {
                    this.F0 = obtainStyledAttributes.getFloat(index, this.F0);
                } else if (index == ff.m.Yj) {
                    this.O0 = obtainStyledAttributes.getFloat(index, this.O0);
                } else if (index == ff.m.Zj) {
                    this.N0 = obtainStyledAttributes.getFloat(index, this.N0);
                } else if (index == ff.m.gk) {
                    this.C0 = obtainStyledAttributes.getDimension(index, this.C0);
                } else if (index == ff.m.hk) {
                    this.D0 = obtainStyledAttributes.getDimension(index, this.D0);
                } else if (index == ff.m.fk) {
                    this.H0 = obtainStyledAttributes.getInt(index, this.H0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        k();
        j();
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.G) ? 1.0f : this.F / this.G;
        TextPaint textPaint = this.w;
        String str = this.K;
        return ((this.E0 + 1.0f) * ((((Float.isNaN(this.v0) ? getMeasuredWidth() : this.v0) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.G) ? 1.0f : this.F / this.G;
        Paint.FontMetrics fontMetrics = this.w.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.w0) ? getMeasuredHeight() : this.w0) - getPaddingTop()) - getPaddingBottom();
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((1.0f - this.F0) * (measuredHeight - ((f2 - f3) * f))) / 2.0f) - (f * f3);
    }

    private void h(String familyName, int typefaceIndex, int styleIndex) {
        Typeface typeface;
        Typeface create;
        if (familyName != null) {
            typeface = Typeface.create(familyName, styleIndex);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        if (typefaceIndex == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (typefaceIndex == 2) {
            typeface = Typeface.SERIF;
        } else if (typefaceIndex == 3) {
            typeface = Typeface.MONOSPACE;
        }
        if (styleIndex > 0) {
            if (typeface == null) {
                create = Typeface.defaultFromStyle(styleIndex);
            } else {
                create = Typeface.create(typeface, styleIndex);
            }
            setTypeface(create);
            int i = (~(create != null ? create.getStyle() : 0)) & styleIndex;
            this.w.setFakeBoldText((i & 1) != 0);
            this.w.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
            return;
        }
        this.w.setFakeBoldText(false);
        this.w.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    private void i(Context context, @z1 AttributeSet attrs) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(x2.b.J0, typedValue, true);
        TextPaint textPaint = this.w;
        int i = typedValue.data;
        this.y = i;
        textPaint.setColor(i);
    }

    private void k() {
        if (this.x0 != null) {
            this.B0 = new Matrix();
            int intrinsicWidth = this.x0.getIntrinsicWidth();
            int intrinsicHeight = this.x0.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.D0) ? 128 : (int) this.D0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.C0) ? 128 : (int) this.C0;
            }
            if (this.H0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.z0 = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.z0);
            this.x0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.x0.setFilterBitmap(true);
            this.x0.draw(canvas);
            if (this.H0 != 0) {
                this.z0 = e(this.z0, 4);
            }
            Bitmap bitmap = this.z0;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.A0 = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    private void l() {
        float f = Float.isNaN(this.L0) ? 0.0f : this.L0;
        float f2 = Float.isNaN(this.M0) ? 0.0f : this.M0;
        float f3 = Float.isNaN(this.N0) ? 1.0f : this.N0;
        float f4 = Float.isNaN(this.O0) ? 0.0f : this.O0;
        this.B0.reset();
        float width = this.z0.getWidth();
        float height = this.z0.getHeight();
        float f5 = Float.isNaN(this.D0) ? this.v0 : this.D0;
        float f6 = Float.isNaN(this.C0) ? this.w0 : this.C0;
        float f7 = f3 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.B0.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.C0)) {
            f11 = this.C0 / 2.0f;
        }
        if (!Float.isNaN(this.D0)) {
            f9 = this.D0 / 2.0f;
        }
        this.B0.postTranslate((((f * f9) + f5) - f8) * 0.5f, (((f2 * f11) + f6) - f10) * 0.5f);
        this.B0.postRotate(f4, f5 / 2.0f, f6 / 2.0f);
        this.A0.setLocalMatrix(this.B0);
    }

    @Override // com.p7700g.p99005.sd
    public void a(float l, float t2, float r, float b2) {
        int i = (int) (l + 0.5f);
        this.u0 = l - i;
        int i2 = (int) (r + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (b2 + 0.5f);
        int i5 = (int) (0.5f + t2);
        int i6 = i4 - i5;
        float f = r - l;
        this.v0 = f;
        float f2 = b2 - t2;
        this.w0 = f2;
        d(l, t2, r, b2);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.W) {
            if (this.I0 == null) {
                this.J0 = new Paint();
                this.I0 = new Rect();
                this.J0.set(this.w);
                this.K0 = this.J0.getTextSize();
            }
            this.v0 = f;
            this.w0 = f2;
            Paint paint = this.J0;
            String str = this.K;
            paint.getTextBounds(str, 0, str.length(), this.I0);
            float height = this.I0.height() * 1.3f;
            float f3 = (f - this.P) - this.O;
            float f4 = (f2 - this.R) - this.Q;
            float width = this.I0.width();
            if (width * f4 > height * f3) {
                this.w.setTextSize((this.K0 * f3) / width);
            } else {
                this.w.setTextSize((this.K0 * f4) / height);
            }
            if (this.A || !Float.isNaN(this.G)) {
                f(Float.isNaN(this.G) ? 1.0f : this.F / this.G);
            }
        }
    }

    public Bitmap e(Bitmap bitmapOriginal, int factor) {
        System.nanoTime();
        int width = bitmapOriginal.getWidth() / 2;
        int height = bitmapOriginal.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapOriginal, width, height, true);
        for (int i = 0; i < factor && width >= 32 && height >= 32; i++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    public void f(float scale) {
        if (this.A || scale != 1.0f) {
            this.x.reset();
            String str = this.K;
            int length = str.length();
            this.w.getTextBounds(str, 0, length, this.M);
            this.w.getTextPath(str, 0, length, 0.0f, 0.0f, this.x);
            if (scale != 1.0f) {
                qd.f();
                Matrix matrix = new Matrix();
                matrix.postScale(scale, scale);
                this.x.transform(matrix);
            }
            Rect rect = this.M;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.L = false;
        }
    }

    public float getRound() {
        return this.C;
    }

    public float getRoundPercent() {
        return this.B;
    }

    public float getScaleFromTextSize() {
        return this.G;
    }

    public float getTextBackgroundPanX() {
        return this.L0;
    }

    public float getTextBackgroundPanY() {
        return this.M0;
    }

    public float getTextBackgroundRotate() {
        return this.O0;
    }

    public float getTextBackgroundZoom() {
        return this.N0;
    }

    public int getTextOutlineColor() {
        return this.z;
    }

    public float getTextPanX() {
        return this.E0;
    }

    public float getTextPanY() {
        return this.F0;
    }

    public float getTextureHeight() {
        return this.C0;
    }

    public float getTextureWidth() {
        return this.D0;
    }

    public Typeface getTypeface() {
        return this.w.getTypeface();
    }

    public void j() {
        this.O = getPaddingLeft();
        this.P = getPaddingRight();
        this.Q = getPaddingTop();
        this.R = getPaddingBottom();
        h(this.S, this.I, this.H);
        this.w.setColor(this.y);
        this.w.setStrokeWidth(this.J);
        this.w.setStyle(Paint.Style.FILL_AND_STROKE);
        this.w.setFlags(128);
        setTextSize(this.F);
        this.w.setAntiAlias(true);
    }

    @Override // android.view.View
    public void layout(int l, int t2, int r, int b2) {
        super.layout(l, t2, r, b2);
        boolean isNaN = Float.isNaN(this.G);
        float f = isNaN ? 1.0f : this.F / this.G;
        this.v0 = r - l;
        this.w0 = b2 - t2;
        if (this.W) {
            if (this.I0 == null) {
                this.J0 = new Paint();
                this.I0 = new Rect();
                this.J0.set(this.w);
                this.K0 = this.J0.getTextSize();
            }
            Paint paint = this.J0;
            String str = this.K;
            paint.getTextBounds(str, 0, str.length(), this.I0);
            int width = this.I0.width();
            int height = (int) (this.I0.height() * 1.3f);
            float f2 = (this.v0 - this.P) - this.O;
            float f3 = (this.w0 - this.R) - this.Q;
            if (isNaN) {
                float f4 = width;
                float f5 = height;
                if (f4 * f3 > f5 * f2) {
                    this.w.setTextSize((this.K0 * f2) / f4);
                } else {
                    this.w.setTextSize((this.K0 * f3) / f5);
                }
            } else {
                float f6 = width;
                float f7 = height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.A || !isNaN) {
            d(l, t2, r, b2);
            f(f);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.G) ? 1.0f : this.F / this.G;
        super.onDraw(canvas);
        if (!this.A && f == 1.0f) {
            canvas.drawText(this.K, this.u0 + this.O + getHorizontalOffset(), this.Q + getVerticalOffset(), this.w);
            return;
        }
        if (this.L) {
            f(f);
        }
        if (this.y0 == null) {
            this.y0 = new Matrix();
        }
        if (this.A) {
            this.G0.set(this.w);
            this.y0.reset();
            float horizontalOffset = this.O + getHorizontalOffset();
            float verticalOffset = this.Q + getVerticalOffset();
            this.y0.postTranslate(horizontalOffset, verticalOffset);
            this.y0.preScale(f, f);
            this.x.transform(this.y0);
            if (this.A0 != null) {
                this.w.setFilterBitmap(true);
                this.w.setShader(this.A0);
            } else {
                this.w.setColor(this.y);
            }
            this.w.setStyle(Paint.Style.FILL);
            this.w.setStrokeWidth(this.J);
            canvas.drawPath(this.x, this.w);
            if (this.A0 != null) {
                this.w.setShader(null);
            }
            this.w.setColor(this.z);
            this.w.setStyle(Paint.Style.STROKE);
            this.w.setStrokeWidth(this.J);
            canvas.drawPath(this.x, this.w);
            this.y0.reset();
            this.y0.postTranslate(-horizontalOffset, -verticalOffset);
            this.x.transform(this.y0);
            this.w.set(this.G0);
            return;
        }
        float horizontalOffset2 = this.O + getHorizontalOffset();
        float verticalOffset2 = this.Q + getVerticalOffset();
        this.y0.reset();
        this.y0.preTranslate(horizontalOffset2, verticalOffset2);
        this.x.transform(this.y0);
        this.w.setColor(this.y);
        this.w.setStyle(Paint.Style.FILL_AND_STROKE);
        this.w.setStrokeWidth(this.J);
        canvas.drawPath(this.x, this.w);
        this.y0.reset();
        this.y0.preTranslate(-horizontalOffset2, -verticalOffset2);
        this.x.transform(this.y0);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        this.W = false;
        this.O = getPaddingLeft();
        this.P = getPaddingRight();
        this.Q = getPaddingTop();
        this.R = getPaddingBottom();
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (this.V != 0) {
                this.W = true;
            }
        } else {
            TextPaint textPaint = this.w;
            String str = this.K;
            textPaint.getTextBounds(str, 0, str.length(), this.M);
            if (mode != 1073741824) {
                size = (int) (this.M.width() + 0.99999f);
            }
            size += this.O + this.P;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (this.w.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.Q + this.R + fontMetricsInt;
            }
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int gravity) {
        if ((gravity & nq.d) == 0) {
            gravity |= nq.b;
        }
        if ((gravity & 112) == 0) {
            gravity |= 48;
        }
        int i = gravity & nq.d;
        int i2 = this.U;
        int i3 = i2 & nq.d;
        if (gravity != i2) {
            invalidate();
        }
        this.U = gravity;
        int i4 = gravity & 112;
        if (i4 == 48) {
            this.F0 = -1.0f;
        } else if (i4 != 80) {
            this.F0 = 0.0f;
        } else {
            this.F0 = 1.0f;
        }
        int i5 = gravity & nq.d;
        if (i5 != 3) {
            if (i5 != 5) {
                if (i5 != 8388611) {
                    if (i5 != 8388613) {
                        this.E0 = 0.0f;
                        return;
                    }
                }
            }
            this.E0 = 1.0f;
            return;
        }
        this.E0 = -1.0f;
    }

    @e2(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.C = round;
            float f = this.B;
            this.B = -1.0f;
            setRoundPercent(f);
            return;
        }
        boolean z = this.C != round;
        this.C = round;
        if (round != 0.0f) {
            if (this.x == null) {
                this.x = new Path();
            }
            if (this.E == null) {
                this.E = new RectF();
            }
            if (this.D == null) {
                b bVar = new b();
                this.D = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.E.set(0.0f, 0.0f, getWidth(), getHeight());
            this.x.reset();
            Path path = this.x;
            RectF rectF = this.E;
            float f2 = this.C;
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
        boolean z = this.B != round;
        this.B = round;
        if (round != 0.0f) {
            if (this.x == null) {
                this.x = new Path();
            }
            if (this.E == null) {
                this.E = new RectF();
            }
            if (this.D == null) {
                a aVar = new a();
                this.D = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.B) / 2.0f;
            this.E.set(0.0f, 0.0f, width, height);
            this.x.reset();
            this.x.addRoundRect(this.E, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float size) {
        this.G = size;
    }

    public void setText(CharSequence text) {
        this.K = text.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float pan) {
        this.L0 = pan;
        l();
        invalidate();
    }

    public void setTextBackgroundPanY(float pan) {
        this.M0 = pan;
        l();
        invalidate();
    }

    public void setTextBackgroundRotate(float rotation) {
        this.O0 = rotation;
        l();
        invalidate();
    }

    public void setTextBackgroundZoom(float zoom) {
        this.N0 = zoom;
        l();
        invalidate();
    }

    public void setTextFillColor(int color) {
        this.y = color;
        invalidate();
    }

    public void setTextOutlineColor(int color) {
        this.z = color;
        this.A = true;
        invalidate();
    }

    public void setTextOutlineThickness(float width) {
        this.J = width;
        this.A = true;
        if (Float.isNaN(width)) {
            this.J = 1.0f;
            this.A = false;
        }
        invalidate();
    }

    public void setTextPanX(float textPanX) {
        this.E0 = textPanX;
        invalidate();
    }

    public void setTextPanY(float textPanY) {
        this.F0 = textPanY;
        invalidate();
    }

    public void setTextSize(float size) {
        this.F = size;
        qd.f();
        TextPaint textPaint = this.w;
        if (!Float.isNaN(this.G)) {
            size = this.G;
        }
        textPaint.setTextSize(size);
        f(Float.isNaN(this.G) ? 1.0f : this.F / this.G);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float mTextureHeight) {
        this.C0 = mTextureHeight;
        l();
        invalidate();
    }

    public void setTextureWidth(float mTextureWidth) {
        this.D0 = mTextureWidth;
        l();
        invalidate();
    }

    public void setTypeface(Typeface tf) {
        if (this.w.getTypeface() != tf) {
            this.w.setTypeface(tf);
            if (this.T != null) {
                this.T = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public ue(Context context, @z1 AttributeSet attrs) {
        super(context, attrs);
        this.w = new TextPaint();
        this.x = new Path();
        this.y = 65535;
        this.z = 65535;
        this.A = false;
        this.B = 0.0f;
        this.C = Float.NaN;
        this.F = 48.0f;
        this.G = Float.NaN;
        this.J = 0.0f;
        this.K = "Hello World";
        this.L = true;
        this.M = new Rect();
        this.O = 1;
        this.P = 1;
        this.Q = 1;
        this.R = 1;
        this.U = 8388659;
        this.V = 0;
        this.W = false;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = new Paint();
        this.H0 = 0;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = Float.NaN;
        g(context, attrs);
    }

    public ue(Context context, @z1 AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.w = new TextPaint();
        this.x = new Path();
        this.y = 65535;
        this.z = 65535;
        this.A = false;
        this.B = 0.0f;
        this.C = Float.NaN;
        this.F = 48.0f;
        this.G = Float.NaN;
        this.J = 0.0f;
        this.K = "Hello World";
        this.L = true;
        this.M = new Rect();
        this.O = 1;
        this.P = 1;
        this.Q = 1;
        this.R = 1;
        this.U = 8388659;
        this.V = 0;
        this.W = false;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = new Paint();
        this.H0 = 0;
        this.L0 = Float.NaN;
        this.M0 = Float.NaN;
        this.N0 = Float.NaN;
        this.O0 = Float.NaN;
        g(context, attrs);
    }
}
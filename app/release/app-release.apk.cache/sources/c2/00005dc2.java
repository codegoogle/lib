package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.p7700g.p99005.ua0;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: PagerTitleStrip.java */
@ua0.e
/* loaded from: classes.dex */
public class ta0 extends ViewGroup {
    private static final int[] s = {16842804, 16842901, 16842904, 16842927};
    private static final int[] t = {16843660};
    private static final float u = 0.6f;
    private static final int v = 16;
    private int A;
    public float B;
    private int C;
    private int D;
    private boolean E;
    private boolean F;
    private final a G;
    private WeakReference<ra0> H;
    private int I;
    public int J;
    public ua0 w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: PagerTitleStrip.java */
    /* loaded from: classes.dex */
    public class a extends DataSetObserver implements ua0.j, ua0.i {
        private int a;

        public a() {
        }

        @Override // com.p7700g.p99005.ua0.j
        public void a(int i, float f, int i2) {
            if (f > 0.5f) {
                i++;
            }
            ta0.this.d(i, f, false);
        }

        @Override // com.p7700g.p99005.ua0.j
        public void b(int i) {
            this.a = i;
        }

        @Override // com.p7700g.p99005.ua0.j
        public void c(int i) {
            if (this.a == 0) {
                ta0 ta0Var = ta0.this;
                ta0Var.c(ta0Var.w.getCurrentItem(), ta0.this.w.getAdapter());
                ta0 ta0Var2 = ta0.this;
                float f = ta0Var2.B;
                if (f < 0.0f) {
                    f = 0.0f;
                }
                ta0Var2.d(ta0Var2.w.getCurrentItem(), f, true);
            }
        }

        @Override // com.p7700g.p99005.ua0.i
        public void d(ua0 ua0Var, ra0 ra0Var, ra0 ra0Var2) {
            ta0.this.b(ra0Var, ra0Var2);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ta0 ta0Var = ta0.this;
            ta0Var.c(ta0Var.w.getCurrentItem(), ta0.this.w.getAdapter());
            ta0 ta0Var2 = ta0.this;
            float f = ta0Var2.B;
            if (f < 0.0f) {
                f = 0.0f;
            }
            ta0Var2.d(ta0Var2.w.getCurrentItem(), f, true);
        }
    }

    /* compiled from: PagerTitleStrip.java */
    /* loaded from: classes.dex */
    public static class b extends SingleLineTransformationMethod {
        private Locale s;

        public b(Context context) {
            this.s = context.getResources().getConfiguration().locale;
        }

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.s);
            }
            return null;
        }
    }

    public ta0(@x1 Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i, float f) {
        this.x.setTextSize(i, f);
        this.y.setTextSize(i, f);
        this.z.setTextSize(i, f);
    }

    public void b(ra0 ra0Var, ra0 ra0Var2) {
        if (ra0Var != null) {
            ra0Var.u(this.G);
            this.H = null;
        }
        if (ra0Var2 != null) {
            ra0Var2.m(this.G);
            this.H = new WeakReference<>(ra0Var2);
        }
        ua0 ua0Var = this.w;
        if (ua0Var != null) {
            this.A = -1;
            this.B = -1.0f;
            c(ua0Var.getCurrentItem(), ra0Var2);
            requestLayout();
        }
    }

    public void c(int i, ra0 ra0Var) {
        int e = ra0Var != null ? ra0Var.e() : 0;
        this.E = true;
        CharSequence charSequence = null;
        this.x.setText((i < 1 || ra0Var == null) ? null : ra0Var.g(i - 1));
        this.y.setText((ra0Var == null || i >= e) ? null : ra0Var.g(i));
        int i2 = i + 1;
        if (i2 < e && ra0Var != null) {
            charSequence = ra0Var.g(i2);
        }
        this.z.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.x.measure(makeMeasureSpec, makeMeasureSpec2);
        this.y.measure(makeMeasureSpec, makeMeasureSpec2);
        this.z.measure(makeMeasureSpec, makeMeasureSpec2);
        this.A = i;
        if (!this.F) {
            d(i, this.B, false);
        }
        this.E = false;
    }

    public void d(int i, float f, boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i != this.A) {
            c(i, this.w.getAdapter());
        } else if (!z && f == this.B) {
            return;
        }
        this.F = true;
        int measuredWidth = this.x.getMeasuredWidth();
        int measuredWidth2 = this.y.getMeasuredWidth();
        int measuredWidth3 = this.z.getMeasuredWidth();
        int i6 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i7 = paddingRight + i6;
        int i8 = (width - (paddingLeft + i6)) - i7;
        float f2 = 0.5f + f;
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        int i9 = ((width - i7) - ((int) (i8 * f2))) - i6;
        int i10 = measuredWidth2 + i9;
        int baseline = this.x.getBaseline();
        int baseline2 = this.y.getBaseline();
        int baseline3 = this.z.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i11 = max - baseline;
        int i12 = max - baseline2;
        int i13 = max - baseline3;
        int max2 = Math.max(Math.max(this.x.getMeasuredHeight() + i11, this.y.getMeasuredHeight() + i12), this.z.getMeasuredHeight() + i13);
        int i14 = this.D & 112;
        if (i14 == 16) {
            i2 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i14 != 80) {
            i3 = i11 + paddingTop;
            i4 = i12 + paddingTop;
            i5 = paddingTop + i13;
            TextView textView = this.y;
            textView.layout(i9, i4, i10, textView.getMeasuredHeight() + i4);
            int min = Math.min(paddingLeft, (i9 - this.C) - measuredWidth);
            TextView textView2 = this.x;
            textView2.layout(min, i3, measuredWidth + min, textView2.getMeasuredHeight() + i3);
            int max3 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.C);
            TextView textView3 = this.z;
            textView3.layout(max3, i5, max3 + measuredWidth3, textView3.getMeasuredHeight() + i5);
            this.B = f;
            this.F = false;
        } else {
            i2 = (height - paddingBottom) - max2;
        }
        i3 = i11 + i2;
        i4 = i12 + i2;
        i5 = i2 + i13;
        TextView textView4 = this.y;
        textView4.layout(i9, i4, i10, textView4.getMeasuredHeight() + i4);
        int min2 = Math.min(paddingLeft, (i9 - this.C) - measuredWidth);
        TextView textView22 = this.x;
        textView22.layout(min2, i3, measuredWidth + min2, textView22.getMeasuredHeight() + i3);
        int max32 = Math.max((width - paddingRight) - measuredWidth3, i10 + this.C);
        TextView textView32 = this.z;
        textView32.layout(max32, i5, max32 + measuredWidth3, textView32.getMeasuredHeight() + i5);
        this.B = f;
        this.F = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ua0) {
            ua0 ua0Var = (ua0) parent;
            ra0 adapter = ua0Var.getAdapter();
            ua0Var.V(this.G);
            ua0Var.b(this.G);
            this.w = ua0Var;
            WeakReference<ra0> weakReference = this.H;
            b(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ua0 ua0Var = this.w;
        if (ua0Var != null) {
            b(ua0Var.getAdapter(), null);
            this.w.V(null);
            this.w.N(this.G);
            this.w = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.w != null) {
            float f = this.B;
            if (f < 0.0f) {
                f = 0.0f;
            }
            d(this.A, f, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int max;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int size = View.MeasureSpec.getSize(i);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i, (int) (size * 0.2f), -2);
            this.x.measure(childMeasureSpec2, childMeasureSpec);
            this.y.measure(childMeasureSpec2, childMeasureSpec);
            this.z.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                max = View.MeasureSpec.getSize(i2);
            } else {
                max = Math.max(getMinHeight(), this.y.getMeasuredHeight() + paddingBottom);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(max, i2, this.y.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.E) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i) {
        this.D = i;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@g1(from = 0.0d, to = 1.0d) float f) {
        int i = ((int) (f * 255.0f)) & 255;
        this.I = i;
        int i2 = (i << 24) | (this.J & sr.s);
        this.x.setTextColor(i2);
        this.z.setTextColor(i2);
    }

    public void setTextColor(@w0 int i) {
        this.J = i;
        this.y.setTextColor(i);
        int i2 = (this.I << 24) | (this.J & sr.s);
        this.x.setTextColor(i2);
        this.z.setTextColor(i2);
    }

    public void setTextSpacing(int i) {
        this.C = i;
        requestLayout();
    }

    public ta0(@x1 Context context, @z1 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = -1;
        this.B = -1.0f;
        this.G = new a();
        TextView textView = new TextView(context);
        this.x = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.y = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.z = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s);
        boolean z = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            nt.E(this.x, resourceId);
            nt.E(this.y, resourceId);
            nt.E(this.z, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.x.setTextColor(color);
            this.y.setTextColor(color);
            this.z.setTextColor(color);
        }
        this.D = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.J = this.y.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(u);
        this.x.setEllipsize(TextUtils.TruncateAt.END);
        this.y.setEllipsize(TextUtils.TruncateAt.END);
        this.z.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, t);
            z = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (z) {
            setSingleLineAllCaps(this.x);
            setSingleLineAllCaps(this.y);
            setSingleLineAllCaps(this.z);
        } else {
            this.x.setSingleLine();
            this.y.setSingleLine();
            this.z.setSingleLine();
        }
        this.C = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
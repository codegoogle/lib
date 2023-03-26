package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.i7;
import com.p7700g.p99005.k7;
import com.p7700g.p99005.m7;
import com.p7700g.p99005.n7;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] s = {16842801};
    private static final n7 t;
    private final m7 A;
    private boolean u;
    private boolean v;
    public int w;
    public int x;
    public final Rect y;
    public final Rect z;

    /* loaded from: classes.dex */
    public class a implements m7 {
        private Drawable a;

        public a() {
        }

        @Override // com.p7700g.p99005.m7
        public void a(int i, int i2, int i3, int i4) {
            CardView.this.z.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.y;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        @Override // com.p7700g.p99005.m7
        public void b(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.w) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.x) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        @Override // com.p7700g.p99005.m7
        public void c(Drawable drawable) {
            this.a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // com.p7700g.p99005.m7
        public boolean d() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // com.p7700g.p99005.m7
        public boolean e() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // com.p7700g.p99005.m7
        public Drawable f() {
            return this.a;
        }

        @Override // com.p7700g.p99005.m7
        public View g() {
            return CardView.this;
        }
    }

    static {
        k7 k7Var = new k7();
        t = k7Var;
        k7Var.j();
    }

    public CardView(@x1 Context context) {
        this(context, null);
    }

    @x1
    public ColorStateList getCardBackgroundColor() {
        return t.h(this.A);
    }

    public float getCardElevation() {
        return t.c(this.A);
    }

    @c2
    public int getContentPaddingBottom() {
        return this.y.bottom;
    }

    @c2
    public int getContentPaddingLeft() {
        return this.y.left;
    }

    @c2
    public int getContentPaddingRight() {
        return this.y.right;
    }

    @c2
    public int getContentPaddingTop() {
        return this.y.top;
    }

    public float getMaxCardElevation() {
        return t.g(this.A);
    }

    public boolean getPreventCornerOverlap() {
        return this.v;
    }

    public float getRadius() {
        return t.d(this.A);
    }

    public boolean getUseCompatPadding() {
        return this.u;
    }

    public void h(@c2 int i, @c2 int i2, @c2 int i3, @c2 int i4) {
        this.y.set(i, i2, i3, i4);
        t.i(this.A);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        n7 n7Var = t;
        if (!(n7Var instanceof k7)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(n7Var.l(this.A)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(n7Var.k(this.A)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(@w0 int i) {
        t.n(this.A, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        t.f(this.A, f);
    }

    public void setMaxCardElevation(float f) {
        t.o(this.A, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.x = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.w = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.v) {
            this.v = z;
            t.m(this.A);
        }
    }

    public void setRadius(float f) {
        t.b(this.A, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.u != z) {
            this.u = z;
            t.e(this.A);
        }
    }

    public CardView(@x1 Context context, @z1 AttributeSet attributeSet) {
        this(context, attributeSet, i7.a.g);
    }

    public void setCardBackgroundColor(@z1 ColorStateList colorStateList) {
        t.n(this.A, colorStateList);
    }

    public CardView(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.y = rect;
        this.z = new Rect();
        a aVar = new a();
        this.A = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i7.e.a, i, i7.d.b);
        int i2 = i7.e.d;
        if (obtainStyledAttributes.hasValue(i2)) {
            valueOf = obtainStyledAttributes.getColorStateList(i2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(s);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(i7.b.b);
            } else {
                color = getResources().getColor(i7.b.a);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(i7.e.e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(i7.e.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(i7.e.g, 0.0f);
        this.u = obtainStyledAttributes.getBoolean(i7.e.i, false);
        this.v = obtainStyledAttributes.getBoolean(i7.e.h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(i7.e.j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(i7.e.l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(i7.e.n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(i7.e.m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(i7.e.k, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.w = obtainStyledAttributes.getDimensionPixelSize(i7.e.b, 0);
        this.x = obtainStyledAttributes.getDimensionPixelSize(i7.e.c, 0);
        obtainStyledAttributes.recycle();
        t.a(aVar, context, colorStateList, dimension, dimension2, f);
    }
}
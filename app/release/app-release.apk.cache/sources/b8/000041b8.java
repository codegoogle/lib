package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.p7700g.p99005.e70;

/* compiled from: CircleImageView.java */
/* loaded from: classes.dex */
public class f70 extends ImageView {
    private static final int s = -328966;
    private static final int t = 1023410176;
    private static final int u = 503316480;
    private static final float v = 0.0f;
    private static final float w = 1.75f;
    private static final float x = 3.5f;
    private static final int y = 4;
    private int A;
    private int B;
    private Animation.AnimationListener z;

    /* compiled from: CircleImageView.java */
    /* loaded from: classes.dex */
    public static class a extends OvalShape {
        private Paint s = new Paint();
        private int t;
        private f70 u;

        public a(f70 f70Var, int i) {
            this.u = f70Var;
            this.t = i;
            a((int) rect().width());
        }

        private void a(int i) {
            float f = i / 2;
            this.s.setShader(new RadialGradient(f, f, this.t, new int[]{f70.t, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            int width;
            float width2 = this.u.getWidth() / 2;
            float height = this.u.getHeight() / 2;
            canvas.drawCircle(width2, height, width2, this.s);
            canvas.drawCircle(width2, height, width - this.t, paint);
        }

        @Override // android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            a((int) f);
        }
    }

    public f70(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (w * f);
        int i2 = (int) (0.0f * f);
        this.A = (int) (x * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(e70.j.P);
        this.B = obtainStyledAttributes.getColor(e70.j.Q, s);
        obtainStyledAttributes.recycle();
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            sr.M1(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new a(this, this.A));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer(this.A, i2, i, u);
            int i3 = this.A;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.B);
        sr.H1(this, shapeDrawable);
    }

    private boolean a() {
        return true;
    }

    public int b() {
        return this.B;
    }

    public void c(Animation.AnimationListener animationListener) {
        this.z = animationListener;
    }

    @Override // android.view.View
    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.z;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    @Override // android.view.View
    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.z;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (a()) {
            return;
        }
        setMeasuredDimension((this.A * 2) + getMeasuredWidth(), (this.A * 2) + getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.B = i;
        }
    }
}
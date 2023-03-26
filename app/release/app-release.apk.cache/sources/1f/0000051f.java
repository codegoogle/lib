package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.h;
import com.anythink.expressad.foundation.h.s;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.sr;

/* loaded from: classes2.dex */
public class ShakeView extends LinearLayout {
    private ImageView a;
    private Animation b;
    private ImageView c;
    private int d;

    /* renamed from: com.anythink.basead.ui.ShakeView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        public AnonymousClass1() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
            ShakeView.a(ShakeView.this);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.anythink.basead.ui.ShakeView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Interpolator {
        public AnonymousClass2() {
        }

        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            if ((ShakeView.this.d / 2) % 3 == 0) {
                return 0.0f;
            }
            return f;
        }
    }

    public ShakeView(Context context) {
        super(context);
        this.d = 0;
        initView();
    }

    public static /* synthetic */ int a(ShakeView shakeView) {
        int i = shakeView.d;
        shakeView.d = i + 1;
        return i;
    }

    public void initView() {
        setOrientation(1);
        setGravity(1);
        this.c = new ImageView(getContext());
        this.c.setLayoutParams(new LinearLayout.LayoutParams(s.b(getContext(), 96.0f), s.b(getContext(), 96.0f)));
        ImageView imageView = this.c;
        int parseColor = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(200.0f);
        imageView.setBackgroundDrawable(gradientDrawable);
        this.a = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(s.b(getContext(), 60.0f), s.b(getContext(), 60.0f));
        layoutParams.gravity = 17;
        this.a.setLayoutParams(layoutParams);
        this.a.setImageResource(h.a(m.a().e(), "myoffer_shake_icon", com.anythink.expressad.foundation.h.h.c));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(this.c);
        frameLayout.addView(this.a);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = s.b(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setText(h.a(m.a().e(), "myoffer_shake_title", "string"));
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setShadowLayer(10.0f, 3.0f, 3.0f, sr.t);
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = s.b(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(h.a(m.a().e(), "myoffer_shake_desc", "string"));
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(10.0f, 3.0f, 3.0f, sr.t);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.8f, 1, 0.8f);
        this.b = rotateAnimation;
        rotateAnimation.setDuration(150L);
        this.b.setRepeatMode(2);
        this.b.setRepeatCount(-1);
        this.b.setAnimationListener(new AnonymousClass1());
        this.b.setInterpolator(new AnonymousClass2());
        this.a.startAnimation(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animation animation = this.b;
        if (animation != null) {
            animation.cancel();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        try {
            this.a.setOnClickListener(onClickListener);
            this.c.setOnClickListener(onClickListener);
        } catch (Throwable unused) {
        }
    }

    private static void a(View view) {
        int parseColor = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(200.0f);
        view.setBackgroundDrawable(gradientDrawable);
    }

    public ShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
        initView();
    }

    public ShakeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = 0;
        initView();
    }

    private void a() {
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.8f, 1, 0.8f);
        this.b = rotateAnimation;
        rotateAnimation.setDuration(150L);
        this.b.setRepeatMode(2);
        this.b.setRepeatCount(-1);
        this.b.setAnimationListener(new AnonymousClass1());
        this.b.setInterpolator(new AnonymousClass2());
        this.a.startAnimation(this.b);
    }

    @e2(api = 21)
    public ShakeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = 0;
        initView();
    }
}
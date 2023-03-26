package com.anythink.basead.ui;

import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.anythink.core.common.j.h;

/* loaded from: classes2.dex */
public final class a {
    private ViewGroup a;
    private ImageView b;

    public a(ViewGroup viewGroup) {
        this.a = viewGroup;
        ImageView imageView = new ImageView(this.a.getContext());
        this.b = imageView;
        imageView.setId(h.a(this.a.getContext(), "myoffer_loading_id", "id"));
        this.b.setImageResource(h.a(this.a.getContext(), "myoffer_loading", com.anythink.expressad.foundation.h.h.c));
    }

    private void c() {
        ImageView imageView = this.b;
        if (imageView != null) {
            this.a.removeView(imageView);
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, this.a.getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        this.a.addView(this.b, layoutParams);
    }

    public final void a() {
        ImageView imageView = this.b;
        if (imageView != null) {
            this.a.removeView(imageView);
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 50.0f, this.a.getResources().getDisplayMetrics());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension, applyDimension);
        layoutParams.addRule(13);
        this.a.addView(this.b, layoutParams);
        this.b.post(new Runnable() { // from class: com.anythink.basead.ui.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b.setAlpha(1.0f);
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(1000L);
                rotateAnimation.setInterpolator(new LinearInterpolator());
                rotateAnimation.setRepeatCount(-1);
                a.this.b.startAnimation(rotateAnimation);
            }
        });
    }

    public final void b() {
        if (this.b != null) {
            this.a.post(new Runnable() { // from class: com.anythink.basead.ui.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.b.clearAnimation();
                    a.this.b.setAlpha(0.0f);
                    a.this.a.removeView(a.this.b);
                }
            });
        }
    }
}
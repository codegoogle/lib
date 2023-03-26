package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.s;
import com.p7700g.p99005.e2;

/* loaded from: classes2.dex */
public class MBSplashClickView extends RelativeLayout {
    private static final String a = "MBSplashClickView";
    public final int TYPE_SPLASH_BTN_CLICK;
    public final int TYPE_SPLASH_BTN_GO;
    public final int TYPE_SPLASH_BTN_OPEN;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private String m;
    private int n;
    private ImageView o;
    private ImageView p;
    private final RectF q;
    private final Paint r;
    private final Paint s;

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Animation.AnimationListener {
        public final /* synthetic */ ScaleAnimation a;

        public AnonymousClass1(ScaleAnimation scaleAnimation) {
            this.a = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            MBSplashClickView.this.p.setVisibility(4);
            MBSplashClickView.this.p.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.p.startAnimation(AnonymousClass1.this.a);
                }
            }, 700L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.p.setVisibility(0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ ScaleAnimation a;

        public AnonymousClass2(ScaleAnimation scaleAnimation) {
            this.a = scaleAnimation;
        }

        @Override // java.lang.Runnable
        public final void run() {
            MBSplashClickView.this.p.startAnimation(this.a);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.MBSplashClickView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Animation.AnimationListener {
        public AnonymousClass3() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(final Animation animation) {
            MBSplashClickView.this.o.setVisibility(4);
            MBSplashClickView.this.o.postDelayed(new Runnable() { // from class: com.anythink.expressad.splash.view.MBSplashClickView.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    MBSplashClickView.this.o.startAnimation(animation);
                }
            }, 2000L);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            MBSplashClickView.this.o.setVisibility(0);
        }
    }

    public MBSplashClickView(Context context) {
        super(context);
        this.b = "浏览第三方应用";
        this.c = "View";
        this.d = "打开第三方应用";
        this.e = "Open";
        this.f = "下载第三方应用";
        this.g = "Install";
        this.h = "anythink_splash_btn_arrow_right";
        this.i = "anythink_splash_btn_circle";
        this.j = "anythink_splash_btn_finger";
        this.k = "anythink_splash_btn_go";
        this.l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q = new RectF();
        this.r = new Paint();
        this.s = new Paint();
        a();
    }

    private void c() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(400L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200L);
        scaleAnimation2.setAnimationListener(new AnonymousClass1(scaleAnimation2));
        this.p.setVisibility(4);
        this.o.startAnimation(scaleAnimation);
        this.p.postDelayed(new AnonymousClass2(scaleAnimation2), 500L);
    }

    private void d() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
        translateAnimation.setDuration(1000L);
        translateAnimation.setAnimationListener(new AnonymousClass3());
        this.o.startAnimation(translateAnimation);
    }

    private void e() {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(500L);
        scaleAnimation.setRepeatCount(-1);
        scaleAnimation.setRepeatMode(2);
        this.o.startAnimation(scaleAnimation);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.saveLayer(this.q, this.s, 31);
        canvas.drawRoundRect(this.q, 200.0f, 200.0f, this.s);
        canvas.saveLayer(this.q, this.r, 31);
        super.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void initView(String str) {
        char c;
        boolean z;
        this.m = str;
        str.hashCode();
        int i = 0;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 3:
                this.n = 3;
                z = true;
                break;
            case 1:
            case 4:
                this.n = 1;
                z = true;
                break;
            case 2:
            case 5:
                this.n = 2;
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.U);
            if (TextUtils.isEmpty(this.m)) {
                this.m = contains ? "View" : "浏览第三方应用";
            }
            this.n = 2;
        }
        int i2 = this.n;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.m);
        this.o = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = null;
        int i3 = this.n;
        if (i3 == 2) {
            i = getResources().getIdentifier("anythink_splash_btn_go", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(s.b(getContext(), 35.0f), s.b(getContext(), 35.0f));
            layoutParams2.addRule(11);
            layoutParams2.addRule(15);
            layoutParams2.rightMargin = s.b(getContext(), 10.0f);
        } else if (i3 == 1) {
            i = getResources().getIdentifier("anythink_splash_btn_light", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams2.leftMargin = 20;
            layoutParams2.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = s.b(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("anythink_splash_btn_arrow_right", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i3 == 3) {
            i = getResources().getIdentifier("anythink_splash_btn_finger", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(s.b(getContext(), 25.0f), s.b(getContext(), 25.0f));
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = s.b(getContext(), 50.0f);
            layoutParams2.topMargin = s.b(getContext(), 18.0f);
            this.p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(s.b(getContext(), 30.0f), s.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = s.b(getContext(), 50.0f);
            layoutParams4.topMargin = s.b(getContext(), 5.0f);
            this.p.setLayoutParams(layoutParams4);
            this.p.setImageResource(getResources().getIdentifier("anythink_splash_btn_circle", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            addView(this.p);
        }
        this.o.setLayoutParams(layoutParams2);
        this.o.setImageResource(i);
        addView(textView);
        addView(this.o);
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.n;
        if (i == 2) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setRepeatCount(-1);
            scaleAnimation.setRepeatMode(2);
            this.o.startAnimation(scaleAnimation);
        } else if (i == 1) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0, -100.0f, 0, 1000.0f, 0, 0.0f, 0, 0.0f);
            translateAnimation.setDuration(1000L);
            translateAnimation.setAnimationListener(new AnonymousClass3());
            this.o.startAnimation(translateAnimation);
        } else if (i == 3) {
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            scaleAnimation2.setDuration(400L);
            scaleAnimation2.setRepeatCount(-1);
            scaleAnimation2.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 0.5f, 0.0f, 0.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation3.setDuration(200L);
            scaleAnimation3.setAnimationListener(new AnonymousClass1(scaleAnimation3));
            this.p.setVisibility(4);
            this.o.startAnimation(scaleAnimation2);
            this.p.postDelayed(new AnonymousClass2(scaleAnimation3), 500L);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.q.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    private void a() {
        this.r.setAntiAlias(true);
        this.r.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.s.setAntiAlias(true);
        this.s.setColor(-1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b() {
        char c;
        boolean z;
        String str = this.m;
        str.hashCode();
        int i = 0;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 3:
                this.n = 3;
                z = true;
                break;
            case 1:
            case 4:
                this.n = 1;
                z = true;
                break;
            case 2:
            case 5:
                this.n = 2;
                z = true;
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            boolean contains = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.U);
            if (TextUtils.isEmpty(this.m)) {
                this.m = contains ? "View" : "浏览第三方应用";
            }
            this.n = 2;
        }
        int i2 = this.n;
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i2 == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
        TextView textView = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(15);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setTextColor(-1);
        textView.setText(this.m);
        this.o = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = null;
        int i3 = this.n;
        if (i3 == 2) {
            i = getResources().getIdentifier("anythink_splash_btn_go", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(s.b(getContext(), 35.0f), s.b(getContext(), 35.0f));
            layoutParams2.addRule(11);
            layoutParams2.addRule(15);
            layoutParams2.rightMargin = s.b(getContext(), 10.0f);
        } else if (i3 == 1) {
            i = getResources().getIdentifier("anythink_splash_btn_light", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams2.leftMargin = 20;
            layoutParams2.rightMargin = 20;
            ImageView imageView = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -1);
            layoutParams3.addRule(11);
            layoutParams3.addRule(15);
            layoutParams3.rightMargin = s.b(getContext(), 50.0f);
            imageView.setImageResource(getResources().getIdentifier("anythink_splash_btn_arrow_right", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setLayoutParams(layoutParams3);
            addView(imageView);
        } else if (i3 == 3) {
            i = getResources().getIdentifier("anythink_splash_btn_finger", h.c, com.anythink.expressad.foundation.b.a.b().a());
            layoutParams2 = new RelativeLayout.LayoutParams(s.b(getContext(), 25.0f), s.b(getContext(), 25.0f));
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = s.b(getContext(), 50.0f);
            layoutParams2.topMargin = s.b(getContext(), 18.0f);
            this.p = new ImageView(getContext());
            RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(s.b(getContext(), 30.0f), s.b(getContext(), 30.0f));
            layoutParams4.addRule(11);
            layoutParams4.rightMargin = s.b(getContext(), 50.0f);
            layoutParams4.topMargin = s.b(getContext(), 5.0f);
            this.p.setLayoutParams(layoutParams4);
            this.p.setImageResource(getResources().getIdentifier("anythink_splash_btn_circle", h.c, com.anythink.expressad.foundation.b.a.b().a()));
            addView(this.p);
        }
        this.o.setLayoutParams(layoutParams2);
        this.o.setImageResource(i);
        addView(textView);
        addView(this.o);
        invalidate();
    }

    private void a(int i) {
        int parseColor = Color.parseColor("#666666");
        int parseColor2 = Color.parseColor("#8FC31F");
        int parseColor3 = Color.parseColor("#000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        if (i == 2) {
            gradientDrawable.setColor(parseColor2);
        } else {
            gradientDrawable.setColor(parseColor3);
            gradientDrawable.setStroke(2, parseColor);
        }
        gradientDrawable.setCornerRadius(200.0f);
        setBackgroundDrawable(gradientDrawable);
    }

    private boolean a(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -672744069:
                if (str.equals("Install")) {
                    c = 0;
                    break;
                }
                break;
            case 2464362:
                if (str.equals("Open")) {
                    c = 1;
                    break;
                }
                break;
            case 2666181:
                if (str.equals("View")) {
                    c = 2;
                    break;
                }
                break;
            case 855294846:
                if (str.equals("下载第三方应用")) {
                    c = 3;
                    break;
                }
                break;
            case 1383132195:
                if (str.equals("打开第三方应用")) {
                    c = 4;
                    break;
                }
                break;
            case 1681333335:
                if (str.equals("浏览第三方应用")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
                this.n = 3;
                break;
            case 1:
            case 4:
                this.n = 1;
                break;
            case 2:
            case 5:
                this.n = 2;
                break;
            default:
                return false;
        }
        return true;
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = "浏览第三方应用";
        this.c = "View";
        this.d = "打开第三方应用";
        this.e = "Open";
        this.f = "下载第三方应用";
        this.g = "Install";
        this.h = "anythink_splash_btn_arrow_right";
        this.i = "anythink_splash_btn_circle";
        this.j = "anythink_splash_btn_finger";
        this.k = "anythink_splash_btn_go";
        this.l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q = new RectF();
        this.r = new Paint();
        this.s = new Paint();
        a();
    }

    public MBSplashClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = "浏览第三方应用";
        this.c = "View";
        this.d = "打开第三方应用";
        this.e = "Open";
        this.f = "下载第三方应用";
        this.g = "Install";
        this.h = "anythink_splash_btn_arrow_right";
        this.i = "anythink_splash_btn_circle";
        this.j = "anythink_splash_btn_finger";
        this.k = "anythink_splash_btn_go";
        this.l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q = new RectF();
        this.r = new Paint();
        this.s = new Paint();
        a();
    }

    @e2(api = 21)
    public MBSplashClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = "浏览第三方应用";
        this.c = "View";
        this.d = "打开第三方应用";
        this.e = "Open";
        this.f = "下载第三方应用";
        this.g = "Install";
        this.h = "anythink_splash_btn_arrow_right";
        this.i = "anythink_splash_btn_circle";
        this.j = "anythink_splash_btn_finger";
        this.k = "anythink_splash_btn_go";
        this.l = "anythink_splash_btn_light";
        this.TYPE_SPLASH_BTN_OPEN = 1;
        this.TYPE_SPLASH_BTN_GO = 2;
        this.TYPE_SPLASH_BTN_CLICK = 3;
        this.q = new RectF();
        this.r = new Paint();
        this.s = new Paint();
    }
}
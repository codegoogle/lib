package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.splash.d.d;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.wo1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class ATSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;
    private static final String c = "ATSplashPopView";
    private static final AtomicInteger d = new AtomicInteger(1);
    public View.OnClickListener a;
    public View.OnClickListener b;
    private String e;
    private String f;
    private int g;
    private c h;
    private d i;
    private ImageView j;
    private ImageView k;
    private ImageView l;
    private ImageView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private int q;
    private Handler r;
    private boolean s;
    private com.anythink.expressad.a.a t;
    private Runnable u;

    /* loaded from: classes2.dex */
    public static class a {
        private String a;
        private String b;
        private int c;
        private c d;

        public a(String str, String str2, int i, c cVar) {
            this.a = str;
            this.b = str2;
            this.c = i;
            this.d = cVar;
        }

        public final String a() {
            return this.a;
        }

        public final String b() {
            return this.b;
        }

        public final int c() {
            return this.c;
        }

        public final c d() {
            return this.d;
        }

        private void a(String str) {
            this.a = str;
        }

        private void b(String str) {
            this.b = str;
        }

        private void a(int i) {
            this.c = i;
        }

        private void a(c cVar) {
            this.d = cVar;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface b {
    }

    public ATSplashPopView(Context context, a aVar, d dVar) {
        super(context);
        this.g = 1;
        this.q = -1;
        this.r = new Handler();
        this.s = false;
        this.u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.p != null) {
                    if (ATSplashPopView.this.q == 0) {
                        ATSplashPopView.this.q = -1;
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.r.removeCallbacks(ATSplashPopView.this.u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.c();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.p.setText(String.valueOf(ATSplashPopView.this.q));
                    ATSplashPopView.this.r.postDelayed(ATSplashPopView.this.u, 1000L);
                }
            }
        };
        this.a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.h);
                }
            }
        };
        this.b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.c();
                }
            }
        };
        if (aVar != null) {
            this.f = aVar.b();
            this.e = aVar.a();
            this.g = aVar.c();
            this.h = aVar.d();
            this.i = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = d;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static /* synthetic */ int j(ATSplashPopView aTSplashPopView) {
        int i = aTSplashPopView.q;
        aTSplashPopView.q = i - 1;
        return i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.i != null) {
            getWidth();
            getHeight();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.s = true;
        if (this.p != null) {
            this.r.removeCallbacks(this.u);
        }
    }

    public void reStartCountDown() {
        if (this.s) {
            this.s = false;
            int i = this.q;
            if (i != -1 && i != 0) {
                TextView textView = this.p;
                if (textView != null) {
                    textView.setText(String.valueOf(i));
                    this.r.postDelayed(this.u, 1000L);
                    return;
                }
                return;
            }
            g();
        }
    }

    public void release() {
        try {
            this.r.removeCallbacks(this.u);
            this.u = null;
            detachAllViewsFromParent();
            this.h = null;
            this.i = null;
        } catch (Exception e) {
            n.d(c, e.getMessage());
        }
    }

    public void setPopViewType(a aVar, d dVar) {
        if (aVar != null) {
            this.f = aVar.b();
            this.e = aVar.a();
            this.g = aVar.c();
            this.h = aVar.d();
            this.i = dVar;
            a();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    public void startCountDown() {
        this.r.removeCallbacks(this.u);
        c cVar = this.h;
        if (cVar == null || this.g != 1) {
            return;
        }
        int s = cVar.s();
        if (s > 0) {
            this.q = s;
            TextView textView = this.p;
            if (textView != null) {
                textView.setText(String.valueOf(s));
                this.r.postDelayed(this.u, 1000L);
                return;
            }
            return;
        }
        g();
    }

    private void a() {
        if (this.h == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i = this.g;
        if (i == 1) {
            b();
        } else if (i == 2) {
            c();
        } else if (i == 3) {
            d();
        } else if (i != 4) {
        } else {
            e();
        }
    }

    private void b() {
        ImageView imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(s.b(getContext(), 80.0f), s.b(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = s.b(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("anythink_splash_popview_default", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        this.j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(s.b(getContext(), 60.0f), s.b(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = s.b(getContext(), 7.0f);
        layoutParams2.leftMargin = s.b(getContext(), 10.0f);
        this.j.setId(generateViewId());
        this.j.setLayoutParams(layoutParams2);
        this.j.setScaleType(ImageView.ScaleType.FIT_CENTER);
        c cVar = this.h;
        if (cVar != null && !TextUtils.isEmpty(cVar.bd())) {
            a(this.h.bd(), true);
        }
        this.p = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = s.b(getContext(), 62.0f);
        layoutParams3.bottomMargin = s.b(getContext(), 70.0f);
        this.p.setId(generateViewId());
        this.p.setTextSize(10.0f);
        this.p.setTextColor(-1);
        this.p.setGravity(17);
        this.p.setMinWidth(s.b(getContext(), 16.0f));
        this.p.setMaxHeight(s.b(getContext(), 16.0f));
        this.p.setLayoutParams(layoutParams3);
        this.p.setBackgroundResource(getResources().getIdentifier("anythink_cm_circle_50black", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(imageView);
        addView(this.p);
        addView(this.j);
        c cVar2 = this.h;
        if (cVar2 != null && cVar2.s() <= 0) {
            g();
        }
        setOnClickListener(this.a);
        this.p.setOnClickListener(this.b);
    }

    private void c() {
        int b2 = s.b(getContext(), 4.0f);
        this.j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(s.b(getContext(), 28.0f), s.b(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.j.setId(generateViewId());
        this.j.setLayoutParams(layoutParams);
        this.j.setPadding(b2, b2, b2, b2);
        this.j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.h.bd(), false);
        TextView textView = new TextView(getContext());
        this.n = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.j.getId());
        layoutParams2.addRule(6, this.j.getId());
        layoutParams2.addRule(8, this.j.getId());
        layoutParams2.leftMargin = s.b(getContext(), 4.0f);
        layoutParams2.rightMargin = s.b(getContext(), 40.0f);
        this.n.setLayoutParams(layoutParams2);
        this.n.setGravity(16);
        this.n.setTextSize(10.0f);
        this.n.setSelected(true);
        this.n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.n.setMarqueeRepeatLimit(-1);
        this.n.setSingleLine(true);
        this.n.setTextColor(sr.t);
        this.n.setText(this.h.bb());
        setBackgroundResource(getResources().getIdentifier("anythink_shape_corners_bg", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(this.j);
        addView(this.n);
        f();
        setOnClickListener(this.a);
    }

    private void d() {
        int b2 = s.b(getContext(), 4.0f);
        this.j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(s.b(getContext(), 50.0f), s.b(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.j.setId(generateViewId());
        this.j.setLayoutParams(layoutParams);
        this.j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.j.setPadding(b2, b2, b2, b2);
        a(this.h.bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.j.getId());
        layoutParams2.addRule(6, this.j.getId());
        layoutParams2.addRule(8, this.j.getId());
        layoutParams2.leftMargin = s.b(getContext(), 8.0f);
        layoutParams2.rightMargin = s.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.n = textView;
        textView.setId(generateViewId());
        this.n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.n.setGravity(16);
        this.n.setTextSize(12.0f);
        this.n.setSelected(true);
        this.n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.n.setMarqueeRepeatLimit(-1);
        this.n.setSingleLine(true);
        this.n.setTextColor(sr.t);
        this.n.setText(this.h.bb());
        TextView textView2 = new TextView(getContext());
        this.o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.n.getId());
        layoutParams3.addRule(3, this.n.getId());
        layoutParams3.topMargin = s.b(getContext(), 4.0f);
        layoutParams3.rightMargin = s.b(getContext(), 36.0f);
        this.o.setGravity(16);
        this.o.setLayoutParams(layoutParams3);
        this.o.setTextSize(8.0f);
        this.o.setTextColor(-10066330);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSelected(true);
        this.o.setSingleLine(true);
        this.o.setText(this.h.bc());
        relativeLayout.addView(this.n);
        relativeLayout.addView(this.o);
        setBackgroundResource(getResources().getIdentifier("anythink_shape_corners_bg", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        addView(this.j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.a);
    }

    private void e() {
        this.l = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, s.b(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.l.setScaleType(ImageView.ScaleType.FIT_XY);
        this.l.setId(generateViewId());
        this.l.setLayoutParams(layoutParams);
        a(this.h.be());
        this.k = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, s.b(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.k.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.k.setId(generateViewId());
        this.k.setLayoutParams(layoutParams2);
        b(this.h.be());
        this.j = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(s.b(getContext(), 50.0f), s.b(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.l.getId());
        layoutParams3.topMargin = 20;
        this.j.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.j.setId(generateViewId());
        this.j.setLayoutParams(layoutParams3);
        a(this.h.bd(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.j.getId());
        layoutParams4.addRule(6, this.j.getId());
        layoutParams4.addRule(8, this.j.getId());
        layoutParams4.leftMargin = s.b(getContext(), 8.0f);
        layoutParams4.rightMargin = s.b(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.n = textView;
        textView.setId(generateViewId());
        this.n.setGravity(16);
        this.n.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.n.setTextSize(12.0f);
        this.n.setTextColor(sr.t);
        this.n.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.n.setMarqueeRepeatLimit(-1);
        this.n.setSelected(true);
        this.n.setSingleLine(true);
        this.n.setText(this.h.bb());
        TextView textView2 = new TextView(getContext());
        this.o = textView2;
        textView2.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.n.getId());
        layoutParams5.addRule(3, this.n.getId());
        layoutParams5.topMargin = s.b(getContext(), 4.0f);
        layoutParams5.rightMargin = s.b(getContext(), 36.0f);
        this.o.setGravity(16);
        this.o.setLayoutParams(layoutParams5);
        this.o.setTextSize(8.0f);
        this.o.setTextColor(-10066330);
        this.o.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.o.setMarqueeRepeatLimit(-1);
        this.o.setSelected(true);
        this.o.setSingleLine(true);
        this.o.setText(this.h.bc());
        relativeLayout.addView(this.n);
        relativeLayout.addView(this.o);
        addView(this.l);
        addView(this.k);
        addView(this.j);
        addView(relativeLayout);
        f();
        setOnClickListener(this.a);
    }

    private void f() {
        String str;
        int identifier;
        this.m = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(s.b(getContext(), 32.0f), s.b(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.j.getId());
        this.m.setLayoutParams(layoutParams);
        try {
            str = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            n.d(c, th.getMessage());
            str = "ZH";
        }
        if (!str.toUpperCase().equals("CN") && !str.toUpperCase().equals("ZH")) {
            identifier = getResources().getIdentifier("anythink_splash_ad_en", h.c, com.anythink.expressad.foundation.b.a.b().a());
        } else {
            identifier = getResources().getIdentifier("anythink_splash_ad", h.c, com.anythink.expressad.foundation.b.a.b().a());
        }
        this.m.setBackgroundResource(identifier);
        addView(this.m);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.p;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = s.b(getContext(), 16.0f);
            layoutParams.height = s.b(getContext(), 16.0f);
            this.p.setLayoutParams(layoutParams);
            this.p.setText("");
            this.p.setBackgroundResource(getResources().getIdentifier("anythink_splash_popview_close", h.c, com.anythink.expressad.foundation.b.a.b().a()));
        }
    }

    private void a(String str, final boolean z) {
        wo1.m0().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.1
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                Bitmap a2;
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (z) {
                        a2 = m.a(bitmap);
                    } else {
                        a2 = m.a(bitmap, 16);
                    }
                    ImageView imageView = ATSplashPopView.this.j;
                    if (a2 != null) {
                        bitmap = a2;
                    }
                    imageView.setImageBitmap(bitmap);
                } catch (Throwable th) {
                    n.d(ATSplashPopView.c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                n.d(ATSplashPopView.c, str2);
            }
        });
    }

    private void a(String str) {
        wo1.m0().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.2
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    com.anythink.core.common.j.b.a(com.anythink.core.common.b.m.a().e(), bitmap);
                } catch (Throwable th) {
                    n.d(ATSplashPopView.c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                n.d(ATSplashPopView.c, str2);
            }
        });
    }

    private void a(c cVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a(cVar);
            this.i.c();
        }
    }

    public static /* synthetic */ void a(ATSplashPopView aTSplashPopView, c cVar) {
        d dVar = aTSplashPopView.i;
        if (dVar != null) {
            dVar.a(cVar);
            aTSplashPopView.i.c();
        }
    }

    public ATSplashPopView(Context context) {
        super(context);
        this.g = 1;
        this.q = -1;
        this.r = new Handler();
        this.s = false;
        this.u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.p != null) {
                    if (ATSplashPopView.this.q == 0) {
                        ATSplashPopView.this.q = -1;
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.r.removeCallbacks(ATSplashPopView.this.u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.c();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.p.setText(String.valueOf(ATSplashPopView.this.q));
                    ATSplashPopView.this.r.postDelayed(ATSplashPopView.this.u, 1000L);
                }
            }
        };
        this.a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.h);
                }
            }
        };
        this.b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.c();
                }
            }
        };
        this.g = 1;
        n.b(c, "Please call setPopViewType() to init.");
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 1;
        this.q = -1;
        this.r = new Handler();
        this.s = false;
        this.u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.p != null) {
                    if (ATSplashPopView.this.q == 0) {
                        ATSplashPopView.this.q = -1;
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.r.removeCallbacks(ATSplashPopView.this.u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.c();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.p.setText(String.valueOf(ATSplashPopView.this.q));
                    ATSplashPopView.this.r.postDelayed(ATSplashPopView.this.u, 1000L);
                }
            }
        };
        this.a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.h);
                }
            }
        };
        this.b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.c();
                }
            }
        };
        this.g = 1;
        n.b(c, "Please call setPopViewType() to init.");
    }

    public ATSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 1;
        this.q = -1;
        this.r = new Handler();
        this.s = false;
        this.u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.p != null) {
                    if (ATSplashPopView.this.q == 0) {
                        ATSplashPopView.this.q = -1;
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.r.removeCallbacks(ATSplashPopView.this.u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.c();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.p.setText(String.valueOf(ATSplashPopView.this.q));
                    ATSplashPopView.this.r.postDelayed(ATSplashPopView.this.u, 1000L);
                }
            }
        };
        this.a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.h);
                }
            }
        };
        this.b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.c();
                }
            }
        };
        this.g = 1;
        n.b(c, "Please call setPopViewType() to init.");
    }

    private void b(String str) {
        wo1.m0().a(str, new com.anythink.expressad.foundation.g.d.c() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.3
            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(Bitmap bitmap, String str2) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    ATSplashPopView.this.k.setImageBitmap(m.a(bitmap, 16));
                } catch (Throwable th) {
                    n.d(ATSplashPopView.c, th.getMessage());
                }
            }

            @Override // com.anythink.expressad.foundation.g.d.c
            public final void a(String str2, String str3) {
                n.d(ATSplashPopView.c, str2);
            }
        });
    }

    private void b(c cVar) {
        d dVar = this.i;
        if (dVar != null) {
            dVar.a(cVar);
            this.i.c();
        }
    }

    @e2(api = 21)
    public ATSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.g = 1;
        this.q = -1;
        this.r = new Handler();
        this.s = false;
        this.u = new Runnable() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.4
            @Override // java.lang.Runnable
            public final void run() {
                if (ATSplashPopView.this.p != null) {
                    if (ATSplashPopView.this.q == 0) {
                        ATSplashPopView.this.q = -1;
                        ATSplashPopView.this.g();
                        ATSplashPopView.this.r.removeCallbacks(ATSplashPopView.this.u);
                        if (ATSplashPopView.this.i != null) {
                            ATSplashPopView.this.i.c();
                            return;
                        }
                        return;
                    }
                    ATSplashPopView.j(ATSplashPopView.this);
                    ATSplashPopView.this.p.setText(String.valueOf(ATSplashPopView.this.q));
                    ATSplashPopView.this.r.postDelayed(ATSplashPopView.this.u, 1000L);
                }
            }
        };
        this.a = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.i != null) {
                    ATSplashPopView aTSplashPopView = ATSplashPopView.this;
                    ATSplashPopView.a(aTSplashPopView, aTSplashPopView.h);
                }
            }
        };
        this.b = new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashPopView.6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (ATSplashPopView.this.q <= 0 && ATSplashPopView.this.i != null) {
                    ATSplashPopView.this.i.c();
                }
            }
        };
        this.g = 1;
        n.b(c, "Please call setPopViewType() to init.");
    }
}
package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.CountDownTimer;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.c.h;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.q;
import com.anythink.core.common.e.s;
import com.anythink.core.common.e.x;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;

/* loaded from: classes2.dex */
public abstract class BaseSplashAdView extends BaseAdView {
    public static final int TYPE_ASSEBLEM = 1;
    public static final int TYPE_SINGLE_PICTURE = 0;
    public ShakeView A;
    public final View.OnClickListener B;
    public final View.OnClickListener C;
    public boolean D;
    public boolean E;
    public boolean F;
    public h G;
    public TextView b;
    public FrameLayout c;
    public String v;
    public CountDownTimer w;
    public com.anythink.basead.e.a x;
    public a y;
    public RoundImageView z;

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (BaseSplashAdView.this.e.m.n() == 0 || BaseSplashAdView.this.E) {
                CountDownTimer countDownTimer = BaseSplashAdView.this.w;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                com.anythink.basead.e.a aVar = BaseSplashAdView.this.x;
                if (aVar != null) {
                    aVar.onAdClosed();
                }
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.BaseSplashAdView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 extends CountDownTimer {
        public AnonymousClass6(long j) {
            super(j, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            BaseSplashAdView baseSplashAdView = BaseSplashAdView.this;
            baseSplashAdView.b.setText(baseSplashAdView.v);
            BaseSplashAdView baseSplashAdView2 = BaseSplashAdView.this;
            baseSplashAdView2.E = true;
            com.anythink.basead.e.a aVar = baseSplashAdView2.x;
            if (aVar != null) {
                aVar.onAdClosed();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            BaseSplashAdView.this.a(j);
        }
    }

    public BaseSplashAdView(Context context) {
        super(context);
        this.v = "Skip";
        this.B = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = BaseSplashAdView.this.e.m;
                if (kVar == null || kVar.u() != 0) {
                    return;
                }
                BaseSplashAdView.super.b(1);
            }
        };
        this.C = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashAdView.super.b(1);
            }
        };
        this.D = false;
        this.E = false;
        this.G = new h() { // from class: com.anythink.basead.ui.BaseSplashAdView.9
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (BaseSplashAdView.this.isShown()) {
                    BaseSplashAdView.this.b(4);
                    return true;
                }
                return false;
            }
        };
    }

    public static boolean isSinglePicture(i iVar, k kVar) {
        return ((iVar instanceof q) && (kVar instanceof s)) ? 2 == ((s) kVar).M() : (iVar instanceof x) && 1 == ((x) iVar).R();
    }

    private void o() {
        if (this.D) {
            return;
        }
        this.D = true;
        if (this.F) {
            return;
        }
        this.c.setVisibility(0);
        this.c.setOnClickListener(new AnonymousClass5());
        this.E = false;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.e.m.l());
        this.w = anonymousClass6;
        anonymousClass6.start();
    }

    private void p() {
        this.c.setVisibility(0);
        this.c.setOnClickListener(new AnonymousClass5());
        this.E = false;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.e.m.l());
        this.w = anonymousClass6;
        anonymousClass6.start();
    }

    public abstract void a(long j);

    public abstract void a_();

    public abstract void c();

    public boolean d() {
        j jVar;
        k kVar;
        return com.anythink.expressad.shake.a.a().b() && (jVar = this.e) != null && (kVar = jVar.m) != null && kVar.J() == 1;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public void destroy() {
        super.destroy();
        if (d()) {
            com.anythink.expressad.shake.a.a().b(this.G);
        }
        this.x = null;
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void f() {
        if (this.f instanceof x) {
            if (this.y == null) {
                this.y = new a(this);
            }
            post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashAdView.7
                @Override // java.lang.Runnable
                public final void run() {
                    BaseSplashAdView.this.y.a();
                }
            });
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void g() {
        if (!(this.f instanceof x) || this.y == null) {
            return;
        }
        post(new Runnable() { // from class: com.anythink.basead.ui.BaseSplashAdView.8
            @Override // java.lang.Runnable
            public final void run() {
                BaseSplashAdView.this.y.b();
            }
        });
    }

    public final void m() {
        RoundImageView roundImageView = (RoundImageView) findViewById(com.anythink.core.common.j.h.a(getContext(), "myoffer_splash_ad_logo", "id"));
        this.z = roundImageView;
        final ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
        if (!TextUtils.isEmpty(this.f.q())) {
            this.z.setVisibility(0);
            int i = layoutParams.width;
            b.a(getContext()).a(new e(1, this.f.q()), i, i, new b.a() { // from class: com.anythink.basead.ui.BaseSplashAdView.3
                @Override // com.anythink.core.common.res.b.a
                public final void onFail(String str, String str2) {
                }

                @Override // com.anythink.core.common.res.b.a
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (TextUtils.equals(str, BaseSplashAdView.this.f.q())) {
                        float width = (bitmap.getWidth() * 1.0f) / bitmap.getHeight();
                        ViewGroup.LayoutParams layoutParams2 = layoutParams;
                        int i2 = layoutParams2.height;
                        layoutParams2.width = (int) (i2 * width);
                        layoutParams2.height = i2;
                        BaseSplashAdView.this.z.setLayoutParams(layoutParams2);
                        BaseSplashAdView.this.z.setScaleType(ImageView.ScaleType.FIT_XY);
                        BaseSplashAdView.this.z.setImageBitmap(bitmap);
                    }
                }
            });
        } else if (this.f.F() != null) {
            Bitmap F = this.f.F();
            float width = (F.getWidth() * 1.0f) / F.getHeight();
            int i2 = layoutParams.height;
            layoutParams.width = (int) (i2 * width);
            layoutParams.height = i2;
            this.z.setLayoutParams(layoutParams);
            this.z.setScaleType(ImageView.ScaleType.FIT_XY);
            this.z.setImageBitmap(F);
            this.z.setImageBitmap(this.f.F());
        } else {
            this.z.setVisibility(8);
        }
        this.t.add(this.z);
        a_();
        ShakeView shakeView = this.A;
        if (shakeView != null) {
            shakeView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BaseSplashAdView.this.b(1);
                }
            });
        }
    }

    public void n() {
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            View view = this.t.get(i);
            if (view != null) {
                view.setOnClickListener(this.C);
            }
        }
        setOnClickListener(this.B);
    }

    @Override // com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (d()) {
            com.anythink.expressad.shake.a.a().a(this.G);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (d()) {
            com.anythink.expressad.shake.a.a().b(this.G);
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0 || this.D) {
            return;
        }
        this.D = true;
        if (this.F) {
            return;
        }
        this.c.setVisibility(0);
        this.c.setOnClickListener(new AnonymousClass5());
        this.E = false;
        AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.e.m.l());
        this.w = anonymousClass6;
        anonymousClass6.start();
    }

    public void setDontCountDown(boolean z) {
        FrameLayout frameLayout;
        this.F = z;
        if (!z || (frameLayout = this.c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(int i) {
        com.anythink.basead.e.a aVar = this.x;
        if (aVar != null) {
            aVar.onAdClick(i);
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void b() {
        com.anythink.basead.a.b.a(8, this.f, i());
        com.anythink.basead.e.a aVar = this.x;
        if (aVar != null) {
            aVar.onAdShow();
        }
    }

    @Override // com.anythink.basead.ui.BaseAdView
    public final void a(boolean z) {
        com.anythink.basead.e.a aVar = this.x;
        if (aVar != null) {
            aVar.onDeeplinkCallback(z);
        }
    }

    public BaseSplashAdView(Context context, j jVar, i iVar, com.anythink.basead.e.a aVar) {
        super(context, jVar, iVar);
        this.v = "Skip";
        this.B = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k kVar = BaseSplashAdView.this.e.m;
                if (kVar == null || kVar.u() != 0) {
                    return;
                }
                BaseSplashAdView.super.b(1);
            }
        };
        this.C = new View.OnClickListener() { // from class: com.anythink.basead.ui.BaseSplashAdView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseSplashAdView.super.b(1);
            }
        };
        this.D = false;
        this.E = false;
        this.G = new h() { // from class: com.anythink.basead.ui.BaseSplashAdView.9
            @Override // com.anythink.basead.c.h
            public final boolean a() {
                if (BaseSplashAdView.this.isShown()) {
                    BaseSplashAdView.this.b(4);
                    return true;
                }
                return false;
            }
        };
        this.x = aVar;
        this.v = getResources().getString(com.anythink.core.common.j.h.a(getContext(), "myoffer_splash_skip_text", "string"));
        this.b = (TextView) findViewById(com.anythink.core.common.j.h.a(getContext(), "myoffer_splash_skip", "id"));
        this.c = (FrameLayout) findViewById(com.anythink.core.common.j.h.a(getContext(), "myoffer_splash_skip_area", "id"));
        this.G.a(jVar.m.K(), jVar.m.L());
        c();
        n();
    }
}
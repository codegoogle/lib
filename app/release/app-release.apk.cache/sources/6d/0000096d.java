package com.anythink.expressad.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.j.k;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.h;
import com.anythink.expressad.foundation.h.m;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;
import com.anythink.expressad.shake.MBShakeView;
import com.anythink.expressad.widget.FeedBackButton;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public class ATSplashNativeView extends RelativeLayout {
    private static final String a = "MBSplashNativeView";
    private int A;
    private int B;
    private float C;
    private float D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private String J;
    private String K;
    private ATSplashView L;
    private c M;
    private MBShakeView N;
    private String O;
    private String P;
    private String Q;
    private com.anythink.expressad.shake.b R;
    private MBNoRecycledCrashImageView b;
    private MBNoRecycledCrashImageView c;
    private RelativeLayout d;
    private ImageView e;
    private FeedBackButton f;
    private TextView g;
    private RelativeLayout h;
    private MBNoRecycledCrashImageView i;
    private TextView j;
    private MBNoRecycledCrashImageView k;
    private TextView l;
    private TextView m;
    private RelativeLayout n;
    private TextView o;
    private TextView p;
    private TextView q;
    private MBSplashClickView r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements com.anythink.expressad.foundation.g.d.c {
        public AnonymousClass1() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        ATSplashNativeView.this.F = true;
                        ATSplashNativeView.this.h.setVisibility(4);
                        ATSplashNativeView.this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ATSplashNativeView.this.c.setImageBitmap(bitmap);
                    } else if (ATSplashNativeView.this.A == 1) {
                        ATSplashNativeView.this.h.setVisibility(0);
                        Bitmap a = m.a(bitmap, s.b(com.anythink.core.common.b.m.a().e(), 10.0f));
                        if (a != null && !a.isRecycled()) {
                            ATSplashNativeView.this.k.setScaleType(ImageView.ScaleType.FIT_XY);
                            ATSplashNativeView.this.k.setImageBitmap(a);
                        }
                        ATSplashNativeView.this.j.setText(ATSplashNativeView.this.M.bb());
                        ATSplashNativeView.h(ATSplashNativeView.this);
                        try {
                            Bitmap b = m.b(bitmap);
                            if (b != null && !b.isRecycled()) {
                                ATSplashNativeView.this.c.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                ATSplashNativeView.this.c.setImageBitmap(b);
                            }
                        } catch (Throwable unused) {
                            ATSplashNativeView.this.c.setImageBitmap(bitmap);
                        }
                    } else {
                        ATSplashNativeView.this.h.setVisibility(4);
                        ATSplashNativeView.this.c.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        ATSplashNativeView.this.c.setImageBitmap(bitmap);
                    }
                    Bitmap b2 = m.b(bitmap);
                    if (b2 == null || b2.isRecycled()) {
                        return;
                    }
                    ATSplashNativeView.this.b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    ATSplashNativeView.this.b.setImageBitmap(b2);
                } catch (Throwable th) {
                    n.d(ATSplashNativeView.a, th.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$10  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass10 implements View.OnClickListener {
        public AnonymousClass10() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.G) {
                if (ATSplashNativeView.this.L.getSplashJSBridgeImpl() != null && ATSplashNativeView.this.L.getSplashJSBridgeImpl().getSplashBridgeListener() != null) {
                    ATSplashNativeView.this.L.getSplashJSBridgeImpl().getSplashBridgeListener().c();
                }
                ATSplashNativeView.this.g.setVisibility(4);
                ATSplashNativeView.this.g.setEnabled(false);
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$11  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass11 implements com.anythink.expressad.foundation.f.a {
        public AnonymousClass11() {
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void a() {
            ATSplashNativeView.this.I = true;
            ATSplashNativeView.b(ATSplashNativeView.this, false);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void b() {
            ATSplashNativeView.this.I = false;
            ATSplashNativeView.b(ATSplashNativeView.this, true);
        }

        @Override // com.anythink.expressad.foundation.f.a
        public final void c() {
            ATSplashNativeView.this.I = false;
            ATSplashNativeView.b(ATSplashNativeView.this, true);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends com.anythink.expressad.shake.b {
        public AnonymousClass3(int i, int i2) {
            super(i, i2);
        }

        @Override // com.anythink.expressad.shake.b
        public final void a() {
            if (ATSplashNativeView.this.I || ATSplashNativeView.this.H) {
                return;
            }
            ATSplashNativeView.a(ATSplashNativeView.this, 4);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$6  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass6 implements View.OnClickListener {
        public AnonymousClass6() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 1);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$7  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass7 implements View.OnClickListener {
        public AnonymousClass7() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ATSplashNativeView.a(ATSplashNativeView.this, 0);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$8  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass8 implements View.OnClickListener {
        public AnonymousClass8() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ATSplashNativeView.this.M.aG() != null) {
                String c = ATSplashNativeView.this.M.aG().c();
                if (TextUtils.isEmpty(c)) {
                    return;
                }
                k.b(ATSplashNativeView.this.getContext(), c);
            }
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$9  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass9 implements View.OnClickListener {
        public AnonymousClass9() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.anythink.expressad.foundation.d.a aG = ATSplashNativeView.this.M.aG();
            if (aG != null) {
                k.b(com.anythink.core.common.b.m.a().e(), aG.a());
            }
        }
    }

    public ATSplashNativeView(Context context) {
        super(context);
        this.H = false;
        this.I = false;
    }

    private void h() {
        if (this.u == 1) {
            setOnClickListener(new AnonymousClass6());
        } else {
            this.r.setOnClickListener(new AnonymousClass7());
        }
        this.p.setOnClickListener(new AnonymousClass8());
        this.q.setOnClickListener(new AnonymousClass9());
        this.g.setOnClickListener(new AnonymousClass10());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.x != 1 || this.N == null || this.R == null) {
                return;
            }
            com.anythink.expressad.shake.a.a().a(this.R);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.C = motionEvent.getRawX();
        this.D = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.R != null) {
                com.anythink.expressad.shake.a.a().b(this.R);
                this.R = null;
            }
            com.anythink.expressad.foundation.f.b.a().c(this.J);
            detachAllViewsFromParent();
        } catch (Exception e) {
            n.d(a, e.getMessage());
        }
    }

    public void setIsPause(boolean z) {
        this.H = z;
    }

    public void setNotchPadding(int i, int i2, int i3, int i4) {
        this.d.setPadding(i, i3, i2, i4);
    }

    public void updateCountDown(int i) {
        String str;
        if (this.g != null) {
            this.t = i;
            if (this.G) {
                str = this.P + " " + i + this.O;
            } else {
                str = i + this.O + " " + this.Q;
            }
            this.g.setText(str);
        }
    }

    private void b() {
        try {
            this.E = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.U);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.M.j(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
        } else {
            FeedBackButton feedBackButton = this.f;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
            }
        }
        if (!TextUtils.isEmpty(this.M.be())) {
            wo1.m0().a(this.M.be(), new AnonymousClass1());
        } else {
            this.c.setVisibility(4);
        }
        e();
        if (this.M.aG() != null && this.w == 0) {
            com.anythink.expressad.foundation.d.a aG = this.M.aG();
            StringBuilder G = wo1.G("应用名称：");
            G.append(aG.b());
            G.append("\n版本：");
            G.append(aG.e());
            G.append("\n开发者：");
            G.append(aG.f());
            G.append("\n更新时间：");
            G.append(aG.d());
            this.o.setText(G);
        } else {
            this.n.setVisibility(8);
        }
        if (this.v == 1) {
            this.r.setVisibility(8);
        } else if (this.x == 1) {
            this.r.setVisibility(8);
        } else {
            this.r.initView(this.M.cS);
        }
        if (this.u == 1) {
            setOnClickListener(new AnonymousClass6());
        } else {
            this.r.setOnClickListener(new AnonymousClass7());
        }
        this.p.setOnClickListener(new AnonymousClass8());
        this.q.setOnClickListener(new AnonymousClass9());
        this.g.setOnClickListener(new AnonymousClass10());
        if (this.x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.N = mBShakeView;
            mBShakeView.initView(this.M.cS);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.N.setLayoutParams(layoutParams);
            addView(this.N);
            this.r.setVisibility(4);
            this.r.setEnabled(false);
            this.N.setOnClickListener(new AnonymousClass2());
            this.R = new AnonymousClass3(this.y, this.z * 1000);
        }
        updateCountDown(this.s);
    }

    private void c() {
        if (!TextUtils.isEmpty(this.M.be())) {
            wo1.m0().a(this.M.be(), new AnonymousClass1());
        } else {
            this.c.setVisibility(4);
        }
    }

    private void d() {
        if (!TextUtils.isEmpty(this.M.bd())) {
            wo1.m0().a(this.M.bd(), new AnonymousClass4());
        } else {
            this.i.setVisibility(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void e() {
        Drawable drawable;
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
        if (b != null) {
            final String K = b.K();
            if (TextUtils.isEmpty(K)) {
                this.e.setVisibility(8);
            }
            this.e.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.splash.view.ATSplashNativeView.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    k.b(ATSplashNativeView.this.getContext(), K);
                }
            });
        } else {
            this.e.setVisibility(8);
        }
        try {
            drawable = getResources().getDrawable(h.a(getContext().getApplicationContext(), "anythink_splash_m_circle", h.c));
        } catch (Throwable th) {
            th = th;
            drawable = null;
        }
        try {
            drawable.setBounds(0, 0, s.b(getContext(), 10.0f), s.b(getContext(), 10.0f));
        } catch (Throwable th2) {
            th = th2;
            n.d(a, th.getMessage());
            if (this.A != 1) {
            }
            if (this.B != 0) {
                this.l.setCompoundDrawables(drawable, null, null, null);
            }
            this.l.setText(this.E ? "AD" : "广告");
            this.m.setVisibility(4);
        }
        if (this.A != 1 && this.F) {
            if (this.B != 0 && drawable != null) {
                this.m.setCompoundDrawables(drawable, null, null, null);
            }
            this.m.setText(this.E ? "AD" : "广告");
            this.l.setVisibility(4);
            return;
        }
        if (this.B != 0 && drawable != null) {
            this.l.setCompoundDrawables(drawable, null, null, null);
        }
        this.l.setText(this.E ? "AD" : "广告");
        this.m.setVisibility(4);
    }

    private void f() {
        if (this.M.aG() != null && this.w == 0) {
            com.anythink.expressad.foundation.d.a aG = this.M.aG();
            StringBuilder G = wo1.G("应用名称：");
            G.append(aG.b());
            G.append("\n版本：");
            G.append(aG.e());
            G.append("\n开发者：");
            G.append(aG.f());
            G.append("\n更新时间：");
            G.append(aG.d());
            this.o.setText(G);
            return;
        }
        this.n.setVisibility(8);
    }

    private void g() {
        if (this.v == 1) {
            this.r.setVisibility(8);
        } else if (this.x == 1) {
            this.r.setVisibility(8);
        } else {
            this.r.initView(this.M.cS);
        }
    }

    private void i() {
        if (com.anythink.expressad.foundation.f.b.a().b()) {
            this.M.j(this.J);
            com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
            com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
            return;
        }
        FeedBackButton feedBackButton = this.f;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    private void j() {
        if (this.x == 1) {
            MBShakeView mBShakeView = new MBShakeView(getContext());
            this.N = mBShakeView;
            mBShakeView.initView(this.M.cS);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.N.setLayoutParams(layoutParams);
            addView(this.N);
            this.r.setVisibility(4);
            this.r.setEnabled(false);
            this.N.setOnClickListener(new AnonymousClass2());
            this.R = new AnonymousClass3(this.y, this.z * 1000);
        }
    }

    private void a() {
        int a2;
        try {
            if (this.A == 1) {
                a2 = h.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
            } else {
                a2 = h.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
            }
            View inflate = LayoutInflater.from(getContext()).inflate(a2, (ViewGroup) null);
            addView(inflate);
            this.b = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
            this.c = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
            this.d = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
            this.e = (ImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
            this.f = (FeedBackButton) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
            this.g = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
            this.h = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
            this.i = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
            this.j = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
            this.k = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
            this.l = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
            this.n = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
            this.o = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
            this.p = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
            this.q = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
            this.r = (MBSplashClickView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
            this.m = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
            int a3 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", "string");
            int a4 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", "string");
            int a5 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", "string");
            this.P = getContext().getResources().getString(a3);
            this.Q = getContext().getResources().getString(a4);
            this.O = getContext().getResources().getString(a5);
        } catch (Throwable th) {
            n.d(a, th.getMessage());
        }
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ATSplashNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.H = false;
        this.I = false;
    }

    public static /* synthetic */ void h(ATSplashNativeView aTSplashNativeView) {
        if (!TextUtils.isEmpty(aTSplashNativeView.M.bd())) {
            wo1.m0().a(aTSplashNativeView.M.bd(), new AnonymousClass4());
        } else {
            aTSplashNativeView.i.setVisibility(4);
        }
    }

    /* renamed from: com.anythink.expressad.splash.view.ATSplashNativeView$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements com.anythink.expressad.foundation.g.d.c {
        public AnonymousClass4() {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            Bitmap a;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled() || ATSplashNativeView.this.i == null || (a = m.a(bitmap, s.b(com.anythink.core.common.b.m.a().e(), 40.0f))) == null || a.isRecycled()) {
                        return;
                    }
                    ATSplashNativeView.this.i.setImageBitmap(a);
                } catch (Throwable th) {
                    n.d(ATSplashNativeView.a, th.getMessage());
                }
            }
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
            ATSplashNativeView.this.i.setVisibility(4);
        }
    }

    public ATSplashNativeView(Context context, ATSplashView aTSplashView, com.anythink.expressad.splash.a.b bVar) {
        super(context);
        int a2;
        this.H = false;
        this.I = false;
        if (bVar != null) {
            this.J = bVar.b();
            this.K = bVar.a();
            this.M = bVar.c();
            this.L = aTSplashView;
            this.s = bVar.e();
            this.v = bVar.f();
            this.u = bVar.g();
            this.w = bVar.h();
            this.x = bVar.i();
            this.y = bVar.j();
            this.z = bVar.k();
            this.A = bVar.l();
            this.G = bVar.d();
            this.B = bVar.m();
            try {
                if (this.A == 1) {
                    a2 = h.a(getContext().getApplicationContext(), "anythink_splash_portrait", "layout");
                } else {
                    a2 = h.a(getContext().getApplicationContext(), "anythink_splash_landscape", "layout");
                }
                View inflate = LayoutInflater.from(getContext()).inflate(a2, (ViewGroup) null);
                addView(inflate);
                this.b = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_image_bg", "id"));
                this.c = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_image", "id"));
                this.d = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_topcontroller", "id"));
                this.e = (ImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_link", "id"));
                this.f = (FeedBackButton) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_feedback", "id"));
                this.g = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_skip", "id"));
                this.h = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_landscape_foreground", "id"));
                this.i = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_icon", "id"));
                this.j = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_title", "id"));
                this.k = (MBNoRecycledCrashImageView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_iv_foregroundimage", "id"));
                this.l = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_adrect", "id"));
                this.n = (RelativeLayout) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_layout_appinfo", "id"));
                this.o = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_appinfo", "id"));
                this.p = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_privacy", "id"));
                this.q = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_permission", "id"));
                this.r = (MBSplashClickView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_click", "id"));
                this.m = (TextView) inflate.findViewById(h.a(getContext().getApplicationContext(), "anythink_splash_tv_adcircle", "id"));
                int a3 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip", "string");
                int a4 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_not", "string");
                int a5 = h.a(getContext().getApplicationContext(), "anythink_splash_count_time_can_skip_s", "string");
                this.P = getContext().getResources().getString(a3);
                this.Q = getContext().getResources().getString(a4);
                this.O = getContext().getResources().getString(a5);
            } catch (Throwable th) {
                n.d(a, th.getMessage());
            }
            try {
                this.E = getContext().getResources().getConfiguration().locale.getLanguage().contains(com.anythink.expressad.video.dynview.a.a.U);
            } catch (Throwable th2) {
                n.d(a, th2.getMessage());
            }
            if (com.anythink.expressad.foundation.f.b.a().b()) {
                this.M.j(this.J);
                com.anythink.expressad.foundation.f.b.a().a(this.J, new AnonymousClass11());
                com.anythink.expressad.foundation.f.b.a().a(this.J, this.f);
                com.anythink.expressad.foundation.f.b.a().a(this.J, this.M);
            } else {
                FeedBackButton feedBackButton = this.f;
                if (feedBackButton != null) {
                    feedBackButton.setVisibility(8);
                }
            }
            if (!TextUtils.isEmpty(this.M.be())) {
                wo1.m0().a(this.M.be(), new AnonymousClass1());
            } else {
                this.c.setVisibility(4);
            }
            e();
            if (this.M.aG() != null && this.w == 0) {
                com.anythink.expressad.foundation.d.a aG = this.M.aG();
                StringBuilder G = wo1.G("应用名称：");
                G.append(aG.b());
                G.append("\n版本：");
                G.append(aG.e());
                G.append("\n开发者：");
                G.append(aG.f());
                G.append("\n更新时间：");
                G.append(aG.d());
                this.o.setText(G);
            } else {
                this.n.setVisibility(8);
            }
            if (this.v == 1) {
                this.r.setVisibility(8);
            } else if (this.x == 1) {
                this.r.setVisibility(8);
            } else {
                this.r.initView(this.M.cS);
            }
            if (this.u == 1) {
                setOnClickListener(new AnonymousClass6());
            } else {
                this.r.setOnClickListener(new AnonymousClass7());
            }
            this.p.setOnClickListener(new AnonymousClass8());
            this.q.setOnClickListener(new AnonymousClass9());
            this.g.setOnClickListener(new AnonymousClass10());
            if (this.x == 1) {
                MBShakeView mBShakeView = new MBShakeView(getContext());
                this.N = mBShakeView;
                mBShakeView.initView(this.M.cS);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(13);
                this.N.setLayoutParams(layoutParams);
                addView(this.N);
                this.r.setVisibility(4);
                this.r.setEnabled(false);
                this.N.setOnClickListener(new AnonymousClass2());
                this.R = new AnonymousClass3(this.y, this.z * 1000);
            }
            updateCountDown(this.s);
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a(int i) {
        if (this.L.getSplashJSBridgeImpl() == null || this.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.b.a(com.anythink.expressad.splash.a.a.b.a(i, this.C, this.D), this.M));
        } catch (Throwable th) {
            n.d(a, th.getMessage());
            this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(this.M);
        }
    }

    private void a(boolean z) {
        if (this.L.getSplashJSBridgeImpl() == null || this.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        this.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(z ? 2 : 1, this.t);
    }

    public static /* synthetic */ void a(ATSplashNativeView aTSplashNativeView, int i) {
        if (aTSplashNativeView.L.getSplashJSBridgeImpl() == null || aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        try {
            aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(com.anythink.expressad.splash.a.a.b.a(com.anythink.expressad.splash.a.a.b.a(i, aTSplashNativeView.C, aTSplashNativeView.D), aTSplashNativeView.M));
        } catch (Throwable th) {
            n.d(a, th.getMessage());
            aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(aTSplashNativeView.M);
        }
    }

    public static /* synthetic */ void b(ATSplashNativeView aTSplashNativeView, boolean z) {
        if (aTSplashNativeView.L.getSplashJSBridgeImpl() == null || aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener() == null) {
            return;
        }
        aTSplashNativeView.L.getSplashJSBridgeImpl().getSplashBridgeListener().a(z ? 2 : 1, aTSplashNativeView.t);
    }
}
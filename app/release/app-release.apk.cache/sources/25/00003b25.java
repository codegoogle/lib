package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.webkit.WebView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.ri3;
import com.p7700g.p99005.vn3;

/* compiled from: InAppMessageView.java */
/* loaded from: classes3.dex */
public class bj3 {
    private static final String a = "IN_APP_MESSAGE_CARD_VIEW_TAG";
    private static final int d = 1000;
    private static final int e = 1000;
    private static final int f = 400;
    private static final int g = 600;
    private static final int h = 200;
    private RelativeLayout A;
    private ri3 B;
    private j C;
    private Runnable D;
    private PopupWindow j;
    private Activity k;
    private int n;
    private double s;
    private boolean t;
    private boolean w;
    private bk3 x;
    @x1
    private vn3.m y;
    private WebView z;
    private static final int b = Color.parseColor("#00000000");
    private static final int c = Color.parseColor("#BB000000");
    private static final int i = gm3.b(4);
    private final Handler l = new Handler();
    private int o = gm3.b(24);
    private int p = gm3.b(24);
    private int q = gm3.b(24);
    private int r = gm3.b(24);
    private boolean u = false;
    private boolean v = false;
    private int m = -1;

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ int s;

        public a(int i) {
            this.s = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bj3.this.z != null) {
                ViewGroup.LayoutParams layoutParams = bj3.this.z.getLayoutParams();
                if (layoutParams == null) {
                    jm3.P1(jm3.u0.WARN, "WebView height update skipped because of null layoutParams, new height will be used once it is displayed.");
                    return;
                }
                layoutParams.height = this.s;
                bj3.this.z.setLayoutParams(layoutParams);
                if (bj3.this.B != null) {
                    ri3 ri3Var = bj3.this.B;
                    bj3 bj3Var = bj3.this;
                    ri3Var.i(bj3Var.F(this.s, bj3Var.y, bj3.this.w));
                    return;
                }
                return;
            }
            jm3.P1(jm3.u0.WARN, "WebView height update skipped, new height will be used once it is displayed.");
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public final /* synthetic */ RelativeLayout.LayoutParams s;
        public final /* synthetic */ RelativeLayout.LayoutParams t;
        public final /* synthetic */ ri3.c u;
        public final /* synthetic */ vn3.m v;

        public b(RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, ri3.c cVar, vn3.m mVar) {
            this.s = layoutParams;
            this.t = layoutParams2;
            this.u = cVar;
            this.v = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bj3.this.z == null) {
                return;
            }
            bj3.this.z.setLayoutParams(this.s);
            Context applicationContext = bj3.this.k.getApplicationContext();
            bj3.this.S(applicationContext, this.t, this.u);
            bj3.this.T(applicationContext);
            bj3 bj3Var = bj3.this;
            bj3Var.H(bj3Var.A);
            if (bj3.this.C != null) {
                bj3 bj3Var2 = bj3.this;
                bj3Var2.z(this.v, bj3Var2.B, bj3.this.A);
            }
            bj3.this.Y();
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class c implements ri3.b {
        public c() {
        }

        @Override // com.p7700g.p99005.ri3.b
        public void a() {
            bj3.this.v = true;
        }

        @Override // com.p7700g.p99005.ri3.b
        public void b() {
            bj3.this.v = false;
        }

        @Override // com.p7700g.p99005.ri3.b
        public void onDismiss() {
            if (bj3.this.C != null) {
                bj3.this.C.c();
            }
            bj3.this.L(null);
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (bj3.this.C != null) {
                bj3.this.C.c();
            }
            if (bj3.this.k == null) {
                bj3.this.u = true;
                return;
            }
            bj3.this.K(null);
            bj3.this.D = null;
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public final /* synthetic */ Activity s;

        public e(Activity activity) {
            this.s = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            bj3.this.I(this.s);
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public final /* synthetic */ vn3.l s;

        public f(vn3.l lVar) {
            this.s = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!bj3.this.t || bj3.this.A == null) {
                bj3.this.C();
                vn3.l lVar = this.s;
                if (lVar != null) {
                    lVar.onComplete();
                    return;
                }
                return;
            }
            bj3 bj3Var = bj3.this;
            bj3Var.v(bj3Var.A, this.s);
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class g implements Animation.AnimationListener {
        public final /* synthetic */ CardView a;

        public g(CardView cardView) {
            this.a = cardView;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (Build.VERSION.SDK_INT == 23) {
                this.a.setCardElevation(gm3.b(5));
            }
            if (bj3.this.C != null) {
                bj3.this.C.b();
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public class h extends AnimatorListenerAdapter {
        public final /* synthetic */ vn3.l s;

        public h(vn3.l lVar) {
            this.s = lVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            bj3.this.C();
            vn3.l lVar = this.s;
            if (lVar != null) {
                lVar.onComplete();
            }
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class i {
        public static final /* synthetic */ int[] a;

        static {
            vn3.m.values();
            int[] iArr = new int[4];
            a = iArr;
            try {
                iArr[vn3.m.TOP_BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[vn3.m.BOTTOM_BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[vn3.m.CENTER_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[vn3.m.FULL_SCREEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: InAppMessageView.java */
    /* loaded from: classes3.dex */
    public interface j {
        void a();

        void b();

        void c();
    }

    public bj3(@x1 WebView webView, @x1 bk3 bk3Var, boolean z) {
        this.w = false;
        this.z = webView;
        this.y = bk3Var.c();
        this.n = bk3Var.d();
        this.s = bk3Var.b() == null ? zg2.s : bk3Var.b().doubleValue();
        this.t = !this.y.f();
        this.w = z;
        this.x = bk3Var;
        Q(bk3Var);
    }

    private void A(View view, int i2, Animation.AnimationListener animationListener) {
        lm3.a(view, (-i2) - this.q, 0.0f, 1000, new nm3(0.1d, 8.0d), animationListener).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        P();
        j jVar = this.C;
        if (jVar != null) {
            jVar.a();
        }
    }

    private Animation.AnimationListener D(CardView cardView) {
        return new g(cardView);
    }

    private CardView E(Context context) {
        CardView cardView = new CardView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.y == vn3.m.FULL_SCREEN ? -1 : -2);
        layoutParams.addRule(13);
        cardView.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT == 23) {
            cardView.setCardElevation(0.0f);
        } else {
            cardView.setCardElevation(gm3.b(5));
        }
        cardView.setRadius(gm3.b(8));
        cardView.setClipChildren(false);
        cardView.setClipToPadding(false);
        cardView.setPreventCornerOverlap(false);
        cardView.setCardBackgroundColor(0);
        return cardView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ri3.c F(int i2, vn3.m mVar, boolean z) {
        ri3.c cVar = new ri3.c();
        cVar.f = this.p;
        cVar.d = this.q;
        cVar.j = z;
        cVar.h = i2;
        cVar.g = N();
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            cVar.e = this.q - i;
        } else if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    i2 = N() - (this.r + this.q);
                    cVar.h = i2;
                }
            }
            int N = (N() / 2) - (i2 / 2);
            cVar.e = i + N;
            cVar.d = N;
            cVar.c = N;
        } else {
            cVar.c = N() - i2;
            cVar.e = this.r + i;
        }
        cVar.i = mVar == vn3.m.TOP_BANNER ? 0 : 1;
        return cVar;
    }

    private RelativeLayout.LayoutParams G() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.m, -1);
        int ordinal = this.y.ordinal();
        if (ordinal == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(14);
        } else if (ordinal == 1) {
            layoutParams.addRule(12);
            layoutParams.addRule(14);
        } else if (ordinal == 2 || ordinal == 3) {
            layoutParams.addRule(13);
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r5 != 3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void H(@x1 RelativeLayout relativeLayout) {
        boolean z = this.t;
        int i2 = z ? -1 : this.m;
        int i3 = z ? -1 : -2;
        int i4 = 1;
        PopupWindow popupWindow = new PopupWindow((View) relativeLayout, i2, i3, true);
        this.j = popupWindow;
        popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        this.j.setTouchable(true);
        this.j.setClippingEnabled(false);
        if (!this.t) {
            int ordinal = this.y.ordinal();
            if (ordinal == 0) {
                i4 = 49;
            } else if (ordinal == 1) {
                i4 = 81;
            } else if (ordinal != 2) {
            }
            lt.d(this.j, !this.x.g() ? 1000 : 1003);
            this.j.showAtLocation(this.k.getWindow().getDecorView().getRootView(), i4, 0, 0);
        }
        i4 = 0;
        lt.d(this.j, !this.x.g() ? 1000 : 1003);
        this.j.showAtLocation(this.k.getWindow().getDecorView().getRootView(), i4, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(Activity activity) {
        if (gm3.k(activity) && this.A == null) {
            W(activity);
        } else {
            new Handler().postDelayed(new e(activity), 200L);
        }
    }

    private void J() {
        this.A = null;
        this.B = null;
        this.z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(vn3.l lVar) {
        OSUtils.U(new f(lVar), 600);
    }

    private int N() {
        return gm3.f(this.k);
    }

    private void Q(bk3 bk3Var) {
        this.q = bk3Var.e() ? gm3.b(24) : 0;
        this.r = bk3Var.e() ? gm3.b(24) : 0;
        this.o = bk3Var.f() ? gm3.b(24) : 0;
        this.p = bk3Var.f() ? gm3.b(24) : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(Context context, RelativeLayout.LayoutParams layoutParams, ri3.c cVar) {
        ri3 ri3Var = new ri3(context);
        this.B = ri3Var;
        if (layoutParams != null) {
            ri3Var.setLayoutParams(layoutParams);
        }
        this.B.i(cVar);
        this.B.h(new c());
        if (this.z.getParent() != null) {
            ((ViewGroup) this.z.getParent()).removeAllViews();
        }
        CardView E = E(context);
        E.setTag(a);
        E.addView(this.z);
        this.B.setPadding(this.o, this.q, this.p, this.r);
        this.B.setClipChildren(false);
        this.B.setClipToPadding(false);
        this.B.addView(E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T(Context context) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.A = relativeLayout;
        relativeLayout.setBackgroundDrawable(new ColorDrawable(0));
        this.A.setClipChildren(false);
        this.A.setClipToPadding(false);
        this.A.addView(this.B);
    }

    private void V(vn3.m mVar, RelativeLayout.LayoutParams layoutParams, RelativeLayout.LayoutParams layoutParams2, ri3.c cVar) {
        OSUtils.V(new b(layoutParams, layoutParams2, cVar, mVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (this.s > zg2.s && this.D == null) {
            d dVar = new d();
            this.D = dVar;
            this.l.postDelayed(dVar, ((long) this.s) * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(View view, vn3.l lVar) {
        w(view, f, c, b, new h(lVar)).start();
    }

    private ValueAnimator w(View view, int i2, int i3, int i4, Animator.AnimatorListener animatorListener) {
        return lm3.b(view, i2, i3, i4, animatorListener);
    }

    private void x(View view, int i2, Animation.AnimationListener animationListener) {
        lm3.a(view, i2 + this.r, 0.0f, 1000, new nm3(0.1d, 8.0d), animationListener).start();
    }

    private void y(View view, View view2, Animation.AnimationListener animationListener, Animator.AnimatorListener animatorListener) {
        Animation c2 = lm3.c(view, 1000, new nm3(0.1d, 8.0d), animationListener);
        ValueAnimator w = w(view2, f, b, c, animatorListener);
        c2.start();
        w.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(vn3.m mVar, View view, View view2) {
        CardView cardView = (CardView) view.findViewWithTag(a);
        Animation.AnimationListener D = D(cardView);
        int ordinal = mVar.ordinal();
        if (ordinal == 0) {
            A(cardView, this.z.getHeight(), D);
        } else if (ordinal == 1) {
            x(cardView, this.z.getHeight(), D);
        } else if (ordinal == 2 || ordinal == 3) {
            y(view, view2, D, null);
        }
    }

    public void B() {
        if (this.u) {
            this.u = false;
            L(null);
        }
    }

    public void K(@z1 vn3.l lVar) {
        ri3 ri3Var = this.B;
        if (ri3Var == null) {
            jm3.b(jm3.u0.ERROR, "No host presenter to trigger dismiss animation, counting as dismissed already", new Throwable());
            J();
            if (lVar != null) {
                lVar.onComplete();
                return;
            }
            return;
        }
        ri3Var.g();
        L(lVar);
    }

    @x1
    public vn3.m M() {
        return this.y;
    }

    public boolean O() {
        return this.v;
    }

    public void P() {
        jm3.P1(jm3.u0.DEBUG, "InAppMessageView removing views");
        Runnable runnable = this.D;
        if (runnable != null) {
            this.l.removeCallbacks(runnable);
            this.D = null;
        }
        ri3 ri3Var = this.B;
        if (ri3Var != null) {
            ri3Var.removeAllViews();
        }
        PopupWindow popupWindow = this.j;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        J();
    }

    public void R(j jVar) {
        this.C = jVar;
    }

    public void U(WebView webView) {
        this.z = webView;
        webView.setBackgroundColor(0);
    }

    public void W(Activity activity) {
        this.k = activity;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.n);
        layoutParams.addRule(13);
        RelativeLayout.LayoutParams G = this.t ? G() : null;
        vn3.m mVar = this.y;
        V(mVar, layoutParams, G, F(this.n, mVar, this.w));
    }

    public void X(Activity activity) {
        I(activity);
    }

    public void Z(int i2) {
        this.n = i2;
        OSUtils.V(new a(i2));
    }

    public String toString() {
        StringBuilder G = wo1.G("InAppMessageView{currentActivity=");
        G.append(this.k);
        G.append(", pageWidth=");
        G.append(this.m);
        G.append(", pageHeight=");
        G.append(this.n);
        G.append(", displayDuration=");
        G.append(this.s);
        G.append(", hasBackground=");
        G.append(this.t);
        G.append(", shouldDismissWhenActive=");
        G.append(this.u);
        G.append(", isDragging=");
        G.append(this.v);
        G.append(", disableDragDismiss=");
        G.append(this.w);
        G.append(", displayLocation=");
        G.append(this.y);
        G.append(", webView=");
        G.append(this.z);
        G.append('}');
        return G.toString();
    }
}
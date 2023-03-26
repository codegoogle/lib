package com.p7700g.p99005;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p7700g.p99005.ga2;

/* compiled from: BottomSheetDialog.java */
/* loaded from: classes2.dex */
public class hb2 extends h3 {
    public boolean A;
    public boolean B;
    private boolean C;
    private boolean D;
    private BottomSheetBehavior.f E;
    private boolean F;
    @x1
    private BottomSheetBehavior.f G;
    private BottomSheetBehavior<FrameLayout> w;
    private FrameLayout x;
    private CoordinatorLayout y;
    private FrameLayout z;

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class a implements jr {
        public a() {
        }

        @Override // com.p7700g.p99005.jr
        public gs a(View view, gs gsVar) {
            if (hb2.this.E != null) {
                hb2.this.w.D0(hb2.this.E);
            }
            if (gsVar != null) {
                hb2 hb2Var = hb2.this;
                hb2Var.E = new f(hb2Var.z, gsVar, null);
                hb2.this.w.Y(hb2.this.E);
            }
            return gsVar;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            hb2 hb2Var = hb2.this;
            if (hb2Var.B && hb2Var.isShowing() && hb2.this.y()) {
                hb2.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class c extends fq {
        public c() {
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, @x1 ls lsVar) {
            super.g(view, lsVar);
            if (hb2.this.B) {
                lsVar.a(1048576);
                lsVar.d1(true);
                return;
            }
            lsVar.d1(false);
        }

        @Override // com.p7700g.p99005.fq
        public boolean j(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                hb2 hb2Var = hb2.this;
                if (hb2Var.B) {
                    hb2Var.cancel();
                    return true;
                }
            }
            return super.j(view, i, bundle);
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public class e extends BottomSheetBehavior.f {
        public e() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@x1 View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@x1 View view, int i) {
            if (i == 5) {
                hb2.this.cancel();
            }
        }
    }

    /* compiled from: BottomSheetDialog.java */
    /* loaded from: classes2.dex */
    public static class f extends BottomSheetBehavior.f {
        private final boolean a;
        private final boolean b;
        private final gs c;

        public /* synthetic */ f(View view, gs gsVar, a aVar) {
            this(view, gsVar);
        }

        private void d(View view) {
            if (view.getTop() < this.c.r()) {
                hb2.x(view, this.a);
                view.setPadding(view.getPaddingLeft(), this.c.r() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                hb2.x(view, this.b);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void a(@x1 View view) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(@x1 View view, float f) {
            d(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(@x1 View view, int i) {
            d(view);
        }

        private f(@x1 View view, @x1 gs gsVar) {
            ColorStateList M;
            this.c = gsVar;
            boolean z = Build.VERSION.SDK_INT >= 23 && (view.getSystemUiVisibility() & 8192) != 0;
            this.b = z;
            lh2 n0 = BottomSheetBehavior.i0(view).n0();
            if (n0 != null) {
                M = n0.y();
            } else {
                M = sr.M(view);
            }
            if (M != null) {
                this.a = kc2.k(M.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.a = kc2.k(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.a = z;
            }
        }
    }

    public hb2(@x1 Context context) {
        this(context, 0);
        this.F = getContext().getTheme().obtainStyledAttributes(new int[]{ga2.c.t5}).getBoolean(0, false);
    }

    private static int j(@x1 Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            if (context.getTheme().resolveAttribute(ga2.c.Q0, typedValue, true)) {
                return typedValue.resourceId;
            }
            return ga2.n.fb;
        }
        return i;
    }

    private FrameLayout r() {
        if (this.x == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), ga2.k.E, null);
            this.x = frameLayout;
            this.y = (CoordinatorLayout) frameLayout.findViewById(ga2.h.X0);
            FrameLayout frameLayout2 = (FrameLayout) this.x.findViewById(ga2.h.j1);
            this.z = frameLayout2;
            BottomSheetBehavior<FrameLayout> i0 = BottomSheetBehavior.i0(frameLayout2);
            this.w = i0;
            i0.Y(this.G);
            this.w.O0(this.B);
        }
        return this.x;
    }

    public static void x(@x1 View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = view.getSystemUiVisibility();
            view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
    }

    private View z(int i, @z1 View view, @z1 ViewGroup.LayoutParams layoutParams) {
        r();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.x.findViewById(ga2.h.X0);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.F) {
            sr.Z1(this.z, new a());
        }
        this.z.removeAllViews();
        if (layoutParams == null) {
            this.z.addView(view);
        } else {
            this.z.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(ga2.h.X5).setOnClickListener(new b());
        sr.A1(this.z, new c());
        this.z.setOnTouchListener(new d());
        return this.x;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> s = s();
        if (this.A && s.u0() != 5) {
            s.W0(5);
        } else {
            super.cancel();
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = this.F && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.x;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.y;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            if (z) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // com.p7700g.p99005.h3, com.p7700g.p99005.v, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            if (i < 23) {
                window.addFlags(67108864);
            }
            window.setLayout(-1, -1);
        }
    }

    @Override // com.p7700g.p99005.v, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.w;
        if (bottomSheetBehavior == null || bottomSheetBehavior.u0() != 5) {
            return;
        }
        this.w.W0(4);
    }

    @x1
    public BottomSheetBehavior<FrameLayout> s() {
        if (this.w == null) {
            r();
        }
        return this.w;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.B != z) {
            this.B = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.w;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.O0(z);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.B) {
            this.B = true;
        }
        this.C = z;
        this.D = true;
    }

    @Override // com.p7700g.p99005.h3, com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(@s1 int i) {
        super.setContentView(z(i, null, null));
    }

    public boolean t() {
        return this.A;
    }

    public boolean u() {
        return this.F;
    }

    public void v() {
        this.w.D0(this.G);
    }

    public void w(boolean z) {
        this.A = z;
    }

    public boolean y() {
        if (!this.D) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.C = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.D = true;
        }
        return this.C;
    }

    @Override // com.p7700g.p99005.h3, com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(z(0, view, null));
    }

    @Override // com.p7700g.p99005.h3, com.p7700g.p99005.v, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(z(0, view, layoutParams));
    }

    public hb2(@x1 Context context, @m2 int i) {
        super(context, j(context, i));
        this.B = true;
        this.C = true;
        this.G = new e();
        l(1);
        this.F = getContext().getTheme().obtainStyledAttributes(new int[]{ga2.c.t5}).getBoolean(0, false);
    }

    public hb2(@x1 Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.B = true;
        this.C = true;
        this.G = new e();
        l(1);
        this.B = z;
        this.F = getContext().getTheme().obtainStyledAttributes(new int[]{ga2.c.t5}).getBoolean(0, false);
    }
}
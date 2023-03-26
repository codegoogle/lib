package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import com.p7700g.p99005.hs;

/* compiled from: WindowInsetsControllerCompat.java */
/* loaded from: classes.dex */
public final class hs {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    private final e d;

    /* compiled from: WindowInsetsControllerCompat.java */
    @e2(20)
    /* loaded from: classes.dex */
    public static class a extends e {
        @x1
        public final Window a;
        @x1
        private final View b;

        public a(@x1 Window window, @x1 View view) {
            this.a = window;
            this.b = view;
        }

        private void l(int i) {
            if (i == 1) {
                n(4);
            } else if (i == 2) {
                n(2);
            } else if (i != 8) {
            } else {
                ((InputMethodManager) this.a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getDecorView().getWindowToken(), 0);
            }
        }

        public static /* synthetic */ void m(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void p(int i) {
            if (i == 1) {
                q(4);
                r(1024);
            } else if (i == 2) {
                q(2);
            } else if (i != 8) {
            } else {
                final View view = this.b;
                if (!view.isInEditMode() && !view.onCheckIsTextEditor()) {
                    view = this.a.getCurrentFocus();
                } else {
                    view.requestFocus();
                }
                if (view == null) {
                    view = this.a.findViewById(16908290);
                }
                if (view == null || !view.hasWindowFocus()) {
                    return;
                }
                view.post(new Runnable() { // from class: com.p7700g.p99005.aq
                    @Override // java.lang.Runnable
                    public final void run() {
                        hs.a.m(view);
                    }
                });
            }
        }

        @Override // com.p7700g.p99005.hs.e
        public void a(f fVar) {
        }

        @Override // com.p7700g.p99005.hs.e
        public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, es esVar) {
        }

        @Override // com.p7700g.p99005.hs.e
        public int c() {
            return 0;
        }

        @Override // com.p7700g.p99005.hs.e
        public void d(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    l(i2);
                }
            }
        }

        @Override // com.p7700g.p99005.hs.e
        public void g(@x1 f fVar) {
        }

        @Override // com.p7700g.p99005.hs.e
        public void j(int i) {
            if (i == 0) {
                q(6144);
            } else if (i == 1) {
                q(4096);
                n(2048);
            } else if (i != 2) {
            } else {
                q(2048);
                n(4096);
            }
        }

        @Override // com.p7700g.p99005.hs.e
        public void k(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    p(i2);
                }
            }
        }

        public void n(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void o(int i) {
            this.a.addFlags(i);
        }

        public void q(int i) {
            View decorView = this.a.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public void r(int i) {
            this.a.clearFlags(i);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b extends a {
        public b(@x1 Window window, @z1 View view) {
            super(window, view);
        }

        @Override // com.p7700g.p99005.hs.e
        public boolean f() {
            return (this.a.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // com.p7700g.p99005.hs.e
        public void i(boolean z) {
            if (z) {
                r(67108864);
                o(Integer.MIN_VALUE);
                n(8192);
                return;
            }
            q(8192);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @e2(26)
    /* loaded from: classes.dex */
    public static class c extends b {
        public c(@x1 Window window, @z1 View view) {
            super(window, view);
        }

        @Override // com.p7700g.p99005.hs.e
        public boolean e() {
            return (this.a.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // com.p7700g.p99005.hs.e
        public void h(boolean z) {
            if (z) {
                r(134217728);
                o(Integer.MIN_VALUE);
                n(16);
                return;
            }
            q(16);
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public static class e {
        public void a(f fVar) {
        }

        public void b(int i, long j, Interpolator interpolator, CancellationSignal cancellationSignal, es esVar) {
        }

        public int c() {
            return 0;
        }

        public void d(int i) {
        }

        public boolean e() {
            return false;
        }

        public boolean f() {
            return false;
        }

        public void g(@x1 f fVar) {
        }

        public void h(boolean z) {
        }

        public void i(boolean z) {
        }

        public void j(int i) {
        }

        public void k(int i) {
        }
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    /* loaded from: classes.dex */
    public interface f {
        void a(@x1 hs hsVar, int i);
    }

    @e2(30)
    @Deprecated
    private hs(@x1 WindowInsetsController windowInsetsController) {
        this.d = new d(windowInsetsController, this);
    }

    @e2(30)
    @x1
    @Deprecated
    public static hs l(@x1 WindowInsetsController windowInsetsController) {
        return new hs(windowInsetsController);
    }

    public void a(@x1 f fVar) {
        this.d.a(fVar);
    }

    public void b(int i, long j, @z1 Interpolator interpolator, @z1 CancellationSignal cancellationSignal, @x1 es esVar) {
        this.d.b(i, j, interpolator, cancellationSignal, esVar);
    }

    @SuppressLint({"WrongConstant"})
    public int c() {
        return this.d.c();
    }

    public void d(int i) {
        this.d.d(i);
    }

    public boolean e() {
        return this.d.e();
    }

    public boolean f() {
        return this.d.f();
    }

    public void g(@x1 f fVar) {
        this.d.g(fVar);
    }

    public void h(boolean z) {
        this.d.h(z);
    }

    public void i(boolean z) {
        this.d.i(z);
    }

    public void j(int i) {
        this.d.j(i);
    }

    public void k(int i) {
        this.d.k(i);
    }

    /* compiled from: WindowInsetsControllerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class d extends e {
        public final hs a;
        public final WindowInsetsController b;
        private final y7<f, WindowInsetsController.OnControllableInsetsChangedListener> c;
        public Window d;

        /* compiled from: WindowInsetsControllerCompat.java */
        /* loaded from: classes.dex */
        public class a implements WindowInsetsAnimationControlListener {
            private fs a = null;
            public final /* synthetic */ es b;

            public a(es esVar) {
                d.this = r1;
                this.b = esVar;
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onCancelled(@z1 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.b.a(windowInsetsAnimationController == null ? null : this.a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onFinished(@x1 WindowInsetsAnimationController windowInsetsAnimationController) {
                this.b.c(this.a);
            }

            @Override // android.view.WindowInsetsAnimationControlListener
            public void onReady(@x1 WindowInsetsAnimationController windowInsetsAnimationController, int i) {
                fs fsVar = new fs(windowInsetsAnimationController);
                this.a = fsVar;
                this.b.b(fsVar, i);
            }
        }

        public d(@x1 Window window, @x1 hs hsVar) {
            this(window.getInsetsController(), hsVar);
            this.d = window;
        }

        private /* synthetic */ void l(f fVar, WindowInsetsController windowInsetsController, int i) {
            if (this.b == windowInsetsController) {
                fVar.a(this.a, i);
            }
        }

        @Override // com.p7700g.p99005.hs.e
        public void a(@x1 final f fVar) {
            if (this.c.containsKey(fVar)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: com.p7700g.p99005.bq
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
                    hs.d.this.m(fVar, windowInsetsController, i);
                }
            };
            this.c.put(fVar, onControllableInsetsChangedListener);
            this.b.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        @Override // com.p7700g.p99005.hs.e
        public void b(int i, long j, @z1 Interpolator interpolator, @z1 CancellationSignal cancellationSignal, @x1 es esVar) {
            this.b.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new a(esVar));
        }

        @Override // com.p7700g.p99005.hs.e
        @SuppressLint({"WrongConstant"})
        public int c() {
            return this.b.getSystemBarsBehavior();
        }

        @Override // com.p7700g.p99005.hs.e
        public void d(int i) {
            this.b.hide(i);
        }

        @Override // com.p7700g.p99005.hs.e
        public boolean e() {
            return (this.b.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // com.p7700g.p99005.hs.e
        public boolean f() {
            return (this.b.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // com.p7700g.p99005.hs.e
        public void g(@x1 f fVar) {
            WindowInsetsController.OnControllableInsetsChangedListener remove = this.c.remove(fVar);
            if (remove != null) {
                this.b.removeOnControllableInsetsChangedListener(remove);
            }
        }

        @Override // com.p7700g.p99005.hs.e
        public void h(boolean z) {
            if (z) {
                if (this.d != null) {
                    n(16);
                }
                this.b.setSystemBarsAppearance(16, 16);
                return;
            }
            if (this.d != null) {
                o(16);
            }
            this.b.setSystemBarsAppearance(0, 16);
        }

        @Override // com.p7700g.p99005.hs.e
        public void i(boolean z) {
            if (z) {
                if (this.d != null) {
                    n(8192);
                }
                this.b.setSystemBarsAppearance(8, 8);
                return;
            }
            if (this.d != null) {
                o(8192);
            }
            this.b.setSystemBarsAppearance(0, 8);
        }

        @Override // com.p7700g.p99005.hs.e
        public void j(int i) {
            this.b.setSystemBarsBehavior(i);
        }

        @Override // com.p7700g.p99005.hs.e
        public void k(int i) {
            Window window = this.d;
            if (window != null && (i & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.b.show(i);
        }

        public /* synthetic */ void m(f fVar, WindowInsetsController windowInsetsController, int i) {
            if (this.b == windowInsetsController) {
                fVar.a(this.a, i);
            }
        }

        public void n(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        public void o(int i) {
            View decorView = this.d.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        public d(@x1 WindowInsetsController windowInsetsController, @x1 hs hsVar) {
            this.c = new y7<>();
            this.b = windowInsetsController;
            this.a = hsVar;
        }
    }

    public hs(@x1 Window window, @x1 View view) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.d = new d(window, this);
        } else if (i >= 26) {
            this.d = new c(window, view);
        } else if (i >= 23) {
            this.d = new b(window, view);
        } else {
            this.d = new a(window, view);
        }
    }
}
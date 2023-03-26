package com.p7700g.p99005;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.p7700g.p99005.b3;
import com.p7700g.p99005.mu;

/* compiled from: ActionBarDrawerToggle.java */
/* loaded from: classes.dex */
public class a3 implements mu.e {
    private final b a;
    private final mu b;
    private v3 c;
    private boolean d;
    private Drawable e;
    public boolean f;
    private boolean g;
    private final int h;
    private final int i;
    public View.OnClickListener j;
    private boolean k;

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a3 a3Var = a3.this;
            if (a3Var.f) {
                a3Var.v();
                return;
            }
            View.OnClickListener onClickListener = a3Var.j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(Drawable drawable, @l2 int i);

        Drawable b();

        void c(@l2 int i);

        boolean d();

        Context e();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public interface c {
        @z1
        b b();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public static class d implements b {
        private final Activity a;
        private b3.a b;

        /* compiled from: ActionBarDrawerToggle.java */
        @e2(18)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @e1
            public static void a(ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            @e1
            public static void b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public d(Activity activity) {
            this.a = activity;
        }

        @Override // com.p7700g.p99005.a3.b
        public void a(Drawable drawable, int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                a.b(actionBar, drawable);
                a.a(actionBar, i);
            }
        }

        @Override // com.p7700g.p99005.a3.b
        public Drawable b() {
            TypedArray obtainStyledAttributes = e().obtainStyledAttributes(null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        @Override // com.p7700g.p99005.a3.b
        public void c(int i) {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                a.a(actionBar, i);
            }
        }

        @Override // com.p7700g.p99005.a3.b
        public boolean d() {
            ActionBar actionBar = this.a.getActionBar();
            return (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) ? false : true;
        }

        @Override // com.p7700g.p99005.a3.b
        public Context e() {
            ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.a;
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public static class e implements b {
        public final Toolbar a;
        public final Drawable b;
        public final CharSequence c;

        public e(Toolbar toolbar) {
            this.a = toolbar;
            this.b = toolbar.getNavigationIcon();
            this.c = toolbar.getNavigationContentDescription();
        }

        @Override // com.p7700g.p99005.a3.b
        public void a(Drawable drawable, @l2 int i) {
            this.a.setNavigationIcon(drawable);
            c(i);
        }

        @Override // com.p7700g.p99005.a3.b
        public Drawable b() {
            return this.b;
        }

        @Override // com.p7700g.p99005.a3.b
        public void c(@l2 int i) {
            if (i == 0) {
                this.a.setNavigationContentDescription(this.c);
            } else {
                this.a.setNavigationContentDescription(i);
            }
        }

        @Override // com.p7700g.p99005.a3.b
        public boolean d() {
            return true;
        }

        @Override // com.p7700g.p99005.a3.b
        public Context e() {
            return this.a.getContext();
        }
    }

    public a3(Activity activity, mu muVar, @l2 int i, @l2 int i2) {
        this(activity, null, muVar, null, i, i2);
    }

    private void s(float f) {
        if (f == 1.0f) {
            this.c.u(true);
        } else if (f == 0.0f) {
            this.c.u(false);
        }
        this.c.s(f);
    }

    @Override // com.p7700g.p99005.mu.e
    public void a(View view) {
        s(1.0f);
        if (this.f) {
            l(this.i);
        }
    }

    @Override // com.p7700g.p99005.mu.e
    public void b(View view) {
        s(0.0f);
        if (this.f) {
            l(this.h);
        }
    }

    @Override // com.p7700g.p99005.mu.e
    public void c(int i) {
    }

    @Override // com.p7700g.p99005.mu.e
    public void d(View view, float f) {
        if (this.d) {
            s(Math.min(1.0f, Math.max(0.0f, f)));
        } else {
            s(0.0f);
        }
    }

    @x1
    public v3 e() {
        return this.c;
    }

    public Drawable f() {
        return this.a.b();
    }

    public View.OnClickListener g() {
        return this.j;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.d;
    }

    public void j(Configuration configuration) {
        if (!this.g) {
            this.e = f();
        }
        u();
    }

    public boolean k(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f) {
            v();
            return true;
        }
        return false;
    }

    public void l(int i) {
        this.a.c(i);
    }

    public void m(Drawable drawable, int i) {
        if (!this.k && !this.a.d()) {
            this.k = true;
        }
        this.a.a(drawable, i);
    }

    public void n(@x1 v3 v3Var) {
        this.c = v3Var;
        u();
    }

    public void o(boolean z) {
        if (z != this.f) {
            if (z) {
                m(this.c, this.b.C(nq.b) ? this.i : this.h);
            } else {
                m(this.e, 0);
            }
            this.f = z;
        }
    }

    public void p(boolean z) {
        this.d = z;
        if (z) {
            return;
        }
        s(0.0f);
    }

    public void q(int i) {
        r(i != 0 ? this.b.getResources().getDrawable(i) : null);
    }

    public void r(Drawable drawable) {
        if (drawable == null) {
            this.e = f();
            this.g = false;
        } else {
            this.e = drawable;
            this.g = true;
        }
        if (this.f) {
            return;
        }
        m(this.e, 0);
    }

    public void t(View.OnClickListener onClickListener) {
        this.j = onClickListener;
    }

    public void u() {
        if (this.b.C(nq.b)) {
            s(1.0f);
        } else {
            s(0.0f);
        }
        if (this.f) {
            m(this.c, this.b.C(nq.b) ? this.i : this.h);
        }
    }

    public void v() {
        int q = this.b.q(nq.b);
        if (this.b.F(nq.b) && q != 2) {
            this.b.d(nq.b);
        } else if (q != 1) {
            this.b.K(nq.b);
        }
    }

    public a3(Activity activity, mu muVar, Toolbar toolbar, @l2 int i, @l2 int i2) {
        this(activity, toolbar, muVar, null, i, i2);
    }

    public a3(Activity activity, Toolbar toolbar, mu muVar, v3 v3Var, @l2 int i, @l2 int i2) {
        this.d = true;
        this.f = true;
        this.k = false;
        if (toolbar != null) {
            this.a = new e(toolbar);
            toolbar.setNavigationOnClickListener(new a());
        } else if (activity instanceof c) {
            this.a = ((c) activity).b();
        } else {
            this.a = new d(activity);
        }
        this.b = muVar;
        this.h = i;
        this.i = i2;
        if (v3Var == null) {
            this.c = new v3(this.a.e());
        } else {
            this.c = v3Var;
        }
        this.e = f();
    }
}
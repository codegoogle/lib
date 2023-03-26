package com.p7700g.p99005;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p7700g.p99005.mu;
import java.lang.reflect.Method;

/* compiled from: ActionBarDrawerToggle.java */
@Deprecated
/* loaded from: classes.dex */
public class ty implements mu.e {
    private static final String a = "ActionBarDrawerToggle";
    private static final int[] b = {16843531};
    private static final float c = 0.33333334f;
    private static final int d = 16908332;
    public final Activity e;
    private final a f;
    private final mu g;
    private boolean h;
    private boolean i;
    private Drawable j;
    private Drawable k;
    private d l;
    private final int m;
    private final int n;
    private final int o;
    private c p;

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface a {
        void a(Drawable drawable, @l2 int i);

        @z1
        Drawable b();

        void c(@l2 int i);
    }

    /* compiled from: ActionBarDrawerToggle.java */
    @Deprecated
    /* loaded from: classes.dex */
    public interface b {
        @z1
        a b();
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public static class c {
        public Method a;
        public Method b;
        public ImageView c;

        public c(Activity activity) {
            try {
                this.a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", Drawable.class);
                this.b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", Integer.TYPE);
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(ty.d);
                if (findViewById == null) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                if (viewGroup.getChildCount() != 2) {
                    return;
                }
                View childAt = viewGroup.getChildAt(0);
                childAt = childAt.getId() == ty.d ? viewGroup.getChildAt(1) : childAt;
                if (childAt instanceof ImageView) {
                    this.c = (ImageView) childAt;
                }
            }
        }
    }

    /* compiled from: ActionBarDrawerToggle.java */
    /* loaded from: classes.dex */
    public class d extends InsetDrawable implements Drawable.Callback {
        private final boolean s;
        private final Rect t;
        private float u;
        private float v;

        public d(Drawable drawable) {
            super(drawable, 0);
            this.s = true;
            this.t = new Rect();
        }

        public float a() {
            return this.u;
        }

        public void b(float f) {
            this.v = f;
            invalidateSelf();
        }

        public void c(float f) {
            this.u = f;
            invalidateSelf();
        }

        @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public void draw(@x1 Canvas canvas) {
            copyBounds(this.t);
            canvas.save();
            boolean z = sr.Y(ty.this.e.getWindow().getDecorView()) == 1;
            int i = z ? -1 : 1;
            float width = this.t.width();
            canvas.translate((-this.v) * width * this.u * i, 0.0f);
            if (z && !this.s) {
                canvas.translate(width, 0.0f);
                canvas.scale(-1.0f, 1.0f);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public ty(Activity activity, mu muVar, @f1 int i, @l2 int i2, @l2 int i3) {
        this(activity, muVar, !e(activity), i, i2, i3);
    }

    private static boolean e(Context context) {
        return context.getApplicationInfo().targetSdkVersion >= 21;
    }

    private Drawable f() {
        Context context;
        a aVar = this.f;
        if (aVar != null) {
            return aVar.b();
        }
        ActionBar actionBar = this.e.getActionBar();
        if (actionBar != null) {
            context = actionBar.getThemedContext();
        } else {
            context = this.e;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, b, 16843470, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    private void j(int i) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.c(i);
            return;
        }
        ActionBar actionBar = this.e.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeActionContentDescription(i);
        }
    }

    private void k(Drawable drawable, int i) {
        a aVar = this.f;
        if (aVar != null) {
            aVar.a(drawable, i);
            return;
        }
        ActionBar actionBar = this.e.getActionBar();
        if (actionBar != null) {
            actionBar.setHomeAsUpIndicator(drawable);
            actionBar.setHomeActionContentDescription(i);
        }
    }

    @Override // com.p7700g.p99005.mu.e
    public void a(View view) {
        this.l.c(1.0f);
        if (this.h) {
            j(this.o);
        }
    }

    @Override // com.p7700g.p99005.mu.e
    public void b(View view) {
        this.l.c(0.0f);
        if (this.h) {
            j(this.n);
        }
    }

    @Override // com.p7700g.p99005.mu.e
    public void c(int i) {
    }

    @Override // com.p7700g.p99005.mu.e
    public void d(View view, float f) {
        float min;
        float a2 = this.l.a();
        if (f > 0.5f) {
            min = Math.max(a2, Math.max(0.0f, f - 0.5f) * 2.0f);
        } else {
            min = Math.min(a2, f * 2.0f);
        }
        this.l.c(min);
    }

    public boolean g() {
        return this.h;
    }

    public void h(Configuration configuration) {
        if (!this.i) {
            this.j = f();
        }
        this.k = gh.i(this.e, this.m);
        o();
    }

    public boolean i(MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == d && this.h) {
            if (this.g.F(nq.b)) {
                this.g.d(nq.b);
                return true;
            }
            this.g.K(nq.b);
            return true;
        }
        return false;
    }

    public void l(boolean z) {
        if (z != this.h) {
            if (z) {
                k(this.l, this.g.C(nq.b) ? this.o : this.n);
            } else {
                k(this.j, 0);
            }
            this.h = z;
        }
    }

    public void m(int i) {
        n(i != 0 ? gh.i(this.e, i) : null);
    }

    public void n(Drawable drawable) {
        if (drawable == null) {
            this.j = f();
            this.i = false;
        } else {
            this.j = drawable;
            this.i = true;
        }
        if (this.h) {
            return;
        }
        k(this.j, 0);
    }

    public void o() {
        if (this.g.C(nq.b)) {
            this.l.c(1.0f);
        } else {
            this.l.c(0.0f);
        }
        if (this.h) {
            k(this.l, this.g.C(nq.b) ? this.o : this.n);
        }
    }

    public ty(Activity activity, mu muVar, boolean z, @f1 int i, @l2 int i2, @l2 int i3) {
        this.h = true;
        this.e = activity;
        if (activity instanceof b) {
            this.f = ((b) activity).b();
        } else {
            this.f = null;
        }
        this.g = muVar;
        this.m = i;
        this.n = i2;
        this.o = i3;
        this.j = f();
        this.k = gh.i(activity, i);
        d dVar = new d(this.k);
        this.l = dVar;
        dVar.b(z ? c : 0.0f);
    }
}
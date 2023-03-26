package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import com.p7700g.p99005.ga2;
import com.p7700g.p99005.za2;

/* compiled from: BadgeUtils.java */
@bb2
/* loaded from: classes2.dex */
public class ab2 {
    public static final boolean a = false;
    private static final String b = "BadgeUtils";

    /* compiled from: BadgeUtils.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ Toolbar s;
        public final /* synthetic */ int t;
        public final /* synthetic */ ya2 u;
        public final /* synthetic */ FrameLayout v;

        public a(Toolbar toolbar, int i, ya2 ya2Var, FrameLayout frameLayout) {
            this.s = toolbar;
            this.t = i;
            this.u = ya2Var;
            this.v = frameLayout;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuItemView a = df2.a(this.s, this.t);
            if (a != null) {
                ab2.n(this.u, this.s.getResources());
                ab2.d(this.u, a, this.v);
                ab2.b(this.u, a);
            }
        }
    }

    /* compiled from: BadgeUtils.java */
    /* loaded from: classes2.dex */
    public class b extends fq {
        public final /* synthetic */ ya2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View.AccessibilityDelegate accessibilityDelegate, ya2 ya2Var) {
            super(accessibilityDelegate);
            this.d = ya2Var;
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(this.d.o());
        }
    }

    /* compiled from: BadgeUtils.java */
    /* loaded from: classes2.dex */
    public class c extends fq {
        public final /* synthetic */ ya2 d;

        public c(ya2 ya2Var) {
            this.d = ya2Var;
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(this.d.o());
        }
    }

    /* compiled from: BadgeUtils.java */
    /* loaded from: classes2.dex */
    public class d extends fq {
        public d(View.AccessibilityDelegate accessibilityDelegate) {
            super(accessibilityDelegate);
        }

        @Override // com.p7700g.p99005.fq
        public void g(View view, ls lsVar) {
            super.g(view, lsVar);
            lsVar.a1(null);
        }
    }

    private ab2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(@x1 ya2 ya2Var, @x1 View view) {
        if (Build.VERSION.SDK_INT >= 29 && sr.F0(view)) {
            sr.A1(view, new b(view.getAccessibilityDelegate(), ya2Var));
        } else {
            sr.A1(view, new c(ya2Var));
        }
    }

    public static void c(@x1 ya2 ya2Var, @x1 View view) {
        d(ya2Var, view, null);
    }

    public static void d(@x1 ya2 ya2Var, @x1 View view, @z1 FrameLayout frameLayout) {
        m(ya2Var, view, frameLayout);
        if (ya2Var.p() != null) {
            ya2Var.p().setForeground(ya2Var);
        } else if (!a) {
            view.getOverlay().add(ya2Var);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    public static void e(@x1 ya2 ya2Var, @x1 Toolbar toolbar, @m1 int i) {
        f(ya2Var, toolbar, i, null);
    }

    public static void f(@x1 ya2 ya2Var, @x1 Toolbar toolbar, @m1 int i, @z1 FrameLayout frameLayout) {
        toolbar.post(new a(toolbar, i, ya2Var, frameLayout));
    }

    @x1
    public static SparseArray<ya2> g(Context context, @x1 te2 te2Var) {
        SparseArray<ya2> sparseArray = new SparseArray<>(te2Var.size());
        for (int i = 0; i < te2Var.size(); i++) {
            int keyAt = te2Var.keyAt(i);
            za2.a aVar = (za2.a) te2Var.valueAt(i);
            if (aVar != null) {
                sparseArray.put(keyAt, ya2.f(context, aVar));
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    @x1
    public static te2 h(@x1 SparseArray<ya2> sparseArray) {
        te2 te2Var = new te2();
        for (int i = 0; i < sparseArray.size(); i++) {
            int keyAt = sparseArray.keyAt(i);
            ya2 valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                te2Var.put(keyAt, valueAt.v());
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return te2Var;
    }

    private static void i(@x1 View view) {
        if (Build.VERSION.SDK_INT >= 29 && sr.F0(view)) {
            sr.A1(view, new d(view.getAccessibilityDelegate()));
        } else {
            sr.A1(view, null);
        }
    }

    public static void j(@z1 ya2 ya2Var, @x1 View view) {
        if (ya2Var == null) {
            return;
        }
        if (!a && ya2Var.p() == null) {
            view.getOverlay().remove(ya2Var);
        } else {
            ya2Var.p().setForeground(null);
        }
    }

    public static void k(@z1 ya2 ya2Var, @x1 Toolbar toolbar, @m1 int i) {
        ActionMenuItemView a2;
        if (ya2Var == null || (a2 = df2.a(toolbar, i)) == null) {
            return;
        }
        l(ya2Var);
        j(ya2Var, a2);
        i(a2);
    }

    @r2
    public static void l(ya2 ya2Var) {
        ya2Var.K(0);
        ya2Var.L(0);
    }

    public static void m(@x1 ya2 ya2Var, @x1 View view, @z1 FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        ya2Var.setBounds(rect);
        ya2Var.i0(view, frameLayout);
    }

    @r2
    public static void n(ya2 ya2Var, Resources resources) {
        ya2Var.K(resources.getDimensionPixelOffset(ga2.f.b6));
        ya2Var.L(resources.getDimensionPixelOffset(ga2.f.c6));
    }

    public static void o(@x1 Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
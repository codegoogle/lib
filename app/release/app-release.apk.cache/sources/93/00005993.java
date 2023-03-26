package com.p7700g.p99005;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.m70;
import com.p7700g.p99005.m80;
import com.p7700g.p99005.s80;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Visibility.java */
/* loaded from: classes.dex */
public abstract class r90 extends s80 {
    private static final String K0 = "android:visibility:screenLocation";
    public static final int L0 = 1;
    public static final int M0 = 2;
    private int O0;
    public static final String I0 = "android:visibility:visibility";
    private static final String J0 = "android:visibility:parent";
    private static final String[] N0 = {I0, J0};

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public class a extends u80 {
        public final /* synthetic */ ViewGroup s;
        public final /* synthetic */ View t;
        public final /* synthetic */ View u;

        public a(ViewGroup viewGroup, View view, View view2) {
            this.s = viewGroup;
            this.t = view;
            this.u = view2;
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
            f90.b(this.s).d(this.t);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            this.u.setTag(m80.e.z, null);
            f90.b(this.s).d(this.t);
            s80Var.v0(this);
        }

        @Override // com.p7700g.p99005.u80, com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
            if (this.t.getParent() == null) {
                f90.b(this.s).c(this.t);
            } else {
                r90.this.cancel();
            }
        }
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter implements s80.h, m70.a {
        private final View s;
        private final int t;
        private final ViewGroup u;
        private final boolean v;
        private boolean w;
        public boolean x = false;

        public b(View view, int i, boolean z) {
            this.s = view;
            this.t = i;
            this.u = (ViewGroup) view.getParent();
            this.v = z;
            g(true);
        }

        private void f() {
            if (!this.x) {
                k90.i(this.s, this.t);
                ViewGroup viewGroup = this.u;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.v || this.w == z || (viewGroup = this.u) == null) {
                return;
            }
            this.w = z;
            f90.d(viewGroup, z);
        }

        @Override // com.p7700g.p99005.s80.h
        public void a(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void b(@x1 s80 s80Var) {
            g(false);
        }

        @Override // com.p7700g.p99005.s80.h
        public void c(@x1 s80 s80Var) {
            f();
            s80Var.v0(this);
        }

        @Override // com.p7700g.p99005.s80.h
        public void d(@x1 s80 s80Var) {
        }

        @Override // com.p7700g.p99005.s80.h
        public void e(@x1 s80 s80Var) {
            g(true);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.x = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, com.p7700g.p99005.m70.a
        public void onAnimationPause(Animator animator) {
            if (this.x) {
                return;
            }
            k90.i(this.s, this.t);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, com.p7700g.p99005.m70.a
        public void onAnimationResume(Animator animator) {
            if (this.x) {
                return;
            }
            k90.i(this.s, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: Visibility.java */
    @SuppressLint({"UniqueConstants"})
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    /* compiled from: Visibility.java */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public ViewGroup e;
        public ViewGroup f;
    }

    public r90() {
        this.O0 = 3;
    }

    private void Q0(z80 z80Var) {
        z80Var.a.put(I0, Integer.valueOf(z80Var.b.getVisibility()));
        z80Var.a.put(J0, z80Var.b.getParent());
        int[] iArr = new int[2];
        z80Var.b.getLocationOnScreen(iArr);
        z80Var.a.put(K0, iArr);
    }

    private d S0(z80 z80Var, z80 z80Var2) {
        d dVar = new d();
        dVar.a = false;
        dVar.b = false;
        if (z80Var != null && z80Var.a.containsKey(I0)) {
            dVar.c = ((Integer) z80Var.a.get(I0)).intValue();
            dVar.e = (ViewGroup) z80Var.a.get(J0);
        } else {
            dVar.c = -1;
            dVar.e = null;
        }
        if (z80Var2 != null && z80Var2.a.containsKey(I0)) {
            dVar.d = ((Integer) z80Var2.a.get(I0)).intValue();
            dVar.f = (ViewGroup) z80Var2.a.get(J0);
        } else {
            dVar.d = -1;
            dVar.f = null;
        }
        if (z80Var != null && z80Var2 != null) {
            int i = dVar.c;
            int i2 = dVar.d;
            if (i == i2 && dVar.e == dVar.f) {
                return dVar;
            }
            if (i != i2) {
                if (i == 0) {
                    dVar.b = false;
                    dVar.a = true;
                } else if (i2 == 0) {
                    dVar.b = true;
                    dVar.a = true;
                }
            } else if (dVar.f == null) {
                dVar.b = false;
                dVar.a = true;
            } else if (dVar.e == null) {
                dVar.b = true;
                dVar.a = true;
            }
        } else if (z80Var == null && dVar.d == 0) {
            dVar.b = true;
            dVar.a = true;
        } else if (z80Var2 == null && dVar.c == 0) {
            dVar.b = false;
            dVar.a = true;
        }
        return dVar;
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public Animator A(@x1 ViewGroup viewGroup, @z1 z80 z80Var, @z1 z80 z80Var2) {
        d S0 = S0(z80Var, z80Var2);
        if (S0.a) {
            if (S0.e == null && S0.f == null) {
                return null;
            }
            if (S0.b) {
                return V0(viewGroup, z80Var, S0.c, z80Var2, S0.d);
            }
            return Y0(viewGroup, z80Var, S0.c, z80Var2, S0.d);
        }
        return null;
    }

    public int R0() {
        return this.O0;
    }

    public boolean T0(z80 z80Var) {
        if (z80Var == null) {
            return false;
        }
        return ((Integer) z80Var.a.get(I0)).intValue() == 0 && ((View) z80Var.a.get(J0)) != null;
    }

    public Animator U0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return null;
    }

    public Animator V0(ViewGroup viewGroup, z80 z80Var, int i, z80 z80Var2, int i2) {
        if ((this.O0 & 1) != 1 || z80Var2 == null) {
            return null;
        }
        if (z80Var == null) {
            View view = (View) z80Var2.b.getParent();
            if (S0(V(view, false), i0(view, false)).a) {
                return null;
            }
        }
        return U0(viewGroup, z80Var2.b, z80Var, z80Var2);
    }

    public Animator W0(ViewGroup viewGroup, View view, z80 z80Var, z80 z80Var2) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
        if (r17.x0 != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Animator Y0(ViewGroup viewGroup, z80 z80Var, int i, z80 z80Var2, int i2) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.O0 & 2) == 2 && z80Var != null) {
            View view3 = z80Var.b;
            View view4 = z80Var2 != null ? z80Var2.b : null;
            int i3 = m80.e.z;
            View view5 = (View) view3.getTag(i3);
            if (view5 != null) {
                view2 = null;
                z2 = true;
            } else if (view4 == null || view4.getParent() == null) {
                if (view4 != null) {
                    view = null;
                    z = false;
                    if (z) {
                        if (view3.getParent() != null) {
                            if (view3.getParent() instanceof View) {
                                View view6 = (View) view3.getParent();
                                if (!S0(i0(view6, true), V(view6, true)).a) {
                                    view4 = y80.a(viewGroup, view3, view6);
                                } else {
                                    int id = view6.getId();
                                    if (view6.getParent() == null) {
                                        if (id != -1) {
                                            if (viewGroup.findViewById(id) != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        view2 = view;
                        z2 = false;
                        view5 = view3;
                    }
                    z2 = false;
                    View view7 = view;
                    view5 = view4;
                    view2 = view7;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                z2 = false;
                View view72 = view;
                view5 = view4;
                view2 = view72;
            } else {
                if (i2 == 4 || view3 == view4) {
                    view = view4;
                    z = false;
                    view4 = null;
                    if (z) {
                    }
                    z2 = false;
                    View view722 = view;
                    view5 = view4;
                    view2 = view722;
                }
                view4 = null;
                view = null;
                z = true;
                if (z) {
                }
                z2 = false;
                View view7222 = view;
                view5 = view4;
                view2 = view7222;
            }
            if (view5 == null) {
                if (view2 != null) {
                    int visibility = view2.getVisibility();
                    k90.i(view2, 0);
                    Animator W0 = W0(viewGroup, view2, z80Var, z80Var2);
                    if (W0 != null) {
                        b bVar = new b(view2, i2, true);
                        W0.addListener(bVar);
                        m70.a(W0, bVar);
                        a(bVar);
                    } else {
                        k90.i(view2, visibility);
                    }
                    return W0;
                }
                return null;
            }
            if (!z2) {
                int[] iArr = (int[]) z80Var.a.get(K0);
                int i4 = iArr[0];
                int i5 = iArr[1];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr2);
                view5.offsetLeftAndRight((i4 - iArr2[0]) - view5.getLeft());
                view5.offsetTopAndBottom((i5 - iArr2[1]) - view5.getTop());
                f90.b(viewGroup).c(view5);
            }
            Animator W02 = W0(viewGroup, view5, z80Var, z80Var2);
            if (!z2) {
                if (W02 == null) {
                    f90.b(viewGroup).d(view5);
                } else {
                    view3.setTag(i3, view5);
                    a(new a(viewGroup, view5, view3));
                }
            }
            return W02;
        }
        return null;
    }

    public void Z0(int i) {
        if ((i & (-4)) == 0) {
            this.O0 = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @Override // com.p7700g.p99005.s80
    @z1
    public String[] h0() {
        return N0;
    }

    @Override // com.p7700g.p99005.s80
    public boolean j0(z80 z80Var, z80 z80Var2) {
        if (z80Var == null && z80Var2 == null) {
            return false;
        }
        if (z80Var == null || z80Var2 == null || z80Var2.a.containsKey(I0) == z80Var.a.containsKey(I0)) {
            d S0 = S0(z80Var, z80Var2);
            if (S0.a) {
                return S0.c == 0 || S0.d == 0;
            }
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.s80
    public void n(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @Override // com.p7700g.p99005.s80
    public void t(@x1 z80 z80Var) {
        Q0(z80Var);
    }

    @SuppressLint({"RestrictedApi"})
    public r90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O0 = 3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r80.e);
        int k = ri.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (k != 0) {
            Z0(k);
        }
    }
}
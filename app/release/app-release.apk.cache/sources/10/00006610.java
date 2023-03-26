package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewParentCompat.java */
/* loaded from: classes.dex */
public final class xr {
    private static final String a = "ViewParentCompat";
    private static int[] b;

    /* compiled from: ViewParentCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }
    }

    /* compiled from: ViewParentCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        @e1
        public static boolean b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        @e1
        public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        @e1
        public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        @e1
        public static void e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        @e1
        public static boolean f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        @e1
        public static void g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private xr() {
    }

    private static int[] a() {
        int[] iArr = b;
        if (iArr == null) {
            b = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return b;
    }

    public static void b(@x1 ViewParent viewParent, @x1 View view, @x1 View view2, int i) {
        a.a(viewParent, view, view2, i);
    }

    public static boolean c(@x1 ViewParent viewParent, @x1 View view, float f, float f2, boolean z) {
        try {
            return b.a(viewParent, view, f, f2, z);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + viewParent + " does not implement interface method onNestedFling";
            return false;
        }
    }

    public static boolean d(@x1 ViewParent viewParent, @x1 View view, float f, float f2) {
        try {
            return b.b(viewParent, view, f, f2);
        } catch (AbstractMethodError unused) {
            String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreFling";
            return false;
        }
    }

    public static void e(@x1 ViewParent viewParent, @x1 View view, int i, int i2, @x1 int[] iArr) {
        f(viewParent, view, i, i2, iArr, 0);
    }

    public static void f(@x1 ViewParent viewParent, @x1 View view, int i, int i2, @x1 int[] iArr, int i3) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).onNestedPreScroll(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            try {
                b.c(viewParent, view, i, i2, iArr);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll";
            }
        }
    }

    public static void g(@x1 ViewParent viewParent, @x1 View view, int i, int i2, int i3, int i4) {
        i(viewParent, view, i, i2, i3, i4, 0, a());
    }

    public static void h(@x1 ViewParent viewParent, @x1 View view, int i, int i2, int i3, int i4, int i5) {
        i(viewParent, view, i, i2, i3, i4, i5, a());
    }

    public static void i(@x1 ViewParent viewParent, @x1 View view, int i, int i2, int i3, int i4, int i5, @x1 int[] iArr) {
        if (viewParent instanceof gr) {
            ((gr) viewParent).onNestedScroll(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof fr) {
            ((fr) viewParent).onNestedScroll(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            try {
                b.d(viewParent, view, i, i2, i3, i4);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedScroll";
            }
        }
    }

    public static void j(@x1 ViewParent viewParent, @x1 View view, @x1 View view2, int i) {
        k(viewParent, view, view2, i, 0);
    }

    public static void k(@x1 ViewParent viewParent, @x1 View view, @x1 View view2, int i, int i2) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).onNestedScrollAccepted(view, view2, i, i2);
        } else if (i2 == 0) {
            try {
                b.e(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted";
            }
        }
    }

    public static boolean l(@x1 ViewParent viewParent, @x1 View view, @x1 View view2, int i) {
        return m(viewParent, view, view2, i, 0);
    }

    public static boolean m(@x1 ViewParent viewParent, @x1 View view, @x1 View view2, int i, int i2) {
        if (viewParent instanceof fr) {
            return ((fr) viewParent).onStartNestedScroll(view, view2, i, i2);
        }
        if (i2 == 0) {
            try {
                return b.f(viewParent, view, view2, i);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll";
                return false;
            }
        }
        return false;
    }

    public static void n(@x1 ViewParent viewParent, @x1 View view) {
        o(viewParent, view, 0);
    }

    public static void o(@x1 ViewParent viewParent, @x1 View view, int i) {
        if (viewParent instanceof fr) {
            ((fr) viewParent).onStopNestedScroll(view, i);
        } else if (i == 0) {
            try {
                b.g(viewParent, view);
            } catch (AbstractMethodError unused) {
                String str = "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll";
            }
        }
    }

    @Deprecated
    public static boolean p(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
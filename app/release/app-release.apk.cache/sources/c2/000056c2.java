package com.p7700g.p99005;

import android.graphics.Rect;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;

/* compiled from: AccessibilityWindowInfoCompat.java */
/* loaded from: classes.dex */
public class ps {
    private static final int a = -1;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private final Object g;

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @e1
        public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i) {
            return accessibilityWindowInfo.getChild(i);
        }

        @e1
        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @e1
        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @e1
        public static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @e1
        public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @e1
        public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @e1
        public static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @e1
        public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @e1
        public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @e1
        public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @e1
        public static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @e1
        public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }

        @e1
        public static void n(AccessibilityWindowInfo accessibilityWindowInfo) {
            accessibilityWindowInfo.recycle();
        }
    }

    /* compiled from: AccessibilityWindowInfoCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @e1
        public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    private ps(Object obj) {
        this.g = obj;
    }

    @z1
    public static ps n() {
        return r(a.l());
    }

    @z1
    public static ps o(@z1 ps psVar) {
        if (psVar == null) {
            return null;
        }
        return r(a.m((AccessibilityWindowInfo) psVar.g));
    }

    private static String q(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY" : "TYPE_SYSTEM" : "TYPE_INPUT_METHOD" : "TYPE_APPLICATION";
    }

    public static ps r(Object obj) {
        if (obj != null) {
            return new ps(obj);
        }
        return null;
    }

    @z1
    public ls a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return ls.Y1(b.a((AccessibilityWindowInfo) this.g));
        }
        return null;
    }

    public void b(@x1 Rect rect) {
        a.a((AccessibilityWindowInfo) this.g, rect);
    }

    @z1
    public ps c(int i) {
        return r(a.b((AccessibilityWindowInfo) this.g, i));
    }

    public int d() {
        return a.c((AccessibilityWindowInfo) this.g);
    }

    public int e() {
        return a.d((AccessibilityWindowInfo) this.g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof ps)) {
            ps psVar = (ps) obj;
            Object obj2 = this.g;
            if (obj2 == null) {
                return psVar.g == null;
            }
            return obj2.equals(psVar.g);
        }
        return false;
    }

    public int f() {
        return a.e((AccessibilityWindowInfo) this.g);
    }

    @z1
    public ps g() {
        return r(a.f((AccessibilityWindowInfo) this.g));
    }

    @z1
    public ls h() {
        return ls.Y1(a.g((AccessibilityWindowInfo) this.g));
    }

    public int hashCode() {
        Object obj = this.g;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @z1
    public CharSequence i() {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.b((AccessibilityWindowInfo) this.g);
        }
        return null;
    }

    public int j() {
        return a.h((AccessibilityWindowInfo) this.g);
    }

    public boolean k() {
        return a.i((AccessibilityWindowInfo) this.g);
    }

    public boolean l() {
        return a.j((AccessibilityWindowInfo) this.g);
    }

    public boolean m() {
        return a.k((AccessibilityWindowInfo) this.g);
    }

    public void p() {
        a.n((AccessibilityWindowInfo) this.g);
    }

    @x1
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Rect rect = new Rect();
        b(rect);
        sb.append("AccessibilityWindowInfo[");
        sb.append("id=");
        sb.append(e());
        sb.append(", type=");
        sb.append(q(j()));
        sb.append(", layer=");
        sb.append(f());
        sb.append(", bounds=");
        sb.append(rect);
        sb.append(", focused=");
        sb.append(m());
        sb.append(", active=");
        sb.append(l());
        sb.append(", hasParent=");
        sb.append(g() != null);
        sb.append(", hasChildren=");
        sb.append(d() > 0);
        sb.append(f14.v);
        return sb.toString();
    }
}
package com.p7700g.p99005;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: DisplayCutoutCompat.java */
/* loaded from: classes.dex */
public final class jq {
    private final DisplayCutout a;

    /* compiled from: DisplayCutoutCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        @e1
        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        @e1
        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        @e1
        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        @e1
        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        @e1
        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    /* compiled from: DisplayCutoutCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        @e1
        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public jq(@z1 Rect rect, @z1 List<Rect> list) {
        this(Build.VERSION.SDK_INT >= 28 ? a.a(rect, list) : null);
    }

    private static DisplayCutout a(@x1 hj hjVar, @z1 Rect rect, @z1 Rect rect2, @z1 Rect rect3, @z1 Rect rect4, @x1 hj hjVar2) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            return c.a(hjVar.h(), rect, rect2, rect3, rect4, hjVar2.h());
        }
        if (i >= 29) {
            return b.a(hjVar.h(), rect, rect2, rect3, rect4);
        }
        if (i >= 28) {
            Rect rect5 = new Rect(hjVar.b, hjVar.c, hjVar.d, hjVar.e);
            ArrayList arrayList = new ArrayList();
            if (rect != null) {
                arrayList.add(rect);
            }
            if (rect2 != null) {
                arrayList.add(rect2);
            }
            if (rect3 != null) {
                arrayList.add(rect3);
            }
            if (rect4 != null) {
                arrayList.add(rect4);
            }
            return a.a(rect5, arrayList);
        }
        return null;
    }

    public static jq i(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new jq(displayCutout);
    }

    @x1
    public List<Rect> b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.a);
        }
        return Collections.emptyList();
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jq.class != obj.getClass()) {
            return false;
        }
        return ep.a(this.a, ((jq) obj).a);
    }

    public int f() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.a);
        }
        return 0;
    }

    @x1
    public hj g() {
        if (Build.VERSION.SDK_INT >= 30) {
            return hj.g(c.b(this.a));
        }
        return hj.a;
    }

    @e2(28)
    public DisplayCutout h() {
        return this.a;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("DisplayCutoutCompat{");
        G.append(this.a);
        G.append("}");
        return G.toString();
    }

    public jq(@x1 hj hjVar, @z1 Rect rect, @z1 Rect rect2, @z1 Rect rect3, @z1 Rect rect4, @x1 hj hjVar2) {
        this(a(hjVar, rect, rect2, rect3, rect4, hjVar2));
    }

    private jq(DisplayCutout displayCutout) {
        this.a = displayCutout;
    }
}
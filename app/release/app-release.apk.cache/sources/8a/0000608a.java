package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

/* compiled from: ViewGroupCompat.java */
/* loaded from: classes.dex */
public final class ur {
    public static final int a = 0;
    public static final int b = 1;

    /* compiled from: ViewGroupCompat.java */
    @e2(18)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getLayoutMode();
        }

        @e1
        public static void b(ViewGroup viewGroup, int i) {
            viewGroup.setLayoutMode(i);
        }
    }

    /* compiled from: ViewGroupCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static int a(ViewGroup viewGroup) {
            return viewGroup.getNestedScrollAxes();
        }

        @e1
        public static boolean b(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }

        @e1
        public static void c(ViewGroup viewGroup, boolean z) {
            viewGroup.setTransitionGroup(z);
        }
    }

    private ur() {
    }

    public static int a(@x1 ViewGroup viewGroup) {
        return a.a(viewGroup);
    }

    public static int b(@x1 ViewGroup viewGroup) {
        return b.a(viewGroup);
    }

    public static boolean c(@x1 ViewGroup viewGroup) {
        return b.b(viewGroup);
    }

    @Deprecated
    public static boolean d(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return viewGroup.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void e(@x1 ViewGroup viewGroup, int i) {
        a.b(viewGroup, i);
    }

    @Deprecated
    public static void f(ViewGroup viewGroup, boolean z) {
        viewGroup.setMotionEventSplittingEnabled(z);
    }

    public static void g(@x1 ViewGroup viewGroup, boolean z) {
        b.c(viewGroup, z);
    }
}
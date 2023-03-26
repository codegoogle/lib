package com.p7700g.p99005;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes.dex */
public final class js {
    public static final int A = -1;
    @Deprecated
    public static final int a = 128;
    @Deprecated
    public static final int b = 256;
    @Deprecated
    public static final int c = 512;
    @Deprecated
    public static final int d = 1024;
    @Deprecated
    public static final int e = 2048;
    @Deprecated
    public static final int f = 4096;
    @Deprecated
    public static final int g = 8192;
    public static final int h = 16384;
    public static final int i = 32768;
    public static final int j = 65536;
    public static final int k = 131072;
    public static final int l = 262144;
    public static final int m = 524288;
    public static final int n = 1048576;
    public static final int o = 2097152;
    public static final int p = 4194304;
    public static final int q = 8388608;
    public static final int r = 16777216;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 4;
    public static final int w = 8;
    public static final int x = 16;
    public static final int y = 32;
    public static final int z = 64;

    /* compiled from: AccessibilityEventCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @e1
        public static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @e1
        public static void c(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setAction(i);
        }

        @e1
        public static void d(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setMovementGranularity(i);
        }
    }

    /* compiled from: AccessibilityEventCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @e1
        public static void b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* compiled from: AccessibilityEventCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    private js() {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, ns nsVar) {
        accessibilityEvent.appendRecord((AccessibilityRecord) nsVar.g());
    }

    @Deprecated
    public static ns b(AccessibilityEvent accessibilityEvent) {
        return new ns(accessibilityEvent);
    }

    public static int c(@x1 AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int d(@x1 AccessibilityEvent accessibilityEvent) {
        return b.a(accessibilityEvent);
    }

    public static int e(@x1 AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static ns f(AccessibilityEvent accessibilityEvent, int i2) {
        return new ns(accessibilityEvent.getRecord(i2));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(@x1 AccessibilityEvent accessibilityEvent, int i2) {
        a.c(accessibilityEvent, i2);
    }

    public static void i(@x1 AccessibilityEvent accessibilityEvent, int i2) {
        b.b(accessibilityEvent, i2);
    }

    public static void j(@x1 AccessibilityEvent accessibilityEvent, int i2) {
        a.d(accessibilityEvent, i2);
    }
}
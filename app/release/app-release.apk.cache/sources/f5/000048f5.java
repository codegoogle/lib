package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;

/* compiled from: DisplayCompat.java */
/* loaded from: classes.dex */
public final class iq {
    private static final int a = 3840;
    private static final int b = 2160;

    /* compiled from: DisplayCompat.java */
    @e2(17)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    /* compiled from: DisplayCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @x1
        public static c a(@x1 Context context, @x1 Display display) {
            Display.Mode mode = display.getMode();
            Point a = iq.a(context, display);
            if (a != null && !d(mode, a)) {
                return new c(mode, a);
            }
            return new c(mode, true);
        }

        @x1
        @SuppressLint({"ArrayReturn"})
        public static c[] b(@x1 Context context, @x1 Display display) {
            c cVar;
            Display.Mode[] supportedModes = display.getSupportedModes();
            c[] cVarArr = new c[supportedModes.length];
            Display.Mode mode = display.getMode();
            Point a = iq.a(context, display);
            if (a != null && !d(mode, a)) {
                for (int i = 0; i < supportedModes.length; i++) {
                    if (e(supportedModes[i], mode)) {
                        cVar = new c(supportedModes[i], a);
                    } else {
                        cVar = new c(supportedModes[i], false);
                    }
                    cVarArr[i] = cVar;
                }
            } else {
                for (int i2 = 0; i2 < supportedModes.length; i2++) {
                    cVarArr[i2] = new c(supportedModes[i2], e(supportedModes[i2], mode));
                }
            }
            return cVarArr;
        }

        public static boolean c(@x1 Display display) {
            Display.Mode[] supportedModes;
            Display.Mode mode = display.getMode();
            for (Display.Mode mode2 : display.getSupportedModes()) {
                if (mode.getPhysicalHeight() < mode2.getPhysicalHeight() || mode.getPhysicalWidth() < mode2.getPhysicalWidth()) {
                    return false;
                }
            }
            return true;
        }

        public static boolean d(Display.Mode mode, Point point) {
            return (mode.getPhysicalWidth() == point.x && mode.getPhysicalHeight() == point.y) || (mode.getPhysicalWidth() == point.y && mode.getPhysicalHeight() == point.x);
        }

        public static boolean e(Display.Mode mode, Display.Mode mode2) {
            return mode.getPhysicalWidth() == mode2.getPhysicalWidth() && mode.getPhysicalHeight() == mode2.getPhysicalHeight();
        }
    }

    private iq() {
    }

    public static Point a(@x1 Context context, @x1 Display display) {
        Point j;
        if (Build.VERSION.SDK_INT < 28) {
            j = j("sys.display-size", display);
        } else {
            j = j("vendor.display-size", display);
        }
        if (j != null) {
            return j;
        }
        if (g(context) && f(display)) {
            return new Point(3840, b);
        }
        return null;
    }

    @x1
    private static Point b(@x1 Context context, @x1 Display display) {
        Point a2 = a(context, display);
        if (a2 != null) {
            return a2;
        }
        Point point = new Point();
        a.a(display, point);
        return point;
    }

    @x1
    public static c c(@x1 Context context, @x1 Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.a(context, display);
        }
        return new c(b(context, display));
    }

    @x1
    @SuppressLint({"ArrayReturn"})
    public static c[] d(@x1 Context context, @x1 Display display) {
        return Build.VERSION.SDK_INT >= 23 ? b.b(context, display) : new c[]{c(context, display)};
    }

    @z1
    private static String e(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean f(@x1 Display display) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.c(display);
        }
        return true;
    }

    private static boolean g(@x1 Context context) {
        return h(context) && "Sony".equals(Build.MANUFACTURER) && Build.MODEL.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd");
    }

    private static boolean h(@x1 Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    private static Point i(@x1 String str) throws NumberFormatException {
        String[] split = str.trim().split("x", -1);
        if (split.length == 2) {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[1]);
            if (parseInt > 0 && parseInt2 > 0) {
                return new Point(parseInt, parseInt2);
            }
        }
        throw new NumberFormatException();
    }

    @z1
    private static Point j(@x1 String str, @x1 Display display) {
        if (display.getDisplayId() != 0) {
            return null;
        }
        String e = e(str);
        if (!TextUtils.isEmpty(e) && e != null) {
            try {
                return i(e);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* compiled from: DisplayCompat.java */
    /* loaded from: classes.dex */
    public static final class c {
        private final Display.Mode a;
        private final Point b;
        private final boolean c;

        /* compiled from: DisplayCompat.java */
        @e2(23)
        /* loaded from: classes.dex */
        public static class a {
            private a() {
            }

            @e1
            public static int a(Display.Mode mode) {
                return mode.getPhysicalHeight();
            }

            @e1
            public static int b(Display.Mode mode) {
                return mode.getPhysicalWidth();
            }
        }

        public c(@x1 Point point) {
            jp.m(point, "physicalSize == null");
            this.b = point;
            this.a = null;
            this.c = true;
        }

        public int a() {
            return this.b.y;
        }

        public int b() {
            return this.b.x;
        }

        @Deprecated
        public boolean c() {
            return this.c;
        }

        @e2(23)
        @z1
        public Display.Mode d() {
            return this.a;
        }

        @e2(23)
        public c(@x1 Display.Mode mode, boolean z) {
            jp.m(mode, "mode == null, can't wrap a null reference");
            this.b = new Point(a.b(mode), a.a(mode));
            this.a = mode;
            this.c = z;
        }

        @e2(23)
        public c(@x1 Display.Mode mode, @x1 Point point) {
            jp.m(mode, "mode == null, can't wrap a null reference");
            jp.m(point, "physicalSize == null");
            this.b = point;
            this.a = mode;
            this.c = true;
        }
    }
}
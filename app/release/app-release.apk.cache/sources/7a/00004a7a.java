package com.p7700g.p99005;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import com.p7700g.p99005.cj;

/* compiled from: PaintCompat.java */
/* loaded from: classes.dex */
public final class jj {
    private static final String a = "\udfffd";
    private static final String b = "m";
    private static final ThreadLocal<fp<Rect, Rect>> c = new ThreadLocal<>();

    /* compiled from: PaintCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    /* compiled from: PaintCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    private jj() {
    }

    public static boolean a(@x1 Paint paint, @x1 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText(a);
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        fp<Rect, Rect> b2 = b();
        paint.getTextBounds(a, 0, 2, b2.a);
        paint.getTextBounds(str, 0, length, b2.b);
        return !b2.a.equals(b2.b);
    }

    private static fp<Rect, Rect> b() {
        ThreadLocal<fp<Rect, Rect>> threadLocal = c;
        fp<Rect, Rect> fpVar = threadLocal.get();
        if (fpVar == null) {
            fp<Rect, Rect> fpVar2 = new fp<>(new Rect(), new Rect());
            threadLocal.set(fpVar2);
            return fpVar2;
        }
        fpVar.a.setEmpty();
        fpVar.b.setEmpty();
        return fpVar;
    }

    public static boolean c(@x1 Paint paint, @z1 bj bjVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, bjVar != null ? cj.b.a(bjVar) : null);
            return true;
        } else if (bjVar != null) {
            PorterDuff.Mode a2 = cj.a(bjVar);
            paint.setXfermode(a2 != null ? new PorterDuffXfermode(a2) : null);
            return a2 != null;
        } else {
            paint.setXfermode(null);
            return true;
        }
    }
}
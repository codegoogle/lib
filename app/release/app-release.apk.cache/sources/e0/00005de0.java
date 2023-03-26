package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: Key.java */
/* loaded from: classes.dex */
public abstract class td {
    public static int a = -1;
    public static final String b = "alpha";
    public static final String c = "elevation";
    public static final String d = "rotation";
    public static final String e = "rotationX";
    public static final String f = "rotationY";
    public static final String g = "transformPivotX";
    public static final String h = "transformPivotY";
    public static final String i = "transitionPathRotate";
    public static final String j = "scaleX";
    public static final String k = "scaleY";
    public static final String l = "wavePeriod";
    public static final String m = "waveOffset";
    public static final String n = "wavePhase";
    public static final String o = "waveVariesBy";
    public static final String p = "translationX";
    public static final String q = "translationY";
    public static final String r = "translationZ";
    public static final String s = "progress";
    public static final String t = "CUSTOM";
    public static final String u = "curveFit";
    public static final String v = "motionProgress";
    public static final String w = "transitionEasing";
    public static final String x = "visibility";
    public String A;
    public int B;
    public HashMap<String, we> C;
    public int y;
    public int z;

    public td() {
        int i2 = a;
        this.y = i2;
        this.z = i2;
        this.A = null;
    }

    public abstract void a(HashMap<String, kd> splines);

    @Override // 
    /* renamed from: b */
    public abstract td clone();

    public td c(td src) {
        this.y = src.y;
        this.z = src.z;
        this.A = src.A;
        this.B = src.B;
        this.C = src.C;
        return this;
    }

    public abstract void d(HashSet<String> attributes);

    public int e() {
        return this.y;
    }

    public abstract void f(Context context, AttributeSet attrs);

    public boolean g(String constraintTag) {
        String str = this.A;
        if (str == null || constraintTag == null) {
            return false;
        }
        return constraintTag.matches(str);
    }

    public void h(int pos) {
        this.y = pos;
    }

    public void i(HashMap<String, Integer> interpolation) {
    }

    public abstract void j(String tag, Object value);

    public td k(int id) {
        this.z = id;
        return this;
    }

    public boolean l(Object value) {
        return value instanceof Boolean ? ((Boolean) value).booleanValue() : Boolean.parseBoolean(value.toString());
    }

    public float m(Object value) {
        return value instanceof Float ? ((Float) value).floatValue() : Float.parseFloat(value.toString());
    }

    public int n(Object value) {
        return value instanceof Integer ? ((Integer) value).intValue() : Integer.parseInt(value.toString());
    }
}
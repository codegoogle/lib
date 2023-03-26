package com.p7700g.p99005;

import java.util.HashMap;
import java.util.HashSet;

/* compiled from: MotionKey.java */
/* loaded from: classes.dex */
public abstract class v8 implements aa {
    public static int h = -1;
    public static final String i = "alpha";
    public static final String j = "elevation";
    public static final String k = "rotationZ";
    public static final String l = "rotationX";
    public static final String m = "transitionPathRotate";
    public static final String n = "scaleX";
    public static final String o = "scaleY";
    public static final String p = "translationX";
    public static final String q = "translationY";
    public static final String r = "CUSTOM";
    public static final String s = "visibility";
    public int t;
    public int u;
    public String v;
    public int w;
    public HashMap<String, p8> x;

    public v8() {
        int i2 = h;
        this.t = i2;
        this.u = i2;
        this.v = null;
    }

    @Override // com.p7700g.p99005.aa
    public boolean a(int i2, int i3) {
        if (i2 != 100) {
            return false;
        }
        this.t = i3;
        return true;
    }

    @Override // com.p7700g.p99005.aa
    public boolean b(int i2, float f) {
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public boolean c(int i2, String str) {
        if (i2 != 101) {
            return false;
        }
        this.v = str;
        return true;
    }

    @Override // com.p7700g.p99005.aa
    public boolean d(int i2, boolean z) {
        return false;
    }

    public abstract void f(HashMap<String, s9> hashMap);

    @Override // 
    /* renamed from: g */
    public abstract v8 clone();

    public v8 h(v8 v8Var) {
        this.t = v8Var.t;
        this.u = v8Var.u;
        this.v = v8Var.v;
        this.w = v8Var.w;
        return this;
    }

    public abstract void i(HashSet<String> hashSet);

    public int j() {
        return this.t;
    }

    public boolean k(String str) {
        String str2 = this.v;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void l(String str, int i2, float f) {
        this.x.put(str, new p8(str, i2, f));
    }

    public void m(String str, int i2, int i3) {
        this.x.put(str, new p8(str, i2, i3));
    }

    public void n(String str, int i2, String str2) {
        this.x.put(str, new p8(str, i2, str2));
    }

    public void o(String str, int i2, boolean z) {
        this.x.put(str, new p8(str, i2, z));
    }

    public void p(int i2) {
        this.t = i2;
    }

    public void q(HashMap<String, Integer> hashMap) {
    }

    public v8 r(int i2) {
        this.u = i2;
        return this;
    }

    public boolean s(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float t(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int u(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
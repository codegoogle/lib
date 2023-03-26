package com.p7700g.p99005;

/* compiled from: Marker.java */
/* loaded from: classes.dex */
public class wk0 {
    private static final String a = "\r";
    private final String b;
    public final float c;
    public final float d;

    public wk0(String str, float f, float f2) {
        this.b = str;
        this.d = f2;
        this.c = f;
    }

    public float a() {
        return this.d;
    }

    public String b() {
        return this.b;
    }

    public float c() {
        return this.c;
    }

    public boolean d(String str) {
        if (this.b.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.b.endsWith(a)) {
            String str2 = this.b;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
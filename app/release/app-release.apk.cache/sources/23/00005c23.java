package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: FontCharacter.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class sk0 {
    private final List<cm0> a;
    private final char b;
    private final double c;
    private final double d;
    private final String e;
    private final String f;

    public sk0(List<cm0> list, char c, double d, double d2, String str, String str2) {
        this.a = list;
        this.b = c;
        this.c = d;
        this.d = d2;
        this.e = str;
        this.f = str2;
    }

    public static int c(char c, String str, String str2) {
        return str2.hashCode() + wo1.x(str, (c + 0) * 31, 31);
    }

    public List<cm0> a() {
        return this.a;
    }

    public double b() {
        return this.d;
    }

    public int hashCode() {
        return c(this.b, this.f, this.e);
    }
}
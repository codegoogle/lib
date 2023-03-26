package com.p7700g.p99005;

import java.io.PrintStream;

/* compiled from: CLElement.java */
/* loaded from: classes.dex */
public class na {
    public static int s = 80;
    public static int t = 2;
    private final char[] u;
    public long v = -1;
    public long w = Long.MAX_VALUE;
    public ma x;
    private int y;

    public na(char[] cArr) {
        this.u = cArr;
    }

    public String A(int i, int i2) {
        return "";
    }

    public String B() {
        return "";
    }

    public void a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(gl4.R);
        }
    }

    public String b() {
        String str = new String(this.u);
        long j = this.w;
        if (j != Long.MAX_VALUE) {
            long j2 = this.v;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.v;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    public na c() {
        return this.x;
    }

    public String d() {
        if (ra.a) {
            return m() + " -> ";
        }
        return "";
    }

    public long e() {
        return this.w;
    }

    public float f() {
        if (this instanceof pa) {
            return ((pa) this).f();
        }
        return Float.NaN;
    }

    public int g() {
        if (this instanceof pa) {
            return ((pa) this).g();
        }
        return 0;
    }

    public int h() {
        return this.y;
    }

    public long i() {
        return this.v;
    }

    public String m() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public boolean n() {
        return this.w != Long.MAX_VALUE;
    }

    public boolean o() {
        return this.v > -1;
    }

    public boolean p() {
        return this.v == -1;
    }

    public void t(ma maVar) {
        this.x = maVar;
    }

    public String toString() {
        long j = this.v;
        long j2 = this.w;
        if (j <= j2 && j2 != Long.MAX_VALUE) {
            String substring = new String(this.u).substring((int) this.v, ((int) this.w) + 1);
            return m() + " (" + this.v + " : " + this.w + ") <<" + substring + ">>";
        }
        return getClass() + " (INVALID, " + this.v + "-" + this.w + ")";
    }

    public void u(long j) {
        if (this.w != Long.MAX_VALUE) {
            return;
        }
        this.w = j;
        if (ra.a) {
            PrintStream printStream = System.out;
            StringBuilder G = wo1.G("closing ");
            G.append(hashCode());
            G.append(" -> ");
            G.append(this);
            printStream.println(G.toString());
        }
        ma maVar = this.x;
        if (maVar != null) {
            maVar.C(this);
        }
    }

    public void x(int i) {
        this.y = i;
    }

    public void y(long j) {
        this.v = j;
    }
}
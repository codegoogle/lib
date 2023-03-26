package com.p7700g.p99005;

import java.util.concurrent.TimeUnit;

/* compiled from: ConnectionReportingConfig.java */
/* loaded from: classes2.dex */
public class fg1 {
    private static final fg1 a;
    private final long b;
    private final long c;
    private final long d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a = new fg1(timeUnit.toMillis(1L), timeUnit.toMillis(30L), timeUnit.toMillis(5L));
    }

    public fg1(long j, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    @x1
    public static fg1 a() {
        return a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.b;
    }

    public long d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fg1 fg1Var = (fg1) obj;
        return this.b == fg1Var.b && this.c == fg1Var.c && this.d == fg1Var.d;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        long j3 = this.d;
        return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("ConnectionReportingConfig{connectionStartDelay=");
        G.append(this.b);
        G.append(", connectionStartDetailsDelay=");
        G.append(this.c);
        G.append(", cancelThreshold=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}
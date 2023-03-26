package com.p7700g.p99005;

/* compiled from: NetworkState.java */
/* loaded from: classes.dex */
public class id0 {
    private boolean a;
    private boolean b;
    private boolean c;
    private boolean d;

    public id0(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming) {
        this.a = isConnected;
        this.b = isValidated;
        this.c = isMetered;
        this.d = isNotRoaming;
    }

    public boolean a() {
        return this.a;
    }

    public boolean b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public boolean d() {
        return this.b;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof id0) {
            id0 id0Var = (id0) o;
            return this.a == id0Var.a && this.b == id0Var.b && this.c == id0Var.c && this.d == id0Var.d;
        }
        return false;
    }

    public int hashCode() {
        int i = this.a ? 1 : 0;
        if (this.b) {
            i += 16;
        }
        if (this.c) {
            i += 256;
        }
        return this.d ? i + 4096 : i;
    }

    @x1
    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d));
    }
}
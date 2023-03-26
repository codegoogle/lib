package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: Preference.java */
@i2({i2.a.t})
@g40
/* loaded from: classes.dex */
public class ie0 {
    @x1
    @x40
    @z30(name = "key")
    public String a;
    @z1
    @z30(name = "long_value")
    public Long b;

    public ie0(@x1 String key, boolean value) {
        this(key, value ? 1L : 0L);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ie0) {
            ie0 ie0Var = (ie0) o;
            if (this.a.equals(ie0Var.a)) {
                Long l = this.b;
                Long l2 = ie0Var.b;
                return l != null ? l.equals(l2) : l2 == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public ie0(@x1 String key, long value) {
        this.a = key;
        this.b = Long.valueOf(value);
    }
}
package com.p7700g.p99005;

import java.io.Serializable;

/* compiled from: CallbackData.java */
/* loaded from: classes.dex */
public class mr0 implements Serializable {
    @x1
    private final String s;
    private final int t;

    public mr0(@x1 String str, int i) {
        this.s = str;
        this.t = i;
    }

    @x1
    public String f() {
        return this.s;
    }

    public int g() {
        return this.t;
    }

    @x1
    public String toString() {
        StringBuilder K = wo1.K("CallbackData{", "body='");
        wo1.d0(K, this.s, '\'', ", httpCode=");
        return wo1.y(K, this.t, '}');
    }
}
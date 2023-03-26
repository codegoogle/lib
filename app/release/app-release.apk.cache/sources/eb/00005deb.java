package com.p7700g.p99005;

import java.util.HashMap;
import java.util.Map;

/* compiled from: TransportReconnectionCounter.java */
/* loaded from: classes2.dex */
public class te1 {
    @x1
    private final Map<String, Integer> a = new HashMap();

    public int a(@x1 String str) {
        Integer num = this.a.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public void b() {
        this.a.clear();
    }

    public void c() {
        this.a.clear();
    }

    public void d(@x1 String str) {
        this.a.put(str, Integer.valueOf(a(str) + 1));
    }
}
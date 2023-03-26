package com.p7700g.p99005;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TrackableException.java */
/* loaded from: classes2.dex */
public class fc1 extends gc1 {
    @x1
    private final Map<String, String> s;

    public fc1(@x1 Map<String, String> map, @x1 Throwable th) {
        super(th);
        this.s = map;
    }

    @x1
    public Map<String, String> f() {
        return Collections.unmodifiableMap(this.s);
    }

    public fc1(@x1 Bundle bundle, @x1 Throwable th) {
        super(th);
        this.s = new HashMap();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                this.s.put(str, String.valueOf(obj));
            }
        }
    }
}
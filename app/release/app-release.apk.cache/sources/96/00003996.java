package com.p7700g.p99005;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LinkHeaders.java */
/* loaded from: classes3.dex */
public class at3 {
    private final Map<String, zs3> a;

    public at3(um4<String, String> um4Var) throws IllegalArgumentException {
        List<String> list = (List) um4Var.get("Link");
        if (list != null) {
            this.a = new HashMap();
            for (String str : list) {
                zs3 k = zs3.k(str);
                for (String str2 : k.f()) {
                    this.a.put(str2, k);
                }
            }
            return;
        }
        this.a = Collections.emptyMap();
    }

    public zs3 a(String str) throws IllegalArgumentException {
        return this.a.get(str);
    }
}
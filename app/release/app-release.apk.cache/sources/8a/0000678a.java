package com.p7700g.p99005;

import com.p7700g.p99005.si3;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: OSFocusTimeProcessorFactory.java */
/* loaded from: classes3.dex */
public class yj3 {
    private final HashMap<String, si3.c> a;

    public yj3() {
        HashMap<String, si3.c> hashMap = new HashMap<>();
        this.a = hashMap;
        hashMap.put(si3.d.class.getName(), new si3.d());
        hashMap.put(si3.b.class.getName(), new si3.b());
    }

    private si3.c a() {
        return this.a.get(si3.b.class.getName());
    }

    private si3.c d() {
        return this.a.get(si3.d.class.getName());
    }

    public si3.c b() {
        si3.c a = a();
        for (do3 do3Var : a.j()) {
            if (do3Var.e().f()) {
                return a;
            }
        }
        return d();
    }

    public si3.c c(List<do3> list) {
        boolean z;
        Iterator<do3> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().e().f()) {
                z = true;
                break;
            }
        }
        if (z) {
            return a();
        }
        return d();
    }
}
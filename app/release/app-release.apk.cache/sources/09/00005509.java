package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PreFillQueue.java */
/* loaded from: classes2.dex */
public final class ot1 {
    private final Map<pt1, Integer> a;
    private final List<pt1> b;
    private int c;
    private int d;

    public ot1(Map<pt1, Integer> map) {
        this.a = map;
        this.b = new ArrayList(map.keySet());
        for (Integer num : map.values()) {
            this.c = num.intValue() + this.c;
        }
    }

    public int a() {
        return this.c;
    }

    public boolean b() {
        return this.c == 0;
    }

    public pt1 c() {
        pt1 pt1Var = this.b.get(this.d);
        Integer num = this.a.get(pt1Var);
        if (num.intValue() == 1) {
            this.a.remove(pt1Var);
            this.b.remove(this.d);
        } else {
            this.a.put(pt1Var, Integer.valueOf(num.intValue() - 1));
        }
        this.c--;
        this.d = this.b.isEmpty() ? 0 : (this.d + 1) % this.b.size();
        return pt1Var;
    }
}
package com.p7700g.p99005;

import android.util.SparseArray;
import java.util.HashMap;

/* compiled from: PriorityMapping.java */
/* loaded from: classes2.dex */
public final class ea2 {
    private static SparseArray<d32> a = new SparseArray<>();
    private static HashMap<d32, Integer> b;

    static {
        HashMap<d32, Integer> hashMap = new HashMap<>();
        b = hashMap;
        hashMap.put(d32.DEFAULT, 0);
        b.put(d32.VERY_LOW, 1);
        b.put(d32.HIGHEST, 2);
        for (d32 d32Var : b.keySet()) {
            a.append(b.get(d32Var).intValue(), d32Var);
        }
    }

    public static int a(@x1 d32 d32Var) {
        Integer num = b.get(d32Var);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + d32Var);
    }

    @x1
    public static d32 b(int i) {
        d32 d32Var = a.get(i);
        if (d32Var != null) {
            return d32Var;
        }
        throw new IllegalArgumentException(wo1.l("Unknown Priority for value ", i));
    }
}
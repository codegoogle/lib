package com.p7700g.p99005;

import android.util.SparseArray;

/* compiled from: QosTier.java */
/* loaded from: classes2.dex */
public enum f42 {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    
    private static final SparseArray<f42> y;
    private final int A;

    static {
        f42 f42Var = DEFAULT;
        f42 f42Var2 = UNMETERED_ONLY;
        f42 f42Var3 = UNMETERED_OR_DAILY;
        f42 f42Var4 = FAST_IF_RADIO_AWAKE;
        f42 f42Var5 = NEVER;
        f42 f42Var6 = UNRECOGNIZED;
        SparseArray<f42> sparseArray = new SparseArray<>();
        y = sparseArray;
        sparseArray.put(0, f42Var);
        sparseArray.put(1, f42Var2);
        sparseArray.put(2, f42Var3);
        sparseArray.put(3, f42Var4);
        sparseArray.put(4, f42Var5);
        sparseArray.put(-1, f42Var6);
    }

    f42(int i) {
        this.A = i;
    }

    @z1
    public static f42 b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public final int f() {
        return this.A;
    }
}
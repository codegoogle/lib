package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ab3 extends ua3 {

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            l23.values();
            int[] iArr = new int[16];
            iArr[l23.CRASH_TIMESTAMP.ordinal()] = 1;
            a = iArr;
        }
    }

    public ab3() {
        super(l23.CRASH_TIMESTAMP);
    }

    @Override // com.p7700g.p99005.ua3
    @NotNull
    public db3 a(@NotNull l23 l23Var) {
        c25.p(l23Var, "reportField");
        if (a.a[l23Var.ordinal()] == 1) {
            return new eb3(Long.valueOf(System.currentTimeMillis()));
        }
        return wa3.b.a();
    }
}
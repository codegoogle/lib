package com.p7700g.p99005;

/* compiled from: WrongStateException.java */
/* loaded from: classes2.dex */
public class lc1 extends gc1 {
    public lc1(@x1 String str) {
        super(str);
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G("WrongStateException:");
        G.append(getMessage());
        return G.toString();
    }
}
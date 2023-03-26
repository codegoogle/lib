package com.p7700g.p99005;

/* compiled from: BrokenRemoteProcessException.java */
/* loaded from: classes2.dex */
public class qb1 extends gc1 {
    public qb1(@x1 String str) {
        super(str);
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G("BrokenRemoteProcessException:");
        G.append(getMessage());
        return G.toString();
    }
}
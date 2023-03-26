package com.p7700g.p99005;

/* compiled from: InternalException.java */
/* loaded from: classes2.dex */
public class wb1 extends gc1 {
    public wb1(@x1 String str, @x1 Throwable th) {
        super(str, th);
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G("InternalException:");
        G.append(getMessage());
        return G.toString();
    }
}
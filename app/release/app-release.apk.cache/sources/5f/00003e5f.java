package com.p7700g.p99005;

/* compiled from: ServiceBindFailedException.java */
/* loaded from: classes2.dex */
public class dc1 extends gc1 {
    public dc1() {
        super("Can not bind remote service");
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        return "ServiceBindFailedException";
    }
}
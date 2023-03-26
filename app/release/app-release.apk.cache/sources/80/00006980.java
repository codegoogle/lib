package com.p7700g.p99005;

/* compiled from: OperationCanceledException.java */
/* loaded from: classes.dex */
public class zm extends RuntimeException {
    public zm() {
        this(null);
    }

    public zm(@z1 String str) {
        super(ep.f(str, "The operation has been canceled."));
    }
}
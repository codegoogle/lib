package com.p7700g.p99005;

/* compiled from: CredentialsLoadException.java */
/* loaded from: classes2.dex */
public class ub1 extends gc1 {
    public ub1(@x1 Throwable th) {
        super(th);
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        Throwable cause = getCause();
        String message = cause != null ? cause.getMessage() : null;
        return message != null ? message : super.toTrackerName();
    }
}
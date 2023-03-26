package com.p7700g.p99005;

/* compiled from: CaptivePortalException.java */
/* loaded from: classes2.dex */
public class eo1 extends gc1 {
    public eo1() {
        super("Captive Portal");
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        String message = getMessage();
        return message != null ? message : "";
    }
}
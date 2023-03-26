package com.anchorfree.sdk.exceptions;

import com.p7700g.p99005.gc1;
import com.p7700g.p99005.x1;

/* loaded from: classes.dex */
public class InvalidTransportException extends gc1 {
    public InvalidTransportException() {
        super("Transport was not set or found for call");
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        return "InvalidTransportException";
    }
}
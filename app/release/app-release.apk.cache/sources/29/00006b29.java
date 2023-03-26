package org.xbill.DNS;

import com.p7700g.p99005.wo1;

/* loaded from: classes4.dex */
public class InvalidTTLException extends IllegalArgumentException {
    public InvalidTTLException(long j) {
        super(wo1.p("Invalid DNS TTL: ", j));
    }
}
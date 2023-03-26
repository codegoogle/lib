package org.xbill.DNS;

import com.p7700g.p99005.wo1;

/* loaded from: classes4.dex */
public class InvalidDClassException extends IllegalArgumentException {
    public InvalidDClassException(int i) {
        super(wo1.l("Invalid DNS class: ", i));
    }
}
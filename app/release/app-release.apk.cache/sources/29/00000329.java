package com.anchorfree.sdk.exceptions;

import com.p7700g.p99005.ub1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class CnlBlockedException extends ub1 {
    public CnlBlockedException() {
        super(new IllegalStateException());
    }

    @Override // java.lang.Throwable
    @z1
    public String getMessage() {
        return "CnlBlockedException";
    }
}
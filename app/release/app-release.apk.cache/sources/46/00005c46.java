package com.p7700g.p99005;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes3.dex */
public class sn2 extends Exception {
    @Deprecated
    public sn2() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn2(@x1 String str) {
        super(str);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sn2(@x1 String str, @x1 Throwable th) {
        super(str, th);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
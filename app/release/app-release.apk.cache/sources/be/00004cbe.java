package com.p7700g.p99005;

import java.util.function.ToLongFunction;

/* compiled from: lambda */
/* loaded from: classes3.dex */
public final /* synthetic */ class kh4 implements ToLongFunction {
    public static final /* synthetic */ kh4 a = new kh4();

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        long longValue;
        longValue = ((si4) obj).getCount().longValue();
        return longValue;
    }
}
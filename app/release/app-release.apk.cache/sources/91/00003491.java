package com.ironsource.mediationsdk.adunit.b;

import com.p7700g.p99005.qe3;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g extends qe3 {
    public g(d dVar) {
        super(dVar);
    }

    public final void a() {
        a(b.INIT_STARTED);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("duration", Long.valueOf(j));
        b(b.INIT_ENDED, hashMap);
    }
}
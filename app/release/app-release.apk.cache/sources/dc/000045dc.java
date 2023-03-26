package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.t43;

/* compiled from: ClearCacheRequest.java */
/* loaded from: classes3.dex */
public class h53 extends t43<Object> {
    private final g43 J;
    private final Runnable K;

    public h53(g43 cache, Runnable callback) {
        super(0, null, null);
        this.J = cache;
        this.K = callback;
    }

    @Override // com.p7700g.p99005.t43
    public boolean F() {
        this.J.clear();
        if (this.K != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.K);
            return true;
        }
        return true;
    }

    @Override // com.p7700g.p99005.t43
    public v43<Object> K(p43 response) {
        return null;
    }

    @Override // com.p7700g.p99005.t43
    public void f(Object response) {
    }

    @Override // com.p7700g.p99005.t43
    public t43.d w() {
        return t43.d.IMMEDIATE;
    }
}
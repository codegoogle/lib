package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.mx1;

/* compiled from: DefaultConnectivityMonitor.java */
/* loaded from: classes2.dex */
public final class ox1 implements mx1 {
    private final Context s;
    public final mx1.a t;

    public ox1(@x1 Context context, @x1 mx1.a aVar) {
        this.s = context.getApplicationContext();
        this.t = aVar;
    }

    private void a() {
        cy1.a(this.s).d(this.t);
    }

    private void d() {
        cy1.a(this.s).f(this.t);
    }

    @Override // com.p7700g.p99005.wx1
    public void onDestroy() {
    }

    @Override // com.p7700g.p99005.wx1
    public void onStart() {
        a();
    }

    @Override // com.p7700g.p99005.wx1
    public void onStop() {
        d();
    }
}
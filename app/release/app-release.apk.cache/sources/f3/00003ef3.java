package com.p7700g.p99005;

import android.os.IBinder;
import java.util.List;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class dm2 extends xl2 {
    public final /* synthetic */ IBinder t;
    public final /* synthetic */ gm2 u;

    public dm2(gm2 gm2Var, IBinder iBinder) {
        this.u = gm2Var;
        this.t = iBinder;
    }

    @Override // com.p7700g.p99005.xl2
    public final void a() {
        List<Runnable> list;
        List list2;
        this.u.s.n = sl2.O1(this.t);
        hm2.n(this.u.s);
        this.u.s.h = false;
        list = this.u.s.e;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.u.s.e;
        list2.clear();
    }
}
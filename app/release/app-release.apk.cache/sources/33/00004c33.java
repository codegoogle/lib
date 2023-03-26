package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.wb0;

/* compiled from: OperationImpl.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class kc0 implements wb0 {
    private final xz<wb0.b> c = new xz<>();
    private final zf0<wb0.b.c> d = zf0.v();

    public kc0() {
        b(wb0.b);
    }

    @Override // com.p7700g.p99005.wb0
    @x1
    public gn2<wb0.b.c> a() {
        return this.d;
    }

    public void b(@x1 wb0.b state) {
        this.c.n(state);
        if (state instanceof wb0.b.c) {
            this.d.q((wb0.b.c) state);
        } else if (state instanceof wb0.b.a) {
            this.d.r(((wb0.b.a) state).a());
        }
    }

    @Override // com.p7700g.p99005.wb0
    @x1
    public LiveData<wb0.b> getState() {
        return this.c;
    }
}
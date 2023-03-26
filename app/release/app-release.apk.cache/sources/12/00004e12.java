package com.p7700g.p99005;

import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CompositeVpnCallListener.java */
/* loaded from: classes.dex */
public class l71 extends bb1<Parcelable> {
    @x1
    private final List<cb1> b;
    @x1
    private final kj1 c;
    @x1
    private final Executor d;

    public l71(@x1 List<cb1> list, @x1 kj1 kj1Var, @x1 Executor executor) {
        super(Parcelable.class);
        this.b = list;
        this.c = kj1Var;
        this.d = executor;
    }

    private /* synthetic */ Object c(Parcelable parcelable) throws Exception {
        for (cb1 cb1Var : this.b) {
            cb1Var.b(parcelable);
        }
        return null;
    }

    @Override // com.p7700g.p99005.cb1
    public void b(@x1 final Parcelable parcelable) {
        this.c.c("onVpnCall %s", parcelable.toString());
        dq0.e(new Callable() { // from class: com.p7700g.p99005.h71
            @Override // java.util.concurrent.Callable
            public final Object call() {
                l71.this.d(parcelable);
                return null;
            }
        }, this.d);
    }

    public /* synthetic */ Object d(Parcelable parcelable) {
        c(parcelable);
        return null;
    }
}
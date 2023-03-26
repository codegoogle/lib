package com.ironsource.mediationsdk.b;

/* loaded from: classes3.dex */
public final class b extends com.ironsource.mediationsdk.b.a<a> {

    /* loaded from: classes3.dex */
    public interface a {
        void a();
    }

    public b(int i) {
        super(i * 1000);
    }

    @Override // com.ironsource.mediationsdk.b.a
    public final void a() {
        T t = this.c;
        if (t != 0) {
            ((a) t).a();
        }
    }

    public final void a(a aVar) {
        b(aVar);
    }

    public final void d() {
        e();
    }
}
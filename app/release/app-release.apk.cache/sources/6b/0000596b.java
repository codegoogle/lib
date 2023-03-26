package com.p7700g.p99005;

/* compiled from: ProviderOfLazy.java */
/* loaded from: classes2.dex */
public final class r62<T> implements ol4<u52<T>> {
    public static final /* synthetic */ boolean a = false;
    private final ol4<T> b;

    private r62(ol4<T> ol4Var) {
        this.b = ol4Var;
    }

    public static <T> ol4<u52<T>> a(ol4<T> ol4Var) {
        return new r62((ol4) q62.b(ol4Var));
    }

    @Override // com.p7700g.p99005.ol4
    /* renamed from: b */
    public u52<T> get() {
        return g62.a(this.b);
    }
}
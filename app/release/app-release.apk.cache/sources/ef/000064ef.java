package com.p7700g.p99005;

/* compiled from: TransportImpl.java */
/* loaded from: classes2.dex */
public final class x42<T> implements g32<T> {
    private final v42 a;
    private final String b;
    private final b32 c;
    private final f32<T, byte[]> d;
    private final y42 e;

    public x42(v42 v42Var, String str, b32 b32Var, f32<T, byte[]> f32Var, y42 y42Var) {
        this.a = v42Var;
        this.b = str;
        this.c = b32Var;
        this.d = f32Var;
        this.e = y42Var;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // com.p7700g.p99005.g32
    public void a(c32<T> c32Var) {
        b(c32Var, g42.a);
    }

    @Override // com.p7700g.p99005.g32
    public void b(c32<T> c32Var, i32 i32Var) {
        this.e.a(u42.a().f(this.a).c(c32Var).g(this.b).e(this.d).b(this.c).a(), i32Var);
    }
}
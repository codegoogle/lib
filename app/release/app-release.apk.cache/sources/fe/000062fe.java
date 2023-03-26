package com.p7700g.p99005;

import java.util.Set;

/* compiled from: TransportFactoryImpl.java */
/* loaded from: classes2.dex */
public final class w42 implements h32 {
    private final Set<b32> a;
    private final v42 b;
    private final y42 c;

    public w42(Set<b32> set, v42 v42Var, y42 y42Var) {
        this.a = set;
        this.b = v42Var;
        this.c = y42Var;
    }

    @Override // com.p7700g.p99005.h32
    public <T> g32<T> a(String str, Class<T> cls, f32<T, byte[]> f32Var) {
        return b(str, cls, b32.b("proto"), f32Var);
    }

    @Override // com.p7700g.p99005.h32
    public <T> g32<T> b(String str, Class<T> cls, b32 b32Var, f32<T, byte[]> f32Var) {
        if (this.a.contains(b32Var)) {
            return new x42(this.b, str, b32Var, f32Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", b32Var, this.a));
    }
}
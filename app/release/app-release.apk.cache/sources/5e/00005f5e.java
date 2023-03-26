package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.i42;

/* compiled from: SendRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class u42 {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract u42 a();

        public abstract a b(b32 b32Var);

        public abstract a c(c32<?> c32Var);

        public <T> a d(c32<T> c32Var, b32 b32Var, f32<T, byte[]> f32Var) {
            c(c32Var);
            b(b32Var);
            e(f32Var);
            return this;
        }

        public abstract a e(f32<?, byte[]> f32Var);

        public abstract a f(v42 v42Var);

        public abstract a g(String str);
    }

    public static a a() {
        return new i42.b();
    }

    public abstract b32 b();

    public abstract c32<?> c();

    public byte[] d() {
        return e().apply(c().b());
    }

    public abstract f32<?, byte[]> e();

    public abstract v42 f();

    public abstract String g();
}
package com.p7700g.p99005;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class ec3 {
    private final int a;
    @Nullable
    private b b;
    private int c;

    /* loaded from: classes3.dex */
    public static abstract class a<T, R> {
        private int a = fc3.d.a();
        private int b = 3;
        @Nullable
        private b c;
        private int d;

        public final int a() {
            return this.b;
        }

        @NotNull
        public final a<T, R> b(@p1(from = 0) int i) {
            this.a = i;
            return this;
        }

        @NotNull
        public final a<T, R> c(@NotNull b bVar) {
            c25.p(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            this.c = bVar;
            return this;
        }

        @NotNull
        public final a<T, R> d(@p1(from = 0) int i) {
            this.b = i;
            return this;
        }

        @Nullable
        public final b e() {
            return this.c;
        }

        public final int f() {
            return this.d;
        }

        @NotNull
        public final a<T, R> g(@p1(from = 1) int i) {
            this.d = i;
            return this;
        }

        @NotNull
        public abstract ec3 h();
    }

    /* loaded from: classes3.dex */
    public interface b {
        void c();

        void d();
    }

    public ec3(int i, @Nullable b bVar) {
        this.a = i;
        this.b = bVar;
    }

    @Nullable
    public final b a() {
        return this.b;
    }

    public final void b(@Nullable b bVar) {
        this.b = bVar;
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    @t0
    public void g() {
        this.c = 0;
    }

    public final boolean h() {
        return this.c > this.a;
    }

    public final void i() {
        this.c++;
    }

    public final int j() {
        return this.c;
    }
}
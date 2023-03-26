package com.p7700g.p99005;

import com.p7700g.p99005.iz5;
import com.p7700g.p99005.mz5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: DefaultCallAdapterFactory.java */
/* loaded from: classes4.dex */
public final class mz5 extends iz5.a {
    @Nullable
    private final Executor a;

    /* compiled from: DefaultCallAdapterFactory.java */
    /* loaded from: classes4.dex */
    public class a implements iz5<Object, hz5<?>> {
        public final /* synthetic */ Type a;
        public final /* synthetic */ Executor b;

        public a(Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // com.p7700g.p99005.iz5
        public Type a() {
            return this.a;
        }

        @Override // com.p7700g.p99005.iz5
        /* renamed from: c */
        public hz5<Object> b(hz5<Object> hz5Var) {
            Executor executor = this.b;
            return executor == null ? hz5Var : new b(executor, hz5Var);
        }
    }

    /* compiled from: DefaultCallAdapterFactory.java */
    /* loaded from: classes4.dex */
    public static final class b<T> implements hz5<T> {
        public final Executor s;
        public final hz5<T> t;

        /* compiled from: DefaultCallAdapterFactory.java */
        /* loaded from: classes4.dex */
        public class a implements jz5<T> {
            public final /* synthetic */ jz5 a;

            public a(jz5 jz5Var) {
                this.a = jz5Var;
            }

            private /* synthetic */ void c(jz5 jz5Var, Throwable th) {
                jz5Var.a(b.this, th);
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public /* synthetic */ void f(jz5 jz5Var, xz5 xz5Var) {
                if (b.this.t.c1()) {
                    jz5Var.a(b.this, new IOException("Canceled"));
                } else {
                    jz5Var.b(b.this, xz5Var);
                }
            }

            @Override // com.p7700g.p99005.jz5
            public void a(hz5<T> hz5Var, final Throwable th) {
                Executor executor = b.this.s;
                final jz5 jz5Var = this.a;
                executor.execute(new Runnable() { // from class: com.p7700g.p99005.ez5
                    @Override // java.lang.Runnable
                    public final void run() {
                        mz5.b.a aVar = mz5.b.a.this;
                        jz5Var.a(mz5.b.this, th);
                    }
                });
            }

            @Override // com.p7700g.p99005.jz5
            public void b(hz5<T> hz5Var, final xz5<T> xz5Var) {
                Executor executor = b.this.s;
                final jz5 jz5Var = this.a;
                executor.execute(new Runnable() { // from class: com.p7700g.p99005.fz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        mz5.b.a.this.f(jz5Var, xz5Var);
                    }
                });
            }

            public /* synthetic */ void d(jz5 jz5Var, Throwable th) {
                jz5Var.a(b.this, th);
            }
        }

        public b(Executor executor, hz5<T> hz5Var) {
            this.s = executor;
            this.t = hz5Var;
        }

        @Override // com.p7700g.p99005.hz5
        public boolean X0() {
            return this.t.X0();
        }

        @Override // com.p7700g.p99005.hz5
        public boolean c1() {
            return this.t.c1();
        }

        @Override // com.p7700g.p99005.hz5
        public void cancel() {
            this.t.cancel();
        }

        @Override // com.p7700g.p99005.hz5
        /* renamed from: d1 */
        public hz5<T> clone() {
            return new b(this.s, this.t.d1());
        }

        @Override // com.p7700g.p99005.hz5
        public void m(jz5<T> jz5Var) {
            Objects.requireNonNull(jz5Var, "callback == null");
            this.t.m(new a(jz5Var));
        }

        @Override // com.p7700g.p99005.hz5
        public zw5 timeout() {
            return this.t.timeout();
        }

        @Override // com.p7700g.p99005.hz5
        public xz5<T> w0() throws IOException {
            return this.t.w0();
        }

        @Override // com.p7700g.p99005.hz5
        public hr5 x0() {
            return this.t.x0();
        }
    }

    public mz5(@Nullable Executor executor) {
        this.a = executor;
    }

    @Override // com.p7700g.p99005.iz5.a
    @Nullable
    public iz5<?, ?> a(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        if (iz5.a.c(type) != hz5.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            return new a(c06.g(0, (ParameterizedType) type), c06.l(annotationArr, a06.class) ? null : this.a);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
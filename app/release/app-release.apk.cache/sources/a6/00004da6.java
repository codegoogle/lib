package com.p7700g.p99005;

import com.p7700g.p99005.iz5;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* compiled from: CompletableFutureCallAdapterFactory.java */
@IgnoreJRERequirement
/* loaded from: classes4.dex */
public final class kz5 extends iz5.a {
    public static final iz5.a a = new kz5();

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class a<R> implements iz5<R, CompletableFuture<R>> {
        private final Type a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* renamed from: com.p7700g.p99005.kz5$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public class C0207a implements jz5<R> {
            private final CompletableFuture<R> a;

            public C0207a(CompletableFuture<R> completableFuture) {
                this.a = completableFuture;
            }

            @Override // com.p7700g.p99005.jz5
            public void a(hz5<R> hz5Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // com.p7700g.p99005.jz5
            public void b(hz5<R> hz5Var, xz5<R> xz5Var) {
                if (xz5Var.g()) {
                    this.a.complete(xz5Var.a());
                } else {
                    this.a.completeExceptionally(new nz5(xz5Var));
                }
            }
        }

        public a(Type type) {
            this.a = type;
        }

        @Override // com.p7700g.p99005.iz5
        public Type a() {
            return this.a;
        }

        @Override // com.p7700g.p99005.iz5
        /* renamed from: c */
        public CompletableFuture<R> b(hz5<R> hz5Var) {
            b bVar = new b(hz5Var);
            hz5Var.m(new C0207a(bVar));
            return bVar;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class b<T> extends CompletableFuture<T> {
        private final hz5<?> s;

        public b(hz5<?> hz5Var) {
            this.s = hz5Var;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.s.cancel();
            }
            return super.cancel(z);
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory.java */
    @IgnoreJRERequirement
    /* loaded from: classes4.dex */
    public static final class c<R> implements iz5<R, CompletableFuture<xz5<R>>> {
        private final Type a;

        /* compiled from: CompletableFutureCallAdapterFactory.java */
        @IgnoreJRERequirement
        /* loaded from: classes4.dex */
        public class a implements jz5<R> {
            private final CompletableFuture<xz5<R>> a;

            public a(CompletableFuture<xz5<R>> completableFuture) {
                this.a = completableFuture;
            }

            @Override // com.p7700g.p99005.jz5
            public void a(hz5<R> hz5Var, Throwable th) {
                this.a.completeExceptionally(th);
            }

            @Override // com.p7700g.p99005.jz5
            public void b(hz5<R> hz5Var, xz5<R> xz5Var) {
                this.a.complete(xz5Var);
            }
        }

        public c(Type type) {
            this.a = type;
        }

        @Override // com.p7700g.p99005.iz5
        public Type a() {
            return this.a;
        }

        @Override // com.p7700g.p99005.iz5
        /* renamed from: c */
        public CompletableFuture<xz5<R>> b(hz5<R> hz5Var) {
            b bVar = new b(hz5Var);
            hz5Var.m(new a(bVar));
            return bVar;
        }
    }

    @Override // com.p7700g.p99005.iz5.a
    @Nullable
    public iz5<?, ?> a(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        if (iz5.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b2 = iz5.a.b(0, (ParameterizedType) type);
            if (iz5.a.c(b2) != xz5.class) {
                return new a(b2);
            }
            if (b2 instanceof ParameterizedType) {
                return new c(iz5.a.b(0, (ParameterizedType) b2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
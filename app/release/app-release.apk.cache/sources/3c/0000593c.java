package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import com.p7700g.p99005.x20;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: AsyncDifferConfig.java */
/* loaded from: classes.dex */
public final class r20<T> {
    @z1
    private final Executor a;
    @x1
    private final Executor b;
    @x1
    private final x20.d<T> c;

    /* compiled from: AsyncDifferConfig.java */
    /* loaded from: classes.dex */
    public static final class a<T> {
        private static final Object a = new Object();
        private static Executor b;
        @z1
        private Executor c;
        private Executor d;
        private final x20.d<T> e;

        public a(@x1 x20.d<T> dVar) {
            this.e = dVar;
        }

        @x1
        public r20<T> a() {
            if (this.d == null) {
                synchronized (a) {
                    if (b == null) {
                        b = Executors.newFixedThreadPool(2);
                    }
                }
                this.d = b;
            }
            return new r20<>(this.c, this.d, this.e);
        }

        @x1
        public a<T> b(Executor executor) {
            this.d = executor;
            return this;
        }

        @i2({i2.a.LIBRARY})
        @x1
        public a<T> c(Executor executor) {
            this.c = executor;
            return this;
        }
    }

    public r20(@z1 Executor executor, @x1 Executor executor2, @x1 x20.d<T> dVar) {
        this.a = executor;
        this.b = executor2;
        this.c = dVar;
    }

    @x1
    public Executor a() {
        return this.b;
    }

    @x1
    public x20.d<T> b() {
        return this.c;
    }

    @i2({i2.a.LIBRARY})
    @z1
    public Executor c() {
        return this.a;
    }
}
package com.p7700g.p99005;

/* compiled from: DataFetcher.java */
/* loaded from: classes2.dex */
public interface rq1<T> {

    /* compiled from: DataFetcher.java */
    /* loaded from: classes2.dex */
    public interface a<T> {
        void c(@x1 Exception exc);

        void f(@z1 T t);
    }

    @x1
    Class<T> a();

    void b();

    void cancel();

    @x1
    aq1 d();

    void e(@x1 fp1 fp1Var, @x1 a<? super T> aVar);
}
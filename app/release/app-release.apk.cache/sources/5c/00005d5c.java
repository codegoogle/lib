package com.p7700g.p99005;

import com.p7700g.p99005.u30;

/* compiled from: ThreadUtil.java */
/* loaded from: classes.dex */
public interface t30<T> {

    /* compiled from: ThreadUtil.java */
    /* loaded from: classes.dex */
    public interface a<T> {
        void a(int i, int i2, int i3, int i4, int i5);

        void b(u30.a<T> aVar);

        void c(int i, int i2);

        void d(int i);
    }

    /* compiled from: ThreadUtil.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(int i, u30.a<T> aVar);

        void b(int i, int i2);

        void c(int i, int i2);
    }

    a<T> a(a<T> aVar);

    b<T> b(b<T> bVar);
}
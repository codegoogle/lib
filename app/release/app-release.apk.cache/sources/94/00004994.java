package com.p7700g.p99005;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: LoaderManager.java */
/* loaded from: classes.dex */
public abstract class j10 {

    /* compiled from: LoaderManager.java */
    /* loaded from: classes.dex */
    public interface a<D> {
        @u1
        void a(@x1 n10<D> n10Var, D d);

        @x1
        @u1
        n10<D> b(int i, @z1 Bundle bundle);

        @u1
        void c(@x1 n10<D> n10Var);
    }

    public static void c(boolean z) {
        k10.b = z;
    }

    @x1
    public static <T extends qz & q00> j10 d(@x1 T t) {
        return new k10(t, t.getViewModelStore());
    }

    @u1
    public abstract void a(int i);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @z1
    public abstract <D> n10<D> e(int i);

    public boolean f() {
        return false;
    }

    @x1
    @u1
    public abstract <D> n10<D> g(int i, @z1 Bundle bundle, @x1 a<D> aVar);

    public abstract void h();

    @x1
    @u1
    public abstract <D> n10<D> i(int i, @z1 Bundle bundle, @x1 a<D> aVar);
}
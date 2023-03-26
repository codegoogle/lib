package com.p7700g.p99005;

import com.p7700g.p99005.g43;

/* compiled from: Response.java */
/* loaded from: classes3.dex */
public class v43<T> {
    public final T a;
    public final g43.a b;
    public final b53 c;
    public boolean d;

    /* compiled from: Response.java */
    /* loaded from: classes3.dex */
    public interface a {
        void b(b53 error);
    }

    /* compiled from: Response.java */
    /* loaded from: classes3.dex */
    public interface b<T> {
        void onResponse(T response);
    }

    private v43(T result, g43.a cacheEntry) {
        this.d = false;
        this.a = result;
        this.b = cacheEntry;
        this.c = null;
    }

    public static <T> v43<T> a(b53 error) {
        return new v43<>(error);
    }

    public static <T> v43<T> c(T result, g43.a cacheEntry) {
        return new v43<>(result, cacheEntry);
    }

    public boolean b() {
        return this.c == null;
    }

    private v43(b53 error) {
        this.d = false;
        this.a = null;
        this.b = null;
        this.c = error;
    }
}
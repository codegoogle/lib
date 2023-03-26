package com.p7700g.p99005;

import java.security.MessageDigest;

/* compiled from: Option.java */
/* loaded from: classes2.dex */
public final class iq1<T> {
    private static final b<Object> a = new a();
    private final T b;
    private final b<T> c;
    private final String d;
    private volatile byte[] e;

    /* compiled from: Option.java */
    /* loaded from: classes2.dex */
    public class a implements b<Object> {
        @Override // com.p7700g.p99005.iq1.b
        public void a(@x1 byte[] bArr, @x1 Object obj, @x1 MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        void a(@x1 byte[] bArr, @x1 T t, @x1 MessageDigest messageDigest);
    }

    private iq1(@x1 String str, @z1 T t, @x1 b<T> bVar) {
        this.d = x02.b(str);
        this.b = t;
        this.c = (b) x02.d(bVar);
    }

    @x1
    public static <T> iq1<T> a(@x1 String str, @x1 b<T> bVar) {
        return new iq1<>(str, null, bVar);
    }

    @x1
    public static <T> iq1<T> b(@x1 String str, @z1 T t, @x1 b<T> bVar) {
        return new iq1<>(str, t, bVar);
    }

    @x1
    private static <T> b<T> c() {
        return (b<T>) a;
    }

    @x1
    private byte[] e() {
        if (this.e == null) {
            this.e = this.d.getBytes(gq1.b);
        }
        return this.e;
    }

    @x1
    public static <T> iq1<T> f(@x1 String str) {
        return new iq1<>(str, null, c());
    }

    @x1
    public static <T> iq1<T> g(@x1 String str, @x1 T t) {
        return new iq1<>(str, t, c());
    }

    @z1
    public T d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof iq1) {
            return this.d.equals(((iq1) obj).d);
        }
        return false;
    }

    public void h(@x1 T t, @x1 MessageDigest messageDigest) {
        this.c.a(e(), t, messageDigest);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        StringBuilder G = wo1.G("Option{key='");
        G.append(this.d);
        G.append('\'');
        G.append('}');
        return G.toString();
    }
}
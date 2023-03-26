package com.p7700g.p99005;

import com.p7700g.p99005.n04;
import com.p7700g.p99005.x04;
import java.io.Serializable;
import java.util.Map;

/* compiled from: AddressNetwork.java */
/* loaded from: classes3.dex */
public abstract class s04<S extends x04> implements Serializable {
    private static final long s = 4;
    private static c t = c.PREFIXED_ZERO_HOSTS_ARE_SUBNETS;

    /* compiled from: AddressNetwork.java */
    /* loaded from: classes3.dex */
    public interface a<S extends x04> {
        S b(int i);

        S c(int i, int i2, Integer num);

        S[] d(int i);

        S e(int i, Integer num);
    }

    /* compiled from: AddressNetwork.java */
    /* loaded from: classes3.dex */
    public static abstract class b<T extends e14> implements Serializable {
        private static final long s = 4;
        public final Map<String, T> t;

        public b() {
            this(null);
        }

        public void a(T t) {
        }

        public boolean b(T t) {
            return this.t.containsValue(t);
        }

        public abstract T c(String str);

        public abstract T d(n04.a aVar);

        public T e(String str) {
            Map<String, T> map = this.t;
            if (map == null) {
                return c(str);
            }
            T t = map.get(str);
            if (t == null) {
                String E0 = c(str).E0();
                T c = c(E0);
                T putIfAbsent = this.t.putIfAbsent(E0, c);
                if (putIfAbsent == null) {
                    a(c);
                } else {
                    c = putIfAbsent;
                }
                if (!E0.equals(str)) {
                    this.t.put(str, c);
                }
                return c;
            }
            return t;
        }

        public abstract T f(byte[] bArr);

        public Map<String, T> g() {
            return this.t;
        }

        public b(Map<String, T> map) {
            this.t = map;
        }
    }

    /* compiled from: AddressNetwork.java */
    /* loaded from: classes3.dex */
    public enum c {
        ALL_PREFIXED_ADDRESSES_ARE_SUBNETS,
        PREFIXED_ZERO_HOSTS_ARE_SUBNETS,
        EXPLICIT_SUBNETS;

        public boolean f() {
            return this == ALL_PREFIXED_ADDRESSES_ARE_SUBNETS;
        }

        public boolean g() {
            return this == EXPLICIT_SUBNETS;
        }

        public boolean h() {
            return this == PREFIXED_ZERO_HOSTS_ARE_SUBNETS;
        }
    }

    public static c h() {
        return t;
    }

    public void f() {
        g().f();
    }

    public abstract d34<?, ?, ?, S> g();

    public abstract c i();

    public boolean m(s04<?> s04Var) {
        return m14.N3(this, s04Var);
    }

    public void n(boolean z) {
        g().G(z);
    }
}
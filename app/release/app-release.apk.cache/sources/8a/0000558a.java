package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.h42;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: EventInternal.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class p42 {

    /* compiled from: EventInternal.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public final a a(String str, int i) {
            e().put(str, String.valueOf(i));
            return this;
        }

        public final a b(String str, long j) {
            e().put(str, String.valueOf(j));
            return this;
        }

        public final a c(String str, String str2) {
            e().put(str, str2);
            return this;
        }

        public abstract p42 d();

        public abstract Map<String, String> e();

        public abstract a f(Map<String, String> map);

        public abstract a g(Integer num);

        public abstract a h(o42 o42Var);

        public abstract a i(long j);

        public abstract a j(String str);

        public abstract a k(long j);
    }

    public static a a() {
        return new h42.b().f(new HashMap());
    }

    public final String b(String str) {
        String str2 = c().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> c();

    @z1
    public abstract Integer d();

    public abstract o42 e();

    public abstract long f();

    public final int g(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long h(String str) {
        String str2 = c().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final Map<String, String> i() {
        return Collections.unmodifiableMap(c());
    }

    public final String j(String str, String str2) {
        String str3 = c().get(str);
        return str3 == null ? str2 : str3;
    }

    @Deprecated
    public byte[] k() {
        return e().a();
    }

    public abstract String l();

    public abstract long m();

    public a n() {
        return new h42.b().j(l()).g(d()).h(e()).i(f()).k(m()).f(new HashMap(c()));
    }
}
package com.p7700g.p99005;

import android.util.Base64;
import com.google.auto.value.AutoValue;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.j42;

/* compiled from: TransportContext.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class v42 {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        public abstract v42 a();

        public abstract a b(String str);

        public abstract a c(@z1 byte[] bArr);

        @i2({i2.a.LIBRARY})
        public abstract a d(d32 d32Var);
    }

    public static a a() {
        return new j42.b().d(d32.DEFAULT);
    }

    public abstract String b();

    @z1
    public abstract byte[] c();

    @i2({i2.a.LIBRARY_GROUP})
    public abstract d32 d();

    @i2({i2.a.LIBRARY})
    public v42 e(d32 d32Var) {
        return a().b(b()).d(d32Var).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
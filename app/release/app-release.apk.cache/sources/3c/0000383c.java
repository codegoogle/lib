package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.u32;

/* compiled from: ClientInfo.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class a42 {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @x1
        public abstract a42 a();

        @x1
        public abstract a b(@z1 q32 q32Var);

        @x1
        public abstract a c(@z1 b bVar);
    }

    /* compiled from: ClientInfo.java */
    /* loaded from: classes2.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int v;

        b(int i) {
            this.v = i;
        }
    }

    @x1
    public static a a() {
        return new u32.b();
    }

    @z1
    public abstract q32 b();

    @z1
    public abstract b c();
}
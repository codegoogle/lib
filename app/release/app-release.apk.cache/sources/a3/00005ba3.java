package com.p7700g.p99005;

import com.p7700g.p99005.i2;

/* compiled from: InputMergerFactory.java */
/* loaded from: classes.dex */
public abstract class sb0 {

    /* compiled from: InputMergerFactory.java */
    /* loaded from: classes.dex */
    public class a extends sb0 {
        @Override // com.p7700g.p99005.sb0
        @z1
        public rb0 a(@x1 String className) {
            return null;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static sb0 c() {
        return new a();
    }

    @z1
    public abstract rb0 a(@x1 String className);

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public final rb0 b(@x1 String className) {
        rb0 a2 = a(className);
        return a2 == null ? rb0.a(className) : a2;
    }
}
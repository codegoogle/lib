package com.p7700g.p99005;

import com.google.auto.value.AutoValue;
import com.p7700g.p99005.w32;
import com.p7700g.p99005.yp2;
import java.util.List;

/* compiled from: LogRequest.java */
@AutoValue
/* loaded from: classes2.dex */
public abstract class c42 {

    /* compiled from: LogRequest.java */
    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class a {
        @x1
        public abstract c42 a();

        @x1
        public abstract a b(@z1 a42 a42Var);

        @x1
        public abstract a c(@z1 List<b42> list);

        @x1
        public abstract a d(@z1 Integer num);

        @x1
        public abstract a e(@z1 String str);

        @x1
        public abstract a f(@z1 f42 f42Var);

        @x1
        public abstract a g(long j);

        @x1
        public abstract a h(long j);

        @x1
        public a i(int i) {
            return d(Integer.valueOf(i));
        }

        @x1
        public a j(@x1 String str) {
            return e(str);
        }
    }

    @x1
    public static a a() {
        return new w32.b();
    }

    @z1
    public abstract a42 b();

    @yp2.a(name = "logEvent")
    @z1
    public abstract List<b42> c();

    @z1
    public abstract Integer d();

    @z1
    public abstract String e();

    @z1
    public abstract f42 f();

    public abstract long g();

    public abstract long h();
}
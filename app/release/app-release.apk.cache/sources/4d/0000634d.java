package com.p7700g.p99005;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;

/* compiled from: Operation.java */
/* loaded from: classes.dex */
public interface wb0 {
    @i2({i2.a.LIBRARY_GROUP})
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c();
    @i2({i2.a.LIBRARY_GROUP})
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C0264b b = new b.C0264b();

    /* compiled from: Operation.java */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class a extends b {
            private final Throwable a;

            public a(@x1 Throwable exception) {
                this.a = exception;
            }

            @x1
            public Throwable a() {
                return this.a;
            }

            @x1
            public String toString() {
                return String.format("FAILURE (%s)", this.a.getMessage());
            }
        }

        /* compiled from: Operation.java */
        /* renamed from: com.p7700g.p99005.wb0$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0264b extends b {
            @x1
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0264b() {
            }
        }

        /* compiled from: Operation.java */
        /* loaded from: classes.dex */
        public static final class c extends b {
            @x1
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }
    }

    @x1
    gn2<b.c> a();

    @x1
    LiveData<b> getState();
}
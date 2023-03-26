package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: EncoderRegistry.java */
/* loaded from: classes2.dex */
public class ly1 {
    private final List<a<?>> a = new ArrayList();

    /* compiled from: EncoderRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a<T> {
        private final Class<T> a;
        public final dq1<T> b;

        public a(@x1 Class<T> cls, @x1 dq1<T> dq1Var) {
            this.a = cls;
            this.b = dq1Var;
        }

        public boolean a(@x1 Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(@x1 Class<T> cls, @x1 dq1<T> dq1Var) {
        this.a.add(new a<>(cls, dq1Var));
    }

    @z1
    public synchronized <T> dq1<T> b(@x1 Class<T> cls) {
        for (a<?> aVar : this.a) {
            if (aVar.a(cls)) {
                return (dq1<T>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <T> void c(@x1 Class<T> cls, @x1 dq1<T> dq1Var) {
        this.a.add(0, new a<>(cls, dq1Var));
    }
}
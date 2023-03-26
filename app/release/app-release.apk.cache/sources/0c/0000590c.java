package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: ResourceEncoderRegistry.java */
/* loaded from: classes2.dex */
public class qy1 {
    private final List<a<?>> a = new ArrayList();

    /* compiled from: ResourceEncoderRegistry.java */
    /* loaded from: classes2.dex */
    public static final class a<T> {
        private final Class<T> a;
        public final mq1<T> b;

        public a(@x1 Class<T> cls, @x1 mq1<T> mq1Var) {
            this.a = cls;
            this.b = mq1Var;
        }

        public boolean a(@x1 Class<?> cls) {
            return this.a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(@x1 Class<Z> cls, @x1 mq1<Z> mq1Var) {
        this.a.add(new a<>(cls, mq1Var));
    }

    @z1
    public synchronized <Z> mq1<Z> b(@x1 Class<Z> cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.a.get(i);
            if (aVar.a(cls)) {
                return (mq1<Z>) aVar.b;
            }
        }
        return null;
    }

    public synchronized <Z> void c(@x1 Class<Z> cls, @x1 mq1<Z> mq1Var) {
        this.a.add(0, new a<>(cls, mq1Var));
    }
}
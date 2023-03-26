package com.p7700g.p99005;

import java.util.Comparator;

/* compiled from: PriorityUtil.java */
/* loaded from: classes3.dex */
public class hx3 {
    public static final int a = 100;
    public static final a b = new a();

    /* compiled from: PriorityUtil.java */
    /* loaded from: classes3.dex */
    public static final class a implements Comparator {
        private int a(Object obj) {
            gx3 gx3Var = (gx3) obj.getClass().getAnnotation(gx3.class);
            if (gx3Var == null) {
                return 100;
            }
            return gx3Var.value();
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return a(obj2) - a(obj);
        }
    }

    /* compiled from: PriorityUtil.java */
    /* loaded from: classes3.dex */
    public static class b implements Comparator<Class<?>> {
        private int b(Class<?> cls) {
            gx3 gx3Var = (gx3) cls.getAnnotation(gx3.class);
            if (gx3Var == null) {
                return 100;
            }
            return gx3Var.value();
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Class<?> cls, Class<?> cls2) {
            return b(cls2) - b(cls);
        }
    }
}
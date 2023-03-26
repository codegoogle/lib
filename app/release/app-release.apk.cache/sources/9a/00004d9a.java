package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.util.List;

/* compiled from: InjectableProviderContext.java */
/* loaded from: classes3.dex */
public interface ky3 {

    /* compiled from: InjectableProviderContext.java */
    /* loaded from: classes3.dex */
    public static final class a {
        public final iy3 a;
        public final rv3 b;

        public a(iy3 iy3Var, rv3 rv3Var) {
            this.a = iy3Var;
            this.b = rv3Var;
        }
    }

    boolean a(Class<? extends Annotation> cls, Class<?> cls2, rv3 rv3Var);

    <A extends Annotation, C> a b(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c, List<rv3> list);

    <A extends Annotation, C> iy3 c(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c, List<rv3> list);

    boolean d(Class<? extends Annotation> cls, Class<?> cls2);

    <A extends Annotation, C> iy3 e(Class<? extends Annotation> cls, mv3 mv3Var, A a2, C c, rv3 rv3Var);
}
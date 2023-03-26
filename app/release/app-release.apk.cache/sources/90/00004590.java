package com.p7700g.p99005;

import com.p7700g.p99005.lz5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: BuiltInConverters.java */
/* loaded from: classes4.dex */
public final class gz5 extends lz5.a {
    private boolean a = true;

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class a implements lz5<kr5, kr5> {
        public static final a a = new a();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public kr5 a(kr5 kr5Var) throws IOException {
            try {
                return c06.a(kr5Var);
            } finally {
                kr5Var.close();
            }
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class b implements lz5<ir5, ir5> {
        public static final b a = new b();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public ir5 a(ir5 ir5Var) {
            return ir5Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class c implements lz5<kr5, kr5> {
        public static final c a = new c();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public kr5 a(kr5 kr5Var) {
            return kr5Var;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class d implements lz5<Object, String> {
        public static final d a = new d();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class e implements lz5<kr5, yq4> {
        public static final e a = new e();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public yq4 a(kr5 kr5Var) {
            kr5Var.close();
            return yq4.a;
        }
    }

    /* compiled from: BuiltInConverters.java */
    /* loaded from: classes4.dex */
    public static final class f implements lz5<kr5, Void> {
        public static final f a = new f();

        @Override // com.p7700g.p99005.lz5
        /* renamed from: b */
        public Void a(kr5 kr5Var) {
            kr5Var.close();
            return null;
        }
    }

    @Override // com.p7700g.p99005.lz5.a
    @Nullable
    public lz5<?, ir5> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, yz5 yz5Var) {
        if (ir5.class.isAssignableFrom(c06.h(type))) {
            return b.a;
        }
        return null;
    }

    @Override // com.p7700g.p99005.lz5.a
    @Nullable
    public lz5<kr5, ?> d(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        if (type == kr5.class) {
            if (c06.l(annotationArr, h16.class)) {
                return c.a;
            }
            return a.a;
        } else if (type == Void.class) {
            return f.a;
        } else {
            if (this.a && type == yq4.class) {
                try {
                    return e.a;
                } catch (NoClassDefFoundError unused) {
                    this.a = false;
                    return null;
                }
            }
            return null;
        }
    }
}
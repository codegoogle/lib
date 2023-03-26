package com.p7700g.p99005;

import com.p7700g.p99005.c06;
import com.p7700g.p99005.hq5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: HttpServiceMethod.java */
/* loaded from: classes4.dex */
public abstract class oz5<ResponseT, ReturnT> extends zz5<ReturnT> {
    private final wz5 a;
    private final hq5.a b;
    private final lz5<kr5, ResponseT> c;

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class a<ResponseT, ReturnT> extends oz5<ResponseT, ReturnT> {
        private final iz5<ResponseT, ReturnT> d;

        public a(wz5 wz5Var, hq5.a aVar, lz5<kr5, ResponseT> lz5Var, iz5<ResponseT, ReturnT> iz5Var) {
            super(wz5Var, aVar, lz5Var);
            this.d = iz5Var;
        }

        @Override // com.p7700g.p99005.oz5
        public ReturnT c(hz5<ResponseT> hz5Var, Object[] objArr) {
            return this.d.b(hz5Var);
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class b<ResponseT> extends oz5<ResponseT, Object> {
        private final iz5<ResponseT, hz5<ResponseT>> d;
        private final boolean e;

        public b(wz5 wz5Var, hq5.a aVar, lz5<kr5, ResponseT> lz5Var, iz5<ResponseT, hz5<ResponseT>> iz5Var, boolean z) {
            super(wz5Var, aVar, lz5Var);
            this.d = iz5Var;
            this.e = z;
        }

        @Override // com.p7700g.p99005.oz5
        public Object c(hz5<ResponseT> hz5Var, Object[] objArr) {
            hz5<ResponseT> b = this.d.b(hz5Var);
            uv4 uv4Var = (uv4) objArr[objArr.length - 1];
            try {
                if (this.e) {
                    return qz5.b(b, uv4Var);
                }
                return qz5.a(b, uv4Var);
            } catch (Exception e) {
                return qz5.e(e, uv4Var);
            }
        }
    }

    /* compiled from: HttpServiceMethod.java */
    /* loaded from: classes4.dex */
    public static final class c<ResponseT> extends oz5<ResponseT, Object> {
        private final iz5<ResponseT, hz5<ResponseT>> d;

        public c(wz5 wz5Var, hq5.a aVar, lz5<kr5, ResponseT> lz5Var, iz5<ResponseT, hz5<ResponseT>> iz5Var) {
            super(wz5Var, aVar, lz5Var);
            this.d = iz5Var;
        }

        @Override // com.p7700g.p99005.oz5
        public Object c(hz5<ResponseT> hz5Var, Object[] objArr) {
            hz5<ResponseT> b = this.d.b(hz5Var);
            uv4 uv4Var = (uv4) objArr[objArr.length - 1];
            try {
                return qz5.c(b, uv4Var);
            } catch (Exception e) {
                return qz5.e(e, uv4Var);
            }
        }
    }

    public oz5(wz5 wz5Var, hq5.a aVar, lz5<kr5, ResponseT> lz5Var) {
        this.a = wz5Var;
        this.b = aVar;
        this.c = lz5Var;
    }

    private static <ResponseT, ReturnT> iz5<ResponseT, ReturnT> d(yz5 yz5Var, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (iz5<ResponseT, ReturnT>) yz5Var.b(type, annotationArr);
        } catch (RuntimeException e) {
            throw c06.n(method, e, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> lz5<kr5, ResponseT> e(yz5 yz5Var, Method method, Type type) {
        try {
            return yz5Var.n(type, method.getAnnotations());
        } catch (RuntimeException e) {
            throw c06.n(method, e, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> oz5<ResponseT, ReturnT> f(yz5 yz5Var, Method method, wz5 wz5Var) {
        Type genericReturnType;
        boolean z;
        boolean z2 = wz5Var.k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f = c06.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (c06.h(f) == xz5.class && (f instanceof ParameterizedType)) {
                f = c06.g(0, (ParameterizedType) f);
                z = true;
            } else {
                z = false;
            }
            genericReturnType = new c06.b(null, hz5.class, f);
            annotations = b06.a(annotations);
        } else {
            genericReturnType = method.getGenericReturnType();
            z = false;
        }
        iz5 d = d(yz5Var, method, genericReturnType, annotations);
        Type a2 = d.a();
        if (a2 != jr5.class) {
            if (a2 != xz5.class) {
                if (wz5Var.c.equals("HEAD") && !Void.class.equals(a2)) {
                    throw c06.m(method, "HEAD method must use Void as response type.", new Object[0]);
                }
                lz5 e = e(yz5Var, method, a2);
                hq5.a aVar = yz5Var.b;
                if (z2) {
                    if (z) {
                        return new c(wz5Var, aVar, e, d);
                    }
                    return new b(wz5Var, aVar, e, d, false);
                }
                return new a(wz5Var, aVar, e, d);
            }
            throw c06.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        }
        StringBuilder G = wo1.G("'");
        G.append(c06.h(a2).getName());
        G.append("' is not a valid response body type. Did you mean ResponseBody?");
        throw c06.m(method, G.toString(), new Object[0]);
    }

    @Override // com.p7700g.p99005.zz5
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new rz5(this.a, objArr, this.b, this.c), objArr);
    }

    @Nullable
    public abstract ReturnT c(hz5<ResponseT> hz5Var, Object[] objArr);
}
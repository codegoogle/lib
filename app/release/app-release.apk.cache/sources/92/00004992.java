package com.p7700g.p99005;

import com.p7700g.p99005.i06;
import com.p7700g.p99005.lz5;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;

/* compiled from: ScalarsConverterFactory.java */
/* loaded from: classes4.dex */
public final class j06 extends lz5.a {
    private j06() {
    }

    public static j06 f() {
        return new j06();
    }

    @Override // com.p7700g.p99005.lz5.a
    @Nullable
    public lz5<?, ir5> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, yz5 yz5Var) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return h06.a;
        }
        return null;
    }

    @Override // com.p7700g.p99005.lz5.a
    @Nullable
    public lz5<kr5, ?> d(Type type, Annotation[] annotationArr, yz5 yz5Var) {
        if (type == String.class) {
            return i06.i.a;
        }
        if (type != Boolean.class && type != Boolean.TYPE) {
            if (type != Byte.class && type != Byte.TYPE) {
                if (type != Character.class && type != Character.TYPE) {
                    if (type != Double.class && type != Double.TYPE) {
                        if (type != Float.class && type != Float.TYPE) {
                            if (type != Integer.class && type != Integer.TYPE) {
                                if (type != Long.class && type != Long.TYPE) {
                                    if (type == Short.class || type == Short.TYPE) {
                                        return i06.h.a;
                                    }
                                    return null;
                                }
                                return i06.g.a;
                            }
                            return i06.f.a;
                        }
                        return i06.e.a;
                    }
                    return i06.d.a;
                }
                return i06.c.a;
            }
            return i06.b.a;
        }
        return i06.a.a;
    }
}
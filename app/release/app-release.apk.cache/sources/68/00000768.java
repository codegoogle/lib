package com.anythink.expressad.atsignalcommon.b;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    public interface a {
    }

    /* renamed from: com.anythink.expressad.atsignalcommon.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0056b<T> implements InvocationHandler {
        private T a;

        private T a() {
            return this.a;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                return method.invoke(this.a, objArr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                throw e3.getTargetException();
            }
        }

        public final void a(T t) {
            this.a = t;
        }
    }

    private b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> T a(Object obj, Class<T> cls, AbstractC0056b<T> abstractC0056b) {
        if (obj instanceof a) {
            return obj;
        }
        abstractC0056b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls, a.class}, abstractC0056b);
    }

    public static <T> T a(Object obj, AbstractC0056b<T> abstractC0056b, Class<?>... clsArr) {
        abstractC0056b.a(obj);
        return (T) Proxy.newProxyInstance(b.class.getClassLoader(), clsArr, abstractC0056b);
    }
}
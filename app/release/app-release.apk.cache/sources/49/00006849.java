package com.p7700g.p99005;

import com.p7700g.p99005.gz5;
import com.p7700g.p99005.hq5;
import com.p7700g.p99005.iz5;
import com.p7700g.p99005.lz5;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: Retrofit.java */
/* loaded from: classes4.dex */
public final class yz5 {
    private final Map<Method, zz5<?>> a = new ConcurrentHashMap();
    public final hq5.a b;
    public final zq5 c;
    public final List<lz5.a> d;
    public final List<iz5.a> e;
    @Nullable
    public final Executor f;
    public final boolean g;

    /* compiled from: Retrofit.java */
    /* loaded from: classes4.dex */
    public class a implements InvocationHandler {
        private final uz5 a = uz5.g();
        private final Object[] b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.b;
            }
            if (this.a.i(method)) {
                return this.a.h(method, this.c, obj, objArr);
            }
            return yz5.this.h(method).a(objArr);
        }
    }

    public yz5(hq5.a aVar, zq5 zq5Var, List<lz5.a> list, List<iz5.a> list2, @Nullable Executor executor, boolean z) {
        this.b = aVar;
        this.c = zq5Var;
        this.d = list;
        this.e = list2;
        this.f = executor;
        this.g = z;
    }

    private void p(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.g) {
                uz5 g = uz5.g();
                for (Method method : cls.getDeclaredMethods()) {
                    if (!g.i(method) && !Modifier.isStatic(method.getModifiers())) {
                        h(method);
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public zq5 a() {
        return this.c;
    }

    public iz5<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<iz5.a> c() {
        return this.e;
    }

    public hq5.a d() {
        return this.b;
    }

    @Nullable
    public Executor e() {
        return this.f;
    }

    public List<lz5.a> f() {
        return this.d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public zz5<?> h(Method method) {
        zz5<?> zz5Var;
        zz5<?> zz5Var2 = this.a.get(method);
        if (zz5Var2 != null) {
            return zz5Var2;
        }
        synchronized (this.a) {
            zz5Var = this.a.get(method);
            if (zz5Var == null) {
                zz5Var = zz5.b(this, method);
                this.a.put(method, zz5Var);
            }
        }
        return zz5Var;
    }

    public b i() {
        return new b(this);
    }

    public iz5<?, ?> j(@Nullable iz5.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(aVar) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            iz5<?, ?> a2 = this.e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> lz5<T, ir5> k(@Nullable lz5.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            lz5<T, ir5> lz5Var = (lz5<T, ir5>) this.d.get(i).c(type, annotationArr, annotationArr2, this);
            if (lz5Var != null) {
                return lz5Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> lz5<kr5, T> l(@Nullable lz5.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(aVar) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            lz5<kr5, T> lz5Var = (lz5<kr5, T>) this.d.get(i).d(type, annotationArr, this);
            if (lz5Var != null) {
                return lz5Var;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> lz5<T, ir5> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> lz5<kr5, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> lz5<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            lz5<T, String> lz5Var = (lz5<T, String>) this.d.get(i).e(type, annotationArr, this);
            if (lz5Var != null) {
                return lz5Var;
            }
        }
        return gz5.d.a;
    }

    /* compiled from: Retrofit.java */
    /* loaded from: classes4.dex */
    public static final class b {
        private final uz5 a;
        @Nullable
        private hq5.a b;
        @Nullable
        private zq5 c;
        private final List<lz5.a> d;
        private final List<iz5.a> e;
        @Nullable
        private Executor f;
        private boolean g;

        public b(uz5 uz5Var) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.a = uz5Var;
        }

        public b a(iz5.a aVar) {
            List<iz5.a> list = this.e;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(lz5.a aVar) {
            List<lz5.a> list = this.d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(zq5.C(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(zq5.C(url.toString()));
        }

        public b e(zq5 zq5Var) {
            Objects.requireNonNull(zq5Var, "baseUrl == null");
            List<String> L = zq5Var.L();
            if ("".equals(L.get(L.size() - 1))) {
                this.c = zq5Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + zq5Var);
        }

        public yz5 f() {
            if (this.c != null) {
                hq5.a aVar = this.b;
                if (aVar == null) {
                    aVar = new fr5();
                }
                hq5.a aVar2 = aVar;
                Executor executor = this.f;
                if (executor == null) {
                    executor = this.a.c();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.e);
                arrayList.addAll(this.a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.a.e() + this.d.size() + 1);
                arrayList2.add(new gz5());
                arrayList2.addAll(this.d);
                arrayList2.addAll(this.a.d());
                return new yz5(aVar2, this.c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        public List<iz5.a> g() {
            return this.e;
        }

        public b h(hq5.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.b = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f = executor;
            return this;
        }

        public b j(fr5 fr5Var) {
            Objects.requireNonNull(fr5Var, "client == null");
            return h(fr5Var);
        }

        public List<lz5.a> k() {
            return this.d;
        }

        public b l(boolean z) {
            this.g = z;
            return this;
        }

        public b() {
            this(uz5.g());
        }

        public b(yz5 yz5Var) {
            this.d = new ArrayList();
            this.e = new ArrayList();
            uz5 g = uz5.g();
            this.a = g;
            this.b = yz5Var.b;
            this.c = yz5Var.c;
            int size = yz5Var.d.size() - g.e();
            for (int i = 1; i < size; i++) {
                this.d.add(yz5Var.d.get(i));
            }
            int size2 = yz5Var.e.size() - this.a.b();
            for (int i2 = 0; i2 < size2; i2++) {
                this.e.add(yz5Var.e.get(i2));
            }
            this.f = yz5Var.f;
            this.g = yz5Var.g;
        }
    }
}
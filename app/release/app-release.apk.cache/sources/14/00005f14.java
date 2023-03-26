package com.p7700g.p99005;

import com.p7700g.p99005.cr5;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: ParameterHandler.java */
/* loaded from: classes4.dex */
public abstract class tz5<T> {

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public class a extends tz5<Iterable<T>> {
        public a() {
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable Iterable<T> iterable) throws IOException {
            if (iterable == null) {
                return;
            }
            for (T t : iterable) {
                tz5.this.a(vz5Var, t);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public class b extends tz5<Object> {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable Object obj) throws IOException {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                tz5.this.a(vz5Var, Array.get(obj, i));
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class c<T> extends tz5<T> {
        private final Method a;
        private final int b;
        private final lz5<T, ir5> c;

        public c(Method method, int i, lz5<T, ir5> lz5Var) {
            this.a = method;
            this.b = i;
            this.c = lz5Var;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) {
            if (t != null) {
                try {
                    vz5Var.l(this.c.a(t));
                    return;
                } catch (IOException e) {
                    Method method = this.a;
                    int i = this.b;
                    throw c06.p(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw c06.o(this.a, this.b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class d<T> extends tz5<T> {
        private final String a;
        private final lz5<T, String> b;
        private final boolean c;

        public d(String str, lz5<T, String> lz5Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = lz5Var;
            this.c = z;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            vz5Var.a(this.a, a, this.c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class e<T> extends tz5<Map<String, T>> {
        private final Method a;
        private final int b;
        private final lz5<T, String> c;
        private final boolean d;

        public e(Method method, int i, lz5<T, String> lz5Var, boolean z) {
            this.a = method;
            this.b = i;
            this.c = lz5Var;
            this.d = z;
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a = this.c.a(value);
                            if (a != null) {
                                vz5Var.a(key, a, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw c06.o(method, i, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            throw c06.o(this.a, this.b, wo1.u("Field map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw c06.o(this.a, this.b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw c06.o(this.a, this.b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class f<T> extends tz5<T> {
        private final String a;
        private final lz5<T, String> b;

        public f(String str, lz5<T, String> lz5Var) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = lz5Var;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            vz5Var.b(this.a, a);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class g<T> extends tz5<Map<String, T>> {
        private final Method a;
        private final int b;
        private final lz5<T, String> c;

        public g(Method method, int i, lz5<T, String> lz5Var) {
            this.a = method;
            this.b = i;
            this.c = lz5Var;
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            vz5Var.b(key, this.c.a(value));
                        } else {
                            throw c06.o(this.a, this.b, wo1.u("Header map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw c06.o(this.a, this.b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw c06.o(this.a, this.b, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class h extends tz5<yq5> {
        private final Method a;
        private final int b;

        public h(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable yq5 yq5Var) {
            if (yq5Var != null) {
                vz5Var.c(yq5Var);
                return;
            }
            throw c06.o(this.a, this.b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class i<T> extends tz5<T> {
        private final Method a;
        private final int b;
        private final yq5 c;
        private final lz5<T, ir5> d;

        public i(Method method, int i, yq5 yq5Var, lz5<T, ir5> lz5Var) {
            this.a = method;
            this.b = i;
            this.c = yq5Var;
            this.d = lz5Var;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                vz5Var.d(this.c, this.d.a(t));
            } catch (IOException e) {
                Method method = this.a;
                int i = this.b;
                throw c06.o(method, i, "Unable to convert " + t + " to RequestBody", e);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class j<T> extends tz5<Map<String, T>> {
        private final Method a;
        private final int b;
        private final lz5<T, ir5> c;
        private final String d;

        public j(Method method, int i, lz5<T, ir5> lz5Var, String str) {
            this.a = method;
            this.b = i;
            this.c = lz5Var;
            this.d = str;
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            vz5Var.d(yq5.o("Content-Disposition", wo1.u("form-data; name=\"", key, "\""), "Content-Transfer-Encoding", this.d), this.c.a(value));
                        } else {
                            throw c06.o(this.a, this.b, wo1.u("Part map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw c06.o(this.a, this.b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw c06.o(this.a, this.b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class k<T> extends tz5<T> {
        private final Method a;
        private final int b;
        private final String c;
        private final lz5<T, String> d;
        private final boolean e;

        public k(Method method, int i, String str, lz5<T, String> lz5Var, boolean z) {
            this.a = method;
            this.b = i;
            Objects.requireNonNull(str, "name == null");
            this.c = str;
            this.d = lz5Var;
            this.e = z;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) throws IOException {
            if (t != null) {
                vz5Var.f(this.c, this.d.a(t), this.e);
                return;
            }
            throw c06.o(this.a, this.b, wo1.C(wo1.G("Path parameter \""), this.c, "\" value must not be null."), new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class l<T> extends tz5<T> {
        private final String a;
        private final lz5<T, String> b;
        private final boolean c;

        public l(String str, lz5<T, String> lz5Var, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.a = str;
            this.b = lz5Var;
            this.c = z;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) throws IOException {
            String a;
            if (t == null || (a = this.b.a(t)) == null) {
                return;
            }
            vz5Var.g(this.a, a, this.c);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class m<T> extends tz5<Map<String, T>> {
        private final Method a;
        private final int b;
        private final lz5<T, String> c;
        private final boolean d;

        public m(Method method, int i, lz5<T, String> lz5Var, boolean z) {
            this.a = method;
            this.b = i;
            this.c = lz5Var;
            this.d = z;
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key != null) {
                        T value = entry.getValue();
                        if (value != null) {
                            String a = this.c.a(value);
                            if (a != null) {
                                vz5Var.g(key, a, this.d);
                            } else {
                                Method method = this.a;
                                int i = this.b;
                                throw c06.o(method, i, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                            }
                        } else {
                            throw c06.o(this.a, this.b, wo1.u("Query map contained null value for key '", key, "'."), new Object[0]);
                        }
                    } else {
                        throw c06.o(this.a, this.b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw c06.o(this.a, this.b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class n<T> extends tz5<T> {
        private final lz5<T, String> a;
        private final boolean b;

        public n(lz5<T, String> lz5Var, boolean z) {
            this.a = lz5Var;
            this.b = z;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) throws IOException {
            if (t == null) {
                return;
            }
            vz5Var.g(this.a.a(t), null, this.b);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class o extends tz5<cr5.c> {
        public static final o a = new o();

        private o() {
        }

        @Override // com.p7700g.p99005.tz5
        /* renamed from: d */
        public void a(vz5 vz5Var, @Nullable cr5.c cVar) {
            if (cVar != null) {
                vz5Var.e(cVar);
            }
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class p extends tz5<Object> {
        private final Method a;
        private final int b;

        public p(Method method, int i) {
            this.a = method;
            this.b = i;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable Object obj) {
            if (obj != null) {
                vz5Var.m(obj);
                return;
            }
            throw c06.o(this.a, this.b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler.java */
    /* loaded from: classes4.dex */
    public static final class q<T> extends tz5<T> {
        public final Class<T> a;

        public q(Class<T> cls) {
            this.a = cls;
        }

        @Override // com.p7700g.p99005.tz5
        public void a(vz5 vz5Var, @Nullable T t) {
            vz5Var.h(this.a, t);
        }
    }

    public abstract void a(vz5 vz5Var, @Nullable T t) throws IOException;

    public final tz5<Object> b() {
        return new b();
    }

    public final tz5<Iterable<T>> c() {
        return new a();
    }
}
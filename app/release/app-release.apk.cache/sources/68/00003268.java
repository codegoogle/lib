package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.TypeAdapters;
import com.p7700g.p99005.ax2;
import com.p7700g.p99005.cx2;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.ex2;
import com.p7700g.p99005.fw2;
import com.p7700g.p99005.fx2;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.gw2;
import com.p7700g.p99005.hw2;
import com.p7700g.p99005.iw2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.jx2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.nv2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.ov2;
import com.p7700g.p99005.pv2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qv2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rx2;
import com.p7700g.p99005.sw2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.vv2;
import com.p7700g.p99005.wv2;
import com.p7700g.p99005.ww2;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes3.dex */
public final class Gson {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final boolean c = false;
    public static final boolean d = true;
    public static final boolean e = false;
    public static final boolean f = false;
    public static final boolean g = false;
    public static final boolean h = true;
    public static final String i = null;
    public static final ov2 j = nv2.s;
    public static final iw2 k = hw2.s;
    public static final iw2 l = hw2.t;
    private static final lx2<?> m = lx2.b(Object.class);
    private static final String n = ")]}'\n";
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final String E;
    public final int F;
    public final int G;
    public final fw2 H;
    public final List<jw2> I;
    public final List<jw2> J;
    public final iw2 K;
    public final iw2 L;
    public final List<gw2> M;
    private final ThreadLocal<Map<lx2<?>, FutureTypeAdapter<?>>> o;
    private final Map<lx2<?>, TypeAdapter<?>> p;
    private final sw2 q;
    private final JsonAdapterAnnotationTypeAdapterFactory r;
    public final List<jw2> s;
    public final Excluder t;
    public final ov2 u;
    public final Map<Type, qv2<?>> v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* loaded from: classes3.dex */
    public static class FutureTypeAdapter<T> extends TypeAdapter<T> {
        private TypeAdapter<T> a;

        public void a(TypeAdapter<T> typeAdapter) {
            if (this.a == null) {
                this.a = typeAdapter;
                return;
            }
            throw new AssertionError();
        }

        @Override // com.google.gson.TypeAdapter
        public T read(nx2 nx2Var) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                return typeAdapter.read(nx2Var);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.TypeAdapter
        public void write(qx2 qx2Var, T t) throws IOException {
            TypeAdapter<T> typeAdapter = this.a;
            if (typeAdapter != null) {
                typeAdapter.write(qx2Var, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson() {
        this(Excluder.t, j, Collections.emptyMap(), false, false, false, true, false, false, false, true, fw2.s, i, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), k, l, Collections.emptyList());
    }

    private static void a(Object obj, nx2 nx2Var) {
        if (obj != null) {
            try {
                if (nx2Var.Y() == px2.END_DOCUMENT) {
                    return;
                }
                throw new ew2("JSON document was not fully consumed.");
            } catch (rx2 e2) {
                throw new ew2(e2);
            } catch (IOException e3) {
                throw new vv2(e3);
            }
        }
    }

    private static TypeAdapter<AtomicLong> b(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLong>() { // from class: com.google.gson.Gson.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLong read(nx2 nx2Var) throws IOException {
                return new AtomicLong(((Number) TypeAdapter.this.read(nx2Var)).longValue());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, AtomicLong atomicLong) throws IOException {
                TypeAdapter.this.write(qx2Var, Long.valueOf(atomicLong.get()));
            }
        }.nullSafe();
    }

    private static TypeAdapter<AtomicLongArray> c(final TypeAdapter<Number> typeAdapter) {
        return new TypeAdapter<AtomicLongArray>() { // from class: com.google.gson.Gson.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicLongArray read(nx2 nx2Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                nx2Var.a();
                while (nx2Var.q()) {
                    arrayList.add(Long.valueOf(((Number) TypeAdapter.this.read(nx2Var)).longValue()));
                }
                nx2Var.h();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, AtomicLongArray atomicLongArray) throws IOException {
                qx2Var.d();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    TypeAdapter.this.write(qx2Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                qx2Var.h();
            }
        }.nullSafe();
    }

    public static void d(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    private TypeAdapter<Number> e(boolean z) {
        if (z) {
            return TypeAdapters.v;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Double read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Double.valueOf(nx2Var.z());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                if (number == null) {
                    qx2Var.w();
                    return;
                }
                Gson.d(number.doubleValue());
                qx2Var.c1(number);
            }
        };
    }

    private TypeAdapter<Number> h(boolean z) {
        if (z) {
            return TypeAdapters.u;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Float read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Float.valueOf((float) nx2Var.z());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                if (number == null) {
                    qx2Var.w();
                    return;
                }
                Gson.d(number.floatValue());
                qx2Var.c1(number);
            }
        };
    }

    private static TypeAdapter<Number> t(fw2 fw2Var) {
        if (fw2Var == fw2.s) {
            return TypeAdapters.t;
        }
        return new TypeAdapter<Number>() { // from class: com.google.gson.Gson.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Long.valueOf(nx2Var.E());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                if (number == null) {
                    qx2Var.w();
                } else {
                    qx2Var.d1(number.toString());
                }
            }
        };
    }

    public String A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    public void B(uv2 uv2Var, qx2 qx2Var) throws vv2 {
        boolean m2 = qx2Var.m();
        qx2Var.U(true);
        boolean l2 = qx2Var.l();
        qx2Var.K(this.z);
        boolean k2 = qx2Var.k();
        qx2Var.W(this.w);
        try {
            try {
                cx2.b(uv2Var, qx2Var);
            } catch (IOException e2) {
                throw new vv2(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            qx2Var.U(m2);
            qx2Var.K(l2);
            qx2Var.W(k2);
        }
    }

    public void C(uv2 uv2Var, Appendable appendable) throws vv2 {
        try {
            B(uv2Var, w(cx2.c(appendable)));
        } catch (IOException e2) {
            throw new vv2(e2);
        }
    }

    public void D(Object obj, Appendable appendable) throws vv2 {
        if (obj != null) {
            F(obj, obj.getClass(), appendable);
        } else {
            C(wv2.a, appendable);
        }
    }

    public void E(Object obj, Type type, qx2 qx2Var) throws vv2 {
        TypeAdapter p = p(lx2.c(type));
        boolean m2 = qx2Var.m();
        qx2Var.U(true);
        boolean l2 = qx2Var.l();
        qx2Var.K(this.z);
        boolean k2 = qx2Var.k();
        qx2Var.W(this.w);
        try {
            try {
                p.write(qx2Var, obj);
            } catch (IOException e2) {
                throw new vv2(e2);
            } catch (AssertionError e3) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e3.getMessage());
                assertionError.initCause(e3);
                throw assertionError;
            }
        } finally {
            qx2Var.U(m2);
            qx2Var.K(l2);
            qx2Var.W(k2);
        }
    }

    public void F(Object obj, Type type, Appendable appendable) throws vv2 {
        try {
            E(obj, type, w(cx2.c(appendable)));
        } catch (IOException e2) {
            throw new vv2(e2);
        }
    }

    public uv2 G(Object obj) {
        if (obj == null) {
            return wv2.a;
        }
        return H(obj, obj.getClass());
    }

    public uv2 H(Object obj, Type type) {
        fx2 fx2Var = new fx2();
        E(obj, type, fx2Var);
        return fx2Var.K1();
    }

    @Deprecated
    public Excluder f() {
        return this.t;
    }

    public ov2 g() {
        return this.u;
    }

    public <T> T i(uv2 uv2Var, Class<T> cls) throws ew2 {
        return (T) ax2.d(cls).cast(j(uv2Var, cls));
    }

    public <T> T j(uv2 uv2Var, Type type) throws ew2 {
        if (uv2Var == null) {
            return null;
        }
        return (T) k(new ex2(uv2Var), type);
    }

    public <T> T k(nx2 nx2Var, Type type) throws vv2, ew2 {
        boolean r = nx2Var.r();
        boolean z = true;
        nx2Var.d1(true);
        try {
            try {
                try {
                    nx2Var.Y();
                    z = false;
                    T read = p(lx2.c(type)).read(nx2Var);
                    nx2Var.d1(r);
                    return read;
                } catch (EOFException e2) {
                    if (z) {
                        nx2Var.d1(r);
                        return null;
                    }
                    throw new ew2(e2);
                } catch (IOException e3) {
                    throw new ew2(e3);
                }
            } catch (AssertionError e4) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.9.1): " + e4.getMessage());
                assertionError.initCause(e4);
                throw assertionError;
            } catch (IllegalStateException e5) {
                throw new ew2(e5);
            }
        } catch (Throwable th) {
            nx2Var.d1(r);
            throw th;
        }
    }

    public <T> T l(Reader reader, Class<T> cls) throws ew2, vv2 {
        nx2 v = v(reader);
        Object k2 = k(v, cls);
        a(k2, v);
        return (T) ax2.d(cls).cast(k2);
    }

    public <T> T m(Reader reader, Type type) throws vv2, ew2 {
        nx2 v = v(reader);
        T t = (T) k(v, type);
        a(t, v);
        return t;
    }

    public <T> T n(String str, Class<T> cls) throws ew2 {
        return (T) ax2.d(cls).cast(o(str, cls));
    }

    public <T> T o(String str, Type type) throws ew2 {
        if (str == null) {
            return null;
        }
        return (T) m(new StringReader(str), type);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> TypeAdapter<T> p(lx2<T> lx2Var) {
        TypeAdapter<T> typeAdapter = (TypeAdapter<T>) this.p.get(lx2Var == null ? m : lx2Var);
        if (typeAdapter != null) {
            return typeAdapter;
        }
        Map<lx2<?>, FutureTypeAdapter<?>> map = this.o.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap<>();
            this.o.set(map);
            z = true;
        }
        FutureTypeAdapter<?> futureTypeAdapter = map.get(lx2Var);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter<?> futureTypeAdapter2 = new FutureTypeAdapter<>();
            map.put(lx2Var, futureTypeAdapter2);
            for (jw2 jw2Var : this.s) {
                TypeAdapter typeAdapter2 = (TypeAdapter<T>) jw2Var.create(this, lx2Var);
                if (typeAdapter2 != null) {
                    futureTypeAdapter2.a(typeAdapter2);
                    this.p.put(lx2Var, typeAdapter2);
                    return typeAdapter2;
                }
            }
            throw new IllegalArgumentException("GSON (2.9.1) cannot handle " + lx2Var);
        } finally {
            map.remove(lx2Var);
            if (z) {
                this.o.remove();
            }
        }
    }

    public <T> TypeAdapter<T> q(Class<T> cls) {
        return p(lx2.b(cls));
    }

    public <T> TypeAdapter<T> r(jw2 jw2Var, lx2<T> lx2Var) {
        if (!this.s.contains(jw2Var)) {
            jw2Var = this.r;
        }
        boolean z = false;
        for (jw2 jw2Var2 : this.s) {
            if (z) {
                TypeAdapter<T> create = jw2Var2.create(this, lx2Var);
                if (create != null) {
                    return create;
                }
            } else if (jw2Var2 == jw2Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + lx2Var);
    }

    public boolean s() {
        return this.z;
    }

    public String toString() {
        return "{serializeNulls:" + this.w + ",factories:" + this.s + ",instanceCreators:" + this.q + "}";
    }

    public pv2 u() {
        return new pv2(this);
    }

    public nx2 v(Reader reader) {
        nx2 nx2Var = new nx2(reader);
        nx2Var.d1(this.B);
        return nx2Var;
    }

    public qx2 w(Writer writer) throws IOException {
        if (this.y) {
            writer.write(n);
        }
        qx2 qx2Var = new qx2(writer);
        if (this.A) {
            qx2Var.P(g54.A);
        }
        qx2Var.K(this.z);
        qx2Var.U(this.B);
        qx2Var.W(this.w);
        return qx2Var;
    }

    public boolean x() {
        return this.w;
    }

    public String y(uv2 uv2Var) {
        StringWriter stringWriter = new StringWriter();
        C(uv2Var, stringWriter);
        return stringWriter.toString();
    }

    public String z(Object obj) {
        if (obj == null) {
            return y(wv2.a);
        }
        return A(obj, obj.getClass());
    }

    public Gson(Excluder excluder, ov2 ov2Var, Map<Type, qv2<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, fw2 fw2Var, String str, int i2, int i3, List<jw2> list, List<jw2> list2, List<jw2> list3, iw2 iw2Var, iw2 iw2Var2, List<gw2> list4) {
        this.o = new ThreadLocal<>();
        this.p = new ConcurrentHashMap();
        this.t = excluder;
        this.u = ov2Var;
        this.v = map;
        sw2 sw2Var = new sw2(map, z8, list4);
        this.q = sw2Var;
        this.w = z;
        this.x = z2;
        this.y = z3;
        this.z = z4;
        this.A = z5;
        this.B = z6;
        this.C = z7;
        this.D = z8;
        this.H = fw2Var;
        this.E = str;
        this.F = i2;
        this.G = i3;
        this.I = list;
        this.J = list2;
        this.K = iw2Var;
        this.L = iw2Var2;
        this.M = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.W);
        arrayList.add(ObjectTypeAdapter.a(iw2Var));
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.C);
        arrayList.add(TypeAdapters.m);
        arrayList.add(TypeAdapters.g);
        arrayList.add(TypeAdapters.i);
        arrayList.add(TypeAdapters.k);
        TypeAdapter<Number> t = t(fw2Var);
        arrayList.add(TypeAdapters.c(Long.TYPE, Long.class, t));
        arrayList.add(TypeAdapters.c(Double.TYPE, Double.class, e(z7)));
        arrayList.add(TypeAdapters.c(Float.TYPE, Float.class, h(z7)));
        arrayList.add(NumberTypeAdapter.a(iw2Var2));
        arrayList.add(TypeAdapters.o);
        arrayList.add(TypeAdapters.q);
        arrayList.add(TypeAdapters.b(AtomicLong.class, b(t)));
        arrayList.add(TypeAdapters.b(AtomicLongArray.class, c(t)));
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.E);
        arrayList.add(TypeAdapters.G);
        arrayList.add(TypeAdapters.b(BigDecimal.class, TypeAdapters.z));
        arrayList.add(TypeAdapters.b(BigInteger.class, TypeAdapters.A));
        arrayList.add(TypeAdapters.b(ww2.class, TypeAdapters.B));
        arrayList.add(TypeAdapters.I);
        arrayList.add(TypeAdapters.K);
        arrayList.add(TypeAdapters.O);
        arrayList.add(TypeAdapters.Q);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TypeAdapters.M);
        arrayList.add(TypeAdapters.d);
        arrayList.add(DateTypeAdapter.a);
        arrayList.add(TypeAdapters.S);
        if (jx2.a) {
            arrayList.add(jx2.e);
            arrayList.add(jx2.d);
            arrayList.add(jx2.f);
        }
        arrayList.add(ArrayTypeAdapter.a);
        arrayList.add(TypeAdapters.b);
        arrayList.add(new CollectionTypeAdapterFactory(sw2Var));
        arrayList.add(new MapTypeAdapterFactory(sw2Var, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(sw2Var);
        this.r = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.X);
        arrayList.add(new ReflectiveTypeAdapterFactory(sw2Var, ov2Var, excluder, jsonAdapterAnnotationTypeAdapterFactory, list4));
        this.s = Collections.unmodifiableList(arrayList);
    }
}
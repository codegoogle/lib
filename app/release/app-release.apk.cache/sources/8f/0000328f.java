package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.aw2;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.ex2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.mw2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rv2;
import com.p7700g.p99005.uv2;
import com.p7700g.p99005.vv2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.wv2;
import com.p7700g.p99005.ww2;
import com.p7700g.p99005.xv2;
import com.p7700g.p99005.ya2;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes3.dex */
public final class TypeAdapters {
    public static final TypeAdapter<BigInteger> A;
    public static final TypeAdapter<ww2> B;
    public static final jw2 C;
    public static final TypeAdapter<StringBuilder> D;
    public static final jw2 E;
    public static final TypeAdapter<StringBuffer> F;
    public static final jw2 G;
    public static final TypeAdapter<URL> H;
    public static final jw2 I;
    public static final TypeAdapter<URI> J;
    public static final jw2 K;
    public static final TypeAdapter<InetAddress> L;
    public static final jw2 M;
    public static final TypeAdapter<UUID> N;
    public static final jw2 O;
    public static final TypeAdapter<Currency> P;
    public static final jw2 Q;
    public static final TypeAdapter<Calendar> R;
    public static final jw2 S;
    public static final TypeAdapter<Locale> T;
    public static final jw2 U;
    public static final TypeAdapter<uv2> V;
    public static final jw2 W;
    public static final jw2 X;
    public static final TypeAdapter<Class> a;
    public static final jw2 b;
    public static final TypeAdapter<BitSet> c;
    public static final jw2 d;
    public static final TypeAdapter<Boolean> e;
    public static final TypeAdapter<Boolean> f;
    public static final jw2 g;
    public static final TypeAdapter<Number> h;
    public static final jw2 i;
    public static final TypeAdapter<Number> j;
    public static final jw2 k;
    public static final TypeAdapter<Number> l;
    public static final jw2 m;
    public static final TypeAdapter<AtomicInteger> n;
    public static final jw2 o;
    public static final TypeAdapter<AtomicBoolean> p;
    public static final jw2 q;
    public static final TypeAdapter<AtomicIntegerArray> r;
    public static final jw2 s;
    public static final TypeAdapter<Number> t;
    public static final TypeAdapter<Number> u;
    public static final TypeAdapter<Number> v;
    public static final TypeAdapter<Character> w;
    public static final jw2 x;
    public static final TypeAdapter<String> y;
    public static final TypeAdapter<BigDecimal> z;

    /* loaded from: classes3.dex */
    public static final class EnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
        private final Map<String, T> a = new HashMap();
        private final Map<String, T> b = new HashMap();
        private final Map<T, String> c = new HashMap();

        /* loaded from: classes3.dex */
        public class a implements PrivilegedAction<Field[]> {
            public final /* synthetic */ Class a;

            public a(Class cls) {
                this.a = cls;
            }

            @Override // java.security.PrivilegedAction
            /* renamed from: a */
            public Field[] run() {
                Field[] declaredFields = this.a.getDeclaredFields();
                ArrayList arrayList = new ArrayList(declaredFields.length);
                for (Field field : declaredFields) {
                    if (field.isEnumConstant()) {
                        arrayList.add(field);
                    }
                }
                Field[] fieldArr = (Field[]) arrayList.toArray(new Field[0]);
                AccessibleObject.setAccessible(fieldArr, true);
                return fieldArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public EnumTypeAdapter(Class<T> cls) {
            Field[] fieldArr;
            try {
                for (Field field : (Field[]) AccessController.doPrivileged(new a(cls))) {
                    Enum r4 = (Enum) field.get(null);
                    String name = r4.name();
                    String str = r4.toString();
                    mw2 mw2Var = (mw2) field.getAnnotation(mw2.class);
                    if (mw2Var != null) {
                        name = mw2Var.value();
                        for (String str2 : mw2Var.alternate()) {
                            this.a.put(str2, r4);
                        }
                    }
                    this.a.put(name, r4);
                    this.b.put(str, r4);
                    this.c.put(r4, name);
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: a */
        public T read(nx2 nx2Var) throws IOException {
            if (nx2Var.Y() == px2.NULL) {
                nx2Var.P();
                return null;
            }
            String W = nx2Var.W();
            T t = this.a.get(W);
            return t == null ? this.b.get(W) : t;
        }

        @Override // com.google.gson.TypeAdapter
        /* renamed from: b */
        public void write(qx2 qx2Var, T t) throws IOException {
            qx2Var.d1(t == null ? null : this.c.get(t));
        }
    }

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            px2.values();
            int[] iArr = new int[10];
            a = iArr;
            try {
                iArr[px2.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[px2.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[px2.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[px2.BEGIN_ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[px2.BEGIN_OBJECT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[px2.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        TypeAdapter<Class> nullSafe = new TypeAdapter<Class>() { // from class: com.google.gson.internal.bind.TypeAdapters.1
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Class read(nx2 nx2Var) throws IOException {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Class cls) throws IOException {
                StringBuilder G2 = wo1.G("Attempted to serialize java.lang.Class: ");
                G2.append(cls.getName());
                G2.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(G2.toString());
            }
        }.nullSafe();
        a = nullSafe;
        b = b(Class.class, nullSafe);
        TypeAdapter<BitSet> nullSafe2 = new TypeAdapter<BitSet>() { // from class: com.google.gson.internal.bind.TypeAdapters.2
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BitSet read(nx2 nx2Var) throws IOException {
                BitSet bitSet = new BitSet();
                nx2Var.a();
                px2 Y = nx2Var.Y();
                int i2 = 0;
                while (Y != px2.END_ARRAY) {
                    int ordinal = Y.ordinal();
                    boolean z2 = true;
                    if (ordinal == 5 || ordinal == 6) {
                        int A2 = nx2Var.A();
                        if (A2 == 0) {
                            z2 = false;
                        } else if (A2 != 1) {
                            StringBuilder H2 = wo1.H("Invalid bitset value ", A2, ", expected 0 or 1; at path ");
                            H2.append(nx2Var.m());
                            throw new ew2(H2.toString());
                        }
                    } else if (ordinal == 7) {
                        z2 = nx2Var.w();
                    } else {
                        throw new ew2("Invalid bitset value type: " + Y + "; at path " + nx2Var.getPath());
                    }
                    if (z2) {
                        bitSet.set(i2);
                    }
                    i2++;
                    Y = nx2Var.Y();
                }
                nx2Var.h();
                return bitSet;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, BitSet bitSet) throws IOException {
                qx2Var.d();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    qx2Var.x0(bitSet.get(i2) ? 1L : 0L);
                }
                qx2Var.h();
            }
        }.nullSafe();
        c = nullSafe2;
        d = b(BitSet.class, nullSafe2);
        TypeAdapter<Boolean> typeAdapter = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.3
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(nx2 nx2Var) throws IOException {
                px2 Y = nx2Var.Y();
                if (Y == px2.NULL) {
                    nx2Var.P();
                    return null;
                } else if (Y == px2.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(nx2Var.W()));
                } else {
                    return Boolean.valueOf(nx2Var.w());
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Boolean bool) throws IOException {
                qx2Var.X0(bool);
            }
        };
        e = typeAdapter;
        f = new TypeAdapter<Boolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.4
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Boolean read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Boolean.valueOf(nx2Var.W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Boolean bool) throws IOException {
                qx2Var.d1(bool == null ? pg1.d : bool.toString());
            }
        };
        g = c(Boolean.TYPE, Boolean.class, typeAdapter);
        TypeAdapter<Number> typeAdapter2 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.5
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                try {
                    int A2 = nx2Var.A();
                    if (A2 <= 255 && A2 >= -128) {
                        return Byte.valueOf((byte) A2);
                    }
                    StringBuilder H2 = wo1.H("Lossy conversion from ", A2, " to byte; at path ");
                    H2.append(nx2Var.m());
                    throw new ew2(H2.toString());
                } catch (NumberFormatException e2) {
                    throw new ew2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        h = typeAdapter2;
        i = c(Byte.TYPE, Byte.class, typeAdapter2);
        TypeAdapter<Number> typeAdapter3 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.6
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                try {
                    int A2 = nx2Var.A();
                    if (A2 <= 65535 && A2 >= -32768) {
                        return Short.valueOf((short) A2);
                    }
                    StringBuilder H2 = wo1.H("Lossy conversion from ", A2, " to short; at path ");
                    H2.append(nx2Var.m());
                    throw new ew2(H2.toString());
                } catch (NumberFormatException e2) {
                    throw new ew2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        j = typeAdapter3;
        k = c(Short.TYPE, Short.class, typeAdapter3);
        TypeAdapter<Number> typeAdapter4 = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.7
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                try {
                    return Integer.valueOf(nx2Var.A());
                } catch (NumberFormatException e2) {
                    throw new ew2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        l = typeAdapter4;
        m = c(Integer.TYPE, Integer.class, typeAdapter4);
        TypeAdapter<AtomicInteger> nullSafe3 = new TypeAdapter<AtomicInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.8
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicInteger read(nx2 nx2Var) throws IOException {
                try {
                    return new AtomicInteger(nx2Var.A());
                } catch (NumberFormatException e2) {
                    throw new ew2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, AtomicInteger atomicInteger) throws IOException {
                qx2Var.x0(atomicInteger.get());
            }
        }.nullSafe();
        n = nullSafe3;
        o = b(AtomicInteger.class, nullSafe3);
        TypeAdapter<AtomicBoolean> nullSafe4 = new TypeAdapter<AtomicBoolean>() { // from class: com.google.gson.internal.bind.TypeAdapters.9
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicBoolean read(nx2 nx2Var) throws IOException {
                return new AtomicBoolean(nx2Var.w());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, AtomicBoolean atomicBoolean) throws IOException {
                qx2Var.D1(atomicBoolean.get());
            }
        }.nullSafe();
        p = nullSafe4;
        q = b(AtomicBoolean.class, nullSafe4);
        TypeAdapter<AtomicIntegerArray> nullSafe5 = new TypeAdapter<AtomicIntegerArray>() { // from class: com.google.gson.internal.bind.TypeAdapters.10
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public AtomicIntegerArray read(nx2 nx2Var) throws IOException {
                ArrayList arrayList = new ArrayList();
                nx2Var.a();
                while (nx2Var.q()) {
                    try {
                        arrayList.add(Integer.valueOf(nx2Var.A()));
                    } catch (NumberFormatException e2) {
                        throw new ew2(e2);
                    }
                }
                nx2Var.h();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, AtomicIntegerArray atomicIntegerArray) throws IOException {
                qx2Var.d();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    qx2Var.x0(atomicIntegerArray.get(i2));
                }
                qx2Var.h();
            }
        }.nullSafe();
        r = nullSafe5;
        s = b(AtomicIntegerArray.class, nullSafe5);
        t = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.11
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                try {
                    return Long.valueOf(nx2Var.E());
                } catch (NumberFormatException e2) {
                    throw new ew2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        u = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.12
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Float.valueOf((float) nx2Var.z());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        v = new TypeAdapter<Number>() { // from class: com.google.gson.internal.bind.TypeAdapters.13
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Number read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return Double.valueOf(nx2Var.z());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Number number) throws IOException {
                qx2Var.c1(number);
            }
        };
        TypeAdapter<Character> typeAdapter5 = new TypeAdapter<Character>() { // from class: com.google.gson.internal.bind.TypeAdapters.14
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Character read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                String W2 = nx2Var.W();
                if (W2.length() == 1) {
                    return Character.valueOf(W2.charAt(0));
                }
                StringBuilder M2 = wo1.M("Expecting character, got: ", W2, "; at ");
                M2.append(nx2Var.m());
                throw new ew2(M2.toString());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Character ch) throws IOException {
                qx2Var.d1(ch == null ? null : String.valueOf(ch));
            }
        };
        w = typeAdapter5;
        x = c(Character.TYPE, Character.class, typeAdapter5);
        TypeAdapter<String> typeAdapter6 = new TypeAdapter<String>() { // from class: com.google.gson.internal.bind.TypeAdapters.15
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public String read(nx2 nx2Var) throws IOException {
                px2 Y = nx2Var.Y();
                if (Y == px2.NULL) {
                    nx2Var.P();
                    return null;
                } else if (Y == px2.BOOLEAN) {
                    return Boolean.toString(nx2Var.w());
                } else {
                    return nx2Var.W();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, String str) throws IOException {
                qx2Var.d1(str);
            }
        };
        y = typeAdapter6;
        z = new TypeAdapter<BigDecimal>() { // from class: com.google.gson.internal.bind.TypeAdapters.16
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigDecimal read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                String W2 = nx2Var.W();
                try {
                    return new BigDecimal(W2);
                } catch (NumberFormatException e2) {
                    StringBuilder M2 = wo1.M("Failed parsing '", W2, "' as BigDecimal; at path ");
                    M2.append(nx2Var.m());
                    throw new ew2(M2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, BigDecimal bigDecimal) throws IOException {
                qx2Var.c1(bigDecimal);
            }
        };
        A = new TypeAdapter<BigInteger>() { // from class: com.google.gson.internal.bind.TypeAdapters.17
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public BigInteger read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                String W2 = nx2Var.W();
                try {
                    return new BigInteger(W2);
                } catch (NumberFormatException e2) {
                    StringBuilder M2 = wo1.M("Failed parsing '", W2, "' as BigInteger; at path ");
                    M2.append(nx2Var.m());
                    throw new ew2(M2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, BigInteger bigInteger) throws IOException {
                qx2Var.c1(bigInteger);
            }
        };
        B = new TypeAdapter<ww2>() { // from class: com.google.gson.internal.bind.TypeAdapters.18
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public ww2 read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return new ww2(nx2Var.W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, ww2 ww2Var) throws IOException {
                qx2Var.c1(ww2Var);
            }
        };
        C = b(String.class, typeAdapter6);
        TypeAdapter<StringBuilder> typeAdapter7 = new TypeAdapter<StringBuilder>() { // from class: com.google.gson.internal.bind.TypeAdapters.19
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuilder read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return new StringBuilder(nx2Var.W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, StringBuilder sb) throws IOException {
                qx2Var.d1(sb == null ? null : sb.toString());
            }
        };
        D = typeAdapter7;
        E = b(StringBuilder.class, typeAdapter7);
        TypeAdapter<StringBuffer> typeAdapter8 = new TypeAdapter<StringBuffer>() { // from class: com.google.gson.internal.bind.TypeAdapters.20
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public StringBuffer read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return new StringBuffer(nx2Var.W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, StringBuffer stringBuffer) throws IOException {
                qx2Var.d1(stringBuffer == null ? null : stringBuffer.toString());
            }
        };
        F = typeAdapter8;
        G = b(StringBuffer.class, typeAdapter8);
        TypeAdapter<URL> typeAdapter9 = new TypeAdapter<URL>() { // from class: com.google.gson.internal.bind.TypeAdapters.21
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URL read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                String W2 = nx2Var.W();
                if (pg1.d.equals(W2)) {
                    return null;
                }
                return new URL(W2);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, URL url) throws IOException {
                qx2Var.d1(url == null ? null : url.toExternalForm());
            }
        };
        H = typeAdapter9;
        I = b(URL.class, typeAdapter9);
        TypeAdapter<URI> typeAdapter10 = new TypeAdapter<URI>() { // from class: com.google.gson.internal.bind.TypeAdapters.22
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public URI read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                try {
                    String W2 = nx2Var.W();
                    if (pg1.d.equals(W2)) {
                        return null;
                    }
                    return new URI(W2);
                } catch (URISyntaxException e2) {
                    throw new vv2(e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, URI uri) throws IOException {
                qx2Var.d1(uri == null ? null : uri.toASCIIString());
            }
        };
        J = typeAdapter10;
        K = b(URI.class, typeAdapter10);
        TypeAdapter<InetAddress> typeAdapter11 = new TypeAdapter<InetAddress>() { // from class: com.google.gson.internal.bind.TypeAdapters.23
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public InetAddress read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                return InetAddress.getByName(nx2Var.W());
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, InetAddress inetAddress) throws IOException {
                qx2Var.d1(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        L = typeAdapter11;
        M = e(InetAddress.class, typeAdapter11);
        TypeAdapter<UUID> typeAdapter12 = new TypeAdapter<UUID>() { // from class: com.google.gson.internal.bind.TypeAdapters.24
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public UUID read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                String W2 = nx2Var.W();
                try {
                    return UUID.fromString(W2);
                } catch (IllegalArgumentException e2) {
                    StringBuilder M2 = wo1.M("Failed parsing '", W2, "' as UUID; at path ");
                    M2.append(nx2Var.m());
                    throw new ew2(M2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, UUID uuid) throws IOException {
                qx2Var.d1(uuid == null ? null : uuid.toString());
            }
        };
        N = typeAdapter12;
        O = b(UUID.class, typeAdapter12);
        TypeAdapter<Currency> nullSafe6 = new TypeAdapter<Currency>() { // from class: com.google.gson.internal.bind.TypeAdapters.25
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Currency read(nx2 nx2Var) throws IOException {
                String W2 = nx2Var.W();
                try {
                    return Currency.getInstance(W2);
                } catch (IllegalArgumentException e2) {
                    StringBuilder M2 = wo1.M("Failed parsing '", W2, "' as Currency; at path ");
                    M2.append(nx2Var.m());
                    throw new ew2(M2.toString(), e2);
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Currency currency) throws IOException {
                qx2Var.d1(currency.getCurrencyCode());
            }
        }.nullSafe();
        P = nullSafe6;
        Q = b(Currency.class, nullSafe6);
        TypeAdapter<Calendar> typeAdapter13 = new TypeAdapter<Calendar>() { // from class: com.google.gson.internal.bind.TypeAdapters.26
            private static final String a = "year";
            private static final String b = "month";
            private static final String c = "dayOfMonth";
            private static final String d = "hourOfDay";
            private static final String e = "minute";
            private static final String f = "second";

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Calendar read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                nx2Var.b();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (nx2Var.Y() != px2.END_OBJECT) {
                    String F2 = nx2Var.F();
                    int A2 = nx2Var.A();
                    if (a.equals(F2)) {
                        i2 = A2;
                    } else if (b.equals(F2)) {
                        i3 = A2;
                    } else if (c.equals(F2)) {
                        i4 = A2;
                    } else if (d.equals(F2)) {
                        i5 = A2;
                    } else if (e.equals(F2)) {
                        i6 = A2;
                    } else if (f.equals(F2)) {
                        i7 = A2;
                    }
                }
                nx2Var.j();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Calendar calendar) throws IOException {
                if (calendar == null) {
                    qx2Var.w();
                    return;
                }
                qx2Var.e();
                qx2Var.s(a);
                qx2Var.x0(calendar.get(1));
                qx2Var.s(b);
                qx2Var.x0(calendar.get(2));
                qx2Var.s(c);
                qx2Var.x0(calendar.get(5));
                qx2Var.s(d);
                qx2Var.x0(calendar.get(11));
                qx2Var.s(e);
                qx2Var.x0(calendar.get(12));
                qx2Var.s(f);
                qx2Var.x0(calendar.get(13));
                qx2Var.j();
            }
        };
        R = typeAdapter13;
        S = d(Calendar.class, GregorianCalendar.class, typeAdapter13);
        TypeAdapter<Locale> typeAdapter14 = new TypeAdapter<Locale>() { // from class: com.google.gson.internal.bind.TypeAdapters.27
            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public Locale read(nx2 nx2Var) throws IOException {
                if (nx2Var.Y() == px2.NULL) {
                    nx2Var.P();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(nx2Var.W(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: b */
            public void write(qx2 qx2Var, Locale locale) throws IOException {
                qx2Var.d1(locale == null ? null : locale.toString());
            }
        };
        T = typeAdapter14;
        U = b(Locale.class, typeAdapter14);
        TypeAdapter<uv2> typeAdapter15 = new TypeAdapter<uv2>() { // from class: com.google.gson.internal.bind.TypeAdapters.28
            private uv2 b(nx2 nx2Var, px2 px2Var) throws IOException {
                int ordinal = px2Var.ordinal();
                if (ordinal != 5) {
                    if (ordinal != 6) {
                        if (ordinal != 7) {
                            if (ordinal == 8) {
                                nx2Var.P();
                                return wv2.a;
                            }
                            throw new IllegalStateException("Unexpected token: " + px2Var);
                        }
                        return new aw2(Boolean.valueOf(nx2Var.w()));
                    }
                    return new aw2(new ww2(nx2Var.W()));
                }
                return new aw2(nx2Var.W());
            }

            private uv2 c(nx2 nx2Var, px2 px2Var) throws IOException {
                int ordinal = px2Var.ordinal();
                if (ordinal == 0) {
                    nx2Var.a();
                    return new rv2();
                } else if (ordinal != 2) {
                    return null;
                } else {
                    nx2Var.b();
                    return new xv2();
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: a */
            public uv2 read(nx2 nx2Var) throws IOException {
                if (nx2Var instanceof ex2) {
                    return ((ex2) nx2Var).b2();
                }
                px2 Y = nx2Var.Y();
                uv2 c2 = c(nx2Var, Y);
                if (c2 == null) {
                    return b(nx2Var, Y);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (nx2Var.q()) {
                        String F2 = c2 instanceof xv2 ? nx2Var.F() : null;
                        px2 Y2 = nx2Var.Y();
                        uv2 c3 = c(nx2Var, Y2);
                        boolean z2 = c3 != null;
                        if (c3 == null) {
                            c3 = b(nx2Var, Y2);
                        }
                        if (c2 instanceof rv2) {
                            ((rv2) c2).E(c3);
                        } else {
                            ((xv2) c2).E(F2, c3);
                        }
                        if (z2) {
                            arrayDeque.addLast(c2);
                            c2 = c3;
                        }
                    } else {
                        if (c2 instanceof rv2) {
                            nx2Var.h();
                        } else {
                            nx2Var.j();
                        }
                        if (arrayDeque.isEmpty()) {
                            return c2;
                        }
                        c2 = (uv2) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.TypeAdapter
            /* renamed from: d */
            public void write(qx2 qx2Var, uv2 uv2Var) throws IOException {
                if (uv2Var != null && !uv2Var.B()) {
                    if (uv2Var.D()) {
                        aw2 p2 = uv2Var.p();
                        if (p2.I()) {
                            qx2Var.c1(p2.u());
                            return;
                        } else if (p2.G()) {
                            qx2Var.D1(p2.d());
                            return;
                        } else {
                            qx2Var.d1(p2.y());
                            return;
                        }
                    } else if (uv2Var.A()) {
                        qx2Var.d();
                        Iterator<uv2> it = uv2Var.m().iterator();
                        while (it.hasNext()) {
                            write(qx2Var, it.next());
                        }
                        qx2Var.h();
                        return;
                    } else if (uv2Var.C()) {
                        qx2Var.e();
                        for (Map.Entry<String, uv2> entry : uv2Var.o().M()) {
                            qx2Var.s(entry.getKey());
                            write(qx2Var, entry.getValue());
                        }
                        qx2Var.j();
                        return;
                    } else {
                        StringBuilder G2 = wo1.G("Couldn't write ");
                        G2.append(uv2Var.getClass());
                        throw new IllegalArgumentException(G2.toString());
                    }
                }
                qx2Var.w();
            }
        };
        V = typeAdapter15;
        W = e(uv2.class, typeAdapter15);
        X = new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.29
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                Class f2 = lx2Var.f();
                if (!Enum.class.isAssignableFrom(f2) || f2 == Enum.class) {
                    return null;
                }
                if (!f2.isEnum()) {
                    f2 = (Class<? super Object>) f2.getSuperclass();
                }
                return new EnumTypeAdapter(f2);
            }
        };
    }

    private TypeAdapters() {
        throw new UnsupportedOperationException();
    }

    public static <TT> jw2 a(final lx2<TT> lx2Var, final TypeAdapter<TT> typeAdapter) {
        return new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.30
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var2) {
                if (lx2Var2.equals(lx2.this)) {
                    return typeAdapter;
                }
                return null;
            }
        };
    }

    public static <TT> jw2 b(final Class<TT> cls, final TypeAdapter<TT> typeAdapter) {
        return new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.31
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                if (lx2Var.f() == cls) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder G2 = wo1.G("Factory[type=");
                G2.append(cls.getName());
                G2.append(",adapter=");
                G2.append(typeAdapter);
                G2.append("]");
                return G2.toString();
            }
        };
    }

    public static <TT> jw2 c(final Class<TT> cls, final Class<TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.32
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                Class<? super T> f2 = lx2Var.f();
                if (f2 == cls || f2 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder G2 = wo1.G("Factory[type=");
                G2.append(cls2.getName());
                G2.append(ya2.z);
                G2.append(cls.getName());
                G2.append(",adapter=");
                G2.append(typeAdapter);
                G2.append("]");
                return G2.toString();
            }
        };
    }

    public static <TT> jw2 d(final Class<TT> cls, final Class<? extends TT> cls2, final TypeAdapter<? super TT> typeAdapter) {
        return new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.33
            @Override // com.p7700g.p99005.jw2
            public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
                Class<? super T> f2 = lx2Var.f();
                if (f2 == cls || f2 == cls2) {
                    return typeAdapter;
                }
                return null;
            }

            public String toString() {
                StringBuilder G2 = wo1.G("Factory[type=");
                G2.append(cls.getName());
                G2.append(ya2.z);
                G2.append(cls2.getName());
                G2.append(",adapter=");
                G2.append(typeAdapter);
                G2.append("]");
                return G2.toString();
            }
        };
    }

    public static <T1> jw2 e(final Class<T1> cls, final TypeAdapter<T1> typeAdapter) {
        return new jw2() { // from class: com.google.gson.internal.bind.TypeAdapters.34
            @Override // com.p7700g.p99005.jw2
            public <T2> TypeAdapter<T2> create(Gson gson, lx2<T2> lx2Var) {
                final Class<? super T2> f2 = lx2Var.f();
                if (cls.isAssignableFrom(f2)) {
                    return (TypeAdapter<T2>) new TypeAdapter<T1>() { // from class: com.google.gson.internal.bind.TypeAdapters.34.1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, T1] */
                        @Override // com.google.gson.TypeAdapter
                        public T1 read(nx2 nx2Var) throws IOException {
                            ?? read = typeAdapter.read(nx2Var);
                            if (read == 0 || f2.isInstance(read)) {
                                return read;
                            }
                            StringBuilder G2 = wo1.G("Expected a ");
                            G2.append(f2.getName());
                            G2.append(" but was ");
                            G2.append(read.getClass().getName());
                            G2.append("; at path ");
                            G2.append(nx2Var.m());
                            throw new ew2(G2.toString());
                        }

                        @Override // com.google.gson.TypeAdapter
                        public void write(qx2 qx2Var, T1 t1) throws IOException {
                            typeAdapter.write(qx2Var, t1);
                        }
                    };
                }
                return null;
            }

            public String toString() {
                StringBuilder G2 = wo1.G("Factory[typeHierarchy=");
                G2.append(cls.getName());
                G2.append(",adapter=");
                G2.append(typeAdapter);
                G2.append("]");
                return G2.toString();
            }
        };
    }
}
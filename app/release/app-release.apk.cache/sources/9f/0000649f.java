package com.p7700g.p99005;

import com.p7700g.p99005.cr5;
import com.p7700g.p99005.tz5;
import com.p7700g.p99005.yq5;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* compiled from: RequestFactory.java */
/* loaded from: classes4.dex */
public final class wz5 {
    private final Method a;
    private final zq5 b;
    public final String c;
    @Nullable
    private final String d;
    @Nullable
    private final yq5 e;
    @Nullable
    private final br5 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final tz5<?>[] j;
    public final boolean k;

    /* compiled from: RequestFactory.java */
    /* loaded from: classes4.dex */
    public static final class a {
        public final yz5 d;
        public final Method e;
        public final Annotation[] f;
        public final Annotation[][] g;
        public final Type[] h;
        public boolean i;
        public boolean j;
        public boolean k;
        public boolean l;
        public boolean m;
        public boolean n;
        public boolean o;
        public boolean p;
        @Nullable
        public String q;
        public boolean r;
        public boolean s;
        public boolean t;
        @Nullable
        public String u;
        @Nullable
        public yq5 v;
        @Nullable
        public br5 w;
        @Nullable
        public Set<String> x;
        @Nullable
        public tz5<?>[] y;
        public boolean z;
        private static final Pattern b = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final String a = "[a-zA-Z][a-zA-Z0-9_-]*";
        private static final Pattern c = Pattern.compile(a);

        public a(yz5 yz5Var, Method method) {
            this.d = yz5Var;
            this.e = method;
            this.f = method.getAnnotations();
            this.h = method.getGenericParameterTypes();
            this.g = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private yq5 c(String[] strArr) {
            yq5.a aVar = new yq5.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw c06.m(this.e, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.w = br5.h(trim);
                    } catch (IllegalArgumentException e) {
                        throw c06.n(this.e, e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.b(substring, trim);
                }
            }
            return aVar.i();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.q;
            if (str3 != null) {
                throw c06.m(this.e, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.q = str;
            this.r = z;
            if (str2.isEmpty()) {
                return;
            }
            int indexOf = str2.indexOf(63);
            if (indexOf != -1 && indexOf < str2.length() - 1) {
                String substring = str2.substring(indexOf + 1);
                if (b.matcher(substring).find()) {
                    throw c06.m(this.e, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                }
            }
            this.u = str2;
            this.x = h(str2);
        }

        private void e(Annotation annotation) {
            if (annotation instanceof m06) {
                d("DELETE", ((m06) annotation).value(), false);
            } else if (annotation instanceof q06) {
                d("GET", ((q06) annotation).value(), false);
            } else if (annotation instanceof r06) {
                d("HEAD", ((r06) annotation).value(), false);
            } else if (annotation instanceof y06) {
                d("PATCH", ((y06) annotation).value(), true);
            } else if (annotation instanceof z06) {
                d("POST", ((z06) annotation).value(), true);
            } else if (annotation instanceof a16) {
                d(cm4.y0, ((a16) annotation).value(), true);
            } else if (annotation instanceof x06) {
                d(cm4.B0, ((x06) annotation).value(), false);
            } else if (annotation instanceof s06) {
                s06 s06Var = (s06) annotation;
                d(s06Var.method(), s06Var.path(), s06Var.hasBody());
            } else if (annotation instanceof v06) {
                String[] value = ((v06) annotation).value();
                if (value.length != 0) {
                    this.v = c(value);
                    return;
                }
                throw c06.m(this.e, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof w06) {
                if (!this.s) {
                    this.t = true;
                    return;
                }
                throw c06.m(this.e, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (annotation instanceof p06) {
                if (!this.t) {
                    this.s = true;
                    return;
                }
                throw c06.m(this.e, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        @Nullable
        private tz5<?> f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            tz5<?> tz5Var;
            if (annotationArr != null) {
                tz5Var = null;
                for (Annotation annotation : annotationArr) {
                    tz5<?> g = g(i, type, annotationArr, annotation);
                    if (g != null) {
                        if (tz5Var != null) {
                            throw c06.o(this.e, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        tz5Var = g;
                    }
                }
            } else {
                tz5Var = null;
            }
            if (tz5Var == null) {
                if (z) {
                    try {
                        if (c06.h(type) == uv4.class) {
                            this.z = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw c06.o(this.e, i, "No Retrofit annotation found.", new Object[0]);
            }
            return tz5Var;
        }

        @Nullable
        private tz5<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof j16) {
                j(i, type);
                if (!this.p) {
                    if (!this.l) {
                        if (!this.m) {
                            if (!this.n) {
                                if (!this.o) {
                                    if (this.u == null) {
                                        this.p = true;
                                        if (type != zq5.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                            throw c06.o(this.e, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                        }
                                        return new tz5.p(this.e, i);
                                    }
                                    throw c06.o(this.e, i, "@Url cannot be used with @%s URL", this.q);
                                }
                                throw c06.o(this.e, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                            }
                            throw c06.o(this.e, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                        }
                        throw c06.o(this.e, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                    }
                    throw c06.o(this.e, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                throw c06.o(this.e, i, "Multiple @Url method annotations found.", new Object[0]);
            } else if (annotation instanceof d16) {
                j(i, type);
                if (!this.m) {
                    if (!this.n) {
                        if (!this.o) {
                            if (!this.p) {
                                if (this.u != null) {
                                    this.l = true;
                                    d16 d16Var = (d16) annotation;
                                    String value = d16Var.value();
                                    i(i, value);
                                    return new tz5.k(this.e, i, value, this.d.o(type, annotationArr), d16Var.encoded());
                                }
                                throw c06.o(this.e, i, "@Path can only be used with relative url on @%s", this.q);
                            }
                            throw c06.o(this.e, i, "@Path parameters may not be used with @Url.", new Object[0]);
                        }
                        throw c06.o(this.e, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                    }
                    throw c06.o(this.e, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                throw c06.o(this.e, i, "A @Path parameter must not come after a @Query.", new Object[0]);
            } else if (annotation instanceof e16) {
                j(i, type);
                e16 e16Var = (e16) annotation;
                String value2 = e16Var.value();
                boolean encoded = e16Var.encoded();
                Class<?> h = c06.h(type);
                this.m = true;
                if (Iterable.class.isAssignableFrom(h)) {
                    if (type instanceof ParameterizedType) {
                        return new tz5.l(value2, this.d.o(c06.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                    }
                    throw c06.o(this.e, i, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                } else if (h.isArray()) {
                    return new tz5.l(value2, this.d.o(a(h.getComponentType()), annotationArr), encoded).b();
                } else {
                    return new tz5.l(value2, this.d.o(type, annotationArr), encoded);
                }
            } else if (annotation instanceof g16) {
                j(i, type);
                boolean encoded2 = ((g16) annotation).encoded();
                Class<?> h2 = c06.h(type);
                this.n = true;
                if (Iterable.class.isAssignableFrom(h2)) {
                    if (type instanceof ParameterizedType) {
                        return new tz5.n(this.d.o(c06.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                    }
                    throw c06.o(this.e, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                } else if (h2.isArray()) {
                    return new tz5.n(this.d.o(a(h2.getComponentType()), annotationArr), encoded2).b();
                } else {
                    return new tz5.n(this.d.o(type, annotationArr), encoded2);
                }
            } else if (annotation instanceof f16) {
                j(i, type);
                Class<?> h3 = c06.h(type);
                this.o = true;
                if (Map.class.isAssignableFrom(h3)) {
                    Type i2 = c06.i(type, h3, Map.class);
                    if (i2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) i2;
                        Type g = c06.g(0, parameterizedType);
                        if (String.class == g) {
                            return new tz5.m(this.e, i, this.d.o(c06.g(1, parameterizedType), annotationArr), ((f16) annotation).encoded());
                        }
                        throw c06.o(this.e, i, "@QueryMap keys must be of type String: " + g, new Object[0]);
                    }
                    throw c06.o(this.e, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw c06.o(this.e, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof t06) {
                j(i, type);
                String value3 = ((t06) annotation).value();
                Class<?> h4 = c06.h(type);
                if (Iterable.class.isAssignableFrom(h4)) {
                    if (type instanceof ParameterizedType) {
                        return new tz5.f(value3, this.d.o(c06.g(0, (ParameterizedType) type), annotationArr)).c();
                    }
                    throw c06.o(this.e, i, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                } else if (h4.isArray()) {
                    return new tz5.f(value3, this.d.o(a(h4.getComponentType()), annotationArr)).b();
                } else {
                    return new tz5.f(value3, this.d.o(type, annotationArr));
                }
            } else if (annotation instanceof u06) {
                if (type == yq5.class) {
                    return new tz5.h(this.e, i);
                }
                j(i, type);
                Class<?> h5 = c06.h(type);
                if (Map.class.isAssignableFrom(h5)) {
                    Type i3 = c06.i(type, h5, Map.class);
                    if (i3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                        Type g2 = c06.g(0, parameterizedType2);
                        if (String.class == g2) {
                            return new tz5.g(this.e, i, this.d.o(c06.g(1, parameterizedType2), annotationArr));
                        }
                        throw c06.o(this.e, i, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                    }
                    throw c06.o(this.e, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw c06.o(this.e, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof n06) {
                j(i, type);
                if (this.s) {
                    n06 n06Var = (n06) annotation;
                    String value4 = n06Var.value();
                    boolean encoded3 = n06Var.encoded();
                    this.i = true;
                    Class<?> h6 = c06.h(type);
                    if (Iterable.class.isAssignableFrom(h6)) {
                        if (type instanceof ParameterizedType) {
                            return new tz5.d(value4, this.d.o(c06.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                        }
                        throw c06.o(this.e, i, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h6.isArray()) {
                        return new tz5.d(value4, this.d.o(a(h6.getComponentType()), annotationArr), encoded3).b();
                    } else {
                        return new tz5.d(value4, this.d.o(type, annotationArr), encoded3);
                    }
                }
                throw c06.o(this.e, i, "@Field parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof o06) {
                j(i, type);
                if (this.s) {
                    Class<?> h7 = c06.h(type);
                    if (Map.class.isAssignableFrom(h7)) {
                        Type i4 = c06.i(type, h7, Map.class);
                        if (i4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                            Type g3 = c06.g(0, parameterizedType3);
                            if (String.class == g3) {
                                lz5 o = this.d.o(c06.g(1, parameterizedType3), annotationArr);
                                this.i = true;
                                return new tz5.e(this.e, i, o, ((o06) annotation).encoded());
                            }
                            throw c06.o(this.e, i, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                        }
                        throw c06.o(this.e, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw c06.o(this.e, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw c06.o(this.e, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof b16) {
                j(i, type);
                if (this.t) {
                    b16 b16Var = (b16) annotation;
                    this.j = true;
                    String value5 = b16Var.value();
                    Class<?> h8 = c06.h(type);
                    if (value5.isEmpty()) {
                        if (Iterable.class.isAssignableFrom(h8)) {
                            if (type instanceof ParameterizedType) {
                                if (cr5.c.class.isAssignableFrom(c06.h(c06.g(0, (ParameterizedType) type)))) {
                                    return tz5.o.a.c();
                                }
                                throw c06.o(this.e, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            throw c06.o(this.e, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                        } else if (h8.isArray()) {
                            if (cr5.c.class.isAssignableFrom(h8.getComponentType())) {
                                return tz5.o.a.b();
                            }
                            throw c06.o(this.e, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        } else if (cr5.c.class.isAssignableFrom(h8)) {
                            return tz5.o.a;
                        } else {
                            throw c06.o(this.e, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    }
                    yq5 o2 = yq5.o("Content-Disposition", wo1.u("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", b16Var.encoding());
                    if (Iterable.class.isAssignableFrom(h8)) {
                        if (type instanceof ParameterizedType) {
                            Type g4 = c06.g(0, (ParameterizedType) type);
                            if (!cr5.c.class.isAssignableFrom(c06.h(g4))) {
                                return new tz5.i(this.e, i, o2, this.d.m(g4, annotationArr, this.f)).c();
                            }
                            throw c06.o(this.e, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        throw c06.o(this.e, i, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                    } else if (h8.isArray()) {
                        Class<?> a2 = a(h8.getComponentType());
                        if (!cr5.c.class.isAssignableFrom(a2)) {
                            return new tz5.i(this.e, i, o2, this.d.m(a2, annotationArr, this.f)).b();
                        }
                        throw c06.o(this.e, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    } else if (!cr5.c.class.isAssignableFrom(h8)) {
                        return new tz5.i(this.e, i, o2, this.d.m(type, annotationArr, this.f));
                    } else {
                        throw c06.o(this.e, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                }
                throw c06.o(this.e, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof c16) {
                j(i, type);
                if (this.t) {
                    this.j = true;
                    Class<?> h9 = c06.h(type);
                    if (Map.class.isAssignableFrom(h9)) {
                        Type i5 = c06.i(type, h9, Map.class);
                        if (i5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) i5;
                            Type g5 = c06.g(0, parameterizedType4);
                            if (String.class == g5) {
                                Type g6 = c06.g(1, parameterizedType4);
                                if (!cr5.c.class.isAssignableFrom(c06.h(g6))) {
                                    return new tz5.j(this.e, i, this.d.m(g6, annotationArr, this.f), ((c16) annotation).encoding());
                                }
                                throw c06.o(this.e, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw c06.o(this.e, i, "@PartMap keys must be of type String: " + g5, new Object[0]);
                        }
                        throw c06.o(this.e, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw c06.o(this.e, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw c06.o(this.e, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof l06) {
                j(i, type);
                if (!this.s && !this.t) {
                    if (!this.k) {
                        try {
                            lz5 m = this.d.m(type, annotationArr, this.f);
                            this.k = true;
                            return new tz5.c(this.e, i, m);
                        } catch (RuntimeException e) {
                            throw c06.p(this.e, e, i, "Unable to create @Body converter for %s", type);
                        }
                    }
                    throw c06.o(this.e, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                throw c06.o(this.e, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
            } else if (annotation instanceof i16) {
                j(i, type);
                Class<?> h10 = c06.h(type);
                for (int i6 = i - 1; i6 >= 0; i6--) {
                    tz5<?> tz5Var = this.y[i6];
                    if ((tz5Var instanceof tz5.q) && ((tz5.q) tz5Var).a.equals(h10)) {
                        Method method = this.e;
                        StringBuilder G = wo1.G("@Tag type ");
                        G.append(h10.getName());
                        G.append(" is duplicate of parameter #");
                        G.append(i6 + 1);
                        G.append(" and would always overwrite its value.");
                        throw c06.o(method, i, G.toString(), new Object[0]);
                    }
                }
                return new tz5.q(h10);
            } else {
                return null;
            }
        }

        public static Set<String> h(String str) {
            Matcher matcher = b.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i, String str) {
            if (c.matcher(str).matches()) {
                if (!this.x.contains(str)) {
                    throw c06.o(this.e, i, "URL \"%s\" does not contain \"{%s}\".", this.u, str);
                }
                return;
            }
            throw c06.o(this.e, i, "@Path parameter name must match %s. Found: %s", b.pattern(), str);
        }

        private void j(int i, Type type) {
            if (c06.j(type)) {
                throw c06.o(this.e, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public wz5 b() {
            for (Annotation annotation : this.f) {
                e(annotation);
            }
            if (this.q != null) {
                if (!this.r) {
                    if (!this.t) {
                        if (this.s) {
                            throw c06.m(this.e, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    } else {
                        throw c06.m(this.e, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.g.length;
                this.y = new tz5[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    tz5<?>[] tz5VarArr = this.y;
                    Type type = this.h[i2];
                    Annotation[] annotationArr = this.g[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    tz5VarArr[i2] = f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.u != null || this.p) {
                    boolean z2 = this.s;
                    if (!z2 && !this.t && !this.r && this.k) {
                        throw c06.m(this.e, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (z2 && !this.i) {
                        throw c06.m(this.e, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (this.t && !this.j) {
                        throw c06.m(this.e, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    return new wz5(this);
                }
                throw c06.m(this.e, "Missing either @%s URL or @Url parameter.", this.q);
            }
            throw c06.m(this.e, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    public wz5(a aVar) {
        this.a = aVar.e;
        this.b = aVar.d.c;
        this.c = aVar.q;
        this.d = aVar.u;
        this.e = aVar.v;
        this.f = aVar.w;
        this.g = aVar.r;
        this.h = aVar.s;
        this.i = aVar.t;
        this.j = aVar.y;
        this.k = aVar.z;
    }

    public static wz5 b(yz5 yz5Var, Method method) {
        return new a(yz5Var, method).b();
    }

    public hr5 a(Object[] objArr) throws IOException {
        tz5<?>[] tz5VarArr = this.j;
        int length = objArr.length;
        if (length == tz5VarArr.length) {
            vz5 vz5Var = new vz5(this.c, this.b, this.d, this.e, this.f, this.g, this.h, this.i);
            if (this.k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                tz5VarArr[i].a(vz5Var, objArr[i]);
            }
            return vz5Var.k().z(pz5.class, new pz5(this.a, arrayList)).b();
        }
        throw new IllegalArgumentException(wo1.z(wo1.H("Argument count (", length, ") doesn't match expected count ("), tz5VarArr.length, ")"));
    }
}
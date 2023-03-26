package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.Excluder;
import com.p7700g.p99005.ax2;
import com.p7700g.p99005.bx2;
import com.p7700g.p99005.ew2;
import com.p7700g.p99005.gw2;
import com.p7700g.p99005.ix2;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.lw2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.mw2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.ov2;
import com.p7700g.p99005.px2;
import com.p7700g.p99005.qx2;
import com.p7700g.p99005.rw2;
import com.p7700g.p99005.sw2;
import com.p7700g.p99005.vv2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.yw2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements jw2 {
    private final sw2 s;
    private final ov2 t;
    private final Excluder u;
    private final JsonAdapterAnnotationTypeAdapterFactory v;
    private final List<gw2> w;

    /* loaded from: classes3.dex */
    public static final class Adapter<T> extends TypeAdapter<T> {
        private final yw2<T> a;
        private final Map<String, b> b;

        public Adapter(yw2<T> yw2Var, Map<String, b> map) {
            this.a = yw2Var;
            this.b = map;
        }

        @Override // com.google.gson.TypeAdapter
        public T read(nx2 nx2Var) throws IOException {
            if (nx2Var.Y() == px2.NULL) {
                nx2Var.P();
                return null;
            }
            T a = this.a.a();
            try {
                nx2Var.b();
                while (nx2Var.q()) {
                    b bVar = this.b.get(nx2Var.F());
                    if (bVar != null && bVar.c) {
                        bVar.a(nx2Var, a);
                    }
                    nx2Var.Y1();
                }
                nx2Var.j();
                return a;
            } catch (IllegalAccessException e) {
                throw ix2.b(e);
            } catch (IllegalStateException e2) {
                throw new ew2(e2);
            }
        }

        @Override // com.google.gson.TypeAdapter
        public void write(qx2 qx2Var, T t) throws IOException {
            if (t == null) {
                qx2Var.w();
                return;
            }
            qx2Var.e();
            try {
                for (b bVar : this.b.values()) {
                    bVar.b(qx2Var, t);
                }
                qx2Var.j();
            } catch (IllegalAccessException e) {
                throw ix2.b(e);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class a extends b {
        public final /* synthetic */ boolean d;
        public final /* synthetic */ Field e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ TypeAdapter g;
        public final /* synthetic */ Gson h;
        public final /* synthetic */ lx2 i;
        public final /* synthetic */ boolean j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z, boolean z2, boolean z3, Field field, boolean z4, TypeAdapter typeAdapter, Gson gson, lx2 lx2Var, boolean z5) {
            super(str, z, z2);
            this.d = z3;
            this.e = field;
            this.f = z4;
            this.g = typeAdapter;
            this.h = gson;
            this.i = lx2Var;
            this.j = z5;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public void a(nx2 nx2Var, Object obj) throws IOException, IllegalAccessException {
            Object read = this.g.read(nx2Var);
            if (read == null && this.j) {
                return;
            }
            if (this.d) {
                ReflectiveTypeAdapterFactory.b(obj, this.e);
            }
            this.e.set(obj, read);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.b
        public void b(qx2 qx2Var, Object obj) throws IOException, IllegalAccessException {
            if (this.b) {
                if (this.d) {
                    ReflectiveTypeAdapterFactory.b(obj, this.e);
                }
                Object obj2 = this.e.get(obj);
                if (obj2 == obj) {
                    return;
                }
                qx2Var.s(this.a);
                (this.f ? this.g : new TypeAdapterRuntimeTypeWrapper(this.h, this.g, this.i.g())).write(qx2Var, obj2);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(nx2 nx2Var, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(qx2 qx2Var, Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(sw2 sw2Var, ov2 ov2Var, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List<gw2> list) {
        this.s = sw2Var;
        this.t = ov2Var;
        this.u = excluder;
        this.v = jsonAdapterAnnotationTypeAdapterFactory;
        this.w = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, Field field) {
        if (Modifier.isStatic(field.getModifiers())) {
            obj = null;
        }
        if (bx2.a(field, obj)) {
            return;
        }
        StringBuilder G = wo1.G("Field '");
        G.append(field.getDeclaringClass().getName());
        G.append("#");
        G.append(field.getName());
        G.append("' is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type or adjust the access filter.");
        throw new vv2(G.toString());
    }

    private b c(Gson gson, Field field, String str, lx2<?> lx2Var, boolean z, boolean z2, boolean z3) {
        boolean a2 = ax2.a(lx2Var.f());
        lw2 lw2Var = (lw2) field.getAnnotation(lw2.class);
        TypeAdapter<?> a3 = lw2Var != null ? this.v.a(this.s, gson, lx2Var, lw2Var) : null;
        boolean z4 = a3 != null;
        if (a3 == null) {
            a3 = gson.p(lx2Var);
        }
        return new a(str, z, z2, z3, field, z4, a3, gson, lx2Var, a2);
    }

    private Map<String, b> d(Gson gson, lx2<?> lx2Var, Class<?> cls, boolean z) {
        int i;
        int i2;
        ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory = this;
        Class<?> cls2 = cls;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type g = lx2Var.g();
        lx2<?> lx2Var2 = lx2Var;
        boolean z2 = z;
        Class<?> cls3 = cls2;
        while (cls3 != Object.class) {
            Field[] declaredFields = cls3.getDeclaredFields();
            boolean z3 = true;
            boolean z4 = false;
            if (cls3 != cls2 && declaredFields.length > 0) {
                gw2.e b2 = bx2.b(reflectiveTypeAdapterFactory.w, cls3);
                if (b2 != gw2.e.BLOCK_ALL) {
                    z2 = b2 == gw2.e.BLOCK_INACCESSIBLE;
                } else {
                    throw new vv2("ReflectionAccessFilter does not permit using reflection for " + cls3 + " (supertype of " + cls2 + "). Register a TypeAdapter for this type or adjust the access filter.");
                }
            }
            boolean z5 = z2;
            int length = declaredFields.length;
            int i3 = 0;
            while (i3 < length) {
                Field field = declaredFields[i3];
                boolean f = reflectiveTypeAdapterFactory.f(field, z3);
                boolean f2 = reflectiveTypeAdapterFactory.f(field, z4);
                if (f || f2) {
                    if (!z5) {
                        ix2.c(field);
                    }
                    Type o = rw2.o(lx2Var2.g(), cls3, field.getGenericType());
                    List<String> e = reflectiveTypeAdapterFactory.e(field);
                    b bVar = null;
                    int size = e.size();
                    int i4 = 0;
                    while (i4 < size) {
                        String str = e.get(i4);
                        boolean z6 = i4 != 0 ? false : f;
                        b bVar2 = bVar;
                        int i5 = size;
                        List<String> list = e;
                        Field field2 = field;
                        int i6 = i3;
                        int i7 = length;
                        bVar = bVar2 == null ? (b) linkedHashMap.put(str, c(gson, field, str, lx2.c(o), z6, f2, z5)) : bVar2;
                        i4++;
                        f = z6;
                        i3 = i6;
                        size = i5;
                        e = list;
                        field = field2;
                        length = i7;
                    }
                    b bVar3 = bVar;
                    i = i3;
                    i2 = length;
                    if (bVar3 != null) {
                        throw new IllegalArgumentException(g + " declares multiple JSON fields named " + bVar3.a);
                    }
                } else {
                    i = i3;
                    i2 = length;
                }
                i3 = i + 1;
                z4 = false;
                z3 = true;
                reflectiveTypeAdapterFactory = this;
                length = i2;
            }
            lx2Var2 = lx2.c(rw2.o(lx2Var2.g(), cls3, cls3.getGenericSuperclass()));
            cls3 = lx2Var2.f();
            reflectiveTypeAdapterFactory = this;
            cls2 = cls;
            z2 = z5;
        }
        return linkedHashMap;
    }

    private List<String> e(Field field) {
        mw2 mw2Var = (mw2) field.getAnnotation(mw2.class);
        if (mw2Var == null) {
            return Collections.singletonList(this.t.a(field));
        }
        String value = mw2Var.value();
        String[] alternate = mw2Var.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String str : alternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    private boolean f(Field field, boolean z) {
        return (this.u.c(field.getType(), z) || this.u.f(field, z)) ? false : true;
    }

    @Override // com.p7700g.p99005.jw2
    public <T> TypeAdapter<T> create(Gson gson, lx2<T> lx2Var) {
        Class<? super T> f = lx2Var.f();
        if (Object.class.isAssignableFrom(f)) {
            gw2.e b2 = bx2.b(this.w, f);
            if (b2 != gw2.e.BLOCK_ALL) {
                return new Adapter(this.s.a(lx2Var), d(gson, lx2Var, f, b2 == gw2.e.BLOCK_INACCESSIBLE));
            }
            throw new vv2("ReflectionAccessFilter does not permit using reflection for " + f + ". Register a TypeAdapter for this type or adjust the access filter.");
        }
        return null;
    }
}
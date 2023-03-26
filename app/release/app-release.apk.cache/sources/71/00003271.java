package com.google.gson.internal;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.p7700g.p99005.jw2;
import com.p7700g.p99005.kw2;
import com.p7700g.p99005.lv2;
import com.p7700g.p99005.lx2;
import com.p7700g.p99005.mv2;
import com.p7700g.p99005.nw2;
import com.p7700g.p99005.nx2;
import com.p7700g.p99005.ow2;
import com.p7700g.p99005.qx2;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.WKSRecord;

/* loaded from: classes3.dex */
public final class Excluder implements jw2, Cloneable {
    private static final double s = -1.0d;
    public static final Excluder t = new Excluder();
    private boolean x;
    private double u = s;
    private int v = WKSRecord.Service.PROFILE;
    private boolean w = true;
    private List<lv2> y = Collections.emptyList();
    private List<lv2> z = Collections.emptyList();

    private boolean d(Class<?> cls) {
        if (this.u == s || t((nw2) cls.getAnnotation(nw2.class), (ow2) cls.getAnnotation(ow2.class))) {
            return (!this.w && i(cls)) || h(cls);
        }
        return true;
    }

    private boolean e(Class<?> cls, boolean z) {
        for (lv2 lv2Var : z ? this.y : this.z) {
            if (lv2Var.b(cls)) {
                return true;
            }
        }
        return false;
    }

    private boolean h(Class<?> cls) {
        return (Enum.class.isAssignableFrom(cls) || n(cls) || (!cls.isAnonymousClass() && !cls.isLocalClass())) ? false : true;
    }

    private boolean i(Class<?> cls) {
        return cls.isMemberClass() && !n(cls);
    }

    private boolean n(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    private boolean o(nw2 nw2Var) {
        return nw2Var == null || nw2Var.value() <= this.u;
    }

    private boolean p(ow2 ow2Var) {
        return ow2Var == null || ow2Var.value() > this.u;
    }

    private boolean t(nw2 nw2Var, ow2 ow2Var) {
        return o(nw2Var) && p(ow2Var);
    }

    /* renamed from: a */
    public Excluder clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public Excluder b() {
        Excluder clone = clone();
        clone.w = false;
        return clone;
    }

    public boolean c(Class<?> cls, boolean z) {
        return d(cls) || e(cls, z);
    }

    @Override // com.p7700g.p99005.jw2
    public <T> TypeAdapter<T> create(final Gson gson, final lx2<T> lx2Var) {
        Class<? super T> f = lx2Var.f();
        boolean d = d(f);
        final boolean z = d || e(f, true);
        final boolean z2 = d || e(f, false);
        if (z || z2) {
            return new TypeAdapter<T>() { // from class: com.google.gson.internal.Excluder.1
                private TypeAdapter<T> a;

                private TypeAdapter<T> a() {
                    TypeAdapter<T> typeAdapter = this.a;
                    if (typeAdapter != 0) {
                        return typeAdapter;
                    }
                    TypeAdapter<T> r = gson.r(Excluder.this, lx2Var);
                    this.a = r;
                    return r;
                }

                /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
                @Override // com.google.gson.TypeAdapter
                public T read(nx2 nx2Var) throws IOException {
                    if (z2) {
                        nx2Var.Y1();
                        return null;
                    }
                    return a().read(nx2Var);
                }

                @Override // com.google.gson.TypeAdapter
                public void write(qx2 qx2Var, T t2) throws IOException {
                    if (z) {
                        qx2Var.w();
                    } else {
                        a().write(qx2Var, t2);
                    }
                }
            };
        }
        return null;
    }

    public boolean f(Field field, boolean z) {
        kw2 kw2Var;
        if ((this.v & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.u == s || t((nw2) field.getAnnotation(nw2.class), (ow2) field.getAnnotation(ow2.class))) && !field.isSynthetic()) {
            if (!this.x || ((kw2Var = (kw2) field.getAnnotation(kw2.class)) != null && (!z ? !kw2Var.deserialize() : !kw2Var.serialize()))) {
                if ((this.w || !i(field.getType())) && !h(field.getType())) {
                    List<lv2> list = z ? this.y : this.z;
                    if (list.isEmpty()) {
                        return false;
                    }
                    mv2 mv2Var = new mv2(field);
                    for (lv2 lv2Var : list) {
                        if (lv2Var.a(mv2Var)) {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public Excluder g() {
        Excluder clone = clone();
        clone.x = true;
        return clone;
    }

    public Excluder u(lv2 lv2Var, boolean z, boolean z2) {
        Excluder clone = clone();
        if (z) {
            ArrayList arrayList = new ArrayList(this.y);
            clone.y = arrayList;
            arrayList.add(lv2Var);
        }
        if (z2) {
            ArrayList arrayList2 = new ArrayList(this.z);
            clone.z = arrayList2;
            arrayList2.add(lv2Var);
        }
        return clone;
    }

    public Excluder x(int... iArr) {
        Excluder clone = clone();
        clone.v = 0;
        for (int i : iArr) {
            clone.v = i | clone.v;
        }
        return clone;
    }

    public Excluder y(double d) {
        Excluder clone = clone();
        clone.u = d;
        return clone;
    }
}
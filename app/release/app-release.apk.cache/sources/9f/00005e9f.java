package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FieldDescriptor.java */
/* loaded from: classes3.dex */
public final class tp2 {
    private final String a;
    private final Map<Class<?>, Object> b;

    /* compiled from: FieldDescriptor.java */
    /* loaded from: classes3.dex */
    public static final class b {
        private final String a;
        private Map<Class<?>, Object> b = null;

        public b(String str) {
            this.a = str;
        }

        @x1
        public tp2 a() {
            Map unmodifiableMap;
            String str = this.a;
            if (this.b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.b));
            }
            return new tp2(str, unmodifiableMap);
        }

        @x1
        public <T extends Annotation> b b(@x1 T t) {
            if (this.b == null) {
                this.b = new HashMap();
            }
            this.b.put(t.annotationType(), t);
            return this;
        }
    }

    @x1
    public static b a(@x1 String str) {
        return new b(str);
    }

    @x1
    public static tp2 d(@x1 String str) {
        return new tp2(str, Collections.emptyMap());
    }

    @x1
    public String b() {
        return this.a;
    }

    @z1
    public <T extends Annotation> T c(@x1 Class<T> cls) {
        return (T) this.b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tp2) {
            tp2 tp2Var = (tp2) obj;
            return this.a.equals(tp2Var.a) && this.b.equals(tp2Var.b);
        }
        return false;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("FieldDescriptor{name=");
        G.append(this.a);
        G.append(", properties=");
        G.append(this.b.values());
        G.append("}");
        return G.toString();
    }

    private tp2(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }
}
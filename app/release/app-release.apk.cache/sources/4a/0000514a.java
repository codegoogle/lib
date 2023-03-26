package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: FieldAttributes.java */
/* loaded from: classes3.dex */
public final class mv2 {
    private final Field a;

    public mv2(Field field) {
        qw2.b(field);
        this.a = field;
    }

    public <T extends Annotation> T a(Class<T> cls) {
        return (T) this.a.getAnnotation(cls);
    }

    public Collection<Annotation> b() {
        return Arrays.asList(this.a.getAnnotations());
    }

    public Class<?> c() {
        return this.a.getType();
    }

    public Type d() {
        return this.a.getGenericType();
    }

    public Class<?> e() {
        return this.a.getDeclaringClass();
    }

    public String f() {
        return this.a.getName();
    }

    public boolean g(int i) {
        return (i & this.a.getModifiers()) != 0;
    }

    public String toString() {
        return this.a.toString();
    }
}
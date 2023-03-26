package com.p7700g.p99005;

import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;

/* compiled from: AnnotatedContext.java */
/* loaded from: classes3.dex */
public class kv3 implements mv3 {
    private Annotation[] a;
    private AccessibleObject b;

    public kv3() {
    }

    @Override // com.p7700g.p99005.mv3
    public AccessibleObject a() {
        return this.b;
    }

    public void b(AccessibleObject accessibleObject) {
        this.b = accessibleObject;
    }

    public void c(Annotation[] annotationArr) {
        this.a = annotationArr;
    }

    @Override // com.p7700g.p99005.mv3
    public Annotation[] getAnnotations() {
        return this.a;
    }

    public kv3(Annotation[] annotationArr) {
        this(null, annotationArr);
    }

    public kv3(AccessibleObject accessibleObject) {
        this(accessibleObject, null);
    }

    public kv3(AccessibleObject accessibleObject, Annotation[] annotationArr) {
        this.b = accessibleObject;
        this.a = annotationArr;
    }
}
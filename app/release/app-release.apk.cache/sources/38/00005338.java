package com.p7700g.p99005;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: ComponentDestructor.java */
/* loaded from: classes3.dex */
public class nv3 {
    private final List<Method> a;

    public nv3(Class cls) {
        this.a = b(cls);
    }

    private static List<Method> b(Class cls) {
        Class cls2 = (Class) AccessController.doPrivileged(jv3.c("javax.annotation.PreDestroy"));
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (cls2 != null) {
            Iterator<hv3> it = new iv3(cls, true).d(cls2).h(0).i(Void.TYPE).iterator();
            while (it.hasNext()) {
                Method f = it.next().f();
                if (hashSet.add(f.getName())) {
                    AccessController.doPrivileged(jv3.G(f));
                    arrayList.add(f);
                }
            }
        }
        return arrayList;
    }

    public void a(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (Method method : this.a) {
            method.invoke(obj, new Object[0]);
        }
    }
}
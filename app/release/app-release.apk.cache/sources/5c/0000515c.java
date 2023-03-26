package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.List;

/* compiled from: StringKeyObjectValueIgnoreCaseMultivaluedMap.java */
/* loaded from: classes3.dex */
public class mx3 extends lx3<Object> {
    public mx3() {
    }

    public <A> List<A> n3(String str, Class<A> cls) {
        List list = get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (cls.isInstance(obj)) {
                    arrayList.add(obj);
                } else {
                    throw new IllegalArgumentException(cls + " is not an instance of " + obj.getClass());
                }
            }
            return arrayList;
        }
        return null;
    }

    public <A> A p3(String str, Class<A> cls) {
        A a = (A) b(str);
        if (a == null) {
            return null;
        }
        if (cls.isInstance(a)) {
            return a;
        }
        throw new IllegalArgumentException(cls + " is not an instance of " + a.getClass());
    }

    public <A> A t3(String str, A a) {
        A a2 = (A) b(str);
        if (a2 == null) {
            return a;
        }
        if (a.getClass().isInstance(a2)) {
            return a2;
        }
        throw new IllegalArgumentException(a.getClass() + " is not an instance of " + a2.getClass());
    }

    public mx3(mx3 mx3Var) {
        super(mx3Var);
    }
}
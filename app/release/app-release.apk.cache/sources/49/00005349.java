package com.p7700g.p99005;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: StringKeyStringValueIgnoreCaseMultivaluedMap.java */
/* loaded from: classes3.dex */
public class nx3 extends lx3<String> {
    public nx3() {
    }

    public void n3(String str, Object obj) {
        List<String> j3 = j3(str);
        if (obj != null) {
            j3.add(obj.toString());
        } else {
            j3.add("");
        }
    }

    public <A> List<A> p3(String str, Class<A> cls) {
        try {
            Constructor<A> constructor = cls.getConstructor(String.class);
            List list = get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(constructor.newInstance((String) it.next()));
                    } catch (Exception unused) {
                        arrayList.add(null);
                    }
                }
                return arrayList;
            }
            return null;
        } catch (Exception e) {
            throw new IllegalArgumentException(cls.getName() + " has no String constructor", e);
        }
    }

    public <A> A t3(String str, Class<A> cls) {
        String b = b(str);
        if (b == null) {
            return null;
        }
        try {
            try {
                return cls.getConstructor(String.class).newInstance(b);
            } catch (Exception unused) {
                return null;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(cls.getName() + " has no String constructor", e);
        }
    }

    public <A> A w3(String str, A a) {
        String b = b(str);
        if (b == null) {
            return a;
        }
        Class<?> cls = a.getClass();
        try {
            try {
                return (A) cls.getConstructor(String.class).newInstance(b);
            } catch (Exception unused) {
                return a;
            }
        } catch (Exception e) {
            throw new IllegalArgumentException(cls.getName() + " has no String constructor", e);
        }
    }

    public void x3(String str, Object obj) {
        List<String> j3 = j3(str);
        j3.clear();
        if (obj != null) {
            j3.add(obj.toString());
        } else {
            j3.add("");
        }
    }

    public nx3(nx3 nx3Var) {
        super(nx3Var);
    }
}
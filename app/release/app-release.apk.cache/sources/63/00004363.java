package com.p7700g.p99005;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* compiled from: MultivaluedMapImpl.java */
/* loaded from: classes3.dex */
public class fx3 extends HashMap<String, List<String>> implements um4<String, String> {
    public static final long s = -6052320403766368902L;

    public fx3() {
    }

    private List<String> t(String str) {
        List<String> list = get(str);
        if (list == null) {
            LinkedList linkedList = new LinkedList();
            put(str, linkedList);
            return linkedList;
        }
        return list;
    }

    public final void a(String str, Object obj) {
        List<String> t = t(str);
        if (obj != null) {
            t.add(obj.toString());
        } else {
            t.add("");
        }
    }

    @Override // com.p7700g.p99005.um4
    /* renamed from: e */
    public final void d(String str, String str2) {
        List<String> t = t(str);
        if (str2 != null) {
            t.add(str2);
        } else {
            t.add("");
        }
    }

    public final void h(String str, String str2) {
        List<String> t = t(str);
        if (str2 != null) {
            t.add(0, str2);
        } else {
            t.add(0, "");
        }
    }

    public final <A> List<A> i(String str, Class<A> cls) {
        try {
            Constructor<A> constructor = cls.getConstructor(String.class);
            List<String> list = get(str);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(constructor.newInstance(it.next()));
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

    public final <A> A n(String str, Class<A> cls) {
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

    public final <A> A o(String str, A a) {
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

    @Override // com.p7700g.p99005.um4
    /* renamed from: p */
    public final String b(String str) {
        List<String> list = get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0);
    }

    public final void u(String str, Object obj) {
        List<String> t = t(str);
        t.clear();
        if (obj != null) {
            t.add(obj.toString());
        } else {
            t.add("");
        }
    }

    @Override // com.p7700g.p99005.um4
    /* renamed from: x */
    public final void c(String str, String str2) {
        List<String> t = t(str);
        t.clear();
        if (str2 != null) {
            t.add(str2);
        } else {
            t.add("");
        }
    }

    public fx3(um4<String, String> um4Var) {
        for (Map.Entry<String, String> entry : um4Var.entrySet()) {
            put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
    }
}
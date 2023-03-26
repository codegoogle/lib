package androidx.lifecycle;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.cz;
import com.p7700g.p99005.hz;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.iz;
import com.p7700g.p99005.jz;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.pz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class Lifecycling {
    private static final int a = 1;
    private static final int b = 2;
    private static Map<Class<?>, Integer> c = new HashMap();
    private static Map<Class<?>, List<Constructor<? extends iz>>> d = new HashMap();

    private Lifecycling() {
    }

    private static iz a(Constructor<? extends iz> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @z1
    private static Constructor<? extends iz> b(Class<?> cls) {
        try {
            Package r0 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r0 != null ? r0.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c2 = c(canonicalName);
            if (!name.isEmpty()) {
                c2 = name + CryptoConstants.ALIAS_SEPARATOR + c2;
            }
            Constructor declaredConstructor = Class.forName(c2).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public static String c(String str) {
        return str.replace(CryptoConstants.ALIAS_SEPARATOR, "_") + "_LifecycleAdapter";
    }

    @x1
    @Deprecated
    public static jz d(Object obj) {
        final oz g = g(obj);
        return new jz() { // from class: androidx.lifecycle.Lifecycling.1
            @Override // com.p7700g.p99005.oz
            public void i(@x1 qz qzVar, @x1 mz.b bVar) {
                oz.this.i(qzVar, bVar);
            }
        };
    }

    private static int e(Class<?> cls) {
        Integer num = c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int h = h(cls);
        c.put(cls, Integer.valueOf(h));
        return h;
    }

    private static boolean f(Class<?> cls) {
        return cls != null && pz.class.isAssignableFrom(cls);
    }

    @x1
    public static oz g(Object obj) {
        boolean z = obj instanceof oz;
        boolean z2 = obj instanceof hz;
        if (z && z2) {
            return new FullLifecycleObserverAdapter((hz) obj, (oz) obj);
        }
        if (z2) {
            return new FullLifecycleObserverAdapter((hz) obj, null);
        }
        if (z) {
            return (oz) obj;
        }
        Class<?> cls = obj.getClass();
        if (e(cls) == 2) {
            List<Constructor<? extends iz>> list = d.get(cls);
            if (list.size() == 1) {
                return new SingleGeneratedAdapterObserver(a(list.get(0), obj));
            }
            iz[] izVarArr = new iz[list.size()];
            for (int i = 0; i < list.size(); i++) {
                izVarArr[i] = a(list.get(i), obj);
            }
            return new CompositeGeneratedAdaptersObserver(izVarArr);
        }
        return new ReflectiveGenericLifecycleObserver(obj);
    }

    private static int h(Class<?> cls) {
        Class<?>[] interfaces;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor<? extends iz> b2 = b(cls);
        if (b2 != null) {
            d.put(cls, Collections.singletonList(b2));
            return 2;
        } else if (cz.a.d(cls)) {
            return 1;
        } else {
            Class<? super Object> superclass = cls.getSuperclass();
            ArrayList arrayList = null;
            if (f(superclass)) {
                if (e(superclass) == 1) {
                    return 1;
                }
                arrayList = new ArrayList(d.get(superclass));
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (f(cls2)) {
                    if (e(cls2) == 1) {
                        return 1;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.addAll(d.get(cls2));
                }
            }
            if (arrayList != null) {
                d.put(cls, arrayList);
                return 2;
            }
            return 1;
        }
    }
}
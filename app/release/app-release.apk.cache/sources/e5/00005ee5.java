package com.p7700g.p99005;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ProviderServices.java */
/* loaded from: classes3.dex */
public class tv3 {
    private static final Logger a = Logger.getLogger(tv3.class.getName());
    private final Class<? extends fy3> b;
    private final sv3 c;
    private final Set<Class<?>> d;
    private final Set e;

    /* compiled from: ProviderServices.java */
    /* loaded from: classes3.dex */
    public interface b<T> {
        void a(T t);
    }

    public tv3(sv3 sv3Var, Set<Class<?>> set, Set<?> set2) {
        this(fy3.class, sv3Var, set, set2);
    }

    private boolean a(Class<?> cls) {
        ey3 ey3Var = (ey3) cls.getAnnotation(ey3.class);
        if (ey3Var != null) {
            return ey3Var.value().isAssignableFrom(this.b);
        }
        return true;
    }

    private <T> Set<T> b(Set<T> set, Set<T> set2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t : set) {
            if (!set2.contains(t)) {
                linkedHashSet.add(t);
            }
        }
        for (T t2 : set2) {
            if (!set.contains(t2)) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    private Object c(a aVar) {
        pv3 f = this.c.f(aVar);
        if (f != null) {
            return f.b();
        }
        return null;
    }

    private Object d(Class cls) {
        pv3 a2 = this.c.a(cls);
        if (a2 != null) {
            return a2.b();
        }
        return null;
    }

    private Set<a> h(Class<?> cls) {
        Set<a> k = k(cls);
        q(cls, k);
        return k;
    }

    private Set<Class> i(Class<?> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Class<?> cls2 : this.d) {
            if (cls.isAssignableFrom(cls2) && a(cls2)) {
                linkedHashSet.add(cls2);
            }
        }
        return linkedHashSet;
    }

    private <T> Set<T> j(Class<T> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : this.e) {
            if (cls.isInstance(obj) && a(obj.getClass())) {
                linkedHashSet.add(cls.cast(obj));
            }
        }
        return linkedHashSet;
    }

    private Set<a> k(Class<?> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Class cls2 : i(cls)) {
            linkedHashSet.add(new a(cls2));
        }
        return linkedHashSet;
    }

    private Set<a> p(Class<?> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        q(cls, linkedHashSet);
        return linkedHashSet;
    }

    private void q(Class<?> cls, Set<a> set) {
        a.log(Level.CONFIG, "Searching for providers that implement: " + cls);
        Class<?>[] L = py3.u(cls, true).L();
        for (Class<?> cls2 : L) {
            if (a(cls2)) {
                a.log(Level.CONFIG, "    Provider found: " + cls2);
            }
        }
        for (Class<?> cls3 : L) {
            if (a(cls3)) {
                if (cls.isAssignableFrom(cls3)) {
                    set.add(new a(cls3, true));
                } else {
                    Logger logger = a;
                    Level level = Level.CONFIG;
                    StringBuilder G = wo1.G("Provider ");
                    G.append(cls3.getName());
                    G.append(" won't be used because its not assignable to ");
                    G.append(cls.getName());
                    G.append(". This might be caused by clashing ");
                    G.append("container-provided and application-bundled Jersey classes.");
                    logger.log(level, G.toString());
                }
            }
        }
    }

    public sv3 e() {
        return this.c;
    }

    public <T> List<T> f(Class<T> cls, Class<? extends T>[] clsArr) {
        LinkedList linkedList = new LinkedList();
        for (Class<? extends T> cls2 : clsArr) {
            Object d = d(cls2);
            if (d != null) {
                linkedList.add(cls.cast(d));
            }
        }
        return linkedList;
    }

    public <T> List<T> g(Class<T> cls, String[] strArr) {
        LinkedList linkedList = new LinkedList();
        for (String str : strArr) {
            try {
                Class<?> cls2 = (Class) AccessController.doPrivileged(jv3.e(str));
                if (cls.isAssignableFrom(cls2)) {
                    Object d = d(cls2);
                    if (d != null) {
                        linkedList.add(cls.cast(d));
                    }
                } else {
                    a.severe("The class " + str + " is not assignable to the class " + cls.getName() + ". This class is ignored.");
                }
            } catch (ClassNotFoundException unused) {
                a.severe("The class " + str + " could not be found. This class is ignored.");
            } catch (PrivilegedActionException e) {
                Throwable cause = e.getCause();
                if (cause instanceof ClassNotFoundException) {
                    a.severe("The class " + str + " could not be found. This class is ignored.");
                } else if (cause instanceof NoClassDefFoundError) {
                    a.severe(sx3.b(cause.getLocalizedMessage(), str, cls));
                } else if (cause instanceof ClassFormatError) {
                    a.severe(sx3.a(cause.getLocalizedMessage(), str, cls));
                } else {
                    a.severe(sx3.g(str, cls.getName(), cause.getLocalizedMessage()));
                }
            }
        }
        return linkedList;
    }

    public <T> Set<T> l(Class<T> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(j(cls));
        for (Class cls2 : i(cls)) {
            Object d = d(cls2);
            if (d != null) {
                linkedHashSet.add(cls.cast(d));
            }
        }
        return linkedHashSet;
    }

    public <T> void m(Class<T> cls, b bVar) {
        for (T t : j(cls)) {
            bVar.a(t);
        }
        for (a aVar : k(cls)) {
            Object c = c(aVar);
            if (c != null) {
                bVar.a(cls.cast(c));
            }
        }
    }

    public <T> Set<T> n(Class<T> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(j(cls));
        for (a aVar : h(cls)) {
            Object c = c(aVar);
            if (c != null) {
                linkedHashSet.add(cls.cast(c));
            }
        }
        return linkedHashSet;
    }

    public <T> void o(Class<T> cls, b bVar) {
        for (T t : j(cls)) {
            bVar.a(t);
        }
        for (a aVar : h(cls)) {
            Object c = c(aVar);
            if (c != null) {
                bVar.a(cls.cast(c));
            }
        }
    }

    public <T> Set<T> r(Class<T> cls) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (a aVar : p(cls)) {
            Object c = c(aVar);
            if (c != null) {
                linkedHashSet.add(cls.cast(c));
            }
        }
        return linkedHashSet;
    }

    public void s(Set<Class<?>> set, Set<?> set2, hw3 hw3Var) {
        Set b2 = b(this.d, set);
        Set b3 = b(this.e, set2);
        this.d.clear();
        this.d.addAll(set);
        this.e.clear();
        this.e.addAll(set2);
        tv3 tv3Var = new tv3(this.c, b2, b3);
        hw3 hw3Var2 = new hw3();
        hw3Var2.h(tv3Var);
        hw3Var.m(hw3Var2);
    }

    public tv3(Class<? extends fy3> cls, sv3 sv3Var, Set<Class<?>> set, Set<?> set2) {
        this.b = cls;
        this.c = sv3Var;
        this.d = set;
        this.e = set2;
    }

    /* compiled from: ProviderServices.java */
    /* loaded from: classes3.dex */
    public class a {
        public final boolean a;
        public final Class b;

        public a(Class cls) {
            this.b = cls;
            this.a = false;
        }

        public a(Class cls, boolean z) {
            this.b = cls;
            this.a = z;
        }
    }
}
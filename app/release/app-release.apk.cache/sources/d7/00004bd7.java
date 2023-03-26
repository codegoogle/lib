package com.p7700g.p99005;

import com.p7700g.p99005.t35;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: TypeIntrinsics.java */
/* loaded from: classes3.dex */
public class k35 {
    public static int A(Object obj) {
        if (obj instanceof v15) {
            return ((v15) obj).i();
        }
        if (obj instanceof uz4) {
            return 0;
        }
        if (obj instanceof f05) {
            return 1;
        }
        if (obj instanceof j05) {
            return 2;
        }
        if (obj instanceof k05) {
            return 3;
        }
        if (obj instanceof l05) {
            return 4;
        }
        if (obj instanceof m05) {
            return 5;
        }
        if (obj instanceof n05) {
            return 6;
        }
        if (obj instanceof o05) {
            return 7;
        }
        if (obj instanceof p05) {
            return 8;
        }
        if (obj instanceof q05) {
            return 9;
        }
        if (obj instanceof vz4) {
            return 10;
        }
        if (obj instanceof wz4) {
            return 11;
        }
        if (obj instanceof xz4) {
            return 12;
        }
        if (obj instanceof yz4) {
            return 13;
        }
        if (obj instanceof zz4) {
            return 14;
        }
        if (obj instanceof a05) {
            return 15;
        }
        if (obj instanceof b05) {
            return 16;
        }
        if (obj instanceof c05) {
            return 17;
        }
        if (obj instanceof d05) {
            return 18;
        }
        if (obj instanceof e05) {
            return 19;
        }
        if (obj instanceof g05) {
            return 20;
        }
        if (obj instanceof h05) {
            return 21;
        }
        return obj instanceof i05 ? 22 : -1;
    }

    public static boolean B(Object obj, int i) {
        return (obj instanceof io4) && A(obj) == i;
    }

    public static boolean C(Object obj) {
        return (obj instanceof Collection) && (!(obj instanceof n35) || (obj instanceof o35));
    }

    public static boolean D(Object obj) {
        return (obj instanceof Iterable) && (!(obj instanceof n35) || (obj instanceof p35));
    }

    public static boolean E(Object obj) {
        return (obj instanceof Iterator) && (!(obj instanceof n35) || (obj instanceof q35));
    }

    public static boolean F(Object obj) {
        return (obj instanceof List) && (!(obj instanceof n35) || (obj instanceof r35));
    }

    public static boolean G(Object obj) {
        return (obj instanceof ListIterator) && (!(obj instanceof n35) || (obj instanceof s35));
    }

    public static boolean H(Object obj) {
        return (obj instanceof Map) && (!(obj instanceof n35) || (obj instanceof t35));
    }

    public static boolean I(Object obj) {
        return (obj instanceof Map.Entry) && (!(obj instanceof n35) || (obj instanceof t35.a));
    }

    public static boolean J(Object obj) {
        return (obj instanceof Set) && (!(obj instanceof n35) || (obj instanceof u35));
    }

    private static <T extends Throwable> T K(T t) {
        return (T) c25.B(t, k35.class.getName());
    }

    public static ClassCastException L(ClassCastException classCastException) {
        throw ((ClassCastException) K(classCastException));
    }

    public static void M(Object obj, String str) {
        String name = obj == null ? pg1.d : obj.getClass().getName();
        N(name + " cannot be cast to " + str);
    }

    public static void N(String str) {
        throw L(new ClassCastException(str));
    }

    public static Collection a(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof o35)) {
            M(obj, "kotlin.collections.MutableCollection");
        }
        return s(obj);
    }

    public static Collection b(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof o35)) {
            N(str);
        }
        return s(obj);
    }

    public static Iterable c(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof p35)) {
            M(obj, "kotlin.collections.MutableIterable");
        }
        return t(obj);
    }

    public static Iterable d(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof p35)) {
            N(str);
        }
        return t(obj);
    }

    public static Iterator e(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof q35)) {
            M(obj, "kotlin.collections.MutableIterator");
        }
        return u(obj);
    }

    public static Iterator f(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof q35)) {
            N(str);
        }
        return u(obj);
    }

    public static List g(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof r35)) {
            M(obj, "kotlin.collections.MutableList");
        }
        return v(obj);
    }

    public static List h(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof r35)) {
            N(str);
        }
        return v(obj);
    }

    public static ListIterator i(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof s35)) {
            M(obj, "kotlin.collections.MutableListIterator");
        }
        return w(obj);
    }

    public static ListIterator j(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof s35)) {
            N(str);
        }
        return w(obj);
    }

    public static Map k(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof t35)) {
            M(obj, "kotlin.collections.MutableMap");
        }
        return x(obj);
    }

    public static Map l(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof t35)) {
            N(str);
        }
        return x(obj);
    }

    public static Map.Entry m(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof t35.a)) {
            M(obj, "kotlin.collections.MutableMap.MutableEntry");
        }
        return y(obj);
    }

    public static Map.Entry n(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof t35.a)) {
            N(str);
        }
        return y(obj);
    }

    public static Set o(Object obj) {
        if ((obj instanceof n35) && !(obj instanceof u35)) {
            M(obj, "kotlin.collections.MutableSet");
        }
        return z(obj);
    }

    public static Set p(Object obj, String str) {
        if ((obj instanceof n35) && !(obj instanceof u35)) {
            N(str);
        }
        return z(obj);
    }

    public static Object q(Object obj, int i) {
        if (obj != null && !B(obj, i)) {
            M(obj, "kotlin.jvm.functions.Function" + i);
        }
        return obj;
    }

    public static Object r(Object obj, int i, String str) {
        if (obj != null && !B(obj, i)) {
            N(str);
        }
        return obj;
    }

    public static Collection s(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Iterable t(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Iterator u(Object obj) {
        try {
            return (Iterator) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static List v(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static ListIterator w(Object obj) {
        try {
            return (ListIterator) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Map x(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Map.Entry y(Object obj) {
        try {
            return (Map.Entry) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }

    public static Set z(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw L(e);
        }
    }
}
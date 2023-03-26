package com.p7700g.p99005;

import com.p7700g.p99005.em3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.tj3;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: OSTriggerController.java */
/* loaded from: classes3.dex */
public class fm3 {
    public tj3 a;
    private final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();

    /* compiled from: OSTriggerController.java */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            em3.b.values();
            int[] iArr = new int[9];
            a = iArr;
            try {
                iArr[em3.b.EQUAL_TO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[em3.b.NOT_EQUAL_TO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[em3.b.EXISTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[em3.b.CONTAINS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[em3.b.NOT_EXISTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[em3.b.LESS_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[em3.b.GREATER_THAN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[em3.b.LESS_THAN_OR_EQUAL_TO.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[em3.b.GREATER_THAN_OR_EQUAL_TO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public fm3(tj3.c cVar) {
        this.a = new tj3(cVar);
    }

    private boolean b(@x1 ArrayList<em3> arrayList) {
        Iterator<em3> it = arrayList.iterator();
        while (it.hasNext()) {
            if (!d(it.next())) {
                return false;
            }
        }
        return true;
    }

    private boolean d(@x1 em3 em3Var) {
        em3.a aVar = em3Var.b;
        if (aVar == em3.a.UNKNOWN) {
            return false;
        }
        if (aVar != em3.a.CUSTOM) {
            return this.a.c(em3Var);
        }
        em3.b bVar = em3Var.d;
        Object obj = this.b.get(em3Var.c);
        if (obj == null) {
            if (bVar == em3.b.NOT_EXISTS) {
                return true;
            }
            return bVar == em3.b.NOT_EQUAL_TO && em3Var.e != null;
        } else if (bVar == em3.b.EXISTS) {
            return true;
        } else {
            if (bVar == em3.b.NOT_EXISTS) {
                return false;
            }
            if (bVar == em3.b.CONTAINS) {
                return (obj instanceof Collection) && ((Collection) obj).contains(em3Var.e);
            }
            if (obj instanceof String) {
                Object obj2 = em3Var.e;
                if ((obj2 instanceof String) && m((String) obj2, (String) obj, bVar)) {
                    return true;
                }
            }
            Object obj3 = em3Var.e;
            return ((obj3 instanceof Number) && (obj instanceof Number) && k((Number) obj3, (Number) obj, bVar)) || j(em3Var.e, obj, bVar);
        }
    }

    private boolean j(@z1 Object obj, @x1 Object obj2, @x1 em3.b bVar) {
        if (obj == null) {
            return false;
        }
        if (bVar.f()) {
            String obj3 = obj.toString();
            String obj4 = obj2.toString();
            if (obj2 instanceof Number) {
                obj4 = new DecimalFormat("0.#").format(obj2);
            }
            return m(obj3, obj4, bVar);
        } else if ((obj2 instanceof String) && (obj instanceof Number)) {
            return l((Number) obj, (String) obj2, bVar);
        } else {
            return false;
        }
    }

    private boolean k(@x1 Number number, @x1 Number number2, @x1 em3.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (bVar.ordinal()) {
            case 0:
                return doubleValue2 > doubleValue;
            case 1:
                return doubleValue2 < doubleValue;
            case 2:
                return doubleValue2 == doubleValue;
            case 3:
                return doubleValue2 != doubleValue;
            case 4:
                return doubleValue2 < doubleValue || doubleValue2 == doubleValue;
            case 5:
                int i = (doubleValue2 > doubleValue ? 1 : (doubleValue2 == doubleValue ? 0 : -1));
                return i > 0 || i == 0;
            case 6:
            case 7:
            case 8:
                jm3.u0 u0Var = jm3.u0.ERROR;
                StringBuilder G = wo1.G("Attempted to use an invalid operator with a numeric value: ");
                G.append(bVar.toString());
                jm3.P1(u0Var, G.toString());
                return false;
            default:
                return false;
        }
    }

    private boolean l(@x1 Number number, @x1 String str, @x1 em3.b bVar) {
        try {
            return k(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private boolean m(@x1 String str, @x1 String str2, @x1 em3.b bVar) {
        int ordinal = bVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                jm3.u0 u0Var = jm3.u0.ERROR;
                StringBuilder G = wo1.G("Attempted to use an invalid operator for a string trigger comparison: ");
                G.append(bVar.toString());
                jm3.P1(u0Var, G.toString());
                return false;
            }
            return !str.equals(str2);
        }
        return str.equals(str2);
    }

    public void a(Map<String, Object> map) {
        synchronized (this.b) {
            for (String str : map.keySet()) {
                this.b.put(str, map.get(str));
            }
        }
    }

    public boolean c(@x1 gk3 gk3Var) {
        if (gk3Var.l.size() == 0) {
            return true;
        }
        Iterator<ArrayList<em3>> it = gk3Var.l.iterator();
        while (it.hasNext()) {
            if (b(it.next())) {
                return true;
            }
        }
        return false;
    }

    @z1
    public Object e(String str) {
        synchronized (this.b) {
            if (this.b.containsKey(str)) {
                return this.b.get(str);
            }
            return null;
        }
    }

    public ConcurrentHashMap<String, Object> f() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean g(gk3 gk3Var, Collection<String> collection) {
        if (gk3Var.l == null) {
            return false;
        }
        for (String str : collection) {
            Iterator<ArrayList<em3>> it = gk3Var.l.iterator();
            while (it.hasNext()) {
                Iterator<em3> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    em3 next = it2.next();
                    if (str.equals(next.c) || str.equals(next.a)) {
                        return true;
                    }
                    while (it2.hasNext()) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(gk3 gk3Var) {
        ArrayList<ArrayList<em3>> arrayList = gk3Var.l;
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        Iterator<ArrayList<em3>> it = gk3Var.l.iterator();
        while (it.hasNext()) {
            Iterator<em3> it2 = it.next().iterator();
            while (it2.hasNext()) {
                em3.a aVar = it2.next().b;
                if (aVar == em3.a.CUSTOM || aVar == em3.a.UNKNOWN) {
                    return false;
                }
                while (it2.hasNext()) {
                }
            }
        }
        return true;
    }

    public void i(Collection<String> collection) {
        synchronized (this.b) {
            for (String str : collection) {
                this.b.remove(str);
            }
        }
    }
}
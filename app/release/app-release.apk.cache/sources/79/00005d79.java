package com.p7700g.p99005;

import com.p7700g.p99005.a54;
import com.p7700g.p99005.d54;
import com.p7700g.p99005.g54;
import com.p7700g.p99005.n04;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Spliterator;

/* compiled from: AbstractTree.java */
/* loaded from: classes3.dex */
public abstract class t44<E extends n04> implements d54.a<E> {
    private static final long s = 1;
    public static ResourceBundle t;
    public g54<E> u;

    static {
        String str = d14.class.getPackage().getName() + ".IPAddressResources";
        try {
            t = ResourceBundle.getBundle(str);
        } catch (MissingResourceException unused) {
            System.err.println("bundle " + str + " is missing");
        }
    }

    public t44(g54<E> g54Var) {
        this.u = g54Var;
    }

    public static <E extends n04> E a(E e, boolean z) {
        l24 o0;
        if (!e.z3()) {
            return !e.C0() ? e : (E) e.t0();
        } else if (e.b1()) {
            return e;
        } else {
            if (e instanceof p14) {
                o0 = ((p14) e).F2();
            } else {
                Integer X3 = e.X3();
                o0 = X3 == null ? null : e.o0(X3.intValue(), false);
            }
            if (o0 != null) {
                return (E) o0;
            }
            if (z) {
                throw new IllegalArgumentException(g("ipaddress.error.address.not.block"));
            }
            return null;
        }
    }

    public static String g(String str) {
        ResourceBundle resourceBundle = t;
        if (resourceBundle != null) {
            try {
                return resourceBundle.getString(str);
            } catch (MissingResourceException unused) {
                return str;
            }
        }
        return str;
    }

    @Override // com.p7700g.p99005.d54
    public /* synthetic */ a54.g O2(n04 n04Var) {
        return c54.a(this, n04Var);
    }

    @Override // com.p7700g.p99005.o54
    public /* synthetic */ Spliterator c3() {
        return n54.b(this);
    }

    public void clear() {
        h().clear();
    }

    @Override // com.p7700g.p99005.o54
    public Iterator<E> descendingIterator() {
        return new g54.h(q(false));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t44) {
            t44 t44Var = (t44) obj;
            if (t44Var.size() != size()) {
                return false;
            }
            Iterator<? extends a54.g<E>> q = q(true);
            Iterator<? extends a54.g<E>> q2 = t44Var.q(true);
            while (q.hasNext()) {
                if (!q.next().equals((g54) q2.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // 
    /* renamed from: f */
    public t44<E> clone() {
        try {
            return (t44) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public g54<E> h() {
        return this.u;
    }

    public int hashCode() {
        Iterator<? extends a54.g<E>> q = q(true);
        int i = 0;
        while (q.hasNext()) {
            i += q.next().hashCode();
        }
        return i;
    }

    public int i() {
        return h().i3();
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.p7700g.p99005.o54, java.lang.Iterable
    public Iterator<E> iterator() {
        return new g54.h(q(true));
    }

    public String n(boolean z) {
        return h().n4(true, true);
    }

    public int size() {
        return h().size();
    }

    @Override // com.p7700g.p99005.o54, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return n54.d(this);
    }

    public String toString() {
        return n(true);
    }
}
package com.p7700g.p99005;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: Partition.java */
/* loaded from: classes3.dex */
public class m54<E> {
    public final E a;
    public final E b;
    public final Iterator<? extends E> c;
    public final BigInteger d;

    public m54(E e) {
        this.d = BigInteger.ONE;
        this.b = e;
        this.c = null;
        this.a = e;
    }

    public static n04 b(n04 n04Var) {
        return t44.a(n04Var, false);
    }

    public static /* synthetic */ void d(Function function, TreeMap treeMap, Object obj) {
        Object apply = function.apply(obj);
        if (apply != null) {
            treeMap.put(obj, apply);
        }
    }

    public static /* synthetic */ boolean e(Predicate predicate, Object obj) {
        return !predicate.test(obj);
    }

    public static m54 f(z04 z04Var) {
        if (!z04Var.z3()) {
            if (!z04Var.C0()) {
                return new m54(z04Var);
            }
            return new m54(z04Var, z04Var.t0());
        } else if (z04Var.b1()) {
            return new m54(z04Var);
        } else {
            if (z04Var instanceof p14) {
                p14 g2 = ((p14) z04Var).g2();
                if (g2.L0().intValue() != z04Var.A0()) {
                    return new m54(z04Var, g2.F0(), g2.h1(g2.L0().intValue()));
                }
            } else {
                int b3 = z04Var.b3();
                if (b3 != z04Var.A0()) {
                    z04 o0 = z04Var.o0(b3, false);
                    return new m54(z04Var, o0.F0(), o0.h1(o0.L0().intValue()));
                }
            }
            return new m54(z04Var, z04Var.t0().iterator(), z04Var.getCount());
        }
    }

    public static m54 g(j14 j14Var) {
        if (!j14Var.z3()) {
            if (!j14Var.C0()) {
                return new m54(j14Var);
            }
            return new m54(j14Var, j14Var.t0());
        } else if (j14Var.b1()) {
            return new m54(j14Var);
        } else {
            j14[] i1 = j14Var.i1();
            return new m54(j14Var, (Iterator<? extends j14>) Arrays.asList(i1).iterator(), i1.length);
        }
    }

    public <R> Map<E, R> a(final Function<? super E, ? extends R> function) {
        final TreeMap treeMap = new TreeMap();
        c(new Consumer() { // from class: com.p7700g.p99005.k44
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                m54.d(function, treeMap, obj);
            }
        });
        return treeMap;
    }

    public void c(Consumer<? super E> consumer) {
        Iterator<? extends E> it = this.c;
        if (it == null) {
            consumer.accept((E) this.b);
            return;
        }
        while (it.hasNext()) {
            consumer.accept((E) it.next());
        }
    }

    public boolean h(Predicate<? super E> predicate) {
        return i(predicate, false);
    }

    public boolean i(final Predicate<? super E> predicate, boolean z) {
        return !k(new Predicate() { // from class: com.p7700g.p99005.l44
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return m54.e(predicate, obj);
            }
        }, z);
    }

    public boolean j(Predicate<? super E> predicate) {
        return k(predicate, false);
    }

    public boolean k(Predicate<? super E> predicate, boolean z) {
        Iterator<? extends E> it = this.c;
        if (it == null) {
            return predicate.test((E) this.b);
        }
        boolean z2 = true;
        while (it.hasNext()) {
            if (!predicate.test((E) it.next())) {
                z2 = false;
                if (z) {
                    break;
                }
            }
        }
        return z2;
    }

    public m54(E e, E e2) {
        this.d = BigInteger.ONE;
        this.b = e2;
        this.c = null;
        this.a = e;
    }

    public m54(E e, Iterator<? extends E> it, BigInteger bigInteger) {
        this.d = bigInteger;
        this.b = null;
        this.c = it;
        this.a = e;
    }

    public m54(E e, Iterator<? extends E> it, int i) {
        this.d = BigInteger.valueOf(i);
        this.b = null;
        this.c = it;
        this.a = e;
    }
}
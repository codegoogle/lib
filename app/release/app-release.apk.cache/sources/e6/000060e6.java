package com.p7700g.p99005;

import android.text.TextUtils;
import java.math.BigInteger;
import java.net.Inet6Address;
import java.util.Collection;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/* compiled from: NetworkSpace.java */
/* loaded from: classes3.dex */
public class uy3 {
    @x1
    public Set<a> a = new TreeSet();

    public void a(@x1 sy3 sy3Var, boolean z) {
        this.a.add(new a(sy3Var, z));
    }

    public void b(@x1 Inet6Address inet6Address, int i, boolean z) {
        this.a.add(new a(inet6Address, i, z));
    }

    public void c() {
        this.a.clear();
    }

    @x1
    public Set<a> d() {
        PriorityQueue priorityQueue = new PriorityQueue(this.a);
        TreeSet treeSet = new TreeSet();
        a aVar = (a) priorityQueue.poll();
        if (aVar == null) {
            return treeSet;
        }
        while (aVar != null) {
            a aVar2 = (a) priorityQueue.poll();
            if (aVar2 != null && aVar.g().compareTo(aVar2.d()) != -1) {
                if (!aVar.d().equals(aVar2.d()) || aVar.s < aVar2.s) {
                    if (aVar.u != aVar2.u) {
                        a[] i = aVar.i();
                        if (i[1].s == aVar2.s) {
                            priorityQueue.add(aVar2);
                        } else {
                            priorityQueue.add(i[1]);
                            priorityQueue.add(aVar2);
                        }
                        aVar = i[0];
                    }
                } else if (aVar.u != aVar2.u) {
                    a[] i2 = aVar2.i();
                    if (!priorityQueue.contains(i2[1])) {
                        priorityQueue.add(i2[1]);
                    }
                    if (!i2[0].g().equals(aVar.g()) && !priorityQueue.contains(i2[0])) {
                        priorityQueue.add(i2[0]);
                    }
                }
            } else {
                treeSet.add(aVar);
            }
            aVar = aVar2;
        }
        return treeSet;
    }

    @x1
    public Collection<a> e(boolean z) {
        Vector vector = new Vector();
        for (a aVar : this.a) {
            if (aVar.u == z) {
                vector.add(aVar);
            }
        }
        return vector;
    }

    @x1
    public Collection<a> f() {
        Set<a> d = d();
        Vector vector = new Vector();
        for (a aVar : d) {
            if (aVar.u) {
                vector.add(aVar);
            }
        }
        return vector;
    }

    /* compiled from: NetworkSpace.java */
    /* loaded from: classes3.dex */
    public static class a implements Comparable<a> {
        public int s;
        private BigInteger t;
        private boolean u;
        private boolean v;
        private BigInteger w;
        private BigInteger x;

        public a(sy3 sy3Var, boolean z) {
            this.u = z;
            this.t = BigInteger.valueOf(sy3Var.b());
            this.s = sy3Var.b;
            this.v = true;
        }

        private BigInteger h(boolean z) {
            int i;
            BigInteger bigInteger = this.t;
            if (this.v) {
                i = 32 - this.s;
            } else {
                i = 128 - this.s;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (z) {
                    bigInteger = bigInteger.setBit(i2);
                } else {
                    bigInteger = bigInteger.clearBit(i2);
                }
            }
            return bigInteger;
        }

        @Override // java.lang.Comparable
        /* renamed from: b */
        public int compareTo(@x1 a aVar) {
            int compareTo = d().compareTo(aVar.d());
            if (compareTo != 0) {
                return compareTo;
            }
            int i = this.s;
            int i2 = aVar.s;
            if (i > i2) {
                return -1;
            }
            return i2 == i ? 0 : 1;
        }

        public boolean c(@x1 a aVar) {
            return (d().compareTo(aVar.d()) == 1 || g().compareTo(aVar.g()) == -1) ? false : true;
        }

        public BigInteger d() {
            if (this.w == null) {
                this.w = h(false);
            }
            return this.w;
        }

        @x1
        public String e() {
            long longValue = this.t.longValue();
            return String.format(Locale.US, "%d.%d.%d.%d", Long.valueOf((longValue >> 24) % 256), Long.valueOf((longValue >> 16) % 256), Long.valueOf((longValue >> 8) % 256), Long.valueOf(longValue % 256));
        }

        public String f() {
            BigInteger bigInteger = this.t;
            if (bigInteger.longValue() == 0) {
                return "::";
            }
            Vector vector = new Vector();
            while (bigInteger.compareTo(BigInteger.ZERO) == 1) {
                vector.add(0, String.format(Locale.US, "%x", Long.valueOf(bigInteger.mod(BigInteger.valueOf(256L)).longValue())));
                bigInteger = bigInteger.shiftRight(16);
            }
            return TextUtils.join(":", vector);
        }

        public BigInteger g() {
            if (this.x == null) {
                this.x = h(true);
            }
            return this.x;
        }

        @x1
        public a[] i() {
            a aVar = new a(d(), this.s + 1, this.u, this.v);
            return new a[]{aVar, new a(aVar.g().add(BigInteger.ONE), this.s + 1, this.u, this.v)};
        }

        @x1
        public String toString() {
            return this.v ? String.format(Locale.US, "%s/%d", e(), Integer.valueOf(this.s)) : String.format(Locale.US, "%s/%d", f(), Integer.valueOf(this.s));
        }

        public a(Inet6Address inet6Address, int i, boolean z) {
            byte[] address;
            this.s = i;
            this.u = z;
            this.t = BigInteger.ZERO;
            int length = inet6Address.getAddress().length;
            int i2 = 128;
            for (int i3 = 0; i3 < length; i3++) {
                i2 -= 16;
                this.t = this.t.add(BigInteger.valueOf(address[i3]).shiftLeft(i2));
            }
        }

        public a(BigInteger bigInteger, int i, boolean z, boolean z2) {
            this.t = bigInteger;
            this.s = i;
            this.u = z;
            this.v = z2;
        }
    }
}
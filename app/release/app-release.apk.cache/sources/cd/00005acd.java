package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: JsonArray.java */
/* loaded from: classes3.dex */
public final class rv2 extends uv2 implements Iterable<uv2> {
    private final List<uv2> s;

    public rv2() {
        this.s = new ArrayList();
    }

    public void E(uv2 uv2Var) {
        if (uv2Var == null) {
            uv2Var = wv2.a;
        }
        this.s.add(uv2Var);
    }

    public void G(Boolean bool) {
        this.s.add(bool == null ? wv2.a : new aw2(bool));
    }

    public void H(Character ch) {
        this.s.add(ch == null ? wv2.a : new aw2(ch));
    }

    public void I(Number number) {
        this.s.add(number == null ? wv2.a : new aw2(number));
    }

    public void J(String str) {
        this.s.add(str == null ? wv2.a : new aw2(str));
    }

    public void L(rv2 rv2Var) {
        this.s.addAll(rv2Var.s);
    }

    public boolean M(uv2 uv2Var) {
        return this.s.contains(uv2Var);
    }

    @Override // com.p7700g.p99005.uv2
    /* renamed from: N */
    public rv2 a() {
        if (!this.s.isEmpty()) {
            rv2 rv2Var = new rv2(this.s.size());
            for (uv2 uv2Var : this.s) {
                rv2Var.E(uv2Var.a());
            }
            return rv2Var;
        }
        return new rv2();
    }

    public uv2 O(int i) {
        return this.s.get(i);
    }

    public uv2 P(int i) {
        return this.s.remove(i);
    }

    public boolean Q(uv2 uv2Var) {
        return this.s.remove(uv2Var);
    }

    public uv2 R(int i, uv2 uv2Var) {
        return this.s.set(i, uv2Var);
    }

    @Override // com.p7700g.p99005.uv2
    public BigDecimal b() {
        if (this.s.size() == 1) {
            return this.s.get(0).b();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public BigInteger c() {
        if (this.s.size() == 1) {
            return this.s.get(0).c();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public boolean d() {
        if (this.s.size() == 1) {
            return this.s.get(0).d();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public byte e() {
        if (this.s.size() == 1) {
            return this.s.get(0).e();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof rv2) && ((rv2) obj).s.equals(this.s));
    }

    @Override // com.p7700g.p99005.uv2
    @Deprecated
    public char f() {
        if (this.s.size() == 1) {
            return this.s.get(0).f();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public double g() {
        if (this.s.size() == 1) {
            return this.s.get(0).g();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public float h() {
        if (this.s.size() == 1) {
            return this.s.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.s.hashCode();
    }

    @Override // com.p7700g.p99005.uv2
    public int i() {
        if (this.s.size() == 1) {
            return this.s.get(0).i();
        }
        throw new IllegalStateException();
    }

    public boolean isEmpty() {
        return this.s.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<uv2> iterator() {
        return this.s.iterator();
    }

    public int size() {
        return this.s.size();
    }

    @Override // com.p7700g.p99005.uv2
    public long t() {
        if (this.s.size() == 1) {
            return this.s.get(0).t();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public Number u() {
        if (this.s.size() == 1) {
            return this.s.get(0).u();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public short x() {
        if (this.s.size() == 1) {
            return this.s.get(0).x();
        }
        throw new IllegalStateException();
    }

    @Override // com.p7700g.p99005.uv2
    public String y() {
        if (this.s.size() == 1) {
            return this.s.get(0).y();
        }
        throw new IllegalStateException();
    }

    public rv2(int i) {
        this.s = new ArrayList(i);
    }
}
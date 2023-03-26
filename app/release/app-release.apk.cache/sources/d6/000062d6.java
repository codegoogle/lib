package com.p7700g.p99005;

import java.io.Serializable;

/* compiled from: FunctionImpl.java */
@xn4(level = zn4.ERROR, message = "This class is no longer supported, do not use it.")
@Deprecated
/* loaded from: classes3.dex */
public abstract class w15 implements io4, Serializable, uz4, f05, j05, k05, l05, m05, n05, o05, p05, q05, vz4, wz4, xz4, yz4, zz4, a05, b05, c05, d05, e05, g05, h05, i05 {
    private void b(int i) {
        if (i() != i) {
            m(i);
        }
    }

    private void m(int i) {
        StringBuilder H = wo1.H("Wrong function arity, expected: ", i, ", actual: ");
        H.append(i());
        throw new IllegalStateException(H.toString());
    }

    @Override // com.p7700g.p99005.m05
    public Object E3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b(5);
        return h(obj, obj2, obj3, obj4, obj5);
    }

    @Override // com.p7700g.p99005.k05
    public Object I(Object obj, Object obj2, Object obj3) {
        b(3);
        return h(obj, obj2, obj3);
    }

    @Override // com.p7700g.p99005.h05
    public Object I3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        b(21);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // com.p7700g.p99005.xz4
    public Object L(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        b(12);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // com.p7700g.p99005.f05
    public Object M(Object obj) {
        b(1);
        return h(obj);
    }

    @Override // com.p7700g.p99005.e05
    public Object P(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        b(19);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // com.p7700g.p99005.b05
    public Object Q(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        b(16);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // com.p7700g.p99005.o05
    public Object S3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        b(7);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    @Override // com.p7700g.p99005.vz4
    public Object U3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        b(10);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // com.p7700g.p99005.i05
    public Object X2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        b(22);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }

    @Override // com.p7700g.p99005.l05
    public Object Z(Object obj, Object obj2, Object obj3, Object obj4) {
        b(4);
        return h(obj, obj2, obj3, obj4);
    }

    @Override // com.p7700g.p99005.wz4
    public Object c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        b(11);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // com.p7700g.p99005.g05
    public Object d1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        b(20);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // com.p7700g.p99005.yz4
    public Object d3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        b(13);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // com.p7700g.p99005.d05
    public Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        b(18);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    public Object h(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    public abstract int i();

    @Override // com.p7700g.p99005.n05
    public Object k3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        b(6);
        return h(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // com.p7700g.p99005.zz4
    public Object n3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        b(14);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // com.p7700g.p99005.c05
    public Object p3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        b(17);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // com.p7700g.p99005.a05
    public Object p4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        b(15);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // com.p7700g.p99005.j05
    public Object w3(Object obj, Object obj2) {
        b(2);
        return h(obj, obj2);
    }

    @Override // com.p7700g.p99005.uz4
    public Object x() {
        b(0);
        return h(new Object[0]);
    }

    @Override // com.p7700g.p99005.p05
    public Object x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        b(8);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // com.p7700g.p99005.q05
    public Object x3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        b(9);
        return h(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }
}
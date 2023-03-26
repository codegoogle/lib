package net.openvpn.ovpn3;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class ClientAPI_LLVector extends AbstractList<Long> implements RandomAccess {
    private transient long s;
    public transient boolean t;

    public ClientAPI_LLVector(long j, boolean z) {
        this.t = z;
        this.s = j;
    }

    private void e(int i, long j) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_1(this.s, this, i, j);
    }

    private void f(long j) {
        ovpncliJNI.ClientAPI_LLVector_doAdd__SWIG_0(this.s, this, j);
    }

    private long g(int i) {
        return ovpncliJNI.ClientAPI_LLVector_doGet(this.s, this, i);
    }

    private long h(int i) {
        return ovpncliJNI.ClientAPI_LLVector_doRemove(this.s, this, i);
    }

    private void i(int i, int i2) {
        ovpncliJNI.ClientAPI_LLVector_doRemoveRange(this.s, this, i, i2);
    }

    private long m(int i, long j) {
        return ovpncliJNI.ClientAPI_LLVector_doSet(this.s, this, i, j);
    }

    private int n() {
        return ovpncliJNI.ClientAPI_LLVector_doSize(this.s, this);
    }

    public static long p(ClientAPI_LLVector clientAPI_LLVector) {
        if (clientAPI_LLVector == null) {
            return 0L;
        }
        return clientAPI_LLVector.s;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, Long l) {
        ((AbstractList) this).modCount++;
        e(i, l.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(Long l) {
        ((AbstractList) this).modCount++;
        f(l.longValue());
        return true;
    }

    public long c() {
        return ovpncliJNI.ClientAPI_LLVector_capacity(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ovpncliJNI.ClientAPI_LLVector_clear(this.s, this);
    }

    public synchronized void d() {
        long j = this.s;
        if (j != 0) {
            if (this.t) {
                this.t = false;
                ovpncliJNI.delete_ClientAPI_LLVector(j);
            }
            this.s = 0L;
        }
    }

    public void finalize() {
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_LLVector_isEmpty(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o */
    public Long get(int i) {
        return Long.valueOf(g(i));
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        i(i, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return n();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: t */
    public Long remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(h(i));
    }

    public void u(long j) {
        ovpncliJNI.ClientAPI_LLVector_reserve(this.s, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x */
    public Long set(int i, Long l) {
        return Long.valueOf(m(i, l.longValue()));
    }

    public ClientAPI_LLVector(long[] jArr) {
        this();
        u(jArr.length);
        for (long j : jArr) {
            add(Long.valueOf(j));
        }
    }

    public ClientAPI_LLVector(Iterable<Long> iterable) {
        this();
        for (Long l : iterable) {
            add(Long.valueOf(l.longValue()));
        }
    }

    public ClientAPI_LLVector() {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_0(), true);
    }

    public ClientAPI_LLVector(ClientAPI_LLVector clientAPI_LLVector) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_1(p(clientAPI_LLVector), clientAPI_LLVector), true);
    }

    public ClientAPI_LLVector(int i, long j) {
        this(ovpncliJNI.new_ClientAPI_LLVector__SWIG_2(i, j), true);
    }
}
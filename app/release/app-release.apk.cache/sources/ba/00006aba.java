package net.openvpn.ovpn3;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class ClientAPI_StringVec extends AbstractList<String> implements RandomAccess {
    private transient long s;
    public transient boolean t;

    public ClientAPI_StringVec(long j, boolean z) {
        this.t = z;
        this.s = j;
    }

    private void e(int i, String str) {
        ovpncliJNI.ClientAPI_StringVec_doAdd__SWIG_1(this.s, this, i, str);
    }

    private void f(String str) {
        ovpncliJNI.ClientAPI_StringVec_doAdd__SWIG_0(this.s, this, str);
    }

    private String g(int i) {
        return ovpncliJNI.ClientAPI_StringVec_doGet(this.s, this, i);
    }

    private String h(int i) {
        return ovpncliJNI.ClientAPI_StringVec_doRemove(this.s, this, i);
    }

    private void i(int i, int i2) {
        ovpncliJNI.ClientAPI_StringVec_doRemoveRange(this.s, this, i, i2);
    }

    private String m(int i, String str) {
        return ovpncliJNI.ClientAPI_StringVec_doSet(this.s, this, i, str);
    }

    private int n() {
        return ovpncliJNI.ClientAPI_StringVec_doSize(this.s, this);
    }

    public static long p(ClientAPI_StringVec clientAPI_StringVec) {
        if (clientAPI_StringVec == null) {
            return 0L;
        }
        return clientAPI_StringVec.s;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, String str) {
        ((AbstractList) this).modCount++;
        e(i, str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(String str) {
        ((AbstractList) this).modCount++;
        f(str);
        return true;
    }

    public long c() {
        return ovpncliJNI.ClientAPI_StringVec_capacity(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ovpncliJNI.ClientAPI_StringVec_clear(this.s, this);
    }

    public synchronized void d() {
        long j = this.s;
        if (j != 0) {
            if (this.t) {
                this.t = false;
                ovpncliJNI.delete_ClientAPI_StringVec(j);
            }
            this.s = 0L;
        }
    }

    public void finalize() {
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_StringVec_isEmpty(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o */
    public String get(int i) {
        return g(i);
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
    public String remove(int i) {
        ((AbstractList) this).modCount++;
        return h(i);
    }

    public void u(long j) {
        ovpncliJNI.ClientAPI_StringVec_reserve(this.s, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x */
    public String set(int i, String str) {
        return m(i, str);
    }

    public ClientAPI_StringVec(String[] strArr) {
        this();
        u(strArr.length);
        for (String str : strArr) {
            add(str);
        }
    }

    public ClientAPI_StringVec(Iterable<String> iterable) {
        this();
        for (String str : iterable) {
            add(str);
        }
    }

    public ClientAPI_StringVec() {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_0(), true);
    }

    public ClientAPI_StringVec(ClientAPI_StringVec clientAPI_StringVec) {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_1(p(clientAPI_StringVec), clientAPI_StringVec), true);
    }

    public ClientAPI_StringVec(int i, String str) {
        this(ovpncliJNI.new_ClientAPI_StringVec__SWIG_2(i, str), true);
    }
}
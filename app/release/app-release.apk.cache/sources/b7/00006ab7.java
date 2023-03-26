package net.openvpn.ovpn3;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public class ClientAPI_ServerEntryVector extends AbstractList<ClientAPI_ServerEntry> implements RandomAccess {
    private transient long s;
    public transient boolean t;

    public ClientAPI_ServerEntryVector(long j, boolean z) {
        this.t = z;
        this.s = j;
    }

    private void e(int i, ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doAdd__SWIG_1(this.s, this, i, ClientAPI_ServerEntry.b(clientAPI_ServerEntry), clientAPI_ServerEntry);
    }

    private void f(ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doAdd__SWIG_0(this.s, this, ClientAPI_ServerEntry.b(clientAPI_ServerEntry), clientAPI_ServerEntry);
    }

    private ClientAPI_ServerEntry g(int i) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doGet(this.s, this, i), false);
    }

    private ClientAPI_ServerEntry h(int i) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doRemove(this.s, this, i), true);
    }

    private void i(int i, int i2) {
        ovpncliJNI.ClientAPI_ServerEntryVector_doRemoveRange(this.s, this, i, i2);
    }

    private ClientAPI_ServerEntry m(int i, ClientAPI_ServerEntry clientAPI_ServerEntry) {
        return new ClientAPI_ServerEntry(ovpncliJNI.ClientAPI_ServerEntryVector_doSet(this.s, this, i, ClientAPI_ServerEntry.b(clientAPI_ServerEntry), clientAPI_ServerEntry), true);
    }

    private int n() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_doSize(this.s, this);
    }

    public static long p(ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        if (clientAPI_ServerEntryVector == null) {
            return 0L;
        }
        return clientAPI_ServerEntryVector.s;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ((AbstractList) this).modCount++;
        e(i, clientAPI_ServerEntry);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: b */
    public boolean add(ClientAPI_ServerEntry clientAPI_ServerEntry) {
        ((AbstractList) this).modCount++;
        f(clientAPI_ServerEntry);
        return true;
    }

    public long c() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_capacity(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ovpncliJNI.ClientAPI_ServerEntryVector_clear(this.s, this);
    }

    public synchronized void d() {
        long j = this.s;
        if (j != 0) {
            if (this.t) {
                this.t = false;
                ovpncliJNI.delete_ClientAPI_ServerEntryVector(j);
            }
            this.s = 0L;
        }
    }

    public void finalize() {
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ovpncliJNI.ClientAPI_ServerEntryVector_isEmpty(this.s, this);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o */
    public ClientAPI_ServerEntry get(int i) {
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
    public ClientAPI_ServerEntry remove(int i) {
        ((AbstractList) this).modCount++;
        return h(i);
    }

    public void u(long j) {
        ovpncliJNI.ClientAPI_ServerEntryVector_reserve(this.s, this, j);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: x */
    public ClientAPI_ServerEntry set(int i, ClientAPI_ServerEntry clientAPI_ServerEntry) {
        return m(i, clientAPI_ServerEntry);
    }

    public ClientAPI_ServerEntryVector(ClientAPI_ServerEntry[] clientAPI_ServerEntryArr) {
        this();
        u(clientAPI_ServerEntryArr.length);
        for (ClientAPI_ServerEntry clientAPI_ServerEntry : clientAPI_ServerEntryArr) {
            add(clientAPI_ServerEntry);
        }
    }

    public ClientAPI_ServerEntryVector(Iterable<ClientAPI_ServerEntry> iterable) {
        this();
        for (ClientAPI_ServerEntry clientAPI_ServerEntry : iterable) {
            add(clientAPI_ServerEntry);
        }
    }

    public ClientAPI_ServerEntryVector() {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_0(), true);
    }

    public ClientAPI_ServerEntryVector(ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_1(p(clientAPI_ServerEntryVector), clientAPI_ServerEntryVector), true);
    }

    public ClientAPI_ServerEntryVector(int i, ClientAPI_ServerEntry clientAPI_ServerEntry) {
        this(ovpncliJNI.new_ClientAPI_ServerEntryVector__SWIG_2(i, ClientAPI_ServerEntry.b(clientAPI_ServerEntry), clientAPI_ServerEntry), true);
    }
}
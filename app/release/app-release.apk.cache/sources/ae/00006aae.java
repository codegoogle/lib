package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_InterfaceStats {
    private transient long a;
    public transient boolean b;

    public ClientAPI_InterfaceStats(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long d(ClientAPI_InterfaceStats clientAPI_InterfaceStats) {
        if (clientAPI_InterfaceStats == null) {
            return 0L;
        }
        return clientAPI_InterfaceStats.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_InterfaceStats(j);
            }
            this.a = 0L;
        }
    }

    public long b() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_get(this.a, this);
    }

    public long c() {
        return ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_get(this.a, this);
    }

    public long e() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_get(this.a, this);
    }

    public long f() {
        return ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public long g() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_get(this.a, this);
    }

    public long h() {
        return ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_get(this.a, this);
    }

    public void i(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesIn_set(this.a, this, j);
    }

    public void j(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_bytesOut_set(this.a, this, j);
    }

    public void k(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsIn_set(this.a, this, j);
    }

    public void l(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_errorsOut_set(this.a, this, j);
    }

    public void m(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsIn_set(this.a, this, j);
    }

    public void n(long j) {
        ovpncliJNI.ClientAPI_InterfaceStats_packetsOut_set(this.a, this, j);
    }

    public ClientAPI_InterfaceStats() {
        this(ovpncliJNI.new_ClientAPI_InterfaceStats(), true);
    }
}
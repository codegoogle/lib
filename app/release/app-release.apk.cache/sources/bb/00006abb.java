package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_TransportStats {
    private transient long a;
    public transient boolean b;

    public ClientAPI_TransportStats(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long d(ClientAPI_TransportStats clientAPI_TransportStats) {
        if (clientAPI_TransportStats == null) {
            return 0L;
        }
        return clientAPI_TransportStats.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_TransportStats(j);
            }
            this.a = 0L;
        }
    }

    public long b() {
        return ovpncliJNI.ClientAPI_TransportStats_bytesIn_get(this.a, this);
    }

    public long c() {
        return ovpncliJNI.ClientAPI_TransportStats_bytesOut_get(this.a, this);
    }

    public int e() {
        return ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_get(this.a, this);
    }

    public long f() {
        return ovpncliJNI.ClientAPI_TransportStats_packetsIn_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public long g() {
        return ovpncliJNI.ClientAPI_TransportStats_packetsOut_get(this.a, this);
    }

    public void h(long j) {
        ovpncliJNI.ClientAPI_TransportStats_bytesIn_set(this.a, this, j);
    }

    public void i(long j) {
        ovpncliJNI.ClientAPI_TransportStats_bytesOut_set(this.a, this, j);
    }

    public void j(int i) {
        ovpncliJNI.ClientAPI_TransportStats_lastPacketReceived_set(this.a, this, i);
    }

    public void k(long j) {
        ovpncliJNI.ClientAPI_TransportStats_packetsIn_set(this.a, this, j);
    }

    public void l(long j) {
        ovpncliJNI.ClientAPI_TransportStats_packetsOut_set(this.a, this, j);
    }

    public ClientAPI_TransportStats() {
        this(ovpncliJNI.new_ClientAPI_TransportStats(), true);
    }
}
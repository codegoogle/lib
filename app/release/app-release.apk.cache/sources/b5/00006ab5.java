package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_RemoteOverride {
    private transient long a;
    public transient boolean b;

    public ClientAPI_RemoteOverride(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        if (clientAPI_RemoteOverride == null) {
            return 0L;
        }
        return clientAPI_RemoteOverride.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_RemoteOverride(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_RemoteOverride_error_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_RemoteOverride_host_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_RemoteOverride_ip_get(this.a, this);
    }

    public String f() {
        return ovpncliJNI.ClientAPI_RemoteOverride_port_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_RemoteOverride_proto_get(this.a, this);
    }

    public void h(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_error_set(this.a, this, str);
    }

    public void i(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_host_set(this.a, this, str);
    }

    public void j(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_ip_set(this.a, this, str);
    }

    public void k(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_port_set(this.a, this, str);
    }

    public void l(String str) {
        ovpncliJNI.ClientAPI_RemoteOverride_proto_set(this.a, this, str);
    }

    public ClientAPI_RemoteOverride() {
        this(ovpncliJNI.new_ClientAPI_RemoteOverride(), true);
    }
}
package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ConnectionInfo {
    private transient long a;
    public transient boolean b;

    public ClientAPI_ConnectionInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_ConnectionInfo clientAPI_ConnectionInfo) {
        if (clientAPI_ConnectionInfo == null) {
            return 0L;
        }
        return clientAPI_ConnectionInfo.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ConnectionInfo(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_clientIp_get(this.a, this);
    }

    public boolean d() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_defined_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_gw4_get(this.a, this);
    }

    public String f() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_gw6_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverHost_get(this.a, this);
    }

    public String h() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverIp_get(this.a, this);
    }

    public String i() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverPort_get(this.a, this);
    }

    public String j() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_serverProto_get(this.a, this);
    }

    public String k() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_tunName_get(this.a, this);
    }

    public String l() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_user_get(this.a, this);
    }

    public String m() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp4_get(this.a, this);
    }

    public String n() {
        return ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp6_get(this.a, this);
    }

    public void o(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_clientIp_set(this.a, this, str);
    }

    public void p(boolean z) {
        ovpncliJNI.ClientAPI_ConnectionInfo_defined_set(this.a, this, z);
    }

    public void q(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_gw4_set(this.a, this, str);
    }

    public void r(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_gw6_set(this.a, this, str);
    }

    public void s(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverHost_set(this.a, this, str);
    }

    public void t(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverIp_set(this.a, this, str);
    }

    public void u(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverPort_set(this.a, this, str);
    }

    public void v(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_serverProto_set(this.a, this, str);
    }

    public void w(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_tunName_set(this.a, this, str);
    }

    public void x(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_user_set(this.a, this, str);
    }

    public void y(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp4_set(this.a, this, str);
    }

    public void z(String str) {
        ovpncliJNI.ClientAPI_ConnectionInfo_vpnIp6_set(this.a, this, str);
    }

    public ClientAPI_ConnectionInfo() {
        this(ovpncliJNI.new_ClientAPI_ConnectionInfo(), true);
    }
}
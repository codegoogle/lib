package net.openvpn.ovpn3;

import com.p7700g.p99005.gp5;

/* loaded from: classes3.dex */
public class ClientAPI_Config {
    private transient long a;
    public transient boolean b;

    public ClientAPI_Config(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long e(ClientAPI_Config clientAPI_Config) {
        if (clientAPI_Config == null) {
            return 0L;
        }
        return clientAPI_Config.a;
    }

    public String A() {
        return ovpncliJNI.ClientAPI_Config_protoOverride_get(this.a, this);
    }

    public void A0(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_set(this.a, this, str);
    }

    public boolean B() {
        return ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_get(this.a, this);
    }

    public void B0(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCipherList_set(this.a, this, str);
    }

    public String C() {
        return ovpncliJNI.ClientAPI_Config_proxyHost_get(this.a, this);
    }

    public void C0(String str) {
        ovpncliJNI.ClientAPI_Config_tlsCiphersuitesList_set(this.a, this, str);
    }

    public String D() {
        return ovpncliJNI.ClientAPI_Config_proxyPassword_get(this.a, this);
    }

    public void D0(String str) {
        ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_set(this.a, this, str);
    }

    public String E() {
        return ovpncliJNI.ClientAPI_Config_proxyPort_get(this.a, this);
    }

    public void E0(boolean z) {
        ovpncliJNI.ClientAPI_Config_tunPersist_set(this.a, this, z);
    }

    public String F() {
        return ovpncliJNI.ClientAPI_Config_proxyUsername_get(this.a, this);
    }

    public void F0(boolean z) {
        ovpncliJNI.ClientAPI_Config_wintun_set(this.a, this, z);
    }

    public boolean G() {
        return ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_get(this.a, this);
    }

    public String H() {
        return ovpncliJNI.ClientAPI_Config_serverOverride_get(this.a, this);
    }

    public int I() {
        return ovpncliJNI.ClientAPI_Config_sslDebugLevel_get(this.a, this);
    }

    public String J() {
        return ovpncliJNI.ClientAPI_Config_ssoMethods_get(this.a, this);
    }

    public boolean K() {
        return ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_get(this.a, this);
    }

    public String L() {
        return ovpncliJNI.ClientAPI_Config_tlsCertProfileOverride_get(this.a, this);
    }

    public String M() {
        return ovpncliJNI.ClientAPI_Config_tlsCipherList_get(this.a, this);
    }

    public String N() {
        return ovpncliJNI.ClientAPI_Config_tlsCiphersuitesList_get(this.a, this);
    }

    public String O() {
        return ovpncliJNI.ClientAPI_Config_tlsVersionMinOverride_get(this.a, this);
    }

    public boolean P() {
        return ovpncliJNI.ClientAPI_Config_tunPersist_get(this.a, this);
    }

    public boolean Q() {
        return ovpncliJNI.ClientAPI_Config_wintun_get(this.a, this);
    }

    public void R(boolean z) {
        ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_set(this.a, this, z);
    }

    public void S(boolean z) {
        ovpncliJNI.ClientAPI_Config_altProxy_set(this.a, this, z);
    }

    public void T(boolean z) {
        ovpncliJNI.ClientAPI_Config_autologinSessions_set(this.a, this, z);
    }

    public void U(long j) {
        ovpncliJNI.ClientAPI_Config_clockTickMS_set(this.a, this, j);
    }

    public void V(String str) {
        ovpncliJNI.ClientAPI_Config_compressionMode_set(this.a, this, str);
    }

    public void W(int i) {
        ovpncliJNI.ClientAPI_Config_connTimeout_set(this.a, this, i);
    }

    public void X(String str) {
        ovpncliJNI.ClientAPI_Config_content_set(this.a, this, str);
    }

    public void Y(gp5 gp5Var) {
        ovpncliJNI.ClientAPI_Config_contentList_set(this.a, this, gp5.a(gp5Var));
    }

    public void Z(boolean z) {
        ovpncliJNI.ClientAPI_Config_dco_set(this.a, this, z);
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_Config(j);
            }
            this.a = 0L;
        }
    }

    public void a0(int i) {
        ovpncliJNI.ClientAPI_Config_defaultKeyDirection_set(this.a, this, i);
    }

    public boolean b() {
        return ovpncliJNI.ClientAPI_Config_allowLocalLanAccess_get(this.a, this);
    }

    public void b0(boolean z) {
        ovpncliJNI.ClientAPI_Config_disableClientCert_set(this.a, this, z);
    }

    public boolean c() {
        return ovpncliJNI.ClientAPI_Config_altProxy_get(this.a, this);
    }

    public void c0(boolean z) {
        ovpncliJNI.ClientAPI_Config_echo_set(this.a, this, z);
    }

    public boolean d() {
        return ovpncliJNI.ClientAPI_Config_autologinSessions_get(this.a, this);
    }

    public void d0(String str) {
        ovpncliJNI.ClientAPI_Config_externalPkiAlias_set(this.a, this, str);
    }

    public void e0(boolean z) {
        ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_set(this.a, this, z);
    }

    public long f() {
        return ovpncliJNI.ClientAPI_Config_clockTickMS_get(this.a, this);
    }

    public void f0(boolean z) {
        ovpncliJNI.ClientAPI_Config_googleDnsFallback_set(this.a, this, z);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_Config_compressionMode_get(this.a, this);
    }

    public void g0(String str) {
        ovpncliJNI.ClientAPI_Config_gremlinConfig_set(this.a, this, str);
    }

    public int h() {
        return ovpncliJNI.ClientAPI_Config_connTimeout_get(this.a, this);
    }

    public void h0(String str) {
        ovpncliJNI.ClientAPI_Config_guiVersion_set(this.a, this, str);
    }

    public String i() {
        return ovpncliJNI.ClientAPI_Config_content_get(this.a, this);
    }

    public void i0(String str) {
        ovpncliJNI.ClientAPI_Config_hwAddrOverride_set(this.a, this, str);
    }

    public gp5 j() {
        long ClientAPI_Config_contentList_get = ovpncliJNI.ClientAPI_Config_contentList_get(this.a, this);
        if (ClientAPI_Config_contentList_get == 0) {
            return null;
        }
        return new gp5(ClientAPI_Config_contentList_get, false);
    }

    public void j0(boolean z) {
        ovpncliJNI.ClientAPI_Config_info_set(this.a, this, z);
    }

    public boolean k() {
        return ovpncliJNI.ClientAPI_Config_dco_get(this.a, this);
    }

    public void k0(String str) {
        ovpncliJNI.ClientAPI_Config_ipv6_set(this.a, this, str);
    }

    public int l() {
        return ovpncliJNI.ClientAPI_Config_defaultKeyDirection_get(this.a, this);
    }

    public void l0(gp5 gp5Var) {
        ovpncliJNI.ClientAPI_Config_peerInfo_set(this.a, this, gp5.a(gp5Var));
    }

    public boolean m() {
        return ovpncliJNI.ClientAPI_Config_disableClientCert_get(this.a, this);
    }

    public void m0(String str) {
        ovpncliJNI.ClientAPI_Config_platformVersion_set(this.a, this, str);
    }

    public boolean n() {
        return ovpncliJNI.ClientAPI_Config_echo_get(this.a, this);
    }

    public void n0(String str) {
        ovpncliJNI.ClientAPI_Config_portOverride_set(this.a, this, str);
    }

    public String o() {
        return ovpncliJNI.ClientAPI_Config_externalPkiAlias_get(this.a, this);
    }

    public void o0(String str) {
        ovpncliJNI.ClientAPI_Config_privateKeyPassword_set(this.a, this, str);
    }

    public boolean p() {
        return ovpncliJNI.ClientAPI_Config_forceAesCbcCiphersuites_get(this.a, this);
    }

    public void p0(String str) {
        ovpncliJNI.ClientAPI_Config_protoOverride_set(this.a, this, str);
    }

    public boolean q() {
        return ovpncliJNI.ClientAPI_Config_googleDnsFallback_get(this.a, this);
    }

    public void q0(boolean z) {
        ovpncliJNI.ClientAPI_Config_proxyAllowCleartextAuth_set(this.a, this, z);
    }

    public String r() {
        return ovpncliJNI.ClientAPI_Config_gremlinConfig_get(this.a, this);
    }

    public void r0(String str) {
        ovpncliJNI.ClientAPI_Config_proxyHost_set(this.a, this, str);
    }

    public String s() {
        return ovpncliJNI.ClientAPI_Config_guiVersion_get(this.a, this);
    }

    public void s0(String str) {
        ovpncliJNI.ClientAPI_Config_proxyPassword_set(this.a, this, str);
    }

    public String t() {
        return ovpncliJNI.ClientAPI_Config_hwAddrOverride_get(this.a, this);
    }

    public void t0(String str) {
        ovpncliJNI.ClientAPI_Config_proxyPort_set(this.a, this, str);
    }

    public boolean u() {
        return ovpncliJNI.ClientAPI_Config_info_get(this.a, this);
    }

    public void u0(String str) {
        ovpncliJNI.ClientAPI_Config_proxyUsername_set(this.a, this, str);
    }

    public String v() {
        return ovpncliJNI.ClientAPI_Config_ipv6_get(this.a, this);
    }

    public void v0(boolean z) {
        ovpncliJNI.ClientAPI_Config_retryOnAuthFailed_set(this.a, this, z);
    }

    public gp5 w() {
        long ClientAPI_Config_peerInfo_get = ovpncliJNI.ClientAPI_Config_peerInfo_get(this.a, this);
        if (ClientAPI_Config_peerInfo_get == 0) {
            return null;
        }
        return new gp5(ClientAPI_Config_peerInfo_get, false);
    }

    public void w0(String str) {
        ovpncliJNI.ClientAPI_Config_serverOverride_set(this.a, this, str);
    }

    public String x() {
        return ovpncliJNI.ClientAPI_Config_platformVersion_get(this.a, this);
    }

    public void x0(int i) {
        ovpncliJNI.ClientAPI_Config_sslDebugLevel_set(this.a, this, i);
    }

    public String y() {
        return ovpncliJNI.ClientAPI_Config_portOverride_get(this.a, this);
    }

    public void y0(String str) {
        ovpncliJNI.ClientAPI_Config_ssoMethods_set(this.a, this, str);
    }

    public String z() {
        return ovpncliJNI.ClientAPI_Config_privateKeyPassword_get(this.a, this);
    }

    public void z0(boolean z) {
        ovpncliJNI.ClientAPI_Config_synchronousDnsLookup_set(this.a, this, z);
    }

    public ClientAPI_Config() {
        this(ovpncliJNI.new_ClientAPI_Config(), true);
    }
}
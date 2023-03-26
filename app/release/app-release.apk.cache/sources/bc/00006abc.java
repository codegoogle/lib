package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_TunBuilderBase {
    private transient long a;
    public transient boolean b;

    public ClientAPI_TunBuilderBase(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_TunBuilderBase clientAPI_TunBuilderBase) {
        if (clientAPI_TunBuilderBase == null) {
            return 0L;
        }
        return clientAPI_TunBuilderBase.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_TunBuilderBase(j);
            }
            this.a = 0L;
        }
    }

    public boolean c(String str, int i, String str2, boolean z, boolean z2) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_address(this.a, this, str, i, str2, z, z2);
    }

    public boolean d(String str, boolean z) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_dns_server(this.a, this, str, z);
    }

    public boolean e(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_proxy_bypass(this.a, this, str);
    }

    public boolean f(String str, int i, int i2, boolean z) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_route(this.a, this, str, i, i2, z);
    }

    public void finalize() {
        a();
    }

    public boolean g(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_search_domain(this.a, this, str);
    }

    public boolean h(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_add_wins_server(this.a, this, str);
    }

    public int i() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_establish(this.a, this);
    }

    public void j() {
        ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_establish_lite(this.a, this);
    }

    public boolean k(String str, int i, int i2, boolean z) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_exclude_route(this.a, this, str, i, i2, z);
    }

    public ClientAPI_StringVec l(boolean z) {
        return new ClientAPI_StringVec(ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_get_local_networks(this.a, this, z), true);
    }

    public boolean m() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_new(this.a, this);
    }

    public boolean n() {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_persist(this.a, this);
    }

    public boolean o(boolean z, boolean z2, long j) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_reroute_gw(this.a, this, z, z2, j);
    }

    public boolean p(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_adapter_domain_suffix(this.a, this, str);
    }

    public boolean q(boolean z) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_block_ipv6(this.a, this, z);
    }

    public boolean r(int i) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_layer(this.a, this, i);
    }

    public boolean s(int i) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_mtu(this.a, this, i);
    }

    public boolean t(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_auto_config_url(this.a, this, str);
    }

    public boolean u(String str, int i) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_http(this.a, this, str, i);
    }

    public boolean v(String str, int i) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_proxy_https(this.a, this, str, i);
    }

    public boolean w(String str, boolean z) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_remote_address(this.a, this, str, z);
    }

    public boolean x(int i) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_route_metric_default(this.a, this, i);
    }

    public boolean y(String str) {
        return ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_set_session_name(this.a, this, str);
    }

    public void z(boolean z) {
        ovpncliJNI.ClientAPI_TunBuilderBase_tun_builder_teardown(this.a, this, z);
    }

    public ClientAPI_TunBuilderBase() {
        this(ovpncliJNI.new_ClientAPI_TunBuilderBase(), true);
    }
}
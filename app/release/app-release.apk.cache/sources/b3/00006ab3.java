package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_OpenVPNClient extends ClientAPI_TunBuilderBase {
    private transient long c;

    public ClientAPI_OpenVPNClient(long j, boolean z) {
        super(ovpncliJNI.ClientAPI_OpenVPNClient_SWIGUpcast(j), z);
        this.c = j;
    }

    public static int A() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_app_expire();
    }

    public static String E() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_copyright();
    }

    public static String F() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_crypto_self_test();
    }

    public static ClientAPI_EvalConfig H(ClientAPI_Config clientAPI_Config) {
        return new ClientAPI_EvalConfig(ovpncliJNI.ClientAPI_OpenVPNClient_eval_config_static(ClientAPI_Config.e(clientAPI_Config), clientAPI_Config), true);
    }

    public static long L(ClientAPI_OpenVPNClient clientAPI_OpenVPNClient) {
        if (clientAPI_OpenVPNClient == null) {
            return 0L;
        }
        return clientAPI_OpenVPNClient.c;
    }

    public static int N() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_max_profile_size();
    }

    public static ClientAPI_MergeConfig O(String str, boolean z) {
        return new ClientAPI_MergeConfig(ovpncliJNI.ClientAPI_OpenVPNClient_merge_config_static(str, z), true);
    }

    public static ClientAPI_MergeConfig P(String str) {
        return new ClientAPI_MergeConfig(ovpncliJNI.ClientAPI_OpenVPNClient_merge_config_string_static(str), true);
    }

    public static boolean Q(String str, ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_parse_dynamic_challenge(str, ClientAPI_DynamicChallenge.b(clientAPI_DynamicChallenge), clientAPI_DynamicChallenge);
    }

    public static String T() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_platform();
    }

    public static int d0() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_n();
    }

    public static String e0(int i) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_name(i);
    }

    public void B() {
        if (getClass() == ClientAPI_OpenVPNClient.class) {
            ovpncliJNI.ClientAPI_OpenVPNClient_clock_tick(this.c, this);
        } else {
            ovpncliJNI.ClientAPI_OpenVPNClient_clock_tickSwigExplicitClientAPI_OpenVPNClient(this.c, this);
        }
    }

    public ClientAPI_Status C() {
        return new ClientAPI_Status(ovpncliJNI.ClientAPI_OpenVPNClient_connect(this.c, this), true);
    }

    public ClientAPI_ConnectionInfo D() {
        return new ClientAPI_ConnectionInfo(ovpncliJNI.ClientAPI_OpenVPNClient_connection_info(this.c, this), true);
    }

    public ClientAPI_EvalConfig G(ClientAPI_Config clientAPI_Config) {
        return new ClientAPI_EvalConfig(ovpncliJNI.ClientAPI_OpenVPNClient_eval_config(this.c, this, ClientAPI_Config.e(clientAPI_Config), clientAPI_Config), true);
    }

    public void I(ClientAPI_Event clientAPI_Event) {
        ovpncliJNI.ClientAPI_OpenVPNClient_event(this.c, this, ClientAPI_Event.b(clientAPI_Event), clientAPI_Event);
    }

    public void J(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        ovpncliJNI.ClientAPI_OpenVPNClient_external_pki_cert_request(this.c, this, ClientAPI_ExternalPKICertRequest.k(clientAPI_ExternalPKICertRequest), clientAPI_ExternalPKICertRequest);
    }

    public void K(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        ovpncliJNI.ClientAPI_OpenVPNClient_external_pki_sign_request(this.c, this, ClientAPI_ExternalPKISignRequest.l(clientAPI_ExternalPKISignRequest), clientAPI_ExternalPKISignRequest);
    }

    public void M(ClientAPI_LogInfo clientAPI_LogInfo) {
        ovpncliJNI.ClientAPI_OpenVPNClient_log(this.c, this, ClientAPI_LogInfo.b(clientAPI_LogInfo), clientAPI_LogInfo);
    }

    public void R(String str) {
        ovpncliJNI.ClientAPI_OpenVPNClient_pause(this.c, this, str);
    }

    public boolean S() {
        return ovpncliJNI.ClientAPI_OpenVPNClient_pause_on_connection_timeout(this.c, this);
    }

    public void U(String str) {
        ovpncliJNI.ClientAPI_OpenVPNClient_post_cc_msg(this.c, this, str);
    }

    public ClientAPI_Status V(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        return new ClientAPI_Status(ovpncliJNI.ClientAPI_OpenVPNClient_provide_creds(this.c, this, ClientAPI_ProvideCreds.b(clientAPI_ProvideCreds), clientAPI_ProvideCreds), true);
    }

    public void W(int i) {
        ovpncliJNI.ClientAPI_OpenVPNClient_reconnect(this.c, this, i);
    }

    public void X(ClientAPI_RemoteOverride clientAPI_RemoteOverride) {
        if (getClass() == ClientAPI_OpenVPNClient.class) {
            ovpncliJNI.ClientAPI_OpenVPNClient_remote_override(this.c, this, ClientAPI_RemoteOverride.b(clientAPI_RemoteOverride), clientAPI_RemoteOverride);
        } else {
            ovpncliJNI.ClientAPI_OpenVPNClient_remote_overrideSwigExplicitClientAPI_OpenVPNClient(this.c, this, ClientAPI_RemoteOverride.b(clientAPI_RemoteOverride), clientAPI_RemoteOverride);
        }
    }

    public boolean Y() {
        return getClass() == ClientAPI_OpenVPNClient.class ? ovpncliJNI.ClientAPI_OpenVPNClient_remote_override_enabled(this.c, this) : ovpncliJNI.ClientAPI_OpenVPNClient_remote_override_enabledSwigExplicitClientAPI_OpenVPNClient(this.c, this);
    }

    public void Z() {
        ovpncliJNI.ClientAPI_OpenVPNClient_resume(this.c, this);
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_OpenVPNClient(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    public boolean a0(ClientAPI_SessionToken clientAPI_SessionToken) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_session_token(this.c, this, ClientAPI_SessionToken.b(clientAPI_SessionToken), clientAPI_SessionToken);
    }

    public boolean b0(int i, String str, boolean z) {
        return getClass() == ClientAPI_OpenVPNClient.class ? ovpncliJNI.ClientAPI_OpenVPNClient_socket_protect(this.c, this, i, str, z) : ovpncliJNI.ClientAPI_OpenVPNClient_socket_protectSwigExplicitClientAPI_OpenVPNClient(this.c, this, i, str, z);
    }

    public ClientAPI_LLVector c0() {
        return new ClientAPI_LLVector(ovpncliJNI.ClientAPI_OpenVPNClient_stats_bundle(this.c, this), true);
    }

    public long f0(int i) {
        return ovpncliJNI.ClientAPI_OpenVPNClient_stats_value(this.c, this, i);
    }

    @Override // net.openvpn.ovpn3.ClientAPI_TunBuilderBase
    public void finalize() {
        a();
    }

    public void g0() {
        ovpncliJNI.ClientAPI_OpenVPNClient_stop(this.c, this);
    }

    public void h0() {
        this.b = false;
        a();
    }

    public void i0() {
        this.b = false;
        ovpncliJNI.ClientAPI_OpenVPNClient_change_ownership(this, this.c, false);
    }

    public void j0() {
        this.b = true;
        ovpncliJNI.ClientAPI_OpenVPNClient_change_ownership(this, this.c, true);
    }

    public ClientAPI_TransportStats k0() {
        return new ClientAPI_TransportStats(ovpncliJNI.ClientAPI_OpenVPNClient_transport_stats(this.c, this), true);
    }

    public ClientAPI_InterfaceStats l0() {
        return new ClientAPI_InterfaceStats(ovpncliJNI.ClientAPI_OpenVPNClient_tun_stats(this.c, this), true);
    }

    public ClientAPI_OpenVPNClient() {
        this(ovpncliJNI.new_ClientAPI_OpenVPNClient(), true);
        ovpncliJNI.ClientAPI_OpenVPNClient_director_connect(this, this.c, true, true);
    }
}
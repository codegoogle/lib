package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_EvalConfig {
    private transient long a;
    public transient boolean b;

    public ClientAPI_EvalConfig(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long d(ClientAPI_EvalConfig clientAPI_EvalConfig) {
        if (clientAPI_EvalConfig == null) {
            return 0L;
        }
        return clientAPI_EvalConfig.a;
    }

    public void A(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_remoteHost_set(this.a, this, str);
    }

    public void B(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_remotePort_set(this.a, this, str);
    }

    public void C(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_remoteProto_set(this.a, this, str);
    }

    public void D(ClientAPI_ServerEntryVector clientAPI_ServerEntryVector) {
        ovpncliJNI.ClientAPI_EvalConfig_serverList_set(this.a, this, ClientAPI_ServerEntryVector.p(clientAPI_ServerEntryVector), clientAPI_ServerEntryVector);
    }

    public void E(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_staticChallenge_set(this.a, this, str);
    }

    public void F(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_staticChallengeEcho_set(this.a, this, z);
    }

    public void G(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_userlockedUsername_set(this.a, this, str);
    }

    public void H(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_windowsDriver_set(this.a, this, str);
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_EvalConfig(j);
            }
            this.a = 0L;
        }
    }

    public boolean b() {
        return ovpncliJNI.ClientAPI_EvalConfig_allowPasswordSave_get(this.a, this);
    }

    public boolean c() {
        return ovpncliJNI.ClientAPI_EvalConfig_autologin_get(this.a, this);
    }

    public boolean e() {
        return ovpncliJNI.ClientAPI_EvalConfig_error_get(this.a, this);
    }

    public boolean f() {
        return ovpncliJNI.ClientAPI_EvalConfig_externalPki_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_EvalConfig_friendlyName_get(this.a, this);
    }

    public String h() {
        return ovpncliJNI.ClientAPI_EvalConfig_message_get(this.a, this);
    }

    public boolean i() {
        return ovpncliJNI.ClientAPI_EvalConfig_privateKeyPasswordRequired_get(this.a, this);
    }

    public String j() {
        return ovpncliJNI.ClientAPI_EvalConfig_profileName_get(this.a, this);
    }

    public String k() {
        return ovpncliJNI.ClientAPI_EvalConfig_remoteHost_get(this.a, this);
    }

    public String l() {
        return ovpncliJNI.ClientAPI_EvalConfig_remotePort_get(this.a, this);
    }

    public String m() {
        return ovpncliJNI.ClientAPI_EvalConfig_remoteProto_get(this.a, this);
    }

    public ClientAPI_ServerEntryVector n() {
        long ClientAPI_EvalConfig_serverList_get = ovpncliJNI.ClientAPI_EvalConfig_serverList_get(this.a, this);
        if (ClientAPI_EvalConfig_serverList_get == 0) {
            return null;
        }
        return new ClientAPI_ServerEntryVector(ClientAPI_EvalConfig_serverList_get, false);
    }

    public String o() {
        return ovpncliJNI.ClientAPI_EvalConfig_staticChallenge_get(this.a, this);
    }

    public boolean p() {
        return ovpncliJNI.ClientAPI_EvalConfig_staticChallengeEcho_get(this.a, this);
    }

    public String q() {
        return ovpncliJNI.ClientAPI_EvalConfig_userlockedUsername_get(this.a, this);
    }

    public String r() {
        return ovpncliJNI.ClientAPI_EvalConfig_windowsDriver_get(this.a, this);
    }

    public void s(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_allowPasswordSave_set(this.a, this, z);
    }

    public void t(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_autologin_set(this.a, this, z);
    }

    public void u(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_error_set(this.a, this, z);
    }

    public void v(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_externalPki_set(this.a, this, z);
    }

    public void w(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_friendlyName_set(this.a, this, str);
    }

    public void x(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_message_set(this.a, this, str);
    }

    public void y(boolean z) {
        ovpncliJNI.ClientAPI_EvalConfig_privateKeyPasswordRequired_set(this.a, this, z);
    }

    public void z(String str) {
        ovpncliJNI.ClientAPI_EvalConfig_profileName_set(this.a, this, str);
    }

    public ClientAPI_EvalConfig() {
        this(ovpncliJNI.new_ClientAPI_EvalConfig(), true);
    }
}
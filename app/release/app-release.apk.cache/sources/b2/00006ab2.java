package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_MergeConfig {
    private transient long a;
    public transient boolean b;

    public ClientAPI_MergeConfig(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(ClientAPI_MergeConfig clientAPI_MergeConfig) {
        if (clientAPI_MergeConfig == null) {
            return 0L;
        }
        return clientAPI_MergeConfig.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_MergeConfig(j);
            }
            this.a = 0L;
        }
    }

    public String b() {
        return ovpncliJNI.ClientAPI_MergeConfig_basename_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_MergeConfig_errorText_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_MergeConfig_profileContent_get(this.a, this);
    }

    public ClientAPI_StringVec f() {
        long ClientAPI_MergeConfig_refPathList_get = ovpncliJNI.ClientAPI_MergeConfig_refPathList_get(this.a, this);
        if (ClientAPI_MergeConfig_refPathList_get == 0) {
            return null;
        }
        return new ClientAPI_StringVec(ClientAPI_MergeConfig_refPathList_get, false);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_MergeConfig_status_get(this.a, this);
    }

    public void h(String str) {
        ovpncliJNI.ClientAPI_MergeConfig_basename_set(this.a, this, str);
    }

    public void i(String str) {
        ovpncliJNI.ClientAPI_MergeConfig_errorText_set(this.a, this, str);
    }

    public void j(String str) {
        ovpncliJNI.ClientAPI_MergeConfig_profileContent_set(this.a, this, str);
    }

    public void k(ClientAPI_StringVec clientAPI_StringVec) {
        ovpncliJNI.ClientAPI_MergeConfig_refPathList_set(this.a, this, ClientAPI_StringVec.p(clientAPI_StringVec), clientAPI_StringVec);
    }

    public void l(String str) {
        ovpncliJNI.ClientAPI_MergeConfig_status_set(this.a, this, str);
    }

    public ClientAPI_MergeConfig() {
        this(ovpncliJNI.new_ClientAPI_MergeConfig(), true);
    }
}
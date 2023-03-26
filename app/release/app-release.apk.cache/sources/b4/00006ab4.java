package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ProvideCreds {
    private transient long a;
    public transient boolean b;

    public ClientAPI_ProvideCreds(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_ProvideCreds clientAPI_ProvideCreds) {
        if (clientAPI_ProvideCreds == null) {
            return 0L;
        }
        return clientAPI_ProvideCreds.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ProvideCreds(j);
            }
            this.a = 0L;
        }
    }

    public boolean c() {
        return ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_ProvideCreds_password_get(this.a, this);
    }

    public boolean f() {
        return ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public String g() {
        return ovpncliJNI.ClientAPI_ProvideCreds_response_get(this.a, this);
    }

    public String h() {
        return ovpncliJNI.ClientAPI_ProvideCreds_username_get(this.a, this);
    }

    public void i(boolean z) {
        ovpncliJNI.ClientAPI_ProvideCreds_cachePassword_set(this.a, this, z);
    }

    public void j(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_dynamicChallengeCookie_set(this.a, this, str);
    }

    public void k(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_password_set(this.a, this, str);
    }

    public void l(boolean z) {
        ovpncliJNI.ClientAPI_ProvideCreds_replacePasswordWithSessionID_set(this.a, this, z);
    }

    public void m(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_response_set(this.a, this, str);
    }

    public void n(String str) {
        ovpncliJNI.ClientAPI_ProvideCreds_username_set(this.a, this, str);
    }

    public ClientAPI_ProvideCreds() {
        this(ovpncliJNI.new_ClientAPI_ProvideCreds(), true);
    }
}
package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_SessionToken {
    private transient long a;
    public transient boolean b;

    public ClientAPI_SessionToken(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_SessionToken clientAPI_SessionToken) {
        if (clientAPI_SessionToken == null) {
            return 0L;
        }
        return clientAPI_SessionToken.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_SessionToken(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_SessionToken_session_id_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_SessionToken_username_get(this.a, this);
    }

    public void e(String str) {
        ovpncliJNI.ClientAPI_SessionToken_session_id_set(this.a, this, str);
    }

    public void f(String str) {
        ovpncliJNI.ClientAPI_SessionToken_username_set(this.a, this, str);
    }

    public void finalize() {
        a();
    }

    public ClientAPI_SessionToken() {
        this(ovpncliJNI.new_ClientAPI_SessionToken(), true);
    }
}
package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_DynamicChallenge {
    private transient long a;
    public transient boolean b;

    public ClientAPI_DynamicChallenge(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_DynamicChallenge clientAPI_DynamicChallenge) {
        if (clientAPI_DynamicChallenge == null) {
            return 0L;
        }
        return clientAPI_DynamicChallenge.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_DynamicChallenge(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_challenge_get(this.a, this);
    }

    public boolean d() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_echo_get(this.a, this);
    }

    public boolean e() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_get(this.a, this);
    }

    public String f() {
        return ovpncliJNI.ClientAPI_DynamicChallenge_stateID_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public void g(String str) {
        ovpncliJNI.ClientAPI_DynamicChallenge_challenge_set(this.a, this, str);
    }

    public void h(boolean z) {
        ovpncliJNI.ClientAPI_DynamicChallenge_echo_set(this.a, this, z);
    }

    public void i(boolean z) {
        ovpncliJNI.ClientAPI_DynamicChallenge_responseRequired_set(this.a, this, z);
    }

    public void j(String str) {
        ovpncliJNI.ClientAPI_DynamicChallenge_stateID_set(this.a, this, str);
    }

    public ClientAPI_DynamicChallenge() {
        this(ovpncliJNI.new_ClientAPI_DynamicChallenge(), true);
    }
}
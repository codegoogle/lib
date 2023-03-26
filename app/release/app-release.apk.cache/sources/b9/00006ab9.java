package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_Status {
    private transient long a;
    public transient boolean b;

    public ClientAPI_Status(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_Status clientAPI_Status) {
        if (clientAPI_Status == null) {
            return 0L;
        }
        return clientAPI_Status.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_Status(j);
            }
            this.a = 0L;
        }
    }

    public boolean c() {
        return ovpncliJNI.ClientAPI_Status_error_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_Status_message_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_Status_status_get(this.a, this);
    }

    public void f(boolean z) {
        ovpncliJNI.ClientAPI_Status_error_set(this.a, this, z);
    }

    public void finalize() {
        a();
    }

    public void g(String str) {
        ovpncliJNI.ClientAPI_Status_message_set(this.a, this, str);
    }

    public void h(String str) {
        ovpncliJNI.ClientAPI_Status_status_set(this.a, this, str);
    }

    public ClientAPI_Status() {
        this(ovpncliJNI.new_ClientAPI_Status(), true);
    }
}
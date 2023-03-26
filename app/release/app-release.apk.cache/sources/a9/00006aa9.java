package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_Event {
    private transient long a;
    public transient boolean b;

    public ClientAPI_Event(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_Event clientAPI_Event) {
        if (clientAPI_Event == null) {
            return 0L;
        }
        return clientAPI_Event.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_Event(j);
            }
            this.a = 0L;
        }
    }

    public boolean c() {
        return ovpncliJNI.ClientAPI_Event_error_get(this.a, this);
    }

    public boolean d() {
        return ovpncliJNI.ClientAPI_Event_fatal_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_Event_info_get(this.a, this);
    }

    public String f() {
        return ovpncliJNI.ClientAPI_Event_name_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public void g(boolean z) {
        ovpncliJNI.ClientAPI_Event_error_set(this.a, this, z);
    }

    public void h(boolean z) {
        ovpncliJNI.ClientAPI_Event_fatal_set(this.a, this, z);
    }

    public void i(String str) {
        ovpncliJNI.ClientAPI_Event_info_set(this.a, this, str);
    }

    public void j(String str) {
        ovpncliJNI.ClientAPI_Event_name_set(this.a, this, str);
    }

    public ClientAPI_Event() {
        this(ovpncliJNI.new_ClientAPI_Event(), true);
    }
}
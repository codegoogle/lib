package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ServerEntry {
    private transient long a;
    public transient boolean b;

    public ClientAPI_ServerEntry(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_ServerEntry clientAPI_ServerEntry) {
        if (clientAPI_ServerEntry == null) {
            return 0L;
        }
        return clientAPI_ServerEntry.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ServerEntry(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_ServerEntry_friendlyName_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_ServerEntry_server_get(this.a, this);
    }

    public void e(String str) {
        ovpncliJNI.ClientAPI_ServerEntry_friendlyName_set(this.a, this, str);
    }

    public void f(String str) {
        ovpncliJNI.ClientAPI_ServerEntry_server_set(this.a, this, str);
    }

    public void finalize() {
        a();
    }

    public ClientAPI_ServerEntry() {
        this(ovpncliJNI.new_ClientAPI_ServerEntry(), true);
    }
}
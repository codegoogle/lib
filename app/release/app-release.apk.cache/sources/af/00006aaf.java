package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_KeyValue {
    private transient long a;
    public transient boolean b;

    public ClientAPI_KeyValue(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_KeyValue clientAPI_KeyValue) {
        if (clientAPI_KeyValue == null) {
            return 0L;
        }
        return clientAPI_KeyValue.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_KeyValue(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_KeyValue_key_get(this.a, this);
    }

    public String d() {
        return ovpncliJNI.ClientAPI_KeyValue_value_get(this.a, this);
    }

    public void e(String str) {
        ovpncliJNI.ClientAPI_KeyValue_key_set(this.a, this, str);
    }

    public void f(String str) {
        ovpncliJNI.ClientAPI_KeyValue_value_set(this.a, this, str);
    }

    public void finalize() {
        a();
    }

    public ClientAPI_KeyValue() {
        this(ovpncliJNI.new_ClientAPI_KeyValue__SWIG_0(), true);
    }

    public ClientAPI_KeyValue(String str, String str2) {
        this(ovpncliJNI.new_ClientAPI_KeyValue__SWIG_1(str, str2), true);
    }
}
package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_LogInfo {
    private transient long a;
    public transient boolean b;

    public ClientAPI_LogInfo(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_LogInfo clientAPI_LogInfo) {
        if (clientAPI_LogInfo == null) {
            return 0L;
        }
        return clientAPI_LogInfo.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_LogInfo(j);
            }
            this.a = 0L;
        }
    }

    public String c() {
        return ovpncliJNI.ClientAPI_LogInfo_text_get(this.a, this);
    }

    public void d(String str) {
        ovpncliJNI.ClientAPI_LogInfo_text_set(this.a, this, str);
    }

    public void finalize() {
        a();
    }

    public ClientAPI_LogInfo() {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_0(), true);
    }

    public ClientAPI_LogInfo(String str) {
        this(ovpncliJNI.new_ClientAPI_LogInfo__SWIG_1(str), true);
    }
}
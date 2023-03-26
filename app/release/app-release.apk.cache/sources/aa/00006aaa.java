package net.openvpn.ovpn3;

import com.p7700g.p99005.fp5;

/* loaded from: classes3.dex */
public class ClientAPI_ExternalPKIBase {
    private transient long a;
    public transient boolean b;

    public ClientAPI_ExternalPKIBase(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long b(ClientAPI_ExternalPKIBase clientAPI_ExternalPKIBase) {
        if (clientAPI_ExternalPKIBase == null) {
            return 0L;
        }
        return clientAPI_ExternalPKIBase.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ExternalPKIBase(j);
            }
            this.a = 0L;
        }
    }

    public boolean c(String str, fp5 fp5Var, String str2) {
        return ovpncliJNI.ClientAPI_ExternalPKIBase_sign(this.a, this, str, fp5.a(fp5Var), str2);
    }

    public void finalize() {
        a();
    }
}
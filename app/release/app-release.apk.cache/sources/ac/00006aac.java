package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ExternalPKIRequestBase {
    private transient long a;
    public transient boolean b;

    public ClientAPI_ExternalPKIRequestBase(long j, boolean z) {
        this.b = z;
        this.a = j;
    }

    public static long c(ClientAPI_ExternalPKIRequestBase clientAPI_ExternalPKIRequestBase) {
        if (clientAPI_ExternalPKIRequestBase == null) {
            return 0L;
        }
        return clientAPI_ExternalPKIRequestBase.a;
    }

    public synchronized void a() {
        long j = this.a;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ExternalPKIRequestBase(j);
            }
            this.a = 0L;
        }
    }

    public String b() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_get(this.a, this);
    }

    public boolean d() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_get(this.a, this);
    }

    public String e() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_get(this.a, this);
    }

    public boolean f() {
        return ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_get(this.a, this);
    }

    public void finalize() {
        a();
    }

    public void g(String str) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_alias_set(this.a, this, str);
    }

    public void h(boolean z) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_error_set(this.a, this, z);
    }

    public void i(String str) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_errorText_set(this.a, this, str);
    }

    public void j(boolean z) {
        ovpncliJNI.ClientAPI_ExternalPKIRequestBase_invalidAlias_set(this.a, this, z);
    }

    public ClientAPI_ExternalPKIRequestBase() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKIRequestBase(), true);
    }
}
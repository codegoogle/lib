package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ExternalPKISignRequest extends ClientAPI_ExternalPKIRequestBase {
    private transient long c;

    public ClientAPI_ExternalPKISignRequest(long j, boolean z) {
        super(ovpncliJNI.ClientAPI_ExternalPKISignRequest_SWIGUpcast(j), z);
        this.c = j;
    }

    public static long l(ClientAPI_ExternalPKISignRequest clientAPI_ExternalPKISignRequest) {
        if (clientAPI_ExternalPKISignRequest == null) {
            return 0L;
        }
        return clientAPI_ExternalPKISignRequest.c;
    }

    @Override // net.openvpn.ovpn3.ClientAPI_ExternalPKIRequestBase
    public synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ExternalPKISignRequest(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    @Override // net.openvpn.ovpn3.ClientAPI_ExternalPKIRequestBase
    public void finalize() {
        a();
    }

    public String k() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_algorithm_get(this.c, this);
    }

    public String m() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_data_get(this.c, this);
    }

    public String n() {
        return ovpncliJNI.ClientAPI_ExternalPKISignRequest_sig_get(this.c, this);
    }

    public void o(String str) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_algorithm_set(this.c, this, str);
    }

    public void p(String str) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_data_set(this.c, this, str);
    }

    public void q(String str) {
        ovpncliJNI.ClientAPI_ExternalPKISignRequest_sig_set(this.c, this, str);
    }

    public ClientAPI_ExternalPKISignRequest() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKISignRequest(), true);
    }
}
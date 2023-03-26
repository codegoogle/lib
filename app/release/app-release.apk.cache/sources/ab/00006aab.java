package net.openvpn.ovpn3;

/* loaded from: classes3.dex */
public class ClientAPI_ExternalPKICertRequest extends ClientAPI_ExternalPKIRequestBase {
    private transient long c;

    public ClientAPI_ExternalPKICertRequest(long j, boolean z) {
        super(ovpncliJNI.ClientAPI_ExternalPKICertRequest_SWIGUpcast(j), z);
        this.c = j;
    }

    public static long k(ClientAPI_ExternalPKICertRequest clientAPI_ExternalPKICertRequest) {
        if (clientAPI_ExternalPKICertRequest == null) {
            return 0L;
        }
        return clientAPI_ExternalPKICertRequest.c;
    }

    @Override // net.openvpn.ovpn3.ClientAPI_ExternalPKIRequestBase
    public synchronized void a() {
        long j = this.c;
        if (j != 0) {
            if (this.b) {
                this.b = false;
                ovpncliJNI.delete_ClientAPI_ExternalPKICertRequest(j);
            }
            this.c = 0L;
        }
        super.a();
    }

    @Override // net.openvpn.ovpn3.ClientAPI_ExternalPKIRequestBase
    public void finalize() {
        a();
    }

    public String l() {
        return ovpncliJNI.ClientAPI_ExternalPKICertRequest_cert_get(this.c, this);
    }

    public String m() {
        return ovpncliJNI.ClientAPI_ExternalPKICertRequest_supportingChain_get(this.c, this);
    }

    public void n(String str) {
        ovpncliJNI.ClientAPI_ExternalPKICertRequest_cert_set(this.c, this, str);
    }

    public void o(String str) {
        ovpncliJNI.ClientAPI_ExternalPKICertRequest_supportingChain_set(this.c, this, str);
    }

    public ClientAPI_ExternalPKICertRequest() {
        this(ovpncliJNI.new_ClientAPI_ExternalPKICertRequest(), true);
    }
}
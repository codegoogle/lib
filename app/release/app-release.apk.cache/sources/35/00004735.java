package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConnectionSpecSelector.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/p7700g/p99005/hs5;", "", "Ljavax/net/ssl/SSLSocket;", "socket", "", "c", "(Ljavax/net/ssl/SSLSocket;)Z", "sslSocket", "Lcom/p7700g/p99005/oq5;", "a", "(Ljavax/net/ssl/SSLSocket;)Lcom/p7700g/p99005/oq5;", "Ljava/io/IOException;", "e", "b", "(Ljava/io/IOException;)Z", "Z", "isFallback", "isFallbackPossible", "", "d", "Ljava/util/List;", "connectionSpecs", "", AFHydra.STATUS_IDLE, "nextModeIndex", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class hs5 {
    private int a;
    private boolean b;
    private boolean c;
    private final List<oq5> d;

    public hs5(@NotNull List<oq5> list) {
        c25.p(list, "connectionSpecs");
        this.d = list;
    }

    private final boolean c(SSLSocket sSLSocket) {
        int size = this.d.size();
        for (int i = this.a; i < size; i++) {
            if (this.d.get(i).h(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final oq5 a(@NotNull SSLSocket sSLSocket) throws IOException {
        oq5 oq5Var;
        c25.p(sSLSocket, "sslSocket");
        int i = this.a;
        int size = this.d.size();
        while (true) {
            if (i >= size) {
                oq5Var = null;
                break;
            }
            oq5Var = this.d.get(i);
            if (oq5Var.h(sSLSocket)) {
                this.a = i + 1;
                break;
            }
            i++;
        }
        if (oq5Var != null) {
            this.b = c(sSLSocket);
            oq5Var.f(sSLSocket, this.c);
            return oq5Var;
        }
        StringBuilder G = wo1.G("Unable to find acceptable protocols. isFallback=");
        G.append(this.c);
        G.append(e14.f0);
        G.append(" modes=");
        G.append(this.d);
        G.append(e14.f0);
        G.append(" supported protocols=");
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        c25.m(enabledProtocols);
        String arrays = Arrays.toString(enabledProtocols);
        c25.o(arrays, "java.util.Arrays.toString(this)");
        G.append(arrays);
        throw new UnknownServiceException(G.toString());
    }

    public final boolean b(@NotNull IOException iOException) {
        c25.p(iOException, "e");
        this.c = true;
        return (!this.b || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException) || ((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException) || !(iOException instanceof SSLException)) ? false : true;
    }
}
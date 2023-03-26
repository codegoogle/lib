package com.p7700g.p99005;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: lambda */
/* loaded from: classes.dex */
public final /* synthetic */ class xs0 implements HostnameVerifier {
    public static final /* synthetic */ xs0 a = new xs0();

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        bt0.q(str, sSLSession);
        return true;
    }
}
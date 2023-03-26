package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* loaded from: assets/audience_network.dex */
public interface Q1 {
    boolean A9Z(C0919Pz c0919Pz);

    HttpURLConnection ABS(String str) throws IOException;

    InputStream ABT(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ABU(HttpURLConnection httpURLConnection) throws IOException;

    void ABk(HttpURLConnection httpURLConnection, EnumC0917Px enumC0917Px, String str) throws IOException;

    byte[] AC4(InputStream inputStream) throws IOException;

    void ADx(OutputStream outputStream, byte[] bArr) throws IOException;
}
package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: DefaultLottieNetworkFetcher.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class sm0 implements wm0 {
    @Override // com.p7700g.p99005.wm0
    @x1
    public um0 a(@x1 String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new rm0(httpURLConnection);
    }
}
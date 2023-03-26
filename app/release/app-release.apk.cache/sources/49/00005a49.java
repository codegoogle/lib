package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* compiled from: DefaultLottieFetchResult.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class rm0 implements um0 {
    @x1
    private final HttpURLConnection s;

    public rm0(@x1 HttpURLConnection httpURLConnection) {
        this.s = httpURLConnection;
    }

    private String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append('\n');
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } finally {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
            }
        }
        return sb.toString();
    }

    @Override // com.p7700g.p99005.um0
    @z1
    public String J0() {
        return this.s.getContentType();
    }

    @Override // com.p7700g.p99005.um0
    @z1
    public String O0() {
        try {
            if (s1()) {
                return null;
            }
            return "Unable to fetch " + this.s.getURL() + ". Failed with " + this.s.getResponseCode() + "\n" + a(this.s);
        } catch (IOException e) {
            yo0.f("get error failed ", e);
            return e.getMessage();
        }
    }

    @Override // com.p7700g.p99005.um0
    @x1
    public InputStream Z0() throws IOException {
        return this.s.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.s.disconnect();
    }

    @Override // com.p7700g.p99005.um0
    public boolean s1() {
        try {
            return this.s.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
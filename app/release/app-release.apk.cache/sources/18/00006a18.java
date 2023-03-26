package com.p7700g.p99005;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: Closing.java */
/* loaded from: classes3.dex */
public class zw3 {
    private final InputStream a;

    /* compiled from: Closing.java */
    /* loaded from: classes3.dex */
    public interface a {
        void a(InputStream inputStream) throws IOException;
    }

    public zw3(InputStream inputStream) {
        this.a = inputStream;
    }

    public static zw3 b(InputStream inputStream) {
        return new zw3(inputStream);
    }

    public void a(a aVar) throws IOException {
        InputStream inputStream = this.a;
        if (inputStream == null) {
            return;
        }
        try {
            aVar.a(inputStream);
            try {
                this.a.close();
            } catch (IOException e) {
                throw e;
            }
        } catch (Throwable th) {
            try {
                this.a.close();
                throw th;
            } catch (IOException e2) {
                throw e2;
            }
        }
    }
}
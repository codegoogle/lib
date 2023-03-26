package com.p7700g.p99005;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamEncoder.java */
/* loaded from: classes2.dex */
public class ju1 implements dq1<InputStream> {
    private static final String a = "StreamEncoder";
    private final is1 b;

    public ju1(is1 is1Var) {
        this.b = is1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // com.p7700g.p99005.dq1
    /* renamed from: c */
    public boolean a(@x1 InputStream inputStream, @x1 File file, @x1 jq1 jq1Var) {
        byte[] bArr = (byte[]) this.b.h(65536, byte[].class);
        boolean z = false;
        FileOutputStream fileOutputStream = 0;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            fileOutputStream = -1;
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (IOException unused) {
                            fileOutputStream = fileOutputStream2;
                            Log.isLoggable(a, 3);
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                                fileOutputStream = fileOutputStream;
                            }
                            this.b.f(bArr);
                            return z;
                        } catch (Throwable th) {
                            th = th;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            this.b.f(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z = true;
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
            }
            this.b.f(bArr);
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
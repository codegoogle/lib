package com.anythink.expressad.foundation.g.f.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.i;
import com.anythink.expressad.foundation.g.f.k;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.sm4;
import java.io.File;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.zip.GZIPInputStream;

/* loaded from: classes2.dex */
public class a extends i<Void> {
    private static final String c = a.class.getSimpleName();
    private File d;
    private File e;

    public a(File file, String str) {
        super(str);
        this.d = file;
        this.e = new File(file + ".tmp");
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final k<Void> a(com.anythink.expressad.foundation.g.f.f.c cVar) {
        if (!f()) {
            if (this.e.canRead() && this.e.length() > 0) {
                if (this.e.renameTo(this.d)) {
                    return k.a(null, cVar);
                }
                return k.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
            }
            return k.a(new com.anythink.expressad.foundation.g.f.a.a(4, cVar));
        }
        return k.a(new com.anythink.expressad.foundation.g.f.a.a(-2, cVar));
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final int j() {
        return 1;
    }

    @Override // com.anythink.expressad.foundation.g.f.i
    public final byte[] a(com.anythink.expressad.foundation.g.f.f.b bVar, com.anythink.expressad.foundation.g.f.c cVar) {
        String a = com.anythink.expressad.foundation.g.f.g.e.a(bVar.b(), sm4.i);
        long j = 0;
        long longValue = !TextUtils.isEmpty(a) ? Long.valueOf(a).longValue() : 0L;
        int i = (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1));
        if (i <= 0) {
            n.b(c, "Response doesn't present Content-Length!");
        }
        InputStream inputStream = null;
        if (i > 0 && this.d.length() == longValue) {
            this.d.renameTo(this.e);
            cVar.a(this, longValue, longValue);
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.e.getAbsolutePath(), "rw");
        randomAccessFile.setLength(0L);
        try {
            InputStream c2 = bVar.c();
            try {
                InputStream gZIPInputStream = (!com.anythink.expressad.foundation.g.f.g.e.b(bVar.b()) || (c2 instanceof GZIPInputStream)) ? c2 : new GZIPInputStream(c2);
                try {
                    byte[] bArr = new byte[6144];
                    try {
                        do {
                            int read = gZIPInputStream.read(bArr);
                            if (read != -1) {
                                randomAccessFile.write(bArr, 0, read);
                                j += read;
                                cVar.a(this, longValue, j);
                            }
                            break;
                        } while (!f());
                        break;
                        gZIPInputStream.close();
                    } catch (Exception e) {
                        n.d(c, e.getMessage());
                    }
                    cVar.b(this);
                    randomAccessFile.close();
                    return null;
                } catch (Throwable th) {
                    inputStream = gZIPInputStream;
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Exception e2) {
                            n.d(c, e2.getMessage());
                        }
                    }
                    randomAccessFile.close();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream = c2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
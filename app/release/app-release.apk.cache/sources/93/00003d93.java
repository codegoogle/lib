package com.p7700g.p99005;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: StreamGifDecoder.java */
/* loaded from: classes2.dex */
public class cx1 implements lq1<InputStream, vw1> {
    private static final String a = "StreamGifDecoder";
    private final List<ImageHeaderParser> b;
    private final lq1<ByteBuffer, vw1> c;
    private final is1 d;

    public cx1(List<ImageHeaderParser> list, lq1<ByteBuffer, vw1> lq1Var, is1 is1Var) {
        this.b = list;
        this.c = lq1Var;
        this.d = is1Var;
    }

    private static byte[] e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            Log.isLoggable(a, 5);
            return null;
        }
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: c */
    public cs1<vw1> b(@x1 InputStream inputStream, int i, int i2, @x1 jq1 jq1Var) throws IOException {
        byte[] e = e(inputStream);
        if (e == null) {
            return null;
        }
        return this.c.b(ByteBuffer.wrap(e), i, i2, jq1Var);
    }

    @Override // com.p7700g.p99005.lq1
    /* renamed from: d */
    public boolean a(@x1 InputStream inputStream, @x1 jq1 jq1Var) throws IOException {
        return !((Boolean) jq1Var.c(bx1.b)).booleanValue() && fq1.f(this.b, inputStream, this.d) == ImageHeaderParser.ImageType.GIF;
    }
}
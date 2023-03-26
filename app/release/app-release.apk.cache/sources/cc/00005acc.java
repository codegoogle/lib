package com.p7700g.p99005;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser.java */
@e2(27)
/* loaded from: classes2.dex */
public final class rv1 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @x1
    public ImageHeaderParser.ImageType a(@x1 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@x1 ByteBuffer byteBuffer, @x1 is1 is1Var) throws IOException {
        return d(l02.g(byteBuffer), is1Var);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @x1
    public ImageHeaderParser.ImageType c(@x1 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@x1 InputStream inputStream, @x1 is1 is1Var) throws IOException {
        int r = new bx(inputStream).r(bx.h, 1);
        if (r == 0) {
            return -1;
        }
        return r;
    }
}
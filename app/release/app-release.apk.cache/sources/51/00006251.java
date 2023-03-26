package com.p7700g.p99005;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.UUID;

/* compiled from: RandomFidGenerator.java */
/* loaded from: classes3.dex */
public class vr2 {
    private static final byte a = Byte.parseByte("01110000", 2);
    private static final byte b = Byte.parseByte("00001111", 2);
    private static final int c = 22;

    private static String b(byte[] bArr) {
        return new String(Base64.encode(bArr, 11), Charset.defaultCharset()).substring(0, 22);
    }

    private static byte[] c(UUID uuid, byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }

    @x1
    public String a() {
        byte[] c2 = c(UUID.randomUUID(), new byte[17]);
        c2[16] = c2[0];
        c2[0] = (byte) ((b & c2[0]) | a);
        return b(c2);
    }
}
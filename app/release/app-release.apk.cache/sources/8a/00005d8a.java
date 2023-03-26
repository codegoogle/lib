package com.p7700g.p99005;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: TokenContents.java */
/* loaded from: classes.dex */
public final class t6 {
    @x1
    private final byte[] a;
    @z1
    private String b;
    @z1
    private List<byte[]> c;

    private t6(@x1 byte[] bArr) {
        this.a = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(byte[] bArr, byte[] bArr2) {
        int length;
        int length2;
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int i = 0;
        while (true) {
            if (i < Math.min(bArr.length, bArr2.length)) {
                if (bArr[i] != bArr2[i]) {
                    length = bArr[i];
                    length2 = bArr2[i];
                    break;
                }
                i++;
            } else if (bArr.length == bArr2.length) {
                return 0;
            } else {
                length = bArr.length;
                length2 = bArr2.length;
            }
        }
        return length - length2;
    }

    @x1
    public static t6 b(String str, List<byte[]> list) throws IOException {
        return new t6(c(str, list), str, list);
    }

    @x1
    private static byte[] c(@x1 String str, @x1 List<byte[]> list) throws IOException {
        Collections.sort(list, k6.s);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeInt(list.size());
        for (byte[] bArr : list) {
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    @x1
    public static t6 d(@x1 byte[] bArr) {
        return new t6(bArr);
    }

    private void i() throws IOException {
        if (this.b != null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
        this.b = dataInputStream.readUTF();
        int readInt = dataInputStream.readInt();
        this.c = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = dataInputStream.readInt();
            byte[] bArr = new byte[readInt2];
            if (dataInputStream.read(bArr) == readInt2) {
                this.c.add(bArr);
            } else {
                throw new IllegalStateException("Could not read fingerprint");
            }
        }
    }

    @x1
    public byte[] e(int i) throws IOException {
        i();
        List<byte[]> list = this.c;
        if (list != null) {
            return Arrays.copyOf(list.get(i), this.c.get(i).length);
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t6.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((t6) obj).a);
    }

    public int f() throws IOException {
        i();
        List<byte[]> list = this.c;
        if (list != null) {
            return list.size();
        }
        throw new IllegalStateException();
    }

    @x1
    public String g() throws IOException {
        i();
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @x1
    public byte[] j() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    private t6(@x1 byte[] bArr, @x1 String str, @x1 List<byte[]> list) {
        this.a = bArr;
        this.b = str;
        this.c = new ArrayList(list.size());
        for (byte[] bArr2 : list) {
            this.c.add(Arrays.copyOf(bArr2, bArr2.length));
        }
    }
}
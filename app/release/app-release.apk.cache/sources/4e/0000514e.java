package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Table.java */
/* loaded from: classes.dex */
public class mw {
    public int a;
    public ByteBuffer b;
    private int c;
    private int d;
    public ow e = ow.d();

    /* compiled from: Table.java */
    /* loaded from: classes.dex */
    public class a implements Comparator<Integer> {
        public final /* synthetic */ ByteBuffer s;

        public a(ByteBuffer byteBuffer) {
            this.s = byteBuffer;
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Integer num, Integer num2) {
            return mw.this.s(num, num2, this.s);
        }
    }

    public static boolean a(ByteBuffer byteBuffer, String str) {
        if (str.length() == 4) {
            for (int i = 0; i < 4; i++) {
                if (str.charAt(i) != ((char) byteBuffer.get(byteBuffer.position() + 4 + i))) {
                    return false;
                }
            }
            return true;
        }
        throw new AssertionError("FlatBuffers: file identifier must be length 4");
    }

    public static int c(int i, ByteBuffer byteBuffer) {
        return byteBuffer.getInt(i) + i;
    }

    public static int e(int i, int i2, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity() - i2;
        return byteBuffer.getShort((i + capacity) - byteBuffer.getInt(capacity)) + capacity;
    }

    public static String i(int i, ByteBuffer byteBuffer, ow owVar) {
        int i2 = byteBuffer.getInt(i) + i;
        return owVar.a(byteBuffer, i2 + 4, byteBuffer.getInt(i2));
    }

    public static mw k(mw mwVar, int i, ByteBuffer byteBuffer) {
        mwVar.g(c(i, byteBuffer), byteBuffer);
        return mwVar;
    }

    public static int p(int i, int i2, ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt(i) + i;
        int i4 = byteBuffer.getInt(i2) + i2;
        int i5 = byteBuffer.getInt(i3);
        int i6 = byteBuffer.getInt(i4);
        int i7 = i3 + 4;
        int i8 = i4 + 4;
        int min = Math.min(i5, i6);
        for (int i9 = 0; i9 < min; i9++) {
            int i10 = i9 + i7;
            int i11 = i9 + i8;
            if (byteBuffer.get(i10) != byteBuffer.get(i11)) {
                return byteBuffer.get(i10) - byteBuffer.get(i11);
            }
        }
        return i5 - i6;
    }

    public static int q(int i, byte[] bArr, ByteBuffer byteBuffer) {
        int i2 = byteBuffer.getInt(i) + i;
        int i3 = byteBuffer.getInt(i2);
        int length = bArr.length;
        int i4 = i2 + 4;
        int min = Math.min(i3, length);
        for (int i5 = 0; i5 < min; i5++) {
            int i6 = i5 + i4;
            if (byteBuffer.get(i6) != bArr[i5]) {
                return byteBuffer.get(i6) - bArr[i5];
            }
        }
        return i3 - length;
    }

    public int b(int i) {
        return this.b.getInt(i) + i;
    }

    public int d(int i) {
        if (i < this.d) {
            return this.b.getShort(this.c + i);
        }
        return 0;
    }

    public void f() {
        g(0, null);
    }

    public void g(int i, ByteBuffer byteBuffer) {
        this.b = byteBuffer;
        if (byteBuffer != null) {
            this.a = i;
            int i2 = i - byteBuffer.getInt(i);
            this.c = i2;
            this.d = this.b.getShort(i2);
            return;
        }
        this.a = 0;
        this.c = 0;
        this.d = 0;
    }

    public String h(int i) {
        return i(i, this.b, this.e);
    }

    public mw j(mw mwVar, int i) {
        return k(mwVar, i, this.b);
    }

    public int l(int i) {
        int i2 = i + this.a;
        return this.b.getInt(i2) + i2 + 4;
    }

    public ByteBuffer m(int i, int i2) {
        int d = d(i);
        if (d == 0) {
            return null;
        }
        ByteBuffer order = this.b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
        int l = l(d);
        order.position(l);
        order.limit((o(d) * i2) + l);
        return order;
    }

    public ByteBuffer n(ByteBuffer byteBuffer, int i, int i2) {
        int d = d(i);
        if (d == 0) {
            return null;
        }
        int l = l(d);
        byteBuffer.rewind();
        byteBuffer.limit((o(d) * i2) + l);
        byteBuffer.position(l);
        return byteBuffer;
    }

    public int o(int i) {
        int i2 = i + this.a;
        return this.b.getInt(this.b.getInt(i2) + i2);
    }

    public ByteBuffer r() {
        return this.b;
    }

    public int s(Integer num, Integer num2, ByteBuffer byteBuffer) {
        return 0;
    }

    public void t(int[] iArr, ByteBuffer byteBuffer) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        Arrays.sort(numArr, new a(byteBuffer));
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
    }
}
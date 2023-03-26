package com.ironsource.sdk.utils;

import com.p7700g.p99005.g15;

/* loaded from: classes3.dex */
public final class c {
    private static final byte[] a = {g15.b, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private a b = new a(this, (byte) 0);
    private a c = new a(this, (byte) 0);
    private int[] d = new int[16];

    /* loaded from: classes3.dex */
    public class a {
        public boolean a;
        public int[] b;
        public long c;
        public byte[] d;

        private a() {
            this.a = true;
            this.b = new int[4];
            this.d = new byte[64];
            a();
        }

        public /* synthetic */ a(c cVar, byte b) {
            this();
        }

        public void a() {
            int[] iArr = this.b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.c = 0L;
        }
    }

    public c() {
        this.b.a();
        this.c.a = false;
    }

    private static int a(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & i2) | (i4 & (~i2))) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public static String a(String str) {
        c cVar = new c();
        byte[] bytes = str.getBytes();
        cVar.c(cVar.b, bytes, 0, bytes.length);
        return cVar.b();
    }

    private String b() {
        a aVar = this.c;
        if (!aVar.a) {
            a aVar2 = this.b;
            byte[] bArr = aVar2.d;
            byte[] bArr2 = aVar.d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar2.b;
            int[] iArr2 = aVar.b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            aVar.a = aVar2.a;
            aVar.c = aVar2.c;
            a aVar3 = this.c;
            long j = aVar3.c;
            int i = (int) ((j >>> 3) & 63);
            c(aVar3, a, 0, i < 56 ? 56 - i : 120 - i);
            c(this.c, new byte[]{(byte) (j & 255), (byte) ((j >>> 8) & 255), (byte) ((j >>> 16) & 255), (byte) ((j >>> 24) & 255), (byte) ((j >>> 32) & 255), (byte) ((j >>> 40) & 255), (byte) ((j >>> 48) & 255), (byte) ((j >>> 56) & 255)}, 0, 8);
            this.c.a = true;
        }
        int[] iArr3 = this.c.b;
        byte[] bArr3 = new byte[16];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 16; i2 < i4; i4 = 16) {
            bArr3[i2] = (byte) (iArr3[i3] & 255);
            bArr3[i2 + 1] = (byte) ((iArr3[i3] >>> 8) & 255);
            bArr3[i2 + 2] = (byte) ((iArr3[i3] >>> 16) & 255);
            bArr3[i2 + 3] = (byte) ((iArr3[i3] >>> 24) & 255);
            i3++;
            i2 += 4;
        }
        StringBuffer stringBuffer = new StringBuffer(32);
        for (int i5 = 0; i5 < 16; i5++) {
            int i6 = bArr3[i5] & 255;
            if (i6 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i6));
        }
        return stringBuffer.toString();
    }

    private void c(a aVar, byte[] bArr, int i, int i2) {
        int i3 = 0;
        this.c.a = false;
        if (i2 + i > bArr.length) {
            i2 = bArr.length - i;
        }
        long j = aVar.c;
        int i4 = ((int) (j >>> 3)) & 63;
        aVar.c = j + (i2 << 3);
        int i5 = 64 - i4;
        if (i2 >= i5) {
            System.arraycopy(bArr, i, aVar.d, i4, i5);
            d(aVar, e(aVar.d, 64, 0));
            while (i5 + 63 < i2) {
                d(aVar, e(bArr, 64, i5));
                i5 += 64;
            }
            i3 = i5;
            i4 = 0;
        }
        if (i3 < i2) {
            for (int i6 = i3; i6 < i2; i6++) {
                aVar.d[(i4 + i6) - i3] = bArr[i6 + i];
            }
        }
    }

    private static void d(a aVar, int[] iArr) {
        int[] iArr2 = aVar.b;
        int i = iArr2[0];
        int i2 = iArr2[1];
        int i3 = iArr2[2];
        int i4 = iArr2[3];
        int a2 = a(i, i2, i3, i4, iArr[0], 7, -680876936);
        int a3 = a(i4, a2, i2, i3, iArr[1], 12, -389564586);
        int a4 = a(i3, a3, a2, i2, iArr[2], 17, 606105819);
        int a5 = a(i2, a4, a3, a2, iArr[3], 22, -1044525330);
        int a6 = a(a2, a5, a4, a3, iArr[4], 7, -176418897);
        int a7 = a(a3, a6, a5, a4, iArr[5], 12, 1200080426);
        int a8 = a(a4, a7, a6, a5, iArr[6], 17, -1473231341);
        int a9 = a(a5, a8, a7, a6, iArr[7], 22, -45705983);
        int a10 = a(a6, a9, a8, a7, iArr[8], 7, 1770035416);
        int a11 = a(a7, a10, a9, a8, iArr[9], 12, -1958414417);
        int a12 = a(a8, a11, a10, a9, iArr[10], 17, -42063);
        int a13 = a(a9, a12, a11, a10, iArr[11], 22, -1990404162);
        int a14 = a(a10, a13, a12, a11, iArr[12], 7, 1804603682);
        int a15 = a(a11, a14, a13, a12, iArr[13], 12, -40341101);
        int a16 = a(a12, a15, a14, a13, iArr[14], 17, -1502002290);
        int a17 = a(a13, a16, a15, a14, iArr[15], 22, 1236535329);
        int f = f(a14, a17, a16, a15, iArr[1], 5, -165796510);
        int f2 = f(a15, f, a17, a16, iArr[6], 9, -1069501632);
        int f3 = f(a16, f2, f, a17, iArr[11], 14, 643717713);
        int f4 = f(a17, f3, f2, f, iArr[0], 20, -373897302);
        int f5 = f(f, f4, f3, f2, iArr[5], 5, -701558691);
        int f6 = f(f2, f5, f4, f3, iArr[10], 9, 38016083);
        int f7 = f(f3, f6, f5, f4, iArr[15], 14, -660478335);
        int f8 = f(f4, f7, f6, f5, iArr[4], 20, -405537848);
        int f9 = f(f5, f8, f7, f6, iArr[9], 5, 568446438);
        int f10 = f(f6, f9, f8, f7, iArr[14], 9, -1019803690);
        int f11 = f(f7, f10, f9, f8, iArr[3], 14, -187363961);
        int f12 = f(f8, f11, f10, f9, iArr[8], 20, 1163531501);
        int f13 = f(f9, f12, f11, f10, iArr[13], 5, -1444681467);
        int f14 = f(f10, f13, f12, f11, iArr[2], 9, -51403784);
        int f15 = f(f11, f14, f13, f12, iArr[7], 14, 1735328473);
        int f16 = f(f12, f15, f14, f13, iArr[12], 20, -1926607734);
        int g = g(f13, f16, f15, f14, iArr[5], 4, -378558);
        int g2 = g(f14, g, f16, f15, iArr[8], 11, -2022574463);
        int g3 = g(f15, g2, g, f16, iArr[11], 16, 1839030562);
        int g4 = g(f16, g3, g2, g, iArr[14], 23, -35309556);
        int g5 = g(g, g4, g3, g2, iArr[1], 4, -1530992060);
        int g6 = g(g2, g5, g4, g3, iArr[4], 11, 1272893353);
        int g7 = g(g3, g6, g5, g4, iArr[7], 16, -155497632);
        int g8 = g(g4, g7, g6, g5, iArr[10], 23, -1094730640);
        int g9 = g(g5, g8, g7, g6, iArr[13], 4, 681279174);
        int g10 = g(g6, g9, g8, g7, iArr[0], 11, -358537222);
        int g11 = g(g7, g10, g9, g8, iArr[3], 16, -722521979);
        int g12 = g(g8, g11, g10, g9, iArr[6], 23, 76029189);
        int g13 = g(g9, g12, g11, g10, iArr[9], 4, -640364487);
        int g14 = g(g10, g13, g12, g11, iArr[12], 11, -421815835);
        int g15 = g(g11, g14, g13, g12, iArr[15], 16, 530742520);
        int g16 = g(g12, g15, g14, g13, iArr[2], 23, -995338651);
        int h = h(g13, g16, g15, g14, iArr[0], 6, -198630844);
        int h2 = h(g14, h, g16, g15, iArr[7], 10, 1126891415);
        int h3 = h(g15, h2, h, g16, iArr[14], 15, -1416354905);
        int h4 = h(g16, h3, h2, h, iArr[5], 21, -57434055);
        int h5 = h(h, h4, h3, h2, iArr[12], 6, 1700485571);
        int h6 = h(h2, h5, h4, h3, iArr[3], 10, -1894986606);
        int h7 = h(h3, h6, h5, h4, iArr[10], 15, -1051523);
        int h8 = h(h4, h7, h6, h5, iArr[1], 21, -2054922799);
        int h9 = h(h5, h8, h7, h6, iArr[8], 6, 1873313359);
        int h10 = h(h6, h9, h8, h7, iArr[15], 10, -30611744);
        int h11 = h(h7, h10, h9, h8, iArr[6], 15, -1560198380);
        int h12 = h(h8, h11, h10, h9, iArr[13], 21, 1309151649);
        int h13 = h(h9, h12, h11, h10, iArr[4], 6, -145523070);
        int h14 = h(h10, h13, h12, h11, iArr[11], 10, -1120210379);
        int h15 = h(h11, h14, h13, h12, iArr[2], 15, 718787259);
        int h16 = h(h12, h15, h14, h13, iArr[9], 21, -343485551);
        int[] iArr3 = aVar.b;
        iArr3[0] = iArr3[0] + h13;
        iArr3[1] = iArr3[1] + h16;
        iArr3[2] = iArr3[2] + h15;
        iArr3[3] = iArr3[3] + h14;
    }

    private int[] e(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 64; i4 += 4) {
            this.d[i3] = (bArr[i4 + i2] & 255) | ((bArr[(i4 + 1) + i2] & 255) << 8) | ((bArr[(i4 + 2) + i2] & 255) << 16) | ((bArr[(i4 + 3) + i2] & 255) << 24);
            i3++;
        }
        return this.d;
    }

    private static int f(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 & (~i4)) | (i2 & i4)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    private static int g(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + ((i3 ^ i2) ^ i4) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    private static int h(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        int i8 = i + (i3 ^ ((~i4) | i2)) + i5 + i7;
        return ((i8 >>> (32 - i6)) | (i8 << i6)) + i2;
    }

    public final String toString() {
        return b();
    }
}
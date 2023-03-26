package com.p7700g.p99005;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* compiled from: DefaultImageHeaderParser.java */
/* loaded from: classes2.dex */
public final class mv1 implements ImageHeaderParser {
    private static final int A = 1635150182;
    private static final int B = 1635150195;
    private static final String b = "DfltImageHeaderParser";
    private static final int c = 4671814;
    private static final int d = -1991225785;
    public static final int e = 65496;
    private static final int f = 19789;
    private static final int g = 18761;
    private static final int j = 218;
    private static final int k = 217;
    public static final int l = 255;
    public static final int m = 225;
    private static final int n = 274;
    private static final int p = 1380533830;
    private static final int q = 1464156752;
    private static final int r = 1448097792;
    private static final int s = -256;
    private static final int t = 255;
    private static final int u = 88;
    private static final int v = 76;
    private static final int w = 2;
    private static final int x = 16;
    private static final int y = 8;
    private static final int z = 1718909296;
    private static final String h = "Exif\u0000\u0000";
    public static final byte[] i = h.getBytes(Charset.forName("UTF-8"));
    private static final int[] o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes2.dex */
    public static final class a implements c {
        private final ByteBuffer a;

        public a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.p7700g.p99005.mv1.c
        public int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // com.p7700g.p99005.mv1.c
        public int b(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // com.p7700g.p99005.mv1.c
        public short c() throws c.a {
            if (this.a.remaining() >= 1) {
                return (short) (this.a.get() & 255);
            }
            throw new c.a();
        }

        @Override // com.p7700g.p99005.mv1.c
        public long skip(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes2.dex */
    public static final class b {
        private final ByteBuffer a;

        public b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        private boolean c(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }

        public short a(int i) {
            if (c(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        public int b(int i) {
            if (c(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        public int d() {
            return this.a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes2.dex */
    public interface c {

        /* compiled from: DefaultImageHeaderParser.java */
        /* loaded from: classes2.dex */
        public static final class a extends IOException {
            private static final long s = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i) throws IOException;

        short c() throws IOException;

        long skip(long j) throws IOException;
    }

    /* compiled from: DefaultImageHeaderParser.java */
    /* loaded from: classes2.dex */
    public static final class d implements c {
        private final InputStream a;

        public d(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.p7700g.p99005.mv1.c
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.p7700g.p99005.mv1.c
        public int b(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new c.a();
            }
            return i2;
        }

        @Override // com.p7700g.p99005.mv1.c
        public short c() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new c.a();
        }

        @Override // com.p7700g.p99005.mv1.c
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }

    private static int e(int i2, int i3) {
        return (i3 * 12) + i2 + 2;
    }

    private int f(c cVar, is1 is1Var) throws IOException {
        try {
            if (!h(cVar.a())) {
                Log.isLoggable(b, 3);
                return -1;
            }
            int j2 = j(cVar);
            if (j2 == -1) {
                Log.isLoggable(b, 3);
                return -1;
            }
            byte[] bArr = (byte[]) is1Var.h(j2, byte[].class);
            int l2 = l(cVar, bArr, j2);
            is1Var.f(bArr);
            return l2;
        } catch (c.a unused) {
            return -1;
        }
    }

    @x1
    private ImageHeaderParser.ImageType g(c cVar) throws IOException {
        try {
            int a2 = cVar.a();
            if (a2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int c2 = (a2 << 8) | cVar.c();
            if (c2 == c) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int c3 = (c2 << 8) | cVar.c();
            if (c3 == d) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (c3 != p) {
                return m(cVar, c3) ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            } else {
                cVar.skip(4L);
                if (((cVar.a() << 16) | cVar.a()) != q) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int a3 = (cVar.a() << 16) | cVar.a();
                if ((a3 & (-256)) != r) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i2 = a3 & 255;
                if (i2 != 88) {
                    if (i2 == 76) {
                        cVar.skip(4L);
                        return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.skip(4L);
                short c4 = cVar.c();
                if ((c4 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((c4 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static boolean h(int i2) {
        return (i2 & e) == 65496 || i2 == f || i2 == g;
    }

    private boolean i(byte[] bArr, int i2) {
        boolean z2 = bArr != null && i2 > i.length;
        if (z2) {
            int i3 = 0;
            while (true) {
                byte[] bArr2 = i;
                if (i3 >= bArr2.length) {
                    break;
                } else if (bArr[i3] != bArr2[i3]) {
                    return false;
                } else {
                    i3++;
                }
            }
        }
        return z2;
    }

    private int j(c cVar) throws IOException {
        while (cVar.c() == 255) {
            short c2 = cVar.c();
            if (c2 == j) {
                return -1;
            }
            if (c2 == k) {
                Log.isLoggable(b, 3);
                return -1;
            }
            int a2 = cVar.a() - 2;
            if (c2 == 225) {
                return a2;
            }
            long j2 = a2;
            if (cVar.skip(j2) != j2) {
                Log.isLoggable(b, 3);
                return -1;
            }
        }
        Log.isLoggable(b, 3);
        return -1;
    }

    private static int k(b bVar) {
        ByteOrder byteOrder;
        short a2 = bVar.a(6);
        if (a2 == g) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (a2 != f) {
            Log.isLoggable(b, 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.e(byteOrder);
        int b2 = bVar.b(10) + 6;
        short a3 = bVar.a(b2);
        for (int i2 = 0; i2 < a3; i2++) {
            int e2 = e(b2, i2);
            if (bVar.a(e2) == n) {
                short a4 = bVar.a(e2 + 2);
                if (a4 >= 1 && a4 <= 12) {
                    int b3 = bVar.b(e2 + 4);
                    if (b3 < 0) {
                        Log.isLoggable(b, 3);
                    } else {
                        Log.isLoggable(b, 3);
                        int i3 = b3 + o[a4];
                        if (i3 > 4) {
                            Log.isLoggable(b, 3);
                        } else {
                            int i4 = e2 + 8;
                            if (i4 >= 0 && i4 <= bVar.d()) {
                                if (i3 >= 0 && i3 + i4 <= bVar.d()) {
                                    return bVar.a(i4);
                                }
                                Log.isLoggable(b, 3);
                            } else {
                                Log.isLoggable(b, 3);
                            }
                        }
                    }
                } else {
                    Log.isLoggable(b, 3);
                }
            }
        }
        return -1;
    }

    private int l(c cVar, byte[] bArr, int i2) throws IOException {
        if (cVar.b(bArr, i2) != i2) {
            Log.isLoggable(b, 3);
            return -1;
        } else if (i(bArr, i2)) {
            return k(new b(bArr, i2));
        } else {
            Log.isLoggable(b, 3);
            return -1;
        }
    }

    private boolean m(c cVar, int i2) throws IOException {
        if (((cVar.a() << 16) | cVar.a()) != z) {
            return false;
        }
        int a2 = (cVar.a() << 16) | cVar.a();
        if (a2 == A || a2 == B) {
            return true;
        }
        cVar.skip(4L);
        int i3 = i2 - 16;
        if (i3 % 4 != 0) {
            return false;
        }
        int i4 = 0;
        while (i4 < 5 && i3 > 0) {
            int a3 = (cVar.a() << 16) | cVar.a();
            if (a3 == A || a3 == B) {
                return true;
            }
            i4++;
            i3 -= 4;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @x1
    public ImageHeaderParser.ImageType a(@x1 ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) x02.d(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@x1 ByteBuffer byteBuffer, @x1 is1 is1Var) throws IOException {
        return f(new a((ByteBuffer) x02.d(byteBuffer)), (is1) x02.d(is1Var));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @x1
    public ImageHeaderParser.ImageType c(@x1 InputStream inputStream) throws IOException {
        return g(new d((InputStream) x02.d(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@x1 InputStream inputStream, @x1 is1 is1Var) throws IOException {
        return f(new d((InputStream) x02.d(inputStream)), (is1) x02.d(is1Var));
    }
}
package com.p7700g.p99005;

import android.content.res.AssetManager;
import com.p7700g.p99005.i2;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: MetadataListReader.java */
@e2(19)
@i2({i2.a.LIBRARY})
@o0
/* loaded from: classes.dex */
public class lv {
    private static final int a = 1164798569;
    private static final int b = 1701669481;
    private static final int c = 1835365473;

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class a implements d {
        @x1
        private final ByteBuffer c;

        public a(@x1 ByteBuffer byteBuffer) {
            this.c = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.p7700g.p99005.lv.d
        public int a() throws IOException {
            return this.c.getInt();
        }

        @Override // com.p7700g.p99005.lv.d
        public void b(int i) throws IOException {
            ByteBuffer byteBuffer = this.c;
            byteBuffer.position(byteBuffer.position() + i);
        }

        @Override // com.p7700g.p99005.lv.d
        public long c() throws IOException {
            return lv.e(this.c.getInt());
        }

        @Override // com.p7700g.p99005.lv.d
        public long getPosition() {
            return this.c.position();
        }

        @Override // com.p7700g.p99005.lv.d
        public int readUnsignedShort() throws IOException {
            return lv.f(this.c.getShort());
        }
    }

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class b implements d {
        @x1
        private final byte[] c;
        @x1
        private final ByteBuffer d;
        @x1
        private final InputStream e;
        private long f = 0;

        public b(@x1 InputStream inputStream) {
            this.e = inputStream;
            byte[] bArr = new byte[4];
            this.c = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.d = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        private void d(@p1(from = 0, to = 4) int i) throws IOException {
            if (this.e.read(this.c, 0, i) == i) {
                this.f += i;
                return;
            }
            throw new IOException("read failed");
        }

        @Override // com.p7700g.p99005.lv.d
        public int a() throws IOException {
            this.d.position(0);
            d(4);
            return this.d.getInt();
        }

        @Override // com.p7700g.p99005.lv.d
        public void b(int i) throws IOException {
            while (i > 0) {
                int skip = (int) this.e.skip(i);
                if (skip >= 1) {
                    i -= skip;
                    this.f += skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }

        @Override // com.p7700g.p99005.lv.d
        public long c() throws IOException {
            this.d.position(0);
            d(4);
            return lv.e(this.d.getInt());
        }

        @Override // com.p7700g.p99005.lv.d
        public long getPosition() {
            return this.f;
        }

        @Override // com.p7700g.p99005.lv.d
        public int readUnsignedShort() throws IOException {
            this.d.position(0);
            d(2);
            return lv.f(this.d.getShort());
        }
    }

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public static class c {
        private final long a;
        private final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public long a() {
            return this.b;
        }

        public long b() {
            return this.a;
        }
    }

    /* compiled from: MetadataListReader.java */
    /* loaded from: classes.dex */
    public interface d {
        public static final int a = 2;
        public static final int b = 4;

        int a() throws IOException;

        void b(int i) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private lv() {
    }

    private static c a(d dVar) throws IOException {
        long j;
        dVar.b(4);
        int readUnsignedShort = dVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            dVar.b(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int a2 = dVar.a();
                dVar.b(4);
                j = dVar.c();
                dVar.b(4);
                if (c == a2) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                dVar.b((int) (j - dVar.getPosition()));
                dVar.b(12);
                long c2 = dVar.c();
                for (int i2 = 0; i2 < c2; i2++) {
                    int a3 = dVar.a();
                    long c3 = dVar.c();
                    long c4 = dVar.c();
                    if (a == a3 || b == a3) {
                        return new c(c3 + j, c4);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static gw b(AssetManager assetManager, String str) throws IOException {
        InputStream open = assetManager.open(str);
        try {
            gw c2 = c(open);
            if (open != null) {
                open.close();
            }
            return c2;
        } catch (Throwable th) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static gw c(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c a2 = a(bVar);
        bVar.b((int) (a2.b() - bVar.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) a2.a());
        int read = inputStream.read(allocate.array());
        if (read == a2.a()) {
            return gw.G(allocate);
        }
        StringBuilder G = wo1.G("Needed ");
        G.append(a2.a());
        G.append(" bytes, got ");
        G.append(read);
        throw new IOException(G.toString());
    }

    public static gw d(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).b());
        return gw.G(duplicate);
    }

    public static long e(int i) {
        return i & 4294967295L;
    }

    public static int f(short s) {
        return s & tq4.u;
    }
}
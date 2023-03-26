package com.p7700g.p99005;

import com.p7700g.p99005.wy5;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: ElfParser.java */
/* loaded from: classes4.dex */
public class zy5 implements Closeable, wy5 {
    private final int s = com.facebook.soloader.r.a;
    private final FileChannel t;

    public zy5(File file) throws FileNotFoundException {
        if (file != null && file.exists()) {
            this.t = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }

    private long a(wy5.b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            wy5.c b = bVar.b(j3);
            if (b.c == 1) {
                long j4 = b.e;
                if (j4 <= j2 && j2 <= b.f + j4) {
                    return (j2 - j4) + b.d;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public wy5.b b() throws IOException {
        this.t.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (l(allocate, 0L) == 1179403647) {
            short f = f(allocate, 4L);
            boolean z = f(allocate, 5L) == 2;
            if (f == 1) {
                return new xy5(z, this);
            }
            if (f == 2) {
                return new yy5(z, this);
            }
            throw new IllegalStateException("Invalid class type!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.t.close();
    }

    public List<String> d() throws IOException {
        long j;
        this.t.position(0L);
        ArrayList arrayList = new ArrayList();
        wy5.b b = b();
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(b.d ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j2 = b.i;
        int i = 0;
        if (j2 == av5.s) {
            j2 = b.c(0).a;
        }
        long j3 = 0;
        while (true) {
            if (j3 >= j2) {
                j = 0;
                break;
            }
            wy5.c b2 = b.b(j3);
            if (b2.c == 2) {
                j = b2.d;
                break;
            }
            j3++;
        }
        if (j == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j4 = 0;
        while (true) {
            wy5.a a = b.a(j, i);
            long j5 = j;
            long j6 = a.d;
            if (j6 == 1) {
                arrayList2.add(Long.valueOf(a.e));
            } else if (j6 == 5) {
                j4 = a.e;
            }
            i++;
            if (a.d == 0) {
                break;
            }
            j = j5;
        }
        if (j4 != 0) {
            long a2 = a(b, j2, j4);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(k(allocate, ((Long) it.next()).longValue() + a2));
            }
            return arrayList;
        }
        throw new IllegalStateException("String table offset not found!");
    }

    public void e(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < i) {
            int read = this.t.read(byteBuffer, j + j2);
            if (read == -1) {
                throw new EOFException();
            }
            j2 += read;
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int h(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 2);
        return byteBuffer.getShort() & tq4.u;
    }

    public long j(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    public String k(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short f = f(byteBuffer, j);
            if (f != 0) {
                sb.append((char) f);
                j = j2;
            } else {
                return sb.toString();
            }
        }
    }

    public long l(ByteBuffer byteBuffer, long j) throws IOException {
        e(byteBuffer, j, 4);
        return byteBuffer.getInt() & 4294967295L;
    }
}
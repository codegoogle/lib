package com.p7700g.p99005;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: ByteArrayPool.java */
/* loaded from: classes3.dex */
public class g53 {
    public static final Comparator<byte[]> a = new a();
    private final List<byte[]> b = new ArrayList();
    private final List<byte[]> c = new ArrayList(64);
    private int d = 0;
    private final int e;

    /* compiled from: ByteArrayPool.java */
    /* loaded from: classes3.dex */
    public class a implements Comparator<byte[]> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] lhs, byte[] rhs) {
            return lhs.length - rhs.length;
        }
    }

    public g53(int sizeLimit) {
        this.e = sizeLimit;
    }

    private synchronized void c() {
        while (this.d > this.e) {
            byte[] remove = this.b.remove(0);
            this.c.remove(remove);
            this.d -= remove.length;
        }
    }

    public synchronized byte[] a(int len) {
        for (int i = 0; i < this.c.size(); i++) {
            byte[] bArr = this.c.get(i);
            if (bArr.length >= len) {
                this.d -= bArr.length;
                this.c.remove(i);
                this.b.remove(bArr);
                return bArr;
            }
        }
        return new byte[len];
    }

    public synchronized void b(byte[] buf) {
        if (buf != null) {
            if (buf.length <= this.e) {
                this.b.add(buf);
                int binarySearch = Collections.binarySearch(this.c, buf, a);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.c.add(binarySearch, buf);
                this.d += buf.length;
                c();
            }
        }
    }
}
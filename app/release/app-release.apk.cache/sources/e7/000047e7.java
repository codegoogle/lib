package com.p7700g.p99005;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p7700g.p99005.g43;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: DiskBasedCache.java */
/* loaded from: classes3.dex */
public class i53 implements g43 {
    private static final int a = 5242880;
    private static final float b = 0.9f;
    private static final int c = 538247942;
    private final Map<String, a> d;
    private long e;
    private final File f;
    private final int g;

    public i53(File rootDirectory, int maxCacheSizeInBytes) {
        this.d = new LinkedHashMap(16, 0.75f, true);
        this.e = 0L;
        this.f = rootDirectory;
        this.g = maxCacheSizeInBytes;
    }

    private String e(String key) {
        int length = key.length() / 2;
        StringBuilder G = wo1.G(String.valueOf(key.substring(0, length).hashCode()));
        G.append(String.valueOf(key.substring(length).hashCode()));
        return G.toString();
    }

    private void f(int neededSpace) {
        long j;
        long j2 = neededSpace;
        if (this.e + j2 < this.g) {
            return;
        }
        if (c53.b) {
            c53.f("Pruning old cache entries.", new Object[0]);
        }
        long j3 = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, a>> it = this.d.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            a value = it.next().getValue();
            if (d(value.b).delete()) {
                j = j2;
                this.e -= value.a;
            } else {
                j = j2;
                String str = value.b;
                c53.b("Could not delete cache entry for key=%s, filename=%s", str, e(str));
            }
            it.remove();
            i++;
            if (((float) (this.e + j)) < this.g * 0.9f) {
                break;
            }
            j2 = j;
        }
        if (c53.b) {
            c53.f("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.e - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    private void g(String key, a entry) {
        if (!this.d.containsKey(key)) {
            this.e += entry.a;
        } else {
            this.e = (entry.a - this.d.get(key).a) + this.e;
        }
        this.d.put(key, entry);
    }

    private static int h(InputStream is) throws IOException {
        int read = is.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static List<l43> i(b cis) throws IOException {
        int j = j(cis);
        if (j >= 0) {
            List<l43> emptyList = j == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < j; i++) {
                emptyList.add(new l43(l(cis).intern(), l(cis).intern()));
            }
            return emptyList;
        }
        throw new IOException(wo1.l("readHeaderList size=", j));
    }

    public static int j(InputStream is) throws IOException {
        return (h(is) << 24) | (h(is) << 0) | 0 | (h(is) << 8) | (h(is) << 16);
    }

    public static long k(InputStream is) throws IOException {
        return ((h(is) & 255) << 0) | 0 | ((h(is) & 255) << 8) | ((h(is) & 255) << 16) | ((h(is) & 255) << 24) | ((h(is) & 255) << 32) | ((h(is) & 255) << 40) | ((h(is) & 255) << 48) | ((255 & h(is)) << 56);
    }

    public static String l(b cis) throws IOException {
        return new String(n(cis, k(cis)), "UTF-8");
    }

    private void m(String key) {
        a remove = this.d.remove(key);
        if (remove != null) {
            this.e -= remove.a;
        }
    }

    public static byte[] n(b cis, long length) throws IOException {
        long b2 = cis.b();
        if (length >= 0 && length <= b2) {
            int i = (int) length;
            if (i == length) {
                byte[] bArr = new byte[i];
                new DataInputStream(cis).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + length + ", maxLength=" + b2);
    }

    public static void o(List<l43> headers, OutputStream os) throws IOException {
        if (headers != null) {
            p(os, headers.size());
            for (l43 l43Var : headers) {
                r(os, l43Var.a());
                r(os, l43Var.b());
            }
            return;
        }
        p(os, 0);
    }

    public static void p(OutputStream os, int n) throws IOException {
        os.write((n >> 0) & 255);
        os.write((n >> 8) & 255);
        os.write((n >> 16) & 255);
        os.write((n >> 24) & 255);
    }

    public static void q(OutputStream os, long n) throws IOException {
        os.write((byte) (n >>> 0));
        os.write((byte) (n >>> 8));
        os.write((byte) (n >>> 16));
        os.write((byte) (n >>> 24));
        os.write((byte) (n >>> 32));
        os.write((byte) (n >>> 40));
        os.write((byte) (n >>> 48));
        os.write((byte) (n >>> 56));
    }

    public static void r(OutputStream os, String s) throws IOException {
        byte[] bytes = s.getBytes("UTF-8");
        q(os, bytes.length);
        os.write(bytes, 0, bytes.length);
    }

    @Override // com.p7700g.p99005.g43
    public synchronized void a(String key, g43.a entry) {
        f(entry.a.length);
        File d = d(key);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(c(d));
            a aVar = new a(key, entry);
            if (aVar.d(bufferedOutputStream)) {
                bufferedOutputStream.write(entry.a);
                bufferedOutputStream.close();
                g(key, aVar);
            } else {
                bufferedOutputStream.close();
                c53.b("Failed to write header for %s", d.getAbsolutePath());
                throw new IOException();
            }
        } catch (IOException unused) {
            if (d.delete()) {
                return;
            }
            c53.b("Could not clean up file %s", d.getAbsolutePath());
        }
    }

    public InputStream b(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public OutputStream c(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    @Override // com.p7700g.p99005.g43
    public synchronized void clear() {
        File[] listFiles = this.f.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                file.delete();
            }
        }
        this.d.clear();
        this.e = 0L;
        c53.b("Cache cleared.", new Object[0]);
    }

    public File d(String key) {
        return new File(this.f, e(key));
    }

    @Override // com.p7700g.p99005.g43
    public synchronized g43.a get(String key) {
        a aVar = this.d.get(key);
        if (aVar == null) {
            return null;
        }
        File d = d(key);
        try {
            b bVar = new b(new BufferedInputStream(b(d)), d.length());
            try {
                a b2 = a.b(bVar);
                if (!TextUtils.equals(key, b2.b)) {
                    c53.b("%s: key=%s, found=%s", d.getAbsolutePath(), key, b2.b);
                    m(key);
                    return null;
                }
                return aVar.c(n(bVar, bVar.b()));
            } finally {
                bVar.close();
            }
        } catch (IOException e) {
            c53.b("%s: %s", d.getAbsolutePath(), e.toString());
            remove(key);
            return null;
        }
    }

    @Override // com.p7700g.p99005.g43
    public synchronized void initialize() {
        if (!this.f.exists()) {
            if (!this.f.mkdirs()) {
                c53.c("Unable to create cache dir %s", this.f.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = this.f.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                b bVar = new b(new BufferedInputStream(b(file)), length);
                try {
                    a b2 = a.b(bVar);
                    b2.a = length;
                    g(b2.b, b2);
                    bVar.close();
                } catch (Throwable th) {
                    bVar.close();
                    throw th;
                    break;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // com.p7700g.p99005.g43
    public synchronized void invalidate(String key, boolean fullExpire) {
        g43.a aVar = get(key);
        if (aVar != null) {
            aVar.f = 0L;
            if (fullExpire) {
                aVar.e = 0L;
            }
            a(key, aVar);
        }
    }

    @Override // com.p7700g.p99005.g43
    public synchronized void remove(String key) {
        boolean delete = d(key).delete();
        m(key);
        if (!delete) {
            c53.b("Could not delete cache entry for key=%s, filename=%s", key, e(key));
        }
    }

    /* compiled from: DiskBasedCache.java */
    @r2
    /* loaded from: classes3.dex */
    public static class b extends FilterInputStream {
        private final long s;
        private long t;

        public b(InputStream in, long length) {
            super(in);
            this.s = length;
        }

        @r2
        public long a() {
            return this.t;
        }

        public long b() {
            return this.s - this.t;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.t++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] buffer, int offset, int count) throws IOException {
            int read = super.read(buffer, offset, count);
            if (read != -1) {
                this.t += read;
            }
            return read;
        }
    }

    public i53(File rootDirectory) {
        this(rootDirectory, a);
    }

    /* compiled from: DiskBasedCache.java */
    /* loaded from: classes3.dex */
    public static class a {
        public long a;
        public final String b;
        public final String c;
        public final long d;
        public final long e;
        public final long f;
        public final long g;
        public final List<l43> h;

        private a(String key, String etag, long serverDate, long lastModified, long ttl, long softTtl, List<l43> allResponseHeaders) {
            this.b = key;
            this.c = "".equals(etag) ? null : etag;
            this.d = serverDate;
            this.e = lastModified;
            this.f = ttl;
            this.g = softTtl;
            this.h = allResponseHeaders;
        }

        private static List<l43> a(g43.a entry) {
            List<l43> list = entry.h;
            return list != null ? list : k53.g(entry.g);
        }

        public static a b(b is) throws IOException {
            if (i53.j(is) == i53.c) {
                return new a(i53.l(is), i53.l(is), i53.k(is), i53.k(is), i53.k(is), i53.k(is), i53.i(is));
            }
            throw new IOException();
        }

        public g43.a c(byte[] data) {
            g43.a aVar = new g43.a();
            aVar.a = data;
            aVar.b = this.c;
            aVar.c = this.d;
            aVar.d = this.e;
            aVar.e = this.f;
            aVar.f = this.g;
            aVar.g = k53.h(this.h);
            aVar.h = Collections.unmodifiableList(this.h);
            return aVar;
        }

        public boolean d(OutputStream os) {
            try {
                i53.p(os, i53.c);
                i53.r(os, this.b);
                String str = this.c;
                if (str == null) {
                    str = "";
                }
                i53.r(os, str);
                i53.q(os, this.d);
                i53.q(os, this.e);
                i53.q(os, this.f);
                i53.q(os, this.g);
                i53.o(this.h, os);
                os.flush();
                return true;
            } catch (IOException e) {
                c53.b("%s", e.toString());
                return false;
            }
        }

        public a(String key, g43.a entry) {
            this(key, entry.b, entry.c, entry.d, entry.e, entry.f, a(entry));
            this.a = entry.a.length;
        }
    }
}
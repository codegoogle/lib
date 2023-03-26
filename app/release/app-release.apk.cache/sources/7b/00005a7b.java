package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: DiskLruCache.java */
/* loaded from: classes2.dex */
public final class rp1 implements Closeable {
    private static final String A = "REMOVE";
    private static final String B = "READ";
    public static final String s = "journal";
    public static final String t = "journal.tmp";
    public static final String u = "journal.bkp";
    public static final String v = "libcore.io.DiskLruCache";
    public static final String w = "1";
    public static final long x = -1;
    private static final String y = "CLEAN";
    private static final String z = "DIRTY";
    private final File C;
    private final File D;
    private final File E;
    private final File F;
    private final int G;
    private long H;
    private final int I;
    private Writer K;
    private int M;
    private long J = 0;
    private final LinkedHashMap<String, d> L = new LinkedHashMap<>(0, 0.75f, true);
    private long N = 0;
    public final ThreadPoolExecutor O = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    private final Callable<Void> P = new a();

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public class a implements Callable<Void> {
        public a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (rp1.this) {
                if (rp1.this.K == null) {
                    return null;
                }
                rp1.this.K1();
                if (rp1.this.W()) {
                    rp1.this.X0();
                    rp1.this.M = 0;
                }
                return null;
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public final class c {
        private final d a;
        private final boolean[] b;
        private boolean c;

        public /* synthetic */ c(rp1 rp1Var, d dVar, a aVar) {
            this(dVar);
        }

        private InputStream h(int i) throws IOException {
            synchronized (rp1.this) {
                if (this.a.f == this) {
                    if (this.a.e) {
                        try {
                            return new FileInputStream(this.a.j(i));
                        } catch (FileNotFoundException unused) {
                            return null;
                        }
                    }
                    return null;
                }
                throw new IllegalStateException();
            }
        }

        public void a() throws IOException {
            rp1.this.s(this, false);
        }

        public void b() {
            if (this.c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            rp1.this.s(this, true);
            this.c = true;
        }

        public File f(int i) throws IOException {
            File k;
            synchronized (rp1.this) {
                if (this.a.f == this) {
                    if (!this.a.e) {
                        this.b[i] = true;
                    }
                    k = this.a.k(i);
                    rp1.this.C.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k;
        }

        public String g(int i) throws IOException {
            InputStream h = h(i);
            if (h != null) {
                return rp1.U(h);
            }
            return null;
        }

        public void i(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f(i)), tp1.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                tp1.a(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                tp1.a(outputStreamWriter2);
                throw th;
            }
        }

        private c(d dVar) {
            this.a = dVar;
            this.b = dVar.e ? null : new boolean[rp1.this.I];
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public final class d {
        private final String a;
        private final long[] b;
        public File[] c;
        public File[] d;
        private boolean e;
        private c f;
        private long g;

        public /* synthetic */ d(rp1 rp1Var, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            StringBuilder G = wo1.G("unexpected journal line: ");
            G.append(Arrays.toString(strArr));
            throw new IOException(G.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length == rp1.this.I) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.b[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public File j(int i) {
            return this.c[i];
        }

        public File k(int i) {
            return this.d[i];
        }

        public String l() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.b) {
                sb.append(gl4.R);
                sb.append(j);
            }
            return sb.toString();
        }

        private d(String str) {
            this.a = str;
            this.b = new long[rp1.this.I];
            this.c = new File[rp1.this.I];
            this.d = new File[rp1.this.I];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < rp1.this.I; i++) {
                sb.append(i);
                this.c[i] = new File(rp1.this.C, sb.toString());
                sb.append(".tmp");
                this.d[i] = new File(rp1.this.C, sb.toString());
                sb.setLength(length);
            }
        }
    }

    /* compiled from: DiskLruCache.java */
    /* loaded from: classes2.dex */
    public final class e {
        private final String a;
        private final long b;
        private final long[] c;
        private final File[] d;

        public /* synthetic */ e(rp1 rp1Var, String str, long j, File[] fileArr, long[] jArr, a aVar) {
            this(str, j, fileArr, jArr);
        }

        public c a() throws IOException {
            return rp1.this.A(this.a, this.b);
        }

        public File b(int i) {
            return this.d[i];
        }

        public long c(int i) {
            return this.c[i];
        }

        public String d(int i) throws IOException {
            return rp1.U(new FileInputStream(this.d[i]));
        }

        private e(String str, long j, File[] fileArr, long[] jArr) {
            this.a = str;
            this.b = j;
            this.d = fileArr;
            this.c = jArr;
        }
    }

    private rp1(File file, int i, int i2, long j) {
        this.C = file;
        this.G = i;
        this.D = new File(file, "journal");
        this.E = new File(file, "journal.tmp");
        this.F = new File(file, u);
        this.I = i2;
        this.H = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c A(String str, long j) throws IOException {
        q();
        d dVar = this.L.get(str);
        if (j == -1 || (dVar != null && dVar.g == j)) {
            if (dVar != null) {
                if (dVar.f != null) {
                    return null;
                }
            } else {
                dVar = new d(this, str, null);
                this.L.put(str, dVar);
            }
            c cVar = new c(this, dVar, null);
            dVar.f = cVar;
            this.K.append((CharSequence) z);
            this.K.append(gl4.R);
            this.K.append((CharSequence) str);
            this.K.append('\n');
            E(this.K);
            return cVar;
        }
        return null;
    }

    @TargetApi(26)
    private static void E(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K1() throws IOException {
        while (this.J > this.H) {
            c1(this.L.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String U(InputStream inputStream) throws IOException {
        return tp1.c(new InputStreamReader(inputStream, tp1.b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean W() {
        int i = this.M;
        return i >= 2000 && i >= this.L.size();
    }

    public static rp1 X(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, u);
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        d1(file2, file3, false);
                    }
                }
                rp1 rp1Var = new rp1(file, i, i2, j);
                if (rp1Var.D.exists()) {
                    try {
                        rp1Var.Z();
                        rp1Var.Y();
                        return rp1Var;
                    } catch (IOException e2) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                        rp1Var.v();
                    }
                }
                file.mkdirs();
                rp1 rp1Var2 = new rp1(file, i, i2, j);
                rp1Var2.X0();
                return rp1Var2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void X0() throws IOException {
        Writer writer = this.K;
        if (writer != null) {
            r(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.E), tp1.a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.G));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.I));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.L.values()) {
            if (dVar.f != null) {
                bufferedWriter.write("DIRTY " + dVar.a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.a + dVar.l() + '\n');
            }
        }
        r(bufferedWriter);
        if (this.D.exists()) {
            d1(this.D, this.F, true);
        }
        d1(this.E, this.D, false);
        this.F.delete();
        this.K = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.D, true), tp1.a));
    }

    private void Y() throws IOException {
        w(this.E);
        Iterator<d> it = this.L.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f != null) {
                next.f = null;
                while (i < this.I) {
                    w(next.j(i));
                    w(next.k(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.I) {
                    this.J += next.b[i];
                    i++;
                }
            }
        }
    }

    private void Z() throws IOException {
        sp1 sp1Var = new sp1(new FileInputStream(this.D), tp1.a);
        try {
            String e2 = sp1Var.e();
            String e3 = sp1Var.e();
            String e4 = sp1Var.e();
            String e5 = sp1Var.e();
            String e6 = sp1Var.e();
            if (!"libcore.io.DiskLruCache".equals(e2) || !"1".equals(e3) || !Integer.toString(this.G).equals(e4) || !Integer.toString(this.I).equals(e5) || !"".equals(e6)) {
                throw new IOException("unexpected journal header: [" + e2 + ", " + e3 + ", " + e5 + ", " + e6 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    x0(sp1Var.e());
                    i++;
                } catch (EOFException unused) {
                    this.M = i - this.L.size();
                    if (sp1Var.d()) {
                        X0();
                    } else {
                        this.K = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.D, true), tp1.a));
                    }
                    tp1.a(sp1Var);
                    return;
                }
            }
        } catch (Throwable th) {
            tp1.a(sp1Var);
            throw th;
        }
    }

    private static void d1(File file, File file2, boolean z2) throws IOException {
        if (z2) {
            w(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void q() {
        if (this.K == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void r(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void s(c cVar, boolean z2) throws IOException {
        d dVar = cVar.a;
        if (dVar.f == cVar) {
            if (z2 && !dVar.e) {
                for (int i = 0; i < this.I; i++) {
                    if (cVar.b[i]) {
                        if (!dVar.k(i).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.I; i2++) {
                File k = dVar.k(i2);
                if (z2) {
                    if (k.exists()) {
                        File j = dVar.j(i2);
                        k.renameTo(j);
                        long j2 = dVar.b[i2];
                        long length = j.length();
                        dVar.b[i2] = length;
                        this.J = (this.J - j2) + length;
                    }
                } else {
                    w(k);
                }
            }
            this.M++;
            dVar.f = null;
            if (dVar.e | z2) {
                dVar.e = true;
                this.K.append((CharSequence) y);
                this.K.append(gl4.R);
                this.K.append((CharSequence) dVar.a);
                this.K.append((CharSequence) dVar.l());
                this.K.append('\n');
                if (z2) {
                    long j3 = this.N;
                    this.N = 1 + j3;
                    dVar.g = j3;
                }
            } else {
                this.L.remove(dVar.a);
                this.K.append((CharSequence) A);
                this.K.append(gl4.R);
                this.K.append((CharSequence) dVar.a);
                this.K.append('\n');
            }
            E(this.K);
            if (this.J > this.H || W()) {
                this.O.submit(this.P);
            }
            return;
        }
        throw new IllegalStateException();
    }

    private static void w(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private void x0(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith(A)) {
                    this.L.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            d dVar = this.L.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.L.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith(y)) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.e = true;
                dVar.f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith(z)) {
                dVar.f = new c(this, dVar, null);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith(B)) {
                throw new IOException(wo1.t("unexpected journal line: ", str));
            } else {
                return;
            }
        }
        throw new IOException(wo1.t("unexpected journal line: ", str));
    }

    public synchronized void D1(long j) {
        this.H = j;
        this.O.submit(this.P);
    }

    public synchronized e F(String str) throws IOException {
        q();
        d dVar = this.L.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.e) {
            for (File file : dVar.c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.M++;
            this.K.append((CharSequence) B);
            this.K.append(gl4.R);
            this.K.append((CharSequence) str);
            this.K.append('\n');
            if (W()) {
                this.O.submit(this.P);
            }
            return new e(this, str, dVar.g, dVar.c, dVar.b, null);
        }
        return null;
    }

    public synchronized long J1() {
        return this.J;
    }

    public File K() {
        return this.C;
    }

    public synchronized long P() {
        return this.H;
    }

    public synchronized boolean c1(String str) throws IOException {
        q();
        d dVar = this.L.get(str);
        if (dVar != null && dVar.f == null) {
            for (int i = 0; i < this.I; i++) {
                File j = dVar.j(i);
                if (j.exists() && !j.delete()) {
                    throw new IOException("failed to delete " + j);
                }
                this.J -= dVar.b[i];
                dVar.b[i] = 0;
            }
            this.M++;
            this.K.append((CharSequence) A);
            this.K.append(gl4.R);
            this.K.append((CharSequence) str);
            this.K.append('\n');
            this.L.remove(str);
            if (W()) {
                this.O.submit(this.P);
            }
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.K == null) {
            return;
        }
        Iterator it = new ArrayList(this.L.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f != null) {
                dVar.f.a();
            }
        }
        K1();
        r(this.K);
        this.K = null;
    }

    public synchronized void flush() throws IOException {
        q();
        K1();
        E(this.K);
    }

    public synchronized boolean isClosed() {
        return this.K == null;
    }

    public void v() throws IOException {
        close();
        tp1.b(this.C);
    }

    public c z(String str) throws IOException {
        return A(str, -1L);
    }
}
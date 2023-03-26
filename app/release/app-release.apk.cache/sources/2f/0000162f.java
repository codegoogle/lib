package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.p7700g.p99005.wo1;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: UnpackingSoSource.java */
/* loaded from: classes2.dex */
public abstract class a0 extends com.facebook.soloader.d {
    private static final String n = "fb-UnpackingSoSource";
    private static final String o = "dso_state";
    private static final String p = "dso_lock";
    private static final String q = "dso_deps";
    private static final String r = "dso_manifest";
    private static final byte s = 0;
    private static final byte t = 1;
    private static final byte u = 1;
    public final Context v;
    @Nullable
    public String w;
    @Nullable
    private String[] x;
    private final Map<String, Object> y;

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        public final /* synthetic */ File s;
        public final /* synthetic */ byte[] t;
        public final /* synthetic */ c u;
        public final /* synthetic */ File v;
        public final /* synthetic */ p w;

        public a(File file, byte[] bArr, c cVar, File file2, p pVar) {
            this.s = file;
            this.t = bArr;
            this.u = cVar;
            this.v = file2;
            this.w = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.s, "rw");
                randomAccessFile.write(this.t);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.close();
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(a0.this.l, a0.r), "rw");
                this.u.b(randomAccessFile2);
                randomAccessFile2.close();
                y.f(a0.this.l);
                a0.t(this.v, (byte) 1);
                String str = "releasing dso store lock for " + a0.this.l + " (from syncer thread)";
                this.w.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static class b {
        public final String s;
        public final String t;

        public b(String str, String str2) {
            this.s = str;
            this.t = str2;
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static final class c {
        public final b[] a;

        public c(b[] bVarArr) {
            this.a = bVarArr;
        }

        public static final c a(DataInput dataInput) throws IOException {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    b[] bVarArr = new b[readInt];
                    for (int i = 0; i < readInt; i++) {
                        bVarArr[i] = new b(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new c(bVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void b(DataOutput dataOutput) throws IOException {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.a.length);
            int i = 0;
            while (true) {
                b[] bVarArr = this.a;
                if (i >= bVarArr.length) {
                    return;
                }
                dataOutput.writeUTF(bVarArr[i].s);
                dataOutput.writeUTF(this.a[i].t);
                i++;
            }
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static final class d implements Closeable {
        public final b s;
        public final InputStream t;

        public d(b bVar, InputStream inputStream) {
            this.s = bVar;
            this.t = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.t.close();
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes2.dex */
    public static abstract class f implements Closeable {
        public abstract c a() throws IOException;

        public abstract e b() throws IOException;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public a0(Context context, String str) {
        super(n(context, str), 1);
        this.y = new HashMap();
        this.v = context;
    }

    private void j(b[] bVarArr) throws IOException {
        String[] list = this.l.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(o) && !str.equals(p) && !str.equals(q) && !str.equals(r)) {
                    boolean z = false;
                    for (int i = 0; !z && i < bVarArr.length; i++) {
                        if (bVarArr[i].s.equals(str)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        File file = new File(this.l, str);
                        String str2 = "deleting unaccounted-for file " + file;
                        y.c(file);
                    }
                }
            }
            return;
        }
        StringBuilder G = wo1.G("unable to list directory ");
        G.append(this.l);
        throw new IOException(G.toString());
    }

    private void k(d dVar, byte[] bArr) throws IOException {
        RandomAccessFile randomAccessFile;
        String str = dVar.s.s;
        if (this.l.setWritable(true, true)) {
            File file = new File(this.l, dVar.s.s);
            try {
                randomAccessFile = new RandomAccessFile(file, "rw");
            } catch (IOException unused) {
                String str2 = "error overwriting " + file + " trying to delete and start over";
                y.c(file);
                randomAccessFile = new RandomAccessFile(file, "rw");
            }
            try {
                try {
                    int available = dVar.t.available();
                    if (available > 1) {
                        y.d(randomAccessFile.getFD(), available);
                    }
                    y.a(randomAccessFile, dVar.t, Integer.MAX_VALUE, bArr);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    if (file.setExecutable(true, false)) {
                        return;
                    }
                    throw new IOException("cannot make file executable: " + file);
                } finally {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                y.c(file);
                throw e2;
            }
        }
        StringBuilder G = wo1.G("cannot make directory writable for us: ");
        G.append(this.l);
        throw new IOException(G.toString());
    }

    private Object m(String str) {
        Object obj;
        synchronized (this.y) {
            obj = this.y.get(str);
            if (obj == null) {
                obj = new Object();
                this.y.put(str, obj);
            }
        }
        return obj;
    }

    public static File n(Context context, String str) {
        return new File(wo1.D(new StringBuilder(), context.getApplicationInfo().dataDir, "/", str));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean q(p pVar, int i, byte[] bArr) throws IOException {
        byte b2;
        f o2;
        c a2;
        e b3;
        c cVar;
        File file = new File(this.l, o);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            b2 = randomAccessFile.readByte();
        } catch (EOFException unused) {
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
        if (b2 != 1) {
            String str = "dso store " + this.l + " regeneration interrupted: wiping clean";
            b2 = 0;
        }
        randomAccessFile.close();
        File file2 = new File(this.l, q);
        randomAccessFile = new RandomAccessFile(file2, "rw");
        try {
            int length = (int) randomAccessFile.length();
            byte[] bArr2 = new byte[length];
            if (randomAccessFile.read(bArr2) != length) {
                b2 = 0;
            }
            if (!Arrays.equals(bArr2, bArr)) {
                b2 = 0;
            }
            try {
                if (b2 != 0 && (i & 2) == 0) {
                    cVar = null;
                    randomAccessFile.close();
                    if (cVar != null) {
                        return false;
                    }
                    a aVar = new a(file2, bArr, cVar, file, pVar);
                    if ((i & 1) != 0) {
                        StringBuilder G = wo1.G("SoSync:");
                        G.append(this.l.getName());
                        new Thread(aVar, G.toString()).start();
                    } else {
                        aVar.run();
                    }
                    return true;
                }
                r(b2, a2, b3);
                if (b3 != null) {
                    b3.close();
                }
                o2.close();
                cVar = a2;
                randomAccessFile.close();
                if (cVar != null) {
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    if (b3 != null) {
                        try {
                            b3.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
            t(file, (byte) 0);
            o2 = o();
            a2 = o2.a();
            b3 = o2.b();
        } catch (Throwable th5) {
            try {
                throw th5;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[Catch: all -> 0x001f, TRY_ENTER, TryCatch #6 {all -> 0x001f, blocks: (B:4:0x001a, B:11:0x0026, B:12:0x002d, B:13:0x0037, B:15:0x003d, B:40:0x0083, B:18:0x0045, B:20:0x004a, B:22:0x0058, B:25:0x0069, B:29:0x0070), top: B:56:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #6 {all -> 0x001f, blocks: (B:4:0x001a, B:11:0x0026, B:12:0x002d, B:13:0x0037, B:15:0x003d, B:40:0x0083, B:18:0x0045, B:20:0x004a, B:22:0x0058, B:25:0x0069, B:29:0x0070), top: B:56:0x001a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void r(byte b2, c cVar, e eVar) throws IOException {
        c a2;
        getClass().getName();
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.l, r), "rw");
        if (b2 == 1) {
            try {
                try {
                    a2 = c.a(randomAccessFile);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
            if (a2 == null) {
                a2 = new c(new b[0]);
            }
            j(cVar.a);
            byte[] bArr = new byte[32768];
            while (eVar.a()) {
                d b3 = eVar.b();
                boolean z = true;
                int i = 0;
                while (z) {
                    b[] bVarArr = a2.a;
                    if (i >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i].s.equals(b3.s.s) && a2.a[i].t.equals(b3.s.t)) {
                        z = false;
                    }
                    i++;
                }
                if (z) {
                    k(b3, bArr);
                }
                if (b3 != null) {
                    b3.close();
                }
            }
            randomAccessFile.close();
            getClass().getName();
        }
        a2 = null;
        if (a2 == null) {
        }
        j(cVar.a);
        byte[] bArr2 = new byte[32768];
        while (eVar.a()) {
        }
        randomAccessFile.close();
        getClass().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void t(File file, byte b2) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // com.facebook.soloader.x
    public String[] b() {
        String[] strArr = this.x;
        return strArr == null ? super.b() : strArr;
    }

    @Override // com.facebook.soloader.d, com.facebook.soloader.x
    public int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        int h;
        synchronized (m(str)) {
            h = h(str, i, this.l, threadPolicy);
        }
        return h;
    }

    @Override // com.facebook.soloader.x
    public void d(int i) throws IOException {
        y.j(this.l);
        p a2 = p.a(new File(this.l, p));
        try {
            String str = "locked dso store " + this.l;
            if (q(a2, i, l())) {
                a2 = null;
            } else {
                String str2 = "dso store is up-to-date: " + this.l;
            }
        } finally {
            if (a2 != null) {
                StringBuilder G = wo1.G("releasing dso store lock for ");
                G.append(this.l);
                G.toString();
                a2.close();
            } else {
                StringBuilder G2 = wo1.G("not releasing dso store lock for ");
                G2.append(this.l);
                G2.append(" (syncer thread started)");
                G2.toString();
            }
        }
    }

    public byte[] l() throws IOException {
        Parcel obtain = Parcel.obtain();
        f o2 = o();
        try {
            b[] bVarArr = o2.a().a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i = 0; i < bVarArr.length; i++) {
                obtain.writeString(bVarArr[i].s);
                obtain.writeString(bVarArr[i].t);
            }
            o2.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (o2 != null) {
                    try {
                        o2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public abstract f o() throws IOException;

    public synchronized void p(String str) throws IOException {
        synchronized (m(str)) {
            this.w = str;
            d(2);
        }
    }

    public void s(String[] strArr) {
        this.x = strArr;
    }

    public a0(Context context, File file) {
        super(file, 1);
        this.y = new HashMap();
        this.v = context;
    }
}
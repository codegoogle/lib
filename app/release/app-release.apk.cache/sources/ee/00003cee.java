package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.tn;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TypefaceCompatUtil.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ck {
    private static final String a = "TypefaceCompatUtil";
    private static final String b = ".font";

    /* compiled from: TypefaceCompatUtil.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static ParcelFileDescriptor a(ContentResolver contentResolver, Uri uri, String str, CancellationSignal cancellationSignal) throws FileNotFoundException {
            return contentResolver.openFileDescriptor(uri, str, cancellationSignal);
        }
    }

    private ck() {
    }

    public static void a(@z1 Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @e2(19)
    @z1
    public static ByteBuffer b(@x1 Context context, @x1 Resources resources, int i) {
        File e = e(context);
        if (e == null) {
            return null;
        }
        try {
            if (c(e, resources, i)) {
                return g(e);
            }
            return null;
        } finally {
            e.delete();
        }
    }

    public static boolean c(@x1 File file, @x1 Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean d = d(file, inputStream);
            a(inputStream);
            return d;
        } catch (Throwable th2) {
            th = th2;
            a(inputStream);
            throw th;
        }
    }

    public static boolean d(@x1 File file, @x1 InputStream inputStream) {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            a(fileOutputStream2);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    a(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    @z1
    public static File e(@x1 Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder G = wo1.G(b);
        G.append(Process.myPid());
        G.append("-");
        G.append(Process.myTid());
        G.append("-");
        String sb = G.toString();
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, wo1.l(sb, i));
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    @e2(19)
    @z1
    public static ByteBuffer f(@x1 Context context, @z1 CancellationSignal cancellationSignal, @x1 Uri uri) {
        try {
            ParcelFileDescriptor a2 = a.a(context.getContentResolver(), uri, "r", cancellationSignal);
            if (a2 == null) {
                if (a2 != null) {
                    a2.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(a2.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                a2.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @e2(19)
    @z1
    private static ByteBuffer g(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    @e2(19)
    @i2({i2.a.LIBRARY})
    @x1
    public static Map<Uri, ByteBuffer> h(@x1 Context context, @x1 tn.c[] cVarArr, @z1 CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (tn.c cVar : cVarArr) {
            if (cVar.b() == 0) {
                Uri d = cVar.d();
                if (!hashMap.containsKey(d)) {
                    hashMap.put(d, f(context, cancellationSignal, d));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}
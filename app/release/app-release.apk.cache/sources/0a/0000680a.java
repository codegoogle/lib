package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_messaging.zzl;
import com.google.android.gms.internal.firebase_messaging.zzm;
import com.google.android.gms.internal.firebase_messaging.zzt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class yt2 implements Closeable {
    private final URL s;
    @z1
    private Task<Bitmap> t;
    @z1
    private volatile InputStream u;

    private yt2(URL url) {
        this.s = url;
    }

    private byte[] b() throws IOException {
        URLConnection openConnection = this.s.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                this.u = inputStream;
                byte[] zza = zzl.zza(zzl.zzb(inputStream, 1048577L));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable(rs2.a, 2)) {
                    String.valueOf(this.s).length();
                    int length = zza.length;
                }
                if (zza.length <= 1048576) {
                    return zza;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        zzt.zza(th, th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @z1
    public static yt2 d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new yt2(new URL(str));
        } catch (MalformedURLException unused) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Not downloading image, bad URL: ".concat(valueOf);
            } else {
                new String("Not downloading image, bad URL: ");
            }
            return null;
        }
    }

    public Bitmap a() throws IOException {
        String.valueOf(this.s).length();
        byte[] b = b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(b, 0, b.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable(rs2.a, 3)) {
                String.valueOf(this.s).length();
            }
            return decodeByteArray;
        }
        String valueOf = String.valueOf(this.s);
        throw new IOException(wo1.C(new StringBuilder(valueOf.length() + 24), "Failed to decode image: ", valueOf));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            zzm.zza(this.u);
        } catch (NullPointerException unused) {
        }
    }

    public Task<Bitmap> e() {
        return (Task) Preconditions.checkNotNull(this.t);
    }

    public void f(Executor executor) {
        this.t = Tasks.call(executor, new Callable(this) { // from class: com.p7700g.p99005.xt2
            private final yt2 a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return this.a.a();
            }
        });
    }
}
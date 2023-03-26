package com.p7700g.p99005;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.p7700g.p99005.i2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: BrowserServiceFileProvider.java */
@i2({i2.a.LIBRARY})
@Deprecated
/* loaded from: classes.dex */
public final class v5 extends ih {
    private static final String I = "BrowserServiceFP";
    private static final String J = ".image_provider";
    private static final String K = "content";
    private static final String L = "image_provider";
    private static final String M = "image_provider_images/";
    private static final String N = ".png";
    private static final String O = "image_provider_uris";
    private static final String P = "last_cleanup_time";
    public static Object Q = new Object();

    /* compiled from: BrowserServiceFileProvider.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ ContentResolver s;
        public final /* synthetic */ Uri t;
        public final /* synthetic */ d8 u;

        public a(ContentResolver contentResolver, Uri uri, d8 d8Var) {
            this.s = contentResolver;
            this.t = uri;
            this.u = d8Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ParcelFileDescriptor openFileDescriptor = this.s.openFileDescriptor(this.t, "r");
                if (openFileDescriptor == null) {
                    this.u.r(new FileNotFoundException());
                    return;
                }
                Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor());
                openFileDescriptor.close();
                if (decodeFileDescriptor == null) {
                    this.u.r(new IOException("File could not be decoded."));
                } else {
                    this.u.q(decodeFileDescriptor);
                }
            } catch (IOException e) {
                this.u.r(e);
            }
        }
    }

    /* compiled from: BrowserServiceFileProvider.java */
    /* loaded from: classes.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        private static final long a;
        private static final long b;
        private static final long c;
        private final Context d;

        static {
            TimeUnit timeUnit = TimeUnit.DAYS;
            a = timeUnit.toMillis(7L);
            b = timeUnit.toMillis(7L);
            c = timeUnit.toMillis(1L);
        }

        public b(Context context) {
            this.d = context.getApplicationContext();
        }

        private static boolean b(File file) {
            return file.getName().endsWith("..png");
        }

        private static boolean c(SharedPreferences sharedPreferences) {
            return System.currentTimeMillis() > sharedPreferences.getLong(v5.P, System.currentTimeMillis()) + b;
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            long currentTimeMillis;
            SharedPreferences sharedPreferences = this.d.getSharedPreferences(this.d.getPackageName() + v5.J, 0);
            if (c(sharedPreferences)) {
                synchronized (v5.Q) {
                    File file = new File(this.d.getFilesDir(), v5.L);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        long currentTimeMillis2 = System.currentTimeMillis() - a;
                        boolean z = true;
                        for (File file2 : listFiles) {
                            if (b(file2) && file2.lastModified() < currentTimeMillis2 && !file2.delete()) {
                                String str = "Fail to delete image: " + file2.getAbsoluteFile();
                                z = false;
                            }
                        }
                        if (z) {
                            currentTimeMillis = System.currentTimeMillis();
                        } else {
                            currentTimeMillis = (System.currentTimeMillis() - b) + c;
                        }
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(v5.P, currentTimeMillis);
                        edit.apply();
                        return null;
                    }
                    return null;
                }
            }
            return null;
        }
    }

    /* compiled from: BrowserServiceFileProvider.java */
    /* loaded from: classes.dex */
    public static class c extends AsyncTask<String, Void, Void> {
        private final Context a;
        private final String b;
        private final Bitmap c;
        private final Uri d;
        private final d8<Uri> e;

        public c(Context context, String str, Bitmap bitmap, Uri uri, d8<Uri> d8Var) {
            this.a = context.getApplicationContext();
            this.b = str;
            this.c = bitmap;
            this.d = uri;
            this.e = d8Var;
        }

        private void c(File file) {
            FileOutputStream fileOutputStream;
            if (Build.VERSION.SDK_INT >= 22) {
                to toVar = new to(file);
                try {
                    fileOutputStream = toVar.h();
                    try {
                        this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                        fileOutputStream.close();
                        toVar.c(fileOutputStream);
                        this.e.q(this.d);
                    } catch (IOException e) {
                        e = e;
                        toVar.b(fileOutputStream);
                        this.e.r(e);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = null;
                }
            } else {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    this.c.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.close();
                    this.e.q(this.d);
                } catch (IOException e3) {
                    this.e.r(e3);
                }
            }
        }

        private void d() {
            File file = new File(this.a.getFilesDir(), v5.L);
            synchronized (v5.Q) {
                if (!file.exists() && !file.mkdir()) {
                    this.e.r(new IOException("Could not create file directory."));
                    return;
                }
                File file2 = new File(file, this.b + v5.N);
                if (file2.exists()) {
                    this.e.q(this.d);
                } else {
                    c(file2);
                }
                file2.setLastModified(System.currentTimeMillis());
            }
        }

        @Override // android.os.AsyncTask
        /* renamed from: a */
        public Void doInBackground(String... strArr) {
            d();
            return null;
        }

        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(Void r3) {
            new b(this.a).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Void[0]);
        }
    }

    private static Uri j(Context context, String str) {
        String u = wo1.u(M, str, N);
        Uri.Builder scheme = new Uri.Builder().scheme("content");
        return scheme.authority(context.getPackageName() + J).path(u).build();
    }

    public static void k(@x1 Intent intent, @z1 List<Uri> list, @x1 Context context) {
        if (list == null || list.size() == 0) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        intent.addFlags(1);
        ClipData newUri = ClipData.newUri(contentResolver, O, list.get(0));
        for (int i = 1; i < list.size(); i++) {
            newUri.addItem(new ClipData.Item(list.get(i)));
        }
        intent.setClipData(newUri);
    }

    @x1
    public static gn2<Bitmap> l(@x1 ContentResolver contentResolver, @x1 Uri uri) {
        d8 v = d8.v();
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new a(contentResolver, uri, v));
        return v;
    }

    @q2
    @x1
    public static d8<Uri> m(@x1 Context context, @x1 Bitmap bitmap, @x1 String str, int i) {
        StringBuilder L2 = wo1.L(str, "_");
        L2.append(Integer.toString(i));
        String sb = L2.toString();
        Uri j = j(context, sb);
        d8<Uri> v = d8.v();
        new c(context, sb, bitmap, j, v).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
        return v;
    }
}
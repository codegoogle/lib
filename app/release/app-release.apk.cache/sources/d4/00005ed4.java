package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader.java */
@e2(29)
/* loaded from: classes2.dex */
public final class tu1<DataT> implements du1<Uri, DataT> {
    private final Context a;
    private final du1<File, DataT> b;
    private final du1<Uri, DataT> c;
    private final Class<DataT> d;

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes2.dex */
    public static abstract class a<DataT> implements eu1<Uri, DataT> {
        private final Context a;
        private final Class<DataT> b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.b = cls;
        }

        @Override // com.p7700g.p99005.eu1
        public final void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public final du1<Uri, DataT> c(@x1 hu1 hu1Var) {
            return new tu1(this.a, hu1Var.d(File.class, this.b), hu1Var.d(Uri.class, this.b), this.b);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @e2(29)
    /* loaded from: classes2.dex */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    @e2(29)
    /* loaded from: classes2.dex */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader.java */
    /* loaded from: classes2.dex */
    public static final class d<DataT> implements rq1<DataT> {
        private static final String[] s = {"_data"};
        private final Class<DataT> A;
        private volatile boolean B;
        @z1
        private volatile rq1<DataT> C;
        private final Context t;
        private final du1<File, DataT> u;
        private final du1<Uri, DataT> v;
        private final Uri w;
        private final int x;
        private final int y;
        private final jq1 z;

        public d(Context context, du1<File, DataT> du1Var, du1<Uri, DataT> du1Var2, Uri uri, int i, int i2, jq1 jq1Var, Class<DataT> cls) {
            this.t = context.getApplicationContext();
            this.u = du1Var;
            this.v = du1Var2;
            this.w = uri;
            this.x = i;
            this.y = i2;
            this.z = jq1Var;
            this.A = cls;
        }

        @z1
        private du1.a<DataT> c() throws FileNotFoundException {
            if (Environment.isExternalStorageLegacy()) {
                return this.u.b(h(this.w), this.x, this.y, this.z);
            }
            return this.v.b(g() ? MediaStore.setRequireOriginal(this.w) : this.w, this.x, this.y, this.z);
        }

        @z1
        private rq1<DataT> f() throws FileNotFoundException {
            du1.a<DataT> c = c();
            if (c != null) {
                return c.c;
            }
            return null;
        }

        private boolean g() {
            return this.t.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        @x1
        private File h(Uri uri) throws FileNotFoundException {
            Cursor cursor = null;
            try {
                Cursor query = this.t.getContentResolver().query(uri, s, null, null, null);
                if (query != null && query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndexOrThrow("_data"));
                    if (!TextUtils.isEmpty(string)) {
                        File file = new File(string);
                        query.close();
                        return file;
                    }
                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<DataT> a() {
            return this.A;
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
            rq1<DataT> rq1Var = this.C;
            if (rq1Var != null) {
                rq1Var.b();
            }
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
            this.B = true;
            rq1<DataT> rq1Var = this.C;
            if (rq1Var != null) {
                rq1Var.cancel();
            }
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return aq1.LOCAL;
        }

        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super DataT> aVar) {
            try {
                rq1<DataT> f = f();
                if (f == null) {
                    aVar.c(new IllegalArgumentException("Failed to build fetcher for: " + this.w));
                    return;
                }
                this.C = f;
                if (this.B) {
                    cancel();
                } else {
                    f.e(fp1Var, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.c(e);
            }
        }
    }

    public tu1(Context context, du1<File, DataT> du1Var, du1<Uri, DataT> du1Var2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.b = du1Var;
        this.c = du1Var2;
        this.d = cls;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<DataT> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(uri), new d(this.a, this.b, this.c, uri, i, i2, jq1Var, this.d));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && dr1.b(uri);
    }
}
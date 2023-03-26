package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.du1;
import com.p7700g.p99005.rq1;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader.java */
/* loaded from: classes2.dex */
public final class au1 implements du1<Uri, File> {
    private final Context a;

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes2.dex */
    public static final class a implements eu1<Uri, File> {
        private final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, File> c(hu1 hu1Var) {
            return new au1(this.a);
        }
    }

    /* compiled from: MediaStoreFileLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements rq1<File> {
        private static final String[] s = {"_data"};
        private final Context t;
        private final Uri u;

        public b(Context context, Uri uri) {
            this.t = context;
            this.u = uri;
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public Class<File> a() {
            return File.class;
        }

        @Override // com.p7700g.p99005.rq1
        public void b() {
        }

        @Override // com.p7700g.p99005.rq1
        public void cancel() {
        }

        @Override // com.p7700g.p99005.rq1
        @x1
        public aq1 d() {
            return aq1.LOCAL;
        }

        @Override // com.p7700g.p99005.rq1
        public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super File> aVar) {
            Cursor query = this.t.getContentResolver().query(this.u, s, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                StringBuilder G = wo1.G("Failed to find file path for: ");
                G.append(this.u);
                aVar.c(new FileNotFoundException(G.toString()));
                return;
            }
            aVar.f(new File(r0));
        }
    }

    public au1(Context context) {
        this.a = context;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<File> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(uri), new b(this.a, uri));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return dr1.b(uri);
    }
}
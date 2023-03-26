package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.p7700g.p99005.rq1;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher.java */
/* loaded from: classes2.dex */
public class er1 implements rq1<InputStream> {
    private static final String s = "MediaStoreThumbFetcher";
    private final Uri t;
    private final gr1 u;
    private InputStream v;

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes2.dex */
    public static class a implements fr1 {
        private static final String[] a = {"_data"};
        private static final String b = "kind = 1 AND image_id = ?";
        private final ContentResolver c;

        public a(ContentResolver contentResolver) {
            this.c = contentResolver;
        }

        @Override // com.p7700g.p99005.fr1
        public Cursor a(Uri uri) {
            return this.c.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, a, b, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    /* compiled from: ThumbFetcher.java */
    /* loaded from: classes2.dex */
    public static class b implements fr1 {
        private static final String[] a = {"_data"};
        private static final String b = "kind = 1 AND video_id = ?";
        private final ContentResolver c;

        public b(ContentResolver contentResolver) {
            this.c = contentResolver;
        }

        @Override // com.p7700g.p99005.fr1
        public Cursor a(Uri uri) {
            return this.c.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, a, b, new String[]{uri.getLastPathSegment()}, null);
        }
    }

    @r2
    public er1(Uri uri, gr1 gr1Var) {
        this.t = uri;
        this.u = gr1Var;
    }

    private static er1 c(Context context, Uri uri, fr1 fr1Var) {
        return new er1(uri, new gr1(yo1.e(context).n().g(), fr1Var, yo1.e(context).g(), context.getContentResolver()));
    }

    public static er1 f(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static er1 g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws FileNotFoundException {
        InputStream d = this.u.d(this.t);
        int a2 = d != null ? this.u.a(this.t) : -1;
        return a2 != -1 ? new uq1(d, a2) : d;
    }

    @Override // com.p7700g.p99005.rq1
    @x1
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.p7700g.p99005.rq1
    public void b() {
        InputStream inputStream = this.v;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
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
    public void e(@x1 fp1 fp1Var, @x1 rq1.a<? super InputStream> aVar) {
        try {
            InputStream h = h();
            this.v = h;
            aVar.f(h);
        } catch (FileNotFoundException e) {
            Log.isLoggable(s, 3);
            aVar.c(e);
        }
    }
}
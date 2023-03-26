package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.p7700g.p99005.du1;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader.java */
/* loaded from: classes2.dex */
public class mu1<Data> implements du1<Uri, Data> {
    private static final Set<String> a = Collections.unmodifiableSet(new HashSet(Arrays.asList(o31.b, "android.resource", "content")));
    private final c<Data> b;

    /* compiled from: UriLoader.java */
    /* loaded from: classes2.dex */
    public static final class a implements eu1<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        private final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.mu1.c
        public rq1<AssetFileDescriptor> b(Uri uri) {
            return new oq1(this.a, uri);
        }

        @Override // com.p7700g.p99005.eu1
        public du1<Uri, AssetFileDescriptor> c(hu1 hu1Var) {
            return new mu1(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements eu1<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        private final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.mu1.c
        public rq1<ParcelFileDescriptor> b(Uri uri) {
            return new wq1(this.a, uri);
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, ParcelFileDescriptor> c(hu1 hu1Var) {
            return new mu1(this);
        }
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes2.dex */
    public interface c<Data> {
        rq1<Data> b(Uri uri);
    }

    /* compiled from: UriLoader.java */
    /* loaded from: classes2.dex */
    public static class d implements eu1<Uri, InputStream>, c<InputStream> {
        private final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.mu1.c
        public rq1<InputStream> b(Uri uri) {
            return new br1(this.a, uri);
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, InputStream> c(hu1 hu1Var) {
            return new mu1(this);
        }
    }

    public mu1(c<Data> cVar) {
        this.b = cVar;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(uri), this.b.b(uri));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return a.contains(uri.getScheme());
    }
}
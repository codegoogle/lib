package com.p7700g.p99005;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.p7700g.p99005.du1;
import java.io.InputStream;

/* compiled from: AssetUriLoader.java */
/* loaded from: classes2.dex */
public class qt1<Data> implements du1<Uri, Data> {
    private static final String a = "android_asset";
    private static final String b = "file:///android_asset/";
    private static final int c = 22;
    private final AssetManager d;
    private final a<Data> e;

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes2.dex */
    public interface a<Data> {
        rq1<Data> b(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes2.dex */
    public static class b implements eu1<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        private final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.qt1.a
        public rq1<AssetFileDescriptor> b(AssetManager assetManager, String str) {
            return new vq1(assetManager, str);
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, AssetFileDescriptor> c(hu1 hu1Var) {
            return new qt1(this.a, this);
        }
    }

    /* compiled from: AssetUriLoader.java */
    /* loaded from: classes2.dex */
    public static class c implements eu1<Uri, InputStream>, a<InputStream> {
        private final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.p7700g.p99005.eu1
        public void a() {
        }

        @Override // com.p7700g.p99005.qt1.a
        public rq1<InputStream> b(AssetManager assetManager, String str) {
            return new ar1(assetManager, str);
        }

        @Override // com.p7700g.p99005.eu1
        @x1
        public du1<Uri, InputStream> c(hu1 hu1Var) {
            return new qt1(this.a, this);
        }
    }

    public qt1(AssetManager assetManager, a<Data> aVar) {
        this.d = assetManager;
        this.e = aVar;
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: c */
    public du1.a<Data> b(@x1 Uri uri, int i, int i2, @x1 jq1 jq1Var) {
        return new du1.a<>(new k02(uri), this.e.b(this.d, uri.toString().substring(c)));
    }

    @Override // com.p7700g.p99005.du1
    /* renamed from: d */
    public boolean a(@x1 Uri uri) {
        return o31.b.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && a.equals(uri.getPathSegments().get(0));
    }
}
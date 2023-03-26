package com.p7700g.p99005;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import pl.droidsonroids.gif.GifIOException;
import pl.droidsonroids.gif.GifInfoHandle;

/* compiled from: InputSource.java */
/* loaded from: classes4.dex */
public abstract class by5 {

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static class b extends by5 {
        private final AssetFileDescriptor a;

        public b(@x1 AssetFileDescriptor assetFileDescriptor) {
            super();
            this.a = assetFileDescriptor;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class c extends by5 {
        private final AssetManager a;
        private final String b;

        public c(@x1 AssetManager assetManager, @x1 String str) {
            super();
            this.a = assetManager;
            this.b = str;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a.openFd(this.b));
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class d extends by5 {
        private final byte[] a;

        public d(@x1 byte[] bArr) {
            super();
            this.a = bArr;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class e extends by5 {
        private final ByteBuffer a;

        public e(@x1 ByteBuffer byteBuffer) {
            super();
            this.a = byteBuffer;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class f extends by5 {
        private final FileDescriptor a;

        public f(@x1 FileDescriptor fileDescriptor) {
            super();
            this.a = fileDescriptor;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class h extends by5 {
        private final InputStream a;

        public h(@x1 InputStream inputStream) {
            super();
            this.a = inputStream;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a);
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static class i extends by5 {
        private final Resources a;
        private final int b;

        public i(@x1 Resources resources, @f1 @d2 int i) {
            super();
            this.a = resources;
            this.b = i;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return new GifInfoHandle(this.a.openRawResourceFd(this.b));
        }
    }

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class j extends by5 {
        private final ContentResolver a;
        private final Uri b;

        public j(@z1 ContentResolver contentResolver, @x1 Uri uri) {
            super();
            this.a = contentResolver;
            this.b = uri;
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws IOException {
            return GifInfoHandle.y(this.a, this.b);
        }
    }

    public final ox5 a(ox5 ox5Var, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, boolean z, ux5 ux5Var) throws IOException {
        return new ox5(b(ux5Var), ox5Var, scheduledThreadPoolExecutor, z);
    }

    public final GifInfoHandle b(@x1 ux5 ux5Var) throws IOException {
        GifInfoHandle c2 = c();
        c2.K(ux5Var.a, ux5Var.b);
        return c2;
    }

    public abstract GifInfoHandle c() throws IOException;

    /* compiled from: InputSource.java */
    /* loaded from: classes4.dex */
    public static final class g extends by5 {
        private final String a;

        public g(@x1 File file) {
            super();
            this.a = file.getPath();
        }

        @Override // com.p7700g.p99005.by5
        public GifInfoHandle c() throws GifIOException {
            return new GifInfoHandle(this.a);
        }

        public g(@x1 String str) {
            super();
            this.a = str;
        }
    }

    private by5() {
    }
}
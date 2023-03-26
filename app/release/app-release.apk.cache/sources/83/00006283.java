package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: classes2.dex */
public interface vv1 {

    /* compiled from: ImageReader.java */
    /* loaded from: classes2.dex */
    public static final class a implements vv1 {
        private final byte[] a;
        private final List<ImageHeaderParser> b;
        private final is1 c;

        public a(byte[] bArr, List<ImageHeaderParser> list, is1 is1Var) {
            this.a = bArr;
            this.b = list;
            this.c = is1Var;
        }

        @Override // com.p7700g.p99005.vv1
        public int a() throws IOException {
            return fq1.c(this.b, ByteBuffer.wrap(this.a), this.c);
        }

        @Override // com.p7700g.p99005.vv1
        @z1
        public Bitmap b(BitmapFactory.Options options) {
            byte[] bArr = this.a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.p7700g.p99005.vv1
        public void c() {
        }

        @Override // com.p7700g.p99005.vv1
        public ImageHeaderParser.ImageType d() throws IOException {
            return fq1.g(this.b, ByteBuffer.wrap(this.a));
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes2.dex */
    public static final class b implements vv1 {
        private final ByteBuffer a;
        private final List<ImageHeaderParser> b;
        private final is1 c;

        public b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, is1 is1Var) {
            this.a = byteBuffer;
            this.b = list;
            this.c = is1Var;
        }

        private InputStream e() {
            return l02.g(l02.d(this.a));
        }

        @Override // com.p7700g.p99005.vv1
        public int a() throws IOException {
            return fq1.c(this.b, l02.d(this.a), this.c);
        }

        @Override // com.p7700g.p99005.vv1
        @z1
        public Bitmap b(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.p7700g.p99005.vv1
        public void c() {
        }

        @Override // com.p7700g.p99005.vv1
        public ImageHeaderParser.ImageType d() throws IOException {
            return fq1.g(this.b, l02.d(this.a));
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes2.dex */
    public static final class c implements vv1 {
        private final File a;
        private final List<ImageHeaderParser> b;
        private final is1 c;

        public c(File file, List<ImageHeaderParser> list, is1 is1Var) {
            this.a = file;
            this.b = list;
            this.c = is1Var;
        }

        @Override // com.p7700g.p99005.vv1
        public int a() throws IOException {
            zv1 zv1Var;
            Throwable th;
            try {
                zv1Var = new zv1(new FileInputStream(this.a), this.c);
            } catch (Throwable th2) {
                zv1Var = null;
                th = th2;
            }
            try {
                int b = fq1.b(this.b, zv1Var, this.c);
                try {
                    zv1Var.close();
                } catch (IOException unused) {
                }
                return b;
            } catch (Throwable th3) {
                th = th3;
                if (zv1Var != null) {
                    try {
                        zv1Var.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // com.p7700g.p99005.vv1
        @z1
        public Bitmap b(BitmapFactory.Options options) throws FileNotFoundException {
            zv1 zv1Var;
            zv1 zv1Var2 = null;
            try {
                zv1Var = new zv1(new FileInputStream(this.a), this.c);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(zv1Var, null, options);
                try {
                    zv1Var.close();
                } catch (IOException unused) {
                }
                return decodeStream;
            } catch (Throwable th2) {
                th = th2;
                zv1Var2 = zv1Var;
                if (zv1Var2 != null) {
                    try {
                        zv1Var2.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }

        @Override // com.p7700g.p99005.vv1
        public void c() {
        }

        @Override // com.p7700g.p99005.vv1
        public ImageHeaderParser.ImageType d() throws IOException {
            zv1 zv1Var;
            Throwable th;
            try {
                zv1Var = new zv1(new FileInputStream(this.a), this.c);
            } catch (Throwable th2) {
                zv1Var = null;
                th = th2;
            }
            try {
                ImageHeaderParser.ImageType f = fq1.f(this.b, zv1Var, this.c);
                try {
                    zv1Var.close();
                } catch (IOException unused) {
                }
                return f;
            } catch (Throwable th3) {
                th = th3;
                if (zv1Var != null) {
                    try {
                        zv1Var.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        }
    }

    /* compiled from: ImageReader.java */
    /* loaded from: classes2.dex */
    public static final class d implements vv1 {
        private final yq1 a;
        private final is1 b;
        private final List<ImageHeaderParser> c;

        public d(InputStream inputStream, List<ImageHeaderParser> list, is1 is1Var) {
            this.b = (is1) x02.d(is1Var);
            this.c = (List) x02.d(list);
            this.a = new yq1(inputStream, is1Var);
        }

        @Override // com.p7700g.p99005.vv1
        public int a() throws IOException {
            return fq1.b(this.c, this.a.a(), this.b);
        }

        @Override // com.p7700g.p99005.vv1
        @z1
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // com.p7700g.p99005.vv1
        public void c() {
            this.a.c();
        }

        @Override // com.p7700g.p99005.vv1
        public ImageHeaderParser.ImageType d() throws IOException {
            return fq1.f(this.c, this.a.a(), this.b);
        }
    }

    /* compiled from: ImageReader.java */
    @e2(21)
    /* loaded from: classes2.dex */
    public static final class e implements vv1 {
        private final is1 a;
        private final List<ImageHeaderParser> b;
        private final ParcelFileDescriptorRewinder c;

        public e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, is1 is1Var) {
            this.a = (is1) x02.d(is1Var);
            this.b = (List) x02.d(list);
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.p7700g.p99005.vv1
        public int a() throws IOException {
            return fq1.a(this.b, this.c, this.a);
        }

        @Override // com.p7700g.p99005.vv1
        @z1
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a().getFileDescriptor(), null, options);
        }

        @Override // com.p7700g.p99005.vv1
        public void c() {
        }

        @Override // com.p7700g.p99005.vv1
        public ImageHeaderParser.ImageType d() throws IOException {
            return fq1.e(this.b, this.c, this.a);
        }
    }

    int a() throws IOException;

    @z1
    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
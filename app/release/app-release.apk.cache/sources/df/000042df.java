package com.p7700g.p99005;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes2.dex */
public final class fq1 {
    private static final int a = 5242880;

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class a implements h {
        public final /* synthetic */ InputStream a;

        public a(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.p7700g.p99005.fq1.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.a);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class b implements h {
        public final /* synthetic */ ByteBuffer a;

        public b(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
        }

        @Override // com.p7700g.p99005.fq1.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.a(this.a);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class c implements h {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ is1 b;

        public c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, is1 is1Var) {
            this.a = parcelFileDescriptorRewinder;
            this.b = is1Var;
        }

        @Override // com.p7700g.p99005.fq1.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            zv1 zv1Var;
            zv1 zv1Var2 = null;
            try {
                zv1Var = new zv1(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType c = imageHeaderParser.c(zv1Var);
                try {
                    zv1Var.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return c;
            } catch (Throwable th2) {
                th = th2;
                zv1Var2 = zv1Var;
                if (zv1Var2 != null) {
                    try {
                        zv1Var2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class d implements g {
        public final /* synthetic */ ByteBuffer a;
        public final /* synthetic */ is1 b;

        public d(ByteBuffer byteBuffer, is1 is1Var) {
            this.a = byteBuffer;
            this.b = is1Var;
        }

        @Override // com.p7700g.p99005.fq1.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.b(this.a, this.b);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class e implements g {
        public final /* synthetic */ InputStream a;
        public final /* synthetic */ is1 b;

        public e(InputStream inputStream, is1 is1Var) {
            this.a = inputStream;
            this.b = is1Var;
        }

        @Override // com.p7700g.p99005.fq1.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.a, this.b);
            } finally {
                this.a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public class f implements g {
        public final /* synthetic */ ParcelFileDescriptorRewinder a;
        public final /* synthetic */ is1 b;

        public f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, is1 is1Var) {
            this.a = parcelFileDescriptorRewinder;
            this.b = is1Var;
        }

        @Override // com.p7700g.p99005.fq1.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            zv1 zv1Var;
            zv1 zv1Var2 = null;
            try {
                zv1Var = new zv1(new FileInputStream(this.a.a().getFileDescriptor()), this.b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int d = imageHeaderParser.d(zv1Var, this.b);
                try {
                    zv1Var.close();
                } catch (IOException unused) {
                }
                this.a.a();
                return d;
            } catch (Throwable th2) {
                th = th2;
                zv1Var2 = zv1Var;
                if (zv1Var2 != null) {
                    try {
                        zv1Var2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.a.a();
                throw th;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes2.dex */
    public interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private fq1() {
    }

    @e2(21)
    public static int a(@x1 List<ImageHeaderParser> list, @x1 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @x1 is1 is1Var) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, is1Var));
    }

    public static int b(@x1 List<ImageHeaderParser> list, @z1 InputStream inputStream, @x1 is1 is1Var) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new zv1(inputStream, is1Var);
        }
        inputStream.mark(a);
        return d(list, new e(inputStream, is1Var));
    }

    public static int c(@x1 List<ImageHeaderParser> list, @z1 ByteBuffer byteBuffer, @x1 is1 is1Var) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, is1Var));
    }

    private static int d(@x1 List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a2 = gVar.a(list.get(i));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }

    @e2(21)
    @x1
    public static ImageHeaderParser.ImageType e(@x1 List<ImageHeaderParser> list, @x1 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @x1 is1 is1Var) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, is1Var));
    }

    @x1
    public static ImageHeaderParser.ImageType f(@x1 List<ImageHeaderParser> list, @z1 InputStream inputStream, @x1 is1 is1Var) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new zv1(inputStream, is1Var);
        }
        inputStream.mark(a);
        return h(list, new a(inputStream));
    }

    @x1
    public static ImageHeaderParser.ImageType g(@x1 List<ImageHeaderParser> list, @z1 ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return h(list, new b(byteBuffer));
    }

    @x1
    private static ImageHeaderParser.ImageType h(@x1 List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a2 = hVar.a(list.get(i));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
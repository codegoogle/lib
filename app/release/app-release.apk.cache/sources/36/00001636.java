package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import com.facebook.soloader.a0;
import com.facebook.soloader.o;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

/* compiled from: ApkSoSource.java */
/* loaded from: classes2.dex */
public class b extends o {
    private static final String B = "ApkSoSource";
    public static final int C = 1;
    private static final byte D = 2;
    private static final byte E = 0;
    private static final byte F = 1;
    private static final byte G = 2;
    private final int H;

    /* compiled from: ApkSoSource.java */
    /* loaded from: classes2.dex */
    public class a extends o.c {
        private File w;
        private final int x;

        public a(o oVar) throws IOException {
            super(oVar);
            this.w = new File(b.this.v.getApplicationInfo().nativeLibraryDir);
            this.x = b.this.H;
        }

        @Override // com.facebook.soloader.o.c
        public boolean h(ZipEntry zipEntry, String str) {
            String name = zipEntry.getName();
            if (str.equals(b.this.w)) {
                b.this.w = null;
                String.format("allowing consideration of corrupted lib %s", str);
            } else if ((this.x & 1) != 0) {
                File file = new File(this.w, str);
                if (!file.isFile()) {
                    String.format("allowing considering of %s: %s not in system lib dir", name, str);
                } else {
                    long length = file.length();
                    long size = zipEntry.getSize();
                    if (length == size) {
                        return false;
                    }
                    String.format("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", file, Long.valueOf(length), Long.valueOf(size));
                }
            }
            return true;
        }
    }

    public b(Context context, String str, int i) {
        this(context, new File(context.getApplicationInfo().sourceDir), str, i);
    }

    @Override // com.facebook.soloader.a0
    public byte[] l() throws IOException {
        File canonicalFile = this.z.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(y.g(this.v));
            if ((this.H & 1) == 0) {
                obtain.writeByte((byte) 0);
                return obtain.marshall();
            }
            String str = this.v.getApplicationInfo().nativeLibraryDir;
            if (str == null) {
                obtain.writeByte(F);
                return obtain.marshall();
            }
            File canonicalFile2 = new File(str).getCanonicalFile();
            if (!canonicalFile2.exists()) {
                obtain.writeByte(F);
                return obtain.marshall();
            }
            obtain.writeByte((byte) 2);
            obtain.writeString(canonicalFile2.getPath());
            obtain.writeLong(canonicalFile2.lastModified());
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    @Override // com.facebook.soloader.o, com.facebook.soloader.a0
    public a0.f o() throws IOException {
        return new a(this);
    }

    public b(Context context, File file, String str, int i) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.H = i;
    }
}
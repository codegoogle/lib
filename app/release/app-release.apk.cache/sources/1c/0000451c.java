package com.p7700g.p99005;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ThumbnailStreamOpener.java */
/* loaded from: classes2.dex */
public class gr1 {
    private static final String a = "ThumbStreamOpener";
    private static final cr1 b = new cr1();
    private final cr1 c;
    private final fr1 d;
    private final is1 e;
    private final ContentResolver f;
    private final List<ImageHeaderParser> g;

    public gr1(List<ImageHeaderParser> list, fr1 fr1Var, is1 is1Var, ContentResolver contentResolver) {
        this(list, b, fr1Var, is1Var, contentResolver);
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0041: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:23:0x0041 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    @z1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private String b(@x1 Uri uri) {
        Cursor cursor;
        Cursor cursor2;
        Cursor cursor3 = null;
        try {
            try {
                cursor = this.d.a(uri);
                if (cursor != null) {
                    try {
                        if (cursor.moveToFirst()) {
                            String string = cursor.getString(0);
                            cursor.close();
                            return string;
                        }
                    } catch (SecurityException unused) {
                        if (Log.isLoggable(a, 3)) {
                            String str = "Failed to query for thumbnail for Uri: " + uri;
                        }
                        if (cursor != null) {
                            cursor.close();
                        }
                        return null;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            } catch (SecurityException unused2) {
                cursor = null;
            } catch (Throwable th) {
                th = th;
                if (cursor3 != null) {
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor3 = cursor2;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.c.a(file) && 0 < this.c.c(file);
    }

    public int a(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                inputStream = this.f.openInputStream(uri);
                int b2 = fq1.b(this.g, inputStream, this.e);
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return b2;
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (IOException | NullPointerException unused3) {
            if (Log.isLoggable(a, 3)) {
                String str = "Failed to open uri: " + uri;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    return -1;
                } catch (IOException unused4) {
                    return -1;
                }
            }
            return -1;
        }
    }

    public InputStream d(Uri uri) throws FileNotFoundException {
        String b2 = b(uri);
        if (TextUtils.isEmpty(b2)) {
            return null;
        }
        File b3 = this.c.b(b2);
        if (c(b3)) {
            Uri fromFile = Uri.fromFile(b3);
            try {
                return this.f.openInputStream(fromFile);
            } catch (NullPointerException e) {
                throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e));
            }
        }
        return null;
    }

    public gr1(List<ImageHeaderParser> list, cr1 cr1Var, fr1 fr1Var, is1 is1Var, ContentResolver contentResolver) {
        this.c = cr1Var;
        this.d = fr1Var;
        this.e = is1Var;
        this.f = contentResolver;
        this.g = list;
    }
}
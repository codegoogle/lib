package com.p7700g.p99005;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: RawDocumentFile.java */
/* loaded from: classes.dex */
public class iu extends gu {
    private File c;

    public iu(@z1 gu guVar, File file) {
        super(guVar);
        this.c = file;
    }

    private static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z &= w(file2);
                }
                if (!file2.delete()) {
                    String str = "Failed to delete " + file2;
                    z = false;
                }
            }
        }
        return z;
    }

    private static String x(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(lastIndexOf + 1).toLowerCase());
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : tm4.x;
        }
        return tm4.x;
    }

    @Override // com.p7700g.p99005.gu
    public boolean a() {
        return this.c.canRead();
    }

    @Override // com.p7700g.p99005.gu
    public boolean b() {
        return this.c.canWrite();
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public gu c(String str) {
        File file = new File(this.c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new iu(this, file);
        }
        return null;
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public gu d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = wo1.u(str2, CryptoConstants.ALIAS_SEPARATOR, extensionFromMimeType);
        }
        File file = new File(this.c, str2);
        try {
            file.createNewFile();
            return new iu(this, file);
        } catch (IOException e) {
            String str3 = "Failed to createFile: " + e;
            return null;
        }
    }

    @Override // com.p7700g.p99005.gu
    public boolean e() {
        w(this.c);
        return this.c.delete();
    }

    @Override // com.p7700g.p99005.gu
    public boolean f() {
        return this.c.exists();
    }

    @Override // com.p7700g.p99005.gu
    public String k() {
        return this.c.getName();
    }

    @Override // com.p7700g.p99005.gu
    @z1
    public String m() {
        if (this.c.isDirectory()) {
            return null;
        }
        return x(this.c.getName());
    }

    @Override // com.p7700g.p99005.gu
    public Uri n() {
        return Uri.fromFile(this.c);
    }

    @Override // com.p7700g.p99005.gu
    public boolean o() {
        return this.c.isDirectory();
    }

    @Override // com.p7700g.p99005.gu
    public boolean q() {
        return this.c.isFile();
    }

    @Override // com.p7700g.p99005.gu
    public boolean r() {
        return false;
    }

    @Override // com.p7700g.p99005.gu
    public long s() {
        return this.c.lastModified();
    }

    @Override // com.p7700g.p99005.gu
    public long t() {
        return this.c.length();
    }

    @Override // com.p7700g.p99005.gu
    public gu[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.c.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                arrayList.add(new iu(this, file));
            }
        }
        return (gu[]) arrayList.toArray(new gu[arrayList.size()]);
    }

    @Override // com.p7700g.p99005.gu
    public boolean v(String str) {
        File file = new File(this.c.getParentFile(), str);
        if (this.c.renameTo(file)) {
            this.c = file;
            return true;
        }
        return false;
    }
}
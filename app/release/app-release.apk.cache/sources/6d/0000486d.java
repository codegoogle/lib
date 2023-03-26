package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.microsoft.appcenter.AppCenter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FileProvider.java */
/* loaded from: classes.dex */
public class ih extends ContentProvider {
    private static final String A = "external-media-path";
    private static final String B = "name";
    private static final String C = "path";
    private static final String D = "displayName";
    private static final String t = "android.support.FILE_PROVIDER_PATHS";
    private static final String u = "root-path";
    private static final String v = "files-path";
    private static final String w = "cache-path";
    private static final String x = "external-path";
    private static final String y = "external-files-path";
    private static final String z = "external-cache-path";
    private b G;
    private int H;
    private static final String[] s = {"_display_name", "_size"};
    private static final File E = new File("/");
    @k1("sCache")
    private static final HashMap<String, b> F = new HashMap<>();

    /* compiled from: FileProvider.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static File[] a(Context context) {
            return context.getExternalMediaDirs();
        }
    }

    /* compiled from: FileProvider.java */
    /* loaded from: classes.dex */
    public interface b {
        File a(Uri uri);

        Uri b(File file);
    }

    /* compiled from: FileProvider.java */
    /* loaded from: classes.dex */
    public static class c implements b {
        private final String a;
        private final HashMap<String, File> b = new HashMap<>();

        public c(String str) {
            this.a = str;
        }

        @Override // com.p7700g.p99005.ih.b
        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException(wo1.r("Failed to resolve canonical path for ", file2));
                }
            }
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }

        @Override // com.p7700g.p99005.ih.b
        public Uri b(File file) {
            String substring;
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.b.entrySet()) {
                    String path = entry2.getValue().getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry2;
                    }
                }
                if (entry != null) {
                    String path2 = entry.getValue().getPath();
                    if (path2.endsWith("/")) {
                        substring = canonicalPath.substring(path2.length());
                    } else {
                        substring = canonicalPath.substring(path2.length() + 1);
                    }
                    return new Uri.Builder().scheme("content").authority(this.a).encodedPath(Uri.encode(entry.getKey()) + j14.P + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException(wo1.t("Failed to find configured root that contains ", canonicalPath));
            } catch (IOException unused) {
                throw new IllegalArgumentException(wo1.r("Failed to resolve canonical path for ", file));
            }
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.b.put(str, file.getCanonicalFile());
                    return;
                } catch (IOException e) {
                    throw new IllegalArgumentException(wo1.r("Failed to resolve canonical path for ", file), e);
                }
            }
            throw new IllegalArgumentException("Name must not be empty");
        }
    }

    public ih() {
        this.H = 0;
    }

    private static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    private static Object[] b(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    private static String[] c(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    @r2
    public static XmlResourceParser d(Context context, String str, @z1 ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt(t, i);
            }
            XmlResourceParser loadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), t);
            if (loadXmlMetaData != null) {
                return loadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        throw new IllegalArgumentException(wo1.t("Couldn't find meta-data for provider with authority ", str));
    }

    private static b e(Context context, String str, int i) {
        b bVar;
        HashMap<String, b> hashMap = F;
        synchronized (hashMap) {
            bVar = hashMap.get(str);
            if (bVar == null) {
                try {
                    try {
                        bVar = i(context, str, i);
                        hashMap.put(str, bVar);
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    }
                } catch (XmlPullParserException e2) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                }
            }
        }
        return bVar;
    }

    public static Uri f(@x1 Context context, @x1 String str, @x1 File file) {
        return e(context, str, 0).b(file);
    }

    @x1
    @SuppressLint({"StreamFiles"})
    public static Uri g(@x1 Context context, @x1 String str, @x1 File file, @x1 String str2) {
        return f(context, str, file).buildUpon().appendQueryParameter(D, str2).build();
    }

    private static int h(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || com.anythink.expressad.d.a.b.R.equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException(wo1.t("Invalid mode: ", str));
    }

    private static b i(Context context, String str, int i) throws IOException, XmlPullParserException {
        c cVar = new c(str);
        XmlResourceParser d = d(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = d.next();
            if (next == 1) {
                return cVar;
            }
            if (next == 2) {
                String name = d.getName();
                File file = null;
                String attributeValue = d.getAttributeValue(null, "name");
                String attributeValue2 = d.getAttributeValue(null, "path");
                if (u.equals(name)) {
                    file = E;
                } else if (v.equals(name)) {
                    file = context.getFilesDir();
                } else if (w.equals(name)) {
                    file = context.getCacheDir();
                } else if (x.equals(name)) {
                    file = Environment.getExternalStorageDirectory();
                } else if (y.equals(name)) {
                    File[] k = gh.k(context, null);
                    if (k.length > 0) {
                        file = k[0];
                    }
                } else if (z.equals(name)) {
                    File[] j = gh.j(context);
                    if (j.length > 0) {
                        file = j[0];
                    }
                } else if (A.equals(name)) {
                    File[] a2 = a.a(context);
                    if (a2.length > 0) {
                        file = a2[0];
                    }
                }
                if (file != null) {
                    cVar.c(attributeValue, a(file, attributeValue2));
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@x1 Context context, @x1 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(AppCenter.PAIR_DELIMITER)[0];
                HashMap<String, b> hashMap = F;
                synchronized (hashMap) {
                    hashMap.remove(str);
                }
                this.G = e(context, str, this.H);
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        return this.G.a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        File a2 = this.G.a(uri);
        int lastIndexOf = a2.getName().lastIndexOf(46);
        if (lastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(a2.getName().substring(lastIndexOf + 1));
            return mimeTypeFromExtension != null ? mimeTypeFromExtension : tm4.x;
        }
        return tm4.x;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@x1 Uri uri, @x1 ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@x1 Uri uri, @x1 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.G.a(uri), h(str));
    }

    @Override // android.content.ContentProvider
    @x1
    public Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        int i;
        File a2 = this.G.a(uri);
        String queryParameter = uri.getQueryParameter(D);
        if (strArr == null) {
            strArr = s;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? a2.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(a2.length());
            }
            i2 = i;
        }
        String[] c2 = c(strArr3, i2);
        Object[] b2 = b(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(c2, 1);
        matrixCursor.addRow(b2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @x1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public ih(@t2 int i) {
        this.H = i;
    }
}
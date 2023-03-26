package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.p7700g.p99005.hu0;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: ApkLibraryInstaller.java */
/* loaded from: classes.dex */
public class du0 implements hu0.a {
    private static final int a = 5;
    private static final int b = 4096;

    /* compiled from: ApkLibraryInstaller.java */
    /* loaded from: classes.dex */
    public static class a {
        public ZipFile a;
        public ZipEntry b;

        public a(ZipFile zipFile, ZipEntry zipEntry) {
            this.a = zipFile;
            this.b = zipEntry;
        }
    }

    private void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += read;
        }
    }

    private a d(Context context, String[] strArr, String str, iu0 iu0Var) {
        int i;
        String[] e = e(context);
        int length = e.length;
        char c = 0;
        int i2 = 0;
        ZipFile zipFile = null;
        while (i2 < length) {
            String str2 = e[i2];
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                i = 5;
                if (i3 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i3 = i4;
                }
            }
            if (zipFile != null) {
                int i5 = 0;
                while (true) {
                    int i6 = i5 + 1;
                    if (i5 < i) {
                        int length2 = strArr.length;
                        int i7 = 0;
                        while (i7 < length2) {
                            String str3 = strArr[i7];
                            StringBuilder G = wo1.G("lib");
                            G.append(File.separatorChar);
                            G.append(str3);
                            G.append(File.separatorChar);
                            G.append(str);
                            String sb = G.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb;
                            objArr[1] = str2;
                            iu0Var.m("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new a(zipFile, entry);
                            }
                            i7++;
                            c = 0;
                        }
                        i = 5;
                        i5 = i6;
                    } else {
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i2++;
            c = 0;
        }
        return null;
    }

    private String[] e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[strArr.length + 1];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }

    @Override // com.p7700g.p99005.hu0.a
    public void a(Context context, String[] strArr, String str, File file, iu0 iu0Var) {
        a d;
        Closeable closeable;
        InputStream inputStream;
        long c;
        a aVar = null;
        Closeable closeable2 = null;
        try {
            d = d(context, strArr, str, iu0Var);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (d == null) {
                throw new fu0(str);
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i < 5) {
                    iu0Var.m("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = d.a.getInputStream(d.b);
                                try {
                                    closeable = new FileOutputStream(file);
                                } catch (FileNotFoundException unused) {
                                    closeable = null;
                                } catch (IOException unused2) {
                                    closeable = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    closeable = null;
                                }
                            } catch (FileNotFoundException unused3) {
                                inputStream = null;
                                closeable = null;
                            } catch (IOException unused4) {
                                inputStream = null;
                                closeable = null;
                            } catch (Throwable th3) {
                                th = th3;
                                closeable = null;
                            }
                            try {
                                c = c(inputStream, closeable);
                                closeable.getFD().sync();
                            } catch (FileNotFoundException unused5) {
                                b(inputStream);
                                b(closeable);
                                i = i2;
                            } catch (IOException unused6) {
                                b(inputStream);
                                b(closeable);
                                i = i2;
                            } catch (Throwable th4) {
                                th = th4;
                                closeable2 = inputStream;
                                b(closeable2);
                                b(closeable);
                                throw th;
                            }
                            if (c != file.length()) {
                                b(inputStream);
                                b(closeable);
                            } else {
                                b(inputStream);
                                b(closeable);
                                file.setReadable(true, false);
                                file.setExecutable(true, false);
                                file.setWritable(true);
                                try {
                                    ZipFile zipFile = d.a;
                                    if (zipFile != null) {
                                        zipFile.close();
                                        return;
                                    }
                                    return;
                                } catch (IOException unused7) {
                                    return;
                                }
                            }
                        }
                    } catch (IOException unused8) {
                    }
                    i = i2;
                } else {
                    iu0Var.l("FATAL! Couldn't extract the library from the APK!");
                    try {
                        ZipFile zipFile2 = d.a;
                        if (zipFile2 != null) {
                            zipFile2.close();
                            return;
                        }
                        return;
                    } catch (IOException unused9) {
                        return;
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            aVar = d;
            if (aVar != null) {
                try {
                    ZipFile zipFile3 = aVar.a;
                    if (zipFile3 != null) {
                        zipFile3.close();
                    }
                } catch (IOException unused10) {
                }
            }
            throw th;
        }
    }
}
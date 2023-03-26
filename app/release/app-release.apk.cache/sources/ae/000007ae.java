package com.anythink.expressad.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.wo1;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* loaded from: classes2.dex */
public final class c {
    private static final String a = "UnzipUtility";
    private static final int b = 4096;

    public static int a(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        String str3;
        if (str == null || str2 == null) {
            return -1;
        }
        if (!str2.endsWith("/")) {
            str2 = wo1.t(str2, "/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return 1;
        }
        InputStream inputStream = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            fileOutputStream2 = null;
            while (entries.hasMoreElements()) {
                try {
                    try {
                        ZipEntry nextElement = entries.nextElement();
                        if (nextElement == null) {
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e) {
                                    n.d(a, e.getMessage());
                                }
                            }
                            if (fileOutputStream2 != null) {
                                try {
                                    fileOutputStream2.close();
                                    return 2;
                                } catch (IOException e2) {
                                    n.d(a, e2.getMessage());
                                    return 2;
                                }
                            }
                            return 2;
                        }
                        File file2 = new File(str2 + nextElement.getName());
                        try {
                            str3 = file2.getCanonicalPath();
                        } catch (IOException unused) {
                            str3 = "";
                        }
                        if (!TextUtils.isEmpty(str3) && !str3.startsWith("..") && !str3.startsWith("../")) {
                            if (nextElement.isDirectory()) {
                                file2.mkdirs();
                            } else {
                                if (!file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    inputStream = zipFile.getInputStream(nextElement);
                                    byte[] bArr = new byte[1024];
                                    while (true) {
                                        int read = inputStream.read(bArr, 0, 1024);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                        fileOutputStream.flush();
                                    }
                                    fileOutputStream2 = fileOutputStream;
                                } catch (IOException e3) {
                                    e = e3;
                                    fileOutputStream2 = fileOutputStream;
                                    n.d(a, e.getMessage());
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e4) {
                                            n.d(a, e4.getMessage());
                                        }
                                    }
                                    if (fileOutputStream2 != null) {
                                        try {
                                            fileOutputStream2.close();
                                            return 3;
                                        } catch (IOException e5) {
                                            n.d(a, e5.getMessage());
                                            return 3;
                                        }
                                    }
                                    return 3;
                                } catch (Throwable th) {
                                    th = th;
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e6) {
                                            n.d(a, e6.getMessage());
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e7) {
                                            n.d(a, e7.getMessage());
                                        }
                                    }
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        fileOutputStream = fileOutputStream2;
                        inputStream = inputStream;
                        th = th2;
                    }
                } catch (IOException e8) {
                    e = e8;
                }
            }
            zipFile.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e9) {
                    n.d(a, e9.getMessage());
                }
            }
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException e10) {
                    n.d(a, e10.getMessage());
                }
            }
            return 0;
        } catch (IOException e11) {
            e = e11;
            fileOutputStream2 = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    private static void a(ZipInputStream zipInputStream, String str) {
        File file = new File(str);
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = null;
        try {
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream2.write(bArr, 0, read);
                        } else {
                            bufferedOutputStream2.close();
                            return;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
package com.anythink.core.common.res;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.common.j.j;
import com.anythink.core.common.res.a;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class d {
    private static final String c = "anythink_internal_resouce";
    private static final String d = "anythink_custom_resouce";
    private static final String e = "anythink_internal_extra_resource";
    private static d f;
    private Context g;
    private File h;
    private final String b = d.class.getSimpleName();
    public ConcurrentHashMap<Integer, a> a = new ConcurrentHashMap<>();

    private d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.g = applicationContext;
        this.h = j.a(applicationContext);
    }

    public static synchronized d a(Context context) {
        d dVar;
        synchronized (d.class) {
            if (f == null) {
                f = new d(context);
            }
            dVar = f;
        }
        return dVar;
    }

    private long b(int i) {
        if (i != 1) {
            return 26214400L;
        }
        com.anythink.core.c.b.a(this.g);
        return com.anythink.core.c.b.a() * 1024;
    }

    private String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(a(1));
        return wo1.D(sb, File.separator, str, ".0");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str, InputStream inputStream) {
        OutputStream outputStream;
        boolean z = false;
        if (str != null && inputStream != null) {
            String a = a(i);
            if (TextUtils.isEmpty(a)) {
                return false;
            }
            File file = new File(a);
            if (!file.exists()) {
                file.mkdirs();
            }
            a a2 = a(i, file);
            if (a2 != null) {
                a.C0049a c0049a = null;
                r1 = null;
                r1 = null;
                OutputStream outputStream2 = null;
                OutputStream outputStream3 = null;
                try {
                    try {
                        try {
                            a.c a3 = a2.a(str);
                            if (a3 == null) {
                                a.C0049a b = a2.b(str);
                                if (b != null) {
                                    try {
                                        outputStream2 = b.a(0);
                                        byte[] bArr = new byte[2048];
                                        while (true) {
                                            int read = inputStream.read(bArr);
                                            if (read == -1) {
                                                break;
                                            }
                                            outputStream2.write(bArr, 0, read);
                                        }
                                        b.a();
                                        outputStream2.close();
                                    } catch (Exception e2) {
                                        e = e2;
                                        OutputStream outputStream4 = outputStream2;
                                        c0049a = b;
                                        outputStream = outputStream4;
                                        try {
                                            com.anythink.core.common.j.e.d(this.b, "writeToDiskLruCache - ".concat(String.valueOf(e)));
                                            if (c0049a != null) {
                                                try {
                                                    c0049a.b();
                                                } catch (Exception e3) {
                                                    e3.printStackTrace();
                                                }
                                            }
                                            if (outputStream != null) {
                                                outputStream.close();
                                            }
                                            return z;
                                        } catch (Throwable th) {
                                            outputStream3 = outputStream;
                                            th = th;
                                            if (outputStream3 != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                a3.a().close();
                            }
                            z = true;
                        } catch (Exception e4) {
                            e = e4;
                            outputStream = null;
                        }
                        if (outputStream2 != null) {
                            outputStream2.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        if (outputStream3 != null) {
                            try {
                                outputStream3.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return z;
    }

    public final FileInputStream a(int i, String str) {
        InputStream a;
        String a2 = a(i);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        File file = new File(a2);
        if (!file.exists()) {
            file.mkdirs();
        }
        a a3 = a(i, file);
        if (a3 != null) {
            try {
                a.c a4 = a3.a(str);
                if (a4 != null && (a = a4.a()) != null) {
                    return (FileInputStream) a;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    private synchronized a a(int i, File file) {
        a aVar;
        long a;
        aVar = this.a.get(Integer.valueOf(i));
        if (aVar == null) {
            if (i != 1) {
                a = 26214400;
            } else {
                com.anythink.core.c.b.a(this.g);
                a = com.anythink.core.c.b.a() * 1024;
            }
            aVar = a.a(file, a);
            this.a.put(Integer.valueOf(i), aVar);
        }
        return aVar;
    }

    public final String a(int i) {
        return new File(this.h, i != 1 ? i != 3 ? d : e : c).getAbsolutePath();
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a(1));
        return new File(wo1.D(sb, File.separator, str, ".0")).exists();
    }
}
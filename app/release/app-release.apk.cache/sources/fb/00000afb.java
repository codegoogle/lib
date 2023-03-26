package com.anythink.expressad.videocommon.b;

import android.webkit.URLUtil;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.videocommon.b.f;
import com.anythink.expressad.videocommon.b.g;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* loaded from: classes2.dex */
public final class e {
    public static final String a = "<anythinkloadend></anythinkloadend>";
    private static final String b = "DownLoadUtils";
    private static final int c = 20000;
    private static final int d = 30000;

    public static void a(final String str, final g.c cVar) {
        try {
            if (!v.a(str) && URLUtil.isNetworkUrl(str)) {
                f.a.a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.e.1
                    public final /* synthetic */ boolean f = true;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:47:0x00be A[Catch: Exception -> 0x00c2, TRY_ENTER, TryCatch #12 {Exception -> 0x00c2, blocks: (B:35:0x008f, B:37:0x0094, B:47:0x00be, B:51:0x00c6), top: B:112:0x0004 }] */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[Catch: Exception -> 0x00c2, TRY_LEAVE, TryCatch #12 {Exception -> 0x00c2, blocks: (B:35:0x008f, B:37:0x0094, B:47:0x00be, B:51:0x00c6), top: B:112:0x0004 }] */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:55:0x00d3, B:58:0x00d9, B:60:0x00dc, B:65:0x00e8, B:67:0x00ee, B:69:0x00f4, B:71:0x00fc, B:73:0x0100, B:75:0x0106, B:77:0x010a), top: B:99:0x00d3 }] */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x010a A[Catch: all -> 0x00e4, TRY_LEAVE, TryCatch #0 {all -> 0x00e4, blocks: (B:55:0x00d3, B:58:0x00d9, B:60:0x00dc, B:65:0x00e8, B:67:0x00ee, B:69:0x00f4, B:71:0x00fc, B:73:0x0100, B:75:0x0106, B:77:0x010a), top: B:99:0x00d3 }] */
                    /* JADX WARN: Removed duplicated region for block: B:99:0x00d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.String] */
                    /* JADX WARN: Type inference failed for: r4v1 */
                    /* JADX WARN: Type inference failed for: r4v11 */
                    /* JADX WARN: Type inference failed for: r4v12 */
                    /* JADX WARN: Type inference failed for: r4v13 */
                    /* JADX WARN: Type inference failed for: r4v14 */
                    /* JADX WARN: Type inference failed for: r4v2 */
                    /* JADX WARN: Type inference failed for: r4v8 */
                    /* JADX WARN: Type inference failed for: r4v9 */
                    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
                    @Override // com.anythink.expressad.foundation.g.g.a
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void a() {
                        String message;
                        ByteArrayOutputStream byteArrayOutputStream;
                        byte[] bArr;
                        ?? r4;
                        g.c cVar2;
                        HttpURLConnection httpURLConnection;
                        boolean z;
                        InputStream inputStream = null;
                        boolean z2 = false;
                        try {
                        } catch (Exception e) {
                            e.printStackTrace();
                            message = e.getMessage();
                        }
                        try {
                            try {
                                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                                httpURLConnection.setReadTimeout(30000);
                                httpURLConnection.setConnectTimeout(e.c);
                                int responseCode = httpURLConnection.getResponseCode();
                                n.a(e.b, "response code ".concat(String.valueOf(responseCode)));
                                if (responseCode == 200) {
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    try {
                                        byte[] bArr2 = new byte[6144];
                                        byteArrayOutputStream = new ByteArrayOutputStream();
                                        while (true) {
                                            try {
                                                try {
                                                    int read = inputStream2.read(bArr2);
                                                    if (read == -1) {
                                                        break;
                                                    }
                                                    byteArrayOutputStream.write(bArr2, 0, read);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    inputStream = inputStream2;
                                                    if (inputStream != null) {
                                                        try {
                                                            inputStream.close();
                                                        } catch (Exception e2) {
                                                            e2.printStackTrace();
                                                            e2.getMessage();
                                                            throw th;
                                                        }
                                                    }
                                                    if (byteArrayOutputStream != null) {
                                                        byteArrayOutputStream.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception e3) {
                                                e = e3;
                                                bArr = null;
                                                inputStream = inputStream2;
                                                r4 = 0;
                                            }
                                        }
                                        if (byteArrayOutputStream.toByteArray() != null) {
                                            bArr = byteArrayOutputStream.toByteArray();
                                            try {
                                                if (!this.f) {
                                                    inputStream = new String(bArr);
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                r4 = 0;
                                                inputStream = inputStream2;
                                                message = e.getMessage();
                                                n.d(e.b, "getStringFromUrl failed " + e.getLocalizedMessage());
                                                if (inputStream != null) {
                                                    inputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                if (z2) {
                                                }
                                                if (!z2) {
                                                }
                                                cVar2 = g.c.this;
                                                if (cVar2 != null) {
                                                }
                                            }
                                        } else {
                                            bArr = null;
                                        }
                                        z = true;
                                        message = "";
                                        r4 = inputStream;
                                        inputStream = inputStream2;
                                    } catch (Exception e5) {
                                        e = e5;
                                        bArr = null;
                                        byteArrayOutputStream = null;
                                        inputStream = inputStream2;
                                        r4 = 0;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        byteArrayOutputStream = null;
                                    }
                                } else {
                                    message = "responseCode is ".concat(String.valueOf(responseCode));
                                    r4 = 0;
                                    bArr = null;
                                    byteArrayOutputStream = null;
                                    z = false;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                r4 = 0;
                                bArr = null;
                                byteArrayOutputStream = null;
                            } catch (Throwable th3) {
                                th = th3;
                                byteArrayOutputStream = null;
                            }
                            try {
                                httpURLConnection.disconnect();
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                                if (byteArrayOutputStream != null) {
                                    byteArrayOutputStream.close();
                                }
                                z2 = z;
                            } catch (Exception e7) {
                                e = e7;
                                message = e.getMessage();
                                n.d(e.b, "getStringFromUrl failed " + e.getLocalizedMessage());
                                if (inputStream != null) {
                                }
                                if (byteArrayOutputStream != null) {
                                }
                                if (z2) {
                                }
                                if (!z2) {
                                }
                                cVar2 = g.c.this;
                                if (cVar2 != null) {
                                }
                            }
                            if (z2) {
                                try {
                                    if (this.f && bArr != null && bArr.length > 0) {
                                        g.c.this.a(bArr, str);
                                        return;
                                    }
                                } catch (Throwable th4) {
                                    if (com.anythink.expressad.a.a) {
                                        th4.printStackTrace();
                                    }
                                    g.c cVar3 = g.c.this;
                                    if (cVar3 != null) {
                                        try {
                                            cVar3.a(th4.getMessage());
                                            return;
                                        } catch (Exception e8) {
                                            e8.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                }
                            }
                            if (!z2 && v.b(r4) && r4.length() > 0 && r4.contains(e.a)) {
                                g.c cVar4 = g.c.this;
                                if (cVar4 != null) {
                                    cVar4.a(bArr, str);
                                    return;
                                }
                                return;
                            }
                            cVar2 = g.c.this;
                            if (cVar2 != null) {
                                cVar2.a("content write failed:".concat(String.valueOf(message)));
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void b() {
                    }

                    @Override // com.anythink.expressad.foundation.g.g.a
                    public final void c() {
                    }
                });
                return;
            }
            cVar.a("url is error");
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
            }
        }
    }
}
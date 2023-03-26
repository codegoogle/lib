package com.anythink.expressad.videocommon.b;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.videocommon.b.f;
import com.p7700g.p99005.j20;
import java.io.File;
import java.util.List;

/* loaded from: classes2.dex */
public final class k {
    public static final String a = "foldername";
    public static final String b = "md5filename";
    public static final String c = "nc";
    public static final int d = 259200000;
    private static String e = "ResourceManager";
    private String f;

    /* loaded from: classes2.dex */
    public static class a {
        public static k a = new k((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ k(byte b2) {
        this();
    }

    private void c() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.f)) {
                return;
            }
            f.a.a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.k.1
                @Override // com.anythink.expressad.foundation.g.g.a
                public final void a() {
                    com.anythink.expressad.foundation.h.l.c(k.this.f);
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void c() {
                }
            });
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
            }
        }
    }

    private k() {
        this.f = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_RES);
    }

    public static k a() {
        return a.a;
    }

    public final synchronized String a(String str, byte[] bArr) {
        String message;
        String str2 = "unknow exception ";
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    String str3 = this.f + "/" + o.a(w.a(str)) + j20.w;
                    File file = new File(str3);
                    if (com.anythink.expressad.foundation.h.l.a(bArr, file)) {
                        Uri parse = Uri.parse(str);
                        List<String> queryParameters = parse.getQueryParameters(c);
                        if (queryParameters != null && queryParameters.size() != 0) {
                            str2 = a(str, str3, file);
                        }
                        List<String> queryParameters2 = parse.getQueryParameters(b);
                        if (queryParameters2 != null && queryParameters2.size() > 0) {
                            String str4 = queryParameters2.get(0);
                            if (!TextUtils.isEmpty(str4) && str4.equals(com.anythink.expressad.foundation.h.k.a(file))) {
                                str2 = a(str, str3, file);
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        com.anythink.expressad.foundation.h.l.b(file);
                    }
                }
            } catch (Exception e2) {
                if (com.anythink.expressad.a.a) {
                    e2.printStackTrace();
                }
                message = e2.getMessage();
            }
        }
        message = str2;
        return message;
    }

    private String a(String str, String str2, File file) {
        String a2 = com.anythink.expressad.foundation.h.l.a(str2, this.f + "/" + o.a(w.a(str)));
        return TextUtils.isEmpty(a2) ? com.anythink.expressad.foundation.h.l.b(file) : a2;
    }

    public final String a(String str) {
        String str2;
        try {
            String str3 = this.f + "/" + o.a(w.a(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(a);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str4 = queryParameters.get(0);
            if (TextUtils.isEmpty(str4)) {
                return null;
            }
            String str5 = str3 + "/" + str4 + "/" + str4 + ".html";
            if (com.anythink.expressad.foundation.h.l.a(str5)) {
                try {
                    str2 = str.substring(str.indexOf("?") + 1);
                } catch (Exception unused) {
                    str2 = "";
                }
                return "file://" + str5 + (TextUtils.isEmpty(str2) ? "" : "?".concat(String.valueOf(str2)));
            }
            return null;
        } catch (Exception e2) {
            if (com.anythink.expressad.a.a) {
                e2.printStackTrace();
                return null;
            }
            return null;
        }
    }
}
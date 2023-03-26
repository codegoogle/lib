package com.anythink.expressad.videocommon.b;

import android.text.TextUtils;
import com.anythink.expressad.foundation.h.o;
import com.anythink.expressad.foundation.h.w;
import com.anythink.expressad.videocommon.b.f;
import java.io.File;

/* loaded from: classes2.dex */
public final class h {
    public static final int a = 259200000;
    private static final String b = "HTMLResourceManager";
    private String c;

    /* loaded from: classes2.dex */
    public static class a {
        public static h a = new h((byte) 0);

        private a() {
        }
    }

    public /* synthetic */ h(byte b2) {
        this();
    }

    private void c() {
        this.c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public final void b() {
        try {
            if (TextUtils.isEmpty(this.c)) {
                return;
            }
            f.a.a.a(new com.anythink.expressad.foundation.g.g.a() { // from class: com.anythink.expressad.videocommon.b.h.1
                @Override // com.anythink.expressad.foundation.g.g.a
                public final void a() {
                    com.anythink.expressad.foundation.h.l.c(h.this.c);
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.g.a
                public final void c() {
                }
            });
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    private h() {
        this.c = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_700_HTML);
    }

    public static h a() {
        return a.a;
    }

    public final boolean a(String str, byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.c);
                    sb.append("/");
                    sb.append(o.a(w.a(str)));
                    sb.append(".html");
                    return com.anythink.expressad.foundation.h.l.a(bArr, new File(sb.toString()));
                }
                return false;
            } catch (Exception e) {
                if (com.anythink.expressad.a.a) {
                    e.printStackTrace();
                    return false;
                }
                return false;
            }
        }
        return false;
    }

    public final String b(String str) {
        try {
            String a2 = o.a(w.a(str));
            File file = new File(this.c + "/" + a2 + ".html");
            if (file.exists()) {
                return com.anythink.expressad.foundation.h.l.a(file);
            }
            return null;
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
                return null;
            }
            return null;
        }
    }

    public final String a(String str) {
        try {
            String str2 = this.c + "/" + o.a(w.a(str)) + ".html";
            if (new File(str2).exists()) {
                return "file:////".concat(String.valueOf(str2));
            }
            return null;
        } catch (Throwable th) {
            if (com.anythink.expressad.a.a) {
                th.printStackTrace();
                return null;
            }
            return null;
        }
    }
}
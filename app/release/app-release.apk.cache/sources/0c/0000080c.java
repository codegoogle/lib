package com.anythink.expressad.foundation.g.d;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.f.f;
import com.anythink.expressad.foundation.g.f.k;
import com.p7700g.p99005.wo1;
import java.io.File;

/* loaded from: classes2.dex */
public final class d extends com.anythink.expressad.foundation.g.g.a {
    private static final String a = "ImageWorker";
    private String e;
    private String f;
    private String g;
    private boolean h = false;
    private a i;

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2);

        void b(String str, String str2);
    }

    public d(String str, String str2, String str3) {
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    private String h() {
        return this.e;
    }

    private String i() {
        return this.f;
    }

    private String j() {
        return this.g;
    }

    private boolean k() {
        return this.h;
    }

    private a l() {
        return this.i;
    }

    private static void m() {
    }

    private void n() {
        try {
            File file = new File(this.g);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            com.anythink.expressad.foundation.g.f.h.b.a(file, this.f, new f<Void>() { // from class: com.anythink.expressad.foundation.g.d.d.1
                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(k kVar) {
                    String unused = d.this.g;
                    d.this.d();
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void b() {
                }

                @Override // com.anythink.expressad.foundation.g.f.f, com.anythink.expressad.foundation.g.f.e
                public final void a(com.anythink.expressad.foundation.g.f.a.a aVar) {
                    d dVar = d.this;
                    String str = dVar.f;
                    dVar.b(str, "load image from http faild because http return code: " + aVar.a + ".image url is " + d.this.f);
                }
            });
        } catch (Exception e) {
            b(this.f, e.getMessage());
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        } catch (OutOfMemoryError e2) {
            b(this.f, e2.getMessage());
        }
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void b() {
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void c() {
    }

    public final void d() {
        if (new File(this.g).exists()) {
            String str = this.f;
            String str2 = this.g;
            a aVar = this.i;
            if (aVar != null) {
                aVar.a(str, str2);
                return;
            }
            return;
        }
        b(this.f, wo1.C(new StringBuilder("load image faild.because file["), this.g, "] is not exist!"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.b(str, str2);
        }
    }

    public final void a(boolean z) {
        this.h = z;
    }

    public final void a(a aVar) {
        this.i = aVar;
    }

    private void a(String str, String str2) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(str, str2);
        }
    }

    @Override // com.anythink.expressad.foundation.g.g.a
    public final void a() {
        if (!this.h) {
            if (TextUtils.isEmpty(this.g)) {
                b(this.f, "save path is null.");
                return;
            }
            File file = new File(this.g);
            if (file.exists() && file.length() > 0) {
                d();
                return;
            } else {
                n();
                return;
            }
        }
        n();
    }
}
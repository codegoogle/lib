package com.anythink.expressad.mbbanner.a.e;

import android.os.Handler;
import android.os.Looper;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.n;

/* loaded from: classes2.dex */
public class a {
    private static final String a = "a";
    private final Handler b = new Handler(Looper.getMainLooper());
    private boolean c;

    public final void b(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        n.d(a, "postResourceFail unitId=".concat(String.valueOf(str)));
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.c;
                    bVar2.b();
                }
            }
        });
    }

    private void a(boolean z) {
        this.c = z;
    }

    private void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final d dVar, final String str) {
        n.d(a, "postCampaignSuccess unitId=".concat(String.valueOf(str)));
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    d dVar2 = dVar;
                    boolean unused = a.this.c;
                    bVar2.a(dVar2);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str, final String str2) {
        String str3 = a;
        n.b(str3, "postCampaignFail errorMsg=" + str + " unitId=" + str2);
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    String str4 = str;
                    boolean unused = a.this.c;
                    bVar2.a(str4);
                }
            }
        });
    }

    public final void a(final com.anythink.expressad.mbbanner.a.c.b bVar, final String str) {
        n.d(a, "postResourceSuccess unitId=".concat(String.valueOf(str)));
        this.b.post(new Runnable() { // from class: com.anythink.expressad.mbbanner.a.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.expressad.mbbanner.a.c.b bVar2 = bVar;
                if (bVar2 != null) {
                    boolean unused = a.this.c;
                    bVar2.a();
                }
            }
        });
    }
}
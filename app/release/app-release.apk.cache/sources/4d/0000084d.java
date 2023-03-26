package com.anythink.expressad.foundation.g.f;

import android.content.Context;

/* loaded from: classes2.dex */
public final class m {
    private static m c;
    private j a;
    private com.anythink.expressad.foundation.g.f.d.b b;

    private m() {
    }

    public static void a(Context context) {
        if (c == null) {
            m mVar = new m();
            c = mVar;
            mVar.a = new j(context.getApplicationContext());
            c.b = new com.anythink.expressad.foundation.g.f.d.b(b());
        }
    }

    private static j b() {
        j jVar;
        m mVar = c;
        if (mVar == null || (jVar = mVar.a) == null) {
            throw new IllegalStateException("RequestQueue not initialized");
        }
        return jVar;
    }

    private static void c() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        m mVar = c;
        if (mVar == null || (bVar = mVar.b) == null) {
            return;
        }
        bVar.a();
        c.b = null;
    }

    public static void a(i iVar) {
        b().a(iVar);
    }

    public static com.anythink.expressad.foundation.g.f.d.b a() {
        com.anythink.expressad.foundation.g.f.d.b bVar;
        m mVar = c;
        if (mVar == null || (bVar = mVar.b) == null) {
            throw new IllegalStateException("FileDownloader not initialized");
        }
        return bVar;
    }
}
package com.anythink.basead.a;

import android.content.Context;
import android.content.IntentFilter;
import com.anythink.core.common.m;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class h {
    private static h b;
    public g a;
    private Context c;
    private ConcurrentHashMap<String, com.anythink.core.common.e.i> d = new ConcurrentHashMap<>();

    private h(Context context) {
        this.c = context;
    }

    public static synchronized h a(Context context) {
        h hVar;
        synchronized (h.class) {
            if (b == null) {
                b = new h(context);
            }
            hVar = b;
        }
        return hVar;
    }

    private void b() {
        if (this.a != null) {
            m.a(this.c).a(this.a);
            this.a = null;
        }
    }

    public final void c(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.i = bVar;
            bVar.a = str2;
            b.a(20, iVar, iVar2);
        }
    }

    public final void d(String str, String str2) {
        com.anythink.core.common.e.i remove = this.d.remove(str);
        if (remove != null) {
            com.anythink.basead.c.i iVar = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar.i = bVar;
            bVar.a = str2;
            b.a(21, remove, iVar);
        }
        if (this.d.size() != 0 || this.a == null) {
            return;
        }
        m.a(this.c).a(this.a);
        this.a = null;
    }

    public final void a() {
        if (this.c != null && this.a == null) {
            this.a = new g();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("action_offer_download_start");
            intentFilter.addAction("action_offer_download_end");
            intentFilter.addAction("action_offer_install_start");
            intentFilter.addAction("action_offer_install_successful");
            m.a(this.c).a(this.a, intentFilter);
        }
    }

    public final void b(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.i = bVar;
            bVar.a = str2;
            b.a(19, iVar, iVar2);
        }
    }

    public final void a(String str, com.anythink.core.common.e.i iVar) {
        this.d.put(str, iVar);
    }

    public final void a(String str, String str2) {
        com.anythink.core.common.e.i iVar = this.d.get(str);
        if (iVar != null) {
            com.anythink.basead.c.i iVar2 = new com.anythink.basead.c.i("", "");
            com.anythink.basead.c.b bVar = new com.anythink.basead.c.b();
            iVar2.i = bVar;
            bVar.a = str2;
            b.a(18, iVar, iVar2);
        }
    }
}
package com.anythink.basead.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;

/* loaded from: classes2.dex */
public final class i implements com.anythink.core.common.f.b {
    public com.anythink.basead.d a;
    public Context b = m.a().e();

    @Override // com.anythink.core.common.f.b
    public final void a(final com.anythink.core.common.e.i iVar, final String str, final String str2, boolean z) {
        if (z) {
            b.a(this.b, iVar);
            return;
        }
        k g = iVar.g();
        if (g == null) {
            return;
        }
        int E = g.E();
        int F = g.F();
        if (E != 1) {
            if (E != 3) {
                return;
            }
            com.anythink.core.common.b.a().a("1", new com.anythink.basead.c.g(iVar, str2, str));
            return;
        }
        final com.anythink.basead.a aVar = new com.anythink.basead.a() { // from class: com.anythink.basead.a.i.1
            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                super.onActivityPaused(activity);
                com.anythink.basead.d dVar = i.this.a;
                if (dVar != null) {
                    dVar.b();
                }
            }

            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                com.anythink.basead.d dVar = i.this.a;
                if (dVar != null) {
                    dVar.a();
                }
            }
        };
        this.a = new com.anythink.basead.d(F, new Runnable() { // from class: com.anythink.basead.a.i.2
            @Override // java.lang.Runnable
            public final void run() {
                ((Application) i.this.b).unregisterActivityLifecycleCallbacks(aVar);
                if (b.a(i.this.b, iVar)) {
                    com.anythink.core.common.i.c.a(str, iVar.k(), str2, 6, (String) null, 0L, 0L);
                }
            }
        });
        try {
            ((Application) this.b).registerActivityLifecycleCallbacks(aVar);
        } catch (Exception unused) {
            com.anythink.core.common.i.c.a("Error", "Error, cannot registerActivityLifecycleCallbacks here!", m.a().p());
        }
    }
}
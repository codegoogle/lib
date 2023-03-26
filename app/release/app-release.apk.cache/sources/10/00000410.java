package com.anythink.basead.a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.k;

/* loaded from: classes2.dex */
public final class a {
    public com.anythink.basead.d a;
    private View b;
    private com.anythink.core.common.e.j c;
    private InterfaceC0016a d;
    private Activity e = null;
    private boolean f = false;
    private Application.ActivityLifecycleCallbacks g;

    /* renamed from: com.anythink.basead.a.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0016a {
        void a(int i);
    }

    public a(View view, com.anythink.core.common.e.j jVar, InterfaceC0016a interfaceC0016a) {
        this.b = view;
        this.c = jVar;
        this.d = interfaceC0016a;
        final Context applicationContext = view.getContext().getApplicationContext();
        applicationContext = applicationContext instanceof Application ? applicationContext : m.a().e();
        com.anythink.basead.a aVar = new com.anythink.basead.a() { // from class: com.anythink.basead.a.a.1
            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                if ((a.this.e == activity || a.b(a.this)) && a.this.g != null) {
                    ((Application) applicationContext).unregisterActivityLifecycleCallbacks(a.this.g);
                    a.this.g = null;
                }
            }

            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                if (a.this.e == activity || a.b(a.this)) {
                    a.this.a.b();
                }
            }

            @Override // com.anythink.basead.a, android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                if (a.this.e == null && !a.b(a.this)) {
                    a.this.e = activity;
                }
                if (a.this.e == activity || a.b(a.this)) {
                    a.c(a.this);
                }
            }
        };
        this.g = aVar;
        try {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar);
        } catch (Exception unused) {
            com.anythink.core.common.i.c.a("Error", "Error, cannot registerActivityLifecycleCallbacks here!", m.a().p());
        }
        this.a = new com.anythink.basead.d(this.c.m.D(), new Runnable() { // from class: com.anythink.basead.a.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(2);
            }
        });
    }

    public final void b() {
        if (this.g != null) {
            ((Application) m.a().e()).unregisterActivityLifecycleCallbacks(this.g);
            this.g = null;
        }
        this.a.c();
    }

    public final void c() {
        if (this.c.m.C() == 3) {
            a(3);
        }
    }

    private boolean d() {
        return this.c.j == 4;
    }

    private void e() {
        if (this.f) {
            a();
        }
    }

    private void f() {
        this.a.b();
    }

    public static /* synthetic */ void c(a aVar) {
        if (aVar.f) {
            aVar.a();
        }
    }

    public final void a() {
        this.f = true;
        k kVar = this.c.m;
        if (kVar.C() != 2 || kVar.D() < 0) {
            return;
        }
        this.a.a();
    }

    private void b(final int i) {
        if (this.d != null) {
            m.a().a(new Runnable() { // from class: com.anythink.basead.a.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    a.this.d.a(i);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        View view;
        if (this.c.j == 2) {
            return;
        }
        boolean z = true;
        if (i == 2 && ((view = this.b) == null || view.getParent() == null || !this.b.isShown())) {
            z = false;
        }
        if (z) {
            b(i);
        }
    }

    public static /* synthetic */ boolean b(a aVar) {
        return aVar.c.j == 4;
    }
}
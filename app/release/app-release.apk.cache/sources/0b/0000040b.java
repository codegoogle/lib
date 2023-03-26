package com.anythink.banner.b;

import android.text.TextUtils;
import com.anythink.banner.a.d;
import com.anythink.core.c.e;
import com.anythink.core.common.b.m;
import java.lang.ref.WeakReference;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class a {
    public String a;
    public WeakReference<d> b;
    public Timer c;
    private boolean d = false;

    /* renamed from: com.anythink.banner.b.a$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            a aVar = a.this;
            d dVar = aVar.b.get();
            if (dVar != null) {
                dVar.timeUpRefreshView();
            } else {
                aVar.d();
            }
        }
    }

    public a(d dVar) {
        this.b = new WeakReference<>(dVar);
    }

    private TimerTask e() {
        return new AnonymousClass1();
    }

    private void f() {
        d dVar = this.b.get();
        if (dVar != null) {
            dVar.timeUpRefreshView();
        } else {
            d();
        }
    }

    public final void a(String str) {
        this.a = str;
    }

    public final synchronized void b() {
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        com.anythink.core.c.d a = e.a(m.a().e()).a(this.a);
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
        }
        if (a != null && a.Q() == 1) {
            this.d = true;
            this.c = new Timer();
            long R = a.R() > 5000 ? a.R() : 5000L;
            this.c.schedule(new AnonymousClass1(), R, R);
        }
    }

    public final boolean c() {
        return this.c == null;
    }

    public final synchronized void d() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
        }
        this.c = null;
    }

    public final boolean a() {
        return this.d;
    }

    private static /* synthetic */ void a(a aVar) {
        d dVar = aVar.b.get();
        if (dVar != null) {
            dVar.timeUpRefreshView();
        } else {
            aVar.d();
        }
    }
}
package com.anythink.core.common.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class e implements Application.ActivityLifecycleCallbacks {
    public static final String a = "start_time";
    public static final String b = "end_time";
    public static final String c = "psid";
    public static final String d = "launch_mode";
    public static final int e = 0;
    public static final int f = 1;
    public long g;
    public JSONObject i;
    private final String l = e.class.getName();
    public Handler j = new Handler(Looper.getMainLooper());
    public Runnable k = new Runnable() { // from class: com.anythink.core.common.b.e.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.a();
                }
            });
        }
    };
    public int h = 0;

    public e(long j) {
        this.g = j;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.3
            @Override // java.lang.Runnable
            public final void run() {
                e.this.b();
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        final long currentTimeMillis = System.currentTimeMillis();
        com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.b.e.2
            @Override // java.lang.Runnable
            public final void run() {
                e.this.a(currentTimeMillis);
            }
        });
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b() {
        long currentTimeMillis = System.currentTimeMillis();
        String n = m.a().n();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c, m.a().p());
            jSONObject.put(a, this.g);
            jSONObject.put(b, System.currentTimeMillis());
            jSONObject.put(d, this.h);
            this.i = jSONObject;
            Context e2 = m.a().e();
            com.anythink.core.common.j.n.a(e2, g.o, n + "playRecord", jSONObject.toString());
            String str = this.l;
            com.anythink.core.common.j.e.d(str, "onActivityPaused: record leave time:" + jSONObject.toString());
        } catch (Exception unused) {
        }
        com.anythink.core.c.a b2 = com.anythink.core.c.b.a(m.a().e()).b(n);
        if (b2.v() == 1) {
            this.j.postDelayed(this.k, b2.t());
            com.anythink.core.common.j.e.d(this.l, "onActivityPaused : Start to leave application countdown.");
        }
        String str2 = this.l;
        com.anythink.core.common.j.e.d(str2, "onActivityPaused: Method use time:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        if (this.i != null) {
            Context e2 = m.a().e();
            com.anythink.core.common.j.n.a(e2, g.o, m.a().n() + "playRecord", "");
            this.g = 0L;
            JSONObject jSONObject = this.i;
            long optLong = jSONObject.optLong(a);
            long optLong2 = jSONObject.optLong(b);
            String optString = jSONObject.optString(c);
            int optInt = jSONObject.optInt(d);
            this.i = null;
            com.anythink.core.common.i.c.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
            String str = this.l;
            com.anythink.core.common.j.e.d(str, "Time up to send application playTime, reset playStartTime and send agent, playtime:" + ((optLong2 - optLong) / 1000));
            return;
        }
        com.anythink.core.common.j.e.d(this.l, "Time up to send application playTime, but recordObject is null.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(long j) {
        this.j.removeCallbacks(this.k);
        com.anythink.core.c.a b2 = com.anythink.core.c.b.a(m.a().e()).b(m.a().n());
        if (this.i != null) {
            com.anythink.core.common.j.e.d(this.l, "onActivityResumed : Time countdown is closed, check the time is up?");
            JSONObject jSONObject = this.i;
            long optLong = jSONObject.optLong(a);
            long optLong2 = jSONObject.optLong(b);
            String optString = jSONObject.optString(c);
            int optInt = jSONObject.optInt(d);
            if (System.currentTimeMillis() - optLong2 > b2.t()) {
                String str = this.l;
                com.anythink.core.common.j.e.d(str, "onActivityResumed : Time countdown is closed, time up to send agent and create new psid, playtime:" + ((optLong2 - optLong) / 1000));
                Context e2 = m.a().e();
                com.anythink.core.common.j.n.a(e2, g.o, m.a().n() + "playRecord", "");
                com.anythink.core.common.i.c.a(optInt == 1 ? 3 : 1, optLong, optLong2, optString);
                this.g = 0L;
            } else {
                com.anythink.core.common.j.e.d(this.l, "onActivityResumed : Time countdown is closed, continue to record pervious start time");
            }
        } else {
            com.anythink.core.common.j.e.d(this.l, "onActivityResumed : Time countdown is opened or doesn't start countdown");
        }
        this.i = null;
        if (this.g == 0) {
            this.h = 1;
            com.anythink.core.common.j.e.d(this.l, "onActivityResumed : restart to record starttime");
            try {
                this.g = m.a().a(m.a().e(), m.a().n(), 1);
            } catch (Exception unused) {
            }
        } else {
            String n = m.a().n();
            Context e3 = m.a().e();
            com.anythink.core.common.j.n.a(e3, g.o, n + "playRecord", "");
            com.anythink.core.common.j.e.d(this.l, "onActivityResumed : Continue to record the pervious start time");
        }
        if (this.g == 0) {
            this.g = System.currentTimeMillis();
        }
        String str2 = this.l;
        com.anythink.core.common.j.e.d(str2, "onActivityResumed: Method use time:" + (System.currentTimeMillis() - j));
    }
}
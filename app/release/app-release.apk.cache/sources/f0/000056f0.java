package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class pu2 {
    @k1("TopicsStore.class")
    private static WeakReference<pu2> a;
    private final SharedPreferences b;
    private lu2 c;
    private final Executor d;

    private pu2(SharedPreferences sharedPreferences, Executor executor) {
        this.d = executor;
        this.b = sharedPreferences;
    }

    @s2
    public static synchronized pu2 b(Context context, Executor executor) {
        synchronized (pu2.class) {
            WeakReference<pu2> weakReference = a;
            pu2 pu2Var = weakReference != null ? weakReference.get() : null;
            if (pu2Var == null) {
                pu2 pu2Var2 = new pu2(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                pu2Var2.d();
                a = new WeakReference<>(pu2Var2);
                return pu2Var2;
            }
            return pu2Var;
        }
    }

    @s2
    private synchronized void d() {
        this.c = lu2.d(this.b, "topic_operation_queue", ",", this.d);
    }

    public synchronized boolean a(ou2 ou2Var) {
        return this.c.a(ou2Var.e());
    }

    @z1
    public synchronized ou2 c() {
        return ou2.a(this.c.f());
    }

    public synchronized boolean e(ou2 ou2Var) {
        return this.c.g(ou2Var.e());
    }
}
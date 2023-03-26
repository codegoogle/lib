package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class tu2 {
    private static final long a = TimeUnit.MINUTES.toMillis(1);
    private static final Object b = new Object();
    @GuardedBy("WakeLockHolder.syncObject")
    private static WakeLock c;

    @GuardedBy("WakeLockHolder.syncObject")
    private static void a(Context context) {
        if (c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    public static void b(@x1 Intent intent) {
        synchronized (b) {
            if (c != null && c(intent)) {
                d(intent, false);
                c.release();
            }
        }
    }

    @r2
    public static boolean c(@x1 Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(@x1 Intent intent, boolean z) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z);
    }

    public static ComponentName e(@x1 Context context, @x1 Intent intent) {
        synchronized (b) {
            a(context);
            boolean c2 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c2) {
                c.acquire(a);
            }
            return startService;
        }
    }
}
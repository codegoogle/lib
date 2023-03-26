package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.rs2;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
@KeepForSdk
/* loaded from: classes3.dex */
public class et2 {
    private static final Object a = new Object();
    @GuardedBy("lock")
    private static zu2 b;
    private final Context c;
    private final Executor d;

    public et2(@x1 Context context) {
        this.c = context;
        this.d = xs2.s;
    }

    public et2(@x1 Context context, @x1 ExecutorService executorService) {
        this.c = context;
        this.d = executorService;
    }

    private static Task<Integer> a(Context context, Intent intent) {
        Log.isLoggable(rs2.a, 3);
        return b(context, "com.google.firebase.MESSAGING_EVENT").c(intent).continueWith(at2.s, bt2.a);
    }

    private static zu2 b(Context context, String str) {
        zu2 zu2Var;
        synchronized (a) {
            if (b == null) {
                b = new zu2(context, "com.google.firebase.MESSAGING_EVENT");
            }
            zu2Var = b;
        }
        return zu2Var;
    }

    public static final /* synthetic */ Integer c(Task task) throws Exception {
        return -1;
    }

    public static final /* synthetic */ Integer d(Context context, Intent intent) throws Exception {
        return Integer.valueOf(ju2.b().h(context, intent));
    }

    public static final /* synthetic */ Task f(Context context, Intent intent, Task task) throws Exception {
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? a(context, intent).continueWith(ct2.s, dt2.a) : task;
    }

    @VisibleForTesting
    public static void h() {
        synchronized (a) {
            b = null;
        }
    }

    @x1
    @KeepForSdk
    public Task<Integer> g(@x1 Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra(rs2.d.c, Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return i(this.c, intent);
    }

    @x1
    @SuppressLint({"InlinedApi"})
    public Task<Integer> i(@x1 Context context, @x1 Intent intent) {
        boolean z = false;
        if (PlatformVersion.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
            z = true;
        }
        int flags = intent.getFlags() & 268435456;
        if (z && flags == 0) {
            return a(context, intent);
        }
        return Tasks.call(this.d, new Callable(context, intent) { // from class: com.p7700g.p99005.ys2
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // java.util.concurrent.Callable
            public Object call() {
                return et2.d(this.a, this.b);
            }
        }).continueWithTask(this.d, new Continuation(context, intent) { // from class: com.p7700g.p99005.zs2
            private final Context a;
            private final Intent b;

            {
                this.a = context;
                this.b = intent;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public Object then(Task task) {
                return et2.f(this.a, this.b, task);
            }
        });
    }
}
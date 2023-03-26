package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class nu2 implements Runnable {
    private final long s;
    private final PowerManager.WakeLock t;
    private final FirebaseMessaging u;
    @VisibleForTesting
    public ExecutorService v = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    @VisibleForTesting
    /* loaded from: classes3.dex */
    public static class a extends BroadcastReceiver {
        @Nullable
        private nu2 a;

        public a(nu2 nu2Var) {
            this.a = nu2Var;
        }

        public void a() {
            nu2.c();
            this.a.b().registerReceiver(this, new IntentFilter(b91.a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            nu2 nu2Var = this.a;
            if (nu2Var != null && nu2Var.d()) {
                nu2.c();
                this.a.u.g(this.a, 0L);
                this.a.b().unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    @VisibleForTesting
    @SuppressLint({"InvalidWakeLockTag"})
    public nu2(FirebaseMessaging firebaseMessaging, long j) {
        this.u = firebaseMessaging;
        this.s = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.t = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        return Log.isLoggable(rs2.a, 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable(rs2.a, 3));
    }

    public Context b() {
        return this.u.h();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    public boolean e() throws IOException {
        try {
            if (this.u.c() == null) {
                return false;
            }
            Log.isLoggable(rs2.a, 3);
            return true;
        } catch (IOException e) {
            if (wt2.g(e.getMessage())) {
                String.valueOf(e.getMessage()).length();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    @SuppressLint({"WakelockTimeout"})
    public void run() {
        if (ju2.b().e(b())) {
            this.t.acquire();
        }
        try {
            try {
                this.u.D(true);
                if (!this.u.p()) {
                    this.u.D(false);
                    if (!ju2.b().e(b())) {
                        return;
                    }
                } else if (ju2.b().d(b()) && !d()) {
                    new a(this).a();
                    if (!ju2.b().e(b())) {
                        return;
                    }
                } else {
                    if (e()) {
                        this.u.D(false);
                    } else {
                        this.u.H(this.s);
                    }
                    if (!ju2.b().e(b())) {
                        return;
                    }
                }
            } catch (IOException e) {
                String.valueOf(e.getMessage()).length();
                this.u.D(false);
                if (!ju2.b().e(b())) {
                    return;
                }
            }
            this.t.release();
        } catch (Throwable th) {
            if (ju2.b().e(b())) {
                this.t.release();
            }
            throw th;
        }
    }
}
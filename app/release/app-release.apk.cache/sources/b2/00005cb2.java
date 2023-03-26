package com.p7700g.p99005;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.qs2;
import com.p7700g.p99005.rs2;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class ss2 {
    private final Executor a;
    private final Context b;
    private final cu2 c;

    public ss2(Context context, cu2 cu2Var, Executor executor) {
        this.a = executor;
        this.b = context;
        this.c = cu2Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.b.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void c(qs2.a aVar) {
        Log.isLoggable(rs2.a, 3);
        ((NotificationManager) this.b.getSystemService(qm3.b.a)).notify(aVar.b, aVar.c, aVar.a.h());
    }

    @z1
    private yt2 d() {
        yt2 d = yt2.d(this.c.p(rs2.c.j));
        if (d != null) {
            d.f(this.a);
        }
        return d;
    }

    private void e(kg.g gVar, @z1 yt2 yt2Var) {
        if (yt2Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(yt2Var.e(), 5L, TimeUnit.SECONDS);
            gVar.c0(bitmap);
            gVar.z0(new kg.d().C(bitmap).B(null));
        } catch (InterruptedException unused) {
            yt2Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e) {
            String.valueOf(e.getCause()).length();
        } catch (TimeoutException unused2) {
            yt2Var.close();
        }
    }

    public boolean a() {
        if (this.c.a(rs2.c.f)) {
            return true;
        }
        if (b()) {
            return false;
        }
        yt2 d = d();
        qs2.a d2 = qs2.d(this.b, this.c);
        e(d2.a, d);
        c(d2);
        return true;
    }
}
package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.ee0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.uz;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundService extends uz implements ee0.b {
    private static final String t = tb0.f("SystemFgService");
    @z1
    private static SystemForegroundService u = null;
    private Handler v;
    private boolean w;
    public ee0 x;
    public NotificationManager y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ int s;
        public final /* synthetic */ Notification t;
        public final /* synthetic */ int u;

        public a(final int val$notificationId, final Notification val$notification, final int val$notificationType) {
            this.s = val$notificationId;
            this.t = val$notification;
            this.u = val$notificationType;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.s, this.t, this.u);
            } else {
                SystemForegroundService.this.startForeground(this.s, this.t);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ int s;
        public final /* synthetic */ Notification t;

        public b(final int val$notificationId, final Notification val$notification) {
            this.s = val$notificationId;
            this.t = val$notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.y.notify(this.s, this.t);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final /* synthetic */ int s;

        public c(final int val$notificationId) {
            this.s = val$notificationId;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.y.cancel(this.s);
        }
    }

    @z1
    public static SystemForegroundService f() {
        return u;
    }

    @u1
    private void g() {
        this.v = new Handler(Looper.getMainLooper());
        this.y = (NotificationManager) getApplicationContext().getSystemService(qm3.b.a);
        ee0 ee0Var = new ee0(getApplicationContext());
        this.x = ee0Var;
        ee0Var.o(this);
    }

    @Override // com.p7700g.p99005.ee0.b
    public void b(final int notificationId, final int notificationType, @x1 final Notification notification) {
        this.v.post(new a(notificationId, notification, notificationType));
    }

    @Override // com.p7700g.p99005.ee0.b
    public void d(final int notificationId, @x1 final Notification notification) {
        this.v.post(new b(notificationId, notification));
    }

    @Override // com.p7700g.p99005.ee0.b
    public void e(final int notificationId) {
        this.v.post(new c(notificationId));
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public void onCreate() {
        super.onCreate();
        u = this;
        g();
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.x.m();
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public int onStartCommand(@z1 Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.w) {
            tb0.c().d(t, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.x.m();
            g();
            this.w = false;
        }
        if (intent != null) {
            this.x.n(intent);
            return 3;
        }
        return 3;
    }

    @Override // com.p7700g.p99005.ee0.b
    @u1
    public void stop() {
        this.w = true;
        tb0.c().a(t, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        u = null;
        stopSelf();
    }
}
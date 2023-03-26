package com.anchorfree.ucr;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import com.p7700g.p99005.b91;
import com.p7700g.p99005.d91;
import com.p7700g.p99005.e31;
import com.p7700g.p99005.i61;
import com.p7700g.p99005.j81;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.t91;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x31;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z81;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class UCRService extends Service implements b91.a {
    private static final int t = 1;
    @x1
    private final ExecutorService v = Executors.newSingleThreadExecutor();
    @z1
    private z81 w;
    @z1
    private b x;
    @x1
    private static final kj1 s = kj1.b("UCRService");
    private static final long u = TimeUnit.SECONDS.toMillis(10);

    /* loaded from: classes2.dex */
    public class a extends ContentObserver {
        public a(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z, @x1 Uri uri) {
            super.onChange(z, uri);
            UCRService.s.c("registerContentObserver onChange", new Object[0]);
            UCRService.this.e();
        }
    }

    /* loaded from: classes2.dex */
    public class b extends Handler {
        public b(@x1 Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@x1 Message message) {
            super.handleMessage(message);
            if (message.what != 1 || UCRService.this.w == null) {
                return;
            }
            UCRService.this.w.a2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        s.c("queueUpload", new Object[0]);
        b bVar = this.x;
        if (bVar != null) {
            bVar.removeMessages(1);
            this.x.sendEmptyMessageDelayed(1, u);
        }
    }

    @Override // com.p7700g.p99005.b91.a
    public void a() {
        z81 z81Var = this.w;
        if (z81Var != null) {
            z81Var.Z1();
        }
    }

    @Override // android.app.Service
    @z1
    public IBinder onBind(@z1 Intent intent) {
        return this.w;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (e31.a(this)) {
            x31 x31Var = (x31) i61.a().d(x31.class);
            this.w = new z81(getApplicationContext(), x31Var, new t91(this, this.v), new d91(x31Var), j81.a(), this.v, Executors.newSingleThreadExecutor());
            s.c("onCreate", new Object[0]);
            HandlerThread handlerThread = new HandlerThread("UCR-Upload");
            handlerThread.start();
            this.x = new b(handlerThread.getLooper());
            getContentResolver().registerContentObserver(UCRContentProvider.b(this), true, new a(this.x));
            new b91(this, this).b(this);
            AlarmManager alarmManager = (AlarmManager) getSystemService(kg.v0);
            Intent intent = new Intent(getApplicationContext(), UCRService.class);
            intent.putExtra("extra_from_alarm", 1);
            PendingIntent service = PendingIntent.getService(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
            if (alarmManager != null) {
                long currentTimeMillis = System.currentTimeMillis();
                TimeUnit timeUnit = TimeUnit.HOURS;
                alarmManager.setInexactRepeating(1, timeUnit.toMillis(1L) + currentTimeMillis, timeUnit.toMillis(1L), service);
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@z1 Intent intent, int i, int i2) {
        e();
        return 1;
    }
}
package com.anchorfree.sdk;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class SdkNotificationService extends Service {
    @x1
    private static final kj1 s = kj1.b("SdkNotificationService");
    @z1
    public Messenger t;

    /* loaded from: classes.dex */
    public static class a extends Handler {
        @x1
        private final SdkNotificationService a;

        public a(@x1 SdkNotificationService sdkNotificationService) {
            this.a = sdkNotificationService;
        }

        @Override // android.os.Handler
        public void handleMessage(@x1 Message message) {
            synchronized (this) {
                Notification notification = (Notification) message.obj;
                SdkNotificationService.s.c("Update notification to: %s", notification);
                if (notification != null) {
                    this.a.startForeground(3333, notification);
                } else {
                    this.a.stopForeground(true);
                }
            }
        }
    }

    @Override // android.app.Service
    @z1
    public IBinder onBind(@x1 Intent intent) {
        s.c("onBind", new Object[0]);
        Messenger messenger = new Messenger(new a(this));
        this.t = messenger;
        return messenger.getBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        s.c("onCreate", new Object[0]);
    }

    @Override // android.app.Service
    public void onDestroy() {
        s.c("onDestroy", new Object[0]);
        super.onDestroy();
    }
}
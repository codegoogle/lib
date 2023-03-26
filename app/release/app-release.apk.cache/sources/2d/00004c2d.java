package com.p7700g.p99005;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.p7700g.p99005.rp0;

/* compiled from: ServiceNotification.java */
/* loaded from: classes2.dex */
public class kb1 {
    @x1
    private final Context a;

    public kb1(@x1 Context context) {
        this.a = context;
    }

    private void b(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = this.a.getResources().getString(rp0.k.D);
            String string2 = this.a.getResources().getString(rp0.k.C);
            NotificationChannel notificationChannel = new NotificationChannel(str, string, 3);
            notificationChannel.setDescription(string2);
            NotificationManager notificationManager = (NotificationManager) this.a.getSystemService(NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    @x1
    public Notification a(@x1 oe1 oe1Var) {
        Notification.Builder builder;
        b(oe1Var.u);
        if (Build.VERSION.SDK_INT >= 26) {
            builder = new Notification.Builder(this.a, oe1Var.u);
        } else {
            builder = new Notification.Builder(this.a);
        }
        builder.setContentTitle(oe1Var.v).setContentText(oe1Var.w).setSmallIcon(oe1Var.x);
        return builder.build();
    }
}
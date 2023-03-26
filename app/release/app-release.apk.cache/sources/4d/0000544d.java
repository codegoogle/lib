package com.p7700g.p99005;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.INotificationSideChannel;

/* compiled from: NotificationCompatSideChannelService.java */
/* loaded from: classes.dex */
public abstract class og extends Service {

    /* compiled from: NotificationCompatSideChannelService.java */
    /* loaded from: classes.dex */
    public class a extends INotificationSideChannel.Stub {
        public a() {
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void C1(String str, int i, String str2, Notification notification) throws RemoteException {
            og.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                og.this.d(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void L0(String str, int i, String str2) throws RemoteException {
            og.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                og.this.a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void Y(String str) {
            og.this.c(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                og.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int i, String str2);

    public abstract void b(String str);

    public void c(int i, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(i)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + i + " is not authorized for package " + str);
    }

    public abstract void d(String str, int i, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(pg.e)) {
        }
        return null;
    }
}
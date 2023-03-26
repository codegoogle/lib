package com.p7700g.p99005;

import android.app.Notification;

/* compiled from: ForegroundInfo.java */
/* loaded from: classes.dex */
public final class ob0 {
    private final int a;
    private final int b;
    private final Notification c;

    public ob0(int notificationId, @x1 Notification notification) {
        this(notificationId, notification, 0);
    }

    public int a() {
        return this.b;
    }

    @x1
    public Notification b() {
        return this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || ob0.class != o.getClass()) {
            return false;
        }
        ob0 ob0Var = (ob0) o;
        if (this.a == ob0Var.a && this.b == ob0Var.b) {
            return this.c.equals(ob0Var.c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public String toString() {
        StringBuilder K = wo1.K("ForegroundInfo{", "mNotificationId=");
        K.append(this.a);
        K.append(", mForegroundServiceType=");
        K.append(this.b);
        K.append(", mNotification=");
        K.append(this.c);
        K.append('}');
        return K.toString();
    }

    public ob0(int notificationId, @x1 Notification notification, int foregroundServiceType) {
        this.a = notificationId;
        this.c = notification;
        this.b = foregroundServiceType;
    }
}
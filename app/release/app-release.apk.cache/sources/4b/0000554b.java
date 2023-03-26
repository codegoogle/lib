package com.p7700g.p99005;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.p7700g.p99005.qm3;

/* compiled from: NotificationTarget.java */
/* loaded from: classes2.dex */
public class oz1 extends hz1<Bitmap> {
    private final int A;
    private final RemoteViews v;
    private final Context w;
    private final int x;
    private final String y;
    private final Notification z;

    public oz1(Context context, int i, RemoteViews remoteViews, Notification notification, int i2) {
        this(context, i, remoteViews, notification, i2, null);
    }

    private void d(@z1 Bitmap bitmap) {
        this.v.setImageViewBitmap(this.A, bitmap);
        e();
    }

    private void e() {
        ((NotificationManager) x02.d((NotificationManager) this.w.getSystemService(qm3.b.a))).notify(this.y, this.x, this.z);
    }

    @Override // com.p7700g.p99005.sz1
    /* renamed from: a */
    public void c(@x1 Bitmap bitmap, @z1 a02<? super Bitmap> a02Var) {
        d(bitmap);
    }

    @Override // com.p7700g.p99005.sz1
    public void p(@z1 Drawable drawable) {
        d(null);
    }

    public oz1(Context context, int i, RemoteViews remoteViews, Notification notification, int i2, String str) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, notification, i2, str);
    }

    public oz1(Context context, int i, int i2, int i3, RemoteViews remoteViews, Notification notification, int i4, String str) {
        super(i, i2);
        this.w = (Context) x02.e(context, "Context must not be null!");
        this.z = (Notification) x02.e(notification, "Notification object can not be null!");
        this.v = (RemoteViews) x02.e(remoteViews, "RemoteViews object can not be null!");
        this.A = i3;
        this.x = i4;
        this.y = str;
    }
}
package com.p7700g.p99005;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;

/* compiled from: AppWidgetTarget.java */
/* loaded from: classes2.dex */
public class dz1 extends hz1<Bitmap> {
    private final int[] v;
    private final ComponentName w;
    private final RemoteViews x;
    private final Context y;
    private final int z;

    public dz1(Context context, int i, int i2, int i3, RemoteViews remoteViews, int... iArr) {
        super(i, i2);
        if (iArr.length != 0) {
            this.y = (Context) x02.e(context, "Context can not be null!");
            this.x = (RemoteViews) x02.e(remoteViews, "RemoteViews object can not be null!");
            this.v = (int[]) x02.e(iArr, "WidgetIds can not be null!");
            this.z = i3;
            this.w = null;
            return;
        }
        throw new IllegalArgumentException("WidgetIds must have length > 0");
    }

    private void d(@z1 Bitmap bitmap) {
        this.x.setImageViewBitmap(this.z, bitmap);
        e();
    }

    private void e() {
        AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(this.y);
        ComponentName componentName = this.w;
        if (componentName != null) {
            appWidgetManager.updateAppWidget(componentName, this.x);
        } else {
            appWidgetManager.updateAppWidget(this.v, this.x);
        }
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

    public dz1(Context context, int i, RemoteViews remoteViews, int... iArr) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, iArr);
    }

    public dz1(Context context, int i, int i2, int i3, RemoteViews remoteViews, ComponentName componentName) {
        super(i, i2);
        this.y = (Context) x02.e(context, "Context can not be null!");
        this.x = (RemoteViews) x02.e(remoteViews, "RemoteViews object can not be null!");
        this.w = (ComponentName) x02.e(componentName, "ComponentName can not be null!");
        this.z = i3;
        this.v = null;
    }

    public dz1(Context context, int i, RemoteViews remoteViews, ComponentName componentName) {
        this(context, Integer.MIN_VALUE, Integer.MIN_VALUE, i, remoteViews, componentName);
    }
}
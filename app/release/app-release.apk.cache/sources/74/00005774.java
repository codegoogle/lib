package com.p7700g.p99005;

import android.app.PendingIntent;
import android.net.Uri;
import com.p7700g.p99005.i2;

/* compiled from: BrowserActionItem.java */
@Deprecated
/* loaded from: classes.dex */
public class q5 {
    private final String a;
    @z1
    private final PendingIntent b;
    @f1
    private int c;
    @z1
    private Uri d;
    @z1
    private Runnable e;

    public q5(@x1 String str, @x1 PendingIntent pendingIntent, @f1 int i) {
        this.a = str;
        this.b = pendingIntent;
        this.c = i;
    }

    @x1
    public PendingIntent a() {
        PendingIntent pendingIntent = this.b;
        if (pendingIntent != null) {
            return pendingIntent;
        }
        throw new IllegalStateException("Can't call getAction on BrowserActionItem with null action.");
    }

    public int b() {
        return this.c;
    }

    @i2({i2.a.LIBRARY})
    @z1
    public Uri c() {
        return this.d;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @z1
    public Runnable d() {
        return this.e;
    }

    @x1
    public String e() {
        return this.a;
    }

    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    public q5(@x1 String str, @x1 PendingIntent pendingIntent, @x1 Uri uri) {
        this.a = str;
        this.b = pendingIntent;
        this.d = uri;
    }

    public q5(@x1 String str, @x1 Runnable runnable) {
        this.a = str;
        this.b = null;
        this.e = runnable;
    }

    public q5(@x1 String str, @x1 PendingIntent pendingIntent) {
        this(str, pendingIntent, 0);
    }
}
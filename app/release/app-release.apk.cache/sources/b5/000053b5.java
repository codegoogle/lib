package com.p7700g.p99005;

import android.app.NotificationManager;
import android.os.Parcelable;
import com.p7700g.p99005.i2;

/* compiled from: NotificationApiHelperForM.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class o6 {
    private o6() {
    }

    @e2(23)
    @x1
    public static Parcelable[] a(NotificationManager notificationManager) {
        return notificationManager.getActiveNotifications();
    }
}
package com.p7700g.p99005;

import android.app.Service;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ServiceCompat.java */
/* loaded from: classes.dex */
public final class wg {
    public static final int a = 1;
    public static final int b = 1;
    public static final int c = 2;

    /* compiled from: ServiceCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(Service service, int i) {
            service.stopForeground(i);
        }
    }

    /* compiled from: ServiceCompat.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    private wg() {
    }

    public static void a(@x1 Service service, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            a.a(service, i);
        } else {
            service.stopForeground((i & 1) != 0);
        }
    }
}
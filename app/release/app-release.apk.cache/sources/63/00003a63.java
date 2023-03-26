package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.p7700g.p99005.c7;
import com.p7700g.p99005.f;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.qm3;
import java.util.Locale;

/* compiled from: TrustedWebActivityService.java */
/* loaded from: classes.dex */
public abstract class b7 extends Service {
    @SuppressLint({"ActionValue", "ServiceName"})
    public static final String s = "android.support.customtabs.trusted.TRUSTED_WEB_ACTIVITY_SERVICE";
    public static final String t = "android.support.customtabs.trusted.SMALL_ICON";
    public static final String u = "android.support.customtabs.trusted.SMALL_ICON_BITMAP";
    public static final String v = "androidx.browser.trusted.SUCCESS";
    public static final int w = -1;
    private NotificationManager x;
    public int y = -1;
    private final f.b z = new a();

    /* compiled from: TrustedWebActivityService.java */
    /* loaded from: classes.dex */
    public class a extends f.b {
        public a() {
        }

        private void Q1() {
            b7 b7Var = b7.this;
            if (b7Var.y == -1) {
                String[] packagesForUid = b7Var.getPackageManager().getPackagesForUid(Binder.getCallingUid());
                int i = 0;
                if (packagesForUid == null) {
                    packagesForUid = new String[0];
                }
                s6 b = b7.this.c().b();
                PackageManager packageManager = b7.this.getPackageManager();
                if (b != null) {
                    int length = packagesForUid.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        } else if (b.c(packagesForUid[i], packageManager)) {
                            b7.this.y = Binder.getCallingUid();
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            if (b7.this.y != Binder.getCallingUid()) {
                throw new SecurityException("Caller is not verified as Trusted Web Activity provider.");
            }
        }

        @Override // com.p7700g.p99005.f
        public int F0() {
            Q1();
            return b7.this.i();
        }

        @Override // com.p7700g.p99005.f
        public Bundle I0() {
            Q1();
            return b7.this.h();
        }

        @Override // com.p7700g.p99005.f
        public Bundle M0(Bundle bundle) {
            Q1();
            return new c7.f(b7.this.d(c7.d.a(bundle).a)).b();
        }

        @Override // com.p7700g.p99005.f
        public Bundle N() {
            Q1();
            return new c7.b(b7.this.g()).b();
        }

        @Override // com.p7700g.p99005.f
        public void a1(Bundle bundle) {
            Q1();
            c7.c a = c7.c.a(bundle);
            b7.this.e(a.a, a.b);
        }

        @Override // com.p7700g.p99005.f
        public Bundle c1(Bundle bundle) {
            Q1();
            c7.e a = c7.e.a(bundle);
            return new c7.f(b7.this.j(a.a, a.b, a.c, a.d)).b();
        }

        @Override // com.p7700g.p99005.f
        public Bundle k0(String str, Bundle bundle, IBinder iBinder) {
            Q1();
            return b7.this.f(str, bundle, w6.a(iBinder));
        }
    }

    private static String a(String str) {
        return str.toLowerCase(Locale.ROOT).replace(gl4.R, n04.E) + "_channel_id";
    }

    private void b() {
        if (this.x == null) {
            throw new IllegalStateException("TrustedWebActivityService has not been properly initialized. Did onCreate() call super.onCreate()?");
        }
    }

    @x1
    @r0
    public abstract u6 c();

    @r0
    public boolean d(@x1 String str) {
        b();
        if (pg.p(this).a()) {
            if (Build.VERSION.SDK_INT < 26) {
                return true;
            }
            return p6.b(this.x, a(str));
        }
        return false;
    }

    @r0
    public void e(@x1 String str, int i) {
        b();
        this.x.cancel(str, i);
    }

    @z1
    @r0
    public Bundle f(@x1 String str, @x1 Bundle bundle, @z1 w6 w6Var) {
        return null;
    }

    @i2({i2.a.LIBRARY})
    @x1
    @r0
    public Parcelable[] g() {
        b();
        if (Build.VERSION.SDK_INT >= 23) {
            return o6.a(this.x);
        }
        throw new IllegalStateException("onGetActiveNotifications cannot be called pre-M.");
    }

    @x1
    @r0
    public Bundle h() {
        int i = i();
        Bundle bundle = new Bundle();
        if (i == -1) {
            return bundle;
        }
        bundle.putParcelable(u, BitmapFactory.decodeResource(getResources(), i));
        return bundle;
    }

    @r0
    public int i() {
        try {
            Bundle bundle = getPackageManager().getServiceInfo(new ComponentName(this, getClass()), 128).metaData;
            if (bundle == null) {
                return -1;
            }
            return bundle.getInt(t, -1);
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    @r0
    public boolean j(@x1 String str, int i, @x1 Notification notification, @x1 String str2) {
        b();
        if (pg.p(this).a()) {
            if (Build.VERSION.SDK_INT >= 26) {
                String a2 = a(str2);
                notification = p6.a(this, this.x, notification, a2, str2);
                if (!p6.b(this.x, a2)) {
                    return false;
                }
            }
            this.x.notify(str, i, notification);
            return true;
        }
        return false;
    }

    @Override // android.app.Service
    @u1
    @z1
    public final IBinder onBind(@z1 Intent intent) {
        return this.z;
    }

    @Override // android.app.Service
    @t0
    @u1
    public void onCreate() {
        super.onCreate();
        this.x = (NotificationManager) getSystemService(qm3.b.a);
    }

    @Override // android.app.Service
    @u1
    public final boolean onUnbind(@z1 Intent intent) {
        this.y = -1;
        return super.onUnbind(intent);
    }
}
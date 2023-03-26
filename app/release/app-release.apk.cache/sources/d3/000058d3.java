package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.rs2;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class qs2 {
    @x1
    public static final String a = "com.google.firebase.messaging.default_notification_color";
    @x1
    public static final String b = "com.google.firebase.messaging.default_notification_icon";
    @x1
    public static final String c = "com.google.firebase.messaging.default_notification_channel_id";
    @x1
    public static final String d = "fcm_fallback_notification_channel";
    @x1
    public static final String e = "fcm_fallback_notification_channel_label";
    private static final AtomicInteger f = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    /* loaded from: classes3.dex */
    public static class a {
        @x1
        public final kg.g a;
        @x1
        public final String b;
        public final int c = 0;

        public a(kg.g gVar, String str, int i) {
            this.a = gVar;
            this.b = str;
        }
    }

    private qs2() {
    }

    @z1
    private static PendingIntent a(Context context, cu2 cu2Var, String str, PackageManager packageManager) {
        Intent f2 = f(str, cu2Var, packageManager);
        if (f2 == null) {
            return null;
        }
        f2.addFlags(67108864);
        f2.putExtras(cu2Var.A());
        if (q(cu2Var)) {
            f2.putExtra(rs2.c.E, cu2Var.z());
        }
        return PendingIntent.getActivity(context, g(), f2, l(1073741824));
    }

    @z1
    private static PendingIntent b(Context context, cu2 cu2Var) {
        if (q(cu2Var)) {
            return c(context, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(cu2Var.z()));
        }
        return null;
    }

    private static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), l(1073741824));
    }

    public static a d(Context context, cu2 cu2Var) {
        Bundle j = j(context.getPackageManager(), context.getPackageName());
        return e(context, context.getPackageName(), cu2Var, k(context, cu2Var.k(), j), context.getResources(), context.getPackageManager(), j);
    }

    @x1
    public static a e(@x1 Context context, @x1 String str, @x1 cu2 cu2Var, @x1 String str2, @x1 Resources resources, @x1 PackageManager packageManager, @x1 Bundle bundle) {
        kg.g gVar = new kg.g(context, str2);
        String n = cu2Var.n(resources, str, rs2.c.g);
        if (!TextUtils.isEmpty(n)) {
            gVar.P(n);
        }
        String n2 = cu2Var.n(resources, str, rs2.c.h);
        if (!TextUtils.isEmpty(n2)) {
            gVar.O(n2);
            gVar.z0(new kg.e().A(n2));
        }
        gVar.t0(m(packageManager, resources, str, cu2Var.p(rs2.c.i), bundle));
        Uri n3 = n(str, cu2Var, resources);
        if (n3 != null) {
            gVar.x0(n3);
        }
        gVar.N(a(context, cu2Var, str, packageManager));
        PendingIntent b2 = b(context, cu2Var);
        if (b2 != null) {
            gVar.U(b2);
        }
        Integer h = h(context, cu2Var.p(rs2.c.l), bundle);
        if (h != null) {
            gVar.J(h.intValue());
        }
        gVar.D(!cu2Var.a(rs2.c.o));
        gVar.e0(cu2Var.a(rs2.c.n));
        String p = cu2Var.p(rs2.c.m);
        if (p != null) {
            gVar.B0(p);
        }
        Integer m = cu2Var.m();
        if (m != null) {
            gVar.k0(m.intValue());
        }
        Integer r = cu2Var.r();
        if (r != null) {
            gVar.G0(r.intValue());
        }
        Integer l = cu2Var.l();
        if (l != null) {
            gVar.h0(l.intValue());
        }
        Long j = cu2Var.j(rs2.c.x);
        if (j != null) {
            gVar.r0(true);
            gVar.H0(j.longValue());
        }
        long[] q = cu2Var.q();
        if (q != null) {
            gVar.F0(q);
        }
        int[] e2 = cu2Var.e();
        if (e2 != null) {
            gVar.d0(e2[0], e2[1], e2[2]);
        }
        gVar.T(i(cu2Var));
        return new a(gVar, o(cu2Var), 0);
    }

    private static Intent f(String str, cu2 cu2Var, PackageManager packageManager) {
        String p = cu2Var.p(rs2.c.A);
        if (!TextUtils.isEmpty(p)) {
            Intent intent = new Intent(p);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri f2 = cu2Var.f();
        if (f2 != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(f2);
            return intent2;
        }
        return packageManager.getLaunchIntentForPackage(str);
    }

    private static int g() {
        return f.incrementAndGet();
    }

    private static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                String.valueOf(str).length();
            }
        }
        int i = bundle.getInt(a, 0);
        if (i != 0) {
            try {
                return Integer.valueOf(gh.f(context, i));
            } catch (Resources.NotFoundException unused2) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int i(cu2 cu2Var) {
        boolean a2 = cu2Var.a(rs2.c.q);
        ?? r0 = a2;
        if (cu2Var.a(rs2.c.r)) {
            r0 = (a2 ? 1 : 0) | true;
        }
        return cu2Var.a(rs2.c.s) ? r0 | 4 : r0;
    }

    private static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
            String.valueOf(e2).length();
        }
        return Bundle.EMPTY;
    }

    @x1
    @r2
    @TargetApi(26)
    public static String k(@x1 Context context, @x1 String str, @x1 Bundle bundle) {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    String.valueOf(str).length();
                }
                String string = bundle.getString(c);
                if (TextUtils.isEmpty(string) || notificationManager.getNotificationChannel(string) == null) {
                    if (notificationManager.getNotificationChannel(d) == null) {
                        int identifier = context.getResources().getIdentifier(e, "string", context.getPackageName());
                        notificationManager.createNotificationChannel(new NotificationChannel(d, identifier == 0 ? "Misc" : context.getString(identifier), 3));
                    }
                    return d;
                }
                return string;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private static int l(int i) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    private static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, com.anythink.expressad.foundation.h.h.c, str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            String.valueOf(str2).length();
        }
        int i = bundle.getInt(b, 0);
        if (i == 0 || !p(resources, i)) {
            try {
                i = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e2) {
                String.valueOf(e2).length();
            }
        }
        if (i == 0 || !p(resources, i)) {
            return 17301651;
        }
        return i;
    }

    private static Uri n(String str, cu2 cu2Var, Resources resources) {
        String o = cu2Var.o();
        if (TextUtils.isEmpty(o)) {
            return null;
        }
        if (!"default".equals(o) && resources.getIdentifier(o, "raw", str) != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(o).length());
            sb.append("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(o);
            return Uri.parse(sb.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static String o(cu2 cu2Var) {
        String p = cu2Var.p(rs2.c.k);
        if (TextUtils.isEmpty(p)) {
            long uptimeMillis = SystemClock.uptimeMillis();
            StringBuilder sb = new StringBuilder(37);
            sb.append("FCM-Notification:");
            sb.append(uptimeMillis);
            return sb.toString();
        }
        return p;
    }

    @TargetApi(26)
    private static boolean p(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            return !(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable);
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static boolean q(@x1 cu2 cu2Var) {
        return cu2Var.a(rs2.a.b);
    }
}
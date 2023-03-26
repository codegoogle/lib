package com.p7700g.p99005;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import com.onesignal.shortcutbadger.impl.ApexHomeBadger;
import com.onesignal.shortcutbadger.impl.AsusHomeBadger;
import com.onesignal.shortcutbadger.impl.DefaultBadger;
import com.onesignal.shortcutbadger.impl.EverythingMeHomeBadger;
import com.onesignal.shortcutbadger.impl.HuaweiHomeBadger;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.onesignal.shortcutbadger.impl.NovaHomeBadger;
import com.onesignal.shortcutbadger.impl.OPPOHomeBader;
import com.onesignal.shortcutbadger.impl.SamsungHomeBadger;
import com.onesignal.shortcutbadger.impl.SonyHomeBadger;
import com.onesignal.shortcutbadger.impl.VivoHomeBadger;
import com.onesignal.shortcutbadger.impl.ZukHomeBadger;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ShortcutBadger.java */
/* loaded from: classes3.dex */
public final class hp3 {
    private static final String a = "ShortcutBadger";
    private static final int b = 3;
    private static final List<Class<? extends fp3>> c;
    private static volatile Boolean d;
    private static final Object e;
    private static fp3 f;
    private static ComponentName g;

    static {
        LinkedList linkedList = new LinkedList();
        c = linkedList;
        e = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(AsusHomeBadger.class);
        linkedList.add(HuaweiHomeBadger.class);
        linkedList.add(OPPOHomeBader.class);
        linkedList.add(SamsungHomeBadger.class);
        linkedList.add(ZukHomeBadger.class);
        linkedList.add(VivoHomeBadger.class);
        linkedList.add(EverythingMeHomeBadger.class);
    }

    private hp3() {
    }

    public static boolean a(Context context, int i) {
        try {
            b(context, i);
            return true;
        } catch (gp3 unused) {
            Log.isLoggable(a, 3);
            return false;
        }
    }

    public static void b(Context context, int i) throws gp3 {
        if (f == null && !d(context)) {
            throw new gp3("No default launcher available");
        }
        try {
            f.b(context, g, i);
        } catch (Exception e2) {
            throw new gp3("Unable to execute badge", e2);
        }
    }

    public static void c(Context context, Notification notification, int i) {
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            try {
                Object obj = notification.getClass().getDeclaredField("extraNotification").get(notification);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
            } catch (Exception unused) {
                Log.isLoggable(a, 3);
            }
        }
    }

    private static boolean d(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            context.getPackageName();
            return false;
        }
        g = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.packageName;
        Iterator<Class<? extends fp3>> it = c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            fp3 fp3Var = null;
            try {
                fp3Var = it.next().newInstance();
            } catch (Exception unused) {
            }
            if (fp3Var != null && fp3Var.a().contains(str)) {
                f = fp3Var;
                break;
            }
        }
        if (f == null) {
            String str2 = Build.MANUFACTURER;
            if (str2.equalsIgnoreCase("ZUK")) {
                f = new ZukHomeBadger();
                return true;
            } else if (str2.equalsIgnoreCase("OPPO")) {
                f = new OPPOHomeBader();
                return true;
            } else if (str2.equalsIgnoreCase("VIVO")) {
                f = new VivoHomeBadger();
                return true;
            } else {
                f = new DefaultBadger();
                return true;
            }
        }
        return true;
    }

    public static boolean e(Context context) {
        if (d == null) {
            synchronized (e) {
                if (d == null) {
                    for (int i = 0; i < 3; i++) {
                        try {
                            String.format("%d/%d.", Integer.valueOf(i + 1), 3);
                        } catch (Exception e2) {
                            e2.getMessage();
                        }
                        if (d(context)) {
                            f.b(context, g, 0);
                            d = Boolean.TRUE;
                            break;
                        }
                        continue;
                    }
                    if (d == null) {
                        d = Boolean.FALSE;
                    }
                }
            }
        }
        return d.booleanValue();
    }

    public static boolean f(Context context) {
        return a(context, 0);
    }

    public static void g(Context context) throws gp3 {
        b(context, 0);
    }
}
package com.onesignal.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.p7700g.p99005.fp3;
import com.p7700g.p99005.gp3;
import com.p7700g.p99005.ip3;
import com.p7700g.p99005.qm3;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public class XiaomiHomeBadger implements fp3 {
    public static final String a = "android.intent.action.APPLICATION_MESSAGE_UPDATE";
    public static final String b = "android.intent.extra.update_application_component_name";
    public static final String c = "android.intent.extra.update_application_message_text";
    private ResolveInfo d;

    @TargetApi(16)
    private void c(Context context, int i) throws gp3 {
        if (this.d == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.d = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.d != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(qm3.b.a);
            Notification build = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.d.getIconResource()).build();
            try {
                Object obj = build.getClass().getDeclaredField("extraNotification").get(build);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
                notificationManager.notify(0, build);
            } catch (Exception e) {
                throw new gp3("not able to set badge", e);
            }
        }
    }

    @Override // com.p7700g.p99005.fp3
    public List<String> a() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }

    @Override // com.p7700g.p99005.fp3
    public void b(Context context, ComponentName componentName, int i) throws gp3 {
        Integer valueOf;
        try {
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                valueOf = "";
            } else {
                try {
                    valueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                }
            }
            declaredField.set(newInstance, String.valueOf(valueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent(a);
            intent.putExtra(b, componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra(c, String.valueOf(i != 0 ? Integer.valueOf(i) : ""));
            if (ip3.a(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            c(context, i);
        }
    }
}
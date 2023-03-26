package com.p7700g.p99005;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationChannelManager.java */
/* loaded from: classes3.dex */
public class jj3 {
    private static final String a = "fcm_fallback_notification_channel";
    private static final String b = "restored_OS_notifications";
    private static final String c = "OS_";
    private static final Pattern d = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Can't wrap try/catch for region: R(27:1|(1:3)(1:64)|4|(1:6)|7|(2:9|(21:11|12|(1:14)|15|(4:17|(1:19)|20|21)|25|(1:27)(1:62)|28|(1:32)|33|(1:35)(1:61)|36|(2:38|(1:40)(2:41|(1:45)))|46|(1:48)(1:60)|49|(1:51)|52|53|54|55))|63|12|(0)|15|(0)|25|(0)(0)|28|(2:30|32)|33|(0)(0)|36|(0)|46|(0)(0)|49|(0)|52|53|54|55) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0154, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0155, code lost:
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0136  */
    @e2(api = 26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(Context context, NotificationManager notificationManager, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        NotificationChannel notificationChannel;
        long[] T;
        Object opt = jSONObject.opt("chnl");
        if (opt instanceof String) {
            jSONObject2 = new JSONObject((String) opt);
        } else {
            jSONObject2 = (JSONObject) opt;
        }
        String optString = jSONObject2.optString("id", "fcm_fallback_notification_channel");
        String str = optString.equals(ig.a) ? "fcm_fallback_notification_channel" : optString;
        if (jSONObject2.has("langs")) {
            JSONObject jSONObject4 = jSONObject2.getJSONObject("langs");
            String b2 = go3.a().b();
            if (jSONObject4.has(b2)) {
                jSONObject3 = jSONObject4.optJSONObject(b2);
                notificationChannel = new NotificationChannel(str, jSONObject3.optString("nm", "Miscellaneous"), e(jSONObject.optInt("pri", 6)));
                notificationChannel.setDescription(jSONObject3.optString("dscr", null));
                if (jSONObject2.has("grp_id")) {
                    String optString2 = jSONObject2.optString("grp_id");
                    notificationManager.createNotificationChannelGroup(new NotificationChannelGroup(optString2, jSONObject3.optString("grp_nm")));
                    notificationChannel.setGroup(optString2);
                }
                if (jSONObject.has("ledc")) {
                    String optString3 = jSONObject.optString("ledc");
                    if (!d.matcher(optString3).matches()) {
                        jm3.a(jm3.u0.WARN, "OneSignal LED Color Settings: ARGB Hex value incorrect format (E.g: FF9900FF)");
                        optString3 = "FFFFFFFF";
                    }
                    try {
                        notificationChannel.setLightColor(new BigInteger(optString3, 16).intValue());
                    } catch (Throwable th) {
                        jm3.b(jm3.u0.ERROR, "Couldn't convert ARGB Hex value to BigInteger:", th);
                    }
                }
                notificationChannel.enableLights(jSONObject.optInt("led", 1) != 1);
                if (jSONObject.has("vib_pt") && (T = OSUtils.T(jSONObject)) != null) {
                    notificationChannel.setVibrationPattern(T);
                }
                notificationChannel.enableVibration(jSONObject.optInt("vib", 1) != 1);
                if (jSONObject.has("sound")) {
                    String optString4 = jSONObject.optString("sound", null);
                    Uri o = OSUtils.o(context, optString4);
                    if (o != null) {
                        notificationChannel.setSound(o, null);
                    } else if (pg1.d.equals(optString4) || "nil".equals(optString4)) {
                        notificationChannel.setSound(null, null);
                    }
                }
                notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
                notificationChannel.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
                notificationChannel.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
                jm3.u0 u0Var = jm3.u0.VERBOSE;
                StringBuilder G = wo1.G("Creating notification channel with channel:\n");
                G.append(notificationChannel.toString());
                jm3.P1(u0Var, G.toString());
                notificationManager.createNotificationChannel(notificationChannel);
                return str;
            }
        }
        jSONObject3 = jSONObject2;
        notificationChannel = new NotificationChannel(str, jSONObject3.optString("nm", "Miscellaneous"), e(jSONObject.optInt("pri", 6)));
        notificationChannel.setDescription(jSONObject3.optString("dscr", null));
        if (jSONObject2.has("grp_id")) {
        }
        if (jSONObject.has("ledc")) {
        }
        notificationChannel.enableLights(jSONObject.optInt("led", 1) != 1);
        if (jSONObject.has("vib_pt")) {
            notificationChannel.setVibrationPattern(T);
        }
        notificationChannel.enableVibration(jSONObject.optInt("vib", 1) != 1);
        if (jSONObject.has("sound")) {
        }
        notificationChannel.setLockscreenVisibility(jSONObject.optInt("vis", 0));
        notificationChannel.setShowBadge(jSONObject.optInt("bdg", 1) != 1);
        notificationChannel.setBypassDnd(jSONObject.optInt("bdnd", 0) == 1);
        jm3.u0 u0Var2 = jm3.u0.VERBOSE;
        StringBuilder G2 = wo1.G("Creating notification channel with channel:\n");
        G2.append(notificationChannel.toString());
        jm3.P1(u0Var2, G2.toString());
        notificationManager.createNotificationChannel(notificationChannel);
        return str;
    }

    @e2(api = 26)
    private static String b(NotificationManager notificationManager) {
        NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannel);
        return "fcm_fallback_notification_channel";
    }

    public static String c(al3 al3Var) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context e = al3Var.e();
        JSONObject f = al3Var.f();
        NotificationManager i = um3.i(e);
        if (al3Var.r()) {
            return d(i);
        }
        if (f.has("oth_chnl")) {
            String optString = f.optString("oth_chnl");
            if (i.getNotificationChannel(optString) != null) {
                return optString;
            }
        }
        if (!f.has("chnl")) {
            return b(i);
        }
        try {
            return a(e, i, f);
        } catch (JSONException e2) {
            jm3.b(jm3.u0.ERROR, "Could not create notification channel due to JSON payload error!", e2);
            return "fcm_fallback_notification_channel";
        }
    }

    @e2(api = 26)
    private static String d(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(new NotificationChannel(b, "Restored", 2));
        return b;
    }

    private static int e(int i) {
        if (i > 9) {
            return 5;
        }
        if (i > 7) {
            return 4;
        }
        if (i > 5) {
            return 3;
        }
        if (i > 3) {
            return 2;
        }
        return i > 1 ? 1 : 0;
    }

    public static void f(@x1 Context context, @z1 JSONArray jSONArray) {
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager i = um3.i(context);
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            try {
                hashSet.add(a(context, i, jSONArray.getJSONObject(i2)));
            } catch (JSONException e) {
                jm3.b(jm3.u0.ERROR, "Could not create notification channel due to JSON payload error!", e);
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        List<NotificationChannel> arrayList = new ArrayList<>();
        try {
            arrayList = i.getNotificationChannels();
        } catch (NullPointerException e2) {
            jm3.u0 u0Var = jm3.u0.ERROR;
            StringBuilder G = wo1.G("Error when trying to delete notification channel: ");
            G.append(e2.getMessage());
            jm3.P1(u0Var, G.toString());
        }
        for (NotificationChannel notificationChannel : arrayList) {
            String id = notificationChannel.getId();
            if (id.startsWith(c) && !hashSet.contains(id)) {
                i.deleteNotificationChannel(id);
            }
        }
    }
}
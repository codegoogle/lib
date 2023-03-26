package com.p7700g.p99005;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.widget.RemoteViews;
import com.onesignal.NotificationDismissReceiver;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.OSUtils;
import com.p7700g.p99005.am3;
import com.p7700g.p99005.gn3;
import com.p7700g.p99005.ii3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.un3;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: GenerateNotification.java */
/* loaded from: classes3.dex */
public class ui3 {
    public static final String a = "OS_SHOW_NOTIFICATION_THREAD";
    public static final String b = "androidNotificationId";
    public static final String c = "actionId";
    public static final String d = "onesignalData";
    private static Class<?> e = NotificationOpenedReceiver.class;
    private static Class<?> f = NotificationDismissReceiver.class;
    private static Resources g = null;
    private static Context h = null;
    private static String i = null;
    private static Integer j = null;

    /* compiled from: GenerateNotification.java */
    /* loaded from: classes3.dex */
    public static class b {
        public kg.g a;
        public boolean b;

        private b() {
        }
    }

    private static PendingIntent A(int i2, Intent intent) {
        return PendingIntent.getBroadcast(h, i2, intent, 201326592);
    }

    private static int B(String str) {
        if (str == null) {
            return 0;
        }
        String trim = str.trim();
        if (OSUtils.L(trim)) {
            int x = x(trim);
            if (x != 0) {
                return x;
            }
            try {
                return R.drawable.class.getField(str).getInt(null);
            } catch (Throwable unused) {
                return 0;
            }
        }
        return 0;
    }

    private static int C(JSONObject jSONObject) {
        int B = B(jSONObject.optString("sicon", null));
        return B != 0 ? B : w();
    }

    private static CharSequence D(JSONObject jSONObject) {
        String optString = jSONObject.optString("title", null);
        return optString != null ? optString : h.getPackageManager().getApplicationLabel(h.getApplicationInfo());
    }

    private static void E() {
        if (Build.VERSION.SDK_INT >= 24) {
            j = 2;
        } else {
            j = 1;
        }
    }

    public static void F() {
        if (OSUtils.I()) {
            throw new am3.a("Process for showing a notification should never been done on Main Thread!");
        }
    }

    private static boolean G(JSONObject jSONObject) {
        String optString = jSONObject.optString("sound", null);
        return (pg1.d.equals(optString) || "nil".equals(optString)) ? false : true;
    }

    private static void H(kg.g gVar) {
        gVar.j0(true).T(0).x0(null).F0(null).B0(null);
    }

    private static Bitmap I(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) g.getDimension(17104902);
            int dimension2 = (int) g.getDimension(17104901);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width > dimension2 || height > dimension) {
                if (height > width) {
                    dimension2 = (int) (dimension * (width / height));
                } else if (width > height) {
                    dimension = (int) (dimension2 * (height / width));
                }
                return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
            }
            return bitmap;
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    private static Integer J(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has(str)) {
                    return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void K(JSONObject jSONObject, kg.g gVar) {
        int g2 = g(jSONObject.optInt("pri", 6));
        gVar.k0(g2);
        int i2 = 0;
        if (g2 < 0) {
            return;
        }
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                gVar.d0(new BigInteger(jSONObject.optString("ledc"), 16).intValue(), 2000, un3.f.v);
            } catch (Throwable unused) {
            }
            if (jSONObject.optInt("vib", 1) == 1) {
                if (jSONObject.has("vib_pt")) {
                    long[] T = OSUtils.T(jSONObject);
                    if (T != null) {
                        gVar.F0(T);
                    }
                } else {
                    i2 |= 2;
                }
            }
            if (G(jSONObject)) {
                Uri o = OSUtils.o(h, jSONObject.optString("sound", null));
                if (o != null) {
                    gVar.x0(o);
                } else {
                    i2 |= 1;
                }
            }
            gVar.T(i2);
        }
        i2 = 4;
        if (jSONObject.optInt("vib", 1) == 1) {
        }
        if (G(jSONObject)) {
        }
        gVar.T(i2);
    }

    private static void L(Context context) {
        h = context;
        i = context.getPackageName();
        g = h.getResources();
    }

    private static void M(RemoteViews remoteViews, JSONObject jSONObject, int i2, String str, String str2) {
        Integer J = J(jSONObject, str);
        if (J != null) {
            remoteViews.setTextColor(i2, J.intValue());
            return;
        }
        int identifier = g.getIdentifier(str2, "color", i);
        if (identifier != 0) {
            remoteViews.setTextColor(i2, ii3.c.b(h, identifier));
        }
    }

    private static boolean N(al3 al3Var) {
        Notification j2;
        int intValue = al3Var.b().intValue();
        JSONObject f2 = al3Var.f();
        String optString = f2.optString("grp", null);
        cj3 cj3Var = new cj3(h);
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = um3.c(h);
            if (optString == null && arrayList.size() >= 3) {
                optString = um3.g();
                um3.b(h, arrayList);
            }
        }
        b r = r(al3Var);
        kg.g gVar = r.a;
        d(f2, cj3Var, gVar, intValue, null);
        try {
            b(f2, gVar);
        } catch (Throwable th) {
            jm3.b(jm3.u0.ERROR, "Could not set background notification image!", th);
        }
        f(al3Var, gVar);
        if (al3Var.r()) {
            H(gVar);
        }
        kj3.a(h, optString != null ? 2 : 1);
        if (optString != null) {
            i(gVar, cj3Var, f2, optString, intValue);
            j2 = l(al3Var, gVar);
            if (Build.VERSION.SDK_INT >= 24 && optString.equals(um3.g())) {
                k(al3Var, cj3Var, arrayList.size() + 1);
            } else {
                n(al3Var, r);
            }
        } else {
            j2 = j(gVar, cj3Var, f2, intValue);
        }
        e(r, j2);
        pg.p(h).C(intValue, j2);
        if (Build.VERSION.SDK_INT >= 26) {
            return um3.a(h, j2.getChannelId());
        }
        return true;
    }

    public static void O(al3 al3Var) {
        L(al3Var.e());
        n(al3Var, null);
    }

    private static void a(Context context, JSONObject jSONObject, List<String> list, List<String> list2) {
        try {
            c(jSONObject, list, list2);
        } catch (Throwable th) {
            jm3.b(jm3.u0.ERROR, "Failed to parse JSON for custom buttons for alert dialog.", th);
        }
        if (list.size() == 0 || list.size() < 3) {
            list.add(OSUtils.l(context, "onesignal_in_app_alert_ok_button_text", "Ok"));
            list2.add(ij3.h);
        }
    }

    private static void b(JSONObject jSONObject, kg.g gVar) throws Throwable {
        Bitmap bitmap;
        JSONObject jSONObject2;
        String string;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            jm3.a(jm3.u0.VERBOSE, "Cannot use background images in notifications for device on version: " + i2);
            return;
        }
        String optString = jSONObject.optString("bg_img", null);
        if (optString != null) {
            jSONObject2 = new JSONObject(optString);
            bitmap = s(jSONObject2.optString("img", null));
        } else {
            bitmap = null;
            jSONObject2 = null;
        }
        if (bitmap == null) {
            bitmap = t("onesignal_bgimage_default_image");
        }
        if (bitmap != null) {
            RemoteViews remoteViews = new RemoteViews(h.getPackageName(), gn3.k.U);
            int i3 = gn3.h.l1;
            remoteViews.setTextViewText(i3, D(jSONObject));
            int i4 = gn3.h.k1;
            remoteViews.setTextViewText(i4, jSONObject.optString("alert"));
            M(remoteViews, jSONObject2, i3, "tc", "onesignal_bgimage_notif_title_color");
            M(remoteViews, jSONObject2, i4, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 != null && jSONObject2.has("img_align")) {
                string = jSONObject2.getString("img_align");
            } else {
                int identifier = g.getIdentifier("onesignal_bgimage_notif_image_align", "string", i);
                string = identifier != 0 ? g.getString(identifier) : null;
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(gn3.h.i1, -5000, 0, 0, 0);
                int i5 = gn3.h.j1;
                remoteViews.setImageViewBitmap(i5, bitmap);
                remoteViews.setViewVisibility(i5, 0);
                remoteViews.setViewVisibility(gn3.h.h1, 2);
            } else {
                remoteViews.setImageViewBitmap(gn3.h.h1, bitmap);
            }
            gVar.L(remoteViews);
            gVar.z0(null);
        }
    }

    private static void c(JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
        if (jSONObject2.has("a")) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
            if (jSONObject3.has("actionButtons")) {
                JSONArray optJSONArray = jSONObject3.optJSONArray("actionButtons");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject jSONObject4 = optJSONArray.getJSONObject(i2);
                    list.add(jSONObject4.optString("text"));
                    list2.add(jSONObject4.optString("id"));
                }
            }
        }
    }

    private static void d(JSONObject jSONObject, cj3 cj3Var, kg.g gVar, int i2, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent c2 = cj3Var.c(i2);
                        c2.setAction("" + i3);
                        c2.putExtra("action_button", true);
                        jSONObject4.put(c, optJSONObject.optString("id"));
                        c2.putExtra(d, jSONObject4.toString());
                        if (str != null) {
                            c2.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            c2.putExtra("grp", jSONObject.optString("grp"));
                        }
                        gVar.a(optJSONObject.has("icon") ? B(optJSONObject.optString("icon")) : 0, optJSONObject.optString("text"), cj3Var.b(i2, c2));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static void e(b bVar, Notification notification) {
        if (bVar.b) {
            try {
                Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = newInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(newInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, newInstance);
            } catch (Throwable unused) {
            }
        }
    }

    private static void f(al3 al3Var, kg.g gVar) {
        if (al3Var.p()) {
            try {
                Field declaredField = kg.g.class.getDeclaredField(bx.C4);
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(gVar);
                al3Var.w(Integer.valueOf(notification.flags));
                al3Var.x(notification.sound);
                gVar.o(al3Var.g().s());
                Notification notification2 = (Notification) declaredField.get(gVar);
                Field declaredField2 = kg.g.class.getDeclaredField(com.anythink.basead.d.g.i);
                declaredField2.setAccessible(true);
                Field declaredField3 = kg.g.class.getDeclaredField("f");
                declaredField3.setAccessible(true);
                al3Var.y((CharSequence) declaredField2.get(gVar));
                al3Var.B((CharSequence) declaredField3.get(gVar));
                if (al3Var.r()) {
                    return;
                }
                al3Var.z(Integer.valueOf(notification2.flags));
                al3Var.A(notification2.sound);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private static int g(int i2) {
        if (i2 > 9) {
            return 2;
        }
        if (i2 > 7) {
            return 1;
        }
        if (i2 > 4) {
            return 0;
        }
        return i2 > 2 ? -1 : -2;
    }

    private static Intent h(int i2, cj3 cj3Var, JSONObject jSONObject, String str) {
        return cj3Var.c(i2).putExtra(d, jSONObject.toString()).putExtra("summary", str);
    }

    private static void i(kg.g gVar, cj3 cj3Var, JSONObject jSONObject, String str, int i2) {
        SecureRandom secureRandom = new SecureRandom();
        gVar.N(cj3Var.b(secureRandom.nextInt(), cj3Var.c(i2).putExtra(d, jSONObject.toString()).putExtra("grp", str)));
        gVar.U(A(secureRandom.nextInt(), z(i2).putExtra("grp", str)));
        gVar.Z(str);
        try {
            gVar.a0(j.intValue());
        } catch (Throwable unused) {
        }
    }

    private static Notification j(kg.g gVar, cj3 cj3Var, JSONObject jSONObject, int i2) {
        SecureRandom secureRandom = new SecureRandom();
        gVar.N(cj3Var.b(secureRandom.nextInt(), cj3Var.c(i2).putExtra(d, jSONObject.toString())));
        gVar.U(A(secureRandom.nextInt(), z(i2)));
        return gVar.h();
    }

    @e2(api = 23)
    private static void k(al3 al3Var, cj3 cj3Var, int i2) {
        JSONObject f2 = al3Var.f();
        SecureRandom secureRandom = new SecureRandom();
        String g2 = um3.g();
        String str = i2 + " new messages";
        int f3 = um3.f();
        m(rm3.k(h), g2, f3);
        PendingIntent b2 = cj3Var.b(secureRandom.nextInt(), h(f3, cj3Var, f2, g2));
        PendingIntent A = A(secureRandom.nextInt(), z(0).putExtra("summary", g2));
        kg.g gVar = r(al3Var).a;
        if (al3Var.l() != null) {
            gVar.x0(al3Var.l());
        }
        if (al3Var.k() != null) {
            gVar.T(al3Var.k().intValue());
        }
        gVar.N(b2).U(A).P(h.getPackageManager().getApplicationLabel(h.getApplicationInfo())).O(str).h0(i2).t0(w()).c0(v()).j0(true).D(false).Z(g2).b0(true);
        try {
            gVar.a0(j.intValue());
        } catch (Throwable unused) {
        }
        kg.l lVar = new kg.l();
        lVar.B(str);
        gVar.z0(lVar);
        pg.p(h).C(f3, gVar.h());
    }

    private static Notification l(al3 al3Var, kg.g gVar) {
        boolean z = Build.VERSION.SDK_INT < 24 && !al3Var.r();
        if (z && al3Var.l() != null && !al3Var.l().equals(al3Var.i())) {
            gVar.x0(null);
        }
        Notification h2 = gVar.h();
        if (z) {
            gVar.x0(al3Var.l());
        }
        return h2;
    }

    private static void m(rm3 rm3Var, String str, int i2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(qm3.b.c, Integer.valueOf(i2));
        contentValues.put(qm3.b.d, str);
        contentValues.put(qm3.b.f, (Integer) 1);
        rm3Var.e(qm3.b.a, null, contentValues);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:1|2|3|4|5|6|(1:8)|9|10|11|(3:13|(5:14|(1:16)(6:90|(1:92)(1:99)|93|(1:95)|96|(3:98|18|(1:21)(1:20)))|17|18|(0)(0))|(9:24|25|26|(1:28)|(1:30)|31|(4:79|80|81|82)(14:36|(1:38)(1:75)|39|(1:41)(4:69|(1:71)|72|(1:74))|42|43|44|(1:46)|47|(6:49|(1:51)|(1:53)|54|(1:56)|57)|58|(2:61|59)|62|63)|64|65))(1:100)|89|26|(0)|(0)|31|(0)|79|80|81|82|64|65|(2:(1:88)|(0))) */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[EDGE_INSN: B:113:0x0110->B:29:0x0110 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011f A[LOOP:0: B:13:0x008c->B:36:0x011f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void n(al3 al3Var, b bVar) {
        ArrayList<SpannableString> arrayList;
        Integer num;
        JSONObject jSONObject;
        PendingIntent b2;
        Notification h2;
        String str;
        String str2;
        String string;
        String str3 = qm3.b.j;
        String str4 = "title";
        String str5 = qm3.b.f;
        boolean r = al3Var.r();
        JSONObject f2 = al3Var.f();
        cj3 cj3Var = new cj3(h);
        Cursor cursor = null;
        String optString = f2.optString("grp", null);
        SecureRandom secureRandom = new SecureRandom();
        PendingIntent A = A(secureRandom.nextInt(), z(0).putExtra("summary", optString));
        rm3 k = rm3.k(h);
        try {
            try {
                Cursor d2 = k.d(qm3.b.a, new String[]{qm3.b.c, qm3.b.m, qm3.b.f, "title", qm3.b.j}, r ? "group_id = ? AND dismissed = 0 AND opened = 0" : "group_id = ? AND dismissed = 0 AND opened = 0 AND android_notification_id <> " + al3Var.b(), new String[]{optString}, null, null, "_id DESC");
                if (d2.moveToFirst()) {
                    arrayList = new ArrayList();
                    String str6 = null;
                    num = null;
                    while (true) {
                        String str7 = str5;
                        if (d2.getInt(d2.getColumnIndex(str5)) == 1) {
                            str = str3;
                            num = Integer.valueOf(d2.getInt(d2.getColumnIndex(qm3.b.c)));
                            str2 = str4;
                        } else {
                            String string2 = d2.getString(d2.getColumnIndex(str4));
                            String str8 = string2 == null ? "" : string2 + " ";
                            str = str3;
                            str2 = str4;
                            SpannableString spannableString = new SpannableString(str8 + d2.getString(d2.getColumnIndex(str3)));
                            if (str8.length() > 0) {
                                spannableString.setSpan(new StyleSpan(1), 0, str8.length(), 0);
                            }
                            arrayList.add(spannableString);
                            if (str6 == null) {
                                string = d2.getString(d2.getColumnIndex(qm3.b.m));
                                if (d2.moveToNext()) {
                                    break;
                                }
                                str6 = string;
                                str5 = str7;
                                str3 = str;
                                str4 = str2;
                            }
                        }
                        string = str6;
                        if (d2.moveToNext()) {
                        }
                    }
                    if (r != 0 && string != null) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        if (!d2.isClosed()) {
                            d2.close();
                        }
                        if (num == null) {
                            num = Integer.valueOf(secureRandom.nextInt());
                            m(k, optString, num.intValue());
                        }
                        b2 = cj3Var.b(secureRandom.nextInt(), h(num.intValue(), cj3Var, jSONObject, optString));
                        if (arrayList == null && ((r && arrayList.size() > 1) || (!r && arrayList.size() > 0))) {
                            int size = arrayList.size() + (!r);
                            String optString2 = jSONObject.optString("grp_msg", null);
                            CharSequence replace = optString2 == null ? size + " new messages" : optString2.replace("$[notif_count]", "" + size);
                            kg.g gVar = r(al3Var).a;
                            if (r != 0) {
                                H(gVar);
                            } else {
                                if (al3Var.l() != null) {
                                    gVar.x0(al3Var.l());
                                }
                                if (al3Var.k() != null) {
                                    gVar.T(al3Var.k().intValue());
                                }
                            }
                            gVar.N(b2).U(A).P(h.getPackageManager().getApplicationLabel(h.getApplicationInfo())).O(replace).h0(size).t0(w()).c0(v()).j0(r).D(false).Z(optString).b0(true);
                            try {
                                gVar.a0(j.intValue());
                            } catch (Throwable unused) {
                            }
                            if (r == 0) {
                                gVar.B0(replace);
                            }
                            kg.l lVar = new kg.l();
                            if (r == 0) {
                                String charSequence = al3Var.o() != null ? al3Var.o().toString() : null;
                                String t = charSequence != null ? wo1.t(charSequence, " ") : "";
                                SpannableString spannableString2 = new SpannableString(wo1.t(t, al3Var.d().toString()));
                                if (t.length() > 0) {
                                    spannableString2.setSpan(new StyleSpan(1), 0, t.length(), 0);
                                }
                                lVar.A(spannableString2);
                            }
                            for (SpannableString spannableString3 : arrayList) {
                                lVar.A(spannableString3);
                            }
                            lVar.B(replace);
                            gVar.z0(lVar);
                            h2 = gVar.h();
                        } else {
                            kg.g gVar2 = bVar.a;
                            gVar2.c.clear();
                            d(jSONObject, cj3Var, gVar2, num.intValue(), optString);
                            gVar2.N(b2).U(A).j0(r).D(false).Z(optString).b0(true);
                            gVar2.a0(j.intValue());
                            h2 = gVar2.h();
                            e(bVar, h2);
                        }
                        pg.p(h).C(num.intValue(), h2);
                    }
                } else {
                    arrayList = null;
                    num = null;
                }
                jSONObject = f2;
                if (!d2.isClosed()) {
                }
                if (num == null) {
                }
                b2 = cj3Var.b(secureRandom.nextInt(), h(num.intValue(), cj3Var, jSONObject, optString));
                if (arrayList == null) {
                }
                kg.g gVar22 = bVar.a;
                gVar22.c.clear();
                d(jSONObject, cj3Var, gVar22, num.intValue(), optString);
                gVar22.N(b2).U(A).j0(r).D(false).Z(optString).b0(true);
                gVar22.a0(j.intValue());
                h2 = gVar22.h();
                e(bVar, h2);
                pg.p(h).C(num.intValue(), h2);
            } catch (Throwable th) {
                th = th;
                cursor = null;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
    }

    public static boolean o(al3 al3Var) {
        L(al3Var.e());
        return N(al3Var);
    }

    @s2
    public static boolean p(al3 al3Var) {
        L(al3Var.e());
        F();
        E();
        return N(al3Var);
    }

    public static BigInteger q(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String l = OSUtils.l(jm3.g, "onesignal_notification_accent_color", null);
            if (l != null) {
                return new BigInteger(l, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String g2 = OSUtils.g(jm3.g, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (g2 != null) {
                return new BigInteger(g2, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static b r(al3 al3Var) {
        kg.g gVar;
        JSONObject f2 = al3Var.f();
        b bVar = new b();
        try {
            gVar = new kg.g(h, jj3.c(al3Var));
        } catch (Throwable unused) {
            gVar = new kg.g(h);
        }
        String optString = f2.optString("alert", null);
        gVar.D(true).t0(C(f2)).z0(new kg.e().A(optString)).O(optString).B0(optString);
        if (Build.VERSION.SDK_INT < 24 || !f2.optString("title").equals("")) {
            gVar.P(D(f2));
        }
        try {
            BigInteger q = q(f2);
            if (q != null) {
                gVar.J(q.intValue());
            }
        } catch (Throwable unused2) {
        }
        try {
            gVar.G0(f2.has("vis") ? Integer.parseInt(f2.optString("vis")) : 1);
        } catch (Throwable unused3) {
        }
        Bitmap y = y(f2);
        if (y != null) {
            bVar.b = true;
            gVar.c0(y);
        }
        Bitmap s = s(f2.optString("bicon", null));
        if (s != null) {
            gVar.z0(new kg.d().C(s).F(optString));
        }
        if (al3Var.n() != null) {
            try {
                gVar.H0(al3Var.n().longValue() * 1000);
            } catch (Throwable unused4) {
            }
        }
        K(f2, gVar);
        bVar.a = gVar;
        return bVar;
    }

    private static Bitmap s(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
            return t(str);
        }
        return u(trim);
    }

    private static Bitmap t(String str) {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeStream(h.getAssets().open(str));
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return bitmap;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmap = BitmapFactory.decodeStream(h.getAssets().open(str + str2));
                    continue;
                } catch (Throwable unused2) {
                    continue;
                }
                if (bitmap != null) {
                    return bitmap;
                }
            }
            int B = B(str);
            if (B != 0) {
                return BitmapFactory.decodeResource(g, B);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private static Bitmap u(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            jm3.b(jm3.u0.WARN, "Could not download image!", th);
            return null;
        }
    }

    private static Bitmap v() {
        return I(t("ic_onesignal_large_icon_default"));
    }

    private static int w() {
        int x = x("ic_stat_onesignal_default");
        if (x != 0) {
            return x;
        }
        int x2 = x("corona_statusbar_icon_default");
        if (x2 != 0) {
            return x2;
        }
        int x3 = x("ic_os_notification_fallback_white_24dp");
        if (x3 != 0) {
            return x3;
        }
        return 17301598;
    }

    private static int x(String str) {
        return g.getIdentifier(str, com.anythink.expressad.foundation.h.h.c, i);
    }

    private static Bitmap y(JSONObject jSONObject) {
        Bitmap s = s(jSONObject.optString("licon"));
        if (s == null) {
            s = t("ic_onesignal_large_icon_default");
        }
        if (s == null) {
            return null;
        }
        return I(s);
    }

    private static Intent z(int i2) {
        return new Intent(h, f).putExtra(b, i2).putExtra(qm3.b.h, true);
    }
}
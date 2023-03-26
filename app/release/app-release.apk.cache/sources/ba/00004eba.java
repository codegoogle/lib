package com.p7700g.p99005;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationOpenedProcessor.java */
/* loaded from: classes3.dex */
public class lj3 {
    private static final String a = "com.p7700g.p99005.lj3";

    private static void a(JSONArray jSONArray, String str, rm3 rm3Var) {
        Cursor d = rm3Var.d(qm3.b.a, new String[]{qm3.b.m}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, null);
        if (d.getCount() > 1) {
            d.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(d.getString(d.getColumnIndex(qm3.b.m))));
                } catch (JSONException unused) {
                    jm3.u0 u0Var = jm3.u0.ERROR;
                    jm3.a(u0Var, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (d.moveToNext());
            d.close();
        }
        d.close();
    }

    private static void b(Context context, rm3 rm3Var, String str) {
        if (str != null) {
            pj3.a(context, rm3Var, str);
        } else if (Build.VERSION.SDK_INT < 23 || um3.e(context).intValue() >= 1) {
        } else {
            um3.i(context).cancel(um3.f());
        }
    }

    private static void c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            pg.p(context).b(intent.getIntExtra(ui3.b, 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private static boolean d(Intent intent) {
        return intent.hasExtra(ui3.d) || intent.hasExtra("summary") || intent.hasExtra(ui3.b);
    }

    private static void e(Context context, Intent intent, rm3 rm3Var, boolean z) {
        String sb;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean equals = stringExtra.equals(um3.g());
            if (equals) {
                sb = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                sb = "group_id = ?";
            }
            if (!z && !jm3.e0()) {
                String valueOf = String.valueOf(um3.h(rm3Var, stringExtra, equals));
                sb = wo1.t(sb, " AND android_notification_id = ?");
                strArr = equals ? new String[]{valueOf} : new String[]{stringExtra, valueOf};
            }
        } else {
            StringBuilder G = wo1.G("android_notification_id = ");
            G.append(intent.getIntExtra(ui3.b, 0));
            sb = G.toString();
        }
        b(context, rm3Var, stringExtra);
        rm3Var.a(qm3.b.a, f(intent), sb, strArr);
        ki3.c(rm3Var, context);
    }

    private static ContentValues f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra(qm3.b.h, false)) {
            contentValues.put(qm3.b.h, (Integer) 1);
        } else {
            contentValues.put(qm3.b.g, (Integer) 1);
        }
        return contentValues;
    }

    public static void g(Context context, Intent intent) {
        if (d(intent)) {
            if (context != null) {
                jm3.q1(context.getApplicationContext());
            }
            c(context, intent);
            h(context, intent);
        }
    }

    public static void h(Context context, Intent intent) {
        bl3 bl3Var;
        String stringExtra;
        rm3 k = rm3.k(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra(qm3.b.h, false);
        if (booleanExtra) {
            bl3Var = null;
        } else {
            bl3Var = i(context, intent, k, stringExtra2);
            if (bl3Var == null) {
                return;
            }
        }
        e(context, intent, k, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            pj3.f(context, k, stringExtra, booleanExtra);
        }
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.P1(u0Var, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            StringBuilder G = wo1.G("processIntent intent extras: ");
            G.append(intent.getExtras().toString());
            jm3.P1(u0Var, G.toString());
        }
        if (booleanExtra) {
            return;
        }
        if (!(context instanceof Activity)) {
            jm3.u0 u0Var2 = jm3.u0.ERROR;
            jm3.P1(u0Var2, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            return;
        }
        jm3.i1((Activity) context, bl3Var.e(), zk3.b(bl3Var.f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static bl3 i(Context context, Intent intent, rm3 rm3Var, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray = null;
        try {
            jSONObject = new JSONObject(intent.getStringExtra(ui3.d));
            try {
                if (!(context instanceof Activity)) {
                    jm3.P1(jm3.u0.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
                } else if (mk3.b((Activity) context, jSONObject)) {
                    return null;
                }
                jSONObject.put(ui3.b, intent.getIntExtra(ui3.b, 0));
                intent.putExtra(ui3.d, jSONObject.toString());
                jSONArray = ij3.g(new JSONObject(intent.getStringExtra(ui3.d)));
            } catch (JSONException e) {
                e = e;
                e.printStackTrace();
                if (str != null) {
                }
                return new bl3(jSONArray, jSONObject);
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
        }
        if (str != null) {
            a(jSONArray, str, rm3Var);
        }
        return new bl3(jSONArray, jSONObject);
    }
}
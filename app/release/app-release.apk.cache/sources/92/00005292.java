package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.FCMBroadcastReceiver;
import com.onesignal.OSUtils;
import com.p7700g.p99005.ij3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationPayloadProcessorHMS.java */
/* loaded from: classes3.dex */
public class nj3 {

    /* compiled from: NotificationPayloadProcessorHMS.java */
    /* loaded from: classes3.dex */
    public class a implements ij3.e {
        public final /* synthetic */ Context a;
        public final /* synthetic */ Bundle b;

        public a(Context context, Bundle bundle) {
            this.a = context;
            this.b = bundle;
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
            if (fVar == null || !fVar.c()) {
                FCMBroadcastReceiver.h(this.a, this.b);
            }
        }
    }

    @z1
    private static JSONObject a(@z1 Intent intent) {
        if (zk3.e(intent)) {
            JSONObject a2 = ij3.a(intent.getExtras());
            e(a2);
            return a2;
        }
        return null;
    }

    public static void b(@x1 Activity activity, @z1 Intent intent) {
        JSONObject a2;
        jm3.q1(activity.getApplicationContext());
        if (intent == null || (a2 = a(intent)) == null) {
            return;
        }
        c(activity, a2);
    }

    private static void c(@x1 Activity activity, @x1 JSONObject jSONObject) {
        if (mk3.b(activity, jSONObject)) {
            return;
        }
        jm3.i1(activity, new JSONArray().put(jSONObject), zk3.b(jSONObject));
    }

    public static void d(@x1 Context context, @z1 String str) {
        Bundle M;
        jm3.q1(context);
        if (str == null || (M = OSUtils.M(str)) == null) {
            return;
        }
        ij3.h(context, M, new a(context, M));
    }

    private static void e(@x1 JSONObject jSONObject) {
        try {
            String str = (String) ij3.b(jSONObject).remove(ui3.c);
            if (str == null) {
                return;
            }
            jSONObject.put(ui3.c, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
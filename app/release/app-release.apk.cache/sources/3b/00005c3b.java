package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.push.RemoteMessage;
import com.p7700g.p99005.jm3;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OneSignalHmsEventBridge.java */
/* loaded from: classes3.dex */
public class sm3 {
    public static final String a = "hms.ttl";
    public static final String b = "hms.sent_time";
    private static final AtomicBoolean c = new AtomicBoolean(true);

    public static void a(@x1 Context context, @x1 RemoteMessage remoteMessage) {
        String data = remoteMessage.getData();
        try {
            JSONObject jSONObject = new JSONObject(remoteMessage.getData());
            if (remoteMessage.getTtl() == 0) {
                jSONObject.put(a, 259200);
            } else {
                jSONObject.put(a, remoteMessage.getTtl());
            }
            if (remoteMessage.getSentTime() == 0) {
                jSONObject.put(b, jm3.X0().b());
            } else {
                jSONObject.put(b, remoteMessage.getSentTime());
            }
            data = jSONObject.toString();
        } catch (JSONException unused) {
            jm3.a(jm3.u0.ERROR, "OneSignalHmsEventBridge error when trying to create RemoteMessage data JSON");
        }
        nj3.d(context, data);
    }

    @Deprecated
    public static void b(@x1 Context context, @x1 String str) {
        c(context, str, null);
    }

    public static void c(@x1 Context context, @x1 String str, @z1 Bundle bundle) {
        if (c.compareAndSet(true, false)) {
            jm3.u0 u0Var = jm3.u0.INFO;
            jm3.a(u0Var, "OneSignalHmsEventBridge onNewToken - HMS token: " + str + " Bundle: " + bundle);
            fn3.d(str);
            return;
        }
        jm3.u0 u0Var2 = jm3.u0.INFO;
        jm3.a(u0Var2, "OneSignalHmsEventBridge ignoring onNewToken - HMS token: " + str + " Bundle: " + bundle);
    }
}
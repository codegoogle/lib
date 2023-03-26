package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.fl3;
import com.p7700g.p99005.im3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.kb0;
import com.p7700g.p99005.nb0;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.vk3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xk3;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class OSNotificationWorkManager {
    private static final String a = "android_notif_id";
    private static final String b = "json_payload";
    private static final String c = "timestamp";
    private static final String d = "is_restoring";
    private static Set<String> e = OSUtils.N();

    /* loaded from: classes3.dex */
    public static class NotificationWorker extends Worker {
        public NotificationWorker(@x1 Context context, @x1 WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        private void a(Context context, int i, JSONObject jSONObject, boolean z, Long l) {
            vk3 vk3Var = new vk3(null, jSONObject, i);
            fl3 fl3Var = new fl3(new xk3(context, vk3Var, jSONObject, z, true, l), vk3Var);
            jm3.d1 d1Var = jm3.r;
            if (d1Var != null) {
                try {
                    d1Var.a(context, fl3Var);
                    return;
                } catch (Throwable th) {
                    jm3.b(jm3.u0.ERROR, "remoteNotificationReceived throw an exception. Displaying normal OneSignal notification.", th);
                    fl3Var.b(vk3Var);
                    throw th;
                }
            }
            jm3.a(jm3.u0.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
            fl3Var.b(vk3Var);
        }

        @Override // androidx.work.Worker
        @x1
        public ListenableWorker.a doWork() {
            kb0 inputData = getInputData();
            try {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                jm3.P1(u0Var, "NotificationWorker running doWork with data: " + inputData);
                int v = inputData.v(OSNotificationWorkManager.a, 0);
                JSONObject jSONObject = new JSONObject(inputData.A(OSNotificationWorkManager.b));
                long y = inputData.y("timestamp", System.currentTimeMillis() / 1000);
                a(getApplicationContext(), v, jSONObject, inputData.n(OSNotificationWorkManager.d, false), Long.valueOf(y));
                return ListenableWorker.a.e();
            } catch (JSONException e) {
                jm3.u0 u0Var2 = jm3.u0.ERROR;
                StringBuilder G = wo1.G("Error occurred doing work for job with id: ");
                G.append(getId().toString());
                jm3.P1(u0Var2, G.toString());
                e.printStackTrace();
                return ListenableWorker.a.a();
            }
        }
    }

    public static boolean a(String str) {
        if (OSUtils.J(str)) {
            if (e.contains(str)) {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                jm3.a(u0Var, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
                return false;
            }
            e.add(str);
            return true;
        }
        return true;
    }

    public static void b(Context context, String str, int i, String str2, long j, boolean z, boolean z2) {
        kb0 a2 = new kb0.a().m(a, i).q(b, str2).o("timestamp", j).e(d, z).a();
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        im3.a(context).m(str, nb0.KEEP, new vb0.a(NotificationWorker.class).o(a2).b());
    }

    public static void c(String str) {
        if (OSUtils.J(str)) {
            e.remove(str);
        }
    }
}
package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.OSUtils;
import com.p7700g.p99005.bn3;
import com.p7700g.p99005.jm3;

/* compiled from: PushRegistratorHMS.java */
/* loaded from: classes3.dex */
public class fn3 implements bn3 {
    public static final String a = "client/app_id";
    private static final int b = 30000;
    private static boolean c;
    @z1
    private static bn3.a d;

    /* compiled from: PushRegistratorHMS.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context s;
        public final /* synthetic */ bn3.a t;

        public a(Context context, bn3.a aVar) {
            this.s = context;
            this.t = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                fn3.this.e(this.s, this.t);
            } catch (ApiException e) {
                jm3.b(jm3.u0.ERROR, "HMS ApiException getting Huawei push token!", e);
                this.t.a(null, e.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    private static void c() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
    }

    public static void d(String str) {
        bn3.a aVar = d;
        if (aVar == null) {
            return;
        }
        c = true;
        aVar.a(str, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void e(@x1 Context context, @x1 bn3.a aVar) throws ApiException {
        if (!OSUtils.q()) {
            aVar.a(null, -28);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString(a), "HCM");
        if (!TextUtils.isEmpty(token)) {
            jm3.u0 u0Var = jm3.u0.INFO;
            jm3.a(u0Var, "Device registered for HMS, push token = " + token);
            aVar.a(token, 1);
        } else {
            f(aVar);
        }
    }

    private void f(@x1 bn3.a aVar) {
        c();
        if (c) {
            return;
        }
        jm3.a(jm3.u0.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
        aVar.a(null, -25);
    }

    @Override // com.p7700g.p99005.bn3
    public void a(@x1 Context context, String str, @x1 bn3.a aVar) {
        d = aVar;
        new Thread(new a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }
}
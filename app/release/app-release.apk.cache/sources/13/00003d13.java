package com.p7700g.p99005;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.p7700g.p99005.bn3;
import com.p7700g.p99005.jm3;

/* compiled from: PushRegistratorADM.java */
/* loaded from: classes3.dex */
public class cn3 implements bn3 {
    private static bn3.a a = null;
    private static boolean b = false;

    /* compiled from: PushRegistratorADM.java */
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
            ADM adm = new ADM(this.s);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                jm3.u0 u0Var = jm3.u0.DEBUG;
                jm3.a(u0Var, "ADM Already registered with ID:" + registrationId);
                this.t.a(registrationId, 1);
            }
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            if (cn3.b) {
                return;
            }
            jm3.a(jm3.u0.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
            cn3.c(null);
        }
    }

    public static void c(String str) {
        bn3.a aVar = a;
        if (aVar == null) {
            return;
        }
        b = true;
        aVar.a(str, 1);
    }

    @Override // com.p7700g.p99005.bn3
    public void a(Context context, String str, bn3.a aVar) {
        a = aVar;
        new Thread(new a(context, aVar)).start();
    }
}
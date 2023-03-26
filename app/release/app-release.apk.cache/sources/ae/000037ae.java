package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.amazon.device.messaging.ADMMessageReceiver;
import com.p7700g.p99005.al3;
import com.p7700g.p99005.cn3;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.vk3;
import com.p7700g.p99005.z1;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ADMMessageHandler extends ADMMessageHandlerBase {
    private static final int JOB_ID = 123891;

    /* loaded from: classes3.dex */
    public class a implements ij3.e {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;

        public a(Bundle bundle, Context context) {
            this.a = bundle;
            this.b = context;
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
            if (fVar.c()) {
                return;
            }
            JSONObject a = ij3.a(this.a);
            vk3 vk3Var = new vk3(a);
            al3 al3Var = new al3(this.b);
            al3Var.u(a);
            al3Var.s(this.b);
            al3Var.v(vk3Var);
            ij3.m(al3Var, true);
        }
    }

    /* loaded from: classes3.dex */
    public static class b extends ADMMessageReceiver {
        public b() {
            super(ADMMessageHandler.class);
            boolean z;
            try {
                Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                registerJobServiceClass(ADMMessageHandlerJob.class, ADMMessageHandler.JOB_ID);
            }
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "ADM latest available: " + z);
        }
    }

    public ADMMessageHandler() {
        super("ADMMessageHandler");
    }

    public void onMessage(Intent intent) {
        Context applicationContext = getApplicationContext();
        Bundle extras = intent.getExtras();
        ij3.h(applicationContext, extras, new a(extras, applicationContext));
    }

    public void onRegistered(String str) {
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "ADM registration ID: " + str);
        cn3.c(str);
    }

    public void onRegistrationError(String str) {
        jm3.u0 u0Var = jm3.u0.ERROR;
        jm3.a(u0Var, "ADM:onRegistrationError: " + str);
        if ("INVALID_SENDER".equals(str)) {
            jm3.a(u0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        cn3.c(null);
    }

    public void onUnregistered(String str) {
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "ADM:onUnregistered: " + str);
    }
}
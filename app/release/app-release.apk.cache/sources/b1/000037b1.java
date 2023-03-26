package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.p7700g.p99005.al3;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.cn3;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.vk3;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: ADMMessageHandlerJob.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000e\u0010\fJ#\u0010\u0010\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/onesignal/ADMMessageHandlerJob;", "Lcom/amazon/device/messaging/ADMMessageHandlerJobBase;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lcom/p7700g/p99005/yq4;", "onMessage", "(Landroid/content/Context;Landroid/content/Intent;)V", "", "newRegistrationId", "onRegistered", "(Landroid/content/Context;Ljava/lang/String;)V", "registrationId", "onUnregistered", "error", "onRegistrationError", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class ADMMessageHandlerJob extends ADMMessageHandlerJobBase {

    /* compiled from: ADMMessageHandlerJob.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/onesignal/ADMMessageHandlerJob$a", "Lcom/p7700g/p99005/ij3$e;", "Lcom/p7700g/p99005/ij3$f;", "processedResult", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/ij3$f;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a implements ij3.e {
        public final /* synthetic */ Bundle a;
        public final /* synthetic */ Context b;

        public a(Bundle bundle, Context context) {
            this.a = bundle;
            this.b = context;
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@Nullable ij3.f fVar) {
            if (fVar == null || !fVar.c()) {
                JSONObject a = ij3.a(this.a);
                c25.o(a, "NotificationBundleProces…undleAsJSONObject(bundle)");
                vk3 vk3Var = new vk3(a);
                al3 al3Var = new al3(this.b);
                al3Var.u(a);
                al3Var.s(this.b);
                al3Var.v(vk3Var);
                ij3.m(al3Var, true);
            }
        }
    }

    public void onMessage(@Nullable Context context, @Nullable Intent intent) {
        Bundle extras = intent != null ? intent.getExtras() : null;
        ij3.h(context, extras, new a(extras, context));
    }

    public void onRegistered(@Nullable Context context, @Nullable String str) {
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "ADM registration ID: " + str);
        cn3.c(str);
    }

    public void onRegistrationError(@Nullable Context context, @Nullable String str) {
        jm3.u0 u0Var = jm3.u0.ERROR;
        jm3.a(u0Var, "ADM:onRegistrationError: " + str);
        if (c25.g("INVALID_SENDER", str)) {
            jm3.a(u0Var, "Please double check that you have a matching package name (NOTE: Case Sensitive), api_key.txt, and the apk was signed with the same Keystore and Alias.");
        }
        cn3.c(null);
    }

    public void onUnregistered(@Nullable Context context, @Nullable String str) {
        jm3.u0 u0Var = jm3.u0.INFO;
        jm3.a(u0Var, "ADM:onUnregistered: " + str);
    }
}
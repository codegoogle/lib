package com.onesignal;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.mi3;
import com.p7700g.p99005.ni3;
import com.p7700g.p99005.oi3;
import com.p7700g.p99005.uy;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class FCMBroadcastReceiver extends uy {
    private static final String a = "com.google.android.c2dm.intent.RECEIVE";
    private static final String b = "gcm";
    private static final String c = "message_type";

    /* loaded from: classes3.dex */
    public class a implements ij3.e {
        public a() {
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
            if (fVar == null) {
                FCMBroadcastReceiver.this.g();
            } else if (fVar.a() || fVar.b()) {
                FCMBroadcastReceiver.this.e();
            } else {
                FCMBroadcastReceiver.this.g();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements ij3.e {
        public final /* synthetic */ ij3.e a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Bundle c;

        public b(ij3.e eVar, Context context, Bundle bundle) {
            this.a = eVar;
            this.b = context;
            this.c = bundle;
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
            if (fVar != null && fVar.c()) {
                this.a.a(fVar);
                return;
            }
            FCMBroadcastReceiver.h(this.b, this.c);
            this.a.a(fVar);
        }
    }

    private static boolean c(Intent intent) {
        if (a.equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("message_type");
            return stringExtra == null || "gcm".equals(stringExtra);
        }
        return false;
    }

    private static void d(Context context, Intent intent, Bundle bundle, ij3.e eVar) {
        if (!c(intent)) {
            eVar.a(null);
        }
        ij3.h(context, bundle, new b(eVar, context, bundle));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (isOrderedBroadcast()) {
            abortBroadcast();
            setResultCode(-1);
        }
    }

    private static mi3 f(Bundle bundle, mi3 mi3Var) {
        mi3Var.b("json_payload", ij3.a(bundle).toString());
        mi3Var.c("timestamp", Long.valueOf(jm3.X0().b() / 1000));
        return mi3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (isOrderedBroadcast()) {
            setResultCode(-1);
        }
    }

    public static void h(Context context, Bundle bundle) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "startFCMService from: " + context + " and bundle: " + bundle);
        if (!ij3.c(bundle)) {
            jm3.a(u0Var, "startFCMService with no remote resources, no need for services");
            ij3.j(context, f(bundle, oi3.a()));
            return;
        }
        if (!(Integer.parseInt(bundle.getString("pri", "0")) > 9) && Build.VERSION.SDK_INT >= 26) {
            i(context, bundle);
            return;
        }
        try {
            j(context, bundle);
        } catch (IllegalStateException unused) {
            i(context, bundle);
        }
    }

    @TargetApi(21)
    private static void i(Context context, Bundle bundle) {
        mi3 f = f(bundle, oi3.a());
        Intent intent = new Intent(context, FCMIntentJobService.class);
        intent.putExtra(FCMIntentJobService.D, (Parcelable) f.h());
        FCMIntentJobService.l(context, intent);
    }

    private static void j(Context context, Bundle bundle) {
        uy.startWakefulService(context, new Intent().replaceExtras((Bundle) f(bundle, new ni3()).h()).setComponent(new ComponentName(context.getPackageName(), FCMIntentService.class.getName())));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || "google.com/iid".equals(extras.getString("from"))) {
            return;
        }
        jm3.q1(context);
        d(context, intent, extras, new a());
    }
}
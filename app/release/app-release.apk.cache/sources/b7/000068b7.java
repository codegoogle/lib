package com.p7700g.p99005;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;

/* compiled from: AlarmManagerScheduler.java */
/* loaded from: classes2.dex */
public class z72 implements i82 {
    private static final String a = "AlarmManagerScheduler";
    public static final String b = "attemptNumber";
    public static final String c = "backendName";
    public static final String d = "priority";
    public static final String e = "extras";
    private final Context f;
    private final i92 g;
    private AlarmManager h;
    private final d82 i;
    private final v92 j;

    public z72(Context context, i92 i92Var, v92 v92Var, d82 d82Var) {
        this(context, i92Var, (AlarmManager) context.getSystemService(kg.v0), v92Var, d82Var);
    }

    @Override // com.p7700g.p99005.i82
    public void a(v42 v42Var, int i) {
        b(v42Var, i, false);
    }

    @Override // com.p7700g.p99005.i82
    public void b(v42 v42Var, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", v42Var.b());
        builder.appendQueryParameter("priority", String.valueOf(ea2.a(v42Var.d())));
        if (v42Var.c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(v42Var.c(), 0));
        }
        Intent intent = new Intent(this.f, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && c(intent)) {
            d72.b(a, "Upload for context %s is already scheduled. Returning...", v42Var);
            return;
        }
        long A1 = this.g.A1(v42Var);
        long h = this.i.h(v42Var.d(), A1, i);
        d72.d(a, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", v42Var, Long.valueOf(h), Long.valueOf(A1), Integer.valueOf(i));
        this.h.set(3, this.j.a() + h, PendingIntent.getBroadcast(this.f, 0, intent, 0));
    }

    @r2
    public boolean c(Intent intent) {
        return PendingIntent.getBroadcast(this.f, 0, intent, 536870912) != null;
    }

    @r2
    public z72(Context context, i92 i92Var, AlarmManager alarmManager, v92 v92Var, d82 d82Var) {
        this.f = context;
        this.g = i92Var;
        this.h = alarmManager;
        this.j = v92Var;
        this.i = d82Var;
    }
}
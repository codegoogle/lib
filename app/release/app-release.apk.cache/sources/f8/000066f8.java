package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import com.p7700g.p99005.bd0;
import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: CommandHandler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class yc0 implements jc0 {
    private static final String A = "KEY_NEEDS_RESCHEDULE";
    public static final long B = 600000;
    private static final String s = tb0.f("CommandHandler");
    public static final String t = "ACTION_SCHEDULE_WORK";
    public static final String u = "ACTION_DELAY_MET";
    public static final String v = "ACTION_STOP_WORK";
    public static final String w = "ACTION_CONSTRAINTS_CHANGED";
    public static final String x = "ACTION_RESCHEDULE";
    public static final String y = "ACTION_EXECUTION_COMPLETED";
    private static final String z = "KEY_WORKSPEC_ID";
    private final Context C;
    private final Map<String, jc0> D = new HashMap();
    private final Object E = new Object();

    public yc0(@x1 Context context) {
        this.C = context;
    }

    public static Intent a(@x1 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(w);
        return intent;
    }

    public static Intent b(@x1 Context context, @x1 String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(u);
        intent.putExtra(z, workSpecId);
        return intent;
    }

    public static Intent c(@x1 Context context, @x1 String workSpecId, boolean needsReschedule) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(y);
        intent.putExtra(z, workSpecId);
        intent.putExtra(A, needsReschedule);
        return intent;
    }

    public static Intent e(@x1 Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(x);
        return intent;
    }

    public static Intent f(@x1 Context context, @x1 String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(t);
        intent.putExtra(z, workSpecId);
        return intent;
    }

    public static Intent g(@x1 Context context, @x1 String workSpecId) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction(v);
        intent.putExtra(z, workSpecId);
        return intent;
    }

    private void h(@x1 Intent intent, int startId, @x1 bd0 dispatcher) {
        tb0.c().a(s, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new zc0(this.C, startId, dispatcher).a();
    }

    private void i(@x1 Intent intent, int startId, @x1 bd0 dispatcher) {
        Bundle extras = intent.getExtras();
        synchronized (this.E) {
            String string = extras.getString(z);
            tb0 c = tb0.c();
            String str = s;
            c.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.D.containsKey(string)) {
                ad0 ad0Var = new ad0(this.C, startId, string, dispatcher);
                this.D.put(string, ad0Var);
                ad0Var.e();
            } else {
                tb0.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }

    private void j(@x1 Intent intent, int startId) {
        Bundle extras = intent.getExtras();
        String string = extras.getString(z);
        boolean z2 = extras.getBoolean(A);
        tb0.c().a(s, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        d(string, z2);
    }

    private void k(@x1 Intent intent, int startId, @x1 bd0 dispatcher) {
        tb0.c().a(s, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(startId)), new Throwable[0]);
        dispatcher.g().R();
    }

    private void l(@x1 Intent intent, int startId, @x1 bd0 dispatcher) {
        String string = intent.getExtras().getString(z);
        tb0 c = tb0.c();
        String str = s;
        c.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase M = dispatcher.g().M();
        M.c();
        try {
            we0 u2 = M.L().u(string);
            if (u2 == null) {
                tb0 c2 = tb0.c();
                c2.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (u2.e.f()) {
                tb0 c3 = tb0.c();
                c3.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a = u2.a();
                if (!u2.b()) {
                    tb0.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    xc0.c(this.C, dispatcher.g(), string, a);
                } else {
                    tb0.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a)), new Throwable[0]);
                    xc0.c(this.C, dispatcher.g(), string, a);
                    dispatcher.k(new bd0.b(dispatcher, a(this.C), startId));
                }
                M.A();
            }
        } finally {
            M.i();
        }
    }

    private void m(@x1 Intent intent, @x1 bd0 dispatcher) {
        String string = intent.getExtras().getString(z);
        tb0.c().a(s, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dispatcher.g().X(string);
        xc0.a(this.C, dispatcher.g(), string);
        dispatcher.d(string, false);
    }

    private static boolean n(@z1 Bundle bundle, @x1 String... keys) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : keys) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        synchronized (this.E) {
            jc0 remove = this.D.remove(workSpecId);
            if (remove != null) {
                remove.d(workSpecId, needsReschedule);
            }
        }
    }

    public boolean o() {
        boolean z2;
        synchronized (this.E) {
            z2 = !this.D.isEmpty();
        }
        return z2;
    }

    @s2
    public void p(@x1 Intent intent, int startId, @x1 bd0 dispatcher) {
        String action = intent.getAction();
        if (w.equals(action)) {
            h(intent, startId, dispatcher);
        } else if (x.equals(action)) {
            k(intent, startId, dispatcher);
        } else if (!n(intent.getExtras(), z)) {
            tb0.c().b(s, String.format("Invalid request for %s, requires %s.", action, z), new Throwable[0]);
        } else if (t.equals(action)) {
            l(intent, startId, dispatcher);
        } else if (u.equals(action)) {
            i(intent, startId, dispatcher);
        } else if (v.equals(action)) {
            m(intent, dispatcher);
        } else if (y.equals(action)) {
            j(intent, startId);
        } else {
            tb0.c().h(s, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
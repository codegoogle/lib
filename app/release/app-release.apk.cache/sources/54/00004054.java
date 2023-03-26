package com.p7700g.p99005;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import com.p7700g.p99005.i2;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* compiled from: SystemForegroundDispatcher.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ee0 implements jd0, jc0 {
    private static final String A = "ACTION_STOP_FOREGROUND";
    public static final String s = tb0.f("SystemFgDispatcher");
    private static final String t = "KEY_NOTIFICATION";
    private static final String u = "KEY_NOTIFICATION_ID";
    private static final String v = "KEY_FOREGROUND_SERVICE_TYPE";
    private static final String w = "KEY_WORKSPEC_ID";
    private static final String x = "ACTION_START_FOREGROUND";
    private static final String y = "ACTION_NOTIFY";
    private static final String z = "ACTION_CANCEL_WORK";
    private Context B;
    private rc0 C;
    private final cg0 D;
    public final Object E;
    public String F;
    public final Map<String, ob0> G;
    public final Map<String, we0> H;
    public final Set<we0> I;
    public final kd0 J;
    @z1
    private b K;

    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ WorkDatabase s;
        public final /* synthetic */ String t;

        public a(final WorkDatabase val$database, final String val$workSpecId) {
            this.s = val$database;
            this.t = val$workSpecId;
        }

        @Override // java.lang.Runnable
        public void run() {
            we0 u = this.s.L().u(this.t);
            if (u == null || !u.b()) {
                return;
            }
            synchronized (ee0.this.E) {
                ee0.this.H.put(this.t, u);
                ee0.this.I.add(u);
                ee0 ee0Var = ee0.this;
                ee0Var.J.d(ee0Var.I);
            }
        }
    }

    /* compiled from: SystemForegroundDispatcher.java */
    /* loaded from: classes.dex */
    public interface b {
        void b(int notificationId, int notificationType, @x1 Notification notification);

        void d(int notificationId, @x1 Notification notification);

        void e(int notificationId);

        void stop();
    }

    public ee0(@x1 Context context) {
        this.B = context;
        this.E = new Object();
        rc0 H = rc0.H(this.B);
        this.C = H;
        cg0 O = H.O();
        this.D = O;
        this.F = null;
        this.G = new LinkedHashMap();
        this.I = new HashSet();
        this.H = new HashMap();
        this.J = new kd0(this.B, O, this);
        this.C.J().c(this);
    }

    @x1
    public static Intent a(@x1 Context context, @x1 String workSpecId) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(z);
        intent.setData(Uri.parse(String.format("workspec://%s", workSpecId)));
        intent.putExtra(w, workSpecId);
        return intent;
    }

    @x1
    public static Intent c(@x1 Context context, @x1 String workSpecId, @x1 ob0 info) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(y);
        intent.putExtra(u, info.c());
        intent.putExtra(v, info.a());
        intent.putExtra(t, info.b());
        intent.putExtra(w, workSpecId);
        return intent;
    }

    @x1
    public static Intent e(@x1 Context context, @x1 String workSpecId, @x1 ob0 info) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(x);
        intent.putExtra(w, workSpecId);
        intent.putExtra(u, info.c());
        intent.putExtra(v, info.a());
        intent.putExtra(t, info.b());
        intent.putExtra(w, workSpecId);
        return intent;
    }

    @x1
    public static Intent g(@x1 Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction(A);
        return intent;
    }

    @u1
    private void i(@x1 Intent intent) {
        tb0.c().d(s, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra(w);
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.C.h(UUID.fromString(stringExtra));
    }

    @u1
    private void j(@x1 Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra(u, 0);
        int intExtra2 = intent.getIntExtra(v, 0);
        String stringExtra = intent.getStringExtra(w);
        Notification notification = (Notification) intent.getParcelableExtra(t);
        tb0.c().a(s, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.K == null) {
            return;
        }
        this.G.put(stringExtra, new ob0(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.F)) {
            this.F = stringExtra;
            this.K.b(intExtra, intExtra2, notification);
            return;
        }
        this.K.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, ob0> entry : this.G.entrySet()) {
            i |= entry.getValue().a();
        }
        ob0 ob0Var = this.G.get(this.F);
        if (ob0Var != null) {
            this.K.b(ob0Var.c(), i, ob0Var.b());
        }
    }

    @u1
    private void k(@x1 Intent intent) {
        tb0.c().d(s, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.D.c(new a(this.C.M(), intent.getStringExtra(w)));
    }

    @Override // com.p7700g.p99005.jd0
    public void b(@x1 List<String> workSpecIds) {
        if (workSpecIds.isEmpty()) {
            return;
        }
        for (String str : workSpecIds) {
            tb0.c().a(s, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.C.W(str);
        }
    }

    @Override // com.p7700g.p99005.jc0
    @u1
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        Map.Entry<String, ob0> entry;
        synchronized (this.E) {
            we0 remove = this.H.remove(workSpecId);
            if (remove != null ? this.I.remove(remove) : false) {
                this.J.d(this.I);
            }
        }
        ob0 remove2 = this.G.remove(workSpecId);
        if (workSpecId.equals(this.F) && this.G.size() > 0) {
            Iterator<Map.Entry<String, ob0>> it = this.G.entrySet().iterator();
            Map.Entry<String, ob0> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.F = entry.getKey();
            if (this.K != null) {
                ob0 value = entry.getValue();
                this.K.b(value.c(), value.a(), value.b());
                this.K.e(value.c());
            }
        }
        b bVar = this.K;
        if (remove2 == null || bVar == null) {
            return;
        }
        tb0.c().a(s, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), workSpecId, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.e(remove2.c());
    }

    @Override // com.p7700g.p99005.jd0
    public void f(@x1 List<String> workSpecIds) {
    }

    public rc0 h() {
        return this.C;
    }

    @u1
    public void l(@x1 Intent intent) {
        tb0.c().d(s, "Stopping foreground service", new Throwable[0]);
        b bVar = this.K;
        if (bVar != null) {
            bVar.stop();
        }
    }

    @u1
    public void m() {
        this.K = null;
        synchronized (this.E) {
            this.J.e();
        }
        this.C.J().j(this);
    }

    public void n(@x1 Intent intent) {
        String action = intent.getAction();
        if (x.equals(action)) {
            k(intent);
            j(intent);
        } else if (y.equals(action)) {
            j(intent);
        } else if (z.equals(action)) {
            i(intent);
        } else if (A.equals(action)) {
            l(intent);
        }
    }

    @u1
    public void o(@x1 b callback) {
        if (this.K != null) {
            tb0.c().b(s, "A callback already exists.", new Throwable[0]);
        } else {
            this.K = callback;
        }
    }

    @r2
    public ee0(@x1 Context context, @x1 rc0 workManagerImpl, @x1 kd0 tracker) {
        this.B = context;
        this.E = new Object();
        this.C = workManagerImpl;
        this.D = workManagerImpl.O();
        this.F = null;
        this.G = new LinkedHashMap();
        this.I = new HashSet();
        this.H = new HashMap();
        this.J = tracker;
        this.C.J().c(this);
    }
}
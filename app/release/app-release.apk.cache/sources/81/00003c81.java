package com.p7700g.p99005;

import android.content.Context;
import com.p7700g.p99005.i2;

/* compiled from: SystemAlarmScheduler.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class cd0 implements mc0 {
    private static final String s = tb0.f("SystemAlarmScheduler");
    private final Context t;

    public cd0(@x1 Context context) {
        this.t = context.getApplicationContext();
    }

    private void b(@x1 we0 workSpec) {
        tb0.c().a(s, String.format("Scheduling work with workSpecId %s", workSpec.d), new Throwable[0]);
        this.t.startService(yc0.f(this.t, workSpec.d));
    }

    @Override // com.p7700g.p99005.mc0
    public void a(@x1 we0... workSpecs) {
        for (we0 we0Var : workSpecs) {
            b(we0Var);
        }
    }

    @Override // com.p7700g.p99005.mc0
    public boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.mc0
    public void e(@x1 String workSpecId) {
        this.t.startService(yc0.g(this.t, workSpecId));
    }
}
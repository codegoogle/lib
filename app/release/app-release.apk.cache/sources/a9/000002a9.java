package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import com.p7700g.p99005.bd0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.sf0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.uz;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmService extends uz implements bd0.c {
    private static final String t = tb0.f("SystemAlarmService");
    private bd0 u;
    private boolean v;

    @u1
    private void f() {
        bd0 bd0Var = new bd0(this);
        this.u = bd0Var;
        bd0Var.m(this);
    }

    @Override // com.p7700g.p99005.bd0.c
    @u1
    public void a() {
        this.v = true;
        tb0.c().a(t, "All commands completed in dispatcher", new Throwable[0]);
        sf0.a();
        stopSelf();
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public void onCreate() {
        super.onCreate();
        f();
        this.v = false;
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.v = true;
        this.u.j();
    }

    @Override // com.p7700g.p99005.uz, android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        if (this.v) {
            tb0.c().d(t, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.u.j();
            f();
            this.v = false;
        }
        if (intent != null) {
            this.u.a(intent, startId);
            return 3;
        }
        return 3;
    }
}
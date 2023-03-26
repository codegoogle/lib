package com.p7700g.p99005;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.UUID;

/* compiled from: WorkProgressUpdater.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class vf0 implements zb0 {
    public static final String a = tb0.f("WorkProgressUpdater");
    public final WorkDatabase b;
    public final cg0 c;

    /* compiled from: WorkProgressUpdater.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ UUID s;
        public final /* synthetic */ kb0 t;
        public final /* synthetic */ zf0 u;

        public a(final UUID val$id, final kb0 val$data, final zf0 val$future) {
            this.s = val$id;
            this.t = val$data;
            this.u = val$future;
        }

        @Override // java.lang.Runnable
        public void run() {
            we0 u;
            String uuid = this.s.toString();
            tb0 c = tb0.c();
            String str = vf0.a;
            c.a(str, String.format("Updating progress for %s (%s)", this.s, this.t), new Throwable[0]);
            vf0.this.b.c();
            try {
                u = vf0.this.b.L().u(uuid);
            } finally {
                try {
                    return;
                } finally {
                }
            }
            if (u != null) {
                if (u.e == dc0.a.RUNNING) {
                    vf0.this.b.K().e(new te0(uuid, this.t));
                } else {
                    tb0.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
                }
                this.u.q(null);
                vf0.this.b.A();
                return;
            }
            throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
        }
    }

    public vf0(@x1 WorkDatabase workDatabase, @x1 cg0 taskExecutor) {
        this.b = workDatabase;
        this.c = taskExecutor;
    }

    @Override // com.p7700g.p99005.zb0
    @x1
    public gn2<Void> a(@x1 final Context context, @x1 final UUID id, @x1 final kb0 data) {
        zf0 v = zf0.v();
        this.c.c(new a(id, data, v));
        return v;
    }
}
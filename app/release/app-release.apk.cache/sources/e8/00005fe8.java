package com.p7700g.p99005;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.UUID;

/* compiled from: WorkForegroundUpdater.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class uf0 implements pb0 {
    private static final String a = tb0.f("WMFgUpdater");
    private final cg0 b;
    public final de0 c;
    public final xe0 d;

    /* compiled from: WorkForegroundUpdater.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ zf0 s;
        public final /* synthetic */ UUID t;
        public final /* synthetic */ ob0 u;
        public final /* synthetic */ Context v;

        public a(final zf0 val$future, final UUID val$id, final ob0 val$foregroundInfo, final Context val$context) {
            this.s = val$future;
            this.t = val$id;
            this.u = val$foregroundInfo;
            this.v = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.s.isCancelled()) {
                    String uuid = this.t.toString();
                    dc0.a t = uf0.this.d.t(uuid);
                    if (t != null && !t.f()) {
                        uf0.this.c.a(uuid, this.u);
                        this.v.startService(ee0.c(this.v, uuid, this.u));
                    } else {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                }
                this.s.q(null);
            } catch (Throwable th) {
                this.s.r(th);
            }
        }
    }

    public uf0(@x1 WorkDatabase workDatabase, @x1 de0 foregroundProcessor, @x1 cg0 taskExecutor) {
        this.c = foregroundProcessor;
        this.b = taskExecutor;
        this.d = workDatabase.L();
    }

    @Override // com.p7700g.p99005.pb0
    @x1
    public gn2<Void> a(@x1 final Context context, @x1 final UUID id, @x1 final ob0 foregroundInfo) {
        zf0 v = zf0.v();
        this.b.c(new a(v, id, foregroundInfo, context));
        return v;
    }
}
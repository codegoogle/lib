package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;

/* compiled from: WorkManagerTaskExecutor.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class dg0 implements cg0 {
    private final nf0 a;
    private final Handler b = new Handler(Looper.getMainLooper());
    private final Executor c = new a();

    /* compiled from: WorkManagerTaskExecutor.java */
    /* loaded from: classes.dex */
    public class a implements Executor {
        public a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable command) {
            dg0.this.a(command);
        }
    }

    public dg0(@x1 Executor backgroundExecutor) {
        this.a = new nf0(backgroundExecutor);
    }

    @Override // com.p7700g.p99005.cg0
    public void a(Runnable runnable) {
        this.b.post(runnable);
    }

    @Override // com.p7700g.p99005.cg0
    public Executor b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.cg0
    public void c(Runnable runnable) {
        this.a.execute(runnable);
    }

    @Override // com.p7700g.p99005.cg0
    @x1
    public nf0 d() {
        return this.a;
    }
}
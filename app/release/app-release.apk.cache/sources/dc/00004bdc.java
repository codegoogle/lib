package com.p7700g.p99005;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: ExecutorDelivery.java */
/* loaded from: classes3.dex */
public class k43 implements w43 {
    private final Executor a;

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes3.dex */
    public class a implements Executor {
        public final /* synthetic */ Handler s;

        public a(final Handler val$handler) {
            this.s = val$handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable command) {
            this.s.post(command);
        }
    }

    /* compiled from: ExecutorDelivery.java */
    /* loaded from: classes3.dex */
    public static class b implements Runnable {
        private final t43 s;
        private final v43 t;
        private final Runnable u;

        public b(t43 request, v43 response, Runnable runnable) {
            this.s = request;
            this.t = response;
            this.u = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.s.F()) {
                this.s.i("canceled-at-delivery");
                return;
            }
            if (this.t.b()) {
                this.s.f(this.t.a);
            } else {
                this.s.e(this.t.c);
            }
            if (this.t.d) {
                this.s.b("intermediate-response");
            } else {
                this.s.i(e31.c);
            }
            Runnable runnable = this.u;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public k43(final Handler handler) {
        this.a = new a(handler);
    }

    @Override // com.p7700g.p99005.w43
    public void a(t43<?> request, v43<?> response, Runnable runnable) {
        request.G();
        request.b("post-response");
        this.a.execute(new b(request, response, runnable));
    }

    @Override // com.p7700g.p99005.w43
    public void b(t43<?> request, b53 error) {
        request.b("post-error");
        this.a.execute(new b(request, v43.a(error), null));
    }

    @Override // com.p7700g.p99005.w43
    public void c(t43<?> request, v43<?> response) {
        a(request, response, null);
    }

    public k43(Executor executor) {
        this.a = executor;
    }
}
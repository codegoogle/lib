package com.onesignal;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.anythink.basead.d.g;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.dm3;
import com.p7700g.p99005.fi3;
import com.p7700g.p99005.gi3;
import com.p7700g.p99005.ib0;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.im3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.nb0;
import com.p7700g.p99005.ub0;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.vo4;
import com.p7700g.p99005.yq4;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: OSFocusHandler.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0004J%\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\""}, d2 = {"Lcom/onesignal/OSFocusHandler;", "", "Lcom/p7700g/p99005/yq4;", "l", "()V", "k", "Lcom/p7700g/p99005/ib0;", g.i, "()Lcom/p7700g/p99005/ib0;", "", "i", "()Z", "j", com.anythink.expressad.d.a.b.dH, ij3.b, "p", "", "tag", "", "delay", "Landroid/content/Context;", "context", "n", "(Ljava/lang/String;JLandroid/content/Context;)V", "h", "(Ljava/lang/String;Landroid/content/Context;)V", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "stopRunnable", "<init>", "e", "a", "OnLostFocusWorker", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class OSFocusHandler {
    private static final long a = 1500;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    @NotNull
    public static final a e = new a(null);
    private Runnable f;

    /* compiled from: OSFocusHandler.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/onesignal/OSFocusHandler$OnLostFocusWorker;", "Landroidx/work/Worker;", "Landroidx/work/ListenableWorker$a;", "doWork", "()Landroidx/work/ListenableWorker$a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class OnLostFocusWorker extends Worker {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OnLostFocusWorker(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
            super(context, workerParameters);
            c25.p(context, "context");
            c25.p(workerParameters, "workerParams");
        }

        @Override // androidx.work.Worker
        @NotNull
        public ListenableWorker.a doWork() {
            OSFocusHandler.e.a();
            ListenableWorker.a e = ListenableWorker.a.e();
            c25.o(e, "Result.success()");
            return e;
        }
    }

    /* compiled from: OSFocusHandler.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0007¨\u0006\u000e"}, d2 = {"com/onesignal/OSFocusHandler$a", "", "Lcom/p7700g/p99005/yq4;", "a", "()V", "", "backgrounded", "Z", "completed", "", "stopDelay", "J", "stopped", "<init>", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public final void a() {
            fi3 b = gi3.b();
            if (b == null || b.d() == null) {
                jm3.W2(false);
            }
            jm3.P1(jm3.u0.DEBUG, "OSFocusHandler running onAppLostFocus");
            OSFocusHandler.c = true;
            jm3.M1();
            OSFocusHandler.d = true;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: OSFocusHandler.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/p7700g/p99005/yq4;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class b implements Runnable {
        public static final b s = new b();

        @Override // java.lang.Runnable
        public final void run() {
            OSFocusHandler.b = true;
            jm3.P1(jm3.u0.DEBUG, "OSFocusHandler setting stop state: true");
        }
    }

    private final ib0 g() {
        ib0 b2 = new ib0.a().c(ub0.CONNECTED).b();
        c25.o(b2, "Constraints.Builder()\n  …TED)\n            .build()");
        return b2;
    }

    private final void k() {
        l();
        c = false;
    }

    private final void l() {
        b = false;
        Runnable runnable = this.f;
        if (runnable != null) {
            dm3.b().a(runnable);
        }
    }

    public final void h(@NotNull String str, @NotNull Context context) {
        c25.p(str, "tag");
        c25.p(context, "context");
        im3.a(context).f(str);
    }

    public final boolean i() {
        return c;
    }

    public final boolean j() {
        return d;
    }

    public final void m() {
        k();
        jm3.P1(jm3.u0.DEBUG, "OSFocusHandler running onAppFocus");
        jm3.K1();
    }

    public final void n(@NotNull String str, long j, @NotNull Context context) {
        c25.p(str, "tag");
        c25.p(context, "context");
        vb0 b2 = new vb0.a(OnLostFocusWorker.class).i(g()).k(j, TimeUnit.MILLISECONDS).a(str).b();
        c25.o(b2, "OneTimeWorkRequest.Build…tag)\n            .build()");
        im3.a(context).m(str, nb0.KEEP, b2);
    }

    public final void o() {
        if (b) {
            b = false;
            this.f = null;
            jm3.P1(jm3.u0.DEBUG, "OSFocusHandler running onAppStartFocusLogic");
            jm3.N1();
            return;
        }
        l();
    }

    public final void p() {
        b bVar = b.s;
        dm3.b().c(a, bVar);
        yq4 yq4Var = yq4.a;
        this.f = bVar;
    }
}
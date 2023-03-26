package com.p7700g.p99005;

import android.os.Handler;
import android.os.HandlerThread;
import com.anchorfree.hdr.AFHydra;
import com.onesignal.shortcutbadger.impl.NewHtcHomeBadger;
import com.p7700g.p99005.ky2;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ThreadPoolProvider.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00032\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/p7700g/p99005/ky2;", "", "Lkotlin/Function0;", "Lcom/p7700g/p99005/yq4;", "Lcom/greedygame/commons/Task;", "task", "f", "(Lcom/p7700g/p99005/uz4;)V", "h", "e", "()V", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroid/os/HandlerThread;", com.anythink.basead.d.g.i, "Landroid/os/HandlerThread;", "handlerThread", "Ljava/util/concurrent/ExecutorService;", "i", "Lcom/p7700g/p99005/qo4;", "k", "()Ljava/util/concurrent/ExecutorService;", "executorService", "Ljava/util/concurrent/BlockingQueue;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/BlockingQueue;", "taskQueue", "<init>", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class ky2 {
    private static final long c = 1;
    @NotNull
    private BlockingQueue<Runnable> f = new LinkedBlockingQueue();
    @NotNull
    private final HandlerThread g;
    @NotNull
    private final Handler h;
    @NotNull
    private final qo4 i;
    @NotNull
    public static final a a = new a(null);
    private static int b = Runtime.getRuntime().availableProcessors();
    @NotNull
    private static final TimeUnit d = TimeUnit.SECONDS;
    @NotNull
    private static ky2 e = new ky2();

    /* compiled from: ThreadPoolProvider.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/ky2$a", "", "Lcom/p7700g/p99005/ky2;", "a", "()Lcom/p7700g/p99005/ky2;", "", "KEEP_ALIVE_TIME", "J", "Ljava/util/concurrent/TimeUnit;", "KEEP_ALIVE_TIME_UNIT", "Ljava/util/concurrent/TimeUnit;", "", "NUMBER_OF_CORES", AFHydra.STATUS_IDLE, "threadPoolProvider", "Lcom/p7700g/p99005/ky2;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: ThreadPoolProvider.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/ky2$a$a", "Ljava/util/concurrent/ThreadFactory;", "Ljava/lang/Runnable;", "r", "Ljava/lang/Thread;", "newThread", "(Ljava/lang/Runnable;)Ljava/lang/Thread;", "", "c", "Ljava/lang/String;", "TAG", "", "b", AFHydra.STATUS_IDLE, NewHtcHomeBadger.d, "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
        /* renamed from: com.p7700g.p99005.ky2$a$a */
        /* loaded from: classes3.dex */
        public static final class ThreadFactoryC0206a implements ThreadFactory {
            @NotNull
            public static final ThreadFactoryC0206a a = new ThreadFactoryC0206a();
            private static int b = 1;
            @NotNull
            private static final String c = "BckThFa";

            private ThreadFactoryC0206a() {
            }

            public static /* synthetic */ void a(Thread thread, Thread thread2, Throwable th) {
                b(thread, thread2, th);
            }

            public static final void b(Thread thread, Thread thread2, Throwable th) {
                c25.p(thread, "$thread");
                String C = c25.C(thread.getName(), " encountered an error: ");
                c25.o(th, "ex");
                xz2.b(c, C, th);
            }

            @Override // java.util.concurrent.ThreadFactory
            @NotNull
            public Thread newThread(@Nullable Runnable runnable) {
                final Thread thread = new Thread(runnable);
                thread.setName(c25.C("GGBackground", Integer.valueOf(b)));
                thread.setPriority(10);
                xz2.c(c, c25.C(thread.getName(), " created"));
                thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.p7700g.p99005.tx2
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread2, Throwable th) {
                        ky2.a.ThreadFactoryC0206a.a(thread, thread2, th);
                    }
                });
                b++;
                return thread;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @jz4
        @NotNull
        public final ky2 a() {
            return ky2.e;
        }
    }

    /* compiled from: ThreadPoolProvider.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/util/concurrent/ThreadPoolExecutor;", "<anonymous>", "()Ljava/util/concurrent/ThreadPoolExecutor;"}, k = 3, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<ThreadPoolExecutor> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b() {
            super(0);
            ky2.this = r1;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final ThreadPoolExecutor x() {
            return new ThreadPoolExecutor(ky2.b, ky2.b * 2, 1L, ky2.d, ky2.this.f, a.ThreadFactoryC0206a.a);
        }
    }

    private ky2() {
        HandlerThread handlerThread = new HandlerThread("GGBGThread");
        this.g = handlerThread;
        handlerThread.start();
        this.h = new Handler(handlerThread.getLooper());
        this.i = so4.c(new b());
    }

    public static final void g(uz4 uz4Var) {
        c25.p(uz4Var, "$tmp0");
        uz4Var.x();
    }

    public static final void i(uz4 uz4Var) {
        c25.p(uz4Var, "$tmp0");
        uz4Var.x();
    }

    @jz4
    @NotNull
    public static final ky2 j() {
        return a.a();
    }

    private final ExecutorService k() {
        return (ExecutorService) this.i.getValue();
    }

    public static /* synthetic */ void l(uz4 uz4Var) {
        i(uz4Var);
    }

    public static /* synthetic */ void m(uz4 uz4Var) {
        g(uz4Var);
    }

    public final void e() {
        this.f.clear();
    }

    public final void f(@NotNull final uz4<yq4> uz4Var) {
        c25.p(uz4Var, "task");
        k().execute(new Runnable() { // from class: com.p7700g.p99005.vx2
            @Override // java.lang.Runnable
            public final void run() {
                ky2.m(uz4.this);
            }
        });
    }

    public final void h(@NotNull final uz4<yq4> uz4Var) {
        c25.p(uz4Var, "task");
        this.h.post(new Runnable() { // from class: com.p7700g.p99005.ux2
            @Override // java.lang.Runnable
            public final void run() {
                ky2.l(uz4.this);
            }
        });
    }
}
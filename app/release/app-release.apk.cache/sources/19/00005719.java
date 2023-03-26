package com.p7700g.p99005;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import com.anchorfree.hdr.AFHydra;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ANRWatchDog.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\r\u0018\u0000 82\u00020\u0001:\u00039\u0014\u0007B\u0013\b\u0007\u0012\b\b\u0002\u00100\u001a\u00020-¢\u0006\u0004\b6\u00107J\u0017\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010)\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00102\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010+R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u0006:"}, d2 = {"Lcom/p7700g/p99005/py2;", "Ljava/lang/Thread;", "Lcom/p7700g/p99005/py2$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Lcom/p7700g/p99005/py2$a;)Lcom/p7700g/p99005/py2;", "Lcom/p7700g/p99005/py2$e;", "e", "(Lcom/p7700g/p99005/py2$e;)Lcom/p7700g/p99005/py2;", "", "prefix", "h", "(Ljava/lang/String;)Lcom/p7700g/p99005/py2;", com.anythink.basead.d.g.i, "()Lcom/p7700g/p99005/py2;", "", "logThreadsWithoutStackTrace", "f", "(Z)Lcom/p7700g/p99005/py2;", "ignoreDebugger", "d", "Lcom/p7700g/p99005/yq4;", "run", "()V", "Landroid/os/Handler;", "z", "Landroid/os/Handler;", "_uiHandler", bx.B4, "Ljava/lang/String;", "_namePrefix", "", "D", AFHydra.STATUS_IDLE, "_tick", "Ljava/lang/Runnable;", "E", "Ljava/lang/Runnable;", "_ticker", "x", "Lcom/p7700g/p99005/py2$a;", "_anrListener", AFHydra.EV_BYTECOUNT, "Z", "_logThreadsWithoutStackTrace", "", "w", "J", "_timeoutInterval", "C", "_ignoreDebugger", "y", "Lcom/p7700g/p99005/py2$e;", "_interruptionListener", "<init>", "(J)V", "s", "a", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class py2 extends Thread {
    private static final long t = 5000;
    @Nullable
    private String A;
    private boolean B;
    private boolean C;
    private volatile int D;
    @NotNull
    private final Runnable E;
    private final long w;
    @NotNull
    private a x;
    @NotNull
    private e y;
    @NotNull
    private final Handler z;
    @NotNull
    public static final d s = new d(null);
    @NotNull
    private static final a u = new b();
    @NotNull
    private static final e v = new c();

    /* compiled from: ANRWatchDog.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/py2$a", "", "Lcom/p7700g/p99005/oy2;", "error", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/oy2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface a {
        void a(@NotNull oy2 oy2Var);
    }

    /* compiled from: ANRWatchDog.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/py2$b", "Lcom/p7700g/p99005/py2$a;", "Lcom/p7700g/p99005/oy2;", "error", "Lcom/p7700g/p99005/yq4;", "a", "(Lcom/p7700g/p99005/oy2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b implements a {
        @Override // com.p7700g.p99005.py2.a
        public void a(@NotNull oy2 oy2Var) {
            c25.p(oy2Var, "error");
            throw oy2Var;
        }
    }

    /* compiled from: ANRWatchDog.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/py2$c", "Lcom/p7700g/p99005/py2$e;", "Ljava/lang/InterruptedException;", "exception", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/InterruptedException;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class c implements e {
        @Override // com.p7700g.p99005.py2.e
        public void a(@NotNull InterruptedException interruptedException) {
            c25.p(interruptedException, "exception");
            c25.C("Interrupted: ", interruptedException.getMessage());
        }
    }

    /* compiled from: ANRWatchDog.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"com/p7700g/p99005/py2$d", "", "Lcom/p7700g/p99005/py2$a;", "DEFAULT_ANR_LISTENER", "Lcom/p7700g/p99005/py2$a;", "", "DEFAULT_ANR_TIMEOUT", "J", "Lcom/p7700g/p99005/py2$e;", "DEFAULT_INTERRUPTION_LISTENER", "Lcom/p7700g/p99005/py2$e;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ANRWatchDog.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/py2$e", "", "Ljava/lang/InterruptedException;", "exception", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/InterruptedException;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public interface e {
        void a(@NotNull InterruptedException interruptedException);
    }

    @gz4
    public py2() {
        this(0L, 1, null);
    }

    @gz4
    public py2(long j) {
        this.w = j;
        this.x = u;
        this.y = v;
        this.z = new Handler(Looper.getMainLooper());
        this.A = "";
        this.E = new Runnable() { // from class: com.p7700g.p99005.ny2
            @Override // java.lang.Runnable
            public final void run() {
                py2.b(py2.this);
            }
        };
    }

    public static final void a(py2 py2Var) {
        c25.p(py2Var, "this$0");
        py2Var.D = (py2Var.D + 1) % Integer.MAX_VALUE;
    }

    public static /* synthetic */ void b(py2 py2Var) {
        a(py2Var);
    }

    @NotNull
    public final py2 c(@Nullable a aVar) {
        if (aVar == null) {
            aVar = u;
        }
        this.x = aVar;
        return this;
    }

    @NotNull
    public final py2 d(boolean z) {
        this.C = z;
        return this;
    }

    @NotNull
    public final py2 e(@Nullable e eVar) {
        if (eVar == null) {
            eVar = v;
        }
        this.y = eVar;
        return this;
    }

    @NotNull
    public final py2 f(boolean z) {
        this.B = z;
        return this;
    }

    @NotNull
    public final py2 g() {
        this.A = null;
        return this;
    }

    @NotNull
    public final py2 h(@Nullable String str) {
        if (str == null) {
            str = "";
        }
        this.A = str;
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        oy2 f;
        setName("|ANR-WatchDog|");
        while (!isInterrupted()) {
            int i = this.D;
            this.z.post(this.E);
            try {
                Thread.sleep(this.w);
                if (this.D == i) {
                    if (!this.C && Debug.isDebuggerConnected()) {
                        int i2 = this.D;
                        int i3 = this.D;
                    } else {
                        String str = this.A;
                        if (str != null) {
                            c25.m(str);
                            f = oy2.a(str, this.B);
                            c25.o(f, "New(_namePrefix!!, _logThreadsWithoutStackTrace)");
                        } else {
                            f = oy2.f();
                            c25.o(f, "NewMainOnly()");
                        }
                        this.x.a(f);
                        return;
                    }
                }
            } catch (InterruptedException e2) {
                this.y.a(e2);
                return;
            }
        }
    }

    public /* synthetic */ py2(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? t : j);
    }
}
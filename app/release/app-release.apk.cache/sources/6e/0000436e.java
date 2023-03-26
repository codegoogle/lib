package com.p7700g.p99005;

import android.os.CountDownTimer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: PausableCountDownTimer.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0004J\r\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u001a\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0019\u0010\u0004\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR(\u0010 \u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001b\u0012\u0004\b\u001f\u0010\u0004\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR(\u0010)\u001a\u00020!8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\"\u0010#\u0012\u0004\b(\u0010\u0004\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0013\u0010+\u001a\u00020!8F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010%R\u0016\u0010\u000e\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006."}, d2 = {"Lcom/p7700g/p99005/fy2;", "", "Lcom/p7700g/p99005/yq4;", "j", "()V", "", "millisUntilFinished", "k", "(J)V", "l", com.anythink.expressad.d.a.b.dH, "q", "()Lcom/p7700g/p99005/fy2;", "a", "millisInFuture", "interval", "Landroid/os/CountDownTimer;", "c", "(JJ)Landroid/os/CountDownTimer;", com.anythink.basead.d.g.i, "Landroid/os/CountDownTimer;", "d", "()Landroid/os/CountDownTimer;", "n", "(Landroid/os/CountDownTimer;)V", "getMCountDownTimer$annotations", "mCountDownTimer", "J", "f", "()J", ij3.b, "getMMillisUntilFinished$annotations", "mMillisUntilFinished", "", "e", "Z", "h", "()Z", "p", "(Z)V", "isTimerActive$annotations", "isTimerActive", "b", "canResume", "<init>", "(JJ)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public abstract class fy2 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    public static final String b = "PausableCountDownTimer";
    private final long c;
    private final long d;
    private boolean e;
    private long f = -1;
    @NotNull
    private CountDownTimer g;

    /* compiled from: PausableCountDownTimer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/fy2$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PausableCountDownTimer.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p7700g/p99005/fy2$b", "Landroid/os/CountDownTimer;", "Lcom/p7700g/p99005/yq4;", "onFinish", "()V", "", "millisUntilFinished", "onTick", "(J)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends CountDownTimer {
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, long j2) {
            super(j, j2);
            this.b = j;
            this.c = j2;
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            fy2.this.j();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j) {
            fy2.this.o(j);
            fy2.this.k(j);
        }
    }

    public fy2(long j, long j2) {
        this.c = j;
        this.d = j2;
        this.g = c(j, j2);
    }

    @r2(otherwise = 2)
    public static /* synthetic */ void e() {
    }

    @r2(otherwise = 2)
    public static /* synthetic */ void g() {
    }

    @r2(otherwise = 2)
    public static /* synthetic */ void i() {
    }

    public final void a() {
        this.f = -1L;
        this.g.cancel();
    }

    public final boolean b() {
        return this.f > 0 && !this.e;
    }

    @r2(otherwise = 2)
    @NotNull
    public final CountDownTimer c(long j, long j2) {
        return new b(j, j2);
    }

    @NotNull
    public final CountDownTimer d() {
        return this.g;
    }

    public final long f() {
        return this.f;
    }

    public final boolean h() {
        return this.e;
    }

    public abstract void j();

    public abstract void k(long j);

    public final void l() {
        this.g.cancel();
        this.e = false;
    }

    public final void m() {
        if (b()) {
            this.e = true;
            this.g = c(this.f, this.d);
            q();
        }
    }

    public final void n(@NotNull CountDownTimer countDownTimer) {
        c25.p(countDownTimer, "<set-?>");
        this.g = countDownTimer;
    }

    public final void o(long j) {
        this.f = j;
    }

    public final void p(boolean z) {
        this.e = z;
    }

    @NotNull
    public final fy2 q() {
        xz2.c(b, "Timer starting");
        this.g.start();
        this.e = true;
        return this;
    }
}
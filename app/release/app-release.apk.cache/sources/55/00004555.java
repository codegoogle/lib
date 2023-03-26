package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Timer.kt */
@fz4(name = "TimersKt")
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001aM\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001aO\u0010\u0010\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a'\u0010\u0011\u001a\u00020\f2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0012\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u001a;\u0010\u0015\u001a\u00020\f*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0019\b\u0004\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0016"}, d2 = {"fixedRateTimer", "Ljava/util/Timer;", "name", "", "daemon", "", "startAt", "Ljava/util/Date;", aa.c.Q, "", "action", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "initialDelay", "timer", "timerTask", "schedule", "time", "delay", "scheduleAtFixedRate", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class gv4 {

    /* compiled from: Timer.kt */
    @vo4(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"kotlin/concurrent/TimersKt$timerTask$1", "Ljava/util/TimerTask;", "run", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 176)
    /* loaded from: classes3.dex */
    public static final class a extends TimerTask {
        public final /* synthetic */ f05<TimerTask, yq4> s;

        /* JADX WARN: Multi-variable type inference failed */
        public a(f05<? super TimerTask, yq4> f05Var) {
            this.s = f05Var;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.s.M(this);
        }
    }

    @dx4
    private static final Timer a(String str, boolean z, long j, long j2, f05<? super TimerTask, yq4> f05Var) {
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(f05Var), j, j2);
        return k;
    }

    @dx4
    private static final Timer b(String str, boolean z, Date date, long j, f05<? super TimerTask, yq4> f05Var) {
        c25.p(date, "startAt");
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(f05Var), date, j);
        return k;
    }

    public static /* synthetic */ Timer c(String str, boolean z, long j, long j2, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(f05Var), j, j2);
        return k;
    }

    public static /* synthetic */ Timer d(String str, boolean z, Date date, long j, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c25.p(date, "startAt");
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.scheduleAtFixedRate(new a(f05Var), date, j);
        return k;
    }

    @dx4
    private static final TimerTask e(Timer timer, long j, long j2, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.schedule(aVar, j, j2);
        return aVar;
    }

    @dx4
    private static final TimerTask f(Timer timer, long j, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.schedule(aVar, j);
        return aVar;
    }

    @dx4
    private static final TimerTask g(Timer timer, Date date, long j, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(date, "time");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.schedule(aVar, date, j);
        return aVar;
    }

    @dx4
    private static final TimerTask h(Timer timer, Date date, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(date, "time");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.schedule(aVar, date);
        return aVar;
    }

    @dx4
    private static final TimerTask i(Timer timer, long j, long j2, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.scheduleAtFixedRate(aVar, j, j2);
        return aVar;
    }

    @dx4
    private static final TimerTask j(Timer timer, Date date, long j, f05<? super TimerTask, yq4> f05Var) {
        c25.p(timer, "<this>");
        c25.p(date, "time");
        c25.p(f05Var, "action");
        a aVar = new a(f05Var);
        timer.scheduleAtFixedRate(aVar, date, j);
        return aVar;
    }

    @np4
    @NotNull
    public static final Timer k(@Nullable String str, boolean z) {
        return str == null ? new Timer(z) : new Timer(str, z);
    }

    @dx4
    private static final Timer l(String str, boolean z, long j, long j2, f05<? super TimerTask, yq4> f05Var) {
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.schedule(new a(f05Var), j, j2);
        return k;
    }

    @dx4
    private static final Timer m(String str, boolean z, Date date, long j, f05<? super TimerTask, yq4> f05Var) {
        c25.p(date, "startAt");
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.schedule(new a(f05Var), date, j);
        return k;
    }

    public static /* synthetic */ Timer n(String str, boolean z, long j, long j2, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 0;
        }
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.schedule(new a(f05Var), j, j2);
        return k;
    }

    public static /* synthetic */ Timer o(String str, boolean z, Date date, long j, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        c25.p(date, "startAt");
        c25.p(f05Var, "action");
        Timer k = k(str, z);
        k.schedule(new a(f05Var), date, j);
        return k;
    }

    @dx4
    private static final TimerTask p(f05<? super TimerTask, yq4> f05Var) {
        c25.p(f05Var, "action");
        return new a(f05Var);
    }
}
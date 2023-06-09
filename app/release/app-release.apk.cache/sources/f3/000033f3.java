package com.ironsource.lifecycle;

import com.p7700g.p99005.c25;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;

@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ironsource/lifecycle/ForegroundTimeCalculator;", "Lcom/ironsource/lifecycle/IronsourceLifecycleListener;", "task", "Lcom/ironsource/lifecycle/SessionCalcTask;", "(Lcom/ironsource/lifecycle/SessionCalcTask;)V", "sessionStartTime", "", "appPaused", "", "appResumed", "appStarted", "appStopped", "getSessionTime", "updateSessionStartTime", "environment_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements c {
    @NotNull
    private final g a;
    private long b;

    public a(@NotNull g gVar) {
        c25.p(gVar, "task");
        this.a = gVar;
        d.a().a(this);
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void a() {
        this.b = System.currentTimeMillis();
    }

    @Override // com.ironsource.lifecycle.c
    public final void b() {
        this.a.s = Long.valueOf(System.currentTimeMillis() - this.b);
        this.a.run();
    }
}
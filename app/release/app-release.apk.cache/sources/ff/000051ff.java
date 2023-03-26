package com.p7700g.p99005;

import com.p7700g.p99005.ba5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSource.kt */
@v95
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\u0004H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0007J\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0004H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", com.anythink.expressad.foundation.d.h.cE, "adjustment", "Lkotlin/time/Duration;", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAdjustment-UwyO8pc", "()J", "J", "getMark", "()Lkotlin/time/TimeMark;", "elapsedNow", "elapsedNow-UwyO8pc", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class n95 implements ba5 {
    @NotNull
    private final ba5 a;
    private final long b;

    private n95(ba5 ba5Var, long j) {
        this.a = ba5Var;
        this.b = j;
    }

    public /* synthetic */ n95(ba5 ba5Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(ba5Var, j);
    }

    @Override // com.p7700g.p99005.ba5
    public boolean a() {
        return ba5.a.b(this);
    }

    @Override // com.p7700g.p99005.ba5
    @NotNull
    public ba5 b(long j) {
        return ba5.a.c(this, j);
    }

    @Override // com.p7700g.p99005.ba5
    public long c() {
        return o95.Y0(this.a.c(), this.b);
    }

    @Override // com.p7700g.p99005.ba5
    public boolean d() {
        return ba5.a.a(this);
    }

    @Override // com.p7700g.p99005.ba5
    @NotNull
    public ba5 e(long j) {
        return new n95(this.a, o95.a1(this.b, j), null);
    }

    public final long f() {
        return this.b;
    }

    @NotNull
    public final ba5 g() {
        return this.a;
    }
}
package com.p7700g.p99005;

import com.p7700g.p99005.ba5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSources.kt */
@v95
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "markNow", "Lkotlin/time/TimeMark;", "read", "", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public abstract class l95 implements ca5 {
    @NotNull
    private final r95 b;

    /* compiled from: TimeSources.kt */
    @vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0007H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/TimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractDoubleTimeSource;", "offset", "Lkotlin/time/Duration;", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ba5 {
        private final double a;
        @NotNull
        private final l95 b;
        private final long c;

        private a(double d, l95 l95Var, long j) {
            this.a = d;
            this.b = l95Var;
            this.c = j;
        }

        public /* synthetic */ a(double d, l95 l95Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(d, l95Var, j);
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
            return o95.Y0(q95.l0(this.b.c() - this.a, this.b.b()), this.c);
        }

        @Override // com.p7700g.p99005.ba5
        public boolean d() {
            return ba5.a.a(this);
        }

        @Override // com.p7700g.p99005.ba5
        @NotNull
        public ba5 e(long j) {
            return new a(this.a, this.b, o95.a1(this.c, j), null);
        }
    }

    public l95(@NotNull r95 r95Var) {
        c25.p(r95Var, "unit");
        this.b = r95Var;
    }

    @Override // com.p7700g.p99005.ca5
    @NotNull
    public ba5 a() {
        return new a(c(), this, o95.s.W(), null);
    }

    @NotNull
    public final r95 b() {
        return this.b;
    }

    public abstract double c();
}
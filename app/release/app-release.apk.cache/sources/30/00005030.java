package com.p7700g.p99005;

import com.p7700g.p99005.ba5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeSources.kt */
@v95
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\nH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "markNow", "Lkotlin/time/TimeMark;", "read", "", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public abstract class m95 implements ca5 {
    @NotNull
    private final r95 b;

    /* compiled from: TimeSources.kt */
    @vo4(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0015\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0007H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/TimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ba5 {
        private final long a;
        @NotNull
        private final m95 b;
        private final long c;

        private a(long j, m95 m95Var, long j2) {
            this.a = j;
            this.b = m95Var;
            this.c = j2;
        }

        public /* synthetic */ a(long j, m95 m95Var, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, m95Var, j2);
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
            return o95.Y0(q95.n0(this.b.c() - this.a, this.b.b()), this.c);
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

    public m95(@NotNull r95 r95Var) {
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

    public abstract long c();
}
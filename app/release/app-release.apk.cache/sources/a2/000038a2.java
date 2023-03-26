package com.p7700g.p99005;

/* compiled from: TimeSources.kt */
@v95
@vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.3")
/* loaded from: classes3.dex */
public final class aa5 extends m95 {
    private long c;

    public aa5() {
        super(r95.NANOSECONDS);
    }

    private final void d(long j) {
        StringBuilder G = wo1.G("TestTimeSource will overflow if its reading ");
        G.append(this.c);
        G.append("ns is advanced by ");
        G.append((Object) o95.L1(j));
        G.append('.');
        throw new IllegalStateException(G.toString());
    }

    @Override // com.p7700g.p99005.m95
    public long c() {
        return this.c;
    }

    public final void e(long j) {
        long j2;
        long H1 = o95.H1(j, b());
        if (H1 != Long.MIN_VALUE && H1 != Long.MAX_VALUE) {
            long j3 = this.c;
            j2 = j3 + H1;
            if ((H1 ^ j3) >= 0 && (j3 ^ j2) < 0) {
                d(j);
            }
        } else {
            double w1 = this.c + o95.w1(j, b());
            if (w1 > 9.223372036854776E18d || w1 < -9.223372036854776E18d) {
                d(j);
            }
            j2 = (long) w1;
        }
        this.c = j2;
    }
}
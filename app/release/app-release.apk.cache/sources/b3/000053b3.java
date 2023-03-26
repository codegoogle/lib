package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ULongRange.kt */
@dr4(markerClass = {go4.class})
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/ULongRange;", "Lkotlin/ranges/ULongProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/ULong;", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-s-VKNKU", "()J", "getStart-s-VKNKU", "contains", "", "value", "contains-VKZWuLQ", "(J)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.5")
/* loaded from: classes3.dex */
public final class o55 extends m55 implements y45<nq4> {
    @NotNull
    public static final a w = new a(null);
    @NotNull
    private static final o55 x = new o55(-1, 0, null);

    /* compiled from: ULongRange.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/ULongRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/ULongRange;", "getEMPTY", "()Lkotlin/ranges/ULongRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final o55 a() {
            return o55.x;
        }
    }

    private o55(long j, long j2) {
        super(j, j2, 1L, null);
    }

    public /* synthetic */ o55(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ boolean a(nq4 nq4Var) {
        return n(nq4Var.n1());
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ nq4 c() {
        return nq4.b(p());
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ nq4 d() {
        return nq4.b(o());
    }

    @Override // com.p7700g.p99005.m55
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof o55) {
            if (!isEmpty() || !((o55) obj).isEmpty()) {
                o55 o55Var = (o55) obj;
                if (e() != o55Var.e() || h() != o55Var.h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.m55
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return ((int) nq4.h(h() ^ nq4.h(h() >>> 32))) + (((int) nq4.h(e() ^ nq4.h(e() >>> 32))) * 31);
    }

    @Override // com.p7700g.p99005.m55, com.p7700g.p99005.y45
    public boolean isEmpty() {
        return br4.g(e(), h()) > 0;
    }

    public boolean n(long j) {
        return br4.g(e(), j) <= 0 && br4.g(j, h()) <= 0;
    }

    public long o() {
        return h();
    }

    public long p() {
        return e();
    }

    @Override // com.p7700g.p99005.m55
    @NotNull
    public String toString() {
        return ((Object) nq4.X0(e())) + ".." + ((Object) nq4.X0(h()));
    }
}
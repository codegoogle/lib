package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIntRange.kt */
@dr4(markerClass = {go4.class})
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0018\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001b\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\bø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntRange;", "Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ClosedRange;", "Lkotlin/UInt;", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEndInclusive-pVg5ArA", "()I", "getStart-pVg5ArA", "contains", "", "value", "contains-WZ4Q5Ns", "(I)Z", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.5")
/* loaded from: classes3.dex */
public final class l55 extends j55 implements y45<jq4> {
    @NotNull
    public static final a w = new a(null);
    @NotNull
    private static final l55 x = new l55(-1, 0, null);

    /* compiled from: UIntRange.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/UIntRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/UIntRange;", "getEMPTY", "()Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final l55 a() {
            return l55.x;
        }
    }

    private l55(int i, int i2) {
        super(i, i2, 1, null);
    }

    public /* synthetic */ l55(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ boolean a(jq4 jq4Var) {
        return n(jq4Var.n1());
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ jq4 c() {
        return jq4.b(p());
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ jq4 d() {
        return jq4.b(o());
    }

    @Override // com.p7700g.p99005.j55
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof l55) {
            if (!isEmpty() || !((l55) obj).isEmpty()) {
                l55 l55Var = (l55) obj;
                if (e() != l55Var.e() || h() != l55Var.h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.j55
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + h();
    }

    @Override // com.p7700g.p99005.j55, com.p7700g.p99005.y45
    public boolean isEmpty() {
        return br4.c(e(), h()) > 0;
    }

    public boolean n(int i) {
        return br4.c(e(), i) <= 0 && br4.c(i, h()) <= 0;
    }

    public int o() {
        return h();
    }

    public int p() {
        return e();
    }

    @Override // com.p7700g.p99005.j55
    @NotNull
    public String toString() {
        return ((Object) jq4.X0(e())) + ".." + ((Object) jq4.X0(h()));
    }
}
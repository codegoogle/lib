package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\u0011\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002J\u0013\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, d2 = {"Lkotlin/ranges/CharRange;", "Lkotlin/ranges/CharProgression;", "Lkotlin/ranges/ClosedRange;", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(CC)V", "getEndInclusive", "()Ljava/lang/Character;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class u45 extends s45 implements y45<Character> {
    @NotNull
    public static final a w = new a(null);
    @NotNull
    private static final u45 x = new u45(1, 0);

    /* compiled from: Ranges.kt */
    @vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/ranges/CharRange$Companion;", "", "()V", "EMPTY", "Lkotlin/ranges/CharRange;", "getEMPTY", "()Lkotlin/ranges/CharRange;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final u45 a() {
            return u45.x;
        }
    }

    public u45(char c, char c2) {
        super(c, c2, 1);
    }

    @Override // com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ boolean a(Character ch) {
        return o(ch.charValue());
    }

    @Override // com.p7700g.p99005.s45
    public boolean equals(@Nullable Object obj) {
        if (obj instanceof u45) {
            if (!isEmpty() || !((u45) obj).isEmpty()) {
                u45 u45Var = (u45) obj;
                if (e() != u45Var.e() || h() != u45Var.h()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.p7700g.p99005.s45
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (e() * 31) + h();
    }

    @Override // com.p7700g.p99005.s45, com.p7700g.p99005.y45
    public boolean isEmpty() {
        return c25.t(e(), h()) > 0;
    }

    public boolean o(char c) {
        return c25.t(e(), c) <= 0 && c25.t(c, h()) <= 0;
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: p */
    public Character d() {
        return Character.valueOf(h());
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: t */
    public Character c() {
        return Character.valueOf(e());
    }

    @Override // com.p7700g.p99005.s45
    @NotNull
    public String toString() {
        return e() + ".." + h();
    }
}
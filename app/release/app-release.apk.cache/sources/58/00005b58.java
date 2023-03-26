package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\t\u0010\u0015\u001a\u00020\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lkotlin/ranges/CharProgression;", "", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "step", "", "(CCI)V", "first", "getFirst", "()C", "last", "getLast", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/CharIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class s45 implements Iterable<Character>, n35 {
    @NotNull
    public static final a s = new a(null);
    private final char t;
    private final char u;
    private final int v;

    /* compiled from: Progressions.kt */
    @vo4(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lkotlin/ranges/CharProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/CharProgression;", "rangeStart", "", "rangeEnd", "step", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s45 a(char c, char c2, int i) {
            return new s45(c, c2, i);
        }
    }

    public s45(char c, char c2, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Integer.MIN_VALUE) {
            this.t = c;
            this.u = (char) lx4.c(c, c2, i);
            this.v = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final char e() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof s45) {
            if (!isEmpty() || !((s45) obj).isEmpty()) {
                s45 s45Var = (s45) obj;
                if (this.t != s45Var.t || this.u != s45Var.u || this.v != s45Var.v) {
                }
            }
            return true;
        }
        return false;
    }

    public final char h() {
        return this.u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.t * 31) + this.u) * 31) + this.v;
    }

    public final int i() {
        return this.v;
    }

    public boolean isEmpty() {
        if (this.v > 0) {
            if (c25.t(this.t, this.u) > 0) {
                return true;
            }
        } else if (c25.t(this.t, this.u) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: m */
    public fs4 iterator() {
        return new t45(this.t, this.u, this.v);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.v > 0) {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append("..");
            sb.append(this.u);
            sb.append(" step ");
            i = this.v;
        } else {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append(" downTo ");
            sb.append(this.u);
            sb.append(" step ");
            i = -this.v;
        }
        sb.append(i);
        return sb.toString();
    }
}
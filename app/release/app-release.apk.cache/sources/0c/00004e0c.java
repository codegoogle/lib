package com.p7700g.p99005;

import com.anythink.expressad.foundation.c.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: KTypeProjection.kt */
@vo4(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/reflect/KTypeProjection;", "", "variance", "Lkotlin/reflect/KVariance;", "type", "Lkotlin/reflect/KType;", "(Lkotlin/reflect/KVariance;Lkotlin/reflect/KType;)V", "getType", "()Lkotlin/reflect/KType;", "getVariance", "()Lkotlin/reflect/KVariance;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.1")
/* loaded from: classes3.dex */
public final class l65 {
    @NotNull
    public static final a a = new a(null);
    @cz4
    @NotNull
    public static final l65 b = new l65(null, null);
    @Nullable
    private final m65 c;
    @Nullable
    private final j65 d;

    /* compiled from: KTypeProjection.kt */
    @vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0002¨\u0006\u000e"}, d2 = {"Lkotlin/reflect/KTypeProjection$Companion;", "", "()V", "STAR", "Lkotlin/reflect/KTypeProjection;", "getSTAR", "()Lkotlin/reflect/KTypeProjection;", d.a.t, "getStar$annotations", "contravariant", "type", "Lkotlin/reflect/KType;", "covariant", "invariant", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @np4
        public static /* synthetic */ void d() {
        }

        @jz4
        @NotNull
        public final l65 a(@NotNull j65 j65Var) {
            c25.p(j65Var, "type");
            return new l65(m65.IN, j65Var);
        }

        @jz4
        @NotNull
        public final l65 b(@NotNull j65 j65Var) {
            c25.p(j65Var, "type");
            return new l65(m65.OUT, j65Var);
        }

        @NotNull
        public final l65 c() {
            return l65.b;
        }

        @jz4
        @NotNull
        public final l65 e(@NotNull j65 j65Var) {
            c25.p(j65Var, "type");
            return new l65(m65.INVARIANT, j65Var);
        }
    }

    /* compiled from: KTypeProjection.kt */
    @vo4(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            m65.values();
            int[] iArr = new int[3];
            iArr[m65.INVARIANT.ordinal()] = 1;
            iArr[m65.IN.ordinal()] = 2;
            iArr[m65.OUT.ordinal()] = 3;
            a = iArr;
        }
    }

    public l65(@Nullable m65 m65Var, @Nullable j65 j65Var) {
        String str;
        this.c = m65Var;
        this.d = j65Var;
        if ((m65Var == null) == (j65Var == null)) {
            return;
        }
        if (m65Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + m65Var + " requires type to be specified.";
        }
        throw new IllegalArgumentException(str.toString());
    }

    @jz4
    @NotNull
    public static final l65 c(@NotNull j65 j65Var) {
        return a.a(j65Var);
    }

    public static /* synthetic */ l65 e(l65 l65Var, m65 m65Var, j65 j65Var, int i, Object obj) {
        if ((i & 1) != 0) {
            m65Var = l65Var.c;
        }
        if ((i & 2) != 0) {
            j65Var = l65Var.d;
        }
        return l65Var.d(m65Var, j65Var);
    }

    @jz4
    @NotNull
    public static final l65 f(@NotNull j65 j65Var) {
        return a.b(j65Var);
    }

    @jz4
    @NotNull
    public static final l65 i(@NotNull j65 j65Var) {
        return a.e(j65Var);
    }

    @Nullable
    public final m65 a() {
        return this.c;
    }

    @Nullable
    public final j65 b() {
        return this.d;
    }

    @NotNull
    public final l65 d(@Nullable m65 m65Var, @Nullable j65 j65Var) {
        return new l65(m65Var, j65Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l65) {
            l65 l65Var = (l65) obj;
            return this.c == l65Var.c && c25.g(this.d, l65Var.d);
        }
        return false;
    }

    @Nullable
    public final j65 g() {
        return this.d;
    }

    @Nullable
    public final m65 h() {
        return this.c;
    }

    public int hashCode() {
        m65 m65Var = this.c;
        int hashCode = (m65Var == null ? 0 : m65Var.hashCode()) * 31;
        j65 j65Var = this.d;
        return hashCode + (j65Var != null ? j65Var.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        m65 m65Var = this.c;
        int i = m65Var == null ? -1 : b.a[m65Var.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i == 2) {
                    StringBuilder G = wo1.G("in ");
                    G.append(this.d);
                    return G.toString();
                } else if (i == 3) {
                    StringBuilder G2 = wo1.G("out ");
                    G2.append(this.d);
                    return G2.toString();
                } else {
                    throw new wo4();
                }
            }
            return String.valueOf(this.d);
        }
        return tm4.g;
    }
}
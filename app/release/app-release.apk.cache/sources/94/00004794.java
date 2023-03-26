package com.p7700g.p99005;

import android.graphics.Color;
import com.anchorfree.hdr.AFHydra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PaletteData.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000f\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010\u000b¨\u0006#"}, d2 = {"Lcom/p7700g/p99005/hz2;", "", "", "a", "()I", "b", "Lcom/p7700g/p99005/pz2;", "c", "()Lcom/p7700g/p99005/pz2;", "Lcom/p7700g/p99005/iz2;", "d", "()Lcom/p7700g/p99005/iz2;", "dominantColor", "bgColor", "palette", "specifics", "e", "(IILcom/p7700g/p99005/pz2;Lcom/p7700g/p99005/iz2;)Lcom/p7700g/p99005/hz2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/p7700g/p99005/pz2;", "i", AFHydra.STATUS_IDLE, "h", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/iz2;", "j", "<init>", "(IILcom/p7700g/p99005/pz2;Lcom/p7700g/p99005/iz2;)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class hz2 {
    private final int a;
    private final int b;
    @Nullable
    private final pz2 c;
    @NotNull
    private final iz2 d;

    public hz2() {
        this(0, 0, null, null, 15, null);
    }

    public hz2(int i, int i2, @Nullable pz2 pz2Var, @NotNull iz2 iz2Var) {
        c25.p(iz2Var, "specifics");
        this.a = i;
        this.b = i2;
        this.c = pz2Var;
        this.d = iz2Var;
    }

    public static /* synthetic */ hz2 f(hz2 hz2Var, int i, int i2, pz2 pz2Var, iz2 iz2Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = hz2Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = hz2Var.b;
        }
        if ((i3 & 4) != 0) {
            pz2Var = hz2Var.c;
        }
        if ((i3 & 8) != 0) {
            iz2Var = hz2Var.d;
        }
        return hz2Var.e(i, i2, pz2Var, iz2Var);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    @Nullable
    public final pz2 c() {
        return this.c;
    }

    @NotNull
    public final iz2 d() {
        return this.d;
    }

    @NotNull
    public final hz2 e(int i, int i2, @Nullable pz2 pz2Var, @NotNull iz2 iz2Var) {
        c25.p(iz2Var, "specifics");
        return new hz2(i, i2, pz2Var, iz2Var);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hz2) {
            hz2 hz2Var = (hz2) obj;
            return this.a == hz2Var.a && this.b == hz2Var.b && c25.g(this.c, hz2Var.c) && c25.g(this.d, hz2Var.d);
        }
        return false;
    }

    public final int g() {
        return this.b;
    }

    public final int h() {
        return this.a;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        pz2 pz2Var = this.c;
        return this.d.hashCode() + ((i + (pz2Var == null ? 0 : pz2Var.hashCode())) * 31);
    }

    @Nullable
    public final pz2 i() {
        return this.c;
    }

    @NotNull
    public final iz2 j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("PaletteData(dominantColor=");
        G.append(this.a);
        G.append(", bgColor=");
        G.append(this.b);
        G.append(", palette=");
        G.append(this.c);
        G.append(", specifics=");
        G.append(this.d);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ hz2(int i, int i2, pz2 pz2Var, iz2 iz2Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? sr.t : i, (i3 & 2) != 0 ? Color.parseColor("#262625") : i2, (i3 & 4) != 0 ? null : pz2Var, (i3 & 8) != 0 ? new iz2(0, 0, false, 7, null) : iz2Var);
    }
}
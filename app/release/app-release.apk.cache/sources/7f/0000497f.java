package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PaletteData.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u001cR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u001e\u0010\u001c¨\u0006!"}, d2 = {"Lcom/p7700g/p99005/iz2;", "", "", "a", "()I", "b", "", "c", "()Z", "textColor", "ctaTextColor", "isDarkTheme", "d", "(IIZ)Lcom/p7700g/p99005/iz2;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "h", "j", "(Z)V", AFHydra.STATUS_IDLE, "f", "i", "(I)V", com.anythink.basead.d.g.i, "k", "<init>", "(IIZ)V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class iz2 {
    private int a;
    private int b;
    private boolean c;

    public iz2() {
        this(0, 0, false, 7, null);
    }

    public iz2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public static /* synthetic */ iz2 e(iz2 iz2Var, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = iz2Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = iz2Var.b;
        }
        if ((i3 & 4) != 0) {
            z = iz2Var.c;
        }
        return iz2Var.d(i, i2, z);
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    @NotNull
    public final iz2 d(int i, int i2, boolean z) {
        return new iz2(i, i2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iz2) {
            iz2 iz2Var = (iz2) obj;
            return this.a == iz2Var.a && this.b == iz2Var.b && this.c == iz2Var.c;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public final int g() {
        return this.a;
    }

    public final boolean h() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        boolean z = this.c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return i + i2;
    }

    public final void i(int i) {
        this.b = i;
    }

    public final void j(boolean z) {
        this.c = z;
    }

    public final void k(int i) {
        this.a = i;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Specifics(textColor=");
        G.append(this.a);
        G.append(", ctaTextColor=");
        G.append(this.b);
        G.append(", isDarkTheme=");
        G.append(this.c);
        G.append(')');
        return G.toString();
    }

    public /* synthetic */ iz2(int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, (i3 & 4) != 0 ? true : z);
    }
}
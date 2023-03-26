package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Segment.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u000eB\t\b\u0016¢\u0006\u0004\b#\u0010\u000fB1\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b#\u0010$J\r\u0010\u0002\u001a\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00138\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010 \u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001a¨\u0006%"}, d2 = {"Lcom/p7700g/p99005/sw5;", "", "d", "()Lcom/p7700g/p99005/sw5;", "f", "b", "segment", "c", "(Lcom/p7700g/p99005/sw5;)Lcom/p7700g/p99005/sw5;", "", "byteCount", "e", "(I)Lcom/p7700g/p99005/sw5;", "Lcom/p7700g/p99005/yq4;", "a", "()V", "sink", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/sw5;I)V", "", "[B", "data", AFHydra.STATUS_IDLE, "limit", "pos", "i", "Lcom/p7700g/p99005/sw5;", "next", "", "h", "Z", "owner", "shared", "j", "prev", "<init>", "([BIIZZ)V", "okio"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class sw5 {
    public static final int a = 8192;
    public static final int b = 1024;
    @NotNull
    public static final a c = new a(null);
    @cz4
    @NotNull
    public final byte[] d;
    @cz4
    public int e;
    @cz4
    public int f;
    @cz4
    public boolean g;
    @cz4
    public boolean h;
    @cz4
    @Nullable
    public sw5 i;
    @cz4
    @Nullable
    public sw5 j;

    /* compiled from: Segment.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/p7700g/p99005/sw5$a", "", "", "SHARE_MINIMUM", AFHydra.STATUS_IDLE, "SIZE", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sw5() {
        this.d = new byte[8192];
        this.h = true;
        this.g = false;
    }

    public final void a() {
        sw5 sw5Var = this.j;
        int i = 0;
        if (sw5Var != this) {
            c25.m(sw5Var);
            if (sw5Var.h) {
                int i2 = this.f - this.e;
                sw5 sw5Var2 = this.j;
                c25.m(sw5Var2);
                int i3 = 8192 - sw5Var2.f;
                sw5 sw5Var3 = this.j;
                c25.m(sw5Var3);
                if (!sw5Var3.g) {
                    sw5 sw5Var4 = this.j;
                    c25.m(sw5Var4);
                    i = sw5Var4.e;
                }
                if (i2 > i3 + i) {
                    return;
                }
                sw5 sw5Var5 = this.j;
                c25.m(sw5Var5);
                g(sw5Var5, i2);
                b();
                tw5.d(this);
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    @Nullable
    public final sw5 b() {
        sw5 sw5Var = this.i;
        if (sw5Var == this) {
            sw5Var = null;
        }
        sw5 sw5Var2 = this.j;
        c25.m(sw5Var2);
        sw5Var2.i = this.i;
        sw5 sw5Var3 = this.i;
        c25.m(sw5Var3);
        sw5Var3.j = this.j;
        this.i = null;
        this.j = null;
        return sw5Var;
    }

    @NotNull
    public final sw5 c(@NotNull sw5 sw5Var) {
        c25.p(sw5Var, "segment");
        sw5Var.j = this;
        sw5Var.i = this.i;
        sw5 sw5Var2 = this.i;
        c25.m(sw5Var2);
        sw5Var2.j = sw5Var;
        this.i = sw5Var;
        return sw5Var;
    }

    @NotNull
    public final sw5 d() {
        this.g = true;
        return new sw5(this.d, this.e, this.f, true, false);
    }

    @NotNull
    public final sw5 e(int i) {
        sw5 e;
        if (i > 0 && i <= this.f - this.e) {
            if (i >= 1024) {
                e = d();
            } else {
                e = tw5.e();
                byte[] bArr = this.d;
                byte[] bArr2 = e.d;
                int i2 = this.e;
                zr4.f1(bArr, bArr2, 0, i2, i2 + i, 2, null);
            }
            e.f = e.e + i;
            this.e += i;
            sw5 sw5Var = this.j;
            c25.m(sw5Var);
            sw5Var.c(e);
            return e;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    @NotNull
    public final sw5 f() {
        byte[] bArr = this.d;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        c25.o(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new sw5(copyOf, this.e, this.f, false, true);
    }

    public final void g(@NotNull sw5 sw5Var, int i) {
        c25.p(sw5Var, "sink");
        if (sw5Var.h) {
            int i2 = sw5Var.f;
            if (i2 + i > 8192) {
                if (!sw5Var.g) {
                    int i3 = sw5Var.e;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sw5Var.d;
                        zr4.f1(bArr, bArr, 0, i3, i2, 2, null);
                        sw5Var.f -= sw5Var.e;
                        sw5Var.e = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.d;
            byte[] bArr3 = sw5Var.d;
            int i4 = sw5Var.f;
            int i5 = this.e;
            zr4.W0(bArr2, bArr3, i4, i5, i5 + i);
            sw5Var.f += i;
            this.e += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public sw5(@NotNull byte[] bArr, int i, int i2, boolean z, boolean z2) {
        c25.p(bArr, "data");
        this.d = bArr;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = z2;
    }
}
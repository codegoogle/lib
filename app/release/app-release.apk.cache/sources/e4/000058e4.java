package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.onesignal.shortcutbadger.impl.AdwHomeBadger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Settings.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b#\u0010\u0004J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u000eJ\u0015\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u000eJ\u0015\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0013\u0010\u001d\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0013\u0010\"\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\b!\u0010\u0010¨\u0006$"}, d2 = {"Lcom/p7700g/p99005/qt5;", "", "Lcom/p7700g/p99005/yq4;", "a", "()V", "", "id", "value", "k", "(II)Lcom/p7700g/p99005/qt5;", "", "i", "(I)Z", "b", "(I)I", "l", "()I", "defaultValue", "c", "(Z)Z", "f", com.anythink.basead.d.g.i, "h", "other", "j", "(Lcom/p7700g/p99005/qt5;)V", AFHydra.STATUS_IDLE, la1.a, "d", "headerTableSize", "", "[I", "values", "e", "initialWindowSize", "<init>", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class qt5 {
    public static final int a = 65535;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 5;
    public static final int f = 6;
    public static final int g = 7;
    public static final int h = 10;
    public static final a i = new a(null);
    private int j;
    private final int[] k = new int[10];

    /* compiled from: Settings.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"com/p7700g/p99005/qt5$a", "", "", AdwHomeBadger.d, AFHydra.STATUS_IDLE, "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a() {
        this.j = 0;
        zr4.u2(this.k, 0, 0, 0, 6, null);
    }

    public final int b(int i2) {
        return this.k[i2];
    }

    public final boolean c(boolean z) {
        return (this.j & 4) != 0 ? this.k[2] == 1 : z;
    }

    public final int d() {
        if ((this.j & 2) != 0) {
            return this.k[1];
        }
        return -1;
    }

    public final int e() {
        if ((this.j & 128) != 0) {
            return this.k[7];
        }
        return 65535;
    }

    public final int f() {
        if ((this.j & 16) != 0) {
            return this.k[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int g(int i2) {
        return (this.j & 32) != 0 ? this.k[5] : i2;
    }

    public final int h(int i2) {
        return (this.j & 64) != 0 ? this.k[6] : i2;
    }

    public final boolean i(int i2) {
        return ((1 << i2) & this.j) != 0;
    }

    public final void j(@NotNull qt5 qt5Var) {
        c25.p(qt5Var, "other");
        for (int i2 = 0; i2 < 10; i2++) {
            if (qt5Var.i(i2)) {
                k(i2, qt5Var.b(i2));
            }
        }
    }

    @NotNull
    public final qt5 k(int i2, int i3) {
        if (i2 >= 0) {
            int[] iArr = this.k;
            if (i2 < iArr.length) {
                this.j = (1 << i2) | this.j;
                iArr[i2] = i3;
            }
        }
        return this;
    }

    public final int l() {
        return Integer.bitCount(this.j);
    }
}
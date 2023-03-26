package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OSInfluenceType.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\r\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/fo3;", "", "", "f", "()Z", com.anythink.basead.d.g.i, "i", com.anythink.expressad.d.a.b.dH, "h", "<init>", "(Ljava/lang/String;I)V", "x", "a", "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public enum fo3 {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;
    
    @NotNull
    public static final a x = new a(null);

    /* compiled from: OSInfluenceType.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/fo3$a", "", "", "value", "Lcom/p7700g/p99005/fo3;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/fo3;", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final fo3 a(@Nullable String str) {
            fo3 fo3Var;
            if (str != null) {
                fo3[] values = fo3.values();
                int i = 3;
                while (true) {
                    if (i < 0) {
                        fo3Var = null;
                        break;
                    }
                    fo3Var = values[i];
                    if (b95.K1(fo3Var.name(), str, true)) {
                        break;
                    }
                    i--;
                }
                if (fo3Var != null) {
                    return fo3Var;
                }
            }
            return fo3.UNATTRIBUTED;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @jz4
    @NotNull
    public static final fo3 a(@Nullable String str) {
        return x.a(str);
    }

    public final boolean f() {
        return g() || i();
    }

    public final boolean g() {
        return this == DIRECT;
    }

    public final boolean h() {
        return this == DISABLED;
    }

    public final boolean i() {
        return this == INDIRECT;
    }

    public final boolean m() {
        return this == UNATTRIBUTED;
    }
}
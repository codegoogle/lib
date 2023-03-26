package com.p7700g.p99005;

import com.p7700g.p99005.qm3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: OSInfluenceChannel.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/eo3;", "", "", "otherName", "", "a", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "w", "Ljava/lang/String;", "nameValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", com.ironsource.sdk.controller.v.a, "IAM", "NOTIFICATION", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public enum eo3 {
    IAM("iam"),
    NOTIFICATION(qm3.b.a);
    
    @NotNull
    public static final a v = new a(null);
    private final String w;

    /* compiled from: OSInfluenceChannel.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/eo3$a", "", "", "value", "Lcom/p7700g/p99005/eo3;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/eo3;", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final eo3 a(@Nullable String str) {
            eo3 eo3Var;
            if (str != null) {
                eo3[] values = eo3.values();
                int i = 1;
                while (true) {
                    if (i < 0) {
                        eo3Var = null;
                        break;
                    }
                    eo3Var = values[i];
                    if (eo3Var.a(str)) {
                        break;
                    }
                    i--;
                }
                if (eo3Var != null) {
                    return eo3Var;
                }
            }
            return eo3.NOTIFICATION;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    eo3(String str) {
        this.w = str;
    }

    @jz4
    @NotNull
    public static final eo3 b(@Nullable String str) {
        return v.a(str);
    }

    public final boolean a(@NotNull String str) {
        c25.p(str, "otherName");
        return c25.g(this.w, str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.w;
    }
}
package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: models.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/p7700g/p99005/jz2;", "", "", "x", "Ljava/lang/String;", com.anythink.basead.d.g.i, "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "s", "a", "CENTER", "LEFT", "RIGHT", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public enum jz2 {
    CENTER("center"),
    LEFT("left"),
    RIGHT("right");
    
    @NotNull
    public static final a s = new a(null);
    @NotNull
    private final String x;

    /* compiled from: models.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/jz2$a", "", "", "value", "Lcom/p7700g/p99005/jz2;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/jz2;", "<init>", "()V", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final jz2 a(@NotNull String str) {
            c25.p(str, "value");
            int hashCode = str.hashCode();
            if (hashCode != -1364013995) {
                if (hashCode != 3317767) {
                    if (hashCode == 108511772 && str.equals("right")) {
                        return jz2.RIGHT;
                    }
                } else if (str.equals("left")) {
                    return jz2.LEFT;
                }
            } else if (str.equals("center")) {
                return jz2.CENTER;
            }
            return jz2.CENTER;
        }
    }

    jz2(String str) {
        this.x = str;
    }

    @NotNull
    public final String g() {
        return this.x;
    }
}
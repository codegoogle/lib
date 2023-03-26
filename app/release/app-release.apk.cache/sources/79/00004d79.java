package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: -DeprecatedUtf8.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/p7700g/p99005/kv5;", "", "", "string", "", "a", "(Ljava/lang/String;)J", "", "beginIndex", "endIndex", "b", "(Ljava/lang/String;II)J", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
@xn4(message = "changed in Okio 2.x")
/* loaded from: classes3.dex */
public final class kv5 {
    @NotNull
    public static final kv5 a = new kv5();

    private kv5() {
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.utf8Size()", imports = {"okio.utf8Size"}))
    public final long a(@NotNull String str) {
        c25.p(str, "string");
        return ax5.l(str, 0, 0, 3, null);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "string.utf8Size(beginIndex, endIndex)", imports = {"okio.utf8Size"}))
    public final long b(@NotNull String str, int i, int i2) {
        c25.p(str, "string");
        return ax5.k(str, i, i2);
    }
}
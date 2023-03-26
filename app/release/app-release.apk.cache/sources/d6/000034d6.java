package com.ironsource.mediationsdk.c;

import com.ironsource.mediationsdk.logger.IronLog;
import com.p7700g.p99005.c25;
import com.p7700g.p99005.gz4;
import com.p7700g.p99005.jz4;
import com.p7700g.p99005.vo4;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@vo4(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0004H\u0007J%\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\b\u0010\u0005\u001a\u0004\u0018\u0001H\n2\u0006\u0010\u000b\u001a\u0002H\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/ironsource/mediationsdk/utilities/IronSourcePreconditions;", "", "()V", "checkNotNull", "", "reference", "errorMessage", "", "shouldThrowException", "protectNonNull", "T", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "mediationsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    static {
        new a();
    }

    private a() {
    }

    @jz4
    public static final <T> T a(@Nullable T t, T t2) {
        return t == null ? t2 : t;
    }

    @gz4
    @jz4
    public static final boolean a(@Nullable Object obj, @NotNull String str) {
        c25.p(str, "errorMessage");
        c25.p(str, "errorMessage");
        if (obj != null) {
            return true;
        }
        IronLog.API.error(str);
        return false;
    }
}
package com.p7700g.p99005;

import com.onesignal.OSUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: OSBackgroundManager.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/p7700g/p99005/qj3;", "", "Ljava/lang/Runnable;", "runnable", "", "threadName", "Lcom/p7700g/p99005/yq4;", "d", "(Ljava/lang/Runnable;Ljava/lang/String;)V", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public class qj3 {
    public final void d(@NotNull Runnable runnable, @NotNull String str) {
        c25.p(runnable, "runnable");
        c25.p(str, "threadName");
        if (OSUtils.I()) {
            new Thread(runnable, str).start();
        } else {
            runnable.run();
        }
    }
}
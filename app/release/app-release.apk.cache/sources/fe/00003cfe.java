package com.p7700g.p99005;

import android.content.Context;
import com.onesignal.OSUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: OSNotificationOpenAppSettings.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/p7700g/p99005/cl3;", "", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "b", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class cl3 {
    @NotNull
    public static final cl3 a = new cl3();

    private cl3() {
    }

    public final boolean a(@NotNull Context context) {
        c25.p(context, "context");
        return !c25.g("DISABLE", OSUtils.g(context, "com.onesignal.NotificationOpened.DEFAULT"));
    }

    public final boolean b(@NotNull Context context) {
        c25.p(context, "context");
        return OSUtils.h(context, "com.onesignal.suppressLaunchURLs");
    }
}
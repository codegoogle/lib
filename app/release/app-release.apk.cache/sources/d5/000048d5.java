package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import com.p7700g.p99005.hb0;
import org.jetbrains.annotations.NotNull;

/* compiled from: OSWorkManagerHelper.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/p7700g/p99005/im3;", "", "", "b", "()Z", "Landroid/content/Context;", "context", "Lcom/p7700g/p99005/ec0;", "a", "(Landroid/content/Context;)Lcom/p7700g/p99005/ec0;", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class im3 {
    @NotNull
    public static final im3 a = new im3();

    private im3() {
    }

    @jz4
    @NotNull
    public static final synchronized ec0 a(@NotNull Context context) {
        ec0 p;
        synchronized (im3.class) {
            c25.p(context, "context");
            if (!a.b()) {
                ec0.A(context, new hb0.b().a());
            }
            p = ec0.p(context);
            c25.o(p, "WorkManager.getInstance(context)");
        }
        return p;
    }

    @SuppressLint({"RestrictedApi"})
    private final boolean b() {
        return rc0.G() != null;
    }
}
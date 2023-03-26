package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Bundle.kt */
@e2(18)
@vo4(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/os/BundleApi18ImplKt;", "", "()V", "putBinder", "", "bundle", "Landroid/os/Bundle;", "key", "", "value", "Landroid/os/IBinder;", "core-ktx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class km {
    @NotNull
    public static final km a = new km();

    private km() {
    }

    @e1
    @jz4
    public static final void a(@NotNull Bundle bundle, @NotNull String str, @Nullable IBinder iBinder) {
        c25.p(bundle, "bundle");
        c25.p(str, "key");
        bundle.putBinder(str, iBinder);
    }
}
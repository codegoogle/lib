package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import org.jetbrains.annotations.NotNull;

/* compiled from: NavigateToAndroidSettingsForLocation.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/p7700g/p99005/gj3;", "", "Landroid/content/Context;", "context", "Lcom/p7700g/p99005/yq4;", "a", "(Landroid/content/Context;)V", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class gj3 {
    @NotNull
    public static final gj3 a = new gj3();

    private gj3() {
    }

    public final void a(@NotNull Context context) {
        c25.p(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        StringBuilder G = wo1.G("package:");
        G.append(context.getPackageName());
        intent.setData(Uri.parse(G.toString()));
        context.startActivity(intent);
    }
}
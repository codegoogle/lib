package com.p7700g.p99005;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.p7700g.p99005.hy2;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.qm3;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DebugNotificationUtils.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\t8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/p7700g/p99005/by2;", "", "Lcom/p7700g/p99005/yq4;", "a", "()V", "Landroid/content/Context;", "appContext", "b", "(Landroid/content/Context;)V", "", "title", "description", "", "notificationId", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "Ljava/lang/String;", "CHANNEL_ID", "Landroid/content/Context;", "mAppContext", "<init>", "com.greedygame.sdkx.commons"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class by2 {
    @NotNull
    public static final by2 a = new by2();
    @NotNull
    private static final String b = "sdkx_debug_notification_channel";
    @Nullable
    private static Context c;

    private by2() {
    }

    private final void a() {
        if (c != null && Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(b, "SDK-Debug Channel", 4);
            notificationChannel.setDescription("Debug Notification channel for triggering warnings");
            Context context = c;
            Object systemService = context == null ? null : context.getSystemService(qm3.b.a);
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        }
    }

    public static /* synthetic */ void d(by2 by2Var, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 4) != 0) {
            num = Integer.valueOf((int) System.currentTimeMillis());
        }
        by2Var.c(str, str2, num);
    }

    public final void b(@NotNull Context context) {
        c25.p(context, "appContext");
        c = context;
        a();
    }

    public final void c(@NotNull String str, @NotNull String str2, @Nullable Integer num) {
        c25.p(str, "title");
        c25.p(str2, "description");
        Context context = c;
        if (context == null) {
            return;
        }
        c25.m(context);
        kg.g k0 = new kg.g(context, b).t0(hy2.g.U0).P(str).O(str2).z0(new kg.e().A(str2)).D(true).k0(1);
        c25.o(k0, "Builder(mAppContext!!, CHANNEL_ID)\n            .setSmallIcon(R.drawable.ic_sdkx)\n            .setContentTitle(title)\n            .setContentText(description)\n            .setStyle(\n                NotificationCompat.BigTextStyle()\n                    .bigText(description)\n            )\n            .setAutoCancel(true)\n            .setPriority(NotificationCompat.PRIORITY_HIGH)");
        Context context2 = c;
        c25.m(context2);
        pg p = pg.p(context2);
        c25.m(num);
        p.C(num.intValue(), k0.h());
    }
}
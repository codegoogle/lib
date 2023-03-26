package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.onesignal.NotificationOpenedReceiver;
import com.onesignal.NotificationOpenedReceiverAndroid22AndOlder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IntentGeneratorForAttachingToNotifications.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0019\u0010\u0016\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/p7700g/p99005/cj3;", "", "Landroid/content/Intent;", "e", "()Landroid/content/Intent;", "d", "", "notificationId", "c", "(I)Landroid/content/Intent;", "requestCode", "oneSignalIntent", "Landroid/app/PendingIntent;", "b", "(ILandroid/content/Intent;)Landroid/app/PendingIntent;", "Ljava/lang/Class;", "Ljava/lang/Class;", "notificationOpenedClassAndroid22AndOlder", "Landroid/content/Context;", "Landroid/content/Context;", "a", "()Landroid/content/Context;", "context", "notificationOpenedClassAndroid23Plus", "<init>", "(Landroid/content/Context;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class cj3 {
    private final Class<?> a;
    private final Class<?> b;
    @NotNull
    private final Context c;

    public cj3(@NotNull Context context) {
        c25.p(context, "context");
        this.c = context;
        this.a = NotificationOpenedReceiver.class;
        this.b = NotificationOpenedReceiverAndroid22AndOlder.class;
    }

    @xn4(message = "Use getNewBaseIntentAndroidAPI23Plus instead for Android 6+")
    private final Intent d() {
        Intent intent = new Intent(this.c, this.b);
        intent.addFlags(403177472);
        return intent;
    }

    @e2(23)
    private final Intent e() {
        return new Intent(this.c, this.a);
    }

    @NotNull
    public final Context a() {
        return this.c;
    }

    @Nullable
    public final PendingIntent b(int i, @NotNull Intent intent) {
        c25.p(intent, "oneSignalIntent");
        return PendingIntent.getActivity(this.c, i, intent, 201326592);
    }

    @NotNull
    public final Intent c(int i) {
        Intent d;
        if (Build.VERSION.SDK_INT >= 23) {
            d = e();
        } else {
            d = d();
        }
        Intent addFlags = d.putExtra(ui3.b, i).addFlags(603979776);
        c25.o(addFlags, "intent\n            .putE…Y_CLEAR_TOP\n            )");
        return addFlags;
    }
}
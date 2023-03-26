package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GenerateNotificationOpenIntent.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/p7700g/p99005/vi3;", "", "Landroid/content/Intent;", "a", "()Landroid/content/Intent;", "b", "", "c", "Z", "startApp", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "<init>", "(Landroid/content/Context;Landroid/content/Intent;Z)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class vi3 {
    private final Context a;
    private final Intent b;
    private final boolean c;

    public vi3(@NotNull Context context, @Nullable Intent intent, boolean z) {
        c25.p(context, "context");
        this.a = context;
        this.b = intent;
        this.c = z;
    }

    private final Intent a() {
        Intent launchIntentForPackage;
        if (this.c && (launchIntentForPackage = this.a.getPackageManager().getLaunchIntentForPackage(this.a.getPackageName())) != null) {
            c25.o(launchIntentForPackage, "context.packageManager.g…           ?: return null");
            launchIntentForPackage.setPackage(null);
            launchIntentForPackage.setFlags(270532608);
            return launchIntentForPackage;
        }
        return null;
    }

    @Nullable
    public final Intent b() {
        Intent intent = this.b;
        return intent != null ? intent : a();
    }
}
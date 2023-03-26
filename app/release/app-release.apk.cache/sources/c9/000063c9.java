package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.onesignal.OSUtils;
import com.p7700g.p99005.kg;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: GenerateNotificationOpenIntentFromPushPayload.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/p7700g/p99005/wi3;", "", "", "shouldOpenApp", "Lorg/json/JSONObject;", "fcmPayload", "c", "(ZLorg/json/JSONObject;)Z", "Landroid/net/Uri;", kg.m.a.e, "Landroid/content/Intent;", "b", "(Landroid/net/Uri;)Landroid/content/Intent;", "Landroid/content/Context;", "context", "Lcom/p7700g/p99005/vi3;", "a", "(Landroid/content/Context;Lorg/json/JSONObject;)Lcom/p7700g/p99005/vi3;", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class wi3 {
    @NotNull
    public static final wi3 a = new wi3();

    private wi3() {
    }

    private final Intent b(Uri uri) {
        if (uri == null) {
            return null;
        }
        return OSUtils.R(uri);
    }

    private final boolean c(boolean z, JSONObject jSONObject) {
        return z | (mk3.a(jSONObject) != null);
    }

    @NotNull
    public final vi3 a(@NotNull Context context, @NotNull JSONObject jSONObject) {
        c25.p(context, "context");
        c25.p(jSONObject, "fcmPayload");
        dl3 dl3Var = new dl3(context, jSONObject);
        return new vi3(context, b(dl3Var.b()), c(dl3Var.a(), jSONObject));
    }
}
package com.p7700g.p99005;

import android.content.Context;
import android.net.Uri;
import com.p7700g.p99005.kg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: OSNotificationOpenBehaviorFromPushPayload.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0015\u0010\t\u001a\u0004\u0018\u00010\u00068F@\u0006¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/dl3;", "", "", "a", "()Z", "shouldOpenApp", "Landroid/net/Uri;", "b", "()Landroid/net/Uri;", kg.m.a.e, "Landroid/content/Context;", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "fcmPayload", "<init>", "(Landroid/content/Context;Lorg/json/JSONObject;)V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class dl3 {
    private final Context a;
    private final JSONObject b;

    public dl3(@NotNull Context context, @NotNull JSONObject jSONObject) {
        c25.p(context, "context");
        c25.p(jSONObject, "fcmPayload");
        this.a = context;
        this.b = jSONObject;
    }

    public final boolean a() {
        return cl3.a.a(this.a) && b() == null;
    }

    @Nullable
    public final Uri b() {
        cl3 cl3Var = cl3.a;
        if (cl3Var.a(this.a) && !cl3Var.b(this.a)) {
            JSONObject jSONObject = new JSONObject(this.b.optString("custom"));
            if (jSONObject.has("u")) {
                String optString = jSONObject.optString("u");
                if (!c25.g(optString, "")) {
                    c25.o(optString, "url");
                    int length = optString.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = c25.t(optString.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    return Uri.parse(optString.subSequence(i, length + 1).toString());
                }
            }
            return null;
        }
        return null;
    }
}
package com.p7700g.p99005;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.widget.ActivityChooserModel;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OSInAppMessagePreviewHandler.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/p7700g/p99005/mk3;", "", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "bundle", "", "c", "(Landroid/content/Context;Landroid/os/Bundle;)Z", "Landroid/app/Activity;", ActivityChooserModel.ATTRIBUTE_ACTIVITY, "Lorg/json/JSONObject;", "jsonData", "b", "(Landroid/app/Activity;Lorg/json/JSONObject;)Z", "payload", "", "a", "(Lorg/json/JSONObject;)Ljava/lang/String;", "d", "()Z", "<init>", "()V", "onesignal_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes3.dex */
public final class mk3 {
    @NotNull
    public static final mk3 a = new mk3();

    private mk3() {
    }

    @jz4
    @Nullable
    public static final String a(@NotNull JSONObject jSONObject) {
        JSONObject optJSONObject;
        c25.p(jSONObject, "payload");
        try {
            JSONObject b = ij3.b(jSONObject);
            c25.o(b, "NotificationBundleProces…CustomJSONObject(payload)");
            if (b.has("a") && (optJSONObject = b.optJSONObject("a")) != null && optJSONObject.has(ij3.g)) {
                return optJSONObject.optString(ij3.g);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @jz4
    public static final boolean b(@NotNull Activity activity, @NotNull JSONObject jSONObject) {
        c25.p(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        c25.p(jSONObject, "jsonData");
        String a2 = a(jSONObject);
        if (a2 != null) {
            jm3.Q1(activity, new JSONArray().put(jSONObject));
            jm3.u0().J(a2);
            return true;
        }
        return false;
    }

    @jz4
    public static final boolean c(@Nullable Context context, @Nullable Bundle bundle) {
        JSONObject a2 = ij3.a(bundle);
        c25.o(a2, "NotificationBundleProces…undleAsJSONObject(bundle)");
        String a3 = a(a2);
        if (a3 != null) {
            if (jm3.s1()) {
                jm3.u0().J(a3);
                return true;
            } else if (a.d()) {
                ui3.o(new al3(context, a2));
                return true;
            } else {
                return true;
            }
        }
        return false;
    }

    @v0(api = 19)
    private final boolean d() {
        return true;
    }
}
package com.p7700g.p99005;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import com.p7700g.p99005.qm3;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class f73 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "JSIntrf";
    @Nullable
    private final Context c;
    @Nullable
    private String d;
    @Nullable
    private b e;
    @NotNull
    private final iy2 f;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a();

        void b();

        void c();

        void d();

        void e();
    }

    private final void d(String str) {
    }

    public final void a() {
        this.e = null;
    }

    @JavascriptInterface
    public final void addKeyValue(@NotNull String str, @NotNull String str2) {
        c25.p(str, "key");
        c25.p(str2, "value");
        xz2.c(b, c25.C("Add preference key: ", str));
    }

    @JavascriptInterface
    @xn4(message = "8.5 Use {@link #sendTracker(String)} instead.", replaceWith = @op4(expression = "sendTracker(url)", imports = {}))
    public final void apiRequestGet(@NotNull String str) {
        c25.p(str, "url");
        sendTracker(str);
    }

    @JavascriptInterface
    @xn4(message = "Since we don't support tracker post request.{@link #sendTracker(String)} instead for a GET request.", replaceWith = @op4(expression = "Use sendTracker(String) instead for a GET request.", imports = {}))
    public final void apiRequestPost(@NotNull String str) {
        c25.p(str, "url");
    }

    public final void b(@NotNull b bVar) {
        c25.p(bVar, "webInterfaceListener");
        this.e = bVar;
    }

    public final void c(@Nullable String str) {
        this.d = str;
    }

    @JavascriptInterface
    @xn4(message = "No longer supported by the sdk")
    public final void changeFrame(@NotNull String str) {
        c25.p(str, "id");
    }

    @JavascriptInterface
    public final void close() {
        xz2.c(b, "Closing window");
        b bVar = this.e;
        if (bVar != null) {
            c25.m(bVar);
            bVar.a();
        }
    }

    @JavascriptInterface
    public final void disableBack() {
        xz2.c(b, "Disable back button");
        b bVar = this.e;
        if (bVar != null) {
            c25.m(bVar);
            bVar.d();
        }
    }

    @JavascriptInterface
    public final void enableBack() {
        xz2.c(b, "Enable back button");
        b bVar = this.e;
        if (bVar != null) {
            c25.m(bVar);
            bVar.e();
        }
    }

    @JavascriptInterface
    @xn4(message = "@use {@link #getFrameHeight()} instead.\n      Deprecated in v8.5")
    public final int getDeviceHeight() {
        int frameHeight = getFrameHeight();
        xz2.c(b, c25.C("Current Device height: ", Integer.valueOf(frameHeight)));
        return frameHeight;
    }

    @JavascriptInterface
    @xn4(message = "@use {@link #getFrameWidth()} instead.\n      Deprecated in v8.5")
    public final int getDeviceWidth() {
        int frameWidth = getFrameWidth();
        xz2.c(b, c25.C("Current device width: ", Integer.valueOf(frameWidth)));
        return frameWidth;
    }

    @JavascriptInterface
    public final int getFrameHeight() {
        int a2 = w23.h.a();
        xz2.c(b, c25.C("Current frame height: ", Integer.valueOf(a2)));
        return a2;
    }

    @JavascriptInterface
    public final int getFrameWidth() {
        int b2 = w23.h.b();
        xz2.c(b, c25.C("Current frame width: ", Integer.valueOf(b2)));
        return b2;
    }

    @JavascriptInterface
    @Nullable
    public final String getKeyValue(@NotNull String str) {
        c25.p(str, "key");
        xz2.c(b, c25.C("Get preference key: ", str));
        return "";
    }

    @JavascriptInterface
    @NotNull
    public final String getParamValue(@NotNull String str) {
        c25.p(str, "key");
        String a2 = oa3.a.a(str);
        xz2.c(b, wo1.v("Html asks for key: ", str, " value: ", a2));
        return a2;
    }

    @JavascriptInterface
    @xn4(message = "on 8.5.0 @use {@link #getSessionId()} instead.")
    @Nullable
    public final String getRandomId() {
        return getSessionId();
    }

    @JavascriptInterface
    @Nullable
    public final String getSessionId() {
        return "";
    }

    @JavascriptInterface
    @Nullable
    public final String getUnitId() {
        String str = b;
        String str2 = this.d;
        c25.m(str2);
        xz2.c(str, c25.C("UnitId of the engagement: ", str2));
        return this.d;
    }

    @JavascriptInterface
    public final void hideClose() {
        xz2.c(b, "Hide close");
        b bVar = this.e;
        if (bVar != null) {
            c25.m(bVar);
            bVar.b();
        }
    }

    @JavascriptInterface
    public final boolean isSDKSupported() {
        xz2.c(b, "JavaScriptInterface supported");
        return true;
    }

    @JavascriptInterface
    @xn4(message = "No longer supported by the sdk")
    public final void nextFrame() {
        xz2.c(b, "Move next frame");
    }

    @JavascriptInterface
    @xn4(message = "No longer supported by the sdk")
    public final void previousFrame() {
        xz2.c(b, "Move to previous frame");
    }

    @JavascriptInterface
    public final void redirect(@NotNull String str) {
        c25.p(str, "url");
        xz2.c(b, c25.C("Redirecting url: ", str));
        j73.a.a(this.c, str);
        String unitId = getUnitId();
        if (unitId == null) {
            unitId = "";
        }
        d(unitId);
    }

    @JavascriptInterface
    public final void remove(@NotNull String str) {
        c25.p(str, "key");
        xz2.c(b, c25.C("Remove preference key: ", str));
    }

    @JavascriptInterface
    public final void removeAll() {
        xz2.c(b, "Remove all preference keys");
        for (Map.Entry<String, ?> entry : this.f.e().entrySet()) {
            entry.getKey();
        }
    }

    @JavascriptInterface
    @xn4(message = "")
    public final void reportClick() {
    }

    @JavascriptInterface
    @xn4(message = "")
    public final void reportEvent(@NotNull String str) {
        c25.p(str, "eventName");
    }

    @JavascriptInterface
    @Nullable
    public final String resolveMacros(@NotNull String str) {
        c25.p(str, "url");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return ma3.a.a(str);
    }

    @JavascriptInterface
    public final void sendImpressions() {
        xz2.c(b, "Send impressions");
    }

    @JavascriptInterface
    public final void sendTracker(@NotNull String str) {
        c25.p(str, "url");
        xz2.c(b, c25.C("Web redirect send tracker url: ", str));
    }

    @JavascriptInterface
    public final void showClose() {
        xz2.c(b, "Show close");
        b bVar = this.e;
        if (bVar != null) {
            c25.m(bVar);
            bVar.c();
        }
    }

    @JavascriptInterface
    public final void showToast(@NotNull String str) {
        c25.p(str, qm3.b.j);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xz2.c(b, c25.C("Message: ", str));
        Toast.makeText(this.c, str, 0).show();
    }
}
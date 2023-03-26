package com.p7700g.p99005;

import android.net.Uri;
import android.webkit.URLUtil;
import com.p7700g.p99005.t43;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class ub3 extends b23<String, yq4> {
    @NotNull
    public static final a h = new a(null);
    @NotNull
    private final String i;
    @NotNull
    private final Map<String, String> j;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ub3(String str, Map map, ka3 ka3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? null : ka3Var);
    }

    @Override // com.p7700g.p99005.b23
    @Nullable
    public qa3<String> d() {
        return null;
    }

    @Override // com.p7700g.p99005.b23
    public int g() {
        return 0;
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public t43.d h() {
        return t43.d.IMMEDIATE;
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public x43 i() {
        return new j43(30000, 1, 0.0f);
    }

    @Override // com.p7700g.p99005.b23
    @NotNull
    public Uri j() {
        if (URLUtil.isValidUrl(this.i)) {
            Uri parse = Uri.parse(this.i);
            c25.o(parse, "{\n                Uri.parse(path)\n            }");
            return parse;
        }
        Uri.Builder appendPath = new Uri.Builder().scheme("https").authority("api.greedygame.com").appendPath(com.anythink.expressad.foundation.g.a.j).appendPath("tracker").appendPath(this.i);
        for (Map.Entry<String, String> entry : this.j.entrySet()) {
            appendPath.appendQueryParameter(entry.getKey(), entry.getValue());
        }
        Uri build = appendPath.build();
        c25.o(build, "{\n                val urlBuilder = Uri.Builder()\n                    .scheme(\"https\")\n                    .authority(\"api.greedygame.com\")\n                    .appendPath(\"v3\")\n                    .appendPath(\"tracker\")\n                    .appendPath(path)\n                mQueryParams.forEach {\n                    urlBuilder.appendQueryParameter(it.key, it.value)\n                }\n                urlBuilder.build()\n            }");
        return build;
    }

    @Override // com.p7700g.p99005.b23
    public void m(@NotNull h93 h93Var) {
        c25.p(h93Var, "requestHeaders");
        h93Var.c();
    }

    @Override // com.p7700g.p99005.b23
    public void n(@NotNull b23<String, yq4> b23Var, @NotNull b53 b53Var, @Nullable p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(b53Var, "error");
        super.n(b23Var, b53Var, p43Var);
        StringBuilder G = wo1.G("Tracker request failed with error ");
        G.append((Object) b53Var.getMessage());
        G.append(gl4.R);
        xz2.c("TrkRqst", G.toString());
    }

    @Override // com.p7700g.p99005.b23
    public void o(@NotNull b23<String, yq4> b23Var, @NotNull byte[] bArr, @NotNull p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(bArr, "response");
        c25.p(p43Var, "networkResponse");
        super.o(b23Var, bArr, p43Var);
        xz2.c("TrkRqst", "Tracker request successful");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub3(@NotNull String str, @NotNull Map<String, String> map, @Nullable ka3<String, yq4> ka3Var) {
        super(ka3Var);
        c25.p(str, la1.k);
        c25.p(map, "mQueryParams");
        this.i = str;
        this.j = map;
    }
}
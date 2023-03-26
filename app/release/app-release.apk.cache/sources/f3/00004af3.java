package com.p7700g.p99005;

import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: String.kt */
@vo4(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086\b¨\u0006\u0002"}, d2 = {"htmlEncode", "", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class jo {
    @NotNull
    public static final String a(@NotNull String str) {
        c25.p(str, "<this>");
        String htmlEncode = TextUtils.htmlEncode(str);
        c25.o(htmlEncode, "htmlEncode(this)");
        return htmlEncode;
    }
}
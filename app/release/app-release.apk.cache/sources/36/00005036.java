package com.p7700g.p99005;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ma3 {
    @NotNull
    public static final ma3 a = new ma3();
    private static final Pattern b = Pattern.compile("(?<!\\{)\\[[a-zA-Z0-9_]+\\](?!\\})");

    private ma3() {
    }

    @NotNull
    public final String a(@NotNull String str) {
        c25.p(str, "url");
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        Matcher matcher = b.matcher(str);
        ArrayList<String> arrayList = new ArrayList();
        while (matcher.find()) {
            String group = matcher.group();
            c25.o(group, "m.group()");
            arrayList.add(group);
        }
        for (String str2 : arrayList) {
            if (b.matcher(str2).matches()) {
                String a2 = oa3.a.a(new o85("\\[|_enc\\]$|\\]").p(str2, ""));
                if (b95.J1(str2, "_enc]", false, 2, null) && !TextUtils.isEmpty(a2)) {
                    try {
                        String encode = URLEncoder.encode(a2, "UTF-8");
                        c25.o(encode, "encode(macroValue,\n                                ENCODING_STANDARD\n                            )");
                        a2 = encode;
                    } catch (UnsupportedEncodingException unused) {
                        xz2.c("McroHpr", c25.C("[ERROR] Encode failed for macro: ", str2));
                    }
                }
                o85 o85Var = new o85(wo1.u("(?<!\\{)(\\[", new o85("\\[|\\]").p(str2, ""), "\\])(?!\\})"));
                if (!TextUtils.isEmpty(a2)) {
                    str2 = a2;
                }
                str = o85Var.p(str, str2);
            }
        }
        String p = new o85("\\{|\\}").p(str, "");
        xz2.c("McroHpr", c25.C("Macro updated url: ", p));
        return p;
    }
}
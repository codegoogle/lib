package com.p7700g.p99005;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public final class ou2 {
    private static final Pattern a = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    private final String b;
    private final String c;
    private final String d;

    private ou2(String str, String str2) {
        this.b = d(str2, str);
        this.c = str;
        this.d = wo1.D(new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()), str, "!", str2);
    }

    @z1
    public static ou2 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new ou2(split[0], split[1]);
    }

    @x1
    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2);
            str = str.substring(8);
        }
        if (str == null || !a.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public static ou2 f(@x1 String str) {
        return new ou2("S", str);
    }

    public static ou2 g(@x1 String str) {
        return new ou2("U", str);
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.b;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(@z1 Object obj) {
        if (obj instanceof ou2) {
            ou2 ou2Var = (ou2) obj;
            return this.b.equals(ou2Var.b) && this.c.equals(ou2Var.c);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.c, this.b);
    }
}
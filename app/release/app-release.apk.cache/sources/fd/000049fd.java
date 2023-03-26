package com.p7700g.p99005;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: _OneToManyTitlecaseMappings.kt */
@vo4(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class j95 {
    @NotNull
    public static final String a(char c) {
        String valueOf = String.valueOf(c);
        c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        Locale locale = Locale.ROOT;
        String upperCase = valueOf.toUpperCase(locale);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        if (upperCase.length() > 1) {
            if (c == 329) {
                return upperCase;
            }
            char charAt = upperCase.charAt(0);
            c25.n(upperCase, "null cannot be cast to non-null type java.lang.String");
            String substring = upperCase.substring(1);
            c25.o(substring, "this as java.lang.String).substring(startIndex)");
            c25.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(locale);
            c25.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
}
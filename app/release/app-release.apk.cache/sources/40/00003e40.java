package com.p7700g.p99005;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

/* compiled from: CharJVM.kt */
@vo4(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {f61.b, "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class d85 {
    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String A(char c) {
        String valueOf = String.valueOf(c);
        c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(Locale.ROOT);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final String B(char c, @NotNull Locale locale) {
        c25.p(locale, "locale");
        String valueOf = String.valueOf(c);
        c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = valueOf.toUpperCase(locale);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final char C(char c) {
        return Character.toUpperCase(c);
    }

    @np4
    public static final int a(int i) {
        if (new c55(2, 36).o(i)) {
            return i;
        }
        StringBuilder H = wo1.H("radix ", i, " was not in valid range ");
        H.append(new c55(2, 36));
        throw new IllegalArgumentException(H.toString());
    }

    public static final int b(char c, int i) {
        return Character.digit((int) c, i);
    }

    @NotNull
    public static final a85 c(char c) {
        return a85.s.a(Character.getType(c));
    }

    @NotNull
    public static final b85 d(char c) {
        return b85.s.b(Character.getDirectionality(c));
    }

    @dx4
    private static final boolean e(char c) {
        return Character.isDefined(c);
    }

    @dx4
    private static final boolean f(char c) {
        return Character.isDigit(c);
    }

    @dx4
    private static final boolean g(char c) {
        return Character.isHighSurrogate(c);
    }

    @dx4
    private static final boolean h(char c) {
        return Character.isISOControl(c);
    }

    @dx4
    private static final boolean i(char c) {
        return Character.isIdentifierIgnorable(c);
    }

    @dx4
    private static final boolean j(char c) {
        return Character.isJavaIdentifierPart(c);
    }

    @dx4
    private static final boolean k(char c) {
        return Character.isJavaIdentifierStart(c);
    }

    @dx4
    private static final boolean l(char c) {
        return Character.isLetter(c);
    }

    @dx4
    private static final boolean m(char c) {
        return Character.isLetterOrDigit(c);
    }

    @dx4
    private static final boolean n(char c) {
        return Character.isLowSurrogate(c);
    }

    @dx4
    private static final boolean o(char c) {
        return Character.isLowerCase(c);
    }

    @dx4
    private static final boolean p(char c) {
        return Character.isTitleCase(c);
    }

    @dx4
    private static final boolean q(char c) {
        return Character.isUpperCase(c);
    }

    public static final boolean r(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String s(char c) {
        String valueOf = String.valueOf(c);
        c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(Locale.ROOT);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final String t(char c, @NotNull Locale locale) {
        c25.p(locale, "locale");
        String valueOf = String.valueOf(c);
        c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = valueOf.toLowerCase(locale);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final char u(char c) {
        return Character.toLowerCase(c);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final String v(char c, @NotNull Locale locale) {
        c25.p(locale, "locale");
        String B = B(c, locale);
        if (B.length() <= 1) {
            String valueOf = String.valueOf(c);
            c25.n(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            c25.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            return !c25.g(B, upperCase) ? B : String.valueOf(Character.toTitleCase(c));
        } else if (c == 329) {
            return B;
        } else {
            char charAt = B.charAt(0);
            c25.n(B, "null cannot be cast to non-null type java.lang.String");
            String substring = B.substring(1);
            c25.o(substring, "this as java.lang.String).substring(startIndex)");
            c25.n(substring, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = substring.toLowerCase(Locale.ROOT);
            c25.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            return charAt + lowerCase;
        }
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final char w(char c) {
        return Character.toTitleCase(c);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use lowercaseChar() instead.", replaceWith = @op4(expression = "lowercaseChar()", imports = {}))
    private static final char x(char c) {
        return Character.toLowerCase(c);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use titlecaseChar() instead.", replaceWith = @op4(expression = "titlecaseChar()", imports = {}))
    private static final char y(char c) {
        return Character.toTitleCase(c);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use uppercaseChar() instead.", replaceWith = @op4(expression = "uppercaseChar()", imports = {}))
    private static final char z(char c) {
        return Character.toUpperCase(c);
    }
}
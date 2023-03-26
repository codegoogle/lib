package com.p7700g.p99005;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringsJVM.kt */
@vo4(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a2\u00100\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a6\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0004\b5\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a:\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a>\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0004\b5\u00107\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00108\u001a\r\u00109\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u0010:\u001a\u00020#*\u00020'\u001a\r\u0010;\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010;\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010<\u001a\u00020\u0011*\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010<\u001a\u00020\u0011*\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010@\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010B\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H\u0087\b\u001a4\u0010D\u001a\u00020#*\u00020'2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010D\u001a\u00020#*\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010F\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010G\u001a\u00020\u0002*\u00020'2\u0006\u0010H\u001a\u00020\u0011\u001a$\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010J\u001a\u00020>2\u0006\u0010K\u001a\u00020>2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010N\u001a\u00020\u0002*\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\u0006\u0010M\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00020P*\u00020'2\u0006\u0010Q\u001a\u00020R2\b\b\u0002\u0010S\u001a\u00020\u0011\u001a\u001c\u0010T\u001a\u00020#*\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010T\u001a\u00020#*\u00020\u00022\u0006\u0010U\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010V\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010W\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010X\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010X\u001a\u00020\u0014*\u00020\u00022\u0006\u0010Y\u001a\u00020\u00142\b\b\u0002\u0010Z\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010X\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010[\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010[\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010\\\u001a\u00020R*\u00020\u00022\b\b\u0002\u0010]\u001a\u00020\u0011H\u0087\b\u001a\r\u0010^\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010_\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010_\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006`"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", "charset", "Ljava/nio/charset/Charset;", "offset", "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", la1.l, "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "formatNullable", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", "n", "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", "destination", "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class b95 extends a95 {
    @yn4(warningSince = "1.5")
    @xn4(message = "Use replaceFirstChar instead.", replaceWith = @op4(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @NotNull
    public static final String A1(@NotNull String str) {
        c25.p(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        c25.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        c25.o(lowerCase, "this as java.lang.String).toLowerCase()");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        c25.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final char[] A2(@NotNull String str, int i, int i2) {
        c25.p(str, "<this>");
        nr4.s.a(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    @dr4(markerClass = {fo4.class})
    @yn4(warningSince = "1.5")
    @xn4(message = "Use replaceFirstChar instead.", replaceWith = @op4(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @NotNull
    @fx4
    @tp4(version = "1.4")
    public static final String B1(@NotNull String str, @NotNull Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        c25.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        String substring2 = str.substring(1);
        c25.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb.append(substring2);
        return sb.toString();
    }

    @dx4
    private static final char[] B2(String str, char[] cArr, int i, int i2, int i3) {
        c25.p(str, "<this>");
        c25.p(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final String C1(@NotNull byte[] bArr) {
        c25.p(bArr, "<this>");
        return new String(bArr, f85.b);
    }

    public static /* synthetic */ char[] C2(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return A2(str, i, i2);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final String D1(@NotNull byte[] bArr, int i, int i2, boolean z) {
        c25.p(bArr, "<this>");
        nr4.s.a(i, i2, bArr.length);
        if (!z) {
            return new String(bArr, i, i2 - i, f85.b);
        }
        String charBuffer = f85.b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        c25.o(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    public static /* synthetic */ char[] D2(String str, char[] cArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        c25.p(str, "<this>");
        c25.p(cArr, "destination");
        str.getChars(i2, i3, cArr, i);
        return cArr;
    }

    public static /* synthetic */ String E1(byte[] bArr, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return D1(bArr, i, i2, z);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use lowercase() instead.", replaceWith = @op4(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String E2(String str) {
        c25.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        c25.o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final byte[] F1(@NotNull String str) {
        c25.p(str, "<this>");
        byte[] bytes = str.getBytes(f85.b);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use lowercase() instead.", replaceWith = @op4(expression = "lowercase(locale)", imports = {}))
    private static final String F2(String str, Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final byte[] G1(@NotNull String str, int i, int i2, boolean z) {
        c25.p(str, "<this>");
        nr4.s.a(i, i2, str.length());
        if (!z) {
            String substring = str.substring(i, i2);
            c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = f85.b;
            c25.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            c25.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = f85.b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i, i2));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            c25.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                c25.o(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @dx4
    private static final Pattern G2(String str, int i) {
        c25.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        c25.o(compile, "compile(this, flags)");
        return compile;
    }

    public static /* synthetic */ byte[] H1(String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return G1(str, i, i2, z);
    }

    public static /* synthetic */ Pattern H2(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        c25.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i);
        c25.o(compile, "compile(this, flags)");
        return compile;
    }

    public static final boolean I1(@NotNull String str, @NotNull String str2, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "suffix");
        if (!z) {
            return str.endsWith(str2);
        }
        return d2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use uppercase() instead.", replaceWith = @op4(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    private static final String I2(String str) {
        c25.p(str, "<this>");
        String upperCase = str.toUpperCase();
        c25.o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static /* synthetic */ boolean J1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return I1(str, str2, z);
    }

    @dx4
    @yn4(warningSince = "1.5")
    @xn4(message = "Use uppercase() instead.", replaceWith = @op4(expression = "uppercase(locale)", imports = {}))
    private static final String J2(String str, Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final boolean K1(@Nullable String str, @Nullable String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        } else if (!z) {
            return str.equals(str2);
        } else {
            return str.equalsIgnoreCase(str2);
        }
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String K2(String str) {
        c25.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static /* synthetic */ boolean L1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return K1(str, str2, z);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String L2(String str, Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        c25.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @dx4
    @yn4(hiddenSince = "1.4")
    @xn4(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    private static final /* synthetic */ String M1(String str, Locale locale, Object... objArr) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        c25.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(locale, this, *args)");
        return format;
    }

    @dx4
    private static final String N1(String str, Object... objArr) {
        c25.p(str, "<this>");
        c25.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(this, *args)");
        return format;
    }

    @dx4
    private static final String O1(j35 j35Var, String str, Object... objArr) {
        c25.p(j35Var, "<this>");
        c25.p(str, "format");
        c25.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(format, *args)");
        return format;
    }

    @dx4
    @yn4(hiddenSince = "1.4")
    @xn4(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    private static final /* synthetic */ String P1(j35 j35Var, Locale locale, String str, Object... objArr) {
        c25.p(j35Var, "<this>");
        c25.p(locale, "locale");
        c25.p(str, "format");
        c25.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(locale, format, *args)");
        return format;
    }

    @fz4(name = "formatNullable")
    @dx4
    @tp4(version = "1.4")
    private static final String Q1(String str, Locale locale, Object... objArr) {
        c25.p(str, "<this>");
        c25.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(locale, this, *args)");
        return format;
    }

    @fz4(name = "formatNullable")
    @dx4
    @tp4(version = "1.4")
    private static final String R1(j35 j35Var, Locale locale, String str, Object... objArr) {
        c25.p(j35Var, "<this>");
        c25.p(str, "format");
        c25.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        c25.o(format, "format(locale, format, *args)");
        return format;
    }

    @NotNull
    public static final Comparator<String> S1(@NotNull j35 j35Var) {
        c25.p(j35Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        c25.o(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @dx4
    private static final String T1(String str) {
        c25.p(str, "<this>");
        String intern = str.intern();
        c25.o(intern, "this as java.lang.String).intern()");
        return intern;
    }

    public static final boolean U1(@NotNull CharSequence charSequence) {
        boolean z;
        c25.p(charSequence, "<this>");
        if (charSequence.length() != 0) {
            c55 h3 = c95.h3(charSequence);
            if (!(h3 instanceof Collection) || !((Collection) h3).isEmpty()) {
                Iterator<Integer> it = h3.iterator();
                while (it.hasNext()) {
                    if (!d85.r(charSequence.charAt(((ft4) it).b()))) {
                        z = false;
                        break;
                    }
                }
            }
            z = true;
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String V1(String str) {
        c25.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.5")
    private static final String W1(String str, Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        c25.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @dx4
    private static final int X1(String str, char c, int i) {
        c25.p(str, "<this>");
        return str.indexOf(c, i);
    }

    @dx4
    private static final int Y1(String str, String str2, int i) {
        c25.p(str, "<this>");
        c25.p(str2, "str");
        return str.indexOf(str2, i);
    }

    @dx4
    private static final int Z1(String str, char c, int i) {
        c25.p(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    @dx4
    private static final int a2(String str, String str2, int i) {
        c25.p(str, "<this>");
        c25.p(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    @dx4
    private static final int b2(String str, int i, int i2) {
        c25.p(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    public static final boolean c2(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        c25.p(charSequence, "<this>");
        c25.p(charSequence2, "other");
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return d2((String) charSequence, i, (String) charSequence2, i2, i3, z);
        }
        return c95.a4(charSequence, i, charSequence2, i2, i3, z);
    }

    @dx4
    private static final String d1(StringBuffer stringBuffer) {
        c25.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static final boolean d2(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "other");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    @dx4
    private static final String e1(StringBuilder sb) {
        c25.p(sb, "stringBuilder");
        return new String(sb);
    }

    @dx4
    private static final String f1(byte[] bArr) {
        c25.p(bArr, "bytes");
        return new String(bArr, f85.b);
    }

    @dx4
    private static final String g1(byte[] bArr, int i, int i2) {
        c25.p(bArr, "bytes");
        return new String(bArr, i, i2, f85.b);
    }

    @NotNull
    public static final String g2(@NotNull CharSequence charSequence, int i) {
        c25.p(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        } else if (i != 0) {
            if (i != 1) {
                int length = charSequence.length();
                if (length != 0) {
                    if (length != 1) {
                        StringBuilder sb = new StringBuilder(charSequence.length() * i);
                        ft4 W = wo1.W(1, i);
                        while (W.hasNext()) {
                            W.b();
                            sb.append(charSequence);
                        }
                        String sb2 = sb.toString();
                        c25.o(sb2, "{\n                    va…tring()\n                }");
                        return sb2;
                    }
                    char charAt = charSequence.charAt(0);
                    char[] cArr = new char[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        cArr[i2] = charAt;
                    }
                    return new String(cArr);
                }
                return "";
            }
            return charSequence.toString();
        } else {
            return "";
        }
    }

    @dx4
    private static final String h1(byte[] bArr, int i, int i2, Charset charset) {
        c25.p(bArr, "bytes");
        c25.p(charset, "charset");
        return new String(bArr, i, i2, charset);
    }

    @NotNull
    public static final String h2(@NotNull String str, char c, char c2, boolean z) {
        c25.p(str, "<this>");
        if (!z) {
            String replace = str.replace(c, c2);
            c25.o(replace, "this as java.lang.String…replace(oldChar, newChar)");
            return replace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (e85.J(charAt, c, z)) {
                charAt = c2;
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        c25.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    @dx4
    private static final String i1(byte[] bArr, Charset charset) {
        c25.p(bArr, "bytes");
        c25.p(charset, "charset");
        return new String(bArr, charset);
    }

    @NotNull
    public static final String i2(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "oldValue");
        c25.p(str3, "newValue");
        int i = 0;
        int n3 = c95.n3(str, str2, 0, z);
        if (n3 < 0) {
            return str;
        }
        int length = str2.length();
        int n = i55.n(length, 1);
        int length2 = str3.length() + (str.length() - length);
        if (length2 >= 0) {
            StringBuilder sb = new StringBuilder(length2);
            do {
                sb.append((CharSequence) str, i, n3);
                sb.append(str3);
                i = n3 + length;
                if (n3 >= str.length()) {
                    break;
                }
                n3 = c95.n3(str, str2, n3 + n, z);
            } while (n3 > 0);
            sb.append((CharSequence) str, i, str.length());
            String sb2 = sb.toString();
            c25.o(sb2, "stringBuilder.append(this, i, length).toString()");
            return sb2;
        }
        throw new OutOfMemoryError();
    }

    @dx4
    private static final String j1(char[] cArr) {
        c25.p(cArr, "chars");
        return new String(cArr);
    }

    public static /* synthetic */ String j2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return h2(str, c, c2, z);
    }

    @dx4
    private static final String k1(char[] cArr, int i, int i2) {
        c25.p(cArr, "chars");
        return new String(cArr, i, i2);
    }

    public static /* synthetic */ String k2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return i2(str, str2, str3, z);
    }

    @dx4
    private static final String l1(int[] iArr, int i, int i2) {
        c25.p(iArr, "codePoints");
        return new String(iArr, i, i2);
    }

    @NotNull
    public static final String l2(@NotNull String str, char c, char c2, boolean z) {
        c25.p(str, "<this>");
        int q3 = c95.q3(str, c, 0, z, 2, null);
        return q3 < 0 ? str : c95.I4(str, q3, q3 + 1, String.valueOf(c2)).toString();
    }

    @yn4(warningSince = "1.5")
    @xn4(message = "Use replaceFirstChar instead.", replaceWith = @op4(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @NotNull
    public static final String m1(@NotNull String str) {
        c25.p(str, "<this>");
        Locale locale = Locale.getDefault();
        c25.o(locale, "getDefault()");
        return n1(str, locale);
    }

    @NotNull
    public static final String m2(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "oldValue");
        c25.p(str3, "newValue");
        int r3 = c95.r3(str, str2, 0, z, 2, null);
        return r3 < 0 ? str : c95.I4(str, r3, str2.length() + r3, str3).toString();
    }

    @dr4(markerClass = {fo4.class})
    @yn4(warningSince = "1.5")
    @xn4(message = "Use replaceFirstChar instead.", replaceWith = @op4(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @NotNull
    @fx4
    @tp4(version = "1.4")
    public static final String n1(@NotNull String str, @NotNull Locale locale) {
        c25.p(str, "<this>");
        c25.p(locale, "locale");
        if (str.length() > 0) {
            char charAt = str.charAt(0);
            if (Character.isLowerCase(charAt)) {
                StringBuilder sb = new StringBuilder();
                char titleCase = Character.toTitleCase(charAt);
                if (titleCase != Character.toUpperCase(charAt)) {
                    sb.append(titleCase);
                } else {
                    String substring = str.substring(0, 1);
                    c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    c25.n(substring, "null cannot be cast to non-null type java.lang.String");
                    String upperCase = substring.toUpperCase(locale);
                    c25.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                String substring2 = str.substring(1);
                c25.o(substring2, "this as java.lang.String).substring(startIndex)");
                sb.append(substring2);
                String sb2 = sb.toString();
                c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return sb2;
            }
            return str;
        }
        return str;
    }

    public static /* synthetic */ String n2(String str, char c, char c2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return l2(str, c, c2, z);
    }

    @dx4
    private static final int o1(String str, int i) {
        c25.p(str, "<this>");
        return str.codePointAt(i);
    }

    public static /* synthetic */ String o2(String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return m2(str, str2, str3, z);
    }

    @dx4
    private static final int p1(String str, int i) {
        c25.p(str, "<this>");
        return str.codePointBefore(i);
    }

    @NotNull
    public static final List<String> p2(@NotNull CharSequence charSequence, @NotNull Pattern pattern, int i) {
        c25.p(charSequence, "<this>");
        c25.p(pattern, "regex");
        c95.M4(i);
        if (i == 0) {
            i = -1;
        }
        String[] split = pattern.split(charSequence, i);
        c25.o(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return zr4.t(split);
    }

    @dx4
    private static final int q1(String str, int i, int i2) {
        c25.p(str, "<this>");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ List q2(CharSequence charSequence, Pattern pattern, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return p2(charSequence, pattern, i);
    }

    public static final int r1(@NotNull String str, @NotNull String str2, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "other");
        if (z) {
            return str.compareToIgnoreCase(str2);
        }
        return str.compareTo(str2);
    }

    public static final boolean r2(@NotNull String str, @NotNull String str2, int i, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2, i);
        }
        return d2(str, i, str2, 0, str2.length(), z);
    }

    public static /* synthetic */ int s1(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return r1(str, str2, z);
    }

    public static final boolean s2(@NotNull String str, @NotNull String str2, boolean z) {
        c25.p(str, "<this>");
        c25.p(str2, "prefix");
        if (!z) {
            return str.startsWith(str2);
        }
        return d2(str, 0, str2, 0, str2.length(), z);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final String t1(@NotNull char[] cArr) {
        c25.p(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ boolean t2(String str, String str2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return r2(str, str2, i, z);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.4")
    @NotNull
    public static final String u1(@NotNull char[] cArr, int i, int i2) {
        c25.p(cArr, "<this>");
        nr4.s.a(i, i2, cArr.length);
        return new String(cArr, i, i2 - i);
    }

    public static /* synthetic */ boolean u2(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return s2(str, str2, z);
    }

    public static /* synthetic */ String v1(char[] cArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return u1(cArr, i, i2);
    }

    @dx4
    private static final String v2(String str, int i) {
        c25.p(str, "<this>");
        String substring = str.substring(i);
        c25.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @tp4(version = "1.5")
    public static final boolean w1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2) {
        if ((charSequence instanceof String) && charSequence2 != null) {
            return ((String) charSequence).contentEquals(charSequence2);
        }
        return c95.X2(charSequence, charSequence2);
    }

    @dx4
    private static final String w2(String str, int i, int i2) {
        c25.p(str, "<this>");
        String substring = str.substring(i, i2);
        c25.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @tp4(version = "1.5")
    public static final boolean x1(@Nullable CharSequence charSequence, @Nullable CharSequence charSequence2, boolean z) {
        if (z) {
            return c95.W2(charSequence, charSequence2);
        }
        return w1(charSequence, charSequence2);
    }

    @dx4
    private static final byte[] x2(String str, Charset charset) {
        c25.p(str, "<this>");
        c25.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @dx4
    private static final boolean y1(String str, CharSequence charSequence) {
        c25.p(str, "<this>");
        c25.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    public static /* synthetic */ byte[] y2(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(str, "<this>");
        c25.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @dx4
    private static final boolean z1(String str, StringBuffer stringBuffer) {
        c25.p(str, "<this>");
        c25.p(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @dx4
    private static final char[] z2(String str) {
        c25.p(str, "<this>");
        char[] charArray = str.toCharArray();
        c25.o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }
}
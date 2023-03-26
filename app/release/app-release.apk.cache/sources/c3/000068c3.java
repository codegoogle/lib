package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringNumberConversionsJVM.kt */
@vo4(d1 = {"\u0000Z\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\r\u0010\u0012\u001a\u00020\u0013*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0002\b\u0014\u001a\r\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\u0016*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001a\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001e\u001a\r\u0010\u001f\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010 \u001a\u00020!*\u00020\u0003H\u0087\b\u001a\u0015\u0010 \u001a\u00020!*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\"\u001a\u00020#*\u00020\u0003H\u0087\b\u001a\u0015\u0010\"\u001a\u00020#*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020!2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010$\u001a\u00020\u0003*\u00020#2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006%"}, d2 = {"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toBooleanNullable", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class z85 extends y85 {
    @tp4(version = "1.2")
    @Nullable
    public static final BigInteger A0(@NotNull String str) {
        c25.p(str, "<this>");
        return B0(str, 10);
    }

    @tp4(version = "1.2")
    @Nullable
    public static final BigInteger B0(@NotNull String str, int i) {
        c25.p(str, "<this>");
        d85.a(i);
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                    if (d85.b(str.charAt(i2), i) < 0) {
                        return null;
                    }
                }
            } else if (d85.b(str.charAt(0), i) < 0) {
                return null;
            }
            return new BigInteger(str, d85.a(i));
        }
        return null;
    }

    @fz4(name = "toBooleanNullable")
    @dx4
    @tp4(version = "1.4")
    private static final boolean D0(String str) {
        return Boolean.parseBoolean(str);
    }

    @dx4
    private static final byte E0(String str) {
        c25.p(str, "<this>");
        return Byte.parseByte(str);
    }

    @dx4
    @tp4(version = "1.1")
    private static final byte F0(String str, int i) {
        c25.p(str, "<this>");
        return Byte.parseByte(str, d85.a(i));
    }

    @dx4
    private static final double G0(String str) {
        c25.p(str, "<this>");
        return Double.parseDouble(str);
    }

    @tp4(version = "1.1")
    @Nullable
    public static final Double H0(@NotNull String str) {
        c25.p(str, "<this>");
        try {
            if (r85.b.n(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dx4
    private static final float I0(String str) {
        c25.p(str, "<this>");
        return Float.parseFloat(str);
    }

    @tp4(version = "1.1")
    @Nullable
    public static final Float J0(@NotNull String str) {
        c25.p(str, "<this>");
        try {
            if (r85.b.n(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dx4
    private static final int K0(String str) {
        c25.p(str, "<this>");
        return Integer.parseInt(str);
    }

    @dx4
    @tp4(version = "1.1")
    private static final int L0(String str, int i) {
        c25.p(str, "<this>");
        return Integer.parseInt(str, d85.a(i));
    }

    @dx4
    private static final long M0(String str) {
        c25.p(str, "<this>");
        return Long.parseLong(str);
    }

    @dx4
    @tp4(version = "1.1")
    private static final long N0(String str, int i) {
        c25.p(str, "<this>");
        return Long.parseLong(str, d85.a(i));
    }

    @dx4
    private static final short O0(String str) {
        c25.p(str, "<this>");
        return Short.parseShort(str);
    }

    @dx4
    @tp4(version = "1.1")
    private static final short P0(String str, int i) {
        c25.p(str, "<this>");
        return Short.parseShort(str, d85.a(i));
    }

    @dx4
    @tp4(version = "1.1")
    private static final String Q0(byte b, int i) {
        String num = Integer.toString(b, d85.a(d85.a(i)));
        c25.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @dx4
    @tp4(version = "1.1")
    private static final String R0(int i, int i2) {
        String num = Integer.toString(i, d85.a(i2));
        c25.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    @dx4
    @tp4(version = "1.1")
    private static final String S0(long j, int i) {
        String l = Long.toString(j, d85.a(i));
        c25.o(l, "toString(this, checkRadix(radix))");
        return l;
    }

    @dx4
    @tp4(version = "1.1")
    private static final String T0(short s, int i) {
        String num = Integer.toString(s, d85.a(d85.a(i)));
        c25.o(num, "toString(this, checkRadix(radix))");
        return num;
    }

    private static final <T> T t0(String str, f05<? super String, ? extends T> f05Var) {
        try {
            if (r85.b.n(str)) {
                return f05Var.M(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal u0(String str) {
        c25.p(str, "<this>");
        return new BigDecimal(str);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal v0(String str, MathContext mathContext) {
        c25.p(str, "<this>");
        c25.p(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @tp4(version = "1.2")
    @Nullable
    public static final BigDecimal w0(@NotNull String str) {
        c25.p(str, "<this>");
        try {
            if (r85.b.n(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @tp4(version = "1.2")
    @Nullable
    public static final BigDecimal x0(@NotNull String str, @NotNull MathContext mathContext) {
        c25.p(str, "<this>");
        c25.p(mathContext, "mathContext");
        try {
            if (r85.b.n(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger y0(String str) {
        c25.p(str, "<this>");
        return new BigInteger(str);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger z0(String str, int i) {
        c25.p(str, "<this>");
        return new BigInteger(str, d85.a(i));
    }
}
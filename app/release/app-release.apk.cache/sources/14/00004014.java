package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Char.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0002*\u00020\u0001H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0007\u001a\u001c\u0010\b\u001a\u00020\t*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\t\u001a\n\u0010\f\u001a\u00020\t*\u00020\u0001\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\n\u001a\u00020\u000eH\u0087\n\u001a\f\u0010\u000f\u001a\u00020\u000e*\u00020\u0001H\u0007¨\u0006\u0010"}, d2 = {"digitToChar", "", "", "radix", "digitToInt", "digitToIntOrNull", "(C)Ljava/lang/Integer;", "(CI)Ljava/lang/Integer;", "equals", "", "other", "ignoreCase", "isSurrogate", "plus", "", "titlecase", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/CharsKt")
/* loaded from: classes3.dex */
public class e85 extends d85 {
    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    public static final char D(int i) {
        if (new c55(0, 9).o(i)) {
            return (char) (i + 48);
        }
        throw new IllegalArgumentException(wo1.n("Int ", i, " is not a decimal digit"));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    public static final char E(int i, int i2) {
        if (new c55(2, 36).o(i2)) {
            if (i < 0 || i >= i2) {
                throw new IllegalArgumentException(wo1.o("Digit ", i, " does not represent a valid digit in radix ", i2));
            }
            return (char) (i < 10 ? i + 48 : ((char) (i + 65)) - '\n');
        }
        throw new IllegalArgumentException(wo1.n("Invalid radix: ", i2, ". Valid radix values are in range 2..36"));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    public static final int F(char c) {
        int b = d85.b(c, 10);
        if (b >= 0) {
            return b;
        }
        throw new IllegalArgumentException("Char " + c + " is not a decimal digit");
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    public static final int G(char c, int i) {
        Integer I = I(c, i);
        if (I != null) {
            return I.intValue();
        }
        throw new IllegalArgumentException("Char " + c + " is not a digit in the given radix=" + i);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    @Nullable
    public static final Integer H(char c) {
        Integer valueOf = Integer.valueOf(d85.b(c, 10));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.5")
    @Nullable
    public static final Integer I(char c, int i) {
        d85.a(i);
        Integer valueOf = Integer.valueOf(d85.b(c, i));
        if (valueOf.intValue() >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean J(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (z) {
            char upperCase = Character.toUpperCase(c);
            char upperCase2 = Character.toUpperCase(c2);
            return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
        }
        return false;
    }

    public static /* synthetic */ boolean K(char c, char c2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return J(c, c2, z);
    }

    public static final boolean L(char c) {
        return new u45((char) 55296, (char) 57343).o(c);
    }

    @dx4
    private static final String M(char c, String str) {
        c25.p(str, "other");
        return c + str;
    }

    @tp4(version = "1.5")
    @NotNull
    public static final String N(char c) {
        return j95.a(c);
    }
}
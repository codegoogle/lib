package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import org.jetbrains.annotations.NotNull;

/* compiled from: _StringsJvm.kt */
@vo4(d1 = {"\u0000B\n\u0000\n\u0002\u0010\f\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0007\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0006\u001a;\u0010\u0013\u001a\u0004\u0018\u00010\u0001\"\u000e\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\t*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\b0\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00010\u000fj\n\u0012\u0006\b\u0000\u0012\u00020\u0001`\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a)\u0010\u0015\u001a\u00020\u0016*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0017\u001a)\u0010\u0015\u001a\u00020\u0018*\u00020\u00022\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00180\u000bH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0019\u001a\u0010\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b*\u00020\u0002\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001c"}, d2 = {"elementAt", "", "", la1.l, "", "max", "(Ljava/lang/CharSequence;)Ljava/lang/Character;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "(Ljava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Character;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "(Ljava/lang/CharSequence;Ljava/util/Comparator;)Ljava/lang/Character;", "min", "minBy", "minWith", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class d95 extends c95 {
    @dx4
    private static final char W5(CharSequence charSequence, int i) {
        c25.p(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxByOrNull instead.", replaceWith = @op4(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character Y5(CharSequence charSequence, f05<? super Character, ? extends R> f05Var) {
        if (wo1.m(charSequence, "<this>", f05Var, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int i3 = c95.i3(charSequence);
        if (i3 == 0) {
            return Character.valueOf(charAt);
        }
        R M = f05Var.M(Character.valueOf(charAt));
        ft4 W = wo1.W(1, i3);
        while (W.hasNext()) {
            char charAt2 = charSequence.charAt(W.b());
            R M2 = f05Var.M(Character.valueOf(charAt2));
            if (M.compareTo(M2) < 0) {
                charAt = charAt2;
                M = M2;
            }
        }
        return Character.valueOf(charAt);
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use maxWithOrNull instead.", replaceWith = @op4(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character Z5(CharSequence charSequence, Comparator comparator) {
        c25.p(charSequence, "<this>");
        c25.p(comparator, "comparator");
        return e95.R7(charSequence, comparator);
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minByOrNull instead.", replaceWith = @op4(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character b6(CharSequence charSequence, f05<? super Character, ? extends R> f05Var) {
        if (wo1.m(charSequence, "<this>", f05Var, "selector") == 0) {
            return null;
        }
        char charAt = charSequence.charAt(0);
        int i3 = c95.i3(charSequence);
        if (i3 == 0) {
            return Character.valueOf(charAt);
        }
        R M = f05Var.M(Character.valueOf(charAt));
        ft4 W = wo1.W(1, i3);
        while (W.hasNext()) {
            char charAt2 = charSequence.charAt(W.b());
            R M2 = f05Var.M(Character.valueOf(charAt2));
            if (M.compareTo(M2) > 0) {
                charAt = charAt2;
                M = M2;
            }
        }
        return Character.valueOf(charAt);
    }

    @yn4(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @xn4(message = "Use minWithOrNull instead.", replaceWith = @op4(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character c6(CharSequence charSequence, Comparator comparator) {
        c25.p(charSequence, "<this>");
        c25.p(comparator, "comparator");
        return e95.f8(charSequence, comparator);
    }

    @fz4(name = "sumOfBigDecimal")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigDecimal d6(CharSequence charSequence, f05<? super Character, ? extends BigDecimal> f05Var) {
        c25.p(charSequence, "<this>");
        c25.p(f05Var, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigDecimal) wo1.e(charSequence, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @fz4(name = "sumOfBigInteger")
    @dx4
    @gp4
    @tp4(version = "1.4")
    private static final BigInteger e6(CharSequence charSequence, f05<? super Character, ? extends BigInteger> f05Var) {
        c25.p(charSequence, "<this>");
        c25.p(f05Var, "selector");
        BigInteger valueOf = BigInteger.valueOf(0L);
        c25.o(valueOf, "valueOf(this.toLong())");
        for (int i = 0; i < charSequence.length(); i++) {
            valueOf = valueOf.add((BigInteger) wo1.e(charSequence, i, f05Var));
            c25.o(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @NotNull
    public static final SortedSet<Character> f6(@NotNull CharSequence charSequence) {
        c25.p(charSequence, "<this>");
        return (SortedSet) e95.e9(charSequence, new TreeSet());
    }
}
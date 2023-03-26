package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* compiled from: BigDecimals.kt */
@vo4(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\nH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000eH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u000fH\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0001*\u00020\u0001H\u0087\n¨\u0006\u0011"}, d2 = {"dec", "Ljava/math/BigDecimal;", "div", "other", "inc", "minus", "plus", "rem", "times", "toBigDecimal", "", "mathContext", "Ljava/math/MathContext;", "", "", "", "unaryMinus", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
public class zo4 {
    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal a(BigDecimal bigDecimal) {
        c25.p(bigDecimal, "<this>");
        BigDecimal subtract = bigDecimal.subtract(BigDecimal.ONE);
        c25.o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }

    @dx4
    private static final BigDecimal b(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        c25.p(bigDecimal, "<this>");
        c25.p(bigDecimal2, "other");
        BigDecimal divide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        c25.o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal c(BigDecimal bigDecimal) {
        c25.p(bigDecimal, "<this>");
        BigDecimal add = bigDecimal.add(BigDecimal.ONE);
        c25.o(add, "this.add(BigDecimal.ONE)");
        return add;
    }

    @dx4
    private static final BigDecimal d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        c25.p(bigDecimal, "<this>");
        c25.p(bigDecimal2, "other");
        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
        c25.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @dx4
    private static final BigDecimal e(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        c25.p(bigDecimal, "<this>");
        c25.p(bigDecimal2, "other");
        BigDecimal add = bigDecimal.add(bigDecimal2);
        c25.o(add, "this.add(other)");
        return add;
    }

    @dx4
    private static final BigDecimal f(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        c25.p(bigDecimal, "<this>");
        c25.p(bigDecimal2, "other");
        BigDecimal remainder = bigDecimal.remainder(bigDecimal2);
        c25.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @dx4
    private static final BigDecimal g(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        c25.p(bigDecimal, "<this>");
        c25.p(bigDecimal2, "other");
        BigDecimal multiply = bigDecimal.multiply(bigDecimal2);
        c25.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal h(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal i(double d, MathContext mathContext) {
        c25.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal j(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal k(float f, MathContext mathContext) {
        c25.p(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal l(int i) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        c25.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal m(int i, MathContext mathContext) {
        c25.p(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal n(long j) {
        BigDecimal valueOf = BigDecimal.valueOf(j);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal o(long j, MathContext mathContext) {
        c25.p(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @dx4
    private static final BigDecimal p(BigDecimal bigDecimal) {
        c25.p(bigDecimal, "<this>");
        BigDecimal negate = bigDecimal.negate();
        c25.o(negate, "this.negate()");
        return negate;
    }
}
package com.p7700g.p99005;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* compiled from: BigIntegers.kt */
@vo4(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", "other", "dec", "div", "inc", "inv", "minus", "or", "plus", "rem", "shl", "n", "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
public class ap4 extends zo4 {
    @dx4
    @tp4(version = "1.2")
    private static final BigInteger A(BigInteger bigInteger, int i) {
        c25.p(bigInteger, "<this>");
        BigInteger shiftRight = bigInteger.shiftRight(i);
        c25.o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }

    @dx4
    private static final BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger multiply = bigInteger.multiply(bigInteger2);
        c25.o(multiply, "this.multiply(other)");
        return multiply;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal C(BigInteger bigInteger) {
        c25.p(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigDecimal D(BigInteger bigInteger, int i, MathContext mathContext) {
        c25.p(bigInteger, "<this>");
        c25.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    public static /* synthetic */ BigDecimal E(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
            c25.o(mathContext, it0.b);
        }
        c25.p(bigInteger, "<this>");
        c25.p(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger F(int i) {
        BigInteger valueOf = BigInteger.valueOf(i);
        c25.o(valueOf, "valueOf(this.toLong())");
        return valueOf;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger G(long j) {
        BigInteger valueOf = BigInteger.valueOf(j);
        c25.o(valueOf, "valueOf(this)");
        return valueOf;
    }

    @dx4
    private static final BigInteger H(BigInteger bigInteger) {
        c25.p(bigInteger, "<this>");
        BigInteger negate = bigInteger.negate();
        c25.o(negate, "this.negate()");
        return negate;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger I(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger xor = bigInteger.xor(bigInteger2);
        c25.o(xor, "this.xor(other)");
        return xor;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger q(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger and = bigInteger.and(bigInteger2);
        c25.o(and, "this.and(other)");
        return and;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger r(BigInteger bigInteger) {
        c25.p(bigInteger, "<this>");
        BigInteger subtract = bigInteger.subtract(BigInteger.ONE);
        c25.o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }

    @dx4
    private static final BigInteger s(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger divide = bigInteger.divide(bigInteger2);
        c25.o(divide, "this.divide(other)");
        return divide;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger t(BigInteger bigInteger) {
        c25.p(bigInteger, "<this>");
        BigInteger add = bigInteger.add(BigInteger.ONE);
        c25.o(add, "this.add(BigInteger.ONE)");
        return add;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger u(BigInteger bigInteger) {
        c25.p(bigInteger, "<this>");
        BigInteger not = bigInteger.not();
        c25.o(not, "this.not()");
        return not;
    }

    @dx4
    private static final BigInteger v(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger subtract = bigInteger.subtract(bigInteger2);
        c25.o(subtract, "this.subtract(other)");
        return subtract;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger w(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger or = bigInteger.or(bigInteger2);
        c25.o(or, "this.or(other)");
        return or;
    }

    @dx4
    private static final BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger add = bigInteger.add(bigInteger2);
        c25.o(add, "this.add(other)");
        return add;
    }

    @dx4
    @tp4(version = "1.1")
    private static final BigInteger y(BigInteger bigInteger, BigInteger bigInteger2) {
        c25.p(bigInteger, "<this>");
        c25.p(bigInteger2, "other");
        BigInteger remainder = bigInteger.remainder(bigInteger2);
        c25.o(remainder, "this.remainder(other)");
        return remainder;
    }

    @dx4
    @tp4(version = "1.2")
    private static final BigInteger z(BigInteger bigInteger, int i) {
        c25.p(bigInteger, "<this>");
        BigInteger shiftLeft = bigInteger.shiftLeft(i);
        c25.o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
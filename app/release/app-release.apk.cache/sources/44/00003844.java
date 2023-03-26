package com.p7700g.p99005;

import com.microsoft.appcenter.persistence.DatabasePersistence;
import com.p7700g.p99005.aa;

/* compiled from: MathJVM.kt */
@vo4(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b7\u001a\u0011\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010 \u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0011\u0010 \u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\"\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010#\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010%\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010&\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010'\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010(\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010)\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0018\u0010*\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\u0001H\u0007\u001a\u0018\u0010*\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0006H\u0007\u001a\u0011\u0010,\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010,\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u0010-\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u0010-\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0019\u0010.\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u0010.\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0019\u00101\u001a\u00020\u00012\u0006\u0010/\u001a\u00020\u00012\u0006\u00100\u001a\u00020\u0001H\u0087\b\u001a\u0019\u00101\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0006H\u0087\b\u001a\u0019\u00101\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0087\b\u001a\u0019\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0087\b\u001a\u0011\u00102\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00102\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00103\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00104\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00105\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00106\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0011\u00107\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0010\u00108\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0007\u001a\u0010\u00108\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0007\u001a\u0015\u00109\u001a\u00020\u0001*\u00020\u00012\u0006\u0010:\u001a\u00020\u0001H\u0087\b\u001a\u0015\u00109\u001a\u00020\u0006*\u00020\u00062\u0006\u0010:\u001a\u00020\u0006H\u0087\b\u001a\r\u0010;\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010;\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0001*\u00020\u00012\u0006\u0010=\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010<\u001a\u00020\u0006*\u00020\u00062\u0006\u0010=\u001a\u00020\u0006H\u0087\b\u001a\r\u0010>\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010>\u001a\u00020\u0006*\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010?\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0018\u001a\u00020\tH\u0087\b\u001a\f\u0010@\u001a\u00020\t*\u00020\u0001H\u0007\u001a\f\u0010@\u001a\u00020\t*\u00020\u0006H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0001H\u0007\u001a\f\u0010A\u001a\u00020\f*\u00020\u0006H\u0007\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006H\u0087\b\u001a\u0015\u0010B\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0087\b\"\u001f\u0010\u0000\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001f\u0010\u0000\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\b\"\u001f\u0010\u0000\u001a\u00020\t*\u00020\t8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\n\u001a\u0004\b\u0004\u0010\u000b\"\u001f\u0010\u0000\u001a\u00020\f*\u00020\f8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0002\u0010\r\u001a\u0004\b\u0004\u0010\u000e\"\u001f\u0010\u000f\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u0011\u0010\u0005\"\u001f\u0010\u000f\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\u000b\"\u001e\u0010\u000f\u001a\u00020\t*\u00020\f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0013\u001a\u00020\u0001*\u00020\u00018Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0005\"\u001f\u0010\u0013\u001a\u00020\u0006*\u00020\u00068Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0007\u001a\u0004\b\u0015\u0010\b¨\u0006C"}, d2 = {"absoluteValue", "", "getAbsoluteValue$annotations", "(D)V", "getAbsoluteValue", "(D)D", "", "(F)V", "(F)F", "", "(I)V", "(I)I", "", "(J)V", "(J)J", "sign", "getSign$annotations", "getSign", "(J)I", "ulp", "getUlp$annotations", "getUlp", "abs", "x", "n", "acos", "acosh", "asin", "asinh", "atan", "atan2", "y", "atanh", "ceil", "cos", "cosh", "exp", "expm1", "floor", "hypot", "ln", "ln1p", DatabasePersistence.COLUMN_LOG, "base", "log10", "log2", "max", "a", "b", "min", "round", "sin", "sinh", "sqrt", "tan", "tanh", "truncate", "IEEErem", "divisor", "nextDown", "nextTowards", aa.h.d, "nextUp", "pow", "roundToInt", "roundToLong", "withSign", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/math/MathKt")
/* loaded from: classes3.dex */
public class a45 extends z35 {
    @dx4
    @tp4(version = "1.2")
    private static final double A(double d) {
        return Math.cosh(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double A0(double d) {
        return Math.nextUp(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float B(float f) {
        return (float) Math.cosh(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float B0(float f) {
        return Math.nextUp(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double C(double d) {
        return Math.exp(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double C0(double d, double d2) {
        return Math.pow(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float D(float f) {
        return (float) Math.exp(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double D0(double d, int i) {
        return Math.pow(d, i);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double E(double d) {
        return Math.expm1(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float E0(float f, float f2) {
        return (float) Math.pow(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float F(float f) {
        return (float) Math.expm1(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float F0(float f, int i) {
        return (float) Math.pow(f, i);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double G(double d) {
        return Math.floor(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double G0(double d) {
        return Math.rint(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float H(float f) {
        return (float) Math.floor(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float H0(float f) {
        return (float) Math.rint(f);
    }

    private static final double I(double d) {
        return Math.abs(d);
    }

    @tp4(version = "1.2")
    public static final int I0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    private static final float J(float f) {
        return Math.abs(f);
    }

    @tp4(version = "1.2")
    public static final int J0(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    private static final int K(int i) {
        return Math.abs(i);
    }

    @tp4(version = "1.2")
    public static final long K0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    private static final long L(long j) {
        return Math.abs(j);
    }

    @tp4(version = "1.2")
    public static final long L0(float f) {
        return K0(f);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void M(double d) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double M0(double d) {
        return Math.signum(d);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void N(float f) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final float N0(float f) {
        return Math.signum(f);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void O(int i) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double O0(double d) {
        return Math.sin(d);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void P(long j) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final float P0(float f) {
        return (float) Math.sin(f);
    }

    private static final double Q(double d) {
        return Math.signum(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double Q0(double d) {
        return Math.sinh(d);
    }

    private static final float R(float f) {
        return Math.signum(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float R0(float f) {
        return (float) Math.sinh(f);
    }

    public static final int S(int i) {
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @dx4
    @tp4(version = "1.2")
    private static final double S0(double d) {
        return Math.sqrt(d);
    }

    public static final int T(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        return i > 0 ? 1 : 0;
    }

    @dx4
    @tp4(version = "1.2")
    private static final float T0(float f) {
        return (float) Math.sqrt(f);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void U(double d) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double U0(double d) {
        return Math.tan(d);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void V(float f) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final float V0(float f) {
        return (float) Math.tan(f);
    }

    @tp4(version = "1.2")
    public static /* synthetic */ void W(int i) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double W0(double d) {
        return Math.tanh(d);
    }

    @tp4(version = "1.2")
    public static /* synthetic */ void X(long j) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final float X0(float f) {
        return (float) Math.tanh(f);
    }

    private static final double Y(double d) {
        return Math.ulp(d);
    }

    @tp4(version = "1.2")
    public static final double Y0(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            return d;
        }
        if (d > zg2.s) {
            return Math.floor(d);
        }
        return Math.ceil(d);
    }

    private static final float Z(float f) {
        return Math.ulp(f);
    }

    @tp4(version = "1.2")
    public static final float Z0(float f) {
        double ceil;
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return f;
        }
        if (f > 0.0f) {
            ceil = Math.floor(f);
        } else {
            ceil = Math.ceil(f);
        }
        return (float) ceil;
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void a0(double d) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double a1(double d, double d2) {
        return Math.copySign(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    public static /* synthetic */ void b0(float f) {
    }

    @dx4
    @tp4(version = "1.2")
    private static final double b1(double d, int i) {
        return Math.copySign(d, i);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double c(double d, double d2) {
        return Math.IEEEremainder(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double c0(double d, double d2) {
        return Math.hypot(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float c1(float f, float f2) {
        return Math.copySign(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float d(float f, float f2) {
        return (float) Math.IEEEremainder(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float d0(float f, float f2) {
        return (float) Math.hypot(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float d1(float f, int i) {
        return Math.copySign(f, i);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double e(double d) {
        return Math.abs(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double e0(double d) {
        return Math.log(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float f(float f) {
        return Math.abs(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float f0(float f) {
        return (float) Math.log(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final int g(int i) {
        return Math.abs(i);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double g0(double d) {
        return Math.log1p(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final long h(long j) {
        return Math.abs(j);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float h0(float f) {
        return (float) Math.log1p(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double i(double d) {
        return Math.acos(d);
    }

    @tp4(version = "1.2")
    public static final double i0(double d, double d2) {
        if (d2 > zg2.s) {
            if (d2 == 1.0d) {
                return Double.NaN;
            }
            return Math.log(d) / Math.log(d2);
        }
        return Double.NaN;
    }

    @dx4
    @tp4(version = "1.2")
    private static final float j(float f) {
        return (float) Math.acos(f);
    }

    @tp4(version = "1.2")
    public static final float j0(float f, float f2) {
        if (f2 > 0.0f) {
            if (f2 == 1.0f) {
                return Float.NaN;
            }
            return (float) (Math.log(f) / Math.log(f2));
        }
        return Float.NaN;
    }

    @tp4(version = "1.2")
    public static final double k(double d) {
        if (d < 1.0d) {
            return Double.NaN;
        }
        if (d > x35.f) {
            return Math.log(d) + x35.b;
        }
        double d2 = 1;
        double d3 = d - d2;
        if (d3 >= x35.e) {
            return Math.log(Math.sqrt((d * d) - d2) + d);
        }
        double sqrt = Math.sqrt(d3);
        if (sqrt >= x35.d) {
            sqrt -= ((sqrt * sqrt) * sqrt) / 12;
        }
        return sqrt * Math.sqrt(2.0d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double k0(double d) {
        return Math.log10(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float l(float f) {
        return (float) k(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float l0(float f) {
        return (float) Math.log10(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double m(double d) {
        return Math.asin(d);
    }

    @tp4(version = "1.2")
    public static final double m0(double d) {
        return Math.log(d) / x35.b;
    }

    @dx4
    @tp4(version = "1.2")
    private static final float n(float f) {
        return (float) Math.asin(f);
    }

    @tp4(version = "1.2")
    public static final float n0(float f) {
        return (float) (Math.log(f) / x35.b);
    }

    @tp4(version = "1.2")
    public static final double o(double d) {
        double d2 = x35.e;
        if (d < d2) {
            if (d <= (-d2)) {
                return -o(-d);
            }
            return Math.abs(d) >= x35.d ? d - (((d * d) * d) / 6) : d;
        } else if (d > x35.g) {
            if (d > x35.f) {
                return Math.log(d) + x35.b;
            }
            double d3 = d * 2;
            return Math.log((1 / d3) + d3);
        } else {
            return Math.log(Math.sqrt((d * d) + 1) + d);
        }
    }

    @dx4
    @tp4(version = "1.2")
    private static final double o0(double d, double d2) {
        return Math.max(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float p(float f) {
        return (float) o(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float p0(float f, float f2) {
        return Math.max(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double q(double d) {
        return Math.atan(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final int q0(int i, int i2) {
        return Math.max(i, i2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float r(float f) {
        return (float) Math.atan(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final long r0(long j, long j2) {
        return Math.max(j, j2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double s(double d, double d2) {
        return Math.atan2(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double s0(double d, double d2) {
        return Math.min(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float t(float f, float f2) {
        return (float) Math.atan2(f, f2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float t0(float f, float f2) {
        return Math.min(f, f2);
    }

    @tp4(version = "1.2")
    public static final double u(double d) {
        if (Math.abs(d) < x35.e) {
            return Math.abs(d) > x35.d ? d + (((d * d) * d) / 3) : d;
        }
        double d2 = 1;
        return Math.log((d2 + d) / (d2 - d)) / 2;
    }

    @dx4
    @tp4(version = "1.2")
    private static final int u0(int i, int i2) {
        return Math.min(i, i2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float v(float f) {
        return (float) u(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final long v0(long j, long j2) {
        return Math.min(j, j2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double w(double d) {
        return Math.ceil(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double w0(double d) {
        return Math.nextAfter(d, Double.NEGATIVE_INFINITY);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float x(float f) {
        return (float) Math.ceil(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float x0(float f) {
        return Math.nextAfter(f, Double.NEGATIVE_INFINITY);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double y(double d) {
        return Math.cos(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double y0(double d, double d2) {
        return Math.nextAfter(d, d2);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float z(float f) {
        return (float) Math.cos(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final float z0(float f, float f2) {
        return Math.nextAfter(f, f2);
    }
}
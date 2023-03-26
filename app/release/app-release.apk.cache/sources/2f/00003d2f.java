package com.p7700g.p99005;

/* compiled from: NumbersJVM.kt */
@vo4(d1 = {"\u0000*\n\u0000\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0087\b\u001a\u0015\u0010\u0005\u001a\u00020\t*\u00020\n2\u0006\u0010\b\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\r\u001a\u00020\f*\u00020\tH\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\u0006H\u0087\b\u001a\r\u0010\u000e\u001a\u00020\f*\u00020\tH\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0001*\u00020\tH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0002*\u00020\u0006H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\tH\u0087\b¨\u0006\u0016"}, d2 = {"countLeadingZeroBits", "", "", "countOneBits", "countTrailingZeroBits", "fromBits", "", "Lkotlin/Double$Companion;", "bits", "", "Lkotlin/Float$Companion;", "isFinite", "", "isInfinite", "isNaN", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "toBits", "toRawBits", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
public class cp4 extends bp4 {
    @dx4
    @tp4(version = "1.2")
    private static final float A0(r15 r15Var, int i) {
        c25.p(r15Var, "<this>");
        return Float.intBitsToFloat(i);
    }

    @dx4
    private static final boolean B0(double d) {
        return (Double.isInfinite(d) || Double.isNaN(d)) ? false : true;
    }

    @dx4
    private static final boolean C0(float f) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? false : true;
    }

    @dx4
    private static final boolean D0(double d) {
        return Double.isInfinite(d);
    }

    @dx4
    private static final boolean E0(float f) {
        return Float.isInfinite(f);
    }

    @dx4
    private static final boolean F0(double d) {
        return Double.isNaN(d);
    }

    @dx4
    private static final boolean G0(float f) {
        return Float.isNaN(f);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.6")
    private static final int H0(int i, int i2) {
        return Integer.rotateLeft(i, i2);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.6")
    private static final long I0(long j, int i) {
        return Long.rotateLeft(j, i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.6")
    private static final int J0(int i, int i2) {
        return Integer.rotateRight(i, i2);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.6")
    private static final long K0(long j, int i) {
        return Long.rotateRight(j, i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int L0(int i) {
        return Integer.highestOneBit(i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final long M0(long j) {
        return Long.highestOneBit(j);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int N0(int i) {
        return Integer.lowestOneBit(i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final long O0(long j) {
        return Long.lowestOneBit(j);
    }

    @dx4
    @tp4(version = "1.2")
    private static final int P0(float f) {
        return Float.floatToIntBits(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final long Q0(double d) {
        return Double.doubleToLongBits(d);
    }

    @dx4
    @tp4(version = "1.2")
    private static final int R0(float f) {
        return Float.floatToRawIntBits(f);
    }

    @dx4
    @tp4(version = "1.2")
    private static final long S0(double d) {
        return Double.doubleToRawLongBits(d);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int t0(int i) {
        return Integer.numberOfLeadingZeros(i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int u0(long j) {
        return Long.numberOfLeadingZeros(j);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int v0(int i) {
        return Integer.bitCount(i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int w0(long j) {
        return Long.bitCount(j);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int x0(int i) {
        return Integer.numberOfTrailingZeros(i);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int y0(long j) {
        return Long.numberOfTrailingZeros(j);
    }

    @dx4
    @tp4(version = "1.2")
    private static final double z0(o15 o15Var, long j) {
        c25.p(o15Var, "<this>");
        return Double.longBitsToDouble(j);
    }
}
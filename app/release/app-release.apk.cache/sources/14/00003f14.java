package com.p7700g.p99005;

/* compiled from: Numbers.kt */
@vo4(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0005\n\u0002\u0010\n\n\u0002\b\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\u0014\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\u0014\u0010\b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0007\u001a\r\u0010\t\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0003*\u00020\u0003H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010\n\u001a\u00020\u0003*\u00020\u0003H\u0087\b¨\u0006\u000b"}, d2 = {"countLeadingZeroBits", "", "", "", "countOneBits", "countTrailingZeroBits", "rotateLeft", "bitCount", "rotateRight", "takeHighestOneBit", "takeLowestOneBit", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/NumbersKt")
/* loaded from: classes3.dex */
public class dp4 extends cp4 {
    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int T0(byte b) {
        return Integer.numberOfLeadingZeros(b & 255) - 24;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int U0(short s) {
        return Integer.numberOfLeadingZeros(s & tq4.u) - 16;
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int V0(byte b) {
        return Integer.bitCount(b & 255);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int W0(short s) {
        return Integer.bitCount(s & tq4.u);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int X0(byte b) {
        return Integer.numberOfTrailingZeros(b | 256);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final int Y0(short s) {
        return Integer.numberOfTrailingZeros(s | 65536);
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.6")
    public static final byte Z0(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> (8 - i2)) | (b << i2));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.6")
    public static final short a1(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> (16 - i2)) | (s << i2));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.6")
    public static final byte b1(byte b, int i) {
        int i2 = i & 7;
        return (byte) (((b & 255) >>> i2) | (b << (8 - i2)));
    }

    @dr4(markerClass = {fo4.class})
    @tp4(version = "1.6")
    public static final short c1(short s, int i) {
        int i2 = i & 15;
        return (short) (((s & 65535) >>> i2) | (s << (16 - i2)));
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final byte d1(byte b) {
        return (byte) Integer.highestOneBit(b & 255);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final short e1(short s) {
        return (short) Integer.highestOneBit(s & tq4.u);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final byte f1(byte b) {
        return (byte) Integer.lowestOneBit(b);
    }

    @dr4(markerClass = {fo4.class})
    @dx4
    @tp4(version = "1.4")
    private static final short g1(short s) {
        return (short) Integer.lowestOneBit(s);
    }
}
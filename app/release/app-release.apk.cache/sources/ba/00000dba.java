package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media.AudioAttributesCompat;
import com.anythink.expressad.foundation.g.a;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.facebook.ads.internal.exoplayer2.video.DummySurface;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.dg;
import com.p7700g.p99005.e14;
import com.p7700g.p99005.f14;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.gl4;
import com.p7700g.p99005.h95;
import com.p7700g.p99005.j14;
import com.p7700g.p99005.n04;
import com.p7700g.p99005.ni4;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.wm3;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.SimpleResolver;
import org.xbill.DNS.WKSRecord;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.1y  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03311y extends C3S {
    public static boolean A0b;
    public static boolean A0c;
    public static byte[] A0d;
    public static String[] A0e;
    public static final int[] A0f;
    public C0735Ir A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public Surface A0N;
    public Surface A0O;
    public C0734Iq A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T;
    public final long A0U;
    public final Context A0V;
    public final C0738Iu A0W;
    public final J3 A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "1g9G5auDmi6BFhp1SUFflSJn2zbmW8bI";
            strArr2[4] = "EQg736KY9Bh9QzgWqQs064uwRmk9hBcX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 46);
            i4++;
        }
    }

    public static void A0D() {
        A0d = new byte[]{64, 71, 65, 64, 64, 70, 64, 66, 71, 65, 71, 66, 122, 10, Flags.CD, 22, 12, Flags.CD, 125, 55, 71, 64, 70, 71, bx.W5, 89, 91, 90, 93, 10, 95, 91, ax5.a, 73, 78, 78, 78, 83, 31, 17, 103, 96, 96, 96, 32, 60, 37, 35, 118, 0, 7, 6, 7, 86, 3, 15, 73, ax5.a, 56, 58, 56, 105, 60, 48, 40, 47, 61, 40, 2, 5, 23, 13, 0, 7, 21, 18, 39, Flags.CD, 7, 28, 9, 8, Flags.CD, 59, ax5.a, 43, 26, 37, 61, 47, 56, 7, 90, 110, 105, 122, 68, 85, 116, 111, 126, 68, 41, 55, 57, 52, 54, 62, 88, 68, 45, 4, 20, 7, 16, 15, 7, 102, 114, 13, 102, 116, 118, 119, 115, 39, 55, 36, 51, 44, 36, 58, 36, 49, 51, 87, 3, 113, 7, 20, 124, 114, 115, 114, 27, 13, 116, 118, 90, 73, 81, 40, 47, 41, 32, 12, 31, 22, 119, 124, 16, 6, g15.c, g15.c, 106, 70, 77, 76, 74, 9, 68, 72, 81, 9, 91, 76, 90, 70, 69, 92, 93, 64, 70, 71, 9, 72, 77, 67, 92, 90, 93, 76, 77, 9, 93, 70, 19, 9, 108, 64, 66, 70, 64, 124, 30, 19, 99, 96, 98, 101, 94, 87, 78, 92, 90, 68, 90, 40, 68, 75, 105, 116, 46, 39, 62, 44, bx.W5, 52, 37, 4, 31, 14, 5, 12, 21, 7, 1, 31, 16, 50, 41, 45, 24, 17, 8, 26, 28, 2, 15, 60, 36, 2, 5, 69, 118, 101, 114, 83, 116, 97, 114, 95, 83, g15.c, 10, 8, 8, 8, 72, 61, ax5.a, ax5.a, 61, 102, 19, 17, 17, 22, 68, 49, 48, 51, 51, 24, 109, 108, 111, 109, 84, 33, 32, 35, 39, 39, 82, 82, 80, 80, 94, 121, 116, 107, 125, 91, 112, 125, 123, 115, 56, 67, 116, 125, g15.c, 121, 123, 97, 94, 106, 121, 117, 125, 75, 113, 98, 125, 52, 56, 41, 39, 33, 32, 43, 43, 49, 41, 44, 34, 89, 93, 88, 94, 8, 6, 0, 1, 10, 10, 16, 28, 24, 24, 126, 121, g15.c, 118, 15, 1, 7, 6, 13, 13, 23, 27, 31, 31, 121, 126, 122, g15.c, 65, 79, 73, 72, 67, 67, 89, 85, 81, 81, 55, 48, 53, 55, 1, 15, 9, 8, 3, 3, 25, 17, 4, 10, 115, 113, 118, 126, 40, 38, 32, 33, bx.W5, bx.W5, 48, 56, 45, 35, 88, 92, 89, 90, 59, 53, 51, 50, 57, 57, 35, 43, 62, 48, 75, 73, 77, 69, 40, 6, 32, 33, bx.W5, bx.W5, 48, 44, 45, 35, 88, 90, 94, 92, 30, 48, 22, 23, 28, 28, 6, 30, 27, 21, 110, 106, 104, 96, 64, 95, 74, 68, 70, 37, 64, 91, 68, 80, 82, 94, 62, 91, 66, 93, 92, 68, 89, 39, 66, 74, 109, 101, 106, 109, 106, 123, 46, 91, 54, 52, 49, 70, 75, 86, 21, 107, 110, ax5.a, 106, 110, 13, 0, 21, 9, 17, 15, 70, 89, 39, ax5.a, 58, 59, 61, 67, 59, 109, 87, 95, 83, 64, 79, 69, 87, 47, 27, 14, 96, 116, 92, 93, 80, 88, 122, 86, 93, 92, 90, 111, 80, 93, 92, 86, 107, 92, 87, 93, 92, 75, 92, 75, 26, 2, 29, 16, 29, 21, 95, 73, 36, 37, 32, 91, 45, 59, 86, 84, 80, 41, 28, 30, Flags.CD, 125, 52, 60, 60, 52, ax5.a, 54, 89, 120, 115, 70, 122, 99, 101, 35, 66, 84, 50, 60, 53, 55, 95, 82, 64, 82, 34, 61, 38, 39, 32, 93, 71, 80, 89, 34, 37, 47, 17, 6, 15, 119, 112, 113, 96, 119, 126, 6, 1, 1, 31, 3, 10, 46, 44, 49, 73, 45, 14, 54, ax5.a, 48, bx.W5, 49, 51, 104, 4, 61, 44, 61, 96, 121, 99, Flags.CD, 103, 19, 77, 116, 101, 116, 40, 48, 44, 45, 66, 41, 90, 8, 106, 108, 105, 120, 29, 27, 31, 25, 33, 68, 66, 71, 109, 8, 15, 13, 12, 98, 6, 6, 26, 102, 97, 15, 18, 8, 2, 125, 116, 29, 121, 78, 88, 68, 71, 94, 95, 66, 68, 69, 88, Flags.CD, 94, 69, 64, 69, 68, 92, 69, 5, Flags.CD, 104, 68, 79, 78, 72, Flags.CD, 70, 74, 83, Flags.CD, 89, 78, 88, 68, 71, 94, 95, 66, 68, 69, 17, Flags.CD, 109, 104, 110, 19, 122, 106, 104, 15, Flags.CD, 118, 73, 68, 81, 64, 122, 117, 87, 74, 35, 53, 68, 90, 64, 68, 71, 49, 100, 114, 3, 29, 7, 3, 0, 104, 61, 43, 90, 68, 81, 92, 89, 47, 102, 112, 1, 31, 10, 7, 2, g15.c, 16, 43, 43, 100, 41, 37, bx.W5, 61, 100, 55, 48, 54, 33, 37, 41, 100, 39, 44, 37, bx.W5, 35, 33, 55, 104, 100, 55, 43, 100, 32, 54, 43, 52, 52, 45, bx.W5, 35, 100, 43, 34, 34, 55, 33, 48, 126, 100, 73, 46, 7, 99, 98, 22, 19, 108, 15, 31, 116, 24, 15, 12, 13, 16, 103, 13, 15, 3, 102, 97, 97, 100, 19, 120, 123, 22, 25, 27, 6, 43, 73, 65, 104, 18, 111, 20, 16, 4, 21, 24, 30, 92, 2, 20, 2, 2, 24, 30, 31, 92, 24, 21, 12, 24, 25, 2, 64, Flags.CD, 31, 14, 75, 90, 71, 88, 5, 74, 71, 92, 92, 71, 69, 9, 24, 5, 26, 71, 6, 15, 12, 30, 17, 0, 29, 2, 95, 0, 27, 21, 26, 6, 28, 13, 16, 15, 82, Flags.CD, 16, 15, 54, 35, 100, 124, 105, 44, 81, 80, 87, 3, 21, 8, 23, 49, 14, 3, 2, 8, 37, 18, 1, 1, 2, 21, 99, 105, 106, 76, 69, 89, 94, 79, 88, 48, 36, 55, 59, 51, 123, 36, 55, 34, 51, 24, 13, 22, 25, 25, 22, 17, 39, bx.W5, 38, 40, 39, 59, 99, g15.c, 104, 84, 110, 62, 61, 102, 103, 84, 111, g15.c, 126, 103, bx.W5, 53, 3, 14, 7, 111, 10, 96, 107, 
        104, 101, 101, 49, 62, 58, 60, 86, 48, 49, 57, ax5.a, 119, 108, 119, 109, 40, 46, 114, 111, 126, 119, 68, 72, 47, bx.W5, 47, 119, 61, 41, 49, 32, 44, 43, 54, 47, 38, 28, 59, 117, 100, 104, 103, 103, 96, 103, 110, 118, 122, 105, 114, 117, 116, 68, 125, 12, 0, 25, 76, 9, 4, 8, 6, 9, 21, 14, 2, 27, 78, 10, 13, 19, 22, 23, 78, 16, 10, 25, 6, 83, 95, 70, 19, 73, 87, 90, 74, 86, 16, 21, 68, 64, 77, 70, g15.c, 123, g15.c, 119, 89, 86, 90, 86, 67, 95, 107, 108, 102, 110, 105, 100, 112, 118, 90, 99, 119, 53, 54, 53, 72, 89, 86, 93, 84, 84, 103, 92, 48, 33, 46, 37, 44, 44, 31, 36, 44, 101, 116, 123, 112, 121, 121, 74, 113, 102, 96, 113, 126, 117, 124, 124, 79, 116, 100, 78, 76, 87, 81, 76, 87, 74, 71, 107, 124, 117, 124, 120, 106, 124, 86, 108, 109, 105, 108, 109, 91, 108, g15.c, g15.c, 124, 107, 17, 12, 23, 2, 23, 10, 12, 13, 78, 7, 6, 4, 17, 6, 6, 16, 94, 20, 29, 24, 85, 29, 28, 21, 123, 105, 102, 124, 103, 102, 97, 68, 92, 94, 71, 97, 94, 83, 82, 88, 117, 66, 81, 81, 82, 69, 5, 16, 24, 21, 30, 46, 3, 30, 6, 32, 55, 56, Flags.CD, 49, 33, 54, 55, 44, 44, 39, 46, 39, 38, 111, 50, 46, 35, 59, 32, 35, 33, 41, 82, 65, 86, 74, 65, 65, 123, 105, 17, 116, 107, 102, 103, 109, 45, 49, 101, 114, 114, 117, 106, 103, 102, 108, 44, 98, 117, 96, 97, 126, 115, 114, 120, 56, g15.c, 114, 97, 116, 102, 121, 116, 117, g15.c, ax5.a, 125, 96, 36, 102, 61, 117, 99, 5, 26, 23, 22, 28, 92, Flags.CD, 94, 5, 29, 23, 93, 28, 29, 65, 93, 5, 3, 75, 111, 112, 125, 124, 118, 54, 97, 52, 111, 119, 125, 55, 118, 119, 43, 55, 111, 105, 32, 9, 31, 10, 13, 17, 16, 79, 80, 65, 74, 93, 92, ax5.a, 33, 44, 60, 32, 106, 114, 114, 121, 110, 66, 123, 115, 107, 107, 96, 119, 91, 98, 106, 23};
    }

    public static void A0E() {
        A0e = new String[]{"NS8r3iU3bE12Q5c28wyOjILRdJ0J08uI", "UbzRKZURs", "SU7Qb1ICkxq5LQRUjQdAnOKVl0Elt9iK", "HdySUumBIxpTjI6XDfJ50FoXA9Aqq3VK", "W2XidxNDZL2wdlIqJNQqrIQcb8erTCLJ", "pQl30wQXruMBF7LsTdQVlnJoVdVvITHL", "EldsxOw3j9Ew0275hEYEpNzApywAkDlk", "GsoHFPwBx"};
    }

    static {
        A0E();
        A0D();
        A0f = new int[]{1920, 1600, wm3.u, SimpleResolver.DEFAULT_EDNS_PAYLOADSIZE, 960, 854, 640, 540, 480};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C03311y(Context context, InterfaceC0610Do interfaceC0610Do, long j, @Nullable C4<Y7> c4, boolean z, @Nullable Handler handler, @Nullable J4 j4, int i) {
        super(2, interfaceC0610Do, c4, z);
        this.A0U = j;
        this.A0T = i;
        this.A0V = context.getApplicationContext();
        this.A0W = new C0738Iu(this.A0V);
        this.A0X = new J3(handler, j4);
        this.A0Y = A0N();
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0F = 1;
        A07();
    }

    public static int A00(C0604Di c0604Di, Format format) {
        if (format.A09 != -1) {
            int totalInitializationDataSize = 0;
            int size = format.A0P.size();
            for (int i = 0; i < size; i++) {
                totalInitializationDataSize += format.A0P.get(i).length;
            }
            int i2 = format.A09 + totalInitializationDataSize;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "hUEdDcZTQNKRArh2wdU5F4NdxnsUaLHW";
            strArr[4] = "JKTUnCqsCUQLCGuZWmxU63uBYWjDtVyB";
            return i2;
        }
        return A01(c0604Di, format.A0O, format.A0F, format.A08);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x014d, code lost:
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0015 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(C0604Di c0604Di, String str, int i, int i2) {
        char c;
        int i3;
        int i4;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        switch (str.hashCode()) {
            case -1664118616:
                String A05 = A05(1267, 10, 44);
                String[] strArr = A0e;
                if (strArr[6].charAt(27) != strArr[4].charAt(27)) {
                    String[] strArr2 = A0e;
                    strArr2[7] = "LYlCS6csy";
                    strArr2[1] = "q7UvSOltk";
                    if (str.equals(A05)) {
                        c = 0;
                        if (c != 0 || c == 1) {
                            i3 = i * i2;
                            i4 = 2;
                        } else if (c == 2) {
                            if (!A05(111, 14, 104).equals(C0726Ig.A06)) {
                                String str2 = C0726Ig.A05;
                                if (A0e[3].charAt(18) != 'r') {
                                    String[] strArr3 = A0e;
                                    strArr3[2] = "NtNriTBuV2osPITyWDh14DJ675Hb7mGw";
                                    strArr3[0] = "aTMgrGeBM5ccTfE23qKwReDESoqcSAqB";
                                    if (A05(76, 6, 72).equals(str2)) {
                                        if (!A05(495, 6, 104).equals(C0726Ig.A06)) {
                                            if (A05(72, 4, 111).equals(C0726Ig.A06)) {
                                                boolean z = c0604Di.A05;
                                                String[] strArr4 = A0e;
                                                if (strArr4[7].length() == strArr4[1].length()) {
                                                    String[] strArr5 = A0e;
                                                    strArr5[6] = "T0y2wvAU5yQ513Hy1uxpE9VJWBvaaP8c";
                                                    strArr5[4] = "fdLwMbQpDxlxQ1UhZD1cDHOaYKmbaI1X";
                                                    break;
                                                } else {
                                                    String[] strArr6 = A0e;
                                                    strArr6[5] = "zdPQLWr42KwZ0dlobdnw7aSMm4tMCkyH";
                                                    strArr6[5] = "zdPQLWr42KwZ0dlobdnw7aSMm4tMCkyH";
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    i3 = C0726Ig.A04(i, 16) * C0726Ig.A04(i2, 16) * 16 * 16;
                                    i4 = 2;
                                }
                            }
                            return -1;
                        } else if (c == 3) {
                            i3 = i * i2;
                            i4 = 2;
                        } else if (c != 4 && c != 5) {
                            return -1;
                        } else {
                            i3 = i * i2;
                            i4 = 4;
                        }
                        return (i3 * 3) / (i4 * 2);
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                throw new RuntimeException();
            case -1662541442:
                if (str.equals(A05(1286, 10, 57))) {
                    c = 4;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                c = 65535;
                if (c != 0) {
                }
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            case 1187890754:
                if (str.equals(A05(1296, 13, 62))) {
                    c = 1;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                c = 65535;
                if (c != 0) {
                }
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            case 1331836730:
                if (str.equals(A05(1277, 9, 45))) {
                    c = 2;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                c = 65535;
                if (c != 0) {
                }
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            case 1599127256:
                if (A0e[3].charAt(18) != 'r') {
                    String[] strArr7 = A0e;
                    strArr7[6] = "SQkkyJTJanVkJO6F32Uk6bk7kprCTHjQ";
                    strArr7[4] = "qdt3Ji8DW1HY109DoSKbHU8vPEOVBakr";
                    if (str.equals(A05(1309, 19, 93))) {
                        c = 3;
                        if (c != 0) {
                        }
                        i3 = i * i2;
                        i4 = 2;
                        return (i3 * 3) / (i4 * 2);
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                throw new RuntimeException();
            case 1599127257:
                if (str.equals(A05(1328, 19, 55))) {
                    c = 5;
                    if (c != 0) {
                    }
                    i3 = i * i2;
                    i4 = 2;
                    return (i3 * 3) / (i4 * 2);
                }
                c = 65535;
                if (c != 0) {
                }
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
            default:
                c = 65535;
                if (c != 0) {
                }
                i3 = i * i2;
                i4 = 2;
                return (i3 * 3) / (i4 * 2);
        }
    }

    public static Point A02(C0604Di c0604Di, Format format) throws C0613Dr {
        int longEdgePx = 0;
        boolean z = format.A08 > format.A0F;
        int i = z ? format.A08 : format.A0F;
        int i2 = z ? format.A0F : format.A08;
        float f = i2 / i;
        int[] iArr = A0f;
        int length = iArr.length;
        while (longEdgePx < length) {
            int i3 = iArr[longEdgePx];
            if (A0e[3].charAt(18) == 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[5] = "1BVaGfMRJiqdWLUq8dv8R9mVKG0R6nhL";
            strArr[5] = "1BVaGfMRJiqdWLUq8dv8R9mVKG0R6nhL";
            int i4 = (int) (i3 * f);
            if (i3 <= i || i4 <= i2) {
                return null;
            }
            if (C0726Ig.A02 >= 21) {
                int i5 = z ? i4 : i3;
                if (!z) {
                    i3 = i4;
                }
                Point A0F = c0604Di.A0F(i5, i3);
                if (c0604Di.A0I(A0F.x, A0F.y, format.A01)) {
                    return A0F;
                }
            } else {
                int A04 = C0726Ig.A04(i3, 16) * 16;
                int A042 = C0726Ig.A04(i4, 16) * 16;
                int i6 = A04 * A042;
                int shortEdgePx = C0615Dt.A00();
                if (i6 <= shortEdgePx) {
                    int shortEdgePx2 = z ? A042 : A04;
                    if (!z) {
                        A04 = A042;
                    }
                    return new Point(shortEdgePx2, A04);
                }
            }
            longEdgePx++;
            if (A0e[3].charAt(18) != 'r') {
                String[] strArr2 = A0e;
                strArr2[7] = "qOOBmdqjU";
                strArr2[1] = "w7Tn3xd7M";
            } else {
                String[] strArr3 = A0e;
                strArr3[2] = "KAf95qDJkDfWOijmfxtuynNssocKmC3g";
                strArr3[0] = "h6cBxdrGRvPICzB6Kk67A24HS1YQyhML";
            }
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A03(Format format, C0734Iq c0734Iq, boolean z, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A05(1094, 4, 60), format.A0O);
        mediaFormat.setInteger(A05(1359, 5, 102), format.A0F);
        mediaFormat.setInteger(A05(971, 6, 97), format.A08);
        C0616Du.A07(mediaFormat, format.A0P);
        C0616Du.A04(mediaFormat, A05(954, 10, 120), format.A01);
        C0616Du.A05(mediaFormat, A05(1180, 16, 77), format.A0B);
        C0616Du.A03(mediaFormat, format.A0J);
        mediaFormat.setInteger(A05(1079, 9, 16), c0734Iq.A02);
        mediaFormat.setInteger(A05(IronSourceError.ERROR_DO_RV_LOAD_TIMED_OUT, 10, 79), c0734Iq.A00);
        C0616Du.A05(mediaFormat, A05(1065, 14, 77), c0734Iq.A01);
        if (C0726Ig.A02 >= 23) {
            mediaFormat.setInteger(A05(1153, 8, 16), 0);
        }
        if (z) {
            mediaFormat.setInteger(A05(875, 8, 67), 0);
        }
        if (i != 0) {
            A0L(mediaFormat, i);
        }
        return mediaFormat;
    }

    private final C0734Iq A04(C0604Di c0604Di, Format format, Format[] formatArr) throws C0613Dr {
        int i = format.A0F;
        int i2 = format.A08;
        int A00 = A00(c0604Di, format);
        if (formatArr.length == 1) {
            return new C0734Iq(i, i2, A00);
        }
        boolean z = false;
        for (Format format2 : formatArr) {
            if (A0W(c0604Di.A03, format, format2)) {
                z |= format2.A0F == -1 || format2.A08 == -1;
                i = Math.max(i, format2.A0F);
                i2 = Math.max(i2, format2.A08);
                A00 = Math.max(A00, A00(c0604Di, format2));
            }
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(A05(683, 43, 5));
            sb.append(i);
            String A05 = A05(1379, 1, 65);
            sb.append(A05);
            sb.append(i2);
            String sb2 = sb.toString();
            String A052 = A05(522, 23, 23);
            Log.w(A052, sb2);
            Point A02 = A02(c0604Di, format);
            if (A02 != null) {
                i = Math.max(i, A02.x);
                i2 = Math.max(i2, A02.y);
                A00 = Math.max(A00, A01(c0604Di, format.A0O, i, i2));
                Log.w(A052, A05(164, 34, 7) + i + A05 + i2);
            }
        }
        return new C0734Iq(i, i2, A00);
    }

    private void A06() {
        MediaCodec A1E;
        this.A0R = false;
        if (C0726Ig.A02 >= 23 && this.A0S && (A1E = A1E()) != null) {
            this.A00 = new C0735Ir(this, A1E);
        }
    }

    private void A07() {
        this.A0E = -1;
        this.A0C = -1;
        this.A03 = -1.0f;
        this.A0D = -1;
    }

    private void A08() {
        if (this.A09 > 0) {
            long elapsedMs = SystemClock.elapsedRealtime();
            this.A0X.A02(this.A09, elapsedMs - this.A0H);
            this.A09 = 0;
            this.A0H = elapsedMs;
        }
    }

    private void A09() {
        if (this.A08 == -1 && this.A06 == -1) {
            return;
        }
        if (this.A0E != this.A08 || this.A0C != this.A06 || this.A0D != this.A07 || this.A03 != this.A01) {
            J3 j3 = this.A0X;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "RTvZ5FDjzwdLT6J2ljezTJit2l4QBCCR";
            strArr2[0] = "8XoC7GroR317PXdtPjLLz1J1MgtvBrxC";
            j3.A01(this.A08, this.A06, this.A07, this.A01);
            this.A0E = this.A08;
            this.A0C = this.A06;
            this.A0D = this.A07;
            this.A03 = this.A01;
        }
    }

    private void A0A() {
        if (this.A0R) {
            this.A0X.A03(this.A0O);
        }
    }

    private void A0B() {
        if (this.A0E != -1 || this.A0C != -1) {
            this.A0X.A01(this.A0E, this.A0C, this.A0D, this.A03);
        }
    }

    private void A0C() {
        long j;
        if (this.A0U > 0) {
            j = SystemClock.elapsedRealtime() + this.A0U;
        } else {
            j = -9223372036854775807L;
        }
        this.A0J = j;
    }

    private final void A0F(int i) {
        super.A0U.A02 += i;
        this.A09 += i;
        this.A05 += i;
        super.A0U.A05 = Math.max(this.A05, super.A0U.A05);
        if (this.A09 >= this.A0T) {
            A08();
        }
    }

    private final void A0G(MediaCodec mediaCodec, int i, long j) {
        C0723Id.A02(A05(930, 15, 73));
        mediaCodec.releaseOutputBuffer(i, false);
        C0723Id.A00();
        A0F(1);
    }

    private final void A0H(MediaCodec mediaCodec, int i, long j) {
        A09();
        C0723Id.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i, true);
        C0723Id.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1T();
    }

    private final void A0I(MediaCodec mediaCodec, int i, long j) {
        C0723Id.A02(A05(IronSourceConstants.RV_INSTANCE_READY_FALSE, 15, 25));
        mediaCodec.releaseOutputBuffer(i, false);
        C0723Id.A00();
        super.A0U.A08++;
    }

    @TargetApi(21)
    private final void A0J(MediaCodec mediaCodec, int i, long j, long j2) {
        A09();
        C0723Id.A02(A05(1161, 19, 55));
        mediaCodec.releaseOutputBuffer(i, j2);
        C0723Id.A00();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
        super.A0U.A06++;
        this.A05 = 0;
        A1T();
    }

    @TargetApi(23)
    public static void A0K(MediaCodec mediaCodec, Surface surface) {
        mediaCodec.setOutputSurface(surface);
    }

    @TargetApi(21)
    public static void A0L(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled(A05(1241, 17, 108), true);
        mediaFormat.setInteger(A05(859, 16, 95), i);
    }

    private void A0M(Surface surface) throws A4 {
        if (surface == null) {
            if (this.A0N != null) {
                surface = this.A0N;
            } else {
                C0604Di A1F = A1F();
                if (A1F != null && A0U(A1F)) {
                    this.A0N = DummySurface.A01(this.A0V, A1F.A05);
                    surface = this.A0N;
                }
            }
        }
        if (this.A0O != surface) {
            this.A0O = surface;
            int A70 = A70();
            if (A70 == 1 || A70 == 2) {
                MediaCodec A1E = A1E();
                if (C0726Ig.A02 >= 23 && A1E != null && surface != null && !this.A0Q) {
                    A0K(A1E, surface);
                } else {
                    A1I();
                    A1K();
                }
            }
            if (surface != null && surface != this.A0N) {
                A0B();
                A06();
                if (A70 == 2) {
                    A0C();
                    return;
                }
                return;
            }
            A07();
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[3] = "3kfdRjkwPvYxx8JzUoiB9hf8dQ33bpul";
            strArr2[3] = "3kfdRjkwPvYxx8JzUoiB9hf8dQ33bpul";
            A06();
        } else if (surface == null || surface == this.A0N) {
        } else {
            A0B();
            A0A();
        }
    }

    public static boolean A0N() {
        if (C0726Ig.A02 <= 22) {
            if (A05(948, 6, 4).equals(C0726Ig.A03)) {
                if (A05(545, 6, 122).equals(C0726Ig.A05)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0O(long j) {
        return j < -30000;
    }

    public static boolean A0P(long j) {
        return j < -500000;
    }

    private final boolean A0Q(long j, long j2) {
        return A0P(j);
    }

    private final boolean A0R(long j, long j2) {
        return A0O(j);
    }

    private final boolean A0S(long j, long j2) {
        return A0O(j) && j2 > 100000;
    }

    private final boolean A0T(MediaCodec mediaCodec, int i, long j, long j2) throws A4 {
        int A11 = A11(j2);
        if (A11 == 0) {
            return false;
        }
        super.A0U.A03++;
        A0F(this.A04 + A11);
        A1H();
        return true;
    }

    private boolean A0U(C0604Di c0604Di) {
        if (C0726Ig.A02 >= 23 && !this.A0S) {
            String str = c0604Di.A02;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[6] = "kyWyTgTuit8kBu9eYgHiJLOeDtaawSzk";
            strArr[4] = "zep7axp9udbgCrK2JAqRjKsc1O8PK6En";
            if (!A0V(str) && (!c0604Di.A05 || DummySurface.A05(this.A0V))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:382:0x0944 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean A0V(String str) {
        char c = 27;
        char c2 = 0;
        if (C0726Ig.A02 >= 27 || str.startsWith(A05(563, 10, 125))) {
            return false;
        }
        synchronized (C03311y.class) {
            if (!A0c) {
                String str2 = C0726Ig.A03;
                switch (str2.hashCode()) {
                    case -2144781245:
                        if (str2.equals(A05(341, 14, 97))) {
                            c = '\'';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2144781185:
                        if (str2.equals(A05(355, 14, 102))) {
                            c = '(';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2144781160:
                        if (str2.equals(A05(369, 14, 40))) {
                            c = ')';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2097309513:
                        if (str2.equals(A05(489, 6, 112))) {
                            c = '9';
                            break;
                        }
                        c = 65535;
                        break;
                    case -2022874474:
                        if (str2.equals(A05(WKSRecord.Service.NETBIOS_DGM, 10, 106))) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1978993182:
                        if (str2.equals(A05(551, 6, 63))) {
                            c = 'E';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1978990237:
                        if (str2.equals(A05(557, 6, 77))) {
                            c = 'F';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1936688988:
                        if (str2.equals(A05(597, 6, 57))) {
                            c = 'P';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1936688066:
                        if (str2.equals(A05(603, 6, 111))) {
                            c = 'Q';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1936688065:
                        if (str2.equals(A05(609, 6, 30))) {
                            c = 'R';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1931988508:
                        if (str2.equals(A05(82, 10, 100))) {
                            c = '\n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1696512866:
                        if (str2.equals(A05(839, 6, 121))) {
                            c = ni4.Z;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1680025915:
                        if (str2.equals(A05(198, 7, 1))) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1615810839:
                        if (str2.equals(A05(623, 8, 112))) {
                            c = 'S';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1554255044:
                        if (str2.equals(A05(1258, 9, 10))) {
                            c = 'l';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772737:
                        if (str2.equals(A05(1126, 9, 110))) {
                            c = 'L';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772730:
                        if (str2.equals(A05(1135, 9, 59))) {
                            c = 'M';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1481772729:
                        if (str2.equals(A05(1144, 9, 62))) {
                            c = 'N';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1320080169:
                        if (str2.equals(A05(439, 14, 119))) {
                            c = '%';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1217592143:
                        if (str2.equals(A05(125, 11, 75))) {
                            c = '\r';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1180384755:
                        if (str2.equals(A05(nr.m, 6, 48))) {
                            c = '5';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1139198265:
                        if (str2.equals(A05(735, 9, 11))) {
                            c = '`';
                            break;
                        }
                        c = 65535;
                        break;
                    case -1052835013:
                        if (str2.equals(A05(1098, 6, 25))) {
                            c = 'C';
                            break;
                        }
                        c = 65535;
                        break;
                    case -993250464:
                        if (str2.equals(A05(12, 7, 21))) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -965403638:
                        if (str2.equals(A05(1196, 8, 3))) {
                            c = 'b';
                            break;
                        }
                        c = 65535;
                        break;
                    case -958336948:
                        if (str2.equals(A05(242, 11, 115))) {
                            c = 26;
                            break;
                        }
                        c = 65535;
                        break;
                    case -879245230:
                        if (str2.equals(A05(1235, 6, 122))) {
                            c = 'h';
                            break;
                        }
                        c = 65535;
                        break;
                    case -842500323:
                        if (str2.equals(A05(1104, 10, 43))) {
                            c = 'D';
                            break;
                        }
                        c = 65535;
                        break;
                    case -821392978:
                        if (str2.equals(A05(32, 7, 80))) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case -797483286:
                        if (str2.equals(A05(726, 9, 16))) {
                            c = 'a';
                            break;
                        }
                        c = 65535;
                        break;
                    case -794946968:
                        if (str2.equals(A05(1347, 6, 80))) {
                            c = 'm';
                            break;
                        }
                        c = 65535;
                        break;
                    case -788334647:
                        if (str2.equals(A05(1353, 6, 22))) {
                            c = 'n';
                            break;
                        }
                        c = 65535;
                        break;
                    case -782144577:
                        if (str2.equals(A05(573, 9, 56))) {
                            c = 'G';
                            break;
                        }
                        c = 65535;
                        break;
                    case -575125681:
                        if (str2.equals(A05(aa.c.w, 14, 65))) {
                            c = h95.c;
                            break;
                        }
                        c = 65535;
                        break;
                    case -521118391:
                        if (str2.equals(A05(327, 14, 64))) {
                            c = h95.d;
                            break;
                        }
                        c = 65535;
                        break;
                    case -430914369:
                        if (str2.equals(A05(631, 10, 122))) {
                            c = 'T';
                            break;
                        }
                        c = 65535;
                        break;
                    case -290434366:
                        if (str2.equals(A05(1226, 9, 95))) {
                            c = 'c';
                            break;
                        }
                        c = 65535;
                        break;
                    case -282781963:
                        if (str2.equals(A05(103, 8, 91))) {
                            c = '\f';
                            break;
                        }
                        c = 65535;
                        break;
                    case -277133239:
                        if (str2.equals(A05(845, 7, 103))) {
                            c = 't';
                            break;
                        }
                        c = 65535;
                        break;
                    case -173639913:
                        if (str2.equals(A05(210, 12, 53))) {
                            c = 23;
                            break;
                        }
                        c = 65535;
                        break;
                    case -56598463:
                        if (str2.equals(A05(1371, 8, 42))) {
                            c = 'p';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2126:
                        if (str2.equals(A05(WKSRecord.Service.PROFILE, 2, 110))) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2564:
                        if (str2.equals(A05(670, 2, 29))) {
                            c = '\\';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2715:
                        if (str2.equals(A05(821, 2, 49))) {
                            c = 'i';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2719:
                        if (str2.equals(A05(828, 2, 20))) {
                            c = 'k';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3483:
                        if (str2.equals(A05(1088, 2, 83))) {
                            c = '@';
                            break;
                        }
                        c = 65535;
                        break;
                    case 73405:
                        if (str2.equals(A05(486, 3, 34))) {
                            c = '8';
                            break;
                        }
                        c = 65535;
                        break;
                    case 75739:
                        if (str2.equals(A05(508, 3, 32))) {
                            c = h95.e;
                            break;
                        }
                        c = 65535;
                        break;
                    case 76779:
                        if (str2.equals(A05(519, 3, 120))) {
                            c = 'B';
                            break;
                        }
                        c = 65535;
                        break;
                    case 78669:
                        if (str2.equals(A05(586, 3, 73))) {
                            c = 'J';
                            break;
                        }
                        c = 65535;
                        break;
                    case 79305:
                        if (str2.equals(A05(IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 3, 97))) {
                            c = 'V';
                            break;
                        }
                        c = 65535;
                        break;
                    case 80618:
                        if (str2.equals(A05(680, 3, 2))) {
                            c = '^';
                            break;
                        }
                        c = 65535;
                        break;
                    case 88274:
                        if (str2.equals(A05(852, 3, 95))) {
                            c = 'u';
                            break;
                        }
                        c = 65535;
                        break;
                    case 98846:
                        if (str2.equals(A05(921, 3, 123))) {
                            c = 19;
                            break;
                        }
                        c = 65535;
                        break;
                    case 98848:
                        if (str2.equals(A05(924, 3, 49))) {
                            c = 20;
                            break;
                        }
                        c = 65535;
                        break;
                    case 99329:
                        if (str2.equals(A05(927, 3, 27))) {
                            c = 21;
                            break;
                        }
                        c = 65535;
                        break;
                    case 101481:
                        if (str2.equals(A05(945, 3, 43))) {
                            c = '#';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1513190:
                        if (str2.equals(A05(0, 4, 95))) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1514184:
                        if (str2.equals(A05(4, 4, 95))) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1514185:
                        if (str2.equals(A05(8, 4, 88))) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2436959:
                        if (str2.equals(A05(582, 4, 42))) {
                            c = 'I';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2463773:
                        if (str2.equals(A05(652, 4, 119))) {
                            c = 'X';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2464648:
                        if (str2.equals(A05(661, 4, 94))) {
                            c = 'Z';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2689555:
                        if (str2.equals(A05(835, 4, 123))) {
                            c = 'r';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3351335:
                        if (str2.equals(A05(1090, 4, 7))) {
                            c = 'A';
                            break;
                        }
                        c = 65535;
                        break;
                    case 3386211:
                        if (str2.equals(A05(1114, 4, 41))) {
                            c = 'H';
                            break;
                        }
                        c = 65535;
                        break;
                    case 41325051:
                        if (str2.equals(A05(dg.t, 8, 52))) {
                            c = '?';
                            break;
                        }
                        c = 65535;
                        break;
                    case 55178625:
                        if (str2.equals(A05(92, 11, 53))) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case 61542055:
                        if (str2.equals(A05(19, 5, 88))) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 65355429:
                        if (str2.equals(A05(205, 5, 120))) {
                            c = 22;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214468:
                        if (str2.equals(A05(263, 5, 23))) {
                            c = 28;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214470:
                        if (str2.equals(A05(268, 5, 32))) {
                            c = 29;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66214473:
                        if (str2.equals(A05(AudioAttributesCompat.N, 5, 14))) {
                            c = 30;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215429:
                        if (str2.equals(A05(a.aS, 5, 44))) {
                            c = 31;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215431:
                        if (str2.equals(A05(283, 5, 112))) {
                            c = gl4.R;
                            break;
                        }
                        c = 65535;
                        break;
                    case 66215433:
                        if (str2.equals(A05(a.aW, 5, 60))) {
                            c = '!';
                            break;
                        }
                        c = 65535;
                        break;
                    case 66216390:
                        if (str2.equals(A05(293, 5, 79))) {
                            c = h95.b;
                            break;
                        }
                        c = 65535;
                        break;
                    case 76402249:
                        if (str2.equals(A05(IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_SERVER_DATA, 5, 80))) {
                            c = 'W';
                            break;
                        }
                        c = 65535;
                        break;
                    case 76404105:
                        if (str2.equals(A05(656, 5, 7))) {
                            c = 'Y';
                            break;
                        }
                        c = 65535;
                        break;
                    case 76404911:
                        if (str2.equals(A05(665, 5, 18))) {
                            c = f14.u;
                            break;
                        }
                        c = 65535;
                        break;
                    case 80963634:
                        if (str2.equals(A05(823, 5, 127))) {
                            c = 'j';
                            break;
                        }
                        c = 65535;
                        break;
                    case 82882791:
                        if (str2.equals(A05(830, 5, 105))) {
                            c = 'q';
                            break;
                        }
                        c = 65535;
                        break;
                    case 102844228:
                        if (str2.equals(A05(IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES, 5, 109))) {
                            c = ':';
                            break;
                        }
                        c = 65535;
                        break;
                    case 165221241:
                        if (str2.equals(A05(24, 8, 69))) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 182191441:
                        if (str2.equals(A05(155, 9, 97))) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 245388979:
                        if (str2.equals(A05(1047, 8, 53))) {
                            c = h95.f;
                            break;
                        }
                        c = 65535;
                        break;
                    case 287431619:
                        if (str2.equals(A05(964, 7, 81))) {
                            c = '-';
                            break;
                        }
                        c = 65535;
                        break;
                    case 307593612:
                        if (str2.equals(A05(48, 8, 25))) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 308517133:
                        if (str2.equals(A05(56, 8, 38))) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316215098:
                        if (str2.equals(A05(744, 8, 89))) {
                            c = 'd';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316215116:
                        if (str2.equals(A05(752, 8, 30))) {
                            c = 'e';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316246811:
                        if (str2.equals(A05(760, 8, 71))) {
                            c = 'f';
                            break;
                        }
                        c = 65535;
                        break;
                    case 316246818:
                        if (str2.equals(A05(768, 8, 28))) {
                            c = 'g';
                            break;
                        }
                        c = 65535;
                        break;
                    case 407160593:
                        if (str2.equals(A05(641, 11, 51))) {
                            c = 'U';
                            break;
                        }
                        c = 65535;
                        break;
                    case 507412548:
                        if (str2.equals(A05(672, 8, 121))) {
                            c = f14.v;
                            break;
                        }
                        c = 65535;
                        break;
                    case 793982701:
                        if (str2.equals(A05(383, 14, 104))) {
                            c = n04.z;
                            break;
                        }
                        c = 65535;
                        break;
                    case 794038622:
                        if (str2.equals(A05(397, 14, 65))) {
                            c = '+';
                            break;
                        }
                        c = 65535;
                        break;
                    case 794040393:
                        if (str2.equals(A05(411, 14, 82))) {
                            c = e14.f0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 835649806:
                        if (str2.equals(A05(IronSourceError.ERROR_RV_INIT_EXCEPTION, 7, 39))) {
                            c = '=';
                            break;
                        }
                        c = 65535;
                        break;
                    case 917340916:
                        if (str2.equals(A05(39, 9, 126))) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 958008161:
                        if (str2.equals(A05(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, 9, 107))) {
                            c = '7';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1060579533:
                        if (str2.equals(A05(1118, 8, 22))) {
                            c = 'K';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1150207623:
                        if (str2.equals(A05(501, 7, 36))) {
                            c = ';';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1176899427:
                        if (str2.equals(A05(nr.s, 8, 53))) {
                            c = '6';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1280332038:
                        if (str2.equals(A05(991, 7, 108))) {
                            c = j14.P;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1306947716:
                        if (str2.equals(A05(253, 10, 46))) {
                            break;
                        }
                        c = 65535;
                        break;
                    case 1349174697:
                        if (str2.equals(A05(977, 14, 37))) {
                            c = '.';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1522194893:
                        if (str2.equals(A05(1364, 7, 51))) {
                            c = 'o';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1691543273:
                        if (str2.equals(A05(148, 7, 55))) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1709443163:
                        if (str2.equals(A05(998, 14, 39))) {
                            c = '3';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1865889110:
                        if (str2.equals(A05(IronSourceConstants.RV_INSTANCE_STARTED, 7, 38))) {
                            c = n04.E;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1906253259:
                        if (str2.equals(A05(589, 8, 62))) {
                            c = 'O';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1977196784:
                        if (str2.equals(A05(474, 12, 45))) {
                            c = '4';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2029784656:
                        if (str2.equals(A05(453, 7, 38))) {
                            c = '0';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2030379515:
                        if (str2.equals(A05(460, 7, 61))) {
                            c = '1';
                            break;
                        }
                        c = 65535;
                        break;
                    case 2047190025:
                        if (str2.equals(A05(222, 10, 69))) {
                            c = 24;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2047252157:
                        if (str2.equals(A05(232, 10, 110))) {
                            c = 25;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2048319463:
                        if (str2.equals(A05(467, 7, 36))) {
                            c = '2';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case ' ':
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '/':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case ':':
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                    case '?':
                    case '@':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                    case '[':
                    case '\\':
                    case ']':
                    case '^':
                    case '_':
                    case '`':
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                        A0b = true;
                        break;
                }
                String str3 = C0726Ig.A06;
                int hashCode = str3.hashCode();
                String[] strArr = A0e;
                if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[7] = "cOQlsBGiK";
                strArr2[1] = "Pca576Mi2";
                if (hashCode != 2006354) {
                    if (hashCode == 2006367 && str3.equals(A05(68, 4, 109))) {
                        c2 = 1;
                        if (c2 != 0 || c2 == 1) {
                            A0b = true;
                        }
                        A0c = true;
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    A0b = true;
                    A0c = true;
                } else {
                    if (str3.equals(A05(64, 4, 71))) {
                        if (c2 != 0) {
                        }
                        A0b = true;
                        A0c = true;
                    }
                    c2 = 65535;
                    if (c2 != 0) {
                    }
                    A0b = true;
                    A0c = true;
                }
            }
        }
        boolean z = A0b;
        String[] strArr3 = A0e;
        if (strArr3[7].length() != strArr3[1].length()) {
            return z;
        }
        String[] strArr4 = A0e;
        strArr4[6] = "PnfS4yBzuLkqsKWsH6VMU5nG0nLuKSAS";
        strArr4[4] = "b0vuoxjGXMe90u4o0xRnZCMfqoTv3ZqJ";
        return z;
    }

    public static boolean A0W(boolean z, Format format, Format format2) {
        if (format.A0O.equals(format2.A0O) && format.A0B == format2.A0B && (z || (format.A0F == format2.A0F && format.A08 == format2.A08))) {
            ColorInfo colorInfo = format.A0J;
            ColorInfo colorInfo2 = format2.A0J;
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[5] = "SCavqIZfy9E7QicA0dHTliXfXCWB3KSN";
            strArr2[5] = "SCavqIZfy9E7QicA0dHTliXfXCWB3KSN";
            if (C0726Ig.A0h(colorInfo, colorInfo2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A14() {
        this.A08 = -1;
        this.A06 = -1;
        this.A01 = -1.0f;
        this.A02 = -1.0f;
        this.A0M = -9223372036854775807L;
        this.A0K = -9223372036854775807L;
        this.A0A = 0;
        A07();
        A06();
        this.A0W.A09();
        this.A00 = null;
        this.A0S = false;
        try {
            super.A14();
        } finally {
            super.A0U.A00();
            this.A0X.A05(super.A0U);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A15() {
        super.A15();
        this.A09 = 0;
        this.A0H = SystemClock.elapsedRealtime();
        this.A0L = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A16() {
        this.A0J = -9223372036854775807L;
        A08();
        super.A16();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A17(long j, boolean z) throws A4 {
        super.A17(j, z);
        A06();
        this.A0I = -9223372036854775807L;
        this.A05 = 0;
        this.A0K = -9223372036854775807L;
        int i = this.A0A;
        if (i != 0) {
            long[] jArr = this.A0Z;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[7] = "7MW3dnHmZ";
            strArr2[1] = "zsetFM6ej";
            this.A0M = jArr[i - 1];
            this.A0A = 0;
        }
        if (z) {
            A0C();
        } else {
            this.A0J = -9223372036854775807L;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A18(boolean z) throws A4 {
        super.A18(z);
        this.A0G = A13().A00;
        this.A0S = this.A0G != 0;
        this.A0X.A06(super.A0U);
        this.A0W.A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A19(Format[] formatArr, long j) throws A4 {
        if (this.A0M == -9223372036854775807L) {
            this.A0M = j;
        } else {
            int i = this.A0A;
            String[] strArr = A0e;
            if (strArr[6].charAt(27) == strArr[4].charAt(27)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[2] = "hJEWxkqVwddaEGRwsPF9GJysu0azMoJ9";
            strArr2[0] = "zdhmDyX7lfpv7BLRFINwBKdWRGj92JIy";
            if (i == this.A0Z.length) {
                Log.w(A05(522, 23, 23), A05(776, 45, 106) + this.A0Z[this.A0A - 1]);
            } else {
                this.A0A = i + 1;
            }
            long[] jArr = this.A0Z;
            int i2 = this.A0A;
            jArr[i2 - 1] = j;
            this.A0a[i2 - 1] = this.A0K;
        }
        super.A19(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final int A1C(MediaCodec mediaCodec, C0604Di c0604Di, Format format, Format format2) {
        if (!A0W(c0604Di.A03, format, format2) || format2.A0F > this.A0P.A02 || format2.A08 > this.A0P.A00 || A00(c0604Di, format2) > this.A0P.A01) {
            return 0;
        }
        return format.A0L(format2) ? 1 : 3;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    @Override // com.facebook.ads.redexgen.X.C3S
    public final int A1D(InterfaceC0610Do interfaceC0610Do, C4<Y7> c4, Format format) throws C0613Dr {
        String str = format.A0O;
        if (IJ.A0C(str)) {
            boolean z = false;
            DrmInitData drmInitData = format.A0H;
            if (drmInitData != null) {
                for (int i = 0; i < drmInitData.A01; i++) {
                    z |= drmInitData.A02(i).A03;
                }
            }
            C0604Di A60 = interfaceC0610Do.A60(str, z);
            String[] strArr = A0e;
            if (strArr[2].charAt(13) != strArr[0].charAt(13)) {
                String[] strArr2 = A0e;
                strArr2[7] = "kTnRYby1s";
                strArr2[1] = "UL9g0IqkI";
                if (A60 == null) {
                    return (!z || interfaceC0610Do.A60(str, false) == null) ? 1 : 2;
                } else if (AbstractC0573Cd.A0z(c4, drmInitData)) {
                    boolean A0J = A60.A0J(format.A0K);
                    if (A0J && format.A0F > 0 && format.A08 > 0) {
                        if (C0726Ig.A02 >= 21) {
                            int i2 = format.A0F;
                            int i3 = format.A08;
                            if (A0e[3].charAt(18) == 'r') {
                                throw new RuntimeException();
                            }
                            String[] strArr3 = A0e;
                            strArr3[6] = "jeBed4IeUvhTWXlMCWkd0HFF16tIjLHF";
                            strArr3[4] = "0qAO2CVMQ14qnLtRtzyjuYZeLu4NiNP0";
                            A0J = A60.A0I(i2, i3, format.A01);
                        } else {
                            A0J = format.A0F * format.A08 <= C0615Dt.A00();
                            if (!A0J) {
                                String str2 = A05(a.aX, 29, 54) + format.A0F + A05(1379, 1, 65) + format.A08 + A05(856, 3, 97) + C0726Ig.A04 + A05(855, 1, 27);
                            }
                        }
                    }
                    boolean decoderCapable = A60.A03;
                    int i4 = decoderCapable ? 16 : 8;
                    boolean decoderCapable2 = A60.A06;
                    int adaptiveSupport = decoderCapable2 ? 32 : 0;
                    return i4 | adaptiveSupport | (A0J ? 4 : 3);
                } else {
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    @CallSuper
    public final void A1H() throws A4 {
        super.A1H();
        this.A04 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    @CallSuper
    public final void A1I() {
        try {
            super.A1I();
        } finally {
            this.A04 = 0;
            Surface surface = this.A0N;
            if (surface != null) {
                if (this.A0O == surface) {
                    this.A0O = null;
                }
                this.A0N.release();
                this.A0N = null;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    @CallSuper
    public final void A1L(long j) {
        this.A04--;
        while (true) {
            int i = this.A0A;
            if (i != 0 && j >= this.A0a[0]) {
                long[] jArr = this.A0Z;
                this.A0M = jArr[0];
                this.A0A = i - 1;
                System.arraycopy(jArr, 1, jArr, 0, this.A0A);
                long[] jArr2 = this.A0a;
                System.arraycopy(jArr2, 1, jArr2, 0, this.A0A);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    @Override // com.facebook.ads.redexgen.X.C3S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A1M(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        String A05 = A05(aa.b.m, 10, 92);
        boolean containsKey = mediaFormat.containsKey(A05);
        String A052 = A05(913, 8, 81);
        String A053 = A05(883, 11, 6);
        String A054 = A05(894, 9, 68);
        if (containsKey && mediaFormat.containsKey(A054)) {
            boolean containsKey2 = mediaFormat.containsKey(A053);
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[7] = "iz6RCOhSh";
            strArr[1] = "D9RR8bf8p";
            if (containsKey2 && mediaFormat.containsKey(A052)) {
                z = true;
                if (!z) {
                    integer = (mediaFormat.getInteger(A05) - mediaFormat.getInteger(A054)) + 1;
                } else {
                    integer = mediaFormat.getInteger(A05(1359, 5, 102));
                }
                this.A08 = integer;
                if (!z) {
                    integer2 = (mediaFormat.getInteger(A053) - mediaFormat.getInteger(A052)) + 1;
                } else {
                    integer2 = mediaFormat.getInteger(A05(971, 6, 97));
                }
                this.A06 = integer2;
                this.A01 = this.A02;
                if (C0726Ig.A02 < 21) {
                    int i = this.A0B;
                    if (i == 90 || i == 270) {
                        int i2 = this.A08;
                        this.A08 = this.A06;
                        this.A06 = i2;
                        this.A01 = 1.0f / this.A01;
                    }
                } else {
                    this.A07 = this.A0B;
                }
                mediaCodec.setVideoScalingMode(this.A0F);
            }
        }
        z = false;
        if (!z) {
        }
        this.A08 = integer;
        if (!z) {
        }
        this.A06 = integer2;
        this.A01 = this.A02;
        if (C0726Ig.A02 < 21) {
        }
        mediaCodec.setVideoScalingMode(this.A0F);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1N(Format format) throws A4 {
        super.A1N(format);
        this.A0X.A04(format);
        this.A02 = format.A02;
        this.A0B = format.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    @CallSuper
    public final void A1O(C1121Xw c1121Xw) {
        this.A04++;
        this.A0K = Math.max(c1121Xw.A00, this.A0K);
        if (C0726Ig.A02 < 23 && this.A0S) {
            A1T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1P(C0604Di c0604Di, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0613Dr {
        this.A0P = A04(c0604Di, format, A1B());
        MediaFormat A03 = A03(format, this.A0P, this.A0Y, this.A0G);
        if (this.A0O == null) {
            I1.A04(A0U(c0604Di));
            Surface surface = this.A0N;
            String[] strArr = A0e;
            if (strArr[7].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[6] = "HUdK6ej9G5uy2eoW8HL148MSYBaQJURn";
            strArr2[4] = "oyZJZuVgjRVeIXKioVrHS7OTGib3SAbN";
            if (surface == null) {
                this.A0N = DummySurface.A01(this.A0V, c0604Di.A05);
            }
            this.A0O = this.A0N;
        }
        mediaCodec.configure(A03, this.A0O, mediaCrypto, 0);
        if (C0726Ig.A02 >= 23 && this.A0S) {
            this.A00 = new C0735Ir(this, mediaCodec);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1Q(String str, long j, long j2) {
        this.A0X.A07(str, j, j2);
        this.A0Q = A0V(str);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final boolean A1R(long unadjustedFrameReleaseTimeNs, long j, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long unadjustedFrameReleaseTimeNs2, boolean z) throws A4 {
        if (this.A0I == -9223372036854775807L) {
            this.A0I = unadjustedFrameReleaseTimeNs;
        }
        long earlyUs = unadjustedFrameReleaseTimeNs2 - this.A0M;
        if (z) {
            A0I(mediaCodec, i, earlyUs);
            return true;
        }
        long j2 = unadjustedFrameReleaseTimeNs2 - unadjustedFrameReleaseTimeNs;
        Surface surface = this.A0O;
        Surface surface2 = this.A0N;
        String[] strArr = A0e;
        if (strArr[2].charAt(13) != strArr[0].charAt(13)) {
            String[] strArr2 = A0e;
            strArr2[2] = "tTKgXyDwmZTS9W3DU5UkyT40ENaKbHyT";
            strArr2[0] = "ymAWKg2GShyJej9UBV5xPoPh0gH7RDQq";
            if (surface == surface2) {
                if (A0O(j2)) {
                    A0I(mediaCodec, i, earlyUs);
                    return true;
                }
                return false;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String[] strArr3 = A0e;
            if (strArr3[2].charAt(13) != strArr3[0].charAt(13)) {
                String[] strArr4 = A0e;
                strArr4[6] = "Tj6uZUYZuPZ7pCoRyZtHZtCub82IEIjs";
                strArr4[4] = "wN6Cz1ZftXTKk8PfKKvkhZq0bAWp3Laf";
                long j3 = elapsedRealtime * 1000;
                boolean z2 = A70() == 2;
                if (!this.A0R || (z2 && A0S(j2, j3 - this.A0L))) {
                    if (C0726Ig.A02 >= 21) {
                        long nanoTime = System.nanoTime();
                        String[] strArr5 = A0e;
                        if (strArr5[6].charAt(27) != strArr5[4].charAt(27)) {
                            String[] strArr6 = A0e;
                            strArr6[6] = "oWL9SRYwVyvR2JEBKybOkKnbuF7SsiRC";
                            strArr6[4] = "NzhSZMUYEy5Cfuxee7W6IeInRPwNjtL0";
                            A0J(mediaCodec, i, earlyUs, nanoTime);
                            return true;
                        }
                        String[] strArr7 = A0e;
                        strArr7[3] = "41VA6FIKazuT7AmZNA03mPvHgUe4JG9W";
                        strArr7[3] = "41VA6FIKazuT7AmZNA03mPvHgUe4JG9W";
                        A0J(mediaCodec, i, earlyUs, nanoTime);
                        return true;
                    }
                    A0H(mediaCodec, i, earlyUs);
                    return true;
                } else if (!z2 || unadjustedFrameReleaseTimeNs == this.A0I) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long A08 = this.A0W.A08(unadjustedFrameReleaseTimeNs2, nanoTime2 + ((j2 - (j3 - j)) * 1000));
                    long adjustedReleaseTimeNs = (A08 - nanoTime2) / 1000;
                    if (A0Q(adjustedReleaseTimeNs, j) && A0T(mediaCodec, i, earlyUs, unadjustedFrameReleaseTimeNs)) {
                        return false;
                    }
                    if (A0R(adjustedReleaseTimeNs, j)) {
                        A0G(mediaCodec, i, earlyUs);
                        return true;
                    }
                    if (C0726Ig.A02 >= 21) {
                        if (adjustedReleaseTimeNs < 50000) {
                            A0J(mediaCodec, i, earlyUs, A08);
                            return true;
                        }
                    } else if (adjustedReleaseTimeNs < 30000) {
                        if (adjustedReleaseTimeNs > 11000) {
                            try {
                                Thread.sleep((adjustedReleaseTimeNs - gc0.c) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        A0H(mediaCodec, i, earlyUs);
                        return true;
                    }
                    return false;
                }
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final boolean A1S(C0604Di c0604Di) {
        return this.A0O != null || A0U(c0604Di);
    }

    public final void A1T() {
        if (!this.A0R) {
            this.A0R = true;
            this.A0X.A03(this.A0O);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd, com.facebook.ads.redexgen.X.AZ
    public final void A7H(int i, Object obj) throws A4 {
        if (i == 1) {
            String[] strArr = A0e;
            if (strArr[2].charAt(13) == strArr[0].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[3] = "M4hKmbj6QiDhWM6pD0tSNqk85KgZRxnW";
            strArr2[3] = "M4hKmbj6QiDhWM6pD0tSNqk85KgZRxnW";
            A0M((Surface) obj);
        } else if (i == 4) {
            this.A0F = ((Integer) obj).intValue();
            MediaCodec A1E = A1E();
            if (A1E == null) {
                return;
            }
            A1E.setVideoScalingMode(this.A0F);
        } else {
            super.A7H(i, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7i() {
        Surface surface;
        if (super.A7i() && (this.A0R || (((surface = this.A0N) != null && this.A0O == surface) || A1E() == null || this.A0S))) {
            this.A0J = -9223372036854775807L;
            if (A0e[5].charAt(17) != 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[7] = "3PsRT4XFV";
            strArr[1] = "WWSFTmL3V";
            return true;
        } else if (this.A0J == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.A0J) {
                return true;
            }
            this.A0J = -9223372036854775807L;
            return false;
        }
    }
}
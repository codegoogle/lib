package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.xbill.DNS.TTL;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Cq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0586Cq {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static D6 A0C(YX yx, YY yy, long j, DrmInitData drmInitData, boolean z, boolean z2) throws AN {
        int i;
        int i2;
        int i3;
        long j2 = j;
        YX A062 = yx.A06(AbstractC0581Cl.A0d);
        int A022 = A02(A062.A07(AbstractC0581Cl.A0V).A00);
        if (A022 == -1) {
            return null;
        }
        YY A072 = yx.A07(AbstractC0581Cl.A1J);
        if (A01[3].charAt(8) != 'p') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "QWUsjPBg";
        strArr[2] = "QWUsjPBg";
        C0585Cp A0B = A0B(A072.A00);
        if (j2 == -9223372036854775807L) {
            j2 = A0B.A02;
        }
        long A042 = A04(yy.A00);
        long A0F = j2 == -9223372036854775807L ? -9223372036854775807L : C0726Ig.A0F(j2, 1000000L, A042);
        YX A063 = A062.A06(AbstractC0581Cl.A0h).A06(AbstractC0581Cl.A16);
        Pair<Long, String> A064 = A06(A062.A07(AbstractC0581Cl.A0c).A00);
        IQ iq = A063.A07(AbstractC0581Cl.A1A).A00;
        i = A0B.A00;
        i2 = A0B.A01;
        C0584Co A0A = A0A(iq, i, i2, (String) A064.second, drmInitData, z2);
        long[] jArr = null;
        long[] jArr2 = null;
        if (!z) {
            Pair<long[], long[]> A052 = A05(yx.A06(AbstractC0581Cl.A0N));
            jArr = (long[]) A052.first;
            jArr2 = (long[]) A052.second;
        }
        if (A0A.A02 == null) {
            return null;
        }
        i3 = A0B.A00;
        return new D6(i3, A022, ((Long) A064.first).longValue(), A042, A0F, A0A.A02, A0A.A01, A0A.A03, A0A.A00, jArr, jArr2);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 2);
        }
        return new String(copyOfRange);
    }

    public static void A0J() {
        A00 = new byte[]{49, 37, 119, 106, 114, 102, 110, 115, 110, 115, 108, 88, 102, 114, 117, 113, 106, 120, 70, 121, 89, 110, 114, 106, 120, 121, 102, 114, 117, 73, 106, 113, 121, 102, 37, -112, -124, -42, -55, -47, -59, -51, -46, -51, -46, -53, -73, -59, -47, -44, -48, -55, -41, -83, -46, -89, -52, bx.l7, -46, -49, -124, 71, 59, -115, g15.b, -120, 124, -124, -119, -124, -119, -126, 111, -124, -120, g15.b, -114, -113, 124, -120, -117, 95, g15.b, -121, -113, 124, 94, -125, 124, -119, -126, g15.b, -114, 59, -110, 120, -54, -67, -59, -71, -63, -58, -63, -58, -65, -85, -47, -58, -69, -64, -54, -57, -58, -63, -46, -71, -52, -63, -57, -58, -85, -71, -59, -56, -60, -67, -53, 120, 100, -105, -110, -112, 115, -124, -107, -106, -120, -107, -106, -76, -46, bx.l7, -38, -35, -44, bx.l7, -46, -117, -48, -49, -44, -33, -117, -41, -44, -34, -33, -91, -117, -48, -49, -44, -33, -117, -49, -38, -48, -34, -117, bx.l7, -38, -33, -117, -34, -33, -52, -35, -33, -117, -30, -44, -33, -45, -117, -52, -117, -34, -28, bx.l7, -50, -117, -34, -52, -40, -37, -41, -48, -103, -110, -73, -84, -72, -73, -68, -78, -68, -67, -82, -73, -67, 105, -68, -67, -85, -75, 105, -85, -72, -63, 105, -81, -72, -69, 105, -67, -69, -86, -84, -76, 105, 117, -109, -126, -124, -116, 65, -119, -126, -108, 65, -113, -112, 65, -108, -126, -114, -111, -115, -122, 65, -107, -126, -125, -115, -122, 65, -108, -118, -101, -122, 65, -118, -113, -121, -112, -109, -114, -126, -107, -118, -112, -113, -120, -95, -90, -88, -93, -93, -94, -91, -89, -104, -105, 83, -96, -104, -105, -100, -108, 83, -91, -108, -89, -104, 97, -32, -17, -17, -21, -24, -30, -32, -13, -24, -18, -19, -82, -13, -13, -20, -21, -86, -9, -20, -21, -90, -75, -75, -79, -82, -88, -90, -71, -82, -76, -77, 116, -67, 114, -88, -90, -78, -86, -73, -90, 114, -78, -76, -71, -82, -76, -77, -78, -63, -63, -67, -70, -76, -78, -59, -70, -64, -65, g15.b, -55, 126, -66, -63, -123, 126, -76, -74, -78, 126, -121, -127, -119, -89, -74, -74, -78, -81, -87, -89, -70, -81, -75, -76, 117, -66, 115, -77, -74, 122, 115, -68, -70, -70, -101, -86, -86, -90, -93, -99, -101, -82, -93, -87, -88, 105, -78, 103, -85, -81, -93, -99, -91, -82, -93, -89, -97, 103, -82, -78, 109, -95, 124, -112, g15.c, -124, -118, 74, 78, -126, -117, -117, -126, -106, -123, -118, -112, 80, -126, -124, 84, -69, -49, -66, -61, -55, -119, -69, -58, -69, -67, -33, -13, -30, -25, -19, -83, -33, -21, -16, -85, -11, -32, 107, g15.c, 110, 115, 121, 57, 111, 107, 109, 61, -109, -89, -106, -101, -95, 97, -97, -94, 102, -109, 95, -98, -109, -90, -97, -65, -45, -62, -57, -51, -115, -53, -50, -61, -59, -68, -48, -65, -60, -54, -118, -51, -68, -46, -94, -74, -91, -86, -80, 112, -73, -81, -91, 111, -91, -75, -76, -87, -67, -84, -79, -73, 119, -66, -74, -84, 118, -84, -68, -69, 118, -80, -84, 109, -127, 112, 117, 123, 59, -126, 122, 112, 58, 112, g15.b, g15.c, 58, 116, 112, 71, 124, 126, 123, 114, 117, 120, 113, 73, 120, 110, 126, -119, -120, -119, 87, -32, -33, -32, -16, -124, -122, -113, -124, -43, -41, -32, -27, -110, -105, -104, -101, -109, 112, -93, -98, -100, -126, -104, -87, -108, 79, -94, -105, -98, -92, -101, -109, 79, -111, -108, 79, -97, -98, -94, -104, -93, -104, -91, -108, 101, 110, 101, 114, -119, -107, -112, -124, 67, -124, -105, -110, -112, 67, -116, -106, 67, -112, -124, -111, -121, -124, -105, -110, -107, -100, -50, -58, -43, -62, -100, -117, -99, -107, -99, -115, -110, -109, 74, -117, -98, -103, -105, 74, -109, -99, 74, -105, -117, -104, -114, -117, -98, -103, -100, -93, -51, -55, -49, -56, -108, -106, -125, -107, -59, -74, -65, -76, 113, -78, -59, -64, -66, 113, -70, -60, 113, -66, -78, -65, -75, -78, -59, -64, -61, -54, -48, -63, -44, -48, bx.l7, -52, -57, -56, -77, -90, -95, -94, -84, 108, 112, -92, -83, -83, -52, -65, -70, -69, -59, -123, -73, -52, -71, -14, -27, -32, bx.j7, -21, -85, -28, bx.j7, -14, -33, -109, -122, -127, -126, -116, 76, -107, 74, -109, -117, -127, 75, -116, -117, 79, 75, -109, -115, 85, -86, -99, -104, -103, -93, 99, -84, 97, -86, -94, -104, 98, -93, -94, 102, 98, -86, -92, 109};
    }

    public static void A0K() {
        A01 = new String[]{"vNU1Clptty9spXV3rmNWKqfECA0GCDno", "yQl7wYGB6utTXxK398wXXYrAeYZNPLId", "BVcq1q5Q", "NihUY4HxpsM0GkJJgFchlTfxDOIJFYzw", "lx4TwpHGLs68", "XI1Xq2FkjwcQfgB5bw70GFmYpaxAyyjl", "uRZmXRdJsodI", "Cygx2J1H2ENb6XLRYlHXnR1vUW4XHHOP"};
    }

    static {
        A0K();
        A0J();
        A08 = C0726Ig.A08(A0I(696, 4, 97));
        A05 = C0726Ig.A08(A0I(662, 4, 88));
        A07 = C0726Ig.A08(A0I(692, 4, 90));
        A04 = C0726Ig.A08(A0I(636, 4, 39));
        A06 = C0726Ig.A08(A0I(666, 4, 31));
        A02 = C0726Ig.A08(A0I(606, 4, 0));
        A03 = C0726Ig.A08(A0I(632, 4, 95));
    }

    public static float A00(IQ iq, int i) {
        iq.A0Z(i + 8);
        return iq.A0I() / iq.A0I();
    }

    public static int A01(IQ iq) {
        int size = iq.A0F();
        int i = size & 127;
        while ((size & 128) == 128) {
            size = iq.A0F();
            i = (i << 7) | (size & 127);
        }
        return i;
    }

    public static int A02(IQ iq) {
        iq.A0Z(16);
        int A09 = iq.A09();
        if (A09 == A05) {
            return 1;
        }
        int trackType = A08;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[0] = "sACqbdB9h4ZaSOP8RBXRhKf5pkODD9Ze";
        strArr[5] = "nfjFHkgcUdXk9ZZxpn0R0spMdbOfBjgH";
        if (A09 == trackType) {
            return 2;
        }
        if (A09 != A07 && A09 != A04 && A09 != A06 && A09 != A02) {
            if (A09 == A03) {
                return 4;
            }
            return -1;
        }
        String[] strArr2 = A01;
        if (strArr2[4].length() != strArr2[6].length()) {
            return 3;
        }
        String[] strArr3 = A01;
        strArr3[0] = "HjSYihfmO4Fjwo0SJsN86rpcIq24412o";
        strArr3[5] = "nDlBCf5sAdyqWE5fn1qZlgrWKnIrwKiA";
        return 3;
    }

    public static int A03(IQ iq, int i, int i2) {
        int A072 = iq.A07();
        while (A072 - i < i2) {
            iq.A0Z(A072);
            int A09 = iq.A09();
            I1.A05(A09 > 0, A0I(574, 32, 45));
            if (iq.A09() == AbstractC0581Cl.A0S) {
                return A072;
            }
            A072 += A09;
        }
        return -1;
    }

    public static long A04(IQ iq) {
        int fullAtom = 8;
        iq.A0Z(8);
        int version = AbstractC0581Cl.A01(iq.A09());
        if (version != 0) {
            fullAtom = 16;
        }
        iq.A0a(fullAtom);
        return iq.A0N();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<long[], long[]> A05(YX yx) {
        YY elst;
        long A0N;
        long j;
        if (yx == null || (elst = yx.A07(AbstractC0581Cl.A0O)) == null) {
            return Pair.create(null, null);
        }
        IQ iq = elst.A00;
        iq.A0Z(8);
        int fullAtom = iq.A09();
        int A012 = AbstractC0581Cl.A01(fullAtom);
        int A0I = iq.A0I();
        long[] jArr = new long[A0I];
        long[] jArr2 = new long[A0I];
        int i = 0;
        while (true) {
            if (i >= A0I) {
                Pair<long[], long[]> create = Pair.create(jArr, jArr2);
                String[] strArr = A01;
                if (strArr[1].charAt(19) == strArr[7].charAt(19)) {
                    String[] strArr2 = A01;
                    strArr2[0] = "0OgbcJvER11tVuU6ktzS5zcploLwLpnU";
                    strArr2[5] = "Fpvfvil3v0kwqlJSCQAnqVBmdIeuMsHJ";
                    return create;
                }
            } else if (A01[2].length() != 8) {
                break;
            } else {
                String[] strArr3 = A01;
                strArr3[3] = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn";
                strArr3[3] = "n2Qu2qSRpGNWmL1w1m0Jsgn90j2APzEn";
                if (A012 == 1) {
                    A0N = iq.A0O();
                } else {
                    A0N = iq.A0N();
                }
                jArr[i] = A0N;
                if (A012 == 1) {
                    j = iq.A0M();
                } else {
                    int i2 = iq.A09();
                    j = i2;
                }
                jArr2[i] = j;
                int i3 = iq.A0V();
                if (i3 == 1) {
                    iq.A0a(2);
                    i++;
                } else {
                    throw new IllegalArgumentException(A0I(272, 23, 49));
                }
            }
        }
    }

    public static Pair<Long, String> A06(IQ iq) {
        iq.A0Z(8);
        int A012 = AbstractC0581Cl.A01(iq.A09());
        int version = A012 == 0 ? 8 : 16;
        iq.A0a(version);
        long A0N = iq.A0N();
        int fullAtom = A012 == 0 ? 4 : 8;
        iq.A0a(fullAtom);
        int A0J = iq.A0J();
        StringBuilder sb = new StringBuilder();
        sb.append(A0I(0, 0, 122));
        int version2 = A0J >> 10;
        sb.append((char) ((version2 & 31) + 96));
        int version3 = A0J >> 5;
        sb.append((char) ((version3 & 31) + 96));
        int version4 = A0J & 31;
        sb.append((char) (version4 + 96));
        return Pair.create(Long.valueOf(A0N), sb.toString());
    }

    public static Pair<String, byte[]> A07(IQ iq, int i) {
        iq.A0Z(i + 8 + 4);
        iq.A0a(1);
        A01(iq);
        iq.A0a(2);
        int A0F = iq.A0F();
        int flags = A0F & 128;
        if (flags != 0) {
            iq.A0a(2);
        }
        int flags2 = A0F & 64;
        if (flags2 != 0) {
            int flags3 = iq.A0J();
            iq.A0a(flags3);
        }
        int flags4 = A0F & 32;
        if (flags4 != 0) {
            iq.A0a(2);
        }
        iq.A0a(1);
        A01(iq);
        int A0F2 = iq.A0F();
        String[] strArr = A01;
        String str = strArr[0];
        String str2 = strArr[5];
        int charAt = str.charAt(2);
        int flags5 = str2.charAt(2);
        if (charAt != flags5) {
            String[] strArr2 = A01;
            strArr2[4] = "ipSJ7rerSzX8";
            strArr2[6] = "rVXKHnYgOQNY";
            String A032 = IJ.A03(A0F2);
            String mimeType = A0I(482, 10, 92);
            if (!mimeType.equals(A032)) {
                String mimeType2 = A0I(501, 13, 63);
                if (!mimeType2.equals(A032)) {
                    String mimeType3 = A0I(IronSourceConstants.INIT_COMPLETE, 16, 70);
                    if (!mimeType3.equals(A032)) {
                        iq.A0a(12);
                        iq.A0a(1);
                        int A012 = A01(iq);
                        byte[] bArr = new byte[A012];
                        iq.A0d(bArr, 0, A012);
                        return Pair.create(A032, bArr);
                    }
                }
            }
            Pair<String, byte[]> create = Pair.create(A032, null);
            if (A01[3].charAt(8) != 'p') {
                return create;
            }
            String[] strArr3 = A01;
            strArr3[1] = "09LVPMUcXpQFix5jag1XMCG3MLP6JHGE";
            strArr3[7] = "l6DCOVwnZaQMuPJJN9SXx5QHr45WFHuE";
            return create;
        }
        throw new RuntimeException();
    }

    public static Pair<Integer, D7> A08(IQ iq, int schemeInformationBoxPosition, int schemeInformationBoxSize) {
        int i = schemeInformationBoxPosition + 8;
        int i2 = -1;
        int childAtomSize = 0;
        String str = null;
        Integer num = null;
        while (true) {
            int i3 = i - schemeInformationBoxPosition;
            if (A01[3].charAt(8) != 'p') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "AMwqROlZ";
            strArr[2] = "AMwqROlZ";
            if (i3 < schemeInformationBoxSize) {
                iq.A0Z(i);
                int A09 = iq.A09();
                int A092 = iq.A09();
                if (A092 == AbstractC0581Cl.A0T) {
                    num = Integer.valueOf(iq.A09());
                } else if (A092 == AbstractC0581Cl.A0z) {
                    iq.A0a(4);
                    str = iq.A0T(4);
                } else if (A092 == AbstractC0581Cl.A0y) {
                    i2 = i;
                    childAtomSize = A09;
                }
                i += A09;
            } else if (A0I(566, 4, 31).equals(str) || A0I(558, 4, 36).equals(str) || A0I(570, 4, 112).equals(str) || A0I(562, 4, 123).equals(str)) {
                boolean z = true;
                I1.A05(num != null, A0I(610, 22, 33));
                I1.A05(i2 != -1, A0I(640, 22, 40));
                D7 A0D = A0D(iq, i2, childAtomSize, str);
                if (A0D == null) {
                    z = false;
                }
                I1.A05(z, A0I(670, 22, 79));
                return Pair.create(num, A0D);
            } else {
                return null;
            }
        }
    }

    public static Pair<Integer, D7> A09(IQ iq, int i, int i2) {
        Pair<Integer, D7> A082;
        int A072 = iq.A07();
        while (A072 - i < i2) {
            iq.A0Z(A072);
            int A09 = iq.A09();
            I1.A05(A09 > 0, A0I(574, 32, 45));
            if (iq.A09() == AbstractC0581Cl.A13 && (A082 = A08(iq, A072, A09)) != null) {
                return A082;
            }
            A072 += A09;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        if (r7 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A0v) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00df, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A0w) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e3, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A0a) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A14) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00eb, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A03) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
        r3 = com.facebook.ads.redexgen.X.AbstractC0581Cl.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fc, code lost:
        if (com.facebook.ads.redexgen.X.C0586Cq.A01[3].charAt(8) == 'p') goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fe, code lost:
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
        r2[2] = "qFwSWgIL";
        r2[2] = "qFwSWgIL";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010a, code lost:
        if (r7 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0114, code lost:
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
        r2[3] = "CalJSZVBpFQrcbMBJJxLaxIn8rHUlaUl";
        r2[3] = "CalJSZVBpFQrcbMBJJxLaxIn8rHUlaUl";
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0120, code lost:
        if (r7 != r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012f, code lost:
        if (r7 != r3) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0132, code lost:
        r3 = com.facebook.ads.redexgen.X.AbstractC0581Cl.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013f, code lost:
        if (com.facebook.ads.redexgen.X.C0586Cq.A01[2].length() == 8) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0143, code lost:
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
        r2[0] = "Ao0TD4kH2iK3OLyPM25FC6RmFi2h7I9b";
        r2[5] = "OuNutSfPZXXgacWVKzm9oLRb1otwM5q4";
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014f, code lost:
        if (r7 == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0151, code lost:
        r3 = com.facebook.ads.redexgen.X.AbstractC0581Cl.A1O;
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0165, code lost:
        if (r2[1].charAt(19) == r2[7].charAt(19)) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016c, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016d, code lost:
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
        r2[0] = "AIk7lRaJ8E5MijNPplfsCP53DjqDD31L";
        r2[5] = "UZtf95QrnIyEi2GPpmv3pYGFcGVBr3II";
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0179, code lost:
        if (r7 == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017d, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A1W) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0181, code lost:
        if (r7 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A18) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0185, code lost:
        if (r7 != com.facebook.ads.redexgen.X.AbstractC0581Cl.A09) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0187, code lost:
        r6 = r6;
        r8 = r8;
        r9 = r9;
        A0M(r6, r7, r8, r9, r25, r27, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0195, code lost:
        if (r7 != com.facebook.ads.redexgen.X.AbstractC0581Cl.A0A) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0197, code lost:
        r7 = java.lang.Integer.toString(r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        if (com.facebook.ads.redexgen.X.C0586Cq.A01[2].length() == 8) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01bc, code lost:
        r2 = com.facebook.ads.redexgen.X.C0586Cq.A01;
        r2[4] = "I4VfvCwCFlYX";
        r2[6] = "JqrGNuQTdpXg";
        r14.A02 = com.facebook.ads.internal.exoplayer2.Format.A0B(r7, A0I(315, 27, 67), null, -1, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0584Co A0A(IQ iq, int i, int i2, String str, DrmInitData drmInitData, boolean z) throws AN {
        IQ iq2 = iq;
        iq2.A0Z(12);
        int A09 = iq2.A09();
        C0584Co c0584Co = new C0584Co(A09);
        for (int numberOfEntries = 0; numberOfEntries < A09; numberOfEntries++) {
            int i3 = iq2.A07();
            int childStartPosition = iq2.A09();
            I1.A05(childStartPosition > 0, A0I(574, 32, 45));
            int A092 = iq2.A09();
            if (A092 == AbstractC0581Cl.A06 || A092 == AbstractC0581Cl.A07 || A092 == AbstractC0581Cl.A0R || A092 == AbstractC0581Cl.A0l || A092 == AbstractC0581Cl.A0X || A092 == AbstractC0581Cl.A0W || A092 == AbstractC0581Cl.A0s || A092 == AbstractC0581Cl.A1S || A092 == AbstractC0581Cl.A1T) {
                A0L(iq2, A092, i3, childStartPosition, i, i2, drmInitData, c0584Co, numberOfEntries);
            } else {
                if (A092 != AbstractC0581Cl.A0k && A092 != AbstractC0581Cl.A0Q && A092 != AbstractC0581Cl.A04 && A092 != AbstractC0581Cl.A0M && A092 != AbstractC0581Cl.A0I && A092 != AbstractC0581Cl.A0J && A092 != AbstractC0581Cl.A0K) {
                    int i4 = AbstractC0581Cl.A0L;
                    String[] strArr = A01;
                    if (strArr[0].charAt(2) != strArr[5].charAt(2)) {
                        String[] strArr2 = A01;
                        strArr2[1] = "aFNChY2Gp5UEShUqI2ZXHXvlMwnckVls";
                        strArr2[7] = "ICAWmHz3ZpXYA3N9yykXLnBWwAg7HORp";
                    } else {
                        String[] strArr3 = A01;
                        strArr3[4] = "Sa7AXdU7dVgi";
                        strArr3[6] = "cU1MdBqtKcjZ";
                    }
                }
                iq2 = iq2;
                A0N(iq2, A092, i3, childStartPosition, i, str, z, drmInitData, c0584Co, numberOfEntries);
            }
            int i5 = i3 + childStartPosition;
            String[] strArr4 = A01;
            if (strArr4[4].length() != strArr4[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr5 = A01;
            strArr5[4] = "IGv93Dj7KDTv";
            strArr5[6] = "6A1iIS8N9vp3";
            iq2.A0Z(i5);
        }
        return c0584Co;
    }

    public static C0585Cp A0B(IQ iq) {
        long A0N;
        int a11;
        iq.A0Z(8);
        int a00 = AbstractC0581Cl.A01(iq.A09());
        int version = a00 == 0 ? 8 : 16;
        iq.A0a(version);
        int A09 = iq.A09();
        iq.A0a(4);
        int i = 1;
        int A072 = iq.A07();
        int fullAtom = a00 == 0 ? 4 : 8;
        int a01 = 0;
        while (true) {
            if (a01 >= fullAtom) {
                break;
            }
            int version2 = A072 + a01;
            if (iq.A00[version2] != -1) {
                i = 0;
                break;
            }
            a01++;
        }
        if (i != 0) {
            iq.A0a(fullAtom);
            A0N = -9223372036854775807L;
        } else {
            A0N = a00 == 0 ? iq.A0N() : iq.A0O();
            int fixedOne = (A0N > 0L ? 1 : (A0N == 0L ? 0 : -1));
            if (fixedOne == 0) {
                A0N = -9223372036854775807L;
            }
        }
        iq.A0a(16);
        int fullAtom2 = iq.A09();
        int a002 = iq.A09();
        iq.A0a(4);
        int trackId = iq.A09();
        int durationPosition = iq.A09();
        if (fullAtom2 == 0 && a002 == 65536) {
            int fixedOne2 = -65536;
            if (trackId == fixedOne2 && durationPosition == 0) {
                a11 = 90;
                return new C0585Cp(A09, A0N, a11);
            }
        }
        if (fullAtom2 == 0) {
            int durationByteCount = -65536;
            String[] strArr = A01;
            String str = strArr[4];
            String str2 = strArr[6];
            int length = str.length();
            int fixedOne3 = str2.length();
            if (length != fixedOne3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "i5DrkfhddIOc";
            strArr2[6] = "TqiRE9mqRyND";
            if (a002 == durationByteCount && trackId == 65536 && durationPosition == 0) {
                a11 = 270;
                return new C0585Cp(A09, A0N, a11);
            }
        }
        int fixedOne4 = -65536;
        if (fullAtom2 == fixedOne4 && a002 == 0 && trackId == 0) {
            int fixedOne5 = -65536;
            if (durationPosition == fixedOne5) {
                a11 = 180;
                return new C0585Cp(A09, A0N, a11);
            }
        }
        a11 = 0;
        return new C0585Cp(A09, A0N, a11);
    }

    public static D7 A0D(IQ iq, int childPosition, int i, String str) {
        int constantIvSize = childPosition + 8;
        while (constantIvSize - childPosition < i) {
            iq.A0Z(constantIvSize);
            int defaultCryptByteBlock = iq.A09();
            if (iq.A09() == AbstractC0581Cl.A1G) {
                int version = AbstractC0581Cl.A01(iq.A09());
                boolean z = true;
                iq.A0a(1);
                int i2 = 0;
                int i3 = 0;
                if (version == 0) {
                    iq.A0a(1);
                } else {
                    int defaultSkipByteBlock = iq.A0F();
                    int patternByte = defaultSkipByteBlock & 240;
                    i2 = patternByte >> 4;
                    i3 = defaultSkipByteBlock & 15;
                }
                int version2 = iq.A0F();
                if (version2 != 1) {
                    z = false;
                }
                int A0F = iq.A0F();
                byte[] bArr = new byte[16];
                int defaultPerSampleIvSize = bArr.length;
                iq.A0d(bArr, 0, defaultPerSampleIvSize);
                byte[] bArr2 = null;
                if (z && A0F == 0) {
                    int A0F2 = iq.A0F();
                    bArr2 = new byte[A0F2];
                    iq.A0d(bArr2, 0, A0F2);
                    if (A01[2].length() != 8) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A01;
                    strArr[2] = "N18HcU44";
                    strArr[2] = "N18HcU44";
                }
                return new D7(z, str, A0F, bArr, i2, i3, bArr2);
            }
            constantIvSize += defaultCryptByteBlock;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x038f, code lost:
        if (r11 != 0) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x03b5, code lost:
        if (r11 <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x03b9, code lost:
        if (r5 > org.xbill.DNS.TTL.MAX_VALUE) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03bb, code lost:
        r1 = (int) r3;
        r44.A00 = r1;
        r1 = (int) r5;
        r44.A01 = r1;
        com.facebook.ads.redexgen.X.C0726Ig.A0b(r13, 1000000, r0.A06);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03da, code lost:
        return new com.facebook.ads.redexgen.X.D9(r42, r19, r20, r18, r13, r21, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x03e7, code lost:
        if (r11 <= 0) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x03f6, code lost:
        if (r11 != 0) goto L121;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static D9 A0E(D6 d6, YX yx, CO co) throws AN {
        InterfaceC0583Cn c1125Ya;
        boolean z;
        D6 d62;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j;
        long[] jArr5;
        YY A072 = yx.A07(AbstractC0581Cl.A1C);
        if (A072 != null) {
            c1125Ya = new YZ(A072);
        } else {
            YY A073 = yx.A07(AbstractC0581Cl.A1E);
            if (A073 != null) {
                c1125Ya = new C1125Ya(A073);
            } else {
                throw new AN(A0I(230, 42, 31));
            }
        }
        int maximumSize = c1125Ya.A6q();
        if (maximumSize == 0) {
            return new D9(d6, new long[0], new int[0], 0, new long[0], new int[0], -9223372036854775807L);
        }
        boolean z2 = false;
        YY A074 = yx.A07(AbstractC0581Cl.A17);
        if (A074 == null) {
            z2 = true;
            int i = AbstractC0581Cl.A0B;
            if (A01[2].length() == 8) {
                String[] strArr = A01;
                strArr[4] = "tAZ8kw98eWsC";
                strArr[6] = "j06huWSmFoSN";
                A074 = yx.A07(i);
            }
            throw new RuntimeException();
        }
        IQ iq = A074.A00;
        IQ iq2 = yx.A07(AbstractC0581Cl.A19).A00;
        IQ stsc = yx.A07(AbstractC0581Cl.A1D).A00;
        YY A075 = yx.A07(AbstractC0581Cl.A1B);
        IQ iq3 = A075 != null ? A075.A00 : null;
        YY A076 = yx.A07(AbstractC0581Cl.A0C);
        IQ iq4 = A076 != null ? A076.A00 : null;
        C0582Cm c0582Cm = new C0582Cm(iq2, iq, z2);
        stsc.A0Z(12);
        int A0I = stsc.A0I() - 1;
        int A0I2 = stsc.A0I();
        int A0I3 = stsc.A0I();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        if (iq4 != null) {
            iq4.A0Z(12);
            if (A01[2].length() != 8) {
                String[] strArr2 = A01;
                strArr2[3] = "L0AwLnMzpUVZw0eA5xJMrWaPTFyNZJ4l";
                strArr2[3] = "L0AwLnMzpUVZw0eA5xJMrWaPTFyNZJ4l";
                i3 = iq4.A0I();
            } else {
                String[] strArr3 = A01;
                strArr3[0] = "QSMsFg5SqZ0MdGMo2pjKfVLErbdATzfM";
                strArr3[5] = "0ZxnaUDgpQuXguOXfTzNI5lEB6qL53xV";
                i3 = iq4.A0I();
            }
        }
        int i5 = -1;
        int sampleCount = 0;
        if (iq3 != null) {
            iq3.A0Z(12);
            sampleCount = iq3.A0I();
            if (sampleCount > 0) {
                int nextSynchronizationSampleIndex = iq3.A0I();
                i5 = nextSynchronizationSampleIndex - 1;
                String[] strArr4 = A01;
                String str = strArr4[4];
                String str2 = strArr4[6];
                int length = str.length();
                int nextSynchronizationSampleIndex2 = str2.length();
                if (length == nextSynchronizationSampleIndex2) {
                    String[] strArr5 = A01;
                    strArr5[2] = "faWOqNa6";
                    strArr5[2] = "faWOqNa6";
                }
                throw new RuntimeException();
            }
            iq3 = null;
        }
        if (c1125Ya.A7c()) {
            if (A0I(492, 9, 89).equals(d6.A07.A0O) && A0I == 0 && i3 == 0 && sampleCount == 0) {
                z = true;
                int remainingTimestampOffsetChanges = 0;
                long j2 = 0;
                String A0I4 = A0I(128, 11, 33);
                if (z) {
                    jArr = new long[maximumSize];
                    jArr2 = new int[maximumSize];
                    jArr3 = new long[maximumSize];
                    jArr4 = new int[maximumSize];
                    long timestampTimeUnits = 0;
                    int i6 = 0;
                    for (int remainingTimestampDeltaChanges = 0; remainingTimestampDeltaChanges < maximumSize; remainingTimestampDeltaChanges++) {
                        while (i6 == 0) {
                            I1.A04(c0582Cm.A03());
                            timestampTimeUnits = c0582Cm.A02;
                            i6 = c0582Cm.A01;
                        }
                        if (iq4 != null) {
                            while (i2 == 0 && i3 > 0) {
                                i2 = iq4.A0I();
                                i4 = iq4.A09();
                                i3--;
                            }
                            i2--;
                        }
                        jArr[remainingTimestampDeltaChanges] = timestampTimeUnits;
                        int timestampDeltaInTimeUnits = c1125Ya.AC3();
                        jArr2[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits;
                        int timestampDeltaInTimeUnits2 = jArr2[remainingTimestampDeltaChanges];
                        int nextSynchronizationSampleIndex3 = remainingTimestampOffsetChanges;
                        if (timestampDeltaInTimeUnits2 > nextSynchronizationSampleIndex3) {
                            remainingTimestampOffsetChanges = jArr2[remainingTimestampDeltaChanges];
                        }
                        int timestampDeltaInTimeUnits3 = i4;
                        jArr3[remainingTimestampDeltaChanges] = j2 + timestampDeltaInTimeUnits3;
                        int timestampDeltaInTimeUnits4 = iq3 == null ? 1 : 0;
                        jArr4[remainingTimestampDeltaChanges] = timestampDeltaInTimeUnits4;
                        if (remainingTimestampDeltaChanges == i5) {
                            jArr4[remainingTimestampDeltaChanges] = 1;
                            sampleCount--;
                            if (sampleCount > 0) {
                                int timestampDeltaInTimeUnits5 = iq3.A0I();
                                i5 = timestampDeltaInTimeUnits5 - 1;
                            }
                        }
                        int timestampDeltaInTimeUnits6 = A0I3;
                        j2 += timestampDeltaInTimeUnits6;
                        A0I2--;
                        if (A0I2 == 0 && A0I > 0) {
                            A0I2 = stsc.A0I();
                            A0I3 = stsc.A09();
                            A0I--;
                        }
                        int timestampDeltaInTimeUnits7 = jArr2[remainingTimestampDeltaChanges];
                        timestampTimeUnits += timestampDeltaInTimeUnits7;
                        i6--;
                    }
                    j = j2 + i4;
                    I1.A03(i2 == 0);
                    while (i3 > 0) {
                        I1.A03(iq4.A0I() == 0);
                        iq4.A09();
                        i3--;
                    }
                    if (sampleCount != 0 || A0I2 != 0 || i6 != 0 || A0I != 0) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(A0I(198, 32, 71));
                        d62 = d6;
                        sb.append(d62.A00);
                        sb.append(A0I(94, 34, 86));
                        sb.append(sampleCount);
                        sb.append(A0I(0, 35, 3));
                        sb.append(A0I2);
                        sb.append(A0I(35, 26, 98));
                        sb.append(i6);
                        sb.append(A0I(61, 33, 25));
                        sb.append(A0I);
                        Log.w(A0I4, sb.toString());
                    } else {
                        d62 = d6;
                    }
                } else {
                    d62 = d6;
                    long[] jArr6 = new long[c0582Cm.A05];
                    int[] chunkSampleCounts = new int[c0582Cm.A05];
                    while (c0582Cm.A03()) {
                        jArr6[c0582Cm.A00] = c0582Cm.A02;
                        chunkSampleCounts[c0582Cm.A00] = c0582Cm.A01;
                    }
                    C0589Ct A002 = C0590Cu.A00(C0726Ig.A05(d62.A07.A0A, d62.A07.A05), jArr6, chunkSampleCounts, A0I3);
                    jArr = A002.A04;
                    jArr2 = A002.A03;
                    remainingTimestampOffsetChanges = A002.A00;
                    jArr3 = A002.A05;
                    jArr4 = A002.A02;
                    j = A002.A01;
                }
                long timestampTimeUnits2 = j;
                long A0F = C0726Ig.A0F(timestampTimeUnits2, 1000000L, d62.A06);
                if (d62.A08 != null) {
                    if (!co.A04()) {
                        if (d62.A08.length == 1 && d62.A03 == 1 && jArr3.length >= 2) {
                            long j3 = d62.A09[0];
                            long j4 = d62.A08[0];
                            long timestampTimeUnits3 = d62.A06;
                            long A0F2 = j3 + C0726Ig.A0F(j4, timestampTimeUnits3, d62.A05);
                            if (A0O(jArr3, j, j3, A0F2)) {
                                long j5 = j3 - jArr3[0];
                                long timestampTimeUnits4 = d62.A07.A0C;
                                long A0F3 = C0726Ig.A0F(j5, timestampTimeUnits4, d62.A06);
                                long j6 = d62.A07.A0C;
                                long timestampTimeUnits5 = d62.A06;
                                long timestampTimeUnits6 = C0726Ig.A0F(j - A0F2, j6, timestampTimeUnits5);
                                if (A0F3 == 0) {
                                    int i7 = (timestampTimeUnits6 > 0L ? 1 : (timestampTimeUnits6 == 0L ? 0 : -1));
                                    if (A01[3].charAt(8) == 'p') {
                                        String[] strArr6 = A01;
                                        strArr6[0] = "GiUyKgvb1y07kiuWm4Sv6lyFuYOGmq6U";
                                        strArr6[5] = "fYJ91Mt5TVtKF5bzm86egGGGI715VMxk";
                                    }
                                    throw new RuntimeException();
                                }
                                int i8 = (A0F3 > TTL.MAX_VALUE ? 1 : (A0F3 == TTL.MAX_VALUE ? 0 : -1));
                                String[] strArr7 = A01;
                                if (strArr7[0].charAt(2) != strArr7[5].charAt(2)) {
                                    String[] strArr8 = A01;
                                    strArr8[2] = "QK1vfch0";
                                    strArr8[2] = "QK1vfch0";
                                } else {
                                    String[] strArr9 = A01;
                                    strArr9[2] = "tECeEFHQ";
                                    strArr9[2] = "tECeEFHQ";
                                }
                                throw new RuntimeException();
                            }
                        }
                        if (d62.A08.length == 1 && d62.A08[0] == 0) {
                            long j7 = d62.A09[0];
                            for (int i9 = 0; i9 < jArr3.length; i9++) {
                                jArr3[i9] = C0726Ig.A0F(jArr3[i9] - j7, 1000000L, d62.A06);
                            }
                            int sampleCount2 = remainingTimestampOffsetChanges;
                            return new D9(d6, jArr, jArr2, sampleCount2, jArr3, jArr4, C0726Ig.A0F(j - j7, 1000000L, d62.A06));
                        }
                        boolean z3 = d62.A03 == 1;
                        int endIndex = 0;
                        int i10 = 0;
                        boolean z4 = false;
                        for (int nextSampleIndex = 0; nextSampleIndex < d62.A08.length; nextSampleIndex++) {
                            long j8 = d62.A09[nextSampleIndex];
                            if (j8 != -1) {
                                long j9 = d62.A08[nextSampleIndex];
                                long timestampTimeUnits7 = d62.A06;
                                long A0F4 = C0726Ig.A0F(j9, timestampTimeUnits7, d62.A05);
                                int A0A = C0726Ig.A0A(jArr3, j8, true, true);
                                int A0A2 = C0726Ig.A0A(jArr3, j8 + A0F4, z3, false);
                                endIndex += A0A2 - A0A;
                                z4 |= i10 != A0A;
                                i10 = A0A2;
                            }
                        }
                        boolean z5 = z4 | (endIndex != maximumSize);
                        String[] strArr10 = A01;
                        if (strArr10[0].charAt(2) != strArr10[5].charAt(2)) {
                            String[] strArr11 = A01;
                            strArr11[2] = "orK8SNX8";
                            strArr11[2] = "orK8SNX8";
                            if (z5) {
                                long[] offsets = new long[endIndex];
                                jArr5 = offsets;
                            } else {
                                jArr5 = jArr;
                            }
                            int[] editedFlags = z5 ? new int[endIndex] : jArr2;
                            if (A01[2].length() == 8) {
                                String[] strArr12 = A01;
                                strArr12[4] = "JgZNmdNdmpUD";
                                strArr12[6] = "PBu5Yw4SG2Bu";
                                if (z5) {
                                    remainingTimestampOffsetChanges = 0;
                                }
                                int[] editedFlags2 = z5 ? new int[endIndex] : jArr4;
                                long[] jArr7 = new long[endIndex];
                                long j10 = 0;
                                int i11 = 0;
                                for (int i12 = 0; i12 < d62.A08.length; i12++) {
                                    long j11 = d62.A09[i12];
                                    long editDuration = d62.A08[i12];
                                    if (j11 != -1) {
                                        int A0A3 = C0726Ig.A0A(jArr3, j11, true, true);
                                        int A0A4 = C0726Ig.A0A(jArr3, C0726Ig.A0F(editDuration, d62.A06, d62.A05) + j11, z3, false);
                                        if (z5) {
                                            int count = A0A4 - A0A3;
                                            long[] timestamps = jArr;
                                            System.arraycopy(timestamps, A0A3, jArr5, i11, count);
                                            long[] timestamps2 = jArr2;
                                            System.arraycopy(timestamps2, A0A3, editedFlags, i11, count);
                                            long[] timestamps3 = jArr4;
                                            System.arraycopy(timestamps3, A0A3, editedFlags2, i11, count);
                                        }
                                        if (A0A3 >= A0A4 || (editedFlags2[i11] & 1) != 0) {
                                            while (A0A3 < A0A4) {
                                                jArr7[i11] = C0726Ig.A0F(j10, 1000000L, d62.A05) + C0726Ig.A0F(jArr3[A0A3] - j11, 1000000L, d62.A06);
                                                if (z5) {
                                                    int editedMaximumSize = remainingTimestampOffsetChanges;
                                                    if (editedFlags[i11] > editedMaximumSize) {
                                                        remainingTimestampOffsetChanges = jArr2[A0A3];
                                                    }
                                                }
                                                i11++;
                                                A0A3++;
                                            }
                                        } else {
                                            Log.w(A0I4, A0I(WKSRecord.Service.NETBIOS_SSN, 59, 105));
                                            throw new C1126Yb();
                                        }
                                    }
                                    j10 += editDuration;
                                }
                                return new D9(d6, jArr5, editedFlags, remainingTimestampOffsetChanges, jArr7, editedFlags2, C0726Ig.A0F(j10, 1000000L, d62.A06));
                            }
                        }
                        throw new RuntimeException();
                    }
                    String[] strArr13 = A01;
                    if (strArr13[0].charAt(2) != strArr13[5].charAt(2)) {
                        String[] strArr14 = A01;
                        strArr14[1] = "0WQDc4By6ZKUv50MYhDXaKvo73wTc1oJ";
                        strArr14[7] = "m7R3atyNmMw0aUGXjhmXWAr036NwYgBK";
                    } else {
                        String[] strArr15 = A01;
                        strArr15[4] = "jqrwPGYejRDY";
                        strArr15[6] = "OhyeZO60DlaV";
                    }
                }
                C0726Ig.A0b(jArr3, 1000000L, d62.A06);
                return new D9(d6, jArr, jArr2, remainingTimestampOffsetChanges, jArr3, jArr4, A0F);
            }
        }
        z = false;
        int remainingTimestampOffsetChanges2 = 0;
        long j22 = 0;
        String A0I42 = A0I(128, 11, 33);
        if (z) {
        }
        long timestampTimeUnits22 = j;
        long A0F5 = C0726Ig.A0F(timestampTimeUnits22, 1000000L, d62.A06);
        if (d62.A08 != null) {
        }
        C0726Ig.A0b(jArr3, 1000000L, d62.A06);
        return new D9(d6, jArr, jArr2, remainingTimestampOffsetChanges2, jArr3, jArr4, A0F5);
    }

    public static Metadata A0F(YY yy, boolean z) {
        if (z) {
            return null;
        }
        IQ iq = yy.A00;
        iq.A0Z(8);
        while (iq.A05() >= 8) {
            int A072 = iq.A07();
            int A09 = iq.A09();
            int A092 = iq.A09();
            int atomType = AbstractC0581Cl.A0g;
            if (A092 == atomType) {
                iq.A0Z(A072);
                return A0H(iq, A072 + A09);
            }
            int atomType2 = A09 - 8;
            iq.A0a(atomType2);
        }
        return null;
    }

    public static Metadata A0G(IQ iq, int i) {
        iq.A0a(8);
        ArrayList arrayList = new ArrayList();
        while (iq.A07() < i) {
            Metadata.Entry A012 = C0594Cy.A01(iq);
            if (A012 != null) {
                arrayList.add(A012);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static Metadata A0H(IQ iq, int i) {
        iq.A0a(12);
        while (iq.A07() < i) {
            int A072 = iq.A07();
            int A09 = iq.A09();
            int A092 = iq.A09();
            int atomType = AbstractC0581Cl.A0Z;
            if (A092 == atomType) {
                iq.A0Z(A072);
                return A0G(iq, A072 + A09);
            }
            int atomType2 = A09 - 8;
            iq.A0a(atomType2);
        }
        return null;
    }

    public static void A0L(IQ iq, int i, int i2, int i3, int i4, int width, DrmInitData drmInitData, C0584Co c0584Co, int childPosition) throws AN {
        DrmInitData drmInitData2 = drmInitData;
        int stereoMode = i;
        iq.A0Z(i2 + 8 + 8);
        iq.A0a(16);
        int A0J = iq.A0J();
        int A0J2 = iq.A0J();
        boolean z = false;
        float f = 1.0f;
        iq.A0a(50);
        int A072 = iq.A07();
        int height = AbstractC0581Cl.A0R;
        if (stereoMode == height) {
            Pair<Integer, D7> A09 = A09(iq, i2, i3);
            if (A09 != null) {
                stereoMode = ((Integer) A09.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.A03(((D7) A09.second).A02);
                c0584Co.A03[childPosition] = (D7) A09.second;
            }
            iq.A0Z(A072);
        }
        List<byte[]> list = null;
        String str = null;
        byte[] bArr = null;
        if (A01[2].length() != 8) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "nt1AbbZdLf7H";
        strArr[6] = "te59XVvfeUPr";
        int i5 = -1;
        while (A072 - i2 < i3) {
            iq.A0Z(A072);
            int A073 = iq.A07();
            int A092 = iq.A09();
            if (A092 == 0 && iq.A07() - i2 == i3) {
                break;
            }
            I1.A05(A092 > 0, A0I(574, 32, 45));
            int A093 = iq.A09();
            if (A093 == AbstractC0581Cl.A08) {
                I1.A04(str == null);
                str = A0I(710, 9, 84);
                iq.A0Z(A073 + 8);
                C0728Ii A002 = C0728Ii.A00(iq);
                list = A002.A04;
                c0584Co.A00 = A002.A02;
                if (!z) {
                    f = A002.A00;
                }
            } else if (A093 == AbstractC0581Cl.A0Y) {
                I1.A04(str == null);
                str = A0I(719, 10, 122);
                iq.A0Z(A073 + 8);
                C0732Io A003 = C0732Io.A00(iq);
                list = A003.A01;
                c0584Co.A00 = A003.A00;
            } else if (A093 == AbstractC0581Cl.A1U) {
                I1.A04(str == null);
                str = stereoMode == AbstractC0581Cl.A1S ? A0I(729, 19, 27) : A0I(748, 19, 50);
            } else if (A093 == AbstractC0581Cl.A0D) {
                I1.A04(str == null);
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[4] = "qKPn33WXRD1J";
                strArr2[6] = "UtAkzKHIBavs";
                str = A0I(aa.h.j, 10, 59);
            } else if (A093 == AbstractC0581Cl.A0S) {
                I1.A04(str == null);
                Pair<String, byte[]> A074 = A07(iq, A073);
                str = (String) A074.first;
                list = Collections.singletonList(A074.second);
            } else if (A093 == AbstractC0581Cl.A0p) {
                f = A00(iq, A073);
                z = true;
            } else if (A093 == AbstractC0581Cl.A1F) {
                bArr = A0P(iq, A073, A092);
            } else if (A093 == AbstractC0581Cl.A15) {
                int A0F = iq.A0F();
                iq.A0a(3);
                if (A0F == 0) {
                    int A0F2 = iq.A0F();
                    if (A0F2 == 0) {
                        i5 = 0;
                    } else if (A0F2 == 1) {
                        i5 = 1;
                    } else if (A0F2 != 2) {
                        if (A0F2 == 3) {
                            i5 = 3;
                        }
                    } else {
                        i5 = 2;
                    }
                }
            }
            A072 += A092;
        }
        if (str == null) {
            return;
        }
        c0584Co.A02 = Format.A04(Integer.toString(i4), str, null, -1, -1, A0J, A0J2, -1.0f, list, width, f, bArr, i5, null, drmInitData2);
    }

    public static void A0M(IQ iq, int i, int i2, int i3, int i4, String str, C0584Co c0584Co) throws AN {
        String A0I;
        iq.A0Z(i2 + 8 + 8);
        List list = null;
        long j = Long.MAX_VALUE;
        if (i == AbstractC0581Cl.A02) {
            A0I = A0I(295, 20, 125);
        } else if (i == AbstractC0581Cl.A1O) {
            A0I = A0I(388, 28, 56);
            int i5 = (i3 - 8) - 8;
            byte[] bArr = new byte[i5];
            iq.A0d(bArr, 0, i5);
            list = Collections.singletonList(bArr);
        } else if (i == AbstractC0581Cl.A1W) {
            A0I = A0I(367, 21, 68);
        } else if (i == AbstractC0581Cl.A18) {
            A0I = A0I(295, 20, 125);
            j = 0;
        } else if (i == AbstractC0581Cl.A09) {
            A0I = A0I(342, 25, 79);
            c0584Co.A01 = 1;
        } else {
            throw new IllegalStateException();
        }
        c0584Co.A02 = Format.A09(Integer.toString(i4), A0I, null, -1, 0, str, -1, null, j, list);
    }

    public static void A0N(IQ iq, int i, int i2, int i3, int channelCount, String str, boolean z, DrmInitData drmInitData, C0584Co c0584Co, int i4) throws AN {
        int childAtomType;
        int childPosition;
        DrmInitData drmInitData2 = drmInitData;
        int i5 = i;
        iq.A0Z(i2 + 8 + 8);
        int i6 = 0;
        if (z) {
            i6 = iq.A0J();
            iq.A0a(6);
        } else {
            iq.A0a(8);
        }
        if (i6 == 0 || i6 == 1) {
            childAtomType = iq.A0J();
            iq.A0a(6);
            childPosition = iq.A0G();
            if (i6 == 1) {
                iq.A0a(16);
            }
        } else if (i6 == 2) {
            iq.A0a(16);
            childPosition = (int) Math.round(iq.A04());
            childAtomType = iq.A0I();
            iq.A0a(20);
        } else {
            return;
        }
        int atomType = iq.A07();
        if (i5 == AbstractC0581Cl.A0Q) {
            Pair<Integer, D7> A09 = A09(iq, i2, i3);
            if (A09 != null) {
                i5 = ((Integer) A09.first).intValue();
                if (drmInitData2 != null) {
                    Object obj = A09.second;
                    String[] strArr = A01;
                    String str2 = strArr[1];
                    String str3 = strArr[7];
                    int sampleRate = str2.charAt(19);
                    if (sampleRate == str3.charAt(19)) {
                        String[] strArr2 = A01;
                        strArr2[3] = "pOqul1QRpDZUg5bU2yQQaQp61y123VtO";
                        strArr2[3] = "pOqul1QRpDZUg5bU2yQQaQp61y123VtO";
                        drmInitData2 = drmInitData2.A03(((D7) obj).A02);
                    }
                    throw new RuntimeException();
                }
                drmInitData2 = null;
                c0584Co.A03[i4] = (D7) A09.second;
            }
            iq.A0Z(atomType);
        }
        String str4 = null;
        if (i5 == AbstractC0581Cl.A04) {
            str4 = A0I(426, 9, 31);
        } else {
            int sampleRate2 = AbstractC0581Cl.A0M;
            if (i5 == sampleRate2) {
                str4 = A0I(457, 10, 8);
            } else {
                int sampleRate3 = AbstractC0581Cl.A0I;
                if (i5 == sampleRate3) {
                    str4 = A0I(501, 13, 63);
                } else {
                    int sampleRate4 = AbstractC0581Cl.A0K;
                    if (i5 != sampleRate4) {
                        int sampleRate5 = AbstractC0581Cl.A0L;
                        if (i5 != sampleRate5) {
                            int sampleRate6 = AbstractC0581Cl.A0J;
                            if (i5 == sampleRate6) {
                                str4 = A0I(530, 28, 10);
                            } else {
                                int sampleRate7 = AbstractC0581Cl.A0v;
                                if (i5 == sampleRate7) {
                                    str4 = A0I(aa.c.q, 10, 25);
                                } else {
                                    int sampleRate8 = AbstractC0581Cl.A0w;
                                    if (i5 == sampleRate8) {
                                        str4 = A0I(445, 12, 124);
                                    } else {
                                        int sampleRate9 = AbstractC0581Cl.A0a;
                                        if (i5 != sampleRate9) {
                                            int sampleRate10 = AbstractC0581Cl.A14;
                                            if (i5 != sampleRate10) {
                                                int sampleRate11 = AbstractC0581Cl.A03;
                                                if (i5 == sampleRate11) {
                                                    str4 = A0I(482, 10, 92);
                                                } else {
                                                    int sampleRate12 = AbstractC0581Cl.A05;
                                                    if (i5 == sampleRate12) {
                                                        str4 = A0I(435, 10, 88);
                                                    }
                                                }
                                            }
                                        }
                                        str4 = A0I(492, 9, 89);
                                    }
                                }
                            }
                        }
                    }
                    str4 = A0I(IronSourceConstants.INIT_COMPLETE, 16, 70);
                }
            }
        }
        byte[] bArr = null;
        while (atomType - i2 < i3) {
            iq.A0Z(atomType);
            int A092 = iq.A09();
            I1.A05(A092 > 0, A0I(574, 32, 45));
            int A093 = iq.A09();
            if (A093 == AbstractC0581Cl.A0S || (z && A093 == AbstractC0581Cl.A1V)) {
                int A032 = A093 == AbstractC0581Cl.A0S ? atomType : A03(iq, atomType, A092);
                if (A032 != -1) {
                    Pair<String, byte[]> A072 = A07(iq, A032);
                    str4 = (String) A072.first;
                    bArr = (byte[]) A072.second;
                    if (A0I(467, 15, 48).equals(str4)) {
                        Pair<Integer, Integer> A033 = I5.A03(bArr);
                        childPosition = ((Integer) A033.first).intValue();
                        childAtomType = ((Integer) A033.second).intValue();
                    }
                }
            } else if (A093 == AbstractC0581Cl.A0E) {
                int i7 = atomType + 8;
                if (A01[3].charAt(8) != 'p') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A01;
                strArr3[0] = "HYOwJoQ2L6umAwimTza29CMlFS3ISf2h";
                strArr3[5] = "FglgDO1LYQ1bVlWfctdCtrgF4dzfBOT4";
                iq.A0Z(i7);
                c0584Co.A02 = C0545As.A07(iq, Integer.toString(channelCount), str, drmInitData2);
            } else if (A093 == AbstractC0581Cl.A0H) {
                iq.A0Z(atomType + 8);
                c0584Co.A02 = C0545As.A08(iq, Integer.toString(channelCount), str, drmInitData2);
            } else if (A093 == AbstractC0581Cl.A0G) {
                c0584Co.A02 = Format.A07(Integer.toString(channelCount), str4, null, -1, -1, childAtomType, childPosition, null, drmInitData2, 0, str);
            } else if (A093 == AbstractC0581Cl.A05) {
                bArr = new byte[A092];
                iq.A0Z(atomType);
                iq.A0d(bArr, 0, A092);
            }
            atomType += A092;
        }
        if (c0584Co.A02 != null || str4 == null) {
            return;
        }
        int i8 = A0I(492, 9, 89).equals(str4) ? 2 : -1;
        String mimeType = Integer.toString(channelCount);
        c0584Co.A02 = Format.A06(mimeType, str4, null, -1, -1, childAtomType, childPosition, i8, bArr != null ? Collections.singletonList(bArr) : null, drmInitData2, 0, str);
    }

    public static boolean A0O(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length - 1;
        int latestDelayIndex = C0726Ig.A06(3, 0, length);
        return jArr[0] <= j2 && j2 < jArr[latestDelayIndex] && jArr[C0726Ig.A06(jArr.length - 3, 0, length)] < j3 && j3 <= j;
    }

    public static byte[] A0P(IQ iq, int i, int i2) {
        int i3 = i + 8;
        while (i3 - i < i2) {
            iq.A0Z(i3);
            int A09 = iq.A09();
            if (iq.A09() == AbstractC0581Cl.A0q) {
                return Arrays.copyOfRange(iq.A00, i3, i3 + A09);
            }
            i3 += A09;
        }
        return null;
    }
}
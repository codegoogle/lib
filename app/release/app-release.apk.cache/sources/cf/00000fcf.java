package com.facebook.ads.redexgen.X;

import com.anythink.expressad.foundation.g.a;
import com.anythink.expressad.foundation.h.l;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.As  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0545As {
    public static byte[] A00;
    public static String[] A01;
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A00 = new byte[]{-12, 8, -9, -4, 2, -62, -12, -10, -58, -90, -70, -87, -82, -76, 116, -86, -90, -88, 120, -76, -56, -73, -68, -62, -126, -72, -76, -74, -122, g15.b, -67, -62, -74};
    }

    public static void A0C() {
        A01 = new String[]{"VvJRVU69OBzslE4p0Zfahzrb3nPsCKe", "zB", "Dc8Zie1A4h", "IkzAL6jiMaNeqHCHyOgeN31JBtAuXgmh", "IvEhEJvdlav", "U0ZY", "AtQ7wNEb", "nSd2surlWGidCnNOvkjufSfipgX2"};
    }

    static {
        A0C();
        A0B();
        A03 = new int[]{1, 2, 3, 6};
        A05 = new int[]{48000, 44100, 32000};
        A06 = new int[]{24000, 22050, 16000};
        A04 = new int[]{2, 1, 2, 3, 3, 4, 4, 5};
        A02 = new int[]{32, 40, 48, 56, 64, 80, 96, 112, 128, 160, yg1.K, 224, 256, 320, 384, l.a.a, 512, 576, 640};
        A07 = new int[]{69, 87, 104, 121, WKSRecord.Service.NETBIOS_SSN, 174, 208, WKSRecord.Service.SUR_MEAS, a.aS, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    }

    public static int A00() {
        return 1536;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r3 == 32000) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r4 * 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
        if (r3 == 8056) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        r3 = r4 * 4;
        r2 = com.facebook.ads.redexgen.X.C0545As.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
        if (r2[5].length() == r2[0].length()) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0088, code lost:
        r2 = com.facebook.ads.redexgen.X.C0545As.A01;
        r2[1] = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI";
        r2[1] = "Nn7BAMihkF3vkcKtO99yZwIrAOOwI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0094, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A01(int halfFrmsizecod, int sampleRate) {
        int i = sampleRate / 2;
        if (halfFrmsizecod < 0) {
            return -1;
        }
        int[] iArr = A05;
        if (halfFrmsizecod >= iArr.length || sampleRate < 0) {
            return -1;
        }
        int[] iArr2 = A07;
        if (i >= iArr2.length) {
            return -1;
        }
        int i2 = iArr[halfFrmsizecod];
        if (i2 == 44100) {
            int i3 = iArr2[i];
            if (A01[1].length() != 15) {
                String[] strArr = A01;
                strArr[3] = "4eRsFOebWHxxrQNWOVJDeIaBrSAlnNpc";
                strArr[3] = "4eRsFOebWHxxrQNWOVJDeIaBrSAlnNpc";
                return (i3 + (sampleRate % 2)) * 2;
            }
            throw new RuntimeException();
        }
        int bitrate = A02[i];
        if (A01[6].length() != 2) {
            String[] strArr2 = A01;
            strArr2[3] = "WxhxKdWnRRsy4vVQ2SEOPzEThBAjhQcp";
            strArr2[3] = "WxhxKdWnRRsy4vVQ2SEOPzEThBAjhQcp";
        } else {
            String[] strArr3 = A01;
            strArr3[5] = "awXe";
            strArr3[0] = "jT30HYGFGhYnOVyWil5hlLZLvnTO5rb";
        }
    }

    public static int A02(ByteBuffer byteBuffer) {
        int endIndex = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = endIndex; i <= limit; i++) {
            int i2 = i + 4;
            if ((byteBuffer.getInt(i2) & (-16777217)) == -1167101192) {
                return i - endIndex;
            }
        }
        return -1;
    }

    public static int A03(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? A03[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static int A04(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int A05(byte[] bArr) {
        if (bArr.length >= 5) {
            int fscod = (bArr[4] & 192) >> 6;
            return A01(fscod, bArr[4] & ax5.a);
        } else if (A01[7].length() != 0) {
            String[] strArr = A01;
            strArr[6] = "NuFbE2RcGiFtx9wQ";
            strArr[6] = "NuFbE2RcGiFtx9wQ";
            return -1;
        } else {
            throw new RuntimeException();
        }
    }

    public static int A06(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            return 40 << ((bArr[(bArr[7] & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
        }
        return 0;
    }

    public static Format A07(IQ iq, String str, String str2, DrmInitData drmInitData) {
        int i = A05[(iq.A0F() & yg1.K) >> 6];
        int A0F = iq.A0F();
        int nextByte = A04[(A0F & 56) >> 3];
        if ((A0F & 4) != 0) {
            nextByte++;
        }
        return Format.A07(str, A0A(0, 9, 127), null, -1, -1, nextByte, i, null, drmInitData, 0, str2);
    }

    public static Format A08(IQ iq, String str, String str2, DrmInitData drmInitData) {
        iq.A0a(2);
        int i = A05[(iq.A0F() & yg1.K) >> 6];
        int A0F = iq.A0F();
        int channelCount = A04[(A0F & 14) >> 1];
        if ((A0F & 1) != 0) {
            channelCount++;
        }
        int numDepSub = (iq.A0F() & 30) >> 1;
        if (numDepSub > 0) {
            int numDepSub2 = iq.A0F();
            if ((numDepSub2 & 2) != 0) {
                channelCount += 2;
            }
        }
        String A0A = A0A(9, 10, 49);
        if (iq.A05() > 0 && (iq.A0F() & 1) != 0) {
            A0A = A0A(19, 14, 63);
        }
        return Format.A07(str, A0A, null, -1, -1, channelCount, i, null, drmInitData, 0, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x02e1, code lost:
        if (r12 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (r12 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
        r19.A09(16);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0544Ar A09(IP ip) {
        String A0A;
        int A012;
        int frmsizecod;
        int i;
        int fscod;
        int i2;
        int audioBlocks;
        int i3;
        int frameSize;
        int i4;
        int frameSize2;
        int frameSize3;
        int streamType;
        int A042 = ip.A04();
        ip.A09(40);
        boolean isEac3 = ip.A05(5) == 16;
        ip.A08(A042);
        int sampleCount = -1;
        if (isEac3) {
            ip.A09(16);
            int A052 = ip.A05(2);
            if (A052 == 0) {
                sampleCount = 0;
            } else if (A052 == 1) {
                sampleCount = 1;
            } else if (A052 != 2) {
                sampleCount = -1;
            } else {
                sampleCount = 2;
            }
            ip.A09(3);
            int A053 = ip.A05(11);
            if (A01[3].charAt(26) == 'A') {
                String[] strArr = A01;
                strArr[2] = "nYvxoGSXka";
                strArr[4] = "yvpQIyAipxA";
                A012 = (A053 + 1) * 2;
                int A054 = ip.A05(2);
                if (A054 == 3) {
                    audioBlocks = 3;
                    int[] iArr = A06;
                    int numblkscod = ip.A05(2);
                    i = iArr[numblkscod];
                    i3 = 6;
                } else {
                    audioBlocks = ip.A05(2);
                    i3 = A03[audioBlocks];
                    i = A05[A054];
                }
                fscod = i3 * 256;
                int A055 = ip.A05(3);
                boolean A0G = ip.A0G();
                i2 = A04[A055] + (A0G ? 1 : 0);
                ip.A09(10);
                if (ip.A0G()) {
                    ip.A09(8);
                }
                if (A055 == 0) {
                    ip.A09(5);
                    if (ip.A0G()) {
                        ip.A09(8);
                    }
                }
                if (sampleCount == 1) {
                    boolean A0G2 = ip.A0G();
                    int frameSize4 = A01[3].charAt(26);
                    if (frameSize4 == 65) {
                        String[] strArr2 = A01;
                        strArr2[6] = "l";
                        strArr2[6] = "l";
                    }
                }
                if (ip.A0G()) {
                    if (A055 > 2) {
                        ip.A09(2);
                    }
                    int channelCount = A055 & 1;
                    if (channelCount != 0 && A055 > 2) {
                        frameSize3 = 6;
                        ip.A09(6);
                    } else {
                        frameSize3 = 6;
                    }
                    int channelCount2 = A055 & 4;
                    if (channelCount2 != 0) {
                        ip.A09(frameSize3);
                    }
                    if (A0G && ip.A0G()) {
                        ip.A09(5);
                    }
                    if (sampleCount == 0) {
                        if (ip.A0G()) {
                            streamType = 6;
                            int frameSize5 = A01[1].length();
                            if (frameSize5 != 15) {
                                String[] strArr3 = A01;
                                strArr3[7] = "ve2Jf";
                                strArr3[7] = "ve2Jf";
                                ip.A09(6);
                            } else {
                                String[] strArr4 = A01;
                                strArr4[6] = "";
                                strArr4[6] = "";
                                ip.A09(6);
                            }
                        } else {
                            streamType = 6;
                        }
                        if (A055 == 0 && ip.A0G()) {
                            ip.A09(streamType);
                        }
                        if (ip.A0G()) {
                            ip.A09(streamType);
                        }
                        int frameSize6 = ip.A05(2);
                        if (frameSize6 == 1) {
                            ip.A09(5);
                        } else if (frameSize6 == 2) {
                            ip.A09(12);
                        } else if (frameSize6 == 3) {
                            int A056 = ip.A05(5);
                            if (ip.A0G()) {
                                ip.A09(5);
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                if (ip.A0G()) {
                                    ip.A09(4);
                                }
                                boolean A0G3 = ip.A0G();
                                int addbsil = A01[7].length();
                                if (addbsil != 0) {
                                    String[] strArr5 = A01;
                                    strArr5[1] = "zgnQVzP5aNwi5fgJToqJ2WlRJYkqoOwp";
                                    strArr5[1] = "zgnQVzP5aNwi5fgJToqJ2WlRJYkqoOwp";
                                    if (A0G3) {
                                        ip.A09(4);
                                    }
                                    if (ip.A0G()) {
                                        if (ip.A0G()) {
                                            ip.A09(4);
                                        }
                                        if (ip.A0G()) {
                                            ip.A09(4);
                                        }
                                    }
                                }
                            }
                            if (ip.A0G()) {
                                ip.A09(5);
                                if (ip.A0G()) {
                                    ip.A09(7);
                                    if (ip.A0G()) {
                                        int addbsil2 = A01[6].length();
                                        if (addbsil2 != 2) {
                                            String[] strArr6 = A01;
                                            strArr6[1] = "Ku";
                                            strArr6[1] = "Ku";
                                            ip.A09(8);
                                        } else {
                                            String[] strArr7 = A01;
                                            strArr7[2] = "VFfeA03f8Z";
                                            strArr7[4] = "cNqgWMIWwGc";
                                            ip.A09(8);
                                        }
                                    }
                                }
                            }
                            ip.A09((A056 + 2) * 8);
                            ip.A06();
                        }
                        if (A055 < 2) {
                            if (ip.A0G()) {
                                ip.A09(14);
                            }
                            if (A055 == 0 && ip.A0G()) {
                                ip.A09(14);
                            }
                        }
                        if (ip.A0G()) {
                            if (audioBlocks == 0) {
                                ip.A09(5);
                            } else {
                                for (int addbsil3 = 0; addbsil3 < i3; addbsil3++) {
                                    if (ip.A0G()) {
                                        ip.A09(5);
                                    }
                                }
                            }
                        }
                    }
                }
                if (ip.A0G()) {
                    ip.A09(5);
                    int frameSize7 = A01[1].length();
                    if (frameSize7 == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr8 = A01;
                    strArr8[7] = "hzuEXRscjXqDwpEtdx4S0pX8oo2BN7E1";
                    strArr8[7] = "hzuEXRscjXqDwpEtdx4S0pX8oo2BN7E1";
                    if (A055 == 2) {
                        ip.A09(4);
                    }
                    if (A055 >= 6) {
                        ip.A09(2);
                    }
                    if (ip.A0G()) {
                        frameSize2 = 8;
                        ip.A09(8);
                    } else {
                        frameSize2 = 8;
                    }
                    if (A055 == 0 && ip.A0G()) {
                        ip.A09(frameSize2);
                    }
                    frameSize = 3;
                    if (A054 < 3) {
                        ip.A07();
                    }
                } else {
                    frameSize = 3;
                }
                if (sampleCount == 0 && audioBlocks != frameSize) {
                    ip.A07();
                }
                if (sampleCount == 2) {
                    if (audioBlocks == frameSize || ip.A0G()) {
                        i4 = 6;
                        ip.A09(6);
                    } else {
                        i4 = 6;
                    }
                } else {
                    i4 = 6;
                }
                A0A = A0A(9, 10, 49);
                if (ip.A0G() && ip.A05(i4) == 1 && ip.A05(8) == 1) {
                    A0A = A0A(19, 14, 63);
                }
                return new C0544Ar(A0A, sampleCount, i2, i, A012, fscod);
            }
            throw new RuntimeException();
        }
        A0A = A0A(0, 9, 127);
        ip.A09(32);
        int A057 = ip.A05(2);
        int fscod2 = ip.A05(6);
        A012 = A01(A057, fscod2);
        ip.A09(8);
        int A058 = ip.A05(3);
        int fscod3 = A058 & 1;
        if (fscod3 != 0 && A058 != 1) {
            frmsizecod = 2;
            ip.A09(2);
        } else {
            frmsizecod = 2;
        }
        int fscod4 = A058 & 4;
        if (fscod4 != 0) {
            ip.A09(frmsizecod);
        }
        if (A058 == frmsizecod) {
            ip.A09(frmsizecod);
        }
        i = A05[A057];
        fscod = 1536;
        boolean A0G4 = ip.A0G();
        int[] iArr2 = A04;
        int frmsizecod2 = A01[7].length();
        if (frmsizecod2 != 0) {
            String[] strArr9 = A01;
            strArr9[7] = "JI";
            strArr9[7] = "JI";
            i2 = iArr2[A058] + (A0G4 ? 1 : 0);
            return new C0544Ar(A0A, sampleCount, i2, i, A012, fscod);
        }
        throw new RuntimeException();
    }
}
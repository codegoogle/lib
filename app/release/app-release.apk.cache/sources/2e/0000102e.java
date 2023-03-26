package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.facebook.ads.internal.exoplayer2.video.ColorInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Cg */
/* loaded from: assets/audience_network.dex */
public final class C0576Cg {
    public static byte[] A0h;
    public static String[] A0i;
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public long A0S;
    public long A0T;
    public DrmInitData A0U;
    public CV A0V;
    public CW A0W;
    @Nullable
    public C0577Ch A0X;
    public String A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0d;
    public byte[] A0e;
    public byte[] A0f;
    public String A0g;

    static {
        A05();
        A04();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0h, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0i;
            if (strArr[2].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0i;
            strArr2[3] = "YyA2yq7rE";
            strArr2[1] = "s5NQwzdwS";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
            i4++;
        }
    }

    public static void A04() {
        A0h = new byte[]{102, 88, -117, -99, -84, -84, -95, -90, -97, 88, -91, -95, -91, -99, -116, -79, -88, -99, 88, -84, -89, 88, -89, -59, -89, -89, -87, -57, -27, -57, -55, -71, -24, 6, -21, -5, -6, 118, -108, 121, -119, -120, 100, 122, -115, -123, -121, 122, -120, -120, -104, -74, -101, -85, -86, -122, -93, -90, -86, -86, -93, -100, -86, -86, -119, -89, -115, -119, -117, 123, -55, -25, -50, -44, -55, -53, -88, -58, -76, -73, -84, -82, -106, -77, -103, -120, -90, -108, -105, -116, -114, 118, -109, 122, -96, -66, -84, -78, -114, -96, -94, -84, -67, -37, -53, -52, -47, -49, -86, -56, -71, -84, -74, -104, -78, -73, -67, -104, -75, -78, -67, -88, -58, -69, -71, -68, -84, -81, -85, -42, -12, -21, -28, -25, -41, -34, -24, -84, bx.l7, bx.l7, -42, bx.l7, -121, -41, -56, bx.l7, -38, -48, -43, -50, -121, -83, -42, -36, bx.l7, -86, -86, -121, -41, bx.l7, -48, -35, -56, -37, -52, -121, -53, -56, -37, -56, -124, -79, -79, -82, -79, 95, -81, -96, -79, -78, -88, -83, -90, 95, -116, -110, 110, g15.b, -126, -116, 95, -94, -82, -93, -92, -94, 95, -81, -79, -88, -75, -96, -77, -92, -12, 33, 33, 30, 33, -49, 31, 16, 33, 34, 24, 29, 22, -49, 37, 30, 33, 17, 24, 34, -49, 18, 30, 19, 20, 18, -49, 31, 33, 24, 37, 16, 35, 20, -27, 0, 8, Flags.CD, 4, 3, -65, 19, 14, -65, 5, 8, 13, 3, -65, -27, 14, 20, 17, -30, -30, -65, -11, -30, -48, -65, 8, 13, 8, 19, 8, 0, Flags.CD, 8, 25, 0, 19, 8, 14, 13, -65, 3, 0, 19, 0, -73, -53, -34, -36, bx.l7, -35, -43, -53, -81, -30, -34, -36, -53, -51, -34, bx.l7, -36, -71, -38, bx.l7, -104, -69, -82, -72, -117, -72, -66, -102, -84, -82, -72, -117, -44, -34, -117, -32, bx.l7, -34, -32, -37, -37, -38, -35, -33, -48, -49, -103, -117, -66, -48, -33, -33, -44, bx.l7, -46, -117, -40, -44, -40, -48, -65, -28, -37, -48, -117, -33, -38, -117, -89, -77, -104, -86, -106, -89, -87, -106, -27, -15, -38, -42, -33, -24, -63, -30, bx.l7, -27, -29, -17, -28, -43, -24, -28, -65, -47, -29, -29, -121, -109, -120, 121, -116, -120, 99, -119, -120, 122, 108, -61, -49, -58, -65, -78, -61, -59, -78, bx.l7, -14, -23, -4, -12, -23, -25, -8, -23, -24, -92, -47, -51, -47, -55, -92, -8, -3, -12, -23, -78, 3, 28, 25, 28, 29, 37, 28, -50, -12, 29, 35, 32, -15, -15, -36, -50, 1, 19, 34, 34, 23, 28, 21, -50, 27, 23, 27, 19, 2, 39, 30, 19, -50, 34, 29, -50, 36, 23, 18, 19, 29, -35, 38, -37, 35, 28, 25, 28, 29, 37, 28, -79, -54, -50, -63, -65, -53, -61, -54, -59, -42, -63, -64, 124, -65, -53, -64, -63, -65, 124, -59, -64, -63, -54, -48, -59, -62, -59, -63, -50, -118, -58, -33, -28, -26, bx.j7, bx.j7, -32, -29, -27, -42, -43, -111, -63, -76, -66, -111, -45, -38, -27, -111, -43, -42, bx.j7, -27, bx.l7, -85, -111, -98, -89, -107, -104, -115, -113, 122, -32, -23, -41, -38, -49, -47, -66, -71, -45, -35, bx.l7, -71, -53, -38, -85, -76, -94, -91, -102, -100, -119, -124, -98, -88, -92, -124, -106, -88, -91, -110, -101, -119, -116, -127, -125, 112, 107, -123, -113, -117, 107, 125, -110, g15.c, -40, bx.j7, -49, -46, -57, -55, -74, -79, -53, -43, -47, -79, -43, -46, -72, -63, -81, -78, -89, -87, -86, -111, -85, -75, -79, -111, -86, -89, -72, -91, -50, -41, -59, -53, -89, -50, -66, -49, -89, -66, -57, -51, -54, -69, -69, -51, -42, -53, -65, -68, -58, -55, -72, -120, -111, -120, -126, 106, -59, -50, -59, -65, -88, -104, -89, -89, -93, -96, -102, -104, -85, -96, -90, -91, 102, -101, -83, -103, -86, -84, -103, -86, -84, -69, -69, -73, -76, -82, -84, -65, -76, -70, -71, 122, -69, -78, -66, -80, -65, -65, -69, -72, -78, -80, -61, -72, -66, -67, 126, -59, -66, -79, -62, -60, -79, -69, -54, -54, -58, -61, -67, -69, -50, -61, -55, -56, -119, -46, -121, -51, -49, -68, -52, -61, -54, -51, bx.j7, -48, -43, -37, -101, -51, -49, -97, -94, -74, -91, -86, -80, 112, -90, -94, -92, 116, -76, -56, -73, -68, -62, -126, -71, -65, -76, -74, -55, -35, -52, -47, -41, -105, -43, -40, -100, -55, -107, -44, -55, -36, -43, -67, -47, -64, -59, -53, -117, -55, -52, -63, -61, -88, -68, -85, -80, -74, 118, -76, -73, -84, -82, 116, -109, 121, -51, bx.j7, -48, -43, -37, -101, -37, -36, bx.j7, -33, -20, 0, -17, -12, -6, -70, -3, -20, 2, -4, 16, -1, 4, 10, -54, 15, 13, 16, 0, -56, 3, -1, -32, -12, -29, -24, -18, -82, -11, -19, -29, -83, -29, -13, -14, -52, -32, -49, -44, -38, -102, bx.j7, bx.l7, -49, -103, -49, -33, -34, -103, -45, -49, -97, -77, -94, -89, -83, 109, -76, -83, -80, -96, -89, -79, -86, -66, -83, -78, -72, 120, -63, 118, -66, -73, -76, -73, -72, -64, -73, -26, -17, -24, -12, -27, -8, -12, -81, -8, -83, -13, -13, bx.j7, 8, -5, -10, -9, 1, -63, -59, -7, 2, 2, 30, 17, 12, 13, 23, -41, 9, 30, Flags.CD, -17, -30, -35, -34, -24, -88, bx.j7, -34, -17, -36, -61, -74, -79, -78, -68, 124, -70, -67, -127, -61, 122, -78, -64, -44, -57, -62, -61, -51, -115, -53, -50, -61, -59, -112, 19, 6, 1, 2, 12, -52, 20, 19, 0, -50, -79, -92, -97, -96, -86, 106, -77, 104, -80, -87, -90, -87, -86, -78, -87, 7, -6, -11, -10, 0, -64, 9, -66, 7, -1, -11, -65, 0, -1, -61, -65, 7, 1, -55, 6, -7, -12, -11, -1, -65, 8, -67, 6, -2, -12, -66, -1, -2, -62, -66, 6, 0, -55};
    }

    public static void A05() {
        A0i = new String[]{"8TpqgOaNUSLeAK", "gH4cNYX0T", "RxL", "kj1UdyKUA", "aiTHi296we72LwNhd9xiUHTfsQD7UP14", "nYCZaclp", "WtVme8bpEWm7CPp05BwAvQTPTn4MSMoI", "2CEJS7GQKAShoAR5BcckvYDLq4kjdsx3"};
    }

    public C0576Cg() {
        this.A0R = -1;
        this.A0J = -1;
        this.A0I = -1;
        this.A0G = -1;
        this.A0H = 0;
        this.A0e = null;
        this.A0P = -1;
        this.A0b = false;
        this.A0D = -1;
        this.A0E = -1;
        this.A0C = -1;
        this.A0K = 1000;
        this.A0L = 200;
        this.A06 = -1.0f;
        this.A07 = -1.0f;
        this.A04 = -1.0f;
        this.A05 = -1.0f;
        this.A02 = -1.0f;
        this.A03 = -1.0f;
        this.A08 = -1.0f;
        this.A09 = -1.0f;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0B = 1;
        this.A0A = -1;
        this.A0O = 8000;
        this.A0S = 0L;
        this.A0T = 0L;
        this.A0Z = true;
        this.A0g = A01(868, 3, 79);
    }

    public /* synthetic */ C0576Cg(YR yr) {
        this();
    }

    public static Pair<String, List<byte[]>> A00(IQ iq) throws AN {
        try {
            iq.A0a(16);
            long A0L = iq.A0L();
            if (A0L == 1482049860) {
                return new Pair<>(A01(881, 10, 96), null);
            }
            if (A0L == 826496599) {
                byte[] bArr = iq.A00;
                for (int A07 = iq.A07() + 20; A07 < bArr.length - 4; A07++) {
                    if (bArr[A07] == 0 && bArr[A07 + 1] == 0) {
                        int offset = bArr[A07 + 2];
                        if (offset == 1) {
                            int offset2 = bArr[A07 + 3];
                            if (offset2 == 15) {
                                return new Pair<>(A01(934, 10, 107), Collections.singletonList(Arrays.copyOfRange(bArr, A07, bArr.length)));
                            }
                        } else {
                            continue;
                        }
                    }
                }
                throw new AN(A01(238, 45, 109));
            }
            Log.w(A01(283, 17, 56), A01(419, 51, 124));
            return new Pair<>(A01(944, 15, 9), null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new AN(A01(WKSRecord.Service.NETBIOS_NS, 33, 53));
        }
    }

    public static /* synthetic */ String A02(C0576Cg c0576Cg, String str) {
        c0576Cg.A0g = str;
        return str;
    }

    public static List<byte[]> A03(byte[] bArr) throws AN {
        String A01 = A01(204, 34, 125);
        try {
            if (bArr[0] == 2) {
                int i = 1;
                int i2 = 0;
                while (bArr[i] == -1) {
                    i2 += 255;
                    i++;
                }
                int vorbisSkipLength = i + 1;
                int i3 = i2 + bArr[i];
                int i4 = 0;
                while (bArr[vorbisSkipLength] == -1) {
                    i4 += 255;
                    vorbisSkipLength++;
                }
                int i5 = vorbisSkipLength + 1;
                int offset = bArr[vorbisSkipLength];
                int i6 = i4 + offset;
                int vorbisSkipLength2 = bArr[i5];
                if (vorbisSkipLength2 == 1) {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(bArr, i5, bArr2, 0, i3);
                    int i7 = i5 + i3;
                    int vorbisSkipLength3 = bArr[i7];
                    if (vorbisSkipLength3 == 3) {
                        int i8 = i7 + i6;
                        int vorbisSkipLength4 = bArr[i8];
                        if (vorbisSkipLength4 == 5) {
                            int offset2 = bArr.length;
                            byte[] bArr3 = new byte[offset2 - i8];
                            int offset3 = bArr.length;
                            System.arraycopy(bArr, i8, bArr3, 0, offset3 - i8);
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(bArr2);
                            arrayList.add(bArr3);
                            return arrayList;
                        }
                        throw new AN(A01);
                    }
                    throw new AN(A01);
                }
                throw new AN(A01);
            }
            throw new AN(A01);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new AN(A01);
        }
    }

    public static boolean A06(IQ iq) throws AN {
        UUID uuid;
        UUID uuid2;
        try {
            int A0D = iq.A0D();
            if (A0D == 1) {
                return true;
            }
            if (A0D == 65534) {
                iq.A0Z(24);
                long A0M = iq.A0M();
                uuid = YT.A0s;
                if (A0M == uuid.getMostSignificantBits()) {
                    long A0M2 = iq.A0M();
                    uuid2 = YT.A0s;
                    if (A0M2 == uuid2.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new AN(A01(170, 34, 13));
        }
    }

    private byte[] A07() {
        if (this.A06 == -1.0f || this.A07 == -1.0f) {
            return null;
        }
        int i = (this.A04 > (-1.0f) ? 1 : (this.A04 == (-1.0f) ? 0 : -1));
        String[] strArr = A0i;
        if (strArr[0].length() != strArr[5].length()) {
            String[] strArr2 = A0i;
            strArr2[2] = "mbc";
            strArr2[4] = "GijrUN633WOPM1ihGB7sVJQ0vA2mo6CS";
            if (i == 0 || this.A05 == -1.0f || this.A02 == -1.0f || this.A03 == -1.0f || this.A08 == -1.0f || this.A09 == -1.0f || this.A00 == -1.0f || this.A01 == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            wrap.put((byte) 0);
            wrap.putShort((short) ((this.A06 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A07 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A04 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A05 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A02 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A03 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A08 * 50000.0f) + 0.5f));
            wrap.putShort((short) ((this.A09 * 50000.0f) + 0.5f));
            wrap.putShort((short) (this.A00 + 0.5f));
            wrap.putShort((short) (this.A01 + 0.5f));
            wrap.putShort((short) this.A0K);
            wrap.putShort((short) this.A0L);
            return bArr;
        }
        throw new RuntimeException();
    }

    public final void A08() {
        C0577Ch c0577Ch = this.A0X;
        if (c0577Ch != null) {
            c0577Ch.A02(this);
        }
    }

    public final void A09() {
        C0577Ch c0577Ch = this.A0X;
        if (c0577Ch != null) {
            c0577Ch.A00();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:292:0x03ec, code lost:
        if (A01(693, 20, 14).equals(r1) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x03ee, code lost:
        r4 = 3;
        r2 = com.facebook.ads.internal.exoplayer2.Format.A01(java.lang.Integer.toString(r29), r1, r3, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0413, code lost:
        if (A01(693, 20, 40).equals(r1) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0424, code lost:
        if (A01(871, 10, 78).equals(r1) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0426, code lost:
        r4 = 3;
        r7 = new java.util.ArrayList(2);
        r2 = com.facebook.ads.redexgen.X.YT.A0t;
        r7.add(r2);
        r7.add(r27.A0d);
        r2 = com.facebook.ads.internal.exoplayer2.Format.A09(java.lang.Integer.toString(r29), r1, null, -1, r3, r27.A0g, -1, r27.A0U, Long.MAX_VALUE, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0462, code lost:
        if (A01(675, 18, 29).equals(r1) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0464, code lost:
        r7 = A01(660, 15, 25).equals(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x047f, code lost:
        if (com.facebook.ads.redexgen.X.C0576Cg.A0i[6].charAt(13) == 'P') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0486, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0487, code lost:
        r6 = com.facebook.ads.redexgen.X.C0576Cg.A0i;
        r6[2] = "mzu";
        r6[4] = "qu0J2ADkyWaVBa9kD7o9Qirh7WEjYJw0";
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0493, code lost:
        if (r7 != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x04a2, code lost:
        if (A01(641, 19, 5).equals(r1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x04a4, code lost:
        r4 = 3;
        r8 = java.lang.Integer.toString(r29);
        r7 = com.facebook.ads.redexgen.X.C0576Cg.A0i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x04ba, code lost:
        if (r7[0].length() == r7[5].length()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x04bc, code lost:
        r7 = com.facebook.ads.redexgen.X.C0576Cg.A0i;
        r7[0] = "GDRTIaIlzs7O11";
        r7[5] = "6URnVLVv";
        r2 = com.facebook.ads.internal.exoplayer2.Format.A0A(r8, r1, null, -1, r3, r2, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x04d8, code lost:
        r7 = com.facebook.ads.redexgen.X.C0576Cg.A0i;
        r7[6] = "fbrpEOPCxs8P1PkqPKxhpgVrBLZobrss";
        r7[6] = "fbrpEOPCxs8P1PkqPKxhpgVrBLZobrss";
        r2 = com.facebook.ads.internal.exoplayer2.Format.A0A(r8, r1, null, -1, r3, r2, r27.A0g, r27.A0U);
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x062a, code lost:
        if (r9.equals(A01(50, 14, 32)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x062c, code lost:
        r12 = 20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0646, code lost:
        if (r9.equals(A01(50, 14, 37)) != false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x07a9, code lost:
        throw new com.facebook.ads.redexgen.X.AN(A01(398, 21, 82));
     */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0A(CM cm, int pcmEncoding) throws AN {
        char c;
        String A01;
        int i;
        Format A0A;
        int i2;
        int i3 = -1;
        int selectionFlags = -1;
        List list = null;
        String str = this.A0Y;
        switch (str.hashCode()) {
            case -2095576542:
                if (str.equals(A01(534, 14, 88))) {
                    c = 5;
                    String A012 = A01(0, 22, 6);
                    String A013 = A01(500, 27, 63);
                    String A014 = A01(283, 17, 56);
                    switch (c) {
                        case 0:
                            A01 = A01(959, 19, 95);
                            int maxInputSize = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2 = maxInputSize | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                                i = 1;
                                A0A = Format.A06(Integer.toString(pcmEncoding), A01, null, -1, i3, this.A0B, this.A0O, selectionFlags, list, this.A0U, maxInputSize2, this.A0g);
                            } else if (!IJ.A0C(A01)) {
                                if (A0i[7].charAt(13) == 'A') {
                                    String[] strArr = A0i;
                                    strArr[7] = "57HIDLfbVfr3RAVSTJxvpSr8EFB1Sod9";
                                    strArr[7] = "57HIDLfbVfr3RAVSTJxvpSr8EFB1Sod9";
                                    break;
                                } else {
                                    String[] strArr2 = A0i;
                                    strArr2[6] = "cpJdQ1tjb5iUJPxlwlGhNzwwaQ44UAbQ";
                                    strArr2[6] = "cpJdQ1tjb5iUJPxlwlGhNzwwaQ44UAbQ";
                                    break;
                                }
                            } else {
                                i = 2;
                                int maxInputSize3 = this.A0H;
                                if (maxInputSize3 == 0) {
                                    int i4 = this.A0I;
                                    if (A0i[7].charAt(13) != 'A') {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr3 = A0i;
                                    strArr3[2] = "871";
                                    strArr3[4] = "zi0KH06te24gHksPurb3c9l7QBoJ0HIJ";
                                    if (i4 == -1) {
                                        i4 = this.A0R;
                                    }
                                    this.A0I = i4;
                                    int maxInputSize4 = this.A0G;
                                    if (maxInputSize4 == -1) {
                                        maxInputSize4 = this.A0J;
                                    }
                                    this.A0G = maxInputSize4;
                                }
                                float pixelWidthHeightRatio = -1.0f;
                                int i5 = this.A0I;
                                if (i5 != -1 && (i2 = this.A0G) != -1) {
                                    int maxInputSize5 = this.A0J;
                                    float pixelWidthHeightRatio2 = maxInputSize5 * i5;
                                    int maxInputSize6 = this.A0R;
                                    pixelWidthHeightRatio = pixelWidthHeightRatio2 / (maxInputSize6 * i2);
                                }
                                ColorInfo colorInfo = null;
                                if (A0i[6].charAt(13) == 'P') {
                                    String[] strArr4 = A0i;
                                    strArr4[0] = "ILsdlWBmW3LtyE";
                                    strArr4[5] = "8veTT5Wo";
                                    if (this.A0b) {
                                        byte[] A07 = A07();
                                        int i6 = this.A0D;
                                        int i7 = this.A0C;
                                        int maxInputSize7 = this.A0E;
                                        colorInfo = new ColorInfo(i6, i7, maxInputSize7, A07);
                                    }
                                    A0A = Format.A04(Integer.toString(pcmEncoding), A01, null, -1, i3, this.A0R, this.A0J, -1.0f, list, -1, pixelWidthHeightRatio, this.A0e, this.A0P, colorInfo, this.A0U);
                                }
                                throw new RuntimeException();
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 1:
                            A01 = A01(978, 19, 94);
                            int maxInputSize8 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22 = maxInputSize8 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 2:
                            A01 = A01(923, 11, 44);
                            int maxInputSize82 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222 = maxInputSize82 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 3:
                        case 4:
                        case 5:
                            A01 = A01(910, 13, 27);
                            byte[] bArr = this.A0d;
                            list = bArr == null ? null : Collections.singletonList(bArr);
                            int maxInputSize822 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222 = maxInputSize822 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 6:
                            A01 = A01(891, 9, 118);
                            C0728Ii A00 = C0728Ii.A00(new IQ(this.A0d));
                            list = A00.A04;
                            int maxInputSize9 = A00.A02;
                            this.A0M = maxInputSize9;
                            int maxInputSize8222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222 = maxInputSize8222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 7:
                            A01 = A01(900, 10, 71);
                            C0732Io A002 = C0732Io.A00(new IQ(this.A0d));
                            list = A002.A01;
                            int maxInputSize10 = A002.A00;
                            this.A0M = maxInputSize10;
                            int maxInputSize82222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222 = maxInputSize82222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case '\b':
                            Pair<String, List<byte[]>> A003 = A00(new IQ(this.A0d));
                            A01 = (String) A003.first;
                            list = (List) A003.second;
                            int maxInputSize822222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222 = maxInputSize822222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case '\t':
                            A01 = A01(944, 15, 9);
                            int maxInputSize8222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222 = maxInputSize8222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case '\n':
                            A01 = A01(841, 12, 12);
                            i3 = 8192;
                            list = A03(this.A0d);
                            int maxInputSize82222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222222 = maxInputSize82222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 11:
                            A01 = A01(780, 10, 58);
                            i3 = 5760;
                            list = new ArrayList(3);
                            list.add(this.A0d);
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0S).array());
                            list.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.A0T).array());
                            int maxInputSize822222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222 = maxInputSize822222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case '\f':
                            A01 = A01(742, 15, 54);
                            list = Collections.singletonList(this.A0d);
                            int maxInputSize8222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222 = maxInputSize8222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case '\r':
                            A01 = A01(767, 13, 21);
                            i3 = 4096;
                            int maxInputSize82222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222222222 = maxInputSize82222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 14:
                            A01 = A01(757, 10, 42);
                            i3 = 4096;
                            int maxInputSize822222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222222 = maxInputSize822222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 15:
                            A01 = A01(713, 9, 58);
                            int maxInputSize8222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222222 = maxInputSize8222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 16:
                            A01 = A01(722, 10, 15);
                            int maxInputSize82222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222222222222 = maxInputSize82222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 17:
                            A01 = A01(799, 13, 105);
                            this.A0X = new C0577Ch();
                            int maxInputSize822222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222222222 = maxInputSize822222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 18:
                        case 19:
                            A01 = A01(812, 13, 77);
                            int maxInputSize8222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222222222 = maxInputSize8222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 20:
                            A01 = A01(825, 16, 57);
                            int maxInputSize82222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222222222222222 = maxInputSize82222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 21:
                            A01 = A01(732, 10, 33);
                            list = Collections.singletonList(this.A0d);
                            int maxInputSize822222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222222222222 = maxInputSize822222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 22:
                            A01 = A01(790, 9, 89);
                            if (A06(new IQ(this.A0d))) {
                                int maxInputSize11 = this.A0A;
                                selectionFlags = C0726Ig.A02(maxInputSize11);
                                if (selectionFlags == 0) {
                                    selectionFlags = -1;
                                    A01 = A01(853, 15, 23);
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(A013);
                                    int maxInputSize12 = this.A0A;
                                    sb.append(maxInputSize12);
                                    sb.append(A012);
                                    sb.append(A01);
                                    Log.w(A014, sb.toString());
                                }
                            } else {
                                A01 = A01(853, 15, 23);
                                Log.w(A014, A01(300, 51, 57) + A01);
                            }
                            int maxInputSize8222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222222222222 = maxInputSize8222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 23:
                            String[] strArr5 = A0i;
                            String str2 = strArr5[2];
                            String str3 = strArr5[4];
                            int maxInputSize13 = str2.length();
                            if (maxInputSize13 != str3.length()) {
                                String[] strArr6 = A0i;
                                strArr6[0] = "GPvEZkgBJslFyn";
                                strArr6[5] = "vStaSBxJ";
                                A01 = A01(790, 9, 89);
                                int maxInputSize14 = this.A0A;
                                selectionFlags = C0726Ig.A02(maxInputSize14);
                                if (selectionFlags == 0) {
                                    selectionFlags = -1;
                                    A01 = A01(853, 15, 23);
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(A013);
                                    int maxInputSize15 = this.A0A;
                                    sb2.append(maxInputSize15);
                                    sb2.append(A012);
                                    sb2.append(A01);
                                    Log.w(A014, sb2.toString());
                                }
                                int maxInputSize82222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                                int maxInputSize222222222222222222222 = maxInputSize82222222222222222222 | (this.A0a ? 2 : 0);
                                if (!IJ.A0A(A01)) {
                                }
                                this.A0W = cm.ADY(this.A0N, i);
                                this.A0W.A5A(A0A);
                                return;
                            }
                            throw new RuntimeException();
                        case 24:
                            A01 = A01(693, 20, 40);
                            int maxInputSize822222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222222222222222 = maxInputSize822222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 25:
                            A01 = A01(871, 10, 78);
                            int maxInputSize8222222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222222222222222 = maxInputSize8222222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 26:
                            A01 = A01(675, 18, 29);
                            list = Collections.singletonList(this.A0d);
                            int maxInputSize82222222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize222222222222222222222222 = maxInputSize82222222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 27:
                            A01 = A01(660, 15, 25);
                            int maxInputSize822222222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize2222222222222222222222222 = maxInputSize822222222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        case 28:
                            A01 = A01(641, 19, 5);
                            byte[] bArr2 = this.A0d;
                            list = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                            int maxInputSize8222222222222222222222222 = 0 | (this.A0Z ? 1 : 0);
                            int maxInputSize22222222222222222222222222 = maxInputSize8222222222222222222222222 | (this.A0a ? 2 : 0);
                            if (!IJ.A0A(A01)) {
                            }
                            this.A0W = cm.ADY(this.A0N, i);
                            this.A0W.A5A(A0A);
                            return;
                        default:
                            throw new AN(A01(470, 30, 42));
                    }
                }
                c = 65535;
                String A0122 = A01(0, 22, 6);
                String A0132 = A01(500, 27, 63);
                String A0142 = A01(283, 17, 56);
                switch (c) {
                }
            case -2095575984:
                if (str.equals(A01(578, 14, 80))) {
                    c = 3;
                    String A01222 = A01(0, 22, 6);
                    String A01322 = A01(500, 27, 63);
                    String A01422 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222 = A01(0, 22, 6);
                String A013222 = A01(500, 27, 63);
                String A014222 = A01(283, 17, 56);
                switch (c) {
                }
            case -1985379776:
                if (str.equals(A01(94, 8, 45))) {
                    c = 22;
                    String A0122222 = A01(0, 22, 6);
                    String A0132222 = A01(500, 27, 63);
                    String A0142222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222 = A01(0, 22, 6);
                String A01322222 = A01(500, 27, 63);
                String A01422222 = A01(283, 17, 56);
                switch (c) {
                }
            case -1784763192:
                if (str.equals(A01(121, 8, 53))) {
                    c = 17;
                    String A012222222 = A01(0, 22, 6);
                    String A013222222 = A01(500, 27, 63);
                    String A014222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222 = A01(0, 22, 6);
                String A0132222222 = A01(500, 27, 63);
                String A0142222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -1730367663:
                if (str.equals(A01(129, 8, 99))) {
                    c = '\n';
                    String A01222222222 = A01(0, 22, 6);
                    String A01322222222 = A01(500, 27, 63);
                    String A01422222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222 = A01(0, 22, 6);
                String A013222222222 = A01(500, 27, 63);
                String A014222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -1482641358:
                String[] strArr7 = A0i;
                String str4 = strArr7[0];
                String str5 = strArr7[5];
                int maxInputSize16 = str4.length();
                if (maxInputSize16 != str5.length()) {
                    String[] strArr8 = A0i;
                    strArr8[6] = "qG8zvSl11wlr3PyhmTIK5vu4A0XKpxa7";
                    strArr8[6] = "qG8zvSl11wlr3PyhmTIK5vu4A0XKpxa7";
                    if (str.equals(A01(76, 9, 53))) {
                        c = '\r';
                        String A0122222222222 = A01(0, 22, 6);
                        String A0132222222222 = A01(500, 27, 63);
                        String A0142222222222 = A01(283, 17, 56);
                        switch (c) {
                        }
                    }
                    c = 65535;
                    String A01222222222222 = A01(0, 22, 6);
                    String A01322222222222 = A01(500, 27, 63);
                    String A01422222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                throw new RuntimeException();
            case -1482641357:
                if (str.equals(A01(85, 9, 21))) {
                    c = 14;
                    String A012222222222222 = A01(0, 22, 6);
                    String A013222222222222 = A01(500, 27, 63);
                    String A014222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222 = A01(0, 22, 6);
                String A0132222222222222 = A01(500, 27, 63);
                String A0142222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -1373388978:
                if (str.equals(A01(608, 15, 70))) {
                    c = '\b';
                    String A01222222222222222 = A01(0, 22, 6);
                    String A01322222222222222 = A01(500, 27, 63);
                    String A01422222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222 = A01(0, 22, 6);
                String A013222222222222222 = A01(500, 27, 63);
                String A014222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -933872740:
                if (str.equals(A01(351, 8, 34))) {
                    c = 28;
                    String A0122222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222 = A01(500, 27, 63);
                String A01422222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -538363189:
                if (str.equals(A01(548, 15, 35))) {
                    c = 4;
                    String A012222222222222222222 = A01(0, 22, 6);
                    String A013222222222222222222 = A01(500, 27, 63);
                    String A014222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222222222 = A01(0, 22, 6);
                String A0132222222222222222222 = A01(500, 27, 63);
                String A0142222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -538363109:
                if (str.equals(A01(563, 15, 10))) {
                    c = 6;
                    String A01222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -425012669:
                if (str.equals(A01(390, 8, 62))) {
                    c = 26;
                    String A0122222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case -356037306:
                String[] strArr9 = A0i;
                String str6 = strArr9[3];
                String str7 = strArr9[1];
                int maxInputSize17 = str6.length();
                if (maxInputSize17 == str7.length()) {
                    String[] strArr10 = A0i;
                    strArr10[6] = "m4iIUvqa3iebjPqLzaYwS702tmfdQ29Y";
                    strArr10[6] = "m4iIUvqa3iebjPqLzaYwS702tmfdQ29Y";
                    break;
                } else {
                    String[] strArr11 = A0i;
                    strArr11[3] = "Cqo4aoCEj";
                    strArr11[1] = "ad9ZRbEUo";
                    break;
                }
                String A012222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 62923557:
                if (str.equals(A01(22, 5, 52))) {
                    c = '\f';
                    String A0122222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 62923603:
                int maxInputSize18 = A0i[6].charAt(13);
                if (maxInputSize18 == 80) {
                    String[] strArr12 = A0i;
                    strArr12[3] = "Ukhs2e9He";
                    strArr12[1] = "urIa2HQBz";
                    if (str.equals(A01(27, 5, 84))) {
                        c = 15;
                        String A012222222222222222222222222222 = A01(0, 22, 6);
                        String A013222222222222222222222222222 = A01(500, 27, 63);
                        String A014222222222222222222222222222 = A01(283, 17, 56);
                        switch (c) {
                        }
                    }
                    c = 65535;
                    String A0122222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                throw new RuntimeException();
            case 62927045:
                if (str.equals(A01(32, 5, 117))) {
                    c = 18;
                    String A01222222222222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 82338133:
                if (str.equals(A01(631, 5, 0))) {
                    c = 0;
                    String A0122222222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 82338134:
                if (str.equals(A01(636, 5, 61))) {
                    c = 1;
                    String A012222222222222222222222222222222222 = A01(0, 22, 6);
                    String A013222222222222222222222222222222222 = A01(500, 27, 63);
                    String A014222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222222222222222222222222 = A01(0, 22, 6);
                String A0132222222222222222222222222222222222 = A01(500, 27, 63);
                String A0142222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 99146302:
                if (str.equals(A01(359, 10, 96))) {
                    c = 27;
                    String A01222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 444813526:
                if (str.equals(A01(623, 8, 69))) {
                    c = '\t';
                    String A0122222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 542569478:
                if (str.equals(A01(37, 13, 3))) {
                    c = 19;
                    String A012222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A013222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A014222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A0132222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A0142222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 725957860:
                if (str.equals(A01(108, 13, 55))) {
                    c = 23;
                    String A01222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 738597099:
                if (str.equals(A01(369, 10, 94))) {
                    c = 25;
                    String A0122222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 855502857:
                if (str.equals(A01(592, 16, 48))) {
                    c = 7;
                    String A012222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A013222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A014222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A0132222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A0142222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 1422270023:
                if (str.equals(A01(379, 11, 2))) {
                    c = 24;
                    String A01222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 1809237540:
                if (str.equals(A01(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 7, 22))) {
                    c = 2;
                    String A0122222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 1950749482:
                if (str.equals(A01(64, 6, 22))) {
                    c = 16;
                    String A012222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A013222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A014222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A0122222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A0132222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A0142222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 1950789798:
                if (str.equals(A01(70, 6, 86))) {
                    c = 21;
                    String A01222222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A01322222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A01422222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A012222222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            case 1951062397:
                if (str.equals(A01(102, 6, 74))) {
                    c = 11;
                    String A0122222222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                    String A0132222222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                    String A0142222222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                    switch (c) {
                    }
                }
                c = 65535;
                String A01222222222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A01322222222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A01422222222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
            default:
                c = 65535;
                String A012222222222222222222222222222222222222222222222222222222222 = A01(0, 22, 6);
                String A013222222222222222222222222222222222222222222222222222222222 = A01(500, 27, 63);
                String A014222222222222222222222222222222222222222222222222222222222 = A01(283, 17, 56);
                switch (c) {
                }
        }
    }
}
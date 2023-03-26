package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.yg1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.3S  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C3S extends AbstractC0573Cd {
    public static byte[] A0d;
    public static String[] A0e;
    public static final byte[] A0f;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaCodec A06;
    public Format A07;
    public C3<Y7> A08;
    public C3<Y7> A09;
    public C0604Di A0A;
    public ByteBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public ByteBuffer[] A0S;
    public ByteBuffer[] A0T;
    public C0557Be A0U;
    public final MediaCodec.BufferInfo A0V;
    public final AH A0W;
    public final C1121Xw A0X;
    public final C1121Xw A0Y;
    @Nullable
    public final C4<Y7> A0Z;
    public final InterfaceC0610Do A0a;
    public final List<Long> A0b;
    public final boolean A0c;

    public static String A0a(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0d, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 20);
        }
        return new String(copyOfRange);
    }

    public static void A0k() {
        A0d = new byte[]{76, 64, 2, 21, 20, 64, 118, 116, 116, 116, 116, 116, 117, 114, 115, 112, 118, 7, 116, 116, 6, 0, 5, 118, 113, 125, 116, 116, 116, 116, 116, 116, 117, 114, 124, 7, 1, 116, 2, 117, 119, 118, 116, 116, 116, 116, 116, 116, 117, 114, 113, 124, 124, 124, 112, 116, 0, 7, 1, 115, 117, 117, 124, 5, 116, 116, 116, 118, 2, 6, 2, 117, 7, 119, 117, 7, 119, 118, 115, 113, 0, 115, 124, 7, 0, 18, 4, 15, 8, 26, 3, 29, 26, 8, 15, 117, 89, 85, 78, 91, 90, 34, 20, Flags.CD, 70, 21, 3, 21, 21, 15, 9, 8, 70, 20, 3, 23, 19, 15, 20, 3, 21, 70, 21, 3, 5, 19, 20, 3, 70, 2, 3, 5, 9, 2, 3, 20, 70, 0, 9, 20, 70, 62, 22, 23, 26, 18, 83, 1, 22, 2, 6, 26, 1, 22, 0, 83, 18, 83, 55, 1, 30, 32, 22, 0, 0, 26, 28, 29, 62, 18, 29, 18, 20, 22, 1, 125, 85, 84, 89, 81, 115, 95, 84, 85, 83, 98, 85, 94, 84, 85, 66, 85, 66, 125, g15.c, 106, 28, 119, 74, 75, 92, 93, 65, 28, 83, 68, 81, 28, 86, 87, 81, 27, 25, 12, 122, 17, 44, 45, 58, 59, 39, 122, 53, 34, 55, 122, 48, 49, 55, 122, 39, 49, 55, 33, 38, 49, 74, 72, 93, 43, 72, 81, 78, 43, 68, 80, 65, 76, 74, 43, 65, 64, 70, 74, 65, 64, 87, 43, 72, 85, 54, g15.c, 125, 104, 30, 125, 100, 123, 30, 102, 121, 116, 117, g15.c, 30, 116, 117, 115, g15.c, 116, 117, 98, 30, 113, 102, 115, 3, 1, 20, 98, 2, 58, 37, 40, 37, 45, 98, 36, 126, 122, 120, 98, 40, 41, 47, 35, 40, 41, 47, 45, 56, 78, 46, 22, 9, 4, 9, 1, 78, 8, 82, 86, 84, 78, 4, 5, 3, 15, 4, 5, 78, 19, 5, 3, 21, 18, 5, 121, 123, 110, 24, 101, 115, 117, 24, 87, 64, 85, 24, 82, 83, 85, 72, 74, 95, 41, 84, 66, 68, 41, 102, 113, 100, 41, 99, 98, 100, 41, 116, 98, 100, 114, 117, 98, 45, 47, 58, 76, 3, 14, 14, 21, Flags.CD, 12, 12, 7, 16, 76, 20, Flags.CD, 6, 7, 13, 76, 6, 7, 1, 13, 6, 7, 16, 76, 3, 20, 1, 1, 3, 22, 96, 47, 35, 34, 33, 41, 39, 45, 96, 47, 56, 45, 96, bx.W5, 43, 45, 33, bx.W5, 43, 60, 96, 47, 57, 43, 61, 33, 35, 43, ax5.a, 61, 40, 94, 17, 29, 28, 31, 23, 25, 19, 94, 17, 6, 19, 94, 20, 21, 19, 31, 20, 21, 2, 94, 17, 7, 21, 3, 31, 29, 21, 94, 3, 21, 19, 5, 2, 21, 121, 123, 110, 24, 81, 89, 89, 81, 90, 83, 24, 87, 87, 85, 24, 82, 83, 85, 89, 82, 83, 68, 30, 28, 9, g15.c, 54, 62, 62, 54, 61, 52, g15.c, 39, 62, 35, 51, 56, 34, g15.c, 53, 52, 50, 62, 53, 52, 35, 2, 0, 21, 99, ax5.a, 38, 99, 59, 36, 41, 40, 34, 18, 41, 40, 46, 34, 41, 40, ax5.a, 99, 44, 59, 46, 112, 110, 14, 98, 22, 18, 19, 41, 55, 87, 59, 79, 72, 74, 106, 116, 20, 126, 1, 9, 9, 116, 106, 10, 109, 16, 23, 23, 79, 81, 49, 72, 41, 36, 41, 106, 97, 104, 103, 103, 108, 101, 36, 106, 102, 124, 103, 125, ax5.a, 51, 50, 58, 53, 59, 41, 46, 57, 31, 51, 56, 57, ax5.a, 15, 30, 9, 13, 24, 9, 47, 3, 8, 9, 15, 86, 96, 118, 101, 109, 106, 69, 106, 96, 66, 97, 97, 96, 83, 89, 90, 64, 91, 81, 80, 71, 24, 18, 17, Flags.CD, 16, 26, 27, 12, 33, 18, 10, 27, 5, 16, 13, 23, 18, 7, 16, 43, 33, 113, 115, 115, 115, 45, 32, 44, 34, 45, 49, 30, 31, 80, 3, 21, 19, 5, 2, 21, 80, 20, 21, 19, 31, 20, 21, 2, 80, 17, 6, 17, 25, 28, 17, 18, 28, 21, 94, 80, 36, 2, 9, 25, 30, 23, 80, 4, 31, 80, 0, 2, 31, 19, 21, 21, 20, 80, 7, 25, 4, 24, 80, 118, 113, 100, 119, 113, 70, 106, 97, 96, 102, 102, 123, 126, 115, 98, 123, 115, 78, 80, 93, 77, 81};
    }

    public static void A0l() {
        A0e = new String[]{"9OVkIR1fNYEoLuJhr4v44UGIqobat2iA", "rvjyAE4a8qg3Symxb7ylQnmZk1yEw18g", "yq3KpxRuPN0WZ8jbU7FQkuT3q90s4j9W", "QhWwoh5s4IWFZsopFlKjqr3qYdcDlMjY", "GXhQrMO3EYw7GpvgdmF2LLQyblaoRrya", "HarHLo3NfHHJ1sn22D42qgtNJjG4ySv5", "mWzZtnKFhVqOEEmQC7RHyJpmfpW8oE62", "x54zHbOQHTTVCgIECmCrfbqAOALLU5ir"};
    }

    public abstract int A1D(InterfaceC0610Do interfaceC0610Do, C4<Y7> c4, Format format) throws C0613Dr;

    public abstract void A1P(C0604Di c0604Di, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) throws C0613Dr;

    public abstract boolean A1R(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws A4;

    static {
        A0l();
        A0k();
        A0f = C0726Ig.A0i(A0a(7, 76, 80));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public C3S(int i, InterfaceC0610Do interfaceC0610Do, @Nullable C4<Y7> c4, boolean z) {
        super(i);
        I1.A04(C0726Ig.A02 >= 16);
        this.A0a = (InterfaceC0610Do) I1.A01(interfaceC0610Do);
        this.A0Z = c4;
        this.A0c = z;
        this.A0X = new C1121Xw(0);
        this.A0Y = C1121Xw.A02();
        this.A0W = new AH();
        this.A0b = new ArrayList();
        this.A0V = new MediaCodec.BufferInfo();
        this.A01 = 0;
        this.A02 = 0;
    }

    private int A0X(String str) {
        if (C0726Ig.A02 <= 25 && A0a(211, 25, 64).equals(str)) {
            String str2 = C0726Ig.A06;
            if (A0e[5].charAt(22) != 'm') {
                String[] strArr = A0e;
                strArr[3] = "rXHSxRetqBcaMazmAuD1LrMN32rrN6yB";
                strArr[0] = "PYELojq5TDB6rkMOhN6BPW4xOGIFZ2Jw";
                if (str2.startsWith(A0a(573, 7, 8)) || C0726Ig.A06.startsWith(A0a(545, 7, 55)) || C0726Ig.A06.startsWith(A0a(552, 7, 110)) || C0726Ig.A06.startsWith(A0a(566, 7, 51))) {
                    return 2;
                }
            }
            throw new RuntimeException();
        }
        if (C0726Ig.A02 < 24) {
            if (A0a(286, 22, 88).equals(str) || A0a(308, 29, 116).equals(str)) {
                if (!A0a(631, 8, 33).equals(C0726Ig.A03)) {
                    String str3 = C0726Ig.A03;
                    String A0a = A0a(639, 12, 106);
                    String[] strArr2 = A0e;
                    if (strArr2[1].charAt(9) != strArr2[6].charAt(9)) {
                        String[] strArr3 = A0e;
                        strArr3[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                        strArr3[7] = "EJTrH92MD698cCrSnGocCFo99KF41O7G";
                        if (!A0a.equals(str3)) {
                            if (!A0a(651, 7, 118).equals(C0726Ig.A03)) {
                                if (A0a(732, 7, 6).equals(C0726Ig.A03)) {
                                    return 1;
                                }
                                return 0;
                            }
                            return 1;
                        }
                        return 1;
                    }
                    throw new RuntimeException();
                }
                return 1;
            }
            return 0;
        }
        return 0;
    }

    private final long A0Y() {
        return 0L;
    }

    public static MediaCodec.CryptoInfo A0Z(C1121Xw c1121Xw, int i) {
        MediaCodec.CryptoInfo A02 = c1121Xw.A02.A02();
        if (i == 0) {
            return A02;
        }
        if (A02.numBytesOfClearData == null) {
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            strArr2[5] = "UbtyB27B24Biu3n6sBWjRVSN4hFFB4s1";
            A02.numBytesOfClearData = new int[1];
        }
        int[] iArr = A02.numBytesOfClearData;
        iArr[0] = iArr[0] + i;
        return A02;
    }

    private ByteBuffer A0b(int i) {
        if (C0726Ig.A02 >= 21) {
            return this.A06.getInputBuffer(i);
        }
        return this.A0S[i];
    }

    private ByteBuffer A0c(int i) {
        if (C0726Ig.A02 >= 21) {
            return this.A06.getOutputBuffer(i);
        }
        return this.A0T[i];
    }

    private void A0d() {
        if (C0726Ig.A02 < 21) {
            this.A0S = this.A06.getInputBuffers();
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0e() throws A4 {
        if (this.A02 == 2) {
            A1I();
            A1K();
            return;
        }
        this.A0N = true;
        A1J();
    }

    private void A0f() {
        if (C0726Ig.A02 < 21) {
            this.A0T = this.A06.getOutputBuffers();
        }
    }

    private void A0g() throws A4 {
        MediaFormat outputFormat = this.A06.getOutputFormat();
        if (this.A00 != 0 && outputFormat.getInteger(A0a(739, 5, 45)) == 32 && outputFormat.getInteger(A0a(664, 6, 81)) == 32) {
            this.A0O = true;
            return;
        }
        if (this.A0I) {
            outputFormat.setInteger(A0a(580, 13, 29), 1);
        }
        A1M(this.A06, outputFormat);
    }

    private void A0h() {
        if (C0726Ig.A02 < 21) {
            this.A0S = null;
            this.A0T = null;
        }
    }

    private void A0i() {
        this.A03 = -1;
        this.A0X.A01 = null;
    }

    private void A0j() {
        this.A04 = -1;
        this.A0B = null;
    }

    private void A0m(C0606Dk c0606Dk) throws A4 {
        throw A4.A01(c0606Dk, A10());
    }

    private boolean A0n() {
        if (A0a(95, 6, 32).equals(C0726Ig.A05)) {
            if (!A0a(87, 4, 90).equals(C0726Ig.A06)) {
                if (A0a(83, 4, 82).equals(C0726Ig.A06)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0206, code lost:
        if (r16.A0X.A03() == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0208, code lost:
        r16.A0b.add(java.lang.Long.valueOf(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0211, code lost:
        r16.A0X.A08();
        A1O(r16.A0X);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x021b, code lost:
        if (r6 == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x021e, code lost:
        r16.A06.queueInputBuffer(r16.A03, 0, r16.A0X.A01.limit(), r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0231, code lost:
        r6 = A0Z(r16.A0X, r5);
        r16.A06.queueSecureInputBuffer(r16.A03, 0, r6, r7, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0240, code lost:
        A0i();
        r16.A0J = true;
        r16.A01 = 0;
        r16.A0U.A04++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x024e, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x024f, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0258, code lost:
        throw com.facebook.ads.redexgen.X.A4.A01(r1, A10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0097, code lost:
        r16.A0C = false;
        r16.A0X.A01.put(com.facebook.ads.redexgen.X.C3S.A0f);
        r16.A06.queueInputBuffer(r16.A03, 0, com.facebook.ads.redexgen.X.C3S.A0f.length, 0, 0);
        A0i();
        r16.A0J = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b5, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c2, code lost:
        if (r7 != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c5, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
        if (r16.A0R == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ca, code lost:
        r6 = -4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cc, code lost:
        if (r6 != (-3)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ce, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d1, code lost:
        if (r16.A01 != 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
        r8 = r16.A07.A0P.size();
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f0, code lost:
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
        r6[7] = "0VatHXJ47YZXuQNTjh1Q4vWnAJchohqJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fc, code lost:
        if (r7 >= r8) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fe, code lost:
        r16.A0X.A01.put(r16.A07.A0P.get(r7));
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[3] = "zOhD8BhFeW0zpu1geu8qUgn88iwXK5ep";
        r6[0] = "60rX9qlLFkokv4JD1C8g9QKhync8N1Cu";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
        if (r7 >= r8) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0121, code lost:
        r16.A01 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0123, code lost:
        r7 = r16.A0X.A01;
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
        if (r6[1].charAt(9) == r6[6].charAt(9)) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
        r6 = com.facebook.ads.redexgen.X.C3S.A0e;
        r6[1] = "39aArsNj3IDVPnG6lUIYrUviornu3auc";
        r6[6] = "ZVN5NvQX1lR02F2nkBpRehMiTRLfpSWC";
        r5 = r7.position();
        r6 = A12(r16.A0W, r16.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0155, code lost:
        r5 = r7.position();
        r6 = A12(r16.A0W, r16.A0X, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0164, code lost:
        if (r6 != (-5)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0168, code lost:
        if (r16.A01 != 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x016a, code lost:
        r16.A0X.A07();
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0171, code lost:
        A1N(r16.A0W.A00);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0178, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017f, code lost:
        if (r16.A0X.A04() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0183, code lost:
        if (r16.A01 != 2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0185, code lost:
        r16.A0X.A07();
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
        r16.A0M = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0190, code lost:
        if (r16.A0J != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0192, code lost:
        A0e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0195, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0198, code lost:
        if (r16.A0G == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019b, code lost:
        r16.A0K = true;
        r16.A06.queueInputBuffer(r16.A03, 0, 0, 0, 4);
        A0i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ac, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ad, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b6, code lost:
        throw com.facebook.ads.redexgen.X.A4.A01(r1, A10());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
        if (r16.A0Q == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c1, code lost:
        if (r16.A0X.A05() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c3, code lost:
        r16.A0X.A07();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01ca, code lost:
        if (r16.A01 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01cc, code lost:
        r16.A01 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ce, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cf, code lost:
        r16.A0Q = false;
        r6 = r16.A0X.A0A();
        r16.A0R = A0y(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01df, code lost:
        if (r16.A0R == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e1, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01e4, code lost:
        if (r16.A0D == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e6, code lost:
        if (r6 != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e8, code lost:
        com.facebook.ads.redexgen.X.IM.A0B(r16.A0X.A01);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f7, code lost:
        if (r16.A0X.A01.position() != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f9, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01fa, code lost:
        r16.A0D = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01fc, code lost:
        r7 = r16.A0X.A00;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0o() throws A4 {
        MediaCodec mediaCodec = this.A06;
        if (mediaCodec == null || this.A02 == 2 || this.A0M) {
            return false;
        }
        if (this.A03 < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            String[] strArr = A0e;
            if (strArr[4].charAt(18) != strArr[2].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "gQzx4TFbVNXWekZHluF6rXwSB7aSC649";
            strArr2[2] = "pumVl6xOmt3y36mN6IFaiDMopgC1sMMY";
            this.A03 = dequeueInputBuffer;
            int i = this.A03;
            if (i < 0) {
                return false;
            }
            this.A0X.A01 = A0b(i);
            this.A0X.A07();
        }
        if (this.A02 == 1) {
            if (!this.A0G) {
                this.A0K = true;
                this.A06.queueInputBuffer(this.A03, 0, 0, 0L, 4);
                A0i();
            }
            this.A02 = 2;
            return false;
        }
        boolean z = this.A0C;
        String[] strArr3 = A0e;
        if (strArr3[3].charAt(8) != strArr3[0].charAt(8)) {
            String[] strArr4 = A0e;
            strArr4[5] = "Ndd3Pb72eNV67a4mtpsnNG62fqZf8mld";
            strArr4[5] = "Ndd3Pb72eNV67a4mtpsnNG62fqZf8mld";
        } else {
            String[] strArr5 = A0e;
            strArr5[7] = "wWjpHbTO1A0kh7kQrFgOS5a5YhBzSTgd";
            strArr5[7] = "wWjpHbTO1A0kh7kQrFgOS5a5YhBzSTgd";
        }
    }

    private boolean A0p() {
        return this.A04 >= 0;
    }

    private boolean A0q(long j) {
        int size = this.A0b.size();
        for (int i = 0; i < size; i++) {
            long longValue = this.A0b.get(i).longValue();
            String[] strArr = A0e;
            if (strArr[1].charAt(9) == strArr[6].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0e;
            strArr2[4] = "ML5bMotUrNJfefR5zyFOe6FKAXdvvO6A";
            strArr2[2] = "SdeYytwJjEjJxI17XZFSuNmI9VlWoLpo";
            if (longValue == j) {
                this.A0b.remove(i);
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr3 = A0e;
                    strArr3[4] = "PN0xo47Kt8nFjD42DkF1Rwv3kccfY0ZU";
                    strArr3[2] = "8XhLexKKIuuBUtz2cCFHUx77okN3o4VX";
                    return true;
                }
                String[] strArr4 = A0e;
                strArr4[1] = "MaO0vnTK96XnVNRleRSpONjFXCjP5Eov";
                strArr4[6] = "hUdEzwsPaliJglUJ7NraoDZ4Fn5DncmA";
                return false;
            }
        }
        return false;
    }

    private boolean A0r(long j, long j2) throws A4 {
        boolean A1R;
        int dequeueOutputBuffer;
        if (!A0p()) {
            if (this.A0F && this.A0K) {
                try {
                    dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0Y());
                } catch (IllegalStateException unused) {
                    A0e();
                    if (this.A0N) {
                        A1I();
                    }
                    return false;
                }
            } else {
                dequeueOutputBuffer = this.A06.dequeueOutputBuffer(this.A0V, A0Y());
            }
            if (dequeueOutputBuffer >= 0) {
                if (this.A0O) {
                    this.A0O = false;
                    this.A06.releaseOutputBuffer(dequeueOutputBuffer, false);
                    return true;
                } else if (this.A0V.size == 0 && (this.A0V.flags & 4) != 0) {
                    A0e();
                    return false;
                } else {
                    this.A04 = dequeueOutputBuffer;
                    this.A0B = A0c(dequeueOutputBuffer);
                    ByteBuffer byteBuffer = this.A0B;
                    if (byteBuffer != null) {
                        byteBuffer.position(this.A0V.offset);
                        this.A0B.limit(this.A0V.offset + this.A0V.size);
                    }
                    this.A0P = A0q(this.A0V.presentationTimeUs);
                }
            } else if (dequeueOutputBuffer == -2) {
                A0g();
                return true;
            } else if (dequeueOutputBuffer == -3) {
                A0f();
                return true;
            } else {
                if (this.A0G && (this.A0M || this.A02 == 2)) {
                    A0e();
                }
                return false;
            }
        }
        boolean z = this.A0F;
        String[] strArr = A0e;
        if (strArr[3].charAt(8) != strArr[0].charAt(8)) {
            String[] strArr2 = A0e;
            strArr2[3] = "H6QEdKrNS5VKUI2eiDzJYDiDaOSTSHZm";
            strArr2[0] = "qtM0JqIstAlLtY5WeeeWIRjDSmIhrDzd";
            if (z && this.A0K) {
                try {
                    A1R = A1R(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
                } catch (IllegalStateException unused2) {
                    A0e();
                    boolean z2 = this.A0N;
                    String[] strArr3 = A0e;
                    if (strArr3[4].charAt(18) == strArr3[2].charAt(18)) {
                        String[] strArr4 = A0e;
                        strArr4[3] = "kLeAoHdKyNjlIY3W2lnlzypZ7jBCZpds";
                        strArr4[0] = "12vglqLCD0wnh38LM4o4LF1q7CPuStNa";
                        if (z2) {
                            A1I();
                        }
                        return false;
                    }
                }
            } else {
                A1R = A1R(j, j2, this.A06, this.A0B, this.A04, this.A0V.flags, this.A0V.presentationTimeUs, this.A0P);
            }
            if (A1R) {
                A1L(this.A0V.presentationTimeUs);
                boolean z3 = (this.A0V.flags & 4) != 0;
                A0j();
                if (!z3) {
                    return true;
                }
                A0e();
            }
            return false;
        }
        throw new RuntimeException();
    }

    public static boolean A0s(C0604Di c0604Di) {
        String str = c0604Di.A02;
        if (C0726Ig.A02 > 17 || (!A0a(521, 24, 89).equals(str) && !A0a(374, 31, 118).equals(str))) {
            if (A0a(95, 6, 32).equals(C0726Ig.A05)) {
                if (!A0a(91, 4, 72).equals(C0726Ig.A06) || !c0604Di.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0t(String str) {
        if (C0726Ig.A02 > 23 || !A0a(496, 25, 69).equals(str)) {
            if (C0726Ig.A02 <= 19) {
                if (A0a(658, 6, 87).equals(C0726Ig.A03)) {
                    String[] strArr = A0e;
                    if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0e;
                    strArr2[1] = "95wFKgRrMS7zF0LnDUBUyEKLdOv2pw0Q";
                    strArr2[6] = "8UM2DR4qd3kvfN0lEIyvKJByOBGtF0J9";
                    if (A0a(405, 31, 90).equals(str) || A0a(436, 38, 100).equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A0u(String str) {
        return C0726Ig.A02 == 21 && A0a(474, 22, 34).equals(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:
        if (A0a(352, 22, 19).equals(r4) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0v(String str) {
        if (C0726Ig.A02 >= 18) {
            if (C0726Ig.A02 == 18) {
                boolean equals = A0a(337, 15, 34).equals(str);
                String[] strArr = A0e;
                if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[1] = "meV5e9Kkfi1Cw7qLNaZXa1JKO1Lv4Z7w";
                strArr2[6] = "iFBSwhWIKfzcqDOwhwOBewnG37AI8L0V";
                if (!equals) {
                }
            }
            if (C0726Ig.A02 != 19 || !C0726Ig.A06.startsWith(A0a(559, 7, 45)) || (!A0a(yg1.L, 18, 38).equals(str) && !A0a(211, 25, 64).equals(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0w(String str, Format format) {
        return C0726Ig.A02 < 21 && format.A0P.isEmpty() && A0a(261, 25, 36).equals(str);
    }

    public static boolean A0x(String str, Format format) {
        return C0726Ig.A02 <= 18 && format.A05 == 1 && A0a(236, 25, 17).equals(str);
    }

    private boolean A0y(boolean z) throws A4 {
        if (this.A08 == null || (!z && this.A0c)) {
            return false;
        }
        int A70 = this.A08.A70();
        if (A70 != 1) {
            return A70 != 4;
        }
        throw A4.A01(this.A08.A6B(), A10());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public void A14() {
        this.A07 = null;
        try {
            A1I();
            try {
                if (this.A08 != null) {
                    this.A0Z.ACJ(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACJ(this.A09);
                    }
                } finally {
                }
            } catch (Throwable th) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACJ(this.A09);
                    }
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th2) {
            try {
                if (this.A08 != null) {
                    this.A0Z.ACJ(this.A08);
                }
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACJ(this.A09);
                    }
                    throw th2;
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    if (this.A09 != null && this.A09 != this.A08) {
                        this.A0Z.ACJ(this.A09);
                    }
                    throw th3;
                } finally {
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public void A15() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public void A16() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public void A17(long j, boolean z) throws A4 {
        this.A0M = false;
        this.A0N = false;
        if (this.A06 != null) {
            A1H();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd
    public void A18(boolean z) throws A4 {
        this.A0U = new C0557Be();
    }

    public int A1C(MediaCodec mediaCodec, C0604Di c0604Di, Format format, Format format2) {
        return 0;
    }

    public final MediaCodec A1E() {
        return this.A06;
    }

    public final C0604Di A1F() {
        return this.A0A;
    }

    public C0604Di A1G(InterfaceC0610Do interfaceC0610Do, Format format, boolean z) throws C0613Dr {
        return interfaceC0610Do.A60(format.A0O, z);
    }

    public void A1H() throws A4 {
        this.A05 = -9223372036854775807L;
        A0i();
        A0j();
        this.A0Q = true;
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        this.A0C = false;
        this.A0O = false;
        if (this.A0H || (this.A0E && this.A0K)) {
            A1I();
            A1K();
        } else {
            int i = this.A02;
            if (A0e[7].charAt(4) != 'H') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "wbouPn2Ftm3cpLG8fvuyld6AKnPflzbx";
            strArr[6] = "bzy96m6ZRNxMDmYLQEfFnOCqhh49XGXp";
            if (i != 0) {
                A1I();
                A1K();
            } else {
                this.A06.flush();
                this.A0J = false;
            }
        }
        if (this.A0L && this.A07 != null) {
            this.A01 = 1;
        }
    }

    public void A1I() {
        this.A05 = -9223372036854775807L;
        A0i();
        A0j();
        this.A0R = false;
        this.A0P = false;
        this.A0b.clear();
        A0h();
        this.A0A = null;
        this.A0L = false;
        this.A0J = false;
        this.A0D = false;
        this.A0H = false;
        this.A00 = 0;
        this.A0G = false;
        this.A0E = false;
        this.A0I = false;
        this.A0C = false;
        this.A0O = false;
        this.A0K = false;
        this.A01 = 0;
        this.A02 = 0;
        if (this.A06 != null) {
            this.A0U.A01++;
            try {
                this.A06.stop();
                try {
                    this.A06.release();
                    this.A06 = null;
                    C3<Y7> c3 = this.A08;
                    if (c3 != null && this.A09 != c3) {
                        try {
                            this.A0Z.ACJ(c3);
                        } finally {
                        }
                    }
                } catch (Throwable th) {
                    this.A06 = null;
                    C3<Y7> c32 = this.A08;
                    if (c32 != null && this.A09 != c32) {
                        try {
                            this.A0Z.ACJ(c32);
                        } finally {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    this.A06.release();
                    this.A06 = null;
                    C3<Y7> c33 = this.A08;
                    if (c33 != null && this.A09 != c33) {
                        try {
                            this.A0Z.ACJ(c33);
                        } finally {
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    this.A06 = null;
                    C3<Y7> c34 = this.A08;
                    if (c34 != null && this.A09 != c34) {
                        try {
                            this.A0Z.ACJ(c34);
                        } finally {
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    public void A1J() throws A4 {
    }

    public final void A1K() throws A4 {
        Format format;
        long j;
        if (this.A06 != null || (format = this.A07) == null) {
            return;
        }
        this.A08 = this.A09;
        String str = format.A0O;
        MediaCrypto mediaCrypto = null;
        boolean z = false;
        C3<Y7> c3 = this.A08;
        if (c3 != null) {
            Y7 A6W = c3.A6W();
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "HTFGGBgFgI6ylI68q0FeBZ95y7T9Xgss";
            strArr[6] = "P6HI8GYxdJJ1MGo6JXYXPe6FB7j5p6fI";
            if (A6W == null) {
                if (this.A08.A6B() == null) {
                    return;
                }
            } else {
                mediaCrypto = A6W.A00();
                z = A6W.A01(str);
            }
            if (A0n()) {
                int A70 = this.A08.A70();
                if (A70 == 1) {
                    throw A4.A01(this.A08.A6B(), A10());
                }
                if (A0e[7].charAt(4) != 'H') {
                    if (A70 != 4) {
                        return;
                    }
                } else {
                    String[] strArr2 = A0e;
                    strArr2[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    strArr2[7] = "zdcyHT7sTCB3al7NiJFn52Vz5qRveBVU";
                    if (A70 != 4) {
                        return;
                    }
                }
            }
        }
        if (this.A0A == null) {
            try {
                this.A0A = A1G(this.A0a, this.A07, z);
                if (this.A0A == null && z) {
                    this.A0A = A1G(this.A0a, this.A07, false);
                    if (this.A0A != null) {
                        Log.w(A0a(HideBottomViewOnScrollBehavior.b, 18, 36), A0a(101, 40, 114) + str + A0a(0, 6, 116) + A0a(670, 52, 100) + this.A0A.A02 + A0a(6, 1, 76));
                    }
                }
            } catch (C0613Dr e) {
                A0m(new C0606Dk(this.A07, e, z, -49998));
            }
            if (this.A0A == null) {
                A0m(new C0606Dk(this.A07, (Throwable) null, z, -49999));
            }
        }
        if (!A1S(this.A0A)) {
            return;
        }
        String str2 = this.A0A.A02;
        this.A00 = A0X(str2);
        this.A0D = A0w(str2, this.A07);
        this.A0H = A0v(str2);
        this.A0G = A0s(this.A0A);
        this.A0E = A0t(str2);
        this.A0F = A0u(str2);
        this.A0I = A0x(str2, this.A07);
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            String codecName = A0a(607, 12, 120);
            sb.append(codecName);
            sb.append(str2);
            String codecName2 = sb.toString();
            C0723Id.A02(codecName2);
            this.A06 = MediaCodec.createByCodecName(str2);
            C0723Id.A00();
            String codecName3 = A0a(593, 14, 72);
            C0723Id.A02(codecName3);
            A1P(this.A0A, this.A06, this.A07, mediaCrypto);
            C0723Id.A00();
            String codecName4 = A0a(722, 10, 17);
            C0723Id.A02(codecName4);
            this.A06.start();
            C0723Id.A00();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            A1Q(str2, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
            A0d();
        } catch (Exception e2) {
            A0m(new C0606Dk(this.A07, e2, z, str2));
        }
        if (A70() == 2) {
            j = SystemClock.elapsedRealtime() + 1000;
        } else {
            j = -9223372036854775807L;
        }
        this.A05 = j;
        A0i();
        A0j();
        this.A0Q = true;
        this.A0U.A00++;
    }

    public void A1L(long j) {
    }

    public void A1M(MediaCodec mediaCodec, MediaFormat mediaFormat) throws A4 {
    }

    public void A1N(Format format) throws A4 {
        MediaCodec mediaCodec;
        int A1C;
        Format format2 = this.A07;
        this.A07 = format;
        if (!C0726Ig.A0h(this.A07.A0H, format2 == null ? null : format2.A0H)) {
            if (this.A07.A0H != null) {
                C4<Y7> c4 = this.A0Z;
                if (A0e[5].charAt(22) != 'm') {
                    String[] strArr = A0e;
                    strArr[4] = "js0xY6djzstMh1ZGSSFwxrm9J2KEODfF";
                    strArr[2] = "gNDkR57A7pqknHdJ9eFPG5bc7UDUELIy";
                    if (c4 != null) {
                        Looper myLooper = Looper.myLooper();
                        DrmInitData drmInitData = this.A07.A0H;
                        if (A0e[5].charAt(22) != 'm') {
                            String[] strArr2 = A0e;
                            strArr2[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            strArr2[7] = "L1yeHoCGmaJe3p3nUxagVjwy9TYWwSRI";
                            this.A09 = c4.A2Q(myLooper, drmInitData);
                            C3<Y7> c3 = this.A09;
                            if (c3 == this.A08) {
                                C4<Y7> c42 = this.A0Z;
                                String[] strArr3 = A0e;
                                if (strArr3[1].charAt(9) == strArr3[6].charAt(9)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr4 = A0e;
                                strArr4[1] = "PNJFXv8k8SK4Yjj8VNQjLQpnTp0fAy1J";
                                strArr4[6] = "VCM67JEqNnPycf67Mw9BgN4gUhlxC0Ru";
                                c42.ACJ(c3);
                            }
                        }
                    } else {
                        throw A4.A01(new IllegalStateException(A0a(WKSRecord.Service.EMFIS_CNTL, 34, 103)), A10());
                    }
                }
                throw new RuntimeException();
            }
            this.A09 = null;
        }
        boolean z = false;
        if (this.A09 == this.A08 && (mediaCodec = this.A06) != null && (A1C = A1C(mediaCodec, this.A0A, format2, this.A07)) != 0) {
            if (A1C == 1) {
                z = true;
            } else if (A1C == 3) {
                z = true;
                this.A0L = true;
                this.A01 = 1;
                int i = this.A00;
                this.A0C = i == 2 || (i == 1 && this.A07.A0F == format2.A0F && this.A07.A08 == format2.A08);
            } else {
                throw new IllegalStateException();
            }
        }
        if (!z) {
            if (this.A0J) {
                this.A02 = 1;
                return;
            }
            A1I();
            A1K();
        }
    }

    public void A1O(C1121Xw c1121Xw) {
    }

    public void A1Q(String str, long j, long j2) {
    }

    public boolean A1S(C0604Di c0604Di) {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public boolean A7Z() {
        return this.A0N;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
        if (r3 == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
        r3 = (r6.A05 > (-9223372036854775807L) ? 1 : (r6.A05 == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (com.facebook.ads.redexgen.X.C3S.A0e[7].charAt(4) == 'H') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
        r2 = com.facebook.ads.redexgen.X.C3S.A0e;
        r2[4] = "x7dDRka8TdETs6VLaaF6zooftcMnhKq2";
        r2[2] = "EId5jOcDiZLe1q4ZwHFfLyVQFAikb5sI";
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (android.os.SystemClock.elapsedRealtime() >= r6.A05) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
        r2 = com.facebook.ads.redexgen.X.C3S.A0e;
        r2[3] = "3vglA6G8yuA12iVw0aFHPuEKtU4GGV7V";
        r2[0] = "dEcUfU5Lns9loW0elZLaj7FKzckicWHS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        if (r3 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r3 == false) goto L13;
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean A7i() {
        if (this.A07 != null) {
            boolean z = this.A0R;
            if (A0e[5].charAt(22) == 'm') {
                throw new RuntimeException();
            }
            String[] strArr = A0e;
            strArr[1] = "4HO9JQHKOwc6R3VWcS8R4aXAnHys3aci";
            strArr[6] = "eJ1ha0lSNb53SSfCNHliM2QVteujQRGV";
            if (!z) {
                if (!A1A()) {
                    boolean A0p = A0p();
                    String[] strArr2 = A0e;
                    if (strArr2[3].charAt(8) != strArr2[0].charAt(8)) {
                        String[] strArr3 = A0e;
                        strArr3[5] = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u";
                        strArr3[5] = "OQSQFxnlZZo22DxvkKeXHq8FF7pzfl1u";
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void ACQ(long j, long j2) throws A4 {
        if (this.A0N) {
            A1J();
            return;
        }
        if (this.A07 == null) {
            this.A0Y.A07();
            int A12 = A12(this.A0W, this.A0Y, true);
            if (A12 == -5) {
                A1N(this.A0W.A00);
            } else if (A12 == -4) {
                I1.A04(this.A0Y.A04());
                this.A0M = true;
                A0e();
                String[] strArr = A0e;
                if (strArr[3].charAt(8) == strArr[0].charAt(8)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0e;
                strArr2[7] = "aKhyH6I995l1LklLucgRLjJ4pFFWcDrl";
                strArr2[7] = "aKhyH6I995l1LklLucgRLjJ4pFFWcDrl";
                return;
            } else {
                return;
            }
        }
        A1K();
        if (this.A06 != null) {
            C0723Id.A02(A0a(IronSourceError.ERROR_DO_BN_LOAD_ALREADY_IN_PROGRESS, 12, 16));
            do {
            } while (A0r(j, j2));
            do {
            } while (A0o());
            C0723Id.A00();
        } else {
            this.A0U.A07 += A11(j);
            this.A0Y.A07();
            int A122 = A12(this.A0W, this.A0Y, false);
            if (A122 == -5) {
                AH ah = this.A0W;
                if (A0e[7].charAt(4) != 'H') {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0e;
                strArr3[7] = "H5HsHl4f2eN3vdaE4L0NqH64hfjdivD8";
                strArr3[7] = "H5HsHl4f2eN3vdaE4L0NqH64hfjdivD8";
                A1N(ah.A00);
            } else if (A122 == -4) {
                I1.A04(this.A0Y.A04());
                this.A0M = true;
                A0e();
            }
        }
        this.A0U.A00();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0530Ac
    public final int ADS(Format format) throws A4 {
        try {
            return A1D(this.A0a, this.A0Z, format);
        } catch (C0613Dr e) {
            throw A4.A01(e, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd, com.facebook.ads.redexgen.X.InterfaceC0530Ac
    public final int ADU() {
        return 8;
    }
}
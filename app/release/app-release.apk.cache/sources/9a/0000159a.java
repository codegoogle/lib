package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ApicFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.BinaryFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.ChapterTocFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.CommentFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.GeobFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.Id3Frame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.PrivFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.TextInformationFrame;
import com.facebook.ads.internal.exoplayer2.metadata.id3.UrlLinkFrame;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class ZP implements InterfaceC0618Dy {
    public static byte[] A01;
    public static String[] A02;
    public static final int A03;
    public static final EA A04;
    public final EA A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 21 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:202)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:134)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:564)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static ChapterFrame A06(IQ iq, int i, int i2, boolean z, int i3, EA ea) throws UnsupportedEncodingException {
        int A07 = iq.A07();
        int A022 = A02(iq.A00, A07);
        String str = new String(iq.A00, A07, A022 - A07, A0I(169, 10, 52));
        iq.A0Z(A022 + 1);
        int A09 = iq.A09();
        int A092 = iq.A09();
        long A0N = iq.A0N();
        if (A0N == 4294967295L) {
            A0N = -1;
        }
        long A0N2 = iq.A0N();
        if (A0N2 == 4294967295L) {
            A0N2 = -1;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = A07 + i;
        while (iq.A07() < i4) {
            Id3Frame A0B = A0B(i2, iq, z, i3, ea);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterFrame(str, A09, A092, A0N, A0N2, id3FrameArr);
    }

    public static String A0I(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A0L() {
        A01 = new byte[]{-4, 58, -4, 58, -4, 58, -103, -41, -103, -41, -103, -41, -103, -41, -51, -63, 7, 19, 2, 14, 6, -12, 10, 27, 6, -34, 38, 67, 86, 67, 2, 86, 81, 81, 2, 85, 74, 81, 84, 86, 2, 86, 81, 2, 68, 71, 2, 67, 80, 2, 43, 38, 21, 2, 86, 67, 73, 16, 43, 51, 54, 47, 46, -22, 62, 57, -22, 46, 47, 45, 57, 46, 47, -22, 48, 60, 43, 55, 47, 4, -22, 51, 46, 7, -78, -51, -43, -40, -47, -48, -116, -32, -37, -116, -30, -51, -40, -43, -48, -51, -32, -47, -116, -75, -80, -97, -116, -32, -51, -45, -116, -29, -43, -32, -44, -116, bx.l7, -51, -42, -37, -34, -62, -47, -34, -33, -43, -37, -38, -87, -38, 6, -11, 1, -7, -76, 7, -3, 14, -7, -76, -7, 12, -9, -7, -7, -8, 7, -76, 6, -7, 1, -11, -3, 2, -3, 2, -5, -76, 8, -11, -5, -76, -8, -11, 8, -11, 10, 5, -12, -25, -15, -19, -53, -42, -42, -45, -41, -53, -49, 37, 64, 15, 32, 65, ax5.a, 75, 64, 65, 78, -19, 5, 3, 10, 10, -1, -2, -70, -29, -34, -51, -70, 14, -5, 1, -70, 17, 3, 14, 2, -70, 7, -5, 4, 9, 12, -16, -1, 12, 13, 3, 9, 8, -41, -52, -70, -5, 8, -2, -70, 15, 8, -2, -1, 0, 3, 8, -1, -2, -70, -3, 9, 7, 10, 12, -1, 13, 13, 3, 9, 8, -70, 13, -3, 2, -1, 7, -1, -25, -1, -3, 4, 4, -7, -8, -76, -35, -40, -57, -76, 8, -11, -5, -76, Flags.CD, -3, 8, -4, -76, 9, 2, 7, 9, 4, 4, 3, 6, 8, -7, -8, -76, 1, -11, -2, 3, 6, -22, -7, 6, 7, -3, 3, 2, -47, 49, 73, 71, 78, 78, 71, 76, 69, -2, 83, 76, 81, 83, 78, 78, 77, 80, 82, 67, 66, -2, 65, 77, 75, 78, 80, 67, 81, 81, 67, 66, -2, 77, 80, -2, 67, 76, 65, 80, 87, 78, 82, 67, 66, -2, 68, 80, ax5.a, 75, 67, 20, 24, 24, 24, -60, -61, -75, -100, -96, -91, -61, -62, -76, -101, -97, -92, -80, -77, 59, 58, 44, 19, 30, 38, ax5.a, 54, 73, 65, 54, 52, 69, 54, 53, -15, 55, 58, 67, 68, 69, -15, 69, 57, 67, 54, 54, -15, 51, 74, 69, 54, 68, -15, 64, 55, -15, 26, 21, 4, -15, 69, 50, 56, -15, 57, 54, 50, 53, 54, 67, Flags.CD, -15, -18, 7, 12, 14, 9, 9, 8, Flags.CD, 13, -2, -3, -71, -4, 1, -6, Flags.CD, -6, -4, 13, -2, Flags.CD, -71, -2, 7, -4, 8, -3, 2, 7, 0, -47, -46, -46, -46, 18, 22, 10, 16, 14, -40, -4, 0, -12, -6, -8, -62, -3, 3, -8, -6, bx.j7, -27, bx.l7, -33, -35, -89, -30, -24, -33};
    }

    public static void A0M() {
        A02 = new String[]{"sMUxEv8h1aqUKtOfXRhWvF4cd3jhCIiv", "2", "jdWxaIwDf600E5fQi1jvtrBwOfx6AZo5", "VxysSZONWs4Fbmb", "6vXrI6nW4BVssue1T84qDnzAdKjaXJyK", "dpBJthFwlwkteZKALF9GwsW9kwjpNbjg", "2vyk08U", "E"};
    }

    static {
        A0M();
        A0L();
        A04 = new ZO();
        A03 = C0726Ig.A08(A0I(166, 3, 87));
    }

    public ZP() {
        this(null);
    }

    public ZP(EA ea) {
        this.A00 = ea;
    }

    public static int A00(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static int A01(IQ iq, int i) {
        byte[] bArr = iq.A00;
        for (int A07 = iq.A07(); A07 + 1 < i; A07++) {
            if ((bArr[A07] & 255) == 255 && bArr[A07 + 1] == 0) {
                System.arraycopy(bArr, A07 + 2, bArr, A07 + 1, (i - A07) - 2);
                i--;
            }
        }
        return i;
    }

    public static int A02(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int A03(byte[] bArr, int i, int i2) {
        int A022 = A02(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return A022;
        }
        while (A022 < bArr.length - 1) {
            if (A022 % 2 == 0 && bArr[A022 + 1] == 0) {
                return A022;
            }
            A022 = A02(bArr, A022 + 1);
        }
        return bArr.length;
    }

    public static ApicFrame A04(IQ iq, int i, int i2) throws UnsupportedEncodingException {
        int A022;
        String A0M;
        int A0F = iq.A0F();
        String A0H = A0H(A0F);
        byte[] bArr = new byte[i - 1];
        iq.A0d(bArr, 0, i - 1);
        String A0I = A0I(458, 6, 63);
        String A0I2 = A0I(169, 10, 52);
        if (i2 == 2) {
            A022 = 2;
            A0M = A0I + C0726Ig.A0M(new String(bArr, 0, 3, A0I2));
            if (A0I(474, 9, 14).equals(A0M)) {
                A0M = A0I(464, 10, 41);
            }
        } else {
            A022 = A02(bArr, 0);
            A0M = C0726Ig.A0M(new String(bArr, 0, A022, A0I2));
            if (A0M.indexOf(47) == -1) {
                A0M = A0I + A0M;
            }
        }
        int encoding = bArr[A022 + 1] & 255;
        int i3 = A022 + 2;
        int A032 = A03(bArr, i3, A0F);
        int descriptionEndIndex = A032 - i3;
        String str = new String(bArr, i3, descriptionEndIndex, A0H);
        int descriptionEndIndex2 = bArr.length;
        byte[] pictureData = A0O(bArr, A00(A0F) + A032, descriptionEndIndex2);
        return new ApicFrame(A0M, str, encoding, pictureData);
    }

    public static BinaryFrame A05(IQ iq, int i, String str) {
        byte[] bArr = new byte[i];
        iq.A0d(bArr, 0, i);
        return new BinaryFrame(str, bArr);
    }

    public static ChapterTocFrame A07(IQ iq, int framePosition, int elementIdEndIndex, boolean z, int limit, EA ea) throws UnsupportedEncodingException {
        int A07 = iq.A07();
        int A022 = A02(iq.A00, A07);
        String A0I = A0I(169, 10, 52);
        String str = new String(iq.A00, A07, A022 - A07, A0I);
        iq.A0Z(A022 + 1);
        int A0F = iq.A0F();
        boolean z2 = (A0F & 2) != 0;
        boolean z3 = (A0F & 1) != 0;
        int ctocFlags = iq.A0F();
        String[] strArr = new String[ctocFlags];
        for (int i = 0; i < ctocFlags; i++) {
            int A072 = iq.A07();
            int i2 = A02(iq.A00, A072);
            int startIndex = i2 - A072;
            String elementId = new String(iq.A00, A072, startIndex, A0I);
            strArr[i] = elementId;
            int startIndex2 = i2 + 1;
            iq.A0Z(startIndex2);
        }
        ArrayList arrayList = new ArrayList();
        int i3 = A07 + framePosition;
        while (iq.A07() < i3) {
            Id3Frame A0B = A0B(elementIdEndIndex, iq, z, limit, ea);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        Id3Frame[] id3FrameArr = new Id3Frame[arrayList.size()];
        arrayList.toArray(id3FrameArr);
        return new ChapterTocFrame(str, z2, z3, strArr, id3FrameArr);
    }

    public static CommentFrame A08(IQ iq, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int A0F = iq.A0F();
        String A0H = A0H(A0F);
        byte[] data = new byte[3];
        iq.A0d(data, 0, 3);
        String str = new String(data, 0, 3);
        byte[] bArr = new byte[i - 4];
        iq.A0d(bArr, 0, i - 4);
        int A032 = A03(bArr, 0, A0F);
        String str2 = new String(bArr, 0, A032, A0H);
        int A00 = A00(A0F) + A032;
        int textEndIndex = A03(bArr, A00, A0F);
        String text = A0K(bArr, A00, textEndIndex, A0H);
        return new CommentFrame(str, str2, text);
    }

    public static GeobFrame A09(IQ iq, int i) throws UnsupportedEncodingException {
        int A0F = iq.A0F();
        String A0H = A0H(A0F);
        byte[] bArr = new byte[i - 1];
        iq.A0d(bArr, 0, i - 1);
        int A022 = A02(bArr, 0);
        String str = new String(bArr, 0, A022, A0I(169, 10, 52));
        int i2 = A022 + 1;
        int filenameEndIndex = A03(bArr, i2, A0F);
        String A0K = A0K(bArr, i2, filenameEndIndex, A0H);
        int A00 = A00(A0F) + filenameEndIndex;
        int filenameEndIndex2 = A03(bArr, A00, A0F);
        String description = A0K(bArr, A00, filenameEndIndex2, A0H);
        int objectDataStartIndex = A00(A0F) + filenameEndIndex2;
        return new GeobFrame(str, A0K, description, A0O(bArr, objectDataStartIndex, bArr.length));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
        if (r4 == 1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008e, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0090, code lost:
        if (r0 == 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0092, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        android.util.Log.w(r7, A0I(189, 68, 48));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a3, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
        if (r4 == 2) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
        if (r4 != 3) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c5, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
        if (r0 == 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c9, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ca, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r0 = r9.A09();
        r9.A0a(r0);
        r2 = r2 - (r0 + 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00da, code lost:
        if (r0 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e4, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e6, code lost:
        if (r4 != r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e8, code lost:
        r0 = r6 & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ea, code lost:
        if (r0 == 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ec, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ed, code lost:
        if (r0 == 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ef, code lost:
        r1 = r9.A0E();
        r0 = r1 - 4;
        r9.A0a(r0);
        r2 = r2 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f9, code lost:
        r0 = r6 & 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r0 == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00fd, code lost:
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00fe, code lost:
        if (r0 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0100, code lost:
        r2 = r2 - 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0105, code lost:
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0107, code lost:
        android.util.Log.w(r7, A0I(257, 46, 42) + r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0123, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EB A0A(IQ iq) {
        boolean hasExtendedHeader;
        int A0F;
        int majorVersion;
        int i;
        int A05 = iq.A05();
        String A0I = A0I(179, 10, 114);
        if (A05 < 10) {
            Log.w(A0I, A0I(26, 31, 120));
            return null;
        }
        int A0H = iq.A0H();
        int i2 = A03;
        if (A02[6].length() != 10) {
            String[] strArr = A02;
            strArr[4] = "kM9OkNaCjXVxyVGGYDl1GeNoSaMBgklA";
            strArr[4] = "kM9OkNaCjXVxyVGGYDl1GeNoSaMBgklA";
            if (A0H != i2) {
                Log.w(A0I, A0I(376, 48, 103) + A0H);
                return null;
            }
            int A0F2 = iq.A0F();
            if (A02[0].charAt(13) != 't') {
                String[] strArr2 = A02;
                strArr2[0] = "VHOwCaxYLj8vFtl4Ur4MSRRrARLF1Bma";
                strArr2[0] = "VHOwCaxYLj8vFtl4Ur4MSRRrARLF1Bma";
                hasExtendedHeader = false;
                iq.A0a(0);
                A0F = iq.A0F();
                majorVersion = iq.A0E();
                i = 3;
            } else {
                String[] strArr3 = A02;
                strArr3[0] = "p94ARmBUNLq0Xt6llw1RhFZLPqWNHfk6";
                strArr3[0] = "p94ARmBUNLq0Xt6llw1RhFZLPqWNHfk6";
                hasExtendedHeader = true;
                iq.A0a(1);
                A0F = iq.A0F();
                majorVersion = iq.A0E();
                i = 4;
            }
            if (A0F2 < i) {
                int flags = A0F & 128;
            }
            hasExtendedHeader = false;
            return new EB(A0F2, hasExtendedHeader, majorVersion);
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x019f, code lost:
        if (r8 == 67) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Id3Frame A0B(int i, IQ iq, boolean z, int i2, EA ea) {
        int frameId2;
        int frameSize;
        int i3;
        Id3Frame A07;
        int A0F = iq.A0F();
        int A0F2 = iq.A0F();
        int frameId0 = iq.A0F();
        if (i >= 3) {
            frameId2 = iq.A0F();
        } else {
            frameId2 = 0;
        }
        if (i == 4) {
            int A0I = iq.A0I();
            if (!z) {
                int frameId3 = A0I >> 8;
                int i4 = (A0I & 255) | ((frameId3 & 255) << 7);
                int frameId32 = A0I >> 16;
                int i5 = i4 | ((frameId32 & 255) << 14);
                int frameId33 = A0I >> 24;
                frameSize = i5 | ((frameId33 & 255) << 21);
            } else {
                frameSize = A0I;
            }
        } else if (i == 3) {
            frameSize = iq.A0I();
        } else {
            frameSize = iq.A0H();
        }
        if (i >= 3) {
            i3 = iq.A0J();
        } else {
            i3 = 0;
        }
        if (A0F == 0 && A0F2 == 0 && frameId0 == 0 && frameId2 == 0 && frameSize == 0 && i3 == 0) {
            int frameId34 = iq.A08();
            iq.A0Z(frameId34);
            return null;
        }
        int A072 = iq.A07() + frameSize;
        int A08 = iq.A08();
        String A0I2 = A0I(179, 10, 114);
        if (A072 > A08) {
            Log.w(A0I2, A0I(129, 37, 42));
            int frameId35 = iq.A08();
            iq.A0Z(frameId35);
            return null;
        } else if (ea != null && !ea.A4x(i, A0F, A0F2, frameId0, frameId2)) {
            return null;
        } else {
            int i6 = 0;
            boolean z2 = false;
            int nextFramePosition = 0;
            int frameId36 = 0;
            boolean z3 = false;
            if (i == 3) {
                int frameId37 = i3 & 128;
                frameId36 = frameId37 != 0 ? 1 : 0;
                int frameId1 = i3 & 64;
                z2 = frameId1 != 0;
                z3 = (i3 & 32) != 0;
                i6 = frameId36;
            } else if (i == 4) {
                z3 = (i3 & 64) != 0;
                i6 = (i3 & 8) != 0 ? 1 : 0;
                z2 = (i3 & 4) != 0;
                nextFramePosition = (i3 & 2) != 0 ? 1 : 0;
                frameId36 = (i3 & 1) != 0 ? 1 : 0;
            }
            if (i6 != 0 || z2) {
                Log.w(A0I2, A0I(303, 50, 116));
                return null;
            }
            if (z3) {
                frameSize--;
                iq.A0a(1);
            }
            if (frameId36 != 0) {
                frameSize -= 4;
                iq.A0a(4);
            }
            if (nextFramePosition != 0) {
                frameSize = A01(iq, frameSize);
            }
            try {
                if (A0F == 84 && A0F2 == 88 && frameId0 == 88 && (i == 2 || frameId2 == 88)) {
                    A07 = A0D(iq, frameSize);
                } else if (A0F == 84) {
                    A07 = A0E(iq, frameSize, A0J(i, A0F, A0F2, frameId0, frameId2));
                } else if (A0F == 87 && A0F2 == 88 && frameId0 == 88 && (i == 2 || frameId2 == 88)) {
                    A07 = A0F(iq, frameSize);
                } else if (A0F == 87) {
                    A07 = A0G(iq, frameSize, A0J(i, A0F, A0F2, frameId0, frameId2));
                } else if (A0F == 80 && A0F2 == 82 && frameId0 == 73 && frameId2 == 86) {
                    A07 = A0C(iq, frameSize);
                } else if (A0F == 71 && A0F2 == 69 && frameId0 == 79 && (frameId2 == 66 || i == 2)) {
                    A07 = A09(iq, frameSize);
                } else if (i == 2) {
                    if (A0F == 80 && A0F2 == 73 && frameId0 == 67) {
                        A07 = A04(iq, frameSize, i);
                    }
                    if (A0F == 67 && A0F2 == 79 && frameId0 == 77) {
                        if (A02[6].length() != 10) {
                            throw new RuntimeException();
                        }
                        String[] strArr = A02;
                        strArr[6] = "MgxBnjmYjV6";
                        strArr[6] = "MgxBnjmYjV6";
                        if (frameId2 == 77 || i == 2) {
                            A07 = A08(iq, frameSize);
                        }
                    }
                    if (A0F != 67 && A0F2 == 72 && frameId0 == 65 && frameId2 == 80) {
                        A07 = A06(iq, frameSize, i, z, i2, ea);
                    } else {
                        A07 = (A0F != 67 && A0F2 == 84 && frameId0 == 79 && frameId2 == 67) ? A07(iq, frameSize, i, z, i2, ea) : A05(iq, frameSize, A0J(i, A0F, A0F2, frameId0, frameId2));
                    }
                } else {
                    if (A0F == 65) {
                        if (A0F2 == 80) {
                            if (frameId0 == 73) {
                            }
                        }
                    }
                    if (A0F == 67) {
                        if (A02[6].length() != 10) {
                        }
                    }
                    if (A0F != 67) {
                    }
                    if (A0F != 67) {
                    }
                }
                if (A07 == null) {
                    Log.w(A0I2, A0I(57, 27, 96) + A0J(i, A0F, A0F2, frameId0, frameId2) + A0I(14, 12, 55) + frameSize);
                }
                return A07;
            } catch (UnsupportedEncodingException unused) {
                Log.w(A0I2, A0I(aa.c.v, 30, 47));
                return null;
            } finally {
                iq.A0Z(A072);
            }
        }
    }

    public static PrivFrame A0C(IQ iq, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        iq.A0d(bArr, 0, i);
        int A022 = A02(bArr, 0);
        return new PrivFrame(new String(bArr, 0, A022, A0I(169, 10, 52)), A0O(bArr, A022 + 1, bArr.length));
    }

    public static TextInformationFrame A0D(IQ iq, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int A0F = iq.A0F();
        String A0H = A0H(A0F);
        byte[] bArr = new byte[i - 1];
        iq.A0d(bArr, 0, i - 1);
        int descriptionEndIndex = A03(bArr, 0, A0F);
        String str = new String(bArr, 0, descriptionEndIndex, A0H);
        int A00 = A00(A0F) + descriptionEndIndex;
        String description = A0K(bArr, A00, A03(bArr, A00, A0F), A0H);
        return new TextInformationFrame(A0I(353, 4, 86), str, description);
    }

    public static TextInformationFrame A0E(IQ iq, int encoding, String charset) throws UnsupportedEncodingException {
        if (encoding < 1) {
            return null;
        }
        int A0F = iq.A0F();
        String A0H = A0H(A0F);
        byte[] bArr = new byte[encoding - 1];
        iq.A0d(bArr, 0, encoding - 1);
        int valueEndIndex = A03(bArr, 0, A0F);
        String value = new String(bArr, 0, valueEndIndex, A0H);
        return new TextInformationFrame(charset, null, value);
    }

    public static UrlLinkFrame A0F(IQ iq, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            String[] strArr = A02;
            if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                String[] strArr2 = A02;
                strArr2[7] = "x";
                strArr2[1] = "0";
                return null;
            }
            throw new RuntimeException();
        }
        int descriptionEndIndex = iq.A0F();
        String A0H = A0H(descriptionEndIndex);
        byte[] bArr = new byte[i - 1];
        iq.A0d(bArr, 0, i - 1);
        int A032 = A03(bArr, 0, descriptionEndIndex);
        String str = new String(bArr, 0, A032, A0H);
        int A00 = A00(descriptionEndIndex) + A032;
        String A0K = A0K(bArr, A00, A02(bArr, A00), A0I(169, 10, 52));
        String url = A0I(454, 4, 16);
        return new UrlLinkFrame(url, str, A0K);
    }

    public static UrlLinkFrame A0G(IQ iq, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        iq.A0d(bArr, 0, i);
        return new UrlLinkFrame(str, null, new String(bArr, 0, A02(bArr, 0), A0I(169, 10, 52)));
    }

    public static String A0H(int i) {
        String A0I = A0I(169, 10, 52);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return A0I;
                    }
                    String[] strArr = A02;
                    if (strArr[2].charAt(11) != strArr[5].charAt(11)) {
                        String[] strArr2 = A02;
                        strArr2[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
                        strArr2[0] = "Xs3p10eLQltfrtGuZ9I87GBEYIMhEDM2";
                        return A0I(371, 5, 124);
                    }
                    throw new RuntimeException();
                }
                return A0I(363, 8, 4);
            }
            return A0I(357, 6, 5);
        }
        return A0I;
    }

    public static String A0J(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, A0I(0, 6, 109), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)) : String.format(Locale.US, A0I(6, 8, 10), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
    }

    public static String A0K(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return A0I(0, 0, 105);
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ac, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r7 = 0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
        if (r12 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b2, code lost:
        r7 = r7 + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b7, code lost:
        if (r3 >= r7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        r17.A0Z(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00bc, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bd, code lost:
        if (r8 != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
        if (r17.A05() >= r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e8, code lost:
        r17.A0Z(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00eb, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0N(IQ iq, int i, int i2, boolean z) {
        int flags;
        long A0N;
        int A0J;
        int id = iq.A07();
        while (true) {
            try {
                if (iq.A05() < i2) {
                    iq.A0Z(id);
                    return true;
                }
                if (i >= 3) {
                    try {
                        flags = iq.A09();
                        A0N = iq.A0N();
                        A0J = iq.A0J();
                    } catch (Throwable th) {
                        th = th;
                        iq.A0Z(id);
                        throw th;
                    }
                } else {
                    flags = iq.A0H();
                    A0N = iq.A0H();
                    A0J = 0;
                }
                if (flags == 0 && A0N == 0 && A0J == 0) {
                    iq.A0Z(id);
                    return true;
                }
                if (i == 4 && !z) {
                    if ((8421504 & A0N) != 0) {
                        iq.A0Z(id);
                        return false;
                    }
                    A0N = (((A0N >> 24) & 255) << 21) | (A0N & 255) | (((A0N >> 8) & 255) << 7) | (((A0N >> 16) & 255) << 14);
                }
                boolean z2 = false;
                boolean z3 = false;
                int flags2 = A02[3].length();
                if (flags2 == 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A02;
                strArr[6] = "Si8fg";
                strArr[6] = "Si8fg";
                if (i == 4) {
                    z2 = (A0J & 64) != 0;
                    z3 = (A0J & 1) != 0;
                } else if (i == 3) {
                    z2 = (A0J & 32) != 0;
                    z3 = (A0J & 128) != 0;
                }
                int i3 = 0;
                if (A02[3].length() != 29) {
                    String[] strArr2 = A02;
                    strArr2[4] = "6PropUQXGZAV570tqu6sTLuUZZkOZmcy";
                    strArr2[4] = "6PropUQXGZAV570tqu6sTLuUZZkOZmcy";
                }
                iq.A0a((int) A0N);
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public static byte[] A0O(byte[] bArr, int i, int i2) {
        if (i2 <= i) {
            return new byte[0];
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i, i2);
        if (A02[3].length() != 29) {
            String[] strArr = A02;
            strArr[2] = "BXfcBk8SW4yeYxu44B11cVVkBGYBzlAv";
            strArr[5] = "okWvwdNSxMQpYeQbiZnCLiGxFx7BKew9";
            return copyOfRange;
        }
        throw new RuntimeException();
    }

    public final Metadata A0P(byte[] bArr, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        IQ iq = new IQ(bArr, i);
        EB A0A = A0A(iq);
        if (A0A == null) {
            return null;
        }
        int A07 = iq.A07();
        i2 = A0A.A01;
        int i9 = i2 == 2 ? 6 : 10;
        i3 = A0A.A00;
        z = A0A.A02;
        if (z) {
            i8 = A0A.A00;
            i3 = A01(iq, i8);
        }
        iq.A0Y(A07 + i3);
        boolean unsignedIntFrameSizeHack = false;
        i4 = A0A.A01;
        if (!A0N(iq, i4, i9, false)) {
            i6 = A0A.A01;
            if (A02[4].charAt(24) == '1') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            strArr[0] = "uYZb4rh3wheJht2DQ5CIaEPvRS4bXzrD";
            if (i6 == 4 && A0N(iq, 4, i9, true)) {
                unsignedIntFrameSizeHack = true;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(A0I(84, 45, 2));
                i7 = A0A.A01;
                sb.append(i7);
                Log.w(A0I(179, 10, 114), sb.toString());
                return null;
            }
        }
        while (iq.A05() >= i9) {
            i5 = A0A.A01;
            Id3Frame A0B = A0B(i5, iq, unsignedIntFrameSizeHack, i9, this.A00);
            if (A0B != null) {
                arrayList.add(A0B);
            }
        }
        return new Metadata(arrayList);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Dy
    public final Metadata A4e(CC cc) {
        ByteBuffer byteBuffer = cc.A01;
        return A0P(byteBuffer.array(), byteBuffer.limit());
    }
}
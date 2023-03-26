package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.ij3;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.xbill.DNS.Flags;
import org.xbill.DNS.TTL;

/* renamed from: com.facebook.ads.redexgen.X.Yd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1128Yd implements CK {
    public static byte[] A0X;
    public static String[] A0Y;
    public static final CN A0Z;
    public static final int A0a;
    public static final Format A0b;
    public static final byte[] A0c;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public CM A0C;
    public C0593Cx A0D;
    public IQ A0E;
    public boolean A0F;
    public boolean A0G;
    public CW[] A0H;
    public CW[] A0I;
    public final int A0J;
    public final SparseArray<C0593Cx> A0K;
    @Nullable
    public final DrmInitData A0L;
    @Nullable
    public final CW A0M;
    @Nullable
    public final D6 A0N;
    public final IQ A0O;
    public final IQ A0P;
    public final IQ A0Q;
    public final IQ A0R;
    @Nullable
    public final C0722Ic A0S;
    public final ArrayDeque<YX> A0T;
    public final ArrayDeque<C0592Cw> A0U;
    public final List<Format> A0V;
    public final byte[] A0W;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, YC> A04(IQ iq, long j) throws AN {
        long A0O;
        long A0O2;
        iq.A0Z(8);
        int A01 = AbstractC0581Cl.A01(iq.A09());
        iq.A0a(4);
        long A0N = iq.A0N();
        if (A01 == 0) {
            A0O = iq.A0N();
            A0O2 = j + iq.A0N();
        } else {
            A0O = iq.A0O();
            A0O2 = j + iq.A0O();
        }
        long A0F = C0726Ig.A0F(A0O, 1000000L, A0N);
        iq.A0a(2);
        int A0J = iq.A0J();
        int[] iArr = new int[A0J];
        long[] jArr = new long[A0J];
        long[] jArr2 = new long[A0J];
        long[] jArr3 = new long[A0J];
        if (A0Y[2].charAt(18) != 'K') {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[5] = "s";
        strArr[5] = "s";
        int i = 0;
        long j2 = A0F;
        while (i < A0J) {
            int A09 = iq.A09();
            if ((Integer.MIN_VALUE & A09) != 0) {
                throw new AN(A0A(581, 28, 75));
            }
            long A0N2 = iq.A0N();
            iArr[i] = Integer.MAX_VALUE & A09;
            jArr[i] = A0O2;
            jArr3[i] = j2;
            A0O += A0N2;
            j2 = C0726Ig.A0F(A0O, 1000000L, A0N);
            jArr2[i] = j2 - jArr3[i];
            iq.A0a(4);
            int i2 = iArr[i];
            if (A0Y[3].length() != 6) {
                String[] strArr2 = A0Y;
                strArr2[1] = "dhc";
                strArr2[1] = "dhc";
                A0O2 += i2;
                i += 0;
            } else {
                String[] strArr3 = A0Y;
                strArr3[5] = "h";
                strArr3[5] = "h";
                A0O2 += i2;
                i++;
            }
        }
        return Pair.create(Long.valueOf(A0F), new YC(iArr, jArr, jArr2, jArr3));
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0X, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 85);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0X = new byte[]{76, 64, Flags.CD, 62, 37, 39, 106, 57, 35, 48, 47, 106, 38, 47, 57, 57, 106, 62, 34, 43, 36, 106, 34, 47, 43, 46, 47, 56, 106, 38, 47, 36, 45, 62, 34, 106, 98, ax5.a, 36, 57, ax5.a, 58, 58, 37, 56, 62, 47, 46, 99, 100, 104, 67, 89, 95, 84, 13, 78, 66, 88, 67, 89, 13, 68, 67, 13, 94, 79, 74, 93, 13, 12, 16, 13, 28, 13, 5, 88, 67, 94, 88, 93, 93, 66, 95, 89, 72, 73, 4, 3, 5, 46, 52, 50, 57, 96, 35, 47, 53, 46, 52, 96, 41, 46, 96, 51, 39, 48, 36, 96, 97, 125, 96, 113, 96, 104, 53, 46, 51, 53, 48, 48, 47, 50, 52, 37, 36, 105, 110, 29, 41, 58, 60, 54, 62, 53, 47, 62, ax5.a, 22, 43, 111, 30, 35, 47, 41, 58, 56, 47, 52, 41, 4, bx.W5, 35, 34, ax5.a, 36, 35, bx.W5, 109, 35, 40, bx.W5, 44, 57, 36, 59, 40, 109, 34, 43, 43, 62, 40, 57, 109, 57, 34, 109, 62, 44, 32, 61, 33, 40, 109, 41, 44, 57, 44, 99, 110, 71, 67, 68, 2, 67, 86, 77, 79, 2, 70, 71, 68, 75, 76, 71, 81, 2, 71, 90, 86, 71, 76, 70, 71, 70, 2, 67, 86, 77, 79, 2, 81, 75, 88, 71, 2, 10, 87, 76, 81, 87, 82, 82, 77, 80, 86, 71, 70, Flags.CD, 12, 38, 15, Flags.CD, 12, 74, Flags.CD, 30, 5, 7, 74, 29, 3, 30, 2, 74, 6, 15, 4, 13, 30, 2, 74, 84, 74, 88, 91, 94, 93, 94, 82, 89, 92, 94, 93, 74, 66, 31, 4, 25, 31, 26, 26, 5, 24, 30, 15, 14, 67, 68, 97, 72, 67, 74, 89, 69, 13, 64, 68, 94, 64, 76, 89, 78, 69, 23, 13, 88, 113, 113, 100, 114, 99, 55, 99, 120, 55, 114, 121, 116, 101, 110, 103, 99, 126, 120, 121, 55, 115, 118, 99, 118, 55, 96, 118, 100, 55, 121, 114, 112, 118, 99, 126, 97, 114, 57, 22, ax5.a, ax5.a, bx.W5, 60, 45, 121, 45, 54, 121, 60, 55, 61, 121, 54, ax5.a, 121, 52, 61, 56, 45, 121, 46, 56, bx.W5, 121, 55, 60, 62, 56, 45, 48, 47, 60, 119, 84, 109, 126, 105, 105, 114, g15.c, 114, 117, 124, 59, 79, 105, 122, 120, 112, 94, 117, 120, 105, 98, 107, 111, 114, 116, 117, 89, 116, 99, 59, 107, 122, 105, 122, 118, 126, 111, 126, 105, 104, 59, 114, 104, 59, 110, 117, 104, 110, 107, 107, 116, 105, 111, 126, g15.c, 53, 107, 83, 81, 72, 72, 93, 92, 24, 72, 75, 75, 80, 24, 89, 76, 87, 85, 24, 16, 94, 89, 81, 84, 93, 92, 24, 76, 87, 24, 93, 64, 76, 74, 89, 91, 76, 24, 77, 77, 81, 92, 17, 105, 81, 83, 74, 74, 83, 84, 93, 26, 91, 78, 85, 87, 26, 77, 83, 78, 82, 26, 86, 95, 84, 93, 78, 82, 26, 4, 26, 8, Flags.CD, 14, 13, 14, 2, 9, 12, 14, 13, 26, 18, 79, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 19, 20, Flags.CD, 48, 59, 38, 46, 59, 61, bx.W5, 59, 58, 126, 51, 49, 49, 40, 126, 60, 49, 38, 112, 95, 100, 111, 114, 122, 111, 105, 126, 111, 110, bx.W5, 121, 107, 99, 101, bx.W5, 111, 100, 126, 120, 115, bx.W5, 105, 101, g15.c, 100, 126, 48, bx.W5, 75, 112, 118, g15.c, 112, 122, 114, 123, 122, 62, 119, 112, 122, 119, 108, 123, 125, 106, 62, 108, 123, 120, 123, 108, 123, 112, 125, 123, 41, 30, 13, 22, 30, 29, 19, 26, 95, 19, 26, 17, 24, Flags.CD, 23, 95, 27, 26, 12, 28, 13, 22, 15, Flags.CD, 22, 16, 17, 95, 22, 17, 95, 12, 24, 15, 27, 95, 25, 16, 10, 17, 27, 95, 87, 10, 17, 12, 10, 15, 15, 16, 13, Flags.CD, 26, 27, 86, 3, 18, 18, 14, Flags.CD, 1, 3, 22, Flags.CD, 13, 12, 77, 26, 79, 7, 15, 17, 5, 62, 40, 36, bx.W5, 46, 49, 60, 61, 55, 119, 48, 61, 46, 59, 61, 34, 47, 46, 36, 100, 38, 59, g15.c};
    }

    public static void A0E() {
        A0Y = new String[]{"bw2Pz5UYSLOOesGIJaWlA3GOzVLZPAg", "gG3", "yjdYoV9UEi8qMqqcqGKRK6SXbov0CwAj", "4kzePG", "OMn6r0AgRGwk9BJzU", ij3.b, "aMFqcwP4FMZJ2yTkvuTBoGT2vGZy4ax", "h66GloOgbywQ1e6PB204dGM9vAJrPucq"};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0N(YX yx, SparseArray<C0593Cx> sparseArray, int i, byte[] bArr) throws AN {
        C0593Cx A09 = A09(yx.A07(AbstractC0581Cl.A1I).A00, sparseArray);
        if (A09 == null) {
            return;
        }
        D8 d8 = A09.A07;
        long j = d8.A06;
        A09.A05();
        if (yx.A07(AbstractC0581Cl.A1H) != null && (i & 2) == 0) {
            j = A02(yx.A07(AbstractC0581Cl.A1H).A00);
        }
        A0O(yx, A09, j, i);
        D7 A00 = A09.A05.A00(d8.A07.A02);
        YY A07 = yx.A07(AbstractC0581Cl.A0u);
        if (A07 != null) {
            A0Q(A00, A07.A00, d8);
        }
        YY A072 = yx.A07(AbstractC0581Cl.A0t);
        if (A072 != null) {
            A0T(A072.A00, d8);
        }
        YY A073 = yx.A07(AbstractC0581Cl.A10);
        if (A073 != null) {
            A0U(A073.A00, d8);
        }
        YY A074 = yx.A07(AbstractC0581Cl.A0x);
        YY A075 = yx.A07(AbstractC0581Cl.A11);
        if (A074 != null && A075 != null) {
            A0W(A074.A00, A075.A00, A00 != null ? A00.A02 : null, d8);
        }
        int size = yx.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            YY yy = yx.A02.get(i2);
            int i3 = ((AbstractC0581Cl) yy).A00;
            int i4 = AbstractC0581Cl.A1Q;
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "tWuQt3qCpORkhzaHtCNFkUwj420xxTd";
            strArr[4] = "yKRRCTery0iDoE3P4";
            if (i3 == i4) {
                A0V(yy.A00, d8, bArr);
            }
        }
    }

    static {
        A0E();
        A0D();
        A0Z = new C1127Yc();
        A0a = C0726Ig.A08(A0A(682, 4, 24));
        A0c = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0b = Format.A02(null, A0A(664, 18, 55), Long.MAX_VALUE);
    }

    public C1128Yd() {
        this(0);
    }

    public C1128Yd(int i) {
        this(i, null);
    }

    public C1128Yd(int i, @Nullable C0722Ic c0722Ic) {
        this(i, c0722Ic, null, null);
    }

    public C1128Yd(int i, @Nullable C0722Ic c0722Ic, @Nullable D6 d6, @Nullable DrmInitData drmInitData) {
        this(i, c0722Ic, d6, drmInitData, Collections.emptyList());
    }

    public C1128Yd(int i, @Nullable C0722Ic c0722Ic, @Nullable D6 d6, @Nullable DrmInitData drmInitData, List<Format> closedCaptionFormats) {
        this(i, c0722Ic, d6, drmInitData, closedCaptionFormats, null);
    }

    public C1128Yd(int i, @Nullable C0722Ic c0722Ic, @Nullable D6 d6, @Nullable DrmInitData drmInitData, List<Format> list, @Nullable CW cw) {
        this.A0J = (d6 != null ? 8 : 0) | i;
        this.A0S = c0722Ic;
        this.A0N = d6;
        this.A0L = drmInitData;
        List<Format> closedCaptionFormats = Collections.unmodifiableList(list);
        this.A0V = closedCaptionFormats;
        this.A0M = cw;
        this.A0O = new IQ(16);
        this.A0R = new IQ(IM.A03);
        this.A0Q = new IQ(5);
        this.A0P = new IQ();
        this.A0W = new byte[16];
        this.A0T = new ArrayDeque<>();
        this.A0U = new ArrayDeque<>();
        this.A0K = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        A0B();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
        r22 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x011f, code lost:
        if (r10 != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0122, code lost:
        r22 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int A00(C0593Cx c0593Cx, int fullAtom, long j, int i, IQ iq, int i2) {
        boolean z;
        int i3;
        int i4;
        int A09;
        long j2 = j;
        int sampleOffset = i2;
        iq.A0Z(8);
        int A00 = AbstractC0581Cl.A00(iq.A09());
        D6 d6 = c0593Cx.A05;
        D8 d8 = c0593Cx.A07;
        C0587Cr c0587Cr = d8.A07;
        d8.A0E[fullAtom] = iq.A0I();
        d8.A0G[fullAtom] = d8.A05;
        if ((A00 & 1) != 0) {
            long[] jArr = d8.A0G;
            jArr[fullAtom] = jArr[fullAtom] + iq.A09();
        }
        int i5 = A00 & 4;
        if (A0Y[0].length() != 21) {
            String[] strArr = A0Y;
            strArr[3] = "8XvOch";
            strArr[3] = "8XvOch";
            boolean z2 = i5 != 0;
            int i6 = c0587Cr.A01;
            if (z2) {
                i6 = iq.A0I();
            }
            int firstSampleFlags = A00 & 256;
            boolean z3 = firstSampleFlags != 0;
            int firstSampleFlags2 = A00 & 512;
            boolean z4 = firstSampleFlags2 != 0;
            int i7 = A00 & 1024;
            String[] strArr2 = A0Y;
            String str = strArr2[6];
            String str2 = strArr2[4];
            int length = str.length();
            int firstSampleFlags3 = str2.length();
            if (length != firstSampleFlags3) {
                String[] strArr3 = A0Y;
                strArr3[5] = bx.C4;
                strArr3[5] = bx.C4;
                boolean z5 = i7 != 0;
                int i8 = A00 & 2048;
                String[] strArr4 = A0Y;
                String str3 = strArr4[6];
                String str4 = strArr4[4];
                int length2 = str3.length();
                int firstSampleFlags4 = str4.length();
                if (length2 != firstSampleFlags4) {
                    String[] strArr5 = A0Y;
                    strArr5[7] = "zasX3ZRNe0snbS49DsjMO0V1ZwarOc1g";
                    strArr5[7] = "zasX3ZRNe0snbS49DsjMO0V1ZwarOc1g";
                }
                long j3 = 0;
                if (d6.A08 != null) {
                    int firstSampleFlags5 = d6.A08.length;
                    if (firstSampleFlags5 == 1) {
                        int firstSampleFlags6 = (d6.A08[0] > 0L ? 1 : (d6.A08[0] == 0L ? 0 : -1));
                        if (firstSampleFlags6 == 0) {
                            j3 = C0726Ig.A0F(d6.A09[0], 1000L, d6.A06);
                        }
                    }
                }
                int[] iArr = d8.A0D;
                int[] iArr2 = d8.A0C;
                long[] jArr2 = d8.A0F;
                boolean[] zArr = d8.A0I;
                boolean z6 = d6.A03 == 2 && (i & 1) != 0;
                int i9 = sampleOffset + d8.A0E[fullAtom];
                long j4 = d6.A06;
                if (fullAtom > 0) {
                    j2 = d8.A06;
                }
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0Y;
                strArr6[1] = "0M8";
                strArr6[1] = "0M8";
                while (sampleOffset < i9) {
                    if (z3) {
                        i3 = iq.A0I();
                    } else {
                        i3 = c0587Cr.A00;
                    }
                    if (z4) {
                        i4 = iq.A0I();
                    } else {
                        i4 = c0587Cr.A03;
                        if (A0Y[2].charAt(18) != 'K') {
                            String[] strArr7 = A0Y;
                            strArr7[7] = "sKwSwUd4PCPXhg8k3ZAVhQXOLBVrWjfV";
                            strArr7[7] = "sKwSwUd4PCPXhg8k3ZAVhQXOLBVrWjfV";
                        } else {
                            String[] strArr8 = A0Y;
                            strArr8[5] = "6";
                            strArr8[5] = "6";
                        }
                    }
                    if (sampleOffset == 0 && z2) {
                        A09 = i6;
                    } else {
                        A09 = z5 ? iq.A09() : c0587Cr.A01;
                    }
                    if (z) {
                        int sampleSize = iq.A09();
                        iArr2[sampleOffset] = (int) ((sampleSize * 1000) / j4);
                    } else {
                        iArr2[sampleOffset] = 0;
                    }
                    jArr2[sampleOffset] = C0726Ig.A0F(j2, 1000L, j4) - j3;
                    if (A0Y[5].length() == 1) {
                        String[] strArr9 = A0Y;
                        strArr9[5] = "r";
                        strArr9[5] = "r";
                        iArr[sampleOffset] = i4;
                        zArr[sampleOffset] = ((A09 >> 16) & 1) == 0 && (!z6 || sampleOffset == 0);
                        j2 += i3;
                        sampleOffset++;
                    }
                }
                d8.A06 = j2;
                return i9;
            }
            throw new RuntimeException();
        }
        throw new RuntimeException();
    }

    public static long A01(IQ iq) {
        iq.A0Z(8);
        int version = AbstractC0581Cl.A01(iq.A09());
        return version == 0 ? iq.A0N() : iq.A0O();
    }

    public static long A02(IQ iq) {
        iq.A0Z(8);
        return AbstractC0581Cl.A01(iq.A09()) == 1 ? iq.A0O() : iq.A0N();
    }

    public static Pair<Integer, C0587Cr> A03(IQ iq) {
        iq.A0Z(12);
        int defaultSampleDuration = iq.A09();
        int defaultSampleFlags = iq.A0I() - 1;
        return Pair.create(Integer.valueOf(defaultSampleDuration), new C0587Cr(defaultSampleFlags, iq.A0I(), iq.A0I(), iq.A09()));
    }

    public static DrmInitData A05(List<YY> list) {
        ArrayList arrayList = null;
        int i = list.size();
        for (int i2 = 0; i2 < i; i2++) {
            YY yy = list.get(i2);
            if (((AbstractC0581Cl) yy).A00 == AbstractC0581Cl.A0r) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = yy.A00.A00;
                UUID A03 = D3.A03(bArr);
                if (A03 == null) {
                    Log.w(A0A(128, 22, 14), A0A(437, 42, 109));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(A03, A0A(696, 9, 30), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private C0587Cr A06(SparseArray<C0587Cr> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[3] = "nw8rk4";
            strArr[3] = "nw8rk4";
            return sparseArray.valueAt(0);
        }
        return (C0587Cr) I1.A01(sparseArray.get(i));
    }

    public static C0593Cx A07(SparseArray<C0593Cx> sparseArray) {
        C0593Cx c0593Cx = null;
        long j = Long.MAX_VALUE;
        int i = sparseArray.size();
        for (int i2 = 0; i2 < i; i2++) {
            C0593Cx valueAt = sparseArray.valueAt(i2);
            if (valueAt.A02 != valueAt.A07.A02) {
                long j2 = valueAt.A07.A0G[valueAt.A02];
                if (j2 < j) {
                    c0593Cx = valueAt;
                    j = j2;
                }
            }
        }
        return c0593Cx;
    }

    @Nullable
    public static C0593Cx A08(SparseArray<C0593Cx> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        C0593Cx c0593Cx = sparseArray.get(i);
        if (A0Y[0].length() != 21) {
            String[] strArr = A0Y;
            strArr[1] = "fYJ";
            strArr[1] = "fYJ";
            return c0593Cx;
        }
        throw new RuntimeException();
    }

    public static C0593Cx A09(IQ iq, SparseArray<C0593Cx> sparseArray) {
        int i;
        int i2;
        int i3;
        int i4;
        iq.A0Z(8);
        int A00 = AbstractC0581Cl.A00(iq.A09());
        int trackId = iq.A09();
        C0593Cx A08 = A08(sparseArray, trackId);
        if (A08 == null) {
            return null;
        }
        if ((A00 & 1) != 0) {
            long A0O = iq.A0O();
            A08.A07.A05 = A0O;
            A08.A07.A04 = A0O;
        }
        C0587Cr c0587Cr = A08.A04;
        if ((A00 & 2) != 0) {
            i = iq.A0I() - 1;
        } else {
            i = c0587Cr.A02;
        }
        int defaultSampleDescriptionIndex = A00 & 8;
        if (defaultSampleDescriptionIndex != 0) {
            i2 = iq.A0I();
        } else {
            i2 = c0587Cr.A00;
        }
        int defaultSampleDescriptionIndex2 = A00 & 16;
        if (defaultSampleDescriptionIndex2 != 0) {
            i3 = iq.A0I();
        } else {
            i3 = c0587Cr.A03;
        }
        int defaultSampleSize = A00 & 32;
        if (defaultSampleSize != 0) {
            i4 = iq.A0I();
        } else {
            i4 = c0587Cr.A01;
        }
        A08.A07.A07 = new C0587Cr(i, i2, i3, i4);
        return A08;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    private void A0C() {
        if (this.A0I == null) {
            this.A0I = new CW[2];
            int i = 0;
            CW cw = this.A0M;
            if (cw != null) {
                int emsgTrackOutputCount = 0 + 1;
                this.A0I[0] = cw;
                i = emsgTrackOutputCount;
            }
            int emsgTrackOutputCount2 = this.A0J;
            if ((emsgTrackOutputCount2 & 4) != 0) {
                CW[] cwArr = this.A0I;
                CM cm = this.A0C;
                int emsgTrackOutputCount3 = this.A0K.size();
                cwArr[i] = cm.ADY(emsgTrackOutputCount3, 4);
                i++;
            }
            this.A0I = (CW[]) Arrays.copyOf(this.A0I, i);
            for (CW cw2 : this.A0I) {
                cw2.A5A(A0b);
            }
        }
        if (this.A0H == null) {
            this.A0H = new CW[this.A0V.size()];
            for (int i2 = 0; i2 < this.A0H.length; i2++) {
                CW ADY = this.A0C.ADY(this.A0K.size() + 1 + i2, 3);
                ADY.A5A(this.A0V.get(i2));
                this.A0H[i2] = ADY;
                String[] strArr = A0Y;
                if (strArr[6].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Y;
                strArr2[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
                strArr2[7] = "E0z9VN5IoStoNoHPwfepvpkncforV8p8";
            }
        }
    }

    private void A0F(long j) {
        while (!this.A0U.isEmpty()) {
            C0592Cw removeFirst = this.A0U.removeFirst();
            this.A03 -= removeFirst.A00;
            long j2 = j + removeFirst.A01;
            C0722Ic c0722Ic = this.A0S;
            if (c0722Ic != null) {
                j2 = c0722Ic.A07(j2);
            }
            for (CW cw : this.A0I) {
                cw.ACf(j2, 1, removeFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j) throws AN {
        while (!this.A0T.isEmpty() && this.A0T.peek().A00 == j) {
            A0J(this.A0T.pop());
        }
        A0B();
    }

    private void A0H(CL cl) throws IOException, InterruptedException {
        int i = ((int) this.A07) - this.A00;
        IQ iq = this.A0E;
        if (iq != null) {
            cl.readFully(iq.A00, 8, i);
            A0P(new YY(this.A01, this.A0E), cl.A6m());
        } else {
            cl.ADG(i);
        }
        A0G(cl.A6m());
    }

    private void A0I(CL cl) throws IOException, InterruptedException {
        C0593Cx c0593Cx = null;
        long j = Long.MAX_VALUE;
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            D8 d8 = this.A0K.valueAt(i).A07;
            if (d8.A0B) {
                int i2 = (d8.A04 > j ? 1 : (d8.A04 == j ? 0 : -1));
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Y;
                strArr[3] = "TcDom5";
                strArr[3] = "TcDom5";
                if (i2 < 0) {
                    j = d8.A04;
                    c0593Cx = this.A0K.valueAt(i);
                }
            }
        }
        if (c0593Cx == null) {
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Y;
            strArr2[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            strArr2[2] = "BU1FqSGZUKIp3lmSYzKBGxc2Z86jKcpe";
            this.A02 = 3;
            return;
        }
        long A6m = j - cl.A6m();
        if (A0Y[3].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0Y;
        strArr3[0] = "Cvsa72edMITB5GhT";
        strArr3[0] = "Cvsa72edMITB5GhT";
        int bytesToSkip = (int) A6m;
        if (bytesToSkip >= 0) {
            cl.ADG(bytesToSkip);
            c0593Cx.A07.A05(cl);
            return;
        }
        throw new AN(A0A(307, 39, 66));
    }

    private void A0J(YX yx) throws AN {
        if (((AbstractC0581Cl) yx).A00 == AbstractC0581Cl.A0j) {
            A0L(yx);
        } else if (((AbstractC0581Cl) yx).A00 == AbstractC0581Cl.A0i) {
            A0K(yx);
        } else if (this.A0T.isEmpty()) {
        } else {
            ArrayDeque<YX> arrayDeque = this.A0T;
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
            strArr[7] = "6RjYlEZz613sKxZIpZ2APlvoVeArWnyB";
            arrayDeque.peek().A08(yx);
        }
    }

    private void A0K(YX yx) throws AN {
        A0M(yx, this.A0K, this.A0J, this.A0W);
        DrmInitData A05 = this.A0L != null ? null : A05(yx.A02);
        if (A05 != null) {
            int i = this.A0K.size();
            for (int i2 = 0; i2 < i; i2++) {
                this.A0K.valueAt(i2).A07(A05);
            }
        }
        if (this.A0A != -9223372036854775807L) {
            int size = this.A0K.size();
            for (int i3 = 0; i3 < size; i3++) {
                this.A0K.valueAt(i3).A06(this.A0A);
            }
            this.A0A = -9223372036854775807L;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A0L(YX yx) throws AN {
        I1.A06(this.A0N == null, A0A(532, 20, 11));
        DrmInitData drmInitData = this.A0L;
        if (drmInitData == null) {
            drmInitData = A05(yx.A02);
        }
        YX A06 = yx.A06(AbstractC0581Cl.A0m);
        SparseArray sparseArray = new SparseArray();
        long j = -9223372036854775807L;
        int size = A06.A02.size();
        for (int i = 0; i < size; i++) {
            YY yy = A06.A02.get(i);
            int i2 = ((AbstractC0581Cl) yy).A00;
            if (i2 == AbstractC0581Cl.A1M) {
                Pair<Integer, C0587Cr> A03 = A03(yy.A00);
                int i3 = ((Integer) A03.first).intValue();
                sparseArray.put(i3, A03.second);
            } else {
                int i4 = ((AbstractC0581Cl) yy).A00;
                if (i4 == AbstractC0581Cl.A0f) {
                    j = A01(yy.A00);
                }
            }
        }
        SparseArray sparseArray2 = new SparseArray();
        int size2 = yx.A01.size();
        for (int i5 = 0; i5 < size2; i5++) {
            YX yx2 = yx.A01.get(i5);
            int i6 = ((AbstractC0581Cl) yx2).A00;
            if (i6 == AbstractC0581Cl.A1L) {
                D6 A0C = C0586Cq.A0C(yx2, yx.A07(AbstractC0581Cl.A0n), j, drmInitData, (this.A0J & 16) != 0, false);
                if (A0C != null) {
                    int i7 = A0C.A00;
                    sparseArray2.put(i7, A0C);
                }
            }
        }
        int size3 = sparseArray2.size();
        if (this.A0K.size() == 0) {
            for (int i8 = 0; i8 < size3; i8++) {
                D6 d6 = (D6) sparseArray2.valueAt(i8);
                CM cm = this.A0C;
                int i9 = d6.A03;
                C0593Cx c0593Cx = new C0593Cx(cm.ADY(i8, i9));
                int i10 = d6.A00;
                c0593Cx.A08(d6, A06(sparseArray, i10));
                SparseArray<C0593Cx> sparseArray3 = this.A0K;
                int i11 = d6.A00;
                sparseArray3.put(i11, c0593Cx);
                this.A08 = Math.max(this.A08, d6.A04);
            }
            A0C();
            if (A0Y[5].length() != 1) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[5] = "d";
            strArr[5] = "d";
            this.A0C.A4w();
            return;
        }
        I1.A04(this.A0K.size() == size3);
        for (int i12 = 0; i12 < size3; i12++) {
            D6 d62 = (D6) sparseArray2.valueAt(i12);
            this.A0K.get(d62.A00).A08(d62, A06(sparseArray, d62.A00));
        }
    }

    public static void A0M(YX yx, SparseArray<C0593Cx> sparseArray, int i, byte[] bArr) throws AN {
        int size = yx.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            YX yx2 = yx.A01.get(i2);
            if (((AbstractC0581Cl) yx2).A00 == AbstractC0581Cl.A1K) {
                A0N(yx2, sparseArray, i, bArr);
            }
        }
    }

    public static void A0O(YX yx, C0593Cx c0593Cx, long j, int i) {
        int totalSampleCount = 0;
        int trunSampleCount = 0;
        List<YY> list = yx.A02;
        int leafChildrenSize = list.size();
        for (int totalSampleCount2 = 0; totalSampleCount2 < leafChildrenSize; totalSampleCount2++) {
            YY yy = list.get(totalSampleCount2);
            int i2 = ((AbstractC0581Cl) yy).A00;
            int i3 = AbstractC0581Cl.A1N;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            strArr[0] = "HX3CrwnoNkNpp8Diq6RFqVXtJKh";
            if (i2 == i3) {
                IQ iq = yy.A00;
                iq.A0Z(12);
                int A0I = iq.A0I();
                if (A0I > 0) {
                    trunSampleCount += A0I;
                    totalSampleCount++;
                }
            }
        }
        c0593Cx.A02 = 0;
        c0593Cx.A00 = 0;
        c0593Cx.A01 = 0;
        c0593Cx.A07.A04(totalSampleCount, trunSampleCount);
        int i4 = 0;
        int i5 = 0;
        if (A0Y[7].charAt(27) == 'r') {
            String[] strArr2 = A0Y;
            strArr2[1] = "K2a";
            strArr2[1] = "K2a";
        }
        for (int i6 = 0; i6 < leafChildrenSize; i6++) {
            YY yy2 = list.get(i6);
            if (((AbstractC0581Cl) yy2).A00 == AbstractC0581Cl.A1N) {
                i5 = A00(c0593Cx, i4, j, i, yy2.A00, i5);
                i4++;
            }
        }
    }

    private void A0P(YY yy, long j) throws AN {
        if (!this.A0T.isEmpty()) {
            this.A0T.peek().A09(yy);
        } else if (((AbstractC0581Cl) yy).A00 == AbstractC0581Cl.A12) {
            Pair<Long, YC> A04 = A04(yy.A00, j);
            this.A0B = ((Long) A04.first).longValue();
            this.A0C.ACk((CT) A04.second);
            this.A0F = true;
        } else if (((AbstractC0581Cl) yy).A00 != AbstractC0581Cl.A0P) {
        } else {
            A0R(yy.A00);
        }
    }

    public static void A0Q(D7 d7, IQ iq, D8 d8) throws AN {
        int flags = d7.A00;
        iq.A0Z(8);
        if ((AbstractC0581Cl.A00(iq.A09()) & 1) == 1) {
            iq.A0a(8);
        }
        int vectorSize = iq.A0F();
        int A0I = iq.A0I();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[3] = "qY4fk5";
        strArr2[3] = "qY4fk5";
        if (A0I == d8.A00) {
            int i = 0;
            if (vectorSize == 0) {
                boolean[] zArr = d8.A0H;
                for (int sampleCount = 0; sampleCount < A0I; sampleCount++) {
                    int totalSize = iq.A0F();
                    i += totalSize;
                    zArr[sampleCount] = totalSize > flags;
                }
            } else {
                boolean z = vectorSize > flags;
                int i2 = vectorSize * A0I;
                i = 0 + i2;
                Arrays.fill(d8.A0H, 0, A0I, z);
            }
            d8.A03(i);
            return;
        }
        throw new AN(A0A(290, 17, 120) + A0I + A0A(0, 2, 53) + d8.A00);
    }

    private void A0R(IQ iq) {
        CW[] cwArr;
        CW[] cwArr2 = this.A0I;
        if (cwArr2 == null || cwArr2.length == 0) {
            return;
        }
        iq.A0Z(12);
        int A05 = iq.A05();
        iq.A0R();
        iq.A0R();
        long A0N = iq.A0N();
        long timescale = iq.A0N();
        long A0F = C0726Ig.A0F(timescale, 1000000L, A0N);
        for (CW cw : this.A0I) {
            iq.A0Z(12);
            cw.ACe(iq, A05);
        }
        long j = this.A0B;
        if (j != -9223372036854775807L) {
            long j2 = j + A0F;
            C0722Ic c0722Ic = this.A0S;
            if (c0722Ic != null) {
                j2 = c0722Ic.A07(j2);
            }
            for (CW cw2 : this.A0I) {
                cw2.ACf(j2, 1, A05, 0, null);
            }
            return;
        }
        this.A0U.addLast(new C0592Cw(A0F, A05));
        this.A03 += A05;
    }

    public static void A0S(IQ iq, int i, D8 d8) throws AN {
        iq.A0Z(i + 8);
        int A00 = AbstractC0581Cl.A00(iq.A09());
        if ((A00 & 1) == 0) {
            boolean z = (A00 & 2) != 0;
            int A0I = iq.A0I();
            int i2 = d8.A00;
            if (A0Y[2].charAt(18) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[6] = "UNCiZzJs5PDRpvixsYfSSk1mhxuZgiq";
            strArr[4] = "wrSUtL8XPGusZqeHm";
            if (A0I == i2) {
                Arrays.fill(d8.A0H, 0, A0I, z);
                int sampleCount = iq.A05();
                d8.A03(sampleCount);
                d8.A06(iq);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(A0A(290, 17, 120));
            sb.append(A0I);
            sb.append(A0A(0, 2, 53));
            int sampleCount2 = d8.A00;
            sb.append(sampleCount2);
            throw new AN(sb.toString());
        }
        throw new AN(A0A(381, 56, 78));
    }

    public static void A0T(IQ iq, D8 d8) throws AN {
        long A0O;
        iq.A0Z(8);
        int A09 = iq.A09();
        if ((AbstractC0581Cl.A00(A09) & 1) == 1) {
            iq.A0a(8);
        }
        int A0I = iq.A0I();
        int flags = A0Y[3].length();
        if (flags != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A0Y;
        strArr[3] = "xMtqR0";
        strArr[3] = "xMtqR0";
        if (A0I == 1) {
            int A01 = AbstractC0581Cl.A01(A09);
            long j = d8.A04;
            if (A01 == 0) {
                A0O = iq.A0N();
            } else {
                A0O = iq.A0O();
            }
            long j2 = j + A0O;
            String[] strArr2 = A0Y;
            String str = strArr2[6];
            String str2 = strArr2[4];
            int flags2 = str.length();
            if (flags2 != str2.length()) {
                String[] strArr3 = A0Y;
                strArr3[6] = "QBYjlSuWWzNHcmXjWc7avhw4MqaHk82";
                strArr3[4] = "P5zbNSbq1MUS3wdHf";
                d8.A04 = j2;
                return;
            }
            String[] strArr4 = A0Y;
            strArr4[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            strArr4[7] = "vg5EJJPWiTbIFzTVTJFrvfHkMClrP8RJ";
            d8.A04 = j2;
            return;
        }
        throw new AN(A0A(552, 29, 95) + A0I);
    }

    public static void A0U(IQ iq, D8 d8) throws AN {
        A0S(iq, 0, d8);
    }

    public static void A0V(IQ iq, D8 d8, byte[] bArr) throws AN {
        iq.A0Z(8);
        iq.A0d(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0c)) {
            return;
        }
        A0S(iq, 16, d8);
    }

    public static void A0W(IQ iq, IQ iq2, String str, D8 d8) throws AN {
        iq.A0Z(8);
        int A09 = iq.A09();
        if (iq.A09() != A0a) {
            return;
        }
        if (AbstractC0581Cl.A01(A09) == 1) {
            iq.A0a(4);
        }
        int A092 = iq.A09();
        String[] strArr = A0Y;
        if (strArr[6].length() == strArr[4].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Y;
        strArr2[3] = "cve2FA";
        strArr2[3] = "cve2FA";
        if (A092 == 1) {
            iq2.A0Z(8);
            int A093 = iq2.A09();
            if (iq2.A09() != A0a) {
                return;
            }
            int A01 = AbstractC0581Cl.A01(A093);
            if (A0Y[1].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0Y;
            strArr3[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            strArr3[7] = "iX8BjoZjE8Q6Igd9BCVMMRG15zWrcCbA";
            if (A01 == 1) {
                if (iq2.A0N() == 0) {
                    throw new AN(A0A(609, 55, 42));
                }
            } else if (A01 >= 2) {
                iq2.A0a(4);
            }
            if (iq2.A0N() == 1) {
                iq2.A0a(1);
                int A0F = iq2.A0F();
                int i = (A0F & 240) >> 4;
                int i2 = A0F & 15;
                boolean z = iq2.A0F() == 1;
                if (!z) {
                    return;
                }
                int A0F2 = iq2.A0F();
                byte[] bArr = new byte[16];
                int perSampleIvSize = bArr.length;
                iq2.A0d(bArr, 0, perSampleIvSize);
                int skipByteBlock = A0Y[7].charAt(27);
                if (skipByteBlock != 114) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0Y;
                strArr4[0] = "v2evuoi5ipUorqJI1yS0NRy";
                strArr4[0] = "v2evuoi5ipUorqJI1yS0NRy";
                byte[] bArr2 = null;
                if (z && A0F2 == 0) {
                    int A0F3 = iq2.A0F();
                    bArr2 = new byte[A0F3];
                    iq2.A0d(bArr2, 0, A0F3);
                }
                d8.A0A = true;
                d8.A08 = new D7(z, str, A0F2, bArr, i, i2, bArr2);
                return;
            }
            throw new AN(A0A(89, 39, 21));
        }
        throw new AN(A0A(50, 39, 120));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A0h) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A16) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A0i) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4 == com.facebook.ads.redexgen.X.AbstractC0581Cl.A1K) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
        r3 = com.facebook.ads.redexgen.X.AbstractC0581Cl.A0m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (com.facebook.ads.redexgen.X.C1128Yd.A0Y[5].length() == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r4 != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r2 = com.facebook.ads.redexgen.X.C1128Yd.A0Y;
        r2[5] = "P";
        r2[5] = "P";
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (r4 == r3) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r4 != com.facebook.ads.redexgen.X.AbstractC0581Cl.A0N) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0X(int i) {
        if (i != AbstractC0581Cl.A0j) {
            int i2 = AbstractC0581Cl.A1L;
            if (A0Y[2].charAt(18) == 'K') {
                String[] strArr = A0Y;
                strArr[2] = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX";
                strArr[2] = "T3RhZdPh4OhUklIpt3KHsdu4Qu4SXFxX";
                if (i != i2) {
                    int i3 = AbstractC0581Cl.A0d;
                    if (A0Y[1].length() == 3) {
                        String[] strArr2 = A0Y;
                        strArr2[0] = bx.y4;
                        strArr2[0] = bx.y4;
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static boolean A0Y(int i) {
        return i == AbstractC0581Cl.A0V || i == AbstractC0581Cl.A0c || i == AbstractC0581Cl.A0n || i == AbstractC0581Cl.A12 || i == AbstractC0581Cl.A1A || i == AbstractC0581Cl.A1H || i == AbstractC0581Cl.A1I || i == AbstractC0581Cl.A1J || i == AbstractC0581Cl.A1M || i == AbstractC0581Cl.A1N || i == AbstractC0581Cl.A0r || i == AbstractC0581Cl.A0u || i == AbstractC0581Cl.A0t || i == AbstractC0581Cl.A10 || i == AbstractC0581Cl.A1Q || i == AbstractC0581Cl.A0x || i == AbstractC0581Cl.A11 || i == AbstractC0581Cl.A0O || i == AbstractC0581Cl.A0f || i == AbstractC0581Cl.A0P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00eb, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
        r10.A0C.ACk(new com.facebook.ads.redexgen.X.YH(r10.A08, r2));
        r10.A0F = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0106, code lost:
        if (com.facebook.ads.redexgen.X.C1128Yd.A0Y[3].length() == 6) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010a, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
        if (r10.A0F == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
        r2 = com.facebook.ads.redexgen.X.C1128Yd.A0Y;
        r2[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
        r2[2] = "kMQb8Kdhh0k2oCY1DKK8Lkjm8envfnKE";
        r10.A02 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0Z(CL cl) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!cl.AC2(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0Z(0);
            this.A07 = this.A0O.A0N();
            this.A01 = this.A0O.A09();
        }
        long j = this.A07;
        if (j == 1) {
            cl.readFully(this.A0O.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0O.A0O();
        } else if (j == 0) {
            long A6T = cl.A6T();
            if (A0Y[7].charAt(27) != 'r') {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[0] = "LA";
            strArr[0] = "LA";
            if (A6T == -1 && !this.A0T.isEmpty()) {
                A6T = this.A0T.peek().A00;
            }
            if (A6T != -1) {
                this.A07 = (A6T - cl.A6m()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            long A6m = cl.A6m() - this.A00;
            if (this.A01 == AbstractC0581Cl.A0i) {
                int size = this.A0K.size();
                for (int i = 0; i < size; i++) {
                    D8 fragment = this.A0K.valueAt(i).A07;
                    fragment.A03 = A6m;
                    fragment.A04 = A6m;
                    fragment.A05 = A6m;
                }
            }
            if (this.A01 == AbstractC0581Cl.A0b) {
                this.A0D = null;
                long endPosition = this.A07 + A6m;
                if (A0Y[1].length() != 3) {
                    this.A09 = endPosition;
                } else {
                    String[] strArr2 = A0Y;
                    strArr2[3] = "OzIwjO";
                    strArr2[3] = "OzIwjO";
                    this.A09 = endPosition;
                }
            } else {
                if (A0X(this.A01)) {
                    long endPosition2 = (cl.A6m() + this.A07) - 8;
                    this.A0T.push(new YX(this.A01, endPosition2));
                    if (this.A07 == this.A00) {
                        A0G(endPosition2);
                    } else {
                        A0B();
                    }
                } else if (A0Y(this.A01)) {
                    if (this.A00 == 8) {
                        long j2 = this.A07;
                        if (j2 <= TTL.MAX_VALUE) {
                            this.A0E = new IQ((int) j2);
                            System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                            this.A02 = 1;
                        } else {
                            throw new AN(A0A(241, 49, 63));
                        }
                    } else {
                        throw new AN(A0A(190, 51, 119));
                    }
                } else if (this.A07 <= TTL.MAX_VALUE) {
                    this.A0E = null;
                    if (A0Y[1].length() != 3) {
                        this.A02 = 1;
                    } else {
                        String[] strArr3 = A0Y;
                        strArr3[6] = "iPT3XD2rpP2HdkDfuffPKD2oqLdsh6m";
                        strArr3[4] = "VJwLHdRxuPwgnotGD";
                        this.A02 = 1;
                    }
                } else {
                    throw new AN(A0A(479, 53, 111));
                }
                return true;
            }
        } else {
            throw new AN(A0A(2, 48, 31));
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:40:0x0112 */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean A0a(CL cl) throws IOException, InterruptedException {
        int ACd;
        int i = 4;
        int i2 = 1;
        int i3 = 0;
        if (this.A02 == 3) {
            if (this.A0D == null) {
                C0593Cx A07 = A07(this.A0K);
                if (A07 == null) {
                    int bytesToSkip = (int) (this.A09 - cl.A6m());
                    if (bytesToSkip >= 0) {
                        cl.ADG(bytesToSkip);
                        A0B();
                        return false;
                    }
                    throw new AN(A0A(346, 35, 12));
                }
                int A6m = (int) (A07.A07.A0G[A07.A02] - cl.A6m());
                if (A6m < 0) {
                    Log.w(A0A(128, 22, 14), A0A(IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, 40, 24));
                    A6m = 0;
                }
                cl.ADG(A6m);
                this.A0D = A07;
            }
            this.A06 = this.A0D.A07.A0D[this.A0D.A01];
            if (this.A0D.A01 < this.A0D.A03) {
                cl.ADG(this.A06);
                this.A0D.A01();
                if (!this.A0D.A09()) {
                    this.A0D = null;
                }
                this.A02 = 3;
                return true;
            }
            C0593Cx c0593Cx = this.A0D;
            if (A0Y[3].length() != 6) {
                throw new RuntimeException();
            }
            String[] strArr = A0Y;
            strArr[3] = "st8dZG";
            strArr[3] = "st8dZG";
            if (c0593Cx.A05.A02 == 1) {
                this.A06 -= 8;
                cl.ADG(8);
            }
            this.A04 = this.A0D.A04();
            this.A06 += this.A04;
            this.A02 = 4;
            this.A05 = 0;
        }
        D8 d8 = this.A0D.A07;
        D6 d6 = this.A0D.A05;
        CW cw = this.A0D.A06;
        int nalUnitLengthFieldLengthDiff = this.A0D.A01;
        long A01 = d8.A01(nalUnitLengthFieldLengthDiff) * 1000;
        C0722Ic c0722Ic = this.A0S;
        if (c0722Ic != null) {
            A01 = c0722Ic.A07(A01);
        }
        if (d6.A01 == 0) {
            while (true) {
                int i4 = this.A04;
                int i5 = this.A06;
                if (i4 >= i5) {
                    break;
                }
                int ACd2 = cw.ACd(cl, i5 - i4, false);
                int writtenBytes = this.A04;
                this.A04 = writtenBytes + ACd2;
            }
        } else {
            byte[] bArr = this.A0Q.A00;
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            int i6 = d6.A01 + 1;
            int nalUnitPrefixLength = d6.A01;
            int i7 = 4 - nalUnitPrefixLength;
            while (r12 < nalUnitPrefixLength) {
                int i8 = this.A05;
                if (i8 == 0) {
                    cl.readFully(bArr, i7, i6);
                    this.A0Q.A0Z(i3);
                    int nalUnitPrefixLength2 = this.A0Q.A0I();
                    this.A05 = nalUnitPrefixLength2 - i2;
                    this.A0R.A0Z(i3);
                    cw.ACe(this.A0R, i);
                    cw.ACe(this.A0Q, i2);
                    int nalUnitPrefixLength3 = this.A0H.length;
                    this.A0G = nalUnitPrefixLength3 > 0 && IM.A0D(d6.A07.A0O, bArr[i]);
                    int nalUnitPrefixLength4 = this.A04;
                    this.A04 = nalUnitPrefixLength4 + 5;
                    int nalUnitPrefixLength5 = this.A06;
                    this.A06 = nalUnitPrefixLength5 + i7;
                } else {
                    if (this.A0G) {
                        this.A0P.A0X(i8);
                        byte[] bArr2 = this.A0P.A00;
                        int nalUnitPrefixLength6 = this.A05;
                        cl.readFully(bArr2, i3, nalUnitPrefixLength6);
                        IQ iq = this.A0P;
                        int nalUnitPrefixLength7 = this.A05;
                        cw.ACe(iq, nalUnitPrefixLength7);
                        ACd = this.A05;
                        byte[] bArr3 = this.A0P.A00;
                        int nalUnitPrefixLength8 = this.A0P.A08();
                        int A02 = IM.A02(bArr3, nalUnitPrefixLength8);
                        IQ iq2 = this.A0P;
                        int unescapedLength = A0A(686, 10, 13).equals(d6.A07.A0O) ? 1 : 0;
                        iq2.A0Z(unescapedLength);
                        this.A0P.A0Y(A02);
                        GQ.A04(A01, this.A0P, this.A0H);
                    } else {
                        ACd = cw.ACd(cl, i8, false);
                    }
                    int unescapedLength2 = this.A04;
                    this.A04 = unescapedLength2 + ACd;
                    this.A05 -= ACd;
                    i = 4;
                    i2 = 1;
                    i3 = 0;
                }
            }
        }
        boolean z = d8.A0I[nalUnitLengthFieldLengthDiff];
        CV cv = null;
        int i9 = z;
        if (d8.A0A) {
            boolean z2 = (z ? 1 : 0) | true;
            cv = (d8.A08 != null ? d8.A08 : d6.A00(d8.A07.A02)).A01;
            i9 = z2;
        }
        cw.ACf(A01, i9, this.A06, 0, cv);
        A0F(A01);
        if (!this.A0D.A09()) {
            this.A0D = null;
        }
        this.A02 = 3;
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A0C = cm;
        D6 d6 = this.A0N;
        if (d6 != null) {
            C0593Cx c0593Cx = new C0593Cx(cm.ADY(0, d6.A03));
            c0593Cx.A08(this.A0N, new C0587Cr(0, 0, 0, 0));
            this.A0K.put(0, c0593Cx);
            A0C();
            this.A0C.A4w();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        while (true) {
            int i = this.A02;
            if (i != 0) {
                if (A0Y[2].charAt(18) != 'K') {
                    throw new RuntimeException();
                }
                String[] strArr = A0Y;
                strArr[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                strArr[2] = "Ub8SUYMnE0bQG8CZo0KwdlTNogw2mbM0";
                if (i == 1) {
                    A0H(cl);
                } else if (i != 2) {
                    boolean A0a2 = A0a(cl);
                    if (A0Y[7].charAt(27) == 'r') {
                        String[] strArr2 = A0Y;
                        strArr2[5] = "b";
                        strArr2[5] = "b";
                        if (A0a2) {
                            return 0;
                        }
                    } else if (A0a2) {
                        return 0;
                    }
                } else {
                    A0I(cl);
                }
            } else if (!A0Z(cl)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        int size = this.A0K.size();
        for (int i = 0; i < size; i++) {
            this.A0K.valueAt(i).A05();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0T.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        return D4.A04(cl);
    }
}
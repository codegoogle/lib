package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import com.anythink.expressad.d.a.b;
import com.anythink.expressad.foundation.g.a;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.nr;
import com.p7700g.p99005.yg1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import java.util.UUID;
import org.xbill.DNS.Flags;
import org.xbill.DNS.TTL;
import org.xbill.DNS.Type;
import org.xbill.DNS.WKSRecord;

/* loaded from: assets/audience_network.dex */
public final class YT implements CK {
    public static byte[] A0p;
    public static String[] A0q;
    public static final CN A0r;
    public static final UUID A0s;
    public static final byte[] A0t;
    public static final byte[] A0u;
    public static final byte[] A0v;
    public static final byte[] A0w;
    public static final byte[] A0x;
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public CM A0N;
    public C0576Cg A0O;
    public IG A0P;
    public IG A0Q;
    public ByteBuffer A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public final SparseArray<C0576Cg> A0c;
    public final InterfaceC0572Cc A0d;
    public final C0579Cj A0e;
    public final IQ A0f;
    public final IQ A0g;
    public final IQ A0h;
    public final IQ A0i;
    public final IQ A0j;
    public final IQ A0k;
    public final IQ A0l;
    public final IQ A0m;
    public final IQ A0n;
    public final boolean A0o;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0p, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 58);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0p = new byte[]{34, 108, 109, 118, 34, 113, 119, 114, 114, 109, 112, 118, 103, 102, 104, 125, 124, 41, 119, 104, 125, g15.c, 41, 119, 104, 125, g15.c, 41, 119, 104, 125, g15.c, 41, 84, 65, 67, 21, 75, 84, 65, 67, 21, 75, 84, 65, 67, 21, 93, 84, 65, 66, 21, 86, 82, 68, 68, 114, 99, 99, 126, 121, 112, 100, 84, 126, 103, g15.c, 114, 101, 90, 120, 115, 114, 55, 25, 7, 25, 25, 27, 55, 41, 55, 53, 69, 57, 39, 60, 44, 43, 73, 87, 76, 92, 91, 39, 77, 80, 88, 90, 77, 91, 91, 111, 113, 106, 122, 125, 1, 98, 97, 125, 125, 98, 107, 125, 125, 28, 2, 24, 28, 30, 110, 9, 23, 14, 4, 9, Flags.CD, 58, 36, 54, 43, 62, 60, 84, 55, 73, 80, 78, 92, 65, 84, 86, 62, 93, 34, 8, 22, 4, 26, 102, 8, 10, 4, 27, 5, 21, 10, 15, 9, 37, 59, 52, 39, 41, 75, 45, bx.W5, 48, 75, 40, 45, 48, 6, 24, 19, 21, 18, 2, 15, 3, 74, 84, 93, 68, 89, 73, 66, 88, 88, 122, 117, 60, 111, 59, 104, 120, 122, 119, 126, 59, 111, 114, 118, 126, 120, 116, g15.c, 126, 59, 107, 105, 114, 116, 105, 59, 111, 116, 59, 111, 114, 118, 126, 120, 116, g15.c, 126, 72, 120, 122, 119, 126, 59, 121, 126, 114, 117, 124, 59, 104, 126, 111, 53, 34, 14, 12, 3, 8, 15, 8, 15, 6, 65, 4, 15, 2, 19, 24, 17, 21, 8, 14, 15, 65, 0, 15, 5, 65, 2, 14, 12, 17, 19, 4, 18, 18, 8, 14, 15, 65, 8, 18, 65, 15, 14, 21, 65, 18, 20, 17, 17, 14, 19, 21, 4, 5, 9, 37, 36, 62, 47, 36, 62, 9, 37, 39, 58, Flags.CD, 38, 45, 37, 106, 99, 79, 78, 84, 69, 78, 84, 101, 78, 67, 97, 76, 71, 79, 0, 79, 99, 98, 120, 105, 98, 120, 73, 98, 111, 99, 104, 101, 98, 107, 67, 126, 104, 105, 126, 44, 75, 103, 102, 124, 109, 102, 124, 77, 102, 107, 103, 108, 97, 102, 111, 91, 107, 103, 120, 109, 40, 40, 3, 15, 56, 21, 28, 9, 76, 1, bx.W5, 38, 17, 60, 53, 32, 23, 32, 36, 33, 19, 32, 55, 54, 44, bx.W5, 43, 101, 16, 23, 24, 25, 117, 57, 52, 54, 60, 59, 50, 117, 38, 52, 56, 37, 57, 48, 117, 38, 60, 47, 48, 117, 58, 32, 33, 117, 58, 51, 117, 39, 52, 59, 50, 48, 123, 74, 77, 66, 67, 93, 106, 110, 107, 89, 106, 125, 124, 102, 96, 97, 47, 61, 22, 27, 10, 1, 8, 12, 29, 28, 88, 44, 10, 25, 27, 19, 88, 30, 23, 13, 22, 28, 88, 26, 13, 12, 88, 59, 23, 22, 12, 29, 22, 12, 61, 22, 27, 51, 29, 1, 49, 60, 88, 15, 25, Flags.CD, 88, 22, 23, 12, 88, 30, 23, 13, 22, 28, 95, 98, 110, g15.c, 116, 105, 115, 117, 116, 58, 120, 115, 110, 58, 115, 105, 58, 105, g15.c, 110, 58, 115, 116, 58, 105, 115, 125, 116, 123, 118, 58, 120, 99, 110, g15.c, 105, 64, 93, 66, 78, 91, 21, 15, 124, 91, 78, 93, 91, 3, 15, 106, 65, 75, 3, 15, 125, 74, 78, 75, 96, 93, 75, 74, 93, 3, 15, 99, 78, 86, 74, 93, 3, 15, 124, 91, 86, 67, 74, 3, 15, 97, 78, 66, 74, 3, 15, 98, 78, 93, 72, 70, 65, 99, 3, 15, 98, 78, 93, 72, 70, 65, 125, 3, 15, 98, 78, 93, 72, 70, 65, 121, 3, 15, 106, 73, 73, 74, 76, 91, 3, 15, 123, 74, 87, 91, 48, 29, 31, 21, 18, 27, 92, 19, 18, 16, 5, 92, 15, 9, 12, 12, 19, 14, 8, 25, 24, 92, 21, 18, 92, 47, 21, 17, 12, 16, 25, 62, 16, 19, 31, 23, 15, 82, 31, 51, 60, 54, 51, 38, 61, 32, 43, 114, 55, 62, 55, ax5.a, 55, 60, 38, 114, 1, 55, 55, 57, 27, 22, 114, 61, 32, 114, 1, 55, 55, 57, 2, 61, 33, 59, 38, 59, 61, 60, 114, 60, 61, 38, 114, 52, 61, 39, 60, 54, 122, 66, 91, 67, 94, 71, 91, 82, 23, 100, 82, 80, 90, 82, 89, 67, 23, 82, 91, 82, 90, 82, 89, 67, 68, 23, 89, 88, 67, 23, 68, 66, 71, 71, 88, 69, 67, 82, 83, 54, 23, 88, 14, 25, 20, 17, 28, 88, 12, 10, 25, 27, 19, Flags.CD, 88, 15, 29, 10, 29, 88, 30, 23, 13, 22, 28, 68, 101, bx.W5, 124, 107, 102, 99, 110, bx.W5, 124, 107, 120, 99, 100, 126, bx.W5, 102, 111, 100, 109, 126, 98, bx.W5, 103, 107, 121, 97, bx.W5, 108, 101, g15.c, 100, 110, 96, 108, 119, 101, 113, 96, 102, 113, 43, 39, 48, 60, 53, 46, 87, 40, ax5.a, 43, 68, 72, 67, 82, 79, 67, 56, 86, 68, 68, 81, 93, 86, 71, 90, 86, 45, 87, 86, 68, 58, 69, 73, 64, 89, 84, 69, 67, 84, 51, 8, 3, 30, 22, 3, 5, 18, 3, 2, 70, 15, 2, 92, 70, 24, 35, 40, 53, 61, 40, 46, 57, 40, 41, 109, 33, 44, 46, 36, 35, bx.W5, 109, 59, 44, 33, 56, 40, 119, 109, 60, 53, 39, 58, 47, 45, 88, 5, 12, 30, 3, 22, 20, 103, 124, 26, 0, 28, 124, 18, 3, 75, 66, 80, 77, 88, 90, 41, 50, 84, 78, 82, 50, 92, 78, 77, 44, 37, 55, bx.W5, ax5.a, 61, 78, 85, 51, 41, 53, 85, 59, 44, 57, 86, 95, 77, 80, 69, 71, 52, 47, 73, 83, 79, 47, 83, 80, 6, 15, 29, 0, 21, 23, 24, g15.c, 25, 3, 31, g15.c, 24, 21, 6, 19, 53, 60, 46, 48, 76, 53, 37, 52, 76, 37, 44, 54, 49, 32, 32, 97, 104, 
        99, g15.c, 114, 120, 101, 118, 68, 77, 68, 66, bx.W5, 12, 5, 12, 10, 99, 113, 125, 104, 110, 115, 111, 119, 125, 116, 107, 102, 103, 109, 45, 117, 103, 96, 111, ax5.a, 45, bx.W5, 37};
    }

    public static void A07() {
        A0q = new String[]{"PtjeSixlQpPnp33LbTolurfrF5aBxWMN", "zsPWFAYo6WN4WLRLivc6JVSph6JkIRth", "XheyHWRN6othIFLpaes4AkwCM0c9DMBL", "WLz3vbqVAvFNW8GJMAEq6yPWbMM9CaUw", "Xodlb2gLYburpvZCOlf7Ugos4D", "3NxGJ5nCydCtg30cLxHhJHXlDiPWCbyN", "QrznFntGQRtbXA7cSaAHWbiKbufqFBbd", "iW7nVRcCTDgQKTtcLRaOezFHTOIda"};
    }

    static {
        A07();
        A06();
        A0r = new YR();
        A0w = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        A0x = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0t = C0726Ig.A0j(A03(539, 90, 21));
        A0u = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        A0v = new byte[]{32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
        A0s = new UUID(72057594037932032L, -9223371306706625679L);
    }

    public YT() {
        this(0);
    }

    public YT(int i) {
        this(new YQ(), i);
    }

    public YT(InterfaceC0572Cc interfaceC0572Cc, int i) {
        this.A0K = -1L;
        this.A0M = -9223372036854775807L;
        this.A0G = -9223372036854775807L;
        this.A0H = -9223372036854775807L;
        this.A0F = -1L;
        this.A0J = -1L;
        this.A0E = -9223372036854775807L;
        this.A0d = interfaceC0572Cc;
        this.A0d.A7R(new YS(this, null));
        this.A0o = (i & 1) == 0;
        this.A0e = new C0579Cj();
        this.A0c = new SparseArray<>();
        this.A0k = new IQ(4);
        this.A0n = new IQ(ByteBuffer.allocate(4).putInt(-1).array());
        this.A0l = new IQ(4);
        this.A0i = new IQ(IM.A03);
        this.A0h = new IQ(4);
        this.A0j = new IQ();
        this.A0m = new IQ();
        this.A0f = new IQ(8);
        this.A0g = new IQ();
    }

    private int A00(CL cl, CW cw, int i) throws IOException, InterruptedException {
        int ACd;
        int A05 = this.A0j.A05();
        if (A05 > 0) {
            ACd = Math.min(i, A05);
            if (A0q[7].length() == 22) {
                throw new RuntimeException();
            }
            String[] strArr = A0q;
            strArr[2] = "aDvj6xsBYLtfkWvKOvjAJhuXcdkZRgYf";
            strArr[6] = "uG0ceA84GetZ2PjOc8Op6VIqDQh3bhN9";
            cw.ACe(this.A0j, ACd);
        } else {
            ACd = cw.ACd(cl, i, false);
        }
        this.A07 += ACd;
        this.A08 += ACd;
        return ACd;
    }

    private long A01(long j) throws AN {
        long j2 = this.A0M;
        if (j2 != -9223372036854775807L) {
            return C0726Ig.A0F(j, j2, 1000L);
        }
        throw new AN(A03(189, 54, 33));
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x0064 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private CT A02() {
        IG ig;
        IG ig2;
        if (this.A0K == -1 || this.A0H == -9223372036854775807L || (ig = this.A0Q) == null || ig.A02() == 0 || (ig2 = this.A0P) == null || ig2.A02() != this.A0Q.A02()) {
            this.A0Q = null;
            this.A0P = null;
            return new YH(this.A0H);
        }
        int A02 = this.A0Q.A02();
        int[] iArr = new int[A02];
        long[] jArr = new long[A02];
        long[] timesUs = new long[A02];
        long[] jArr2 = new long[A02];
        for (int i = 0; i < A02; i++) {
            jArr2[i] = this.A0Q.A03(i);
            jArr[i] = this.A0K + this.A0P.A03(i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + 1;
            iArr[i2] = (int) (jArr[i3] - jArr[i2]);
            int i4 = i2 + 1;
            timesUs[i2] = jArr2[i4] - jArr2[i2];
        }
        iArr[A02 - 1] = (int) ((this.A0K + this.A0L) - jArr[A02 - 1]);
        timesUs[A02 - 1] = this.A0H - jArr2[A02 - 1];
        this.A0Q = null;
        this.A0P = null;
        return new YC(iArr, jArr, timesUs, jArr2);
    }

    private void A05() {
        this.A07 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0S = false;
        this.A0X = false;
        this.A0U = false;
        this.A0A = 0;
        this.A00 = (byte) 0;
        this.A0T = false;
        this.A0j.A0W();
    }

    private void A08(CL cl, int i) throws IOException, InterruptedException {
        if (this.A0k.A08() >= i) {
            return;
        }
        if (this.A0k.A06() < i) {
            IQ iq = this.A0k;
            iq.A0c(Arrays.copyOf(iq.A00, Math.max(this.A0k.A00.length * 2, i)), this.A0k.A08());
        }
        cl.readFully(this.A0k.A00, this.A0k.A08(), i - this.A0k.A08());
        this.A0k.A0Y(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0102, code lost:
        if (r0 < r6) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x028c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A09(CL cl, C0576Cg c0576Cg, int i) throws IOException, InterruptedException {
        if (A03(843, 11, 56).equals(c0576Cg.A0Y)) {
            A0A(cl, A0w, i);
            return;
        }
        if (A03(833, 10, 45).equals(c0576Cg.A0Y)) {
            A0A(cl, A0u, i);
            return;
        }
        CW cw = c0576Cg.A0W;
        if (!this.A0S) {
            if (c0576Cg.A0c) {
                this.A01 &= -1073741825;
                if (!this.A0X) {
                    cl.readFully(this.A0k.A00, 0, 1);
                    this.A07++;
                    if ((this.A0k.A00[0] & g15.b) != 128) {
                        this.A00 = this.A0k.A00[0];
                        this.A0X = true;
                    } else {
                        throw new AN(A03(aa.g.l, 35, 32));
                    }
                }
                int partitionOffset = (this.A00 & 1) == 1 ? 1 : 0;
                if (partitionOffset != 0) {
                    boolean z = (this.A00 & 2) == 2;
                    this.A01 |= 1073741824;
                    boolean hasSubsampleEncryption = this.A0T;
                    if (!hasSubsampleEncryption) {
                        cl.readFully(this.A0f.A00, 0, 8);
                        this.A07 += 8;
                        this.A0T = true;
                        this.A0k.A00[0] = (byte) ((z ? 128 : 0) | 8);
                        this.A0k.A0Z(0);
                        cw.ACe(this.A0k, 1);
                        this.A08++;
                        this.A0f.A0Z(0);
                        cw.ACe(this.A0f, 8);
                        this.A08 += 8;
                    }
                    if (z) {
                        boolean hasSubsampleEncryption2 = this.A0U;
                        if (!hasSubsampleEncryption2) {
                            cl.readFully(this.A0k.A00, 0, 1);
                            this.A07++;
                            this.A0k.A0Z(0);
                            this.A0A = this.A0k.A0F();
                            this.A0U = true;
                        }
                        int samplePartitionDataSize = this.A0A * 4;
                        this.A0k.A0X(samplePartitionDataSize);
                        cl.readFully(this.A0k.A00, 0, samplePartitionDataSize);
                        this.A07 += samplePartitionDataSize;
                        short s = (short) ((this.A0A / 2) + 1);
                        int i2 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.A0R;
                        if (byteBuffer != null) {
                            int subsampleDataSize = byteBuffer.capacity();
                        }
                        this.A0R = ByteBuffer.allocate(i2);
                        this.A0R.position(0);
                        this.A0R.putShort(s);
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = this.A0A;
                            String[] strArr = A0q;
                            String str = strArr[2];
                            String str2 = strArr[6];
                            int samplePartitionDataSize2 = str.charAt(10);
                            int partitionOffset2 = str2.charAt(10);
                            if (samplePartitionDataSize2 != partitionOffset2) {
                                throw new RuntimeException();
                            }
                            String[] strArr2 = A0q;
                            strArr2[1] = "k69mdXr219EPEfxjmleoRJuaia7o0PSr";
                            strArr2[1] = "k69mdXr219EPEfxjmleoRJuaia7o0PSr";
                            if (i4 < i5) {
                                int i6 = i3;
                                i3 = this.A0k.A0I();
                                int partitionOffset3 = i4 % 2;
                                if (partitionOffset3 == 0) {
                                    int partitionOffset4 = i3 - i6;
                                    this.A0R.putShort((short) partitionOffset4);
                                } else {
                                    int partitionOffset5 = i3 - i6;
                                    this.A0R.putInt(partitionOffset5);
                                }
                                i4++;
                            } else {
                                int i7 = (i - this.A07) - i3;
                                if (i5 % 2 == 1) {
                                    this.A0R.putInt(i7);
                                } else {
                                    this.A0R.putShort((short) i7);
                                    this.A0R.putInt(0);
                                }
                                this.A0g.A0c(this.A0R.array(), i2);
                                cw.ACe(this.A0g, i2);
                                this.A08 += i2;
                            }
                        }
                    }
                }
            } else if (c0576Cg.A0f != null) {
                IQ iq = this.A0j;
                if (A0q[7].length() != 22) {
                    String[] strArr3 = A0q;
                    strArr3[2] = "eRgpr0IiA3tZEnoRsZk5vLwdwByA2WoR";
                    strArr3[6] = "B2R3kYZJBQt6DDNd5X8Bo30p1EhdmlAk";
                    iq.A0c(c0576Cg.A0f, c0576Cg.A0f.length);
                } else {
                    String[] strArr4 = A0q;
                    strArr4[2] = "QAYpS6vLHXt9MUnC4aIg5miPxTeCV04h";
                    strArr4[6] = "4gOZ0q0O5OtGCiklrvU5TO6zmpG8Wxaq";
                    iq.A0c(c0576Cg.A0f, c0576Cg.A0f.length);
                }
            }
            this.A0S = true;
        }
        int nalUnitLengthFieldLengthDiff = i + this.A0j.A08();
        if (!A03(938, 15, 64).equals(c0576Cg.A0Y)) {
            if (!A03(967, 16, 106).equals(c0576Cg.A0Y)) {
                if (c0576Cg.A0X != null) {
                    I1.A04(this.A0j.A08() == 0);
                    c0576Cg.A0X.A01(cl, this.A01, nalUnitLengthFieldLengthDiff);
                }
                while (true) {
                    int i8 = this.A07;
                    if (i8 >= nalUnitLengthFieldLengthDiff) {
                        break;
                    }
                    A00(cl, cw, nalUnitLengthFieldLengthDiff - i8);
                }
                if (!A03(181, 8, 49).equals(c0576Cg.A0Y)) {
                    this.A0n.A0Z(0);
                    cw.ACe(this.A0n, 4);
                    this.A08 += 4;
                    return;
                }
                return;
            }
        }
        byte[] bArr = this.A0h.A00;
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        int finalPartitionSize = c0576Cg.A0M;
        int i9 = 4 - c0576Cg.A0M;
        while (this.A07 < nalUnitLengthFieldLengthDiff) {
            int i10 = this.A09;
            if (i10 != 0) {
                this.A09 = i10 - A00(cl, cw, i10);
            } else {
                A0B(cl, bArr, i9, finalPartitionSize);
                this.A0h.A0Z(0);
                this.A09 = this.A0h.A0I();
                this.A0i.A0Z(0);
                cw.ACe(this.A0i, 4);
                this.A08 += 4;
            }
        }
        if (!A03(181, 8, 49).equals(c0576Cg.A0Y)) {
        }
    }

    private void A0A(CL cl, byte[] bArr, int i) throws IOException, InterruptedException {
        int length = bArr.length + i;
        if (this.A0m.A06() < length) {
            this.A0m.A00 = Arrays.copyOf(bArr, length + i);
        } else {
            System.arraycopy(bArr, 0, this.A0m.A00, 0, bArr.length);
        }
        cl.readFully(this.A0m.A00, bArr.length, i);
        this.A0m.A0X(length);
    }

    private void A0B(CL cl, byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int min = Math.min(i2, this.A0j.A05());
        cl.readFully(bArr, i + min, i2 - min);
        if (min > 0) {
            this.A0j.A0d(bArr, i, min);
        }
        this.A07 += i2;
    }

    private void A0C(C0576Cg c0576Cg, long j) {
        if (c0576Cg.A0X != null) {
            c0576Cg.A0X.A03(c0576Cg, j);
        } else {
            if (A03(843, 11, 56).equals(c0576Cg.A0Y)) {
                A0D(c0576Cg, A03(33, 19, 75), 19, 1000L, A0x);
            } else {
                if (A03(833, 10, 45).equals(c0576Cg.A0Y)) {
                    A0D(c0576Cg, A03(14, 19, 119), 21, gc0.c, A0v);
                }
            }
            c0576Cg.A0W.ACf(j, this.A01, this.A08, 0, c0576Cg.A0V);
        }
        this.A0V = true;
        A05();
    }

    private void A0D(C0576Cg c0576Cg, String str, int i, long j, byte[] bArr) {
        A0E(this.A0m.A00, this.A0C, str, i, j, bArr);
        CW cw = c0576Cg.A0W;
        IQ iq = this.A0m;
        cw.ACe(iq, iq.A08());
        this.A08 += this.A0m.A08();
    }

    public static void A0E(byte[] bArr, long j, String str, int i, long j2, byte[] bArr2) {
        byte[] A0j;
        if (j == -9223372036854775807L) {
            A0j = bArr2;
        } else {
            int i2 = (int) (j / 3600000000L);
            long j3 = j - ((i2 * b.ck) * 1000000);
            int i3 = (int) (j3 / 60000000);
            long j4 = j3 - ((i3 * 60) * 1000000);
            int lastValue = (int) (j4 / 1000000);
            A0j = C0726Ig.A0j(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(lastValue), Integer.valueOf((int) ((j4 - (lastValue * 1000000)) / j2))));
        }
        System.arraycopy(A0j, 0, bArr, i, bArr2.length);
    }

    private boolean A0F(CR cr, long j) {
        if (this.A0Y) {
            this.A0J = j;
            cr.A00 = this.A0F;
            this.A0Y = false;
            return true;
        }
        if (this.A0a) {
            long j2 = this.A0J;
            if (j2 != -1) {
                cr.A00 = j2;
                this.A0J = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0199, code lost:
        if (r3.equals(r4) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a8, code lost:
        if (A03(122, 6, 114).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01b8, code lost:
        if (A03(146, 8, 115).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01c8, code lost:
        if (A03(160, 13, 94).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01d8, code lost:
        if (A03(843, 11, 56).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01e8, code lost:
        if (A03(833, 10, 45).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f8, code lost:
        if (A03(854, 8, 44).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0208, code lost:
        if (A03(823, 10, 66).equals(r4) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0218, code lost:
        if (A03(815, 8, 9).equals(r4) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x021c, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x022e, code lost:
        if (r3.equals(r4) == false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0G(String str) {
        if (!A03(1006, 5, 40).equals(str) && !A03(1011, 5, 96).equals(str) && !A03(aa.b.l, 7, 80).equals(str) && !A03(953, 14, 58).equals(str) && !A03(923, 15, 39).equals(str) && !A03(909, 14, 105).equals(str) && !A03(938, 15, 64).equals(str)) {
            String A03 = A03(967, 16, 106);
            if (A0q[3].charAt(28) == 'C') {
                String[] strArr = A0q;
                strArr[4] = "gFQvwDmhScZxFRNyxLtLbYo4v3";
                strArr[4] = "gFQvwDmhScZxFRNyxLtLbYo4v3";
                if (!A03.equals(str) && !A03(983, 15, 89).equals(str) && !A03(998, 8, 13).equals(str) && !A03(154, 6, 96).equals(str) && !A03(181, 8, 49).equals(str)) {
                    String A032 = A03(74, 5, 98);
                    if (A0q[7].length() != 22) {
                        String[] strArr2 = A0q;
                        strArr2[4] = "yYEJAbRmKSD6Tn3gjgDK46nuM7";
                        strArr2[4] = "yYEJAbRmKSD6Tn3gjgDK46nuM7";
                        if (!A032.equals(str) && !A03(128, 9, 65).equals(str) && !A03(WKSRecord.Service.NETBIOS_NS, 9, 43).equals(str) && !A03(79, 5, 76).equals(str) && !A03(116, 6, 103).equals(str) && !A03(173, 8, 125).equals(str) && !A03(84, 5, 66).equals(str) && !A03(89, 13, 50).equals(str)) {
                            String A033 = A03(102, 14, 20);
                            if (A0q[7].length() != 22) {
                                String[] strArr3 = A0q;
                                strArr3[3] = "pyyZW9LYVntbYlKTrY71spzm2cbnCDIb";
                                strArr3[3] = "pyyZW9LYVntbYlKTrY71spzm2cbnCDIb";
                            } else {
                                String[] strArr4 = A0q;
                                strArr4[5] = "q8IJ3S8YGVBTsJL9xOb8znK6VKYJyoeN";
                                strArr4[0] = "yoxoUkUsMX88tVPYJ3NBxXOHcZGknnYN";
                            }
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return true;
    }

    public static int[] A0I(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        if (iArr.length >= i) {
            return iArr;
        }
        return new int[Math.max(iArr.length * 2, i)];
    }

    public final void A0J(int i) throws AN {
        if (i == 160) {
            if (this.A04 != 2) {
                return;
            }
            if (!this.A0W) {
                this.A01 |= 1;
            }
            A0C(this.A0c.get(this.A05), this.A0D);
            this.A04 = 0;
            return;
        }
        if (A0q[3].charAt(28) == 'C') {
            String[] strArr = A0q;
            strArr[2] = "rbl1Q01lKztgjfT5AU1HA1uCy8pKF6Jb";
            strArr[6] = "0IgewP00Z0tSvfgvmyCD0no1Nhaiy8Yj";
            if (i == 174) {
                if (A0G(this.A0O.A0Y)) {
                    C0576Cg c0576Cg = this.A0O;
                    c0576Cg.A0A(this.A0N, c0576Cg.A0N);
                    this.A0c.put(this.A0O.A0N, this.A0O);
                }
                this.A0O = null;
                return;
            } else if (i == 19899) {
                int i2 = this.A0B;
                if (i2 != -1) {
                    long j = this.A0I;
                    if (j != -1) {
                        if (i2 == 475249515) {
                            this.A0F = j;
                            return;
                        }
                        return;
                    }
                }
                throw new AN(A03(667, 50, 104));
            } else if (i == 25152) {
                if (this.A0O.A0c) {
                    if (this.A0O.A0V != null) {
                        this.A0O.A0U = new DrmInitData(new DrmInitData.SchemeData(C05269y.A04, A03(1024, 10, 56), this.A0O.A0V.A03));
                        return;
                    }
                    throw new AN(A03(449, 55, 66));
                }
                return;
            } else if (A0q[7].length() != 22) {
                String[] strArr2 = A0q;
                strArr2[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                strArr2[4] = "mvRw2Aey0bC26pGUqGZgnnTCCn";
                if (i == 28032) {
                    if (this.A0O.A0c && this.A0O.A0f != null) {
                        throw new AN(A03(WKSRecord.Service.SUR_MEAS, 53, 91));
                    }
                    return;
                } else if (i == 357149030) {
                    if (this.A0M == -9223372036854775807L) {
                        this.A0M = 1000000L;
                    }
                    long j2 = this.A0G;
                    if (j2 != -9223372036854775807L) {
                        this.A0H = A01(j2);
                        return;
                    }
                    return;
                } else if (i != 374648427) {
                    if (i == 475249515 && !this.A0a) {
                        this.A0N.ACk(A02());
                        this.A0a = true;
                        return;
                    }
                    return;
                } else if (this.A0c.size() != 0) {
                    this.A0N.A4w();
                    return;
                } else {
                    throw new AN(A03(756, 26, 66));
                }
            }
        }
        throw new RuntimeException();
    }

    public final void A0K(int i, double d) {
        if (i == 181) {
            this.A0O.A0O = (int) d;
        } else if (i != 17545) {
            switch (i) {
                case 21969:
                    this.A0O.A06 = (float) d;
                    return;
                case 21970:
                    this.A0O.A07 = (float) d;
                    return;
                case 21971:
                    this.A0O.A04 = (float) d;
                    return;
                case 21972:
                    this.A0O.A05 = (float) d;
                    return;
                case 21973:
                    this.A0O.A02 = (float) d;
                    return;
                case 21974:
                    this.A0O.A03 = (float) d;
                    return;
                case 21975:
                    this.A0O.A08 = (float) d;
                    return;
                case 21976:
                    this.A0O.A09 = (float) d;
                    return;
                case 21977:
                    this.A0O.A00 = (float) d;
                    return;
                case 21978:
                    this.A0O.A01 = (float) d;
                    return;
                default:
                    return;
            }
        } else {
            this.A0G = (long) d;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x036d, code lost:
        throw new com.facebook.ads.redexgen.X.AN(A03(396, 37, 111));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
        if (r6 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0146, code lost:
        r2 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d2, code lost:
        if (r6 == 8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01d6, code lost:
        r2 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0L(int timecode, int headerSize, CL cl) throws IOException, InterruptedException {
        int i;
        int i2;
        int[] iArr;
        int lacing;
        int i3 = 0;
        int i4 = 1;
        if (timecode != 161 && timecode != 163) {
            if (timecode == 16981) {
                C0576Cg c0576Cg = this.A0O;
                c0576Cg.A0f = new byte[headerSize];
                cl.readFully(c0576Cg.A0f, 0, headerSize);
                return;
            } else if (timecode == 18402) {
                byte[] bArr = new byte[headerSize];
                cl.readFully(bArr, 0, headerSize);
                this.A0O.A0V = new CV(1, bArr, 0, 0);
                return;
            } else {
                String[] strArr = A0q;
                if (strArr[2].charAt(10) != strArr[6].charAt(10)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0q;
                strArr2[3] = "8HR6gUBClUOA9VGF2AqdEWeY5A09ChiZ";
                strArr2[3] = "8HR6gUBClUOA9VGF2AqdEWeY5A09ChiZ";
                if (timecode == 21419) {
                    Arrays.fill(this.A0l.A00, (byte) 0);
                    cl.readFully(this.A0l.A00, 4 - headerSize, headerSize);
                    this.A0l.A0Z(0);
                    this.A0B = (int) this.A0l.A0N();
                    return;
                } else if (timecode == 25506) {
                    C0576Cg c0576Cg2 = this.A0O;
                    c0576Cg2.A0d = new byte[headerSize];
                    cl.readFully(c0576Cg2.A0d, 0, headerSize);
                    return;
                } else if (timecode == 30322) {
                    C0576Cg c0576Cg3 = this.A0O;
                    c0576Cg3.A0e = new byte[headerSize];
                    cl.readFully(c0576Cg3.A0e, 0, headerSize);
                    return;
                } else {
                    throw new AN(A03(862, 15, 92) + timecode);
                }
            }
        }
        if (this.A04 == 0) {
            this.A05 = (int) this.A0e.A05(cl, false, true, 8);
            this.A06 = this.A0e.A04();
            this.A0C = -9223372036854775807L;
            this.A04 = 1;
            this.A0k.A0W();
        }
        C0576Cg c0576Cg4 = this.A0c.get(this.A05);
        if (c0576Cg4 == null) {
            cl.ADG(headerSize - this.A06);
            this.A04 = 0;
            return;
        }
        if (this.A04 == 1) {
            A08(cl, 3);
            int i5 = (this.A0k.A00[2] & 6) >> 1;
            if (i5 == 0) {
                this.A02 = 1;
                this.A0b = A0I(this.A0b, 1);
                this.A0b[0] = (headerSize - this.A06) - 3;
            } else if (timecode == 163) {
                A08(cl, 4);
                this.A02 = (this.A0k.A00[3] & 255) + 1;
                this.A0b = A0I(this.A0b, this.A02);
                if (i5 == 2) {
                    int i6 = this.A02;
                    Arrays.fill(this.A0b, 0, i6, ((headerSize - this.A06) - 4) / i6);
                } else if (i5 != 1) {
                    if (i5 == 3) {
                        int i7 = 0;
                        int i8 = 4;
                        int sampleIndex = 0;
                        while (true) {
                            int i9 = this.A02;
                            if (sampleIndex >= i9 - 1) {
                                this.A0b[i9 - 1] = ((headerSize - this.A06) - i8) - i7;
                                break;
                            }
                            this.A0b[sampleIndex] = i3;
                            i8++;
                            A08(cl, i8);
                            if (this.A0k.A00[i8 - 1] != 0) {
                                long j = 0;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 8) {
                                        break;
                                    }
                                    int i11 = 7 - i10;
                                    if (A0q[4].length() != 26) {
                                        throw new RuntimeException();
                                    }
                                    String[] strArr3 = A0q;
                                    strArr3[4] = "Bykf528VWyTJ6zjZNIQBG2ExBd";
                                    strArr3[4] = "Bykf528VWyTJ6zjZNIQBG2ExBd";
                                    int i12 = i4 << i11;
                                    if ((this.A0k.A00[i8 - 1] & i12) != 0) {
                                        int i13 = i8 - 1;
                                        i8 += i10;
                                        A08(cl, i8);
                                        int readPosition = i13 + 1;
                                        j = this.A0k.A00[i13] & 255 & (i12 ^ (-1));
                                        while (readPosition < i8) {
                                            int i14 = readPosition + 1;
                                            long readValue = this.A0k.A00[readPosition] & 255;
                                            j = (j << 8) | readValue;
                                            readPosition = i14;
                                        }
                                        if (sampleIndex > 0) {
                                            long readValue2 = (i10 * 7) + 6;
                                            j -= (1 << readValue2) - 1;
                                        }
                                    } else {
                                        i10++;
                                        i4 = 1;
                                    }
                                }
                                if (j < -2147483648L || j > TTL.MAX_VALUE) {
                                    break;
                                }
                                int i15 = (int) j;
                                int[] iArr2 = this.A0b;
                                if (sampleIndex != 0) {
                                    i15 += iArr2[sampleIndex - 1];
                                }
                                iArr2[sampleIndex] = i15;
                                if (A0q[3].charAt(28) != 'C') {
                                    String[] strArr4 = A0q;
                                    strArr4[3] = "z0Au1LkbuRNouNVheQnfVlMARF4HCclD";
                                    strArr4[3] = "z0Au1LkbuRNouNVheQnfVlMARF4HCclD";
                                    i7 += this.A0b[sampleIndex];
                                    sampleIndex += 0;
                                    i3 = 0;
                                    i4 = 0;
                                } else {
                                    String[] strArr5 = A0q;
                                    strArr5[3] = "Jxw4JkcEKQdQjQ2wbghJK6p5EXksCnqX";
                                    strArr5[3] = "Jxw4JkcEKQdQjQ2wbghJK6p5EXksCnqX";
                                    i7 += this.A0b[sampleIndex];
                                    sampleIndex++;
                                    i3 = 0;
                                    i4 = 1;
                                }
                            } else {
                                throw new AN(A03(782, 33, 48));
                            }
                        }
                    } else {
                        throw new AN(A03(877, 25, 119) + i5);
                    }
                } else {
                    int i16 = 0;
                    int i17 = 4;
                    int headerSize2 = 0;
                    while (true) {
                        i = this.A02;
                        int sampleIndex2 = i - 1;
                        if (headerSize2 >= sampleIndex2) {
                            break;
                        }
                        int[] iArr3 = this.A0b;
                        if (A0q[7].length() != 22) {
                            String[] strArr6 = A0q;
                            strArr6[2] = "HssTvrarjitDxoBDF2Pnj4UTJMHcRuUP";
                            strArr6[6] = "K3IxBmd25ftGgmGYMlH4ryvoOn2rdnQj";
                            iArr3[headerSize2] = 0;
                        } else {
                            iArr3[headerSize2] = 0;
                        }
                        do {
                            i17++;
                            A08(cl, i17);
                            int sampleIndex3 = i17 - 1;
                            i2 = this.A0k.A00[sampleIndex3] & 255;
                            iArr = this.A0b;
                            int sampleIndex4 = iArr[headerSize2];
                            iArr[headerSize2] = sampleIndex4 + i2;
                        } while (i2 == 255);
                        int sampleIndex5 = iArr[headerSize2];
                        i16 += sampleIndex5;
                        headerSize2++;
                    }
                    this.A0b[i - 1] = ((headerSize - this.A06) - i17) - i16;
                }
            } else {
                throw new AN(A03(629, 38, 70));
            }
            this.A0D = this.A0E + A01((this.A0k.A00[0] << 8) | (this.A0k.A00[1] & 255));
            int i18 = this.A0k.A00[2] & 8;
            if (A0q[4].length() == 26) {
                String[] strArr7 = A0q;
                strArr7[5] = "5G9wMrzgr3HoIE5OqVQ73d664iMAVR2N";
                strArr7[0] = "QdpFkvZSEeJoLmtyZ134AKJ6iIUqyZiN";
            }
            this.A01 = (c0576Cg4.A0Q == 2 || (timecode == 163 && (this.A0k.A00[2] & g15.b) == 128) ? 1 : 0) | (lacing != 0 ? Integer.MIN_VALUE : 0);
            this.A04 = 2;
            this.A03 = 0;
        }
        if (timecode != 163) {
            A09(cl, c0576Cg4, this.A0b[0]);
            return;
        }
        while (true) {
            int i19 = this.A03;
            if (i19 < this.A02) {
                A09(cl, c0576Cg4, this.A0b[i19]);
                long j2 = this.A0D;
                int i20 = this.A03;
                int i21 = c0576Cg4.A0F;
                String[] strArr8 = A0q;
                if (strArr8[2].charAt(10) != strArr8[6].charAt(10)) {
                    A0C(c0576Cg4, j2 + ((i20 * i21) / 1000));
                    this.A03++;
                } else {
                    String[] strArr9 = A0q;
                    strArr9[1] = "E2JpTArVwuU3wpOoffpeNj7iCqMKWnIf";
                    strArr9[1] = "E2JpTArVwuU3wpOoffpeNj7iCqMKWnIf";
                    A0C(c0576Cg4, j2 + ((i20 * i21) / 1000));
                    this.A03++;
                }
            } else {
                this.A04 = 0;
                return;
            }
        }
    }

    public final void A0M(int i, long j) throws AN {
        String A03 = A03(0, 14, 56);
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw new AN(A03(327, 21, 54) + j + A03);
        } else if (i != 20530) {
            switch (i) {
                case WKSRecord.Service.CISCO_TNA /* 131 */:
                    this.A0O.A0Q = (int) j;
                    return;
                case WKSRecord.Service.PROFILE /* 136 */:
                    this.A0O.A0Z = j == 1;
                    return;
                case 155:
                    this.A0C = A01(j);
                    return;
                case 159:
                    this.A0O.A0B = (int) j;
                    return;
                case 176:
                    this.A0O.A0R = (int) j;
                    return;
                case 179:
                    this.A0Q.A04(A01(j));
                    return;
                case yg1.G /* 186 */:
                    this.A0O.A0J = (int) j;
                    return;
                case 215:
                    this.A0O.A0N = (int) j;
                    return;
                case 231:
                    this.A0E = A01(j);
                    return;
                case 241:
                    if (this.A0Z) {
                        return;
                    }
                    this.A0P.A04(j);
                    this.A0Z = true;
                    return;
                case Type.IXFR /* 251 */:
                    this.A0W = true;
                    return;
                case 16980:
                    if (j == 3) {
                        return;
                    }
                    throw new AN(A03(a.aP, 16, 112) + j + A03);
                case 17029:
                    if (j >= 1 && j <= 2) {
                        return;
                    }
                    throw new AN(A03(377, 19, 127) + j + A03);
                case 17143:
                    if (j == 1) {
                        return;
                    }
                    throw new AN(A03(433, 16, 53) + j + A03);
                case 18401:
                    if (j == 5) {
                        return;
                    }
                    throw new AN(A03(312, 15, 26) + j + A03);
                case 18408:
                    if (j == 1) {
                        return;
                    }
                    throw new AN(A03(52, 22, 45) + j + A03);
                case 21420:
                    this.A0I = this.A0K + j;
                    return;
                case 21432:
                    int i2 = (int) j;
                    if (i2 == 0) {
                        this.A0O.A0P = 0;
                        return;
                    } else if (i2 == 1) {
                        this.A0O.A0P = 2;
                        return;
                    } else if (i2 == 3) {
                        this.A0O.A0P = 1;
                        return;
                    } else if (i2 != 15) {
                        return;
                    } else {
                        this.A0O.A0P = 3;
                        return;
                    }
                case 21680:
                    this.A0O.A0I = (int) j;
                    return;
                case 21682:
                    this.A0O.A0H = (int) j;
                    return;
                case 21690:
                    this.A0O.A0G = (int) j;
                    return;
                case 21930:
                    this.A0O.A0a = j == 1;
                    return;
                case 22186:
                    this.A0O.A0S = j;
                    return;
                case 22203:
                    this.A0O.A0T = j;
                    return;
                case 25188:
                    this.A0O.A0A = (int) j;
                    return;
                case 2352003:
                    this.A0O.A0F = (int) j;
                    return;
                case 2807729:
                    this.A0M = j;
                    return;
                default:
                    switch (i) {
                        case 21945:
                            int i3 = (int) j;
                            if (i3 == 1) {
                                this.A0O.A0C = 2;
                                return;
                            } else if (i3 != 2) {
                                return;
                            } else {
                                this.A0O.A0C = 1;
                                return;
                            }
                        case 21946:
                            int i4 = (int) j;
                            if (i4 != 1) {
                                if (A0q[4].length() != 26) {
                                    throw new RuntimeException();
                                }
                                String[] strArr = A0q;
                                strArr[7] = "BNY";
                                strArr[7] = "BNY";
                                if (i4 == 16) {
                                    C0576Cg c0576Cg = this.A0O;
                                    String[] strArr2 = A0q;
                                    if (strArr2[2].charAt(10) != strArr2[6].charAt(10)) {
                                        c0576Cg.A0E = 6;
                                        return;
                                    }
                                    String[] strArr3 = A0q;
                                    strArr3[2] = "2BcX3syCXJtWqdpX1qkuhAX2qE5R3ro0";
                                    strArr3[6] = "aMiDNxLEmFtOjuqrXAq5lyKODggVFywu";
                                    c0576Cg.A0E = 6;
                                    return;
                                } else if (i4 == 18) {
                                    this.A0O.A0E = 7;
                                    return;
                                } else if (i4 != 6 && i4 != 7) {
                                    return;
                                }
                            }
                            this.A0O.A0E = 3;
                            return;
                        case 21947:
                            C0576Cg c0576Cg2 = this.A0O;
                            c0576Cg2.A0b = true;
                            int i5 = (int) j;
                            if (i5 == 1) {
                                c0576Cg2.A0D = 1;
                                return;
                            } else if (i5 == 9) {
                                c0576Cg2.A0D = 6;
                                return;
                            } else if (i5 != 4 && i5 != 5 && i5 != 6 && i5 != 7) {
                                return;
                            } else {
                                this.A0O.A0D = 2;
                                return;
                            }
                        case 21948:
                            this.A0O.A0K = (int) j;
                            return;
                        case 21949:
                            this.A0O.A0L = (int) j;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            int i6 = (j > 1L ? 1 : (j == 1L ? 0 : -1));
            if (A0q[7].length() != 22) {
                String[] strArr4 = A0q;
                strArr4[1] = "hD31tqXIhnGrFxqSOgo1vvmOI12OLqRQ";
                strArr4[1] = "hD31tqXIhnGrFxqSOgo1vvmOI12OLqRQ";
                if (i6 == 0) {
                    return;
                }
            } else if (i6 == 0) {
                return;
            }
            throw new AN(A03(348, 21, 50) + j + A03);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e4, code lost:
        if (r5 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e6, code lost:
        r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f3, code lost:
        if (com.facebook.ads.redexgen.X.YT.A0q[7].length() == 22) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f5, code lost:
        r2 = com.facebook.ads.redexgen.X.YT.A0q;
        r2[4] = "xUjpTE6fi698I1UVKMv3yTWS8T";
        r2[4] = "xUjpTE6fi698I1UVKMv3yTWS8T";
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0101, code lost:
        if (r5 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0103, code lost:
        r7.A0K = r9;
        r7.A0L = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0114, code lost:
        if (r5 != 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0126, code lost:
        throw new com.facebook.ads.redexgen.X.AN(A03(717, 39, 13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A0N(int i, long j, long j2) throws AN {
        if (i == 160) {
            this.A0W = false;
            return;
        }
        String[] strArr = A0q;
        if (strArr[5].charAt(31) != strArr[0].charAt(31)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0q;
        strArr2[4] = "AdTS27cZyEPjMpBmCOVMxp7hS9";
        strArr2[4] = "AdTS27cZyEPjMpBmCOVMxp7hS9";
        if (i == 174) {
            this.A0O = new C0576Cg(null);
        } else if (i == 187) {
            this.A0Z = false;
        } else if (i == 19899) {
            this.A0B = -1;
            this.A0I = -1L;
        } else {
            String[] strArr3 = A0q;
            if (strArr3[5].charAt(31) != strArr3[0].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr4 = A0q;
            strArr4[3] = "wY7PzT4LsA3mCgyVRS2Kw1OTPeLWClxa";
            strArr4[3] = "wY7PzT4LsA3mCgyVRS2Kw1OTPeLWClxa";
            if (i == 20533) {
                this.A0O.A0c = true;
            } else if (i == 21968) {
                this.A0O.A0b = true;
            } else if (i == 25152) {
            } else {
                if (i != 408125543) {
                    if (i == 475249515) {
                        this.A0Q = new IG();
                        this.A0P = new IG();
                        return;
                    }
                    String[] strArr5 = A0q;
                    if (strArr5[2].charAt(10) != strArr5[6].charAt(10)) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0q;
                    strArr6[7] = "qI";
                    strArr6[7] = "qI";
                    if (i == 524531317 && !this.A0a) {
                        if (this.A0o && this.A0F != -1) {
                            this.A0Y = true;
                            return;
                        }
                        this.A0N.ACk(new YH(this.A0H));
                        this.A0a = true;
                        return;
                    }
                    return;
                }
                long j3 = this.A0K;
                int i2 = (j3 > (-1L) ? 1 : (j3 == (-1L) ? 0 : -1));
                if (A0q[3].charAt(28) != 'C') {
                    String[] strArr7 = A0q;
                    strArr7[1] = "okD0JH5Pg04Fag3yJX3zPaKxT8VrFmF5";
                    strArr7[1] = "okD0JH5Pg04Fag3yJX3zPaKxT8VrFmF5";
                } else {
                    String[] strArr8 = A0q;
                    strArr8[1] = "T2xOY9FAgnWM5SNzjVuKwwLVgl3XIr00";
                    strArr8[1] = "T2xOY9FAgnWM5SNzjVuKwwLVgl3XIr00";
                }
            }
        }
    }

    public final void A0O(int i, String str) throws AN {
        if (i == 134) {
            this.A0O.A0Y = str;
        } else if (i != 17026) {
            if (i != 2274716) {
                return;
            }
            C0576Cg.A02(this.A0O, str);
        } else if (A03(IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK, 4, 114).equals(str) || A03(nr.q, 8, 38).equals(str)) {
        } else {
            throw new AN(A03(369, 8, 86) + str + A03(0, 14, 56));
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void A7Q(CM cm) {
        this.A0N = cm;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final int ABx(CL cl, CR cr) throws IOException, InterruptedException {
        this.A0V = false;
        boolean z = true;
        while (z && !this.A0V) {
            z = this.A0d.ABz(cl);
            if (z && A0F(cr, cl.A6m())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.A0c.size(); i++) {
            this.A0c.valueAt(i).A08();
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final void ACj(long j, long j2) {
        this.A0E = -9223372036854775807L;
        this.A04 = 0;
        this.A0d.reset();
        this.A0e.A06();
        A05();
        for (int i = 0; i < this.A0c.size(); i++) {
            this.A0c.valueAt(i).A09();
        }
    }

    @Override // com.facebook.ads.redexgen.X.CK
    public final boolean ADH(CL cl) throws IOException, InterruptedException {
        return new C0578Ci().A02(cl);
    }
}
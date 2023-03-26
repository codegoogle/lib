package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Hr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0711Hr {
    public static String[] A00;

    static {
        A03();
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0090, code lost:
        return r9;
     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 25 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:146)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:564)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0088: INVOKE  (r3 I:com.facebook.ads.redexgen.X.HM) type: STATIC call: com.facebook.ads.redexgen.X.Ig.A0X(com.facebook.ads.redexgen.X.HM):void, block:B:32:0x0088 */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0092: INVOKE  (r3 I:com.facebook.ads.redexgen.X.HM) type: STATIC call: com.facebook.ads.redexgen.X.Ig.A0X(com.facebook.ads.redexgen.X.HM):void, block:B:36:0x0092 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long A00(HQ hq, long j, long j2, HM hm, byte[] bArr, IU iu, int i, C0710Hq c0710Hq) throws IOException, InterruptedException {
        HM hm2;
        while (true) {
            if (iu != null) {
                iu.A01(i);
            }
            try {
                break;
            } catch (IT unused) {
            } finally {
                C0726Ig.A0X(hm2);
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        HQ hq2 = new HQ(hq.A04, hq.A06, j, (hq.A03 + j) - hq.A01, -1L, hq.A05, hq.A00 | 2);
        long ABP = hm2.ABP(hq2);
        if (c0710Hq.A01 == -1 && ABP != -1) {
            c0710Hq.A01 = hq2.A01 + ABP;
        }
        long j3 = 0;
        while (true) {
            if (j3 == j2) {
                break;
            } else if (Thread.interrupted()) {
                throw new InterruptedException();
            } else {
                int read = hm2.read(bArr, 0, j2 != -1 ? (int) Math.min(bArr.length, j2 - j3) : bArr.length);
                if (read != -1) {
                    j3 += read;
                    c0710Hq.A02 += read;
                } else if (c0710Hq.A01 == -1) {
                    c0710Hq.A01 = hq2.A01 + j3;
                }
            }
        }
    }

    public static void A03() {
        A00 = new String[]{"v79OOCD3rFDrBH3Sw8ccat0nkfR9Jk8K", "zaqJSCMgPr8q8xIyOc2JWspWFv3JOD4h", "Sqp2xVCvxFHsc", "s8GBWRpegr", "t6Y6wcH7Q091ZQl7CdWm1Bgnnklpnco", "XVr0n", "MY0M4GS8ICKTpGygoaRzgsCYiOraPhWK", "Pkt85Yo8hwIimoTAGZdJTyJAkZ2fE06T"};
    }

    public static String A01(Uri uri) {
        return uri.toString();
    }

    public static String A02(HQ hq) {
        return hq.A05 != null ? hq.A05 : A01(hq.A04);
    }

    public static void A04(HQ hq, InterfaceC0705Hl interfaceC0705Hl, C1231aw c1231aw, byte[] bArr, IU iu, int i, @Nullable C0710Hq c0710Hq, @Nullable AtomicBoolean atomicBoolean, boolean z) throws IOException, InterruptedException {
        C0710Hq counters = c0710Hq;
        I1.A01(c1231aw);
        I1.A01(bArr);
        if (counters != null) {
            A05(hq, interfaceC0705Hl, counters);
        } else {
            counters = new C0710Hq();
        }
        String key = A02(hq);
        long j = hq.A01;
        long left = hq.A02 != -1 ? hq.A02 : interfaceC0705Hl.A5m(key);
        while (true) {
            long j2 = 0;
            if (left != 0) {
                if (atomicBoolean != null) {
                    boolean z2 = atomicBoolean.get();
                    if (A00[5].length() == 1) {
                        break;
                    }
                    String[] strArr = A00;
                    strArr[5] = "EAlW89nW7uOIImzUc5SW8CQaYz84C";
                    strArr[5] = "EAlW89nW7uOIImzUc5SW8CQaYz84C";
                    if (z2) {
                        throw new InterruptedException();
                    }
                }
                long A5a = interfaceC0705Hl.A5a(key, j, left != -1 ? left : Long.MAX_VALUE);
                if (A5a <= 0) {
                    long j3 = -A5a;
                    String[] strArr2 = A00;
                    if (strArr2[6].length() != strArr2[1].length()) {
                        break;
                    }
                    String[] strArr3 = A00;
                    strArr3[2] = "OFDha7Ysfl6kB";
                    strArr3[2] = "OFDha7Ysfl6kB";
                    A5a = j3;
                    if (A00(hq, j, j3, c1231aw, bArr, iu, i, counters) < A5a) {
                        if (!z || left == -1) {
                            return;
                        }
                        throw new EOFException();
                    }
                }
                j += A5a;
                if (left != -1) {
                    j2 = A5a;
                }
                left -= j2;
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public static void A05(HQ hq, InterfaceC0705Hl interfaceC0705Hl, C0710Hq c0710Hq) {
        long A5m;
        String A02 = A02(hq);
        long j = hq.A01;
        if (hq.A02 != -1) {
            A5m = hq.A02;
        } else {
            A5m = interfaceC0705Hl.A5m(A02);
        }
        c0710Hq.A01 = A5m;
        if (A00[5].length() == 1) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[4] = "nu";
        strArr[4] = "nu";
        c0710Hq.A00 = 0L;
        c0710Hq.A02 = 0L;
        while (A5m != 0) {
            long start = interfaceC0705Hl.A5a(A02, j, A5m != -1 ? A5m : Long.MAX_VALUE);
            if (start > 0) {
                c0710Hq.A00 += start;
            } else {
                start = -start;
                if (start == Long.MAX_VALUE) {
                    return;
                }
            }
            j += start;
            if (A5m == -1) {
                start = 0;
            }
            A5m -= start;
        }
    }

    public static void A06(InterfaceC0705Hl interfaceC0705Hl, String str) {
        for (C0709Hp c0709Hp : interfaceC0705Hl.A5b(str)) {
            if (A00[2].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[4] = "R4HmvLUlpWi57h";
            strArr[4] = "R4HmvLUlpWi57h";
            try {
                interfaceC0705Hl.ACO(c0709Hp);
            } catch (C0703Hj unused) {
            }
        }
    }
}
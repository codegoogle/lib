package com.facebook.ads.redexgen.X;

import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class XW<T> implements C9Z<T> {
    public static byte[] A06;
    public static String[] A07;
    public C9R A00;
    public C9R A01;
    public List<XW<T>.RecordFileBasedFetch> A02 = new ArrayList();
    public boolean A03;
    public final C9Q A04;
    public final C05089g A05;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, 26, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, Flags.CD, 0, 6, 5, -73, 0, 10, -73, -8, Flags.CD, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, Flags.CD, -8, 9, Flags.CD, 10, -73, -8, Flags.CD, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, Flags.CD, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, Flags.CD, -78, -28, bx.j7, -30, -34, bx.j7, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, bx.j7, -44, -46, -34, bx.j7, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, bx.j7, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, Flags.CD, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, Flags.CD, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, bx.j7, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, 26, 29, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, 25, -47, 21, 18, 37, 18, -47, 23, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, ax5.a, 75, 78, 64, -4, ax5.a, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, Flags.CD, 9, 21, 24, 10, -20, 15, 18, Flags.CD, -24, 7, 25, Flags.CD, 10, -8, Flags.CD, 9, 21, 24, 10, -22, 7, 26, 7, 8, 7, 25, Flags.CD, -58, 15, 25, -58, 9, 18, 21, 25, Flags.CD, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, bx.l7, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, Flags.CD, 29, 26, 27, 23, 26, 5, 2, 21, 2};
    }

    public static void A02() {
        A07 = new String[]{"qjHjxJEnKto6KXykxGUV", "2zWwgsdc0YI2n1wuHJ0aHIsPzdmfxqsH", "nH8zlfZwPcU2YCM90OUKaCidDMv0PXY6", "9v530zo2HQQRKyJKvzn5HrUNTPRL7Myp", "K3vwlAe6bCWVMYHegp9FYHqzcyyslUPY", "TkUFKGPVf3MACXJSEel58pLd1ZQWiXgG", "k6Fq1", "q4H6OwDTyeTkPN5vSxQjqxUvCkQfNX6D"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XW(C9W c9w, InterfaceC05069e interfaceC05069e) throws IOException {
        this.A05 = new C05089g(c9w.A04(A00(515, 4, 63)), interfaceC05069e);
        this.A04 = new C9Q(new File(c9w.A05(), A00(509, 6, 70)));
        this.A00 = this.A04.A04();
        A06(interfaceC05069e);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A03(int i, int i2) throws IOException {
        this.A00 = new C9R(i, i2);
        this.A04.A05(this.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XV != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XW<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A04(XV xv) throws C05109i {
        if (!this.A03) {
            if (A07(xv)) {
                if (xv.A54() == 0) {
                    return;
                }
                if (this.A00.A05(xv.A00().A02) == 0) {
                    try {
                        for (C05059d c05059d : xv.A00) {
                            if (c05059d.A00 == this.A05.A08() && this.A05.A0E()) {
                                A03(this.A05.A07(), 0);
                            } else {
                                A03(this.A05.A07(), xv.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A05(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C05109i(A00(361, 30, 93), e);
                    }
                }
                throw new C05109i(A00(0, 54, 63));
            }
            throw new C05109i(A00(466, 43, 49));
        }
        throw new C05109i(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A06(InterfaceC05069e interfaceC05069e) throws IOException {
        C9R c9r = new C9R(this.A05.A07(), 0);
        if (c9r.A05(this.A00) > 0) {
            interfaceC05069e.ACV(String.format(Locale.US, A00(54, 102, 53), Integer.valueOf(this.A00.A03()), Integer.valueOf(this.A00.A04()), Integer.valueOf(c9r.A03()), Integer.valueOf(c9r.A04())));
            this.A00 = c9r;
            return;
        }
        while (c9r.A03() < this.A00.A03()) {
            if (this.A05.A0E()) {
                c9r = new C9R(this.A05.A07(), 0);
            } else {
                interfaceC05069e.ACV(String.format(Locale.US, A00(156, 101, 13), Integer.valueOf(this.A00.A03()), Integer.valueOf(this.A00.A04()), Integer.valueOf(c9r.A03())));
                this.A00 = new C9R(this.A05.A07(), this.A05.A08());
                this.A04.A05(this.A00);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XV != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XW<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A07(XV xv) {
        if (!this.A02.remove(xv)) {
            return false;
        }
        if (xv.A54() > 0 && xv.A01().A02.A06(xv.A01().A01).equals(this.A01)) {
            this.A01 = xv.A00().A02;
        }
        if (A07[6].length() != 28) {
            String[] strArr = A07;
            strArr[6] = "RJmBk8mp9ukvkOiT1GdeN9JCmreSI8hk";
            strArr[6] = "RJmBk8mp9ukvkOiT1GdeN9JCmreSI8hk";
            return true;
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XV != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9Z
    public final synchronized C9Y A53(byte[] bArr, int[] iArr) throws C05109i {
        XW<T>.RecordFileBasedFetch xv;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean z = true;
                while (true) {
                    C9U A0B = this.A05.A0B(this.A01.A03(), this.A01.A04(), bArr, i, iArr, i2);
                    int A00 = A0B.A01().A00() - A0B.A01().A01();
                    i += A0B.A01().A02();
                    i2 += A00;
                    if (A0B.A01().A03() == C9S.A02) {
                        arrayList.add(A0B);
                    }
                    if (A0B.A01().A03() == C9S.A03) {
                        break;
                    } else if (A0B.A01().A03() == C9S.A04) {
                        if (this.A05.A07() + this.A05.A09() == this.A01.A03() + 1) {
                            z = false;
                            break;
                        }
                        this.A01 = new C9R(this.A01.A03() + 1, 0);
                    } else {
                        this.A01 = this.A01.A06(A00);
                    }
                }
                xv = new XV(this, arrayList, z);
                this.A02.add(xv);
                if (!arrayList.isEmpty()) {
                    this.A01 = xv.A01().A02.A06(xv.A01().A01);
                }
            } catch (IOException e) {
                throw new C05109i(A00(306, 29, 79), e);
            }
        } else {
            throw new C05109i(A00(391, 36, 119));
        }
        return xv;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9Z
    public final synchronized int A6p() throws C05109i {
        int A0A;
        if (!this.A03) {
            try {
                A0A = this.A05.A0A();
                if (this.A00.A03() == this.A05.A07()) {
                    A0A -= this.A00.A04();
                }
            } catch (IOException e) {
                throw new C05109i(A00(335, 26, 122), e);
            }
        } else {
            throw new C05109i(A00(427, 39, 68));
        }
        return A0A;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9Z
    public final synchronized void ADQ(byte[] bArr) throws C05109i {
        if (!this.A03) {
            try {
                this.A05.A0D(bArr);
            } catch (IOException e) {
                throw new C05109i(A00(257, 25, 61), e);
            }
        } else {
            throw new C05109i(A00(427, 39, 68));
        }
        String[] strArr = A07;
        if (strArr[5].charAt(29) != strArr[7].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "aLWzj";
        strArr2[6] = "aLWzj";
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.C9Z
    public final synchronized void clear() throws C05109i {
        try {
            this.A05.A0C();
            A03(this.A05.A07(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C05109i(A00(282, 24, 16), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XW != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
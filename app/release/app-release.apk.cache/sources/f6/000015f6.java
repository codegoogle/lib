package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.aw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1231aw implements HM {
    public static String[] A0L;
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public HM A07;
    public C0709Hp A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final HM A0D;
    public final HM A0E;
    public final HM A0F;
    public final InterfaceC0705Hl A0G;
    @Nullable
    public final InterfaceC0707Hn A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    static {
        A05();
    }

    public static void A05() {
        A0L = new String[]{"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    }

    public C1231aw(InterfaceC0705Hl interfaceC0705Hl, HM hm, HM hm2, HK hk, int i, @Nullable InterfaceC0707Hn interfaceC0707Hn) {
        this.A0G = interfaceC0705Hl;
        this.A0D = hm2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = hm;
        if (hk != null) {
            this.A0E = new C1226ar(hm, hk);
        } else {
            this.A0E = null;
        }
        this.A0H = interfaceC0707Hn;
    }

    private int A00(HQ hq) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && hq.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(InterfaceC0705Hl interfaceC0705Hl, String str, Uri uri) {
        InterfaceC0715Hv contentMetadata = interfaceC0705Hl.A5n(str);
        Uri A01 = C0716Hw.A01(contentMetadata);
        return A01 == null ? uri : A01;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.ads.redexgen.X.Hp, com.facebook.ads.redexgen.X.HM] */
    private void A02() throws IOException {
        HM hm = this.A07;
        if (hm == null) {
            return;
        }
        try {
            hm.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            C0709Hp c0709Hp = this.A08;
            if (c0709Hp != null) {
                this.A0G.ACH(c0709Hp);
                this.A08 = null;
            }
        }
    }

    private void A03() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5Z();
            throw null;
        }
    }

    private void A04() throws IOException {
        this.A01 = 0L;
        if (A0B()) {
            this.A0G.ACu(this.A09, this.A03);
        }
    }

    private void A06(IOException iOException) {
        if (A09() || (iOException instanceof C0703Hj)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x01c3, code lost:
        if (r4 != (-1)) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c5, code lost:
        r2 = java.lang.Math.min(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01da, code lost:
        if (r4 != (-1)) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A07(boolean z) throws IOException {
        C0709Hp ADL;
        long j;
        long j2;
        HQ hq;
        HM nextDataSource;
        long j3;
        if (this.A0B) {
            ADL = null;
        } else if (this.A0I) {
            try {
                InterfaceC0705Hl interfaceC0705Hl = this.A0G;
                String str = this.A09;
                long length = this.A03;
                ADL = interfaceC0705Hl.ADL(str, length);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            InterfaceC0705Hl interfaceC0705Hl2 = this.A0G;
            String str2 = this.A09;
            long length2 = this.A03;
            ADL = interfaceC0705Hl2.ADM(str2, length2);
        }
        if (ADL == null) {
            nextDataSource = this.A0F;
            hq = new HQ(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else {
            boolean z2 = ADL.A05;
            if (A0L[1].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0L;
            strArr[1] = "1UJmYg9w0Ah8MKa";
            strArr[1] = "1UJmYg9w0Ah8MKa";
            if (z2) {
                Uri fromFile = Uri.fromFile(ADL.A03);
                long j4 = this.A03 - ADL.A02;
                long filePosition = ADL.A01 - j4;
                long j5 = this.A01;
                if (j5 != -1) {
                    filePosition = Math.min(filePosition, j5);
                }
                hq = new HQ(fromFile, this.A03, j4, filePosition, this.A09, this.A00);
                nextDataSource = this.A0D;
            } else {
                if (ADL.A02()) {
                    j = this.A01;
                } else {
                    j = ADL.A01;
                    if (A0L[5].charAt(13) != 'v') {
                        j2 = this.A01;
                    } else {
                        String[] strArr2 = A0L;
                        strArr2[4] = "PC7XIFFDC47aQsnqIkxNyje9RJvaJdFU";
                        strArr2[2] = "PcakhZiXuGMneXp1j61qedRiaoGK74TH";
                        j2 = this.A01;
                    }
                }
                hq = new HQ(this.A06, this.A03, j, this.A09, this.A00);
                if (this.A0E != null) {
                    nextDataSource = this.A0E;
                } else {
                    nextDataSource = this.A0F;
                    this.A0G.ACH(ADL);
                    ADL = null;
                }
            }
        }
        boolean z3 = this.A0B;
        if (A0L[5].charAt(13) == 'v') {
            String[] strArr3 = A0L;
            strArr3[0] = "KvwFMKvPDdyoDof7jewHEr1dZonPaeal";
            strArr3[6] = "fxC7lv0XmsujX3kF6ChIFpCKa92dKX8Z";
            if (!z3 && nextDataSource == this.A0F) {
                j3 = this.A03 + 102400;
            } else {
                j3 = Long.MAX_VALUE;
            }
            this.A02 = j3;
            if (z) {
                I1.A04(A08());
                if (nextDataSource == this.A0F) {
                    return;
                }
                try {
                    A02();
                } catch (Throwable th) {
                    if (ADL.A01()) {
                        this.A0G.ACH(ADL);
                    }
                    throw th;
                }
            }
            if (ADL != null && ADL.A01()) {
                this.A08 = ADL;
            }
            this.A07 = nextDataSource;
            this.A0A = hq.A02 == -1;
            long ABP = nextDataSource.ABP(hq);
            C0717Hx c0717Hx = new C0717Hx();
            if (this.A0A) {
                int i = (ABP > (-1L) ? 1 : (ABP == (-1L) ? 0 : -1));
                String[] strArr4 = A0L;
                if (strArr4[0].charAt(29) != strArr4[6].charAt(29)) {
                    String[] strArr5 = A0L;
                    strArr5[0] = "rfibpnYYT7oq3SE3U0OfIBxRp9qsAWQT";
                    strArr5[6] = "JzsYqi5M8NJiAfZVcvXbGjq2yK7Lit7o";
                    if (i != 0) {
                        this.A01 = ABP;
                        C0716Hw.A05(c0717Hx, this.A03 + this.A01);
                    }
                }
            }
            if (A0A()) {
                HM nextDataSource2 = this.A07;
                this.A05 = nextDataSource2.A7C();
                if (true ^ this.A06.equals(this.A05)) {
                    Uri uri = this.A05;
                    String[] strArr6 = A0L;
                    if (strArr6[0].charAt(29) != strArr6[6].charAt(29)) {
                        String[] strArr7 = A0L;
                        strArr7[1] = "ZUbplsDkGQ2eIUx";
                        strArr7[1] = "ZUbplsDkGQ2eIUx";
                        C0716Hw.A06(c0717Hx, uri);
                    } else {
                        String[] strArr8 = A0L;
                        strArr8[0] = "maM98InkYobA9Ucv5ADUn4EtGMwEmyQA";
                        strArr8[6] = "AIUrjRExFhVdShuhpMN8pAFUNrsIDDQG";
                        C0716Hw.A06(c0717Hx, uri);
                    }
                } else {
                    C0716Hw.A04(c0717Hx);
                }
            }
            boolean A0B = A0B();
            String[] strArr9 = A0L;
            if (strArr9[0].charAt(29) == strArr9[6].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr10 = A0L;
            strArr10[7] = "TYUadxfFh4EA22dSKzJNDq7wo1";
            strArr10[3] = "qycP";
            if (A0B) {
                this.A0G.A3Q(this.A09, c0717Hx);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private boolean A08() {
        return this.A07 == this.A0F;
    }

    private boolean A09() {
        return this.A07 == this.A0D;
    }

    private boolean A0A() {
        return !A09();
    }

    private boolean A0B() {
        return this.A07 == this.A0E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0C(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof HN) && ((HN) cause).A00 == 0) {
                return true;
            }
        }
        if (A0L[5].charAt(13) != 'v') {
            throw new RuntimeException();
        }
        String[] strArr = A0L;
        strArr[1] = "Fi50x9pU4R4a4ch";
        strArr[1] = "Fi50x9pU4R4a4ch";
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final Uri A7C() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final long ABP(HQ hq) throws IOException {
        try {
            this.A09 = C0711Hr.A02(hq);
            this.A06 = hq.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = hq.A00;
            this.A03 = hq.A03;
            this.A0B = A00(hq) != -1;
            boolean z = this.A0B;
            if (hq.A02 != -1 || this.A0B) {
                this.A01 = hq.A02;
            } else {
                this.A01 = this.A0G.A5m(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= hq.A03;
                    if (this.A01 <= 0) {
                        throw new HN(0);
                    }
                }
            }
            A07(false);
            return this.A01;
        } catch (IOException e) {
            A06(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A03();
        try {
            A02();
        } catch (IOException e) {
            A06(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            int i3 = (this.A03 > this.A02 ? 1 : (this.A03 == this.A02 ? 0 : -1));
            String[] strArr = A0L;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (i3 >= 0) {
                A07(true);
            }
            int read = this.A07.read(bArr, i, i2);
            if (read != -1) {
                if (A09()) {
                    this.A04 += read;
                }
                this.A03 += read;
                if (this.A01 != -1) {
                    this.A01 -= read;
                }
            } else if (this.A0A) {
                A04();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A02();
                A07(false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (IOException e) {
            if (this.A0A && A0C(e)) {
                A04();
                return -1;
            }
            A06(e);
            throw e;
        }
    }
}
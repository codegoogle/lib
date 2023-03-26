package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.ax5;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1225aq implements HM {
    public static byte[] A07;
    public static String[] A08;
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final InterfaceC0701Hh<? super C1225aq> A06;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, ax5.a, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, ax5.a, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    public static void A02() {
        A08 = new String[]{"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Hh != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C1225aq(Context context, InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0701Hh;
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final Uri A7C() {
        return this.A02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0090, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
        if (r1 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:
        r7.A00 = r8.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a8, code lost:
        r2 = r7.A01.getLength();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
        if (r2 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b2, code lost:
        r7.A00 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
        r4 = r2 - r8.A03;
     */
    @Override // com.facebook.ads.redexgen.X.HM
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long ABP(HQ hq) throws C0700Hg {
        try {
            this.A02 = hq.A04;
            if (TextUtils.equals(A00(70, 11, 107), this.A02.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03.skip(this.A01.getStartOffset());
                    int i = (this.A03.skip(hq.A03) > hq.A03 ? 1 : (this.A03.skip(hq.A03) == hq.A03 ? 0 : -1));
                    String[] strArr = A08;
                    if (strArr[2].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[6] = "iO76s31fXqFvOM0OYTRIEsGTJvkob6S9";
                    strArr2[6] = "iO76s31fXqFvOM0OYTRIEsGTJvkob6S9";
                    if (i >= 0) {
                        long j = hq.A02;
                        long j2 = -1;
                        String[] strArr3 = A08;
                        if (strArr3[7].charAt(29) == strArr3[4].charAt(29)) {
                            String[] strArr4 = A08;
                            strArr4[6] = "iYapuwNl9CT51kyy49oka54a80smISGR";
                            strArr4[6] = "iYapuwNl9CT51kyy49oka54a80smISGR";
                        }
                        this.A04 = true;
                        InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh = this.A06;
                        if (interfaceC0701Hh != null) {
                            interfaceC0701Hh.ABA(this, hq);
                        }
                        long j3 = this.A00;
                        if (A08[5].charAt(8) != '3') {
                            String[] strArr5 = A08;
                            strArr5[2] = "n5p9WsPQY6g4RIkYg3MxwUQx7y8GGMEo";
                            strArr5[3] = "FE0x6EHBGO2WzlvUTu5UgpGPG3v39OZa";
                            return j3;
                        }
                        String[] strArr6 = A08;
                        strArr6[6] = "iRGOweuny9HsI73YGVQjG7u65oKi1WBQ";
                        strArr6[6] = "iRGOweuny9HsI73YGVQjG7u65oKi1WBQ";
                        return j3;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0700Hg(A00(0, 39, 120));
                }
            }
            throw new C0700Hg(A00(39, 31, 62));
        } catch (IOException e) {
            throw new C0700Hg(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final void close() throws C0700Hg {
        this.A02 = null;
        try {
            try {
                if (this.A03 != null) {
                    this.A03.close();
                }
                this.A03 = null;
                try {
                    try {
                        if (this.A01 != null) {
                            this.A01.close();
                        }
                    } finally {
                        this.A01 = null;
                        if (this.A04) {
                            this.A04 = false;
                            InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh = this.A06;
                            if (interfaceC0701Hh != null) {
                                interfaceC0701Hh.AB9(this);
                            }
                        }
                    }
                } catch (IOException e) {
                    throw new C0700Hg(e);
                }
            } catch (IOException e2) {
                throw new C0700Hg(e2);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    if (this.A01 != null) {
                        this.A01.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh2 = this.A06;
                        if (interfaceC0701Hh2 != null) {
                            interfaceC0701Hh2.AB9(this);
                        }
                    }
                    throw th;
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh3 = this.A06;
                        if (interfaceC0701Hh3 != null) {
                            interfaceC0701Hh3.AB9(this);
                        }
                    }
                }
            } catch (IOException e3) {
                throw new C0700Hg(e3);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.HM
    public final int read(byte[] bArr, int i, int i2) throws C0700Hg {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0700Hg(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0700Hg(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        InterfaceC0701Hh<? super C1225aq> interfaceC0701Hh = this.A06;
        if (interfaceC0701Hh != null) {
            interfaceC0701Hh.A95(this, read);
        }
        return read;
    }
}
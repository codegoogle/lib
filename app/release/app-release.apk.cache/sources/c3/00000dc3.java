package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import com.p7700g.p99005.ax5;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.xbill.DNS.Flags;
import org.xbill.DNS.WKSRecord;

@TargetApi(16)
/* renamed from: com.facebook.ads.redexgen.X.27 */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass27 extends C3S implements IH {
    public static byte[] A0E;
    public static String[] A0F;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public MediaFormat A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final BA A0C;
    public final BG A0D;

    static {
        A07();
        A06();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 16);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0E = new byte[]{7, 5, 16, 102, 27, 13, Flags.CD, 102, 41, 41, 43, 102, 44, 45, 43, 65, 67, 86, 32, 105, 97, 97, 105, 98, 107, 32, 124, 111, 121, 32, 106, 107, 109, 97, 106, 107, 124, 54, 57, 51, 37, 56, 62, 51, 121, 36, 56, 49, 35, 32, 54, 37, 50, 121, 59, 50, 54, 57, 53, 54, 52, 60, 64, 84, 69, 72, 78, 14, 83, 64, 86, 24, 19, 26, 21, 21, 30, 23, 86, 24, 20, 14, 21, 15, ax5.a, 50, 37, 56, 59, 35, 50, 76, 65, 86, 75, 85, 72, 80, 65, 95, 83, 74, 31, 91, 92, 66, 71, 70, 31, 65, 91, 72, 87, 70, 66, 70, 78, 48, 50, 41, 47, 50, 41, 52, 57, 121, 107, 103, 122, 102, 111, 39, 120, 107, 126, 111, 70, 84, 88, 70, 64, 91, 82, 5, 26, 13, 16, 25, 19, Flags.CD, 26};
    }

    public static void A07() {
        A0F = new String[]{"aLXIjAOeq43kD47uUx47KIQfBztZ5JR6", "bYDvuG1CO7Q3NDumZhhBhB8jHe", "lzauC9VKCpzgBdv7KHug0xPju0EyyDRc", "zBmjWuq", "FwqFg", "FmVSMSIXQUSd0OcxsELVimAN3SmZwHxI", "I9K2sHUvqtNZm1Rj9xJMtQcmEPzsJytW", "SRtBuggTCbvw2MXSYfok3SEL95E53gc0"};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass27(Context context, InterfaceC0610Do interfaceC0610Do, @Nullable C4<Y7> c4, boolean z, @Nullable Handler handler, @Nullable BB bb, @Nullable C0549Aw c0549Aw, B3... b3Arr) {
        this(context, interfaceC0610Do, c4, z, handler, bb, new C1113Xo(c0549Aw, b3Arr));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    public AnonymousClass27(Context context, InterfaceC0610Do interfaceC0610Do, @Nullable C4<Y7> c4, boolean z, @Nullable Handler handler, @Nullable BB bb, BG bg) {
        super(1, interfaceC0610Do, c4, z);
        this.A0B = context.getApplicationContext();
        this.A0D = bg;
        this.A0C = new BA(handler, bb);
        bg.ACz(new C1115Xq(this));
    }

    private int A00(C0604Di c0604Di, Format format) {
        PackageManager packageManager;
        if (C0726Ig.A02 < 24) {
            if (A04(15, 22, 30).equals(c0604Di.A02)) {
                boolean z = true;
                if (C0726Ig.A02 == 23 && (packageManager = this.A0B.getPackageManager()) != null && packageManager.hasSystemFeature(A04(37, 25, 71))) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
            }
        }
        return format.A09;
    }

    private final int A01(C0604Di c0604Di, Format format, Format[] formatArr) {
        return A00(c0604Di, format);
    }

    @SuppressLint({"InlinedApi"})
    private final MediaFormat A02(Format format, String str, int i) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(A04(113, 4, 59), str);
        mediaFormat.setInteger(A04(71, 13, 107), format.A05);
        mediaFormat.setInteger(A04(125, 11, 26), format.A0C);
        C0616Du.A07(mediaFormat, format.A0P);
        C0616Du.A05(mediaFormat, A04(99, 14, 34), i);
        if (C0726Ig.A02 >= 23) {
            mediaFormat.setInteger(A04(117, 8, 80), 0);
        }
        return mediaFormat;
    }

    private void A05() {
        long A5u = this.A0D.A5u(A7Z());
        if (A5u != Long.MIN_VALUE) {
            if (!this.A08) {
                A5u = Math.max(this.A05, A5u);
            }
            this.A05 = A5u;
            this.A08 = false;
        }
    }

    public static boolean A09(String str) {
        if (C0726Ig.A02 < 24 && A04(0, 15, 88).equals(str)) {
            if (A04(WKSRecord.Service.PROFILE, 7, 37).equals(C0726Ig.A05) && (C0726Ig.A03.startsWith(A04(143, 8, 111)) || C0726Ig.A03.startsWith(A04(84, 7, 71)) || C0726Ig.A03.startsWith(A04(91, 8, 52)))) {
                return true;
            }
        }
        return false;
    }

    private final boolean A0A(String str) {
        int A00 = IJ.A00(str);
        if (A00 != 0) {
            boolean A7Y = this.A0D.A7Y(A00);
            if (A0F[5].charAt(2) != 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[1] = "OP";
            strArr[1] = "OP";
            if (A7Y) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A14() {
        try {
            this.A0D.ACD();
            try {
                super.A14();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.A14();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A15() {
        super.A15();
        this.A0D.ABg();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A16() {
        A05();
        this.A0D.pause();
        super.A16();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A17(long j, boolean z) throws A4 {
        super.A17(j, z);
        this.A0D.reset();
        this.A05 = j;
        this.A07 = true;
        this.A08 = true;
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.AbstractC0573Cd
    public final void A18(boolean z) throws A4 {
        super.A18(z);
        this.A0C.A05(this.A0U);
        int i = A13().A00;
        if (i != 0) {
            this.A0D.A4u(i);
        } else {
            this.A0D.A4l();
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final int A1C(MediaCodec mediaCodec, C0604Di c0604Di, Format format, Format format2) {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x00d9, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00e1, code lost:
        if (r4.A0H(r17.A0C) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x00e5, code lost:
        if (r17.A05 == (-1)) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00ed, code lost:
        if (r4.A0G(r17.A05) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0104, code lost:
        if (r7 != (-1)) goto L52;
     */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<com.facebook.ads.internal.exoplayer2.drm.FrameworkMediaCrypto> */
    /* JADX WARN: Incorrect condition in loop: B:98:0x0079 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00f6  */
    @Override // com.facebook.ads.redexgen.X.C3S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int A1D(InterfaceC0610Do interfaceC0610Do, C4<Y7> c4, Format format) throws C0613Dr {
        String str = format.A0O;
        boolean requiresSecureDecryption = false;
        if (IJ.A0A(str)) {
            int i = C0726Ig.A02 >= 21 ? 32 : 0;
            boolean A0z = AbstractC0573Cd.A0z(c4, format.A0H);
            int i2 = 4;
            if (A0z && A0A(str) && interfaceC0610Do.A6g() != null) {
                int i3 = i | 8;
                if (A0F[7].charAt(17) != 'P') {
                    String[] strArr = A0F;
                    strArr[2] = "2JbhCO8WUJxg1dEMjqsmqHsLUOCbHvmd";
                    strArr[2] = "2JbhCO8WUJxg1dEMjqsmqHsLUOCbHvmd";
                    return i3 | 4;
                }
            } else if ((A04(62, 9, 49).equals(str) && !this.A0D.A7Y(format.A0A)) || !this.A0D.A7Y(2)) {
                return 1;
            } else {
                boolean z = false;
                DrmInitData drmInitData = format.A0H;
                if (drmInitData != null) {
                    for (int i4 = 0; i4 < i; i4++) {
                        z |= drmInitData.A02(i4).A03;
                    }
                }
                C0604Di A60 = interfaceC0610Do.A60(str, z);
                if (A60 == null) {
                    if (!z) {
                        return 1;
                    }
                    C0604Di A602 = interfaceC0610Do.A60(str, false);
                    if (A0F[7].charAt(17) != 'P') {
                        String[] strArr2 = A0F;
                        strArr2[0] = "5t6lwnZxCy2d0LK1iys4a5spMU1PRxL4";
                        strArr2[6] = "MLRfngDPgLR4PHXf8VCaBDfWkQKvwd69";
                        return A602 != null ? 2 : 1;
                    }
                } else if (!A0z) {
                    return 2;
                } else {
                    if (C0726Ig.A02 >= 21) {
                        int i5 = format.A0C;
                        if (A0F[4].length() != 28) {
                            String[] strArr3 = A0F;
                            strArr3[3] = "H3JynuiL4WZej1bO71t4iZ";
                            strArr3[3] = "H3JynuiL4WZej1bO71t4iZ";
                        } else {
                            String[] strArr4 = A0F;
                            strArr4[0] = "MC6ulih8quoQ3V99b3hEbBJ51J8qd52p";
                            strArr4[6] = "Ss9b1ZFAapck4qu7GxyznnEhXuh9ADD0";
                        }
                        if (!requiresSecureDecryption) {
                            i2 = 3;
                        }
                        return i | 8 | i2;
                    }
                    requiresSecureDecryption = true;
                    if (!requiresSecureDecryption) {
                    }
                    return i | 8 | i2;
                }
            }
            throw new RuntimeException();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final C0604Di A1G(InterfaceC0610Do interfaceC0610Do, Format format, boolean z) throws C0613Dr {
        C0604Di A6g;
        if (A0A(format.A0O) && (A6g = interfaceC0610Do.A6g()) != null) {
            return A6g;
        }
        return super.A1G(interfaceC0610Do, format, z);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1J() throws A4 {
        try {
            this.A0D.ABh();
        } catch (BF e) {
            throw A4.A01(e, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1M(MediaCodec mediaCodec, MediaFormat mediaFormat) throws A4 {
        int i;
        int[] iArr;
        int i2;
        MediaFormat mediaFormat2 = this.A06;
        if (mediaFormat2 != null) {
            i = IJ.A00(mediaFormat2.getString(A04(113, 4, 59)));
            mediaFormat = this.A06;
        } else {
            i = this.A04;
        }
        int integer = mediaFormat.getInteger(A04(71, 13, 107));
        int integer2 = mediaFormat.getInteger(A04(125, 11, 26));
        if (this.A09 && integer == 6 && (i2 = this.A00) < 6) {
            iArr = new int[i2];
            for (int i3 = 0; i3 < this.A00; i3++) {
                iArr[i3] = i3;
            }
        } else {
            iArr = null;
        }
        try {
            this.A0D.A46(i, integer, integer2, 0, iArr, this.A02, this.A03);
        } catch (BC e) {
            throw A4.A01(e, A10());
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1N(Format format) throws A4 {
        super.A1N(format);
        this.A0C.A03(format);
        this.A04 = A04(62, 9, 49).equals(format.A0O) ? format.A0A : 2;
        this.A00 = format.A05;
        this.A02 = format.A06;
        this.A03 = format.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1O(C1121Xw c1121Xw) {
        if (this.A07 && !c1121Xw.A03()) {
            if (Math.abs(c1121Xw.A00 - this.A05) > 500000) {
                this.A05 = c1121Xw.A00;
            }
            this.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1P(C0604Di c0604Di, MediaCodec mediaCodec, Format format, MediaCrypto mediaCrypto) {
        this.A01 = A01(c0604Di, format, A1B());
        this.A09 = A09(c0604Di.A02);
        this.A0A = c0604Di.A04;
        MediaFormat A02 = A02(format, c0604Di.A01 == null ? A04(62, 9, 49) : c0604Di.A01, this.A01);
        mediaCodec.configure(A02, (Surface) null, mediaCrypto, 0);
        if (this.A0A) {
            this.A06 = A02;
            this.A06.setString(A04(113, 4, 59), format.A0O);
            return;
        }
        this.A06 = null;
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final void A1Q(String str, long j, long j2) {
        this.A0C.A06(str, j, j2);
    }

    @Override // com.facebook.ads.redexgen.X.C3S
    public final boolean A1R(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws A4 {
        if (this.A0A && (i2 & 2) != 0) {
            mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } else if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.A0U.A08++;
            this.A0D.A7G();
            return true;
        } else {
            try {
                if (this.A0D.A7F(byteBuffer, j3)) {
                    mediaCodec.releaseOutputBuffer(i, false);
                    this.A0U.A06++;
                    return true;
                }
                return false;
            } catch (BD | BF e) {
                throw A4.A01(e, A10());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd, com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final IH A6V() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.IH
    public final AP A6l() {
        return this.A0D.A6l();
    }

    @Override // com.facebook.ads.redexgen.X.IH
    public final long A6o() {
        if (A70() == 2) {
            A05();
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0573Cd, com.facebook.ads.redexgen.X.AZ
    public final void A7H(int i, Object obj) throws A4 {
        if (i != 2) {
            if (i != 3) {
                super.A7H(i, obj);
                return;
            }
            this.A0D.ACs((C0548Av) obj);
            return;
        }
        BG bg = this.A0D;
        if (A0F[7].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        strArr[4] = "awvXiH99cLu1HaadjiPENScqQYAeI";
        bg.setVolume(((Float) obj).floatValue());
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7Z() {
        return super.A7Z() && this.A0D.A7Z();
    }

    @Override // com.facebook.ads.redexgen.X.C3S, com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7i() {
        return this.A0D.A7J() || super.A7i();
    }

    @Override // com.facebook.ads.redexgen.X.IH
    public final AP AD3(AP ap) {
        return this.A0D.AD3(ap);
    }
}
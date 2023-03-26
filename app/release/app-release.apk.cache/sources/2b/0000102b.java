package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.drm.DrmInitData;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Cd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0573Cd implements InterfaceC1104Xf, InterfaceC0530Ac {
    public int A00;
    public int A01;
    public long A02;
    public C0531Ad A03;
    public InterfaceC0647Fd A04;
    public boolean A05 = true;
    public boolean A06;
    public Format[] A07;
    public final int A08;

    public AbstractC0573Cd(int i) {
        this.A08 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.C4 != com.facebook.ads.internal.exoplayer2.drm.DrmSessionManager<?> */
    public static boolean A0z(@Nullable C4<?> c4, @Nullable DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (c4 == null) {
            return false;
        }
        return c4.A3x(drmInitData);
    }

    public final int A10() {
        return this.A00;
    }

    public final int A11(long j) {
        return this.A04.ADF(j - this.A02);
    }

    public final int A12(AH ah, C1121Xw c1121Xw, boolean z) {
        int AC0 = this.A04.AC0(ah, c1121Xw, z);
        if (AC0 == -4) {
            if (c1121Xw.A04()) {
                this.A05 = true;
                return this.A06 ? -4 : -3;
            }
            c1121Xw.A00 += this.A02;
        } else if (AC0 == -5) {
            Format format = ah.A00;
            if (format.A0G != Long.MAX_VALUE) {
                ah.A00 = format.A0I(format.A0G + this.A02);
            }
        }
        return AC0;
    }

    public final C0531Ad A13() {
        return this.A03;
    }

    public void A14() {
    }

    public void A15() throws A4 {
    }

    public void A16() throws A4 {
    }

    public void A17(long j, boolean z) throws A4 {
    }

    public void A18(boolean z) throws A4 {
    }

    public void A19(Format[] formatArr, long j) throws A4 {
    }

    public final boolean A1A() {
        return this.A05 ? this.A06 : this.A04.A7i();
    }

    public final Format[] A1B() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void A4k() {
        I1.A04(this.A01 == 1);
        this.A01 = 0;
        this.A04 = null;
        this.A07 = null;
        this.A06 = false;
        A14();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void A4t(C0531Ad c0531Ad, Format[] formatArr, InterfaceC0647Fd interfaceC0647Fd, long j, boolean z, long j2) throws A4 {
        I1.A04(this.A01 == 0);
        this.A03 = c0531Ad;
        this.A01 = 1;
        A18(z);
        ACS(formatArr, interfaceC0647Fd, j2);
        A17(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final InterfaceC0530Ac A5c() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public IH A6V() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final int A70() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final InterfaceC0647Fd A75() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf, com.facebook.ads.redexgen.X.InterfaceC0530Ac
    public final int A7A() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.AZ
    public void A7H(int i, Object obj) throws A4 {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7K() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final boolean A7W() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void A8X() throws IOException {
        this.A04.A8U();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void ACS(Format[] formatArr, InterfaceC0647Fd interfaceC0647Fd, long j) throws A4 {
        I1.A04(!this.A06);
        this.A04 = interfaceC0647Fd;
        this.A05 = false;
        this.A07 = formatArr;
        this.A02 = j;
        A19(formatArr, j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void ACb(long j) throws A4 {
        this.A06 = false;
        this.A05 = false;
        A17(j, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void ACv() {
        this.A06 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void ACx(int i) {
        this.A00 = i;
    }

    public int ADU() throws A4 {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void start() throws A4 {
        I1.A04(this.A01 == 1);
        this.A01 = 2;
        A15();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1104Xf
    public final void stop() throws A4 {
        I1.A04(this.A01 == 2);
        this.A01 = 1;
        A16();
    }
}
package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Ay  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0551Ay extends AbstractC1156Zg implements FD {
    public long A00;
    public boolean A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final CN A05;
    public final HL A06;
    @Nullable
    public final Object A07;
    public final String A08;

    public C0551Ay(Uri uri, HL hl, CN cn, int i, @Nullable String str, int i2, @Nullable Object obj) {
        this.A04 = uri;
        this.A06 = hl;
        this.A05 = cn;
        this.A03 = i;
        this.A08 = str;
        this.A02 = i2;
        this.A00 = -9223372036854775807L;
        this.A07 = obj;
    }

    private void A00(long j, boolean z) {
        this.A00 = j;
        this.A01 = z;
        A01(new C1171Zy(this.A00, this.A01, false, this.A07), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1156Zg
    public final void A02() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1156Zg
    public final void A03(InterfaceC1102Xd interfaceC1102Xd, boolean z) {
        A00(this.A00, false);
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final InterfaceC1167Zu A4P(FG fg, HE he) {
        I1.A03(fg.A02 == 0);
        return new C0552Az(this.A04, this.A06.A4D(), this.A05.A4H(), this.A03, A00(fg), this, he, this.A08, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void A8W() throws IOException {
    }

    @Override // com.facebook.ads.redexgen.X.FD
    public final void AAw(long j, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.A00;
        }
        if (this.A00 == j && this.A01 == z) {
            return;
        }
        A00(j, z);
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void ACI(InterfaceC1167Zu interfaceC1167Zu) {
        ((C0552Az) interfaceC1167Zu).A0S();
    }
}
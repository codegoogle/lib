package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ov  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0889Ov extends AnonymousClass43<C0852Nk> {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    @Nullable
    public M6 A04;
    public String A05;
    public List<OQ> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AnonymousClass16 A08;
    public final C7H A09;
    public final C1080Wh A0A;
    public final JE A0B;
    public final LX A0C;
    public final C0890Ow A0D;
    public final C0901Ph A0E;

    public C0889Ov(C1080Wh c1080Wh, List<OQ> list, AnonymousClass16 anonymousClass16, JE je, C7H c7h, C0901Ph c0901Ph, LX lx, M6 m6, String str, int i, int i2, int i3, int i4, C0890Ow c0890Ow) {
        this.A0A = c1080Wh;
        this.A0B = je;
        this.A09 = c7h;
        this.A0E = c0901Ph;
        this.A0C = lx;
        this.A04 = m6;
        this.A08 = anonymousClass16;
        this.A06 = list;
        this.A00 = i;
        this.A03 = i4;
        this.A05 = str;
        this.A01 = i3;
        this.A02 = i2;
        this.A0D = c0890Ow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A01 */
    public final C0852Nk A07(ViewGroup viewGroup, int i) {
        return new C0852Nk(O6.A00(new C0859Nr(this.A0A, this.A0B, this.A04, this.A08, null, this.A0E, this.A0C).A0H(), this.A03, this.A05, this.A0D), this.A07, this.A0E, this.A00, this.A01, this.A02, this.A06.size(), this.A0A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A02 */
    public final void A0F(C0852Nk c0852Nk, int i) {
        c0852Nk.A0m(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A06.size();
    }
}
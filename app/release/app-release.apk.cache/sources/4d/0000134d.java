package com.facebook.ads.redexgen.X;

import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.Pq  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0910Pq {
    public C0914Pu A00;
    public Set<String> A01;
    public Set<String> A02;
    public boolean A03;
    public boolean A04 = true;

    public final C0910Pq A00(C0914Pu c0914Pu) {
        this.A00 = c0914Pu;
        return this;
    }

    public final C0910Pq A01(Set<String> pinnedCertificates) {
        this.A01 = pinnedCertificates;
        return this;
    }

    public final C0910Pq A02(Set<String> pinnedPublicKeys) {
        this.A02 = pinnedPublicKeys;
        return this;
    }

    public final C0910Pq A03(boolean z) {
        this.A04 = z;
        return this;
    }

    public final C0910Pq A04(boolean z) {
        this.A03 = z;
        return this;
    }

    public final C0911Pr A05() {
        return new C0911Pr(this.A00, this.A04, this.A02, this.A01, this.A03);
    }
}
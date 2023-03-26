package com.facebook.ads.redexgen.X;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Sa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0972Sa implements InterfaceC03864e {
    public final /* synthetic */ ES A00;

    public C0972Sa(ES es) {
        this.A00 = es;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03864e
    public final void ABn(C4X c4x, C4A c4a, C4A c4a2) {
        this.A00.A1o(c4x, c4a, c4a2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03864e
    public final void ABp(C4X c4x, @NonNull C4A c4a, @Nullable C4A c4a2) {
        this.A00.A0r.A0d(c4x);
        this.A00.A1p(c4x, c4a, c4a2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03864e
    public final void ABr(C4X c4x, @NonNull C4A c4a, @NonNull C4A c4a2) {
        c4x.A0a(false);
        if (this.A00.A0C) {
            if (this.A00.A05.A0L(c4x, c4x, c4a, c4a2)) {
                this.A00.A1O();
            }
        } else if (!this.A00.A05.A0K(c4x, c4a, c4a2)) {
        } else {
            this.A00.A1O();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03864e
    public final void ADd(C4X c4x) {
        this.A00.A06.A1E(c4x.A0H, this.A00.A0r);
    }
}
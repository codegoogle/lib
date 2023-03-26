package com.facebook.ads.redexgen.X;

import java.util.EnumSet;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.6f  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04386f {
    public final int A00;
    public final InterfaceC04416i A01;
    public final EnumSet<EnumC04456m> A02;

    public C04386f(int i, EnumSet<EnumC04456m> enumSet, InterfaceC04416i interfaceC04416i) {
        this.A00 = i;
        this.A02 = enumSet;
        this.A01 = interfaceC04416i;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC04416i A01() {
        if (this.A02.contains(EnumC04456m.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC04416i A02(EnumC04426j enumC04426j) {
        if (A04(enumC04426j)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC04456m> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC04426j enumC04426j) {
        return AnonymousClass76.A0F(enumC04426j) && this.A02.contains(EnumC04456m.A00(enumC04426j.A03()));
    }
}
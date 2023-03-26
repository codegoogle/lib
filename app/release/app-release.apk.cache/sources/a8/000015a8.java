package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.facebook.ads.redexgen.X.Zg  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1156Zg implements FI {
    public InterfaceC1102Xd A00;
    public AbstractC0536Aj A01;
    public Object A02;
    public final ArrayList<FH> A04 = new ArrayList<>(1);
    public final FT A03 = new FT();

    public abstract void A02();

    public abstract void A03(InterfaceC1102Xd interfaceC1102Xd, boolean z);

    public final FT A00(@Nullable FG fg) {
        return this.A03.A03(0, fg, 0L);
    }

    public final void A01(AbstractC0536Aj abstractC0536Aj, @Nullable Object obj) {
        this.A01 = abstractC0536Aj;
        this.A02 = obj;
        Iterator<FH> it = this.A04.iterator();
        while (it.hasNext()) {
            it.next().AAx(this, abstractC0536Aj, obj);
        }
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void A3F(Handler handler, FW fw) {
        this.A03.A08(handler, fw);
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void ABl(InterfaceC1102Xd interfaceC1102Xd, boolean z, FH fh) {
        InterfaceC1102Xd interfaceC1102Xd2 = this.A00;
        I1.A03(interfaceC1102Xd2 == null || interfaceC1102Xd2 == interfaceC1102Xd);
        this.A04.add(fh);
        if (this.A00 == null) {
            this.A00 = interfaceC1102Xd;
            A03(interfaceC1102Xd, z);
            return;
        }
        AbstractC0536Aj abstractC0536Aj = this.A01;
        if (abstractC0536Aj == null) {
            return;
        }
        fh.AAx(this, abstractC0536Aj, this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void ACK(FH fh) {
        this.A04.remove(fh);
        if (this.A04.isEmpty()) {
            this.A00 = null;
            this.A01 = null;
            this.A02 = null;
            A02();
        }
    }

    @Override // com.facebook.ads.redexgen.X.FI
    public final void ACM(FW fw) {
        this.A03.A0E(fw);
    }
}
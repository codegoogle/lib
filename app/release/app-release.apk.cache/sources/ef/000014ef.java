package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Wd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1076Wd extends AbstractRunnableC0770Kc {
    public final /* synthetic */ AnonymousClass79 A00;
    public final /* synthetic */ C7A A01;
    public final /* synthetic */ C7H A02;
    public final /* synthetic */ ArrayList A03;
    public final /* synthetic */ ArrayList A04;

    public C1076Wd(C7H c7h, ArrayList arrayList, AnonymousClass79 anonymousClass79, C7A c7a, ArrayList arrayList2) {
        this.A02 = c7h;
        this.A03 = arrayList;
        this.A00 = anonymousClass79;
        this.A01 = c7a;
        this.A04 = arrayList2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        AtomicBoolean A0B;
        C8H c8h;
        Handler handler;
        C8H c8h2;
        long j;
        long j2;
        A0B = C7H.A0B(this.A03);
        c8h = this.A02.A04;
        if (c8h instanceof C1080Wh) {
            c8h2 = this.A02.A04;
            C1080Wh c1080Wh = (C1080Wh) c8h2;
            if (A0B.get()) {
                C0S A0A = c1080Wh.A0A();
                j2 = this.A02.A00;
                A0A.A3w(LW.A01(j2));
            } else {
                C0S A0A2 = c1080Wh.A0A();
                j = this.A02.A00;
                A0A2.A3v(LW.A01(j));
            }
        }
        handler = this.A02.A02;
        handler.post(new C1075Wc(this, A0B));
        C7H.A0B(this.A04);
    }
}
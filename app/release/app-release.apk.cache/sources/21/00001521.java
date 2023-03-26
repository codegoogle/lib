package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public class XR extends AbstractC0900Pg {
    public final /* synthetic */ C1098Wz A00;

    public XR(C1098Wz c1098Wz) {
        this.A00 = c1098Wz;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r0.A08() == false) goto L11;
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A04() {
        boolean z;
        LX lx;
        WeakReference weakReference;
        WeakReference weakReference2;
        LX lx2;
        z = this.A00.A04;
        if (!z) {
            lx2 = this.A00.A01;
        }
        lx = this.A00.A01;
        lx.A06();
        weakReference = this.A00.A08;
        if (weakReference.get() != null) {
            weakReference2 = this.A00.A08;
            ((NN) weakReference2.get()).A9i();
        }
    }
}
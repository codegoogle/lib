package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Ix  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class RunnableC0741Ix implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ J3 A02;
    public final /* synthetic */ String A03;

    public RunnableC0741Ix(J3 j3, String str, long j, long j2) {
        this.A02 = j3;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        J4 j4;
        if (KU.A02(this)) {
            return;
        }
        try {
            j4 = this.A02.A01;
            j4.ABF(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}
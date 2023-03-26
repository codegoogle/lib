package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* renamed from: com.facebook.ads.redexgen.X.Hy  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0718Hy extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ b1 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0718Hy(b1 b1Var, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = b1Var;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (KU.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                this.A00.open();
                this.A01.A04();
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}
package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.7C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7C implements Callable<Boolean> {
    public final BlockingQueue<Boolean> A00 = new LinkedBlockingQueue();
    public final /* synthetic */ C7H A01;

    public C7C(C7H c7h, C7G c7g) {
        this.A01 = c7h;
        new Handler(Looper.getMainLooper()).post(new C1078Wf(this, c7h, c7g));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: A00 */
    public final Boolean call() throws Exception {
        return this.A00.take();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C7G c7g) {
        C8H c8h;
        C8H c8h2;
        c8h = this.A01.A04;
        PV A05 = PV.A05(c8h);
        Uri parse = Uri.parse(c7g.A08);
        long j = c7g.A00;
        if (j == -1) {
            c8h2 = this.A01.A04;
            j = J8.A0L(c8h2);
        }
        A05.A0F(parse, new C1079Wg(this), j);
    }
}
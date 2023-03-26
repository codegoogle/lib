package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public final class rl2 extends ol2 implements tl2 {
    public rl2(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    @Override // com.p7700g.p99005.tl2
    public final void I1(String str, Bundle bundle, vl2 vl2Var) throws RemoteException {
        Parcel N1 = N1();
        N1.writeString(str);
        ql2.c(N1, bundle);
        ql2.d(N1, vl2Var);
        O1(2, N1);
    }
}
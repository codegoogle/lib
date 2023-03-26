package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public abstract class ul2 extends pl2 implements vl2 {
    public ul2() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    @Override // com.p7700g.p99005.pl2
    public final boolean N1(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            ql2.b(parcel);
            Y0((Bundle) ql2.a(parcel, Bundle.CREATOR));
            return true;
        }
        return false;
    }
}
package com.p7700g.p99005;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes3.dex */
public class ol2 implements IInterface {
    private final IBinder s;
    private final String t = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    public ol2(IBinder iBinder, String str) {
        this.s = iBinder;
    }

    public final Parcel N1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.t);
        return obtain;
    }

    public final void O1(int i, Parcel parcel) throws RemoteException {
        try {
            this.s.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.s;
    }
}
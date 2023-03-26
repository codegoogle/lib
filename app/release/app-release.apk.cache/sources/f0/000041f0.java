package com.p7700g.p99005;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IGetInstallReferrerService.java */
/* loaded from: classes2.dex */
public interface fa2 extends IInterface {

    /* compiled from: IGetInstallReferrerService.java */
    /* loaded from: classes2.dex */
    public static abstract class a extends w22 implements fa2 {

        /* compiled from: IGetInstallReferrerService.java */
        /* renamed from: com.p7700g.p99005.fa2$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0171a extends v22 implements fa2 {
            public C0171a(IBinder iBinder) {
                super(iBinder);
            }

            @Override // com.p7700g.p99005.fa2
            public final Bundle g0(Bundle bundle) throws RemoteException {
                Parcel N1 = N1();
                x22.b(N1, bundle);
                Parcel O1 = O1(N1);
                Bundle bundle2 = (Bundle) x22.a(O1, Bundle.CREATOR);
                O1.recycle();
                return bundle2;
            }
        }

        public static fa2 O1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof fa2) {
                return (fa2) queryLocalInterface;
            }
            return new C0171a(iBinder);
        }

        @Override // com.p7700g.p99005.w22
        public final boolean N1(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 1) {
                Bundle g0 = g0((Bundle) x22.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                x22.c(parcel2, g0);
                return true;
            }
            return false;
        }
    }

    Bundle g0(Bundle bundle) throws RemoteException;
}
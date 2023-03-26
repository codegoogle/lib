package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: IMultiInstanceInvalidationCallback.java */
/* loaded from: classes.dex */
public interface n40 extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback.java */
    /* loaded from: classes.dex */
    public static abstract class a extends Binder implements n40 {
        private static final String s = "androidx.room.IMultiInstanceInvalidationCallback";
        public static final int t = 1;

        /* compiled from: IMultiInstanceInvalidationCallback.java */
        /* renamed from: com.p7700g.p99005.n40$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0217a implements n40 {
            private IBinder s;

            public C0217a(IBinder iBinder) {
                this.s = iBinder;
            }

            public String N1() {
                return a.s;
            }

            @Override // com.p7700g.p99005.n40
            public void Q(String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.s);
                    obtain.writeStringArray(strArr);
                    this.s.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.s;
            }
        }

        public a() {
            attachInterface(this, s);
        }

        public static n40 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof n40)) {
                return (n40) queryLocalInterface;
            }
            return new C0217a(iBinder);
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(s);
                Q(parcel.createStringArray());
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void Q(String[] strArr) throws RemoteException;
}
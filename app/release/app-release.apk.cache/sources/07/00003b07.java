package com.p7700g.p99005;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.ah;

/* compiled from: IUnusedAppRestrictionsBackportService.java */
/* loaded from: classes.dex */
public interface bh extends IInterface {

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* loaded from: classes.dex */
    public static class a implements bh {
        @Override // com.p7700g.p99005.bh
        public void a0(ah ahVar) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* compiled from: IUnusedAppRestrictionsBackportService.java */
    /* loaded from: classes.dex */
    public static abstract class b extends Binder implements bh {
        private static final String s = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";
        public static final int t = 1;

        /* compiled from: IUnusedAppRestrictionsBackportService.java */
        /* loaded from: classes.dex */
        public static class a implements bh {
            public static bh s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.bh
            public void a0(ah ahVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(ahVar != null ? ahVar.asBinder() : null);
                    if (this.t.transact(1, obtain, null, 1) || b.O1() == null) {
                        return;
                    }
                    b.O1().a0(ahVar);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static bh N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof bh)) {
                return (bh) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static bh O1() {
            return a.s;
        }

        public static boolean P1(bh bhVar) {
            if (a.s == null) {
                if (bhVar != null) {
                    a.s = bhVar;
                    return true;
                }
                return false;
            }
            throw new IllegalStateException("setDefaultImpl() called twice");
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface(s);
                a0(ah.b.N1(parcel.readStrongBinder()));
                return true;
            } else if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                parcel2.writeString(s);
                return true;
            }
        }
    }

    void a0(ah ahVar) throws RemoteException;
}
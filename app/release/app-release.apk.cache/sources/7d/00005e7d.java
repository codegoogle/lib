package com.p7700g.p99005;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.p7700g.p99005.om1;
import com.p7700g.p99005.pm1;
import com.p7700g.p99005.qm1;
import com.p7700g.p99005.rm1;
import com.p7700g.p99005.sm1;

/* compiled from: IVpnControlService.java */
/* loaded from: classes2.dex */
public interface tm1 extends IInterface {

    /* compiled from: IVpnControlService.java */
    /* loaded from: classes2.dex */
    public static class a implements tm1 {
        @Override // com.p7700g.p99005.tm1
        public void B0(String str, String str2, Bundle bundle, om1 om1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void B1(sm1 sm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void C0(String str, String str2, co1 co1Var, Bundle bundle, om1 om1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public String G0() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.tm1
        public void H(rm1 rm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void L() throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void M(pm1 pm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void P0(String str, String str2) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public fo1 S() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.tm1
        public void T0(int i, Bundle bundle) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.p7700g.p99005.tm1
        public void b1(om1 om1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void d1(qm1 qm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void e0() throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void e1(String str, om1 om1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public en1 getState() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.tm1
        public void i1(rm1 rm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public boolean k(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
            return false;
        }

        @Override // com.p7700g.p99005.tm1
        public void l1(qm1 qm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void n0(sm1 sm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public lm1 o() throws RemoteException {
            return null;
        }

        @Override // com.p7700g.p99005.tm1
        public void o1() throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public int p0() throws RemoteException {
            return 0;
        }

        @Override // com.p7700g.p99005.tm1
        public void r0(pm1 pm1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public void s0() throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public int s1(String str) throws RemoteException {
            return 0;
        }

        @Override // com.p7700g.p99005.tm1
        public void t1(oe1 oe1Var) throws RemoteException {
        }

        @Override // com.p7700g.p99005.tm1
        public long w0() throws RemoteException {
            return 0L;
        }

        @Override // com.p7700g.p99005.tm1
        public bn1 z() throws RemoteException {
            return null;
        }
    }

    /* compiled from: IVpnControlService.java */
    /* loaded from: classes2.dex */
    public static abstract class b extends Binder implements tm1 {
        public static final int A = 8;
        public static final int B = 9;
        public static final int C = 10;
        public static final int D = 11;
        public static final int E = 12;
        public static final int F = 13;
        public static final int G = 14;
        public static final int H = 15;
        public static final int I = 16;
        public static final int J = 17;
        public static final int K = 18;
        public static final int L = 19;
        public static final int M = 20;
        public static final int N = 21;
        public static final int O = 22;
        public static final int P = 23;
        public static final int Q = 24;
        public static final int R = 25;
        public static final int S = 26;
        public static final int T = 27;
        public static final int U = 28;
        private static final String s = "com.anchorfree.vpnsdk.vpnservice.IVpnControlService";
        public static final int t = 1;
        public static final int u = 2;
        public static final int v = 3;
        public static final int w = 4;
        public static final int x = 5;
        public static final int y = 6;
        public static final int z = 7;

        /* compiled from: IVpnControlService.java */
        /* loaded from: classes2.dex */
        public static class a implements tm1 {
            public static tm1 s;
            private IBinder t;

            public a(IBinder iBinder) {
                this.t = iBinder;
            }

            @Override // com.p7700g.p99005.tm1
            public void B0(String str, String str2, Bundle bundle, om1 om1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(om1Var != null ? om1Var.asBinder() : null);
                    if (!this.t.transact(22, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().B0(str, str2, bundle, om1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void B1(sm1 sm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(sm1Var != null ? sm1Var.asBinder() : null);
                    if (!this.t.transact(10, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().B1(sm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void C0(String str, String str2, co1 co1Var, Bundle bundle, om1 om1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (co1Var != null) {
                        obtain.writeInt(1);
                        co1Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStrongBinder(om1Var != null ? om1Var.asBinder() : null);
                    if (!this.t.transact(4, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().C0(str, str2, co1Var, bundle, om1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public String G0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(23, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().G0();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void H(rm1 rm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(rm1Var != null ? rm1Var.asBinder() : null);
                    if (!this.t.transact(9, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().H(rm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void L() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(3, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().L();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void M(pm1 pm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(pm1Var != null ? pm1Var.asBinder() : null);
                    if (!this.t.transact(12, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().M(pm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String N1() {
                return b.s;
            }

            @Override // com.p7700g.p99005.tm1
            public void P0(String str, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    if (!this.t.transact(26, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().P0(str, str2);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public fo1 S() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(24, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().S();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? fo1.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void T0(int i, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeInt(i);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(25, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().T0(i, bundle);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.t;
            }

            @Override // com.p7700g.p99005.tm1
            public void b1(om1 om1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(om1Var != null ? om1Var.asBinder() : null);
                    if (!this.t.transact(18, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().b1(om1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void d1(qm1 qm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(qm1Var != null ? qm1Var.asBinder() : null);
                    if (!this.t.transact(7, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().d1(qm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void e0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(27, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().e0();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void e1(String str, om1 om1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    obtain.writeStrongBinder(om1Var != null ? om1Var.asBinder() : null);
                    if (!this.t.transact(5, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().e1(str, om1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public en1 getState() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(14, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().getState();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? en1.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void i1(rm1 rm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(rm1Var != null ? rm1Var.asBinder() : null);
                    if (!this.t.transact(13, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().i1(rm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public boolean k(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (parcelFileDescriptor != null) {
                        obtain.writeInt(1);
                        parcelFileDescriptor.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(28, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().k(parcelFileDescriptor);
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void l1(qm1 qm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(qm1Var != null ? qm1Var.asBinder() : null);
                    if (!this.t.transact(11, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().l1(qm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void n0(sm1 sm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(sm1Var != null ? sm1Var.asBinder() : null);
                    if (!this.t.transact(6, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().n0(sm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public lm1 o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(17, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().o();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? lm1.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void o1() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(21, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().o1();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public int p0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(20, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().p0();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void r0(pm1 pm1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeStrongBinder(pm1Var != null ? pm1Var.asBinder() : null);
                    if (!this.t.transact(8, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().r0(pm1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void s0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(2, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().s0();
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public int s1(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    obtain.writeString(str);
                    if (!this.t.transact(19, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().s1(str);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public void t1(oe1 oe1Var) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (oe1Var != null) {
                        obtain.writeInt(1);
                        oe1Var.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.t.transact(1, obtain, obtain2, 0) && b.O1() != null) {
                        b.O1().t1(oe1Var);
                    } else {
                        obtain2.readException();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public long w0() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(15, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().w0();
                    }
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.p7700g.p99005.tm1
            public bn1 z() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(b.s);
                    if (!this.t.transact(16, obtain, obtain2, 0) && b.O1() != null) {
                        return b.O1().z();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? bn1.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public b() {
            attachInterface(this, s);
        }

        public static tm1 N1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(s);
            if (queryLocalInterface != null && (queryLocalInterface instanceof tm1)) {
                return (tm1) queryLocalInterface;
            }
            return new a(iBinder);
        }

        public static tm1 O1() {
            return a.s;
        }

        public static boolean P1(tm1 tm1Var) {
            if (a.s == null) {
                if (tm1Var != null) {
                    a.s = tm1Var;
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
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface(s);
                        t1(parcel.readInt() != 0 ? oe1.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface(s);
                        s0();
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface(s);
                        L();
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface(s);
                        C0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? co1.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, om1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface(s);
                        e1(parcel.readString(), om1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(s);
                        n0(sm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface(s);
                        d1(qm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface(s);
                        r0(pm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface(s);
                        H(rm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface(s);
                        B1(sm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 11:
                        parcel.enforceInterface(s);
                        l1(qm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 12:
                        parcel.enforceInterface(s);
                        M(pm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 13:
                        parcel.enforceInterface(s);
                        i1(rm1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 14:
                        parcel.enforceInterface(s);
                        en1 state = getState();
                        parcel2.writeNoException();
                        if (state != null) {
                            parcel2.writeInt(1);
                            state.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 15:
                        parcel.enforceInterface(s);
                        long w0 = w0();
                        parcel2.writeNoException();
                        parcel2.writeLong(w0);
                        return true;
                    case 16:
                        parcel.enforceInterface(s);
                        bn1 z2 = z();
                        parcel2.writeNoException();
                        if (z2 != null) {
                            parcel2.writeInt(1);
                            z2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 17:
                        parcel.enforceInterface(s);
                        lm1 o = o();
                        parcel2.writeNoException();
                        if (o != null) {
                            parcel2.writeInt(1);
                            o.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 18:
                        parcel.enforceInterface(s);
                        b1(om1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 19:
                        parcel.enforceInterface(s);
                        int s1 = s1(parcel.readString());
                        parcel2.writeNoException();
                        parcel2.writeInt(s1);
                        return true;
                    case 20:
                        parcel.enforceInterface(s);
                        int p0 = p0();
                        parcel2.writeNoException();
                        parcel2.writeInt(p0);
                        return true;
                    case 21:
                        parcel.enforceInterface(s);
                        o1();
                        parcel2.writeNoException();
                        return true;
                    case 22:
                        parcel.enforceInterface(s);
                        B0(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null, om1.b.N1(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 23:
                        parcel.enforceInterface(s);
                        String G0 = G0();
                        parcel2.writeNoException();
                        parcel2.writeString(G0);
                        return true;
                    case 24:
                        parcel.enforceInterface(s);
                        fo1 S2 = S();
                        parcel2.writeNoException();
                        if (S2 != null) {
                            parcel2.writeInt(1);
                            S2.writeToParcel(parcel2, 1);
                        } else {
                            parcel2.writeInt(0);
                        }
                        return true;
                    case 25:
                        parcel.enforceInterface(s);
                        T0(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        return true;
                    case 26:
                        parcel.enforceInterface(s);
                        P0(parcel.readString(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 27:
                        parcel.enforceInterface(s);
                        e0();
                        parcel2.writeNoException();
                        return true;
                    case 28:
                        parcel.enforceInterface(s);
                        boolean k = k(parcel.readInt() != 0 ? (ParcelFileDescriptor) ParcelFileDescriptor.CREATOR.createFromParcel(parcel) : null);
                        parcel2.writeNoException();
                        parcel2.writeInt(k ? 1 : 0);
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            }
            parcel2.writeString(s);
            return true;
        }
    }

    void B0(String str, String str2, Bundle bundle, om1 om1Var) throws RemoteException;

    void B1(sm1 sm1Var) throws RemoteException;

    void C0(String str, String str2, co1 co1Var, Bundle bundle, om1 om1Var) throws RemoteException;

    String G0() throws RemoteException;

    void H(rm1 rm1Var) throws RemoteException;

    void L() throws RemoteException;

    void M(pm1 pm1Var) throws RemoteException;

    void P0(String str, String str2) throws RemoteException;

    fo1 S() throws RemoteException;

    void T0(int i, Bundle bundle) throws RemoteException;

    void b1(om1 om1Var) throws RemoteException;

    void d1(qm1 qm1Var) throws RemoteException;

    void e0() throws RemoteException;

    void e1(String str, om1 om1Var) throws RemoteException;

    en1 getState() throws RemoteException;

    void i1(rm1 rm1Var) throws RemoteException;

    boolean k(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException;

    void l1(qm1 qm1Var) throws RemoteException;

    void n0(sm1 sm1Var) throws RemoteException;

    lm1 o() throws RemoteException;

    void o1() throws RemoteException;

    int p0() throws RemoteException;

    void r0(pm1 pm1Var) throws RemoteException;

    void s0() throws RemoteException;

    int s1(String str) throws RemoteException;

    void t1(oe1 oe1Var) throws RemoteException;

    long w0() throws RemoteException;

    bn1 z() throws RemoteException;
}
package com.google.android.gms.cloudmessaging;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public interface IMessengerCompat extends IInterface {
    public static final String DESCRIPTOR = "com.google.android.gms.iid.IMessengerCompat";
    public static final int TRANSACTION_SEND = 1;

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes2.dex */
    public static class Impl extends Binder implements IMessengerCompat {
        @Override // android.os.IInterface
        @x1
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, @x1 Parcel parcel, @z1 Parcel parcel2, int i2) throws RemoteException {
            parcel.enforceInterface(getInterfaceDescriptor());
            if (i == 1) {
                send(parcel.readInt() != 0 ? (Message) Message.CREATOR.createFromParcel(parcel) : null);
                return true;
            }
            return false;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@x1 Message message) throws RemoteException {
            message.arg2 = Binder.getCallingUid();
            throw null;
        }
    }

    /* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
    /* loaded from: classes2.dex */
    public static class Proxy implements IMessengerCompat {
        private final IBinder zza;

        public Proxy(@x1 IBinder iBinder) {
            this.zza = iBinder;
        }

        @Override // android.os.IInterface
        @x1
        public IBinder asBinder() {
            return this.zza;
        }

        @Override // com.google.android.gms.cloudmessaging.IMessengerCompat
        public void send(@x1 Message message) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(IMessengerCompat.DESCRIPTOR);
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                this.zza.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }
    }

    void send(@x1 Message message) throws RemoteException;
}
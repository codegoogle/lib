package com.anythink.core.common.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes2.dex */
public final class c {

    /* loaded from: classes2.dex */
    public final class a {
        private final String b;
        private final boolean c;

        public a(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        private boolean b() {
            return this.c;
        }

        public final String a() {
            return this.b;
        }
    }

    /* renamed from: com.anythink.core.common.b.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0042c implements IInterface {
        private IBinder b;

        public C0042c(IBinder iBinder) {
            this.b = iBinder;
        }

        public final String a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this.b;
        }

        public final boolean b() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public final a a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                b bVar = new b(this, (byte) 0);
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
                if (queryIntentServices != null && queryIntentServices.size() > 0 && context.bindService(intent, bVar, 1)) {
                    try {
                        C0042c c0042c = new C0042c(bVar.a());
                        return new a(c0042c.a(), c0042c.b());
                    } finally {
                    }
                } else {
                    throw new IOException("Google Play connection failed");
                }
            } catch (Exception e) {
                throw e;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }

    /* loaded from: classes2.dex */
    public final class b implements ServiceConnection {
        public boolean a;
        private final LinkedBlockingQueue<IBinder> c;

        private b() {
            this.a = false;
            this.c = new LinkedBlockingQueue<>(1);
        }

        public final IBinder a() {
            if (!this.a) {
                this.a = true;
                return this.c.take();
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.c.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }

        public /* synthetic */ b(c cVar, byte b) {
            this();
        }
    }
}
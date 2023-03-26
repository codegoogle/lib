package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k73 {
    @NotNull
    public static final k73 a = new k73();

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final String a;
        private final boolean b;

        public a(@NotNull String str, boolean z) {
            c25.p(str, "id");
            this.a = str;
            this.b = z;
        }

        @NotNull
        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }
    }

    @r2(otherwise = 4)
    /* loaded from: classes3.dex */
    public static final class b implements ServiceConnection {
        @NotNull
        public static final a s = new a(null);
        @NotNull
        private static final String t = "AdvConn";
        private boolean u;
        @NotNull
        private final LinkedBlockingQueue<IBinder> v = new LinkedBlockingQueue<>(1);

        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @NotNull
        public final IBinder a() throws InterruptedException {
            if (!this.u) {
                this.u = true;
                IBinder take = this.v.take();
                c25.o(take, "this.queue.take()");
                return take;
            }
            throw new IllegalStateException();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@NotNull ComponentName componentName, @NotNull IBinder iBinder) {
            c25.p(componentName, "name");
            c25.p(iBinder, kg.B0);
            try {
                this.v.put(iBinder);
            } catch (InterruptedException e) {
                xz2.c(t, c25.C("[ERROR] Interrupted exception when fetching from intent", e.getMessage()));
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@NotNull ComponentName componentName) {
            c25.p(componentName, "name");
        }
    }

    @r2(otherwise = 4)
    /* loaded from: classes3.dex */
    public static final class c implements IInterface {
        @NotNull
        private final IBinder s;

        @r2(otherwise = 4)
        public c(@NotNull IBinder iBinder) {
            c25.p(iBinder, "binder");
            this.s = iBinder;
        }

        @NotNull
        public final String N1() throws RemoteException {
            Parcel obtain = Parcel.obtain();
            c25.o(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            c25.o(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.s.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                if (readString == null) {
                    readString = "";
                }
                return readString;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @r2(otherwise = 4)
        public final boolean O1(boolean z) throws RemoteException {
            Parcel obtain = Parcel.obtain();
            c25.o(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            c25.o(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(z ? 1 : 0);
                this.s.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this.s;
        }
    }

    private k73() {
    }

    @NotNull
    public final a a(@NotNull Context context) throws IOException, PackageManager.NameNotFoundException, InterruptedException, RemoteException {
        c25.p(context, "context");
        if (!c25.g(Looper.myLooper(), Looper.getMainLooper())) {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            if (context.bindService(intent, bVar, 1)) {
                try {
                    c cVar = new c(bVar.a());
                    return new a(cVar.N1(), cVar.O1(true));
                } finally {
                    context.unbindService(bVar);
                }
            }
            throw new IOException("Google Play connection failed");
        }
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}
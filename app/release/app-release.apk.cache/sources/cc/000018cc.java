package com.google.android.gms.cloudmessaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.anythink.basead.b.a;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.z1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zzf implements ServiceConnection {
    @GuardedBy("this")
    public int zza;
    public final Messenger zzb;
    public zzo zzc;
    @GuardedBy("this")
    public final Queue<zzq<?>> zzd;
    @GuardedBy("this")
    public final SparseArray<zzq<?>> zze;
    public final /* synthetic */ zze zzf;

    private zzf(zze zzeVar) {
        this.zzf = zzeVar;
        this.zza = 0;
        this.zzb = new Messenger(new com.google.android.gms.internal.cloudmessaging.zze(Looper.getMainLooper(), new Handler.Callback(this) { // from class: com.google.android.gms.cloudmessaging.zzi
            private final zzf zza;

            {
                this.zza = this;
            }

            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.zza.zza(message);
            }
        }));
        this.zzd = new ArrayDeque();
        this.zze = new SparseArray<>();
    }

    @Override // android.content.ServiceConnection
    @u1
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this, iBinder) { // from class: com.google.android.gms.cloudmessaging.zzk
            private final zzf zza;
            private final IBinder zzb;

            {
                this.zza = this;
                this.zzb = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzf zzfVar = this.zza;
                IBinder iBinder2 = this.zzb;
                synchronized (zzfVar) {
                    try {
                        if (iBinder2 == null) {
                            zzfVar.zza(0, "Null service connection");
                            return;
                        }
                        try {
                            zzfVar.zzc = new zzo(iBinder2);
                            zzfVar.zza = 2;
                            zzfVar.zza();
                        } catch (RemoteException e) {
                            zzfVar.zza(0, e.getMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    @u1
    public final void onServiceDisconnected(ComponentName componentName) {
        ScheduledExecutorService scheduledExecutorService;
        Log.isLoggable("MessengerIpcClient", 2);
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzm
            private final zzf zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(2, "Service disconnected");
            }
        });
    }

    public final synchronized boolean zza(zzq<?> zzqVar) {
        Context context;
        ScheduledExecutorService scheduledExecutorService;
        int i = this.zza;
        if (i == 0) {
            this.zzd.add(zzqVar);
            Preconditions.checkState(this.zza == 0);
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            if (connectionTracker.bindService(context, intent, this, 1)) {
                scheduledExecutorService = this.zzf.zzc;
                scheduledExecutorService.schedule(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzh
                    private final zzf zza;

                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzc();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                zza(0, "Unable to bind to service");
            }
            return true;
        } else if (i == 1) {
            this.zzd.add(zzqVar);
            return true;
        } else if (i == 2) {
            this.zzd.add(zzqVar);
            zza();
            return true;
        } else {
            if (i != 3 && i != 4) {
                int i2 = this.zza;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            return false;
        }
    }

    public final synchronized void zzb() {
        Context context;
        if (this.zza == 2 && this.zzd.isEmpty() && this.zze.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.zza = 3;
            ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
            context = this.zzf.zzb;
            connectionTracker.unbindService(context, this);
        }
    }

    public final synchronized void zzc() {
        if (this.zza == 1) {
            zza(1, "Timed out while binding");
        }
    }

    public final boolean zza(Message message) {
        int i = message.arg1;
        Log.isLoggable("MessengerIpcClient", 3);
        synchronized (this) {
            zzq<?> zzqVar = this.zze.get(i);
            if (zzqVar == null) {
                return true;
            }
            this.zze.remove(i);
            zzb();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                zzqVar.zza(new zzp(4, "Not supported by GmsCore"));
            } else {
                zzqVar.zza(data);
            }
            return true;
        }
    }

    public final void zza() {
        ScheduledExecutorService scheduledExecutorService;
        scheduledExecutorService = this.zzf.zzc;
        scheduledExecutorService.execute(new Runnable(this) { // from class: com.google.android.gms.cloudmessaging.zzj
            private final zzf zza;

            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final zzq<?> poll;
                ScheduledExecutorService scheduledExecutorService2;
                Context context;
                final zzf zzfVar = this.zza;
                while (true) {
                    synchronized (zzfVar) {
                        if (zzfVar.zza != 2) {
                            return;
                        }
                        if (zzfVar.zzd.isEmpty()) {
                            zzfVar.zzb();
                            return;
                        }
                        poll = zzfVar.zzd.poll();
                        zzfVar.zze.put(poll.zza, poll);
                        scheduledExecutorService2 = zzfVar.zzf.zzc;
                        scheduledExecutorService2.schedule(new Runnable(zzfVar, poll) { // from class: com.google.android.gms.cloudmessaging.zzl
                            private final zzf zza;
                            private final zzq zzb;

                            {
                                this.zza = zzfVar;
                                this.zzb = poll;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zza(this.zzb.zza);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String.valueOf(poll).length();
                    }
                    context = zzfVar.zzf.zzb;
                    Messenger messenger = zzfVar.zzb;
                    Message obtain = Message.obtain();
                    obtain.what = poll.zzc;
                    obtain.arg1 = poll.zza;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.zza());
                    bundle.putString(a.C0020a.A, context.getPackageName());
                    bundle.putBundle("data", poll.zzd);
                    obtain.setData(bundle);
                    try {
                        zzfVar.zzc.zza(obtain);
                    } catch (RemoteException e) {
                        zzfVar.zza(2, e.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void zza(int i, @z1 String str) {
        Context context;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            } else {
                new String("Disconnected: ");
            }
        }
        int i2 = this.zza;
        if (i2 == 0) {
            throw new IllegalStateException();
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                this.zza = 4;
                return;
            } else if (i2 == 4) {
                return;
            } else {
                int i3 = this.zza;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Unknown state: ");
                sb.append(i3);
                throw new IllegalStateException(sb.toString());
            }
        }
        Log.isLoggable("MessengerIpcClient", 2);
        this.zza = 4;
        ConnectionTracker connectionTracker = ConnectionTracker.getInstance();
        context = this.zzf.zzb;
        connectionTracker.unbindService(context, this);
        zzp zzpVar = new zzp(i, str);
        for (zzq<?> zzqVar : this.zzd) {
            zzqVar.zza(zzpVar);
        }
        this.zzd.clear();
        for (int i4 = 0; i4 < this.zze.size(); i4++) {
            this.zze.valueAt(i4).zza(zzpVar);
        }
        this.zze.clear();
    }

    public final synchronized void zza(int i) {
        zzq<?> zzqVar = this.zze.get(i);
        if (zzqVar != null) {
            this.zze.remove(i);
            zzqVar.zza(new zzp(3, "Timed out waiting for response"));
            zzb();
        }
    }
}
package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public abstract class GmsClientSupervisor {
    @VisibleForTesting
    @z1
    public static HandlerThread zza = null;
    private static int zzb = 4225;
    private static final Object zzc = new Object();
    @z1
    private static zzr zzd = null;
    private static boolean zze = false;

    @KeepForSdk
    public static int getDefaultBindFlags() {
        return zzb;
    }

    @x1
    @KeepForSdk
    public static GmsClientSupervisor getInstance(@x1 Context context) {
        Looper mainLooper;
        synchronized (zzc) {
            if (zzd == null) {
                Context applicationContext = context.getApplicationContext();
                if (zze) {
                    mainLooper = getOrStartHandlerThread().getLooper();
                } else {
                    mainLooper = context.getMainLooper();
                }
                zzd = new zzr(applicationContext, mainLooper);
            }
        }
        return zzd;
    }

    @x1
    @KeepForSdk
    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzc) {
            HandlerThread handlerThread = zza;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            zza = handlerThread2;
            handlerThread2.start();
            return zza;
        }
    }

    @KeepForSdk
    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzc) {
            zzr zzrVar = zzd;
            if (zzrVar != null && !zze) {
                zzrVar.zzi(getOrStartHandlerThread().getLooper());
            }
            zze = true;
        }
    }

    @KeepForSdk
    public boolean bindService(@x1 ComponentName componentName, @x1 ServiceConnection serviceConnection, @x1 String str) {
        return zzc(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str, null);
    }

    @KeepForSdk
    public void unbindService(@x1 ComponentName componentName, @x1 ServiceConnection serviceConnection, @x1 String str) {
        zza(new zzn(componentName, getDefaultBindFlags()), serviceConnection, str);
    }

    public abstract void zza(zzn zznVar, ServiceConnection serviceConnection, String str);

    public final void zzb(@x1 String str, @x1 String str2, int i, @x1 ServiceConnection serviceConnection, @x1 String str3, boolean z) {
        zza(new zzn(str, str2, i, z), serviceConnection, str3);
    }

    public abstract boolean zzc(zzn zznVar, ServiceConnection serviceConnection, String str, @z1 Executor executor);

    @KeepForSdk
    public boolean bindService(@x1 String str, @x1 ServiceConnection serviceConnection, @x1 String str2) {
        return zzc(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2, null);
    }

    @KeepForSdk
    public void unbindService(@x1 String str, @x1 ServiceConnection serviceConnection, @x1 String str2) {
        zza(new zzn(str, getDefaultBindFlags(), false), serviceConnection, str2);
    }
}
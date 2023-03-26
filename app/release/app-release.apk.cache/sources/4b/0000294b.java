package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.k1;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcw {
    @k1("LiteSdkInfoRetriever.class")
    private static zzfcw zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcj zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    public zzfcw(Context context, com.google.android.gms.ads.internal.client.zzcj zzcjVar) {
        this.zzb = context;
        this.zzc = zzcjVar;
    }

    @VisibleForTesting
    public static com.google.android.gms.ads.internal.client.zzcj zza(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzci.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            zzcfi.zzh("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    public static zzfcw zzd(Context context) {
        synchronized (zzfcw.class) {
            zzfcw zzfcwVar = zza;
            if (zzfcwVar != null) {
                return zzfcwVar;
            }
            Context applicationContext = context.getApplicationContext();
            long longValue = ((Long) zzbjr.zzb.zze()).longValue();
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = null;
            if (longValue > 0 && longValue <= 221908400) {
                zzcjVar = zza(applicationContext);
            }
            zzfcw zzfcwVar2 = new zzfcw(applicationContext, zzcjVar);
            zza = zzfcwVar2;
            return zzfcwVar2;
        }
    }

    public final zzbua zzb() {
        return (zzbua) this.zzd.get();
    }

    public final zzcfo zzc(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.zzt.zzp();
        boolean zzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zzb);
        zzcfo zzcfoVar = new zzcfo(221908000, i2, true, zzA);
        if (((Boolean) zzbjr.zzc.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
            com.google.android.gms.ads.internal.client.zzeh zzehVar = null;
            if (zzcjVar != null) {
                try {
                    zzehVar = zzcjVar.getLiteSdkVersion();
                } catch (RemoteException unused) {
                }
            }
            return zzehVar == null ? zzcfoVar : new zzcfo(221908000, zzehVar.zza(), true, zzA);
        }
        return zzcfoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(zzbua zzbuaVar) {
        zzbua adapterCreator;
        if (((Boolean) zzbjr.zza.zze()).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzcj zzcjVar = this.zzc;
            if (zzcjVar != null) {
                try {
                    adapterCreator = zzcjVar.getAdapterCreator();
                } catch (RemoteException unused) {
                }
                AtomicReference atomicReference = this.zzd;
                if (adapterCreator != null) {
                    zzbuaVar = adapterCreator;
                }
                zzfcv.zza(atomicReference, null, zzbuaVar);
                return;
            }
            adapterCreator = null;
            AtomicReference atomicReference2 = this.zzd;
            if (adapterCreator != null) {
            }
            zzfcv.zza(atomicReference2, null, zzbuaVar);
            return;
        }
        zzfcv.zza(this.zzd, null, zzbuaVar);
    }
}
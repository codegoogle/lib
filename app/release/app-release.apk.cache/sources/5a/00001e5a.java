package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdg implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    public final /* synthetic */ zzbcy zza;
    public final /* synthetic */ zzcga zzb;
    public final /* synthetic */ zzbdi zzc;

    public zzbdg(zzbdi zzbdiVar, zzbcy zzbcyVar, zzcga zzcgaVar) {
        this.zzc = zzbdiVar;
        this.zza = zzbcyVar;
        this.zzb = zzcgaVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@z1 Bundle bundle) {
        Object obj;
        boolean z;
        final zzbcx zzbcxVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzbdi zzbdiVar = this.zzc;
            z = zzbdiVar.zzb;
            if (z) {
                return;
            }
            zzbdiVar.zzb = true;
            zzbcxVar = this.zzc.zza;
            if (zzbcxVar == null) {
                return;
            }
            zzfvm zzfvmVar = zzcfv.zza;
            final zzbcy zzbcyVar = this.zza;
            final zzcga zzcgaVar = this.zzb;
            final zzfvl zza = zzfvmVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbdd
                @Override // java.lang.Runnable
                public final void run() {
                    zzbcv zzf;
                    zzbdg zzbdgVar = zzbdg.this;
                    zzbcx zzbcxVar2 = zzbcxVar;
                    zzbcy zzbcyVar2 = zzbcyVar;
                    zzcga zzcgaVar2 = zzcgaVar;
                    try {
                        zzbda zzq = zzbcxVar2.zzq();
                        if (zzbcxVar2.zzp()) {
                            zzf = zzq.zzg(zzbcyVar2);
                        } else {
                            zzf = zzq.zzf(zzbcyVar2);
                        }
                        if (!zzf.zze()) {
                            zzcgaVar2.zze(new RuntimeException("No entry contents."));
                            zzbdi.zze(zzbdgVar.zzc);
                            return;
                        }
                        zzbdf zzbdfVar = new zzbdf(zzbdgVar, zzf.zzc(), 1);
                        int read = zzbdfVar.read();
                        if (read != -1) {
                            zzbdfVar.unread(read);
                            zzcgaVar2.zzd(zzbdk.zzb(zzbdfVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                            return;
                        }
                        throw new IOException("Unable to read from cache.");
                    } catch (RemoteException | IOException e) {
                        zzcfi.zzh("Unable to obtain a cache service instance.", e);
                        zzcgaVar2.zze(e);
                        zzbdi.zze(zzbdgVar.zzc);
                    }
                }
            });
            final zzcga zzcgaVar2 = this.zzb;
            zzcgaVar2.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbde
                @Override // java.lang.Runnable
                public final void run() {
                    zzcga zzcgaVar3 = zzcga.this;
                    Future future = zza;
                    if (zzcgaVar3.isCancelled()) {
                        future.cancel(true);
                    }
                }
            }, zzcfv.zzf);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
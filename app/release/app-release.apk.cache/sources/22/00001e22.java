package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbe implements Runnable {
    public final /* synthetic */ zzbbf zza;

    public zzbbe(zzbbf zzbbfVar) {
        this.zza = zzbbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        boolean z2;
        List<zzbbg> list;
        obj = this.zza.zzc;
        synchronized (obj) {
            zzbbf zzbbfVar = this.zza;
            z = zzbbfVar.zzd;
            if (z) {
                z2 = zzbbfVar.zze;
                if (z2) {
                    zzbbfVar.zzd = false;
                    zzcfi.zze("App went background");
                    list = this.zza.zzf;
                    for (zzbbg zzbbgVar : list) {
                        try {
                            zzbbgVar.zza(false);
                        } catch (Exception e) {
                            zzcfi.zzh("", e);
                        }
                    }
                }
            }
            zzcfi.zze("App is still foreground");
        }
    }
}
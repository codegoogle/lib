package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbsr {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    @GuardedBy("lockClient")
    private zzbta zzc;
    @GuardedBy("lockService")
    private zzbta zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbta zza(Context context, zzcfo zzcfoVar, @z1 zzfhu zzfhuVar) {
        zzbta zzbtaVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbta(zzc(context), zzcfoVar, (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zza), zzfhuVar);
            }
            zzbtaVar = this.zzc;
        }
        return zzbtaVar;
    }

    public final zzbta zzb(Context context, zzcfo zzcfoVar, zzfhu zzfhuVar) {
        zzbta zzbtaVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbta(zzc(context), zzcfoVar, (String) zzbjy.zzb.zze(), zzfhuVar);
            }
            zzbtaVar = this.zzd;
        }
        return zzbtaVar;
    }
}
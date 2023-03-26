package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzhd {
    public final Context zza;
    public final zzcx zzb;
    public final zzfpj zzc;
    public final zzfpj zzd;
    public zzfpj zze;
    public zzfpj zzf;
    public final zzfpj zzg;
    public final zzfok zzh;
    public final Looper zzi;
    public final zzi zzj;
    public final zzjw zzk;
    public boolean zzl;
    public final zzgo zzm;

    public zzhd(final Context context, zzckr zzckrVar, byte[] bArr) {
        zzgx zzgxVar = new zzgx(zzckrVar, null);
        zzgy zzgyVar = new zzgy(context);
        zzfpj zzfpjVar = new zzfpj() { // from class: com.google.android.gms.internal.ads.zzgz
            @Override // com.google.android.gms.internal.ads.zzfpj
            public final Object zza() {
                return new zzve(context);
            }
        };
        zzha zzhaVar = zzha.zza;
        zzhb zzhbVar = new zzhb(context);
        zzhc zzhcVar = zzhc.zza;
        this.zza = context;
        this.zzc = zzgxVar;
        this.zzd = zzgyVar;
        this.zze = zzfpjVar;
        this.zzf = zzhaVar;
        this.zzg = zzhbVar;
        this.zzh = zzhcVar;
        this.zzi = zzeg.zzD();
        this.zzj = zzi.zza;
        this.zzk = zzjw.zze;
        this.zzm = new zzgo(0.97f, 1.03f, 1000L, 1.0E-7f, zzeg.zzv(20L), zzeg.zzv(500L), 0.999f, null);
        this.zzb = zzcx.zza;
    }

    public static /* synthetic */ zzrz zza(Context context) {
        return new zzrn(context, new zzyn());
    }
}
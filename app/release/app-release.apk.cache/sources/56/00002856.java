package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzetv implements zzetg {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final zzcei zze;

    public zzetv(zzcei zzceiVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.zze = zzceiVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaO)).booleanValue()) {
            return zzfvc.zzf((zzfut) zzfvc.zzo(zzfvc.zzm(zzfut.zzv(this.zze.zza(this.zza, this.zzd)), zzett.zza, this.zzc), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzfok() { // from class: com.google.android.gms.internal.ads.zzetu
                @Override // com.google.android.gms.internal.ads.zzfok
                public final Object apply(Object obj) {
                    return zzetv.this.zzc((Throwable) obj);
                }
            }, this.zzc);
        }
        return zzfvc.zzh(new Exception("Did not ad Ad ID into query param."));
    }

    public final /* synthetic */ zzetw zzc(Throwable th) {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        ContentResolver contentResolver = this.zza.getContentResolver();
        return new zzetw(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
    }
}
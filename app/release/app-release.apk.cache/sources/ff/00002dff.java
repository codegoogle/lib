package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzke {
    private final Context zza;
    private final Handler zzb;
    private final zzka zzc;
    private final AudioManager zzd;
    @z1
    private zzkd zze;
    private int zzf;
    private int zzg;
    private boolean zzh;

    public zzke(Context context, Handler handler, zzka zzkaVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = handler;
        this.zzc = zzkaVar;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService("audio");
        zzcw.zzb(audioManager);
        this.zzd = audioManager;
        this.zzf = 3;
        this.zzg = zzg(audioManager, 3);
        this.zzh = zzi(audioManager, this.zzf);
        zzkd zzkdVar = new zzkd(this, null);
        try {
            applicationContext.registerReceiver(zzkdVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.zze = zzkdVar;
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Error registering stream volume receiver", e);
        }
    }

    public static /* bridge */ /* synthetic */ void zzd(zzke zzkeVar) {
        zzkeVar.zzh();
    }

    private static int zzg(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            zzdn.zzb("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i, e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void zzh() {
        zzdm zzdmVar;
        final int zzg = zzg(this.zzd, this.zzf);
        final boolean zzi = zzi(this.zzd, this.zzf);
        if (this.zzg == zzg && this.zzh == zzi) {
            return;
        }
        this.zzg = zzg;
        this.zzh = zzi;
        zzdmVar = ((zzii) this.zzc).zza.zzl;
        zzdmVar.zzd(30, new zzdj() { // from class: com.google.android.gms.internal.ads.zzid
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzc(zzg, zzi);
            }
        });
        zzdmVar.zzc();
    }

    private static boolean zzi(AudioManager audioManager, int i) {
        if (zzeg.zza >= 23) {
            return audioManager.isStreamMute(i);
        }
        return zzg(audioManager, i) == 0;
    }

    public final int zza() {
        return this.zzd.getStreamMaxVolume(this.zzf);
    }

    public final int zzb() {
        if (zzeg.zza >= 28) {
            return this.zzd.getStreamMinVolume(this.zzf);
        }
        return 0;
    }

    public final void zze() {
        zzkd zzkdVar = this.zze;
        if (zzkdVar != null) {
            try {
                this.zza.unregisterReceiver(zzkdVar);
            } catch (RuntimeException e) {
                zzdn.zzb("StreamVolumeManager", "Error unregistering stream volume receiver", e);
            }
            this.zze = null;
        }
    }

    public final void zzf(int i) {
        zzke zzkeVar;
        final zzr zzam;
        zzr zzrVar;
        zzdm zzdmVar;
        if (this.zzf == 3) {
            return;
        }
        this.zzf = 3;
        zzh();
        zzii zziiVar = (zzii) this.zzc;
        zzkeVar = zziiVar.zza.zzz;
        zzam = zzim.zzam(zzkeVar);
        zzrVar = zziiVar.zza.zzac;
        if (zzam.equals(zzrVar)) {
            return;
        }
        zziiVar.zza.zzac = zzam;
        zzdmVar = zziiVar.zza.zzl;
        zzdmVar.zzd(29, new zzdj() { // from class: com.google.android.gms.internal.ads.zzie
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzb(zzr.this);
            }
        });
        zzdmVar.zzc();
    }
}
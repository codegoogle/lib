package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzii implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzxq, zznk, zzua, zzra, zzgi, zzge, zzka, zzgu {
    public static final /* synthetic */ int zzb = 0;
    public final /* synthetic */ zzim zza;

    public /* synthetic */ zzii(zzim zzimVar, zzih zzihVar) {
        this.zza = zzimVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzim.zzN(this.zza, surfaceTexture);
        zzim.zzL(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzim.zzO(this.zza, null);
        zzim.zzL(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzim.zzL(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzim.zzL(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzim.zzL(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final /* synthetic */ void zza(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzgu
    public final void zzb(boolean z) {
        zzim.zzQ(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzc(Exception exc) {
        zzim.zzC(this.zza).zzy(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzd(String str, long j, long j2) {
        zzim.zzC(this.zza).zzz(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zze(String str) {
        zzim.zzC(this.zza).zzA(str);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzf(zzgl zzglVar) {
        zzim.zzC(this.zza).zzB(zzglVar);
        zzim.zzF(this.zza, null);
        zzim.zzE(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzg(zzgl zzglVar) {
        zzim.zzE(this.zza, zzglVar);
        zzim.zzC(this.zza).zzC(zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzh(zzad zzadVar, @z1 zzgm zzgmVar) {
        zzim.zzF(this.zza, zzadVar);
        zzim.zzC(this.zza).zzD(zzadVar, zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzi(long j) {
        zzim.zzC(this.zza).zzE(j);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzj(Exception exc) {
        zzim.zzC(this.zza).zzF(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzk(int i, long j, long j2) {
        zzim.zzC(this.zza).zzG(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzl(int i, long j) {
        zzim.zzC(this.zza).zzH(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzm(Object obj, long j) {
        zzim.zzC(this.zza).zzI(obj, j);
        zzim zzimVar = this.zza;
        if (zzim.zzD(zzimVar) == obj) {
            zzdm zzz = zzim.zzz(zzimVar);
            zzz.zzd(26, zzic.zza);
            zzz.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zznk
    public final void zzn(final boolean z) {
        zzim zzimVar = this.zza;
        if (zzim.zzaf(zzimVar) == z) {
            return;
        }
        zzim.zzH(zzimVar, z);
        zzdm zzz = zzim.zzz(this.zza);
        zzz.zzd(23, new zzdj() { // from class: com.google.android.gms.internal.ads.zzif
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzq(z);
            }
        });
        zzz.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzo(Exception exc) {
        zzim.zzC(this.zza).zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzp(String str, long j, long j2) {
        zzim.zzC(this.zza).zzK(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzq(String str) {
        zzim.zzC(this.zza).zzL(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzr(zzgl zzglVar) {
        zzim.zzC(this.zza).zzM(zzglVar);
        zzim.zzJ(this.zza, null);
        zzim.zzI(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzs(zzgl zzglVar) {
        zzim.zzI(this.zza, zzglVar);
        zzim.zzC(this.zza).zzN(zzglVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzt(long j, int i) {
        zzim.zzC(this.zza).zzO(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzu(zzad zzadVar, @z1 zzgm zzgmVar) {
        zzim.zzJ(this.zza, zzadVar);
        zzim.zzC(this.zza).zzP(zzadVar, zzgmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxq
    public final void zzv(final zzcv zzcvVar) {
        zzim.zzK(this.zza, zzcvVar);
        zzdm zzz = zzim.zzz(this.zza);
        zzz.zzd(25, new zzdj() { // from class: com.google.android.gms.internal.ads.zzig
            @Override // com.google.android.gms.internal.ads.zzdj
            public final void zza(Object obj) {
                ((zzby) obj).zzu(zzcv.this);
            }
        });
        zzz.zzc();
    }
}
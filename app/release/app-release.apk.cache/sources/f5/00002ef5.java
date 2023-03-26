package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzth extends zzrb implements zzsy {
    private final zzbb zza;
    private final zzaw zzb;
    private final zzep zzc;
    private final zzpi zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    @z1
    private zzfs zzj;
    private final zzte zzk;
    private final zzvz zzl;

    public /* synthetic */ zzth(zzbb zzbbVar, zzep zzepVar, zzte zzteVar, zzpi zzpiVar, zzvz zzvzVar, int i, zztg zztgVar, byte[] bArr) {
        zzaw zzawVar = zzbbVar.zzd;
        Objects.requireNonNull(zzawVar);
        this.zzb = zzawVar;
        this.zza = zzbbVar;
        this.zzc = zzepVar;
        this.zzk = zzteVar;
        this.zzd = zzpiVar;
        this.zzl = zzvzVar;
        this.zze = i;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbb zzbbVar = this.zza;
        zztu zztuVar = new zztu(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbbVar, z2 ? zzbbVar.zzf : null);
        zzo(this.zzf ? new zztd(this, zztuVar) : zztuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        ((zztc) zzryVar).zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsaVar, zzvv zzvvVar, long j) {
        zzeq zza = this.zzc.zza();
        zzfs zzfsVar = this.zzj;
        if (zzfsVar != null) {
            zza.zzf(zzfsVar);
        }
        Uri uri = this.zzb.zza;
        zzte zzteVar = this.zzk;
        zzb();
        zzrd zzrdVar = new zzrd(zzteVar.zza);
        zzpi zzpiVar = this.zzd;
        zzpc zzc = zzc(zzsaVar);
        zzvz zzvzVar = this.zzl;
        zzsj zze = zze(zzsaVar);
        String str = this.zzb.zzf;
        return new zztc(uri, zza, zzrdVar, zzpiVar, zzc, zzvzVar, zze, this, zzvvVar, null, this.zze, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsy
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (!this.zzf && this.zzg == j && this.zzh == z && this.zzi == z2) {
            return;
        }
        this.zzg = j;
        this.zzh = z;
        this.zzi = z2;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    public final void zzn(@z1 zzfs zzfsVar) {
        this.zzj = zzfsVar;
        Objects.requireNonNull(Looper.myLooper());
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzw() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        return this.zza;
    }
}
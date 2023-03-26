package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzarn {
    public final zzawz zza;
    public final Object zzb;
    public final int zzc;
    public final zzaxl[] zzd;
    public final boolean[] zze;
    public final long zzf;
    public int zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;
    public boolean zzk;
    public zzarn zzl;
    public zzayf zzm;
    private final zzary[] zzn;
    private final zzarz[] zzo;
    private final zzaye zzp;
    private final zzaxb zzq;
    private zzayf zzr;
    private final zzcio zzs;

    public zzarn(zzary[] zzaryVarArr, zzarz[] zzarzVarArr, long j, zzaye zzayeVar, zzcio zzcioVar, zzaxb zzaxbVar, Object obj, int i, int i2, boolean z, long j2, byte[] bArr) {
        this.zzn = zzaryVarArr;
        this.zzo = zzarzVarArr;
        this.zzf = j;
        this.zzp = zzayeVar;
        this.zzs = zzcioVar;
        this.zzq = zzaxbVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
        this.zzc = i;
        this.zzg = i2;
        this.zzi = z;
        this.zzh = j2;
        this.zzd = new zzaxl[2];
        this.zze = new boolean[2];
        this.zza = zzaxbVar.zze(i2, zzcioVar.zzl());
    }

    public final long zza(long j, boolean z) {
        return zzb(j, false, new boolean[2]);
    }

    public final long zzb(long j, boolean z, boolean[] zArr) {
        zzayc zzaycVar = this.zzm.zzb;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= 2) {
                break;
            }
            boolean[] zArr2 = this.zze;
            if (z || !this.zzm.zza(this.zzr, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        long zzB = this.zza.zzB(zzaycVar.zzb(), this.zze, this.zzd, zArr, j);
        this.zzr = this.zzm;
        this.zzk = false;
        int i2 = 0;
        while (true) {
            zzaxl[] zzaxlVarArr = this.zzd;
            if (i2 >= 2) {
                this.zzs.zzd(this.zzn, this.zzm.zza, zzaycVar);
                return zzB;
            }
            if (zzaxlVarArr[i2] != null) {
                zzayz.zze(zzaycVar.zza(i2) != null);
                this.zzk = true;
            } else {
                zzayz.zze(zzaycVar.zza(i2) == null);
            }
            i2++;
        }
    }

    public final void zzc() {
        try {
            this.zzq.zzc(this.zza);
        } catch (RuntimeException unused) {
        }
    }

    public final boolean zzd() {
        return this.zzj && (!this.zzk || this.zza.zzg() == Long.MIN_VALUE);
    }

    public final boolean zze() throws zzarf {
        zzayf zzc = this.zzp.zzc(this.zzo, this.zza.zzn());
        zzayf zzayfVar = this.zzr;
        if (zzayfVar != null) {
            for (int i = 0; i < 2; i++) {
                if (zzc.zza(zzayfVar, i)) {
                }
            }
            return false;
        }
        this.zzm = zzc;
        return true;
    }
}
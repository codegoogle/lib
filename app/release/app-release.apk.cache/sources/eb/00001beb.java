package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzagf implements zzaga {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @z1
    private final zzahp zzb;
    @z1
    private final zzdy zzc;
    private final boolean[] zzd;
    private final zzagd zze;
    @z1
    private final zzagp zzf;
    private zzage zzg;
    private long zzh;
    private String zzi;
    private zzzy zzj;
    private boolean zzk;
    private long zzl;

    public zzagf() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zza(zzdy zzdyVar) {
        int i;
        float f;
        float f2;
        zzcw.zzb(this.zzg);
        zzcw.zzb(this.zzj);
        int zzc = zzdyVar.zzc();
        int zzd = zzdyVar.zzd();
        byte[] zzH = zzdyVar.zzH();
        this.zzh += zzdyVar.zza();
        zzzw.zzb(this.zzj, zzdyVar, zzdyVar.zza());
        while (true) {
            int zza2 = zzzo.zza(zzH, zzc, zzd, this.zzd);
            if (zza2 == zzd) {
                break;
            }
            int i2 = zza2 + 3;
            int i3 = zzdyVar.zzH()[i2] & 255;
            int i4 = zza2 - zzc;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zza(zzH, zzc, zza2);
                }
                if (this.zze.zzc(i3, i4 < 0 ? -i4 : 0)) {
                    zzzy zzzyVar = this.zzj;
                    zzagd zzagdVar = this.zze;
                    int i5 = zzagdVar.zzb;
                    String str = this.zzi;
                    Objects.requireNonNull(str);
                    byte[] copyOf = Arrays.copyOf(zzagdVar.zzc, zzagdVar.zza);
                    zzdx zzdxVar = new zzdx(copyOf, copyOf.length);
                    zzdxVar.zzk(i5);
                    zzdxVar.zzk(4);
                    zzdxVar.zzi();
                    zzdxVar.zzj(8);
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(4);
                        zzdxVar.zzj(3);
                    }
                    int zzc2 = zzdxVar.zzc(4);
                    if (zzc2 == 15) {
                        int zzc3 = zzdxVar.zzc(8);
                        int zzc4 = zzdxVar.zzc(8);
                        if (zzc4 != 0) {
                            f = zzc3 / zzc4;
                            f2 = f;
                        }
                        f2 = 1.0f;
                    } else {
                        if (zzc2 < 7) {
                            f = zza[zzc2];
                            f2 = f;
                        }
                        f2 = 1.0f;
                    }
                    int i6 = 2;
                    if (zzdxVar.zzl()) {
                        zzdxVar.zzj(2);
                        zzdxVar.zzj(1);
                        if (zzdxVar.zzl()) {
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            zzdxVar.zzj(3);
                            zzdxVar.zzj(11);
                            zzdxVar.zzi();
                            zzdxVar.zzj(15);
                            zzdxVar.zzi();
                            i6 = 2;
                        }
                    }
                    zzdxVar.zzc(i6);
                    zzdxVar.zzi();
                    int zzc5 = zzdxVar.zzc(16);
                    zzdxVar.zzi();
                    if (zzdxVar.zzl() && zzc5 != 0) {
                        int i7 = 0;
                        for (int i8 = zzc5 - 1; i8 > 0; i8 >>= 1) {
                            i7++;
                        }
                        zzdxVar.zzj(i7);
                    }
                    zzdxVar.zzi();
                    int zzc6 = zzdxVar.zzc(13);
                    zzdxVar.zzi();
                    int zzc7 = zzdxVar.zzc(13);
                    zzdxVar.zzi();
                    zzdxVar.zzi();
                    zzab zzabVar = new zzab();
                    zzabVar.zzH(str);
                    zzabVar.zzS("video/mp4v-es");
                    zzabVar.zzX(zzc6);
                    zzabVar.zzF(zzc7);
                    zzabVar.zzP(f2);
                    zzabVar.zzI(Collections.singletonList(copyOf));
                    zzzyVar.zzk(zzabVar.zzY());
                    this.zzk = true;
                }
            }
            this.zzg.zza(zzH, zzc, zza2);
            zzagp zzagpVar = this.zzf;
            if (i4 > 0) {
                zzagpVar.zza(zzH, zzc, zza2);
                i = 0;
            } else {
                i = -i4;
            }
            if (this.zzf.zzd(i)) {
                zzagp zzagpVar2 = this.zzf;
                int zzb = zzzo.zzb(zzagpVar2.zza, zzagpVar2.zzb);
                zzdy zzdyVar2 = this.zzc;
                int i9 = zzeg.zza;
                zzdyVar2.zzD(this.zzf.zza, zzb);
                this.zzb.zza(this.zzl, this.zzc);
            }
            if (i3 == 178) {
                if (zzdyVar.zzH()[zza2 + 2] == 1) {
                    this.zzf.zzc(178);
                }
                i3 = 178;
            }
            int i10 = zzd - zza2;
            this.zzg.zzb(this.zzh - i10, i10, this.zzk);
            this.zzg.zzc(i3, this.zzl);
            zzc = i2;
        }
        if (!this.zzk) {
            this.zze.zza(zzH, zzc, zzd);
        }
        this.zzg.zza(zzH, zzc, zzd);
        this.zzf.zza(zzH, zzc, zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        zzahmVar.zzc();
        this.zzi = zzahmVar.zzb();
        zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzage(zzv);
        this.zzb.zzb(zzyuVar, zzahmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaga
    public final void zze() {
        zzzo.zze(this.zzd);
        this.zze.zzb();
        zzage zzageVar = this.zzg;
        if (zzageVar != null) {
            zzageVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    public zzagf(@z1 zzahp zzahpVar) {
        this.zzb = zzahpVar;
        this.zzd = new boolean[4];
        this.zze = new zzagd(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzagp(178, 128);
        this.zzc = new zzdy();
    }
}
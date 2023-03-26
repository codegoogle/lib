package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzafe {
    private final zzaff zza = new zzaff();
    private final zzdy zzb = new zzdy(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzaff zzaffVar = this.zza;
            if (i5 >= zzaffVar.zzc) {
                break;
            }
            int[] iArr = zzaffVar.zzf;
            this.zzd = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzdy zza() {
        return this.zzb;
    }

    public final zzaff zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzdy zzdyVar = this.zzb;
        if (zzdyVar.zzH().length == 65025) {
            return;
        }
        zzdyVar.zzD(Arrays.copyOf(zzdyVar.zzH(), Math.max(65025, zzdyVar.zzd())), this.zzb.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzys zzysVar) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                if (!this.zza.zzc(zzysVar, -1L) || !this.zza.zzb(zzysVar, true)) {
                    break;
                }
                zzaff zzaffVar = this.zza;
                int i2 = zzaffVar.zzd;
                if ((zzaffVar.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzyv.zze(zzysVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzdy zzdyVar = this.zzb;
                zzdyVar.zzz(zzdyVar.zzd() + zzf);
                zzdy zzdyVar2 = this.zzb;
                if (!zzyv.zzd(zzysVar, zzdyVar2.zzH(), zzdyVar2.zzd(), zzf)) {
                    return false;
                }
                zzdy zzdyVar3 = this.zzb;
                zzdyVar3.zzE(zzdyVar3.zzd() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
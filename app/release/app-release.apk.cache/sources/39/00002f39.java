package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzvv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzvo[] zzd = new zzvo[100];

    public zzvv(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    public final synchronized zzvo zzb() {
        zzvo zzvoVar;
        this.zzb++;
        int i = this.zzc;
        if (i > 0) {
            zzvo[] zzvoVarArr = this.zzd;
            int i2 = i - 1;
            this.zzc = i2;
            zzvoVar = zzvoVarArr[i2];
            Objects.requireNonNull(zzvoVar);
            zzvoVarArr[i2] = null;
        } else {
            zzvoVar = new zzvo(new byte[65536], 0);
            int i3 = this.zzb;
            zzvo[] zzvoVarArr2 = this.zzd;
            int length = zzvoVarArr2.length;
            if (i3 > length) {
                this.zzd = (zzvo[]) Arrays.copyOf(zzvoVarArr2, length + length);
                return zzvoVar;
            }
        }
        return zzvoVar;
    }

    public final synchronized void zzc(zzvo zzvoVar) {
        zzvo[] zzvoVarArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzvoVarArr[i] = zzvoVar;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(@z1 zzvp zzvpVar) {
        while (zzvpVar != null) {
            zzvo[] zzvoVarArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzvoVarArr[i] = zzvpVar.zzc();
            this.zzb--;
            zzvpVar = zzvpVar.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzeg.zze(this.zza, 65536) - this.zzb);
        int i = this.zzc;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zzd, max, i, (Object) null);
        this.zzc = max;
    }
}
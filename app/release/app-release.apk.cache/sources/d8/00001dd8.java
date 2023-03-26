package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaym {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayg[] zze = new zzayg[100];
    private final zzayg[] zza = new zzayg[1];

    public zzaym(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzayg zzb() {
        zzayg zzaygVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzayg[] zzaygVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzaygVar = zzaygVarArr[i2];
            zzaygVarArr[i2] = null;
        } else {
            zzaygVar = new zzayg(new byte[65536], 0);
        }
        return zzaygVar;
    }

    public final synchronized void zzc(zzayg zzaygVar) {
        zzayg[] zzaygVarArr = this.zza;
        zzaygVarArr[0] = zzaygVar;
        zzd(zzaygVarArr);
    }

    public final synchronized void zzd(zzayg[] zzaygVarArr) {
        int length = this.zzd + zzaygVarArr.length;
        zzayg[] zzaygVarArr2 = this.zze;
        int length2 = zzaygVarArr2.length;
        if (length >= length2) {
            this.zze = (zzayg[]) Arrays.copyOf(zzaygVarArr2, Math.max(length2 + length2, length));
        }
        for (zzayg zzaygVar : zzaygVarArr) {
            byte[] bArr = zzaygVar.zza;
            zzayg[] zzaygVarArr3 = this.zze;
            int i = this.zzd;
            this.zzd = i + 1;
            zzaygVarArr3[i] = zzaygVar;
        }
        this.zzc -= zzaygVarArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazo.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zze, max, i, (Object) null);
        this.zzd = max;
    }
}
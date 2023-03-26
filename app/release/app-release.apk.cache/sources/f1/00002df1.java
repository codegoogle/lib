package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjr extends zzgc {
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzci[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjr(Collection collection, zztt zzttVar, byte[] bArr) {
        super(false, zzttVar, null);
        int i = 0;
        int size = collection.size();
        this.zze = new int[size];
        this.zzf = new int[size];
        this.zzg = new zzci[size];
        this.zzh = new Object[size];
        this.zzi = new HashMap();
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            zzjg zzjgVar = (zzjg) it.next();
            this.zzg[i3] = zzjgVar.zza();
            this.zzf[i3] = i;
            this.zze[i3] = i2;
            i += this.zzg[i3].zzc();
            i2 += this.zzg[i3].zzb();
            this.zzh[i3] = zzjgVar.zzb();
            this.zzi.put(this.zzh[i3], Integer.valueOf(i3));
            i3++;
        }
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzq(int i) {
        return zzeg.zzc(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzr(int i) {
        return zzeg.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzs(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final int zzt(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final zzci zzu(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgc
    public final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }
}
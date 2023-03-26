package com.google.android.gms.internal.ads;

import com.p7700g.p99005.y7;
import com.p7700g.p99005.z1;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdns {
    public static final zzdns zza = new zzdns(new zzdnq());
    @z1
    private final zzbmc zzb;
    @z1
    private final zzblz zzc;
    @z1
    private final zzbmp zzd;
    @z1
    private final zzbmm zze;
    @z1
    private final zzbrb zzf;
    private final y7 zzg;
    private final y7 zzh;

    private zzdns(zzdnq zzdnqVar) {
        this.zzb = zzdnqVar.zza;
        this.zzc = zzdnqVar.zzb;
        this.zzd = zzdnqVar.zzc;
        this.zzg = new y7(zzdnqVar.zzf);
        this.zzh = new y7(zzdnqVar.zzg);
        this.zze = zzdnqVar.zzd;
        this.zzf = zzdnqVar.zze;
    }

    @z1
    public final zzblz zza() {
        return this.zzc;
    }

    @z1
    public final zzbmc zzb() {
        return this.zzb;
    }

    @z1
    public final zzbmf zzc(String str) {
        return (zzbmf) this.zzh.get(str);
    }

    @z1
    public final zzbmi zzd(String str) {
        return (zzbmi) this.zzg.get(str);
    }

    @z1
    public final zzbmm zze() {
        return this.zze;
    }

    @z1
    public final zzbmp zzf() {
        return this.zzd;
    }

    @z1
    public final zzbrb zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.n(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
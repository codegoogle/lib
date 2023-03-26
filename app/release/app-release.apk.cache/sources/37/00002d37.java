package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgnm extends zzgnk {
    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ int zza(Object obj) {
        return ((zzgnl) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzgnl) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgkq zzgkqVar = (zzgkq) obj;
        zzgnl zzgnlVar = zzgkqVar.zzc;
        if (zzgnlVar == zzgnl.zzc()) {
            zzgnl zze = zzgnl.zze();
            zzgkqVar.zzc = zze;
            return zze;
        }
        return zzgnlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgkq) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        zzgnl zzgnlVar = (zzgnl) obj2;
        return zzgnlVar.equals(zzgnl.zzc()) ? obj : zzgnl.zzd((zzgnl) obj, zzgnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ Object zzf() {
        return zzgnl.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzgnl) obj).zzf();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgnl) obj).zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgnl) obj).zzh((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgnl) obj).zzh((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgji zzgjiVar) {
        ((zzgnl) obj).zzh((i << 3) | 2, zzgjiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgnl) obj).zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final void zzm(Object obj) {
        ((zzgkq) obj).zzc.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgkq) obj).zzc = (zzgnl) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgkq) obj).zzc = (zzgnl) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final boolean zzq(zzgml zzgmlVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgnk
    public final /* synthetic */ void zzr(Object obj, zzgjy zzgjyVar) throws IOException {
        ((zzgnl) obj).zzi(zzgjyVar);
    }
}
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfcd {
    @z1
    public final com.google.android.gms.ads.internal.client.zzff zza;
    @z1
    public final zzbqs zzb;
    @z1
    public final zzemh zzc;
    public final com.google.android.gms.ads.internal.client.zzl zzd;
    public final com.google.android.gms.ads.internal.client.zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbkp zzi;
    public final com.google.android.gms.ads.internal.client.zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final com.google.android.gms.ads.internal.client.zzbz zzn;
    public final zzfbt zzo;
    public final boolean zzp;
    public final boolean zzq;
    @z1
    public final com.google.android.gms.ads.internal.client.zzcd zzr;

    public /* synthetic */ zzfcd(zzfcb zzfcbVar, zzfcc zzfccVar) {
        com.google.android.gms.ads.internal.client.zzff zzffVar;
        zzbkp zzbkpVar;
        this.zze = zzfcb.zzf(zzfcbVar);
        this.zzf = zzfcb.zzH(zzfcbVar);
        this.zzr = zzfcb.zzP(zzfcbVar);
        int i = zzfcb.zzd(zzfcbVar).zza;
        long j = zzfcb.zzd(zzfcbVar).zzb;
        Bundle bundle = zzfcb.zzd(zzfcbVar).zzc;
        int i2 = zzfcb.zzd(zzfcbVar).zzd;
        List list = zzfcb.zzd(zzfcbVar).zze;
        boolean z = zzfcb.zzd(zzfcbVar).zzf;
        int i3 = zzfcb.zzd(zzfcbVar).zzg;
        boolean z2 = true;
        if (!zzfcb.zzd(zzfcbVar).zzh && !zzfcb.zzN(zzfcbVar)) {
            z2 = false;
        }
        this.zzd = new com.google.android.gms.ads.internal.client.zzl(i, j, bundle, i2, list, z, i3, z2, zzfcb.zzd(zzfcbVar).zzi, zzfcb.zzd(zzfcbVar).zzj, zzfcb.zzd(zzfcbVar).zzk, zzfcb.zzd(zzfcbVar).zzl, zzfcb.zzd(zzfcbVar).zzm, zzfcb.zzd(zzfcbVar).zzn, zzfcb.zzd(zzfcbVar).zzo, zzfcb.zzd(zzfcbVar).zzp, zzfcb.zzd(zzfcbVar).zzq, zzfcb.zzd(zzfcbVar).zzr, zzfcb.zzd(zzfcbVar).zzs, zzfcb.zzd(zzfcbVar).zzt, zzfcb.zzd(zzfcbVar).zzu, zzfcb.zzd(zzfcbVar).zzv, com.google.android.gms.ads.internal.util.zzs.zza(zzfcb.zzd(zzfcbVar).zzw), zzfcb.zzd(zzfcbVar).zzx);
        if (zzfcb.zzj(zzfcbVar) != null) {
            zzffVar = zzfcb.zzj(zzfcbVar);
        } else {
            zzffVar = zzfcb.zzk(zzfcbVar) != null ? zzfcb.zzk(zzfcbVar).zzf : null;
        }
        this.zza = zzffVar;
        this.zzg = zzfcb.zzJ(zzfcbVar);
        this.zzh = zzfcb.zzK(zzfcbVar);
        if (zzfcb.zzJ(zzfcbVar) == null) {
            zzbkpVar = null;
        } else {
            zzbkpVar = zzfcb.zzk(zzfcbVar) == null ? new zzbkp(new NativeAdOptions.Builder().build()) : zzfcb.zzk(zzfcbVar);
        }
        this.zzi = zzbkpVar;
        this.zzj = zzfcb.zzh(zzfcbVar);
        this.zzk = zzfcb.zza(zzfcbVar);
        this.zzl = zzfcb.zzb(zzfcbVar);
        this.zzm = zzfcb.zzc(zzfcbVar);
        this.zzn = zzfcb.zzi(zzfcbVar);
        this.zzb = zzfcb.zzl(zzfcbVar);
        this.zzo = new zzfbt(zzfcb.zzn(zzfcbVar), null);
        this.zzp = zzfcb.zzL(zzfcbVar);
        this.zzc = zzfcb.zzm(zzfcbVar);
        this.zzq = zzfcb.zzM(zzfcbVar);
    }

    @z1
    public final zzbms zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        return publisherAdViewOptions != null ? publisherAdViewOptions.zzb() : this.zzl.zza();
    }
}
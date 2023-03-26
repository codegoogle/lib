package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.d.a.b;
import com.anythink.expressad.foundation.d.d;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.pc5;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzeoa implements zzetf {
    public final com.google.android.gms.ads.internal.client.zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeoa(com.google.android.gms.ads.internal.client.zzq zzqVar, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzqVar, "the adSize must not be null");
        this.zza = zzqVar;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        zzfco.zzg(bundle, "smart_w", b.ax, this.zza.zze == -1);
        zzfco.zzg(bundle, "smart_h", pc5.c, this.zza.zzb == -2);
        Boolean bool = Boolean.TRUE;
        zzfco.zze(bundle, "ene", bool, this.zza.zzj);
        zzfco.zzg(bundle, "rafmt", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_HB, this.zza.zzm);
        zzfco.zzg(bundle, "rafmt", ATAdConst.BIDDING_TYPE.BIDDING_LOSS_WITH_LOW_PRICE_IN_NORMAL, this.zza.zzn);
        zzfco.zzg(bundle, "rafmt", "105", this.zza.zzo);
        zzfco.zze(bundle, "inline_adaptive_slot", bool, this.zzi);
        zzfco.zze(bundle, "interscroller_slot", bool, this.zza.zzo);
        zzfco.zzc(bundle, "format", this.zzb);
        zzfco.zzg(bundle, "fluid", "height", this.zzc);
        zzfco.zzg(bundle, "sz", this.zzd, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(d.t, this.zzg);
        String str2 = this.zzh;
        zzfco.zzg(bundle, b.bH, str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        com.google.android.gms.ads.internal.client.zzq[] zzqVarArr = this.zza.zzg;
        if (zzqVarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (com.google.android.gms.ads.internal.client.zzq zzqVar : zzqVarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzqVar.zzi);
                bundle3.putInt("height", zzqVar.zzb);
                bundle3.putInt("width", zzqVar.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
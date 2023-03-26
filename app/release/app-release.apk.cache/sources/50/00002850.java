package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.microsoft.appcenter.ingestion.models.AbstractLog;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzetp implements zzetf {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzetp(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        zzfco.zzg(bundle, "carrier", str, !TextUtils.isEmpty(str));
        zzfco.zzf(bundle, "cnt", Integer.valueOf(this.zzb), this.zzb != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfco.zza(bundle, AbstractLog.DEVICE);
        bundle.putBundle(AbstractLog.DEVICE, zza);
        Bundle zza2 = zzfco.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
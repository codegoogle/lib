package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.microsoft.appcenter.ingestion.models.AbstractLog;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzepk implements zzetf {
    public final double zza;
    public final boolean zzb;

    public zzepk(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetf
    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfco.zza(bundle, AbstractLog.DEVICE);
        bundle.putBundle(AbstractLog.DEVICE, zza);
        Bundle zza2 = zzfco.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
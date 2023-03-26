package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class RtbSignalData {
    private final Context zza;
    private final List zzb;
    private final Bundle zzc;
    @z1
    private final AdSize zzd;

    public RtbSignalData(@x1 Context context, @x1 List<MediationConfiguration> list, @x1 Bundle bundle, @z1 AdSize adSize) {
        this.zza = context;
        this.zzb = list;
        this.zzc = bundle;
        this.zzd = adSize;
    }

    @z1
    public AdSize getAdSize() {
        return this.zzd;
    }

    @z1
    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.zzb;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) this.zzb.get(0);
    }

    @x1
    public List<MediationConfiguration> getConfigurations() {
        return this.zzb;
    }

    @x1
    public Context getContext() {
        return this.zza;
    }

    @x1
    public Bundle getNetworkExtras() {
        return this.zzc;
    }
}
package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.p7700g.p99005.x1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public class MediationConfiguration {
    @x1
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";
    private final AdFormat zza;
    private final Bundle zzb;

    public MediationConfiguration(@x1 AdFormat adFormat, @x1 Bundle bundle) {
        this.zza = adFormat;
        this.zzb = bundle;
    }

    @x1
    public AdFormat getFormat() {
        return this.zza;
    }

    @x1
    public Bundle getServerParameters() {
        return this.zzb;
    }
}
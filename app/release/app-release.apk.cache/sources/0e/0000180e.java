package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {
    private final AdSize zza;

    public MediationBannerAdConfiguration(@x1 Context context, @x1 String str, @x1 Bundle bundle, @x1 Bundle bundle2, boolean z, @z1 Location location, int i, int i2, @x1 String str2, @x1 AdSize adSize, @x1 String str3) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = adSize;
    }

    @x1
    public AdSize getAdSize() {
        return this.zza;
    }
}
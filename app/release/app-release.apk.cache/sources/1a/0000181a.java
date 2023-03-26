package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbkp;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {
    @z1
    private final zzbkp zza;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z, @z1 Location location, int i, int i2, @z1 String str2, String str3, @z1 zzbkp zzbkpVar) {
        super(context, str, bundle, bundle2, z, location, i, i2, str2, str3);
        this.zza = zzbkpVar;
    }

    @x1
    public NativeAdOptions getNativeAdOptions() {
        return zzbkp.zza(this.zza);
    }
}
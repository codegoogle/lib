package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;
    private final String zza;
    private final Bundle zzb;
    private final Bundle zzc;
    private final Context zzd;
    private final boolean zze;
    @z1
    private final Location zzf;
    private final int zzg;
    private final int zzh;
    @z1
    private final String zzi;
    private final String zzj;

    /* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(@x1 Context context, @x1 String str, @x1 Bundle bundle, @x1 Bundle bundle2, boolean z, @z1 Location location, int i, int i2, @z1 String str2, @x1 String str3) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = bundle2;
        this.zzd = context;
        this.zze = z;
        this.zzf = location;
        this.zzg = i;
        this.zzh = i2;
        this.zzi = str2;
        this.zzj = str3;
    }

    @x1
    public String getBidResponse() {
        return this.zza;
    }

    @x1
    public Context getContext() {
        return this.zzd;
    }

    @z1
    public String getMaxAdContentRating() {
        return this.zzi;
    }

    @x1
    public Bundle getMediationExtras() {
        return this.zzc;
    }

    @x1
    public Bundle getServerParameters() {
        return this.zzb;
    }

    @x1
    public String getWatermark() {
        return this.zzj;
    }

    public boolean isTestRequest() {
        return this.zze;
    }

    public int taggedForChildDirectedTreatment() {
        return this.zzg;
    }

    public int taggedForUnderAgeTreatment() {
        return this.zzh;
    }
}
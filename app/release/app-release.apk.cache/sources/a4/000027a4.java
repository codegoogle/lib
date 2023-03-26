package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.gh;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzenf implements zzetg {
    private final Context zza;

    public zzenf(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzcr)).booleanValue()) {
            return zzfvc.zzi(new zzeng(gh.a(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
        }
        return zzfvc.zzi(null);
    }
}
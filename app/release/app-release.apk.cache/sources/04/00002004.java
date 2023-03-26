package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbta {
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbsy();
    @VisibleForTesting
    public static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbsz();
    private final zzbsm zzc;

    public zzbta(Context context, zzcfo zzcfoVar, String str, @Nullable zzfhu zzfhuVar) {
        this.zzc = new zzbsm(context, zzcfoVar, str, zza, zzb, zzfhuVar);
    }

    public final zzbsq zza(String str, zzbst zzbstVar, zzbss zzbssVar) {
        return new zzbte(this.zzc, str, zzbstVar, zzbssVar);
    }

    public final zzbtj zzb() {
        return new zzbtj(this.zzc);
    }
}
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.p7700g.p99005.z1;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbif {
    public static final void zza(zzbie zzbieVar, @z1 zzbic zzbicVar) {
        if (zzbicVar.zza() != null) {
            if (!TextUtils.isEmpty(zzbicVar.zzb())) {
                zzbieVar.zzd(zzbicVar.zza(), zzbicVar.zzb(), zzbicVar.zzc(), zzbicVar.zzd());
                return;
            }
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
    }
}
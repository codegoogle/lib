package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import com.p7700g.p99005.bn2;
import com.p7700g.p99005.ym2;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes2.dex */
public final class zzn {
    private final Application zza;
    private final zzb zzb;
    private final zzam zzc;

    public zzn(Application application, zzb zzbVar, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzbVar;
        this.zzc = zzamVar;
    }

    public final zzbu zzd(Activity activity, bn2 bn2Var) throws zzj {
        ym2 a = bn2Var.a();
        if (a == null) {
            a = new ym2.a(this.zza).b();
        }
        return zzo.zza(new zzo(this, activity, a, bn2Var, null));
    }
}
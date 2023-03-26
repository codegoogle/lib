package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzctj implements zzdco {
    private final zzfcy zza;

    public zzctj(zzfcy zzfcyVar) {
        this.zza = zzfcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(@z1 Context context) {
        try {
            this.zza.zzg();
        } catch (zzfci e) {
            zzcfi.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(@z1 Context context) {
        try {
            this.zza.zzs();
        } catch (zzfci e) {
            zzcfi.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(@z1 Context context) {
        try {
            this.zza.zzt();
            if (context != null) {
                this.zza.zzr(context);
            }
        } catch (zzfci e) {
            zzcfi.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
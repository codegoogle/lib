package com.google.android.gms.internal.ads;

import android.content.Context;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtu implements zzdco {
    @z1
    private final zzcli zza;

    public zzdtu(@z1 zzcli zzcliVar) {
        this.zza = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbq(@z1 Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbs(@z1 Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdco
    public final void zzbt(@z1 Context context) {
        zzcli zzcliVar = this.zza;
        if (zzcliVar != null) {
            zzcliVar.onResume();
        }
    }
}
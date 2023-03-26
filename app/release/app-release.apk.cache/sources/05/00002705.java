package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzehi implements zzdlg {
    private final zzfbl zza;
    private final zzbvt zzb;
    private final boolean zzc;
    @z1
    private zzdcl zzd = null;

    public zzehi(zzfbl zzfblVar, zzbvt zzbvtVar, boolean z) {
        this.zza = zzfblVar;
        this.zzb = zzbvtVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdlg
    public final void zza(boolean z, Context context, zzdcg zzdcgVar) throws zzdlf {
        try {
            if (this.zzc ? this.zzb.zzr(ObjectWrapper.wrap(context)) : this.zzb.zzq(ObjectWrapper.wrap(context))) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbp)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdlf("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdlf(th);
        }
    }

    public final void zzb(zzdcl zzdclVar) {
        this.zzd = zzdclVar;
    }
}
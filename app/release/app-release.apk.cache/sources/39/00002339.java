package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.z1;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcxk implements zzddh, zzdcn {
    private final Context zza;
    @z1
    private final zzcli zzb;
    private final zzfbl zzc;
    private final zzcfo zzd;
    @GuardedBy("this")
    @z1
    private IObjectWrapper zze;
    @GuardedBy("this")
    private boolean zzf;

    public zzcxk(Context context, @z1 zzcli zzcliVar, zzfbl zzfblVar, zzcfo zzcfoVar) {
        this.zza = context;
        this.zzb = zzcliVar;
        this.zzc = zzfblVar;
        this.zzd = zzcfoVar;
    }

    private final synchronized void zza() {
        zzbxq zzbxqVar;
        zzbxr zzbxrVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzh().zze(this.zza)) {
                zzcfo zzcfoVar = this.zzd;
                String str = zzcfoVar.zzb + CryptoConstants.ALIAS_SEPARATOR + zzcfoVar.zzc;
                String zza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzbxqVar = zzbxq.VIDEO;
                    zzbxrVar = zzbxr.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzbxqVar = zzbxq.HTML_DISPLAY;
                    if (this.zzc.zzf == 1) {
                        zzbxrVar = zzbxr.ONE_PIXEL;
                    } else {
                        zzbxrVar = zzbxr.BEGIN_TO_RENDER;
                    }
                }
                IObjectWrapper zza2 = com.google.android.gms.ads.internal.zzt.zzh().zza(str, this.zzb.zzI(), "", "javascript", zza, zzbxrVar, zzbxqVar, this.zzc.zzan);
                this.zze = zza2;
                zzcli zzcliVar = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzc(this.zze, (View) zzcliVar);
                    this.zzb.zzar(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzh().zzd(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new q7());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final synchronized void zzl() {
        zzcli zzcliVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcliVar = this.zzb) == null) {
            return;
        }
        zzcliVar.zzd("onSdkImpression", new q7());
    }

    @Override // com.google.android.gms.internal.ads.zzddh
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
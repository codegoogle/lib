package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.d.c;
import com.google.android.gms.ads.MobileAds;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.y5;
import com.p7700g.p99005.z1;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzecw implements zzdgk, com.google.android.gms.ads.internal.client.zza, zzdcn, zzdbx {
    private final Context zza;
    private final zzfcs zzb;
    private final zzfbx zzc;
    private final zzfbl zzd;
    private final zzees zze;
    @z1
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();
    @x1
    private final zzfgp zzh;
    private final String zzi;

    public zzecw(Context context, zzfcs zzfcsVar, zzfbx zzfbxVar, zzfbl zzfblVar, zzees zzeesVar, @x1 zzfgp zzfgpVar, String str) {
        this.zza = context;
        this.zzb = zzfcsVar;
        this.zzc = zzfbxVar;
        this.zzd = zzfblVar;
        this.zze = zzeesVar;
        this.zzh = zzfgpVar;
        this.zzi = str;
    }

    private final zzfgo zzf(String str) {
        zzfgo zzb = zzfgo.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzv(this.zza) ? "offline" : y5.g);
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zzg(zzfgo zzfgoVar) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeeu(com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgoVar), 2));
            return;
        }
        this.zzh.zzb(zzfgoVar);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbm);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzo = com.google.android.gms.ads.internal.util.zzs.zzo(this.zza);
                    boolean z = false;
                    if (str != null && zzo != null) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf(c.bY));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfgo zzf = zzf("ifts");
            zzf.zza("reason", "adapter");
            if (i >= 0) {
                zzf.zza("arec", String.valueOf(i));
            }
            if (zza != null) {
                zzf.zza("areec", zza);
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zzb() {
        if (this.zzg) {
            zzfgp zzfgpVar = this.zzh;
            zzfgo zzf = zzf("ifts");
            zzf.zza("reason", "blocked");
            zzfgpVar.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzc() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgk
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdbx
    public final void zze(zzdlf zzdlfVar) {
        if (this.zzg) {
            zzfgo zzf = zzf("ifts");
            zzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdlfVar.getMessage())) {
                zzf.zza("msg", zzdlfVar.getMessage());
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcn
    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf(c.bQ));
        }
    }
}
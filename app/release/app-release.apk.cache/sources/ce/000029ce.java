package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.a.f;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfhs implements Runnable {
    private final zzfhu zzb;
    private String zzc;
    private String zzd;
    private zzfbw zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzfhs(zzfhu zzfhuVar) {
        this.zzb = zzfhuVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfhs zza(zzfhh zzfhhVar) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhhVar.zzg();
            list.add(zzfhhVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcfv.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhq)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhs zzb(String str) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue() && zzfhr.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhs zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzfhs zzd(ArrayList arrayList) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            if (!arrayList.contains(f.e) && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains(f.a) && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfhs zze(String str) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfhs zzf(zzfbw zzfbwVar) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zze = zzfbwVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfhh zzfhhVar : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfhhVar.zzk(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfhhVar.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfhhVar.zzi()) {
                    zzfhhVar.zzc(this.zzd);
                }
                zzfbw zzfbwVar = this.zze;
                if (zzfbwVar != null) {
                    zzfhhVar.zzb(zzfbwVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfhhVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfhhVar.zzj());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfhs zzh(int i) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
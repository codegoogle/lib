package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.anythink.expressad.foundation.h.h;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.pt0;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzces {
    @VisibleForTesting
    public final String zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    @VisibleForTesting
    public long zza = -1;
    @VisibleForTesting
    public long zzb = -1;
    @VisibleForTesting
    @GuardedBy("lock")
    public int zzc = -1;
    @VisibleForTesting
    public int zzd = -1;
    @VisibleForTesting
    public long zze = 0;
    private final Object zzi = new Object();
    @VisibleForTesting
    @GuardedBy("lock")
    public int zzg = 0;
    @VisibleForTesting
    @GuardedBy("lock")
    public int zzh = 0;

    public zzces(String str, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzf = str;
        this.zzj = zzgVar;
    }

    private final void zzg() {
        if (((Boolean) zzbjv.zza.zze()).booleanValue()) {
            synchronized (this.zzi) {
                this.zzc--;
                this.zzd--;
            }
        }
    }

    public final Bundle zza(Context context, String str) {
        Bundle bundle;
        synchronized (this.zzi) {
            bundle = new Bundle();
            if (!this.zzj.zzP()) {
                bundle.putString("session_id", this.zzf);
            }
            bundle.putLong("basets", this.zzb);
            bundle.putLong("currts", this.zza);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", this.zzc);
            bundle.putInt("preqs_in_session", this.zzd);
            bundle.putLong("time_in_session", this.zze);
            bundle.putInt("pclick", this.zzg);
            bundle.putInt("pimp", this.zzh);
            Context zza = zzcaj.zza(context);
            int identifier = zza.getResources().getIdentifier("Theme.Translucent", h.e, pt0.a);
            boolean z = false;
            if (identifier == 0) {
                zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            } else {
                try {
                    if (identifier == zza.getPackageManager().getActivityInfo(new ComponentName(zza.getPackageName(), AdActivity.CLASS_NAME), 0).theme) {
                        z = true;
                    } else {
                        zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    zzcfi.zzj("Fail to fetch AdActivity theme");
                    zzcfi.zzi("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                }
            }
            bundle.putBoolean("support_transparent_background", z);
        }
        return bundle;
    }

    public final void zzb() {
        synchronized (this.zzi) {
            this.zzg++;
        }
    }

    public final void zzc() {
        synchronized (this.zzi) {
            this.zzh++;
        }
    }

    public final void zzd() {
        zzg();
    }

    public final void zze() {
        zzg();
    }

    public final void zzf(com.google.android.gms.ads.internal.client.zzl zzlVar, long j) {
        synchronized (this.zzi) {
            long zzd = this.zzj.zzd();
            long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
            if (this.zzb == -1) {
                if (currentTimeMillis - zzd > ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaN)).longValue()) {
                    this.zzd = -1;
                } else {
                    this.zzd = this.zzj.zzc();
                }
                this.zzb = j;
                this.zza = j;
            } else {
                this.zza = j;
            }
            Bundle bundle = zzlVar.zzc;
            if (bundle != null && bundle.getInt("gw", 2) == 1) {
                return;
            }
            this.zzc++;
            int i = this.zzd + 1;
            this.zzd = i;
            if (i == 0) {
                this.zze = 0L;
                this.zzj.zzD(currentTimeMillis);
            } else {
                this.zze = currentTimeMillis - this.zzj.zze();
            }
        }
    }
}
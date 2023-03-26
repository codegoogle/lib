package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.p7700g.p99005.c6;
import com.p7700g.p99005.d6;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.z5;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbix {
    @z1
    private d6 zza;
    @z1
    private z5 zzb;
    @z1
    private c6 zzc;
    @z1
    private zzbiv zzd;

    public static boolean zzg(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        if (queryIntentActivities != null && resolveActivity != null) {
            for (int i = 0; i < queryIntentActivities.size(); i++) {
                if (resolveActivity.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                    return resolveActivity.activityInfo.packageName.equals(zzgri.zza(context));
                }
            }
        }
        return false;
    }

    @z1
    public final d6 zza() {
        z5 z5Var = this.zzb;
        if (z5Var == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = z5Var.k(null);
        }
        return this.zza;
    }

    public final void zzb(Activity activity) {
        String zza;
        if (this.zzb == null && (zza = zzgri.zza(activity)) != null) {
            zzgrj zzgrjVar = new zzgrj(this, null);
            this.zzc = zzgrjVar;
            z5.b(activity, zza, zzgrjVar);
        }
    }

    public final void zzc(z5 z5Var) {
        this.zzb = z5Var;
        z5Var.n(0L);
        zzbiv zzbivVar = this.zzd;
        if (zzbivVar != null) {
            zzbivVar.zza();
        }
    }

    public final void zzd() {
        this.zzb = null;
        this.zza = null;
    }

    public final void zze(zzbiv zzbivVar) {
        this.zzd = zzbivVar;
    }

    public final void zzf(Activity activity) {
        c6 c6Var = this.zzc;
        if (c6Var == null) {
            return;
        }
        activity.unbindService(c6Var);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }
}
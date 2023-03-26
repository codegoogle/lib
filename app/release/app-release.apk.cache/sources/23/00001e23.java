package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbf implements Application.ActivityLifecycleCallbacks {
    @z1
    private Activity zza;
    private Context zzb;
    private Runnable zzh;
    private long zzj;
    private final Object zzc = new Object();
    private boolean zzd = true;
    private boolean zze = false;
    @GuardedBy("lock")
    private final List zzf = new ArrayList();
    @GuardedBy("lock")
    private final List zzg = new ArrayList();
    private boolean zzi = false;

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzbbu) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzcfi.zzh("", e);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzbbu zzbbuVar : this.zzg) {
                try {
                    zzbbuVar.zzb();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzcfi.zzh("", e);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        zzfnw zzfnwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzbbe zzbbeVar = new zzbbe(this);
        this.zzh = zzbbeVar;
        zzfnwVar.postDelayed(zzbbeVar, this.zzj);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzs.zza.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzbbu zzbbuVar : this.zzg) {
                try {
                    zzbbuVar.zzc();
                } catch (Exception e) {
                    com.google.android.gms.ads.internal.zzt.zzo().zzt(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzcfi.zzh("", e);
                }
            }
            if (z) {
                for (zzbbg zzbbgVar : this.zzf) {
                    try {
                        zzbbgVar.zza(true);
                    } catch (Exception e2) {
                        zzcfi.zzh("", e2);
                    }
                }
            } else {
                zzcfi.zze("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @z1
    public final Activity zza() {
        return this.zza;
    }

    @z1
    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzbbg zzbbgVar) {
        synchronized (this.zzc) {
            this.zzf.add(zzbbgVar);
        }
    }

    public final void zzg(Application application, Context context) {
        if (this.zzi) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            zzk((Activity) context);
        }
        this.zzb = application;
        this.zzj = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaM)).longValue();
        this.zzi = true;
    }

    public final void zzh(zzbbg zzbbgVar) {
        synchronized (this.zzc) {
            this.zzf.remove(zzbbgVar);
        }
    }
}
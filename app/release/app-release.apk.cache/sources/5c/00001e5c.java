package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.p7700g.p99005.z1;
import java.util.concurrent.Future;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbdi {
    @GuardedBy("lock")
    @z1
    private zzbcx zza;
    @GuardedBy("lock")
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    public zzbdi(Context context) {
        this.zzc = context;
    }

    public static /* bridge */ /* synthetic */ void zze(zzbdi zzbdiVar) {
        synchronized (zzbdiVar.zzd) {
            zzbcx zzbcxVar = zzbdiVar.zza;
            if (zzbcxVar == null) {
                return;
            }
            zzbcxVar.disconnect();
            zzbdiVar.zza = null;
            Binder.flushPendingCommands();
        }
    }

    public final Future zzc(zzbcy zzbcyVar) {
        zzbdc zzbdcVar = new zzbdc(this);
        zzbdg zzbdgVar = new zzbdg(this, zzbcyVar, zzbdcVar);
        zzbdh zzbdhVar = new zzbdh(this, zzbdcVar);
        synchronized (this.zzd) {
            zzbcx zzbcxVar = new zzbcx(this.zzc, com.google.android.gms.ads.internal.zzt.zzt().zzb(), zzbdgVar, zzbdhVar);
            this.zza = zzbcxVar;
            zzbcxVar.checkAvailabilityAndConnect();
        }
        return zzbdcVar;
    }
}
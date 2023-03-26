package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.p7700g.p99005.r2;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzduc {
    private final zzfcw zza;
    private final zzdtz zzb;

    public zzduc(zzfcw zzfcwVar, zzdtz zzdtzVar) {
        this.zza = zzfcwVar;
        this.zzb = zzdtzVar;
    }

    @r2
    public final zzbua zza() throws RemoteException {
        zzbua zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        zzcfi.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbvt zzb(String str) throws RemoteException {
        zzbvt zzc = zza().zzc(str);
        this.zzb.zze(str, zzc);
        return zzc;
    }

    public final zzfcy zzc(String str, JSONObject jSONObject) throws zzfci {
        zzbud zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbuz(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbuz(new zzbwk());
            } else {
                zzbua zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e) {
                        zzcfi.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfcy zzfcyVar = new zzfcy(zzb);
            this.zzb.zzd(str, zzfcyVar);
            return zzfcyVar;
        } catch (Throwable th) {
            throw new zzfci(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
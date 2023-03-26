package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.p7700g.p99005.k1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcds {
    @k1("this")
    private final Map zza = new HashMap();
    @k1("this")
    private final List zzb = new ArrayList();
    private final Context zzc;
    private final zzccp zzd;

    public zzcds(Context context, zzccp zzccpVar) {
        this.zzc = context;
        this.zzd = zzccpVar;
    }

    public final /* synthetic */ void zzb(Map map, SharedPreferences sharedPreferences, String str, String str2) {
        if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
            this.zzd.zze();
        }
    }

    public final synchronized void zzc(String str) {
        SharedPreferences sharedPreferences;
        if (this.zza.containsKey(str)) {
            return;
        }
        if ("__default__".equals(str)) {
            sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.zzc);
        } else {
            sharedPreferences = this.zzc.getSharedPreferences(str, 0);
        }
        zzcdr zzcdrVar = new zzcdr(this, str);
        this.zza.put(str, zzcdrVar);
        sharedPreferences.registerOnSharedPreferenceChangeListener(zzcdrVar);
    }

    public final synchronized void zzd(zzcdq zzcdqVar) {
        this.zzb.add(zzcdqVar);
    }
}
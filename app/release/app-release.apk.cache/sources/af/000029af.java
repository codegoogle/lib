package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.foundation.g.a.f;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfgo {
    private final HashMap zza;
    private final zzfgu zzb;

    private zzfgo() {
        HashMap hashMap = new HashMap();
        this.zza = hashMap;
        this.zzb = new zzfgu(com.google.android.gms.ads.internal.zzt.zzA());
        hashMap.put("new_csi", "1");
    }

    public static zzfgo zzb(String str) {
        zzfgo zzfgoVar = new zzfgo();
        zzfgoVar.zza.put("action", str);
        return zzfgoVar;
    }

    public static zzfgo zzc(String str) {
        zzfgo zzfgoVar = new zzfgo();
        zzfgoVar.zza.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_REQUEST_ID, str);
        return zzfgoVar;
    }

    public final zzfgo zza(@x1 String str, @x1 String str2) {
        this.zza.put(str, str2);
        return this;
    }

    public final zzfgo zzd(@x1 String str) {
        this.zzb.zzb(str);
        return this;
    }

    public final zzfgo zze(@x1 String str, @x1 String str2) {
        this.zzb.zzc(str, str2);
        return this;
    }

    public final zzfgo zzf(zzfbl zzfblVar) {
        this.zza.put("aai", zzfblVar.zzx);
        return this;
    }

    public final zzfgo zzg(zzfbo zzfboVar) {
        if (!TextUtils.isEmpty(zzfboVar.zzb)) {
            this.zza.put("gqi", zzfboVar.zzb);
        }
        return this;
    }

    public final zzfgo zzh(zzfbx zzfbxVar, @z1 zzcev zzcevVar) {
        zzfbw zzfbwVar = zzfbxVar.zzb;
        zzg(zzfbwVar.zzb);
        if (!zzfbwVar.zza.isEmpty()) {
            switch (((zzfbl) zzfbwVar.zza.get(0)).zzb) {
                case 1:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, f.e);
                    break;
                case 2:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "interstitial");
                    break;
                case 3:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "native_express");
                    break;
                case 4:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "native_advanced");
                    break;
                case 5:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "rewarded");
                    break;
                case 6:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "app_open_ad");
                    if (zzcevVar != null) {
                        this.zza.put("as", true != zzcevVar.zzj() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.zza.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, "unknown");
                    break;
            }
        }
        return this;
    }

    public final zzfgo zzi(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.zza.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.zza.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    public final Map zzj() {
        HashMap hashMap = new HashMap(this.zza);
        for (zzfgt zzfgtVar : this.zzb.zza()) {
            hashMap.put(zzfgtVar.zza, zzfgtVar.zzb);
        }
        return hashMap;
    }
}
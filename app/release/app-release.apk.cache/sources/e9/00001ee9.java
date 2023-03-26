package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.anythink.core.api.ATAdConst;
import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.e14;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbio {
    private final List zza = new LinkedList();
    private final Map zzb;
    private final Object zzc;

    public zzbio(boolean z, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        this.zzc = new Object();
        linkedHashMap.put("action", "make_wv");
        linkedHashMap.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, str2);
    }

    public static final zzbil zzf() {
        return new zzbil(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime(), null, null);
    }

    public final zzbin zza() {
        zzbin zzbinVar;
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzbB)).booleanValue();
        StringBuilder sb = new StringBuilder();
        HashMap hashMap = new HashMap();
        synchronized (this.zzc) {
            for (zzbil zzbilVar : this.zza) {
                long zza = zzbilVar.zza();
                String zzc = zzbilVar.zzc();
                zzbil zzb = zzbilVar.zzb();
                if (zzb != null && zza > 0) {
                    sb.append(zzc);
                    sb.append('.');
                    sb.append(zza - zzb.zza());
                    sb.append(e14.f0);
                    if (booleanValue) {
                        if (!hashMap.containsKey(Long.valueOf(zzb.zza()))) {
                            hashMap.put(Long.valueOf(zzb.zza()), new StringBuilder(zzc));
                        } else {
                            StringBuilder sb2 = (StringBuilder) hashMap.get(Long.valueOf(zzb.zza()));
                            sb2.append('+');
                            sb2.append(zzc);
                        }
                    }
                }
            }
            this.zza.clear();
            String str = null;
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            StringBuilder sb3 = new StringBuilder();
            if (booleanValue) {
                for (Map.Entry entry : hashMap.entrySet()) {
                    sb3.append((CharSequence) entry.getValue());
                    sb3.append('.');
                    long longValue = ((Long) entry.getKey()).longValue();
                    sb3.append((longValue - com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime()) + com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis());
                    sb3.append(e14.f0);
                }
                if (sb3.length() > 0) {
                    sb3.setLength(sb3.length() - 1);
                }
                str = sb3.toString();
            }
            zzbinVar = new zzbin(sb.toString(), str);
        }
        return zzbinVar;
    }

    @VisibleForTesting
    public final Map zzb() {
        Map map;
        synchronized (this.zzc) {
            com.google.android.gms.ads.internal.zzt.zzo().zzf();
            map = this.zzb;
        }
        return map;
    }

    public final void zzc(@z1 zzbio zzbioVar) {
        synchronized (this.zzc) {
        }
    }

    public final void zzd(String str, String str2) {
        zzbie zzf;
        if (TextUtils.isEmpty(str2) || (zzf = com.google.android.gms.ads.internal.zzt.zzo().zzf()) == null) {
            return;
        }
        synchronized (this.zzc) {
            zzbik zza = zzf.zza(str);
            Map map = this.zzb;
            map.put(str, zza.zza((String) map.get(str), str2));
        }
    }

    public final boolean zze(zzbil zzbilVar, long j, String... strArr) {
        synchronized (this.zzc) {
            for (int i = 0; i <= 0; i++) {
                this.zza.add(new zzbil(j, strArr[i], zzbilVar));
            }
        }
        return true;
    }
}
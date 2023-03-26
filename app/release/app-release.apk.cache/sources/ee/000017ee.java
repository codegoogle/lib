package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbzj;
import com.google.android.gms.internal.ads.zzccj;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzb {
    private final Context zza;
    private boolean zzb;
    @z1
    private final zzccj zzc;
    private final zzbzj zzd = new zzbzj(false, Collections.emptyList());

    public zzb(Context context, @z1 zzccj zzccjVar, @z1 zzbzj zzbzjVar) {
        this.zza = context;
        this.zzc = zzccjVar;
    }

    private final boolean zzd() {
        zzccj zzccjVar = this.zzc;
        return (zzccjVar != null && zzccjVar.zza().zzf) || this.zzd.zza;
    }

    public final void zza() {
        this.zzb = true;
    }

    public final void zzb(@z1 String str) {
        List<String> list;
        if (zzd()) {
            if (str == null) {
                str = "";
            }
            zzccj zzccjVar = this.zzc;
            if (zzccjVar != null) {
                zzccjVar.zzd(str, null, 3);
                return;
            }
            zzbzj zzbzjVar = this.zzd;
            if (!zzbzjVar.zza || (list = zzbzjVar.zzb) == null) {
                return;
            }
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    String replace = str2.replace("{NAVIGATION_URL}", Uri.encode(str));
                    zzt.zzp();
                    com.google.android.gms.ads.internal.util.zzs.zzG(this.zza, "", replace);
                }
            }
        }
    }

    public final boolean zzc() {
        return !zzd() || this.zzb;
    }
}
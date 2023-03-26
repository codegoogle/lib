package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzah {
    @z1
    private String zza;
    @z1
    private Uri zzb;
    private final zzaj zzc = new zzaj();
    private final zzap zzd = new zzap(null);
    private final List zze = Collections.emptyList();
    private final zzfrj zzf = zzfrj.zzo();
    private final zzas zzg = new zzas();

    public final zzah zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzah zzb(@z1 Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbb zzc() {
        Uri uri = this.zzb;
        zzay zzayVar = uri != null ? new zzay(uri, null, null, null, this.zze, null, this.zzf, null, null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbb(str, new zzan(this.zzc, null), zzayVar, new zzau(this.zzg), zzbh.zza, null);
    }
}
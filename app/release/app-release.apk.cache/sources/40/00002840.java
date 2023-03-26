package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzet {
    @z1
    private Uri zza;
    private final int zzb = 1;
    private Map zzc = Collections.emptyMap();
    private long zzd;
    private int zze;

    public final zzet zza(int i) {
        this.zze = 6;
        return this;
    }

    public final zzet zzb(Map map) {
        this.zzc = map;
        return this;
    }

    public final zzet zzc(long j) {
        this.zzd = j;
        return this;
    }

    public final zzet zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzev zze() {
        if (this.zza != null) {
            return new zzev(this.zza, this.zzc, this.zzd, this.zze);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
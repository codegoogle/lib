package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzajh {
    @z1
    public final Object zza;
    @z1
    public final zzaik zzb;
    @z1
    public final zzajk zzc;
    public boolean zzd;

    private zzajh(zzajk zzajkVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzajkVar;
    }

    private zzajh(@z1 Object obj, @z1 zzaik zzaikVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaikVar;
        this.zzc = null;
    }

    public static zzajh zza(zzajk zzajkVar) {
        return new zzajh(zzajkVar);
    }

    public static zzajh zzb(@z1 Object obj, @z1 zzaik zzaikVar) {
        return new zzajh(obj, zzaikVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }
}
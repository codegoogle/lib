package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.bq2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.wp2;
import com.p7700g.p99005.x1;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzad implements bq2<zzad> {
    public static final /* synthetic */ int zza = 0;
    private static final up2<Object> zzb = zzac.zza;
    private final Map<Class<?>, up2<?>> zzc = new HashMap();
    private final Map<Class<?>, wp2<?>> zzd = new HashMap();
    private final up2<Object> zze = zzb;

    @Override // com.p7700g.p99005.bq2
    @x1
    public final /* bridge */ /* synthetic */ zzad registerEncoder(@x1 Class cls, @x1 up2 up2Var) {
        this.zzc.put(cls, up2Var);
        this.zzd.remove(cls);
        return this;
    }

    public final zzae zza() {
        return new zzae(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @Override // com.p7700g.p99005.bq2
    @x1
    public final /* bridge */ /* synthetic */ zzad registerEncoder(@x1 Class cls, @x1 wp2 wp2Var) {
        this.zzd.put(cls, wp2Var);
        this.zzc.remove(cls);
        return this;
    }
}
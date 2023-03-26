package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.up2;
import com.p7700g.p99005.wp2;
import com.p7700g.p99005.x1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzae {
    private final Map<Class<?>, up2<?>> zza;
    private final Map<Class<?>, wp2<?>> zzb;
    private final up2<Object> zzc;

    public zzae(Map<Class<?>, up2<?>> map, Map<Class<?>, wp2<?>> map2, up2<Object> up2Var) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = up2Var;
    }

    public final void zza(@x1 Object obj, @x1 OutputStream outputStream) throws IOException {
        new zzab(outputStream, this.zza, this.zzb, this.zzc).zzf(obj);
    }
}
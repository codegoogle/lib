package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaqb extends zzaqn {
    public zzaqb(zzapc zzapcVar, String str, String str2, zzali zzaliVar, int i, int i2) {
        super(zzapcVar, "BRgqZ9Vg4IM5miPoGPKIX+tShrXoisnhV1cWTsEoWNSALbfoi2OgJtSBw3h9+Bqo", "SAUyhp29xMzgJ0ZztJOiGInn+oDyrZ4+r7quECKL/6s=", zzaliVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaqn
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzaoj zzaojVar = new zzaoj((String) this.zzf.invoke(null, this.zzb.zzb(), Boolean.valueOf(((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzci)).booleanValue())));
        synchronized (this.zze) {
            this.zze.zzi(zzaojVar.zza);
            this.zze.zzB(zzaojVar.zzb);
        }
    }
}
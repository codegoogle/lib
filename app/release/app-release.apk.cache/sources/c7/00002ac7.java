package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfqy {
    private static final zzfqy zza = new zzfqw();
    private static final zzfqy zzb = new zzfqx(-1);
    private static final zzfqy zzc = new zzfqx(1);

    public /* synthetic */ zzfqy(zzfqw zzfqwVar) {
    }

    public static zzfqy zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfqy zzb(int i, int i2);

    public abstract zzfqy zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfqy zzd(boolean z, boolean z2);

    public abstract zzfqy zze(boolean z, boolean z2);
}
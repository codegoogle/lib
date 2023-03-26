package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznp extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    public zznp(int i, zzad zzadVar, boolean z) {
        super(wo1.l("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzadVar;
    }
}
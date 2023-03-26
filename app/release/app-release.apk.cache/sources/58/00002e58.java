package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznm extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzad zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zznm(int i, int i2, int i3, int i4, zzad zzadVar, boolean z, @z1 Exception exc) {
        super(r6.toString(), exc);
        String str = true != z ? "" : " (recoverable)";
        StringBuilder J = wo1.J("AudioTrack init failed ", i, " Config(", i2, ", ");
        J.append(i3);
        J.append(", ");
        J.append(i4);
        J.append(")");
        J.append(str);
        this.zza = i;
        this.zzb = z;
        this.zzc = zzadVar;
    }
}
package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaak extends zzyh {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaak(final zzze zzzeVar, int i, long j, long j2) {
        super(r1, r2, r3, 0L, r7, j, j2, r13, Math.max(6, zzzeVar.zzc));
        long j3;
        zzye zzyeVar = new zzye() { // from class: com.google.android.gms.internal.ads.zzaah
            @Override // com.google.android.gms.internal.ads.zzye
            public final long zza(long j4) {
                return zzze.this.zzb(j4);
            }
        };
        zzaaj zzaajVar = new zzaaj(zzzeVar, i, null);
        long zza = zzzeVar.zza();
        long j4 = zzzeVar.zzj;
        int i2 = zzzeVar.zzd;
        if (i2 > 0) {
            j3 = ((i2 + zzzeVar.zzc) / 2) + 1;
        } else {
            int i3 = zzzeVar.zza;
            int i4 = zzzeVar.zzb;
            long j5 = PlaybackStateCompat.E;
            if (i3 == i4 && i3 > 0) {
                j5 = i3;
            }
            j3 = (((j5 * zzzeVar.zzg) * zzzeVar.zzh) / 8) + 64;
        }
    }
}
package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbah {
    private final Handler zza;
    private final zzbai zzb;

    public zzbah(Handler handler, zzbai zzbaiVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzbaiVar;
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzbab(this, str, j, j2));
    }

    public final void zzc(zzatn zzatnVar) {
        this.zza.post(new zzbag(this, zzatnVar));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzbad(this, i, j));
    }

    public final void zze(zzatn zzatnVar) {
        this.zza.post(new zzbaa(this, zzatnVar));
    }

    public final void zzf(zzart zzartVar) {
        this.zza.post(new zzbac(this, zzartVar));
    }

    public final void zzg(Surface surface) {
        this.zza.post(new zzbaf(this, surface));
    }

    public final void zzh(int i, int i2, int i3, float f) {
        this.zza.post(new zzbae(this, i, i2, i3, f));
    }
}
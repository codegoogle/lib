package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzasp {
    private final Handler zza;
    private final zzasq zzb;

    public zzasp(Handler handler, zzasq zzasqVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzasqVar;
    }

    public final void zzb(int i) {
        this.zza.post(new zzaso(this, i));
    }

    public final void zzc(int i, long j, long j2) {
        this.zza.post(new zzasm(this, i, j, j2));
    }

    public final void zzd(String str, long j, long j2) {
        this.zza.post(new zzask(this, str, j, j2));
    }

    public final void zze(zzatn zzatnVar) {
        this.zza.post(new zzasn(this, zzatnVar));
    }

    public final void zzf(zzatn zzatnVar) {
        this.zza.post(new zzasj(this, zzatnVar));
    }

    public final void zzg(zzart zzartVar) {
        this.zza.post(new zzasl(this, zzartVar));
    }
}
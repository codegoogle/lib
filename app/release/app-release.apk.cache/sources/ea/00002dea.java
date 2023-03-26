package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjk implements zzjg {
    public final zzrv zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzjk(zzsc zzscVar, boolean z) {
        this.zza = new zzrv(zzscVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final zzci zza() {
        return this.zza.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzjg
    public final Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
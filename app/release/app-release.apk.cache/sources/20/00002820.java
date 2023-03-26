package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.p7700g.p99005.z1;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzerv implements zzetg {
    private final zzfvm zza;
    private final Bundle zzb;

    public zzerv(zzfvm zzfvmVar, @z1 Bundle bundle) {
        this.zza = zzfvmVar;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final int zza() {
        return 30;
    }

    @Override // com.google.android.gms.internal.ads.zzetg
    public final zzfvl zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeru
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzerv.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzerw zzc() throws Exception {
        return new zzerw(this.zzb);
    }
}
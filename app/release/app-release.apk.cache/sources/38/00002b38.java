package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfup extends zzfuc {
    @CheckForNull
    private zzfuo zza;

    public zzfup(zzfre zzfreVar, boolean z, Executor executor, Callable callable) {
        super(zzfreVar, z, false);
        this.zza = new zzfun(this, callable, executor);
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzg(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzr() {
        zzfuo zzfuoVar = this.zza;
        if (zzfuoVar != null) {
            zzfuoVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzv() {
        zzfuo zzfuoVar = this.zza;
        if (zzfuoVar != null) {
            zzfuoVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final void zzz(int i) {
        super.zzz(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
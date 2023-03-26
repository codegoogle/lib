package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgft extends zzgkm implements zzgmb {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzgft() {
        super(r0);
        zzgfw zzgfwVar;
        zzgfwVar = zzgfw.zzb;
    }

    public final zzgft zza(zzgfv zzgfvVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgfw.zzj((zzgfw) this.zza, zzgfvVar);
        return this;
    }

    public final zzgft zzb(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        ((zzgfw) this.zza).zze = i;
        return this;
    }

    public final List zzc() {
        return Collections.unmodifiableList(((zzgfw) this.zza).zzh());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ zzgft(zzgfs zzgfsVar) {
        super(r1);
        zzgfw zzgfwVar;
        zzgfwVar = zzgfw.zzb;
    }
}
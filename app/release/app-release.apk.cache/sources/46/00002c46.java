package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgeo extends zzgkm implements zzgmb {
    private zzgeo() {
        super(zzgep.zzd());
    }

    public final zzgeo zza(int i) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgep.zzi((zzgep) this.zza, i);
        return this;
    }

    public final zzgeo zzb(zzges zzgesVar) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgep.zzh((zzgep) this.zza, zzgesVar);
        return this;
    }

    public /* synthetic */ zzgeo(zzgen zzgenVar) {
        super(zzgep.zzd());
    }
}
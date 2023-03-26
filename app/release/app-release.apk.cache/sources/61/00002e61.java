package com.google.android.gms.internal.ads;

import com.p7700g.p99005.t0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zznv implements zzmy {
    public zzmw zzb;
    public zzmw zzc;
    private zzmw zzd;
    private zzmw zze;
    private ByteBuffer zzf;
    private ByteBuffer zzg;
    private boolean zzh;

    public zznv() {
        ByteBuffer byteBuffer = zzmy.zza;
        this.zzf = byteBuffer;
        this.zzg = byteBuffer;
        zzmw zzmwVar = zzmw.zza;
        this.zzd = zzmwVar;
        this.zze = zzmwVar;
        this.zzb = zzmwVar;
        this.zzc = zzmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final zzmw zza(zzmw zzmwVar) throws zzmx {
        this.zzd = zzmwVar;
        this.zze = zzi(zzmwVar);
        return zzg() ? this.zze : zzmw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    @t0
    public ByteBuffer zzb() {
        ByteBuffer byteBuffer = this.zzg;
        this.zzg = zzmy.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzc() {
        this.zzg = zzmy.zza;
        this.zzh = false;
        this.zzb = this.zzd;
        this.zzc = this.zze;
        zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzd() {
        this.zzh = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zzf() {
        zzc();
        this.zzf = zzmy.zza;
        zzmw zzmwVar = zzmw.zza;
        this.zzd = zzmwVar;
        this.zze = zzmwVar;
        this.zzb = zzmwVar;
        this.zzc = zzmwVar;
        zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    public boolean zzg() {
        return this.zze != zzmw.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzmy
    @t0
    public boolean zzh() {
        return this.zzh && this.zzg == zzmy.zza;
    }

    public zzmw zzi(zzmw zzmwVar) throws zzmx {
        throw null;
    }

    public final ByteBuffer zzj(int i) {
        if (this.zzf.capacity() < i) {
            this.zzf = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.zzf.clear();
        }
        ByteBuffer byteBuffer = this.zzf;
        this.zzg = byteBuffer;
        return byteBuffer;
    }

    public void zzk() {
    }

    public void zzl() {
    }

    public void zzm() {
    }

    public final boolean zzn() {
        return this.zzg.hasRemaining();
    }
}
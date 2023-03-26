package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzrb implements zzsc {
    private final ArrayList zza = new ArrayList(1);
    private final HashSet zzb = new HashSet(1);
    private final zzsj zzc = new zzsj();
    private final zzpc zzd = new zzpc();
    @z1
    private Looper zze;
    @z1
    private zzci zzf;
    @z1
    private zzmu zzg;

    @Override // com.google.android.gms.internal.ads.zzsc
    public final /* synthetic */ zzci zzG() {
        return null;
    }

    public final zzmu zzb() {
        zzmu zzmuVar = this.zzg;
        zzcw.zzb(zzmuVar);
        return zzmuVar;
    }

    public final zzpc zzc(@z1 zzsa zzsaVar) {
        return this.zzd.zza(0, zzsaVar);
    }

    public final zzpc zzd(int i, @z1 zzsa zzsaVar) {
        return this.zzd.zza(i, zzsaVar);
    }

    public final zzsj zze(@z1 zzsa zzsaVar) {
        return this.zzc.zza(0, zzsaVar, 0L);
    }

    public final zzsj zzf(int i, @z1 zzsa zzsaVar, long j) {
        return this.zzc.zza(i, zzsaVar, 0L);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzg(Handler handler, zzpd zzpdVar) {
        Objects.requireNonNull(zzpdVar);
        this.zzd.zzb(handler, zzpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzh(Handler handler, zzsk zzskVar) {
        Objects.requireNonNull(zzskVar);
        this.zzc.zzb(handler, zzskVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzi(zzsb zzsbVar) {
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.remove(zzsbVar);
        if ((!isEmpty) && this.zzb.isEmpty()) {
            zzj();
        }
    }

    public void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzk(zzsb zzsbVar) {
        Objects.requireNonNull(this.zze);
        boolean isEmpty = this.zzb.isEmpty();
        this.zzb.add(zzsbVar);
        if (isEmpty) {
            zzl();
        }
    }

    public void zzl() {
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzm(zzsb zzsbVar, @z1 zzfs zzfsVar, zzmu zzmuVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.zze;
        boolean z = true;
        if (looper != null && looper != myLooper) {
            z = false;
        }
        zzcw.zzd(z);
        this.zzg = zzmuVar;
        zzci zzciVar = this.zzf;
        this.zza.add(zzsbVar);
        if (this.zze == null) {
            this.zze = myLooper;
            this.zzb.add(zzsbVar);
            zzn(zzfsVar);
        } else if (zzciVar != null) {
            zzk(zzsbVar);
            zzsbVar.zza(this, zzciVar);
        }
    }

    public abstract void zzn(@z1 zzfs zzfsVar);

    public final void zzo(zzci zzciVar) {
        this.zzf = zzciVar;
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((zzsb) arrayList.get(i)).zza(this, zzciVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzp(zzsb zzsbVar) {
        this.zza.remove(zzsbVar);
        if (this.zza.isEmpty()) {
            this.zze = null;
            this.zzf = null;
            this.zzg = null;
            this.zzb.clear();
            zzq();
            return;
        }
        zzi(zzsbVar);
    }

    public abstract void zzq();

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzr(zzpd zzpdVar) {
        this.zzd.zzc(zzpdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzs(zzsk zzskVar) {
        this.zzc.zzm(zzskVar);
    }

    public final boolean zzt() {
        return !this.zzb.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final /* synthetic */ boolean zzu() {
        return true;
    }
}
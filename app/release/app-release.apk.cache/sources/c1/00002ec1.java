package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzrj extends zzrb {
    private final HashMap zza = new HashMap();
    @z1
    private Handler zzb;
    @z1
    private zzfs zzc;

    @Override // com.google.android.gms.internal.ads.zzrb
    @t0
    public final void zzj() {
        for (zzri zzriVar : this.zza.values()) {
            zzriVar.zza.zzi(zzriVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    @t0
    public final void zzl() {
        for (zzri zzriVar : this.zza.values()) {
            zzriVar.zza.zzk(zzriVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    @t0
    public void zzn(@z1 zzfs zzfsVar) {
        this.zzc = zzfsVar;
        this.zzb = zzeg.zzC(null);
    }

    @Override // com.google.android.gms.internal.ads.zzrb
    @t0
    public void zzq() {
        for (zzri zzriVar : this.zza.values()) {
            zzriVar.zza.zzp(zzriVar.zzb);
            zzriVar.zza.zzs(zzriVar.zzc);
            zzriVar.zza.zzr(zzriVar.zzc);
        }
        this.zza.clear();
    }

    @z1
    public zzsa zzv(Object obj, zzsa zzsaVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    @t0
    public void zzw() throws IOException {
        for (zzri zzriVar : this.zza.values()) {
            zzriVar.zza.zzw();
        }
    }

    public abstract void zzx(Object obj, zzsc zzscVar, zzci zzciVar);

    public final void zzy(final Object obj, zzsc zzscVar) {
        zzcw.zzd(!this.zza.containsKey(obj));
        zzsb zzsbVar = new zzsb() { // from class: com.google.android.gms.internal.ads.zzrg
            @Override // com.google.android.gms.internal.ads.zzsb
            public final void zza(zzsc zzscVar2, zzci zzciVar) {
                zzrj.this.zzx(obj, zzscVar2, zzciVar);
            }
        };
        zzrh zzrhVar = new zzrh(this, obj);
        this.zza.put(obj, new zzri(zzscVar, zzsbVar, zzrhVar));
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        zzscVar.zzh(handler, zzrhVar);
        Handler handler2 = this.zzb;
        Objects.requireNonNull(handler2);
        zzscVar.zzg(handler2, zzrhVar);
        zzscVar.zzm(zzsbVar, this.zzc, zzb());
        if (zzt()) {
            return;
        }
        zzscVar.zzi(zzsbVar);
    }
}
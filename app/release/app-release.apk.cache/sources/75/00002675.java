package com.google.android.gms.internal.ads;

import android.os.Handler;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzec implements zzdg {
    @k1("messagePool")
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzec(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzk(zzeb zzebVar) {
        List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzebVar);
            }
        }
    }

    private static zzeb zzl() {
        zzeb zzebVar;
        List list = zza;
        synchronized (list) {
            zzebVar = list.isEmpty() ? new zzeb(null) : (zzeb) list.remove(list.size() - 1);
        }
        return zzebVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zza(int i) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzb(int i, @z1 Object obj) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(i, obj), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final zzdf zzc(int i, int i2, int i3) {
        zzeb zzl = zzl();
        zzl.zzb(this.zzb.obtainMessage(1, i2, i3), this);
        return zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zzd(@z1 Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final void zze(int i) {
        this.zzb.removeMessages(2);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzf(int i) {
        return this.zzb.hasMessages(0);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzg(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzi(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdg
    public final boolean zzj(zzdf zzdfVar) {
        return ((zzeb) zzdfVar).zzc(this.zzb);
    }
}
package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzanu implements Runnable {
    public final /* synthetic */ zzanv zza;

    public zzanu(zzanv zzanvVar) {
        this.zza = zzanvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfku zzfkuVar;
        Object obj2;
        obj = this.zza.zzm;
        synchronized (obj) {
            z = this.zza.zzn;
            if (z) {
                return;
            }
            this.zza.zzn = true;
            try {
                zzanv.zzj(this.zza);
            } catch (Exception e) {
                zzfkuVar = this.zza.zzh;
                zzfkuVar.zzc(2023, -1L, e);
            }
            obj2 = this.zza.zzm;
            synchronized (obj2) {
                this.zza.zzn = false;
            }
        }
    }
}
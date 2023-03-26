package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzftz extends zzfus implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    @CheckForNull
    public zzfvl zza;
    @CheckForNull
    public Object zzb;

    public zzftz(zzfvl zzfvlVar, Object obj) {
        Objects.requireNonNull(zzfvlVar);
        this.zza = zzfvlVar;
        Objects.requireNonNull(obj);
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfvl zzfvlVar = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (zzfvlVar == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (zzfvlVar.isCancelled()) {
            zzt(zzfvlVar);
            return;
        }
        try {
            try {
                Object zzf = zzf(obj, zzfvc.zzp(zzfvlVar));
                this.zzb = null;
                zzg(zzf);
            } catch (Throwable th) {
                try {
                    zze(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e) {
            zze(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            zze(e2);
        } catch (ExecutionException e3) {
            zze(e3.getCause());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    @CheckForNull
    public final String zza() {
        String str;
        zzfvl zzfvlVar = this.zza;
        Object obj = this.zzb;
        String zza = super.zza();
        if (zzfvlVar != null) {
            str = "inputFuture=[" + zzfvlVar + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    public abstract Object zzf(Object obj, Object obj2) throws Exception;

    public abstract void zzg(Object obj);
}
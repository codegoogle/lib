package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfts extends zzfus implements Runnable {
    @CheckForNull
    public zzfvl zza;
    @CheckForNull
    public Class zzb;
    @CheckForNull
    public Object zzc;

    public zzfts(zzfvl zzfvlVar, Class cls, Object obj) {
        Objects.requireNonNull(zzfvlVar);
        this.zza = zzfvlVar;
        this.zzb = cls;
        Objects.requireNonNull(obj);
        this.zzc = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Throwable e;
        Object obj;
        zzfvl zzfvlVar = this.zza;
        Class cls = this.zzb;
        Object obj2 = this.zzc;
        if (((obj2 == null) || ((zzfvlVar == null) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            e = zzfvlVar instanceof zzfwd ? ((zzfwd) zzfvlVar).zzp() : null;
        } catch (Error e2) {
            e = e2;
        } catch (RuntimeException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            Throwable cause = e4.getCause();
            if (cause == null) {
                StringBuilder G = wo1.G("Future type ");
                G.append(zzfvlVar.getClass());
                G.append(" threw ");
                G.append(e4.getClass());
                G.append(" without a cause");
                cause = new NullPointerException(G.toString());
            }
            e = cause;
        }
        if (e == null) {
            obj = zzfvc.zzp(zzfvlVar);
            if (e != null) {
                zzd(obj);
                return;
            } else if (cls.isInstance(e)) {
                try {
                    Object zzf = zzf(obj2, e);
                    this.zzb = null;
                    this.zzc = null;
                    zzg(zzf);
                    return;
                } catch (Throwable th) {
                    try {
                        zze(th);
                        return;
                    } finally {
                        this.zzb = null;
                        this.zzc = null;
                    }
                }
            } else {
                zzt(zzfvlVar);
                return;
            }
        }
        obj = null;
        if (e != null) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    @CheckForNull
    public final String zza() {
        String str;
        zzfvl zzfvlVar = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String zza = super.zza();
        if (zzfvlVar != null) {
            str = "inputFuture=[" + zzfvlVar + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (zza != null) {
                return str.concat(zza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb() {
        zzs(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zzf(Object obj, Throwable th) throws Exception;

    public abstract void zzg(Object obj);
}
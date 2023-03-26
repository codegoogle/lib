package com.google.android.gms.internal.ads;

import com.microsoft.appcenter.persistence.DatabasePersistence;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuc extends zzfuh {
    private static final Logger zza = Logger.getLogger(zzfuc.class.getName());
    @CheckForNull
    private zzfre zzb;
    private final boolean zzc;
    private final boolean zze;

    public zzfuc(zzfre zzfreVar, boolean z, boolean z2) {
        super(zzfreVar.size());
        this.zzb = zzfreVar;
        this.zzc = z;
        this.zze = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzg(i, zzfvc.zzp(future));
        } catch (Error e) {
            e = e;
            zzI(e);
        } catch (RuntimeException e2) {
            e = e2;
            zzI(e);
        } catch (ExecutionException e3) {
            zzI(e3.getCause());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH */
    public final void zzy(@CheckForNull zzfre zzfreVar) {
        int zzB = zzB();
        int i = 0;
        zzfou.zzi(zzB >= 0, "Less than 0 remaining futures");
        if (zzB == 0) {
            if (zzfreVar != null) {
                zzfti it = zzfreVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzv();
            zzz(2);
        }
    }

    private final void zzI(Throwable th) {
        Objects.requireNonNull(th);
        if (this.zzc && !zze(th) && zzK(zzE(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", DatabasePersistence.COLUMN_LOG, true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private static boolean zzK(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    @CheckForNull
    public final String zza() {
        zzfre zzfreVar = this.zzb;
        if (zzfreVar != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("futures=");
            sb.append(zzfreVar);
            return "futures=".concat(zzfreVar.toString());
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzftt
    public final void zzb() {
        zzfre zzfreVar = this.zzb;
        zzz(1);
        if ((zzfreVar != null) && isCancelled()) {
            boolean zzu = zzu();
            zzfti it = zzfreVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zzu);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuh
    public final void zzf(Set set) {
        Objects.requireNonNull(set);
        if (isCancelled()) {
            return;
        }
        Throwable zzp = zzp();
        zzp.getClass();
        zzK(set, zzp);
    }

    public abstract void zzg(int i, Object obj);

    public abstract void zzv();

    public final void zzw() {
        zzfre zzfreVar = this.zzb;
        zzfreVar.getClass();
        if (zzfreVar.isEmpty()) {
            zzv();
        } else if (this.zzc) {
            zzfti it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final zzfvl zzfvlVar = (zzfvl) it.next();
                zzfvlVar.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfua
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfuc.this.zzx(zzfvlVar, i);
                    }
                }, zzfuq.INSTANCE);
                i++;
            }
        } else {
            final zzfre zzfreVar2 = this.zze ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfub
                @Override // java.lang.Runnable
                public final void run() {
                    zzfuc.this.zzy(zzfreVar2);
                }
            };
            zzfti it2 = this.zzb.iterator();
            while (it2.hasNext()) {
                ((zzfvl) it2.next()).zzc(runnable, zzfuq.INSTANCE);
            }
        }
    }

    public final /* synthetic */ void zzx(zzfvl zzfvlVar, int i) {
        try {
            if (zzfvlVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, zzfvlVar);
            }
        } finally {
            zzy(null);
        }
    }

    public void zzz(int i) {
        this.zzb = null;
    }
}
package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfvk extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzfvj(null);
    private static final Runnable zzb = new zzfvj(null);

    private final void zzc(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzfvi zzfviVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            if (!(runnable instanceof zzfvi)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzfviVar = (zzfvi) runnable;
            }
            i++;
            if (i > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(zzfviVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread currentThread = Thread.currentThread();
        Object obj = null;
        if (compareAndSet(null, currentThread)) {
            boolean z = !zzg();
            if (z) {
                try {
                    obj = zza();
                } catch (Throwable th) {
                    if (!compareAndSet(currentThread, zza)) {
                        zzc(currentThread);
                    }
                    zzd(th);
                    return;
                }
            }
            if (!compareAndSet(currentThread, zza)) {
                zzc(currentThread);
            }
            if (z) {
                zze(obj);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            str = "running=[DONE]";
        } else if (runnable instanceof zzfvi) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            StringBuilder G = wo1.G("running=[RUNNING ON ");
            G.append(((Thread) runnable).getName());
            G.append("]");
            str = G.toString();
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder L = wo1.L(str, ", ");
        L.append(zzb());
        return L.toString();
    }

    public abstract Object zza() throws Exception;

    public abstract String zzb();

    public abstract void zzd(Throwable th);

    public abstract void zze(Object obj);

    public abstract boolean zzg();

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzfvi zzfviVar = new zzfvi(this, null);
            zzfviVar.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, zzfviVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
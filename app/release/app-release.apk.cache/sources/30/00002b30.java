package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfuh extends zzftt.zzi {
    private static final zzfue zzaW;
    private static final Logger zzaX = Logger.getLogger(zzfuh.class.getName());
    private volatile int remaining;
    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzfue zzfugVar;
        try {
            zzfugVar = new zzfuf(AtomicReferenceFieldUpdater.newUpdater(zzfuh.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzfuh.class, "remaining"));
            th = null;
        } catch (Error | RuntimeException e) {
            th = e;
            zzfugVar = new zzfug(null);
        }
        zzaW = zzfugVar;
        if (th != null) {
            zzaX.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzfuh(int i) {
        this.remaining = i;
    }

    public static /* synthetic */ int zzA(zzfuh zzfuhVar) {
        int i = zzfuhVar.remaining - 1;
        zzfuhVar.remaining = i;
        return i;
    }

    public final int zzB() {
        return zzaW.zza(this);
    }

    public final Set zzE() {
        Set<Throwable> set = this.seenExceptions;
        if (set == null) {
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            zzf(newSetFromMap);
            zzaW.zzb(this, null, newSetFromMap);
            Set<Throwable> set2 = this.seenExceptions;
            set2.getClass();
            return set2;
        }
        return set;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zzf(Set set);
}
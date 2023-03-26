package com.google.android.gms.internal.ads;

import com.p7700g.p99005.pg1;
import com.p7700g.p99005.wo1;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzftt<V> extends zzfwd implements zzfvl<V> {
    private static final Logger zzaU;
    private static final zza zzaV;
    private static final Object zzaY;
    public static final boolean zzd;
    @CheckForNull
    private volatile zzd listeners;
    @CheckForNull
    private volatile Object value;
    @CheckForNull
    private volatile zzk waiters;

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public abstract class zza {
        public /* synthetic */ zza(AnonymousClass1 anonymousClass1) {
        }

        public abstract zzd zza(zzftt zzfttVar, zzd zzdVar);

        public abstract zzk zzb(zzftt zzfttVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzftt zzfttVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzftt zzfttVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzftt zzfttVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzb {
        @CheckForNull
        public static final zzb zza;
        @CheckForNull
        public static final zzb zzb;
        public final boolean zzc;
        @CheckForNull
        public final Throwable zzd;

        static {
            if (zzftt.zzd) {
                zzb = null;
                zza = null;
                return;
            }
            zzb = new zzb(false, null);
            zza = new zzb(true, null);
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzc {
        public static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzftt.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        public final Throwable zzb;

        public zzc(Throwable th) {
            Objects.requireNonNull(th);
            this.zzb = th;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzd {
        public static final zzd zza = new zzd();
        @CheckForNull
        public zzd next;
        @CheckForNull
        public final Runnable zzb;
        @CheckForNull
        public final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zze extends zza {
        public final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        public final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        public final AtomicReferenceFieldUpdater<zzftt, zzk> zzc;
        public final AtomicReferenceFieldUpdater<zzftt, zzd> zzd;
        public final AtomicReferenceFieldUpdater<zzftt, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzd zza(zzftt zzfttVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzfttVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzk zzb(zzftt zzfttVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzfttVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zze(zzftt zzfttVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzftu.zza(this.zzd, zzfttVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzf(zzftt zzfttVar, @CheckForNull Object obj, Object obj2) {
            return zzftu.zza(this.zze, zzfttVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzg(zzftt zzfttVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzftu.zza(this.zzc, zzfttVar, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzf<V> implements Runnable {
        public final zzftt<V> zza;
        public final zzfvl<? extends V> zzb;

        public zzf(zzftt zzfttVar, zzfvl zzfvlVar) {
            this.zza = zzfttVar;
            this.zzb = zzfvlVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzftt) this.zza).value != this) {
                return;
            }
            if (zzftt.zzaV.zzf(this.zza, this, zzftt.zzf(this.zzb))) {
                zzftt.zzy(this.zza);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzg extends zza {
        private zzg() {
            super(null);
        }

        public /* synthetic */ zzg(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzd zza(zzftt zzfttVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzfttVar) {
                zzdVar2 = zzfttVar.listeners;
                if (zzdVar2 != zzdVar) {
                    zzfttVar.listeners = zzdVar;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzk zzb(zzftt zzfttVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzfttVar) {
                zzkVar2 = zzfttVar.waiters;
                if (zzkVar2 != zzkVar) {
                    zzfttVar.waiters = zzkVar;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zze(zzftt zzfttVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzfttVar) {
                if (zzfttVar.listeners == zzdVar) {
                    zzfttVar.listeners = zzdVar2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzf(zzftt zzfttVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzfttVar) {
                if (zzfttVar.value == obj) {
                    zzfttVar.value = obj2;
                    return true;
                }
                return false;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzg(zzftt zzfttVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzfttVar) {
                if (zzfttVar.waiters == zzkVar) {
                    zzfttVar.waiters = zzkVar2;
                    return true;
                }
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public interface zzh<V> extends zzfvl<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public abstract class zzi<V> extends zzftt<V> implements zzh<V> {
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzj extends zza {
        public static final Unsafe zza;
        public static final long zzb;
        public static final long zzc;
        public static final long zzd;
        public static final long zze;
        public static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzftt.zzj.1
                        public static final Unsafe zza() throws Exception {
                            Field[] declaredFields;
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }

                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            return zza();
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzftt.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzftt.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzftt.class.getDeclaredField("value"));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }

        private zzj() {
            super(null);
        }

        public /* synthetic */ zzj(AnonymousClass1 anonymousClass1) {
            super(null);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzd zza(zzftt zzfttVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzfttVar.listeners;
                if (zzdVar == zzdVar2) {
                    return zzdVar2;
                }
            } while (!zze(zzfttVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final zzk zzb(zzftt zzfttVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzfttVar.waiters;
                if (zzkVar == zzkVar2) {
                    return zzkVar2;
                }
            } while (!zzg(zzfttVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zze(zzftt zzfttVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzftv.zza(zza, zzfttVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzf(zzftt zzfttVar, @CheckForNull Object obj, Object obj2) {
            return zzftv.zza(zza, zzfttVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzftt.zza
        public final boolean zzg(zzftt zzfttVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzftv.zza(zza, zzfttVar, zzc, zzkVar, zzkVar2);
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
    /* loaded from: classes2.dex */
    public final class zzk {
        public static final zzk zza = new zzk(false);
        @CheckForNull
        public volatile zzk next;
        @CheckForNull
        public volatile Thread thread;

        public zzk() {
            zzftt.zzaV.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zzaU = Logger.getLogger(zzftt.class.getName());
        try {
            zzgVar = new zzj(null);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e) {
            try {
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzftt.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzftt.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzftt.class, Object.class, "value"));
                th = null;
            } catch (Error | RuntimeException e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(null);
            }
        }
        zzaV = zzgVar;
        if (th != null) {
            Logger logger = zzaU;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzaY = new Object();
    }

    private final void zzA(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                            break;
                        }
                    } else if (!zzaV.zzg(this, zzkVar2, zzkVar4)) {
                        break;
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object zzB(Object obj) throws ExecutionException {
        if (!(obj instanceof zzb)) {
            if (obj instanceof zzc) {
                throw new ExecutionException(((zzc) obj).zzb);
            }
            if (obj == zzaY) {
                return null;
            }
            return obj;
        }
        Throwable th = ((zzb) obj).zzd;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object zzf(zzfvl zzfvlVar) {
        Throwable zzp;
        if (zzfvlVar instanceof zzh) {
            Object obj = ((zzftt) zzfvlVar).value;
            if (obj instanceof zzb) {
                zzb zzbVar = (zzb) obj;
                if (zzbVar.zzc) {
                    Throwable th = zzbVar.zzd;
                    obj = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            obj.getClass();
            return obj;
        } else if ((zzfvlVar instanceof zzfwd) && (zzp = ((zzfwd) zzfvlVar).zzp()) != null) {
            return new zzc(zzp);
        } else {
            boolean isCancelled = zzfvlVar.isCancelled();
            if ((!zzd) & isCancelled) {
                zzb zzbVar2 = zzb.zzb;
                zzbVar2.getClass();
                return zzbVar2;
            }
            try {
                Object zzg2 = zzg(zzfvlVar);
                if (!isCancelled) {
                    return zzg2 == null ? zzaY : zzg2;
                }
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + zzfvlVar));
            } catch (Error e) {
                e = e;
                return new zzc(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                    sb.append(zzfvlVar);
                    return new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(zzfvlVar)), e2));
                }
                return new zzb(false, e2);
            } catch (RuntimeException e3) {
                e = e3;
                return new zzc(e);
            } catch (ExecutionException e4) {
                if (isCancelled) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("get() did not throw CancellationException, despite reporting isCancelled() == true: ");
                    sb2.append(zzfvlVar);
                    return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(zzfvlVar)), e4));
                }
                return new zzc(e4.getCause());
            }
        }
    }

    private static Object zzg(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzv(StringBuilder sb) {
        try {
            Object zzg2 = zzg(this);
            sb.append("SUCCESS, result=[");
            if (zzg2 == null) {
                sb.append(pg1.d);
            } else if (zzg2 == this) {
                sb.append("this future");
            } else {
                sb.append(zzg2.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(zzg2)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    private final void zzw(StringBuilder sb) {
        String concat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzx(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                concat = zzfpi.zza(zza());
            } catch (RuntimeException | StackOverflowError e) {
                StringBuilder G = wo1.G("Exception thrown from implementation: ");
                Class<?> cls = e.getClass();
                G.append(cls);
                concat = "Exception thrown from implementation: ".concat(String.valueOf(cls));
            }
            if (concat != null) {
                wo1.g0(sb, ", info=[", concat, "]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzv(sb);
        }
    }

    private final void zzx(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException | StackOverflowError e) {
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzy(zzftt zzfttVar) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzb2 = zzaV.zzb(zzfttVar, zzk.zza); zzb2 != null; zzb2 = zzb2.next) {
                Thread thread = zzb2.thread;
                if (thread != null) {
                    zzb2.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            zzfttVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zza2 = zzaV.zza(zzfttVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zza2 != null) {
                zzd zzdVar4 = zza2.next;
                zza2.next = zzdVar3;
                zzdVar3 = zza2;
                zza2 = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                runnable.getClass();
                if (runnable instanceof zzf) {
                    zzf zzfVar = (zzf) runnable;
                    zzfttVar = zzfVar.zza;
                    if (zzfttVar.value == zzfVar) {
                        if (zzaV.zzf(zzfttVar, zzfVar, zzf(zzfVar.zzb))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    executor.getClass();
                    zzz(runnable, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzz(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = zzaU;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if ((obj == null) || (obj instanceof zzf)) {
            if (zzd) {
                zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
            } else {
                if (z) {
                    zzbVar = zzb.zza;
                } else {
                    zzbVar = zzb.zzb;
                }
                zzbVar.getClass();
            }
            boolean z2 = false;
            zzftt<V> zzfttVar = this;
            while (true) {
                if (zzaV.zzf(zzfttVar, obj, zzbVar)) {
                    if (z) {
                        zzfttVar.zzr();
                    }
                    zzy(zzfttVar);
                    if (!(obj instanceof zzf)) {
                        break;
                    }
                    zzfvl<? extends V> zzfvlVar = ((zzf) obj).zzb;
                    if (zzfvlVar instanceof zzh) {
                        zzfttVar = (zzftt) zzfvlVar;
                        obj = zzfttVar.value;
                        if (!(obj == null) && !(obj instanceof zzf)) {
                            break;
                        }
                        z2 = true;
                    } else {
                        zzfvlVar.cancel(z);
                        break;
                    }
                } else {
                    obj = zzfttVar.value;
                    if (!(obj instanceof zzf)) {
                        return z2;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) && (!(obj2 instanceof zzf))) {
                return zzB(obj2);
            }
            zzk zzkVar = this.waiters;
            if (zzkVar != zzk.zza) {
                zzk zzkVar2 = new zzk();
                do {
                    zza zzaVar = zzaV;
                    zzaVar.zzc(zzkVar2, zzkVar);
                    if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                zzA(zzkVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof zzf))));
                        return zzB(obj);
                    }
                    zzkVar = this.waiters;
                } while (zzkVar != zzk.zza);
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            Object obj32 = this.value;
            obj32.getClass();
            return zzB(obj32);
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (!(obj instanceof zzf)) & (obj != null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzv(sb);
        } else {
            zzw(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @CheckForNull
    public String zza() {
        if (this instanceof ScheduledFuture) {
            StringBuilder G = wo1.G("remaining delay=[");
            G.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            G.append(" ms]");
            return G.toString();
        }
        return null;
    }

    public void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzfvl
    public void zzc(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfou.zzc(runnable, "Runnable was null.");
        zzfou.zzc(executor, "Executor was null.");
        if (isDone() || (zzdVar = this.listeners) == zzd.zza) {
            zzz(runnable, executor);
        }
        zzd zzdVar2 = new zzd(runnable, executor);
        do {
            zzdVar2.next = zzdVar;
            if (zzaV.zze(this, zzdVar, zzdVar2)) {
                return;
            }
            zzdVar = this.listeners;
        } while (zzdVar != zzd.zza);
        zzz(runnable, executor);
    }

    public boolean zzd(Object obj) {
        if (obj == null) {
            obj = zzaY;
        }
        if (zzaV.zzf(this, null, obj)) {
            zzy(this);
            return true;
        }
        return false;
    }

    public boolean zze(Throwable th) {
        Objects.requireNonNull(th);
        if (zzaV.zzf(this, null, new zzc(th))) {
            zzy(this);
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfwd
    @CheckForNull
    public final Throwable zzp() {
        if (this instanceof zzh) {
            Object obj = this.value;
            if (obj instanceof zzc) {
                return ((zzc) obj).zzb;
            }
            return null;
        }
        return null;
    }

    public void zzr() {
    }

    public final void zzs(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzu());
        }
    }

    public final boolean zzt(zzfvl zzfvlVar) {
        zzc zzcVar;
        Objects.requireNonNull(zzfvlVar);
        Object obj = this.value;
        if (obj == null) {
            if (zzfvlVar.isDone()) {
                if (zzaV.zzf(this, null, zzf(zzfvlVar))) {
                    zzy(this);
                    return true;
                }
                return false;
            }
            zzf zzfVar = new zzf(this, zzfvlVar);
            if (zzaV.zzf(this, null, zzfVar)) {
                try {
                    zzfvlVar.zzc(zzfVar, zzfuq.INSTANCE);
                } catch (Error | RuntimeException e) {
                    try {
                        zzcVar = new zzc(e);
                    } catch (Error | RuntimeException unused) {
                        zzcVar = zzc.zza;
                    }
                    zzaV.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            zzfvlVar.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzu() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        Locale locale;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzB(obj);
            }
            long j2 = 0;
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzaV;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzB(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    zzA(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzA(zzkVar2);
                            j2 = 0;
                        } else {
                            zzkVar = this.waiters;
                            if (zzkVar == zzk.zza) {
                                break;
                            }
                        }
                    }
                }
                Object obj3 = this.value;
                obj3.getClass();
                return zzB(obj3);
            }
            while (nanos > j2) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzB(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                    j2 = 0;
                } else {
                    throw new InterruptedException();
                }
            }
            String zzfttVar = toString();
            String lowerCase = timeUnit.toString().toLowerCase(Locale.ROOT);
            String str = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                int i = (convert > 0L ? 1 : (convert == 0L ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(wo1.u(str, " for ", zzfttVar));
        }
        throw new InterruptedException();
    }
}
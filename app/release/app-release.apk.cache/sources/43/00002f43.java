package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.p7700g.p99005.un3;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzwe extends Handler implements Runnable {
    public final /* synthetic */ zzwj zza;
    private final zzwf zzb;
    private final long zzc;
    @z1
    private zzwb zzd;
    @z1
    private IOException zze;
    private int zzf;
    @z1
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzwe(zzwj zzwjVar, Looper looper, zzwf zzwfVar, zzwb zzwbVar, int i, long j) {
        super(looper);
        this.zza = zzwjVar;
        this.zzb = zzwfVar;
        this.zzd = zzwbVar;
        this.zzc = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzwe zzweVar;
        this.zze = null;
        zzwj zzwjVar = this.zza;
        executorService = zzwjVar.zze;
        zzweVar = zzwjVar.zzf;
        Objects.requireNonNull(zzweVar);
        executorService.execute(zzweVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        int i2;
        int i3;
        long j;
        if (this.zzi) {
            return;
        }
        int i4 = message.what;
        if (i4 == 0) {
            zzd();
        } else if (i4 != 3) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = elapsedRealtime - this.zzc;
            zzwb zzwbVar = this.zzd;
            Objects.requireNonNull(zzwbVar);
            if (this.zzh) {
                zzwbVar.zzG(this.zzb, elapsedRealtime, j2, false);
                return;
            }
            int i5 = message.what;
            if (i5 == 1) {
                try {
                    zzwbVar.zzH(this.zzb, elapsedRealtime, j2);
                } catch (RuntimeException e) {
                    zzdn.zza("LoadTask", "Unexpected exception handling load completed", e);
                    this.zza.zzg = new zzwi(e);
                }
            } else if (i5 != 2) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zze = iOException;
                int i6 = this.zzf + 1;
                this.zzf = i6;
                zzwd zzt = zzwbVar.zzt(this.zzb, elapsedRealtime, j2, iOException, i6);
                i = zzt.zza;
                if (i == 3) {
                    this.zza.zzg = this.zze;
                    return;
                }
                i2 = zzt.zza;
                if (i2 != 2) {
                    i3 = zzt.zza;
                    if (i3 == 1) {
                        this.zzf = 1;
                    }
                    j = zzt.zzb;
                    zzc(j != -9223372036854775807L ? zzt.zzb : Math.min((this.zzf - 1) * 1000, (int) un3.f.v));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i = zzeg.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                try {
                    this.zzb.zzi();
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(2, e).sendToTarget();
        } catch (Exception e2) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "Unexpected exception loading stream", e2);
            obtainMessage(2, new zzwi(e2)).sendToTarget();
        } catch (OutOfMemoryError e3) {
            if (this.zzi) {
                return;
            }
            zzdn.zza("LoadTask", "OutOfMemory error loading stream", e3);
            obtainMessage(2, new zzwi(e3)).sendToTarget();
        } catch (Error e4) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwb zzwbVar = this.zzd;
            Objects.requireNonNull(zzwbVar);
            zzwbVar.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzwe zzweVar;
        zzweVar = this.zza.zzf;
        zzcw.zzf(zzweVar == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
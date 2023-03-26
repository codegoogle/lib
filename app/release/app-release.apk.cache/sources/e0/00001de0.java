package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.p7700g.p99005.un3;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes2.dex */
public final class zzayu extends Handler implements Runnable {
    public final int zza;
    public final /* synthetic */ zzayx zzb;
    private final zzayv zzc;
    private final zzayt zzd;
    private final long zze;
    private IOException zzf;
    private int zzg;
    private volatile Thread zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzayu(zzayx zzayxVar, Looper looper, zzayv zzayvVar, zzayt zzaytVar, int i, long j) {
        super(looper);
        this.zzb = zzayxVar;
        this.zzc = zzayvVar;
        this.zzd = zzaytVar;
        this.zza = i;
        this.zze = j;
    }

    private final void zzd() {
        ExecutorService executorService;
        zzayu zzayuVar;
        this.zzf = null;
        zzayx zzayxVar = this.zzb;
        executorService = zzayxVar.zza;
        zzayuVar = zzayxVar.zzb;
        executorService.execute(zzayuVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            zzd();
        } else if (i != 4) {
            this.zzb.zzb = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.zze;
            if (this.zzc.zze()) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 1) {
                this.zzd.zzt(this.zzc, elapsedRealtime, j, false);
            } else if (i2 == 2) {
                this.zzd.zzu(this.zzc, elapsedRealtime, j);
            } else if (i2 != 3) {
            } else {
                IOException iOException = (IOException) message.obj;
                this.zzf = iOException;
                int zzd = this.zzd.zzd(this.zzc, elapsedRealtime, j, iOException);
                if (zzd == 3) {
                    this.zzb.zzc = this.zzf;
                } else if (zzd != 2) {
                    int i3 = zzd != 1 ? 1 + this.zzg : 1;
                    this.zzg = i3;
                    zzc(Math.min((i3 - 1) * 1000, (int) un3.f.v));
                }
            }
        } else {
            throw ((Error) message.obj);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zzh = Thread.currentThread();
            if (!this.zzc.zze()) {
                String simpleName = this.zzc.getClass().getSimpleName();
                zzazm.zza("load:" + simpleName);
                try {
                    this.zzc.zzc();
                    zzazm.zzb();
                } catch (Throwable th) {
                    zzazm.zzb();
                    throw th;
                }
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e).sendToTarget();
        } catch (Error e2) {
            if (!this.zzi) {
                obtainMessage(4, e2).sendToTarget();
            }
            throw e2;
        } catch (InterruptedException unused) {
            zzayz.zze(this.zzc.zze());
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e3) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayw(e3)).sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, new zzayw(e4)).sendToTarget();
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zzf = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
                return;
            }
        } else {
            this.zzc.zzb();
            if (this.zzh != null) {
                this.zzh.interrupt();
            }
            if (!z) {
                return;
            }
        }
        this.zzb.zzb = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.zzd.zzt(this.zzc, elapsedRealtime, elapsedRealtime - this.zze, true);
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zzf;
        if (iOException != null && this.zzg > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzayu zzayuVar;
        zzayuVar = this.zzb.zzb;
        zzayz.zze(zzayuVar == null);
        this.zzb.zzb = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }
}
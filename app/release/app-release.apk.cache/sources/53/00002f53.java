package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwu extends HandlerThread implements Handler.Callback {
    private zzde zza;
    private Handler zzb;
    @z1
    private Error zzc;
    @z1
    private RuntimeException zzd;
    @z1
    private zzww zze;

    public zzwu() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    zzde zzdeVar = this.zza;
                    Objects.requireNonNull(zzdeVar);
                    zzdeVar.zzc();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i2 = message.arg1;
                zzde zzdeVar2 = this.zza;
                Objects.requireNonNull(zzdeVar2);
                zzdeVar2.zzb(i2);
                this.zze = new zzww(this, this.zza.zza(), i2 != 0, null);
                synchronized (this) {
                    notify();
                }
            } catch (Error e) {
                zzdn.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                this.zzc = e;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e2) {
                zzdn.zza("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                this.zzd = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }

    public final zzww zza(int i) {
        boolean z;
        start();
        this.zzb = new Handler(getLooper(), this);
        this.zza = new zzde(this.zzb, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException == null) {
            Error error = this.zzc;
            if (error == null) {
                zzww zzwwVar = this.zze;
                Objects.requireNonNull(zzwwVar);
                return zzwwVar;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        handler.sendEmptyMessage(2);
    }
}
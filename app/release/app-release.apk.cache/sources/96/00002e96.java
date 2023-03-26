package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(23)
/* loaded from: classes2.dex */
public final class zzpu {
    @k1("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque zza = new ArrayDeque();
    private static final Object zzb = new Object();
    private final MediaCodec zzc;
    private final HandlerThread zzd;
    private Handler zze;
    private final AtomicReference zzf;
    private final zzcz zzg;
    private boolean zzh;

    public zzpu(MediaCodec mediaCodec, HandlerThread handlerThread) {
        zzcz zzczVar = new zzcz(zzcx.zza);
        this.zzc = mediaCodec;
        this.zzd = handlerThread;
        this.zzg = zzczVar;
        this.zzf = new AtomicReference();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* bridge */ /* synthetic */ void zza(zzpu zzpuVar, Message message) {
        zzpt zzptVar;
        int i = message.what;
        zzpt zzptVar2 = null;
        if (i == 0) {
            zzptVar = (zzpt) message.obj;
            try {
                zzpuVar.zzc.queueInputBuffer(zzptVar.zza, 0, zzptVar.zzc, zzptVar.zze, zzptVar.zzf);
            } catch (RuntimeException e) {
                zzpr.zza(zzpuVar.zzf, null, e);
            }
        } else if (i != 1) {
            if (i != 2) {
                zzpr.zza(zzpuVar.zzf, null, new IllegalStateException(String.valueOf(message.what)));
            } else {
                zzpuVar.zzg.zze();
            }
            if (zzptVar2 == null) {
                ArrayDeque arrayDeque = zza;
                synchronized (arrayDeque) {
                    arrayDeque.add(zzptVar2);
                }
                return;
            }
            return;
        } else {
            zzptVar = (zzpt) message.obj;
            int i2 = zzptVar.zza;
            MediaCodec.CryptoInfo cryptoInfo = zzptVar.zzd;
            long j = zzptVar.zze;
            int i3 = zzptVar.zzf;
            try {
                synchronized (zzb) {
                    zzpuVar.zzc.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                }
            } catch (RuntimeException e2) {
                zzpr.zza(zzpuVar.zzf, null, e2);
            }
        }
        zzptVar2 = zzptVar;
        if (zzptVar2 == null) {
        }
    }

    private static zzpt zzg() {
        ArrayDeque arrayDeque = zza;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new zzpt();
            }
            return (zzpt) arrayDeque.removeFirst();
        }
    }

    private final void zzh() {
        RuntimeException runtimeException = (RuntimeException) this.zzf.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @z1
    private static byte[] zzi(@z1 byte[] bArr, @z1 byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null) {
            int length = bArr2.length;
            int length2 = bArr.length;
            if (length >= length2) {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
                return bArr2;
            }
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    @z1
    private static int[] zzj(@z1 int[] iArr, @z1 int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null) {
            int length = iArr2.length;
            int length2 = iArr.length;
            if (length >= length2) {
                System.arraycopy(iArr, 0, iArr2, 0, length2);
                return iArr2;
            }
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public final void zzb() {
        if (this.zzh) {
            try {
                Handler handler = this.zze;
                Objects.requireNonNull(handler);
                handler.removeCallbacksAndMessages(null);
                this.zzg.zzc();
                Handler handler2 = this.zze;
                Objects.requireNonNull(handler2);
                handler2.obtainMessage(2).sendToTarget();
                this.zzg.zza();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void zzc(int i, int i2, int i3, long j, int i4) {
        zzh();
        zzpt zzg = zzg();
        zzg.zza(i, 0, i3, j, i4);
        Handler handler = this.zze;
        int i5 = zzeg.zza;
        handler.obtainMessage(0, zzg).sendToTarget();
    }

    public final void zzd(int i, int i2, zzfy zzfyVar, long j, int i3) {
        zzh();
        zzpt zzg = zzg();
        zzg.zza(i, 0, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = zzg.zzd;
        cryptoInfo.numSubSamples = zzfyVar.zzf;
        cryptoInfo.numBytesOfClearData = zzj(zzfyVar.zzd, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = zzj(zzfyVar.zze, cryptoInfo.numBytesOfEncryptedData);
        byte[] zzi = zzi(zzfyVar.zzb, cryptoInfo.key);
        Objects.requireNonNull(zzi);
        cryptoInfo.key = zzi;
        byte[] zzi2 = zzi(zzfyVar.zza, cryptoInfo.iv);
        Objects.requireNonNull(zzi2);
        cryptoInfo.iv = zzi2;
        cryptoInfo.mode = zzfyVar.zzc;
        if (zzeg.zza >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(zzfyVar.zzg, zzfyVar.zzh));
        }
        this.zze.obtainMessage(1, zzg).sendToTarget();
    }

    public final void zze() {
        if (this.zzh) {
            zzb();
            this.zzd.quit();
        }
        this.zzh = false;
    }

    public final void zzf() {
        if (this.zzh) {
            return;
        }
        this.zzd.start();
        this.zze = new zzps(this, this.zzd.getLooper());
        this.zzh = true;
    }
}
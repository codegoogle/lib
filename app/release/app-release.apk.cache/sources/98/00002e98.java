package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.k1;
import com.p7700g.p99005.z1;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(23)
/* loaded from: classes2.dex */
public final class zzpw extends MediaCodec.Callback {
    private final HandlerThread zzb;
    private Handler zzc;
    @z1
    @k1("lock")
    private MediaFormat zzh;
    @z1
    @k1("lock")
    private MediaFormat zzi;
    @z1
    @k1("lock")
    private MediaCodec.CodecException zzj;
    @k1("lock")
    private long zzk;
    @k1("lock")
    private boolean zzl;
    @z1
    @k1("lock")
    private IllegalStateException zzm;
    private final Object zza = new Object();
    @k1("lock")
    private final zzqa zzd = new zzqa();
    @k1("lock")
    private final zzqa zze = new zzqa();
    @k1("lock")
    private final ArrayDeque zzf = new ArrayDeque();
    @k1("lock")
    private final ArrayDeque zzg = new ArrayDeque();

    public zzpw(HandlerThread handlerThread) {
        this.zzb = handlerThread;
    }

    public static /* synthetic */ void zzd(zzpw zzpwVar) {
        synchronized (zzpwVar.zza) {
            if (zzpwVar.zzl) {
                return;
            }
            long j = zzpwVar.zzk - 1;
            zzpwVar.zzk = j;
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i > 0) {
                return;
            }
            if (i < 0) {
                IllegalStateException illegalStateException = new IllegalStateException();
                synchronized (zzpwVar.zza) {
                    zzpwVar.zzm = illegalStateException;
                }
                return;
            }
            zzpwVar.zzi();
        }
    }

    @k1("lock")
    private final void zzh(MediaFormat mediaFormat) {
        this.zze.zzb(-2);
        this.zzg.add(mediaFormat);
    }

    @k1("lock")
    private final void zzi() {
        if (!this.zzg.isEmpty()) {
            this.zzi = (MediaFormat) this.zzg.getLast();
        }
        this.zzd.zzc();
        this.zze.zzc();
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = null;
    }

    @k1("lock")
    private final void zzj() {
        IllegalStateException illegalStateException = this.zzm;
        if (illegalStateException == null) {
            return;
        }
        this.zzm = null;
        throw illegalStateException;
    }

    @k1("lock")
    private final void zzk() {
        MediaCodec.CodecException codecException = this.zzj;
        if (codecException == null) {
            return;
        }
        this.zzj = null;
        throw codecException;
    }

    @k1("lock")
    private final boolean zzl() {
        return this.zzk > 0 || this.zzl;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.zza) {
            this.zzj = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.zza) {
            this.zzd.zzb(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            MediaFormat mediaFormat = this.zzi;
            if (mediaFormat != null) {
                zzh(mediaFormat);
                this.zzi = null;
            }
            this.zze.zzb(i);
            this.zzf.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.zza) {
            zzh(mediaFormat);
            this.zzi = null;
        }
    }

    public final int zza() {
        synchronized (this.zza) {
            int i = -1;
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (!this.zzd.zzd()) {
                i = this.zzd.zza();
            }
            return i;
        }
    }

    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.zza) {
            if (zzl()) {
                return -1;
            }
            zzj();
            zzk();
            if (this.zze.zzd()) {
                return -1;
            }
            int zza = this.zze.zza();
            if (zza >= 0) {
                zzcw.zzb(this.zzh);
                MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) this.zzf.remove();
                bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
            } else if (zza == -2) {
                this.zzh = (MediaFormat) this.zzg.remove();
                zza = -2;
            }
            return zza;
        }
    }

    public final MediaFormat zzc() {
        MediaFormat mediaFormat;
        synchronized (this.zza) {
            mediaFormat = this.zzh;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public final void zze() {
        synchronized (this.zza) {
            this.zzk++;
            Handler handler = this.zzc;
            int i = zzeg.zza;
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpv
                @Override // java.lang.Runnable
                public final void run() {
                    zzpw.zzd(zzpw.this);
                }
            });
        }
    }

    public final void zzf(MediaCodec mediaCodec) {
        zzcw.zzf(this.zzc == null);
        this.zzb.start();
        Handler handler = new Handler(this.zzb.getLooper());
        mediaCodec.setCallback(this, handler);
        this.zzc = handler;
    }

    public final void zzg() {
        synchronized (this.zza) {
            this.zzl = true;
            this.zzb.quit();
            zzi();
        }
    }
}
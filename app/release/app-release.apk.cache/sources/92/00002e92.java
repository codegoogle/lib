package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(23)
/* loaded from: classes2.dex */
public final class zzpq implements zzqd {
    private final MediaCodec zza;
    private final zzpw zzb;
    private final zzpu zzc;
    private boolean zzd;
    private int zze = 0;

    public /* synthetic */ zzpq(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, zzpp zzppVar) {
        this.zza = mediaCodec;
        this.zzb = new zzpw(handlerThread);
        this.zzc = new zzpu(mediaCodec, handlerThread2);
    }

    public static /* synthetic */ String zzd(int i) {
        return zzs(i, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static /* synthetic */ String zze(int i) {
        return zzs(i, "ExoPlayer:MediaCodecQueueingThread:");
    }

    public static /* synthetic */ void zzh(zzpq zzpqVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zzpqVar.zzb.zzf(zzpqVar.zza);
        int i2 = zzeg.zza;
        Trace.beginSection("configureCodec");
        zzpqVar.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
        Trace.endSection();
        zzpqVar.zzc.zzf();
        Trace.beginSection("startCodec");
        zzpqVar.zza.start();
        Trace.endSection();
        zzpqVar.zze = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzs(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zza() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final int zzb(MediaCodec.BufferInfo bufferInfo) {
        return this.zzb.zzb(bufferInfo);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final MediaFormat zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    @z1
    public final ByteBuffer zzf(int i) {
        return this.zza.getInputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    @z1
    public final ByteBuffer zzg(int i) {
        return this.zza.getOutputBuffer(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzi() {
        this.zzc.zzb();
        this.zza.flush();
        this.zzb.zze();
        this.zza.start();
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzj(int i, int i2, int i3, long j, int i4) {
        this.zzc.zzc(i, 0, i3, j, i4);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzk(int i, int i2, zzfy zzfyVar, long j, int i3) {
        this.zzc.zzd(i, 0, zzfyVar, j, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzl() {
        try {
            if (this.zze == 1) {
                this.zzc.zze();
                this.zzb.zzg();
            }
            this.zze = 2;
            if (this.zzd) {
                return;
            }
            this.zza.release();
            this.zzd = true;
        } catch (Throwable th) {
            if (!this.zzd) {
                this.zza.release();
                this.zzd = true;
            }
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzm(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzn(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }

    @Override // com.google.android.gms.internal.ads.zzqd
    public final boolean zzr() {
        return false;
    }
}
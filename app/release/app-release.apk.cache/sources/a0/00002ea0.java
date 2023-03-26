package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public interface zzqd {
    int zza();

    int zzb(MediaCodec.BufferInfo bufferInfo);

    MediaFormat zzc();

    @z1
    ByteBuffer zzf(int i);

    @z1
    ByteBuffer zzg(int i);

    void zzi();

    void zzj(int i, int i2, int i3, long j, int i4);

    void zzk(int i, int i2, zzfy zzfyVar, long j, int i3);

    void zzl();

    @e2(21)
    void zzm(int i, long j);

    void zzn(int i, boolean z);

    @e2(23)
    void zzo(Surface surface);

    @e2(19)
    void zzp(Bundle bundle);

    void zzq(int i);

    boolean zzr();
}
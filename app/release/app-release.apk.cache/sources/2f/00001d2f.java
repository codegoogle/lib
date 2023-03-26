package com.google.android.gms.internal.ads;

import com.p7700g.p99005.yg1;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzasf {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 3, 6};
    private static final int[] zzc = {48000, 44100, 32000};
    private static final int[] zzd = {2, 1, 2, 3, 3, 4, 4, 5};

    public static int zza(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? zzb[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }

    public static zzart zzb(zzazh zzazhVar, String str, String str2, zzats zzatsVar) {
        int i = zzc[(zzazhVar.zzg() & yg1.K) >> 6];
        int zzg = zzazhVar.zzg();
        int i2 = zzd[(zzg & 56) >> 3];
        if ((zzg & 4) != 0) {
            i2++;
        }
        return zzart.zzg(str, "audio/ac3", null, -1, -1, i2, i, null, zzatsVar, 0, str2);
    }

    public static zzart zzc(zzazh zzazhVar, String str, String str2, zzats zzatsVar) {
        zzazhVar.zzw(2);
        int i = zzc[(zzazhVar.zzg() & yg1.K) >> 6];
        int zzg = zzazhVar.zzg();
        int i2 = zzd[(zzg & 14) >> 1];
        if ((zzg & 1) != 0) {
            i2++;
        }
        return zzart.zzg(str, "audio/eac3", null, -1, -1, i2, i, null, zzatsVar, 0, str2);
    }
}
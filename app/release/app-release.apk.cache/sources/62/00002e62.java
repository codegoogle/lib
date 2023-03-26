package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznw extends zznv {
    @z1
    private int[] zzd;
    @z1
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzmy
    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        Objects.requireNonNull(iArr);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
        while (position < limit) {
            for (int i : iArr) {
                zzj.putShort(byteBuffer.getShort(i + i + position));
            }
            position += this.zzb.zze;
        }
        byteBuffer.position(limit);
        zzj.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmw.zza;
        }
        if (zzmwVar.zzd == 2) {
            boolean z = zzmwVar.zzc != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new zzmw(zzmwVar.zzb, length, 2) : zzmw.zza;
                }
                int i2 = iArr[i];
                if (i2 >= zzmwVar.zzc) {
                    throw new zzmx(zzmwVar);
                }
                z |= i2 != i;
                i++;
            }
        } else {
            throw new zzmx(zzmwVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzk() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(@z1 int[] iArr) {
        this.zzd = iArr;
    }
}
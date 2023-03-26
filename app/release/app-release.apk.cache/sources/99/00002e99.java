package com.google.android.gms.internal.ads;

import com.p7700g.p99005.p1;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpx extends zzgb {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzpx() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzfv
    public final void zzb() {
        super.zzb();
        this.zzg = 0;
    }

    public final int zzl() {
        return this.zzg;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final void zzn(@p1(from = 1) int i) {
        this.zzh = i;
    }

    public final boolean zzo(zzgb zzgbVar) {
        ByteBuffer byteBuffer;
        zzcw.zzd(!zzgbVar.zzd(1073741824));
        zzcw.zzd(!zzgbVar.zzd(268435456));
        zzcw.zzd(!zzgbVar.zzd(4));
        if (zzp()) {
            if (this.zzg >= this.zzh || zzgbVar.zzd(Integer.MIN_VALUE) != zzd(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzgbVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzgbVar.zzd;
            if (zzgbVar.zzd(1)) {
                zzc(1);
            }
        }
        if (zzgbVar.zzd(Integer.MIN_VALUE)) {
            zzc(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzgbVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzgbVar.zzd;
        return true;
    }

    public final boolean zzp() {
        return this.zzg > 0;
    }
}
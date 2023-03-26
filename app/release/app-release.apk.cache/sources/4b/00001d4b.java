package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzatg implements zzasi {
    private int zzb = -1;
    private int zzc = -1;
    private int zzd = 0;
    private ByteBuffer zze;
    private ByteBuffer zzf;
    private boolean zzg;

    public zzatg() {
        ByteBuffer byteBuffer = zzasi.zza;
        this.zze = byteBuffer;
        this.zzf = byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final int zzb() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final ByteBuffer zzc() {
        ByteBuffer byteBuffer = this.zzf;
        this.zzf = zzasi.zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzd() {
        this.zzf = zzasi.zza;
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zze() {
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[LOOP:2: B:25:0x0080->B:26:0x0082, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:16:0x0040, B:26:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzasi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i3 = limit - position;
        int i4 = this.zzd;
        if (i4 == Integer.MIN_VALUE) {
            i3 /= 3;
        } else if (i4 != 3) {
            if (i4 == 1073741824) {
                i = i3 / 2;
                if (this.zze.capacity() >= i) {
                    this.zze = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
                } else {
                    this.zze.clear();
                }
                i2 = this.zzd;
                if (i2 != Integer.MIN_VALUE) {
                    while (position < limit) {
                        this.zze.put(byteBuffer.get(position + 1));
                        this.zze.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i2 == 3) {
                    while (position < limit) {
                        this.zze.put((byte) 0);
                        this.zze.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i2 != 1073741824) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        this.zze.put(byteBuffer.get(position + 2));
                        this.zze.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                this.zze.flip();
                this.zzf = this.zze;
            }
            throw new IllegalStateException();
        }
        i = i3 + i3;
        if (this.zze.capacity() >= i) {
        }
        i2 = this.zzd;
        if (i2 != Integer.MIN_VALUE) {
        }
        byteBuffer.position(byteBuffer.limit());
        this.zze.flip();
        this.zzf = this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final void zzg() {
        zzd();
        this.zze = zzasi.zza;
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzh(int i, int i2, int i3) throws zzash {
        if (i3 == 3 || i3 == 2 || i3 == Integer.MIN_VALUE || i3 == 1073741824) {
            if (this.zzb == i && this.zzc == i2 && this.zzd == i3) {
                return false;
            }
            this.zzb = i;
            this.zzc = i2;
            this.zzd = i3;
            if (i3 == 2) {
                this.zze = zzasi.zza;
                return true;
            }
            return true;
        }
        throw new zzash(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzi() {
        int i = this.zzd;
        return (i == 0 || i == 2) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final boolean zzj() {
        return this.zzg && this.zzf == zzasi.zza;
    }
}
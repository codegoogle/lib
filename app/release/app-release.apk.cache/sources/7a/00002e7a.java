package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzot extends zznv {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00af A[LOOP:4: B:30:0x00af->B:31:0x00b1, LOOP_START, PHI: r0 
      PHI: (r0v1 int) = (r0v0 int), (r0v2 int) binds: [B:15:0x0036, B:31:0x00b1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.zzmy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zze(ByteBuffer byteBuffer) {
        int i;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i2 = limit - position;
        int i3 = this.zzb.zzd;
        if (i3 != 3) {
            if (i3 != 4) {
                if (i3 != 268435456) {
                    if (i3 == 536870912) {
                        i2 /= 3;
                    } else if (i3 != 805306368) {
                        throw new IllegalStateException();
                    }
                }
                ByteBuffer zzj = zzj(i2);
                i = this.zzb.zzd;
                if (i == 3) {
                    while (position < limit) {
                        zzj.put((byte) 0);
                        zzj.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                } else if (i == 4) {
                    while (position < limit) {
                        short zza = (short) (zzeg.zza(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                        zzj.put((byte) (zza & 255));
                        zzj.put((byte) ((zza >> 8) & 255));
                        position += 4;
                    }
                } else if (i == 268435456) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position));
                        position += 2;
                    }
                } else if (i == 536870912) {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 1));
                        zzj.put(byteBuffer.get(position + 2));
                        position += 3;
                    }
                } else if (i != 805306368) {
                    throw new IllegalStateException();
                } else {
                    while (position < limit) {
                        zzj.put(byteBuffer.get(position + 2));
                        zzj.put(byteBuffer.get(position + 3));
                        position += 4;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                zzj.flip();
            }
            i2 /= 2;
            ByteBuffer zzj2 = zzj(i2);
            i = this.zzb.zzd;
            if (i == 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            zzj2.flip();
        }
        i2 += i2;
        ByteBuffer zzj22 = zzj(i2);
        i = this.zzb.zzd;
        if (i == 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        zzj22.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznv
    public final zzmw zzi(zzmw zzmwVar) throws zzmx {
        int i = zzmwVar.zzd;
        if (i != 3) {
            if (i == 2) {
                return zzmw.zza;
            }
            if (i != 268435456 && i != 536870912 && i != 805306368 && i != 4) {
                throw new zzmx(zzmwVar);
            }
        }
        return new zzmw(zzmwVar.zzb, zzmwVar.zzc, 2);
    }
}
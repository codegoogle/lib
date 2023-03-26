package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgqd extends zzgqb implements zzako {
    private int zza;

    public zzgqd(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzakn.zzc(byteBuffer.get());
        zzakn.zzd(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
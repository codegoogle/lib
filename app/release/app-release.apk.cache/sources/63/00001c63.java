package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzakr extends zzgqd {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgqn zzm;
    private long zzn;

    public zzakr() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgqn.zza;
    }

    public final String toString() {
        StringBuilder G = wo1.G("MovieHeaderBox[creationTime=");
        G.append(this.zza);
        G.append(";modificationTime=");
        G.append(this.zzh);
        G.append(";timescale=");
        G.append(this.zzi);
        G.append(";duration=");
        G.append(this.zzj);
        G.append(";rate=");
        G.append(this.zzk);
        G.append(";volume=");
        G.append(this.zzl);
        G.append(";matrix=");
        G.append(this.zzm);
        G.append(";nextTrackId=");
        G.append(this.zzn);
        G.append("]");
        return G.toString();
    }

    public final long zzd() {
        return this.zzj;
    }

    public final long zze() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgqi.zza(zzakn.zzf(byteBuffer));
            this.zzh = zzgqi.zza(zzakn.zzf(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zzf(byteBuffer);
        } else {
            this.zza = zzgqi.zza(zzakn.zze(byteBuffer));
            this.zzh = zzgqi.zza(zzakn.zze(byteBuffer));
            this.zzi = zzakn.zze(byteBuffer);
            this.zzj = zzakn.zze(byteBuffer);
        }
        this.zzk = zzakn.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) ((bArr[0] << 8) & 65280)))) / 256.0f;
        zzakn.zzd(byteBuffer);
        zzakn.zze(byteBuffer);
        zzakn.zze(byteBuffer);
        double zzb = zzakn.zzb(byteBuffer);
        double zzb2 = zzakn.zzb(byteBuffer);
        double zza = zzakn.zza(byteBuffer);
        this.zzm = new zzgqn(zzb, zzb2, zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer), zza, zzakn.zza(byteBuffer), zzakn.zza(byteBuffer), zzakn.zzb(byteBuffer), zzakn.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzakn.zze(byteBuffer);
    }
}
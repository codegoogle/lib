package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzgje extends zzgjd {
    public final byte[] zza;

    public zzgje(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgji) && zzd() == ((zzgji) obj).zzd()) {
            if (zzd() == 0) {
                return true;
            }
            if (obj instanceof zzgje) {
                zzgje zzgjeVar = (zzgje) obj;
                int zzr = zzr();
                int zzr2 = zzgjeVar.zzr();
                if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
                    return zzg(zzgjeVar, 0, zzd());
                }
                return false;
            }
            return obj.equals(this);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public byte zzb(int i) {
        return this.zza[i];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zza, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgjd
    public final boolean zzg(zzgji zzgjiVar, int i, int i2) {
        if (i2 <= zzgjiVar.zzd()) {
            int i3 = i + i2;
            if (i3 <= zzgjiVar.zzd()) {
                if (zzgjiVar instanceof zzgje) {
                    zzgje zzgjeVar = (zzgje) zzgjiVar;
                    byte[] bArr = this.zza;
                    byte[] bArr2 = zzgjeVar.zza;
                    int zzc = zzc() + i2;
                    int zzc2 = zzc();
                    int zzc3 = zzgjeVar.zzc() + i;
                    while (zzc2 < zzc) {
                        if (bArr[zzc2] != bArr2[zzc3]) {
                            return false;
                        }
                        zzc2++;
                        zzc3++;
                    }
                    return true;
                }
                return zzgjiVar.zzk(i, i3).equals(zzk(0, i2));
            }
            int zzd = zzgjiVar.zzd();
            StringBuilder J = wo1.J("Ran off end of other: ", i, ", ", i2, ", ");
            J.append(zzd);
            throw new IllegalArgumentException(J.toString());
        }
        int zzd2 = zzd();
        throw new IllegalArgumentException("Length too large: " + i2 + zzd2);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzi(int i, int i2, int i3) {
        return zzgla.zzd(i, this.zza, zzc() + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzj(int i, int i2, int i3) {
        int zzc = zzc() + i2;
        return zzgnz.zzf(i, this.zza, zzc, i3 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgji zzk(int i, int i2) {
        int zzq = zzgji.zzq(i, i2, zzd());
        return zzq == 0 ? zzgji.zzb : new zzgjb(this.zza, zzc() + i, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjq zzl() {
        return zzgjq.zzI(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzo(zzgix zzgixVar) throws IOException {
        zzgixVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzp() {
        int zzc = zzc();
        return zzgnz.zzj(this.zza, zzc, zzd() + zzc);
    }
}
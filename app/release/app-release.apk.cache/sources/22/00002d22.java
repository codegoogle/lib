package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgms extends zzgji {
    public static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    private final zzgji zzd;
    private final zzgji zze;
    private final int zzf;
    private final int zzg;

    private zzgms(zzgji zzgjiVar, zzgji zzgjiVar2) {
        this.zzd = zzgjiVar;
        this.zze = zzgjiVar2;
        int zzd = zzgjiVar.zzd();
        this.zzf = zzd;
        this.zzc = zzgjiVar2.zzd() + zzd;
        this.zzg = Math.max(zzgjiVar.zzf(), zzgjiVar2.zzf()) + 1;
    }

    public static zzgji zzG(zzgji zzgjiVar, zzgji zzgjiVar2) {
        if (zzgjiVar2.zzd() == 0) {
            return zzgjiVar;
        }
        if (zzgjiVar.zzd() == 0) {
            return zzgjiVar2;
        }
        int zzd = zzgjiVar2.zzd() + zzgjiVar.zzd();
        if (zzd < 128) {
            return zzH(zzgjiVar, zzgjiVar2);
        }
        if (zzgjiVar instanceof zzgms) {
            zzgms zzgmsVar = (zzgms) zzgjiVar;
            if (zzgjiVar2.zzd() + zzgmsVar.zze.zzd() < 128) {
                return new zzgms(zzgmsVar.zzd, zzH(zzgmsVar.zze, zzgjiVar2));
            } else if (zzgmsVar.zzd.zzf() > zzgmsVar.zze.zzf() && zzgmsVar.zzg > zzgjiVar2.zzf()) {
                return new zzgms(zzgmsVar.zzd, new zzgms(zzgmsVar.zze, zzgjiVar2));
            }
        }
        if (zzd >= zzc(Math.max(zzgjiVar.zzf(), zzgjiVar2.zzf()) + 1)) {
            return new zzgms(zzgjiVar, zzgjiVar2);
        }
        return zzgmo.zza(new zzgmo(null), zzgjiVar, zzgjiVar2);
    }

    private static zzgji zzH(zzgji zzgjiVar, zzgji zzgjiVar2) {
        int zzd = zzgjiVar.zzd();
        int zzd2 = zzgjiVar2.zzd();
        byte[] bArr = new byte[zzd + zzd2];
        zzgjiVar.zzC(bArr, 0, 0, zzd);
        zzgjiVar2.zzC(bArr, 0, zzd, zzd2);
        return new zzgje(bArr);
    }

    public static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean equals(Object obj) {
        boolean zzg;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgji)) {
            return false;
        }
        zzgji zzgjiVar = (zzgji) obj;
        if (this.zzc != zzgjiVar.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgjiVar.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgmq zzgmqVar = new zzgmq(this, null);
        zzgjd next = zzgmqVar.next();
        zzgmq zzgmqVar2 = new zzgmq(zzgjiVar, null);
        zzgjd next2 = zzgmqVar2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd = next.zzd() - i;
            int zzd2 = next2.zzd() - i2;
            int min = Math.min(zzd, zzd2);
            if (i == 0) {
                zzg = next.zzg(next2, i2, min);
            } else {
                zzg = next2.zzg(next, i, min);
            }
            if (!zzg) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == zzd) {
                next = zzgmqVar.next();
                i = 0;
            } else {
                i += min;
            }
            if (min == zzd2) {
                next2 = zzgmqVar2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgji, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgmm(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final byte zza(int i) {
        zzgji.zzB(i, this.zzc);
        return zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final byte zzb(int i) {
        int i2 = this.zzf;
        return i < i2 ? this.zzd.zzb(i) : this.zze.zzb(i - i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.zze(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzi(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzi(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final int zzj(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzj(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i5), 0, i3 - i5);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgji zzk(int i, int i2) {
        int zzq = zzgji.zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgji.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgji zzgjiVar = this.zzd;
        return new zzgms(zzgjiVar.zzk(i, zzgjiVar.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjq zzl() {
        ArrayList arrayList = new ArrayList();
        zzgmq zzgmqVar = new zzgmq(this, null);
        while (zzgmqVar.hasNext()) {
            arrayList.add(zzgmqVar.next().zzn());
        }
        int i = zzgjq.zzd;
        Iterator it = arrayList.iterator();
        boolean z = false;
        int i2 = 0;
        while (it.hasNext()) {
            ByteBuffer byteBuffer = (ByteBuffer) it.next();
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgjm(arrayList, i2, true, null);
        }
        return zzgjq.zzH(new zzgld(arrayList), 4096);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final ByteBuffer zzn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final void zzo(zzgix zzgixVar) throws IOException {
        this.zzd.zzo(zzgixVar);
        this.zze.zzo(zzgixVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgji zzgjiVar = this.zze;
        return zzgjiVar.zzj(zzj, 0, zzgjiVar.zzd()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgji
    public final zzgjc zzs() {
        return new zzgmm(this);
    }
}
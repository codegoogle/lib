package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import com.p7700g.p99005.ya2;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgji implements Iterable, Serializable {
    private static final Comparator zza;
    public static final zzgji zzb = new zzgje(zzgla.zzd);
    private static final zzgjh zzd;
    private int zzc = 0;

    static {
        int i = zzgit.zza;
        zzd = new zzgjh(null);
        zza = new zzgiz();
    }

    public static void zzB(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(wo1.l("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException(wo1.o("Index > length: ", i, ", ", i2));
        }
    }

    private static zzgji zzc(Iterator it, int i) {
        if (i > 0) {
            if (i == 1) {
                return (zzgji) it.next();
            }
            int i2 = i >>> 1;
            zzgji zzc = zzc(it, i2);
            zzgji zzc2 = zzc(it, i - i2);
            if (Integer.MAX_VALUE - zzc.zzd() >= zzc2.zzd()) {
                return zzgms.zzG(zzc, zzc2);
            }
            throw new IllegalArgumentException(wo1.o("ByteString would be too long: ", zzc.zzd(), ya2.z, zzc2.zzd()));
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i)));
    }

    public static int zzq(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(wo1.o("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(wo1.o("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException(wo1.n("Beginning index: ", i, " < 0"));
        }
        return i4;
    }

    public static zzgjf zzt() {
        return new zzgjf(128);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzgji zzu(Iterable iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return zzb;
        }
        return zzc(iterable.iterator(), size);
    }

    public static zzgji zzv(byte[] bArr) {
        return zzw(bArr, 0, bArr.length);
    }

    public static zzgji zzw(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new zzgje(bArr2);
    }

    public static zzgji zzx(String str) {
        return new zzgje(str.getBytes(zzgla.zzb));
    }

    public static zzgji zzy(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i = 256;
        while (true) {
            byte[] bArr = new byte[i];
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            zzgji zzw = i2 == 0 ? null : zzw(bArr, 0, i2);
            if (zzw == null) {
                return zzu(arrayList);
            }
            arrayList.add(zzw);
            i = Math.min(i + i, 8192);
        }
    }

    public static zzgji zzz(byte[] bArr) {
        return new zzgje(bArr);
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd2 = zzd();
            i = zzi(zzd2, 0, zzd2);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? zzgni.zza(this) : zzgni.zza(zzk(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String zzA(Charset charset) {
        return zzd() == 0 ? "" : zzm(charset);
    }

    @Deprecated
    public final void zzC(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    public final boolean zzD() {
        return zzd() == 0;
    }

    public final byte[] zzE() {
        int zzd2 = zzd();
        if (zzd2 == 0) {
            return zzgla.zzd;
        }
        byte[] bArr = new byte[zzd2];
        zze(bArr, 0, 0, zzd2);
        return bArr;
    }

    public abstract byte zza(int i);

    public abstract byte zzb(int i);

    public abstract int zzd();

    public abstract void zze(byte[] bArr, int i, int i2, int i3);

    public abstract int zzf();

    public abstract boolean zzh();

    public abstract int zzi(int i, int i2, int i3);

    public abstract int zzj(int i, int i2, int i3);

    public abstract zzgji zzk(int i, int i2);

    public abstract zzgjq zzl();

    public abstract String zzm(Charset charset);

    public abstract ByteBuffer zzn();

    public abstract void zzo(zzgix zzgixVar) throws IOException;

    public abstract boolean zzp();

    public final int zzr() {
        return this.zzc;
    }

    @Override // java.lang.Iterable
    /* renamed from: zzs */
    public zzgjc iterator() {
        return new zzgiy(this);
    }
}
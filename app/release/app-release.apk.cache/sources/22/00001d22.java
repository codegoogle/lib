package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzart implements Parcelable {
    public static final Parcelable.Creator<zzart> CREATOR = new zzars();
    private int zzA;
    public final String zza;
    public final int zzb;
    public final String zzc;
    public final zzawe zzd;
    public final String zze;
    public final String zzf;
    public final int zzg;
    public final List zzh;
    public final zzats zzi;
    public final int zzj;
    public final int zzk;
    public final float zzl;
    public final int zzm;
    public final float zzn;
    public final int zzo;
    public final byte[] zzp;
    public final zzazr zzq;
    public final int zzr;
    public final int zzs;
    public final int zzt;
    public final int zzu;
    public final int zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzart(Parcel parcel) {
        this.zza = parcel.readString();
        this.zze = parcel.readString();
        this.zzf = parcel.readString();
        this.zzc = parcel.readString();
        this.zzb = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzl = parcel.readFloat();
        this.zzm = parcel.readInt();
        this.zzn = parcel.readFloat();
        this.zzp = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.zzo = parcel.readInt();
        this.zzq = (zzazr) parcel.readParcelable(zzazr.class.getClassLoader());
        this.zzr = parcel.readInt();
        this.zzs = parcel.readInt();
        this.zzt = parcel.readInt();
        this.zzu = parcel.readInt();
        this.zzv = parcel.readInt();
        this.zzx = parcel.readInt();
        this.zzy = parcel.readString();
        this.zzz = parcel.readInt();
        this.zzw = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzh = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.zzh.add(parcel.createByteArray());
        }
        this.zzi = (zzats) parcel.readParcelable(zzats.class.getClassLoader());
        this.zzd = (zzawe) parcel.readParcelable(zzawe.class.getClassLoader());
    }

    public static zzart zzg(String str, String str2, String str3, int i, int i2, int i3, int i4, List list, zzats zzatsVar, int i5, String str4) {
        return zzh(str, str2, null, -1, -1, i3, i4, -1, -1, -1, null, zzatsVar, 0, str4, null);
    }

    public static zzart zzh(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, zzats zzatsVar, int i8, String str4, zzawe zzaweVar) {
        return new zzart(str, null, str2, null, -1, i2, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, -1, -1, i8, str4, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    public static zzart zzi(String str, String str2, String str3, int i, List list, String str4, zzats zzatsVar) {
        return new zzart(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    public static zzart zzj(String str, String str2, String str3, int i, zzats zzatsVar) {
        return new zzart(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, zzatsVar, null);
    }

    public static zzart zzk(String str, String str2, String str3, int i, int i2, String str4, int i3, zzats zzatsVar, long j, List list) {
        return new zzart(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i2, str4, -1, j, list, zzatsVar, null);
    }

    public static zzart zzl(String str, String str2, String str3, int i, int i2, int i3, int i4, float f, List list, int i5, float f2, byte[] bArr, int i6, zzazr zzazrVar, zzats zzatsVar) {
        return new zzart(str, null, str2, null, -1, i2, i3, i4, -1.0f, i5, f2, bArr, i6, zzazrVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, zzatsVar, null);
    }

    @TargetApi(16)
    private static void zzm(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzart.class == obj.getClass()) {
            zzart zzartVar = (zzart) obj;
            if (this.zzb == zzartVar.zzb && this.zzg == zzartVar.zzg && this.zzj == zzartVar.zzj && this.zzk == zzartVar.zzk && this.zzl == zzartVar.zzl && this.zzm == zzartVar.zzm && this.zzn == zzartVar.zzn && this.zzo == zzartVar.zzo && this.zzr == zzartVar.zzr && this.zzs == zzartVar.zzs && this.zzt == zzartVar.zzt && this.zzu == zzartVar.zzu && this.zzv == zzartVar.zzv && this.zzw == zzartVar.zzw && this.zzx == zzartVar.zzx && zzazo.zzo(this.zza, zzartVar.zza) && zzazo.zzo(this.zzy, zzartVar.zzy) && this.zzz == zzartVar.zzz && zzazo.zzo(this.zze, zzartVar.zze) && zzazo.zzo(this.zzf, zzartVar.zzf) && zzazo.zzo(this.zzc, zzartVar.zzc) && zzazo.zzo(this.zzi, zzartVar.zzi) && zzazo.zzo(this.zzd, zzartVar.zzd) && zzazo.zzo(this.zzq, zzartVar.zzq) && Arrays.equals(this.zzp, zzartVar.zzp) && this.zzh.size() == zzartVar.zzh.size()) {
                for (int i = 0; i < this.zzh.size(); i++) {
                    if (!Arrays.equals((byte[]) this.zzh.get(i), (byte[]) zzartVar.zzh.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzA;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.zze;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.zzf;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.zzc;
            int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.zzb) * 31) + this.zzj) * 31) + this.zzk) * 31) + this.zzr) * 31) + this.zzs) * 31;
            String str5 = this.zzy;
            int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.zzz) * 31;
            zzats zzatsVar = this.zzi;
            int hashCode6 = (hashCode5 + (zzatsVar == null ? 0 : zzatsVar.hashCode())) * 31;
            zzawe zzaweVar = this.zzd;
            int hashCode7 = hashCode6 + (zzaweVar != null ? zzaweVar.hashCode() : 0);
            this.zzA = hashCode7;
            return hashCode7;
        }
        return i;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zze;
        String str3 = this.zzf;
        int i = this.zzb;
        String str4 = this.zzy;
        int i2 = this.zzj;
        int i3 = this.zzk;
        float f = this.zzl;
        int i4 = this.zzr;
        int i5 = this.zzs;
        StringBuilder N = wo1.N("Format(", str, ", ", str2, ", ");
        N.append(str3);
        N.append(", ");
        N.append(i);
        N.append(", ");
        N.append(str4);
        N.append(", [");
        N.append(i2);
        N.append(", ");
        N.append(i3);
        N.append(", ");
        N.append(f);
        N.append("], [");
        N.append(i4);
        N.append(", ");
        N.append(i5);
        N.append("])");
        return N.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzg);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeFloat(this.zzl);
        parcel.writeInt(this.zzm);
        parcel.writeFloat(this.zzn);
        parcel.writeInt(this.zzp != null ? 1 : 0);
        byte[] bArr = this.zzp;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.zzo);
        parcel.writeParcelable(this.zzq, i);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs);
        parcel.writeInt(this.zzt);
        parcel.writeInt(this.zzu);
        parcel.writeInt(this.zzv);
        parcel.writeInt(this.zzx);
        parcel.writeString(this.zzy);
        parcel.writeInt(this.zzz);
        parcel.writeLong(this.zzw);
        int size = this.zzh.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray((byte[]) this.zzh.get(i2));
        }
        parcel.writeParcelable(this.zzi, 0);
        parcel.writeParcelable(this.zzd, 0);
    }

    public final int zza() {
        int i;
        int i2 = this.zzj;
        if (i2 == -1 || (i = this.zzk) == -1) {
            return -1;
        }
        return i2 * i;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat zzb() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.zzf);
        String str = this.zzy;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        zzm(mediaFormat, "max-input-size", this.zzg);
        zzm(mediaFormat, "width", this.zzj);
        zzm(mediaFormat, "height", this.zzk);
        float f = this.zzl;
        if (f != -1.0f) {
            mediaFormat.setFloat("frame-rate", f);
        }
        zzm(mediaFormat, "rotation-degrees", this.zzm);
        zzm(mediaFormat, "channel-count", this.zzr);
        zzm(mediaFormat, "sample-rate", this.zzs);
        zzm(mediaFormat, "encoder-delay", this.zzu);
        zzm(mediaFormat, "encoder-padding", this.zzv);
        for (int i = 0; i < this.zzh.size(); i++) {
            mediaFormat.setByteBuffer(wo1.l("csd-", i), ByteBuffer.wrap((byte[]) this.zzh.get(i)));
        }
        zzazr zzazrVar = this.zzq;
        if (zzazrVar != null) {
            zzm(mediaFormat, "color-transfer", zzazrVar.zzc);
            zzm(mediaFormat, "color-standard", zzazrVar.zza);
            zzm(mediaFormat, "color-range", zzazrVar.zzb);
            byte[] bArr = zzazrVar.zzd;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    public final zzart zzc(zzats zzatsVar) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, zzatsVar, this.zzd);
    }

    public final zzart zzd(int i, int i2) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, i, i2, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zze(int i) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, i, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, this.zzd);
    }

    public final zzart zzf(zzawe zzaweVar) {
        return new zzart(this.zza, this.zze, this.zzf, this.zzc, this.zzb, this.zzg, this.zzj, this.zzk, this.zzl, this.zzm, this.zzn, this.zzp, this.zzo, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzx, this.zzy, this.zzz, this.zzw, this.zzh, this.zzi, zzaweVar);
    }

    public zzart(String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, float f, int i5, float f2, byte[] bArr, int i6, zzazr zzazrVar, int i7, int i8, int i9, int i10, int i11, int i12, String str5, int i13, long j, List list, zzats zzatsVar, zzawe zzaweVar) {
        this.zza = str;
        this.zze = str2;
        this.zzf = str3;
        this.zzc = str4;
        this.zzb = i;
        this.zzg = i2;
        this.zzj = i3;
        this.zzk = i4;
        this.zzl = f;
        this.zzm = i5;
        this.zzn = f2;
        this.zzp = bArr;
        this.zzo = i6;
        this.zzq = zzazrVar;
        this.zzr = i7;
        this.zzs = i8;
        this.zzt = i9;
        this.zzu = i10;
        this.zzv = i11;
        this.zzx = i12;
        this.zzy = str5;
        this.zzz = i13;
        this.zzw = j;
        this.zzh = list == null ? Collections.emptyList() : list;
        this.zzi = zzatsVar;
        this.zzd = zzaweVar;
    }
}
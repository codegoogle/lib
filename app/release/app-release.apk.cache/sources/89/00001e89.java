package com.google.android.gms.internal.ads;

import com.p7700g.p99005.p1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbf {
    @z1
    private CharSequence zza;
    @z1
    private CharSequence zzb;
    @z1
    private CharSequence zzc;
    @z1
    private CharSequence zzd;
    @z1
    private CharSequence zze;
    @z1
    private byte[] zzf;
    @z1
    private Integer zzg;
    @z1
    private Integer zzh;
    @z1
    private Integer zzi;
    @z1
    private Integer zzj;
    @z1
    private Integer zzk;
    @z1
    private Integer zzl;
    @z1
    private Integer zzm;
    @z1
    private Integer zzn;
    @z1
    private Integer zzo;
    @z1
    private CharSequence zzp;
    @z1
    private CharSequence zzq;
    @z1
    private CharSequence zzr;
    @z1
    private CharSequence zzs;
    @z1
    private CharSequence zzt;

    public zzbf() {
    }

    public /* synthetic */ zzbf(zzbh zzbhVar, zzbe zzbeVar) {
        this.zza = zzbhVar.zzc;
        this.zzb = zzbhVar.zzd;
        this.zzc = zzbhVar.zze;
        this.zzd = zzbhVar.zzf;
        this.zze = zzbhVar.zzg;
        this.zzf = zzbhVar.zzh;
        this.zzg = zzbhVar.zzi;
        this.zzh = zzbhVar.zzj;
        this.zzi = zzbhVar.zzk;
        this.zzj = zzbhVar.zzm;
        this.zzk = zzbhVar.zzn;
        this.zzl = zzbhVar.zzo;
        this.zzm = zzbhVar.zzp;
        this.zzn = zzbhVar.zzq;
        this.zzo = zzbhVar.zzr;
        this.zzp = zzbhVar.zzs;
        this.zzq = zzbhVar.zzt;
        this.zzr = zzbhVar.zzu;
        this.zzs = zzbhVar.zzv;
        this.zzt = zzbhVar.zzw;
    }

    public final zzbf zza(byte[] bArr, int i) {
        if (this.zzf == null || zzeg.zzS(Integer.valueOf(i), 3) || !zzeg.zzS(this.zzg, 3)) {
            this.zzf = (byte[]) bArr.clone();
            this.zzg = Integer.valueOf(i);
        }
        return this;
    }

    public final zzbf zzb(@z1 zzbh zzbhVar) {
        CharSequence charSequence = zzbhVar.zzc;
        if (charSequence != null) {
            this.zza = charSequence;
        }
        CharSequence charSequence2 = zzbhVar.zzd;
        if (charSequence2 != null) {
            this.zzb = charSequence2;
        }
        CharSequence charSequence3 = zzbhVar.zze;
        if (charSequence3 != null) {
            this.zzc = charSequence3;
        }
        CharSequence charSequence4 = zzbhVar.zzf;
        if (charSequence4 != null) {
            this.zzd = charSequence4;
        }
        CharSequence charSequence5 = zzbhVar.zzg;
        if (charSequence5 != null) {
            this.zze = charSequence5;
        }
        byte[] bArr = zzbhVar.zzh;
        if (bArr != null) {
            zzf(bArr, zzbhVar.zzi);
        }
        Integer num = zzbhVar.zzj;
        if (num != null) {
            this.zzh = num;
        }
        Integer num2 = zzbhVar.zzk;
        if (num2 != null) {
            this.zzi = num2;
        }
        Integer num3 = zzbhVar.zzl;
        if (num3 != null) {
            this.zzj = num3;
        }
        Integer num4 = zzbhVar.zzm;
        if (num4 != null) {
            this.zzj = num4;
        }
        Integer num5 = zzbhVar.zzn;
        if (num5 != null) {
            this.zzk = num5;
        }
        Integer num6 = zzbhVar.zzo;
        if (num6 != null) {
            this.zzl = num6;
        }
        Integer num7 = zzbhVar.zzp;
        if (num7 != null) {
            this.zzm = num7;
        }
        Integer num8 = zzbhVar.zzq;
        if (num8 != null) {
            this.zzn = num8;
        }
        Integer num9 = zzbhVar.zzr;
        if (num9 != null) {
            this.zzo = num9;
        }
        CharSequence charSequence6 = zzbhVar.zzs;
        if (charSequence6 != null) {
            this.zzp = charSequence6;
        }
        CharSequence charSequence7 = zzbhVar.zzt;
        if (charSequence7 != null) {
            this.zzq = charSequence7;
        }
        CharSequence charSequence8 = zzbhVar.zzu;
        if (charSequence8 != null) {
            this.zzr = charSequence8;
        }
        CharSequence charSequence9 = zzbhVar.zzv;
        if (charSequence9 != null) {
            this.zzs = charSequence9;
        }
        CharSequence charSequence10 = zzbhVar.zzw;
        if (charSequence10 != null) {
            this.zzt = charSequence10;
        }
        return this;
    }

    public final zzbf zzc(@z1 CharSequence charSequence) {
        this.zzd = charSequence;
        return this;
    }

    public final zzbf zzd(@z1 CharSequence charSequence) {
        this.zzc = charSequence;
        return this;
    }

    public final zzbf zze(@z1 CharSequence charSequence) {
        this.zzb = charSequence;
        return this;
    }

    public final zzbf zzf(@z1 byte[] bArr, @z1 Integer num) {
        this.zzf = (byte[]) bArr.clone();
        this.zzg = num;
        return this;
    }

    public final zzbf zzg(@z1 CharSequence charSequence) {
        this.zzq = charSequence;
        return this;
    }

    public final zzbf zzh(@z1 CharSequence charSequence) {
        this.zzr = charSequence;
        return this;
    }

    public final zzbf zzi(@z1 CharSequence charSequence) {
        this.zze = charSequence;
        return this;
    }

    public final zzbf zzj(@z1 CharSequence charSequence) {
        this.zzs = charSequence;
        return this;
    }

    public final zzbf zzk(@p1(from = 1, to = 31) @z1 Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzbf zzl(@p1(from = 1, to = 12) @z1 Integer num) {
        this.zzk = num;
        return this;
    }

    public final zzbf zzm(@z1 Integer num) {
        this.zzj = num;
        return this;
    }

    public final zzbf zzn(@p1(from = 1, to = 31) @z1 Integer num) {
        this.zzo = num;
        return this;
    }

    public final zzbf zzo(@p1(from = 1, to = 12) @z1 Integer num) {
        this.zzn = num;
        return this;
    }

    public final zzbf zzp(@z1 Integer num) {
        this.zzm = num;
        return this;
    }

    public final zzbf zzq(@z1 CharSequence charSequence) {
        this.zzt = charSequence;
        return this;
    }

    public final zzbf zzr(@z1 CharSequence charSequence) {
        this.zza = charSequence;
        return this;
    }

    public final zzbf zzs(@z1 Integer num) {
        this.zzi = num;
        return this;
    }

    public final zzbf zzt(@z1 Integer num) {
        this.zzh = num;
        return this;
    }

    public final zzbf zzu(@z1 CharSequence charSequence) {
        this.zzp = charSequence;
        return this;
    }

    public final zzbh zzv() {
        return new zzbh(this);
    }
}
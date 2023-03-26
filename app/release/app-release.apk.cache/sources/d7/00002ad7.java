package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfrn extends zzfrc {
    @CheckForNull
    public Object[] zzd;
    private int zze;

    public zzfrn() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfrc, com.google.android.gms.internal.ads.zzfrd
    public final /* bridge */ /* synthetic */ zzfrd zzb(Object obj) {
        zze(obj);
        return this;
    }

    public final zzfrn zze(Object obj) {
        Objects.requireNonNull(obj);
        if (this.zzd != null) {
            int zzh = zzfro.zzh(this.zzb);
            int length = this.zzd.length;
            if (zzh <= length) {
                int i = length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfrb.zza(hashCode);
                while (true) {
                    int i2 = zza & i;
                    Object[] objArr = this.zzd;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        objArr[i2] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        break;
                    } else if (obj2.equals(obj)) {
                        break;
                    } else {
                        zza = i2 + 1;
                    }
                }
                return this;
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }

    public final zzfrn zzf(Iterable iterable) {
        if (this.zzd != null) {
            for (Object obj : iterable) {
                zze(obj);
            }
        } else {
            super.zzc(iterable);
        }
        return this;
    }

    public final zzfro zzg() {
        zzfro zzp;
        boolean zzq;
        int i = this.zzb;
        if (i != 0) {
            if (i != 1) {
                if (this.zzd == null || zzfro.zzh(i) != this.zzd.length) {
                    zzp = zzfro.zzp(this.zzb, this.zza);
                    this.zzb = zzp.size();
                } else {
                    int i2 = this.zzb;
                    Object[] objArr = this.zza;
                    zzq = zzfro.zzq(i2, objArr.length);
                    if (zzq) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    int i3 = this.zze;
                    Object[] objArr2 = this.zzd;
                    zzp = new zzfsy(objArr, i3, objArr2, objArr2.length - 1, this.zzb);
                }
                this.zzc = true;
                this.zzd = null;
                return zzp;
            }
            Object obj = this.zza[0];
            obj.getClass();
            return new zzftf(obj);
        }
        return zzfsy.zza;
    }

    public zzfrn(int i) {
        super(i);
        this.zzd = new Object[zzfro.zzh(i)];
    }
}
package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfro extends zzfre implements Set {
    @CheckForNull
    private transient zzfrj zza;

    public static int zzh(int i) {
        int max = Math.max(i, 2);
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1);
            do {
                highestOneBit += highestOneBit;
            } while (highestOneBit * 0.7d < max);
            return highestOneBit;
        }
        zzfou.zzf(max < 1073741824, "collection too large");
        return 1073741824;
    }

    public static zzfrn zzj(int i) {
        return new zzfrn(i);
    }

    public static zzfro zzl(Collection collection) {
        Object[] array = collection.toArray();
        return zzp(array.length, array);
    }

    @SafeVarargs
    public static zzfro zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, 6);
        return zzp(12, objArr2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfro zzp(int i, Object... objArr) {
        if (i != 0) {
            if (i != 1) {
                int zzh = zzh(i);
                Object[] objArr2 = new Object[zzh];
                int i2 = zzh - 1;
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < i; i5++) {
                    Object obj = objArr[i5];
                    zzfsq.zza(obj, i5);
                    int hashCode = obj.hashCode();
                    int zza = zzfrb.zza(hashCode);
                    while (true) {
                        int i6 = zza & i2;
                        Object obj2 = objArr2[i6];
                        if (obj2 == null) {
                            objArr[i4] = obj;
                            objArr2[i6] = obj;
                            i3 += hashCode;
                            i4++;
                            break;
                        } else if (obj2.equals(obj)) {
                            break;
                        } else {
                            zza++;
                        }
                    }
                }
                Arrays.fill(objArr, i4, i, (Object) null);
                if (i4 == 1) {
                    Object obj3 = objArr[0];
                    obj3.getClass();
                    return new zzftf(obj3);
                } else if (zzh(i4) < zzh / 2) {
                    return zzp(i4, objArr);
                } else {
                    if (zzq(i4, objArr.length)) {
                        objArr = Arrays.copyOf(objArr, i4);
                    }
                    return new zzfsy(objArr, i3, objArr2, i2, i4);
                }
            }
            Object obj4 = objArr[0];
            obj4.getClass();
            return new zzftf(obj4);
        }
        return zzfsy.zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzq(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzfro) && zzo() && ((zzfro) obj).zzo() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzfte.zzc(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzfte.zza(this);
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public zzfrj zzd() {
        zzfrj zzfrjVar = this.zza;
        if (zzfrjVar == null) {
            zzfrj zzi = zzi();
            this.zza = zzi;
            return zzi;
        }
        return zzfrjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zze */
    public abstract zzfti iterator();

    public zzfrj zzi() {
        return zzfrj.zzj(toArray());
    }

    public boolean zzo() {
        return false;
    }
}
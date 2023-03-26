package com.google.android.gms.internal.ads;

import com.anythink.core.api.ErrorCode;
import com.p7700g.p99005.la1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfrj extends zzfre implements List, RandomAccess {
    private static final zzftj zza = new zzfrh(zzfss.zza, 0);

    public static zzfrg zzi() {
        return new zzfrg(4);
    }

    public static zzfrj zzj(Object[] objArr) {
        return zzk(objArr, objArr.length);
    }

    public static zzfrj zzk(Object[] objArr, int i) {
        if (i == 0) {
            return zzfss.zza;
        }
        return new zzfss(objArr, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzfrj zzl(Iterable iterable) {
        Objects.requireNonNull(iterable);
        return zzm(iterable);
    }

    public static zzfrj zzm(Collection collection) {
        if (collection instanceof zzfre) {
            zzfrj zzd = ((zzfre) collection).zzd();
            if (zzd.zzf()) {
                Object[] array = zzd.toArray();
                return zzk(array, array.length);
            }
            return zzd;
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzfsq.zzb(array2, length);
        return zzk(array2, length);
    }

    public static zzfrj zzn(Object[] objArr) {
        if (objArr.length == 0) {
            return zzfss.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzfsq.zzb(objArr2, length);
        return zzk(objArr2, length);
    }

    public static zzfrj zzo() {
        return zzfss.zza;
    }

    public static zzfrj zzp(Object obj) {
        Object[] objArr = {obj};
        zzfsq.zzb(objArr, 1);
        return zzk(objArr, 1);
    }

    public static zzfrj zzq(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzfsq.zzb(objArr, 2);
        return zzk(objArr, 2);
    }

    public static zzfrj zzr(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {ErrorCode.loadInShowingFilter, "1009", "3010"};
        zzfsq.zzb(objArr, 3);
        return zzk(objArr, 3);
    }

    public static zzfrj zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzfsq.zzb(objArr, 5);
        return zzk(objArr, 5);
    }

    public static zzfrj zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", ErrorCode.loadInShowingFilter, ErrorCode.inRequestFailPacing};
        zzfsq.zzb(objArr, 6);
        return zzk(objArr, 6);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (zzfoq.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzfoq.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzfre, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    @Deprecated
    public final zzfrj zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfre
    public final zzfti zze() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh */
    public zzfrj subList(int i, int i2) {
        zzfou.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return zzfss.zza;
        }
        return new zzfri(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzu */
    public final zzftj listIterator(int i) {
        zzfou.zzb(i, size(), la1.l);
        return isEmpty() ? zza : new zzfrh(this, i);
    }
}
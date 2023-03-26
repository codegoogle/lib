package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzglh extends zzgis implements RandomAccess, zzgli {
    public static final zzgli zza;
    private static final zzglh zzb;
    private final List zzc;

    static {
        zzglh zzglhVar = new zzglh(10);
        zzb = zzglhVar;
        zzglhVar.zzb();
        zza = zzglhVar;
    }

    public zzglh() {
        this(10);
    }

    private static String zzj(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgji) {
            return ((zzgji) obj).zzA(zzgla.zzb);
        }
        return zzgla.zzh((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        zzbM();
        this.zzc.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        zzbM();
        if (collection instanceof zzgli) {
            collection = ((zzgli) collection).zzh();
        }
        boolean addAll = this.zzc.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbM();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        zzbM();
        Object remove = this.zzc.remove(i);
        ((AbstractList) this).modCount++;
        return zzj(remove);
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        zzbM();
        return zzj(this.zzc.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgkz
    public final /* bridge */ /* synthetic */ zzgkz zzd(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzc);
            return new zzglh(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final zzgli zze() {
        return zzc() ? new zzgnp(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final Object zzf(int i) {
        return this.zzc.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: zzg */
    public final String get(int i) {
        Object obj = this.zzc.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgji) {
            zzgji zzgjiVar = (zzgji) obj;
            String zzA = zzgjiVar.zzA(zzgla.zzb);
            if (zzgjiVar.zzp()) {
                this.zzc.set(i, zzA);
            }
            return zzA;
        }
        byte[] bArr = (byte[]) obj;
        String zzh = zzgla.zzh(bArr);
        if (zzgla.zzi(bArr)) {
            this.zzc.set(i, zzh);
        }
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgli
    public final void zzi(zzgji zzgjiVar) {
        zzbM();
        this.zzc.add(zzgjiVar);
        ((AbstractList) this).modCount++;
    }

    public zzglh(int i) {
        this.zzc = new ArrayList(i);
    }

    private zzglh(ArrayList arrayList) {
        this.zzc = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzgis, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
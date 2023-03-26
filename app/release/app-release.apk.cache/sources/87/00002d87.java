package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgql extends AbstractList {
    private static final zzgqm zzc = zzgqm.zzb(zzgql.class);
    public final List zza;
    public final Iterator zzb;

    public zzgql(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        if (this.zza.size() > i) {
            return this.zza.get(i);
        }
        if (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
            return get(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zzgqk(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zzgqm zzgqmVar = zzc;
        zzgqmVar.zza("potentially expensive size() call");
        zzgqmVar.zza("blowup running");
        while (this.zzb.hasNext()) {
            this.zza.add(this.zzb.next());
        }
        return this.zza.size();
    }
}
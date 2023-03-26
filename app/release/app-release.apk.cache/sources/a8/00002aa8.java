package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public class zzfpu extends zzfsb {
    public final /* synthetic */ zzfqe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfpu(zzfqe zzfqeVar, Map map) {
        super(map);
        this.zza = zzfqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zzfrt.zzb(iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.zzd.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return this == obj || this.zzd.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zzd.keySet().hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzfsb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzfpt(this, this.zzd.entrySet().iterator());
    }

    @Override // com.google.android.gms.internal.ads.zzfsb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object obj) {
        Collection collection = (Collection) this.zzd.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            zzfqe.zzg(this.zza, size);
            return size > 0;
        }
        return false;
    }
}
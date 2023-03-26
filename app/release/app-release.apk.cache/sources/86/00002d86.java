package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgqk implements Iterator {
    public int zza = 0;
    public final /* synthetic */ zzgql zzb;

    public zzgqk(zzgql zzgqlVar) {
        this.zzb = zzgqlVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i = this.zza;
            this.zza = i + 1;
            return list.get(i);
        }
        zzgql zzgqlVar = this.zzb;
        zzgqlVar.zza.add(zzgqlVar.zzb.next());
        return next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
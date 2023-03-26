package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfqp implements Iterator {
    public int zzb;
    public int zzc;
    public int zzd;
    public final /* synthetic */ zzfqt zze;

    public /* synthetic */ zzfqp(zzfqt zzfqtVar, zzfql zzfqlVar) {
        int i;
        this.zze = zzfqtVar;
        i = zzfqtVar.zzf;
        this.zzb = i;
        this.zzc = zzfqtVar.zze();
        this.zzd = -1;
    }

    private final void zzb() {
        int i;
        i = this.zze.zzf;
        if (i != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfou.zzi(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfqt zzfqtVar = this.zze;
        zzfqtVar.remove(zzfqt.zzg(zzfqtVar, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
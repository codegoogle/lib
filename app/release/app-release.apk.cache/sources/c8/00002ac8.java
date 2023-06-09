package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfqz extends zzfra implements Map {
    @Override // java.util.Map
    public final void clear() {
        zzb().clear();
    }

    public boolean containsKey(@CheckForNull Object obj) {
        return zzb().containsKey(obj);
    }

    public boolean containsValue(@CheckForNull Object obj) {
        return zzb().containsValue(obj);
    }

    public Set entrySet() {
        return zzb().entrySet();
    }

    public boolean equals(@CheckForNull Object obj) {
        return obj == this || zzb().equals(obj);
    }

    @CheckForNull
    public Object get(@CheckForNull Object obj) {
        return zzb().get(obj);
    }

    public int hashCode() {
        return zzb().hashCode();
    }

    public boolean isEmpty() {
        return zzb().isEmpty();
    }

    public Set keySet() {
        return zzb().keySet();
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object put(Object obj, Object obj2) {
        return zzb().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        zzb().putAll(map);
    }

    @Override // java.util.Map
    @CheckForNull
    public final Object remove(@CheckForNull Object obj) {
        return zzb().remove(obj);
    }

    public int size() {
        return zzb().size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return zzb().values();
    }

    @Override // com.google.android.gms.internal.ads.zzfra
    public /* bridge */ /* synthetic */ Object zza() {
        throw null;
    }

    public abstract Map zzb();

    public final int zzc() {
        return zzfte.zza(entrySet());
    }

    public final boolean zzd(@CheckForNull Object obj) {
        zzfrz zzfrzVar = new zzfrz(entrySet().iterator());
        if (obj == null) {
            while (zzfrzVar.hasNext()) {
                if (zzfrzVar.next() == null) {
                    return true;
                }
            }
        } else {
            while (zzfrzVar.hasNext()) {
                if (obj.equals(zzfrzVar.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean zze(@CheckForNull Object obj) {
        return zzfse.zzb(this, obj);
    }
}
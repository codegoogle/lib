package com.google.android.gms.internal.ads;

import com.anythink.core.api.ATAdConst;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzfrm implements Map, Serializable {
    @CheckForNull
    private transient zzfro zza;
    @CheckForNull
    private transient zzfro zzb;
    @CheckForNull
    private transient zzfre zzc;

    public static zzfrm zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfrl zzfrlVar = new zzfrl(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfrlVar.zzb(entrySet);
        return zzfrlVar.zzc();
    }

    public static zzfrm zzd() {
        return zzfsx.zza;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfse.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfte.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzfro zzfroVar = this.zzb;
        if (zzfroVar == null) {
            zzfro zzf = zzf();
            this.zzb = zzf;
            return zzf;
        }
        return zzfroVar;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfqi.zza(size, ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE);
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfre zza();

    @Override // java.util.Map
    /* renamed from: zzb */
    public final zzfre values() {
        zzfre zzfreVar = this.zzc;
        if (zzfreVar == null) {
            zzfre zza = zza();
            this.zzc = zza;
            return zza;
        }
        return zzfreVar;
    }

    public abstract zzfro zze();

    public abstract zzfro zzf();

    @Override // java.util.Map
    /* renamed from: zzg */
    public final zzfro entrySet() {
        zzfro zzfroVar = this.zza;
        if (zzfroVar == null) {
            zzfro zze = zze();
            this.zza = zze;
            return zze;
        }
        return zzfroVar;
    }
}
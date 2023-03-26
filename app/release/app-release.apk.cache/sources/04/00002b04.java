package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfte {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection, java.util.Set] */
    public static Set zzb(Set set, zzfov zzfovVar) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof zzftb) {
                zzftb zzftbVar = (zzftb) sortedSet;
                return new zzftc((SortedSet) zzftbVar.zza, zzfoy.zza(zzftbVar.zzb, zzfovVar));
            }
            Objects.requireNonNull(sortedSet);
            Objects.requireNonNull(zzfovVar);
            return new zzftc(sortedSet, zzfovVar);
        } else if (set instanceof zzftb) {
            zzftb zzftbVar2 = (zzftb) set;
            return new zzftb(zzftbVar2.zza, zzfoy.zza(zzftbVar2.zzb, zzfovVar));
        } else {
            Objects.requireNonNull(set);
            Objects.requireNonNull(zzfovVar);
            return new zzftb(set, zzfovVar);
        }
    }

    public static boolean zzc(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zzd(Set set, Collection collection) {
        Objects.requireNonNull(collection);
        if (collection instanceof zzfso) {
            collection = ((zzfso) collection).zza();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            Iterator it = set.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }
        return zze(set, collection.iterator());
    }

    public static boolean zze(Set set, Iterator it) {
        boolean z = false;
        while (it.hasNext()) {
            z |= set.remove(it.next());
        }
        return z;
    }
}
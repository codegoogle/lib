package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.q7;
import com.p7700g.p99005.r7;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    @KeepForSdk
    public static boolean isEmpty(@z1 Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @x1
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @x1
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@x1 K k, @x1 V v, @x1 K k2, @x1 V v2, @x1 K k3, @x1 V v3) {
        Map zza = zza(3, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        return Collections.unmodifiableMap(zza);
    }

    @x1
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@x1 K[] kArr, @x1 V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length == length2) {
            if (length != 0) {
                if (length != 1) {
                    Map zza = zza(length, false);
                    for (int i = 0; i < kArr.length; i++) {
                        zza.put(kArr[i], vArr[i]);
                    }
                    return Collections.unmodifiableMap(zza);
                }
                return Collections.singletonMap(kArr[0], vArr[0]);
            }
            return Collections.emptyMap();
        }
        throw new IllegalArgumentException(wo1.o("Key and values array lengths not equal: ", length, " != ", length2));
    }

    @x1
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        if (i == 0) {
            return new r7();
        }
        return zzb(i, true);
    }

    @x1
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@x1 T t, @x1 T t2, @x1 T t3) {
        Set zzb = zzb(3, false);
        zzb.add(t);
        zzb.add(t2);
        zzb.add(t3);
        return Collections.unmodifiableSet(zzb);
    }

    private static Map zza(int i, boolean z) {
        if (i <= 256) {
            return new q7(i);
        }
        return new HashMap(i, 1.0f);
    }

    private static Set zzb(int i, boolean z) {
        float f = true != z ? 1.0f : 0.75f;
        if (i <= (true != z ? 256 : 128)) {
            return new r7(i);
        }
        return new HashSet(i, f);
    }

    @x1
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@x1 T t) {
        return Collections.singletonList(t);
    }

    @x1
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@x1 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return listOf(tArr[0]);
        }
        return listOf();
    }

    @x1
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@x1 K k, @x1 V v, @x1 K k2, @x1 V v2, @x1 K k3, @x1 V v3, @x1 K k4, @x1 V v4, @x1 K k5, @x1 V v5, @x1 K k6, @x1 V v6) {
        Map zza = zza(6, false);
        zza.put(k, v);
        zza.put(k2, v2);
        zza.put(k3, v3);
        zza.put(k4, v4);
        zza.put(k5, v5);
        zza.put(k6, v6);
        return Collections.unmodifiableMap(zza);
    }

    @x1
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@x1 T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                if (length == 2) {
                    T t = tArr[0];
                    T t2 = tArr[1];
                    Set zzb = zzb(2, false);
                    zzb.add(t);
                    zzb.add(t2);
                    return Collections.unmodifiableSet(zzb);
                } else if (length != 3) {
                    if (length != 4) {
                        Set zzb2 = zzb(length, false);
                        Collections.addAll(zzb2, tArr);
                        return Collections.unmodifiableSet(zzb2);
                    }
                    T t3 = tArr[0];
                    T t4 = tArr[1];
                    T t5 = tArr[2];
                    T t6 = tArr[3];
                    Set zzb3 = zzb(4, false);
                    zzb3.add(t3);
                    zzb3.add(t4);
                    zzb3.add(t5);
                    zzb3.add(t6);
                    return Collections.unmodifiableSet(zzb3);
                } else {
                    return setOf(tArr[0], tArr[1], tArr[2]);
                }
            }
            return Collections.singleton(tArr[0]);
        }
        return Collections.emptySet();
    }
}
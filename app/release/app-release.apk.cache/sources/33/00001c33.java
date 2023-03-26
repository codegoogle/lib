package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaix {
    public final int zza;
    public final byte[] zzb;
    @z1
    public final Map zzc;
    @z1
    public final List zzd;
    public final boolean zze;

    private zzaix(int i, byte[] bArr, @z1 Map map, @z1 List list, boolean z, long j) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    @z1
    private static List zza(@z1 Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzait((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzaix(int i, byte[] bArr, @z1 Map map, boolean z, long j) {
        this(i, bArr, map, zza(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaix(int i, byte[] bArr, boolean z, long j, @z1 List list) {
        this(i, bArr, r0, list, z, j);
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzait zzaitVar = (zzait) it.next();
                treeMap.put(zzaitVar.zza(), zzaitVar.zzb());
            }
        }
    }

    @Deprecated
    public zzaix(byte[] bArr, @z1 Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
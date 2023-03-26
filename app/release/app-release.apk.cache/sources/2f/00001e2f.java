package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbbr {
    private final int zza;
    private final zzbbo zzb = new zzbbt();

    public zzbbr(int i) {
        this.zza = i;
    }

    public final String zza(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        zzbbq zzbbqVar = new zzbbq();
        PriorityQueue priorityQueue = new PriorityQueue(this.zza, new zzbbp(this));
        for (String str : split) {
            String[] zzb = zzbbs.zzb(str, false);
            if (zzb.length != 0) {
                zzbbw.zzc(zzb, this.zza, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbbqVar.zzb.write(this.zzb.zzb(((zzbbv) it.next()).zzb));
            } catch (IOException e) {
                zzcfi.zzh("Error while writing hash to byteStream", e);
            }
        }
        return zzbbqVar.toString();
    }
}
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.gl4;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbw {
    @VisibleForTesting
    public static long zza(long j, int i) {
        return i == 1 ? j : (i & 1) == 0 ? zza((j * j) % 1073807359, i >> 1) % 1073807359 : ((zza((j * j) % 1073807359, i >> 1) % 1073807359) * j) % 1073807359;
    }

    @VisibleForTesting
    public static String zzb(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzcfi.zzg("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(gl4.R);
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    public static void zzc(String[] strArr, int i, int i2, PriorityQueue priorityQueue) {
        int length = strArr.length;
        if (length < 6) {
            zzd(i, zze(strArr, 0, length), zzb(strArr, 0, length), length, priorityQueue);
            return;
        }
        long zze = zze(strArr, 0, 6);
        zzd(i, zze, zzb(strArr, 0, 6), 6, priorityQueue);
        long zza = zza(16785407L, 5);
        int i3 = 1;
        while (true) {
            int length2 = strArr.length;
            if (i3 >= length2 - 5) {
                return;
            }
            zze = (((zzbbs.zza(strArr[i3 + 5]) + TTL.MAX_VALUE) % 1073807359) + (((((zze + 1073807359) - ((((zzbbs.zza(strArr[i3 - 1]) + TTL.MAX_VALUE) % 1073807359) * zza) % 1073807359)) % 1073807359) * 16785407) % 1073807359)) % 1073807359;
            zzd(i, zze, zzb(strArr, i3, 6), length2, priorityQueue);
            i3++;
        }
    }

    @VisibleForTesting
    public static void zzd(int i, long j, String str, int i2, PriorityQueue priorityQueue) {
        zzbbv zzbbvVar = new zzbbv(j, str, i2);
        if ((priorityQueue.size() != i || (((zzbbv) priorityQueue.peek()).zzc <= zzbbvVar.zzc && ((zzbbv) priorityQueue.peek()).zza <= zzbbvVar.zza)) && !priorityQueue.contains(zzbbvVar)) {
            priorityQueue.add(zzbbvVar);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    private static long zze(String[] strArr, int i, int i2) {
        long zza = (zzbbs.zza(strArr[0]) + TTL.MAX_VALUE) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            zza = (((zzbbs.zza(strArr[i3]) + TTL.MAX_VALUE) % 1073807359) + ((zza * 16785407) % 1073807359)) % 1073807359;
        }
        return zza;
    }
}
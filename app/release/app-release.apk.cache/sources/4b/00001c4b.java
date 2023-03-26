package com.google.android.gms.internal.ads;

import com.p7700g.p99005.r2;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@r2
/* loaded from: classes2.dex */
public final class zzaju {
    public long zza;
    public final String zzb;
    public final String zzc;
    public final long zzd;
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final List zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzaju(String str, zzaik zzaikVar) {
        this(str, r2, r3, r5, r7, r9, r0);
        String str2 = zzaikVar.zzb;
        long j = zzaikVar.zzc;
        long j2 = zzaikVar.zzd;
        long j3 = zzaikVar.zze;
        long j4 = zzaikVar.zzf;
        ?? r0 = zzaikVar.zzh;
        if (r0 == 0) {
            Map map = zzaikVar.zzg;
            r0 = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                r0.add(new zzait((String) entry.getKey(), (String) entry.getValue()));
            }
        }
    }

    public static zzaju zza(zzajv zzajvVar) throws IOException {
        List arrayList;
        if (zzajx.zze(zzajvVar) == 538247942) {
            String zzh = zzajx.zzh(zzajvVar);
            String zzh2 = zzajx.zzh(zzajvVar);
            long zzf = zzajx.zzf(zzajvVar);
            long zzf2 = zzajx.zzf(zzajvVar);
            long zzf3 = zzajx.zzf(zzajvVar);
            long zzf4 = zzajx.zzf(zzajvVar);
            int zze = zzajx.zze(zzajvVar);
            if (zze >= 0) {
                if (zze == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                }
                List list = arrayList;
                for (int i = 0; i < zze; i++) {
                    list.add(new zzait(zzajx.zzh(zzajvVar).intern(), zzajx.zzh(zzajvVar).intern()));
                }
                return new zzaju(zzh, zzh2, zzf, zzf2, zzf3, zzf4, list);
            }
            throw new IOException(wo1.l("readHeaderList size=", zze));
        }
        throw new IOException();
    }

    private zzaju(String str, String str2, long j, long j2, long j3, long j4, List list) {
        this.zzb = str;
        this.zzc = true == "".equals(str2) ? null : str2;
        this.zzd = j;
        this.zze = j2;
        this.zzf = j3;
        this.zzg = j4;
        this.zzh = list;
    }
}
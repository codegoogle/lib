package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbf {
    private final String[] zza;
    private final double[] zzb;
    private final double[] zzc;
    private final int[] zzd;
    private int zze;

    public /* synthetic */ zzbf(zzbd zzbdVar, zzbe zzbeVar) {
        List list;
        List list2;
        List list3;
        List list4;
        list = zzbdVar.zzb;
        int size = list.size();
        list2 = zzbdVar.zza;
        this.zza = (String[]) list2.toArray(new String[size]);
        list3 = zzbdVar.zzb;
        this.zzb = zzc(list3);
        list4 = zzbdVar.zzc;
        this.zzc = zzc(list4);
        this.zzd = new int[size];
        this.zze = 0;
    }

    private static final double[] zzc(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((Double) list.get(i)).doubleValue();
        }
        return dArr;
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList(this.zza.length);
        int i = 0;
        while (true) {
            String[] strArr = this.zza;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d = this.zzc[i];
            double d2 = this.zzb[i];
            int i2 = this.zzd[i];
            arrayList.add(new zzbc(str, d, d2, i2 / this.zze, i2));
            i++;
        }
    }

    public final void zzb(double d) {
        this.zze++;
        int i = 0;
        while (true) {
            double[] dArr = this.zzc;
            if (i >= dArr.length) {
                return;
            }
            double d2 = dArr[i];
            if (d2 <= d && d < this.zzb[i]) {
                int[] iArr = this.zzd;
                iArr[i] = iArr[i] + 1;
            }
            if (d < d2) {
                return;
            }
            i++;
        }
    }
}
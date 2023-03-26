package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzwo {
    private static final Comparator zza = zzwk.zza;
    private static final Comparator zzb = zzwl.zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final zzwn[] zzd = new zzwn[5];
    private final ArrayList zzc = new ArrayList();
    private int zze = -1;

    public zzwo(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = this.zzg * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzwn zzwnVar = (zzwn) this.zzc.get(i2);
            i += zzwnVar.zzb;
            if (i >= f2) {
                return zzwnVar.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzwn) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzwn zzwnVar;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzwn[] zzwnVarArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzwnVar = zzwnVarArr[i3];
        } else {
            zzwnVar = new zzwn(null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzwnVar.zza = i4;
        zzwnVar.zzb = i;
        zzwnVar.zzc = f;
        this.zzc.add(zzwnVar);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 <= 2000) {
                return;
            }
            int i6 = i5 - 2000;
            zzwn zzwnVar2 = (zzwn) this.zzc.get(0);
            int i7 = zzwnVar2.zzb;
            if (i7 <= i6) {
                this.zzg -= i7;
                this.zzc.remove(0);
                int i8 = this.zzh;
                if (i8 < 5) {
                    zzwn[] zzwnVarArr2 = this.zzd;
                    this.zzh = i8 + 1;
                    zzwnVarArr2[i8] = zzwnVar2;
                }
            } else {
                zzwnVar2.zzb = i7 - i6;
                this.zzg -= i6;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
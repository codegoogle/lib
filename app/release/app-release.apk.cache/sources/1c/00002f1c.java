package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.p7700g.p99005.z1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzut extends zzcp {
    public static final zzut zzD;
    @Deprecated
    public static final zzut zzE;
    public static final zzl zzF;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    private final SparseArray zzS;
    private final SparseBooleanArray zzT;

    static {
        zzut zzutVar = new zzut(new zzuv());
        zzD = zzutVar;
        zzE = zzutVar;
        zzF = zzur.zza;
    }

    private zzut(zzuv zzuvVar) {
        super(zzuvVar);
        this.zzG = zzuv.zzt(zzuvVar);
        this.zzH = false;
        this.zzI = zzuv.zzq(zzuvVar);
        this.zzJ = false;
        this.zzK = zzuv.zzr(zzuvVar);
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzuv.zzs(zzuvVar);
        this.zzQ = false;
        this.zzR = zzuv.zzp(zzuvVar);
        this.zzS = zzuv.zzm(zzuvVar);
        this.zzT = zzuv.zzn(zzuvVar);
    }

    public static zzut zzc(Context context) {
        return new zzut(new zzuv(context));
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzut.class == obj.getClass()) {
            zzut zzutVar = (zzut) obj;
            if (super.equals(zzutVar) && this.zzG == zzutVar.zzG && this.zzI == zzutVar.zzI && this.zzK == zzutVar.zzK && this.zzP == zzutVar.zzP && this.zzR == zzutVar.zzR) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzutVar.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i < size) {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        } else {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzutVar.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzty zztyVar = (zzty) entry.getKey();
                                                if (map2.containsKey(zztyVar)) {
                                                    if (!zzeg.zzS(entry.getValue(), map2.get(zztyVar))) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 961) + (this.zzR ? 1 : 0);
    }

    public final zzuv zzd() {
        return new zzuv(this, null);
    }

    @z1
    @Deprecated
    public final zzux zze(int i, zzty zztyVar) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzux) map.get(zztyVar);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzty zztyVar) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zztyVar);
    }
}
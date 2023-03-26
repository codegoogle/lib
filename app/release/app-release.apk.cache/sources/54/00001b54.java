package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaaq extends zzaas {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzaaq() {
        super(new zzyq());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzdy zzdyVar) {
        return Double.valueOf(Double.longBitsToDouble(zzdyVar.zzr()));
    }

    @z1
    private static Object zzh(zzdy zzdyVar, int i) {
        if (i == 0) {
            return zzg(zzdyVar);
        }
        if (i == 1) {
            return Boolean.valueOf(zzdyVar.zzk() == 1);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 8) {
                    if (i != 10) {
                        if (i != 11) {
                            return null;
                        }
                        Date date = new Date((long) zzg(zzdyVar).doubleValue());
                        zzdyVar.zzG(2);
                        return date;
                    }
                    int zzn = zzdyVar.zzn();
                    ArrayList arrayList = new ArrayList(zzn);
                    for (int i2 = 0; i2 < zzn; i2++) {
                        Object zzh = zzh(zzdyVar, zzdyVar.zzk());
                        if (zzh != null) {
                            arrayList.add(zzh);
                        }
                    }
                    return arrayList;
                }
                return zzj(zzdyVar);
            }
            HashMap hashMap = new HashMap();
            while (true) {
                String zzi = zzi(zzdyVar);
                int zzk = zzdyVar.zzk();
                if (zzk == 9) {
                    return hashMap;
                }
                Object zzh2 = zzh(zzdyVar, zzk);
                if (zzh2 != null) {
                    hashMap.put(zzi, zzh2);
                }
            }
        } else {
            return zzi(zzdyVar);
        }
    }

    private static String zzi(zzdy zzdyVar) {
        int zzo = zzdyVar.zzo();
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(zzo);
        return new String(zzdyVar.zzH(), zzc, zzo);
    }

    private static HashMap zzj(zzdy zzdyVar) {
        int zzn = zzdyVar.zzn();
        HashMap hashMap = new HashMap(zzn);
        for (int i = 0; i < zzn; i++) {
            String zzi = zzi(zzdyVar);
            Object zzh = zzh(zzdyVar, zzdyVar.zzk());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zza(zzdy zzdyVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zzb(zzdy zzdyVar, long j) {
        if (zzdyVar.zzk() == 2 && "onMetaData".equals(zzi(zzdyVar)) && zzdyVar.zza() != 0 && zzdyVar.zzk() == 8) {
            HashMap zzj = zzj(zzdyVar);
            Object obj = zzj.get("duration");
            if (obj instanceof Double) {
                double doubleValue = ((Double) obj).doubleValue();
                if (doubleValue > zg2.s) {
                    this.zzb = (long) (doubleValue * 1000000.0d);
                }
            }
            Object obj2 = zzj.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.zzc = new long[size];
                    this.zzd = new long[size];
                    for (int i = 0; i < size; i++) {
                        Object obj5 = list.get(i);
                        Object obj6 = list2.get(i);
                        if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                            this.zzc = new long[0];
                            this.zzd = new long[0];
                            break;
                        }
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
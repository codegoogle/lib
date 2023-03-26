package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmv {
    private static final Class zza;
    private static final zzgnk zzb;
    private static final zzgnk zzc;
    private static final zzgnk zzd;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zza = cls;
        zzb = zzab(false);
        zzc = zzab(true);
        zzd = new zzgnm();
    }

    public static zzgnk zzA() {
        return zzc;
    }

    public static zzgnk zzB() {
        return zzd;
    }

    public static Object zzC(int i, List list, zzgku zzgkuVar, Object obj, zzgnk zzgnkVar) {
        if (zzgkuVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzgkuVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzgnkVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzgkuVar.zza(intValue2)) {
                    obj = zzD(i, intValue2, obj, zzgnkVar);
                    it.remove();
                }
            }
        }
        return obj;
    }

    public static Object zzD(int i, int i2, Object obj, zzgnk zzgnkVar) {
        if (obj == null) {
            obj = zzgnkVar.zzf();
        }
        zzgnkVar.zzl(obj, i, i2);
        return obj;
    }

    public static void zzE(zzgkd zzgkdVar, Object obj, Object obj2) {
        zzgkdVar.zza(obj2);
        throw null;
    }

    public static void zzF(zzgnk zzgnkVar, Object obj, Object obj2) {
        zzgnkVar.zzo(obj, zzgnkVar.zze(zzgnkVar.zzd(obj), zzgnkVar.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzgkq.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void zzI(zzglv zzglvVar, Object obj, Object obj2, long j) {
        zzgnu.zzv(obj, j, zzglv.zzc(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j)));
    }

    public static void zzJ(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzc(i, list, z);
    }

    public static void zzK(int i, List list, zzgjy zzgjyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zze(i, list);
    }

    public static void zzL(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzg(i, list, z);
    }

    public static void zzM(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzj(i, list, z);
    }

    public static void zzN(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzl(i, list, z);
    }

    public static void zzO(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzn(i, list, z);
    }

    public static void zzP(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzp(i, list, z);
    }

    public static void zzQ(int i, List list, zzgjy zzgjyVar, zzgmt zzgmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjyVar.zzq(i, list.get(i2), zzgmtVar);
        }
    }

    public static void zzR(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzs(i, list, z);
    }

    public static void zzS(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzu(i, list, z);
    }

    public static void zzT(int i, List list, zzgjy zzgjyVar, zzgmt zzgmtVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgjyVar.zzv(i, list.get(i2), zzgmtVar);
        }
    }

    public static void zzU(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzx(i, list, z);
    }

    public static void zzV(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzz(i, list, z);
    }

    public static void zzW(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzB(i, list, z);
    }

    public static void zzX(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzD(i, list, z);
    }

    public static void zzY(int i, List list, zzgjy zzgjyVar) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzG(i, list);
    }

    public static void zzZ(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzI(i, list, z);
    }

    public static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzE(i << 3) + 1) * size;
    }

    public static void zzaa(int i, List list, zzgjy zzgjyVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzgjyVar.zzK(i, list, z);
    }

    private static zzgnk zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzgnk) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int zzb(List list) {
        return list.size();
    }

    public static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzgjx.zzw((zzgji) list.get(i2));
        }
        return zzD;
    }

    public static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zze(list);
    }

    public static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(zzgkrVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzE(i << 3) + 4) * size;
    }

    public static int zzg(List list) {
        return list.size() * 4;
    }

    public static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzE(i << 3) + 8) * size;
    }

    public static int zzi(List list) {
        return list.size() * 8;
    }

    public static int zzj(int i, List list, zzgmt zzgmtVar) {
        int size = list.size();
        if (size != 0) {
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i2 += zzgjx.zzx(i, (zzgma) list.get(i3), zzgmtVar);
            }
            return i2;
        }
        return 0;
    }

    public static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zzl(list);
    }

    public static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(zzgkrVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * list.size()) + zzn(list);
    }

    public static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(zzglpVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzo(int i, Object obj, zzgmt zzgmtVar) {
        if (obj instanceof zzglg) {
            int zzE = zzgjx.zzE(i << 3);
            int zza2 = ((zzglg) obj).zza();
            return zzgjx.zzE(zza2) + zza2 + zzE;
        }
        return zzgjx.zzA((zzgma) obj, zzgmtVar) + zzgjx.zzE(i << 3);
    }

    public static int zzp(int i, List list, zzgmt zzgmtVar) {
        int zzA;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzglg) {
                zzA = zzgjx.zzz((zzglg) obj);
            } else {
                zzA = zzgjx.zzA((zzgma) obj, zzgmtVar);
            }
            zzD = zzA + zzD;
        }
        return zzD;
    }

    public static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zzr(list);
    }

    public static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                int zze = zzgkrVar.zze(i2);
                i += zzgjx.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzgjx.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zzt(list);
    }

    public static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i = 0;
            while (i2 < size) {
                long zze = zzglpVar.zze(i2);
                i += zzgjx.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzgjx.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    public static int zzu(int i, List list) {
        int zzC;
        int zzC2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzgjx.zzD(i) * size;
        if (list instanceof zzgli) {
            zzgli zzgliVar = (zzgli) list;
            while (i2 < size) {
                Object zzf = zzgliVar.zzf(i2);
                if (zzf instanceof zzgji) {
                    zzC2 = zzgjx.zzw((zzgji) zzf);
                } else {
                    zzC2 = zzgjx.zzC((String) zzf);
                }
                zzD = zzC2 + zzD;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzgji) {
                    zzC = zzgjx.zzw((zzgji) obj);
                } else {
                    zzC = zzgjx.zzC((String) obj);
                }
                zzD = zzC + zzD;
                i2++;
            }
        }
        return zzD;
    }

    public static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zzw(list);
    }

    public static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzgkr) {
            zzgkr zzgkrVar = (zzgkr) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzE(zzgkrVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    public static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzgjx.zzD(i) * size) + zzy(list);
    }

    public static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzglp) {
            zzglp zzglpVar = (zzglp) list;
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(zzglpVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzgjx.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzgnk zzz() {
        return zzb;
    }
}
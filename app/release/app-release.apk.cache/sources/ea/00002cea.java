package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgkm;
import com.google.android.gms.internal.ads.zzgkq;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzgkq<MessageType extends zzgkq<MessageType, BuilderType>, BuilderType extends zzgkm<MessageType, BuilderType>> extends zzgir<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    public zzgnl zzc = zzgnl.zzc();
    public int zzd = -1;

    private static zzgkq zza(zzgkq zzgkqVar) throws zzglc {
        if (zzgkqVar == null || zzgkqVar.zzaR()) {
            return zzgkqVar;
        }
        zzglc zza = new zzgnj(zzgkqVar).zza();
        zza.zzh(zzgkqVar);
        throw zza;
    }

    public static zzgkq zzaA(Class cls) {
        Map map = zzb;
        zzgkq zzgkqVar = (zzgkq) map.get(cls);
        if (zzgkqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzgkqVar = (zzgkq) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzgkqVar == null) {
            zzgkqVar = (zzgkq) ((zzgkq) zzgnu.zzg(cls)).zzb(6, null, null);
            if (zzgkqVar != null) {
                map.put(cls, zzgkqVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzgkqVar;
    }

    public static zzgkq zzaB(zzgkq zzgkqVar, zzgji zzgjiVar) throws zzglc {
        zzgkc zza = zzgkc.zza();
        zzgjq zzl = zzgjiVar.zzl();
        zzgkq zzgkqVar2 = (zzgkq) zzgkqVar.zzb(4, null, null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkqVar2.getClass());
            zzb2.zzh(zzgkqVar2, zzgjr.zzq(zzl), zza);
            zzb2.zzf(zzgkqVar2);
            try {
                zzl.zzz(0);
                zza(zzgkqVar2);
                zza(zzgkqVar2);
                return zzgkqVar2;
            } catch (zzglc e) {
                e.zzh(zzgkqVar2);
                throw e;
            }
        } catch (zzglc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzglc(e);
            }
            e.zzh(zzgkqVar2);
            throw e;
        } catch (zzgnj e3) {
            zzglc zza2 = e3.zza();
            zza2.zzh(zzgkqVar2);
            throw zza2;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            zzglc zzglcVar = new zzglc(e4);
            zzglcVar.zzh(zzgkqVar2);
            throw zzglcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzglc) {
                throw ((zzglc) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgkq zzaC(zzgkq zzgkqVar, byte[] bArr) throws zzglc {
        zzgkq zzc = zzc(zzgkqVar, bArr, 0, bArr.length, zzgkc.zza());
        zza(zzc);
        return zzc;
    }

    public static zzgkq zzaD(zzgkq zzgkqVar, zzgji zzgjiVar, zzgkc zzgkcVar) throws zzglc {
        zzgjq zzl = zzgjiVar.zzl();
        zzgkq zzgkqVar2 = (zzgkq) zzgkqVar.zzb(4, null, null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkqVar2.getClass());
            zzb2.zzh(zzgkqVar2, zzgjr.zzq(zzl), zzgkcVar);
            zzb2.zzf(zzgkqVar2);
            try {
                zzl.zzz(0);
                zza(zzgkqVar2);
                return zzgkqVar2;
            } catch (zzglc e) {
                e.zzh(zzgkqVar2);
                throw e;
            }
        } catch (zzglc e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzglc(e);
            }
            e.zzh(zzgkqVar2);
            throw e;
        } catch (zzgnj e3) {
            zzglc zza = e3.zza();
            zza.zzh(zzgkqVar2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            zzglc zzglcVar = new zzglc(e4);
            zzglcVar.zzh(zzgkqVar2);
            throw zzglcVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzglc) {
                throw ((zzglc) e5.getCause());
            }
            throw e5;
        }
    }

    public static zzgkq zzaE(zzgkq zzgkqVar, InputStream inputStream, zzgkc zzgkcVar) throws zzglc {
        zzgjq zzH = zzgjq.zzH(inputStream, 4096);
        zzgkq zzgkqVar2 = (zzgkq) zzgkqVar.zzb(4, null, null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkqVar2.getClass());
            zzb2.zzh(zzgkqVar2, zzgjr.zzq(zzH), zzgkcVar);
            zzb2.zzf(zzgkqVar2);
            zza(zzgkqVar2);
            return zzgkqVar2;
        } catch (zzglc e) {
            e = e;
            if (e.zzl()) {
                e = new zzglc(e);
            }
            e.zzh(zzgkqVar2);
            throw e;
        } catch (zzgnj e2) {
            zzglc zza = e2.zza();
            zza.zzh(zzgkqVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzglc) {
                throw ((zzglc) e3.getCause());
            }
            zzglc zzglcVar = new zzglc(e3);
            zzglcVar.zzh(zzgkqVar2);
            throw zzglcVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzglc) {
                throw ((zzglc) e4.getCause());
            }
            throw e4;
        }
    }

    public static zzgkq zzaF(zzgkq zzgkqVar, byte[] bArr, zzgkc zzgkcVar) throws zzglc {
        zzgkq zzc = zzc(zzgkqVar, bArr, 0, bArr.length, zzgkcVar);
        zza(zzc);
        return zzc;
    }

    public static zzgkv zzaG() {
        return zzgkr.zzf();
    }

    public static zzgkv zzaH(zzgkv zzgkvVar) {
        int size = zzgkvVar.size();
        return zzgkvVar.zzg(size == 0 ? 10 : size + size);
    }

    public static zzgky zzaI() {
        return zzglp.zzf();
    }

    public static zzgkz zzaJ() {
        return zzgmj.zze();
    }

    public static zzgkz zzaK(zzgkz zzgkzVar) {
        int size = zzgkzVar.size();
        return zzgkzVar.zzd(size == 0 ? 10 : size + size);
    }

    public static Object zzaN(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static Object zzaO(zzgma zzgmaVar, String str, Object[] objArr) {
        return new zzgmk(zzgmaVar, str, objArr);
    }

    public static void zzaP(Class cls, zzgkq zzgkqVar) {
        zzb.put(cls, zzgkqVar);
    }

    private static zzgkq zzc(zzgkq zzgkqVar, byte[] bArr, int i, int i2, zzgkc zzgkcVar) throws zzglc {
        zzgkq zzgkqVar2 = (zzgkq) zzgkqVar.zzb(4, null, null);
        try {
            zzgmt zzb2 = zzgmi.zza().zzb(zzgkqVar2.getClass());
            zzb2.zzi(zzgkqVar2, bArr, 0, i2, new zzgiu(zzgkcVar));
            zzb2.zzf(zzgkqVar2);
            if (zzgkqVar2.zza == 0) {
                return zzgkqVar2;
            }
            throw new RuntimeException();
        } catch (zzglc e) {
            e = e;
            if (e.zzl()) {
                e = new zzglc(e);
            }
            e.zzh(zzgkqVar2);
            throw e;
        } catch (zzgnj e2) {
            zzglc zza = e2.zza();
            zza.zzh(zzgkqVar2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzglc) {
                throw ((zzglc) e3.getCause());
            }
            zzglc zzglcVar = new zzglc(e3);
            zzglcVar.zzh(zzgkqVar2);
            throw zzglcVar;
        } catch (IndexOutOfBoundsException unused) {
            zzglc zzj = zzglc.zzj();
            zzj.zzh(zzgkqVar2);
            throw zzj;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzgmi.zza().zzb(getClass()).zzj(this, (zzgkq) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzgmi.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzgmc.zza(this, super.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final /* synthetic */ zzglz zzaL() {
        return (zzgkm) zzb(5, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final /* synthetic */ zzglz zzaM() {
        zzgkm zzgkmVar = (zzgkm) zzb(5, null, null);
        zzgkmVar.zzaj(this);
        return zzgkmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final void zzaQ(zzgjx zzgjxVar) throws IOException {
        zzgmi.zza().zzb(getClass()).zzn(this, zzgjy.zza(zzgjxVar));
    }

    public final boolean zzaR() {
        byte byteValue = ((Byte) zzb(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzgmi.zza().zzb(getClass()).zzk(this);
        zzb(2, true != zzk ? null : this, null);
        return zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzgir
    public final int zzar() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgir
    public final void zzau(int i) {
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgma
    public final int zzax() {
        int i = this.zzd;
        if (i == -1) {
            int zza = zzgmi.zza().zzb(getClass()).zza(this);
            this.zzd = zza;
            return zza;
        }
        return i;
    }

    public final zzgkm zzay() {
        return (zzgkm) zzb(5, null, null);
    }

    public final zzgkm zzaz() {
        zzgkm zzgkmVar = (zzgkm) zzb(5, null, null);
        zzgkmVar.zzaj(this);
        return zzgkmVar;
    }

    public abstract Object zzb(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.zzgmb
    public final /* synthetic */ zzgma zzbh() {
        return (zzgkq) zzb(6, null, null);
    }
}
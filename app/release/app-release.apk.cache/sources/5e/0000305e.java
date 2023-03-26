package com.google.android.gms.internal.firebase_messaging;

import com.p7700g.p99005.sp2;
import com.p7700g.p99005.tp2;
import com.p7700g.p99005.up2;
import com.p7700g.p99005.vp2;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.wp2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zg2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes2.dex */
public final class zzab implements vp2 {
    private static final Charset zza = Charset.forName("UTF-8");
    private static final tp2 zzg;
    private static final tp2 zzh;
    private static final up2<Map.Entry<Object, Object>> zzi;
    private OutputStream zzb;
    private final Map<Class<?>, up2<?>> zzc;
    private final Map<Class<?>, wp2<?>> zzd;
    private final up2<Object> zze;
    private final zzaf zzf = new zzaf(this);

    static {
        tp2.b a = tp2.a("key");
        zzv zzvVar = new zzv();
        zzvVar.zza(1);
        zzg = a.b(zzvVar.zzb()).a();
        tp2.b a2 = tp2.a("value");
        zzv zzvVar2 = new zzv();
        zzvVar2.zza(2);
        zzh = a2.b(zzvVar2.zzb()).a();
        zzi = zzaa.zza;
    }

    public zzab(OutputStream outputStream, Map<Class<?>, up2<?>> map, Map<Class<?>, wp2<?>> map2, up2<Object> up2Var) {
        this.zzb = outputStream;
        this.zzc = map;
        this.zzd = map2;
        this.zze = up2Var;
    }

    public static final /* synthetic */ void zzg(Map.Entry entry, vp2 vp2Var) throws IOException {
        vp2Var.add(zzg, entry.getKey());
        vp2Var.add(zzh, entry.getValue());
    }

    private final <T> zzab zzh(up2<T> up2Var, tp2 tp2Var, T t, boolean z) throws IOException {
        long zzi2 = zzi(up2Var, t);
        if (z && zzi2 == 0) {
            return this;
        }
        zzn((zzl(tp2Var) << 3) | 2);
        zzo(zzi2);
        up2Var.encode(t, this);
        return this;
    }

    private final <T> long zzi(up2<T> up2Var, T t) throws IOException {
        zzw zzwVar = new zzw();
        try {
            OutputStream outputStream = this.zzb;
            this.zzb = zzwVar;
            up2Var.encode(t, this);
            this.zzb = outputStream;
            long zza2 = zzwVar.zza();
            zzwVar.close();
            return zza2;
        } catch (Throwable th) {
            try {
                zzwVar.close();
            } catch (Throwable th2) {
                zzt.zza(th, th2);
            }
            throw th;
        }
    }

    private final <T> zzab zzj(wp2<T> wp2Var, tp2 tp2Var, T t, boolean z) throws IOException {
        this.zzf.zza(tp2Var, z);
        wp2Var.encode(t, this.zzf);
        return this;
    }

    private static ByteBuffer zzk(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static int zzl(tp2 tp2Var) {
        zzz zzzVar = (zzz) tp2Var.c(zzz.class);
        if (zzzVar != null) {
            return zzzVar.zza();
        }
        throw new sp2("Field has no @Protobuf config");
    }

    private static zzz zzm(tp2 tp2Var) {
        zzz zzzVar = (zzz) tp2Var.c(zzz.class);
        if (zzzVar != null) {
            return zzzVar;
        }
        throw new sp2("Field has no @Protobuf config");
    }

    private final void zzn(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.zzb.write((i & 127) | 128);
            i >>>= 7;
        }
        this.zzb.write(i & 127);
    }

    private final void zzo(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.zzb.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.zzb.write(((int) j) & 127);
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 tp2 tp2Var, double d) throws IOException {
        zzb(tp2Var, d, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 inline(@z1 Object obj) throws IOException {
        zzf(obj);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 nested(@x1 tp2 tp2Var) throws IOException {
        throw new sp2("nested() is not implemented for protobuf encoding.");
    }

    public final vp2 zza(@x1 tp2 tp2Var, @z1 Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            zzn((zzl(tp2Var) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(zza);
            zzn(bytes.length);
            this.zzb.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                zza(tp2Var, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                zzh(zzi, tp2Var, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            zzb(tp2Var, ((Double) obj).doubleValue(), z);
            return this;
        } else if (obj instanceof Float) {
            zzc(tp2Var, ((Float) obj).floatValue(), z);
            return this;
        } else if (obj instanceof Number) {
            zze(tp2Var, ((Number) obj).longValue(), z);
            return this;
        } else if (obj instanceof Boolean) {
            zzd(tp2Var, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return this;
        } else if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return this;
            }
            zzn((zzl(tp2Var) << 3) | 2);
            zzn(bArr.length);
            this.zzb.write(bArr);
            return this;
        } else {
            up2<?> up2Var = this.zzc.get(obj.getClass());
            if (up2Var != null) {
                zzh(up2Var, tp2Var, obj, z);
                return this;
            }
            wp2<?> wp2Var = this.zzd.get(obj.getClass());
            if (wp2Var != null) {
                zzj(wp2Var, tp2Var, obj, z);
                return this;
            } else if (obj instanceof zzx) {
                zzd(tp2Var, ((zzx) obj).getNumber(), true);
                return this;
            } else if (obj instanceof Enum) {
                zzd(tp2Var, ((Enum) obj).ordinal(), true);
                return this;
            } else {
                zzh(this.zze, tp2Var, obj, z);
                return this;
            }
        }
    }

    public final vp2 zzb(@x1 tp2 tp2Var, double d, boolean z) throws IOException {
        if (z && d == zg2.s) {
            return this;
        }
        zzn((zzl(tp2Var) << 3) | 1);
        this.zzb.write(zzk(8).putDouble(d).array());
        return this;
    }

    public final vp2 zzc(@x1 tp2 tp2Var, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        zzn((zzl(tp2Var) << 3) | 5);
        this.zzb.write(zzk(4).putFloat(f).array());
        return this;
    }

    public final zzab zzd(@x1 tp2 tp2Var, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        zzz zzm = zzm(tp2Var);
        zzy zzyVar = zzy.DEFAULT;
        int ordinal = zzm.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzm.zza() << 3);
            zzn(i);
        } else if (ordinal == 1) {
            zzn(zzm.zza() << 3);
            zzn((i + i) ^ (i >> 31));
        } else if (ordinal == 2) {
            zzn((zzm.zza() << 3) | 5);
            this.zzb.write(zzk(4).putInt(i).array());
        }
        return this;
    }

    public final zzab zze(@x1 tp2 tp2Var, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        zzz zzm = zzm(tp2Var);
        zzy zzyVar = zzy.DEFAULT;
        int ordinal = zzm.zzb().ordinal();
        if (ordinal == 0) {
            zzn(zzm.zza() << 3);
            zzo(j);
        } else if (ordinal == 1) {
            zzn(zzm.zza() << 3);
            zzo((j >> 63) ^ (j + j));
        } else if (ordinal == 2) {
            zzn((zzm.zza() << 3) | 1);
            this.zzb.write(zzk(8).putLong(j).array());
        }
        return this;
    }

    public final zzab zzf(@z1 Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        up2<?> up2Var = this.zzc.get(obj.getClass());
        if (up2Var != null) {
            up2Var.encode(obj, this);
            return this;
        }
        String valueOf = String.valueOf(obj.getClass());
        throw new sp2(wo1.C(new StringBuilder(valueOf.length() + 15), "No encoder for ", valueOf));
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 tp2 tp2Var, float f) throws IOException {
        zzc(tp2Var, f, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 nested(@x1 String str) throws IOException {
        return nested(tp2.d(str));
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final /* bridge */ /* synthetic */ vp2 add(@x1 tp2 tp2Var, int i) throws IOException {
        zzd(tp2Var, i, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final /* bridge */ /* synthetic */ vp2 add(@x1 tp2 tp2Var, long j) throws IOException {
        zze(tp2Var, j, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 tp2 tp2Var, @z1 Object obj) throws IOException {
        zza(tp2Var, obj, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final /* bridge */ /* synthetic */ vp2 add(@x1 tp2 tp2Var, boolean z) throws IOException {
        zzd(tp2Var, z ? 1 : 0, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 String str, double d) throws IOException {
        zzb(tp2.d(str), d, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 String str, int i) throws IOException {
        zzd(tp2.d(str), i, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 String str, long j) throws IOException {
        zze(tp2.d(str), j, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 String str, @z1 Object obj) throws IOException {
        zza(tp2.d(str), obj, true);
        return this;
    }

    @Override // com.p7700g.p99005.vp2
    @x1
    public final vp2 add(@x1 String str, boolean z) throws IOException {
        zzd(tp2.d(str), z ? 1 : 0, true);
        return this;
    }
}
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzsx implements zzwf, zzrp {
    public final /* synthetic */ zztc zza;
    private final Uri zzc;
    private final zzfr zzd;
    private final zzst zze;
    private final zzyu zzf;
    private final zzcz zzg;
    private volatile boolean zzi;
    private long zzk;
    @z1
    private zzzy zzn;
    private boolean zzo;
    private final zzzr zzh = new zzzr();
    private boolean zzj = true;
    private long zzm = -1;
    private final long zzb = zzrr.zza();
    private zzev zzl = zzj(0);

    public zzsx(zztc zztcVar, Uri uri, zzeq zzeqVar, zzst zzstVar, zzyu zzyuVar, zzcz zzczVar) {
        this.zza = zztcVar;
        this.zzc = uri;
        this.zzd = new zzfr(zzeqVar);
        this.zze = zzstVar;
        this.zzf = zzyuVar;
        this.zzg = zzczVar;
    }

    public static /* bridge */ /* synthetic */ long zzb(zzsx zzsxVar) {
        return zzsxVar.zzm;
    }

    public static /* bridge */ /* synthetic */ long zzc(zzsx zzsxVar) {
        return zzsxVar.zzb;
    }

    public static /* bridge */ /* synthetic */ long zzd(zzsx zzsxVar) {
        return zzsxVar.zzk;
    }

    public static /* bridge */ /* synthetic */ zzev zze(zzsx zzsxVar) {
        return zzsxVar.zzl;
    }

    public static /* bridge */ /* synthetic */ zzfr zzf(zzsx zzsxVar) {
        return zzsxVar.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzg(zzsx zzsxVar, long j, long j2) {
        zzsxVar.zzh.zza = j;
        zzsxVar.zzk = j2;
        zzsxVar.zzj = true;
        zzsxVar.zzo = false;
    }

    private final zzev zzj(long j) {
        Map map;
        zzet zzetVar = new zzet();
        zzetVar.zzd(this.zzc);
        zzetVar.zzc(j);
        zzetVar.zza(6);
        map = zztc.zzb;
        zzetVar.zzb(map);
        return zzetVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzrp
    public final void zza(zzdy zzdyVar) {
        long zzO;
        long max;
        if (this.zzo) {
            zzO = this.zza.zzO();
            max = Math.max(zzO, this.zzk);
        } else {
            max = this.zzk;
        }
        int zza = zzdyVar.zza();
        zzzy zzzyVar = this.zzn;
        Objects.requireNonNull(zzzyVar);
        zzzw.zzb(zzzyVar, zzdyVar, zza);
        zzzyVar.zzs(max, 1, zza, 0, null);
        this.zzo = true;
    }

    @Override // com.google.android.gms.internal.ads.zzwf
    public final void zzh() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0062 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0078 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x008e A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a4 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c0 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00df A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00f3 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0133 A[Catch: all -> 0x01aa, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x013c A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #3 {all -> 0x01aa, blocks: (B:115:0x000a, B:117:0x0020, B:118:0x0023, B:120:0x0036, B:121:0x003c, B:129:0x0057, B:131:0x0062, B:133:0x006e, B:135:0x0078, B:137:0x0084, B:139:0x008e, B:141:0x009a, B:143:0x00a4, B:145:0x00b6, B:147:0x00c0, B:148:0x00c6, B:156:0x00df, B:157:0x00e6, B:159:0x00f3, B:161:0x00fb, B:163:0x0117, B:165:0x0133, B:166:0x0138, B:168:0x013c, B:153:0x00d2, B:127:0x004b), top: B:205:0x000a, inners: #0, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0149 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x018a A[EDGE_INSN: B:211:0x018a->B:182:0x018a ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzwf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi() throws IOException {
        boolean z;
        int i;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i2;
        zzabk zzabkVar;
        zzp zzpVar;
        zzabk zzabkVar2;
        int i3;
        long j;
        Handler handler;
        Runnable runnable;
        zzabk zzabkVar3;
        zzabk zzabkVar4;
        zzad zzadVar;
        Object obj;
        Object obj2;
        while (!this.zzi) {
            int i4 = 0;
            try {
                long j2 = this.zzh.zza;
                zzev zzj = zzj(j2);
                this.zzl = zzj;
                long zzb = this.zzd.zzb(zzj);
                this.zzm = zzb;
                if (zzb != -1) {
                    this.zzm = zzb + j2;
                }
                zztc zztcVar = this.zza;
                Map zze = this.zzd.zze();
                List list6 = (List) zze.get("icy-br");
                if (list6 != null) {
                    try {
                        int parseInt = Integer.parseInt((String) list6.get(0)) * 1000;
                        if (parseInt > 0) {
                            z = true;
                        } else {
                            parseInt = -1;
                            z = false;
                        }
                        i = parseInt;
                    } catch (NumberFormatException unused) {
                        "Invalid bitrate header: ".concat(String.valueOf(obj2));
                    }
                    list = (List) zze.get("icy-genre");
                    if (list == null) {
                        str = (String) list.get(0);
                        z = true;
                    } else {
                        str = null;
                    }
                    list2 = (List) zze.get("icy-name");
                    if (list2 == null) {
                        str2 = (String) list2.get(0);
                        z = true;
                    } else {
                        str2 = null;
                    }
                    list3 = (List) zze.get("icy-url");
                    if (list3 == null) {
                        str3 = (String) list3.get(0);
                        z = true;
                    } else {
                        str3 = null;
                    }
                    list4 = (List) zze.get("icy-pub");
                    if (list4 == null) {
                        z2 = ((String) list4.get(0)).equals("1");
                        z = true;
                    } else {
                        z2 = false;
                    }
                    list5 = (List) zze.get("icy-metaint");
                    if (list5 != null) {
                        try {
                            int parseInt2 = Integer.parseInt((String) list5.get(0));
                            if (parseInt2 > 0) {
                                z = true;
                            } else {
                                parseInt2 = -1;
                            }
                            i2 = parseInt2;
                        } catch (NumberFormatException unused2) {
                            "Invalid metadata interval: ".concat(String.valueOf(obj));
                        }
                        zztcVar.zzr = z ? new zzabk(i, str, str2, str3, z2, i2) : null;
                        zzfr zzfrVar = this.zzd;
                        zztc zztcVar2 = this.zza;
                        zzabkVar = zztcVar2.zzr;
                        if (zzabkVar != null) {
                            zzabkVar3 = zztcVar2.zzr;
                            if (zzabkVar3.zzf != -1) {
                                zzabkVar4 = zztcVar2.zzr;
                                zzpVar = new zzrq(zzfrVar, zzabkVar4.zzf, this);
                                zzzy zzu = this.zza.zzu();
                                this.zzn = zzu;
                                zzadVar = zztc.zzc;
                                zzu.zzk(zzadVar);
                                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j2, this.zzm, this.zzf);
                                zzabkVar2 = this.zza.zzr;
                                if (zzabkVar2 != null) {
                                    this.zze.zzc();
                                }
                                if (this.zzj) {
                                    this.zze.zzf(j2, this.zzk);
                                    this.zzj = false;
                                }
                                long j3 = j2;
                                i3 = 0;
                                while (true) {
                                    if (i3 == 0) {
                                        break;
                                    }
                                    try {
                                        if (this.zzi) {
                                            i3 = 0;
                                            break;
                                        }
                                        try {
                                            this.zzg.zza();
                                            i3 = this.zze.zza(this.zzh);
                                            long zzb2 = this.zze.zzb();
                                            j = this.zza.zzj;
                                            if (zzb2 > j + j3) {
                                                this.zzg.zzc();
                                                zztc zztcVar3 = this.zza;
                                                handler = zztcVar3.zzp;
                                                runnable = zztcVar3.zzo;
                                                handler.post(runnable);
                                                j3 = zzb2;
                                            }
                                        } catch (InterruptedException unused3) {
                                            throw new InterruptedIOException();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i4 = i3;
                                        if (i4 != 1) {
                                            zzst zzstVar = this.zze;
                                            if (zzstVar.zzb() != -1) {
                                                this.zzh.zza = zzstVar.zzb();
                                            }
                                        }
                                        zzes.zza(this.zzd);
                                        throw th;
                                    }
                                }
                                if (i3 != 1) {
                                    zzst zzstVar2 = this.zze;
                                    if (zzstVar2.zzb() != -1) {
                                        this.zzh.zza = zzstVar2.zzb();
                                    }
                                    i4 = i3;
                                }
                                zzes.zza(this.zzd);
                                if (i4 != 0) {
                                    return;
                                }
                            }
                        }
                        zzpVar = zzfrVar;
                        this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j2, this.zzm, this.zzf);
                        zzabkVar2 = this.zza.zzr;
                        if (zzabkVar2 != null) {
                        }
                        if (this.zzj) {
                        }
                        long j32 = j2;
                        i3 = 0;
                        while (true) {
                            if (i3 == 0) {
                            }
                        }
                        if (i3 != 1) {
                        }
                        zzes.zza(this.zzd);
                        if (i4 != 0) {
                        }
                    }
                    i2 = -1;
                    zztcVar.zzr = z ? new zzabk(i, str, str2, str3, z2, i2) : null;
                    zzfr zzfrVar2 = this.zzd;
                    zztc zztcVar22 = this.zza;
                    zzabkVar = zztcVar22.zzr;
                    if (zzabkVar != null) {
                    }
                    zzpVar = zzfrVar2;
                    this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j2, this.zzm, this.zzf);
                    zzabkVar2 = this.zza.zzr;
                    if (zzabkVar2 != null) {
                    }
                    if (this.zzj) {
                    }
                    long j322 = j2;
                    i3 = 0;
                    while (true) {
                        if (i3 == 0) {
                        }
                    }
                    if (i3 != 1) {
                    }
                    zzes.zza(this.zzd);
                    if (i4 != 0) {
                    }
                }
                z = false;
                i = -1;
                list = (List) zze.get("icy-genre");
                if (list == null) {
                }
                list2 = (List) zze.get("icy-name");
                if (list2 == null) {
                }
                list3 = (List) zze.get("icy-url");
                if (list3 == null) {
                }
                list4 = (List) zze.get("icy-pub");
                if (list4 == null) {
                }
                list5 = (List) zze.get("icy-metaint");
                if (list5 != null) {
                }
                i2 = -1;
                zztcVar.zzr = z ? new zzabk(i, str, str2, str3, z2, i2) : null;
                zzfr zzfrVar22 = this.zzd;
                zztc zztcVar222 = this.zza;
                zzabkVar = zztcVar222.zzr;
                if (zzabkVar != null) {
                }
                zzpVar = zzfrVar22;
                this.zze.zzd(zzpVar, this.zzc, this.zzd.zze(), j2, this.zzm, this.zzf);
                zzabkVar2 = this.zza.zzr;
                if (zzabkVar2 != null) {
                }
                if (this.zzj) {
                }
                long j3222 = j2;
                i3 = 0;
                while (true) {
                    if (i3 == 0) {
                    }
                }
                if (i3 != 1) {
                }
                zzes.zza(this.zzd);
                if (i4 != 0) {
                }
            } catch (Throwable th2) {
                th = th2;
                if (i4 != 1) {
                }
                zzes.zza(this.zzd);
                throw th;
            }
        }
    }
}
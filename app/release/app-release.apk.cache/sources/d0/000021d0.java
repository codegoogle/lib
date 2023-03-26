package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcka extends zzcju implements zzayy {
    private String zzd;
    private final zzchq zze;
    private boolean zzf;
    private final zzcjz zzg;
    private final zzcjf zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcka(zzchr zzchrVar, zzchq zzchqVar) {
        super(zzchrVar);
        this.zze = zzchqVar;
        this.zzg = new zzcjz();
        this.zzh = new zzcjf();
        this.zzk = new Object();
        this.zzl = zzchrVar != null ? zzchrVar.zzt() : "";
        this.zzm = zzchrVar != null ? zzchrVar.zzh() : 0;
    }

    public static final String zzt(String str) {
        return "cache:".concat(String.valueOf(zzcfb.zze(str)));
    }

    private final void zzu() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round((position / zza) * zza2);
        boolean z = round > 0;
        int zzs = zzchi.zzs();
        int zzu = zzchi.zzu();
        String str = this.zzd;
        zzf(str, zzt(str), position, zza, round, zza2, z, zzs, zzu);
    }

    @Override // com.google.android.gms.internal.ads.zzcju
    public final void zzb() {
        this.zzf = true;
    }

    public final String zzi() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzayy
    public final /* bridge */ /* synthetic */ void zzk(Object obj, zzayl zzaylVar) {
        this.zzg.zzb((zzayn) obj);
    }

    public final ByteBuffer zzl() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }

    public final boolean zzm() {
        return this.zzn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcju
    public final boolean zzq(String str) {
        String str2;
        String str3;
        zzcka zzckaVar;
        String str4;
        String str5 = str;
        this.zzd = str5;
        String zzt = zzt(str);
        try {
            String str6 = this.zzb;
            zzchq zzchqVar = this.zze;
            zzayj zzaynVar = new zzayn(str6, null, this, zzchqVar.zzd, zzchqVar.zzf, true, null);
            if (this.zze.zzj) {
                zzaynVar = new zzcin(this.zza, zzaynVar, this.zzl, this.zzm, null, null, null);
            }
            zzaynVar.zzb(new zzayl(Uri.parse(str), null, 0L, 0L, -1L, null, 0));
            zzchr zzchrVar = (zzchr) this.zzc.get();
            if (zzchrVar != null) {
                zzchrVar.zzv(zzt, this);
            }
            Clock zzA = com.google.android.gms.ads.internal.zzt.zzA();
            long currentTimeMillis = zzA.currentTimeMillis();
            long longValue = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzw)).longValue();
            long longValue2 = ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzv)).longValue();
            this.zzi = ByteBuffer.allocate(this.zze.zzc);
            int i = 8192;
            byte[] bArr = new byte[8192];
            long j = currentTimeMillis;
            str2 = "error";
            while (true) {
                try {
                    int zza = zzaynVar.zza(bArr, 0, Math.min(this.zzi.remaining(), i));
                    zzayj zzayjVar = zzaynVar;
                    if (zza == -1) {
                        this.zzn = true;
                        zze(str5, zzt, (int) this.zzh.zza(this.zzi));
                        return true;
                    }
                    synchronized (this.zzk) {
                        try {
                            if (!this.zzf) {
                                this.zzi.put(bArr, 0, zza);
                            }
                        } finally {
                            th = th;
                            str3 = str;
                            zzckaVar = this;
                            while (true) {
                                try {
                                    try {
                                        break;
                                    } catch (Exception e) {
                                        e = e;
                                        str4 = str2;
                                        String u = wo1.u(e.getClass().getCanonicalName(), ":", e.getMessage());
                                        zzcfi.zzj("Failed to preload url " + str3 + " Exception: " + u);
                                        zzckaVar.zzc(str3, zzt, str4, u);
                                        return false;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                            }
                        }
                    }
                    if (this.zzi.remaining() <= 0) {
                        zzu();
                        return true;
                    }
                    try {
                        if (!this.zzf) {
                            long currentTimeMillis2 = zzA.currentTimeMillis();
                            if (currentTimeMillis2 - j >= longValue) {
                                zzu();
                                j = currentTimeMillis2;
                            }
                            if (currentTimeMillis2 - currentTimeMillis > 1000 * longValue2) {
                                throw new IOException("Timeout exceeded. Limit: " + longValue2 + " sec");
                            }
                            i = 8192;
                            str5 = str;
                            zzaynVar = zzayjVar;
                        } else {
                            int limit = this.zzi.limit();
                            throw new IOException("Precache abort at " + limit + " bytes");
                        }
                    } catch (Exception e2) {
                        e = e2;
                        str4 = zzA;
                        zzckaVar = this;
                        str3 = str;
                        String u2 = wo1.u(e.getClass().getCanonicalName(), ":", e.getMessage());
                        zzcfi.zzj("Failed to preload url " + str3 + " Exception: " + u2);
                        zzckaVar.zzc(str3, zzt, str4, u2);
                        return false;
                    }
                } catch (Exception e3) {
                    e = e3;
                    str4 = str2;
                    String u22 = wo1.u(e.getClass().getCanonicalName(), ":", e.getMessage());
                    zzcfi.zzj("Failed to preload url " + str3 + " Exception: " + u22);
                    zzckaVar.zzc(str3, zzt, str4, u22);
                    return false;
                }
            }
        } catch (Exception e4) {
            e = e4;
            str2 = "error";
        }
    }
}